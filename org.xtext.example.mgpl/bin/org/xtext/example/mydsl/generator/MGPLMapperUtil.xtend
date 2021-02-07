package org.xtext.example.mydsl.generator

import org.xtext.example.mydsl.mGPL.Expression
import org.xtext.example.mydsl.mGPL.IntLiteral
import org.xtext.example.mydsl.mGPL.UnaryOperation
import org.xtext.example.mydsl.mGPL.Var
import org.xtext.example.mydsl.mGPL.Operation

class MGPLMapperUtil {	
	def mapObjType(String type) {
		switch(type) {
			case "rectangle": return "objTypes.Rectangle"
			case "triangle": return "objTypes.Triangle"
			case "circle": return "objTypes.Circle"
		}
	}
	
	def mapPropertyName(String n) {
		switch n {
			case "width": return "w"
			case "height": return "h"
			case "radius": return "r"
			case "animation_block": return "anim"
			default: return n
		}
	}
	
	def String variableName(Var v) {
		var n = v.name
		if(v.varArray !== null) {
			n += '''[«resolveExpression(v.varArray.indexExpr)»]'''
		}
		if(v.varProp !== null) {
			return n + '''.«mapPropertyName(v.varProp.extId)»'''
		}
		return n
	}
	
	def String resolveExpression(Expression e) {
		if(e === null) {
			return ""
		}
		if(e instanceof IntLiteral) {
			return String.valueOf(e.value)
		}
		if(e instanceof UnaryOperation) {
			return e.op + resolveExpression(e.right)
		}
		if(e instanceof Var) {
			return variableName(e)
		}
		if(e instanceof Operation) {
			if(e.op == "touches") {
				return '''touches(«resolveExpression(e.left)», «resolveExpression(e.right)»)'''
			}
			return '''«resolveExpression(e.left)» «e?.op» «resolveExpression(e.right)»'''
		}
	}
	
	def mapKey(String key) {
		switch(key) {
			case "leftarrow": return "ArrowLeft"
			case "rightarrow": return "ArrowRight"
			case "uparrow": return "ArrowUp"
			case "downarrow": return "ArrowDown"
			case "space": return " "
		}
	}
}