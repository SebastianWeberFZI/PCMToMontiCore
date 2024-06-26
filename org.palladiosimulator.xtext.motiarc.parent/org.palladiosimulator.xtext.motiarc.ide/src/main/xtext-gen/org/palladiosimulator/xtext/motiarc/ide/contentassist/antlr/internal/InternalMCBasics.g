/*
 * generated by Xtext 2.34.0
 */
grammar InternalMCBasics;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.xtext.motiarc.services.MCBasicsGrammarAccess;

}
@parser::members {
	private MCBasicsGrammarAccess grammarAccess;

	public void setGrammarAccess(MCBasicsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleImportStatements
entryRuleImportStatements
:
{ before(grammarAccess.getImportStatementsRule()); }
	 ruleImportStatements
{ after(grammarAccess.getImportStatementsRule()); } 
	 EOF 
;

// Rule ImportStatements
ruleImportStatements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportStatementsAccess().getGroup()); }
		(rule__ImportStatements__Group__0)
		{ after(grammarAccess.getImportStatementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMCPrimitiveType
entryRuleMCPrimitiveType
:
{ before(grammarAccess.getMCPrimitiveTypeRule()); }
	 ruleMCPrimitiveType
{ after(grammarAccess.getMCPrimitiveTypeRule()); } 
	 EOF 
;

// Rule MCPrimitiveType
ruleMCPrimitiveType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); }
		(rule__MCPrimitiveType__TypeAssignment)
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMCObjectType
entryRuleMCObjectType
:
{ before(grammarAccess.getMCObjectTypeRule()); }
	 ruleMCObjectType
{ after(grammarAccess.getMCObjectTypeRule()); } 
	 EOF 
;

// Rule MCObjectType
ruleMCObjectType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); }
		(rule__MCObjectType__TypeAssignment)
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMCCollectionType
entryRuleMCCollectionType
:
{ before(grammarAccess.getMCCollectionTypeRule()); }
	 ruleMCCollectionType
{ after(grammarAccess.getMCCollectionTypeRule()); } 
	 EOF 
;

