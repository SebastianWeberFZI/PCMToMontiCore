/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.xtext.motiarc.mcBasics.ImportStatements;

import org.palladiosimulator.xtext.motiarc.montiArcDSL.Component;
import org.palladiosimulator.xtext.motiarc.montiArcDSL.MACompilationUnit;
import org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MA Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.MACompilationUnitImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.MACompilationUnitImpl#getImportStatements <em>Import Statements</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.impl.MACompilationUnitImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MACompilationUnitImpl extends MinimalEObjectImpl.Container implements MACompilationUnit
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected org.palladiosimulator.xtext.motiarc.mcBasics.Package package_;

  /**
   * The cached value of the '{@link #getImportStatements() <em>Import Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportStatements()
   * @generated
   * @ordered
   */
  protected EList<ImportStatements> importStatements;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected Component component;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MACompilationUnitImpl()
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
    return MontiArcDSLPackage.Literals.MA_COMPILATION_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.palladiosimulator.xtext.motiarc.mcBasics.Package getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(org.palladiosimulator.xtext.motiarc.mcBasics.Package newPackage, NotificationChain msgs)
  {
    org.palladiosimulator.xtext.motiarc.mcBasics.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE, oldPackage, newPackage);
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
  public void setPackage(org.palladiosimulator.xtext.motiarc.mcBasics.Package newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ImportStatements> getImportStatements()
  {
    if (importStatements == null)
    {
      importStatements = new EObjectContainmentEList<ImportStatements>(ImportStatements.class, this, MontiArcDSLPackage.MA_COMPILATION_UNIT__IMPORT_STATEMENTS);
    }
    return importStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Component getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs)
  {
    Component oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT, oldComponent, newComponent);
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
  public void setComponent(Component newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT, newComponent, newComponent));
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
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE:
        return basicSetPackage(null, msgs);
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__IMPORT_STATEMENTS:
        return ((InternalEList<?>)getImportStatements()).basicRemove(otherEnd, msgs);
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT:
        return basicSetComponent(null, msgs);
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
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE:
        return getPackage();
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__IMPORT_STATEMENTS:
        return getImportStatements();
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT:
        return getComponent();
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
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE:
        setPackage((org.palladiosimulator.xtext.motiarc.mcBasics.Package)newValue);
        return;
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__IMPORT_STATEMENTS:
        getImportStatements().clear();
        getImportStatements().addAll((Collection<? extends ImportStatements>)newValue);
        return;
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT:
        setComponent((Component)newValue);
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
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE:
        setPackage((org.palladiosimulator.xtext.motiarc.mcBasics.Package)null);
        return;
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__IMPORT_STATEMENTS:
        getImportStatements().clear();
        return;
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT:
        setComponent((Component)null);
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
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__PACKAGE:
        return package_ != null;
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__IMPORT_STATEMENTS:
        return importStatements != null && !importStatements.isEmpty();
      case MontiArcDSLPackage.MA_COMPILATION_UNIT__COMPONENT:
        return component != null;
    }
    return super.eIsSet(featureID);
  }

} //MACompilationUnitImpl
