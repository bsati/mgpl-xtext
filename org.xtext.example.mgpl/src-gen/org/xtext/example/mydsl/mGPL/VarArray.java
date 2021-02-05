/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mGPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mGPL.VarArray#getIndexExpr <em>Index Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mGPL.MGPLPackage#getVarArray()
 * @model
 * @generated
 */
public interface VarArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Index Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Expr</em>' containment reference.
   * @see #setIndexExpr(Expression)
   * @see org.xtext.example.mydsl.mGPL.MGPLPackage#getVarArray_IndexExpr()
   * @model containment="true"
   * @generated
   */
  Expression getIndexExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mGPL.VarArray#getIndexExpr <em>Index Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Expr</em>' containment reference.
   * @see #getIndexExpr()
   * @generated
   */
  void setIndexExpr(Expression value);

} // VarArray
