/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.xtext.motiarc.mcBasics.Type;

import org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage;
import org.palladiosimulator.xtext.motiarc.montiArcDSL.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.PortImpl#isSync <em>Sync</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.PortImpl#isIn <em>In</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.PortImpl#isOut <em>Out</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.PortImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.PortImpl#isNames <em>Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port
{
  /**
   * The default value of the '{@link #isSync() <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSync()
   * @generated
   * @ordered
   */
  protected static final boolean SYNC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSync() <em>Sync</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSync()
   * @generated
   * @ordered
   */
  protected boolean sync = SYNC_EDEFAULT;

  /**
   * The default value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected static final boolean IN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected boolean in = IN_EDEFAULT;

  /**
   * The default value of the '{@link #isOut() <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOut()
   * @generated
   * @ordered
   */
  protected static final boolean OUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOut() <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOut()
   * @generated
   * @ordered
   */
  protected boolean out = OUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
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
    return MontiArcDSLPackage.Literals.PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isSync()
  {
    return sync;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSync(boolean newSync)
  {
    boolean oldSync = sync;
    sync = newSync;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.PORT__SYNC, oldSync, sync));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIn(boolean newIn)
  {
    boolean oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.PORT__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOut(boolean newOut)
  {
    boolean oldOut = out;
    out = newOut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.PORT__OUT, oldOut, out));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.PORT__TYPE, oldType, newType);
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
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.PORT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.PORT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.PORT__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.PORT__NAMES, oldNames, names));
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
      case MontiArcDSLPackage.PORT__TYPE:
        return basicSetType(null, msgs);
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
      case MontiArcDSLPackage.PORT__SYNC:
        return isSync();
      case MontiArcDSLPackage.PORT__IN:
        return isIn();
      case MontiArcDSLPackage.PORT__OUT:
        return isOut();
      case MontiArcDSLPackage.PORT__TYPE:
        return getType();
      case MontiArcDSLPackage.PORT__NAMES:
        return isNames();
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
      case MontiArcDSLPackage.PORT__SYNC:
        setSync((Boolean)newValue);
        return;
      case MontiArcDSLPackage.PORT__IN:
        setIn((Boolean)newValue);
        return;
      case MontiArcDSLPackage.PORT__OUT:
        setOut((Boolean)newValue);
        return;
      case MontiArcDSLPackage.PORT__TYPE:
        setType((Type)newValue);
        return;
      case MontiArcDSLPackage.PORT__NAMES:
        setNames((Boolean)newValue);
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
      case MontiArcDSLPackage.PORT__SYNC:
        setSync(SYNC_EDEFAULT);
        return;
      case MontiArcDSLPackage.PORT__IN:
        setIn(IN_EDEFAULT);
        return;
      case MontiArcDSLPackage.PORT__OUT:
        setOut(OUT_EDEFAULT);
        return;
      case MontiArcDSLPackage.PORT__TYPE:
        setType((Type)null);
        return;
      case MontiArcDSLPackage.PORT__NAMES:
        setNames(NAMES_EDEFAULT);
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
      case MontiArcDSLPackage.PORT__SYNC:
        return sync != SYNC_EDEFAULT;
      case MontiArcDSLPackage.PORT__IN:
        return in != IN_EDEFAULT;
      case MontiArcDSLPackage.PORT__OUT:
        return out != OUT_EDEFAULT;
      case MontiArcDSLPackage.PORT__TYPE:
        return type != null;
      case MontiArcDSLPackage.PORT__NAMES:
        return names != NAMES_EDEFAULT;
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
    result.append(" (sync: ");
    result.append(sync);
    result.append(", in: ");
    result.append(in);
    result.append(", out: ");
    result.append(out);
    result.append(", names: ");
    result.append(names);
    result.append(')');
    return result.toString();
  }

} //PortImpl
