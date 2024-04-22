/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InitialState#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InitialState#isBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getInitialState()
 * @model
 * @generated
 */
public interface InitialState extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getInitialState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InitialState#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' attribute.
   * @see #setBlock(boolean)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getInitialState_Block()
   * @model
   * @generated
   */
  boolean isBlock();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InitialState#isBlock <em>Block</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' attribute.
   * @see #isBlock()
   * @generated
   */
  void setBlock(boolean value);

} // InitialState
