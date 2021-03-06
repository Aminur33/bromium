/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getName <em>Name</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getSyntaxDefinitions <em>Syntax Definitions</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getWebDriverAction <em>Web Driver Action</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getExpectHttpRequest <em>Expect Http Request</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction()
 * @model
 * @generated
 */
public interface ApplicationAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Syntax Definitions</b></em>' containment reference list.
   * The list contents are of type {@link com.hribol.bromium.dsl.bromium.SyntaxDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Syntax Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Syntax Definitions</em>' containment reference list.
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction_SyntaxDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<SyntaxDefinition> getSyntaxDefinitions();

  /**
   * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' containment reference.
   * @see #setPrecondition(Precondition)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction_Precondition()
   * @model containment="true"
   * @generated
   */
  Precondition getPrecondition();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getPrecondition <em>Precondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' containment reference.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(Precondition value);

  /**
   * Returns the value of the '<em><b>Web Driver Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Web Driver Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Web Driver Action</em>' containment reference.
   * @see #setWebDriverAction(WebDriverAction)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction_WebDriverAction()
   * @model containment="true"
   * @generated
   */
  WebDriverAction getWebDriverAction();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getWebDriverAction <em>Web Driver Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Web Driver Action</em>' containment reference.
   * @see #getWebDriverAction()
   * @generated
   */
  void setWebDriverAction(WebDriverAction value);

  /**
   * Returns the value of the '<em><b>Expect Http Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expect Http Request</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expect Http Request</em>' containment reference.
   * @see #setExpectHttpRequest(ExpectHttpRequest)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction_ExpectHttpRequest()
   * @model containment="true"
   * @generated
   */
  ExpectHttpRequest getExpectHttpRequest();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getExpectHttpRequest <em>Expect Http Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expect Http Request</em>' containment reference.
   * @see #getExpectHttpRequest()
   * @generated
   */
  void setExpectHttpRequest(ExpectHttpRequest value);

  /**
   * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postcondition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postcondition</em>' containment reference.
   * @see #setPostcondition(Postcondition)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getApplicationAction_Postcondition()
   * @model containment="true"
   * @generated
   */
  Postcondition getPostcondition();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ApplicationAction#getPostcondition <em>Postcondition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcondition</em>' containment reference.
   * @see #getPostcondition()
   * @generated
   */
  void setPostcondition(Postcondition value);

} // ApplicationAction
