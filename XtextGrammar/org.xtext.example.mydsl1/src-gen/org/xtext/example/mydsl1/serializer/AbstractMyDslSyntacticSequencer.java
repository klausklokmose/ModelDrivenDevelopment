package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractMyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AtomicExp_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_AtomicExp_LeftParenthesisKeyword_3_0_p;
	protected AbstractElementAlias match_GroupedFeature___EqualsSignGreaterThanSignKeyword_2_0_0_SemicolonKeyword_2_0_5__q;
	protected AbstractElementAlias match_SolitaryFeature___EqualsSignGreaterThanSignKeyword_3_0_0_SemicolonKeyword_3_0_5__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_AtomicExp_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
		match_AtomicExp_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
		match_GroupedFeature___EqualsSignGreaterThanSignKeyword_2_0_0_SemicolonKeyword_2_0_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGroupedFeatureAccess().getEqualsSignGreaterThanSignKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getGroupedFeatureAccess().getSemicolonKeyword_2_0_5()));
		match_SolitaryFeature___EqualsSignGreaterThanSignKeyword_3_0_0_SemicolonKeyword_3_0_5__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSolitaryFeatureAccess().getEqualsSignGreaterThanSignKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getSolitaryFeatureAccess().getSemicolonKeyword_3_0_5()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEBooleanRule())
			return getEBooleanToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * EBoolean returns ecore::EBoolean:
	 * 	'true' | 'false';
	 */
	protected String getEBooleanToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AtomicExp_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_AtomicExp_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicExp_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_AtomicExp_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GroupedFeature___EqualsSignGreaterThanSignKeyword_2_0_0_SemicolonKeyword_2_0_5__q.equals(syntax))
				emit_GroupedFeature___EqualsSignGreaterThanSignKeyword_2_0_0_SemicolonKeyword_2_0_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SolitaryFeature___EqualsSignGreaterThanSignKeyword_3_0_0_SemicolonKeyword_3_0_5__q.equals(syntax))
				emit_SolitaryFeature___EqualsSignGreaterThanSignKeyword_3_0_0_SemicolonKeyword_3_0_5__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_AtomicExp_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_AtomicExp_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=>' ';')?
	 */
	protected void emit_GroupedFeature___EqualsSignGreaterThanSignKeyword_2_0_0_SemicolonKeyword_2_0_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('=>' ';')?
	 */
	protected void emit_SolitaryFeature___EqualsSignGreaterThanSignKeyword_3_0_0_SemicolonKeyword_3_0_5__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
