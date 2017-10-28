/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import com.hribol.bromium.dsl.bromium.ApplicationAction;
import com.hribol.bromium.dsl.bromium.BromiumFactory;
import com.hribol.bromium.dsl.bromium.BromiumPackage;
import com.hribol.bromium.dsl.bromium.ClickOnElementWithId;
import com.hribol.bromium.dsl.bromium.ElementWithIdIsPresent;
import com.hribol.bromium.dsl.bromium.ExposedParameter;
import com.hribol.bromium.dsl.bromium.Model;
import com.hribol.bromium.dsl.bromium.PageLoad;
import com.hribol.bromium.dsl.bromium.ParameterValue;
import com.hribol.bromium.dsl.bromium.Postcondition;
import com.hribol.bromium.dsl.bromium.Precondition;
import com.hribol.bromium.dsl.bromium.SyntaxDefinition;
import com.hribol.bromium.dsl.bromium.ThreeDottedVersion;
import com.hribol.bromium.dsl.bromium.TypeTextInElementFoundByCssSelector;
import com.hribol.bromium.dsl.bromium.WebDriverAction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BromiumPackageImpl extends EPackageImpl implements BromiumPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass syntaxDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webDriverActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass postconditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementWithIdIsPresentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clickOnElementWithIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageLoadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeTextInElementFoundByCssSelectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exposedParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass threeDottedVersionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BromiumPackageImpl()
  {
    super(eNS_URI, BromiumFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BromiumPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BromiumPackage init()
  {
    if (isInited) return (BromiumPackage)EPackage.Registry.INSTANCE.getEPackage(BromiumPackage.eNS_URI);

    // Obtain or create and register package
    BromiumPackageImpl theBromiumPackage = (BromiumPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BromiumPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BromiumPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBromiumPackage.createPackageContents();

    // Initialize created meta-data
    theBromiumPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBromiumPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BromiumPackage.eNS_URI, theBromiumPackage);
    return theBromiumPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Version()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_BaseVersion()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Actions()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationAction()
  {
    return applicationActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationAction_Name()
  {
    return (EAttribute)applicationActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationAction_SyntaxDefinitions()
  {
    return (EReference)applicationActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationAction_Precondition()
  {
    return (EReference)applicationActionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationAction_WebDriverAction()
  {
    return (EReference)applicationActionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationAction_Postcondition()
  {
    return (EReference)applicationActionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationAction_ExpectHttpRequest()
  {
    return (EAttribute)applicationActionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSyntaxDefinition()
  {
    return syntaxDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSyntaxDefinition_Content()
  {
    return (EAttribute)syntaxDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntaxDefinition_Parameter()
  {
    return (EReference)syntaxDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebDriverAction()
  {
    return webDriverActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrecondition()
  {
    return preconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrecondition_Action()
  {
    return (EReference)preconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPostcondition()
  {
    return postconditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPostcondition_Postcondition()
  {
    return (EReference)postconditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementWithIdIsPresent()
  {
    return elementWithIdIsPresentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementWithIdIsPresent_CssSelector()
  {
    return (EReference)elementWithIdIsPresentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClickOnElementWithId()
  {
    return clickOnElementWithIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClickOnElementWithId_CssSelector()
  {
    return (EReference)clickOnElementWithIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPageLoad()
  {
    return pageLoadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPageLoad_Subpath()
  {
    return (EAttribute)pageLoadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeTextInElementFoundByCssSelector()
  {
    return typeTextInElementFoundByCssSelectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeTextInElementFoundByCssSelector_Text()
  {
    return (EReference)typeTextInElementFoundByCssSelectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeTextInElementFoundByCssSelector_CssSelector()
  {
    return (EReference)typeTextInElementFoundByCssSelectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterValue()
  {
    return parameterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterValue_Content()
  {
    return (EAttribute)parameterValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterValue_ExposedParameter()
  {
    return (EReference)parameterValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExposedParameter()
  {
    return exposedParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExposedParameter_Name()
  {
    return (EAttribute)exposedParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThreeDottedVersion()
  {
    return threeDottedVersionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThreeDottedVersion_Big()
  {
    return (EAttribute)threeDottedVersionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThreeDottedVersion_Medium()
  {
    return (EAttribute)threeDottedVersionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThreeDottedVersion_Small()
  {
    return (EAttribute)threeDottedVersionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumFactory getBromiumFactory()
  {
    return (BromiumFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__NAME);
    createEAttribute(modelEClass, MODEL__VERSION);
    createEAttribute(modelEClass, MODEL__BASE_VERSION);
    createEReference(modelEClass, MODEL__ACTIONS);

    applicationActionEClass = createEClass(APPLICATION_ACTION);
    createEAttribute(applicationActionEClass, APPLICATION_ACTION__NAME);
    createEReference(applicationActionEClass, APPLICATION_ACTION__SYNTAX_DEFINITIONS);
    createEReference(applicationActionEClass, APPLICATION_ACTION__PRECONDITION);
    createEReference(applicationActionEClass, APPLICATION_ACTION__WEB_DRIVER_ACTION);
    createEReference(applicationActionEClass, APPLICATION_ACTION__POSTCONDITION);
    createEAttribute(applicationActionEClass, APPLICATION_ACTION__EXPECT_HTTP_REQUEST);

    syntaxDefinitionEClass = createEClass(SYNTAX_DEFINITION);
    createEAttribute(syntaxDefinitionEClass, SYNTAX_DEFINITION__CONTENT);
    createEReference(syntaxDefinitionEClass, SYNTAX_DEFINITION__PARAMETER);

    webDriverActionEClass = createEClass(WEB_DRIVER_ACTION);

    preconditionEClass = createEClass(PRECONDITION);
    createEReference(preconditionEClass, PRECONDITION__ACTION);

    postconditionEClass = createEClass(POSTCONDITION);
    createEReference(postconditionEClass, POSTCONDITION__POSTCONDITION);

    elementWithIdIsPresentEClass = createEClass(ELEMENT_WITH_ID_IS_PRESENT);
    createEReference(elementWithIdIsPresentEClass, ELEMENT_WITH_ID_IS_PRESENT__CSS_SELECTOR);

    clickOnElementWithIdEClass = createEClass(CLICK_ON_ELEMENT_WITH_ID);
    createEReference(clickOnElementWithIdEClass, CLICK_ON_ELEMENT_WITH_ID__CSS_SELECTOR);

    pageLoadEClass = createEClass(PAGE_LOAD);
    createEAttribute(pageLoadEClass, PAGE_LOAD__SUBPATH);

    typeTextInElementFoundByCssSelectorEClass = createEClass(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR);
    createEReference(typeTextInElementFoundByCssSelectorEClass, TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__TEXT);
    createEReference(typeTextInElementFoundByCssSelectorEClass, TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR__CSS_SELECTOR);

    parameterValueEClass = createEClass(PARAMETER_VALUE);
    createEAttribute(parameterValueEClass, PARAMETER_VALUE__CONTENT);
    createEReference(parameterValueEClass, PARAMETER_VALUE__EXPOSED_PARAMETER);

    exposedParameterEClass = createEClass(EXPOSED_PARAMETER);
    createEAttribute(exposedParameterEClass, EXPOSED_PARAMETER__NAME);

    threeDottedVersionEClass = createEClass(THREE_DOTTED_VERSION);
    createEAttribute(threeDottedVersionEClass, THREE_DOTTED_VERSION__BIG);
    createEAttribute(threeDottedVersionEClass, THREE_DOTTED_VERSION__MEDIUM);
    createEAttribute(threeDottedVersionEClass, THREE_DOTTED_VERSION__SMALL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    elementWithIdIsPresentEClass.getESuperTypes().add(this.getWebDriverAction());
    clickOnElementWithIdEClass.getESuperTypes().add(this.getWebDriverAction());
    pageLoadEClass.getESuperTypes().add(this.getWebDriverAction());
    typeTextInElementFoundByCssSelectorEClass.getESuperTypes().add(this.getWebDriverAction());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Version(), ecorePackage.getEString(), "version", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_BaseVersion(), ecorePackage.getEString(), "baseVersion", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Actions(), this.getApplicationAction(), null, "actions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationActionEClass, ApplicationAction.class, "ApplicationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationAction_SyntaxDefinitions(), this.getSyntaxDefinition(), null, "syntaxDefinitions", null, 0, -1, ApplicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationAction_Precondition(), this.getPrecondition(), null, "precondition", null, 0, 1, ApplicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationAction_WebDriverAction(), this.getWebDriverAction(), null, "webDriverAction", null, 0, 1, ApplicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationAction_Postcondition(), this.getPostcondition(), null, "postcondition", null, 0, 1, ApplicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationAction_ExpectHttpRequest(), ecorePackage.getEString(), "expectHttpRequest", null, 0, 1, ApplicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(syntaxDefinitionEClass, SyntaxDefinition.class, "SyntaxDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSyntaxDefinition_Content(), ecorePackage.getEString(), "content", null, 0, 1, SyntaxDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSyntaxDefinition_Parameter(), this.getExposedParameter(), null, "parameter", null, 0, 1, SyntaxDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(webDriverActionEClass, WebDriverAction.class, "WebDriverAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preconditionEClass, Precondition.class, "Precondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrecondition_Action(), this.getWebDriverAction(), null, "action", null, 0, 1, Precondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(postconditionEClass, Postcondition.class, "Postcondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPostcondition_Postcondition(), this.getWebDriverAction(), null, "postcondition", null, 0, 1, Postcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementWithIdIsPresentEClass, ElementWithIdIsPresent.class, "ElementWithIdIsPresent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementWithIdIsPresent_CssSelector(), this.getParameterValue(), null, "cssSelector", null, 0, 1, ElementWithIdIsPresent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clickOnElementWithIdEClass, ClickOnElementWithId.class, "ClickOnElementWithId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClickOnElementWithId_CssSelector(), this.getParameterValue(), null, "cssSelector", null, 0, 1, ClickOnElementWithId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageLoadEClass, PageLoad.class, "PageLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPageLoad_Subpath(), ecorePackage.getEString(), "subpath", null, 0, 1, PageLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeTextInElementFoundByCssSelectorEClass, TypeTextInElementFoundByCssSelector.class, "TypeTextInElementFoundByCssSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeTextInElementFoundByCssSelector_Text(), this.getParameterValue(), null, "text", null, 0, 1, TypeTextInElementFoundByCssSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeTextInElementFoundByCssSelector_CssSelector(), this.getParameterValue(), null, "cssSelector", null, 0, 1, TypeTextInElementFoundByCssSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterValue_Content(), ecorePackage.getEString(), "content", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterValue_ExposedParameter(), this.getExposedParameter(), null, "exposedParameter", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exposedParameterEClass, ExposedParameter.class, "ExposedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExposedParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExposedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(threeDottedVersionEClass, ThreeDottedVersion.class, "ThreeDottedVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getThreeDottedVersion_Big(), ecorePackage.getEInt(), "big", null, 0, 1, ThreeDottedVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getThreeDottedVersion_Medium(), ecorePackage.getEInt(), "medium", null, 0, 1, ThreeDottedVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getThreeDottedVersion_Small(), ecorePackage.getEInt(), "small", null, 0, 1, ThreeDottedVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BromiumPackageImpl
