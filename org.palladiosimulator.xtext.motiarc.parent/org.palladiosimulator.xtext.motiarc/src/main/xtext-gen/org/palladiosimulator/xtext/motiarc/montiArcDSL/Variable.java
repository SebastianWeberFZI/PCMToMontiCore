/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.xtext.motiarc.mcBasics.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Variable#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Variable#isNames <em>Names</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Variable#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ArcElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(EObject)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getVariable_Type()
   * @model containment="true"
   * @generated
   */
  EObject getType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Variable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EObject value);

  /**
   * Returns the value of the '<em><b>Names</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Names</em>' attribute.
   * @see #setNames(boolean)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getVariable_Names()
   * @model
   * @generated
   */
  boolean isNames();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Variable#isNames <em>Names</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Names</em>' attribute.
   * @see #isNames()
   * @generated
   */
  void setNames(boolean value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.motiarc.mcBasics.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getVariable_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParameters();

} // Variable
