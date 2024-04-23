/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage;
import org.palladiosimulator.xtext.motiarc.montiArcDSL.SCSAnte;
import org.palladiosimulator.xtext.motiarc.montiArcDSL.SCState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SC State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.SCStateImpl#getAnte <em>Ante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCStateImpl extends StateImpl implements SCState
{
  /**
   * The cached value of the '{@link #getAnte() <em>Ante</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnte()
   * @generated
   * @ordered
   */
  protected SCSAnte ante;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SCStateImpl()
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
    return MontiArcDSLPackage.Literals.SC_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SCSAnte getAnte()
  {
    return ante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnte(SCSAnte newAnte, NotificationChain msgs)
  {
    SCSAnte oldAnte = ante;
    ante = newAnte;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.SC_STATE__ANTE, oldAnte, newAnte);
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
  public void setAnte(SCSAnte newAnte)
  {
    if (newAnte != ante)
    {
      NotificationChain msgs = null;
      if (ante != null)
        msgs = ((InternalEObject)ante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.SC_STATE__ANTE, null, msgs);
      if (newAnte != null)
        msgs = ((InternalEObject)newAnte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.SC_STATE__ANTE, null, msgs);
      msgs = basicSetAnte(newAnte, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.SC_STATE__ANTE, newAnte, newAnte));
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
      case MontiArcDSLPackage.SC_STATE__ANTE:
        return basicSetAnte(null, msgs);
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
      case MontiArcDSLPackage.SC_STATE__ANTE:
        return getAnte();
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
      case MontiArcDSLPackage.SC_STATE__ANTE:
        setAnte((SCSAnte)newValue);
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
      case MontiArcDSLPackage.SC_STATE__ANTE:
        setAnte((SCSAnte)null);
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
      case MontiArcDSLPackage.SC_STATE__ANTE:
        return ante != null;
    }
    return super.eIsSet(featureID);
  }

} //SCStateImpl
