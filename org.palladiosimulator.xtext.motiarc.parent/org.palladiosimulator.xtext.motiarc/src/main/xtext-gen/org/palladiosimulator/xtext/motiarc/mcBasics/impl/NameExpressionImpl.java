/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.mcBasics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage;
import org.palladiosimulator.xtext.motiarc.mcBasics.NameExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.impl.NameExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.impl.NameExpressionImpl#getQualifiedname <em>Qualifiedname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameExpressionImpl extends ExpressionImpl implements NameExpression
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
   * The default value of the '{@link #getQualifiedname() <em>Qualifiedname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedname()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIEDNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQualifiedname() <em>Qualifiedname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedname()
   * @generated
   * @ordered
   */
  protected String qualifiedname = QUALIFIEDNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameExpressionImpl()
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
    return McBasicsPackage.Literals.NAME_EXPRESSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, McBasicsPackage.NAME_EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getQualifiedname()
  {
    return qualifiedname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQualifiedname(String newQualifiedname)
  {
    String oldQualifiedname = qualifiedname;
    qualifiedname = newQualifiedname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McBasicsPackage.NAME_EXPRESSION__QUALIFIEDNAME, oldQualifiedname, qualifiedname));
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
      case McBasicsPackage.NAME_EXPRESSION__NAME:
        return getName();
      case McBasicsPackage.NAME_EXPRESSION__QUALIFIEDNAME:
        return getQualifiedname();
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
      case McBasicsPackage.NAME_EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case McBasicsPackage.NAME_EXPRESSION__QUALIFIEDNAME:
        setQualifiedname((String)newValue);
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
      case McBasicsPackage.NAME_EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McBasicsPackage.NAME_EXPRESSION__QUALIFIEDNAME:
        setQualifiedname(QUALIFIEDNAME_EDEFAULT);
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
      case McBasicsPackage.NAME_EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McBasicsPackage.NAME_EXPRESSION__QUALIFIEDNAME:
        return QUALIFIEDNAME_EDEFAULT == null ? qualifiedname != null : !QUALIFIEDNAME_EDEFAULT.equals(qualifiedname);
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
    result.append(", qualifiedname: ");
    result.append(qualifiedname);
    result.append(')');
    return result.toString();
  }

} //NameExpressionImpl
