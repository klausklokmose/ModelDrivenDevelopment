package org.xtext.example.mydsl1.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Equals'", "'Higher'", "'Lower'", "'And'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Or'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'", "'Model'", "'{'", "'}'", "'Root'", "'feature'", "'=>'", "';'", "'type'", "'#'", "','", "'='", "'groups'", "'constraints'", "'BinaryOperation'", "'operator'", "'rexp'", "'lexp'", "'UnaryOperation'", "'exp'", "'NULL'", "'Identifier'", "'ref'", "'-'", "'any'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleFeature EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature121);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Feature__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Feature__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature154);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleExpression EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression181);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Expression__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Expression__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Alternatives_in_ruleExpression214);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSolitaryFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleSolitaryFeature : ruleSolitaryFeature EOF ;
    public final void entryRuleSolitaryFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleSolitaryFeature EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleSolitaryFeature EOF
            {
             before(grammarAccess.getSolitaryFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature241);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolitaryFeature248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSolitaryFeature"


    // $ANTLR start "ruleSolitaryFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleSolitaryFeature : ( ( rule__SolitaryFeature__Group__0 ) ) ;
    public final void ruleSolitaryFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__SolitaryFeature__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__SolitaryFeature__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__SolitaryFeature__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__SolitaryFeature__Group__0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__SolitaryFeature__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__SolitaryFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0_in_ruleSolitaryFeature274);
            rule__SolitaryFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolitaryFeature"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString301);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString334);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleGroup EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup361);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Group__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Group__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0_in_ruleGroup394);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleGroupedFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleGroupedFeature : ruleGroupedFeature EOF ;
    public final void entryRuleGroupedFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleGroupedFeature EOF
            {
             before(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature421);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupedFeature"


    // $ANTLR start "ruleGroupedFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleGroupedFeature : ( ( rule__GroupedFeature__Group__0 ) ) ;
    public final void ruleGroupedFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__GroupedFeature__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__GroupedFeature__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__GroupedFeature__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__GroupedFeature__Group__0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__GroupedFeature__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__GroupedFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0_in_ruleGroupedFeature454);
            rule__GroupedFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupedFeature"


    // $ANTLR start "entryRuleBinaryOperation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleBinaryOperation : ruleBinaryOperation EOF ;
    public final void entryRuleBinaryOperation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleBinaryOperation EOF
            {
             before(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation481);
            ruleBinaryOperation();

            state._fsp--;

             after(grammarAccess.getBinaryOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryOperation"


    // $ANTLR start "ruleBinaryOperation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleBinaryOperation : ( ( rule__BinaryOperation__Group__0 ) ) ;
    public final void ruleBinaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__BinaryOperation__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__BinaryOperation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__BinaryOperation__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__BinaryOperation__Group__0 )
            {
             before(grammarAccess.getBinaryOperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__BinaryOperation__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__BinaryOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0_in_ruleBinaryOperation514);
            rule__BinaryOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperation"


    // $ANTLR start "entryRuleUnaryOperation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleUnaryOperation EOF
            {
             before(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation541);
            ruleUnaryOperation();

            state._fsp--;

             after(grammarAccess.getUnaryOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryOperation"


    // $ANTLR start "ruleUnaryOperation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Group__0 ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__UnaryOperation__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__UnaryOperation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__UnaryOperation__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__UnaryOperation__Group__0 )
            {
             before(grammarAccess.getUnaryOperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__UnaryOperation__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__UnaryOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation574);
            rule__UnaryOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperation"


    // $ANTLR start "entryRuleNULL"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleNULL : ruleNULL EOF ;
    public final void entryRuleNULL() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleNULL EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleNULL EOF
            {
             before(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL601);
            ruleNULL();

            state._fsp--;

             after(grammarAccess.getNULLRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNULL"


    // $ANTLR start "ruleNULL"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleNULL : ( ( rule__NULL__Group__0 ) ) ;
    public final void ruleNULL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__NULL__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__NULL__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__NULL__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__NULL__Group__0 )
            {
             before(grammarAccess.getNULLAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__NULL__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__NULL__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0_in_ruleNULL634);
            rule__NULL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNULLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNULL"


    // $ANTLR start "entryRuleNumber"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleNumber EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber661);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Number__ValueAssignment )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Number__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__ValueAssignment_in_ruleNumber694);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier721);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__Identifier__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__Identifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier754);
            rule__Identifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleEInt EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt781);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt814);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleBinaryOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ruleBinaryOperator : ( ( rule__BinaryOperator__Alternatives ) ) ;
    public final void ruleBinaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( ( ( rule__BinaryOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( rule__BinaryOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( ( rule__BinaryOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ( rule__BinaryOperator__Alternatives )
            {
             before(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:434:1: ( rule__BinaryOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:434:2: rule__BinaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator853);
            rule__BinaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:451:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( rule__UnaryOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:453:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator889);
            rule__UnaryOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleSimpleType"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: ( rule__SimpleType__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:472:2: rule__SimpleType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType925);
            rule__SimpleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "ruleSolitaryType"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ruleSolitaryType : ( ( rule__SolitaryType__Alternatives ) ) ;
    public final void ruleSolitaryType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( ( ( rule__SolitaryType__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ( ( rule__SolitaryType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ( ( rule__SolitaryType__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ( rule__SolitaryType__Alternatives )
            {
             before(grammarAccess.getSolitaryTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ( rule__SolitaryType__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:2: rule__SolitaryType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType961);
            rule__SolitaryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolitaryType"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: rule__Feature__Alternatives : ( ( ruleSolitaryFeature ) | ( ruleGroupedFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( ( ruleSolitaryFeature ) | ( ruleGroupedFeature ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( ruleSolitaryFeature )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( ruleSolitaryFeature )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: ruleSolitaryFeature
                    {
                     before(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives996);
                    ruleSolitaryFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:513:6: ( ruleGroupedFeature )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:513:6: ( ruleGroupedFeature )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ruleGroupedFeature
                    {
                     before(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1013);
                    ruleGroupedFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: rule__Expression__Alternatives : ( ( ruleBinaryOperation ) | ( ruleUnaryOperation ) | ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( ( ruleBinaryOperation ) | ( ruleUnaryOperation ) | ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 45:
                {
                alt2=2;
                }
                break;
            case 47:
                {
                alt2=3;
                }
                break;
            case RULE_INT:
            case 50:
                {
                alt2=4;
                }
                break;
            case 48:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( ruleBinaryOperation )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( ruleBinaryOperation )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: ruleBinaryOperation
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Expression__Alternatives1045);
                    ruleBinaryOperation();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:535:6: ( ruleUnaryOperation )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:535:6: ( ruleUnaryOperation )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ruleUnaryOperation
                    {
                     before(grammarAccess.getExpressionAccess().getUnaryOperationParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__Expression__Alternatives1062);
                    ruleUnaryOperation();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getUnaryOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:541:6: ( ruleNULL )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:541:6: ( ruleNULL )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:542:1: ruleNULL
                    {
                     before(grammarAccess.getExpressionAccess().getNULLParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_rule__Expression__Alternatives1079);
                    ruleNULL();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNULLParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:6: ( ruleNumber )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:6: ( ruleNumber )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ruleNumber
                    {
                     before(grammarAccess.getExpressionAccess().getNumberParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__Expression__Alternatives1096);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNumberParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:6: ( ruleIdentifier )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:6: ( ruleIdentifier )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ruleIdentifier
                    {
                     before(grammarAccess.getExpressionAccess().getIdentifierParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__Expression__Alternatives1113);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIdentifierParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__SolitaryFeature__Alternatives_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: rule__SolitaryFeature__Alternatives_3 : ( ( ( rule__SolitaryFeature__Group_3_0__0 ) ) | ( ( rule__SolitaryFeature__Group_3_1__0 ) ) );
    public final void rule__SolitaryFeature__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( ( rule__SolitaryFeature__Group_3_0__0 ) ) | ( ( rule__SolitaryFeature__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==33) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( rule__SolitaryFeature__Group_3_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( rule__SolitaryFeature__Group_3_0__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__SolitaryFeature__Group_3_0__0 )
                    {
                     before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( rule__SolitaryFeature__Group_3_0__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__SolitaryFeature__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__0_in_rule__SolitaryFeature__Alternatives_31145);
                    rule__SolitaryFeature__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:575:6: ( ( rule__SolitaryFeature__Group_3_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:575:6: ( ( rule__SolitaryFeature__Group_3_1__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( rule__SolitaryFeature__Group_3_1__0 )
                    {
                     before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( rule__SolitaryFeature__Group_3_1__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: rule__SolitaryFeature__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__0_in_rule__SolitaryFeature__Alternatives_31163);
                    rule__SolitaryFeature__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Alternatives_3"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:586:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1196); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:597:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:597:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1213); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__GroupedFeature__Alternatives_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: rule__GroupedFeature__Alternatives_2 : ( ( ( rule__GroupedFeature__Group_2_0__0 ) ) | ( ( rule__GroupedFeature__Group_2_1__0 ) ) );
    public final void rule__GroupedFeature__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ( ( ( rule__GroupedFeature__Group_2_0__0 ) ) | ( ( rule__GroupedFeature__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( ( rule__GroupedFeature__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: ( ( rule__GroupedFeature__Group_2_0__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:614:1: ( rule__GroupedFeature__Group_2_0__0 )
                    {
                     before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: ( rule__GroupedFeature__Group_2_0__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:615:2: rule__GroupedFeature__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__0_in_rule__GroupedFeature__Alternatives_21245);
                    rule__GroupedFeature__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:619:6: ( ( rule__GroupedFeature__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:619:6: ( ( rule__GroupedFeature__Group_2_1__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: ( rule__GroupedFeature__Group_2_1__0 )
                    {
                     before(grammarAccess.getGroupedFeatureAccess().getGroup_2_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:621:1: ( rule__GroupedFeature__Group_2_1__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:621:2: rule__GroupedFeature__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__0_in_rule__GroupedFeature__Alternatives_21263);
                    rule__GroupedFeature__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupedFeatureAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Alternatives_2"


    // $ANTLR start "rule__BinaryOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: rule__BinaryOperator__Alternatives : ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) | ( ( 'And' ) ) | ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) | ( ( 'Or' ) ) );
    public final void rule__BinaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) | ( ( 'And' ) ) | ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) | ( ( 'Or' ) ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( 'Equals' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( 'Equals' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( 'Equals' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( 'Equals' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:638:3: 'Equals'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__BinaryOperator__Alternatives1298); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:643:6: ( ( 'Higher' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:643:6: ( ( 'Higher' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( 'Higher' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( 'Higher' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:645:3: 'Higher'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__BinaryOperator__Alternatives1319); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getHigherEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:6: ( ( 'Lower' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:6: ( ( 'Lower' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( 'Lower' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ( 'Lower' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:652:3: 'Lower'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__BinaryOperator__Alternatives1340); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getLowerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:657:6: ( ( 'And' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:657:6: ( ( 'And' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( 'And' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAndEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( 'And' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:659:3: 'And'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__BinaryOperator__Alternatives1361); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getAndEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:6: ( ( 'Add' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:6: ( ( 'Add' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( 'Add' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getAddEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( 'Add' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:3: 'Add'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__BinaryOperator__Alternatives1382); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getAddEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:6: ( ( 'Subtract' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:6: ( ( 'Subtract' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( 'Subtract' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getSubtractEnumLiteralDeclaration_5()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( 'Subtract' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:3: 'Subtract'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__BinaryOperator__Alternatives1403); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getSubtractEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:678:6: ( ( 'Divide' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:678:6: ( ( 'Divide' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( 'Divide' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getDivideEnumLiteralDeclaration_6()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( 'Divide' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:680:3: 'Divide'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__BinaryOperator__Alternatives1424); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getDivideEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:685:6: ( ( 'Multiply' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:685:6: ( ( 'Multiply' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( 'Multiply' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getMultiplyEnumLiteralDeclaration_7()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( 'Multiply' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:687:3: 'Multiply'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__BinaryOperator__Alternatives1445); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getMultiplyEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:692:6: ( ( 'Or' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:692:6: ( ( 'Or' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( 'Or' )
                    {
                     before(grammarAccess.getBinaryOperatorAccess().getOrEnumLiteralDeclaration_8()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ( 'Or' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:694:3: 'Or'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__BinaryOperator__Alternatives1466); 

                    }

                     after(grammarAccess.getBinaryOperatorAccess().getOrEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: rule__UnaryOperator__Alternatives : ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( ( 'Not' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( ( 'Not' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: ( 'Not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:711:1: ( 'Not' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:711:3: 'Not'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__UnaryOperator__Alternatives1502); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:716:6: ( ( 'Minus' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:716:6: ( ( 'Minus' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: ( 'Minus' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( 'Minus' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:718:3: 'Minus'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__UnaryOperator__Alternatives1523); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperator__Alternatives"


    // $ANTLR start "rule__SimpleType__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: rule__SimpleType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( ( 'boolean' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( 'boolean' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:3: 'boolean'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__SimpleType__Alternatives1559); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:6: ( ( 'int' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:6: ( ( 'int' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( 'int' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:3: 'int'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleType__Alternatives1580); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( ( 'double' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( ( 'double' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( 'double' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:3: 'double'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleType__Alternatives1601); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:754:6: ( ( 'String' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:754:6: ( ( 'String' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( 'String' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:3: 'String'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__SimpleType__Alternatives1622); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Alternatives"


    // $ANTLR start "rule__SolitaryType__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: rule__SolitaryType__Alternatives : ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) );
    public final void rule__SolitaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ( 'Optional' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( ( 'Optional' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( 'Optional' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( 'Optional' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:3: 'Optional'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__SolitaryType__Alternatives1658); 

                    }

                     after(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:778:6: ( ( 'Mandatory' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:778:6: ( ( 'Mandatory' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:779:1: ( 'Mandatory' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( 'Mandatory' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:3: 'Mandatory'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__SolitaryType__Alternatives1679); 

                    }

                     after(grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01712);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01715);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:809:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:828:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11773);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11776);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( 'Model' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: ( 'Model' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Model__Group__1__Impl1804); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:859:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21835);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21838);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Model__Group__2__Impl1866); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:890:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31897);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31900);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:901:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( rule__Model__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:904:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1927);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41958);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Model__Group__4__Impl1986); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02027);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02030);
            rule__Model__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: rule__Model__Group_3__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group_3__0__Impl2058); 
             after(grammarAccess.getModelAccess().getRootKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:990:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12089);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12092);
            rule__Model__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( ( ( rule__Model__RootFeatureAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__Model__RootFeatureAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:1: ( rule__Model__RootFeatureAssignment_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:2: rule__Model__RootFeatureAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2119);
            rule__Model__RootFeatureAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootFeatureAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ( rule__Model__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22149);
            rule__Model__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__Group_3_2__0 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( ( rule__Model__Group_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( ( rule__Model__Group_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( ( rule__Model__Group_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__Model__Group_3_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( rule__Model__Group_3_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: rule__Model__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2176);
            	    rule__Model__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Model__Group_3_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: rule__Model__Group_3_2__0 : rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 ;
    public final void rule__Model__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:2: rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02213);
            rule__Model__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02216);
            rule__Model__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_2__0"


    // $ANTLR start "rule__Model__Group_3_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: rule__Model__Group_3_2__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group_3_2__0__Impl2244); 
             after(grammarAccess.getModelAccess().getRootKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_2__0__Impl"


    // $ANTLR start "rule__Model__Group_3_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: rule__Model__Group_3_2__1 : rule__Model__Group_3_2__1__Impl ;
    public final void rule__Model__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( rule__Model__Group_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:2: rule__Model__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12275);
            rule__Model__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_2__1"


    // $ANTLR start "rule__Model__Group_3_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: rule__Model__Group_3_2__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) ;
    public final void rule__Model__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: ( ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:2: rule__Model__RootFeatureAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2302);
            rule__Model__RootFeatureAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getRootFeatureAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_3_2__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: rule__SolitaryFeature__Group__0 : rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 ;
    public final void rule__SolitaryFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: ( rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:2: rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02336);
            rule__SolitaryFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02339);
            rule__SolitaryFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__0"


    // $ANTLR start "rule__SolitaryFeature__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: rule__SolitaryFeature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__SolitaryFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( ( 'feature' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( 'feature' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( 'feature' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: 'feature'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SolitaryFeature__Group__0__Impl2367); 
             after(grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: rule__SolitaryFeature__Group__1 : rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 ;
    public final void rule__SolitaryFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:2: rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12398);
            rule__SolitaryFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12401);
            rule__SolitaryFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__1"


    // $ANTLR start "rule__SolitaryFeature__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: rule__SolitaryFeature__Group__1__Impl : ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) ;
    public final void rule__SolitaryFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:2: rule__SolitaryFeature__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2428);
                    rule__SolitaryFeature__RequiredAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getRequiredAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: rule__SolitaryFeature__Group__2 : rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 ;
    public final void rule__SolitaryFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:2: rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22459);
            rule__SolitaryFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22462);
            rule__SolitaryFeature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__2"


    // $ANTLR start "rule__SolitaryFeature__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: rule__SolitaryFeature__Group__2__Impl : ( ( rule__SolitaryFeature__NameAssignment_2 ) ) ;
    public final void rule__SolitaryFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( ( ( rule__SolitaryFeature__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( ( rule__SolitaryFeature__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( ( rule__SolitaryFeature__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( rule__SolitaryFeature__NameAssignment_2 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( rule__SolitaryFeature__NameAssignment_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:2: rule__SolitaryFeature__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__NameAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2489);
            rule__SolitaryFeature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__2__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: rule__SolitaryFeature__Group__3 : rule__SolitaryFeature__Group__3__Impl ;
    public final void rule__SolitaryFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: ( rule__SolitaryFeature__Group__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:2: rule__SolitaryFeature__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32519);
            rule__SolitaryFeature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__3"


    // $ANTLR start "rule__SolitaryFeature__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: rule__SolitaryFeature__Group__3__Impl : ( ( rule__SolitaryFeature__Alternatives_3 ) ) ;
    public final void rule__SolitaryFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( ( ( rule__SolitaryFeature__Alternatives_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( ( rule__SolitaryFeature__Alternatives_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:1: ( ( rule__SolitaryFeature__Alternatives_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( rule__SolitaryFeature__Alternatives_3 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getAlternatives_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( rule__SolitaryFeature__Alternatives_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:2: rule__SolitaryFeature__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Alternatives_3_in_rule__SolitaryFeature__Group__3__Impl2546);
            rule__SolitaryFeature__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__3__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: rule__SolitaryFeature__Group_3_0__0 : rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1 ;
    public final void rule__SolitaryFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: ( rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:2: rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__0__Impl_in_rule__SolitaryFeature__Group_3_0__02584);
            rule__SolitaryFeature__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__1_in_rule__SolitaryFeature__Group_3_0__02587);
            rule__SolitaryFeature__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: rule__SolitaryFeature__Group_3_0__0__Impl : ( '=>' ) ;
    public final void rule__SolitaryFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( ( '=>' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( '=>' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ( '=>' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: '=>'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getEqualsSignGreaterThanSignKeyword_3_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SolitaryFeature__Group_3_0__0__Impl2615); 
             after(grammarAccess.getSolitaryFeatureAccess().getEqualsSignGreaterThanSignKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: rule__SolitaryFeature__Group_3_0__1 : rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2 ;
    public final void rule__SolitaryFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:2: rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__1__Impl_in_rule__SolitaryFeature__Group_3_0__12646);
            rule__SolitaryFeature__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__2_in_rule__SolitaryFeature__Group_3_0__12649);
            rule__SolitaryFeature__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:1: rule__SolitaryFeature__Group_3_0__1__Impl : ( ( rule__SolitaryFeature__Group_3_0_1__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: ( ( ( rule__SolitaryFeature__Group_3_0_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( rule__SolitaryFeature__Group_3_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1284:1: ( ( rule__SolitaryFeature__Group_3_0_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( rule__SolitaryFeature__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( rule__SolitaryFeature__Group_3_0_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:2: rule__SolitaryFeature__Group_3_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__0_in_rule__SolitaryFeature__Group_3_0__1__Impl2676);
                    rule__SolitaryFeature__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: rule__SolitaryFeature__Group_3_0__2 : rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3 ;
    public final void rule__SolitaryFeature__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: ( rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:2: rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__2__Impl_in_rule__SolitaryFeature__Group_3_0__22707);
            rule__SolitaryFeature__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__3_in_rule__SolitaryFeature__Group_3_0__22710);
            rule__SolitaryFeature__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__2"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: rule__SolitaryFeature__Group_3_0__2__Impl : ( ( rule__SolitaryFeature__Group_3_0_2__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ( ( ( rule__SolitaryFeature__Group_3_0_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: ( ( rule__SolitaryFeature__Group_3_0_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: ( ( rule__SolitaryFeature__Group_3_0_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: ( rule__SolitaryFeature__Group_3_0_2__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( rule__SolitaryFeature__Group_3_0_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33||LA14_0==51) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:2: rule__SolitaryFeature__Group_3_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__0_in_rule__SolitaryFeature__Group_3_0__2__Impl2737);
                    rule__SolitaryFeature__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__2__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__SolitaryFeature__Group_3_0__3 : rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4 ;
    public final void rule__SolitaryFeature__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:2: rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__3__Impl_in_rule__SolitaryFeature__Group_3_0__32768);
            rule__SolitaryFeature__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__4_in_rule__SolitaryFeature__Group_3_0__32771);
            rule__SolitaryFeature__Group_3_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__3"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: rule__SolitaryFeature__Group_3_0__3__Impl : ( ( rule__SolitaryFeature__Group_3_0_3__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ( ( rule__SolitaryFeature__Group_3_0_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( ( rule__SolitaryFeature__Group_3_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( ( rule__SolitaryFeature__Group_3_0_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ( rule__SolitaryFeature__Group_3_0_3__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ( rule__SolitaryFeature__Group_3_0_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:2: rule__SolitaryFeature__Group_3_0_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__0_in_rule__SolitaryFeature__Group_3_0__3__Impl2798);
                    rule__SolitaryFeature__Group_3_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__3__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: rule__SolitaryFeature__Group_3_0__4 : rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5 ;
    public final void rule__SolitaryFeature__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:2: rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__4__Impl_in_rule__SolitaryFeature__Group_3_0__42829);
            rule__SolitaryFeature__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__5_in_rule__SolitaryFeature__Group_3_0__42832);
            rule__SolitaryFeature__Group_3_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__4"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: rule__SolitaryFeature__Group_3_0__4__Impl : ( ( rule__SolitaryFeature__Group_3_0_4__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( ( ( rule__SolitaryFeature__Group_3_0_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ( rule__SolitaryFeature__Group_3_0_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ( rule__SolitaryFeature__Group_3_0_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ( rule__SolitaryFeature__Group_3_0_4__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: ( rule__SolitaryFeature__Group_3_0_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:2: rule__SolitaryFeature__Group_3_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__0_in_rule__SolitaryFeature__Group_3_0__4__Impl2859);
                    rule__SolitaryFeature__Group_3_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__4__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: rule__SolitaryFeature__Group_3_0__5 : rule__SolitaryFeature__Group_3_0__5__Impl ;
    public final void rule__SolitaryFeature__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( rule__SolitaryFeature__Group_3_0__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:2: rule__SolitaryFeature__Group_3_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__5__Impl_in_rule__SolitaryFeature__Group_3_0__52890);
            rule__SolitaryFeature__Group_3_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__5"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0__5__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: rule__SolitaryFeature__Group_3_0__5__Impl : ( ';' ) ;
    public final void rule__SolitaryFeature__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: ( ';' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: ( ';' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ';'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getSemicolonKeyword_3_0_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SolitaryFeature__Group_3_0__5__Impl2918); 
             after(grammarAccess.getSolitaryFeatureAccess().getSemicolonKeyword_3_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0__5__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: rule__SolitaryFeature__Group_3_0_1__0 : rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1 ;
    public final void rule__SolitaryFeature__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:2: rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__0__Impl_in_rule__SolitaryFeature__Group_3_0_1__02961);
            rule__SolitaryFeature__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__1_in_rule__SolitaryFeature__Group_3_0_1__02964);
            rule__SolitaryFeature__Group_3_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_1__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__SolitaryFeature__Group_3_0_1__0__Impl : ( 'type' ) ;
    public final void rule__SolitaryFeature__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( 'type' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: 'type'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeKeyword_3_0_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__SolitaryFeature__Group_3_0_1__0__Impl2992); 
             after(grammarAccess.getSolitaryFeatureAccess().getTypeKeyword_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: rule__SolitaryFeature__Group_3_0_1__1 : rule__SolitaryFeature__Group_3_0_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: ( rule__SolitaryFeature__Group_3_0_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:2: rule__SolitaryFeature__Group_3_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__1__Impl_in_rule__SolitaryFeature__Group_3_0_1__13023);
            rule__SolitaryFeature__Group_3_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_1__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__SolitaryFeature__Group_3_0_1__1__Impl : ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_3_0_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:1: ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1474:2: rule__SolitaryFeature__TypeAssignment_3_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__TypeAssignment_3_0_1_1_in_rule__SolitaryFeature__Group_3_0_1__1__Impl3050);
            rule__SolitaryFeature__TypeAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: rule__SolitaryFeature__Group_3_0_2__0 : rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1 ;
    public final void rule__SolitaryFeature__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:2: rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_2__03084);
            rule__SolitaryFeature__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__1_in_rule__SolitaryFeature__Group_3_0_2__03087);
            rule__SolitaryFeature__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_2__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: rule__SolitaryFeature__Group_3_0_2__0__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_0 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1505:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_2_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:2: rule__SolitaryFeature__GroupsAssignment_3_0_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_2_0_in_rule__SolitaryFeature__Group_3_0_2__0__Impl3114);
            rule__SolitaryFeature__GroupsAssignment_3_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: rule__SolitaryFeature__Group_3_0_2__1 : rule__SolitaryFeature__Group_3_0_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( rule__SolitaryFeature__Group_3_0_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:2: rule__SolitaryFeature__Group_3_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_2__13144);
            rule__SolitaryFeature__Group_3_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_2__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: rule__SolitaryFeature__Group_3_0_2__1__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_1 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_2_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33||LA17_0==51) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:2: rule__SolitaryFeature__GroupsAssignment_3_0_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_2_1_in_rule__SolitaryFeature__Group_3_0_2__1__Impl3171);
            	    rule__SolitaryFeature__GroupsAssignment_3_0_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: rule__SolitaryFeature__Group_3_0_3__0 : rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1 ;
    public final void rule__SolitaryFeature__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:2: rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_3__03206);
            rule__SolitaryFeature__Group_3_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__1_in_rule__SolitaryFeature__Group_3_0_3__03209);
            rule__SolitaryFeature__Group_3_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_3__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: rule__SolitaryFeature__Group_3_0_3__0__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1566:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_3_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:2: rule__SolitaryFeature__FeaturesAssignment_3_0_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_3_0_in_rule__SolitaryFeature__Group_3_0_3__0__Impl3236);
            rule__SolitaryFeature__FeaturesAssignment_3_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_3__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: rule__SolitaryFeature__Group_3_0_3__1 : rule__SolitaryFeature__Group_3_0_3__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: ( rule__SolitaryFeature__Group_3_0_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:2: rule__SolitaryFeature__Group_3_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_3__13266);
            rule__SolitaryFeature__Group_3_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_3__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:1: rule__SolitaryFeature__Group_3_0_3__1__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:2: rule__SolitaryFeature__FeaturesAssignment_3_0_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_3_1_in_rule__SolitaryFeature__Group_3_0_3__1__Impl3293);
            	    rule__SolitaryFeature__FeaturesAssignment_3_0_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_3__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: rule__SolitaryFeature__Group_3_0_4__0 : rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1 ;
    public final void rule__SolitaryFeature__Group_3_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:2: rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__0__Impl_in_rule__SolitaryFeature__Group_3_0_4__03328);
            rule__SolitaryFeature__Group_3_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__1_in_rule__SolitaryFeature__Group_3_0_4__03331);
            rule__SolitaryFeature__Group_3_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: rule__SolitaryFeature__Group_3_0_4__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__0__Impl3359); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: rule__SolitaryFeature__Group_3_0_4__1 : rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2 ;
    public final void rule__SolitaryFeature__Group_3_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:2: rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__1__Impl_in_rule__SolitaryFeature__Group_3_0_4__13390);
            rule__SolitaryFeature__Group_3_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__2_in_rule__SolitaryFeature__Group_3_0_4__13393);
            rule__SolitaryFeature__Group_3_0_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: rule__SolitaryFeature__Group_3_0_4__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:2: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1_in_rule__SolitaryFeature__Group_3_0_4__1__Impl3420);
            rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: rule__SolitaryFeature__Group_3_0_4__2 : rule__SolitaryFeature__Group_3_0_4__2__Impl rule__SolitaryFeature__Group_3_0_4__3 ;
    public final void rule__SolitaryFeature__Group_3_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( rule__SolitaryFeature__Group_3_0_4__2__Impl rule__SolitaryFeature__Group_3_0_4__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:2: rule__SolitaryFeature__Group_3_0_4__2__Impl rule__SolitaryFeature__Group_3_0_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__2__Impl_in_rule__SolitaryFeature__Group_3_0_4__23450);
            rule__SolitaryFeature__Group_3_0_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__3_in_rule__SolitaryFeature__Group_3_0_4__23453);
            rule__SolitaryFeature__Group_3_0_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__2"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: rule__SolitaryFeature__Group_3_0_4__2__Impl : ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: ( rule__SolitaryFeature__Group_3_0_4_2__0 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: ( rule__SolitaryFeature__Group_3_0_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:2: rule__SolitaryFeature__Group_3_0_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0_in_rule__SolitaryFeature__Group_3_0_4__2__Impl3480);
            	    rule__SolitaryFeature__Group_3_0_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__2__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: rule__SolitaryFeature__Group_3_0_4__3 : rule__SolitaryFeature__Group_3_0_4__3__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( rule__SolitaryFeature__Group_3_0_4__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:2: rule__SolitaryFeature__Group_3_0_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__3__Impl_in_rule__SolitaryFeature__Group_3_0_4__33511);
            rule__SolitaryFeature__Group_3_0_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__3"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: rule__SolitaryFeature__Group_3_0_4__3__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1714:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__3__Impl3539); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4__3__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: rule__SolitaryFeature__Group_3_0_4_2__0 : rule__SolitaryFeature__Group_3_0_4_2__0__Impl rule__SolitaryFeature__Group_3_0_4_2__1 ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__SolitaryFeature__Group_3_0_4_2__0__Impl rule__SolitaryFeature__Group_3_0_4_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:2: rule__SolitaryFeature__Group_3_0_4_2__0__Impl rule__SolitaryFeature__Group_3_0_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__03578);
            rule__SolitaryFeature__Group_3_0_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1_in_rule__SolitaryFeature__Group_3_0_4_2__03581);
            rule__SolitaryFeature__Group_3_0_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_2__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__SolitaryFeature__Group_3_0_4_2__0__Impl : ( ',' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ','
            {
             before(grammarAccess.getSolitaryFeatureAccess().getCommaKeyword_3_0_4_2_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SolitaryFeature__Group_3_0_4_2__0__Impl3609); 
             after(grammarAccess.getSolitaryFeatureAccess().getCommaKeyword_3_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_2__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__SolitaryFeature__Group_3_0_4_2__1 : rule__SolitaryFeature__Group_3_0_4_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( rule__SolitaryFeature__Group_3_0_4_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:2: rule__SolitaryFeature__Group_3_0_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__13640);
            rule__SolitaryFeature__Group_3_0_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_2__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: rule__SolitaryFeature__Group_3_0_4_2__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:2: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1_in_rule__SolitaryFeature__Group_3_0_4_2__1__Impl3667);
            rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_2__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: rule__SolitaryFeature__Group_3_1__0 : rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1 ;
    public final void rule__SolitaryFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:1: ( rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1805:2: rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__0__Impl_in_rule__SolitaryFeature__Group_3_1__03701);
            rule__SolitaryFeature__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__1_in_rule__SolitaryFeature__Group_3_1__03704);
            rule__SolitaryFeature__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_1__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__SolitaryFeature__Group_3_1__0__Impl : ( '=' ) ;
    public final void rule__SolitaryFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( '=' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( '=' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: '='
            {
             before(grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__SolitaryFeature__Group_3_1__0__Impl3732); 
             after(grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_1__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__SolitaryFeature__Group_3_1__1 : rule__SolitaryFeature__Group_3_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( rule__SolitaryFeature__Group_3_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:2: rule__SolitaryFeature__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__1__Impl_in_rule__SolitaryFeature__Group_3_1__13763);
            rule__SolitaryFeature__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_1__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:1: rule__SolitaryFeature__Group_3_1__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:2: rule__SolitaryFeature__ConstraintsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_1_1_in_rule__SolitaryFeature__Group_3_1__1__Impl3790);
            rule__SolitaryFeature__ConstraintsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_3_1__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__03824);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__03827);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__Group__Group__0__Impl : ( ( rule__Group__InclusiveAssignment_0 )? ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( ( rule__Group__InclusiveAssignment_0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( ( rule__Group__InclusiveAssignment_0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( ( rule__Group__InclusiveAssignment_0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Group__InclusiveAssignment_0 )?
            {
             before(grammarAccess.getGroupAccess().getInclusiveAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( rule__Group__InclusiveAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==51) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__Group__InclusiveAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__InclusiveAssignment_0_in_rule__Group__Group__0__Impl3854);
                    rule__Group__InclusiveAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getInclusiveAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__13885);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__13888);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: rule__Group__Group__1__Impl : ( '=>' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: ( ( '=>' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( '=>' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: ( '=>' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: '=>'
            {
             before(grammarAccess.getGroupAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Group__Group__1__Impl3916); 
             after(grammarAccess.getGroupAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__23947);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__23950);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: rule__Group__Group__2__Impl : ( ( rule__Group__GroupedFeaturesAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( ( ( rule__Group__GroupedFeaturesAssignment_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( rule__Group__GroupedFeaturesAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ( rule__Group__GroupedFeaturesAssignment_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( rule__Group__GroupedFeaturesAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Group__GroupedFeaturesAssignment_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:2: rule__Group__GroupedFeaturesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_2_in_rule__Group__Group__2__Impl3977);
            rule__Group__GroupedFeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__34007);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__34010);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: rule__Group__Group__3__Impl : ( ( rule__Group__GroupedFeaturesAssignment_3 )* ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ( ( rule__Group__GroupedFeaturesAssignment_3 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( ( rule__Group__GroupedFeaturesAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( ( rule__Group__GroupedFeaturesAssignment_3 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: ( rule__Group__GroupedFeaturesAssignment_3 )*
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Group__GroupedFeaturesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:2: rule__Group__GroupedFeaturesAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl4037);
            	    rule__Group__GroupedFeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: rule__Group__Group__4 : rule__Group__Group__4__Impl ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( rule__Group__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:2: rule__Group__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44068);
            rule__Group__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: rule__Group__Group__4__Impl : ( ';' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( ';' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ( ';' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ';'
            {
             before(grammarAccess.getGroupAccess().getSemicolonKeyword_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Group__Group__4__Impl4096); 
             after(grammarAccess.getGroupAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__GroupedFeature__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:1: rule__GroupedFeature__Group__0 : rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 ;
    public final void rule__GroupedFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ( rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:2: rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04137);
            rule__GroupedFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04140);
            rule__GroupedFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__0"


    // $ANTLR start "rule__GroupedFeature__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: rule__GroupedFeature__Group__0__Impl : ( () ) ;
    public final void rule__GroupedFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ()
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: 
            {
            }

             after(grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: rule__GroupedFeature__Group__1 : rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 ;
    public final void rule__GroupedFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:2: rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14198);
            rule__GroupedFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14201);
            rule__GroupedFeature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__1"


    // $ANTLR start "rule__GroupedFeature__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__GroupedFeature__Group__1__Impl : ( ( rule__GroupedFeature__NameAssignment_1 ) ) ;
    public final void rule__GroupedFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ( ( rule__GroupedFeature__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( rule__GroupedFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( rule__GroupedFeature__NameAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:2: rule__GroupedFeature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4228);
            rule__GroupedFeature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: rule__GroupedFeature__Group__2 : rule__GroupedFeature__Group__2__Impl ;
    public final void rule__GroupedFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( rule__GroupedFeature__Group__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:2: rule__GroupedFeature__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24258);
            rule__GroupedFeature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__2"


    // $ANTLR start "rule__GroupedFeature__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: rule__GroupedFeature__Group__2__Impl : ( ( rule__GroupedFeature__Alternatives_2 ) ) ;
    public final void rule__GroupedFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: ( ( ( rule__GroupedFeature__Alternatives_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( ( rule__GroupedFeature__Alternatives_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( ( rule__GroupedFeature__Alternatives_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: ( rule__GroupedFeature__Alternatives_2 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( rule__GroupedFeature__Alternatives_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:2: rule__GroupedFeature__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Alternatives_2_in_rule__GroupedFeature__Group__2__Impl4285);
            rule__GroupedFeature__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: rule__GroupedFeature__Group_2_0__0 : rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1 ;
    public final void rule__GroupedFeature__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:1: ( rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:2: rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__0__Impl_in_rule__GroupedFeature__Group_2_0__04321);
            rule__GroupedFeature__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__1_in_rule__GroupedFeature__Group_2_0__04324);
            rule__GroupedFeature__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: rule__GroupedFeature__Group_2_0__0__Impl : ( '=>' ) ;
    public final void rule__GroupedFeature__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( ( '=>' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: ( '=>' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: ( '=>' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: '=>'
            {
             before(grammarAccess.getGroupedFeatureAccess().getEqualsSignGreaterThanSignKeyword_2_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__GroupedFeature__Group_2_0__0__Impl4352); 
             after(grammarAccess.getGroupedFeatureAccess().getEqualsSignGreaterThanSignKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: rule__GroupedFeature__Group_2_0__1 : rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2 ;
    public final void rule__GroupedFeature__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:2: rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__1__Impl_in_rule__GroupedFeature__Group_2_0__14383);
            rule__GroupedFeature__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__2_in_rule__GroupedFeature__Group_2_0__14386);
            rule__GroupedFeature__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: rule__GroupedFeature__Group_2_0__1__Impl : ( ( rule__GroupedFeature__Group_2_0_1__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( ( ( rule__GroupedFeature__Group_2_0_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ( ( rule__GroupedFeature__Group_2_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ( ( rule__GroupedFeature__Group_2_0_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:1: ( rule__GroupedFeature__Group_2_0_1__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( rule__GroupedFeature__Group_2_0_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:2: rule__GroupedFeature__Group_2_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__0_in_rule__GroupedFeature__Group_2_0__1__Impl4413);
                    rule__GroupedFeature__Group_2_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: rule__GroupedFeature__Group_2_0__2 : rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3 ;
    public final void rule__GroupedFeature__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:2: rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__2__Impl_in_rule__GroupedFeature__Group_2_0__24444);
            rule__GroupedFeature__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__3_in_rule__GroupedFeature__Group_2_0__24447);
            rule__GroupedFeature__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__2"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2187:1: rule__GroupedFeature__Group_2_0__2__Impl : ( ( rule__GroupedFeature__Group_2_0_2__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: ( ( ( rule__GroupedFeature__Group_2_0_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( rule__GroupedFeature__Group_2_0_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( rule__GroupedFeature__Group_2_0_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( rule__GroupedFeature__Group_2_0_2__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__GroupedFeature__Group_2_0_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:2: rule__GroupedFeature__Group_2_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__0_in_rule__GroupedFeature__Group_2_0__2__Impl4474);
                    rule__GroupedFeature__Group_2_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: rule__GroupedFeature__Group_2_0__3 : rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4 ;
    public final void rule__GroupedFeature__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:2: rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__3__Impl_in_rule__GroupedFeature__Group_2_0__34505);
            rule__GroupedFeature__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__4_in_rule__GroupedFeature__Group_2_0__34508);
            rule__GroupedFeature__Group_2_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__3"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: rule__GroupedFeature__Group_2_0__3__Impl : ( ( rule__GroupedFeature__Group_2_0_3__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: ( ( ( rule__GroupedFeature__Group_2_0_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( rule__GroupedFeature__Group_2_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( rule__GroupedFeature__Group_2_0_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( rule__GroupedFeature__Group_2_0_3__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__GroupedFeature__Group_2_0_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:2: rule__GroupedFeature__Group_2_0_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__0_in_rule__GroupedFeature__Group_2_0__3__Impl4535);
                    rule__GroupedFeature__Group_2_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__3__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: rule__GroupedFeature__Group_2_0__4 : rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5 ;
    public final void rule__GroupedFeature__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: ( rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:2: rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__4__Impl_in_rule__GroupedFeature__Group_2_0__44566);
            rule__GroupedFeature__Group_2_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__5_in_rule__GroupedFeature__Group_2_0__44569);
            rule__GroupedFeature__Group_2_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__4"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: rule__GroupedFeature__Group_2_0__4__Impl : ( ( rule__GroupedFeature__Group_2_0_4__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( ( ( rule__GroupedFeature__Group_2_0_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( ( rule__GroupedFeature__Group_2_0_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( ( rule__GroupedFeature__Group_2_0_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:1: ( rule__GroupedFeature__Group_2_0_4__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( rule__GroupedFeature__Group_2_0_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:2: rule__GroupedFeature__Group_2_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__0_in_rule__GroupedFeature__Group_2_0__4__Impl4596);
                    rule__GroupedFeature__Group_2_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__4__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__GroupedFeature__Group_2_0__5 : rule__GroupedFeature__Group_2_0__5__Impl ;
    public final void rule__GroupedFeature__Group_2_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( rule__GroupedFeature__Group_2_0__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:2: rule__GroupedFeature__Group_2_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__5__Impl_in_rule__GroupedFeature__Group_2_0__54627);
            rule__GroupedFeature__Group_2_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__5"


    // $ANTLR start "rule__GroupedFeature__Group_2_0__5__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: rule__GroupedFeature__Group_2_0__5__Impl : ( ';' ) ;
    public final void rule__GroupedFeature__Group_2_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( ';' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( ';' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ';'
            {
             before(grammarAccess.getGroupedFeatureAccess().getSemicolonKeyword_2_0_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__GroupedFeature__Group_2_0__5__Impl4655); 
             after(grammarAccess.getGroupedFeatureAccess().getSemicolonKeyword_2_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0__5__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: rule__GroupedFeature__Group_2_0_1__0 : rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1 ;
    public final void rule__GroupedFeature__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:2: rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__0__Impl_in_rule__GroupedFeature__Group_2_0_1__04698);
            rule__GroupedFeature__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__1_in_rule__GroupedFeature__Group_2_0_1__04701);
            rule__GroupedFeature__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_1__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: rule__GroupedFeature__Group_2_0_1__0__Impl : ( 'type' ) ;
    public final void rule__GroupedFeature__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( 'type' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: 'type'
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GroupedFeature__Group_2_0_1__0__Impl4729); 
             after(grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: rule__GroupedFeature__Group_2_0_1__1 : rule__GroupedFeature__Group_2_0_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ( rule__GroupedFeature__Group_2_0_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:2: rule__GroupedFeature__Group_2_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__1__Impl_in_rule__GroupedFeature__Group_2_0_1__14760);
            rule__GroupedFeature__Group_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_1__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__GroupedFeature__Group_2_0_1__1__Impl : ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: ( rule__GroupedFeature__TypeAssignment_2_0_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeAssignment_2_0_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( rule__GroupedFeature__TypeAssignment_2_0_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:2: rule__GroupedFeature__TypeAssignment_2_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__TypeAssignment_2_0_1_1_in_rule__GroupedFeature__Group_2_0_1__1__Impl4787);
            rule__GroupedFeature__TypeAssignment_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getTypeAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: rule__GroupedFeature__Group_2_0_2__0 : rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1 ;
    public final void rule__GroupedFeature__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:2: rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__0__Impl_in_rule__GroupedFeature__Group_2_0_2__04821);
            rule__GroupedFeature__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__1_in_rule__GroupedFeature__Group_2_0_2__04824);
            rule__GroupedFeature__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: rule__GroupedFeature__Group_2_0_2__0__Impl : ( 'groups' ) ;
    public final void rule__GroupedFeature__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: ( ( 'groups' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( 'groups' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( 'groups' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: 'groups'
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsKeyword_2_0_2_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__GroupedFeature__Group_2_0_2__0__Impl4852); 
             after(grammarAccess.getGroupedFeatureAccess().getGroupsKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: rule__GroupedFeature__Group_2_0_2__1 : rule__GroupedFeature__Group_2_0_2__1__Impl rule__GroupedFeature__Group_2_0_2__2 ;
    public final void rule__GroupedFeature__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( rule__GroupedFeature__Group_2_0_2__1__Impl rule__GroupedFeature__Group_2_0_2__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:2: rule__GroupedFeature__Group_2_0_2__1__Impl rule__GroupedFeature__Group_2_0_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__1__Impl_in_rule__GroupedFeature__Group_2_0_2__14883);
            rule__GroupedFeature__Group_2_0_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__2_in_rule__GroupedFeature__Group_2_0_2__14886);
            rule__GroupedFeature__Group_2_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: rule__GroupedFeature__Group_2_0_2__1__Impl : ( '{' ) ;
    public final void rule__GroupedFeature__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: '{'
            {
             before(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_2_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__GroupedFeature__Group_2_0_2__1__Impl4914); 
             after(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__GroupedFeature__Group_2_0_2__2 : rule__GroupedFeature__Group_2_0_2__2__Impl rule__GroupedFeature__Group_2_0_2__3 ;
    public final void rule__GroupedFeature__Group_2_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( rule__GroupedFeature__Group_2_0_2__2__Impl rule__GroupedFeature__Group_2_0_2__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:2: rule__GroupedFeature__Group_2_0_2__2__Impl rule__GroupedFeature__Group_2_0_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__2__Impl_in_rule__GroupedFeature__Group_2_0_2__24945);
            rule__GroupedFeature__Group_2_0_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__3_in_rule__GroupedFeature__Group_2_0_2__24948);
            rule__GroupedFeature__Group_2_0_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__2"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__GroupedFeature__Group_2_0_2__2__Impl : ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_2 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_2 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:2: rule__GroupedFeature__GroupsAssignment_2_0_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_2_in_rule__GroupedFeature__Group_2_0_2__2__Impl4975);
            rule__GroupedFeature__GroupsAssignment_2_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: rule__GroupedFeature__Group_2_0_2__3 : rule__GroupedFeature__Group_2_0_2__3__Impl rule__GroupedFeature__Group_2_0_2__4 ;
    public final void rule__GroupedFeature__Group_2_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( rule__GroupedFeature__Group_2_0_2__3__Impl rule__GroupedFeature__Group_2_0_2__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:2: rule__GroupedFeature__Group_2_0_2__3__Impl rule__GroupedFeature__Group_2_0_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__3__Impl_in_rule__GroupedFeature__Group_2_0_2__35005);
            rule__GroupedFeature__Group_2_0_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__4_in_rule__GroupedFeature__Group_2_0_2__35008);
            rule__GroupedFeature__Group_2_0_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__3"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:1: rule__GroupedFeature__Group_2_0_2__3__Impl : ( ( rule__GroupedFeature__Group_2_0_2_3__0 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ( ( rule__GroupedFeature__Group_2_0_2_3__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( ( rule__GroupedFeature__Group_2_0_2_3__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( ( rule__GroupedFeature__Group_2_0_2_3__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__GroupedFeature__Group_2_0_2_3__0 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_2_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( rule__GroupedFeature__Group_2_0_2_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:2: rule__GroupedFeature__Group_2_0_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2_3__0_in_rule__GroupedFeature__Group_2_0_2__3__Impl5035);
            	    rule__GroupedFeature__Group_2_0_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__3__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: rule__GroupedFeature__Group_2_0_2__4 : rule__GroupedFeature__Group_2_0_2__4__Impl ;
    public final void rule__GroupedFeature__Group_2_0_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: ( rule__GroupedFeature__Group_2_0_2__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2492:2: rule__GroupedFeature__Group_2_0_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__4__Impl_in_rule__GroupedFeature__Group_2_0_2__45066);
            rule__GroupedFeature__Group_2_0_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__4"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: rule__GroupedFeature__Group_2_0_2__4__Impl : ( '}' ) ;
    public final void rule__GroupedFeature__Group_2_0_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: '}'
            {
             before(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_2_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__GroupedFeature__Group_2_0_2__4__Impl5094); 
             after(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2__4__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:1: rule__GroupedFeature__Group_2_0_2_3__0 : rule__GroupedFeature__Group_2_0_2_3__0__Impl rule__GroupedFeature__Group_2_0_2_3__1 ;
    public final void rule__GroupedFeature__Group_2_0_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( rule__GroupedFeature__Group_2_0_2_3__0__Impl rule__GroupedFeature__Group_2_0_2_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:2: rule__GroupedFeature__Group_2_0_2_3__0__Impl rule__GroupedFeature__Group_2_0_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2_3__0__Impl_in_rule__GroupedFeature__Group_2_0_2_3__05135);
            rule__GroupedFeature__Group_2_0_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2_3__1_in_rule__GroupedFeature__Group_2_0_2_3__05138);
            rule__GroupedFeature__Group_2_0_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2_3__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: rule__GroupedFeature__Group_2_0_2_3__0__Impl : ( ',' ) ;
    public final void rule__GroupedFeature__Group_2_0_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: ','
            {
             before(grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_2_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__GroupedFeature__Group_2_0_2_3__0__Impl5166); 
             after(grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2_3__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: rule__GroupedFeature__Group_2_0_2_3__1 : rule__GroupedFeature__Group_2_0_2_3__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( rule__GroupedFeature__Group_2_0_2_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:2: rule__GroupedFeature__Group_2_0_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2_3__1__Impl_in_rule__GroupedFeature__Group_2_0_2_3__15197);
            rule__GroupedFeature__Group_2_0_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2_3__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_2_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: rule__GroupedFeature__Group_2_0_2_3__1__Impl : ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: ( ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2575:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2576:2: rule__GroupedFeature__GroupsAssignment_2_0_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_3_1_in_rule__GroupedFeature__Group_2_0_2_3__1__Impl5224);
            rule__GroupedFeature__GroupsAssignment_2_0_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_2_3__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: rule__GroupedFeature__Group_2_0_3__0 : rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1 ;
    public final void rule__GroupedFeature__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:2: rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__0__Impl_in_rule__GroupedFeature__Group_2_0_3__05258);
            rule__GroupedFeature__Group_2_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__1_in_rule__GroupedFeature__Group_2_0_3__05261);
            rule__GroupedFeature__Group_2_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: rule__GroupedFeature__Group_2_0_3__0__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2608:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2609:2: rule__GroupedFeature__FeaturesAssignment_2_0_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_0_in_rule__GroupedFeature__Group_2_0_3__0__Impl5288);
            rule__GroupedFeature__FeaturesAssignment_2_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: rule__GroupedFeature__Group_2_0_3__1 : rule__GroupedFeature__Group_2_0_3__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: ( rule__GroupedFeature__Group_2_0_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:2: rule__GroupedFeature__Group_2_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__1__Impl_in_rule__GroupedFeature__Group_2_0_3__15318);
            rule__GroupedFeature__Group_2_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: rule__GroupedFeature__Group_2_0_3__1__Impl : ( ( rule__GroupedFeature__Group_2_0_3_1__0 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( ( ( rule__GroupedFeature__Group_2_0_3_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( rule__GroupedFeature__Group_2_0_3_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: ( ( rule__GroupedFeature__Group_2_0_3_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2636:1: ( rule__GroupedFeature__Group_2_0_3_1__0 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( rule__GroupedFeature__Group_2_0_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:2: rule__GroupedFeature__Group_2_0_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3_1__0_in_rule__GroupedFeature__Group_2_0_3__1__Impl5345);
            	    rule__GroupedFeature__Group_2_0_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: rule__GroupedFeature__Group_2_0_3_1__0 : rule__GroupedFeature__Group_2_0_3_1__0__Impl rule__GroupedFeature__Group_2_0_3_1__1 ;
    public final void rule__GroupedFeature__Group_2_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( rule__GroupedFeature__Group_2_0_3_1__0__Impl rule__GroupedFeature__Group_2_0_3_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:2: rule__GroupedFeature__Group_2_0_3_1__0__Impl rule__GroupedFeature__Group_2_0_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3_1__0__Impl_in_rule__GroupedFeature__Group_2_0_3_1__05380);
            rule__GroupedFeature__Group_2_0_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3_1__1_in_rule__GroupedFeature__Group_2_0_3_1__05383);
            rule__GroupedFeature__Group_2_0_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3_1__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: rule__GroupedFeature__Group_2_0_3_1__0__Impl : ( ',' ) ;
    public final void rule__GroupedFeature__Group_2_0_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: ','
            {
             before(grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_3_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__GroupedFeature__Group_2_0_3_1__0__Impl5411); 
             after(grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3_1__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: rule__GroupedFeature__Group_2_0_3_1__1 : rule__GroupedFeature__Group_2_0_3_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: ( rule__GroupedFeature__Group_2_0_3_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:2: rule__GroupedFeature__Group_2_0_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3_1__1__Impl_in_rule__GroupedFeature__Group_2_0_3_1__15442);
            rule__GroupedFeature__Group_2_0_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3_1__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: rule__GroupedFeature__Group_2_0_3_1__1__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:2: rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1_in_rule__GroupedFeature__Group_2_0_3_1__1__Impl5469);
            rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_3_1__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2714:1: rule__GroupedFeature__Group_2_0_4__0 : rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1 ;
    public final void rule__GroupedFeature__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:1: ( rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:2: rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__0__Impl_in_rule__GroupedFeature__Group_2_0_4__05503);
            rule__GroupedFeature__Group_2_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__1_in_rule__GroupedFeature__Group_2_0_4__05506);
            rule__GroupedFeature__Group_2_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: rule__GroupedFeature__Group_2_0_4__0__Impl : ( 'constraints' ) ;
    public final void rule__GroupedFeature__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ( ( 'constraints' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: ( 'constraints' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: ( 'constraints' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: 'constraints'
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsKeyword_2_0_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__GroupedFeature__Group_2_0_4__0__Impl5534); 
             after(grammarAccess.getGroupedFeatureAccess().getConstraintsKeyword_2_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: rule__GroupedFeature__Group_2_0_4__1 : rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2 ;
    public final void rule__GroupedFeature__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:2: rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__1__Impl_in_rule__GroupedFeature__Group_2_0_4__15565);
            rule__GroupedFeature__Group_2_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__2_in_rule__GroupedFeature__Group_2_0_4__15568);
            rule__GroupedFeature__Group_2_0_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: rule__GroupedFeature__Group_2_0_4__1__Impl : ( '{' ) ;
    public final void rule__GroupedFeature__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: '{'
            {
             before(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_4_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__GroupedFeature__Group_2_0_4__1__Impl5596); 
             after(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: rule__GroupedFeature__Group_2_0_4__2 : rule__GroupedFeature__Group_2_0_4__2__Impl rule__GroupedFeature__Group_2_0_4__3 ;
    public final void rule__GroupedFeature__Group_2_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( rule__GroupedFeature__Group_2_0_4__2__Impl rule__GroupedFeature__Group_2_0_4__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:2: rule__GroupedFeature__Group_2_0_4__2__Impl rule__GroupedFeature__Group_2_0_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__2__Impl_in_rule__GroupedFeature__Group_2_0_4__25627);
            rule__GroupedFeature__Group_2_0_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__3_in_rule__GroupedFeature__Group_2_0_4__25630);
            rule__GroupedFeature__Group_2_0_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__2"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:1: rule__GroupedFeature__Group_2_0_4__2__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2794:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:2: rule__GroupedFeature__ConstraintsAssignment_2_0_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_in_rule__GroupedFeature__Group_2_0_4__2__Impl5657);
            rule__GroupedFeature__ConstraintsAssignment_2_0_4_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: rule__GroupedFeature__Group_2_0_4__3 : rule__GroupedFeature__Group_2_0_4__3__Impl rule__GroupedFeature__Group_2_0_4__4 ;
    public final void rule__GroupedFeature__Group_2_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: ( rule__GroupedFeature__Group_2_0_4__3__Impl rule__GroupedFeature__Group_2_0_4__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2810:2: rule__GroupedFeature__Group_2_0_4__3__Impl rule__GroupedFeature__Group_2_0_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__3__Impl_in_rule__GroupedFeature__Group_2_0_4__35687);
            rule__GroupedFeature__Group_2_0_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__4_in_rule__GroupedFeature__Group_2_0_4__35690);
            rule__GroupedFeature__Group_2_0_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__3"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: rule__GroupedFeature__Group_2_0_4__3__Impl : ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( rule__GroupedFeature__Group_2_0_4_3__0 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: ( rule__GroupedFeature__Group_2_0_4_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==37) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:2: rule__GroupedFeature__Group_2_0_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0_in_rule__GroupedFeature__Group_2_0_4__3__Impl5717);
            	    rule__GroupedFeature__Group_2_0_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__3__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: rule__GroupedFeature__Group_2_0_4__4 : rule__GroupedFeature__Group_2_0_4__4__Impl ;
    public final void rule__GroupedFeature__Group_2_0_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: ( rule__GroupedFeature__Group_2_0_4__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:2: rule__GroupedFeature__Group_2_0_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__4__Impl_in_rule__GroupedFeature__Group_2_0_4__45748);
            rule__GroupedFeature__Group_2_0_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__4"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: rule__GroupedFeature__Group_2_0_4__4__Impl : ( '}' ) ;
    public final void rule__GroupedFeature__Group_2_0_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: '}'
            {
             before(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_4_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__GroupedFeature__Group_2_0_4__4__Impl5776); 
             after(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4__4__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: rule__GroupedFeature__Group_2_0_4_3__0 : rule__GroupedFeature__Group_2_0_4_3__0__Impl rule__GroupedFeature__Group_2_0_4_3__1 ;
    public final void rule__GroupedFeature__Group_2_0_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( rule__GroupedFeature__Group_2_0_4_3__0__Impl rule__GroupedFeature__Group_2_0_4_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:2: rule__GroupedFeature__Group_2_0_4_3__0__Impl rule__GroupedFeature__Group_2_0_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0__Impl_in_rule__GroupedFeature__Group_2_0_4_3__05817);
            rule__GroupedFeature__Group_2_0_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1_in_rule__GroupedFeature__Group_2_0_4_3__05820);
            rule__GroupedFeature__Group_2_0_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_3__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: rule__GroupedFeature__Group_2_0_4_3__0__Impl : ( ',' ) ;
    public final void rule__GroupedFeature__Group_2_0_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: ','
            {
             before(grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_4_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__GroupedFeature__Group_2_0_4_3__0__Impl5848); 
             after(grammarAccess.getGroupedFeatureAccess().getCommaKeyword_2_0_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_3__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: rule__GroupedFeature__Group_2_0_4_3__1 : rule__GroupedFeature__Group_2_0_4_3__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( rule__GroupedFeature__Group_2_0_4_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:2: rule__GroupedFeature__Group_2_0_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1__Impl_in_rule__GroupedFeature__Group_2_0_4_3__15879);
            rule__GroupedFeature__Group_2_0_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_3__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: rule__GroupedFeature__Group_2_0_4_3__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:2: rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1_in_rule__GroupedFeature__Group_2_0_4_3__1__Impl5906);
            rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_3__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: rule__GroupedFeature__Group_2_1__0 : rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1 ;
    public final void rule__GroupedFeature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:2: rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__0__Impl_in_rule__GroupedFeature__Group_2_1__05940);
            rule__GroupedFeature__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__1_in_rule__GroupedFeature__Group_2_1__05943);
            rule__GroupedFeature__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_1__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: rule__GroupedFeature__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__GroupedFeature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( '=' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( '=' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: '='
            {
             before(grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__GroupedFeature__Group_2_1__0__Impl5971); 
             after(grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_1__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: rule__GroupedFeature__Group_2_1__1 : rule__GroupedFeature__Group_2_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( rule__GroupedFeature__Group_2_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:2: rule__GroupedFeature__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__1__Impl_in_rule__GroupedFeature__Group_2_1__16002);
            rule__GroupedFeature__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_1__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: rule__GroupedFeature__Group_2_1__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:2: rule__GroupedFeature__ConstraintsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_1_1_in_rule__GroupedFeature__Group_2_1__1__Impl6029);
            rule__GroupedFeature__ConstraintsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_1__1__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: rule__BinaryOperation__Group__0 : rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 ;
    public final void rule__BinaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:2: rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__06063);
            rule__BinaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__06066);
            rule__BinaryOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__0"


    // $ANTLR start "rule__BinaryOperation__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: rule__BinaryOperation__Group__0__Impl : ( 'BinaryOperation' ) ;
    public final void rule__BinaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: ( ( 'BinaryOperation' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( 'BinaryOperation' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( 'BinaryOperation' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: 'BinaryOperation'
            {
             before(grammarAccess.getBinaryOperationAccess().getBinaryOperationKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__BinaryOperation__Group__0__Impl6094); 
             after(grammarAccess.getBinaryOperationAccess().getBinaryOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__0__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: rule__BinaryOperation__Group__1 : rule__BinaryOperation__Group__1__Impl rule__BinaryOperation__Group__2 ;
    public final void rule__BinaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( rule__BinaryOperation__Group__1__Impl rule__BinaryOperation__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:2: rule__BinaryOperation__Group__1__Impl rule__BinaryOperation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16125);
            rule__BinaryOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__2_in_rule__BinaryOperation__Group__16128);
            rule__BinaryOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__1"


    // $ANTLR start "rule__BinaryOperation__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: rule__BinaryOperation__Group__1__Impl : ( '{' ) ;
    public final void rule__BinaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3048:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: '{'
            {
             before(grammarAccess.getBinaryOperationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__BinaryOperation__Group__1__Impl6156); 
             after(grammarAccess.getBinaryOperationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__1__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: rule__BinaryOperation__Group__2 : rule__BinaryOperation__Group__2__Impl rule__BinaryOperation__Group__3 ;
    public final void rule__BinaryOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( rule__BinaryOperation__Group__2__Impl rule__BinaryOperation__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:2: rule__BinaryOperation__Group__2__Impl rule__BinaryOperation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__2__Impl_in_rule__BinaryOperation__Group__26187);
            rule__BinaryOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__3_in_rule__BinaryOperation__Group__26190);
            rule__BinaryOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__2"


    // $ANTLR start "rule__BinaryOperation__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: rule__BinaryOperation__Group__2__Impl : ( 'operator' ) ;
    public final void rule__BinaryOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: ( ( 'operator' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( 'operator' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( 'operator' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: 'operator'
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__BinaryOperation__Group__2__Impl6218); 
             after(grammarAccess.getBinaryOperationAccess().getOperatorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__2__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: rule__BinaryOperation__Group__3 : rule__BinaryOperation__Group__3__Impl rule__BinaryOperation__Group__4 ;
    public final void rule__BinaryOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:1: ( rule__BinaryOperation__Group__3__Impl rule__BinaryOperation__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:2: rule__BinaryOperation__Group__3__Impl rule__BinaryOperation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__3__Impl_in_rule__BinaryOperation__Group__36249);
            rule__BinaryOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__4_in_rule__BinaryOperation__Group__36252);
            rule__BinaryOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__3"


    // $ANTLR start "rule__BinaryOperation__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: rule__BinaryOperation__Group__3__Impl : ( ( rule__BinaryOperation__OperatorAssignment_3 ) ) ;
    public final void rule__BinaryOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( ( ( rule__BinaryOperation__OperatorAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ( ( rule__BinaryOperation__OperatorAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ( ( rule__BinaryOperation__OperatorAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:1: ( rule__BinaryOperation__OperatorAssignment_3 )
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3112:1: ( rule__BinaryOperation__OperatorAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3112:2: rule__BinaryOperation__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__OperatorAssignment_3_in_rule__BinaryOperation__Group__3__Impl6279);
            rule__BinaryOperation__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__3__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: rule__BinaryOperation__Group__4 : rule__BinaryOperation__Group__4__Impl rule__BinaryOperation__Group__5 ;
    public final void rule__BinaryOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3126:1: ( rule__BinaryOperation__Group__4__Impl rule__BinaryOperation__Group__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:2: rule__BinaryOperation__Group__4__Impl rule__BinaryOperation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__4__Impl_in_rule__BinaryOperation__Group__46309);
            rule__BinaryOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__5_in_rule__BinaryOperation__Group__46312);
            rule__BinaryOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__4"


    // $ANTLR start "rule__BinaryOperation__Group__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: rule__BinaryOperation__Group__4__Impl : ( 'rexp' ) ;
    public final void rule__BinaryOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ( ( 'rexp' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( 'rexp' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3139:1: ( 'rexp' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: 'rexp'
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpKeyword_4()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__BinaryOperation__Group__4__Impl6340); 
             after(grammarAccess.getBinaryOperationAccess().getRexpKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__4__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3153:1: rule__BinaryOperation__Group__5 : rule__BinaryOperation__Group__5__Impl rule__BinaryOperation__Group__6 ;
    public final void rule__BinaryOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( rule__BinaryOperation__Group__5__Impl rule__BinaryOperation__Group__6 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:2: rule__BinaryOperation__Group__5__Impl rule__BinaryOperation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__5__Impl_in_rule__BinaryOperation__Group__56371);
            rule__BinaryOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__6_in_rule__BinaryOperation__Group__56374);
            rule__BinaryOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__5"


    // $ANTLR start "rule__BinaryOperation__Group__5__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: rule__BinaryOperation__Group__5__Impl : ( ( rule__BinaryOperation__RexpAssignment_5 ) ) ;
    public final void rule__BinaryOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: ( ( ( rule__BinaryOperation__RexpAssignment_5 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( ( rule__BinaryOperation__RexpAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( ( rule__BinaryOperation__RexpAssignment_5 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( rule__BinaryOperation__RexpAssignment_5 )
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAssignment_5()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( rule__BinaryOperation__RexpAssignment_5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:2: rule__BinaryOperation__RexpAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__RexpAssignment_5_in_rule__BinaryOperation__Group__5__Impl6401);
            rule__BinaryOperation__RexpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationAccess().getRexpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__5__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__6"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: rule__BinaryOperation__Group__6 : rule__BinaryOperation__Group__6__Impl rule__BinaryOperation__Group__7 ;
    public final void rule__BinaryOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: ( rule__BinaryOperation__Group__6__Impl rule__BinaryOperation__Group__7 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:2: rule__BinaryOperation__Group__6__Impl rule__BinaryOperation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__6__Impl_in_rule__BinaryOperation__Group__66431);
            rule__BinaryOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__7_in_rule__BinaryOperation__Group__66434);
            rule__BinaryOperation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__6"


    // $ANTLR start "rule__BinaryOperation__Group__6__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: rule__BinaryOperation__Group__6__Impl : ( 'lexp' ) ;
    public final void rule__BinaryOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ( ( 'lexp' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( 'lexp' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: ( 'lexp' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: 'lexp'
            {
             before(grammarAccess.getBinaryOperationAccess().getLexpKeyword_6()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__BinaryOperation__Group__6__Impl6462); 
             after(grammarAccess.getBinaryOperationAccess().getLexpKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__6__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__7"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: rule__BinaryOperation__Group__7 : rule__BinaryOperation__Group__7__Impl rule__BinaryOperation__Group__8 ;
    public final void rule__BinaryOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( rule__BinaryOperation__Group__7__Impl rule__BinaryOperation__Group__8 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:2: rule__BinaryOperation__Group__7__Impl rule__BinaryOperation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__7__Impl_in_rule__BinaryOperation__Group__76493);
            rule__BinaryOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__8_in_rule__BinaryOperation__Group__76496);
            rule__BinaryOperation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__7"


    // $ANTLR start "rule__BinaryOperation__Group__7__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3225:1: rule__BinaryOperation__Group__7__Impl : ( ( rule__BinaryOperation__LexpAssignment_7 ) ) ;
    public final void rule__BinaryOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( ( ( rule__BinaryOperation__LexpAssignment_7 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( ( rule__BinaryOperation__LexpAssignment_7 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: ( ( rule__BinaryOperation__LexpAssignment_7 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( rule__BinaryOperation__LexpAssignment_7 )
            {
             before(grammarAccess.getBinaryOperationAccess().getLexpAssignment_7()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: ( rule__BinaryOperation__LexpAssignment_7 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:2: rule__BinaryOperation__LexpAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__LexpAssignment_7_in_rule__BinaryOperation__Group__7__Impl6523);
            rule__BinaryOperation__LexpAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationAccess().getLexpAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__7__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__8"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: rule__BinaryOperation__Group__8 : rule__BinaryOperation__Group__8__Impl ;
    public final void rule__BinaryOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3246:1: ( rule__BinaryOperation__Group__8__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:2: rule__BinaryOperation__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__8__Impl_in_rule__BinaryOperation__Group__86553);
            rule__BinaryOperation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__8"


    // $ANTLR start "rule__BinaryOperation__Group__8__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: rule__BinaryOperation__Group__8__Impl : ( '}' ) ;
    public final void rule__BinaryOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: '}'
            {
             before(grammarAccess.getBinaryOperationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BinaryOperation__Group__8__Impl6581); 
             after(grammarAccess.getBinaryOperationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group__8__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06630);
            rule__UnaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06633);
            rule__UnaryOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__0"


    // $ANTLR start "rule__UnaryOperation__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: rule__UnaryOperation__Group__0__Impl : ( 'UnaryOperation' ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: ( ( 'UnaryOperation' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: ( 'UnaryOperation' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: ( 'UnaryOperation' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: 'UnaryOperation'
            {
             before(grammarAccess.getUnaryOperationAccess().getUnaryOperationKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__UnaryOperation__Group__0__Impl6661); 
             after(grammarAccess.getUnaryOperationAccess().getUnaryOperationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__0__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl rule__UnaryOperation__Group__2 ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: ( rule__UnaryOperation__Group__1__Impl rule__UnaryOperation__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:2: rule__UnaryOperation__Group__1__Impl rule__UnaryOperation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__16692);
            rule__UnaryOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__2_in_rule__UnaryOperation__Group__16695);
            rule__UnaryOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__1"


    // $ANTLR start "rule__UnaryOperation__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: rule__UnaryOperation__Group__1__Impl : ( '{' ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: '{'
            {
             before(grammarAccess.getUnaryOperationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__UnaryOperation__Group__1__Impl6723); 
             after(grammarAccess.getUnaryOperationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__1__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3352:1: rule__UnaryOperation__Group__2 : rule__UnaryOperation__Group__2__Impl rule__UnaryOperation__Group__3 ;
    public final void rule__UnaryOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( rule__UnaryOperation__Group__2__Impl rule__UnaryOperation__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:2: rule__UnaryOperation__Group__2__Impl rule__UnaryOperation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__2__Impl_in_rule__UnaryOperation__Group__26754);
            rule__UnaryOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__3_in_rule__UnaryOperation__Group__26757);
            rule__UnaryOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__2"


    // $ANTLR start "rule__UnaryOperation__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: rule__UnaryOperation__Group__2__Impl : ( 'operator' ) ;
    public final void rule__UnaryOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: ( ( 'operator' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( 'operator' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( 'operator' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: 'operator'
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__UnaryOperation__Group__2__Impl6785); 
             after(grammarAccess.getUnaryOperationAccess().getOperatorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__2__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: rule__UnaryOperation__Group__3 : rule__UnaryOperation__Group__3__Impl rule__UnaryOperation__Group__4 ;
    public final void rule__UnaryOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: ( rule__UnaryOperation__Group__3__Impl rule__UnaryOperation__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:2: rule__UnaryOperation__Group__3__Impl rule__UnaryOperation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__3__Impl_in_rule__UnaryOperation__Group__36816);
            rule__UnaryOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__4_in_rule__UnaryOperation__Group__36819);
            rule__UnaryOperation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__3"


    // $ANTLR start "rule__UnaryOperation__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: rule__UnaryOperation__Group__3__Impl : ( ( rule__UnaryOperation__OperatorAssignment_3 ) ) ;
    public final void rule__UnaryOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: ( ( ( rule__UnaryOperation__OperatorAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( ( rule__UnaryOperation__OperatorAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( ( rule__UnaryOperation__OperatorAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: ( rule__UnaryOperation__OperatorAssignment_3 )
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: ( rule__UnaryOperation__OperatorAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:2: rule__UnaryOperation__OperatorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_3_in_rule__UnaryOperation__Group__3__Impl6846);
            rule__UnaryOperation__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__3__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: rule__UnaryOperation__Group__4 : rule__UnaryOperation__Group__4__Impl rule__UnaryOperation__Group__5 ;
    public final void rule__UnaryOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( rule__UnaryOperation__Group__4__Impl rule__UnaryOperation__Group__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:2: rule__UnaryOperation__Group__4__Impl rule__UnaryOperation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__4__Impl_in_rule__UnaryOperation__Group__46876);
            rule__UnaryOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__5_in_rule__UnaryOperation__Group__46879);
            rule__UnaryOperation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__4"


    // $ANTLR start "rule__UnaryOperation__Group__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: rule__UnaryOperation__Group__4__Impl : ( 'exp' ) ;
    public final void rule__UnaryOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( ( 'exp' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( 'exp' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: ( 'exp' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: 'exp'
            {
             before(grammarAccess.getUnaryOperationAccess().getExpKeyword_4()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__UnaryOperation__Group__4__Impl6907); 
             after(grammarAccess.getUnaryOperationAccess().getExpKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__4__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: rule__UnaryOperation__Group__5 : rule__UnaryOperation__Group__5__Impl rule__UnaryOperation__Group__6 ;
    public final void rule__UnaryOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( rule__UnaryOperation__Group__5__Impl rule__UnaryOperation__Group__6 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:2: rule__UnaryOperation__Group__5__Impl rule__UnaryOperation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__5__Impl_in_rule__UnaryOperation__Group__56938);
            rule__UnaryOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__6_in_rule__UnaryOperation__Group__56941);
            rule__UnaryOperation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__5"


    // $ANTLR start "rule__UnaryOperation__Group__5__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: rule__UnaryOperation__Group__5__Impl : ( ( rule__UnaryOperation__ExpAssignment_5 ) ) ;
    public final void rule__UnaryOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3459:1: ( ( ( rule__UnaryOperation__ExpAssignment_5 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( rule__UnaryOperation__ExpAssignment_5 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( rule__UnaryOperation__ExpAssignment_5 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( rule__UnaryOperation__ExpAssignment_5 )
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAssignment_5()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: ( rule__UnaryOperation__ExpAssignment_5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:2: rule__UnaryOperation__ExpAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__ExpAssignment_5_in_rule__UnaryOperation__Group__5__Impl6968);
            rule__UnaryOperation__ExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperationAccess().getExpAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__5__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__6"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: rule__UnaryOperation__Group__6 : rule__UnaryOperation__Group__6__Impl ;
    public final void rule__UnaryOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( rule__UnaryOperation__Group__6__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:2: rule__UnaryOperation__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__6__Impl_in_rule__UnaryOperation__Group__66998);
            rule__UnaryOperation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__6"


    // $ANTLR start "rule__UnaryOperation__Group__6__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: rule__UnaryOperation__Group__6__Impl : ( '}' ) ;
    public final void rule__UnaryOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3487:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3488:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: '}'
            {
             before(grammarAccess.getUnaryOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__UnaryOperation__Group__6__Impl7026); 
             after(grammarAccess.getUnaryOperationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__Group__6__Impl"


    // $ANTLR start "rule__NULL__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: rule__NULL__Group__0 : rule__NULL__Group__0__Impl rule__NULL__Group__1 ;
    public final void rule__NULL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3520:1: ( rule__NULL__Group__0__Impl rule__NULL__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:2: rule__NULL__Group__0__Impl rule__NULL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__07071);
            rule__NULL__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__07074);
            rule__NULL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NULL__Group__0"


    // $ANTLR start "rule__NULL__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:1: rule__NULL__Group__0__Impl : ( () ) ;
    public final void rule__NULL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3532:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ()
            {
             before(grammarAccess.getNULLAccess().getNULLAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: 
            {
            }

             after(grammarAccess.getNULLAccess().getNULLAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NULL__Group__0__Impl"


    // $ANTLR start "rule__NULL__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3547:1: rule__NULL__Group__1 : rule__NULL__Group__1__Impl ;
    public final void rule__NULL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3551:1: ( rule__NULL__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:2: rule__NULL__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__17132);
            rule__NULL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NULL__Group__1"


    // $ANTLR start "rule__NULL__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: rule__NULL__Group__1__Impl : ( 'NULL' ) ;
    public final void rule__NULL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: ( ( 'NULL' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: ( 'NULL' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3563:1: ( 'NULL' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: 'NULL'
            {
             before(grammarAccess.getNULLAccess().getNULLKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__NULL__Group__1__Impl7160); 
             after(grammarAccess.getNULLAccess().getNULLKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NULL__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__07195);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__07198);
            rule__Identifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0"


    // $ANTLR start "rule__Identifier__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3593:1: rule__Identifier__Group__0__Impl : ( 'Identifier' ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( ( 'Identifier' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: ( 'Identifier' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: ( 'Identifier' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: 'Identifier'
            {
             before(grammarAccess.getIdentifierAccess().getIdentifierKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__Identifier__Group__0__Impl7226); 
             after(grammarAccess.getIdentifierAccess().getIdentifierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__0__Impl"


    // $ANTLR start "rule__Identifier__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl rule__Identifier__Group__2 ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ( rule__Identifier__Group__1__Impl rule__Identifier__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:2: rule__Identifier__Group__1__Impl rule__Identifier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__17257);
            rule__Identifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__2_in_rule__Identifier__Group__17260);
            rule__Identifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1"


    // $ANTLR start "rule__Identifier__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__NameAssignment_1 ) ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( ( ( rule__Identifier__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( rule__Identifier__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( rule__Identifier__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( rule__Identifier__NameAssignment_1 )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( rule__Identifier__NameAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:2: rule__Identifier__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__NameAssignment_1_in_rule__Identifier__Group__1__Impl7287);
            rule__Identifier__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__1__Impl"


    // $ANTLR start "rule__Identifier__Group__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: rule__Identifier__Group__2 : rule__Identifier__Group__2__Impl rule__Identifier__Group__3 ;
    public final void rule__Identifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( rule__Identifier__Group__2__Impl rule__Identifier__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:2: rule__Identifier__Group__2__Impl rule__Identifier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__2__Impl_in_rule__Identifier__Group__27317);
            rule__Identifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__3_in_rule__Identifier__Group__27320);
            rule__Identifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__2"


    // $ANTLR start "rule__Identifier__Group__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: rule__Identifier__Group__2__Impl : ( '{' ) ;
    public final void rule__Identifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3659:1: '{'
            {
             before(grammarAccess.getIdentifierAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Identifier__Group__2__Impl7348); 
             after(grammarAccess.getIdentifierAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__2__Impl"


    // $ANTLR start "rule__Identifier__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: rule__Identifier__Group__3 : rule__Identifier__Group__3__Impl rule__Identifier__Group__4 ;
    public final void rule__Identifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( rule__Identifier__Group__3__Impl rule__Identifier__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:2: rule__Identifier__Group__3__Impl rule__Identifier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__3__Impl_in_rule__Identifier__Group__37379);
            rule__Identifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__4_in_rule__Identifier__Group__37382);
            rule__Identifier__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__3"


    // $ANTLR start "rule__Identifier__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: rule__Identifier__Group__3__Impl : ( 'ref' ) ;
    public final void rule__Identifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: ( ( 'ref' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( 'ref' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( 'ref' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: 'ref'
            {
             before(grammarAccess.getIdentifierAccess().getRefKeyword_3()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__Identifier__Group__3__Impl7410); 
             after(grammarAccess.getIdentifierAccess().getRefKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__3__Impl"


    // $ANTLR start "rule__Identifier__Group__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: rule__Identifier__Group__4 : rule__Identifier__Group__4__Impl rule__Identifier__Group__5 ;
    public final void rule__Identifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( rule__Identifier__Group__4__Impl rule__Identifier__Group__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:2: rule__Identifier__Group__4__Impl rule__Identifier__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__4__Impl_in_rule__Identifier__Group__47441);
            rule__Identifier__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__5_in_rule__Identifier__Group__47444);
            rule__Identifier__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__4"


    // $ANTLR start "rule__Identifier__Group__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: rule__Identifier__Group__4__Impl : ( ( rule__Identifier__RefAssignment_4 ) ) ;
    public final void rule__Identifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: ( ( ( rule__Identifier__RefAssignment_4 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: ( ( rule__Identifier__RefAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: ( ( rule__Identifier__RefAssignment_4 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: ( rule__Identifier__RefAssignment_4 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( rule__Identifier__RefAssignment_4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:2: rule__Identifier__RefAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_4_in_rule__Identifier__Group__4__Impl7471);
            rule__Identifier__RefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getRefAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__4__Impl"


    // $ANTLR start "rule__Identifier__Group__5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3732:1: rule__Identifier__Group__5 : rule__Identifier__Group__5__Impl ;
    public final void rule__Identifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( rule__Identifier__Group__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:2: rule__Identifier__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__5__Impl_in_rule__Identifier__Group__57501);
            rule__Identifier__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__5"


    // $ANTLR start "rule__Identifier__Group__5__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:1: rule__Identifier__Group__5__Impl : ( '}' ) ;
    public final void rule__Identifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: '}'
            {
             before(grammarAccess.getIdentifierAccess().getRightCurlyBracketKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Identifier__Group__5__Impl7529); 
             after(grammarAccess.getIdentifierAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group__5__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07572);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07575);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3792:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3793:1: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:2: '-'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_rule__EInt__Group__0__Impl7604); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17637);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( RULE_INT )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7664); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Model__RootFeatureAssignment_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: rule__Model__RootFeatureAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3842:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3844:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17702);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RootFeatureAssignment_3_1"


    // $ANTLR start "rule__Model__RootFeatureAssignment_3_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: rule__Model__RootFeatureAssignment_3_2_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17733);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RootFeatureAssignment_3_2_1"


    // $ANTLR start "rule__SolitaryFeature__RequiredAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: rule__SolitaryFeature__RequiredAssignment_1 : ( ruleSolitaryType ) ;
    public final void rule__SolitaryFeature__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( ( ruleSolitaryType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: ( ruleSolitaryType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: ( ruleSolitaryType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: ruleSolitaryType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17764);
            ruleSolitaryType();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__RequiredAssignment_1"


    // $ANTLR start "rule__SolitaryFeature__NameAssignment_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: rule__SolitaryFeature__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SolitaryFeature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ruleEString
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_27795);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__NameAssignment_2"


    // $ANTLR start "rule__SolitaryFeature__TypeAssignment_3_0_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:1: rule__SolitaryFeature__TypeAssignment_3_0_1_1 : ( ruleSimpleType ) ;
    public final void rule__SolitaryFeature__TypeAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ruleSimpleType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_3_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_3_0_1_17826);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__TypeAssignment_3_0_1_1"


    // $ANTLR start "rule__SolitaryFeature__GroupsAssignment_3_0_2_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: rule__SolitaryFeature__GroupsAssignment_3_0_2_0 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_2_07857);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__GroupsAssignment_3_0_2_0"


    // $ANTLR start "rule__SolitaryFeature__GroupsAssignment_3_0_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: rule__SolitaryFeature__GroupsAssignment_3_0_2_1 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_2_17888);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__GroupsAssignment_3_0_2_1"


    // $ANTLR start "rule__SolitaryFeature__FeaturesAssignment_3_0_3_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: rule__SolitaryFeature__FeaturesAssignment_3_0_3_0 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_3_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_3_07919);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__FeaturesAssignment_3_0_3_0"


    // $ANTLR start "rule__SolitaryFeature__FeaturesAssignment_3_0_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: rule__SolitaryFeature__FeaturesAssignment_3_0_3_1 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3962:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3963:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_3_17950);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__FeaturesAssignment_3_0_3_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_17981);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_18012);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_3_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: rule__SolitaryFeature__ConstraintsAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_1_18043);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__ConstraintsAssignment_3_1_1"


    // $ANTLR start "rule__Group__InclusiveAssignment_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: rule__Group__InclusiveAssignment_0 : ( ( 'any' ) ) ;
    public final void rule__Group__InclusiveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( ( 'any' ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ( 'any' ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ( 'any' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( 'any' )
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_0_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( 'any' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: 'any'
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_0_0()); 
            match(input,51,FollowSets000.FOLLOW_51_in_rule__Group__InclusiveAssignment_08079); 
             after(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_0_0()); 

            }

             after(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__InclusiveAssignment_0"


    // $ANTLR start "rule__Group__GroupedFeaturesAssignment_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: rule__Group__GroupedFeaturesAssignment_2 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_28118);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__GroupedFeaturesAssignment_2"


    // $ANTLR start "rule__Group__GroupedFeaturesAssignment_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: rule__Group__GroupedFeaturesAssignment_3 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_38149);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__GroupedFeaturesAssignment_3"


    // $ANTLR start "rule__GroupedFeature__NameAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: rule__GroupedFeature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GroupedFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ruleEString
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_18180);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__NameAssignment_1"


    // $ANTLR start "rule__GroupedFeature__TypeAssignment_2_0_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: rule__GroupedFeature__TypeAssignment_2_0_1_1 : ( ruleSimpleType ) ;
    public final void rule__GroupedFeature__TypeAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ruleSimpleType
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_2_0_1_18211);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__TypeAssignment_2_0_1_1"


    // $ANTLR start "rule__GroupedFeature__GroupsAssignment_2_0_2_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: rule__GroupedFeature__GroupsAssignment_2_0_2_2 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_2_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4105:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_28242);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__GroupsAssignment_2_0_2_2"


    // $ANTLR start "rule__GroupedFeature__GroupsAssignment_2_0_2_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: rule__GroupedFeature__GroupsAssignment_2_0_2_3_1 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_2_0_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_3_18273);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__GroupsAssignment_2_0_2_3_1"


    // $ANTLR start "rule__GroupedFeature__FeaturesAssignment_2_0_3_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: rule__GroupedFeature__FeaturesAssignment_2_0_3_0 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_2_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_08304);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__FeaturesAssignment_2_0_3_0"


    // $ANTLR start "rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_18335);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_0_4_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: rule__GroupedFeature__ConstraintsAssignment_2_0_4_2 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_28366);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_2_0_4_2"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_18397);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: rule__GroupedFeature__ConstraintsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4196:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_1_18428);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_2_1_1"


    // $ANTLR start "rule__BinaryOperation__OperatorAssignment_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: rule__BinaryOperation__OperatorAssignment_3 : ( ruleBinaryOperator ) ;
    public final void rule__BinaryOperation__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4210:1: ( ( ruleBinaryOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( ruleBinaryOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4211:1: ( ruleBinaryOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: ruleBinaryOperator
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorBinaryOperatorEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperator_in_rule__BinaryOperation__OperatorAssignment_38459);
            ruleBinaryOperator();

            state._fsp--;

             after(grammarAccess.getBinaryOperationAccess().getOperatorBinaryOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__OperatorAssignment_3"


    // $ANTLR start "rule__BinaryOperation__RexpAssignment_5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: rule__BinaryOperation__RexpAssignment_5 : ( ruleExpression ) ;
    public final void rule__BinaryOperation__RexpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: ruleExpression
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpExpressionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__BinaryOperation__RexpAssignment_58490);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryOperationAccess().getRexpExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__RexpAssignment_5"


    // $ANTLR start "rule__BinaryOperation__LexpAssignment_7"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: rule__BinaryOperation__LexpAssignment_7 : ( ruleExpression ) ;
    public final void rule__BinaryOperation__LexpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ruleExpression
            {
             before(grammarAccess.getBinaryOperationAccess().getLexpExpressionParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__BinaryOperation__LexpAssignment_78521);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryOperationAccess().getLexpExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__LexpAssignment_7"


    // $ANTLR start "rule__UnaryOperation__OperatorAssignment_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: rule__UnaryOperation__OperatorAssignment_3 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: ( ( ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( ruleUnaryOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_38552);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__OperatorAssignment_3"


    // $ANTLR start "rule__UnaryOperation__ExpAssignment_5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: rule__UnaryOperation__ExpAssignment_5 : ( ruleExpression ) ;
    public final void rule__UnaryOperation__ExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: ruleExpression
            {
             before(grammarAccess.getUnaryOperationAccess().getExpExpressionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__UnaryOperation__ExpAssignment_58583);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUnaryOperationAccess().getExpExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryOperation__ExpAssignment_5"


    // $ANTLR start "rule__Number__ValueAssignment"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: rule__Number__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: ( ruleEInt )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4287:1: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8614);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__Identifier__NameAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: rule__Identifier__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Identifier__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ruleEString
            {
             before(grammarAccess.getIdentifierAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Identifier__NameAssignment_18645);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__NameAssignment_1"


    // $ANTLR start "rule__Identifier__RefAssignment_4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: rule__Identifier__RefAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Identifier__RefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4316:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4317:1: ( ruleEString )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_4_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ruleEString
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Identifier__RefAssignment_48680);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__RefAssignment_4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0_in_ruleSolitaryFeature274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0_in_ruleGroupedFeature454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0_in_ruleBinaryOperation514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0_in_ruleNULL634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperator__Alternatives_in_ruleBinaryOperator853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Expression__Alternatives1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__Expression__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_rule__Expression__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__Expression__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__Expression__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__0_in_rule__SolitaryFeature__Alternatives_31145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__0_in_rule__SolitaryFeature__Alternatives_31163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__0_in_rule__GroupedFeature__Alternatives_21245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__0_in_rule__GroupedFeature__Alternatives_21263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__BinaryOperator__Alternatives1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BinaryOperator__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BinaryOperator__Alternatives1340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__BinaryOperator__Alternatives1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__BinaryOperator__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__BinaryOperator__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BinaryOperator__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BinaryOperator__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BinaryOperator__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__UnaryOperator__Alternatives1502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__UnaryOperator__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SimpleType__Alternatives1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleType__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleType__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SimpleType__Alternatives1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SolitaryType__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SolitaryType__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01712 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11773 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Model__Group__1__Impl1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21835 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Model__Group__2__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31897 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Model__Group__4__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02027 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group_3__0__Impl2058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12089 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2176 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02213 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group_3_2__0__Impl2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02336 = new BitSet(new long[]{0x000000010C000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SolitaryFeature__Group__0__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12398 = new BitSet(new long[]{0x000000010C000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22459 = new BitSet(new long[]{0x0000004200000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__NameAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Alternatives_3_in_rule__SolitaryFeature__Group__3__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__0__Impl_in_rule__SolitaryFeature__Group_3_0__02584 = new BitSet(new long[]{0x0008001F00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__1_in_rule__SolitaryFeature__Group_3_0__02587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SolitaryFeature__Group_3_0__0__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__1__Impl_in_rule__SolitaryFeature__Group_3_0__12646 = new BitSet(new long[]{0x0008001F00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__2_in_rule__SolitaryFeature__Group_3_0__12649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__0_in_rule__SolitaryFeature__Group_3_0__1__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__2__Impl_in_rule__SolitaryFeature__Group_3_0__22707 = new BitSet(new long[]{0x0008001F00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__3_in_rule__SolitaryFeature__Group_3_0__22710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__0_in_rule__SolitaryFeature__Group_3_0__2__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__3__Impl_in_rule__SolitaryFeature__Group_3_0__32768 = new BitSet(new long[]{0x0008001F00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__4_in_rule__SolitaryFeature__Group_3_0__32771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__0_in_rule__SolitaryFeature__Group_3_0__3__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__4__Impl_in_rule__SolitaryFeature__Group_3_0__42829 = new BitSet(new long[]{0x0008001F00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__5_in_rule__SolitaryFeature__Group_3_0__42832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__0_in_rule__SolitaryFeature__Group_3_0__4__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__5__Impl_in_rule__SolitaryFeature__Group_3_0__52890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SolitaryFeature__Group_3_0__5__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__0__Impl_in_rule__SolitaryFeature__Group_3_0_1__02961 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__1_in_rule__SolitaryFeature__Group_3_0_1__02964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__SolitaryFeature__Group_3_0_1__0__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__1__Impl_in_rule__SolitaryFeature__Group_3_0_1__13023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__TypeAssignment_3_0_1_1_in_rule__SolitaryFeature__Group_3_0_1__1__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_2__03084 = new BitSet(new long[]{0x0008000200000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__1_in_rule__SolitaryFeature__Group_3_0_2__03087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_2_0_in_rule__SolitaryFeature__Group_3_0_2__0__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_2__13144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_2_1_in_rule__SolitaryFeature__Group_3_0_2__1__Impl3171 = new BitSet(new long[]{0x0008000200000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_3__03206 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__1_in_rule__SolitaryFeature__Group_3_0_3__03209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_3_0_in_rule__SolitaryFeature__Group_3_0_3__0__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_3__13266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_3_1_in_rule__SolitaryFeature__Group_3_0_3__1__Impl3293 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__0__Impl_in_rule__SolitaryFeature__Group_3_0_4__03328 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__1_in_rule__SolitaryFeature__Group_3_0_4__03331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__0__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__1__Impl_in_rule__SolitaryFeature__Group_3_0_4__13390 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__2_in_rule__SolitaryFeature__Group_3_0_4__13393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1_in_rule__SolitaryFeature__Group_3_0_4__1__Impl3420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__2__Impl_in_rule__SolitaryFeature__Group_3_0_4__23450 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__3_in_rule__SolitaryFeature__Group_3_0_4__23453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0_in_rule__SolitaryFeature__Group_3_0_4__2__Impl3480 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__3__Impl_in_rule__SolitaryFeature__Group_3_0_4__33511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__3__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__03578 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1_in_rule__SolitaryFeature__Group_3_0_4_2__03581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SolitaryFeature__Group_3_0_4_2__0__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__13640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1_in_rule__SolitaryFeature__Group_3_0_4_2__1__Impl3667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__0__Impl_in_rule__SolitaryFeature__Group_3_1__03701 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__1_in_rule__SolitaryFeature__Group_3_1__03704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__SolitaryFeature__Group_3_1__0__Impl3732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__1__Impl_in_rule__SolitaryFeature__Group_3_1__13763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_1_1_in_rule__SolitaryFeature__Group_3_1__1__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__03824 = new BitSet(new long[]{0x0008000200000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__03827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__InclusiveAssignment_0_in_rule__Group__Group__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__13885 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__13888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Group__Group__1__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__23947 = new BitSet(new long[]{0x0000000500000030L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__23950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_2_in_rule__Group__Group__2__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__34007 = new BitSet(new long[]{0x0000000500000030L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__34010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl4037 = new BitSet(new long[]{0x0000000100000032L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Group__Group__4__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04137 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14198 = new BitSet(new long[]{0x0000004200000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Alternatives_2_in_rule__GroupedFeature__Group__2__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__0__Impl_in_rule__GroupedFeature__Group_2_0__04321 = new BitSet(new long[]{0x0000018D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__1_in_rule__GroupedFeature__Group_2_0__04324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__GroupedFeature__Group_2_0__0__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__1__Impl_in_rule__GroupedFeature__Group_2_0__14383 = new BitSet(new long[]{0x0000018D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__2_in_rule__GroupedFeature__Group_2_0__14386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__0_in_rule__GroupedFeature__Group_2_0__1__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__2__Impl_in_rule__GroupedFeature__Group_2_0__24444 = new BitSet(new long[]{0x0000018D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__3_in_rule__GroupedFeature__Group_2_0__24447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__0_in_rule__GroupedFeature__Group_2_0__2__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__3__Impl_in_rule__GroupedFeature__Group_2_0__34505 = new BitSet(new long[]{0x0000018D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__4_in_rule__GroupedFeature__Group_2_0__34508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__0_in_rule__GroupedFeature__Group_2_0__3__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__4__Impl_in_rule__GroupedFeature__Group_2_0__44566 = new BitSet(new long[]{0x0000018D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__5_in_rule__GroupedFeature__Group_2_0__44569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__0_in_rule__GroupedFeature__Group_2_0__4__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__5__Impl_in_rule__GroupedFeature__Group_2_0__54627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__GroupedFeature__Group_2_0__5__Impl4655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__0__Impl_in_rule__GroupedFeature__Group_2_0_1__04698 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__1_in_rule__GroupedFeature__Group_2_0_1__04701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GroupedFeature__Group_2_0_1__0__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__1__Impl_in_rule__GroupedFeature__Group_2_0_1__14760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__TypeAssignment_2_0_1_1_in_rule__GroupedFeature__Group_2_0_1__1__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__0__Impl_in_rule__GroupedFeature__Group_2_0_2__04821 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__1_in_rule__GroupedFeature__Group_2_0_2__04824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__GroupedFeature__Group_2_0_2__0__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__1__Impl_in_rule__GroupedFeature__Group_2_0_2__14883 = new BitSet(new long[]{0x0008000200000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__2_in_rule__GroupedFeature__Group_2_0_2__14886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__GroupedFeature__Group_2_0_2__1__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__2__Impl_in_rule__GroupedFeature__Group_2_0_2__24945 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__3_in_rule__GroupedFeature__Group_2_0_2__24948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_2_in_rule__GroupedFeature__Group_2_0_2__2__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__3__Impl_in_rule__GroupedFeature__Group_2_0_2__35005 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__4_in_rule__GroupedFeature__Group_2_0_2__35008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2_3__0_in_rule__GroupedFeature__Group_2_0_2__3__Impl5035 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__4__Impl_in_rule__GroupedFeature__Group_2_0_2__45066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__GroupedFeature__Group_2_0_2__4__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2_3__0__Impl_in_rule__GroupedFeature__Group_2_0_2_3__05135 = new BitSet(new long[]{0x0008000200000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2_3__1_in_rule__GroupedFeature__Group_2_0_2_3__05138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__GroupedFeature__Group_2_0_2_3__0__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2_3__1__Impl_in_rule__GroupedFeature__Group_2_0_2_3__15197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_3_1_in_rule__GroupedFeature__Group_2_0_2_3__1__Impl5224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__0__Impl_in_rule__GroupedFeature__Group_2_0_3__05258 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__1_in_rule__GroupedFeature__Group_2_0_3__05261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_0_in_rule__GroupedFeature__Group_2_0_3__0__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__1__Impl_in_rule__GroupedFeature__Group_2_0_3__15318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3_1__0_in_rule__GroupedFeature__Group_2_0_3__1__Impl5345 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3_1__0__Impl_in_rule__GroupedFeature__Group_2_0_3_1__05380 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3_1__1_in_rule__GroupedFeature__Group_2_0_3_1__05383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__GroupedFeature__Group_2_0_3_1__0__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3_1__1__Impl_in_rule__GroupedFeature__Group_2_0_3_1__15442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_1_in_rule__GroupedFeature__Group_2_0_3_1__1__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__0__Impl_in_rule__GroupedFeature__Group_2_0_4__05503 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__1_in_rule__GroupedFeature__Group_2_0_4__05506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__GroupedFeature__Group_2_0_4__0__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__1__Impl_in_rule__GroupedFeature__Group_2_0_4__15565 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__2_in_rule__GroupedFeature__Group_2_0_4__15568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__GroupedFeature__Group_2_0_4__1__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__2__Impl_in_rule__GroupedFeature__Group_2_0_4__25627 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__3_in_rule__GroupedFeature__Group_2_0_4__25630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_in_rule__GroupedFeature__Group_2_0_4__2__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__3__Impl_in_rule__GroupedFeature__Group_2_0_4__35687 = new BitSet(new long[]{0x0000002040000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__4_in_rule__GroupedFeature__Group_2_0_4__35690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0_in_rule__GroupedFeature__Group_2_0_4__3__Impl5717 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__4__Impl_in_rule__GroupedFeature__Group_2_0_4__45748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__GroupedFeature__Group_2_0_4__4__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0__Impl_in_rule__GroupedFeature__Group_2_0_4_3__05817 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1_in_rule__GroupedFeature__Group_2_0_4_3__05820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__GroupedFeature__Group_2_0_4_3__0__Impl5848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1__Impl_in_rule__GroupedFeature__Group_2_0_4_3__15879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1_in_rule__GroupedFeature__Group_2_0_4_3__1__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__0__Impl_in_rule__GroupedFeature__Group_2_1__05940 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__1_in_rule__GroupedFeature__Group_2_1__05943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__GroupedFeature__Group_2_1__0__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__1__Impl_in_rule__GroupedFeature__Group_2_1__16002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_1_1_in_rule__GroupedFeature__Group_2_1__1__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__06063 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__06066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__BinaryOperation__Group__0__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16125 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__2_in_rule__BinaryOperation__Group__16128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__BinaryOperation__Group__1__Impl6156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__2__Impl_in_rule__BinaryOperation__Group__26187 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__3_in_rule__BinaryOperation__Group__26190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__BinaryOperation__Group__2__Impl6218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__3__Impl_in_rule__BinaryOperation__Group__36249 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__4_in_rule__BinaryOperation__Group__36252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__OperatorAssignment_3_in_rule__BinaryOperation__Group__3__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__4__Impl_in_rule__BinaryOperation__Group__46309 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__5_in_rule__BinaryOperation__Group__46312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__BinaryOperation__Group__4__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__5__Impl_in_rule__BinaryOperation__Group__56371 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__6_in_rule__BinaryOperation__Group__56374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__RexpAssignment_5_in_rule__BinaryOperation__Group__5__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__6__Impl_in_rule__BinaryOperation__Group__66431 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__7_in_rule__BinaryOperation__Group__66434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__BinaryOperation__Group__6__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__7__Impl_in_rule__BinaryOperation__Group__76493 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__8_in_rule__BinaryOperation__Group__76496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__LexpAssignment_7_in_rule__BinaryOperation__Group__7__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__8__Impl_in_rule__BinaryOperation__Group__86553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BinaryOperation__Group__8__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06630 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__UnaryOperation__Group__0__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__16692 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__2_in_rule__UnaryOperation__Group__16695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__UnaryOperation__Group__1__Impl6723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__2__Impl_in_rule__UnaryOperation__Group__26754 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__3_in_rule__UnaryOperation__Group__26757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__UnaryOperation__Group__2__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__3__Impl_in_rule__UnaryOperation__Group__36816 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__4_in_rule__UnaryOperation__Group__36819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_3_in_rule__UnaryOperation__Group__3__Impl6846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__4__Impl_in_rule__UnaryOperation__Group__46876 = new BitSet(new long[]{0x0005A20000000040L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__5_in_rule__UnaryOperation__Group__46879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__UnaryOperation__Group__4__Impl6907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__5__Impl_in_rule__UnaryOperation__Group__56938 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__6_in_rule__UnaryOperation__Group__56941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__ExpAssignment_5_in_rule__UnaryOperation__Group__5__Impl6968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__6__Impl_in_rule__UnaryOperation__Group__66998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__UnaryOperation__Group__6__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__07071 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__07074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__17132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__NULL__Group__1__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__07195 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__07198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__Identifier__Group__0__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__17257 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Identifier__Group__2_in_rule__Identifier__Group__17260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__NameAssignment_1_in_rule__Identifier__Group__1__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__2__Impl_in_rule__Identifier__Group__27317 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_rule__Identifier__Group__3_in_rule__Identifier__Group__27320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Identifier__Group__2__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__3__Impl_in_rule__Identifier__Group__37379 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Identifier__Group__4_in_rule__Identifier__Group__37382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__Identifier__Group__3__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__4__Impl_in_rule__Identifier__Group__47441 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Identifier__Group__5_in_rule__Identifier__Group__47444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_4_in_rule__Identifier__Group__4__Impl7471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__5__Impl_in_rule__Identifier__Group__57501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Identifier__Group__5__Impl7529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07572 = new BitSet(new long[]{0x0004000000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_rule__EInt__Group__0__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_27795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_3_0_1_17826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_2_07857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_2_17888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_3_07919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_3_17950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_17981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_18012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_1_18043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rule__Group__InclusiveAssignment_08079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_28118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_38149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_18180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_2_0_1_18211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_28242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_3_18273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_08304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_18335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_28366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_18397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_1_18428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperator_in_rule__BinaryOperation__OperatorAssignment_38459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__BinaryOperation__RexpAssignment_58490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__BinaryOperation__LexpAssignment_78521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_38552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__UnaryOperation__ExpAssignment_58583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Identifier__NameAssignment_18645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Identifier__RefAssignment_48680 = new BitSet(new long[]{0x0000000000000002L});
    }


}