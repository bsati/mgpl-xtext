package org.xtext.example.mydsl.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.mGPL.AnimBlock;
import org.xtext.example.mydsl.mGPL.Decl;
import org.xtext.example.mydsl.mGPL.Expression;
import org.xtext.example.mydsl.mGPL.Game;
import org.xtext.example.mydsl.mGPL.IntLiteral;
import org.xtext.example.mydsl.mGPL.MGPLPackage;
import org.xtext.example.mydsl.mGPL.Operation;
import org.xtext.example.mydsl.mGPL.Var;

public class MGPLExpressionValidator extends AbstractMGPLValidator {
	@SuppressWarnings("serial")
	private final List<String> objTypes = new ArrayList<>() {{ add("rectangle"); add("circle"); add("triangle"); }};
	
	@Check
	public void checkExpression(Operation op) {
		String leftType = getTypeOfExpression(op.getLeft());
		String rightType = getTypeOfExpression(op.getRight());
		
		if(leftType == null || rightType == null) {
			return;
		}
		
		if("anim".equals(leftType) || "anim".equals(rightType)) {
			error("Animations cannot be used in operations", null);
		}
		
		if(op.getOp().equals("touches")) {
			if(!objTypes.contains(leftType)) {
				error("The touches operator can only be used on graphical objects", MGPLPackage.Literals.OPERATION__LEFT, MGPLValidator.ILLEGAL_LEFT_SIDE);
			}
			if(!objTypes.contains(rightType)) {
				error("The touches operator can only be used on graphical objects", MGPLPackage.Literals.OPERATION__RIGHT, MGPLValidator.ILLEGAL_RIGHT_SIDE);
			}
		} else {
			if(!"int".equals(leftType)) {
				error("Left side of the operation " + op.getOp() + " has to be an integer", MGPLPackage.Literals.OPERATION__LEFT, MGPLValidator.ILLEGAL_LEFT_SIDE);
			}
			if(!"int".equals(rightType)) {
				error("Right side of the operation " + op.getOp() + " has to be an integer", MGPLPackage.Literals.OPERATION__RIGHT, MGPLValidator.ILLEGAL_RIGHT_SIDE);
			}
		}		
	}
	
	private String getTypeOfExpression(Expression expr) {
		if(expr instanceof IntLiteral) {
			return "int";
		}
		if(expr instanceof Var) {
			Var castExpr = (Var) expr;
			if(castExpr.getVarProp() != null) {
				if(castExpr.getVarProp().getExtId().equals("animation_block")) {
					return "anim";
				}
				return "int";
			}
			if(MGPLValidator.isAnimation(castExpr)) {
				return "anim";
			}
			if(MGPLValidator.isParameter(castExpr)) {
				EObject container = castExpr.eContainer();
				while(container != null) {
					if(container instanceof AnimBlock) {
						return ((AnimBlock) container).getObjType();
					}
					container = container.eContainer();
				}
			}
			Decl d = MGPLValidator.findVarDecl(castExpr);
			if(d != null) {
				return d.getType();
			} else {
				if(((Game) castExpr.eResource().getAllContents().next()).getName().equals(castExpr.getName())) {
					return "game";
				}
			}
		}
		return null;
	}
}
