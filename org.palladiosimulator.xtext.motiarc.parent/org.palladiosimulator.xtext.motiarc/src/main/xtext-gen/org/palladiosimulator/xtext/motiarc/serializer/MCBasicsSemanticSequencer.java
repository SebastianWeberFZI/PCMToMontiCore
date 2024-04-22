/*
 * generated by Xtext 2.34.0
 */
package org.palladiosimulator.xtext.motiarc.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.palladiosimulator.xtext.motiarc.mcBasics.Argument;
import org.palladiosimulator.xtext.motiarc.mcBasics.Arguments;
import org.palladiosimulator.xtext.motiarc.mcBasics.ImportStatements;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCCollectionType;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCPrimitiveType;
import org.palladiosimulator.xtext.motiarc.mcBasics.MCVoidType;
import org.palladiosimulator.xtext.motiarc.mcBasics.McBasicsPackage;
import org.palladiosimulator.xtext.motiarc.mcBasics.NameExpression;
import org.palladiosimulator.xtext.motiarc.mcBasics.NumberLiteral;
import org.palladiosimulator.xtext.motiarc.mcBasics.StringLiteral;
import org.palladiosimulator.xtext.motiarc.services.MCBasicsGrammarAccess;

@SuppressWarnings("all")
public class MCBasicsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MCBasicsGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == McBasicsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case McBasicsPackage.ARGUMENT:
				sequence_Argument(context, (Argument) semanticObject); 
				return; 
			case McBasicsPackage.ARGUMENTS:
				sequence_Arguments(context, (Arguments) semanticObject); 
				return; 
			case McBasicsPackage.IMPORT_STATEMENTS:
				sequence_ImportStatements(context, (ImportStatements) semanticObject); 
				return; 
			case McBasicsPackage.MC_COLLECTION_TYPE:
				sequence_MCCollectionType(context, (MCCollectionType) semanticObject); 
				return; 
			case McBasicsPackage.MC_PRIMITIVE_TYPE:
				sequence_MCPrimitiveType(context, (MCPrimitiveType) semanticObject); 
				return; 
			case McBasicsPackage.MC_VOID_TYPE:
				sequence_MCVoidType(context, (MCVoidType) semanticObject); 
				return; 
			case McBasicsPackage.NAME_EXPRESSION:
				sequence_NameExpression(context, (NameExpression) semanticObject); 
				return; 
			case McBasicsPackage.NUMBER_LITERAL:
				sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
				return; 
			case McBasicsPackage.PACKAGE:
				sequence_Package(context, (org.palladiosimulator.xtext.motiarc.mcBasics.Package) semanticObject); 
				return; 
			case McBasicsPackage.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Argument returns Argument
	 *
	 * Constraint:
	 *     (name?=ID expression=Expression)
	 * </pre>
	 */
	protected void sequence_Argument(ISerializationContext context, Argument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, McBasicsPackage.Literals.ARGUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, McBasicsPackage.Literals.ARGUMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, McBasicsPackage.Literals.ARGUMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, McBasicsPackage.Literals.ARGUMENT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.isName());
		feeder.accept(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Arguments returns Arguments
	 *
	 * Constraint:
	 *     (arguments+=Argument arguments+=Argument*)
	 * </pre>
	 */
	protected void sequence_Arguments(ISerializationContext context, Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImportStatements returns ImportStatements
	 *
	 * Constraint:
	 *     (importUri=MCQUALIFIEDNAME star='*'?)
	 * </pre>
	 */
	protected void sequence_ImportStatements(ISerializationContext context, ImportStatements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns MCCollectionType
	 *     MCCollectionType returns MCCollectionType
	 *
	 * Constraint:
	 *     ((collection='Set' | collection='List' | collection='Map' | collection='Optional') innerType=Type)
	 * </pre>
	 */
	protected void sequence_MCCollectionType(ISerializationContext context, MCCollectionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Type returns MCPrimitiveType
	 *     MCPrimitiveType returns MCPrimitiveType
	 *     MCArrayType returns MCPrimitiveType
	 *
	 * Constraint:
	 *     (
	 *         type='boolean' | 
	 *         type='byte' | 
	 *         type='short' | 
	 *         type='int' | 
	 *         type='long' | 
	 *         type='char' | 
	 *         type='float' | 
	 *         type='double' | 
	 *         type='String'
	 *     )
	 * </pre>
	 */
	protected void sequence_MCPrimitiveType(ISerializationContext context, MCPrimitiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MCVoidType returns MCVoidType
	 *
	 * Constraint:
	 *     type='void'
	 * </pre>
	 */
	protected void sequence_MCVoidType(ISerializationContext context, MCVoidType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, McBasicsPackage.Literals.MC_VOID_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, McBasicsPackage.Literals.MC_VOID_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMCVoidTypeAccess().getTypeVoidKeyword_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns NameExpression
	 *     NameExpression returns NameExpression
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_NameExpression(ISerializationContext context, NameExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, McBasicsPackage.Literals.NAME_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, McBasicsPackage.Literals.NAME_EXPRESSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns NumberLiteral
	 *     LiteralExpression returns NumberLiteral
	 *     NumberLiteral returns NumberLiteral
	 *
	 * Constraint:
	 *     literal=INT
	 * </pre>
	 */
	protected void sequence_NumberLiteral(ISerializationContext context, NumberLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, McBasicsPackage.Literals.NUMBER_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, McBasicsPackage.Literals.NUMBER_LITERAL__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (name=MCQUALIFIEDNAME | name=ID)
	 * </pre>
	 */
	protected void sequence_Package(ISerializationContext context, org.palladiosimulator.xtext.motiarc.mcBasics.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns StringLiteral
	 *     LiteralExpression returns StringLiteral
	 *     StringLiteral returns StringLiteral
	 *
	 * Constraint:
	 *     literal=STRING
	 * </pre>
	 */
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, McBasicsPackage.Literals.STRING_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, McBasicsPackage.Literals.STRING_LITERAL__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
}
