/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.mcBasics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression#getLiteral1 <em>Literal1</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression#getOp <em>Op</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression#getLiteral2 <em>Literal2</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Literal1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal1</em>' containment reference.
   * @see #setLiteral1(Expression)
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getBinaryExpression_Literal1()
   * @model containment="true"
   * @generated
   */
  Expression getLiteral1();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression#getLiteral1 <em>Literal1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal1</em>' containment reference.
   * @see #getLiteral1()
   * @generated
   */
  void setLiteral1(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.palladiosimulator.xtext.motiarc.mcBasics.Operator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.Operator
   * @see #setOp(Operator)
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getBinaryExpression_Op()
   * @model
   * @generated
   */
  Operator getOp();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.Operator
   * @see #getOp()
   * @generated
   */
  void setOp(Operator value);

  /**
   * Returns the value of the '<em><b>Literal2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal2</em>' containment reference.
   * @see #setLiteral2(Expression)
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getBinaryExpression_Literal2()
   * @model containment="true"
   * @generated
   */
  Expression getLiteral2();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.mcBasics.BinaryExpression#getLiteral2 <em>Literal2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal2</em>' containment reference.
   * @see #getLiteral2()
   * @generated
   */
  void setLiteral2(Expression value);

} // BinaryExpression
