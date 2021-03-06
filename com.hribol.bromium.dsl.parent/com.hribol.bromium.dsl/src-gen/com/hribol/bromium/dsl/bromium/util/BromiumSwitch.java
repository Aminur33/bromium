/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium.util;

import com.hribol.bromium.dsl.bromium.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage
 * @generated
 */
public class BromiumSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BromiumPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BromiumPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BromiumPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.APPLICATION_ACTION:
      {
        ApplicationAction applicationAction = (ApplicationAction)theEObject;
        T result = caseApplicationAction(applicationAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.SYNTAX_DEFINITION:
      {
        SyntaxDefinition syntaxDefinition = (SyntaxDefinition)theEObject;
        T result = caseSyntaxDefinition(syntaxDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.WEB_DRIVER_ACTION_CONDITION:
      {
        WebDriverActionCondition webDriverActionCondition = (WebDriverActionCondition)theEObject;
        T result = caseWebDriverActionCondition(webDriverActionCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.WEB_DRIVER_ACTION:
      {
        WebDriverAction webDriverAction = (WebDriverAction)theEObject;
        T result = caseWebDriverAction(webDriverAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.PRECONDITION:
      {
        Precondition precondition = (Precondition)theEObject;
        T result = casePrecondition(precondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.POSTCONDITION:
      {
        Postcondition postcondition = (Postcondition)theEObject;
        T result = casePostcondition(postcondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.EXPECT_HTTP_REQUEST:
      {
        ExpectHttpRequest expectHttpRequest = (ExpectHttpRequest)theEObject;
        T result = caseExpectHttpRequest(expectHttpRequest);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.ELEMENT_BY_CSS_TO_BE_PRESENT:
      {
        ElementByCssToBePresent elementByCssToBePresent = (ElementByCssToBePresent)theEObject;
        T result = caseElementByCssToBePresent(elementByCssToBePresent);
        if (result == null) result = caseWebDriverActionCondition(elementByCssToBePresent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.CLICK_CSS_SELECTOR:
      {
        ClickCssSelector clickCssSelector = (ClickCssSelector)theEObject;
        T result = caseClickCssSelector(clickCssSelector);
        if (result == null) result = caseWebDriverAction(clickCssSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.PAGE_LOAD:
      {
        PageLoad pageLoad = (PageLoad)theEObject;
        T result = casePageLoad(pageLoad);
        if (result == null) result = caseWebDriverAction(pageLoad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR:
      {
        TypeTextInElementFoundByCssSelector typeTextInElementFoundByCssSelector = (TypeTextInElementFoundByCssSelector)theEObject;
        T result = caseTypeTextInElementFoundByCssSelector(typeTextInElementFoundByCssSelector);
        if (result == null) result = caseWebDriverAction(typeTextInElementFoundByCssSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TO_BE:
      {
        TextOfElementWithCssSelectorToBe textOfElementWithCssSelectorToBe = (TextOfElementWithCssSelectorToBe)theEObject;
        T result = caseTextOfElementWithCssSelectorToBe(textOfElementWithCssSelectorToBe);
        if (result == null) result = caseWebDriverActionCondition(textOfElementWithCssSelectorToBe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.CLICK_CLASS_BY_TEXT:
      {
        ClickClassByText clickClassByText = (ClickClassByText)theEObject;
        T result = caseClickClassByText(clickClassByText);
        if (result == null) result = caseWebDriverAction(clickClassByText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.PARAMETER_VALUE:
      {
        ParameterValue parameterValue = (ParameterValue)theEObject;
        T result = caseParameterValue(parameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.EXPOSED_PARAMETER:
      {
        ExposedParameter exposedParameter = (ExposedParameter)theEObject;
        T result = caseExposedParameter(exposedParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BromiumPackage.THREE_DOTTED_VERSION:
      {
        ThreeDottedVersion threeDottedVersion = (ThreeDottedVersion)theEObject;
        T result = caseThreeDottedVersion(threeDottedVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationAction(ApplicationAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Syntax Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Syntax Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSyntaxDefinition(SyntaxDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Driver Action Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Driver Action Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebDriverActionCondition(WebDriverActionCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Driver Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Driver Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebDriverAction(WebDriverAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecondition(Precondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postcondition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postcondition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostcondition(Postcondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expect Http Request</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expect Http Request</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpectHttpRequest(ExpectHttpRequest object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element By Css To Be Present</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element By Css To Be Present</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementByCssToBePresent(ElementByCssToBePresent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click Css Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click Css Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClickCssSelector(ClickCssSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePageLoad(PageLoad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Text In Element Found By Css Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Text In Element Found By Css Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTextInElementFoundByCssSelector(TypeTextInElementFoundByCssSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Of Element With Css Selector To Be</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Of Element With Css Selector To Be</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextOfElementWithCssSelectorToBe(TextOfElementWithCssSelectorToBe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Click Class By Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Click Class By Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClickClassByText(ClickClassByText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterValue(ParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exposed Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exposed Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExposedParameter(ExposedParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Three Dotted Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Three Dotted Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThreeDottedVersion(ThreeDottedVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BromiumSwitch
