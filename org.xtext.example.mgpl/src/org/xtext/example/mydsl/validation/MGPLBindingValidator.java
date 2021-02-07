package org.xtext.example.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.mGPL.AnimBlock;
import org.xtext.example.mydsl.mGPL.AttrAss;
import org.xtext.example.mydsl.mGPL.Block;
import org.xtext.example.mydsl.mGPL.Decl;
import org.xtext.example.mydsl.mGPL.Game;
import org.xtext.example.mydsl.mGPL.MGPLPackage;
import org.xtext.example.mydsl.mGPL.ObjDecl;
import org.xtext.example.mydsl.mGPL.Var;
import org.xtext.example.mydsl.mGPL.VarDecl;

public class MGPLBindingValidator extends AbstractMGPLValidator {
	@Check
	public void checkVariableDeclared(Var var) {
		if(MGPLValidator.isAnimation(var)) {
			return;
		}
		if(MGPLValidator.isParameter(var)) {
			return;
		}
		if(var.getVarArray() != null) {
			if(MGPLValidator.findVarDecl(var) == null) {
				error("No valid array declaration found", MGPLPackage.Literals.VAR__VAR_ARRAY, MGPLValidator.NO_MATCHING_DECLARATION);
			}
		} else {
			Game game = (Game) var.eResource().getAllContents().next();
			if(!var.getName().equals(game.getName())) {
				Decl d = MGPLValidator.findVarDecl(var);
				if(d == null) {
					error("The used variable has not been declared", MGPLPackage.Literals.VAR__VAR_PROP, MGPLValidator.NO_MATCHING_DECLARATION);
				}
				if(d instanceof VarDecl && var.getVarProp() != null) {
					error("The used variable is a primitive type and has no object properties", MGPLPackage.Literals.VAR__VAR_PROP, MGPLValidator.INVALID_PROPERTY_ACCESS);
				} else if(d instanceof ObjDecl && var.getVarProp() != null) {
					AttrAss assignment = findAttributeAssignment(var, (ObjDecl) d);
					if(assignment == null) {
						error("The used property has not been declared in the referenced object", MGPLPackage.Literals.VAR__VAR_PROP, MGPLValidator.NO_MATCHING_PROPERTY);
					}
				}
			} else {
				if(var.getVarProp() != null) {
					AttrAss assignment = findAttributeAssignment(var, null);
					if(assignment == null) {
						error("The used property has not been declared in the Game", MGPLPackage.Literals.VAR__VAR_PROP, MGPLValidator.NO_MATCHING_PROPERTY);
					}
				}
			}
		}
	}
	
	@Check
	public void checkAnimationBindings(AttrAss assignment) {
		if(assignment.getName().equals("animation_block")) {
			if(findAnimationBlock(assignment) == null) {
				error("No matching animation block found", MGPLPackage.Literals.ATTR_ASS__EXPR, MGPLValidator.NO_MATCHING_ANIM_BLOCK);
			}
		}
	}
	
	private AttrAss findAttributeAssignment(Var var, ObjDecl d) {
		EList<AttrAss> searchList;
		if(d == null) {
			Game game = (Game) var.eResource().getAllContents().next();
			searchList = game.getAttrAssList().getAttrAss();
		} else {
			searchList = d.getAttrAssList().getAttrAss();
		}
		for(AttrAss assignment : searchList) {
			if(assignment.getName().equals(var.getVarProp().getExtId())) {
				return assignment;
			}
		}
		return null;
	}
	
	private AnimBlock findAnimationBlock(AttrAss assignment) {
		Game game = (Game) assignment.eResource().getAllContents().next();
		for(Block b : game.getFunctions()) {
			if(b instanceof AnimBlock) {
				AnimBlock bCast = (AnimBlock) b;
				if(bCast.getName().equals(((Var) assignment.getExpr()).getName()) && bCast.getObjType().equals(((ObjDecl) assignment.eContainer().eContainer()).getType())) {
					return bCast;
				}
			}
		}
		return null;
	}
}
