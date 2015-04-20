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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Root'", "'}'", "'feature'", "'#'", "'select'", "'any'", "'('", "','", "')'", "'.'", "'NULL'", "'-'", "'true'", "'false'", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:77:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_RootFeature_4_0 = null;

        EObject lv_RootFeature_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )* )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )* )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )* )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )* )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:95:1: (otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:95:3: otherlv_3= 'Root' ( (lv_RootFeature_4_0= ruleFeature ) ) (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )*
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRootKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: ( (lv_RootFeature_4_0= ruleFeature ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_RootFeature_4_0= ruleFeature )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_RootFeature_4_0= ruleFeature )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:101:3: lv_RootFeature_4_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleModel177);
                    lv_RootFeature_4_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"RootFeature",
                            		lv_RootFeature_4_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:117:2: (otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:117:4: otherlv_5= 'Root' ( (lv_RootFeature_6_0= ruleFeature ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel190); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRootKeyword_3_2_0());
                    	        
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:121:1: ( (lv_RootFeature_6_0= ruleFeature ) )
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:122:1: (lv_RootFeature_6_0= ruleFeature )
                    	    {
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:122:1: (lv_RootFeature_6_0= ruleFeature )
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:123:3: lv_RootFeature_6_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleModel211);
                    	    lv_RootFeature_6_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"RootFeature",
                    	            		lv_RootFeature_6_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel227); 

                	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:151:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:152:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:153:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature263);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:160:1: ruleFeature returns [EObject current=null] : (this_SolitaryFeature_0= ruleSolitaryFeature | this_GroupedFeature_1= ruleGroupedFeature ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_SolitaryFeature_0 = null;

        EObject this_GroupedFeature_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:163:28: ( (this_SolitaryFeature_0= ruleSolitaryFeature | this_GroupedFeature_1= ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:164:1: (this_SolitaryFeature_0= ruleSolitaryFeature | this_GroupedFeature_1= ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:164:1: (this_SolitaryFeature_0= ruleSolitaryFeature | this_GroupedFeature_1= ruleGroupedFeature )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING||(LA3_0>=38 && LA3_0<=41)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:165:5: this_SolitaryFeature_0= ruleSolitaryFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleFeature320);
                    this_SolitaryFeature_0=ruleSolitaryFeature();

                    state._fsp--;

                     
                            current = this_SolitaryFeature_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:175:5: this_GroupedFeature_1= ruleGroupedFeature
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleFeature347);
                    this_GroupedFeature_1=ruleGroupedFeature();

                    state._fsp--;

                     
                            current = this_GroupedFeature_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleSolitaryFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:191:1: entryRuleSolitaryFeature returns [EObject current=null] : iv_ruleSolitaryFeature= ruleSolitaryFeature EOF ;
    public final EObject entryRuleSolitaryFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolitaryFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:192:2: (iv_ruleSolitaryFeature= ruleSolitaryFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:2: iv_ruleSolitaryFeature= ruleSolitaryFeature EOF
            {
             newCompositeNode(grammarAccess.getSolitaryFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature382);
            iv_ruleSolitaryFeature=ruleSolitaryFeature();

            state._fsp--;

             current =iv_ruleSolitaryFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolitaryFeature392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSolitaryFeature"


    // $ANTLR start "ruleSolitaryFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:200:1: ruleSolitaryFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_type_2_0= ruleSimpleType ) )? ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )? ) ;
    public final EObject ruleSolitaryFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_required_1_0 = null;

        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_features_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_groups_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:203:28: ( (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_type_2_0= ruleSimpleType ) )? ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_type_2_0= ruleSimpleType ) )? ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_type_2_0= ruleSimpleType ) )? ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:3: otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_type_2_0= ruleSimpleType ) )? ( (lv_name_3_0= ruleEString ) ) (otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )?
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSolitaryFeature429); 

                	newLeafNode(otherlv_0, grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:208:1: ( (lv_required_1_0= ruleSolitaryType ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=42 && LA4_0<=43)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:209:1: (lv_required_1_0= ruleSolitaryType )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:209:1: (lv_required_1_0= ruleSolitaryType )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:210:3: lv_required_1_0= ruleSolitaryType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature450);
                    lv_required_1_0=ruleSolitaryType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"required",
                            		lv_required_1_0, 
                            		"SolitaryType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:226:3: ( (lv_type_2_0= ruleSimpleType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=38 && LA5_0<=41)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_type_2_0= ruleSimpleType )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_type_2_0= ruleSimpleType )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:228:3: lv_type_2_0= ruleSimpleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleSolitaryFeature472);
                    lv_type_2_0=ruleSimpleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"SimpleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:3: ( (lv_name_3_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_name_3_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:245:1: (lv_name_3_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:246:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolitaryFeature494);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:262:2: (otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:262:4: otherlv_4= '{' ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}'
                    {
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSolitaryFeature507); 

                        	newLeafNode(otherlv_4, grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:266:1: ( ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:266:2: ( (lv_features_5_0= ruleSolitaryFeature ) ) ( (lv_features_6_0= ruleSolitaryFeature ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:266:2: ( (lv_features_5_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_features_5_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:267:1: (lv_features_5_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:268:3: lv_features_5_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature529);
                            lv_features_5_0=ruleSolitaryFeature();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"features",
                                    		lv_features_5_0, 
                                    		"SolitaryFeature");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:284:2: ( (lv_features_6_0= ruleSolitaryFeature ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==15) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_features_6_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:285:1: (lv_features_6_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:286:3: lv_features_6_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature550);
                            	    lv_features_6_0=ruleSolitaryFeature();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"features",
                            	            		lv_features_6_0, 
                            	            		"SolitaryFeature");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:5: ( ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==17) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:6: ( (lv_groups_7_0= ruleGroup ) ) ( (lv_groups_8_0= ruleGroup ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:6: ( (lv_groups_7_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_groups_7_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:303:1: (lv_groups_7_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:304:3: lv_groups_7_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSolitaryFeature575);
                            lv_groups_7_0=ruleGroup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"groups",
                                    		lv_groups_7_0, 
                                    		"Group");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:320:2: ( (lv_groups_8_0= ruleGroup ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==17) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:321:1: (lv_groups_8_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:321:1: (lv_groups_8_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:322:3: lv_groups_8_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSolitaryFeature596);
                            	    lv_groups_8_0=ruleGroup();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"groups",
                            	            		lv_groups_8_0, 
                            	            		"Group");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:338:5: (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==16) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:338:7: otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )*
                            {
                            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolitaryFeature612); 

                                	newLeafNode(otherlv_9, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:1: ( (lv_constraints_10_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:343:1: (lv_constraints_10_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:343:1: (lv_constraints_10_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:344:3: lv_constraints_10_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature633);
                            lv_constraints_10_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constraints",
                                    		lv_constraints_10_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:360:2: (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==16) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:360:4: otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolitaryFeature646); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_2_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:364:1: ( (lv_constraints_12_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:365:1: (lv_constraints_12_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:365:1: (lv_constraints_12_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:366:3: lv_constraints_12_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature667);
                            	    lv_constraints_12_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constraints",
                            	            		lv_constraints_12_0, 
                            	            		"Expression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSolitaryFeature683); 

                        	newLeafNode(otherlv_13, grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolitaryFeature"


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:394:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:395:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:396:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup721);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:403:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inclusive_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_groupedFeatures_3_0 = null;

        EObject lv_groupedFeatures_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:406:28: ( (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:407:1: (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:407:1: (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:407:3: otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroup768); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getSelectKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:411:1: ( (lv_inclusive_1_0= 'any' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:412:1: (lv_inclusive_1_0= 'any' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:412:1: (lv_inclusive_1_0= 'any' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:413:3: lv_inclusive_1_0= 'any'
                    {
                    lv_inclusive_1_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroup786); 

                            newLeafNode(lv_inclusive_1_0, grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                           		setWithLastConsumed(current, "inclusive", true, "any");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroup812); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:430:1: ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:431:1: (lv_groupedFeatures_3_0= ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:431:1: (lv_groupedFeatures_3_0= ruleGroupedFeature )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:432:3: lv_groupedFeatures_3_0= ruleGroupedFeature
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup833);
            lv_groupedFeatures_3_0=ruleGroupedFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		add(
                   			current, 
                   			"groupedFeatures",
                    		lv_groupedFeatures_3_0, 
                    		"GroupedFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:448:2: (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:448:4: otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) )
            	    {
            	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroup846); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:452:1: ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:453:1: (lv_groupedFeatures_5_0= ruleGroupedFeature )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:453:1: (lv_groupedFeatures_5_0= ruleGroupedFeature )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:454:3: lv_groupedFeatures_5_0= ruleGroupedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup867);
            	    lv_groupedFeatures_5_0=ruleGroupedFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groupedFeatures",
            	            		lv_groupedFeatures_5_0, 
            	            		"GroupedFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGroup881); 

                	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleGroupedFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:482:1: entryRuleGroupedFeature returns [EObject current=null] : iv_ruleGroupedFeature= ruleGroupedFeature EOF ;
    public final EObject entryRuleGroupedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:483:2: (iv_ruleGroupedFeature= ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:484:2: iv_ruleGroupedFeature= ruleGroupedFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature917);
            iv_ruleGroupedFeature=ruleGroupedFeature();

            state._fsp--;

             current =iv_ruleGroupedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupedFeature"


    // $ANTLR start "ruleGroupedFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:491:1: ruleGroupedFeature returns [EObject current=null] : ( () ( (lv_type_1_0= ruleSimpleType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}' )? ) ;
    public final EObject ruleGroupedFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_groups_4_0 = null;

        EObject lv_groups_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_constraints_9_0 = null;

        EObject lv_constraints_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:494:28: ( ( () ( (lv_type_1_0= ruleSimpleType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}' )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:1: ( () ( (lv_type_1_0= ruleSimpleType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}' )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:1: ( () ( (lv_type_1_0= ruleSimpleType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}' )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:2: () ( (lv_type_1_0= ruleSimpleType ) )? ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}' )?
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:501:2: ( (lv_type_1_0= ruleSimpleType ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=38 && LA15_0<=41)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:502:1: (lv_type_1_0= ruleSimpleType )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:502:1: (lv_type_1_0= ruleSimpleType )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:503:3: lv_type_1_0= ruleSimpleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleGroupedFeature982);
                    lv_type_1_0=ruleSimpleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"SimpleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:519:3: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:520:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:520:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:521:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupedFeature1004);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:537:2: (otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:537:4: otherlv_3= '{' ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )? otherlv_12= '}'
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroupedFeature1017); 

                        	newLeafNode(otherlv_3, grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:541:1: ( ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==17) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:541:2: ( (lv_groups_4_0= ruleGroup ) ) ( (lv_groups_5_0= ruleGroup ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:541:2: ( (lv_groups_4_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:542:1: (lv_groups_4_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:542:1: (lv_groups_4_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:543:3: lv_groups_4_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1039);
                            lv_groups_4_0=ruleGroup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"groups",
                                    		lv_groups_4_0, 
                                    		"Group");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:559:2: ( (lv_groups_5_0= ruleGroup ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==17) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:560:1: (lv_groups_5_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:560:1: (lv_groups_5_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:561:3: lv_groups_5_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1060);
                            	    lv_groups_5_0=ruleGroup();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"groups",
                            	            		lv_groups_5_0, 
                            	            		"Group");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:577:5: ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==15) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:577:6: ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:577:6: ( (lv_features_6_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:578:1: (lv_features_6_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:578:1: (lv_features_6_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:579:3: lv_features_6_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1085);
                            lv_features_6_0=ruleSolitaryFeature();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"features",
                                    		lv_features_6_0, 
                                    		"SolitaryFeature");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:595:2: ( (lv_features_7_0= ruleSolitaryFeature ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==15) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:1: (lv_features_7_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:1: (lv_features_7_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:597:3: lv_features_7_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1106);
                            	    lv_features_7_0=ruleSolitaryFeature();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"features",
                            	            		lv_features_7_0, 
                            	            		"SolitaryFeature");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:5: (otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==16) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:7: otherlv_8= '#' ( (lv_constraints_9_0= ruleExpression ) ) (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )*
                            {
                            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroupedFeature1122); 

                                	newLeafNode(otherlv_8, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_3_3_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:617:1: ( (lv_constraints_9_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:618:1: (lv_constraints_9_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:618:1: (lv_constraints_9_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:619:3: lv_constraints_9_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_3_3_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1143);
                            lv_constraints_9_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constraints",
                                    		lv_constraints_9_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:635:2: (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==16) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:635:4: otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) )
                            	    {
                            	    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroupedFeature1156); 

                            	        	newLeafNode(otherlv_10, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_3_3_2_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:639:1: ( (lv_constraints_11_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:640:1: (lv_constraints_11_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:640:1: (lv_constraints_11_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:641:3: lv_constraints_11_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_3_3_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1177);
                            	    lv_constraints_11_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constraints",
                            	            		lv_constraints_11_0, 
                            	            		"Expression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroupedFeature1193); 

                        	newLeafNode(otherlv_12, grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupedFeature"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:669:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:670:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:671:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1231);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:678:1: ruleExpression returns [EObject current=null] : (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical2Operation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:681:28: ( (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:682:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:682:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:683:5: this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1288);
            this_Logical2Operation_0=ruleLogical2Operation();

            state._fsp--;

             
                    current = this_Logical2Operation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:691:1: ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=27 && LA23_0<=28)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:691:2: () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:691:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:692:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:697:2: ( (lv_operator_2_0= ruleLogicalOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:698:1: (lv_operator_2_0= ruleLogicalOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:698:1: (lv_operator_2_0= ruleLogicalOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:699:3: lv_operator_2_0= ruleLogicalOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_ruleExpression1318);
            	    lv_operator_2_0=ruleLogicalOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"LogicalOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:715:2: ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:716:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:716:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:717:3: lv_rexp_3_0= ruleLogical2Operation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1339);
            	    lv_rexp_3_0=ruleLogical2Operation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rexp",
            	            		lv_rexp_3_0, 
            	            		"Logical2Operation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogical2Operation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:741:1: entryRuleLogical2Operation returns [EObject current=null] : iv_ruleLogical2Operation= ruleLogical2Operation EOF ;
    public final EObject entryRuleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical2Operation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:742:2: (iv_ruleLogical2Operation= ruleLogical2Operation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:743:2: iv_ruleLogical2Operation= ruleLogical2Operation EOF
            {
             newCompositeNode(grammarAccess.getLogical2OperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1377);
            iv_ruleLogical2Operation=ruleLogical2Operation();

            state._fsp--;

             current =iv_ruleLogical2Operation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogical2Operation1387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical2Operation"


    // $ANTLR start "ruleLogical2Operation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:750:1: ruleLogical2Operation returns [EObject current=null] : (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) ;
    public final EObject ruleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:753:28: ( (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:754:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:754:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:5: this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1434);
            this_BinaryOperation_0=ruleBinaryOperation();

            state._fsp--;

             
                    current = this_BinaryOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=29 && LA24_0<=31)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:764:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:769:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:770:1: (lv_operator_2_0= ruleCompareOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:770:1: (lv_operator_2_0= ruleCompareOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:771:3: lv_operator_2_0= ruleCompareOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1464);
            	    lv_operator_2_0=ruleCompareOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogical2OperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"CompareOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:787:2: ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:789:3: lv_rexp_3_0= ruleBinaryOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1485);
            	    lv_rexp_3_0=ruleBinaryOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogical2OperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rexp",
            	            		lv_rexp_3_0, 
            	            		"BinaryOperation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogical2Operation"


    // $ANTLR start "entryRuleBinaryOperation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:813:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:2: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:815:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1523);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;

             current =iv_ruleBinaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation1533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOperation"


    // $ANTLR start "ruleBinaryOperation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:822:1: ruleBinaryOperation returns [EObject current=null] : (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExp_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:825:28: ( (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:826:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:826:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:827:5: this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1580);
            this_AtomicExp_0=ruleAtomicExp();

            state._fsp--;

             
                    current = this_AtomicExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:1: ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=32 && LA25_0<=35)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:2: () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:836:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:841:2: ( (lv_operator_2_0= ruleArithmicOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:842:1: (lv_operator_2_0= ruleArithmicOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:842:1: (lv_operator_2_0= ruleArithmicOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:3: lv_operator_2_0= ruleArithmicOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1610);
            	    lv_operator_2_0=ruleArithmicOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"ArithmicOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:859:2: ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:1: (lv_rexp_3_0= ruleAtomicExp )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:860:1: (lv_rexp_3_0= ruleAtomicExp )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:861:3: lv_rexp_3_0= ruleAtomicExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1631);
            	    lv_rexp_3_0=ruleAtomicExp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rexp",
            	            		lv_rexp_3_0, 
            	            		"AtomicExp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOperation"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:885:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:886:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:887:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1669);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation1679); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:894:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:897:28: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:898:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:898:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:898:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:898:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:899:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:899:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:900:3: lv_operator_0_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1725);
            lv_operator_0_0=ruleUnaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"UnaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:916:2: ( (lv_exp_1_0= ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_exp_1_0= ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:917:1: (lv_exp_1_0= ruleAtomicExp )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:918:3: lv_exp_1_0= ruleAtomicExp
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleUnaryOperation1746);
            lv_exp_1_0=ruleAtomicExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"AtomicExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleAtomicExp"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:942:1: entryRuleAtomicExp returns [EObject current=null] : iv_ruleAtomicExp= ruleAtomicExp EOF ;
    public final EObject entryRuleAtomicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExp = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:943:2: (iv_ruleAtomicExp= ruleAtomicExp EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:944:2: iv_ruleAtomicExp= ruleAtomicExp EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp1782);
            iv_ruleAtomicExp=ruleAtomicExp();

            state._fsp--;

             current =iv_ruleAtomicExp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExp1792); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicExp"


    // $ANTLR start "ruleAtomicExp"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:951:1: ruleAtomicExp returns [EObject current=null] : (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean ) ;
    public final EObject ruleAtomicExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_NULL_0 = null;

        EObject this_Number_1 = null;

        EObject this_Identifier_2 = null;

        EObject this_Expression_4 = null;

        EObject this_UnaryOperation_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:954:28: ( (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:955:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:955:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt26=1;
                }
                break;
            case RULE_INT:
            case 24:
                {
                alt26=2;
                }
                break;
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            case 19:
                {
                alt26=4;
                }
                break;
            case 36:
            case 37:
                {
                alt26=5;
                }
                break;
            case 25:
            case 26:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:956:5: this_NULL_0= ruleNULL
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_ruleAtomicExp1839);
                    this_NULL_0=ruleNULL();

                    state._fsp--;

                     
                            current = this_NULL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:966:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleAtomicExp1866);
                    this_Number_1=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:976:5: this_Identifier_2= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleAtomicExp1893);
                    this_Identifier_2=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:985:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:985:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:985:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAtomicExp1911); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAtomicExp1933);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicExp1944); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1004:5: this_UnaryOperation_6= ruleUnaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_ruleAtomicExp1973);
                    this_UnaryOperation_6=ruleUnaryOperation();

                    state._fsp--;

                     
                            current = this_UnaryOperation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1014:5: ruleEBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getEBooleanParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleAtomicExp1994);
                    ruleEBoolean();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicExp"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1029:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1030:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1031:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier2029);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier2039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1038:1: ruleIdentifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1041:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1044:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier2084); 

            		newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1055:2: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==22) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1055:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIdentifier2097); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0());
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1059:1: ( (otherlv_2= RULE_ID ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1060:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1060:1: (otherlv_2= RULE_ID )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1061:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIdentifierRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier2117); 

            	    		newLeafNode(otherlv_2, grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleNULL"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1080:1: entryRuleNULL returns [EObject current=null] : iv_ruleNULL= ruleNULL EOF ;
    public final EObject entryRuleNULL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1081:2: (iv_ruleNULL= ruleNULL EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1082:2: iv_ruleNULL= ruleNULL EOF
            {
             newCompositeNode(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL2155);
            iv_ruleNULL=ruleNULL();

            state._fsp--;

             current =iv_ruleNULL; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL2165); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNULL"


    // $ANTLR start "ruleNULL"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1089:1: ruleNULL returns [EObject current=null] : ( () otherlv_1= 'NULL' ) ;
    public final EObject ruleNULL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1092:28: ( ( () otherlv_1= 'NULL' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1093:1: ( () otherlv_1= 'NULL' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1093:1: ( () otherlv_1= 'NULL' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1093:2: () otherlv_1= 'NULL'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1093:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1094:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNULLAccess().getNULLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNULL2211); 

                	newLeafNode(otherlv_1, grammarAccess.getNULLAccess().getNULLKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNULL"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1111:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1112:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1113:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber2247);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber2257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1120:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1123:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1124:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1124:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1125:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1125:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1126:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber2302);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumberRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1150:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1151:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1152:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2338);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1159:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1162:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1163:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1163:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1163:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1163:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1164:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt2388); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2405); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1184:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1185:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1186:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2451);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2462); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1193:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1196:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1197:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1197:1: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            else if ( (LA29_0==26) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1198:2: kw= 'true'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEBoolean2500); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1205:2: kw= 'false'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEBoolean2519); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1218:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1219:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2560);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2571); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1227:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1230:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1231:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1231:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1231:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2611); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1239:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2637); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1254:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1256:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1257:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1257:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            else if ( (LA31_0==28) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1257:2: (enumLiteral_0= 'And' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1257:2: (enumLiteral_0= 'And' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1257:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLogicalOperator2696); 

                            current = grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1263:6: (enumLiteral_1= 'Or' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1263:6: (enumLiteral_1= 'Or' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1263:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLogicalOperator2713); 

                            current = grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1273:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1275:28: ( ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1276:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1276:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt32=1;
                }
                break;
            case 30:
                {
                alt32=2;
                }
                break;
            case 31:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1276:2: (enumLiteral_0= 'Equals' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1276:2: (enumLiteral_0= 'Equals' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1276:4: enumLiteral_0= 'Equals'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCompareOperator2758); 

                            current = grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1282:6: (enumLiteral_1= 'Higher' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1282:6: (enumLiteral_1= 'Higher' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1282:8: enumLiteral_1= 'Higher'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCompareOperator2775); 

                            current = grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:6: (enumLiteral_2= 'Lower' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:6: (enumLiteral_2= 'Lower' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:8: enumLiteral_2= 'Lower'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator2792); 

                            current = grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "ruleArithmicOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1298:1: ruleArithmicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) ;
    public final Enumerator ruleArithmicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1300:28: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1301:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1301:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt33=1;
                }
                break;
            case 33:
                {
                alt33=2;
                }
                break;
            case 34:
                {
                alt33=3;
                }
                break;
            case 35:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1301:2: (enumLiteral_0= 'Add' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1301:2: (enumLiteral_0= 'Add' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1301:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleArithmicOperator2837); 

                            current = grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1307:6: (enumLiteral_1= 'Subtract' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1307:6: (enumLiteral_1= 'Subtract' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1307:8: enumLiteral_1= 'Subtract'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArithmicOperator2854); 

                            current = grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1313:6: (enumLiteral_2= 'Divide' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1313:6: (enumLiteral_2= 'Divide' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1313:8: enumLiteral_2= 'Divide'
                    {
                    enumLiteral_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArithmicOperator2871); 

                            current = grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:6: (enumLiteral_3= 'Multiply' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:6: (enumLiteral_3= 'Multiply' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:8: enumLiteral_3= 'Multiply'
                    {
                    enumLiteral_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleArithmicOperator2888); 

                            current = grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmicOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1329:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1331:28: ( ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1332:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1332:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            else if ( (LA34_0==37) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1332:2: (enumLiteral_0= 'Not' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1332:2: (enumLiteral_0= 'Not' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1332:4: enumLiteral_0= 'Not'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleUnaryOperator2933); 

                            current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1338:6: (enumLiteral_1= 'Minus' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1338:6: (enumLiteral_1= 'Minus' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1338:8: enumLiteral_1= 'Minus'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUnaryOperator2950); 

                            current = grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleSimpleType"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1348:1: ruleSimpleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleSimpleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1350:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1351:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1351:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt35=1;
                }
                break;
            case 39:
                {
                alt35=2;
                }
                break;
            case 40:
                {
                alt35=3;
                }
                break;
            case 41:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1351:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1351:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1351:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSimpleType2995); 

                            current = grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1357:6: (enumLiteral_1= 'int' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1357:6: (enumLiteral_1= 'int' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1357:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSimpleType3012); 

                            current = grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1363:6: (enumLiteral_2= 'double' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1363:6: (enumLiteral_2= 'double' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1363:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSimpleType3029); 

                            current = grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1369:6: (enumLiteral_3= 'String' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1369:6: (enumLiteral_3= 'String' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1369:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSimpleType3046); 

                            current = grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "ruleSolitaryType"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1379:1: ruleSolitaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) ;
    public final Enumerator ruleSolitaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1381:28: ( ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1382:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1382:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            else if ( (LA36_0==43) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1382:2: (enumLiteral_0= 'Optional' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1382:2: (enumLiteral_0= 'Optional' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1382:4: enumLiteral_0= 'Optional'
                    {
                    enumLiteral_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSolitaryType3091); 

                            current = grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1388:6: (enumLiteral_1= 'Mandatory' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1388:6: (enumLiteral_1= 'Mandatory' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1388:8: enumLiteral_1= 'Mandatory'
                    {
                    enumLiteral_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSolitaryType3108); 

                            current = grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSolitaryType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel211 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleModel227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleFeature320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleFeature347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleSolitaryFeature429 = new BitSet(new long[]{0x00000FC000008050L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature450 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleSolitaryFeature472 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolitaryFeature494 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleSolitaryFeature507 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature529 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature550 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature575 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature596 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature612 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature633 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature646 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature667 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleSolitaryFeature683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleGroup768 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleGroup786 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleGroup812 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup833 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleGroup846 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup867 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleGroup881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleGroupedFeature982 = new BitSet(new long[]{0x000003C000008050L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupedFeature1004 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGroupedFeature1017 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1039 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1060 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1085 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1106 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_16_in_ruleGroupedFeature1122 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1143 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_16_in_ruleGroupedFeature1156 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1177 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleGroupedFeature1193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1288 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleExpression1318 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1339 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogical2Operation1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1434 = new BitSet(new long[]{0x00000000E0000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1464 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1485 = new BitSet(new long[]{0x00000000E0000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1523 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1580 = new BitSet(new long[]{0x0000000F00000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1610 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1631 = new BitSet(new long[]{0x0000000F00000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1725 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleUnaryOperation1746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp1782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExp1792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_ruleAtomicExp1839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleAtomicExp1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleAtomicExp1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAtomicExp1911 = new BitSet(new long[]{0x0000003007880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomicExp1933 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAtomicExp1944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleAtomicExp1973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleAtomicExp1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier2084 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleIdentifier2097 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier2117 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL2155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNULL2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber2302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt2388 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2451 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEBoolean2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEBoolean2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleLogicalOperator2696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleLogicalOperator2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCompareOperator2758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompareOperator2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleArithmicOperator2837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArithmicOperator2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleArithmicOperator2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleArithmicOperator2888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleUnaryOperator2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleUnaryOperator2950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSimpleType2995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSimpleType3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSimpleType3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSimpleType3046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSolitaryType3091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSolitaryType3108 = new BitSet(new long[]{0x0000000000000002L});
    }


}