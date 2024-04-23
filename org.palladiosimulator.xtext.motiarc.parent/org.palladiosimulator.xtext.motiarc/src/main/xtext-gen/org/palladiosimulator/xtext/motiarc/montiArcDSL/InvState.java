/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL;

import org.palladiosimulator.xtext.motiarc.mcBasics.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inv State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InvState#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getInvState()
 * @model
 * @generated
 */
public interface InvState extends State
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getInvState_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InvState#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // InvState
