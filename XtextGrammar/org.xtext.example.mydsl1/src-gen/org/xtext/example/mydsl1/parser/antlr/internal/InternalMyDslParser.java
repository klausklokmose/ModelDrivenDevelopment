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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Root'", "'}'", "'feature'", "'type'", "'#'", "'='", "'select'", "'any'", "'('", "','", "')'", "'.'", "'NULL'", "'-'", "'true'", "'false'", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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
    public static final int T__44=44;
    public static final int T__45=45;
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
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:200:1: ruleSolitaryFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' ) | (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) ) )? ) ;
    public final EObject ruleSolitaryFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_required_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_groups_8_0 = null;

        EObject lv_groups_9_0 = null;

        EObject lv_constraints_11_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_constraints_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:203:28: ( (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' ) | (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) ) )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' ) | (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) ) )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' ) | (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) ) )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:3: otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' ) | (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) ) )?
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSolitaryFeature429); 

                	newLeafNode(otherlv_0, grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:208:1: ( (lv_required_1_0= ruleSolitaryType ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=44 && LA4_0<=45)) ) {
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:226:3: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:227:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:228:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolitaryFeature472);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:2: ( (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' ) | (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:3: (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:3: (otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:5: otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )? otherlv_14= '}'
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSolitaryFeature486); 

                        	newLeafNode(otherlv_3, grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_3_0_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:248:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==16) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:248:3: otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) )
                            {
                            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolitaryFeature499); 

                                	newLeafNode(otherlv_4, grammarAccess.getSolitaryFeatureAccess().getTypeKeyword_3_0_1_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:252:1: ( (lv_type_5_0= ruleSimpleType ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:253:1: (lv_type_5_0= ruleSimpleType )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:253:1: (lv_type_5_0= ruleSimpleType )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:254:3: lv_type_5_0= ruleSimpleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_3_0_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleSolitaryFeature520);
                            lv_type_5_0=ruleSimpleType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_5_0, 
                                    		"SimpleType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:270:4: ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==15) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:270:5: ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:270:5: ( (lv_features_6_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:271:1: (lv_features_6_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:271:1: (lv_features_6_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:272:3: lv_features_6_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature544);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:288:2: ( (lv_features_7_0= ruleSolitaryFeature ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==15) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:289:1: (lv_features_7_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:289:1: (lv_features_7_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:290:3: lv_features_7_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature565);
                            	    lv_features_7_0=ruleSolitaryFeature();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
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
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:306:5: ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:306:6: ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:306:6: ( (lv_groups_8_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_groups_8_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:307:1: (lv_groups_8_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:308:3: lv_groups_8_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSolitaryFeature590);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:324:2: ( (lv_groups_9_0= ruleGroup ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==19) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:325:1: (lv_groups_9_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:325:1: (lv_groups_9_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:326:3: lv_groups_9_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSolitaryFeature611);
                            	    lv_groups_9_0=ruleGroup();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"groups",
                            	            		lv_groups_9_0, 
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:5: (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==17) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:7: otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )*
                            {
                            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSolitaryFeature627); 

                                	newLeafNode(otherlv_10, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:346:1: ( (lv_constraints_11_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_constraints_11_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_constraints_11_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:348:3: lv_constraints_11_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature648);
                            lv_constraints_11_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constraints",
                                    		lv_constraints_11_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:364:2: (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==17) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:364:4: otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) )
                            	    {
                            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSolitaryFeature661); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_2_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:368:1: ( (lv_constraints_13_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:369:1: (lv_constraints_13_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:369:1: (lv_constraints_13_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:370:3: lv_constraints_13_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature682);
                            	    lv_constraints_13_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constraints",
                            	            		lv_constraints_13_0, 
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

                    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSolitaryFeature698); 

                        	newLeafNode(otherlv_14, grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_3_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:391:6: (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:391:6: (otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:391:8: otherlv_15= '=' ( (lv_constraints_16_0= ruleExpression ) )
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature718); 

                        	newLeafNode(otherlv_15, grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:395:1: ( (lv_constraints_16_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:396:1: (lv_constraints_16_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:396:1: (lv_constraints_16_0= ruleExpression )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:397:3: lv_constraints_16_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature739);
                    lv_constraints_16_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_16_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:421:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:422:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:423:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup778);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup788); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:430:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' ) ;
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
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:433:28: ( (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:434:1: (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:434:1: (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:434:3: otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? otherlv_2= '(' ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) ) (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroup825); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getSelectKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_inclusive_1_0= 'any' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_inclusive_1_0= 'any' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_inclusive_1_0= 'any' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:440:3: lv_inclusive_1_0= 'any'
                    {
                    lv_inclusive_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroup843); 

                            newLeafNode(lv_inclusive_1_0, grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                           		setWithLastConsumed(current, "inclusive", true, "any");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGroup869); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:457:1: ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_groupedFeatures_3_0= ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:458:1: (lv_groupedFeatures_3_0= ruleGroupedFeature )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:459:3: lv_groupedFeatures_3_0= ruleGroupedFeature
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup890);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:475:2: (otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:475:4: otherlv_4= ',' ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroup903); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:479:1: ( (lv_groupedFeatures_5_0= ruleGroupedFeature ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:480:1: (lv_groupedFeatures_5_0= ruleGroupedFeature )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:480:1: (lv_groupedFeatures_5_0= ruleGroupedFeature )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:481:3: lv_groupedFeatures_5_0= ruleGroupedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup924);
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

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup938); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:509:1: entryRuleGroupedFeature returns [EObject current=null] : iv_ruleGroupedFeature= ruleGroupedFeature EOF ;
    public final EObject entryRuleGroupedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:510:2: (iv_ruleGroupedFeature= ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:511:2: iv_ruleGroupedFeature= ruleGroupedFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature974);
            iv_ruleGroupedFeature=ruleGroupedFeature();

            state._fsp--;

             current =iv_ruleGroupedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature984); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:518:1: ruleGroupedFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' ) | (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) ) )? ) ;
    public final EObject ruleGroupedFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_groups_5_0 = null;

        EObject lv_groups_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_12_0 = null;

        EObject lv_constraints_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:521:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' ) | (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) ) )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:522:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' ) | (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) ) )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:522:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' ) | (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) ) )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:522:2: () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' ) | (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) ) )?
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:522:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:523:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:528:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:529:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:529:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:530:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupedFeature1039);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:2: ( (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' ) | (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            else if ( (LA22_0==18) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:3: (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:3: (otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:5: otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )? otherlv_13= '}'
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroupedFeature1053); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:550:1: (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==16) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:550:3: otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) )
                            {
                            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroupedFeature1066); 

                                	newLeafNode(otherlv_3, grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:554:1: ( (lv_type_4_0= ruleSimpleType ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:555:1: (lv_type_4_0= ruleSimpleType )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:555:1: (lv_type_4_0= ruleSimpleType )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:556:3: lv_type_4_0= ruleSimpleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleGroupedFeature1087);
                            lv_type_4_0=ruleSimpleType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_4_0, 
                                    		"SimpleType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:572:4: ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==19) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:572:5: ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:572:5: ( (lv_groups_5_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:573:1: (lv_groups_5_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:573:1: (lv_groups_5_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:574:3: lv_groups_5_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1111);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:590:2: ( (lv_groups_6_0= ruleGroup ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==19) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:591:1: (lv_groups_6_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:591:1: (lv_groups_6_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:592:3: lv_groups_6_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1132);
                            	    lv_groups_6_0=ruleGroup();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"groups",
                            	            		lv_groups_6_0, 
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:608:5: ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==15) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:608:6: ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:608:6: ( (lv_features_7_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:609:1: (lv_features_7_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:609:1: (lv_features_7_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:610:3: lv_features_7_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1157);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:626:2: ( (lv_features_8_0= ruleSolitaryFeature ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==15) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:627:1: (lv_features_8_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:627:1: (lv_features_8_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:628:3: lv_features_8_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1178);
                            	    lv_features_8_0=ruleSolitaryFeature();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"features",
                            	            		lv_features_8_0, 
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:644:5: (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==17) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:644:7: otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )*
                            {
                            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroupedFeature1194); 

                                	newLeafNode(otherlv_9, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:1: ( (lv_constraints_10_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:649:1: (lv_constraints_10_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:649:1: (lv_constraints_10_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:650:3: lv_constraints_10_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1215);
                            lv_constraints_10_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constraints",
                                    		lv_constraints_10_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:666:2: (otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==17) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:666:4: otherlv_11= '#' ( (lv_constraints_12_0= ruleExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroupedFeature1228); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_2_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:670:1: ( (lv_constraints_12_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:671:1: (lv_constraints_12_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:671:1: (lv_constraints_12_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:672:3: lv_constraints_12_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1249);
                            	    lv_constraints_12_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
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
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroupedFeature1265); 

                        	newLeafNode(otherlv_13, grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:693:6: (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:693:6: (otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:693:8: otherlv_14= '=' ( (lv_constraints_15_0= ruleExpression ) )
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedFeature1285); 

                        	newLeafNode(otherlv_14, grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:697:1: ( (lv_constraints_15_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:698:1: (lv_constraints_15_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:698:1: (lv_constraints_15_0= ruleExpression )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:699:3: lv_constraints_15_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1306);
                    lv_constraints_15_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_15_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:724:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:725:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1345);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1355); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:732:1: ruleExpression returns [EObject current=null] : (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical2Operation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:735:28: ( (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:736:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:736:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:737:5: this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1402);
            this_Logical2Operation_0=ruleLogical2Operation();

            state._fsp--;

             
                    current = this_Logical2Operation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:745:1: ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=29 && LA23_0<=30)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:745:2: () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:745:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:746:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:751:2: ( (lv_operator_2_0= ruleLogicalOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:752:1: (lv_operator_2_0= ruleLogicalOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:752:1: (lv_operator_2_0= ruleLogicalOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:753:3: lv_operator_2_0= ruleLogicalOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_ruleExpression1432);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:769:2: ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:770:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:770:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:771:3: lv_rexp_3_0= ruleLogical2Operation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1453);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:795:1: entryRuleLogical2Operation returns [EObject current=null] : iv_ruleLogical2Operation= ruleLogical2Operation EOF ;
    public final EObject entryRuleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical2Operation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:796:2: (iv_ruleLogical2Operation= ruleLogical2Operation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:797:2: iv_ruleLogical2Operation= ruleLogical2Operation EOF
            {
             newCompositeNode(grammarAccess.getLogical2OperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1491);
            iv_ruleLogical2Operation=ruleLogical2Operation();

            state._fsp--;

             current =iv_ruleLogical2Operation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogical2Operation1501); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:804:1: ruleLogical2Operation returns [EObject current=null] : (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) ;
    public final EObject ruleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:807:28: ( (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:808:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:808:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:809:5: this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1548);
            this_BinaryOperation_0=ruleBinaryOperation();

            state._fsp--;

             
                    current = this_BinaryOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:817:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=31 && LA24_0<=33)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:817:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:817:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:818:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:824:1: (lv_operator_2_0= ruleCompareOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:824:1: (lv_operator_2_0= ruleCompareOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:825:3: lv_operator_2_0= ruleCompareOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1578);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:841:2: ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:842:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:842:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:3: lv_rexp_3_0= ruleBinaryOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1599);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:867:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:868:2: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:869:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1637);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;

             current =iv_ruleBinaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation1647); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:876:1: ruleBinaryOperation returns [EObject current=null] : (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExp_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:879:28: ( (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:880:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:880:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:881:5: this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1694);
            this_AtomicExp_0=ruleAtomicExp();

            state._fsp--;

             
                    current = this_AtomicExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:889:1: ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=34 && LA25_0<=37)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:889:2: () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:889:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:890:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:895:2: ( (lv_operator_2_0= ruleArithmicOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:896:1: (lv_operator_2_0= ruleArithmicOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:896:1: (lv_operator_2_0= ruleArithmicOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:897:3: lv_operator_2_0= ruleArithmicOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1724);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:913:2: ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:914:1: (lv_rexp_3_0= ruleAtomicExp )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:914:1: (lv_rexp_3_0= ruleAtomicExp )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:915:3: lv_rexp_3_0= ruleAtomicExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1745);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:939:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:940:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:941:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1783);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation1793); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:948:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:951:28: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:952:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:952:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:952:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:952:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:953:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:953:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:954:3: lv_operator_0_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1839);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:970:2: ( (lv_exp_1_0= ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:971:1: (lv_exp_1_0= ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:971:1: (lv_exp_1_0= ruleAtomicExp )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:972:3: lv_exp_1_0= ruleAtomicExp
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleUnaryOperation1860);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:996:1: entryRuleAtomicExp returns [EObject current=null] : iv_ruleAtomicExp= ruleAtomicExp EOF ;
    public final EObject entryRuleAtomicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExp = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:997:2: (iv_ruleAtomicExp= ruleAtomicExp EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:998:2: iv_ruleAtomicExp= ruleAtomicExp EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp1896);
            iv_ruleAtomicExp=ruleAtomicExp();

            state._fsp--;

             current =iv_ruleAtomicExp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExp1906); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1005:1: ruleAtomicExp returns [EObject current=null] : (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean ) ;
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
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:28: ( (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1009:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1009:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation | ruleEBoolean )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt26=1;
                }
                break;
            case RULE_INT:
            case 26:
                {
                alt26=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt26=3;
                }
                break;
            case 21:
                {
                alt26=4;
                }
                break;
            case 38:
            case 39:
                {
                alt26=5;
                }
                break;
            case 27:
            case 28:
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
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1010:5: this_NULL_0= ruleNULL
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_ruleAtomicExp1953);
                    this_NULL_0=ruleNULL();

                    state._fsp--;

                     
                            current = this_NULL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1020:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleAtomicExp1980);
                    this_Number_1=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1030:5: this_Identifier_2= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleAtomicExp2007);
                    this_Identifier_2=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1039:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1039:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1039:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicExp2025); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAtomicExp2047);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAtomicExp2058); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1058:5: this_UnaryOperation_6= ruleUnaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_ruleAtomicExp2087);
                    this_UnaryOperation_6=ruleUnaryOperation();

                    state._fsp--;

                     
                            current = this_UnaryOperation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1068:5: ruleEBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getEBooleanParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleAtomicExp2108);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1083:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1084:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier2143);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier2153); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1092:1: ruleIdentifier returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '.' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1095:28: ( ( ( ( ruleEString ) ) (otherlv_1= '.' ( ( ruleEString ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1096:1: ( ( ( ruleEString ) ) (otherlv_1= '.' ( ( ruleEString ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1096:1: ( ( ( ruleEString ) ) (otherlv_1= '.' ( ( ruleEString ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1096:2: ( ( ruleEString ) ) (otherlv_1= '.' ( ( ruleEString ) ) )*
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1096:2: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1097:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1097:1: ( ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1098:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIdentifier2201);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1111:2: (otherlv_1= '.' ( ( ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==24) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1111:4: otherlv_1= '.' ( ( ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleIdentifier2214); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0());
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1115:1: ( ( ruleEString ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1116:1: ( ruleEString )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1116:1: ( ruleEString )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1117:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIdentifierRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIdentifier2237);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1138:1: entryRuleNULL returns [EObject current=null] : iv_ruleNULL= ruleNULL EOF ;
    public final EObject entryRuleNULL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1139:2: (iv_ruleNULL= ruleNULL EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1140:2: iv_ruleNULL= ruleNULL EOF
            {
             newCompositeNode(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL2275);
            iv_ruleNULL=ruleNULL();

            state._fsp--;

             current =iv_ruleNULL; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL2285); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1147:1: ruleNULL returns [EObject current=null] : ( () otherlv_1= 'NULL' ) ;
    public final EObject ruleNULL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1150:28: ( ( () otherlv_1= 'NULL' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1151:1: ( () otherlv_1= 'NULL' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1151:1: ( () otherlv_1= 'NULL' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1151:2: () otherlv_1= 'NULL'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1151:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1152:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNULLAccess().getNULLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNULL2331); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1169:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1170:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1171:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber2367);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber2377); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1178:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1181:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1183:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1183:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1184:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber2422);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1209:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1210:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2458);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2469); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1217:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1221:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1221:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1221:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1221:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1222:2: kw= '-'
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEInt2508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2525); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1242:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1243:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1244:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean2571);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean2582); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1251:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1254:28: ( (kw= 'true' | kw= 'false' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1255:1: (kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1255:1: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            else if ( (LA29_0==28) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1256:2: kw= 'true'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEBoolean2620); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1263:2: kw= 'false'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEBoolean2639); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1276:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1277:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1278:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2680);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2691); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1285:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1289:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1289:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1289:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2731); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1297:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2757); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1312:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1314:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1315:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1315:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            else if ( (LA31_0==30) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1315:2: (enumLiteral_0= 'And' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1315:2: (enumLiteral_0= 'And' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1315:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLogicalOperator2816); 

                            current = grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1321:6: (enumLiteral_1= 'Or' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1321:6: (enumLiteral_1= 'Or' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1321:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLogicalOperator2833); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1331:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1333:28: ( ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt32=1;
                }
                break;
            case 32:
                {
                alt32=2;
                }
                break;
            case 33:
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
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:2: (enumLiteral_0= 'Equals' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:2: (enumLiteral_0= 'Equals' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:4: enumLiteral_0= 'Equals'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator2878); 

                            current = grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1340:6: (enumLiteral_1= 'Higher' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1340:6: (enumLiteral_1= 'Higher' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1340:8: enumLiteral_1= 'Higher'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompareOperator2895); 

                            current = grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1346:6: (enumLiteral_2= 'Lower' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1346:6: (enumLiteral_2= 'Lower' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1346:8: enumLiteral_2= 'Lower'
                    {
                    enumLiteral_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleCompareOperator2912); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1356:1: ruleArithmicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) ;
    public final Enumerator ruleArithmicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1358:28: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1359:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1359:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt33=1;
                }
                break;
            case 35:
                {
                alt33=2;
                }
                break;
            case 36:
                {
                alt33=3;
                }
                break;
            case 37:
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
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1359:2: (enumLiteral_0= 'Add' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1359:2: (enumLiteral_0= 'Add' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1359:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArithmicOperator2957); 

                            current = grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1365:6: (enumLiteral_1= 'Subtract' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1365:6: (enumLiteral_1= 'Subtract' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1365:8: enumLiteral_1= 'Subtract'
                    {
                    enumLiteral_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleArithmicOperator2974); 

                            current = grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1371:6: (enumLiteral_2= 'Divide' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1371:6: (enumLiteral_2= 'Divide' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1371:8: enumLiteral_2= 'Divide'
                    {
                    enumLiteral_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleArithmicOperator2991); 

                            current = grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1377:6: (enumLiteral_3= 'Multiply' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1377:6: (enumLiteral_3= 'Multiply' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1377:8: enumLiteral_3= 'Multiply'
                    {
                    enumLiteral_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleArithmicOperator3008); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1387:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1389:28: ( ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:2: (enumLiteral_0= 'Not' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:2: (enumLiteral_0= 'Not' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:4: enumLiteral_0= 'Not'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUnaryOperator3053); 

                            current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1396:6: (enumLiteral_1= 'Minus' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1396:6: (enumLiteral_1= 'Minus' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1396:8: enumLiteral_1= 'Minus'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleUnaryOperator3070); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1406:1: ruleSimpleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleSimpleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1408:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1409:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1409:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt35=1;
                }
                break;
            case 41:
                {
                alt35=2;
                }
                break;
            case 42:
                {
                alt35=3;
                }
                break;
            case 43:
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
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1409:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1409:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1409:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSimpleType3115); 

                            current = grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1415:6: (enumLiteral_1= 'int' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1415:6: (enumLiteral_1= 'int' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1415:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSimpleType3132); 

                            current = grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1421:6: (enumLiteral_2= 'double' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1421:6: (enumLiteral_2= 'double' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1421:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSimpleType3149); 

                            current = grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1427:6: (enumLiteral_3= 'String' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1427:6: (enumLiteral_3= 'String' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1427:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSimpleType3166); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1437:1: ruleSolitaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) ;
    public final Enumerator ruleSolitaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1439:28: ( ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1440:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1440:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            else if ( (LA36_0==45) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1440:2: (enumLiteral_0= 'Optional' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1440:2: (enumLiteral_0= 'Optional' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1440:4: enumLiteral_0= 'Optional'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSolitaryType3211); 

                            current = grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1446:6: (enumLiteral_1= 'Mandatory' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1446:6: (enumLiteral_1= 'Mandatory' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1446:8: enumLiteral_1= 'Mandatory'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleSolitaryType3228); 

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
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel211 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleModel227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleFeature320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleFeature347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleSolitaryFeature429 = new BitSet(new long[]{0x0000300000008060L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature450 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolitaryFeature472 = new BitSet(new long[]{0x0000000000041002L});
        public static final BitSet FOLLOW_12_in_ruleSolitaryFeature486 = new BitSet(new long[]{0x00000000000BC000L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature499 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleSolitaryFeature520 = new BitSet(new long[]{0x00000000000AC000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature544 = new BitSet(new long[]{0x00000000000AC000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature565 = new BitSet(new long[]{0x00000000000AC000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature590 = new BitSet(new long[]{0x00000000000A4000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature611 = new BitSet(new long[]{0x00000000000A4000L});
        public static final BitSet FOLLOW_17_in_ruleSolitaryFeature627 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature648 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleSolitaryFeature661 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature682 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleSolitaryFeature698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature718 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleGroup825 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleGroup843 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleGroup869 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup890 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleGroup903 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup924 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleGroup938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupedFeature1039 = new BitSet(new long[]{0x0000000000041002L});
        public static final BitSet FOLLOW_12_in_ruleGroupedFeature1053 = new BitSet(new long[]{0x00000000000BC000L});
        public static final BitSet FOLLOW_16_in_ruleGroupedFeature1066 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleGroupedFeature1087 = new BitSet(new long[]{0x00000000000AC000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1111 = new BitSet(new long[]{0x00000000000AC000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1132 = new BitSet(new long[]{0x00000000000AC000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1157 = new BitSet(new long[]{0x000000000002C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1178 = new BitSet(new long[]{0x000000000002C000L});
        public static final BitSet FOLLOW_17_in_ruleGroupedFeature1194 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1215 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleGroupedFeature1228 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1249 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleGroupedFeature1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleGroupedFeature1285 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1402 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleExpression1432 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1453 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogical2Operation1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1548 = new BitSet(new long[]{0x0000000380000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1578 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1599 = new BitSet(new long[]{0x0000000380000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1637 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1694 = new BitSet(new long[]{0x0000003C00000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1724 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1745 = new BitSet(new long[]{0x0000003C00000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1839 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleUnaryOperation1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp1896 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExp1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_ruleAtomicExp1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleAtomicExp1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleAtomicExp2007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleAtomicExp2025 = new BitSet(new long[]{0x000000C01E208070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomicExp2047 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAtomicExp2058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleAtomicExp2087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleAtomicExp2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIdentifier2201 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleIdentifier2214 = new BitSet(new long[]{0x0000000000008060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIdentifier2237 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL2275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL2285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNULL2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2458 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleEInt2508 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean2571 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean2582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEBoolean2620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEBoolean2639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLogicalOperator2816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleLogicalOperator2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCompareOperator2895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleCompareOperator2912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleArithmicOperator2957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleArithmicOperator2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleArithmicOperator2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleArithmicOperator3008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleUnaryOperator3053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleUnaryOperator3070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSimpleType3115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSimpleType3132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSimpleType3149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSimpleType3166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleSolitaryType3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleSolitaryType3228 = new BitSet(new long[]{0x0000000000000002L});
    }


}