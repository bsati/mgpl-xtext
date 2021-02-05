/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mGPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stmt Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mGPL.StmtBlock#getStatments <em>Statments</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.mGPL.MGPLPackage#getStmtBlock()
 * @model
 * @generated
 */
public interface StmtBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.mGPL.Stmt}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statments</em>' containment reference list.
   * @see org.xtext.example.mydsl.mGPL.MGPLPackage#getStmtBlock_Statments()
   * @model containment="true"
   * @generated
   */
  EList<Stmt> getStatments();

} // StmtBlock