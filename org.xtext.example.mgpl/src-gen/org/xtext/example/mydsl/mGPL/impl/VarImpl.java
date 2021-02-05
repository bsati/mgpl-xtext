/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.mGPL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.mGPL.MGPLPackage;
import org.xtext.example.mydsl.mGPL.Var;
import org.xtext.example.mydsl.mGPL.VarArray;
import org.xtext.example.mydsl.mGPL.VarProp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.mGPL.impl.VarImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mGPL.impl.VarImpl#getVarArray <em>Var Array</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.mGPL.impl.VarImpl#getVarProp <em>Var Prop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarImpl extends ExpressionImpl implements Var
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarArray() <em>Var Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarArray()
   * @generated
   * @ordered
   */
  protected VarArray varArray;

  /**
   * The cached value of the '{@link #getVarProp() <em>Var Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarProp()
   * @generated
   * @ordered
   */
  protected VarProp varProp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MGPLPackage.Literals.VAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.VAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarArray getVarArray()
  {
    return varArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarArray(VarArray newVarArray, NotificationChain msgs)
  {
    VarArray oldVarArray = varArray;
    varArray = newVarArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.VAR__VAR_ARRAY, oldVarArray, newVarArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarArray(VarArray newVarArray)
  {
    if (newVarArray != varArray)
    {
      NotificationChain msgs = null;
      if (varArray != null)
        msgs = ((InternalEObject)varArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.VAR__VAR_ARRAY, null, msgs);
      if (newVarArray != null)
        msgs = ((InternalEObject)newVarArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.VAR__VAR_ARRAY, null, msgs);
      msgs = basicSetVarArray(newVarArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.VAR__VAR_ARRAY, newVarArray, newVarArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VarProp getVarProp()
  {
    return varProp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarProp(VarProp newVarProp, NotificationChain msgs)
  {
    VarProp oldVarProp = varProp;
    varProp = newVarProp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MGPLPackage.VAR__VAR_PROP, oldVarProp, newVarProp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarProp(VarProp newVarProp)
  {
    if (newVarProp != varProp)
    {
      NotificationChain msgs = null;
      if (varProp != null)
        msgs = ((InternalEObject)varProp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.VAR__VAR_PROP, null, msgs);
      if (newVarProp != null)
        msgs = ((InternalEObject)newVarProp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MGPLPackage.VAR__VAR_PROP, null, msgs);
      msgs = basicSetVarProp(newVarProp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MGPLPackage.VAR__VAR_PROP, newVarProp, newVarProp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MGPLPackage.VAR__VAR_ARRAY:
        return basicSetVarArray(null, msgs);
      case MGPLPackage.VAR__VAR_PROP:
        return basicSetVarProp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MGPLPackage.VAR__NAME:
        return getName();
      case MGPLPackage.VAR__VAR_ARRAY:
        return getVarArray();
      case MGPLPackage.VAR__VAR_PROP:
        return getVarProp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MGPLPackage.VAR__NAME:
        setName((String)newValue);
        return;
      case MGPLPackage.VAR__VAR_ARRAY:
        setVarArray((VarArray)newValue);
        return;
      case MGPLPackage.VAR__VAR_PROP:
        setVarProp((VarProp)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.VAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MGPLPackage.VAR__VAR_ARRAY:
        setVarArray((VarArray)null);
        return;
      case MGPLPackage.VAR__VAR_PROP:
        setVarProp((VarProp)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MGPLPackage.VAR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MGPLPackage.VAR__VAR_ARRAY:
        return varArray != null;
      case MGPLPackage.VAR__VAR_PROP:
        return varProp != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VarImpl