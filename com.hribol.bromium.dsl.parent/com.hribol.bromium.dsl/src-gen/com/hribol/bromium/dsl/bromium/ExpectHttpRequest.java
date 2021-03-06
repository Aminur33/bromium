/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expect Http Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ExpectHttpRequest#isNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getExpectHttpRequest()
 * @model
 * @generated
 */
public interface ExpectHttpRequest extends EObject
{
  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(boolean)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getExpectHttpRequest_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ExpectHttpRequest#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

} // ExpectHttpRequest
