package org.xtext.example.mydsl.validation.attributes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.mGPL.AttrAssList;
import org.xtext.example.mydsl.mGPL.Game;
import org.xtext.example.mydsl.mGPL.IntLiteral;
import org.xtext.example.mydsl.mGPL.MGPLPackage;
import org.xtext.example.mydsl.validation.AbstractMGPLValidator;
import org.xtext.example.mydsl.validation.MGPLValidator;

public class MGPLAttributeValidator extends AbstractMGPLValidator {
	@Check
	public void checkAttributes(AttrAssList attrAss) {
		if(attrAss.eContainer() instanceof Game) {
			checkGameAttributes(attrAss);
		}
	}
	
	public void checkGameAttributes(AttrAssList attrAss) {
		Map<String, Integer> occurences = checkDuplicateAttributes(attrAss, MGPLPackage.Literals.GAME__ATTR_ASS_LIST);
		for(GameAttributes ga : GameAttributes.values()) {
			if(ga.isMandatory() && (occurences.get(ga.name().toLowerCase()) == null || occurences.get(ga.name().toLowerCase()) == 0)) {
				error("Mandatory attribute is missing in object declaration", MGPLPackage.Literals.GAME__ATTR_ASS_LIST, MGPLValidator.MANDATORY_ATTRIBUTE_MISSING);
			}
		}
		attrAss.getAttrAss().forEach(attr -> {
			if(!IntLiteral.class.isAssignableFrom(attr.getExpr().getClass())) {
				error("Only constant values are allowed for game attributes", MGPLPackage.Literals.GAME__ATTR_ASS_LIST, MGPLValidator.ONLY_CONSTANTS);
			}
			if(attr.getName().equals("speed")) {
				IntLiteral val = (IntLiteral) attr.getExpr();
				if(val.getValue() < 0 || val.getValue() > 100) {
					error("Game speed can only be specified between 0 and 100", MGPLPackage.Literals.GAME__ATTR_ASS_LIST, MGPLValidator.ILLEGAL_VALUE);
				}
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
