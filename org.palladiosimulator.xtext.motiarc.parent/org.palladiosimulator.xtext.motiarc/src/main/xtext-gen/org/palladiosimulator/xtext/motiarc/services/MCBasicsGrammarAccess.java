/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MCBasicsGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ImportStatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.ImportStatements");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportUriAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0 = (RuleCall)cImportUriAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStarAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Keyword cStarAsteriskKeyword_2_1_0 = (Keyword)cStarAssignment_2_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ImportStatements:
		//    'import' importUri=MCQUALIFIEDNAME ('.' star='*')? ";"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importUri=MCQUALIFIEDNAME ('.' star='*')? ";"
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importUri=MCQUALIFIEDNAME
		public Assignment getImportUriAssignment_1() { return cImportUriAssignment_1; }
		
		//MCQUALIFIEDNAME
		public RuleCall getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0() { return cImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0; }
		
		//('.' star='*')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//star='*'
		public Assignment getStarAssignment_2_1() { return cStarAssignment_2_1; }
		
		//'*'
		public Keyword getStarAsteriskKeyword_2_1_0() { return cStarAsteriskKeyword_2_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Package:
		//    'package' name=(MCQUALIFIEDNAME | ID)';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=(MCQUALIFIEDNAME | ID)';'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=(MCQUALIFIEDNAME | ID)
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//(MCQUALIFIEDNAME | ID)
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//MCQUALIFIEDNAME
		public RuleCall getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0() { return cNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_1() { return cNameIDTerminalRuleCall_1_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMCPrimitiveTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMCArrayTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMCCollectionTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Type:
		//    MCPrimitiveType | MCArrayType | MCCollectionType
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MCPrimitiveType | MCArrayType | MCCollectionType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MCPrimitiveType
		public RuleCall getMCPrimitiveTypeParserRuleCall_0() { return cMCPrimitiveTypeParserRuleCall_0; }
		
		//MCArrayType
		public RuleCall getMCArrayTypeParserRuleCall_1() { return cMCArrayTypeParserRuleCall_1; }
		
		//MCCollectionType
		public RuleCall getMCCollectionTypeParserRuleCall_2() { return cMCCollectionTypeParserRuleCall_2; }
	}
	public class MCPrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.MCPrimitiveType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeAlternatives_0 = (Alternatives)cTypeAssignment.eContents().get(0);
		private final Keyword cTypeBooleanKeyword_0_0 = (Keyword)cTypeAlternatives_0.eContents().get(0);
		private final Keyword cTypeByteKeyword_0_1 = (Keyword)cTypeAlternatives_0.eContents().get(1);
		private final Keyword cTypeShortKeyword_0_2 = (Keyword)cTypeAlternatives_0.eContents().get(2);
		private final Keyword cTypeIntKeyword_0_3 = (Keyword)cTypeAlternatives_0.eContents().get(3);
		private final Keyword cTypeLongKeyword_0_4 = (Keyword)cTypeAlternatives_0.eContents().get(4);
		private final Keyword cTypeCharKeyword_0_5 = (Keyword)cTypeAlternatives_0.eContents().get(5);
		private final Keyword cTypeFloatKeyword_0_6 = (Keyword)cTypeAlternatives_0.eContents().get(6);
		private final Keyword cTypeDoubleKeyword_0_7 = (Keyword)cTypeAlternatives_0.eContents().get(7);
		private final Keyword cTypeStringKeyword_0_8 = (Keyword)cTypeAlternatives_0.eContents().get(8);
		
		//MCPrimitiveType:
		//     type = ( 'boolean' | 'byte' | 'short' | 'int'
		//                  | 'long' | 'char' |'float' | 'double' | 'String' )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//type = ( 'boolean' | 'byte' | 'short' | 'int'
		//             | 'long' | 'char' |'float' | 'double' | 'String' )
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//( 'boolean' | 'byte' | 'short' | 'int'
		//                 | 'long' | 'char' |'float' | 'double' | 'String' )
		public Alternatives getTypeAlternatives_0() { return cTypeAlternatives_0; }
		
		//'boolean'
		public Keyword getTypeBooleanKeyword_0_0() { return cTypeBooleanKeyword_0_0; }
		
		//'byte'
		public Keyword getTypeByteKeyword_0_1() { return cTypeByteKeyword_0_1; }
		
		//'short'
		public Keyword getTypeShortKeyword_0_2() { return cTypeShortKeyword_0_2; }
		
		//'int'
		public Keyword getTypeIntKeyword_0_3() { return cTypeIntKeyword_0_3; }
		
		//'long'
		public Keyword getTypeLongKeyword_0_4() { return cTypeLongKeyword_0_4; }
		
		//'char'
		public Keyword getTypeCharKeyword_0_5() { return cTypeCharKeyword_0_5; }
		
		//'float'
		public Keyword getTypeFloatKeyword_0_6() { return cTypeFloatKeyword_0_6; }
		
		//'double'
		public Keyword getTypeDoubleKeyword_0_7() { return cTypeDoubleKeyword_0_7; }
		
		//'String'
		public Keyword getTypeStringKeyword_0_8() { return cTypeStringKeyword_0_8; }
	}
	public class MCVoidTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.MCVoidType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cTypeVoidKeyword_0 = (Keyword)cTypeAssignment.eContents().get(0);
		
		//MCVoidType:
		//    type = 'void'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//type = 'void'
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//'void'
		public Keyword getTypeVoidKeyword_0() { return cTypeVoidKeyword_0; }
	}
	public class MCCollectionTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.MCCollectionType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCollectionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cCollectionAlternatives_0_0 = (Alternatives)cCollectionAssignment_0.eContents().get(0);
		private final Keyword cCollectionSetKeyword_0_0_0 = (Keyword)cCollectionAlternatives_0_0.eContents().get(0);
		private final Keyword cCollectionListKeyword_0_0_1 = (Keyword)cCollectionAlternatives_0_0.eContents().get(1);
		private final Keyword cCollectionMapKeyword_0_0_2 = (Keyword)cCollectionAlternatives_0_0.eContents().get(2);
		private final Keyword cCollectionOptionalKeyword_0_0_3 = (Keyword)cCollectionAlternatives_0_0.eContents().get(3);
		private final Keyword cLessThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInnerTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInnerTypeTypeParserRuleCall_2_0 = (RuleCall)cInnerTypeAssignment_2.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MCCollectionType:
		//    collection = ('Set' | 'List' | 'Map' | 'Optional') '<' innerType=Type '>'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//collection = ('Set' | 'List' | 'Map' | 'Optional') '<' innerType=Type '>'
		public Group getGroup() { return cGroup; }
		
		//collection = ('Set' | 'List' | 'Map' | 'Optional')
		public Assignment getCollectionAssignment_0() { return cCollectionAssignment_0; }
		
		//('Set' | 'List' | 'Map' | 'Optional')
		public Alternatives getCollectionAlternatives_0_0() { return cCollectionAlternatives_0_0; }
		
		//'Set'
		public Keyword getCollectionSetKeyword_0_0_0() { return cCollectionSetKeyword_0_0_0; }
		
		//'List'
		public Keyword getCollectionListKeyword_0_0_1() { return cCollectionListKeyword_0_0_1; }
		
		//'Map'
		public Keyword getCollectionMapKeyword_0_0_2() { return cCollectionMapKeyword_0_0_2; }
		
		//'Optional'
		public Keyword getCollectionOptionalKeyword_0_0_3() { return cCollectionOptionalKeyword_0_0_3; }
		
		//'<'
		public Keyword getLessThanSignKeyword_1() { return cLessThanSignKeyword_1; }
		
		//innerType=Type
		public Assignment getInnerTypeAssignment_2() { return cInnerTypeAssignment_2; }
		
		//Type
		public RuleCall getInnerTypeTypeParserRuleCall_2_0() { return cInnerTypeTypeParserRuleCall_2_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_3() { return cGreaterThanSignKeyword_3; }
	}
	public class MCArrayTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.MCArrayType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMCPrimitiveTypeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MCArrayType:
		//    MCPrimitiveType'['']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MCPrimitiveType'['']'
		public Group getGroup() { return cGroup; }
		
		//MCPrimitiveType
		public RuleCall getMCPrimitiveTypeParserRuleCall_0() { return cMCPrimitiveTypeParserRuleCall_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNameExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLiteralExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Expression:
		//    NameExpression | LiteralExpression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//NameExpression | LiteralExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NameExpression
		public RuleCall getNameExpressionParserRuleCall_0() { return cNameExpressionParserRuleCall_0; }
		
		//LiteralExpression
		public RuleCall getLiteralExpressionParserRuleCall_1() { return cLiteralExpressionParserRuleCall_1; }
	}
	public class LiteralExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.LiteralExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//LiteralExpression:
		//    NumberLiteral | StringLiteral
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//NumberLiteral | StringLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NumberLiteral
		public RuleCall getNumberLiteralParserRuleCall_0() { return cNumberLiteralParserRuleCall_0; }
		
		//StringLiteral
		public RuleCall getStringLiteralParserRuleCall_1() { return cStringLiteralParserRuleCall_1; }
	}
	public class NumberLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.NumberLiteral");
		private final Assignment cLiteralAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLiteralINTTerminalRuleCall_0 = (RuleCall)cLiteralAssignment.eContents().get(0);
		
		//NumberLiteral:
		//  literal=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//literal=INT
		public Assignment getLiteralAssignment() { return cLiteralAssignment; }
		
		//INT
		public RuleCall getLiteralINTTerminalRuleCall_0() { return cLiteralINTTerminalRuleCall_0; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.StringLiteral");
		private final Assignment cLiteralAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLiteralSTRINGTerminalRuleCall_0 = (RuleCall)cLiteralAssignment.eContents().get(0);
		
		//StringLiteral:
		//    literal=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//literal=STRING
		public Assignment getLiteralAssignment() { return cLiteralAssignment; }
		
		//STRING
		public RuleCall getLiteralSTRINGTerminalRuleCall_0() { return cLiteralSTRINGTerminalRuleCall_0; }
	}
	public class NameExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.NameExpression");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//NameExpression:
		//    name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ArgumentsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.Arguments");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cArgumentsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cArgumentsArgumentParserRuleCall_1_0 = (RuleCall)cArgumentsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cArgumentsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cArgumentsArgumentParserRuleCall_2_1_0 = (RuleCall)cArgumentsAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Arguments:
		//    '(' arguments+=Argument (',' arguments+=Argument)* ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' arguments+=Argument (',' arguments+=Argument)* ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//arguments+=Argument
		public Assignment getArgumentsAssignment_1() { return cArgumentsAssignment_1; }
		
		//Argument
		public RuleCall getArgumentsArgumentParserRuleCall_1_0() { return cArgumentsArgumentParserRuleCall_1_0; }
		
		//(',' arguments+=Argument)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//arguments+=Argument
		public Assignment getArgumentsAssignment_2_1() { return cArgumentsAssignment_2_1; }
		
		//Argument
		public RuleCall getArgumentsArgumentParserRuleCall_2_1_0() { return cArgumentsArgumentParserRuleCall_2_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ArgumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.Argument");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cExpressionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpressionExpressionParserRuleCall_1_0 = (RuleCall)cExpressionAssignment_1.eContents().get(0);
		
		//Argument:
		//    name?=ID expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name?=ID expression=Expression
		public Group getGroup() { return cGroup; }
		
		//name?=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_1() { return cExpressionAssignment_1; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_1_0() { return cExpressionExpressionParserRuleCall_1_0; }
	}
	
	
	private final ImportStatementsElements pImportStatements;
	private final PackageElements pPackage;
	private final TypeElements pType;
	private final MCPrimitiveTypeElements pMCPrimitiveType;
	private final MCVoidTypeElements pMCVoidType;
	private final MCCollectionTypeElements pMCCollectionType;
	private final MCArrayTypeElements pMCArrayType;
	private final ExpressionElements pExpression;
	private final LiteralExpressionElements pLiteralExpression;
	private final NumberLiteralElements pNumberLiteral;
	private final StringLiteralElements pStringLiteral;
	private final NameExpressionElements pNameExpression;
	private final ArgumentsElements pArguments;
	private final ArgumentElements pArgument;
	private final TerminalRule tMCQUALIFIEDNAME;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MCBasicsGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pImportStatements = new ImportStatementsElements();
		this.pPackage = new PackageElements();
		this.pType = new TypeElements();
		this.pMCPrimitiveType = new MCPrimitiveTypeElements();
		this.pMCVoidType = new MCVoidTypeElements();
		this.pMCCollectionType = new MCCollectionTypeElements();
		this.pMCArrayType = new MCArrayTypeElements();
		this.pExpression = new ExpressionElements();
		this.pLiteralExpression = new LiteralExpressionElements();
		this.pNumberLiteral = new NumberLiteralElements();
		this.pStringLiteral = new StringLiteralElements();
		this.pNameExpression = new NameExpressionElements();
		this.pArguments = new ArgumentsElements();
		this.pArgument = new ArgumentElements();
		this.tMCQUALIFIEDNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.palladiosimulator.xtext.motiarc.MCBasics".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ImportStatements:
	//    'import' importUri=MCQUALIFIEDNAME ('.' star='*')? ";"
	//;
	public ImportStatementsElements getImportStatementsAccess() {
		return pImportStatements;
	}
	
	public ParserRule getImportStatementsRule() {
		return getImportStatementsAccess().getRule();
	}
	
	//Package:
	//    'package' name=(MCQUALIFIEDNAME | ID)';'
	//;
	public PackageElements getPackageAccess() {
		return pPackage;
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}
	
	//Type:
	//    MCPrimitiveType | MCArrayType | MCCollectionType
	//;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//MCPrimitiveType:
	//     type = ( 'boolean' | 'byte' | 'short' | 'int'
	//                  | 'long' | 'char' |'float' | 'double' | 'String' )
	//;
	public MCPrimitiveTypeElements getMCPrimitiveTypeAccess() {
		return pMCPrimitiveType;
	}
	
	public ParserRule getMCPrimitiveTypeRule() {
		return getMCPrimitiveTypeAccess().getRule();
	}
	
	//MCVoidType:
	//    type = 'void'
	//;
	public MCVoidTypeElements getMCVoidTypeAccess() {
		return pMCVoidType;
	}
	
	public ParserRule getMCVoidTypeRule() {
		return getMCVoidTypeAccess().getRule();
	}
	
	//MCCollectionType:
	//    collection = ('Set' | 'List' | 'Map' | 'Optional') '<' innerType=Type '>'
	//;
	public MCCollectionTypeElements getMCCollectionTypeAccess() {
		return pMCCollectionType;
	}
	
	public ParserRule getMCCollectionTypeRule() {
		return getMCCollectionTypeAccess().getRule();
	}
	
	//MCArrayType:
	//    MCPrimitiveType'['']'
	//;
	public MCArrayTypeElements getMCArrayTypeAccess() {
		return pMCArrayType;
	}
	
	public ParserRule getMCArrayTypeRule() {
		return getMCArrayTypeAccess().getRule();
	}
	
	//Expression:
	//    NameExpression | LiteralExpression
	//;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//LiteralExpression:
	//    NumberLiteral | StringLiteral
	//;
	public LiteralExpressionElements getLiteralExpressionAccess() {
		return pLiteralExpression;
	}
	
	public ParserRule getLiteralExpressionRule() {
		return getLiteralExpressionAccess().getRule();
	}
	
	//NumberLiteral:
	//  literal=INT
	//;
	public NumberLiteralElements getNumberLiteralAccess() {
		return pNumberLiteral;
	}
	
	public ParserRule getNumberLiteralRule() {
		return getNumberLiteralAccess().getRule();
	}
	
	//StringLiteral:
	//    literal=STRING
	//;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//NameExpression:
	//    name=ID
	//;
	public NameExpressionElements getNameExpressionAccess() {
		return pNameExpression;
	}
	
	public ParserRule getNameExpressionRule() {
		return getNameExpressionAccess().getRule();
	}
	
	//Arguments:
	//    '(' arguments+=Argument (',' arguments+=Argument)* ')'
	//;
	public ArgumentsElements getArgumentsAccess() {
		return pArguments;
	}
	
	public ParserRule getArgumentsRule() {
		return getArgumentsAccess().getRule();
	}
	
	//Argument:
	//    name?=ID expression=Expression
	//;
	public ArgumentElements getArgumentAccess() {
		return pArgument;
	}
	
	public ParserRule getArgumentRule() {
		return getArgumentAccess().getRule();
	}
	
	//terminal MCQUALIFIEDNAME:
	//    ID ('.' ID)+
	//;
	public TerminalRule getMCQUALIFIEDNAMERule() {
		return tMCQUALIFIEDNAME;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
