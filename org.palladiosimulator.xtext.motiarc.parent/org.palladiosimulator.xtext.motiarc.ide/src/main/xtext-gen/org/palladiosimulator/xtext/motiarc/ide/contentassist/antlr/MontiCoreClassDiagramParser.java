/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr.internal.InternalMontiCoreClassDiagramParser;
import org.palladiosimulator.xtext.motiarc.services.MontiCoreClassDiagramGrammarAccess;

public class MontiCoreClassDiagramParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MontiCoreClassDiagramGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MontiCoreClassDiagramGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCDDefinitionAccess().getAlternatives(), "rule__CDDefinition__Alternatives");
			builder.put(grammarAccess.getMemberAccess().getTypeAlternatives_0_0(), "rule__Member__TypeAlternatives_0_0");
			builder.put(grammarAccess.getPackageAccess().getNameAlternatives_1_0(), "rule__Package__NameAlternatives_1_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0(), "rule__MCPrimitiveType__TypeAlternatives_0");
			builder.put(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0(), "rule__MCObjectType__TypeAlternatives_0");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0(), "rule__MCCollectionType__CollectionAlternatives_0_0");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getLiteralExpressionAccess().getAlternatives(), "rule__LiteralExpression__Alternatives");
			builder.put(grammarAccess.getNameExpressionAccess().getAlternatives(), "rule__NameExpression__Alternatives");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0(), "rule__BinaryExpression__Literal1Alternatives_0_0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0(), "rule__BinaryExpression__Literal2Alternatives_2_0");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getGroup(), "rule__ClassDiagramCompilationUnit__Group__0");
			builder.put(grammarAccess.getClassDiagramAccess().getGroup(), "rule__ClassDiagram__Group__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup(), "rule__CDClass__Group__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup_3(), "rule__CDClass__Group_3__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup_4(), "rule__CDClass__Group_4__0");
			builder.put(grammarAccess.getCDClassAccess().getGroup_4_2(), "rule__CDClass__Group_4_2__0");
			builder.put(grammarAccess.getCDEnumAccess().getGroup(), "rule__CDEnum__Group__0");
			builder.put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
			builder.put(grammarAccess.getImportStatementsAccess().getGroup(), "rule__ImportStatements__Group__0");
			builder.put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getGroup(), "rule__MCCollectionType__Group__0");
			builder.put(grammarAccess.getMCArrayTypeAccess().getGroup(), "rule__MCArrayType__Group__0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getGroup(), "rule__BinaryExpression__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup(), "rule__Arguments__Group__0");
			builder.put(grammarAccess.getArgumentsAccess().getGroup_2(), "rule__Arguments__Group_2__0");
			builder.put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getPackageAssignment_0(), "rule__ClassDiagramCompilationUnit__PackageAssignment_0");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsAssignment_1(), "rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1");
			builder.put(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramAssignment_2(), "rule__ClassDiagramCompilationUnit__DiagramAssignment_2");
			builder.put(grammarAccess.getClassDiagramAccess().getNameAssignment_1(), "rule__ClassDiagram__NameAssignment_1");
			builder.put(grammarAccess.getClassDiagramAccess().getCdElementsAssignment_3(), "rule__ClassDiagram__CdElementsAssignment_3");
			builder.put(grammarAccess.getCDClassAccess().getPublicAssignment_0(), "rule__CDClass__PublicAssignment_0");
			builder.put(grammarAccess.getCDClassAccess().getNameAssignment_2(), "rule__CDClass__NameAssignment_2");
			builder.put(grammarAccess.getCDClassAccess().getExtendsAssignment_3_1(), "rule__CDClass__ExtendsAssignment_3_1");
			builder.put(grammarAccess.getCDClassAccess().getImplementsAssignment_4_1(), "rule__CDClass__ImplementsAssignment_4_1");
			builder.put(grammarAccess.getCDClassAccess().getImplementsAssignment_4_2_1(), "rule__CDClass__ImplementsAssignment_4_2_1");
			builder.put(grammarAccess.getCDClassAccess().getMembersAssignment_6(), "rule__CDClass__MembersAssignment_6");
			builder.put(grammarAccess.getCDEnumAccess().getPublicAssignment_0(), "rule__CDEnum__PublicAssignment_0");
			builder.put(grammarAccess.getCDEnumAccess().getNameAssignment_2(), "rule__CDEnum__NameAssignment_2");
			builder.put(grammarAccess.getCDEnumAccess().getValuesAssignment_4(), "rule__CDEnum__ValuesAssignment_4");
			builder.put(grammarAccess.getMemberAccess().getTypeAssignment_0(), "rule__Member__TypeAssignment_0");
			builder.put(grammarAccess.getMemberAccess().getNameAssignment_1(), "rule__Member__NameAssignment_1");
			builder.put(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1(), "rule__ImportStatements__ImportUriAssignment_1");
			builder.put(grammarAccess.getImportStatementsAccess().getStarAssignment_2(), "rule__ImportStatements__StarAssignment_2");
			builder.put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
			builder.put(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment(), "rule__MCPrimitiveType__TypeAssignment");
			builder.put(grammarAccess.getMCObjectTypeAccess().getTypeAssignment(), "rule__MCObjectType__TypeAssignment");
			builder.put(grammarAccess.getMCVoidTypeAccess().getTypeAssignment(), "rule__MCVoidType__TypeAssignment");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0(), "rule__MCCollectionType__CollectionAssignment_0");
			builder.put(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2(), "rule__MCCollectionType__InnerTypeAssignment_2");
			builder.put(grammarAccess.getNumberLiteralAccess().getLiteralAssignment(), "rule__NumberLiteral__LiteralAssignment");
			builder.put(grammarAccess.getStringLiteralAccess().getLiteralAssignment(), "rule__StringLiteral__LiteralAssignment");
			builder.put(grammarAccess.getNameExpressionAccess().getNameAssignment_0(), "rule__NameExpression__NameAssignment_0");
			builder.put(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1(), "rule__NameExpression__QualifiednameAssignment_1");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0(), "rule__BinaryExpression__Literal1Assignment_0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1(), "rule__BinaryExpression__OpAssignment_1");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2(), "rule__BinaryExpression__Literal2Assignment_2");
			builder.put(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1(), "rule__Arguments__ArgumentsAssignment_1");
			builder.put(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1(), "rule__Arguments__ArgumentsAssignment_2_1");
			builder.put(grammarAccess.getArgumentAccess().getNameAssignment_0(), "rule__Argument__NameAssignment_0");
			builder.put(grammarAccess.getArgumentAccess().getExpressionAssignment_1(), "rule__Argument__ExpressionAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MontiCoreClassDiagramGrammarAccess grammarAccess;

	@Override
	protected InternalMontiCoreClassDiagramParser createParser() {
		InternalMontiCoreClassDiagramParser result = new InternalMontiCoreClassDiagramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MontiCoreClassDiagramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MontiCoreClassDiagramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
