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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Root'", "'}'", "'feature'", "'#'", "'select'", "'any'", "'('", "','", "')'", "'.'", "'NULL'", "'-'", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
            else if ( (LA3_0==RULE_ID) ) {
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

            if ( ((LA4_0>=40 && LA4_0<=41)) ) {
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

            if ( ((LA5_0>=36 && LA5_0<=39)) ) {
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:491:1: ruleGroupedFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleGroupedFeature() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:494:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:1: ( () ( (lv_name_1_0= ruleEString ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:2: () ( (lv_name_1_0= ruleEString ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:501:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:502:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:502:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:503:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupedFeature982);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:527:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:528:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:529:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression1018);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression1028); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:536:1: ruleExpression returns [EObject current=null] : (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical2Operation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:539:28: ( (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:540:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:540:1: (this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:541:5: this_Logical2Operation_0= ruleLogical2Operation ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1075);
            this_Logical2Operation_0=ruleLogical2Operation();

            state._fsp--;

             
                    current = this_Logical2Operation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:549:1: ( () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=25 && LA15_0<=26)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:549:2: () ( (lv_operator_2_0= ruleLogicalOperator ) ) ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:549:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:550:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:555:2: ( (lv_operator_2_0= ruleLogicalOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:556:1: (lv_operator_2_0= ruleLogicalOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:556:1: (lv_operator_2_0= ruleLogicalOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:557:3: lv_operator_2_0= ruleLogicalOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_ruleExpression1105);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:573:2: ( (lv_rexp_3_0= ruleLogical2Operation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:574:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:574:1: (lv_rexp_3_0= ruleLogical2Operation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:575:3: lv_rexp_3_0= ruleLogical2Operation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_ruleExpression1126);
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
            	    break loop15;
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:599:1: entryRuleLogical2Operation returns [EObject current=null] : iv_ruleLogical2Operation= ruleLogical2Operation EOF ;
    public final EObject entryRuleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical2Operation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:600:2: (iv_ruleLogical2Operation= ruleLogical2Operation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:601:2: iv_ruleLogical2Operation= ruleLogical2Operation EOF
            {
             newCompositeNode(grammarAccess.getLogical2OperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1164);
            iv_ruleLogical2Operation=ruleLogical2Operation();

            state._fsp--;

             current =iv_ruleLogical2Operation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogical2Operation1174); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:608:1: ruleLogical2Operation returns [EObject current=null] : (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) ;
    public final EObject ruleLogical2Operation() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:611:28: ( (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:1: (this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:5: this_BinaryOperation_0= ruleBinaryOperation ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1221);
            this_BinaryOperation_0=ruleBinaryOperation();

            state._fsp--;

             
                    current = this_BinaryOperation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:621:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=29)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:621:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:621:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:622:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:627:2: ( (lv_operator_2_0= ruleCompareOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:628:1: (lv_operator_2_0= ruleCompareOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:628:1: (lv_operator_2_0= ruleCompareOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:629:3: lv_operator_2_0= ruleCompareOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1251);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:645:2: ( (lv_rexp_3_0= ruleBinaryOperation ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:646:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:646:1: (lv_rexp_3_0= ruleBinaryOperation )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:647:3: lv_rexp_3_0= ruleBinaryOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1272);
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
            	    break loop16;
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:671:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:672:2: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:673:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1310);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;

             current =iv_ruleBinaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation1320); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:680:1: ruleBinaryOperation returns [EObject current=null] : (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicExp_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rexp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:683:28: ( (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:684:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:684:1: (this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:685:5: this_AtomicExp_0= ruleAtomicExp ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1367);
            this_AtomicExp_0=ruleAtomicExp();

            state._fsp--;

             
                    current = this_AtomicExp_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:693:1: ( () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=30 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:693:2: () ( (lv_operator_2_0= ruleArithmicOperator ) ) ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:693:2: ()
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:694:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:699:2: ( (lv_operator_2_0= ruleArithmicOperator ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:700:1: (lv_operator_2_0= ruleArithmicOperator )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:700:1: (lv_operator_2_0= ruleArithmicOperator )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:701:3: lv_operator_2_0= ruleArithmicOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1397);
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

            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:717:2: ( (lv_rexp_3_0= ruleAtomicExp ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:718:1: (lv_rexp_3_0= ruleAtomicExp )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:718:1: (lv_rexp_3_0= ruleAtomicExp )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:719:3: lv_rexp_3_0= ruleAtomicExp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1418);
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
            	    break loop17;
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:743:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:744:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:745:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1456);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation1466); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:752:1: ruleUnaryOperation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:28: ( ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:1: ( ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:2: ( (lv_operator_0_0= ruleUnaryOperator ) ) ( (lv_exp_1_0= ruleAtomicExp ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:2: ( (lv_operator_0_0= ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:757:1: (lv_operator_0_0= ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:757:1: (lv_operator_0_0= ruleUnaryOperator )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:758:3: lv_operator_0_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1512);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:774:2: ( (lv_exp_1_0= ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:775:1: (lv_exp_1_0= ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:775:1: (lv_exp_1_0= ruleAtomicExp )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:776:3: lv_exp_1_0= ruleAtomicExp
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_ruleUnaryOperation1533);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:800:1: entryRuleAtomicExp returns [EObject current=null] : iv_ruleAtomicExp= ruleAtomicExp EOF ;
    public final EObject entryRuleAtomicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExp = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:801:2: (iv_ruleAtomicExp= ruleAtomicExp EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:802:2: iv_ruleAtomicExp= ruleAtomicExp EOF
            {
             newCompositeNode(grammarAccess.getAtomicExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp1569);
            iv_ruleAtomicExp=ruleAtomicExp();

            state._fsp--;

             current =iv_ruleAtomicExp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExp1579); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:809:1: ruleAtomicExp returns [EObject current=null] : (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation ) ;
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
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:812:28: ( (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:813:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:813:1: (this_NULL_0= ruleNULL | this_Number_1= ruleNumber | this_Identifier_2= ruleIdentifier | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) | this_UnaryOperation_6= ruleUnaryOperation )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
            case 24:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
                {
                alt18=3;
                }
                break;
            case 19:
                {
                alt18=4;
                }
                break;
            case 34:
            case 35:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:5: this_NULL_0= ruleNULL
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_ruleAtomicExp1626);
                    this_NULL_0=ruleNULL();

                    state._fsp--;

                     
                            current = this_NULL_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:824:5: this_Number_1= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleAtomicExp1653);
                    this_Number_1=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:834:5: this_Identifier_2= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleAtomicExp1680);
                    this_Identifier_2=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAtomicExp1698); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAtomicExp1720);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAtomicExp1731); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:862:5: this_UnaryOperation_6= ruleUnaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_ruleAtomicExp1760);
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


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:878:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:879:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:880:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier1795);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier1805); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:887:1: ruleIdentifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:890:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:891:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:891:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )* )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:891:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:891:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:892:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:892:1: (otherlv_0= RULE_ID )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:893:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier1850); 

            		newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
            	

            }


            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:904:2: (otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:904:4: otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIdentifier1863); 

            	        	newLeafNode(otherlv_1, grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0());
            	        
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:908:1: ( (otherlv_2= RULE_ID ) )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:909:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:909:1: (otherlv_2= RULE_ID )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:910:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIdentifierRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdentifier1883); 

            	    		newLeafNode(otherlv_2, grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:929:1: entryRuleNULL returns [EObject current=null] : iv_ruleNULL= ruleNULL EOF ;
    public final EObject entryRuleNULL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:930:2: (iv_ruleNULL= ruleNULL EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:931:2: iv_ruleNULL= ruleNULL EOF
            {
             newCompositeNode(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL1921);
            iv_ruleNULL=ruleNULL();

            state._fsp--;

             current =iv_ruleNULL; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL1931); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:938:1: ruleNULL returns [EObject current=null] : ( () otherlv_1= 'NULL' ) ;
    public final EObject ruleNULL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:941:28: ( ( () otherlv_1= 'NULL' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:942:1: ( () otherlv_1= 'NULL' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:942:1: ( () otherlv_1= 'NULL' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:942:2: () otherlv_1= 'NULL'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:942:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:943:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNULLAccess().getNULLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleNULL1977); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:960:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:961:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber2013);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber2023); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:969:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:972:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:973:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:973:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:974:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:974:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:975:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber2068);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:999:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1001:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2104);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2115); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1008:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1011:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:2: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1013:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt2154); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2171); 

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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1035:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1036:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1037:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2219);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2230); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1044:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1047:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1048:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2269); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall()); 
                

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1063:1: ruleLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) ;
    public final Enumerator ruleLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1065:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1066:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1066:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==26) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1066:2: (enumLiteral_0= 'And' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1066:2: (enumLiteral_0= 'And' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1066:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLogicalOperator2327); 

                            current = grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1072:6: (enumLiteral_1= 'Or' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1072:6: (enumLiteral_1= 'Or' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1072:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLogicalOperator2344); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1082:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1084:28: ( ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt22=1;
                }
                break;
            case 28:
                {
                alt22=2;
                }
                break;
            case 29:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:2: (enumLiteral_0= 'Equals' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:2: (enumLiteral_0= 'Equals' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:4: enumLiteral_0= 'Equals'
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCompareOperator2389); 

                            current = grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1091:6: (enumLiteral_1= 'Higher' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1091:6: (enumLiteral_1= 'Higher' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1091:8: enumLiteral_1= 'Higher'
                    {
                    enumLiteral_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCompareOperator2406); 

                            current = grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1097:6: (enumLiteral_2= 'Lower' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1097:6: (enumLiteral_2= 'Lower' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1097:8: enumLiteral_2= 'Lower'
                    {
                    enumLiteral_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCompareOperator2423); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1107:1: ruleArithmicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) ;
    public final Enumerator ruleArithmicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1109:28: ( ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:1: ( (enumLiteral_0= 'Add' ) | (enumLiteral_1= 'Subtract' ) | (enumLiteral_2= 'Divide' ) | (enumLiteral_3= 'Multiply' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            case 33:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:2: (enumLiteral_0= 'Add' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:2: (enumLiteral_0= 'Add' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:4: enumLiteral_0= 'Add'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleArithmicOperator2468); 

                            current = grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1116:6: (enumLiteral_1= 'Subtract' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1116:6: (enumLiteral_1= 'Subtract' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1116:8: enumLiteral_1= 'Subtract'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleArithmicOperator2485); 

                            current = grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1122:6: (enumLiteral_2= 'Divide' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1122:6: (enumLiteral_2= 'Divide' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1122:8: enumLiteral_2= 'Divide'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleArithmicOperator2502); 

                            current = grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1128:6: (enumLiteral_3= 'Multiply' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1128:6: (enumLiteral_3= 'Multiply' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1128:8: enumLiteral_3= 'Multiply'
                    {
                    enumLiteral_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArithmicOperator2519); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1138:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1140:28: ( ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1141:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1141:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1141:2: (enumLiteral_0= 'Not' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1141:2: (enumLiteral_0= 'Not' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1141:4: enumLiteral_0= 'Not'
                    {
                    enumLiteral_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleUnaryOperator2564); 

                            current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1147:6: (enumLiteral_1= 'Minus' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1147:6: (enumLiteral_1= 'Minus' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1147:8: enumLiteral_1= 'Minus'
                    {
                    enumLiteral_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleUnaryOperator2581); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1157:1: ruleSimpleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleSimpleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1159:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1160:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1160:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            case 39:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1160:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1160:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1160:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSimpleType2626); 

                            current = grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1166:6: (enumLiteral_1= 'int' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1166:6: (enumLiteral_1= 'int' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1166:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSimpleType2643); 

                            current = grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1172:6: (enumLiteral_2= 'double' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1172:6: (enumLiteral_2= 'double' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1172:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSimpleType2660); 

                            current = grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1178:6: (enumLiteral_3= 'String' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1178:6: (enumLiteral_3= 'String' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1178:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSimpleType2677); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1188:1: ruleSolitaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) ;
    public final Enumerator ruleSolitaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1190:28: ( ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            else if ( (LA26_0==41) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:2: (enumLiteral_0= 'Optional' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:2: (enumLiteral_0= 'Optional' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1191:4: enumLiteral_0= 'Optional'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSolitaryType2722); 

                            current = grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1197:6: (enumLiteral_1= 'Mandatory' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1197:6: (enumLiteral_1= 'Mandatory' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1197:8: enumLiteral_1= 'Mandatory'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSolitaryType2739); 

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
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleModel211 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleModel227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleFeature320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleFeature347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleSolitaryFeature429 = new BitSet(new long[]{0x000003F000008010L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature450 = new BitSet(new long[]{0x000000F000008010L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleSolitaryFeature472 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolitaryFeature494 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleSolitaryFeature507 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature529 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature550 = new BitSet(new long[]{0x000000000003C000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature575 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature596 = new BitSet(new long[]{0x0000000000034000L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature612 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature633 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature646 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature667 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleSolitaryFeature683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleGroup768 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleGroup786 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleGroup812 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup833 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleGroup846 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup867 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleGroup881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupedFeature982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1018 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1075 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleExpression1105 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_ruleExpression1126 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation1164 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogical2Operation1174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1221 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleLogical2Operation1251 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleLogical2Operation1272 = new BitSet(new long[]{0x0000000038000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1367 = new BitSet(new long[]{0x00000003C0000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_ruleBinaryOperation1397 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleBinaryOperation1418 = new BitSet(new long[]{0x00000003C0000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation1512 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_ruleUnaryOperation1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp1569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExp1579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_ruleAtomicExp1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleAtomicExp1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleAtomicExp1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAtomicExp1698 = new BitSet(new long[]{0x0000000C01880030L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAtomicExp1720 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAtomicExp1731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleAtomicExp1760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1795 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1850 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleIdentifier1863 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1883 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL1921 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL1931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleNULL1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber2068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt2154 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleLogicalOperator2327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleLogicalOperator2344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCompareOperator2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCompareOperator2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCompareOperator2423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleArithmicOperator2468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleArithmicOperator2485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleArithmicOperator2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArithmicOperator2519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleUnaryOperator2564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleUnaryOperator2581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSimpleType2626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleSimpleType2643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSimpleType2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSimpleType2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSolitaryType2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSolitaryType2739 = new BitSet(new long[]{0x0000000000000002L});
    }


}