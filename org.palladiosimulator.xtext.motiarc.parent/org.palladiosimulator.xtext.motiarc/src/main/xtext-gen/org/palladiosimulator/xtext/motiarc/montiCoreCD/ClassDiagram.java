/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiCoreCD;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiCoreCD.ClassDiagram#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiCoreCD.ClassDiagram#getCdElements <em>Cd Elements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.montiCoreCD.MontiCoreCDPackage#getClassDiagram()
 * @model
 * @generated
 */
public interface ClassDiagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.xtext.motiarc.montiCoreCD.MontiCoreCDPackage#getClassDiagram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiCoreCD.ClassDiagram#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cd Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.motiarc.montiCoreCD.CDDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cd Elements</em>' containment reference list.
   * @see org.palladiosimulator.xtext.motiarc.montiCoreCD.MontiCoreCDPackage#getClassDiagram_CdElements()
   * @model containment="true"
   * @generated
   */
  EList<CDDefinition> getCdElements();

} // ClassDiagram
