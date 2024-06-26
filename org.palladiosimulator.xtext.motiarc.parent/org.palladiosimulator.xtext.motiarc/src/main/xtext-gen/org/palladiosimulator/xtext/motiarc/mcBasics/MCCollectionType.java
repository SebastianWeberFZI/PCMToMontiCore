/**
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.mcBasics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.MCCollectionType#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.palladiosimulator.xtext.motiarc.mcBasics.MCCollectionType#getInnerType <em>Inner Type</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getMCCollectionType()
 * @model
 * @generated
 */
public interface MCCollectionType extends Type
{
  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(String)
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getMCCollectionType_Collection()
   * @model
   * @generated
   */
  String getCollection();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.mcBasics.MCCollectionType#getCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #getCollection()
   * @generated
   */
  void setCollection(String value);

  /**
   * Returns the value of the '<em><b>Inner Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Type</em>' containment reference.
   * @see #setInnerType(Type)
   * @see org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage#getMCCollectionType_InnerType()
   * @model containment="true"
   * @generated
   */
  Type getInnerType();

  /**
   * Sets the value of the '{@link org.palladiosimulator.xtext.motiarc.mcBasics.MCCollectionType#getInnerType <em>Inner Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inner Type</em>' containment reference.
   * @see #getInnerType()
   * @generated
   */
  void setInnerType(Type value);

} // MCCollectionType
