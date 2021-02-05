/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mGPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obj Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mGPL.ObjDecl#getAttrAssList <em>Attr Ass List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mGPL.MGPLPackage#getObjDecl()
 * @model
 * @generated
 */
public interface ObjDecl extends Decl
{
  /**
   * Returns the value of the '<em><b>Attr Ass List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Ass List</em>' containment reference.
   * @see #setAttrAssList(AttrAssList)
   * @see org.xtext.example.mydsl.mGPL.MGPLPackage#getObjDecl_AttrAssList()
   * @model containment="true"
   * @generated
   */
  AttrAssList getAttrAssList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.mGPL.ObjDecl#getAttrAssList <em>Attr Ass List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Ass List</em>' containment reference.
   * @see #getAttrAssList()
   * @generated
   */
  void setAttrAssList(AttrAssList value);

} // ObjDecl
