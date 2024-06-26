/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.xtext.motiarc.mcBasics.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Parameter#isExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Parameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(boolean)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getParameter_Expression()
   * @model
   * @generated
   */
  boolean isExpression();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Parameter#isExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #isExpression()
   * @generated
   */
  void setExpression(boolean value);

} // Parameter
