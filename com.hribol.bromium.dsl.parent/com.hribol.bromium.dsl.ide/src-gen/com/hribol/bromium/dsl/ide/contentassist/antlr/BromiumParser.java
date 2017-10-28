/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.hribol.bromium.dsl.ide.contentassist.antlr.internal.InternalBromiumParser;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class BromiumParser extends AbstractContentAssistParser {

	@Inject
	private BromiumGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBromiumParser createParser() {
		InternalBromiumParser result = new InternalBromiumParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWebDriverActionAccess().getAlternatives(), "rule__WebDriverAction__Alternatives");
					put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getApplicationActionAccess().getGroup(), "rule__ApplicationAction__Group__0");
					put(grammarAccess.getSyntaxDefinitionAccess().getGroup(), "rule__SyntaxDefinition__Group__0");
					put(grammarAccess.getPreconditionAccess().getGroup(), "rule__Precondition__Group__0");
					put(grammarAccess.getPostconditionAccess().getGroup(), "rule__Postcondition__Group__0");
					put(grammarAccess.getExpectHttpRequestAccess().getGroup(), "rule__ExpectHttpRequest__Group__0");
					put(grammarAccess.getElementWithIdIsPresentAccess().getGroup(), "rule__ElementWithIdIsPresent__Group__0");
					put(grammarAccess.getClickOnElementWithIdAccess().getGroup(), "rule__ClickOnElementWithId__Group__0");
					put(grammarAccess.getPageLoadAccess().getGroup(), "rule__PageLoad__Group__0");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup(), "rule__TypeTextInElementFoundByCssSelector__Group__0");
					put(grammarAccess.getThreeDottedVersionAccess().getGroup(), "rule__ThreeDottedVersion__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getVersionAssignment_3(), "rule__Model__VersionAssignment_3");
					put(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1(), "rule__Model__BaseVersionAssignment_4_1");
					put(grammarAccess.getModelAccess().getActionsAssignment_7(), "rule__Model__ActionsAssignment_7");
					put(grammarAccess.getApplicationActionAccess().getNameAssignment_1(), "rule__ApplicationAction__NameAssignment_1");
					put(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3(), "rule__ApplicationAction__SyntaxDefinitionsAssignment_3");
					put(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4(), "rule__ApplicationAction__PreconditionAssignment_4");
					put(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_5(), "rule__ApplicationAction__WebDriverActionAssignment_5");
					put(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_6(), "rule__ApplicationAction__PostconditionAssignment_6");
					put(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_7(), "rule__ApplicationAction__ExpectHttpRequestAssignment_7");
					put(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1(), "rule__SyntaxDefinition__ContentAssignment_1");
					put(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2(), "rule__SyntaxDefinition__ParameterAssignment_2");
					put(grammarAccess.getPreconditionAccess().getActionAssignment_1(), "rule__Precondition__ActionAssignment_1");
					put(grammarAccess.getPostconditionAccess().getPostconditionAssignment_3(), "rule__Postcondition__PostconditionAssignment_3");
					put(grammarAccess.getElementWithIdIsPresentAccess().getCssSelectorAssignment_4(), "rule__ElementWithIdIsPresent__CssSelectorAssignment_4");
					put(grammarAccess.getClickOnElementWithIdAccess().getCssSelectorAssignment_6(), "rule__ClickOnElementWithId__CssSelectorAssignment_6");
					put(grammarAccess.getPageLoadAccess().getSubpathAssignment_2(), "rule__PageLoad__SubpathAssignment_2");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getTextAssignment_1(), "rule__TypeTextInElementFoundByCssSelector__TextAssignment_1");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getCssSelectorAssignment_7(), "rule__TypeTextInElementFoundByCssSelector__CssSelectorAssignment_7");
					put(grammarAccess.getParameterValueAccess().getContentAssignment_0(), "rule__ParameterValue__ContentAssignment_0");
					put(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1(), "rule__ParameterValue__ExposedParameterAssignment_1");
					put(grammarAccess.getExposedParameterAccess().getNameAssignment(), "rule__ExposedParameter__NameAssignment");
					put(grammarAccess.getThreeDottedVersionAccess().getBigAssignment_0(), "rule__ThreeDottedVersion__BigAssignment_0");
					put(grammarAccess.getThreeDottedVersionAccess().getMediumAssignment_2(), "rule__ThreeDottedVersion__MediumAssignment_2");
					put(grammarAccess.getThreeDottedVersionAccess().getSmallAssignment_4(), "rule__ThreeDottedVersion__SmallAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BromiumGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BromiumGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
