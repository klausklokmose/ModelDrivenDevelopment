package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import featureModel.BinaryOperation;
import featureModel.FeatureModelPackage;
import featureModel.Group;
import featureModel.GroupedFeature;
import featureModel.Identifier;
import featureModel.Model;
import featureModel.NULL;
import featureModel.SolitaryFeature;
import featureModel.UnaryOperation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FeatureModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FeatureModelPackage.BINARY_OPERATION:
				if(context == grammarAccess.getBinaryOperationRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BinaryOperation(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.GROUP:
				if(context == grammarAccess.getGroupRule()) {
					sequence_Group(context, (Group) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.GROUPED_FEATURE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getGroupedFeatureRule()) {
					sequence_GroupedFeature(context, (GroupedFeature) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.IDENTIFIER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierRule()) {
					sequence_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.NULL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNULLRule()) {
					sequence_NULL(context, (NULL) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.NUMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberRule()) {
					sequence_Number(context, (featureModel.Number) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.SOLITARY_FEATURE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getSolitaryFeatureRule()) {
					sequence_SolitaryFeature(context, (SolitaryFeature) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.UNARY_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_UnaryOperation(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (operator=BinaryOperator rexp=Expression lexp=Expression)
	 */
	protected void sequence_BinaryOperation(EObject context, BinaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.BINARY_OPERATION__REXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.BINARY_OPERATION__REXP));
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.BINARY_OPERATION__LEXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.BINARY_OPERATION__LEXP));
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.BINARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.BINARY_OPERATION__OPERATOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBinaryOperationAccess().getOperatorBinaryOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBinaryOperationAccess().getRexpExpressionParserRuleCall_5_0(), semanticObject.getRexp());
		feeder.accept(grammarAccess.getBinaryOperationAccess().getLexpExpressionParserRuleCall_7_0(), semanticObject.getLexp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (inclusive?='any'? groupedFeatures+=GroupedFeature groupedFeatures+=GroupedFeature*)
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (
	 *             (
	 *                 type=SimpleType? 
	 *                 (groups+=Group groups+=Group*)? 
	 *                 (features+=SolitaryFeature features+=SolitaryFeature*)? 
	 *                 (constraints+=Expression constraints+=Expression*)?
	 *             ) | 
	 *             constraints+=Expression
	 *         )
	 *     )
	 */
	protected void sequence_GroupedFeature(EObject context, GroupedFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString ref=[Feature|EString])
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.IDENTIFIER__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.IDENTIFIER__REF));
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.IDENTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.IDENTIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_4_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((RootFeature+=Feature RootFeature+=Feature*)?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NULL}
	 */
	protected void sequence_NULL(EObject context, NULL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_Number(EObject context, featureModel.Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         required=SolitaryType? 
	 *         name=EString 
	 *         (
	 *             (
	 *                 type=SimpleType? 
	 *                 (groups+=Group groups+=Group*)? 
	 *                 (features+=SolitaryFeature features+=SolitaryFeature*)? 
	 *                 (constraints+=Expression constraints+=Expression*)?
	 *             ) | 
	 *             constraints+=Expression
	 *         )
	 *     )
	 */
	protected void sequence_SolitaryFeature(EObject context, SolitaryFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryOperator exp=Expression)
	 */
	protected void sequence_UnaryOperation(EObject context, UnaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.UNARY_OPERATION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.UNARY_OPERATION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, FeatureModelPackage.Literals.UNARY_OPERATION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FeatureModelPackage.Literals.UNARY_OPERATION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_3_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryOperationAccess().getExpExpressionParserRuleCall_5_0(), semanticObject.getExp());
		feeder.finish();
	}
}
