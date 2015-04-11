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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'", "'Model'", "'{'", "'}'", "'Root'", "'feature'", "'=>'", "';'", "'type'", "'#'", "'='", "'select'", "','", "'('", "')'", "'NULL'", "'-'", "'any'"
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


    // $ANTLR start "entryRuleSolitaryFeature"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleSolitaryFeature : ruleSolitaryFeature EOF ;
    public final void entryRuleSolitaryFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleSolitaryFeature EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleSolitaryFeature EOF
            {
             before(grammarAccess.getSolitaryFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature181);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSolitaryFeature188); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleSolitaryFeature : ( ( rule__SolitaryFeature__Group__0 ) ) ;
    public final void ruleSolitaryFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__SolitaryFeature__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__SolitaryFeature__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__SolitaryFeature__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__SolitaryFeature__Group__0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__SolitaryFeature__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__SolitaryFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0_in_ruleSolitaryFeature214);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleGroup EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup301);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup308); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Group__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Group__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0_in_ruleGroup334);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleGroupedFeature : ruleGroupedFeature EOF ;
    public final void entryRuleGroupedFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleGroupedFeature EOF
            {
             before(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature361);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature368); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleGroupedFeature : ( ( rule__GroupedFeature__Group__0 ) ) ;
    public final void ruleGroupedFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__GroupedFeature__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__GroupedFeature__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__GroupedFeature__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__GroupedFeature__Group__0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__GroupedFeature__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__GroupedFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0_in_ruleGroupedFeature394);
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


    // $ANTLR start "entryRuleExpression"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleExpression EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression421);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression428); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Expression__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0_in_ruleExpression454);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleLogical2Operation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleLogical2Operation : ruleLogical2Operation EOF ;
    public final void entryRuleLogical2Operation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleLogical2Operation EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleLogical2Operation EOF
            {
             before(grammarAccess.getLogical2OperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation481);
            ruleLogical2Operation();

            state._fsp--;

             after(grammarAccess.getLogical2OperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogical2Operation488); 

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
    // $ANTLR end "entryRuleLogical2Operation"


    // $ANTLR start "ruleLogical2Operation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleLogical2Operation : ( ( rule__Logical2Operation__Group__0 ) ) ;
    public final void ruleLogical2Operation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Logical2Operation__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Logical2Operation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Logical2Operation__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Logical2Operation__Group__0 )
            {
             before(grammarAccess.getLogical2OperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Logical2Operation__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Logical2Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__0_in_ruleLogical2Operation514);
            rule__Logical2Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogical2OperationAccess().getGroup()); 

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
    // $ANTLR end "ruleLogical2Operation"


    // $ANTLR start "entryRuleBinaryOperation"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleBinaryOperation : ruleBinaryOperation EOF ;
    public final void entryRuleBinaryOperation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleBinaryOperation EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleBinaryOperation EOF
            {
             before(grammarAccess.getBinaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation541);
            ruleBinaryOperation();

            state._fsp--;

             after(grammarAccess.getBinaryOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryOperation548); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleBinaryOperation : ( ( rule__BinaryOperation__Group__0 ) ) ;
    public final void ruleBinaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__BinaryOperation__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__BinaryOperation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__BinaryOperation__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__BinaryOperation__Group__0 )
            {
             before(grammarAccess.getBinaryOperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__BinaryOperation__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__BinaryOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0_in_ruleBinaryOperation574);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleUnaryOperation : ruleUnaryOperation EOF ;
    public final void entryRuleUnaryOperation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleUnaryOperation EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleUnaryOperation EOF
            {
             before(grammarAccess.getUnaryOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation601);
            ruleUnaryOperation();

            state._fsp--;

             after(grammarAccess.getUnaryOperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryOperation608); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleUnaryOperation : ( ( rule__UnaryOperation__Group__0 ) ) ;
    public final void ruleUnaryOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__UnaryOperation__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__UnaryOperation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__UnaryOperation__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__UnaryOperation__Group__0 )
            {
             before(grammarAccess.getUnaryOperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__UnaryOperation__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__UnaryOperation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation634);
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


    // $ANTLR start "entryRuleAtomicExp"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleAtomicExp : ruleAtomicExp EOF ;
    public final void entryRuleAtomicExp() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleAtomicExp EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleAtomicExp EOF
            {
             before(grammarAccess.getAtomicExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp661);
            ruleAtomicExp();

            state._fsp--;

             after(grammarAccess.getAtomicExpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExp668); 

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
    // $ANTLR end "entryRuleAtomicExp"


    // $ANTLR start "ruleAtomicExp"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleAtomicExp : ( ( rule__AtomicExp__Alternatives ) ) ;
    public final void ruleAtomicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__AtomicExp__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__AtomicExp__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__AtomicExp__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__AtomicExp__Alternatives )
            {
             before(grammarAccess.getAtomicExpAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__AtomicExp__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__AtomicExp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Alternatives_in_ruleAtomicExp694);
            rule__AtomicExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomicExp"


    // $ANTLR start "entryRuleNULL"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleNULL : ruleNULL EOF ;
    public final void entryRuleNULL() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleNULL EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleNULL EOF
            {
             before(grammarAccess.getNULLRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNULL_in_entryRuleNULL721);
            ruleNULL();

            state._fsp--;

             after(grammarAccess.getNULLRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNULL728); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleNULL : ( ( rule__NULL__Group__0 ) ) ;
    public final void ruleNULL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__NULL__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__NULL__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__NULL__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__NULL__Group__0 )
            {
             before(grammarAccess.getNULLAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__NULL__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__NULL__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0_in_ruleNULL754);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleNumber EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber781);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber788); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__Number__ValueAssignment )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__Number__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__ValueAssignment_in_ruleNumber814);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier841);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier848); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleIdentifier : ( ( rule__Identifier__RefAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__Identifier__RefAssignment ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Identifier__RefAssignment ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__Identifier__RefAssignment ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__Identifier__RefAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__Identifier__RefAssignment )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__Identifier__RefAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_in_ruleIdentifier874);
            rule__Identifier__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getRefAssignment()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleEInt EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt901);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt908); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt934);
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


    // $ANTLR start "ruleLogicalOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:487:1: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:488:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:490:1: ( rule__LogicalOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:490:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator973);
            rule__LogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:502:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:507:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:508:1: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( rule__CompareOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:509:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1009);
            rule__CompareOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "ruleArithmicOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:521:1: ruleArithmicOperator : ( ( rule__ArithmicOperator__Alternatives ) ) ;
    public final void ruleArithmicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( ( rule__ArithmicOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( rule__ArithmicOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( rule__ArithmicOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( rule__ArithmicOperator__Alternatives )
            {
             before(grammarAccess.getArithmicOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( rule__ArithmicOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:528:2: rule__ArithmicOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmicOperator__Alternatives_in_ruleArithmicOperator1045);
            rule__ArithmicOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmicOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArithmicOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:544:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:545:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( rule__UnaryOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1081);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( rule__SimpleType__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:566:2: rule__SimpleType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1117);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ruleSolitaryType : ( ( rule__SolitaryType__Alternatives ) ) ;
    public final void ruleSolitaryType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( ( ( rule__SolitaryType__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( ( rule__SolitaryType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( ( rule__SolitaryType__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( rule__SolitaryType__Alternatives )
            {
             before(grammarAccess.getSolitaryTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( rule__SolitaryType__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:585:2: rule__SolitaryType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType1153);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: rule__Feature__Alternatives : ( ( ruleSolitaryFeature ) | ( ruleGroupedFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ( ( ruleSolitaryFeature ) | ( ruleGroupedFeature ) )
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( ruleSolitaryFeature )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:601:1: ( ruleSolitaryFeature )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:602:1: ruleSolitaryFeature
                    {
                     before(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives1188);
                    ruleSolitaryFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:607:6: ( ruleGroupedFeature )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:607:6: ( ruleGroupedFeature )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ruleGroupedFeature
                    {
                     before(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1205);
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


    // $ANTLR start "rule__SolitaryFeature__Alternatives_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: rule__SolitaryFeature__Alternatives_3 : ( ( ( rule__SolitaryFeature__Group_3_0__0 ) ) | ( ( rule__SolitaryFeature__Group_3_1__0 ) ) );
    public final void rule__SolitaryFeature__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( ( ( rule__SolitaryFeature__Group_3_0__0 ) ) | ( ( rule__SolitaryFeature__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ( rule__SolitaryFeature__Group_3_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ( rule__SolitaryFeature__Group_3_0__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( rule__SolitaryFeature__Group_3_0__0 )
                    {
                     before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( rule__SolitaryFeature__Group_3_0__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:625:2: rule__SolitaryFeature__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__0_in_rule__SolitaryFeature__Alternatives_31237);
                    rule__SolitaryFeature__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ( rule__SolitaryFeature__Group_3_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ( rule__SolitaryFeature__Group_3_1__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( rule__SolitaryFeature__Group_3_1__0 )
                    {
                     before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( rule__SolitaryFeature__Group_3_1__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:631:2: rule__SolitaryFeature__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__0_in_rule__SolitaryFeature__Alternatives_31255);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:645:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1288); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:651:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:651:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1305); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: rule__GroupedFeature__Alternatives_2 : ( ( ( rule__GroupedFeature__Group_2_0__0 ) ) | ( ( rule__GroupedFeature__Group_2_1__0 ) ) );
    public final void rule__GroupedFeature__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( ( ( rule__GroupedFeature__Group_2_0__0 ) ) | ( ( rule__GroupedFeature__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( ( rule__GroupedFeature__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( ( rule__GroupedFeature__Group_2_0__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( rule__GroupedFeature__Group_2_0__0 )
                    {
                     before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( rule__GroupedFeature__Group_2_0__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:669:2: rule__GroupedFeature__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__0_in_rule__GroupedFeature__Alternatives_21337);
                    rule__GroupedFeature__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:6: ( ( rule__GroupedFeature__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:6: ( ( rule__GroupedFeature__Group_2_1__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: ( rule__GroupedFeature__Group_2_1__0 )
                    {
                     before(grammarAccess.getGroupedFeatureAccess().getGroup_2_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( rule__GroupedFeature__Group_2_1__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:675:2: rule__GroupedFeature__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__0_in_rule__GroupedFeature__Alternatives_21355);
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


    // $ANTLR start "rule__AtomicExp__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: rule__AtomicExp__Alternatives : ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) );
    public final void rule__AtomicExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
            case 43:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case 40:
                {
                alt5=4;
                }
                break;
            case 20:
            case 21:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( ruleNULL )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( ruleNULL )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ruleNULL
                    {
                     before(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1388);
                    ruleNULL();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:6: ( ruleNumber )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:6: ( ruleNumber )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ruleNumber
                    {
                     before(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1405);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:701:6: ( ruleIdentifier )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:701:6: ( ruleIdentifier )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ruleIdentifier
                    {
                     before(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1422);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:707:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:707:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: ( rule__AtomicExp__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpAccess().getGroup_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( rule__AtomicExp__Group_3__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:709:2: rule__AtomicExp__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1439);
                    rule__AtomicExp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:6: ( ruleUnaryOperation )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:6: ( ruleUnaryOperation )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ruleUnaryOperation
                    {
                     before(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1457);
                    ruleUnaryOperation();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 

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
    // $ANTLR end "rule__AtomicExp__Alternatives"


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:1: rule__LogicalOperator__Alternatives : ( ( ( 'And' ) ) | ( ( 'Or' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:1: ( ( ( 'And' ) ) | ( ( 'Or' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ( 'And' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( ( 'And' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( 'And' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( 'And' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:732:3: 'And'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__LogicalOperator__Alternatives1491); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:6: ( ( 'Or' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:6: ( ( 'Or' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( 'Or' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'Or' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:3: 'Or'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__LogicalOperator__Alternatives1512); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__LogicalOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: rule__CompareOperator__Alternatives : ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( 'Equals' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( ( 'Equals' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( 'Equals' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( 'Equals' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:3: 'Equals'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__CompareOperator__Alternatives1548); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:761:6: ( ( 'Higher' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:761:6: ( ( 'Higher' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( 'Higher' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( 'Higher' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:763:3: 'Higher'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__CompareOperator__Alternatives1569); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:768:6: ( ( 'Lower' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:768:6: ( ( 'Lower' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( 'Lower' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( 'Lower' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:770:3: 'Lower'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__CompareOperator__Alternatives1590); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__ArithmicOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: rule__ArithmicOperator__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) );
    public final void rule__ArithmicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( ( 'Add' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( ( 'Add' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( 'Add' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( 'Add' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:3: 'Add'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ArithmicOperator__Alternatives1626); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:792:6: ( ( 'Subtract' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:792:6: ( ( 'Subtract' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( 'Subtract' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: ( 'Subtract' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:794:3: 'Subtract'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ArithmicOperator__Alternatives1647); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:799:6: ( ( 'Divide' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:799:6: ( ( 'Divide' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( 'Divide' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( 'Divide' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:801:3: 'Divide'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ArithmicOperator__Alternatives1668); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:806:6: ( ( 'Multiply' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:806:6: ( ( 'Multiply' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( 'Multiply' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: ( 'Multiply' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:808:3: 'Multiply'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ArithmicOperator__Alternatives1689); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ArithmicOperator__Alternatives"


    // $ANTLR start "rule__UnaryOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: rule__UnaryOperator__Alternatives : ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: ( ( 'Not' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: ( ( 'Not' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: ( 'Not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:825:1: ( 'Not' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:825:3: 'Not'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__UnaryOperator__Alternatives1725); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:830:6: ( ( 'Minus' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:830:6: ( ( 'Minus' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( 'Minus' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( 'Minus' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:832:3: 'Minus'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__UnaryOperator__Alternatives1746); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: rule__SimpleType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 24:
                {
                alt10=3;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( ( 'boolean' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( 'boolean' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:849:3: 'boolean'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__SimpleType__Alternatives1782); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:854:6: ( ( 'int' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:854:6: ( ( 'int' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( 'int' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:3: 'int'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleType__Alternatives1803); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:861:6: ( ( 'double' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:861:6: ( ( 'double' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( 'double' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:863:3: 'double'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleType__Alternatives1824); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:868:6: ( ( 'String' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:868:6: ( ( 'String' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:870:1: ( 'String' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:870:3: 'String'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__SimpleType__Alternatives1845); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: rule__SolitaryType__Alternatives : ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) );
    public final void rule__SolitaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( 'Optional' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( ( 'Optional' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( 'Optional' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( 'Optional' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:3: 'Optional'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__SolitaryType__Alternatives1881); 

                    }

                     after(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:892:6: ( ( 'Mandatory' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:892:6: ( ( 'Mandatory' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( 'Mandatory' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( 'Mandatory' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:894:3: 'Mandatory'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__SolitaryType__Alternatives1902); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01935);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01938);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:942:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11996);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11999);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( 'Model' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( 'Model' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Model__Group__1__Impl2027); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22058);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22061);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Model__Group__2__Impl2089); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32120);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32123);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ( rule__Model__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl2150);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42181);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Model__Group__4__Impl2209); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02250);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02253);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: rule__Model__Group_3__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group_3__0__Impl2281); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1103:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12312);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12315);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: ( ( ( rule__Model__RootFeatureAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( rule__Model__RootFeatureAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:1: ( rule__Model__RootFeatureAssignment_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:2: rule__Model__RootFeatureAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2342);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rule__Model__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22372);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__Group_3_2__0 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( ( ( rule__Model__Group_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( ( rule__Model__Group_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( ( rule__Model__Group_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( rule__Model__Group_3_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( rule__Model__Group_3_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:2: rule__Model__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2399);
            	    rule__Model__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1162:1: rule__Model__Group_3_2__0 : rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 ;
    public final void rule__Model__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ( rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:2: rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02436);
            rule__Model__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02439);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: rule__Model__Group_3_2__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group_3_2__0__Impl2467); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: rule__Model__Group_3_2__1 : rule__Model__Group_3_2__1__Impl ;
    public final void rule__Model__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( rule__Model__Group_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:2: rule__Model__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12498);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1204:1: rule__Model__Group_3_2__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) ;
    public final void rule__Model__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:2: rule__Model__RootFeatureAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2525);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__SolitaryFeature__Group__0 : rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 ;
    public final void rule__SolitaryFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:2: rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02559);
            rule__SolitaryFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02562);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: rule__SolitaryFeature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__SolitaryFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( ( 'feature' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( 'feature' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( 'feature' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: 'feature'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SolitaryFeature__Group__0__Impl2590); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: rule__SolitaryFeature__Group__1 : rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 ;
    public final void rule__SolitaryFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:2: rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12621);
            rule__SolitaryFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12624);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: rule__SolitaryFeature__Group__1__Impl : ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) ;
    public final void rule__SolitaryFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=26 && LA14_0<=27)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:2: rule__SolitaryFeature__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2651);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: rule__SolitaryFeature__Group__2 : rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 ;
    public final void rule__SolitaryFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:2: rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22682);
            rule__SolitaryFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22685);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: rule__SolitaryFeature__Group__2__Impl : ( ( rule__SolitaryFeature__NameAssignment_2 ) ) ;
    public final void rule__SolitaryFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( ( ( rule__SolitaryFeature__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( ( rule__SolitaryFeature__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( ( rule__SolitaryFeature__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( rule__SolitaryFeature__NameAssignment_2 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ( rule__SolitaryFeature__NameAssignment_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:2: rule__SolitaryFeature__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__NameAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2712);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__SolitaryFeature__Group__3 : rule__SolitaryFeature__Group__3__Impl ;
    public final void rule__SolitaryFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( rule__SolitaryFeature__Group__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:2: rule__SolitaryFeature__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32742);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__SolitaryFeature__Group__3__Impl : ( ( rule__SolitaryFeature__Alternatives_3 )? ) ;
    public final void rule__SolitaryFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ( ( rule__SolitaryFeature__Alternatives_3 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( rule__SolitaryFeature__Alternatives_3 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( rule__SolitaryFeature__Alternatives_3 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( rule__SolitaryFeature__Alternatives_3 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getAlternatives_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( rule__SolitaryFeature__Alternatives_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33||LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:2: rule__SolitaryFeature__Alternatives_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Alternatives_3_in_rule__SolitaryFeature__Group__3__Impl2769);
                    rule__SolitaryFeature__Alternatives_3();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: rule__SolitaryFeature__Group_3_0__0 : rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1 ;
    public final void rule__SolitaryFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: ( rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1355:2: rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__0__Impl_in_rule__SolitaryFeature__Group_3_0__02808);
            rule__SolitaryFeature__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__1_in_rule__SolitaryFeature__Group_3_0__02811);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: rule__SolitaryFeature__Group_3_0__0__Impl : ( '=>' ) ;
    public final void rule__SolitaryFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( ( '=>' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( '=>' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: ( '=>' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: '=>'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getEqualsSignGreaterThanSignKeyword_3_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SolitaryFeature__Group_3_0__0__Impl2839); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: rule__SolitaryFeature__Group_3_0__1 : rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2 ;
    public final void rule__SolitaryFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: ( rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:2: rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__1__Impl_in_rule__SolitaryFeature__Group_3_0__12870);
            rule__SolitaryFeature__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__2_in_rule__SolitaryFeature__Group_3_0__12873);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: rule__SolitaryFeature__Group_3_0__1__Impl : ( ( rule__SolitaryFeature__Group_3_0_1__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: ( ( ( rule__SolitaryFeature__Group_3_0_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( ( rule__SolitaryFeature__Group_3_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( ( rule__SolitaryFeature__Group_3_0_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:1: ( rule__SolitaryFeature__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( rule__SolitaryFeature__Group_3_0_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:2: rule__SolitaryFeature__Group_3_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__0_in_rule__SolitaryFeature__Group_3_0__1__Impl2900);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: rule__SolitaryFeature__Group_3_0__2 : rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3 ;
    public final void rule__SolitaryFeature__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ( rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:2: rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__2__Impl_in_rule__SolitaryFeature__Group_3_0__22931);
            rule__SolitaryFeature__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__3_in_rule__SolitaryFeature__Group_3_0__22934);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: rule__SolitaryFeature__Group_3_0__2__Impl : ( ( rule__SolitaryFeature__Group_3_0_2__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ( ( rule__SolitaryFeature__Group_3_0_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( ( rule__SolitaryFeature__Group_3_0_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( ( rule__SolitaryFeature__Group_3_0_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( rule__SolitaryFeature__Group_3_0_2__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__SolitaryFeature__Group_3_0_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:2: rule__SolitaryFeature__Group_3_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__0_in_rule__SolitaryFeature__Group_3_0__2__Impl2961);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: rule__SolitaryFeature__Group_3_0__3 : rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4 ;
    public final void rule__SolitaryFeature__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ( rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:2: rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__3__Impl_in_rule__SolitaryFeature__Group_3_0__32992);
            rule__SolitaryFeature__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__4_in_rule__SolitaryFeature__Group_3_0__32995);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:1: rule__SolitaryFeature__Group_3_0__3__Impl : ( ( rule__SolitaryFeature__Group_3_0_3__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( ( rule__SolitaryFeature__Group_3_0_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( rule__SolitaryFeature__Group_3_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( rule__SolitaryFeature__Group_3_0_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( rule__SolitaryFeature__Group_3_0_3__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__SolitaryFeature__Group_3_0_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:2: rule__SolitaryFeature__Group_3_0_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__0_in_rule__SolitaryFeature__Group_3_0__3__Impl3022);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1468:1: rule__SolitaryFeature__Group_3_0__4 : rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5 ;
    public final void rule__SolitaryFeature__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:2: rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__4__Impl_in_rule__SolitaryFeature__Group_3_0__43053);
            rule__SolitaryFeature__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__5_in_rule__SolitaryFeature__Group_3_0__43056);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:1: rule__SolitaryFeature__Group_3_0__4__Impl : ( ( rule__SolitaryFeature__Group_3_0_4__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( ( rule__SolitaryFeature__Group_3_0_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( rule__SolitaryFeature__Group_3_0_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( ( rule__SolitaryFeature__Group_3_0_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( rule__SolitaryFeature__Group_3_0_4__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( rule__SolitaryFeature__Group_3_0_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:2: rule__SolitaryFeature__Group_3_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__0_in_rule__SolitaryFeature__Group_3_0__4__Impl3083);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1497:1: rule__SolitaryFeature__Group_3_0__5 : rule__SolitaryFeature__Group_3_0__5__Impl ;
    public final void rule__SolitaryFeature__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: ( rule__SolitaryFeature__Group_3_0__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:2: rule__SolitaryFeature__Group_3_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__5__Impl_in_rule__SolitaryFeature__Group_3_0__53114);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: rule__SolitaryFeature__Group_3_0__5__Impl : ( ';' ) ;
    public final void rule__SolitaryFeature__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( ';' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( ';' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ';'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getSemicolonKeyword_3_0_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SolitaryFeature__Group_3_0__5__Impl3142); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__SolitaryFeature__Group_3_0_1__0 : rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1 ;
    public final void rule__SolitaryFeature__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:2: rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__0__Impl_in_rule__SolitaryFeature__Group_3_0_1__03185);
            rule__SolitaryFeature__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__1_in_rule__SolitaryFeature__Group_3_0_1__03188);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: rule__SolitaryFeature__Group_3_0_1__0__Impl : ( 'type' ) ;
    public final void rule__SolitaryFeature__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( 'type' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:1: 'type'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeKeyword_3_0_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__SolitaryFeature__Group_3_0_1__0__Impl3216); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: rule__SolitaryFeature__Group_3_0_1__1 : rule__SolitaryFeature__Group_3_0_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: ( rule__SolitaryFeature__Group_3_0_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:2: rule__SolitaryFeature__Group_3_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__1__Impl_in_rule__SolitaryFeature__Group_3_0_1__13247);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__SolitaryFeature__Group_3_0_1__1__Impl : ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_3_0_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:2: rule__SolitaryFeature__TypeAssignment_3_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__TypeAssignment_3_0_1_1_in_rule__SolitaryFeature__Group_3_0_1__1__Impl3274);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: rule__SolitaryFeature__Group_3_0_2__0 : rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1 ;
    public final void rule__SolitaryFeature__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1606:1: ( rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:2: rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_2__03308);
            rule__SolitaryFeature__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__1_in_rule__SolitaryFeature__Group_3_0_2__03311);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: rule__SolitaryFeature__Group_3_0_2__0__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:2: rule__SolitaryFeature__FeaturesAssignment_3_0_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_0_in_rule__SolitaryFeature__Group_3_0_2__0__Impl3338);
            rule__SolitaryFeature__FeaturesAssignment_3_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_2_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: rule__SolitaryFeature__Group_3_0_2__1 : rule__SolitaryFeature__Group_3_0_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:1: ( rule__SolitaryFeature__Group_3_0_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:2: rule__SolitaryFeature__Group_3_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_2__13368);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: rule__SolitaryFeature__Group_3_0_2__1__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1649:2: rule__SolitaryFeature__FeaturesAssignment_3_0_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_1_in_rule__SolitaryFeature__Group_3_0_2__1__Impl3395);
            	    rule__SolitaryFeature__FeaturesAssignment_3_0_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_2_1()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: rule__SolitaryFeature__Group_3_0_3__0 : rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1 ;
    public final void rule__SolitaryFeature__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: ( rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:2: rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_3__03430);
            rule__SolitaryFeature__Group_3_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__1_in_rule__SolitaryFeature__Group_3_0_3__03433);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: rule__SolitaryFeature__Group_3_0_3__0__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_3_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:2: rule__SolitaryFeature__GroupsAssignment_3_0_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_0_in_rule__SolitaryFeature__Group_3_0_3__0__Impl3460);
            rule__SolitaryFeature__GroupsAssignment_3_0_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_3_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: rule__SolitaryFeature__Group_3_0_3__1 : rule__SolitaryFeature__Group_3_0_3__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: ( rule__SolitaryFeature__Group_3_0_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:2: rule__SolitaryFeature__Group_3_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_3__13490);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: rule__SolitaryFeature__Group_3_0_3__1__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:2: rule__SolitaryFeature__GroupsAssignment_3_0_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_1_in_rule__SolitaryFeature__Group_3_0_3__1__Impl3517);
            	    rule__SolitaryFeature__GroupsAssignment_3_0_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_3_1()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__SolitaryFeature__Group_3_0_4__0 : rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1 ;
    public final void rule__SolitaryFeature__Group_3_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__0__Impl_in_rule__SolitaryFeature__Group_3_0_4__03552);
            rule__SolitaryFeature__Group_3_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__1_in_rule__SolitaryFeature__Group_3_0_4__03555);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: rule__SolitaryFeature__Group_3_0_4__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__0__Impl3583); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: rule__SolitaryFeature__Group_3_0_4__1 : rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2 ;
    public final void rule__SolitaryFeature__Group_3_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1759:1: ( rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:2: rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__1__Impl_in_rule__SolitaryFeature__Group_3_0_4__13614);
            rule__SolitaryFeature__Group_3_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__2_in_rule__SolitaryFeature__Group_3_0_4__13617);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: rule__SolitaryFeature__Group_3_0_4__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:2: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1_in_rule__SolitaryFeature__Group_3_0_4__1__Impl3644);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: rule__SolitaryFeature__Group_3_0_4__2 : rule__SolitaryFeature__Group_3_0_4__2__Impl rule__SolitaryFeature__Group_3_0_4__3 ;
    public final void rule__SolitaryFeature__Group_3_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ( rule__SolitaryFeature__Group_3_0_4__2__Impl rule__SolitaryFeature__Group_3_0_4__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:2: rule__SolitaryFeature__Group_3_0_4__2__Impl rule__SolitaryFeature__Group_3_0_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__2__Impl_in_rule__SolitaryFeature__Group_3_0_4__23674);
            rule__SolitaryFeature__Group_3_0_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__3_in_rule__SolitaryFeature__Group_3_0_4__23677);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:1: rule__SolitaryFeature__Group_3_0_4__2__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__2__Impl3705); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_2()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: rule__SolitaryFeature__Group_3_0_4__3 : rule__SolitaryFeature__Group_3_0_4__3__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:1: ( rule__SolitaryFeature__Group_3_0_4__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:2: rule__SolitaryFeature__Group_3_0_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__3__Impl_in_rule__SolitaryFeature__Group_3_0_4__33736);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: rule__SolitaryFeature__Group_3_0_4__3__Impl : ( ( rule__SolitaryFeature__Group_3_0_4_3__0 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( ( rule__SolitaryFeature__Group_3_0_4_3__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( rule__SolitaryFeature__Group_3_0_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( rule__SolitaryFeature__Group_3_0_4_3__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( rule__SolitaryFeature__Group_3_0_4_3__0 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( rule__SolitaryFeature__Group_3_0_4_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:2: rule__SolitaryFeature__Group_3_0_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__0_in_rule__SolitaryFeature__Group_3_0_4__3__Impl3763);
            	    rule__SolitaryFeature__Group_3_0_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4_3()); 

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


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1851:1: rule__SolitaryFeature__Group_3_0_4_3__0 : rule__SolitaryFeature__Group_3_0_4_3__0__Impl rule__SolitaryFeature__Group_3_0_4_3__1 ;
    public final void rule__SolitaryFeature__Group_3_0_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ( rule__SolitaryFeature__Group_3_0_4_3__0__Impl rule__SolitaryFeature__Group_3_0_4_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:2: rule__SolitaryFeature__Group_3_0_4_3__0__Impl rule__SolitaryFeature__Group_3_0_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_4_3__03802);
            rule__SolitaryFeature__Group_3_0_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__1_in_rule__SolitaryFeature__Group_3_0_4_3__03805);
            rule__SolitaryFeature__Group_3_0_4_3__1();

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
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_3__0"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: rule__SolitaryFeature__Group_3_0_4_3__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1868:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1869:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4_3__0__Impl3833); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3_0()); 

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
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_3__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: rule__SolitaryFeature__Group_3_0_4_3__1 : rule__SolitaryFeature__Group_3_0_4_3__1__Impl rule__SolitaryFeature__Group_3_0_4_3__2 ;
    public final void rule__SolitaryFeature__Group_3_0_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1886:1: ( rule__SolitaryFeature__Group_3_0_4_3__1__Impl rule__SolitaryFeature__Group_3_0_4_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:2: rule__SolitaryFeature__Group_3_0_4_3__1__Impl rule__SolitaryFeature__Group_3_0_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_4_3__13864);
            rule__SolitaryFeature__Group_3_0_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__2_in_rule__SolitaryFeature__Group_3_0_4_3__13867);
            rule__SolitaryFeature__Group_3_0_4_3__2();

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
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_3__1"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: rule__SolitaryFeature__Group_3_0_4_3__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1899:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:2: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1_in_rule__SolitaryFeature__Group_3_0_4_3__1__Impl3894);
            rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_3_1()); 

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
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_3__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:1: rule__SolitaryFeature__Group_3_0_4_3__2 : rule__SolitaryFeature__Group_3_0_4_3__2__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: ( rule__SolitaryFeature__Group_3_0_4_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:2: rule__SolitaryFeature__Group_3_0_4_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__2__Impl_in_rule__SolitaryFeature__Group_3_0_4_3__23924);
            rule__SolitaryFeature__Group_3_0_4_3__2__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_3__2"


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: rule__SolitaryFeature__Group_3_0_4_3__2__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4_3__2__Impl3952); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_3_2()); 

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
    // $ANTLR end "rule__SolitaryFeature__Group_3_0_4_3__2__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_3_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: rule__SolitaryFeature__Group_3_1__0 : rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1 ;
    public final void rule__SolitaryFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: ( rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:2: rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__0__Impl_in_rule__SolitaryFeature__Group_3_1__03989);
            rule__SolitaryFeature__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__1_in_rule__SolitaryFeature__Group_3_1__03992);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: rule__SolitaryFeature__Group_3_1__0__Impl : ( '=' ) ;
    public final void rule__SolitaryFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( '=' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1964:1: ( '=' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1965:1: '='
            {
             before(grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SolitaryFeature__Group_3_1__0__Impl4020); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: rule__SolitaryFeature__Group_3_1__1 : rule__SolitaryFeature__Group_3_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( rule__SolitaryFeature__Group_3_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:2: rule__SolitaryFeature__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__1__Impl_in_rule__SolitaryFeature__Group_3_1__14051);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: rule__SolitaryFeature__Group_3_1__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1993:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:2: rule__SolitaryFeature__ConstraintsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_1_1_in_rule__SolitaryFeature__Group_3_1__1__Impl4078);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__04112);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__04115);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: rule__Group__Group__0__Impl : ( 'select' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( ( 'select' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( 'select' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( 'select' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: 'select'
            {
             before(grammarAccess.getGroupAccess().getSelectKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Group__Group__0__Impl4143); 
             after(grammarAccess.getGroupAccess().getSelectKeyword_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__14174);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__14177);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: rule__Group__Group__1__Impl : ( ( rule__Group__InclusiveAssignment_1 )? ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( ( ( rule__Group__InclusiveAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( rule__Group__InclusiveAssignment_1 )?
            {
             before(grammarAccess.getGroupAccess().getInclusiveAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( rule__Group__InclusiveAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:2: rule__Group__InclusiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl4204);
                    rule__Group__InclusiveAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getInclusiveAssignment_1()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__24235);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__24238);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: rule__Group__Group__2__Impl : ( ( rule__Group__GroupedFeaturesAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ( ( rule__Group__GroupedFeaturesAssignment_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( rule__Group__GroupedFeaturesAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( rule__Group__GroupedFeaturesAssignment_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( rule__Group__GroupedFeaturesAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__Group__GroupedFeaturesAssignment_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:2: rule__Group__GroupedFeaturesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_2_in_rule__Group__Group__2__Impl4265);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__34295);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__34298);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: rule__Group__Group__3__Impl : ( ( rule__Group__Group_3__0 )* ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( ( ( rule__Group__Group_3__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( rule__Group__Group_3__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ( rule__Group__Group_3__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ( rule__Group__Group_3__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__Group__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==39) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:2: rule__Group__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_3__0_in_rule__Group__Group__3__Impl4325);
            	    rule__Group__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_3()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: rule__Group__Group__4 : rule__Group__Group__4__Impl ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: ( rule__Group__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:2: rule__Group__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44356);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__Group__Group__4__Impl : ( ';' ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ';' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ';' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ';'
            {
             before(grammarAccess.getGroupAccess().getSemicolonKeyword_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Group__Group__4__Impl4384); 
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


    // $ANTLR start "rule__Group__Group_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__Group__Group_3__0 : rule__Group__Group_3__0__Impl rule__Group__Group_3__1 ;
    public final void rule__Group__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( rule__Group__Group_3__0__Impl rule__Group__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:2: rule__Group__Group_3__0__Impl rule__Group__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_3__0__Impl_in_rule__Group__Group_3__04425);
            rule__Group__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_3__1_in_rule__Group__Group_3__04428);
            rule__Group__Group_3__1();

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
    // $ANTLR end "rule__Group__Group_3__0"


    // $ANTLR start "rule__Group__Group_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__Group__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_3_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Group__Group_3__0__Impl4456); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Group__Group_3__0__Impl"


    // $ANTLR start "rule__Group__Group_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2199:1: rule__Group__Group_3__1 : rule__Group__Group_3__1__Impl ;
    public final void rule__Group__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ( rule__Group__Group_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:2: rule__Group__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_3__1__Impl_in_rule__Group__Group_3__14487);
            rule__Group__Group_3__1__Impl();

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
    // $ANTLR end "rule__Group__Group_3__1"


    // $ANTLR start "rule__Group__Group_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: rule__Group__Group_3__1__Impl : ( ( rule__Group__GroupedFeaturesAssignment_3_1 ) ) ;
    public final void rule__Group__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( ( ( rule__Group__GroupedFeaturesAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__Group__GroupedFeaturesAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( ( rule__Group__GroupedFeaturesAssignment_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: ( rule__Group__GroupedFeaturesAssignment_3_1 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( rule__Group__GroupedFeaturesAssignment_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:2: rule__Group__GroupedFeaturesAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_3_1_in_rule__Group__Group_3__1__Impl4514);
            rule__Group__GroupedFeaturesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3_1()); 

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
    // $ANTLR end "rule__Group__Group_3__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__GroupedFeature__Group__0 : rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 ;
    public final void rule__GroupedFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:2: rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04548);
            rule__GroupedFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04551);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2243:1: rule__GroupedFeature__Group__0__Impl : ( () ) ;
    public final void rule__GroupedFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2247:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ()
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__GroupedFeature__Group__1 : rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 ;
    public final void rule__GroupedFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:2: rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14609);
            rule__GroupedFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14612);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: rule__GroupedFeature__Group__1__Impl : ( ( rule__GroupedFeature__NameAssignment_1 ) ) ;
    public final void rule__GroupedFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( ( ( rule__GroupedFeature__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2280:1: ( rule__GroupedFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( rule__GroupedFeature__NameAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:2: rule__GroupedFeature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4639);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__GroupedFeature__Group__2 : rule__GroupedFeature__Group__2__Impl ;
    public final void rule__GroupedFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( rule__GroupedFeature__Group__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:2: rule__GroupedFeature__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24669);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: rule__GroupedFeature__Group__2__Impl : ( ( rule__GroupedFeature__Alternatives_2 )? ) ;
    public final void rule__GroupedFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: ( ( ( rule__GroupedFeature__Alternatives_2 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( ( rule__GroupedFeature__Alternatives_2 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2307:1: ( ( rule__GroupedFeature__Alternatives_2 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( rule__GroupedFeature__Alternatives_2 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( rule__GroupedFeature__Alternatives_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33||LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:2: rule__GroupedFeature__Alternatives_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Alternatives_2_in_rule__GroupedFeature__Group__2__Impl4696);
                    rule__GroupedFeature__Alternatives_2();

                    state._fsp--;


                    }
                    break;

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__GroupedFeature__Group_2_0__0 : rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1 ;
    public final void rule__GroupedFeature__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ( rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:2: rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__0__Impl_in_rule__GroupedFeature__Group_2_0__04733);
            rule__GroupedFeature__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__1_in_rule__GroupedFeature__Group_2_0__04736);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: rule__GroupedFeature__Group_2_0__0__Impl : ( '=>' ) ;
    public final void rule__GroupedFeature__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( '=>' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( '=>' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( '=>' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: '=>'
            {
             before(grammarAccess.getGroupedFeatureAccess().getEqualsSignGreaterThanSignKeyword_2_0_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__GroupedFeature__Group_2_0__0__Impl4764); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: rule__GroupedFeature__Group_2_0__1 : rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2 ;
    public final void rule__GroupedFeature__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:2: rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__1__Impl_in_rule__GroupedFeature__Group_2_0__14795);
            rule__GroupedFeature__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__2_in_rule__GroupedFeature__Group_2_0__14798);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__GroupedFeature__Group_2_0__1__Impl : ( ( rule__GroupedFeature__Group_2_0_1__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( ( ( rule__GroupedFeature__Group_2_0_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( ( rule__GroupedFeature__Group_2_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( ( rule__GroupedFeature__Group_2_0_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: ( rule__GroupedFeature__Group_2_0_1__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( rule__GroupedFeature__Group_2_0_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:2: rule__GroupedFeature__Group_2_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__0_in_rule__GroupedFeature__Group_2_0__1__Impl4825);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: rule__GroupedFeature__Group_2_0__2 : rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3 ;
    public final void rule__GroupedFeature__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:2: rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__2__Impl_in_rule__GroupedFeature__Group_2_0__24856);
            rule__GroupedFeature__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__3_in_rule__GroupedFeature__Group_2_0__24859);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: rule__GroupedFeature__Group_2_0__2__Impl : ( ( rule__GroupedFeature__Group_2_0_2__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( ( ( rule__GroupedFeature__Group_2_0_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( rule__GroupedFeature__Group_2_0_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: ( ( rule__GroupedFeature__Group_2_0_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( rule__GroupedFeature__Group_2_0_2__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( rule__GroupedFeature__Group_2_0_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:2: rule__GroupedFeature__Group_2_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__0_in_rule__GroupedFeature__Group_2_0__2__Impl4886);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: rule__GroupedFeature__Group_2_0__3 : rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4 ;
    public final void rule__GroupedFeature__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:2: rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__3__Impl_in_rule__GroupedFeature__Group_2_0__34917);
            rule__GroupedFeature__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__4_in_rule__GroupedFeature__Group_2_0__34920);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: rule__GroupedFeature__Group_2_0__3__Impl : ( ( rule__GroupedFeature__Group_2_0_3__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( ( ( rule__GroupedFeature__Group_2_0_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: ( ( rule__GroupedFeature__Group_2_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: ( ( rule__GroupedFeature__Group_2_0_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: ( rule__GroupedFeature__Group_2_0_3__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( rule__GroupedFeature__Group_2_0_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:2: rule__GroupedFeature__Group_2_0_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__0_in_rule__GroupedFeature__Group_2_0__3__Impl4947);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: rule__GroupedFeature__Group_2_0__4 : rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5 ;
    public final void rule__GroupedFeature__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:2: rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__4__Impl_in_rule__GroupedFeature__Group_2_0__44978);
            rule__GroupedFeature__Group_2_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__5_in_rule__GroupedFeature__Group_2_0__44981);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: rule__GroupedFeature__Group_2_0__4__Impl : ( ( rule__GroupedFeature__Group_2_0_4__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ( ( ( rule__GroupedFeature__Group_2_0_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: ( ( rule__GroupedFeature__Group_2_0_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: ( ( rule__GroupedFeature__Group_2_0_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: ( rule__GroupedFeature__Group_2_0_4__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( rule__GroupedFeature__Group_2_0_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:2: rule__GroupedFeature__Group_2_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__0_in_rule__GroupedFeature__Group_2_0__4__Impl5008);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rule__GroupedFeature__Group_2_0__5 : rule__GroupedFeature__Group_2_0__5__Impl ;
    public final void rule__GroupedFeature__Group_2_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__GroupedFeature__Group_2_0__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:2: rule__GroupedFeature__Group_2_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__5__Impl_in_rule__GroupedFeature__Group_2_0__55039);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: rule__GroupedFeature__Group_2_0__5__Impl : ( ';' ) ;
    public final void rule__GroupedFeature__Group_2_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ';' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ';' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ';'
            {
             before(grammarAccess.getGroupedFeatureAccess().getSemicolonKeyword_2_0_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__GroupedFeature__Group_2_0__5__Impl5067); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:1: rule__GroupedFeature__Group_2_0_1__0 : rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1 ;
    public final void rule__GroupedFeature__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:2: rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__0__Impl_in_rule__GroupedFeature__Group_2_0_1__05110);
            rule__GroupedFeature__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__1_in_rule__GroupedFeature__Group_2_0_1__05113);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: rule__GroupedFeature__Group_2_0_1__0__Impl : ( 'type' ) ;
    public final void rule__GroupedFeature__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ( 'type' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: 'type'
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GroupedFeature__Group_2_0_1__0__Impl5141); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2545:1: rule__GroupedFeature__Group_2_0_1__1 : rule__GroupedFeature__Group_2_0_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: ( rule__GroupedFeature__Group_2_0_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:2: rule__GroupedFeature__Group_2_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__1__Impl_in_rule__GroupedFeature__Group_2_0_1__15172);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: rule__GroupedFeature__Group_2_0_1__1__Impl : ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: ( ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( rule__GroupedFeature__TypeAssignment_2_0_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeAssignment_2_0_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( rule__GroupedFeature__TypeAssignment_2_0_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:2: rule__GroupedFeature__TypeAssignment_2_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__TypeAssignment_2_0_1_1_in_rule__GroupedFeature__Group_2_0_1__1__Impl5199);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: rule__GroupedFeature__Group_2_0_2__0 : rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1 ;
    public final void rule__GroupedFeature__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: ( rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:2: rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__0__Impl_in_rule__GroupedFeature__Group_2_0_2__05233);
            rule__GroupedFeature__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__1_in_rule__GroupedFeature__Group_2_0_2__05236);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: rule__GroupedFeature__Group_2_0_2__0__Impl : ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:2: rule__GroupedFeature__GroupsAssignment_2_0_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_0_in_rule__GroupedFeature__Group_2_0_2__0__Impl5263);
            rule__GroupedFeature__GroupsAssignment_2_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: rule__GroupedFeature__Group_2_0_2__1 : rule__GroupedFeature__Group_2_0_2__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: ( rule__GroupedFeature__Group_2_0_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:2: rule__GroupedFeature__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__1__Impl_in_rule__GroupedFeature__Group_2_0_2__15293);
            rule__GroupedFeature__Group_2_0_2__1__Impl();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: rule__GroupedFeature__Group_2_0_2__1__Impl : ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==38) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2624:2: rule__GroupedFeature__GroupsAssignment_2_0_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_1_in_rule__GroupedFeature__Group_2_0_2__1__Impl5320);
            	    rule__GroupedFeature__GroupsAssignment_2_0_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_1()); 

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


    // $ANTLR start "rule__GroupedFeature__Group_2_0_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: rule__GroupedFeature__Group_2_0_3__0 : rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1 ;
    public final void rule__GroupedFeature__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:2: rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__0__Impl_in_rule__GroupedFeature__Group_2_0_3__05355);
            rule__GroupedFeature__Group_2_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__1_in_rule__GroupedFeature__Group_2_0_3__05358);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: rule__GroupedFeature__Group_2_0_3__0__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2654:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:2: rule__GroupedFeature__FeaturesAssignment_2_0_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_0_in_rule__GroupedFeature__Group_2_0_3__0__Impl5385);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: rule__GroupedFeature__Group_2_0_3__1 : rule__GroupedFeature__Group_2_0_3__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ( rule__GroupedFeature__Group_2_0_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:2: rule__GroupedFeature__Group_2_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__1__Impl_in_rule__GroupedFeature__Group_2_0_3__15415);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: rule__GroupedFeature__Group_2_0_3__1__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2683:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:2: rule__GroupedFeature__FeaturesAssignment_2_0_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_in_rule__GroupedFeature__Group_2_0_3__1__Impl5442);
            	    rule__GroupedFeature__FeaturesAssignment_2_0_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_1()); 

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


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2699:1: rule__GroupedFeature__Group_2_0_4__0 : rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1 ;
    public final void rule__GroupedFeature__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:2: rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__0__Impl_in_rule__GroupedFeature__Group_2_0_4__05477);
            rule__GroupedFeature__Group_2_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__1_in_rule__GroupedFeature__Group_2_0_4__05480);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2711:1: rule__GroupedFeature__Group_2_0_4__0__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4__0__Impl5508); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: rule__GroupedFeature__Group_2_0_4__1 : rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2 ;
    public final void rule__GroupedFeature__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: ( rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:2: rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__1__Impl_in_rule__GroupedFeature__Group_2_0_4__15539);
            rule__GroupedFeature__Group_2_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__2_in_rule__GroupedFeature__Group_2_0_4__15542);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: rule__GroupedFeature__Group_2_0_4__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:2: rule__GroupedFeature__ConstraintsAssignment_2_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_1_in_rule__GroupedFeature__Group_2_0_4__1__Impl5569);
            rule__GroupedFeature__ConstraintsAssignment_2_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_1()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: rule__GroupedFeature__Group_2_0_4__2 : rule__GroupedFeature__Group_2_0_4__2__Impl rule__GroupedFeature__Group_2_0_4__3 ;
    public final void rule__GroupedFeature__Group_2_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( rule__GroupedFeature__Group_2_0_4__2__Impl rule__GroupedFeature__Group_2_0_4__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:2: rule__GroupedFeature__Group_2_0_4__2__Impl rule__GroupedFeature__Group_2_0_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__2__Impl_in_rule__GroupedFeature__Group_2_0_4__25599);
            rule__GroupedFeature__Group_2_0_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__3_in_rule__GroupedFeature__Group_2_0_4__25602);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: rule__GroupedFeature__Group_2_0_4__2__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_2_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2776:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4__2__Impl5630); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_2()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: rule__GroupedFeature__Group_2_0_4__3 : rule__GroupedFeature__Group_2_0_4__3__Impl ;
    public final void rule__GroupedFeature__Group_2_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2794:1: ( rule__GroupedFeature__Group_2_0_4__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2795:2: rule__GroupedFeature__Group_2_0_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__3__Impl_in_rule__GroupedFeature__Group_2_0_4__35661);
            rule__GroupedFeature__Group_2_0_4__3__Impl();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: rule__GroupedFeature__Group_2_0_4__3__Impl : ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:1: ( ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( ( rule__GroupedFeature__Group_2_0_4_3__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:1: ( rule__GroupedFeature__Group_2_0_4_3__0 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( rule__GroupedFeature__Group_2_0_4_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:2: rule__GroupedFeature__Group_2_0_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0_in_rule__GroupedFeature__Group_2_0_4__3__Impl5688);
            	    rule__GroupedFeature__Group_2_0_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: rule__GroupedFeature__Group_2_0_4_3__0 : rule__GroupedFeature__Group_2_0_4_3__0__Impl rule__GroupedFeature__Group_2_0_4_3__1 ;
    public final void rule__GroupedFeature__Group_2_0_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ( rule__GroupedFeature__Group_2_0_4_3__0__Impl rule__GroupedFeature__Group_2_0_4_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:2: rule__GroupedFeature__Group_2_0_4_3__0__Impl rule__GroupedFeature__Group_2_0_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0__Impl_in_rule__GroupedFeature__Group_2_0_4_3__05727);
            rule__GroupedFeature__Group_2_0_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1_in_rule__GroupedFeature__Group_2_0_4_3__05730);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:1: rule__GroupedFeature__Group_2_0_4_3__0__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_2_0_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_3_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4_3__0__Impl5758); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_3_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: rule__GroupedFeature__Group_2_0_4_3__1 : rule__GroupedFeature__Group_2_0_4_3__1__Impl rule__GroupedFeature__Group_2_0_4_3__2 ;
    public final void rule__GroupedFeature__Group_2_0_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: ( rule__GroupedFeature__Group_2_0_4_3__1__Impl rule__GroupedFeature__Group_2_0_4_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:2: rule__GroupedFeature__Group_2_0_4_3__1__Impl rule__GroupedFeature__Group_2_0_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1__Impl_in_rule__GroupedFeature__Group_2_0_4_3__15789);
            rule__GroupedFeature__Group_2_0_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__2_in_rule__GroupedFeature__Group_2_0_4_3__15792);
            rule__GroupedFeature__Group_2_0_4_3__2();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: rule__GroupedFeature__Group_2_0_4_3__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2874:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:2: rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1_in_rule__GroupedFeature__Group_2_0_4_3__1__Impl5819);
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


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: rule__GroupedFeature__Group_2_0_4_3__2 : rule__GroupedFeature__Group_2_0_4_3__2__Impl ;
    public final void rule__GroupedFeature__Group_2_0_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: ( rule__GroupedFeature__Group_2_0_4_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:2: rule__GroupedFeature__Group_2_0_4_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_3__2__Impl_in_rule__GroupedFeature__Group_2_0_4_3__25849);
            rule__GroupedFeature__Group_2_0_4_3__2__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_3__2"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: rule__GroupedFeature__Group_2_0_4_3__2__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_2_0_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2901:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_3_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4_3__2__Impl5877); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_3_2()); 

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
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_3__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__GroupedFeature__Group_2_1__0 : rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1 ;
    public final void rule__GroupedFeature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:2: rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__0__Impl_in_rule__GroupedFeature__Group_2_1__05914);
            rule__GroupedFeature__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__1_in_rule__GroupedFeature__Group_2_1__05917);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: rule__GroupedFeature__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__GroupedFeature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( '=' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( '=' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: '='
            {
             before(grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__GroupedFeature__Group_2_1__0__Impl5945); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: rule__GroupedFeature__Group_2_1__1 : rule__GroupedFeature__Group_2_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( rule__GroupedFeature__Group_2_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:2: rule__GroupedFeature__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__1__Impl_in_rule__GroupedFeature__Group_2_1__15976);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: rule__GroupedFeature__Group_2_1__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:2: rule__GroupedFeature__ConstraintsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_1_1_in_rule__GroupedFeature__Group_2_1__1__Impl6003);
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


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__06037);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__06040);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: rule__Expression__Group__0__Impl : ( ruleLogical2Operation ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl6067);
            ruleLogical2Operation();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16096);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( ( rule__Expression__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:1: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: ( rule__Expression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=11 && LA33_0<=12)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl6123);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__06158);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__06161);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: ()
            {
             before(grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: 
            {
            }

             after(grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3077:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__16219);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__16222);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( rule__Expression__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:2: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl6249);
            rule__Expression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3106:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3111:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__26279);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RexpAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ( ( ( rule__Expression__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: ( rule__Expression__RexpAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: ( rule__Expression__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:2: rule__Expression__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl6306);
            rule__Expression__RexpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getRexpAssignment_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Logical2Operation__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: rule__Logical2Operation__Group__0 : rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 ;
    public final void rule__Logical2Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:2: rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__06342);
            rule__Logical2Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__06345);
            rule__Logical2Operation__Group__1();

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
    // $ANTLR end "rule__Logical2Operation__Group__0"


    // $ANTLR start "rule__Logical2Operation__Group__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: rule__Logical2Operation__Group__0__Impl : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl6372);
            ruleBinaryOperation();

            state._fsp--;

             after(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Logical2Operation__Group__0__Impl"


    // $ANTLR start "rule__Logical2Operation__Group__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3169:1: rule__Logical2Operation__Group__1 : rule__Logical2Operation__Group__1__Impl ;
    public final void rule__Logical2Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: ( rule__Logical2Operation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3174:2: rule__Logical2Operation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__16401);
            rule__Logical2Operation__Group__1__Impl();

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
    // $ANTLR end "rule__Logical2Operation__Group__1"


    // $ANTLR start "rule__Logical2Operation__Group__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: rule__Logical2Operation__Group__1__Impl : ( ( rule__Logical2Operation__Group_1__0 )* ) ;
    public final void rule__Logical2Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( ( ( rule__Logical2Operation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3186:1: ( rule__Logical2Operation__Group_1__0 )*
            {
             before(grammarAccess.getLogical2OperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: ( rule__Logical2Operation__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=13 && LA34_0<=15)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:2: rule__Logical2Operation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl6428);
            	    rule__Logical2Operation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getLogical2OperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Logical2Operation__Group__1__Impl"


    // $ANTLR start "rule__Logical2Operation__Group_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:1: rule__Logical2Operation__Group_1__0 : rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 ;
    public final void rule__Logical2Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ( rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:2: rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__06463);
            rule__Logical2Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__06466);
            rule__Logical2Operation__Group_1__1();

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
    // $ANTLR end "rule__Logical2Operation__Group_1__0"


    // $ANTLR start "rule__Logical2Operation__Group_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: rule__Logical2Operation__Group_1__0__Impl : ( () ) ;
    public final void rule__Logical2Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3217:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ()
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: 
            {
            }

             after(grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical2Operation__Group_1__0__Impl"


    // $ANTLR start "rule__Logical2Operation__Group_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: rule__Logical2Operation__Group_1__1 : rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 ;
    public final void rule__Logical2Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:2: rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__16524);
            rule__Logical2Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__16527);
            rule__Logical2Operation__Group_1__2();

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
    // $ANTLR end "rule__Logical2Operation__Group_1__1"


    // $ANTLR start "rule__Logical2Operation__Group_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: rule__Logical2Operation__Group_1__1__Impl : ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) ;
    public final void rule__Logical2Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: ( ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:2: rule__Logical2Operation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl6554);
            rule__Logical2Operation__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogical2OperationAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Logical2Operation__Group_1__1__Impl"


    // $ANTLR start "rule__Logical2Operation__Group_1__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: rule__Logical2Operation__Group_1__2 : rule__Logical2Operation__Group_1__2__Impl ;
    public final void rule__Logical2Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( rule__Logical2Operation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:2: rule__Logical2Operation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__26584);
            rule__Logical2Operation__Group_1__2__Impl();

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
    // $ANTLR end "rule__Logical2Operation__Group_1__2"


    // $ANTLR start "rule__Logical2Operation__Group_1__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: rule__Logical2Operation__Group_1__2__Impl : ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) ;
    public final void rule__Logical2Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:2: rule__Logical2Operation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl6611);
            rule__Logical2Operation__RexpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogical2OperationAccess().getRexpAssignment_1_2()); 

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
    // $ANTLR end "rule__Logical2Operation__Group_1__2__Impl"


    // $ANTLR start "rule__BinaryOperation__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: rule__BinaryOperation__Group__0 : rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 ;
    public final void rule__BinaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: ( rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:2: rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__06647);
            rule__BinaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__06650);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: rule__BinaryOperation__Group__0__Impl : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl6677);
            ruleAtomicExp();

            state._fsp--;

             after(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: rule__BinaryOperation__Group__1 : rule__BinaryOperation__Group__1__Impl ;
    public final void rule__BinaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( rule__BinaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:2: rule__BinaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16706);
            rule__BinaryOperation__Group__1__Impl();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: rule__BinaryOperation__Group__1__Impl : ( ( rule__BinaryOperation__Group_1__0 )* ) ;
    public final void rule__BinaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: ( ( ( rule__BinaryOperation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ( rule__BinaryOperation__Group_1__0 )*
            {
             before(grammarAccess.getBinaryOperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( rule__BinaryOperation__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=16 && LA35_0<=19)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:2: rule__BinaryOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl6733);
            	    rule__BinaryOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getBinaryOperationAccess().getGroup_1()); 

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


    // $ANTLR start "rule__BinaryOperation__Group_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: rule__BinaryOperation__Group_1__0 : rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 ;
    public final void rule__BinaryOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:1: ( rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:2: rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__06768);
            rule__BinaryOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__06771);
            rule__BinaryOperation__Group_1__1();

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
    // $ANTLR end "rule__BinaryOperation__Group_1__0"


    // $ANTLR start "rule__BinaryOperation__Group_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: rule__BinaryOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: ()
            {
             before(grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3375:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: 
            {
            }

             after(grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryOperation__Group_1__0__Impl"


    // $ANTLR start "rule__BinaryOperation__Group_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:1: rule__BinaryOperation__Group_1__1 : rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 ;
    public final void rule__BinaryOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:2: rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__16829);
            rule__BinaryOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__16832);
            rule__BinaryOperation__Group_1__2();

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
    // $ANTLR end "rule__BinaryOperation__Group_1__1"


    // $ANTLR start "rule__BinaryOperation__Group_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: rule__BinaryOperation__Group_1__1__Impl : ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__BinaryOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:2: rule__BinaryOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl6859);
            rule__BinaryOperation__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__BinaryOperation__Group_1__1__Impl"


    // $ANTLR start "rule__BinaryOperation__Group_1__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: rule__BinaryOperation__Group_1__2 : rule__BinaryOperation__Group_1__2__Impl ;
    public final void rule__BinaryOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: ( rule__BinaryOperation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:2: rule__BinaryOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__26889);
            rule__BinaryOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__BinaryOperation__Group_1__2"


    // $ANTLR start "rule__BinaryOperation__Group_1__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:1: rule__BinaryOperation__Group_1__2__Impl : ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) ;
    public final void rule__BinaryOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: ( ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:2: rule__BinaryOperation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl6916);
            rule__BinaryOperation__RexpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryOperationAccess().getRexpAssignment_1_2()); 

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
    // $ANTLR end "rule__BinaryOperation__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryOperation__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06952);
            rule__UnaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06955);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl6982);
            rule__UnaryOperation__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__17012);
            rule__UnaryOperation__Group__1__Impl();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3490:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__ExpAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: ( ( ( rule__UnaryOperation__ExpAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: ( rule__UnaryOperation__ExpAssignment_1 )
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: ( rule__UnaryOperation__ExpAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:2: rule__UnaryOperation__ExpAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl7039);
            rule__UnaryOperation__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryOperationAccess().getExpAssignment_1()); 

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


    // $ANTLR start "rule__AtomicExp__Group_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: rule__AtomicExp__Group_3__0 : rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 ;
    public final void rule__AtomicExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: ( rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:2: rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__07073);
            rule__AtomicExp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__07076);
            rule__AtomicExp__Group_3__1();

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
    // $ANTLR end "rule__AtomicExp__Group_3__0"


    // $ANTLR start "rule__AtomicExp__Group_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: rule__AtomicExp__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: '('
            {
             before(grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__AtomicExp__Group_3__0__Impl7104); 
             after(grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__AtomicExp__Group_3__0__Impl"


    // $ANTLR start "rule__AtomicExp__Group_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: rule__AtomicExp__Group_3__1 : rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 ;
    public final void rule__AtomicExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3546:1: ( rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3547:2: rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__17135);
            rule__AtomicExp__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__17138);
            rule__AtomicExp__Group_3__2();

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
    // $ANTLR end "rule__AtomicExp__Group_3__1"


    // $ANTLR start "rule__AtomicExp__Group_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: rule__AtomicExp__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:1: ruleExpression
            {
             before(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl7165);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__AtomicExp__Group_3__1__Impl"


    // $ANTLR start "rule__AtomicExp__Group_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: rule__AtomicExp__Group_3__2 : rule__AtomicExp__Group_3__2__Impl ;
    public final void rule__AtomicExp__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3575:1: ( rule__AtomicExp__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:2: rule__AtomicExp__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__27194);
            rule__AtomicExp__Group_3__2__Impl();

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
    // $ANTLR end "rule__AtomicExp__Group_3__2"


    // $ANTLR start "rule__AtomicExp__Group_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: rule__AtomicExp__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExp__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ')'
            {
             before(grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__AtomicExp__Group_3__2__Impl7222); 
             after(grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__AtomicExp__Group_3__2__Impl"


    // $ANTLR start "rule__NULL__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3607:1: rule__NULL__Group__0 : rule__NULL__Group__0__Impl rule__NULL__Group__1 ;
    public final void rule__NULL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: ( rule__NULL__Group__0__Impl rule__NULL__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:2: rule__NULL__Group__0__Impl rule__NULL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__07259);
            rule__NULL__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__07262);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: rule__NULL__Group__0__Impl : ( () ) ;
    public final void rule__NULL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: ()
            {
             before(grammarAccess.getNULLAccess().getNULLAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3626:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3638:1: rule__NULL__Group__1 : rule__NULL__Group__1__Impl ;
    public final void rule__NULL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:1: ( rule__NULL__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:2: rule__NULL__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__17320);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: rule__NULL__Group__1__Impl : ( 'NULL' ) ;
    public final void rule__NULL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: ( ( 'NULL' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:1: ( 'NULL' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:1: ( 'NULL' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: 'NULL'
            {
             before(grammarAccess.getNULLAccess().getNULLKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__NULL__Group__1__Impl7348); 
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


    // $ANTLR start "rule__EInt__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07383);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07386);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==43) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:2: '-'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_rule__EInt__Group__0__Impl7415); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17448);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: ( RULE_INT )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7475); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: rule__Model__RootFeatureAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17513);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: rule__Model__RootFeatureAssignment_3_2_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17544);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__SolitaryFeature__RequiredAssignment_1 : ( ruleSolitaryType ) ;
    public final void rule__SolitaryFeature__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ( ruleSolitaryType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ruleSolitaryType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ruleSolitaryType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: ruleSolitaryType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17575);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3781:1: rule__SolitaryFeature__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SolitaryFeature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3786:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3787:1: ruleEString
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_27606);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__SolitaryFeature__TypeAssignment_3_0_1_1 : ( ruleSimpleType ) ;
    public final void rule__SolitaryFeature__TypeAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: ruleSimpleType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_3_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_3_0_1_17637);
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


    // $ANTLR start "rule__SolitaryFeature__FeaturesAssignment_3_0_2_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_07668);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_0_0()); 

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
    // $ANTLR end "rule__SolitaryFeature__FeaturesAssignment_3_0_2_0"


    // $ANTLR start "rule__SolitaryFeature__FeaturesAssignment_3_0_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_17699);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_1_0()); 

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
    // $ANTLR end "rule__SolitaryFeature__FeaturesAssignment_3_0_2_1"


    // $ANTLR start "rule__SolitaryFeature__GroupsAssignment_3_0_3_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: rule__SolitaryFeature__GroupsAssignment_3_0_3_0 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_3_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_07730);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_0_0()); 

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
    // $ANTLR end "rule__SolitaryFeature__GroupsAssignment_3_0_3_0"


    // $ANTLR start "rule__SolitaryFeature__GroupsAssignment_3_0_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: rule__SolitaryFeature__GroupsAssignment_3_0_3_1 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_17761);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_1_0()); 

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
    // $ANTLR end "rule__SolitaryFeature__GroupsAssignment_3_0_3_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3876:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_17792);
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


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_17823);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_3_1_0()); 

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
    // $ANTLR end "rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_3_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: rule__SolitaryFeature__ConstraintsAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3907:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_1_17854);
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


    // $ANTLR start "rule__Group__InclusiveAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: rule__Group__InclusiveAssignment_1 : ( ( 'any' ) ) ;
    public final void rule__Group__InclusiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( ( ( 'any' ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( ( 'any' ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( ( 'any' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( 'any' )
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'any' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: 'any'
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Group__InclusiveAssignment_17890); 
             after(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 

            }

             after(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 

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
    // $ANTLR end "rule__Group__InclusiveAssignment_1"


    // $ANTLR start "rule__Group__GroupedFeaturesAssignment_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: rule__Group__GroupedFeaturesAssignment_2 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_27929);
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


    // $ANTLR start "rule__Group__GroupedFeaturesAssignment_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: rule__Group__GroupedFeaturesAssignment_3_1 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_3_17960);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Group__GroupedFeaturesAssignment_3_1"


    // $ANTLR start "rule__GroupedFeature__NameAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: rule__GroupedFeature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GroupedFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ruleEString
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_17991);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: rule__GroupedFeature__TypeAssignment_2_0_1_1 : ( ruleSimpleType ) ;
    public final void rule__GroupedFeature__TypeAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: ruleSimpleType
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_2_0_1_18022);
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


    // $ANTLR start "rule__GroupedFeature__GroupsAssignment_2_0_2_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: rule__GroupedFeature__GroupsAssignment_2_0_2_0 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_08053);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_0_0()); 

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
    // $ANTLR end "rule__GroupedFeature__GroupsAssignment_2_0_2_0"


    // $ANTLR start "rule__GroupedFeature__GroupsAssignment_2_0_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:1: rule__GroupedFeature__GroupsAssignment_2_0_2_1 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_18084);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_1_0()); 

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
    // $ANTLR end "rule__GroupedFeature__GroupsAssignment_2_0_2_1"


    // $ANTLR start "rule__GroupedFeature__FeaturesAssignment_2_0_3_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4029:1: rule__GroupedFeature__FeaturesAssignment_2_0_3_0 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_2_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_08115);
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


    // $ANTLR start "rule__GroupedFeature__FeaturesAssignment_2_0_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: rule__GroupedFeature__FeaturesAssignment_2_0_3_1 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_18146);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_0()); 

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
    // $ANTLR end "rule__GroupedFeature__FeaturesAssignment_2_0_3_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_0_4_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4059:1: rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_18177);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_1_0()); 

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
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_2_0_4_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:1: rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_18208);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: rule__GroupedFeature__ConstraintsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4095:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_1_18239);
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


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: rule__Expression__OperatorAssignment_1_1 : ( ruleLogicalOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ( ruleLogicalOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( ruleLogicalOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( ruleLogicalOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: ruleLogicalOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_18270);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__OperatorAssignment_1_1"


    // $ANTLR start "rule__Expression__RexpAssignment_1_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: rule__Expression__RexpAssignment_1_2 : ( ruleLogical2Operation ) ;
    public final void rule__Expression__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_28301);
            ruleLogical2Operation();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Expression__RexpAssignment_1_2"


    // $ANTLR start "rule__Logical2Operation__OperatorAssignment_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: rule__Logical2Operation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__Logical2Operation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: ( ( ruleCompareOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ( ruleCompareOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ( ruleCompareOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ruleCompareOperator
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_18332);
            ruleCompareOperator();

            state._fsp--;

             after(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Logical2Operation__OperatorAssignment_1_1"


    // $ANTLR start "rule__Logical2Operation__RexpAssignment_1_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4149:1: rule__Logical2Operation__RexpAssignment_1_2 : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4154:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_28363);
            ruleBinaryOperation();

            state._fsp--;

             after(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Logical2Operation__RexpAssignment_1_2"


    // $ANTLR start "rule__BinaryOperation__OperatorAssignment_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: rule__BinaryOperation__OperatorAssignment_1_1 : ( ruleArithmicOperator ) ;
    public final void rule__BinaryOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( ( ruleArithmicOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( ruleArithmicOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( ruleArithmicOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ruleArithmicOperator
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_18394);
            ruleArithmicOperator();

            state._fsp--;

             after(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BinaryOperation__OperatorAssignment_1_1"


    // $ANTLR start "rule__BinaryOperation__RexpAssignment_1_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4179:1: rule__BinaryOperation__RexpAssignment_1_2 : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4185:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_28425);
            ruleAtomicExp();

            state._fsp--;

             after(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__BinaryOperation__RexpAssignment_1_2"


    // $ANTLR start "rule__UnaryOperation__OperatorAssignment_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4198:1: ( ( ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:1: ( ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:1: ( ruleUnaryOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_08456);
            ruleUnaryOperator();

            state._fsp--;

             after(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__UnaryOperation__OperatorAssignment_0"


    // $ANTLR start "rule__UnaryOperation__ExpAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: rule__UnaryOperation__ExpAssignment_1 : ( ruleAtomicExp ) ;
    public final void rule__UnaryOperation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ruleAtomicExp
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_18487);
            ruleAtomicExp();

            state._fsp--;

             after(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__UnaryOperation__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: rule__Number__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( ruleEInt )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:1: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8518);
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


    // $ANTLR start "rule__Identifier__RefAssignment"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4239:1: rule__Identifier__RefAssignment : ( ( ruleEString ) ) ;
    public final void rule__Identifier__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( ruleEString )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4247:1: ruleEString
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Identifier__RefAssignment8553);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0()); 

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
    // $ANTLR end "rule__Identifier__RefAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_entryRuleSolitaryFeature181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSolitaryFeature188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0_in_ruleSolitaryFeature214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0_in_ruleGroupedFeature394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogical2Operation488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__0_in_ruleLogical2Operation514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0_in_ruleBinaryOperation574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExp668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Alternatives_in_ruleAtomicExp694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0_in_ruleNULL754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_in_ruleIdentifier874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmicOperator__Alternatives_in_ruleArithmicOperator1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType1153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives1188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__0_in_rule__SolitaryFeature__Alternatives_31237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__0_in_rule__SolitaryFeature__Alternatives_31255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__0_in_rule__GroupedFeature__Alternatives_21337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__0_in_rule__GroupedFeature__Alternatives_21355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__LogicalOperator__Alternatives1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LogicalOperator__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CompareOperator__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CompareOperator__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CompareOperator__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ArithmicOperator__Alternatives1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ArithmicOperator__Alternatives1647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ArithmicOperator__Alternatives1668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ArithmicOperator__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__UnaryOperator__Alternatives1725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__UnaryOperator__Alternatives1746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SimpleType__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleType__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleType__Alternatives1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SimpleType__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SolitaryType__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SolitaryType__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01935 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11996 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Model__Group__1__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22058 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Model__Group__2__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32120 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Model__Group__4__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02250 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group_3__0__Impl2281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12312 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2399 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02436 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group_3_2__0__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02559 = new BitSet(new long[]{0x000000010C000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SolitaryFeature__Group__0__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12621 = new BitSet(new long[]{0x000000010C000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22682 = new BitSet(new long[]{0x0000002200000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__NameAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Alternatives_3_in_rule__SolitaryFeature__Group__3__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__0__Impl_in_rule__SolitaryFeature__Group_3_0__02808 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__1_in_rule__SolitaryFeature__Group_3_0__02811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SolitaryFeature__Group_3_0__0__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__1__Impl_in_rule__SolitaryFeature__Group_3_0__12870 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__2_in_rule__SolitaryFeature__Group_3_0__12873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__0_in_rule__SolitaryFeature__Group_3_0__1__Impl2900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__2__Impl_in_rule__SolitaryFeature__Group_3_0__22931 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__3_in_rule__SolitaryFeature__Group_3_0__22934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__0_in_rule__SolitaryFeature__Group_3_0__2__Impl2961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__3__Impl_in_rule__SolitaryFeature__Group_3_0__32992 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__4_in_rule__SolitaryFeature__Group_3_0__32995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__0_in_rule__SolitaryFeature__Group_3_0__3__Impl3022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__4__Impl_in_rule__SolitaryFeature__Group_3_0__43053 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__5_in_rule__SolitaryFeature__Group_3_0__43056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__0_in_rule__SolitaryFeature__Group_3_0__4__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__5__Impl_in_rule__SolitaryFeature__Group_3_0__53114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SolitaryFeature__Group_3_0__5__Impl3142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__0__Impl_in_rule__SolitaryFeature__Group_3_0_1__03185 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__1_in_rule__SolitaryFeature__Group_3_0_1__03188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__SolitaryFeature__Group_3_0_1__0__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__1__Impl_in_rule__SolitaryFeature__Group_3_0_1__13247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__TypeAssignment_3_0_1_1_in_rule__SolitaryFeature__Group_3_0_1__1__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_2__03308 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__1_in_rule__SolitaryFeature__Group_3_0_2__03311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_0_in_rule__SolitaryFeature__Group_3_0_2__0__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_2__13368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_1_in_rule__SolitaryFeature__Group_3_0_2__1__Impl3395 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_3__03430 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__1_in_rule__SolitaryFeature__Group_3_0_3__03433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_0_in_rule__SolitaryFeature__Group_3_0_3__0__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_3__13490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_1_in_rule__SolitaryFeature__Group_3_0_3__1__Impl3517 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__0__Impl_in_rule__SolitaryFeature__Group_3_0_4__03552 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__1_in_rule__SolitaryFeature__Group_3_0_4__03555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__0__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__1__Impl_in_rule__SolitaryFeature__Group_3_0_4__13614 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__2_in_rule__SolitaryFeature__Group_3_0_4__13617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1_in_rule__SolitaryFeature__Group_3_0_4__1__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__2__Impl_in_rule__SolitaryFeature__Group_3_0_4__23674 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__3_in_rule__SolitaryFeature__Group_3_0_4__23677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__2__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__3__Impl_in_rule__SolitaryFeature__Group_3_0_4__33736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__0_in_rule__SolitaryFeature__Group_3_0_4__3__Impl3763 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_4_3__03802 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__1_in_rule__SolitaryFeature__Group_3_0_4_3__03805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4_3__0__Impl3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_4_3__13864 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__2_in_rule__SolitaryFeature__Group_3_0_4_3__13867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_1_in_rule__SolitaryFeature__Group_3_0_4_3__1__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_3__2__Impl_in_rule__SolitaryFeature__Group_3_0_4_3__23924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4_3__2__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__0__Impl_in_rule__SolitaryFeature__Group_3_1__03989 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__1_in_rule__SolitaryFeature__Group_3_1__03992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SolitaryFeature__Group_3_1__0__Impl4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__1__Impl_in_rule__SolitaryFeature__Group_3_1__14051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_1_1_in_rule__SolitaryFeature__Group_3_1__1__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__04112 = new BitSet(new long[]{0x0000100100000030L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__04115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Group__Group__0__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__14174 = new BitSet(new long[]{0x0000100100000030L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__14177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__24235 = new BitSet(new long[]{0x0000008400000000L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__24238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_2_in_rule__Group__Group__2__Impl4265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__34295 = new BitSet(new long[]{0x0000008400000000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__34298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_3__0_in_rule__Group__Group__3__Impl4325 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Group__Group__4__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_3__0__Impl_in_rule__Group__Group_3__04425 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__Group__Group_3__1_in_rule__Group__Group_3__04428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Group__Group_3__0__Impl4456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_3__1__Impl_in_rule__Group__Group_3__14487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_3_1_in_rule__Group__Group_3__1__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04548 = new BitSet(new long[]{0x0000000100000030L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14609 = new BitSet(new long[]{0x0000002200000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Alternatives_2_in_rule__GroupedFeature__Group__2__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__0__Impl_in_rule__GroupedFeature__Group_2_0__04733 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__1_in_rule__GroupedFeature__Group_2_0__04736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__GroupedFeature__Group_2_0__0__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__1__Impl_in_rule__GroupedFeature__Group_2_0__14795 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__2_in_rule__GroupedFeature__Group_2_0__14798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__0_in_rule__GroupedFeature__Group_2_0__1__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__2__Impl_in_rule__GroupedFeature__Group_2_0__24856 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__3_in_rule__GroupedFeature__Group_2_0__24859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__0_in_rule__GroupedFeature__Group_2_0__2__Impl4886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__3__Impl_in_rule__GroupedFeature__Group_2_0__34917 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__4_in_rule__GroupedFeature__Group_2_0__34920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__0_in_rule__GroupedFeature__Group_2_0__3__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__4__Impl_in_rule__GroupedFeature__Group_2_0__44978 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__5_in_rule__GroupedFeature__Group_2_0__44981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__0_in_rule__GroupedFeature__Group_2_0__4__Impl5008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__5__Impl_in_rule__GroupedFeature__Group_2_0__55039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__GroupedFeature__Group_2_0__5__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__0__Impl_in_rule__GroupedFeature__Group_2_0_1__05110 = new BitSet(new long[]{0x0000000003C00000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__1_in_rule__GroupedFeature__Group_2_0_1__05113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GroupedFeature__Group_2_0_1__0__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__1__Impl_in_rule__GroupedFeature__Group_2_0_1__15172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__TypeAssignment_2_0_1_1_in_rule__GroupedFeature__Group_2_0_1__1__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__0__Impl_in_rule__GroupedFeature__Group_2_0_2__05233 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__1_in_rule__GroupedFeature__Group_2_0_2__05236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_0_in_rule__GroupedFeature__Group_2_0_2__0__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__1__Impl_in_rule__GroupedFeature__Group_2_0_2__15293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_1_in_rule__GroupedFeature__Group_2_0_2__1__Impl5320 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__0__Impl_in_rule__GroupedFeature__Group_2_0_3__05355 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__1_in_rule__GroupedFeature__Group_2_0_3__05358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_0_in_rule__GroupedFeature__Group_2_0_3__0__Impl5385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__1__Impl_in_rule__GroupedFeature__Group_2_0_3__15415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_in_rule__GroupedFeature__Group_2_0_3__1__Impl5442 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__0__Impl_in_rule__GroupedFeature__Group_2_0_4__05477 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__1_in_rule__GroupedFeature__Group_2_0_4__05480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4__0__Impl5508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__1__Impl_in_rule__GroupedFeature__Group_2_0_4__15539 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__2_in_rule__GroupedFeature__Group_2_0_4__15542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_1_in_rule__GroupedFeature__Group_2_0_4__1__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__2__Impl_in_rule__GroupedFeature__Group_2_0_4__25599 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__3_in_rule__GroupedFeature__Group_2_0_4__25602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4__2__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__3__Impl_in_rule__GroupedFeature__Group_2_0_4__35661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0_in_rule__GroupedFeature__Group_2_0_4__3__Impl5688 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__0__Impl_in_rule__GroupedFeature__Group_2_0_4_3__05727 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1_in_rule__GroupedFeature__Group_2_0_4_3__05730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4_3__0__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__1__Impl_in_rule__GroupedFeature__Group_2_0_4_3__15789 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__2_in_rule__GroupedFeature__Group_2_0_4_3__15792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_1_in_rule__GroupedFeature__Group_2_0_4_3__1__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_3__2__Impl_in_rule__GroupedFeature__Group_2_0_4_3__25849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4_3__2__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__0__Impl_in_rule__GroupedFeature__Group_2_1__05914 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__1_in_rule__GroupedFeature__Group_2_1__05917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__GroupedFeature__Group_2_1__0__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__1__Impl_in_rule__GroupedFeature__Group_2_1__15976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_1_1_in_rule__GroupedFeature__Group_2_1__1__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__06037 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__06040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl6123 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__06158 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__06161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__16219 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__16222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__26279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__06342 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__06345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__16401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl6428 = new BitSet(new long[]{0x000000000000E002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__06463 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__06466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__16524 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__16527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__26584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__06647 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__06650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl6733 = new BitSet(new long[]{0x00000000000F0002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__06768 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__06771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__16829 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__16832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__26889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl6916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06952 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__17012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl7039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__07073 = new BitSet(new long[]{0x00000D0100300070L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__07076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__AtomicExp__Group_3__0__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__17135 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__17138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__27194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__AtomicExp__Group_3__2__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__07259 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__07262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__17320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__NULL__Group__1__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07383 = new BitSet(new long[]{0x0000080000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__EInt__Group__0__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_27606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_3_0_1_17637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_07668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_17699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_07730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_17761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_17792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_3_17823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_1_17854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Group__InclusiveAssignment_17890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_27929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_3_17960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_17991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_2_0_1_18022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_08053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_18084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_08115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_18146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_18177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_3_18208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_1_18239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_18270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_28301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_18332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_28363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_18394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_28425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_08456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_18487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Identifier__RefAssignment8553 = new BitSet(new long[]{0x0000000000000002L});
    }


}