// Rule MCCollectionType
ruleMCCollectionType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getGroup()); }
		(rule__MCCollectionType__Group__0)
		{ after(grammarAccess.getMCCollectionTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMCArrayType
entryRuleMCArrayType
:
{ before(grammarAccess.getMCArrayTypeRule()); }
	 ruleMCArrayType
{ after(grammarAccess.getMCArrayTypeRule()); } 
	 EOF 
;

// Rule MCArrayType
ruleMCArrayType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMCArrayTypeAccess().getGroup()); }
		(rule__MCArrayType__Group__0)
		{ after(grammarAccess.getMCArrayTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAlternatives()); }
		(rule__Expression__Alternatives)
		{ after(grammarAccess.getExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteralExpression
entryRuleLiteralExpression
:
{ before(grammarAccess.getLiteralExpressionRule()); }
	 ruleLiteralExpression
{ after(grammarAccess.getLiteralExpressionRule()); } 
	 EOF 
;

// Rule LiteralExpression
ruleLiteralExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); }
		(rule__LiteralExpression__Alternatives)
		{ after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumberLiteral
entryRuleNumberLiteral
:
{ before(grammarAccess.getNumberLiteralRule()); }
	 ruleNumberLiteral
{ after(grammarAccess.getNumberLiteralRule()); } 
	 EOF 
;

// Rule NumberLiteral
ruleNumberLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); }
		(rule__NumberLiteral__LiteralAssignment)
		{ after(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); }
		(rule__StringLiteral__LiteralAssignment)
		{ after(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNameExpression
entryRuleNameExpression
:
{ before(grammarAccess.getNameExpressionRule()); }
	 ruleNameExpression
{ after(grammarAccess.getNameExpressionRule()); } 
	 EOF 
;

// Rule NameExpression
ruleNameExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNameExpressionAccess().getAlternatives()); }
		(rule__NameExpression__Alternatives)
		{ after(grammarAccess.getNameExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinaryExpression
entryRuleBinaryExpression
:
{ before(grammarAccess.getBinaryExpressionRule()); }
	 ruleBinaryExpression
{ after(grammarAccess.getBinaryExpressionRule()); } 
	 EOF 
;

// Rule BinaryExpression
ruleBinaryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getGroup()); }
		(rule__BinaryExpression__Group__0)
		{ after(grammarAccess.getBinaryExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArgument
entryRuleArgument
:
{ before(grammarAccess.getArgumentRule()); }
	 ruleArgument
{ after(grammarAccess.getArgumentRule()); } 
	 EOF 
;

// Rule Argument
ruleArgument 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArgumentAccess().getGroup()); }
		(rule__Argument__Group__0)
		{ after(grammarAccess.getArgumentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Operator
ruleOperator
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
		(rule__Operator__Alternatives)
		{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); }
		ruleMCPrimitiveType
		{ after(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); }
		ruleMCArrayType
		{ after(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2()); }
		ruleMCObjectType
		{ after(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3()); }
		ruleMCCollectionType
		{ after(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCPrimitiveType__TypeAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); }
		'boolean'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); }
		'byte'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); }
		'short'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); }
		'int'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); }
		'long'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); }
		'char'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); }
		'float'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); }
		'double'
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCObjectType__TypeAlternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); }
		'Boolean'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); }
		'Byte'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); }
		'Integer'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); }
		'Long'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); }
		'Char'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); }
		'Double'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); }
		'String'
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__CollectionAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); }
		'Set'
		{ after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); }
		'List'
		{ after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); }
		'Map'
		{ after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); }
		'Optional'
		{ after(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0()); }
		ruleNameExpression
		{ after(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); }
		ruleLiteralExpression
		{ after(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2()); }
		ruleBinaryExpression
		{ after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0()); }
		ruleNumberLiteral
		{ after(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1()); }
		ruleStringLiteral
		{ after(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NameExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); }
		(rule__NameExpression__NameAssignment_0)
		{ after(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); }
		(rule__NameExpression__QualifiednameAssignment_1)
		{ after(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Literal1Alternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0()); }
		ruleLiteralExpression
		{ after(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1()); }
		ruleNameExpression
		{ after(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Literal2Alternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0()); }
		ruleLiteralExpression
		{ after(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1()); }
		ruleNameExpression
		{ after(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); }
		('>')
		{ after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); }
		('<')
		{ after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); }
		('==')
		{ after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); }
		('&&')
		{ after(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); }
		('+')
		{ after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); }
		('-')
		{ after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); }
		('/')
		{ after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); }
		('*')
		{ after(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImportStatements__Group__0__Impl
	rule__ImportStatements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImportStatements__Group__1__Impl
	rule__ImportStatements__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); }
	(rule__ImportStatements__ImportUriAssignment_1)
	{ after(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImportStatements__Group__2__Impl
	rule__ImportStatements__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); }
	(rule__ImportStatements__StarAssignment_2)?
	{ after(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImportStatements__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MCCollectionType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCCollectionType__Group__0__Impl
	rule__MCCollectionType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); }
	(rule__MCCollectionType__CollectionAssignment_0)
	{ after(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCCollectionType__Group__1__Impl
	rule__MCCollectionType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); }
	'<'
	{ after(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCCollectionType__Group__2__Impl
	rule__MCCollectionType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); }
	(rule__MCCollectionType__InnerTypeAssignment_2)
	{ after(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCCollectionType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); }
	'>'
	{ after(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MCArrayType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCArrayType__Group__0__Impl
	rule__MCArrayType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MCArrayType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); }
	ruleMCPrimitiveType
	{ after(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCArrayType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCArrayType__Group__1__Impl
	rule__MCArrayType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MCArrayType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCArrayType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MCArrayType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MCArrayType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BinaryExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryExpression__Group__0__Impl
	rule__BinaryExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); }
	(rule__BinaryExpression__Literal1Assignment_0)
	{ after(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryExpression__Group__1__Impl
	rule__BinaryExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); }
	(rule__BinaryExpression__OpAssignment_1)
	{ after(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BinaryExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); }
	(rule__BinaryExpression__Literal2Assignment_2)
	{ after(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Argument__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Argument__Group__0__Impl
	rule__Argument__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgumentAccess().getNameAssignment_0()); }
	(rule__Argument__NameAssignment_0)
	{ after(grammarAccess.getArgumentAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Argument__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); }
	(rule__Argument__ExpressionAssignment_1)
	{ after(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ImportStatements__ImportUriAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0()); }
		RULE_MCQUALIFIEDNAME
		{ after(grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImportStatements__StarAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0()); }
		RULE_DOTSTAR
		{ after(grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCPrimitiveType__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); }
		(rule__MCPrimitiveType__TypeAlternatives_0)
		{ after(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCObjectType__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); }
		(rule__MCObjectType__TypeAlternatives_0)
		{ after(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__CollectionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); }
		(rule__MCCollectionType__CollectionAlternatives_0_0)
		{ after(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MCCollectionType__InnerTypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NumberLiteral__LiteralAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__LiteralAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NameExpression__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NameExpression__QualifiednameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0()); }
		RULE_MCQUALIFIEDNAME
		{ after(grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Literal1Assignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); }
		(rule__BinaryExpression__Literal1Alternatives_0_0)
		{ after(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0()); }
		ruleOperator
		{ after(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BinaryExpression__Literal2Assignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); }
		(rule__BinaryExpression__Literal2Alternatives_2_0)
		{ after(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Argument__ExpressionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0()); }
		ruleExpression
		{ after(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_MCQUALIFIEDNAME : RULE_ID ('.' RULE_ID)+;

RULE_DOTSTAR : '.*';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
