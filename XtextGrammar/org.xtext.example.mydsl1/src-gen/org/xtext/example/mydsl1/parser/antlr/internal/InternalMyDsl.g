/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;
 	
    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)	otherlv_1='Model' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='Root' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRootKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
	    }
		lv_RootFeature_4_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"RootFeature",
        		lv_RootFeature_4_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='Root' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRootKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
	    }
		lv_RootFeature_6_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"RootFeature",
        		lv_RootFeature_6_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 
    }
    this_SolitaryFeature_0=ruleSolitaryFeature
    { 
        $current = $this_SolitaryFeature_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_1()); 
    }
    this_GroupedFeature_1=ruleGroupedFeature
    { 
        $current = $this_GroupedFeature_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSolitaryFeature
entryRuleSolitaryFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSolitaryFeatureRule()); }
	 iv_ruleSolitaryFeature=ruleSolitaryFeature 
	 { $current=$iv_ruleSolitaryFeature.current; } 
	 EOF 
;

// Rule SolitaryFeature
ruleSolitaryFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='feature' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
	    }
		lv_required_1_0=ruleSolitaryType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		set(
       			$current, 
       			"required",
        		lv_required_1_0, 
        		"SolitaryType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleSimpleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"SimpleType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_3_0()); 
	    }
		lv_name_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_4_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_0_0()); 
	    }
		lv_features_5_0=ruleSolitaryFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_5_0, 
        		"SolitaryFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_1_0()); 
	    }
		lv_features_6_0=ruleSolitaryFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_6_0, 
        		"SolitaryFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_0_0()); 
	    }
		lv_groups_7_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_7_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_1_0()); 
	    }
		lv_groups_8_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_8_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_9='#' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_1_0()); 
	    }
		lv_constraints_10_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_10_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_11='#' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_2_1_0()); 
	    }
		lv_constraints_12_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
	        }
       		add(
       			$current, 
       			"constraints",
        		lv_constraints_12_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_4_4());
    }
)?)
;





// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	 iv_ruleGroup=ruleGroup 
	 { $current=$iv_ruleGroup.current; } 
	 EOF 
;

// Rule Group
ruleGroup returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='select' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getSelectKeyword_0());
    }
(
(
		lv_inclusive_1_0=	'any' 
    {
        newLeafNode(lv_inclusive_1_0, grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGroupRule());
	        }
       		setWithLastConsumed($current, "inclusive", true, "any");
	    }

)
)?	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
	    }
		lv_groupedFeatures_3_0=ruleGroupedFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"groupedFeatures",
        		lv_groupedFeatures_3_0, 
        		"GroupedFeature");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 
	    }
		lv_groupedFeatures_5_0=ruleGroupedFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"groupedFeatures",
        		lv_groupedFeatures_5_0, 
        		"GroupedFeature");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightParenthesisKeyword_5());
    }
)
;





// Entry rule entryRuleGroupedFeature
entryRuleGroupedFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGroupedFeatureRule()); }
	 iv_ruleGroupedFeature=ruleGroupedFeature 
	 { $current=$iv_ruleGroupedFeature.current; } 
	 EOF 
;

// Rule GroupedFeature
ruleGroupedFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
    }
    this_Logical2Operation_0=ruleLogical2Operation
    { 
        $current = $this_Logical2Operation_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleLogicalOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"LogicalOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
	    }
		lv_rexp_3_0=ruleLogical2Operation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExpressionRule());
	        }
       		set(
       			$current, 
       			"rexp",
        		lv_rexp_3_0, 
        		"Logical2Operation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleLogical2Operation
entryRuleLogical2Operation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLogical2OperationRule()); }
	 iv_ruleLogical2Operation=ruleLogical2Operation 
	 { $current=$iv_ruleLogical2Operation.current; } 
	 EOF 
;

// Rule Logical2Operation
ruleLogical2Operation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
    }
    this_BinaryOperation_0=ruleBinaryOperation
    { 
        $current = $this_BinaryOperation_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleCompareOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLogical2OperationRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"CompareOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
	    }
		lv_rexp_3_0=ruleBinaryOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLogical2OperationRule());
	        }
       		set(
       			$current, 
       			"rexp",
        		lv_rexp_3_0, 
        		"BinaryOperation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleBinaryOperation
entryRuleBinaryOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBinaryOperationRule()); }
	 iv_ruleBinaryOperation=ruleBinaryOperation 
	 { $current=$iv_ruleBinaryOperation.current; } 
	 EOF 
