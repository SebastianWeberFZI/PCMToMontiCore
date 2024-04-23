/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiCoreCD.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.xtext.motiarc.montiCoreCD.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.xtext.motiarc.montiCoreCD.MontiCoreCDPackage
 * @generated
 */
public class MontiCoreCDSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MontiCoreCDPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MontiCoreCDSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MontiCoreCDPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MontiCoreCDPackage.CLASS_DIAGRAM_COMPILATION_UNIT:
      {
        ClassDiagramCompilationUnit classDiagramCompilationUnit = (ClassDiagramCompilationUnit)theEObject;
        T result = caseClassDiagramCompilationUnit(classDiagramCompilationUnit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MontiCoreCDPackage.CLASS_DIAGRAM:
      {
        ClassDiagram classDiagram = (ClassDiagram)theEObject;
        T result = caseClassDiagram(classDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MontiCoreCDPackage.CD_DEFINITION:
      {
        CDDefinition cdDefinition = (CDDefinition)theEObject;
        T result = caseCDDefinition(cdDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MontiCoreCDPackage.CD_CLASS:
      {
        CDClass cdClass = (CDClass)theEObject;
        T result = caseCDClass(cdClass);
        if (result == null) result = caseCDDefinition(cdClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MontiCoreCDPackage.CD_ENUM:
      {
        CDEnum cdEnum = (CDEnum)theEObject;
        T result = caseCDEnum(cdEnum);
        if (result == null) result = caseCDDefinition(cdEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MontiCoreCDPackage.MEMBER:
      {
        Member member = (Member)theEObject;
        T result = caseMember(member);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Diagram Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Diagram Compilation Unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDiagramCompilationUnit(ClassDiagramCompilationUnit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDiagram(ClassDiagram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CD Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CD Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDDefinition(CDDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CD Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CD Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDClass(CDClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CD Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CD Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCDEnum(CDEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MontiCoreCDSwitch
