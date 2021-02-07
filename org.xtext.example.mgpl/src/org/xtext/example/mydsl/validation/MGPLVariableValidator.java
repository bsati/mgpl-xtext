package org.xtext.example.mydsl.validation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.mGPL.Decl;
import org.xtext.example.mydsl.mGPL.Game;
import org.xtext.example.mydsl.mGPL.MGPLPackage;

public class MGPLVariableValidator extends AbstractMGPLValidator {
	@Check
	public void checkVarDeclUniqueName(Game game) {
		Map<String, Integer> occurances = new HashMap<>();
		for(Decl d : game.getDecl()) {
			occurances.compute(d.getName(), (k, v) -> {
				if(v == null) {
					return 1;
				} else {
					error("Duplicate declaration of " + d.getName(), MGPLPackage.Literals.GAME__DECL);
					return v++;
				}
			});
		}
	}
}
