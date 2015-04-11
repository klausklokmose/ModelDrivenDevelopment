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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Root'", "'}'", "'feature'", "'=>'", "'type'", "'#'", "';'", "'='", "'select'", "'any'", "','", "'('", "')'", "'NULL'", "'-'", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:200:1: ruleSolitaryFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' ) | (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) ) )? ) ;
    public final EObject ruleSolitaryFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_required_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_features_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_groups_8_0 = null;

        EObject lv_groups_9_0 = null;

        EObject lv_constraints_11_0 = null;

        EObject lv_constraints_14_0 = null;

        EObject lv_constraints_18_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:203:28: ( (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' ) | (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) ) )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' ) | (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) ) )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' ) | (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) ) )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:3: otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' ) | (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) ) )?
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSolitaryFeature429); 

                	newLeafNode(otherlv_0, grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:208:1: ( (lv_required_1_0= ruleSolitaryType ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=43 && LA4_0<=44)) ) {
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:2: ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' ) | (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:3: (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:3: (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:5: otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_features_6_0= ruleSolitaryFeature ) ) ( (lv_features_7_0= ruleSolitaryFeature ) )* )? ( ( (lv_groups_8_0= ruleGroup ) ) ( (lv_groups_9_0= ruleGroup ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )? otherlv_16= ';'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolitaryFeature486); 

                        	newLeafNode(otherlv_3, grammarAccess.getSolitaryFeatureAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:248:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:248:3: otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) )
                            {
                            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSolitaryFeature499); 

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

                    if ( (LA9_0==21) ) {
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

                                if ( (LA8_0==21) ) {
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:5: (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==18) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:7: otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) otherlv_12= '#' (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )*
                            {
                            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature627); 

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

                            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature660); 

                                	newLeafNode(otherlv_12, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_2());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:368:1: (otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#' )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==18) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:368:3: otherlv_13= '#' ( (lv_constraints_14_0= ruleExpression ) ) otherlv_15= '#'
                            	    {
                            	    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature673); 

                            	        	newLeafNode(otherlv_13, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:372:1: ( (lv_constraints_14_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_constraints_14_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:373:1: (lv_constraints_14_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:374:3: lv_constraints_14_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature694);
                            	    lv_constraints_14_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constraints",
                            	            		lv_constraints_14_0, 
                            	            		"Expression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature706); 

                            	        	newLeafNode(otherlv_15, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3_2());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolitaryFeature722); 

                        	newLeafNode(otherlv_16, grammarAccess.getSolitaryFeatureAccess().getSemicolonKeyword_3_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:399:6: (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:399:6: (otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:399:8: otherlv_17= '=' ( (lv_constraints_18_0= ruleExpression ) )
                    {
                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolitaryFeature742); 

                        	newLeafNode(otherlv_17, grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:403:1: ( (lv_constraints_18_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:404:1: (lv_constraints_18_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:404:1: (lv_constraints_18_0= ruleExpression )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:405:3: lv_constraints_18_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature763);
                    lv_constraints_18_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_18_0, 
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:429:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:430:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:431:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString803);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString814); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:438:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:441:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:442:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:442:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:442:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString854); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:450:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString880); 

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


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:465:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:466:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:467:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup925);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup935); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:474:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) (otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inclusive_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_groupedFeatures_2_0 = null;

        EObject lv_groupedFeatures_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:477:28: ( (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) (otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:478:1: (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) (otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:478:1: (otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) (otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) ) )* otherlv_5= ';' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:478:3: otherlv_0= 'select' ( (lv_inclusive_1_0= 'any' ) )? ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) (otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGroup972); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getSelectKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:482:1: ( (lv_inclusive_1_0= 'any' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:483:1: (lv_inclusive_1_0= 'any' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:483:1: (lv_inclusive_1_0= 'any' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:484:3: lv_inclusive_1_0= 'any'
                    {
                    lv_inclusive_1_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroup990); 

                            newLeafNode(lv_inclusive_1_0, grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                           		setWithLastConsumed(current, "inclusive", true, "any");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:497:3: ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:498:1: (lv_groupedFeatures_2_0= ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:498:1: (lv_groupedFeatures_2_0= ruleGroupedFeature )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:499:3: lv_groupedFeatures_2_0= ruleGroupedFeature
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup1025);
            lv_groupedFeatures_2_0=ruleGroupedFeature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		add(
                   			current, 
                   			"groupedFeatures",
                    		lv_groupedFeatures_2_0, 
                    		"GroupedFeature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:515:2: (otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:515:4: otherlv_3= ',' ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroup1038); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:519:1: ( (lv_groupedFeatures_4_0= ruleGroupedFeature ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:520:1: (lv_groupedFeatures_4_0= ruleGroupedFeature )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:520:1: (lv_groupedFeatures_4_0= ruleGroupedFeature )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:521:3: lv_groupedFeatures_4_0= ruleGroupedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup1059);
            	    lv_groupedFeatures_4_0=ruleGroupedFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groupedFeatures",
            	            		lv_groupedFeatures_4_0, 
            	            		"GroupedFeature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroup1073); 

                	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getSemicolonKeyword_4());
                

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:549:1: entryRuleGroupedFeature returns [EObject current=null] : iv_ruleGroupedFeature= ruleGroupedFeature EOF ;
    public final EObject entryRuleGroupedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:550:2: (iv_ruleGroupedFeature= ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:551:2: iv_ruleGroupedFeature= ruleGroupedFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature1109);
            iv_ruleGroupedFeature=ruleGroupedFeature();

            state._fsp--;

             current =iv_ruleGroupedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature1119); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:558:1: ruleGroupedFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )? ) ;
    public final EObject ruleGroupedFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_groups_5_0 = null;

        EObject lv_groups_6_0 = null;

        EObject lv_features_7_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_constraints_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:561:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )? ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:562:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )? )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:562:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )? )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:562:2: () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )?
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:562:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:563:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:568:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:569:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:569:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:570:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupedFeature1174);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:586:2: ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            else if ( (LA23_0==20) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:586:3: (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:586:3: (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:586:5: otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )? ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )? (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )? otherlv_15= ';'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroupedFeature1188); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroupedFeatureAccess().getEqualsSignGreaterThanSignKeyword_2_0_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:590:1: (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==17) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:590:3: otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) )
                            {
                            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroupedFeature1201); 

                                	newLeafNode(otherlv_3, grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:594:1: ( (lv_type_4_0= ruleSimpleType ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:595:1: (lv_type_4_0= ruleSimpleType )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:595:1: (lv_type_4_0= ruleSimpleType )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:3: lv_type_4_0= ruleSimpleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleGroupedFeature1222);
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:4: ( ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==21) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:5: ( (lv_groups_5_0= ruleGroup ) ) ( (lv_groups_6_0= ruleGroup ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:5: ( (lv_groups_5_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:1: (lv_groups_5_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:1: (lv_groups_5_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:614:3: lv_groups_5_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1246);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:630:2: ( (lv_groups_6_0= ruleGroup ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==21) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:631:1: (lv_groups_6_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:631:1: (lv_groups_6_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:632:3: lv_groups_6_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1267);
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
                            	    break loop17;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:5: ( ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==15) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:6: ( (lv_features_7_0= ruleSolitaryFeature ) ) ( (lv_features_8_0= ruleSolitaryFeature ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:6: ( (lv_features_7_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:649:1: (lv_features_7_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:649:1: (lv_features_7_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:650:3: lv_features_7_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1292);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:666:2: ( (lv_features_8_0= ruleSolitaryFeature ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==15) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:667:1: (lv_features_8_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:667:1: (lv_features_8_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:668:3: lv_features_8_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1313);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:684:5: (otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==18) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:684:7: otherlv_9= '#' ( (lv_constraints_10_0= ruleExpression ) ) otherlv_11= '#' (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )*
                            {
                            otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedFeature1329); 

                                	newLeafNode(otherlv_9, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:688:1: ( (lv_constraints_10_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:1: (lv_constraints_10_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:1: (lv_constraints_10_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:690:3: lv_constraints_10_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1350);
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

                            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedFeature1362); 

                                	newLeafNode(otherlv_11, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_2());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:710:1: (otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#' )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==18) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:710:3: otherlv_12= '#' ( (lv_constraints_13_0= ruleExpression ) ) otherlv_14= '#'
                            	    {
                            	    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedFeature1375); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_3_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:714:1: ( (lv_constraints_13_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:715:1: (lv_constraints_13_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:715:1: (lv_constraints_13_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:716:3: lv_constraints_13_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1396);
                            	    lv_constraints_13_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"constraints",
                            	            		lv_constraints_13_0, 
                            	            		"Expression");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroupedFeature1408); 

                            	        	newLeafNode(otherlv_14, grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_3_2());
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroupedFeature1424); 

                        	newLeafNode(otherlv_15, grammarAccess.getGroupedFeatureAccess().getSemicolonKeyword_2_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:741:6: (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:741:6: (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:741:8: otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) )
                    {
                    otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroupedFeature1444); 

                        	newLeafNode(otherlv_16, grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:745:1: ( (lv_constraints_17_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:746:1: (lv_constraints_17_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:746:1: (lv_constraints_17_0= ruleExpression )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:747:3: lv_constraints_17_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1465);
                    lv_constraints_17_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_17_0, 
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:771:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:772:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1504);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1514); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:780:1: ruleExpression returns [EObject current=null] : (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical2Operation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:783:28: ( (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:784:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:784:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:785:5: this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1561);
            this_Logical2Operation_0=ruleLogical2Operation();

            state._fsp--;

             
                    current = this_Logical2Operation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:793:1: ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=28 && LA24_0<=29)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:793:2: () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:793:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:794:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:799:2: ( (lv_operator_2_0= ruleLogicalOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:800:1: (lv_operator_2_0= ruleLogicalOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:800:1: (lv_operator_2_0= ruleLogicalOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:801:3: lv_operator_2_0= ruleLogicalOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_ruleExpression1591);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:817:2: ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:818:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:818:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:819:3: lv_rexp_3_0= ruleLogical2Operation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1612);
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogical2Operation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:1: entryRuleLogical2Operation returns [EObject current=null] : iv_ruleLogical2Operation= ruleLogical2Operation EOF ;
    public final EObject entryRuleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical2Operation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:844:2: (iv_ruleLogical2Operation= ruleLogical2Operation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:845:2: iv_ruleLogical2Operation= ruleLogical2Operation EOF
            {
             newCompositeNode(grammarAccess.getLogical2OperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1650);
            iv_ruleLogical2Operation=ruleLogical2Operation();

            state._fsp--;

             current =iv_ruleLogical2Operation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogical2Operation1660); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:852:1: ruleLogical2Operation returns [EObject current=null] : (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) ;
    public final EObject ruleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:855:28: ( (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:856:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:856:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:857:5: this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1707);
            this_BinaryOperation_0=ruleBinaryOperation();

            state._fsp--;

             
                    current = this_BinaryOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:865:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=30 && LA25_0<=32)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:865:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:865:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:866:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:871:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:872:1: (lv_operator_2_0= ruleCompareOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:872:1: (lv_operator_2_0= ruleCompareOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:873:3: lv_operator_2_0= ruleCompareOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1737);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:889:2: ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:890:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:890:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:891:3: lv_rexp_3_0= ruleBinaryOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1758);
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
    // $ANTLR end "ruleLogical2Operation"


    // $ANTLR start "entryRuleBinaryOperation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:915:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:916:2: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:917:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1796);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;

             current =iv_ruleBinaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation1806); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:924:1: ruleBinaryOperation returns [EObject current=null] : (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExp_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:927:28: ( (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:928:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:928:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:929:5: this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1853);
            this_AtomicExp_0=ruleAtomicExp();

            state._fsp--;

             
                    current = this_AtomicExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:937:1: ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=33 && LA26_0<=36)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:937:2: () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:937:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:938:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:943:2: ( (lv_operator_2_0= ruleArithmicOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:944:1: (lv_operator_2_0= ruleArithmicOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:944:1: (lv_operator_2_0= ruleArithmicOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:945:3: lv_operator_2_0= ruleArithmicOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1883);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:961:2: ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:1: (lv_rexp_3_0= ruleAtomicExp )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:1: (lv_rexp_3_0= ruleAtomicExp )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:963:3: lv_rexp_3_0= ruleAtomicExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1904);
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
            	    break loop26;
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:987:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:988:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:989:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1942);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation1952); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:996:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:999:28: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1001:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1001:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1002:3: lv_operator_0_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1998);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1018:2: ( (lv_exp_1_0= ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1019:1: (lv_exp_1_0= ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1019:1: (lv_exp_1_0= ruleAtomicExp )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1020:3: lv_exp_1_0= ruleAtomicExp
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleUnaryOperation2019);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1044:1: entryRuleAtomicExp returns [EObject current=null] : iv_ruleAtomicExp= ruleAtomicExp EOF ;
    public final EObject entryRuleAtomicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExp = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1045:2: (iv_ruleAtomicExp= ruleAtomicExp EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1046:2: iv_ruleAtomicExp= ruleAtomicExp EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp2055);
            iv_ruleAtomicExp=ruleAtomicExp();

            state._fsp--;

             current =iv_ruleAtomicExp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExp2065); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1053:1: ruleAtomicExp returns [EObject current=null] : (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation ) ;
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
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1056:28: ( (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1057:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1057:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt27=1;
                }
                break;
            case RULE_INT:
            case 27:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt27=3;
                }
                break;
            case 24:
                {
                alt27=4;
                }
                break;
            case 37:
            case 38:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1058:5: this_NULL_0= ruleNULL
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_ruleAtomicExp2112);
                    this_NULL_0=ruleNULL();

                    state._fsp--;

                     
                            current = this_NULL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1068:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleAtomicExp2139);
                    this_Number_1=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1078:5: this_Identifier_2= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleAtomicExp2166);
                    this_Identifier_2=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1087:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1087:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1087:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAtomicExp2184); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAtomicExp2206);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAtomicExp2217); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1106:5: this_UnaryOperation_6= ruleUnaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_ruleAtomicExp2246);
                    this_UnaryOperation_6=ruleUnaryOperation();

                    state._fsp--;

                     
                            current = this_UnaryOperation_6; 
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


    // $ANTLR start "entryRuleNULL"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1122:1: entryRuleNULL returns [EObject current=null] : iv_ruleNULL= ruleNULL EOF ;
    public final EObject entryRuleNULL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1123:2: (iv_ruleNULL= ruleNULL EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1124:2: iv_ruleNULL= ruleNULL EOF
            {
             newCompositeNode(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL2281);
            iv_ruleNULL=ruleNULL();

            state._fsp--;

             current =iv_ruleNULL; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL2291); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1131:1: ruleNULL returns [EObject current=null] : ( () otherlv_1= 'NULL' ) ;
    public final EObject ruleNULL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1134:28: ( ( () otherlv_1= 'NULL' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1135:1: ( () otherlv_1= 'NULL' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1135:1: ( () otherlv_1= 'NULL' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1135:2: () otherlv_1= 'NULL'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1135:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1136:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNULLAccess().getNULLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleNULL2337); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1153:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1154:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1155:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber2373);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber2383); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1162:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1165:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1166:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1166:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1167:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1167:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1168:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber2428);
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


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1192:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1193:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1194:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier2463);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier2473); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1201:1: ruleIdentifier returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1204:28: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1205:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1205:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1206:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1206:1: ( ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1207:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIdentifier2520);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1228:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1229:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1230:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2556);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2567); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1237:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1240:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1241:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1241:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1241:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1241:2: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1242:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEInt2606); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2623); 

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


    // $ANTLR start "ruleLogicalOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1264:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1266:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1267:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1267:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            else if ( (LA29_0==29) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1267:2: (enumLiteral_0= 'And' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1267:2: (enumLiteral_0= 'And' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1267:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLogicalOperator2684); 

                            current = grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1273:6: (enumLiteral_1= 'Or' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1273:6: (enumLiteral_1= 'Or' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1273:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLogicalOperator2701); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1283:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1285:28: ( ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1286:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1286:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt30=1;
                }
                break;
            case 31:
                {
                alt30=2;
                }
                break;
            case 32:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1286:2: (enumLiteral_0= 'Equals' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1286:2: (enumLiteral_0= 'Equals' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1286:4: enumLiteral_0= 'Equals'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCompareOperator2746); 

                            current = grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1292:6: (enumLiteral_1= 'Higher' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1292:6: (enumLiteral_1= 'Higher' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1292:8: enumLiteral_1= 'Higher'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompareOperator2763); 

                            current = grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1298:6: (enumLiteral_2= 'Lower' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1298:6: (enumLiteral_2= 'Lower' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1298:8: enumLiteral_2= 'Lower'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompareOperator2780); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1308:1: ruleArithmicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) ;
    public final Enumerator ruleArithmicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1310:28: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt31=1;
                }
                break;
            case 34:
                {
                alt31=2;
                }
                break;
            case 35:
                {
                alt31=3;
                }
                break;
            case 36:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:2: (enumLiteral_0= 'Add' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:2: (enumLiteral_0= 'Add' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArithmicOperator2825); 

                            current = grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1317:6: (enumLiteral_1= 'Subtract' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1317:6: (enumLiteral_1= 'Subtract' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1317:8: enumLiteral_1= 'Subtract'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArithmicOperator2842); 

                            current = grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1323:6: (enumLiteral_2= 'Divide' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1323:6: (enumLiteral_2= 'Divide' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1323:8: enumLiteral_2= 'Divide'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleArithmicOperator2859); 

                            current = grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1329:6: (enumLiteral_3= 'Multiply' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1329:6: (enumLiteral_3= 'Multiply' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1329:8: enumLiteral_3= 'Multiply'
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleArithmicOperator2876); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1339:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1341:28: ( ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1342:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1342:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            else if ( (LA32_0==38) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1342:2: (enumLiteral_0= 'Not' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1342:2: (enumLiteral_0= 'Not' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1342:4: enumLiteral_0= 'Not'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleUnaryOperator2921); 

                            current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1348:6: (enumLiteral_1= 'Minus' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1348:6: (enumLiteral_1= 'Minus' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1348:8: enumLiteral_1= 'Minus'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleUnaryOperator2938); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1358:1: ruleSimpleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleSimpleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1360:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1361:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1361:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            case 42:
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
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1361:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1361:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1361:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSimpleType2983); 

                            current = grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1367:6: (enumLiteral_1= 'int' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1367:6: (enumLiteral_1= 'int' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1367:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSimpleType3000); 

                            current = grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:6: (enumLiteral_2= 'double' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:6: (enumLiteral_2= 'double' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSimpleType3017); 

                            current = grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1379:6: (enumLiteral_3= 'String' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1379:6: (enumLiteral_3= 'String' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1379:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSimpleType3034); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1389:1: ruleSolitaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) ;
    public final Enumerator ruleSolitaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1391:28: ( ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:2: (enumLiteral_0= 'Optional' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:2: (enumLiteral_0= 'Optional' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:4: enumLiteral_0= 'Optional'
                    {
                    enumLiteral_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleSolitaryType3079); 

                            current = grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1398:6: (enumLiteral_1= 'Mandatory' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1398:6: (enumLiteral_1= 'Mandatory' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1398:8: enumLiteral_1= 'Mandatory'
                    {
                    enumLiteral_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleSolitaryType3096); 

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
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel211 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleModel227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleFeature320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleFeature347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleSolitaryFeature429 = new BitSet(new long[]{0x0000180000008030L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature450 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolitaryFeature472 = new BitSet(new long[]{0x0000000000110002L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature486 = new BitSet(new long[]{0x00000000002E8000L});
        public static final BitSet FOLLOW_17_in_ruleSolitaryFeature499 = new BitSet(new long[]{0x0000078000000000L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleSolitaryFeature520 = new BitSet(new long[]{0x00000000002C8000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature544 = new BitSet(new long[]{0x00000000002C8000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature565 = new BitSet(new long[]{0x00000000002C8000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature590 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature611 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature627 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature648 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature660 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature673 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature694 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature706 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleSolitaryFeature722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleSolitaryFeature742 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString803 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleGroup972 = new BitSet(new long[]{0x0000000000408030L});
        public static final BitSet FOLLOW_22_in_ruleGroup990 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup1025 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_23_in_ruleGroup1038 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup1059 = new BitSet(new long[]{0x0000000000880000L});
        public static final BitSet FOLLOW_19_in_ruleGroup1073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature1109 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature1119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupedFeature1174 = new BitSet(new long[]{0x0000000000110002L});
        public static final BitSet FOLLOW_16_in_ruleGroupedFeature1188 = new BitSet(new long[]{0x00000000002E8000L});
        public static final BitSet FOLLOW_17_in_ruleGroupedFeature1201 = new BitSet(new long[]{0x0000078000000000L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleGroupedFeature1222 = new BitSet(new long[]{0x00000000002C8000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1246 = new BitSet(new long[]{0x00000000002C8000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1267 = new BitSet(new long[]{0x00000000002C8000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1292 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1313 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleGroupedFeature1329 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1350 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGroupedFeature1362 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleGroupedFeature1375 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1396 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleGroupedFeature1408 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleGroupedFeature1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleGroupedFeature1444 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1504 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1561 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleExpression1591 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1612 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogical2Operation1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1707 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1737 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1758 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1796 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation1806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1853 = new BitSet(new long[]{0x0000001E00000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1883 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1904 = new BitSet(new long[]{0x0000001E00000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1998 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleUnaryOperation2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp2055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExp2065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_ruleAtomicExp2112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleAtomicExp2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleAtomicExp2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAtomicExp2184 = new BitSet(new long[]{0x000000600D008070L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomicExp2206 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAtomicExp2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleAtomicExp2246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL2281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleNULL2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber2383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber2428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIdentifier2520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2556 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEInt2606 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleLogicalOperator2684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLogicalOperator2701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompareOperator2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCompareOperator2763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCompareOperator2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArithmicOperator2825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleArithmicOperator2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleArithmicOperator2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleArithmicOperator2876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleUnaryOperator2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleUnaryOperator2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSimpleType2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSimpleType3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSimpleType3017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleSimpleType3034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleSolitaryType3079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleSolitaryType3096 = new BitSet(new long[]{0x0000000000000002L});
    }


}