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
	protected AbstractElementAlias match_SolitaryFeature___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_AtomicExp_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
		match_AtomicExp_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
		match_SolitaryFeature___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_4_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
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
			else if(match_SolitaryFeature___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q.equals(syntax))
				emit_SolitaryFeature___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     ('{' '}')?
	 */
	protected void emit_SolitaryFeature___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
