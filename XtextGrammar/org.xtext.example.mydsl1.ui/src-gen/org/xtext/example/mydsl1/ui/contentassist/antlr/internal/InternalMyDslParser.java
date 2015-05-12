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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'", "'Model'", "'{'", "'}'", "'Root'", "'feature'", "'#'", "'select'", "'('", "')'", "','", "'.'", "'NULL'", "'-'", "'any'"
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


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleGroup EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup241);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup248); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Group__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Group__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Group__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0_in_ruleGroup274);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleGroupedFeature : ruleGroupedFeature EOF ;
    public final void entryRuleGroupedFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleGroupedFeature EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleGroupedFeature EOF
            {
             before(grammarAccess.getGroupedFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature301);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroupedFeature308); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleGroupedFeature : ( ( rule__GroupedFeature__Group__0 ) ) ;
    public final void ruleGroupedFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__GroupedFeature__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__GroupedFeature__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__GroupedFeature__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__GroupedFeature__Group__0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__GroupedFeature__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__GroupedFeature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0_in_ruleGroupedFeature334);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleExpression EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression361);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression368); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Expression__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Expression__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Expression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0_in_ruleExpression394);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleLogical2Operation : ruleLogical2Operation EOF ;
    public final void entryRuleLogical2Operation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleLogical2Operation EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleLogical2Operation EOF
            {
             before(grammarAccess.getLogical2OperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation421);
            ruleLogical2Operation();

            state._fsp--;

             after(grammarAccess.getLogical2OperationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogical2Operation428); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleLogical2Operation : ( ( rule__Logical2Operation__Group__0 ) ) ;
    public final void ruleLogical2Operation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Logical2Operation__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Logical2Operation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Logical2Operation__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Logical2Operation__Group__0 )
            {
             before(grammarAccess.getLogical2OperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Logical2Operation__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Logical2Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__0_in_ruleLogical2Operation454);
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


    // $ANTLR start "entryRuleAtomicExp"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleAtomicExp : ruleAtomicExp EOF ;
    public final void entryRuleAtomicExp() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleAtomicExp EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleAtomicExp EOF
            {
             before(grammarAccess.getAtomicExpRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp601);
            ruleAtomicExp();

            state._fsp--;

             after(grammarAccess.getAtomicExpRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExp608); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleAtomicExp : ( ( rule__AtomicExp__Alternatives ) ) ;
    public final void ruleAtomicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__AtomicExp__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__AtomicExp__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__AtomicExp__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__AtomicExp__Alternatives )
            {
             before(grammarAccess.getAtomicExpAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__AtomicExp__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__AtomicExp__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Alternatives_in_ruleAtomicExp634);
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


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleIdentifier EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_entryRuleIdentifier661);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentifier668); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleIdentifier : ( ( rule__Identifier__Group__0 ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Identifier__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Identifier__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Identifier__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Identifier__Group__0 )
            {
             before(grammarAccess.getIdentifierAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Identifier__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Identifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier694);
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


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleEInt EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt841);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt848); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__EInt__Group__0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__EInt__Group__0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt874);
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString903);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString910); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: ruleEString : ( RULE_ID ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:467:2: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( RULE_ID )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: RULE_ID
            {
             before(grammarAccess.getEStringAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString936); 
             after(grammarAccess.getEStringAccess().getIDTerminalRuleCall()); 

            }


            }

        }
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
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator972);
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
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1008);
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
            pushFollow(FollowSets000.FOLLOW_rule__ArithmicOperator__Alternatives_in_ruleArithmicOperator1044);
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
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1080);
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
            pushFollow(FollowSets000.FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1116);
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
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType1152);
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
            else if ( (LA1_0==RULE_ID) ) {
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
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives1187);
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
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1204);
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


    // $ANTLR start "rule__AtomicExp__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:618:1: rule__AtomicExp__Alternatives : ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) );
    public final void rule__AtomicExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
            case 40:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 20:
            case 21:
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ruleNULL )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ruleNULL )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ruleNULL
                    {
                     before(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1236);
                    ruleNULL();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ruleNumber )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:629:6: ( ruleNumber )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ruleNumber
                    {
                     before(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1253);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:635:6: ( ruleIdentifier )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:635:6: ( ruleIdentifier )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ruleIdentifier
                    {
                     before(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1270);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:641:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:641:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: ( rule__AtomicExp__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpAccess().getGroup_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:643:1: ( rule__AtomicExp__Group_3__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:643:2: rule__AtomicExp__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1287);
                    rule__AtomicExp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:647:6: ( ruleUnaryOperation )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:647:6: ( ruleUnaryOperation )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ruleUnaryOperation
                    {
                     before(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1305);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: rule__LogicalOperator__Alternatives : ( ( ( 'And' ) ) | ( ( 'Or' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: ( ( ( 'And' ) ) | ( ( 'Or' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( 'And' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( 'And' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( 'And' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( 'And' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:3: 'And'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__LogicalOperator__Alternatives1339); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:6: ( ( 'Or' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:6: ( ( 'Or' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( 'Or' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( 'Or' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:3: 'Or'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__LogicalOperator__Alternatives1360); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: rule__CompareOperator__Alternatives : ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( 'Equals' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( ( 'Equals' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( 'Equals' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( 'Equals' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:3: 'Equals'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__CompareOperator__Alternatives1396); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:6: ( ( 'Higher' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:6: ( ( 'Higher' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( 'Higher' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: ( 'Higher' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:697:3: 'Higher'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__CompareOperator__Alternatives1417); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:702:6: ( ( 'Lower' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:702:6: ( ( 'Lower' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: ( 'Lower' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: ( 'Lower' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:704:3: 'Lower'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__CompareOperator__Alternatives1438); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: rule__ArithmicOperator__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) );
    public final void rule__ArithmicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( 'Add' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( 'Add' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( 'Add' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( 'Add' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:3: 'Add'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ArithmicOperator__Alternatives1474); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:726:6: ( ( 'Subtract' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:726:6: ( ( 'Subtract' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( 'Subtract' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: ( 'Subtract' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:728:3: 'Subtract'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ArithmicOperator__Alternatives1495); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:733:6: ( ( 'Divide' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:733:6: ( ( 'Divide' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: ( 'Divide' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:1: ( 'Divide' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:3: 'Divide'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ArithmicOperator__Alternatives1516); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:6: ( ( 'Multiply' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:6: ( ( 'Multiply' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( 'Multiply' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( 'Multiply' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:3: 'Multiply'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ArithmicOperator__Alternatives1537); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: rule__UnaryOperator__Alternatives : ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( ( 'Not' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( ( 'Not' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: ( 'Not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:759:1: ( 'Not' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:759:3: 'Not'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__UnaryOperator__Alternatives1573); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:764:6: ( ( 'Minus' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:764:6: ( ( 'Minus' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( 'Minus' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( 'Minus' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:3: 'Minus'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__UnaryOperator__Alternatives1594); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: rule__SimpleType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( ( 'boolean' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( 'boolean' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:783:3: 'boolean'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__SimpleType__Alternatives1630); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:788:6: ( ( 'int' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:788:6: ( ( 'int' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( 'int' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:790:3: 'int'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleType__Alternatives1651); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:795:6: ( ( 'double' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:795:6: ( ( 'double' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( 'double' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:3: 'double'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleType__Alternatives1672); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:802:6: ( ( 'String' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:802:6: ( ( 'String' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( 'String' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:804:3: 'String'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__SimpleType__Alternatives1693); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: rule__SolitaryType__Alternatives : ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) );
    public final void rule__SolitaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( ( 'Optional' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( ( 'Optional' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( 'Optional' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( 'Optional' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:821:3: 'Optional'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__SolitaryType__Alternatives1729); 

                    }

                     after(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:826:6: ( ( 'Mandatory' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:826:6: ( ( 'Mandatory' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( 'Mandatory' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( 'Mandatory' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:828:3: 'Mandatory'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__SolitaryType__Alternatives1750); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:845:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01783);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01786);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:871:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:876:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11844);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11847);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( 'Model' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( 'Model' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Model__Group__1__Impl1875); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21906);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21909);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Model__Group__2__Impl1937); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:938:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31968);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31971);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( rule__Model__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:952:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1998);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:967:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42029);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Model__Group__4__Impl2057); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02098);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02101);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: rule__Model__Group_3__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1018:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1019:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group_3__0__Impl2129); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12160);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12163);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( ( ( rule__Model__RootFeatureAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1050:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1051:1: ( rule__Model__RootFeatureAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: ( rule__Model__RootFeatureAssignment_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:2: rule__Model__RootFeatureAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2190);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ( rule__Model__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22220);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__Group_3_2__0 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ( ( ( rule__Model__Group_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( ( rule__Model__Group_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( ( rule__Model__Group_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( rule__Model__Group_3_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( rule__Model__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:2: rule__Model__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2247);
            	    rule__Model__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: rule__Model__Group_3_2__0 : rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 ;
    public final void rule__Model__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: ( rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:2: rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02284);
            rule__Model__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02287);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: rule__Model__Group_3_2__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_2_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group_3_2__0__Impl2315); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: rule__Model__Group_3_2__1 : rule__Model__Group_3_2__1__Impl ;
    public final void rule__Model__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__Model__Group_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:2: rule__Model__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12346);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: rule__Model__Group_3_2__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) ;
    public final void rule__Model__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:2: rule__Model__RootFeatureAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2373);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: rule__SolitaryFeature__Group__0 : rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 ;
    public final void rule__SolitaryFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: ( rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:2: rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02407);
            rule__SolitaryFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02410);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: rule__SolitaryFeature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__SolitaryFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( ( 'feature' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( 'feature' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:1: ( 'feature' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: 'feature'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SolitaryFeature__Group__0__Impl2438); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: rule__SolitaryFeature__Group__1 : rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 ;
    public final void rule__SolitaryFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:2: rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12469);
            rule__SolitaryFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12472);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rule__SolitaryFeature__Group__1__Impl : ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) ;
    public final void rule__SolitaryFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1208:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:2: rule__SolitaryFeature__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2499);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: rule__SolitaryFeature__Group__2 : rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 ;
    public final void rule__SolitaryFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ( rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:2: rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22530);
            rule__SolitaryFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22533);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: rule__SolitaryFeature__Group__2__Impl : ( ( rule__SolitaryFeature__TypeAssignment_2 )? ) ;
    public final void rule__SolitaryFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: ( ( ( rule__SolitaryFeature__TypeAssignment_2 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( ( rule__SolitaryFeature__TypeAssignment_2 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( ( rule__SolitaryFeature__TypeAssignment_2 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( rule__SolitaryFeature__TypeAssignment_2 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: ( rule__SolitaryFeature__TypeAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=22 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:2: rule__SolitaryFeature__TypeAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__TypeAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2560);
                    rule__SolitaryFeature__TypeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: rule__SolitaryFeature__Group__3 : rule__SolitaryFeature__Group__3__Impl rule__SolitaryFeature__Group__4 ;
    public final void rule__SolitaryFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( rule__SolitaryFeature__Group__3__Impl rule__SolitaryFeature__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:2: rule__SolitaryFeature__Group__3__Impl rule__SolitaryFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32591);
            rule__SolitaryFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__4_in_rule__SolitaryFeature__Group__32594);
            rule__SolitaryFeature__Group__4();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: rule__SolitaryFeature__Group__3__Impl : ( ( rule__SolitaryFeature__NameAssignment_3 ) ) ;
    public final void rule__SolitaryFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1264:1: ( ( ( rule__SolitaryFeature__NameAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( ( rule__SolitaryFeature__NameAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( ( rule__SolitaryFeature__NameAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( rule__SolitaryFeature__NameAssignment_3 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( rule__SolitaryFeature__NameAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:2: rule__SolitaryFeature__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__NameAssignment_3_in_rule__SolitaryFeature__Group__3__Impl2621);
            rule__SolitaryFeature__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SolitaryFeature__Group__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: rule__SolitaryFeature__Group__4 : rule__SolitaryFeature__Group__4__Impl ;
    public final void rule__SolitaryFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( rule__SolitaryFeature__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:2: rule__SolitaryFeature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__4__Impl_in_rule__SolitaryFeature__Group__42651);
            rule__SolitaryFeature__Group__4__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group__4"


    // $ANTLR start "rule__SolitaryFeature__Group__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: rule__SolitaryFeature__Group__4__Impl : ( ( rule__SolitaryFeature__Group_4__0 )? ) ;
    public final void rule__SolitaryFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( ( rule__SolitaryFeature__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ( rule__SolitaryFeature__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( ( rule__SolitaryFeature__Group_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: ( rule__SolitaryFeature__Group_4__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:1: ( rule__SolitaryFeature__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1295:2: rule__SolitaryFeature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__0_in_rule__SolitaryFeature__Group__4__Impl2678);
                    rule__SolitaryFeature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group__4__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: rule__SolitaryFeature__Group_4__0 : rule__SolitaryFeature__Group_4__0__Impl rule__SolitaryFeature__Group_4__1 ;
    public final void rule__SolitaryFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( rule__SolitaryFeature__Group_4__0__Impl rule__SolitaryFeature__Group_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:2: rule__SolitaryFeature__Group_4__0__Impl rule__SolitaryFeature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__0__Impl_in_rule__SolitaryFeature__Group_4__02719);
            rule__SolitaryFeature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__1_in_rule__SolitaryFeature__Group_4__02722);
            rule__SolitaryFeature__Group_4__1();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4__0"


    // $ANTLR start "rule__SolitaryFeature__Group_4__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: rule__SolitaryFeature__Group_4__0__Impl : ( '{' ) ;
    public final void rule__SolitaryFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: '{'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__SolitaryFeature__Group_4__0__Impl2750); 
             after(grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: rule__SolitaryFeature__Group_4__1 : rule__SolitaryFeature__Group_4__1__Impl rule__SolitaryFeature__Group_4__2 ;
    public final void rule__SolitaryFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__SolitaryFeature__Group_4__1__Impl rule__SolitaryFeature__Group_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__SolitaryFeature__Group_4__1__Impl rule__SolitaryFeature__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__1__Impl_in_rule__SolitaryFeature__Group_4__12781);
            rule__SolitaryFeature__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__2_in_rule__SolitaryFeature__Group_4__12784);
            rule__SolitaryFeature__Group_4__2();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4__1"


    // $ANTLR start "rule__SolitaryFeature__Group_4__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: rule__SolitaryFeature__Group_4__1__Impl : ( ( rule__SolitaryFeature__Group_4_1__0 )? ) ;
    public final void rule__SolitaryFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: ( ( ( rule__SolitaryFeature__Group_4_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__SolitaryFeature__Group_4_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1363:1: ( ( rule__SolitaryFeature__Group_4_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__SolitaryFeature__Group_4_1__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: ( rule__SolitaryFeature__Group_4_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__SolitaryFeature__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__0_in_rule__SolitaryFeature__Group_4__1__Impl2811);
                    rule__SolitaryFeature__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__SolitaryFeature__Group_4__2 : rule__SolitaryFeature__Group_4__2__Impl rule__SolitaryFeature__Group_4__3 ;
    public final void rule__SolitaryFeature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__SolitaryFeature__Group_4__2__Impl rule__SolitaryFeature__Group_4__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__SolitaryFeature__Group_4__2__Impl rule__SolitaryFeature__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__2__Impl_in_rule__SolitaryFeature__Group_4__22842);
            rule__SolitaryFeature__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__3_in_rule__SolitaryFeature__Group_4__22845);
            rule__SolitaryFeature__Group_4__3();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4__2"


    // $ANTLR start "rule__SolitaryFeature__Group_4__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: rule__SolitaryFeature__Group_4__2__Impl : ( ( rule__SolitaryFeature__Group_4_2__0 )? ) ;
    public final void rule__SolitaryFeature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:1: ( ( ( rule__SolitaryFeature__Group_4_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( ( rule__SolitaryFeature__Group_4_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1392:1: ( ( rule__SolitaryFeature__Group_4_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1393:1: ( rule__SolitaryFeature__Group_4_2__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: ( rule__SolitaryFeature__Group_4_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:2: rule__SolitaryFeature__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__0_in_rule__SolitaryFeature__Group_4__2__Impl2872);
                    rule__SolitaryFeature__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4__2__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: rule__SolitaryFeature__Group_4__3 : rule__SolitaryFeature__Group_4__3__Impl rule__SolitaryFeature__Group_4__4 ;
    public final void rule__SolitaryFeature__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1408:1: ( rule__SolitaryFeature__Group_4__3__Impl rule__SolitaryFeature__Group_4__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1409:2: rule__SolitaryFeature__Group_4__3__Impl rule__SolitaryFeature__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__3__Impl_in_rule__SolitaryFeature__Group_4__32903);
            rule__SolitaryFeature__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__4_in_rule__SolitaryFeature__Group_4__32906);
            rule__SolitaryFeature__Group_4__4();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4__3"


    // $ANTLR start "rule__SolitaryFeature__Group_4__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: rule__SolitaryFeature__Group_4__3__Impl : ( ( rule__SolitaryFeature__Group_4_3__0 )? ) ;
    public final void rule__SolitaryFeature__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1420:1: ( ( ( rule__SolitaryFeature__Group_4_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( ( rule__SolitaryFeature__Group_4_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( ( rule__SolitaryFeature__Group_4_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: ( rule__SolitaryFeature__Group_4_3__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( rule__SolitaryFeature__Group_4_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:2: rule__SolitaryFeature__Group_4_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__0_in_rule__SolitaryFeature__Group_4__3__Impl2933);
                    rule__SolitaryFeature__Group_4_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4__3__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: rule__SolitaryFeature__Group_4__4 : rule__SolitaryFeature__Group_4__4__Impl ;
    public final void rule__SolitaryFeature__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: ( rule__SolitaryFeature__Group_4__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:2: rule__SolitaryFeature__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__4__Impl_in_rule__SolitaryFeature__Group_4__42964);
            rule__SolitaryFeature__Group_4__4__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4__4"


    // $ANTLR start "rule__SolitaryFeature__Group_4__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: rule__SolitaryFeature__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SolitaryFeature__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1449:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: '}'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__SolitaryFeature__Group_4__4__Impl2992); 
             after(grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4__4__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: rule__SolitaryFeature__Group_4_1__0 : rule__SolitaryFeature__Group_4_1__0__Impl rule__SolitaryFeature__Group_4_1__1 ;
    public final void rule__SolitaryFeature__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( rule__SolitaryFeature__Group_4_1__0__Impl rule__SolitaryFeature__Group_4_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:2: rule__SolitaryFeature__Group_4_1__0__Impl rule__SolitaryFeature__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__0__Impl_in_rule__SolitaryFeature__Group_4_1__03033);
            rule__SolitaryFeature__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__1_in_rule__SolitaryFeature__Group_4_1__03036);
            rule__SolitaryFeature__Group_4_1__1();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_1__0"


    // $ANTLR start "rule__SolitaryFeature__Group_4_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: rule__SolitaryFeature__Group_4_1__0__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) ) ;
    public final void rule__SolitaryFeature__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_4_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:2: rule__SolitaryFeature__FeaturesAssignment_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_0_in_rule__SolitaryFeature__Group_4_1__0__Impl3063);
            rule__SolitaryFeature__FeaturesAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_1__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: rule__SolitaryFeature__Group_4_1__1 : rule__SolitaryFeature__Group_4_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( rule__SolitaryFeature__Group_4_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:2: rule__SolitaryFeature__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__1__Impl_in_rule__SolitaryFeature__Group_4_1__13093);
            rule__SolitaryFeature__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_1__1"


    // $ANTLR start "rule__SolitaryFeature__Group_4_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: rule__SolitaryFeature__Group_4_1__1__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* ) ;
    public final void rule__SolitaryFeature__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_4_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:2: rule__SolitaryFeature__FeaturesAssignment_4_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_1_in_rule__SolitaryFeature__Group_4_1__1__Impl3120);
            	    rule__SolitaryFeature__FeaturesAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_1__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: rule__SolitaryFeature__Group_4_2__0 : rule__SolitaryFeature__Group_4_2__0__Impl rule__SolitaryFeature__Group_4_2__1 ;
    public final void rule__SolitaryFeature__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:1: ( rule__SolitaryFeature__Group_4_2__0__Impl rule__SolitaryFeature__Group_4_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:2: rule__SolitaryFeature__Group_4_2__0__Impl rule__SolitaryFeature__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__0__Impl_in_rule__SolitaryFeature__Group_4_2__03155);
            rule__SolitaryFeature__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__1_in_rule__SolitaryFeature__Group_4_2__03158);
            rule__SolitaryFeature__Group_4_2__1();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_2__0"


    // $ANTLR start "rule__SolitaryFeature__Group_4_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: rule__SolitaryFeature__Group_4_2__0__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) ) ;
    public final void rule__SolitaryFeature__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_4_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:2: rule__SolitaryFeature__GroupsAssignment_4_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_0_in_rule__SolitaryFeature__Group_4_2__0__Impl3185);
            rule__SolitaryFeature__GroupsAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_2__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: rule__SolitaryFeature__Group_4_2__1 : rule__SolitaryFeature__Group_4_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( rule__SolitaryFeature__Group_4_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:2: rule__SolitaryFeature__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__1__Impl_in_rule__SolitaryFeature__Group_4_2__13215);
            rule__SolitaryFeature__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_2__1"


    // $ANTLR start "rule__SolitaryFeature__Group_4_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:1: rule__SolitaryFeature__Group_4_2__1__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* ) ;
    public final void rule__SolitaryFeature__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1578:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_4_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:2: rule__SolitaryFeature__GroupsAssignment_4_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_1_in_rule__SolitaryFeature__Group_4_2__1__Impl3242);
            	    rule__SolitaryFeature__GroupsAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_2__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1595:1: rule__SolitaryFeature__Group_4_3__0 : rule__SolitaryFeature__Group_4_3__0__Impl rule__SolitaryFeature__Group_4_3__1 ;
    public final void rule__SolitaryFeature__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: ( rule__SolitaryFeature__Group_4_3__0__Impl rule__SolitaryFeature__Group_4_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:2: rule__SolitaryFeature__Group_4_3__0__Impl rule__SolitaryFeature__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__0__Impl_in_rule__SolitaryFeature__Group_4_3__03277);
            rule__SolitaryFeature__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__1_in_rule__SolitaryFeature__Group_4_3__03280);
            rule__SolitaryFeature__Group_4_3__1();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_3__0"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: rule__SolitaryFeature__Group_4_3__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SolitaryFeature__Group_4_3__0__Impl3308); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_3__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: rule__SolitaryFeature__Group_4_3__1 : rule__SolitaryFeature__Group_4_3__1__Impl rule__SolitaryFeature__Group_4_3__2 ;
    public final void rule__SolitaryFeature__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( rule__SolitaryFeature__Group_4_3__1__Impl rule__SolitaryFeature__Group_4_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:2: rule__SolitaryFeature__Group_4_3__1__Impl rule__SolitaryFeature__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__1__Impl_in_rule__SolitaryFeature__Group_4_3__13339);
            rule__SolitaryFeature__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__2_in_rule__SolitaryFeature__Group_4_3__13342);
            rule__SolitaryFeature__Group_4_3__2();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_3__1"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__SolitaryFeature__Group_4_3__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) ) ;
    public final void rule__SolitaryFeature__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_4_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:2: rule__SolitaryFeature__ConstraintsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_1_in_rule__SolitaryFeature__Group_4_3__1__Impl3369);
            rule__SolitaryFeature__ConstraintsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_3__1__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: rule__SolitaryFeature__Group_4_3__2 : rule__SolitaryFeature__Group_4_3__2__Impl ;
    public final void rule__SolitaryFeature__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: ( rule__SolitaryFeature__Group_4_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:2: rule__SolitaryFeature__Group_4_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__2__Impl_in_rule__SolitaryFeature__Group_4_3__23399);
            rule__SolitaryFeature__Group_4_3__2__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_3__2"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: rule__SolitaryFeature__Group_4_3__2__Impl : ( ( rule__SolitaryFeature__Group_4_3_2__0 )* ) ;
    public final void rule__SolitaryFeature__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: ( ( ( rule__SolitaryFeature__Group_4_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( ( rule__SolitaryFeature__Group_4_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( ( rule__SolitaryFeature__Group_4_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( rule__SolitaryFeature__Group_4_3_2__0 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( rule__SolitaryFeature__Group_4_3_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:2: rule__SolitaryFeature__Group_4_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__0_in_rule__SolitaryFeature__Group_4_3__2__Impl3426);
            	    rule__SolitaryFeature__Group_4_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSolitaryFeatureAccess().getGroup_4_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_3__2__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: rule__SolitaryFeature__Group_4_3_2__0 : rule__SolitaryFeature__Group_4_3_2__0__Impl rule__SolitaryFeature__Group_4_3_2__1 ;
    public final void rule__SolitaryFeature__Group_4_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( rule__SolitaryFeature__Group_4_3_2__0__Impl rule__SolitaryFeature__Group_4_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:2: rule__SolitaryFeature__Group_4_3_2__0__Impl rule__SolitaryFeature__Group_4_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__0__Impl_in_rule__SolitaryFeature__Group_4_3_2__03463);
            rule__SolitaryFeature__Group_4_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__1_in_rule__SolitaryFeature__Group_4_3_2__03466);
            rule__SolitaryFeature__Group_4_3_2__1();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_3_2__0"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: rule__SolitaryFeature__Group_4_3_2__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_4_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__SolitaryFeature__Group_4_3_2__0__Impl3494); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_3_2__0__Impl"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__SolitaryFeature__Group_4_3_2__1 : rule__SolitaryFeature__Group_4_3_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_4_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( rule__SolitaryFeature__Group_4_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:2: rule__SolitaryFeature__Group_4_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__1__Impl_in_rule__SolitaryFeature__Group_4_3_2__13525);
            rule__SolitaryFeature__Group_4_3_2__1__Impl();

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
    // $ANTLR end "rule__SolitaryFeature__Group_4_3_2__1"


    // $ANTLR start "rule__SolitaryFeature__Group_4_3_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: rule__SolitaryFeature__Group_4_3_2__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) ) ;
    public final void rule__SolitaryFeature__Group_4_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_4_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:2: rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1_in_rule__SolitaryFeature__Group_4_3_2__1__Impl3552);
            rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_4_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__Group_4_3_2__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__03586);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__03589);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: rule__Group__Group__0__Impl : ( 'select' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( ( 'select' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( 'select' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( 'select' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: 'select'
            {
             before(grammarAccess.getGroupAccess().getSelectKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Group__Group__0__Impl3617); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__13648);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__13651);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__Group__Group__1__Impl : ( ( rule__Group__InclusiveAssignment_1 )? ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( ( rule__Group__InclusiveAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( rule__Group__InclusiveAssignment_1 )?
            {
             before(grammarAccess.getGroupAccess().getInclusiveAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( rule__Group__InclusiveAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:2: rule__Group__InclusiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl3678);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__23709);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__23712);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__Group__Group__2__Impl : ( '(' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Group__Group__2__Impl3740); 
             after(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__33771);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__33774);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: rule__Group__Group__3__Impl : ( ( rule__Group__GroupedFeaturesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( ( rule__Group__GroupedFeaturesAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ( rule__Group__GroupedFeaturesAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ( rule__Group__GroupedFeaturesAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Group__GroupedFeaturesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: ( rule__Group__GroupedFeaturesAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:2: rule__Group__GroupedFeaturesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl3801);
            rule__Group__GroupedFeaturesAssignment_3();

            state._fsp--;


            }

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__43831);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5_in_rule__Group__Group__43834);
            rule__Group__Group__5();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ( rule__Group__Group_4__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( rule__Group__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl3861);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Group__Group__5"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( rule__Group__Group__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:2: rule__Group__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__53892);
            rule__Group__Group__5__Impl();

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
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: rule__Group__Group__5__Impl : ( ')' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1918:1: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Group__Group__5__Impl3920); 
             after(grammarAccess.getGroupAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__03963);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__03966);
            rule__Group__Group_4__1();

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
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1959:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Group__Group_4__0__Impl3994); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: ( rule__Group__Group_4__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__14025);
            rule__Group__Group_4__1__Impl();

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
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:1: ( ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1990:1: ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: ( rule__Group__GroupedFeaturesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: ( rule__Group__GroupedFeaturesAssignment_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:2: rule__Group__GroupedFeaturesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl4052);
            rule__Group__GroupedFeaturesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__GroupedFeature__Group__0 : rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 ;
    public final void rule__GroupedFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:2: rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04086);
            rule__GroupedFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04089);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: rule__GroupedFeature__Group__0__Impl : ( () ) ;
    public final void rule__GroupedFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ()
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:1: rule__GroupedFeature__Group__1 : rule__GroupedFeature__Group__1__Impl ;
    public final void rule__GroupedFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( rule__GroupedFeature__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:2: rule__GroupedFeature__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14147);
            rule__GroupedFeature__Group__1__Impl();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: rule__GroupedFeature__Group__1__Impl : ( ( rule__GroupedFeature__NameAssignment_1 ) ) ;
    public final void rule__GroupedFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: ( ( ( rule__GroupedFeature__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: ( rule__GroupedFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: ( rule__GroupedFeature__NameAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:2: rule__GroupedFeature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4174);
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


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04208);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04211);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: rule__Expression__Group__0__Impl : ( ruleLogical2Operation ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl4238);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14267);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: ( ( rule__Expression__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( rule__Expression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=11 && LA22_0<=12)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4294);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04329);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04332);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2147:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: ()
            {
             before(grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14390);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14393);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:1: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( rule__Expression__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:2: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl4420);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24450);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RexpAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( ( ( rule__Expression__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( rule__Expression__RexpAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( rule__Expression__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:2: rule__Expression__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl4477);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:1: rule__Logical2Operation__Group__0 : rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 ;
    public final void rule__Logical2Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: ( rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:2: rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__04513);
            rule__Logical2Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__04516);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__Logical2Operation__Group__0__Impl : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl4543);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: rule__Logical2Operation__Group__1 : rule__Logical2Operation__Group__1__Impl ;
    public final void rule__Logical2Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: ( rule__Logical2Operation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:2: rule__Logical2Operation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__14572);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: rule__Logical2Operation__Group__1__Impl : ( ( rule__Logical2Operation__Group_1__0 )* ) ;
    public final void rule__Logical2Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( ( ( rule__Logical2Operation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: ( rule__Logical2Operation__Group_1__0 )*
            {
             before(grammarAccess.getLogical2OperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( rule__Logical2Operation__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=13 && LA23_0<=15)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:2: rule__Logical2Operation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl4599);
            	    rule__Logical2Operation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: rule__Logical2Operation__Group_1__0 : rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 ;
    public final void rule__Logical2Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: ( rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:2: rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__04634);
            rule__Logical2Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__04637);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: rule__Logical2Operation__Group_1__0__Impl : ( () ) ;
    public final void rule__Logical2Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ()
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: rule__Logical2Operation__Group_1__1 : rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 ;
    public final void rule__Logical2Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:2: rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__14695);
            rule__Logical2Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__14698);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: rule__Logical2Operation__Group_1__1__Impl : ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) ;
    public final void rule__Logical2Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2334:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2335:2: rule__Logical2Operation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl4725);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: rule__Logical2Operation__Group_1__2 : rule__Logical2Operation__Group_1__2__Impl ;
    public final void rule__Logical2Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: ( rule__Logical2Operation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:2: rule__Logical2Operation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__24755);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: rule__Logical2Operation__Group_1__2__Impl : ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) ;
    public final void rule__Logical2Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:2: rule__Logical2Operation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl4782);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: rule__BinaryOperation__Group__0 : rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 ;
    public final void rule__BinaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: ( rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:2: rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__04818);
            rule__BinaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__04821);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: rule__BinaryOperation__Group__0__Impl : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2395:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl4848);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: rule__BinaryOperation__Group__1 : rule__BinaryOperation__Group__1__Impl ;
    public final void rule__BinaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( rule__BinaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:2: rule__BinaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__14877);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: rule__BinaryOperation__Group__1__Impl : ( ( rule__BinaryOperation__Group_1__0 )* ) ;
    public final void rule__BinaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( ( ( rule__BinaryOperation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( rule__BinaryOperation__Group_1__0 )*
            {
             before(grammarAccess.getBinaryOperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( rule__BinaryOperation__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=16 && LA24_0<=19)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:2: rule__BinaryOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl4904);
            	    rule__BinaryOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:1: rule__BinaryOperation__Group_1__0 : rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 ;
    public final void rule__BinaryOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: ( rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:2: rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__04939);
            rule__BinaryOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__04942);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: rule__BinaryOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: ()
            {
             before(grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: rule__BinaryOperation__Group_1__1 : rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 ;
    public final void rule__BinaryOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:2: rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__15000);
            rule__BinaryOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__15003);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: rule__BinaryOperation__Group_1__1__Impl : ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__BinaryOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:1: ( ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2488:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:2: rule__BinaryOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl5030);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: rule__BinaryOperation__Group_1__2 : rule__BinaryOperation__Group_1__2__Impl ;
    public final void rule__BinaryOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: ( rule__BinaryOperation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:2: rule__BinaryOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__25060);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: rule__BinaryOperation__Group_1__2__Impl : ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) ;
    public final void rule__BinaryOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2515:1: ( ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2516:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:2: rule__BinaryOperation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl5087);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__05123);
            rule__UnaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05126);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2552:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl5153);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__15183);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__ExpAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: ( ( ( rule__UnaryOperation__ExpAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: ( rule__UnaryOperation__ExpAssignment_1 )
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: ( rule__UnaryOperation__ExpAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:2: rule__UnaryOperation__ExpAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl5210);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: rule__AtomicExp__Group_3__0 : rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 ;
    public final void rule__AtomicExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ( rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:2: rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__05244);
            rule__AtomicExp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__05247);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:1: rule__AtomicExp__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2612:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: '('
            {
             before(grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AtomicExp__Group_3__0__Impl5275); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: rule__AtomicExp__Group_3__1 : rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 ;
    public final void rule__AtomicExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:2: rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__15306);
            rule__AtomicExp__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__15309);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: rule__AtomicExp__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ruleExpression
            {
             before(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl5336);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: rule__AtomicExp__Group_3__2 : rule__AtomicExp__Group_3__2__Impl ;
    public final void rule__AtomicExp__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:1: ( rule__AtomicExp__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:2: rule__AtomicExp__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__25365);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: rule__AtomicExp__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExp__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2670:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ')'
            {
             before(grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AtomicExp__Group_3__2__Impl5393); 
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


    // $ANTLR start "rule__Identifier__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__05430);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__05433);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__RefAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ( ( ( rule__Identifier__RefAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ( ( rule__Identifier__RefAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ( ( rule__Identifier__RefAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( rule__Identifier__RefAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:1: ( rule__Identifier__RefAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2710:2: rule__Identifier__RefAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_0_in_rule__Identifier__Group__0__Impl5460);
            rule__Identifier__RefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getRefAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( rule__Identifier__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__15490);
            rule__Identifier__Group__1__Impl();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Group_1__0 )* ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: ( ( ( rule__Identifier__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: ( ( rule__Identifier__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: ( ( rule__Identifier__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( rule__Identifier__Group_1__0 )*
            {
             before(grammarAccess.getIdentifierAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( rule__Identifier__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:2: rule__Identifier__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl5517);
            	    rule__Identifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getIdentifierAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Identifier__Group_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: rule__Identifier__Group_1__0 : rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 ;
    public final void rule__Identifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:2: rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__05552);
            rule__Identifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__05555);
            rule__Identifier__Group_1__1();

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
    // $ANTLR end "rule__Identifier__Group_1__0"


    // $ANTLR start "rule__Identifier__Group_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: rule__Identifier__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Identifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( '.' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( '.' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: '.'
            {
             before(grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Identifier__Group_1__0__Impl5583); 
             after(grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier__Group_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__Identifier__Group_1__1 : rule__Identifier__Group_1__1__Impl ;
    public final void rule__Identifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( rule__Identifier__Group_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:2: rule__Identifier__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__15614);
            rule__Identifier__Group_1__1__Impl();

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
    // $ANTLR end "rule__Identifier__Group_1__1"


    // $ANTLR start "rule__Identifier__Group_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2794:1: rule__Identifier__Group_1__1__Impl : ( ( rule__Identifier__RefAssignment_1_1 ) ) ;
    public final void rule__Identifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( ( ( rule__Identifier__RefAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( rule__Identifier__RefAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( rule__Identifier__RefAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( rule__Identifier__RefAssignment_1_1 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: ( rule__Identifier__RefAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:2: rule__Identifier__RefAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_1_1_in_rule__Identifier__Group_1__1__Impl5641);
            rule__Identifier__RefAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getRefAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Group_1__1__Impl"


    // $ANTLR start "rule__NULL__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2815:1: rule__NULL__Group__0 : rule__NULL__Group__0__Impl rule__NULL__Group__1 ;
    public final void rule__NULL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( rule__NULL__Group__0__Impl rule__NULL__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:2: rule__NULL__Group__0__Impl rule__NULL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__05675);
            rule__NULL__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__05678);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: rule__NULL__Group__0__Impl : ( () ) ;
    public final void rule__NULL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2832:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ()
            {
             before(grammarAccess.getNULLAccess().getNULLAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: rule__NULL__Group__1 : rule__NULL__Group__1__Impl ;
    public final void rule__NULL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( rule__NULL__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:2: rule__NULL__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__15736);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: rule__NULL__Group__1__Impl : ( 'NULL' ) ;
    public final void rule__NULL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: ( ( 'NULL' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( 'NULL' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( 'NULL' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: 'NULL'
            {
             before(grammarAccess.getNULLAccess().getNULLKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__NULL__Group__1__Impl5764); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05799);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05802);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:2: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__EInt__Group__0__Impl5831); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15864);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( RULE_INT )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5891); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: rule__Model__RootFeatureAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_15929);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: rule__Model__RootFeatureAssignment_3_2_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2963:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2964:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2965:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_15960);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: rule__SolitaryFeature__RequiredAssignment_1 : ( ruleSolitaryType ) ;
    public final void rule__SolitaryFeature__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( ( ruleSolitaryType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( ruleSolitaryType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( ruleSolitaryType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: ruleSolitaryType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_15991);
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


    // $ANTLR start "rule__SolitaryFeature__TypeAssignment_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: rule__SolitaryFeature__TypeAssignment_2 : ( ruleSimpleType ) ;
    public final void rule__SolitaryFeature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2994:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: ruleSimpleType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_26022);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__TypeAssignment_2"


    // $ANTLR start "rule__SolitaryFeature__NameAssignment_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: rule__SolitaryFeature__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SolitaryFeature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ruleEString
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_36053);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__NameAssignment_3"


    // $ANTLR start "rule__SolitaryFeature__FeaturesAssignment_4_1_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:1: rule__SolitaryFeature__FeaturesAssignment_4_1_0 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_06084);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__FeaturesAssignment_4_1_0"


    // $ANTLR start "rule__SolitaryFeature__FeaturesAssignment_4_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__SolitaryFeature__FeaturesAssignment_4_1_1 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_16115);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__FeaturesAssignment_4_1_1"


    // $ANTLR start "rule__SolitaryFeature__GroupsAssignment_4_2_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: rule__SolitaryFeature__GroupsAssignment_4_2_0 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_06146);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__GroupsAssignment_4_2_0"


    // $ANTLR start "rule__SolitaryFeature__GroupsAssignment_4_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: rule__SolitaryFeature__GroupsAssignment_4_2_1 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_16177);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__GroupsAssignment_4_2_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_4_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: rule__SolitaryFeature__ConstraintsAssignment_4_3_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_16208);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__ConstraintsAssignment_4_3_1"


    // $ANTLR start "rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_16239);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1"


    // $ANTLR start "rule__Group__InclusiveAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: rule__Group__InclusiveAssignment_1 : ( ( 'any' ) ) ;
    public final void rule__Group__InclusiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: ( ( ( 'any' ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( ( 'any' ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( ( 'any' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( 'any' )
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ( 'any' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: 'any'
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Group__InclusiveAssignment_16275); 
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


    // $ANTLR start "rule__Group__GroupedFeaturesAssignment_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: rule__Group__GroupedFeaturesAssignment_3 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_36314);
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


    // $ANTLR start "rule__Group__GroupedFeaturesAssignment_4_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: rule__Group__GroupedFeaturesAssignment_4_1 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3153:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_4_16345);
            ruleGroupedFeature();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__GroupedFeaturesAssignment_4_1"


    // $ANTLR start "rule__GroupedFeature__NameAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: rule__GroupedFeature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GroupedFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3168:1: ruleEString
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_16376);
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


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: rule__Expression__OperatorAssignment_1_1 : ( ruleLogicalOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:1: ( ( ruleLogicalOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ( ruleLogicalOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3182:1: ( ruleLogicalOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3183:1: ruleLogicalOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_16407);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: rule__Expression__RexpAssignment_1_2 : ( ruleLogical2Operation ) ;
    public final void rule__Expression__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_26438);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: rule__Logical2Operation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__Logical2Operation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: ( ( ruleCompareOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3212:1: ( ruleCompareOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3212:1: ( ruleCompareOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: ruleCompareOperator
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_16469);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: rule__Logical2Operation__RexpAssignment_1_2 : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_26500);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: rule__BinaryOperation__OperatorAssignment_1_1 : ( ruleArithmicOperator ) ;
    public final void rule__BinaryOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3241:1: ( ( ruleArithmicOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: ( ruleArithmicOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: ( ruleArithmicOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ruleArithmicOperator
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_16531);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: rule__BinaryOperation__RexpAssignment_1_2 : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3256:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_26562);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ( ( ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: ( ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: ( ruleUnaryOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_06593);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: rule__UnaryOperation__ExpAssignment_1 : ( ruleAtomicExp ) ;
    public final void rule__UnaryOperation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ruleAtomicExp
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_16624);
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


    // $ANTLR start "rule__Identifier__RefAssignment_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: rule__Identifier__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3301:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( RULE_ID )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_06659); 
             after(grammarAccess.getIdentifierAccess().getRefFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__RefAssignment_0"


    // $ANTLR start "rule__Identifier__RefAssignment_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: rule__Identifier__RefAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:1: ( RULE_ID )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_1_16698); 
             after(grammarAccess.getIdentifierAccess().getRefFeatureIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__RefAssignment_1_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: rule__Number__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: ( ruleEInt )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3341:1: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Number__ValueAssignment6733);
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
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_entryRuleGroupedFeature301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroupedFeature308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0_in_ruleGroupedFeature334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_entryRuleLogical2Operation421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogical2Operation428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__0_in_ruleLogical2Operation454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_entryRuleBinaryOperation481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOperation488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0_in_ruleBinaryOperation514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_entryRuleUnaryOperation541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOperation548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0_in_ruleUnaryOperation574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_entryRuleAtomicExp601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExp608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Alternatives_in_ruleAtomicExp634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__0_in_ruleIdentifier694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_entryRuleNULL721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNULL728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0_in_ruleNULL754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber781 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__ValueAssignment_in_ruleNumber814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmicOperator__Alternatives_in_ruleArithmicOperator1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__LogicalOperator__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__LogicalOperator__Alternatives1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__CompareOperator__Alternatives1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__CompareOperator__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CompareOperator__Alternatives1438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ArithmicOperator__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ArithmicOperator__Alternatives1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ArithmicOperator__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ArithmicOperator__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__UnaryOperator__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__UnaryOperator__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SimpleType__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleType__Alternatives1651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleType__Alternatives1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SimpleType__Alternatives1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SolitaryType__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SolitaryType__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01783 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11844 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Model__Group__1__Impl1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21906 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Model__Group__2__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31968 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Model__Group__4__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02098 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group_3__0__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12160 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2247 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02284 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group_3_2__0__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02407 = new BitSet(new long[]{0x000000010FC00010L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SolitaryFeature__Group__0__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12469 = new BitSet(new long[]{0x000000010FC00010L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22530 = new BitSet(new long[]{0x000000010FC00010L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__TypeAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32591 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__4_in_rule__SolitaryFeature__Group__32594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__NameAssignment_3_in_rule__SolitaryFeature__Group__3__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__4__Impl_in_rule__SolitaryFeature__Group__42651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__0_in_rule__SolitaryFeature__Group__4__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__0__Impl_in_rule__SolitaryFeature__Group_4__02719 = new BitSet(new long[]{0x0000000740000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__1_in_rule__SolitaryFeature__Group_4__02722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SolitaryFeature__Group_4__0__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__1__Impl_in_rule__SolitaryFeature__Group_4__12781 = new BitSet(new long[]{0x0000000740000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__2_in_rule__SolitaryFeature__Group_4__12784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__0_in_rule__SolitaryFeature__Group_4__1__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__2__Impl_in_rule__SolitaryFeature__Group_4__22842 = new BitSet(new long[]{0x0000000740000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__3_in_rule__SolitaryFeature__Group_4__22845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__0_in_rule__SolitaryFeature__Group_4__2__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__3__Impl_in_rule__SolitaryFeature__Group_4__32903 = new BitSet(new long[]{0x0000000740000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__4_in_rule__SolitaryFeature__Group_4__32906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__0_in_rule__SolitaryFeature__Group_4__3__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__4__Impl_in_rule__SolitaryFeature__Group_4__42964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__SolitaryFeature__Group_4__4__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__0__Impl_in_rule__SolitaryFeature__Group_4_1__03033 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__1_in_rule__SolitaryFeature__Group_4_1__03036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_0_in_rule__SolitaryFeature__Group_4_1__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__1__Impl_in_rule__SolitaryFeature__Group_4_1__13093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_1_in_rule__SolitaryFeature__Group_4_1__1__Impl3120 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__0__Impl_in_rule__SolitaryFeature__Group_4_2__03155 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__1_in_rule__SolitaryFeature__Group_4_2__03158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_0_in_rule__SolitaryFeature__Group_4_2__0__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__1__Impl_in_rule__SolitaryFeature__Group_4_2__13215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_1_in_rule__SolitaryFeature__Group_4_2__1__Impl3242 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__0__Impl_in_rule__SolitaryFeature__Group_4_3__03277 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__1_in_rule__SolitaryFeature__Group_4_3__03280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SolitaryFeature__Group_4_3__0__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__1__Impl_in_rule__SolitaryFeature__Group_4_3__13339 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__2_in_rule__SolitaryFeature__Group_4_3__13342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_1_in_rule__SolitaryFeature__Group_4_3__1__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__2__Impl_in_rule__SolitaryFeature__Group_4_3__23399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__0_in_rule__SolitaryFeature__Group_4_3__2__Impl3426 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__0__Impl_in_rule__SolitaryFeature__Group_4_3_2__03463 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__1_in_rule__SolitaryFeature__Group_4_3_2__03466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__SolitaryFeature__Group_4_3_2__0__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__1__Impl_in_rule__SolitaryFeature__Group_4_3_2__13525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1_in_rule__SolitaryFeature__Group_4_3_2__1__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__03586 = new BitSet(new long[]{0x0000020800000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__03589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Group__Group__0__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__13648 = new BitSet(new long[]{0x0000020800000000L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__13651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__23709 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__23712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Group__Group__2__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__33771 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__33774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__43831 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__43834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl3861 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__53892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Group__Group__5__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__03963 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__03966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Group__Group_4__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__14025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04086 = new BitSet(new long[]{0x0000000100000010L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04208 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl4294 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__04329 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__04332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__14390 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__14393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__24450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__04513 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__04516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__14572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl4599 = new BitSet(new long[]{0x000000000000E002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__04634 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__04637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__14695 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__14698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__24755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__04818 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__04821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__14877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl4904 = new BitSet(new long[]{0x00000000000F0002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__04939 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__04942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__15000 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__15003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__25060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__05123 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__05126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__15183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__05244 = new BitSet(new long[]{0x0000018800300030L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__05247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AtomicExp__Group_3__0__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__15306 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__15309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__25365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AtomicExp__Group_3__2__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__05430 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__05433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_0_in_rule__Identifier__Group__0__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__15490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl5517 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__05552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__05555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Identifier__Group_1__0__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__15614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_1_1_in_rule__Identifier__Group_1__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__05675 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__05678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__15736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__NULL__Group__1__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__05799 = new BitSet(new long[]{0x0000010000000020L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__05802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__EInt__Group__0__Impl5831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__15864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl5891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_15929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_15960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_15991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_26022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_36053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_06084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_16115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_06146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_16177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_16208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_16239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Group__InclusiveAssignment_16275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_36314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_4_16345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_16376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_16407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_26438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_16469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_26500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_16531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_26562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_06593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_16624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_06659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_1_16698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Number__ValueAssignment6733 = new BitSet(new long[]{0x0000000000000002L});
    }


}