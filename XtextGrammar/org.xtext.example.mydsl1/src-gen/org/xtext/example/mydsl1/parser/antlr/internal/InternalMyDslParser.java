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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'Root'", "'}'", "'feature'", "'=>'", "'type'", "'#'", "','", "';'", "'='", "'any'", "'groups'", "'constraints'", "'BinaryOperation'", "'operator'", "'rexp'", "'lexp'", "'UnaryOperation'", "'exp'", "'NULL'", "'Identifier'", "'ref'", "'-'", "'Equals'", "'Higher'", "'Lower'", "'And'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Or'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:191:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:192:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression382);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression392); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:200:1: ruleExpression returns [EObject current=null] : (this_BinaryOperation_0= ruleBinaryOperation | this_UnaryOperation_1= ruleUnaryOperation | this_NULL_2= ruleNULL | this_Number_3= ruleNumber | this_Identifier_4= ruleIdentifier ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryOperation_0 = null;

        EObject this_UnaryOperation_1 = null;

        EObject this_NULL_2 = null;

        EObject this_Number_3 = null;

        EObject this_Identifier_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:203:28: ( (this_BinaryOperation_0= ruleBinaryOperation | this_UnaryOperation_1= ruleUnaryOperation | this_NULL_2= ruleNULL | this_Number_3= ruleNumber | this_Identifier_4= ruleIdentifier ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (this_BinaryOperation_0= ruleBinaryOperation | this_UnaryOperation_1= ruleUnaryOperation | this_NULL_2= ruleNULL | this_Number_3= ruleNumber | this_Identifier_4= ruleIdentifier )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:204:1: (this_BinaryOperation_0= ruleBinaryOperation | this_UnaryOperation_1= ruleUnaryOperation | this_NULL_2= ruleNULL | this_Number_3= ruleNumber | this_Identifier_4= ruleIdentifier )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            case RULE_INT:
            case 34:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:205:5: this_BinaryOperation_0= ruleBinaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_ruleExpression439);
                    this_BinaryOperation_0=ruleBinaryOperation();

                    state._fsp--;

                     
                            current = this_BinaryOperation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:215:5: this_UnaryOperation_1= ruleUnaryOperation
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getUnaryOperationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_ruleExpression466);
                    this_UnaryOperation_1=ruleUnaryOperation();

                    state._fsp--;

                     
                            current = this_UnaryOperation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:5: this_NULL_2= ruleNULL
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNULLParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_ruleExpression493);
                    this_NULL_2=ruleNULL();

                    state._fsp--;

                     
                            current = this_NULL_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:235:5: this_Number_3= ruleNumber
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNumberParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_ruleExpression520);
                    this_Number_3=ruleNumber();

                    state._fsp--;

                     
                            current = this_Number_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:245:5: this_Identifier_4= ruleIdentifier
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getIdentifierParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_ruleExpression547);
                    this_Identifier_4=ruleIdentifier();

                    state._fsp--;

                     
                            current = this_Identifier_4; 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSolitaryFeature"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:261:1: entryRuleSolitaryFeature returns [EObject current=null] : iv_ruleSolitaryFeature= ruleSolitaryFeature EOF ;
    public final EObject entryRuleSolitaryFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolitaryFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:262:2: (iv_ruleSolitaryFeature= ruleSolitaryFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:263:2: iv_ruleSolitaryFeature= ruleSolitaryFeature EOF
            {
             newCompositeNode(grammarAccess.getSolitaryFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature582);
            iv_ruleSolitaryFeature=ruleSolitaryFeature();

            state._fsp--;

             current =iv_ruleSolitaryFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolitaryFeature592); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:270:1: ruleSolitaryFeature returns [EObject current=null] : (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleSolitaryFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_required_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_groups_6_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_features_9_0 = null;

        EObject lv_constraints_11_0 = null;

        EObject lv_constraints_13_0 = null;

        EObject lv_constraints_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:273:28: ( (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:274:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:274:1: (otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:274:3: otherlv_0= 'feature' ( (lv_required_1_0= ruleSolitaryType ) )? ( (lv_name_2_0= ruleEString ) ) ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSolitaryFeature629); 

                	newLeafNode(otherlv_0, grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:278:1: ( (lv_required_1_0= ruleSolitaryType ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=50 && LA5_0<=51)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:279:1: (lv_required_1_0= ruleSolitaryType )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:279:1: (lv_required_1_0= ruleSolitaryType )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:280:3: lv_required_1_0= ruleSolitaryType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature650);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:296:3: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:297:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:298:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSolitaryFeature672);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:2: ( (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' ) | (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:3: (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:3: (otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:5: otherlv_3= '=>' (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )? ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )? ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )? (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )? otherlv_15= ';'
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSolitaryFeature686); 

                        	newLeafNode(otherlv_3, grammarAccess.getSolitaryFeatureAccess().getEqualsSignGreaterThanSignKeyword_3_0_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:318:1: (otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:318:3: otherlv_4= 'type' ( (lv_type_5_0= ruleSimpleType ) )
                            {
                            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSolitaryFeature699); 

                                	newLeafNode(otherlv_4, grammarAccess.getSolitaryFeatureAccess().getTypeKeyword_3_0_1_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:322:1: ( (lv_type_5_0= ruleSimpleType ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:323:1: (lv_type_5_0= ruleSimpleType )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:323:1: (lv_type_5_0= ruleSimpleType )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:324:3: lv_type_5_0= ruleSimpleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_3_0_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleSolitaryFeature720);
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:340:4: ( ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==16||LA8_0==22) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:340:5: ( (lv_groups_6_0= ruleGroup ) ) ( (lv_groups_7_0= ruleGroup ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:340:5: ( (lv_groups_6_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_groups_6_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:341:1: (lv_groups_6_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:3: lv_groups_6_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_2_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSolitaryFeature744);
                            lv_groups_6_0=ruleGroup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"groups",
                                    		lv_groups_6_0, 
                                    		"Group");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:358:2: ( (lv_groups_7_0= ruleGroup ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==16||LA7_0==22) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:359:1: (lv_groups_7_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:359:1: (lv_groups_7_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:360:3: lv_groups_7_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleSolitaryFeature765);
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
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:376:5: ( ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==15) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:376:6: ( (lv_features_8_0= ruleSolitaryFeature ) ) ( (lv_features_9_0= ruleSolitaryFeature ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:376:6: ( (lv_features_8_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:377:1: (lv_features_8_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:377:1: (lv_features_8_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:378:3: lv_features_8_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature790);
                            lv_features_8_0=ruleSolitaryFeature();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"features",
                                    		lv_features_8_0, 
                                    		"SolitaryFeature");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:394:2: ( (lv_features_9_0= ruleSolitaryFeature ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==15) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:395:1: (lv_features_9_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:395:1: (lv_features_9_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:396:3: lv_features_9_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature811);
                            	    lv_features_9_0=ruleSolitaryFeature();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"features",
                            	            		lv_features_9_0, 
                            	            		"SolitaryFeature");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:412:5: (otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:412:7: otherlv_10= '#' ( (lv_constraints_11_0= ruleExpression ) ) (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )* otherlv_14= '#'
                            {
                            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature827); 

                                	newLeafNode(otherlv_10, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:416:1: ( (lv_constraints_11_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:417:1: (lv_constraints_11_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:417:1: (lv_constraints_11_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:418:3: lv_constraints_11_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature848);
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

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:434:2: (otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==19) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:434:4: otherlv_12= ',' ( (lv_constraints_13_0= ruleExpression ) )
                            	    {
                            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSolitaryFeature861); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getSolitaryFeatureAccess().getCommaKeyword_3_0_4_2_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:438:1: ( (lv_constraints_13_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_constraints_13_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:439:1: (lv_constraints_13_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:440:3: lv_constraints_13_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_2_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature882);
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
                            	    break loop11;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSolitaryFeature896); 

                                	newLeafNode(otherlv_14, grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3());
                                

                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSolitaryFeature910); 

                        	newLeafNode(otherlv_15, grammarAccess.getSolitaryFeatureAccess().getSemicolonKeyword_3_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:465:6: (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:465:6: (otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:465:8: otherlv_16= '=' ( (lv_constraints_17_0= ruleExpression ) )
                    {
                    otherlv_16=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSolitaryFeature930); 

                        	newLeafNode(otherlv_16, grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:469:1: ( (lv_constraints_17_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:470:1: (lv_constraints_17_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:470:1: (lv_constraints_17_0= ruleExpression )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:471:3: lv_constraints_17_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSolitaryFeature951);
                    lv_constraints_17_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSolitaryFeatureRule());
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
    // $ANTLR end "ruleSolitaryFeature"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:495:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:496:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:497:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString990);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1001); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:504:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:507:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:508:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:508:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:508:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1041); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:516:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1067); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:531:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:532:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:533:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup1112);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup1122); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:540:1: ruleGroup returns [EObject current=null] : ( ( (lv_inclusive_0_0= 'any' ) )? otherlv_1= '=>' ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )* otherlv_4= ';' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token lv_inclusive_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_groupedFeatures_2_0 = null;

        EObject lv_groupedFeatures_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:543:28: ( ( ( (lv_inclusive_0_0= 'any' ) )? otherlv_1= '=>' ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )* otherlv_4= ';' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:1: ( ( (lv_inclusive_0_0= 'any' ) )? otherlv_1= '=>' ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )* otherlv_4= ';' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:1: ( ( (lv_inclusive_0_0= 'any' ) )? otherlv_1= '=>' ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )* otherlv_4= ';' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:2: ( (lv_inclusive_0_0= 'any' ) )? otherlv_1= '=>' ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) ) ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )* otherlv_4= ';'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:544:2: ( (lv_inclusive_0_0= 'any' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:545:1: (lv_inclusive_0_0= 'any' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:545:1: (lv_inclusive_0_0= 'any' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:3: lv_inclusive_0_0= 'any'
                    {
                    lv_inclusive_0_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleGroup1165); 

                            newLeafNode(lv_inclusive_0_0, grammarAccess.getGroupAccess().getInclusiveAnyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGroupRule());
                    	        }
                           		setWithLastConsumed(current, "inclusive", true, "any");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroup1191); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:563:1: ( (lv_groupedFeatures_2_0= ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:564:1: (lv_groupedFeatures_2_0= ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:564:1: (lv_groupedFeatures_2_0= ruleGroupedFeature )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:565:3: lv_groupedFeatures_2_0= ruleGroupedFeature
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup1212);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:581:2: ( (lv_groupedFeatures_3_0= ruleGroupedFeature ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:582:1: (lv_groupedFeatures_3_0= ruleGroupedFeature )
            	    {
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:582:1: (lv_groupedFeatures_3_0= ruleGroupedFeature )
            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:583:3: lv_groupedFeatures_3_0= ruleGroupedFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_ruleGroup1233);
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
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroup1246); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getSemicolonKeyword_4());
                

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:611:1: entryRuleGroupedFeature returns [EObject current=null] : iv_ruleGroupedFeature= ruleGroupedFeature EOF ;
    public final EObject entryRuleGroupedFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupedFeature = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:2: (iv_ruleGroupedFeature= ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:613:2: iv_ruleGroupedFeature= ruleGroupedFeature EOF
            {
             newCompositeNode(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature1282);
            iv_ruleGroupedFeature=ruleGroupedFeature();

            state._fsp--;

             current =iv_ruleGroupedFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature1292); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:620:1: ruleGroupedFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' ) | (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) ) ) ) ;
    public final EObject ruleGroupedFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_groups_9_0 = null;

        EObject lv_features_11_0 = null;

        EObject lv_features_13_0 = null;

        EObject lv_constraints_16_0 = null;

        EObject lv_constraints_18_0 = null;

        EObject lv_constraints_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:623:28: ( ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' ) | (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:624:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' ) | (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:624:1: ( () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' ) | (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:624:2: () ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' ) | (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:624:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:625:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0(),
                        current);
                

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:630:2: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:631:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:631:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:632:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroupedFeature1347);
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

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:2: ( (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' ) | (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            else if ( (LA24_0==21) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:3: (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:3: (otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:648:5: otherlv_2= '=>' (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )? ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )? (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )? otherlv_20= ';'
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroupedFeature1361); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroupedFeatureAccess().getEqualsSignGreaterThanSignKeyword_2_0_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:652:1: (otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==17) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:652:3: otherlv_3= 'type' ( (lv_type_4_0= ruleSimpleType ) )
                            {
                            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroupedFeature1374); 

                                	newLeafNode(otherlv_3, grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:656:1: ( (lv_type_4_0= ruleSimpleType ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:657:1: (lv_type_4_0= ruleSimpleType )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:657:1: (lv_type_4_0= ruleSimpleType )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:658:3: lv_type_4_0= ruleSimpleType
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_ruleGroupedFeature1395);
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:674:4: (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==23) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:674:6: otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )* otherlv_10= '}'
                            {
                            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleGroupedFeature1410); 

                                	newLeafNode(otherlv_5, grammarAccess.getGroupedFeatureAccess().getGroupsKeyword_2_0_2_0());
                                
                            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroupedFeature1422); 

                                	newLeafNode(otherlv_6, grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_2_1());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:682:1: ( (lv_groups_7_0= ruleGroup ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:683:1: (lv_groups_7_0= ruleGroup )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:683:1: (lv_groups_7_0= ruleGroup )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:684:3: lv_groups_7_0= ruleGroup
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1443);
                            lv_groups_7_0=ruleGroup();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"groups",
                                    		lv_groups_7_0, 
                                    		"Group");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:700:2: (otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==19) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:700:4: otherlv_8= ',' ( (lv_groups_9_0= ruleGroup ) )
                            	    {
                            	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroupedFeature1456); 

                            	        	newLeafNode(otherlv_8, grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_2_3_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:704:1: ( (lv_groups_9_0= ruleGroup ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:705:1: (lv_groups_9_0= ruleGroup )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:705:1: (lv_groups_9_0= ruleGroup )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:706:3: lv_groups_9_0= ruleGroup
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleGroupedFeature1477);
                            	    lv_groups_9_0=ruleGroup();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"groups",
                            	            		lv_groups_9_0, 
                            	            		"Group");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop18;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroupedFeature1491); 

                                	newLeafNode(otherlv_10, grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_2_4());
                                

                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:3: ( ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==15) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:4: ( (lv_features_11_0= ruleSolitaryFeature ) ) (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )*
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:4: ( (lv_features_11_0= ruleSolitaryFeature ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:727:1: (lv_features_11_0= ruleSolitaryFeature )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:727:1: (lv_features_11_0= ruleSolitaryFeature )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:728:3: lv_features_11_0= ruleSolitaryFeature
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1515);
                            lv_features_11_0=ruleSolitaryFeature();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"features",
                                    		lv_features_11_0, 
                                    		"SolitaryFeature");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:744:2: (otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==19) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:744:4: otherlv_12= ',' ( (lv_features_13_0= ruleSolitaryFeature ) )
                            	    {
                            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroupedFeature1528); 

                            	        	newLeafNode(otherlv_12, grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_3_1_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:748:1: ( (lv_features_13_0= ruleSolitaryFeature ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:749:1: (lv_features_13_0= ruleSolitaryFeature )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:749:1: (lv_features_13_0= ruleSolitaryFeature )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:750:3: lv_features_13_0= ruleSolitaryFeature
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1549);
                            	    lv_features_13_0=ruleSolitaryFeature();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"features",
                            	            		lv_features_13_0, 
                            	            		"SolitaryFeature");
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

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:766:6: (otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==24) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:766:8: otherlv_14= 'constraints' otherlv_15= '{' ( (lv_constraints_16_0= ruleExpression ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )* otherlv_19= '}'
                            {
                            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGroupedFeature1566); 

                                	newLeafNode(otherlv_14, grammarAccess.getGroupedFeatureAccess().getConstraintsKeyword_2_0_4_0());
                                
                            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroupedFeature1578); 

                                	newLeafNode(otherlv_15, grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_4_1());
                                
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:774:1: ( (lv_constraints_16_0= ruleExpression ) )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:775:1: (lv_constraints_16_0= ruleExpression )
                            {
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:775:1: (lv_constraints_16_0= ruleExpression )
                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:776:3: lv_constraints_16_0= ruleExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_2_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1599);
                            lv_constraints_16_0=ruleExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"constraints",
                                    		lv_constraints_16_0, 
                                    		"Expression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:792:2: (otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) ) )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==19) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:792:4: otherlv_17= ',' ( (lv_constraints_18_0= ruleExpression ) )
                            	    {
                            	    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGroupedFeature1612); 

                            	        	newLeafNode(otherlv_17, grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_4_3_0());
                            	        
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:796:1: ( (lv_constraints_18_0= ruleExpression ) )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:797:1: (lv_constraints_18_0= ruleExpression )
                            	    {
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:797:1: (lv_constraints_18_0= ruleExpression )
                            	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:798:3: lv_constraints_18_0= ruleExpression
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_3_1_0()); 
                            	    	    
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1633);
                            	    lv_constraints_18_0=ruleExpression();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
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
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);

                            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroupedFeature1647); 

                                	newLeafNode(otherlv_19, grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_4_4());
                                

                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGroupedFeature1661); 

                        	newLeafNode(otherlv_20, grammarAccess.getGroupedFeatureAccess().getSemicolonKeyword_2_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:6: (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:6: (otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:8: otherlv_21= '=' ( (lv_constraints_22_0= ruleExpression ) )
                    {
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleGroupedFeature1681); 

                        	newLeafNode(otherlv_21, grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:827:1: ( (lv_constraints_22_0= ruleExpression ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:828:1: (lv_constraints_22_0= ruleExpression )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:828:1: (lv_constraints_22_0= ruleExpression )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:829:3: lv_constraints_22_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleGroupedFeature1702);
                    lv_constraints_22_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupedFeatureRule());
                    	        }
                           		add(
                           			current, 
                           			"constraints",
                            		lv_constraints_22_0, 
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


    // $ANTLR start "entryRuleBinaryOperation"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:853:1: entryRuleBinaryOperation returns [EObject current=null] : iv_ruleBinaryOperation= ruleBinaryOperation EOF ;
    public final EObject entryRuleBinaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:854:2: (iv_ruleBinaryOperation= ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:855:2: iv_ruleBinaryOperation= ruleBinaryOperation EOF
            {
             newCompositeNode(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1740);
            iv_ruleBinaryOperation=ruleBinaryOperation();

            state._fsp--;

             current =iv_ruleBinaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation1750); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:862:1: ruleBinaryOperation returns [EObject current=null] : (otherlv_0= 'BinaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) otherlv_4= 'rexp' ( (lv_rexp_5_0= ruleExpression ) ) otherlv_6= 'lexp' ( (lv_lexp_7_0= ruleExpression ) ) otherlv_8= '}' ) ;
    public final EObject ruleBinaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_rexp_5_0 = null;

        EObject lv_lexp_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:865:28: ( (otherlv_0= 'BinaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) otherlv_4= 'rexp' ( (lv_rexp_5_0= ruleExpression ) ) otherlv_6= 'lexp' ( (lv_lexp_7_0= ruleExpression ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:866:1: (otherlv_0= 'BinaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) otherlv_4= 'rexp' ( (lv_rexp_5_0= ruleExpression ) ) otherlv_6= 'lexp' ( (lv_lexp_7_0= ruleExpression ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:866:1: (otherlv_0= 'BinaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) otherlv_4= 'rexp' ( (lv_rexp_5_0= ruleExpression ) ) otherlv_6= 'lexp' ( (lv_lexp_7_0= ruleExpression ) ) otherlv_8= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:866:3: otherlv_0= 'BinaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleBinaryOperator ) ) otherlv_4= 'rexp' ( (lv_rexp_5_0= ruleExpression ) ) otherlv_6= 'lexp' ( (lv_lexp_7_0= ruleExpression ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBinaryOperation1787); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryOperationAccess().getBinaryOperationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBinaryOperation1799); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryOperationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBinaryOperation1811); 

                	newLeafNode(otherlv_2, grammarAccess.getBinaryOperationAccess().getOperatorKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:878:1: ( (lv_operator_3_0= ruleBinaryOperator ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:879:1: (lv_operator_3_0= ruleBinaryOperator )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:879:1: (lv_operator_3_0= ruleBinaryOperator )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:880:3: lv_operator_3_0= ruleBinaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getOperatorBinaryOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_ruleBinaryOperation1832);
            lv_operator_3_0=ruleBinaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"BinaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBinaryOperation1844); 

                	newLeafNode(otherlv_4, grammarAccess.getBinaryOperationAccess().getRexpKeyword_4());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:900:1: ( (lv_rexp_5_0= ruleExpression ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_rexp_5_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_rexp_5_0= ruleExpression )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:902:3: lv_rexp_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getRexpExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBinaryOperation1865);
            lv_rexp_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"rexp",
                    		lv_rexp_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleBinaryOperation1877); 

                	newLeafNode(otherlv_6, grammarAccess.getBinaryOperationAccess().getLexpKeyword_6());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:922:1: ( (lv_lexp_7_0= ruleExpression ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:923:1: (lv_lexp_7_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:923:1: (lv_lexp_7_0= ruleExpression )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:924:3: lv_lexp_7_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBinaryOperationAccess().getLexpExpressionParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBinaryOperation1898);
            lv_lexp_7_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBinaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"lexp",
                    		lv_lexp_7_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBinaryOperation1910); 

                	newLeafNode(otherlv_8, grammarAccess.getBinaryOperationAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:952:1: entryRuleUnaryOperation returns [EObject current=null] : iv_ruleUnaryOperation= ruleUnaryOperation EOF ;
    public final EObject entryRuleUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOperation = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:953:2: (iv_ruleUnaryOperation= ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:954:2: iv_ruleUnaryOperation= ruleUnaryOperation EOF
            {
             newCompositeNode(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1946);
            iv_ruleUnaryOperation=ruleUnaryOperation();

            state._fsp--;

             current =iv_ruleUnaryOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation1956); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:961:1: ruleUnaryOperation returns [EObject current=null] : (otherlv_0= 'UnaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) otherlv_4= 'exp' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleUnaryOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_exp_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:964:28: ( (otherlv_0= 'UnaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) otherlv_4= 'exp' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:965:1: (otherlv_0= 'UnaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) otherlv_4= 'exp' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:965:1: (otherlv_0= 'UnaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) otherlv_4= 'exp' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:965:3: otherlv_0= 'UnaryOperation' otherlv_1= '{' otherlv_2= 'operator' ( (lv_operator_3_0= ruleUnaryOperator ) ) otherlv_4= 'exp' ( (lv_exp_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleUnaryOperation1993); 

                	newLeafNode(otherlv_0, grammarAccess.getUnaryOperationAccess().getUnaryOperationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleUnaryOperation2005); 

                	newLeafNode(otherlv_1, grammarAccess.getUnaryOperationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleUnaryOperation2017); 

                	newLeafNode(otherlv_2, grammarAccess.getUnaryOperationAccess().getOperatorKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:977:1: ( (lv_operator_3_0= ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:978:1: (lv_operator_3_0= ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:978:1: (lv_operator_3_0= ruleUnaryOperator )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:979:3: lv_operator_3_0= ruleUnaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation2038);
            lv_operator_3_0=ruleUnaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_3_0, 
                    		"UnaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleUnaryOperation2050); 

                	newLeafNode(otherlv_4, grammarAccess.getUnaryOperationAccess().getExpKeyword_4());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:999:1: ( (lv_exp_5_0= ruleExpression ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:1: (lv_exp_5_0= ruleExpression )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:1: (lv_exp_5_0= ruleExpression )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1001:3: lv_exp_5_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getUnaryOperationAccess().getExpExpressionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleUnaryOperation2071);
            lv_exp_5_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryOperationRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_5_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUnaryOperation2083); 

                	newLeafNode(otherlv_6, grammarAccess.getUnaryOperationAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleNULL"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1029:1: entryRuleNULL returns [EObject current=null] : iv_ruleNULL= ruleNULL EOF ;
    public final EObject entryRuleNULL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1030:2: (iv_ruleNULL= ruleNULL EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1031:2: iv_ruleNULL= ruleNULL EOF
            {
             newCompositeNode(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL2119);
            iv_ruleNULL=ruleNULL();

            state._fsp--;

             current =iv_ruleNULL; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL2129); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1038:1: ruleNULL returns [EObject current=null] : ( () otherlv_1= 'NULL' ) ;
    public final EObject ruleNULL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1041:28: ( ( () otherlv_1= 'NULL' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:1: ( () otherlv_1= 'NULL' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:1: ( () otherlv_1= 'NULL' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:2: () otherlv_1= 'NULL'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1042:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNULLAccess().getNULLAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleNULL2175); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1060:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1061:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1062:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber2211);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber2221); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1069:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1072:28: ( ( (lv_value_0_0= ruleEInt ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1073:1: ( (lv_value_0_0= ruleEInt ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1073:1: ( (lv_value_0_0= ruleEInt ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1074:1: (lv_value_0_0= ruleEInt )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1074:1: (lv_value_0_0= ruleEInt )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1075:3: lv_value_0_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleNumber2266);
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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1099:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1100:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1101:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier2301);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier2311); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1108:1: ruleIdentifier returns [EObject current=null] : (otherlv_0= 'Identifier' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ref' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1111:28: ( (otherlv_0= 'Identifier' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ref' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1112:1: (otherlv_0= 'Identifier' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ref' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1112:1: (otherlv_0= 'Identifier' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ref' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1112:3: otherlv_0= 'Identifier' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ref' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleIdentifier2348); 

                	newLeafNode(otherlv_0, grammarAccess.getIdentifierAccess().getIdentifierKeyword_0());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1116:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1117:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1117:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1118:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIdentifierAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIdentifier2369);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIdentifierRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIdentifier2381); 

                	newLeafNode(otherlv_2, grammarAccess.getIdentifierAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleIdentifier2393); 

                	newLeafNode(otherlv_3, grammarAccess.getIdentifierAccess().getRefKeyword_3());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1142:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1143:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1143:1: ( ruleEString )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIdentifier2416);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleIdentifier2428); 

                	newLeafNode(otherlv_5, grammarAccess.getIdentifierAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1169:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1170:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1171:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2465);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2476); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1178:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1181:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:2: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1183:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEInt2515); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2532); 

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


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1205:1: ruleBinaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) | (enumLiteral_3= 'And' ) | (enumLiteral_4= 'Add' ) | (enumLiteral_5= 'Subtract' ) | (enumLiteral_6= 'Divide' ) | (enumLiteral_7= 'Multiply' ) | (enumLiteral_8= 'Or' ) ) ;
    public final Enumerator ruleBinaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1207:28: ( ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) | (enumLiteral_3= 'And' ) | (enumLiteral_4= 'Add' ) | (enumLiteral_5= 'Subtract' ) | (enumLiteral_6= 'Divide' ) | (enumLiteral_7= 'Multiply' ) | (enumLiteral_8= 'Or' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) | (enumLiteral_3= 'And' ) | (enumLiteral_4= 'Add' ) | (enumLiteral_5= 'Subtract' ) | (enumLiteral_6= 'Divide' ) | (enumLiteral_7= 'Multiply' ) | (enumLiteral_8= 'Or' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:1: ( (enumLiteral_0= 'Equals' ) | (enumLiteral_1= 'Higher' ) | (enumLiteral_2= 'Lower' ) | (enumLiteral_3= 'And' ) | (enumLiteral_4= 'Add' ) | (enumLiteral_5= 'Subtract' ) | (enumLiteral_6= 'Divide' ) | (enumLiteral_7= 'Multiply' ) | (enumLiteral_8= 'Or' ) )
            int alt26=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt26=1;
                }
                break;
            case 36:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            case 38:
                {
                alt26=4;
                }
                break;
            case 39:
                {
                alt26=5;
                }
                break;
            case 40:
                {
                alt26=6;
                }
                break;
            case 41:
                {
                alt26=7;
                }
                break;
            case 42:
                {
                alt26=8;
                }
                break;
            case 43:
                {
                alt26=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:2: (enumLiteral_0= 'Equals' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:2: (enumLiteral_0= 'Equals' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:4: enumLiteral_0= 'Equals'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBinaryOperator2593); 

                            current = grammarAccess.getBinaryOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:6: (enumLiteral_1= 'Higher' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:6: (enumLiteral_1= 'Higher' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:8: enumLiteral_1= 'Higher'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBinaryOperator2610); 

                            current = grammarAccess.getBinaryOperatorAccess().getHigherEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:6: (enumLiteral_2= 'Lower' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:6: (enumLiteral_2= 'Lower' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:8: enumLiteral_2= 'Lower'
                    {
                    enumLiteral_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBinaryOperator2627); 

                            current = grammarAccess.getBinaryOperatorAccess().getLowerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBinaryOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1226:6: (enumLiteral_3= 'And' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1226:6: (enumLiteral_3= 'And' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1226:8: enumLiteral_3= 'And'
                    {
                    enumLiteral_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBinaryOperator2644); 

                            current = grammarAccess.getBinaryOperatorAccess().getAndEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBinaryOperatorAccess().getAndEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1232:6: (enumLiteral_4= 'Add' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1232:6: (enumLiteral_4= 'Add' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1232:8: enumLiteral_4= 'Add'
                    {
                    enumLiteral_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBinaryOperator2661); 

                            current = grammarAccess.getBinaryOperatorAccess().getAddEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBinaryOperatorAccess().getAddEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1238:6: (enumLiteral_5= 'Subtract' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1238:6: (enumLiteral_5= 'Subtract' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1238:8: enumLiteral_5= 'Subtract'
                    {
                    enumLiteral_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBinaryOperator2678); 

                            current = grammarAccess.getBinaryOperatorAccess().getSubtractEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBinaryOperatorAccess().getSubtractEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1244:6: (enumLiteral_6= 'Divide' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1244:6: (enumLiteral_6= 'Divide' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1244:8: enumLiteral_6= 'Divide'
                    {
                    enumLiteral_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBinaryOperator2695); 

                            current = grammarAccess.getBinaryOperatorAccess().getDivideEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBinaryOperatorAccess().getDivideEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1250:6: (enumLiteral_7= 'Multiply' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1250:6: (enumLiteral_7= 'Multiply' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1250:8: enumLiteral_7= 'Multiply'
                    {
                    enumLiteral_7=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBinaryOperator2712); 

                            current = grammarAccess.getBinaryOperatorAccess().getMultiplyEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBinaryOperatorAccess().getMultiplyEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1256:6: (enumLiteral_8= 'Or' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1256:6: (enumLiteral_8= 'Or' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1256:8: enumLiteral_8= 'Or'
                    {
                    enumLiteral_8=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleBinaryOperator2729); 

                            current = grammarAccess.getBinaryOperatorAccess().getOrEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBinaryOperatorAccess().getOrEnumLiteralDeclaration_8()); 
                        

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
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1266:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1268:28: ( ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1269:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1269:1: ( (enumLiteral_0= 'Not' ) | (enumLiteral_1= 'Minus' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            else if ( (LA27_0==45) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1269:2: (enumLiteral_0= 'Not' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1269:2: (enumLiteral_0= 'Not' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1269:4: enumLiteral_0= 'Not'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleUnaryOperator2774); 

                            current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1275:6: (enumLiteral_1= 'Minus' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1275:6: (enumLiteral_1= 'Minus' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1275:8: enumLiteral_1= 'Minus'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleUnaryOperator2791); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1285:1: ruleSimpleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) ;
    public final Enumerator ruleSimpleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1287:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'double' ) | (enumLiteral_3= 'String' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt28=1;
                }
                break;
            case 47:
                {
                alt28=2;
                }
                break;
            case 48:
                {
                alt28=3;
                }
                break;
            case 49:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:2: (enumLiteral_0= 'boolean' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1288:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleSimpleType2836); 

                            current = grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1294:6: (enumLiteral_1= 'int' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1294:6: (enumLiteral_1= 'int' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1294:8: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleSimpleType2853); 

                            current = grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1300:6: (enumLiteral_2= 'double' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1300:6: (enumLiteral_2= 'double' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1300:8: enumLiteral_2= 'double'
                    {
                    enumLiteral_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleSimpleType2870); 

                            current = grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1306:6: (enumLiteral_3= 'String' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1306:6: (enumLiteral_3= 'String' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1306:8: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSimpleType2887); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1316:1: ruleSolitaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) ;
    public final Enumerator ruleSolitaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1318:28: ( ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:1: ( (enumLiteral_0= 'Optional' ) | (enumLiteral_1= 'Mandatory' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            else if ( (LA29_0==51) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:2: (enumLiteral_0= 'Optional' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:2: (enumLiteral_0= 'Optional' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1319:4: enumLiteral_0= 'Optional'
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSolitaryType2932); 

                            current = grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1325:6: (enumLiteral_1= 'Mandatory' )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1325:6: (enumLiteral_1= 'Mandatory' )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1325:8: enumLiteral_1= 'Mandatory'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSolitaryType2949); 

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
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_ruleExpression439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_ruleExpression466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_ruleExpression493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_ruleExpression520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_ruleExpression547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleSolitaryFeature629 = new BitSet(new long[]{0x000C000000008030L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_ruleSolitaryFeature650 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSolitaryFeature672 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleSolitaryFeature686 = new BitSet(new long[]{0x0000000000578000L});
        public static final BitSet FOLLOW_17_in_ruleSolitaryFeature699 = new BitSet(new long[]{0x0003C00000000000L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleSolitaryFeature720 = new BitSet(new long[]{0x0000000000558000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature744 = new BitSet(new long[]{0x0000000000558000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleSolitaryFeature765 = new BitSet(new long[]{0x0000000000558000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature790 = new BitSet(new long[]{0x0000000000148000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleSolitaryFeature811 = new BitSet(new long[]{0x0000000000148000L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature827 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature848 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleSolitaryFeature861 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature882 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleSolitaryFeature896 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSolitaryFeature910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSolitaryFeature930 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSolitaryFeature951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString990 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup1112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleGroup1165 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGroup1191 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup1212 = new BitSet(new long[]{0x0000000000108030L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_ruleGroup1233 = new BitSet(new long[]{0x0000000000108030L});
        public static final BitSet FOLLOW_20_in_ruleGroup1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature1282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroupedFeature1347 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleGroupedFeature1361 = new BitSet(new long[]{0x0000000001928000L});
        public static final BitSet FOLLOW_17_in_ruleGroupedFeature1374 = new BitSet(new long[]{0x0003C00000000000L});
        public static final BitSet FOLLOW_ruleSimpleType_in_ruleGroupedFeature1395 = new BitSet(new long[]{0x0000000001908000L});
        public static final BitSet FOLLOW_23_in_ruleGroupedFeature1410 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroupedFeature1422 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1443 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleGroupedFeature1456 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleGroupedFeature1477 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleGroupedFeature1491 = new BitSet(new long[]{0x0000000001108000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1515 = new BitSet(new long[]{0x0000000001180000L});
        public static final BitSet FOLLOW_19_in_ruleGroupedFeature1528 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_ruleGroupedFeature1549 = new BitSet(new long[]{0x0000000001180000L});
        public static final BitSet FOLLOW_24_in_ruleGroupedFeature1566 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroupedFeature1578 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1599 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_19_in_ruleGroupedFeature1612 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1633 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleGroupedFeature1647 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleGroupedFeature1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleGroupedFeature1681 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleGroupedFeature1702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation1740 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBinaryOperation1787 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBinaryOperation1799 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleBinaryOperation1811 = new BitSet(new long[]{0x00000FF800000000L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_ruleBinaryOperation1832 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleBinaryOperation1844 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBinaryOperation1865 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleBinaryOperation1877 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBinaryOperation1898 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBinaryOperation1910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation1946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleUnaryOperation1993 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleUnaryOperation2005 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleUnaryOperation2017 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryOperation2038 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleUnaryOperation2050 = new BitSet(new long[]{0x00000005A2000040L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleUnaryOperation2071 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleUnaryOperation2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL2119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleNULL2175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber2211 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber2221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleNumber2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier2301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier2311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleIdentifier2348 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIdentifier2369 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIdentifier2381 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleIdentifier2393 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIdentifier2416 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleIdentifier2428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEInt2515 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBinaryOperator2593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBinaryOperator2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleBinaryOperator2627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleBinaryOperator2644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleBinaryOperator2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleBinaryOperator2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleBinaryOperator2695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBinaryOperator2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleBinaryOperator2729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleUnaryOperator2774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleUnaryOperator2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleSimpleType2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleSimpleType2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleSimpleType2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleSimpleType2887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSolitaryType2932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleSolitaryType2949 = new BitSet(new long[]{0x0000000000000002L});
    }


}