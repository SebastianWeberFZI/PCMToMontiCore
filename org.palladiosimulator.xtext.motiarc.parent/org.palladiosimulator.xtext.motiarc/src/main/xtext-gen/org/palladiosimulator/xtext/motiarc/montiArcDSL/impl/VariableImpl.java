/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.xtext.motiarc.mcBasics.Expression;

import org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage;
import org.palladiosimulator.xtext.motiarc.montiArcDSL.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.VariableImpl#isNames <em>Names</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.VariableImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends ArcElementImpl implements Variable
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EObject type;

  /**
   * The default value of the '{@link #isNames() <em>Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNames()
   * @generated
   * @ordered
   */
  protected static final boolean NAMES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNames() <em>Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNames()
   * @generated
   * @ordered
   */
  protected boolean names = NAMES_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Expression> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return MontiArcDSLPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EObject newType, NotificationChain msgs)
  {
    EObject oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.VARIABLE__TYPE, oldType, newType);
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
  public void setType(EObject newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.VARIABLE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.VARIABLE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.VARIABLE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNames()
  {
    return names;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNames(boolean newNames)
  {
    boolean oldNames = names;
    names = newNames;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.VARIABLE__NAMES, oldNames, names));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Expression>(Expression.class, this, MontiArcDSLPackage.VARIABLE__PARAMETERS);
    }
    return parameters;
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
      case MontiArcDSLPackage.VARIABLE__TYPE:
        return basicSetType(null, msgs);
      case MontiArcDSLPackage.VARIABLE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case MontiArcDSLPackage.VARIABLE__TYPE:
        return getType();
      case MontiArcDSLPackage.VARIABLE__NAMES:
        return isNames();
      case MontiArcDSLPackage.VARIABLE__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MontiArcDSLPackage.VARIABLE__TYPE:
        setType((EObject)newValue);
        return;
      case MontiArcDSLPackage.VARIABLE__NAMES:
        setNames((Boolean)newValue);
        return;
      case MontiArcDSLPackage.VARIABLE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Expression>)newValue);
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
      case MontiArcDSLPackage.VARIABLE__TYPE:
        setType((EObject)null);
        return;
      case MontiArcDSLPackage.VARIABLE__NAMES:
        setNames(NAMES_EDEFAULT);
        return;
      case MontiArcDSLPackage.VARIABLE__PARAMETERS:
        getParameters().clear();
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
      case MontiArcDSLPackage.VARIABLE__TYPE:
        return type != null;
      case MontiArcDSLPackage.VARIABLE__NAMES:
        return names != NAMES_EDEFAULT;
      case MontiArcDSLPackage.VARIABLE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(" (names: ");
    result.append(names);
    result.append(')');
    return result.toString();
  }

} //VariableImpl