;

// Rule BinaryOperation
ruleBinaryOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
    }
    this_AtomicExp_0=ruleAtomicExp
    { 
        $current = $this_AtomicExp_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
	    }
		lv_operator_2_0=ruleArithmicOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_2_0, 
        		"ArithmicOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
	    }
		lv_rexp_3_0=ruleAtomicExp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
	        }
       		set(
       			$current, 
       			"rexp",
        		lv_rexp_3_0, 
        		"AtomicExp");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleUnaryOperation
entryRuleUnaryOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUnaryOperationRule()); }
	 iv_ruleUnaryOperation=ruleUnaryOperation 
	 { $current=$iv_ruleUnaryOperation.current; } 
	 EOF 
;

// Rule UnaryOperation
ruleUnaryOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
	    }
		lv_operator_0_0=ruleUnaryOperator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
	        }
       		set(
       			$current, 
       			"operator",
        		lv_operator_0_0, 
        		"UnaryOperator");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
	    }
		lv_exp_1_0=ruleAtomicExp		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_1_0, 
        		"AtomicExp");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleAtomicExp
entryRuleAtomicExp returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicExpRule()); }
	 iv_ruleAtomicExp=ruleAtomicExp 
	 { $current=$iv_ruleAtomicExp.current; } 
	 EOF 
;

// Rule AtomicExp
ruleAtomicExp returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
    }
    this_NULL_0=ruleNULL
    { 
        $current = $this_NULL_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
    }
    this_Number_1=ruleNumber
    { 
        $current = $this_Number_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
    }
    this_Identifier_2=ruleIdentifier
    { 
        $current = $this_Identifier_2.current; 
        afterParserOrEnumRuleCall();
    }

    |(	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
    }

    { 
        newCompositeNode(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
    }
    this_Expression_4=ruleExpression
    { 
        $current = $this_Expression_4.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_5=')' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2());
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
    }
    this_UnaryOperation_6=ruleUnaryOperation
    { 
        $current = $this_UnaryOperation_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleIdentifier
entryRuleIdentifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIdentifierRule()); }
	 iv_ruleIdentifier=ruleIdentifier 
	 { $current=$iv_ruleIdentifier.current; } 
	 EOF 
;

// Rule Identifier
ruleIdentifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIdentifierRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
	}

)
)(	otherlv_1='.' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getIdentifierRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
	}

)
))*)
;





// Entry rule entryRuleNULL
entryRuleNULL returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNULLRule()); }
	 iv_ruleNULL=ruleNULL 
	 { $current=$iv_ruleNULL.current; } 
	 EOF 
;

// Rule NULL
ruleNULL returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNULLAccess().getNULLAction_0(),
            $current);
    }
)	otherlv_1='NULL' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNULLAccess().getNULLKeyword_1());
    }
)
;





// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	 iv_ruleNumber=ruleNumber 
	 { $current=$iv_ruleNumber.current; } 
	 EOF 
;

// Rule Number
ruleNumber returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumberRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;







// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall()); 
    }

    ;





// Rule LogicalOperator
ruleLogicalOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='And' 
	{
        $current = grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Or' 
	{
        $current = grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
    }
));



// Rule CompareOperator
ruleCompareOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Equals' 
	{
        $current = grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Higher' 
	{
        $current = grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Lower' 
	{
        $current = grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
    }
));



// Rule ArithmicOperator
ruleArithmicOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Add' 
	{
        $current = grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Subtract' 
	{
        $current = grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Divide' 
	{
        $current = grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Multiply' 
	{
        $current = grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 
    }
));



// Rule UnaryOperator
ruleUnaryOperator returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Not' 
	{
        $current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Minus' 
	{
        $current = grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
    }
));



// Rule SimpleType
ruleSimpleType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='boolean' 
	{
        $current = grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='int' 
	{
        $current = grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='double' 
	{
        $current = grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='String' 
	{
        $current = grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
    }
));



// Rule SolitaryType
ruleSolitaryType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Optional' 
	{
        $current = grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Mandatory' 
	{
        $current = grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


