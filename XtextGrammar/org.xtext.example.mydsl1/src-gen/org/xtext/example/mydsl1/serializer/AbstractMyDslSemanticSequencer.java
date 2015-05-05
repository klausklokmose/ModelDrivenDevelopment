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
				if(context == grammarAccess.getAtomicExpRule() ||
				   context == grammarAccess.getBinaryOperationRule() ||
				   context == grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getLogical2OperationRule() ||
				   context == grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()) {
					sequence_BinaryOperation_Expression_Logical2Operation(context, (BinaryOperation) semanticObject); 
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
				if(context == grammarAccess.getAtomicExpRule() ||
				   context == grammarAccess.getBinaryOperationRule() ||
				   context == grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getIdentifierRule() ||
				   context == grammarAccess.getLogical2OperationRule() ||
				   context == grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()) {
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
				if(context == grammarAccess.getAtomicExpRule() ||
				   context == grammarAccess.getBinaryOperationRule() ||
				   context == grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getLogical2OperationRule() ||
				   context == grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getNULLRule()) {
					sequence_NULL(context, (NULL) semanticObject); 
					return; 
				}
				else break;
			case FeatureModelPackage.NUMBER:
				if(context == grammarAccess.getAtomicExpRule() ||
				   context == grammarAccess.getBinaryOperationRule() ||
				   context == grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getLogical2OperationRule() ||
				   context == grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0() ||
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
				if(context == grammarAccess.getAtomicExpRule() ||
				   context == grammarAccess.getBinaryOperationRule() ||
				   context == grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0() ||
				   context == grammarAccess.getLogical2OperationRule() ||
				   context == grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0() ||
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
	 *     (
	 *         (lexp=Logical2Operation_BinaryOperation_1_0 operator=CompareOperator rexp=BinaryOperation) | 
	 *         (lexp=BinaryOperation_BinaryOperation_1_0 operator=ArithmicOperator rexp=AtomicExp) | 
	 *         (lexp=Expression_BinaryOperation_1_0 operator=LogicalOperator rexp=Logical2Operation)
	 *     )
	 */
	protected void sequence_BinaryOperation_Expression_Logical2Operation(EObject context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     name=EString
	 */
	protected void sequence_GroupedFeature(EObject context, GroupedFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref+=[Feature|ID] ref+=[Feature|ID]*)
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *         type=SimpleType? 
	 *         name=EString 
	 *         ((features+=SolitaryFeature features+=SolitaryFeature*)? (groups+=Group groups+=Group*)? (constraints+=Expression constraints+=Expression*)?)?
	 *     )
	 */
	protected void sequence_SolitaryFeature(EObject context, SolitaryFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryOperator exp=AtomicExp)
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
		feeder.accept(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
}
