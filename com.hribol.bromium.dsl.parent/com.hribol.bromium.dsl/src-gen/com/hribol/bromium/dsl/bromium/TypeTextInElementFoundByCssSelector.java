/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Text In Element Found By Css Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getText <em>Text</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getCssSelector <em>Css Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getTypeTextInElementFoundByCssSelector()
 * @model
 * @generated
 */
public interface TypeTextInElementFoundByCssSelector extends WebDriverAction
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(ParameterValue)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getTypeTextInElementFoundByCssSelector_Text()
   * @model containment="true"
   * @generated
   */
  ParameterValue getText();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(ParameterValue value);

  /**
   * Returns the value of the '<em><b>Css Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css Selector</em>' containment reference.
   * @see #setCssSelector(ParameterValue)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getTypeTextInElementFoundByCssSelector_CssSelector()
   * @model containment="true"
   * @generated
   */
  ParameterValue getCssSelector();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector#getCssSelector <em>Css Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Selector</em>' containment reference.
   * @see #getCssSelector()
   * @generated
   */
  void setCssSelector(ParameterValue value);

} // TypeTextInElementFoundByCssSelector
