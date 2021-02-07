package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.mGPL.Expression;
import org.xtext.example.mydsl.mGPL.IntLiteral;
import org.xtext.example.mydsl.mGPL.Operation;
import org.xtext.example.mydsl.mGPL.UnaryOperation;
import org.xtext.example.mydsl.mGPL.Var;
import org.xtext.example.mydsl.mGPL.VarArray;
import org.xtext.example.mydsl.mGPL.VarProp;

@SuppressWarnings("all")
public class MGPLMapperUtil {
  public String mapObjType(final String type) {
    if (type != null) {
      switch (type) {
        case "rectangle":
          return "objTypes.Rectangle";
        case "triangle":
          return "objTypes.Triangle";
        case "circle":
          return "objTypes.Circle";
      }
    }
    return null;
  }
  
  public String mapPropertyName(final String n) {
    if (n != null) {
      switch (n) {
        case "width":
          return "w";
        case "height":
          return "h";
        case "radius":
          return "r";
        case "animation_block":
          return "anim";
        default:
          return n;
      }
    } else {
      return n;
    }
  }
  
  public String variableName(final Var v) {
    String n = v.getName();
    VarArray _varArray = v.getVarArray();
    boolean _tripleNotEquals = (_varArray != null);
    if (_tripleNotEquals) {
      String _n = n;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      String _resolveExpression = this.resolveExpression(v.getVarArray().getIndexExpr());
      _builder.append(_resolveExpression);
      _builder.append("]");
      n = (_n + _builder);
    }
    VarProp _varProp = v.getVarProp();
    boolean _tripleNotEquals_1 = (_varProp != null);
    if (_tripleNotEquals_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(".");
      String _mapPropertyName = this.mapPropertyName(v.getVarProp().getExtId());
      _builder_1.append(_mapPropertyName);
      return (n + _builder_1);
    }
    return n;
  }
  
  public String resolveExpression(final Expression e) {
    if ((e == null)) {
      return "";
    }
    if ((e instanceof IntLiteral)) {
      return String.valueOf(((IntLiteral)e).getValue());
    }
    if ((e instanceof UnaryOperation)) {
      String _op = ((UnaryOperation)e).getOp();
      String _resolveExpression = this.resolveExpression(((UnaryOperation)e).getRight());
      return (_op + _resolveExpression);
    }
    if ((e instanceof Var)) {
      return this.variableName(((Var)e));
    }
    if ((e instanceof Operation)) {
      String _op_1 = ((Operation)e).getOp();
      boolean _equals = Objects.equal(_op_1, "touches");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("touches(");
        String _resolveExpression_1 = this.resolveExpression(((Operation)e).getLeft());
        _builder.append(_resolveExpression_1);
        _builder.append(", ");
        String _resolveExpression_2 = this.resolveExpression(((Operation)e).getRight());
        _builder.append(_resolveExpression_2);
        _builder.append(")");
        return _builder.toString();
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      String _resolveExpression_3 = this.resolveExpression(((Operation)e).getLeft());
      _builder_1.append(_resolveExpression_3);
      _builder_1.append(" ");
      String _op_2 = null;
      if (((Operation)e)!=null) {
        _op_2=((Operation)e).getOp();
      }
      _builder_1.append(_op_2);
      _builder_1.append(" ");
      String _resolveExpression_4 = this.resolveExpression(((Operation)e).getRight());
      _builder_1.append(_resolveExpression_4);
      return _builder_1.toString();
    }
    return null;
  }
  
  public String mapKey(final String key) {
    if (key != null) {
      switch (key) {
        case "leftarrow":
          return "ArrowLeft";
        case "rightarrow":
          return "ArrowRight";
        case "uparrow":
          return "ArrowUp";
        case "downarrow":
          return "ArrowDown";
        case "space":
          return " ";
      }
    }
    return null;
  }
}
