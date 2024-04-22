/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.montiArcDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Automaton#isName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Automaton#getStates <em>States</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Automaton#getInitialStates <em>Initial States</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Automaton#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getAutomaton()
 * @model
 * @generated
 */
public interface Automaton extends ArcElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(boolean)
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getAutomaton_Name()
   * @model
   * @generated
   */
  boolean isName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Automaton#isName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #isName()
   * @generated
   */
  void setName(boolean value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.motiarc.montiArcDSL.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getAutomaton_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Initial States</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.motiarc.montiArcDSL.InitialState}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial States</em>' containment reference list.
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getAutomaton_InitialStates()
   * @model containment="true"
   * @generated
   */
  EList<InitialState> getInitialStates();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.xtext.motiarc.montiArcDSL.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.palladiosimulator.xtext.motiarc.montiArcDSL.MontiArcDSLPackage#getAutomaton_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Automaton
