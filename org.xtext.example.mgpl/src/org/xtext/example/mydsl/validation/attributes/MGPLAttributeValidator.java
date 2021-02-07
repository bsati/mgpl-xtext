package org.xtext.example.mydsl.validation.attributes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.mGPL.AttrAssList;
import org.xtext.example.mydsl.mGPL.Game;
import org.xtext.example.mydsl.mGPL.IntLiteral;
import org.xtext.example.mydsl.mGPL.MGPLPackage;
import org.xtext.example.mydsl.mGPL.ObjDecl;
import org.xtext.example.mydsl.validation.AbstractMGPLValidator;
import org.xtext.example.mydsl.validation.MGPLValidator;

public class MGPLAttributeValidator extends AbstractMGPLValidator {
	@Check
	public void checkAttributes(AttrAssList attrAss) {
		if(attrAss.eContainer() instanceof Game) {
			checkGameAttributes(attrAss);
		}
		if(attrAss.eContainer() instanceof ObjDecl) {
			ObjDecl obj = (ObjDecl) attrAss.eContainer();
			if(obj.getType().equals("rectangle") || obj.getType().equals("triangle")) {
				this.checkRectTriangleAttributes(attrAss);
			} else {
				this.checkCircleAttributes(attrAss);
			}
		}
	}
	
	private <T extends Enum<?> & AttributeEnum> void mandatoryCheck(Map<String, Integer> occurences, T[] values) {
		for(T ta : values) {
			String taLower = ta.name().toLowerCase();
			if(ta.isMandatory() && (occurences.get(taLower) == null || occurences.get(taLower) == 0)) {
				error("Mandatory attribute " + ta.name().toLowerCase() + " is missing in object declaration", MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS, MGPLValidator.MANDATORY_ATTRIBUTE_MISSING);
			}
		}
	}
	
	public void checkCircleAttributes(AttrAssList attrAss) {
		Map<String, Integer> occurences = checkDuplicateAttributes(attrAss, MGPLPackage.Literals.OBJ_DECL__ATTR_ASS_LIST);
		this.mandatoryCheck(occurences, CircleObjectAttributes.values());
		attrAss.getAttrAss().forEach(attr -> {
			if(CircleObjectAttributes.getByName(mapAttributeShortform(attr.getName())) == null) {
				error("Invalid attribute specified. Allowed attributes are: radius, r, x, y, animation_block", MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS, MGPLValidator.ILLEGAL_ATTRIBUTE_NAME);
			}
		});
	}
	
	public void checkRectTriangleAttributes(AttrAssList attrAss) {
		Map<String, Integer> occurences = checkDuplicateAttributes(attrAss, MGPLPackage.Literals.OBJ_DECL__ATTR_ASS_LIST);
		this.mandatoryCheck(occurences, RectTriangleObjectAttributes.values());
		attrAss.getAttrAss().forEach(attr -> {
			if(RectTriangleObjectAttributes.getByName(mapAttributeShortform(attr.getName())) == null) {
				error("Invalid attribute specified. Allowed attributes are: height, width, h, w, x, y, animation_block", MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS, MGPLValidator.ILLEGAL_ATTRIBUTE_NAME);
			}
		});
	}
	
	public void checkGameAttributes(AttrAssList attrAss) {
		Map<String, Integer> occurences = checkDuplicateAttributes(attrAss, MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS);
		this.mandatoryCheck(occurences, GameAttributes.values());
		attrAss.getAttrAss().forEach(attr -> {
			if(!IntLiteral.class.isAssignableFrom(attr.getExpr().getClass())) {
				error("Only constant values are allowed for game attributes", MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS, MGPLValidator.ONLY_CONSTANTS);
			}
			if(attr.getName().equals("speed")) {
				IntLiteral val = (IntLiteral) attr.getExpr();
				if(val.getValue() < 0 || val.getValue() > 100) {
					error("Game speed can only be specified between 0 and 100", MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS, MGPLValidator.ILLEGAL_VALUE);
				}
			}
			if(GameAttributes.getByName(mapAttributeShortform(attr.getName())) == null) {
				error("Invalid attribute specified. Allowed attributes are: height, width, h, w, speed, x, y", MGPLPackage.Literals.ATTR_ASS_LIST__ATTR_ASS, MGPLValidator.ILLEGAL_ATTRIBUTE_NAME);
			}
		});
	}
	
	private Map<String, Integer> checkDuplicateAttributes(AttrAssList attrAss, EReference ref) {
		Map<String, Integer> occurences = new HashMap<>();
		attrAss.getAttrAss().forEach(attr -> {
			String attrName = mapAttributeShortform(attr.getName());
			occurences.compute(attrName, (k,v) -> {
				return v == null ? 1 : v++;
			});
		});
		occurences.forEach((k, v) -> {
			if(v > 1) {
				error("Duplice attribute assignment", ref, MGPLValidator.DUPLICATE_ATTRIBUTE);
			}
		});
		return occurences;
	}
	
	private String mapAttributeShortform(String attribute) {
		switch(attribute) {
		case "height": return "h";
		case "width": return "w";
		case "radius": return "r";
		default: return attribute;
		}
	}
}
