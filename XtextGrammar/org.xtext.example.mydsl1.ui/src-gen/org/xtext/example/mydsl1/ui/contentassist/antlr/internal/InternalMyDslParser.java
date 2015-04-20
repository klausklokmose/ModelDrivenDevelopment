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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'", "'Model'", "'{'", "'}'", "'Root'", "'feature'", "'#'", "'select'", "'('", "')'", "','", "'.'", "'NULL'", "'-'", "'any'"
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


    // $ANTLR start "entryRuleEBoolean"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:452:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( ruleEBoolean EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean901);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean908); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__EBoolean__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__EBoolean__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean934);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:481:1: ( ruleEString EOF )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString961);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString968); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:493:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString994);
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


    // $ANTLR start "ruleLogicalOperator"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:513:1: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:514:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:516:1: ( rule__LogicalOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:516:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator1031);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:534:1: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( rule__CompareOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:535:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1067);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ruleArithmicOperator : ( ( rule__ArithmicOperator__Alternatives ) ) ;
    public final void ruleArithmicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( ( rule__ArithmicOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__ArithmicOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__ArithmicOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__ArithmicOperator__Alternatives )
            {
             before(grammarAccess.getArithmicOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__ArithmicOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:2: rule__ArithmicOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ArithmicOperator__Alternatives_in_ruleArithmicOperator1103);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ruleUnaryOperator : ( ( rule__UnaryOperator__Alternatives ) ) ;
    public final void ruleUnaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( ( ( rule__UnaryOperator__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( ( rule__UnaryOperator__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( ( rule__UnaryOperator__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( rule__UnaryOperator__Alternatives )
            {
             before(grammarAccess.getUnaryOperatorAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( rule__UnaryOperator__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:573:2: rule__UnaryOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1139);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( ( ( rule__SimpleType__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( ( rule__SimpleType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( ( rule__SimpleType__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: ( rule__SimpleType__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:592:2: rule__SimpleType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1175);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ruleSolitaryType : ( ( rule__SolitaryType__Alternatives ) ) ;
    public final void ruleSolitaryType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( ( rule__SolitaryType__Alternatives ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( ( rule__SolitaryType__Alternatives ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( ( rule__SolitaryType__Alternatives ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__SolitaryType__Alternatives )
            {
             before(grammarAccess.getSolitaryTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__SolitaryType__Alternatives )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:611:2: rule__SolitaryType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType1211);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: rule__Feature__Alternatives : ( ( ruleSolitaryFeature ) | ( ruleGroupedFeature ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( ( ruleSolitaryFeature ) | ( ruleGroupedFeature ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||(LA1_0>=24 && LA1_0<=27)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( ruleSolitaryFeature )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( ruleSolitaryFeature )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ruleSolitaryFeature
                    {
                     before(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives1246);
                    ruleSolitaryFeature();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getSolitaryFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:633:6: ( ruleGroupedFeature )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:633:6: ( ruleGroupedFeature )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ruleGroupedFeature
                    {
                     before(grammarAccess.getFeatureAccess().getGroupedFeatureParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1263);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: rule__AtomicExp__Alternatives : ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) | ( ruleEBoolean ) );
    public final void rule__AtomicExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) | ( ruleEBoolean ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
            case 42:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            case 37:
                {
                alt2=4;
                }
                break;
            case 22:
            case 23:
                {
                alt2=5;
                }
                break;
            case 11:
            case 12:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleNULL )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleNULL )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ruleNULL
                    {
                     before(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1295);
                    ruleNULL();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:6: ( ruleNumber )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:6: ( ruleNumber )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ruleNumber
                    {
                     before(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1312);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:661:6: ( ruleIdentifier )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:661:6: ( ruleIdentifier )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:662:1: ruleIdentifier
                    {
                     before(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1329);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:667:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:667:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( rule__AtomicExp__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpAccess().getGroup_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( rule__AtomicExp__Group_3__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:669:2: rule__AtomicExp__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1346);
                    rule__AtomicExp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:6: ( ruleUnaryOperation )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:6: ( ruleUnaryOperation )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:674:1: ruleUnaryOperation
                    {
                     before(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1364);
                    ruleUnaryOperation();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:6: ( ruleEBoolean )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:6: ( ruleEBoolean )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ruleEBoolean
                    {
                     before(grammarAccess.getAtomicExpAccess().getEBooleanParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__AtomicExp__Alternatives1381);
                    ruleEBoolean();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getEBooleanParserRuleCall_5()); 

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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( 'true' )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( 'true' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives1414); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:703:6: ( 'false' )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:703:6: ( 'false' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:704:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1434); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1468); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1485); 
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


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: rule__LogicalOperator__Alternatives : ( ( ( 'And' ) ) | ( ( 'Or' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( ( ( 'And' ) ) | ( ( 'Or' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( ( 'And' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( ( 'And' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( 'And' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( 'And' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:745:3: 'And'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__LogicalOperator__Alternatives1518); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:750:6: ( ( 'Or' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:750:6: ( ( 'Or' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( 'Or' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( 'Or' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:752:3: 'Or'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__LogicalOperator__Alternatives1539); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: rule__CompareOperator__Alternatives : ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( 'Equals' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( ( 'Equals' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: ( 'Equals' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( 'Equals' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:769:3: 'Equals'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__CompareOperator__Alternatives1575); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:774:6: ( ( 'Higher' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:774:6: ( ( 'Higher' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( 'Higher' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: ( 'Higher' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:776:3: 'Higher'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__CompareOperator__Alternatives1596); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:6: ( ( 'Lower' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:6: ( ( 'Lower' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( 'Lower' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( 'Lower' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:783:3: 'Lower'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__CompareOperator__Alternatives1617); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__ArithmicOperator__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) );
    public final void rule__ArithmicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( 'Add' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( 'Add' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( 'Add' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( 'Add' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:800:3: 'Add'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ArithmicOperator__Alternatives1653); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:805:6: ( ( 'Subtract' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:805:6: ( ( 'Subtract' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( 'Subtract' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( 'Subtract' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:807:3: 'Subtract'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ArithmicOperator__Alternatives1674); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:812:6: ( ( 'Divide' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:812:6: ( ( 'Divide' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( 'Divide' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( 'Divide' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:3: 'Divide'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ArithmicOperator__Alternatives1695); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:819:6: ( ( 'Multiply' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:819:6: ( ( 'Multiply' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( 'Multiply' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( 'Multiply' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:821:3: 'Multiply'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ArithmicOperator__Alternatives1716); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: rule__UnaryOperator__Alternatives : ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( ( 'Not' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ( ( 'Not' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( 'Not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( 'Not' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:838:3: 'Not'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__UnaryOperator__Alternatives1752); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:843:6: ( ( 'Minus' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:843:6: ( ( 'Minus' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( 'Minus' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( 'Minus' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:845:3: 'Minus'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__UnaryOperator__Alternatives1773); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:855:1: rule__SimpleType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( ( 'boolean' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( 'boolean' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:862:3: 'boolean'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleType__Alternatives1809); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:867:6: ( ( 'int' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:867:6: ( ( 'int' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: ( 'int' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:869:3: 'int'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__SimpleType__Alternatives1830); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:874:6: ( ( 'double' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:874:6: ( ( 'double' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: ( 'double' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:876:3: 'double'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__SimpleType__Alternatives1851); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:6: ( ( 'String' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:6: ( ( 'String' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( 'String' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:883:3: 'String'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__SimpleType__Alternatives1872); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: rule__SolitaryType__Alternatives : ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) );
    public final void rule__SolitaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( ( 'Optional' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( ( 'Optional' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( 'Optional' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: ( 'Optional' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:900:3: 'Optional'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__SolitaryType__Alternatives1908); 

                    }

                     after(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:905:6: ( ( 'Mandatory' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:905:6: ( ( 'Mandatory' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: ( 'Mandatory' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ( 'Mandatory' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:3: 'Mandatory'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__SolitaryType__Alternatives1929); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:924:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01962);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01965);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:938:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12023);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12026);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( 'Model' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( 'Model' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Model__Group__1__Impl2054); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:986:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22085);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22088);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group__2__Impl2116); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1017:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32147);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32150);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__Model__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl2177);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42208);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Model__Group__4__Impl2236); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02277);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02280);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: rule__Model__Group_3__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Model__Group_3__0__Impl2308); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12339);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12342);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( ( ( rule__Model__RootFeatureAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( rule__Model__RootFeatureAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__Model__RootFeatureAssignment_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:2: rule__Model__RootFeatureAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2369);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( rule__Model__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22399);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__Group_3_2__0 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: ( ( ( rule__Model__Group_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( ( rule__Model__Group_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( ( rule__Model__Group_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( rule__Model__Group_3_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( rule__Model__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:2: rule__Model__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2426);
            	    rule__Model__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: rule__Model__Group_3_2__0 : rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 ;
    public final void rule__Model__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:2: rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02463);
            rule__Model__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02466);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: rule__Model__Group_3_2__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1193:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Model__Group_3_2__0__Impl2494); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: rule__Model__Group_3_2__1 : rule__Model__Group_3_2__1__Impl ;
    public final void rule__Model__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( rule__Model__Group_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:2: rule__Model__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12525);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: rule__Model__Group_3_2__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) ;
    public final void rule__Model__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:2: rule__Model__RootFeatureAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2552);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: rule__SolitaryFeature__Group__0 : rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 ;
    public final void rule__SolitaryFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:2: rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02586);
            rule__SolitaryFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02589);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: rule__SolitaryFeature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__SolitaryFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: ( ( 'feature' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: ( 'feature' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: ( 'feature' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: 'feature'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SolitaryFeature__Group__0__Impl2617); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: rule__SolitaryFeature__Group__1 : rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 ;
    public final void rule__SolitaryFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:2: rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12648);
            rule__SolitaryFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12651);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: rule__SolitaryFeature__Group__1__Impl : ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) ;
    public final void rule__SolitaryFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:2: rule__SolitaryFeature__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2678);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: rule__SolitaryFeature__Group__2 : rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 ;
    public final void rule__SolitaryFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:2: rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22709);
            rule__SolitaryFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22712);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: rule__SolitaryFeature__Group__2__Impl : ( ( rule__SolitaryFeature__TypeAssignment_2 )? ) ;
    public final void rule__SolitaryFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: ( ( ( rule__SolitaryFeature__TypeAssignment_2 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( ( rule__SolitaryFeature__TypeAssignment_2 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1315:1: ( ( rule__SolitaryFeature__TypeAssignment_2 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( rule__SolitaryFeature__TypeAssignment_2 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( rule__SolitaryFeature__TypeAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=27)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:2: rule__SolitaryFeature__TypeAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__TypeAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2739);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: rule__SolitaryFeature__Group__3 : rule__SolitaryFeature__Group__3__Impl rule__SolitaryFeature__Group__4 ;
    public final void rule__SolitaryFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( rule__SolitaryFeature__Group__3__Impl rule__SolitaryFeature__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:2: rule__SolitaryFeature__Group__3__Impl rule__SolitaryFeature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32770);
            rule__SolitaryFeature__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__4_in_rule__SolitaryFeature__Group__32773);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: rule__SolitaryFeature__Group__3__Impl : ( ( rule__SolitaryFeature__NameAssignment_3 ) ) ;
    public final void rule__SolitaryFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ( ( ( rule__SolitaryFeature__NameAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ( ( rule__SolitaryFeature__NameAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: ( ( rule__SolitaryFeature__NameAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: ( rule__SolitaryFeature__NameAssignment_3 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( rule__SolitaryFeature__NameAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:2: rule__SolitaryFeature__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__NameAssignment_3_in_rule__SolitaryFeature__Group__3__Impl2800);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: rule__SolitaryFeature__Group__4 : rule__SolitaryFeature__Group__4__Impl ;
    public final void rule__SolitaryFeature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( rule__SolitaryFeature__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:2: rule__SolitaryFeature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__4__Impl_in_rule__SolitaryFeature__Group__42830);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: rule__SolitaryFeature__Group__4__Impl : ( ( rule__SolitaryFeature__Group_4__0 )? ) ;
    public final void rule__SolitaryFeature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ( ( rule__SolitaryFeature__Group_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ( ( rule__SolitaryFeature__Group_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ( ( rule__SolitaryFeature__Group_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: ( rule__SolitaryFeature__Group_4__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( rule__SolitaryFeature__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:2: rule__SolitaryFeature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__0_in_rule__SolitaryFeature__Group__4__Impl2857);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: rule__SolitaryFeature__Group_4__0 : rule__SolitaryFeature__Group_4__0__Impl rule__SolitaryFeature__Group_4__1 ;
    public final void rule__SolitaryFeature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( rule__SolitaryFeature__Group_4__0__Impl rule__SolitaryFeature__Group_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:2: rule__SolitaryFeature__Group_4__0__Impl rule__SolitaryFeature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__0__Impl_in_rule__SolitaryFeature__Group_4__02898);
            rule__SolitaryFeature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__1_in_rule__SolitaryFeature__Group_4__02901);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__SolitaryFeature__Group_4__0__Impl : ( '{' ) ;
    public final void rule__SolitaryFeature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: '{'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SolitaryFeature__Group_4__0__Impl2929); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: rule__SolitaryFeature__Group_4__1 : rule__SolitaryFeature__Group_4__1__Impl rule__SolitaryFeature__Group_4__2 ;
    public final void rule__SolitaryFeature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__SolitaryFeature__Group_4__1__Impl rule__SolitaryFeature__Group_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:2: rule__SolitaryFeature__Group_4__1__Impl rule__SolitaryFeature__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__1__Impl_in_rule__SolitaryFeature__Group_4__12960);
            rule__SolitaryFeature__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__2_in_rule__SolitaryFeature__Group_4__12963);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__SolitaryFeature__Group_4__1__Impl : ( ( rule__SolitaryFeature__Group_4_1__0 )? ) ;
    public final void rule__SolitaryFeature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( ( ( rule__SolitaryFeature__Group_4_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ( rule__SolitaryFeature__Group_4_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ( rule__SolitaryFeature__Group_4_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ( rule__SolitaryFeature__Group_4_1__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: ( rule__SolitaryFeature__Group_4_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:2: rule__SolitaryFeature__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__0_in_rule__SolitaryFeature__Group_4__1__Impl2990);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: rule__SolitaryFeature__Group_4__2 : rule__SolitaryFeature__Group_4__2__Impl rule__SolitaryFeature__Group_4__3 ;
    public final void rule__SolitaryFeature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__SolitaryFeature__Group_4__2__Impl rule__SolitaryFeature__Group_4__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:2: rule__SolitaryFeature__Group_4__2__Impl rule__SolitaryFeature__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__2__Impl_in_rule__SolitaryFeature__Group_4__23021);
            rule__SolitaryFeature__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__3_in_rule__SolitaryFeature__Group_4__23024);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: rule__SolitaryFeature__Group_4__2__Impl : ( ( rule__SolitaryFeature__Group_4_2__0 )? ) ;
    public final void rule__SolitaryFeature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: ( ( ( rule__SolitaryFeature__Group_4_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ( rule__SolitaryFeature__Group_4_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ( rule__SolitaryFeature__Group_4_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ( rule__SolitaryFeature__Group_4_2__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: ( rule__SolitaryFeature__Group_4_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:2: rule__SolitaryFeature__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__0_in_rule__SolitaryFeature__Group_4__2__Impl3051);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: rule__SolitaryFeature__Group_4__3 : rule__SolitaryFeature__Group_4__3__Impl rule__SolitaryFeature__Group_4__4 ;
    public final void rule__SolitaryFeature__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( rule__SolitaryFeature__Group_4__3__Impl rule__SolitaryFeature__Group_4__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:2: rule__SolitaryFeature__Group_4__3__Impl rule__SolitaryFeature__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__3__Impl_in_rule__SolitaryFeature__Group_4__33082);
            rule__SolitaryFeature__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__4_in_rule__SolitaryFeature__Group_4__33085);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: rule__SolitaryFeature__Group_4__3__Impl : ( ( rule__SolitaryFeature__Group_4_3__0 )? ) ;
    public final void rule__SolitaryFeature__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1499:1: ( ( ( rule__SolitaryFeature__Group_4_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( ( rule__SolitaryFeature__Group_4_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( ( rule__SolitaryFeature__Group_4_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: ( rule__SolitaryFeature__Group_4_3__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: ( rule__SolitaryFeature__Group_4_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:2: rule__SolitaryFeature__Group_4_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__0_in_rule__SolitaryFeature__Group_4__3__Impl3112);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: rule__SolitaryFeature__Group_4__4 : rule__SolitaryFeature__Group_4__4__Impl ;
    public final void rule__SolitaryFeature__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: ( rule__SolitaryFeature__Group_4__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1517:2: rule__SolitaryFeature__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4__4__Impl_in_rule__SolitaryFeature__Group_4__43143);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: rule__SolitaryFeature__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SolitaryFeature__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: '}'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SolitaryFeature__Group_4__4__Impl3171); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: rule__SolitaryFeature__Group_4_1__0 : rule__SolitaryFeature__Group_4_1__0__Impl rule__SolitaryFeature__Group_4_1__1 ;
    public final void rule__SolitaryFeature__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( rule__SolitaryFeature__Group_4_1__0__Impl rule__SolitaryFeature__Group_4_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:2: rule__SolitaryFeature__Group_4_1__0__Impl rule__SolitaryFeature__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__0__Impl_in_rule__SolitaryFeature__Group_4_1__03212);
            rule__SolitaryFeature__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__1_in_rule__SolitaryFeature__Group_4_1__03215);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1564:1: rule__SolitaryFeature__Group_4_1__0__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) ) ;
    public final void rule__SolitaryFeature__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_4_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:2: rule__SolitaryFeature__FeaturesAssignment_4_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_0_in_rule__SolitaryFeature__Group_4_1__0__Impl3242);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__SolitaryFeature__Group_4_1__1 : rule__SolitaryFeature__Group_4_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( rule__SolitaryFeature__Group_4_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:2: rule__SolitaryFeature__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_1__1__Impl_in_rule__SolitaryFeature__Group_4_1__13272);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: rule__SolitaryFeature__Group_4_1__1__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* ) ;
    public final void rule__SolitaryFeature__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1597:1: ( ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_4_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:1: ( rule__SolitaryFeature__FeaturesAssignment_4_1_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==34) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:2: rule__SolitaryFeature__FeaturesAssignment_4_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_1_in_rule__SolitaryFeature__Group_4_1__1__Impl3299);
            	    rule__SolitaryFeature__FeaturesAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: rule__SolitaryFeature__Group_4_2__0 : rule__SolitaryFeature__Group_4_2__0__Impl rule__SolitaryFeature__Group_4_2__1 ;
    public final void rule__SolitaryFeature__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1617:1: ( rule__SolitaryFeature__Group_4_2__0__Impl rule__SolitaryFeature__Group_4_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:2: rule__SolitaryFeature__Group_4_2__0__Impl rule__SolitaryFeature__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__0__Impl_in_rule__SolitaryFeature__Group_4_2__03334);
            rule__SolitaryFeature__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__1_in_rule__SolitaryFeature__Group_4_2__03337);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: rule__SolitaryFeature__Group_4_2__0__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) ) ;
    public final void rule__SolitaryFeature__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_4_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:2: rule__SolitaryFeature__GroupsAssignment_4_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_0_in_rule__SolitaryFeature__Group_4_2__0__Impl3364);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: rule__SolitaryFeature__Group_4_2__1 : rule__SolitaryFeature__Group_4_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( rule__SolitaryFeature__Group_4_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:2: rule__SolitaryFeature__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_2__1__Impl_in_rule__SolitaryFeature__Group_4_2__13394);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: rule__SolitaryFeature__Group_4_2__1__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* ) ;
    public final void rule__SolitaryFeature__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_4_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:1: ( rule__SolitaryFeature__GroupsAssignment_4_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1660:2: rule__SolitaryFeature__GroupsAssignment_4_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_1_in_rule__SolitaryFeature__Group_4_2__1__Impl3421);
            	    rule__SolitaryFeature__GroupsAssignment_4_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: rule__SolitaryFeature__Group_4_3__0 : rule__SolitaryFeature__Group_4_3__0__Impl rule__SolitaryFeature__Group_4_3__1 ;
    public final void rule__SolitaryFeature__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( rule__SolitaryFeature__Group_4_3__0__Impl rule__SolitaryFeature__Group_4_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:2: rule__SolitaryFeature__Group_4_3__0__Impl rule__SolitaryFeature__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__0__Impl_in_rule__SolitaryFeature__Group_4_3__03456);
            rule__SolitaryFeature__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__1_in_rule__SolitaryFeature__Group_4_3__03459);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: rule__SolitaryFeature__Group_4_3__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__SolitaryFeature__Group_4_3__0__Impl3487); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: rule__SolitaryFeature__Group_4_3__1 : rule__SolitaryFeature__Group_4_3__1__Impl rule__SolitaryFeature__Group_4_3__2 ;
    public final void rule__SolitaryFeature__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1709:1: ( rule__SolitaryFeature__Group_4_3__1__Impl rule__SolitaryFeature__Group_4_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1710:2: rule__SolitaryFeature__Group_4_3__1__Impl rule__SolitaryFeature__Group_4_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__1__Impl_in_rule__SolitaryFeature__Group_4_3__13518);
            rule__SolitaryFeature__Group_4_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__2_in_rule__SolitaryFeature__Group_4_3__13521);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: rule__SolitaryFeature__Group_4_3__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) ) ;
    public final void rule__SolitaryFeature__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1723:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_4_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:2: rule__SolitaryFeature__ConstraintsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_1_in_rule__SolitaryFeature__Group_4_3__1__Impl3548);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: rule__SolitaryFeature__Group_4_3__2 : rule__SolitaryFeature__Group_4_3__2__Impl ;
    public final void rule__SolitaryFeature__Group_4_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__SolitaryFeature__Group_4_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:2: rule__SolitaryFeature__Group_4_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3__2__Impl_in_rule__SolitaryFeature__Group_4_3__23578);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: rule__SolitaryFeature__Group_4_3__2__Impl : ( ( rule__SolitaryFeature__Group_4_3_2__0 )* ) ;
    public final void rule__SolitaryFeature__Group_4_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: ( ( ( rule__SolitaryFeature__Group_4_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( ( rule__SolitaryFeature__Group_4_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1750:1: ( ( rule__SolitaryFeature__Group_4_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: ( rule__SolitaryFeature__Group_4_3_2__0 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_4_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: ( rule__SolitaryFeature__Group_4_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:2: rule__SolitaryFeature__Group_4_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__0_in_rule__SolitaryFeature__Group_4_3__2__Impl3605);
            	    rule__SolitaryFeature__Group_4_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: rule__SolitaryFeature__Group_4_3_2__0 : rule__SolitaryFeature__Group_4_3_2__0__Impl rule__SolitaryFeature__Group_4_3_2__1 ;
    public final void rule__SolitaryFeature__Group_4_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: ( rule__SolitaryFeature__Group_4_3_2__0__Impl rule__SolitaryFeature__Group_4_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1773:2: rule__SolitaryFeature__Group_4_3_2__0__Impl rule__SolitaryFeature__Group_4_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__0__Impl_in_rule__SolitaryFeature__Group_4_3_2__03642);
            rule__SolitaryFeature__Group_4_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__1_in_rule__SolitaryFeature__Group_4_3_2__03645);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: rule__SolitaryFeature__Group_4_3_2__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_4_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1784:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_4_3_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__SolitaryFeature__Group_4_3_2__0__Impl3673); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: rule__SolitaryFeature__Group_4_3_2__1 : rule__SolitaryFeature__Group_4_3_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_4_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( rule__SolitaryFeature__Group_4_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:2: rule__SolitaryFeature__Group_4_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_4_3_2__1__Impl_in_rule__SolitaryFeature__Group_4_3_2__13704);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: rule__SolitaryFeature__Group_4_3_2__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) ) ;
    public final void rule__SolitaryFeature__Group_4_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_4_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:1: ( rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:2: rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1_in_rule__SolitaryFeature__Group_4_3_2__1__Impl3731);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__03765);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__03768);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Group__Group__0__Impl : ( 'select' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( ( 'select' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( 'select' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ( 'select' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: 'select'
            {
             before(grammarAccess.getGroupAccess().getSelectKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Group__Group__0__Impl3796); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__13827);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__13830);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1874:1: rule__Group__Group__1__Impl : ( ( rule__Group__InclusiveAssignment_1 )? ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( ( ( rule__Group__InclusiveAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:1: ( rule__Group__InclusiveAssignment_1 )?
            {
             before(grammarAccess.getGroupAccess().getInclusiveAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Group__InclusiveAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:2: rule__Group__InclusiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl3857);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__23888);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__23891);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: rule__Group__Group__2__Impl : ( '(' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:1: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Group__Group__2__Impl3919); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__33950);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__33953);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: rule__Group__Group__3__Impl : ( ( rule__Group__GroupedFeaturesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( ( ( rule__Group__GroupedFeaturesAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( ( rule__Group__GroupedFeaturesAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( ( rule__Group__GroupedFeaturesAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Group__GroupedFeaturesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ( rule__Group__GroupedFeaturesAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: rule__Group__GroupedFeaturesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl3980);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44010);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5_in_rule__Group__Group__44013);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ( rule__Group__Group_4__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:1: ( rule__Group__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1970:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl4040);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__Group__Group__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:2: rule__Group__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__54071);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: rule__Group__Group__5__Impl : ( ')' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Group__Group__5__Impl4099); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2022:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2026:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__04142);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__04145);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2038:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Group__Group_4__0__Impl4173); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2053:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( rule__Group__Group_4__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__14204);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( rule__Group__GroupedFeaturesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( rule__Group__GroupedFeaturesAssignment_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:2: rule__Group__GroupedFeaturesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl4231);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2085:1: rule__GroupedFeature__Group__0 : rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 ;
    public final void rule__GroupedFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:2: rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04265);
            rule__GroupedFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04268);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: rule__GroupedFeature__Group__0__Impl : ( () ) ;
    public final void rule__GroupedFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ()
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: rule__GroupedFeature__Group__1 : rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 ;
    public final void rule__GroupedFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2120:1: ( rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:2: rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14326);
            rule__GroupedFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14329);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:1: rule__GroupedFeature__Group__1__Impl : ( ( rule__GroupedFeature__TypeAssignment_1 )? ) ;
    public final void rule__GroupedFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: ( ( ( rule__GroupedFeature__TypeAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: ( ( rule__GroupedFeature__TypeAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: ( ( rule__GroupedFeature__TypeAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( rule__GroupedFeature__TypeAssignment_1 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: ( rule__GroupedFeature__TypeAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=24 && LA24_0<=27)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:2: rule__GroupedFeature__TypeAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__TypeAssignment_1_in_rule__GroupedFeature__Group__1__Impl4356);
                    rule__GroupedFeature__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: rule__GroupedFeature__Group__2 : rule__GroupedFeature__Group__2__Impl rule__GroupedFeature__Group__3 ;
    public final void rule__GroupedFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__GroupedFeature__Group__2__Impl rule__GroupedFeature__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: rule__GroupedFeature__Group__2__Impl rule__GroupedFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24387);
            rule__GroupedFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__3_in_rule__GroupedFeature__Group__24390);
            rule__GroupedFeature__Group__3();

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: rule__GroupedFeature__Group__2__Impl : ( ( rule__GroupedFeature__NameAssignment_2 ) ) ;
    public final void rule__GroupedFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( ( ( rule__GroupedFeature__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( ( rule__GroupedFeature__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( ( rule__GroupedFeature__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: ( rule__GroupedFeature__NameAssignment_2 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:1: ( rule__GroupedFeature__NameAssignment_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:2: rule__GroupedFeature__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__NameAssignment_2_in_rule__GroupedFeature__Group__2__Impl4417);
            rule__GroupedFeature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__GroupedFeature__Group__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: rule__GroupedFeature__Group__3 : rule__GroupedFeature__Group__3__Impl ;
    public final void rule__GroupedFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2178:1: ( rule__GroupedFeature__Group__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2179:2: rule__GroupedFeature__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__3__Impl_in_rule__GroupedFeature__Group__34447);
            rule__GroupedFeature__Group__3__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group__3"


    // $ANTLR start "rule__GroupedFeature__Group__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: rule__GroupedFeature__Group__3__Impl : ( ( rule__GroupedFeature__Group_3__0 )? ) ;
    public final void rule__GroupedFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( ( ( rule__GroupedFeature__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: ( ( rule__GroupedFeature__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: ( ( rule__GroupedFeature__Group_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2191:1: ( rule__GroupedFeature__Group_3__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( rule__GroupedFeature__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:2: rule__GroupedFeature__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__0_in_rule__GroupedFeature__Group__3__Impl4474);
                    rule__GroupedFeature__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group__3__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: rule__GroupedFeature__Group_3__0 : rule__GroupedFeature__Group_3__0__Impl rule__GroupedFeature__Group_3__1 ;
    public final void rule__GroupedFeature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( rule__GroupedFeature__Group_3__0__Impl rule__GroupedFeature__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:2: rule__GroupedFeature__Group_3__0__Impl rule__GroupedFeature__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__0__Impl_in_rule__GroupedFeature__Group_3__04513);
            rule__GroupedFeature__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__1_in_rule__GroupedFeature__Group_3__04516);
            rule__GroupedFeature__Group_3__1();

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
    // $ANTLR end "rule__GroupedFeature__Group_3__0"


    // $ANTLR start "rule__GroupedFeature__Group_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: rule__GroupedFeature__Group_3__0__Impl : ( '{' ) ;
    public final void rule__GroupedFeature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2226:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: '{'
            {
             before(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__GroupedFeature__Group_3__0__Impl4544); 
             after(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: rule__GroupedFeature__Group_3__1 : rule__GroupedFeature__Group_3__1__Impl rule__GroupedFeature__Group_3__2 ;
    public final void rule__GroupedFeature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: ( rule__GroupedFeature__Group_3__1__Impl rule__GroupedFeature__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:2: rule__GroupedFeature__Group_3__1__Impl rule__GroupedFeature__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__1__Impl_in_rule__GroupedFeature__Group_3__14575);
            rule__GroupedFeature__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__2_in_rule__GroupedFeature__Group_3__14578);
            rule__GroupedFeature__Group_3__2();

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
    // $ANTLR end "rule__GroupedFeature__Group_3__1"


    // $ANTLR start "rule__GroupedFeature__Group_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: rule__GroupedFeature__Group_3__1__Impl : ( ( rule__GroupedFeature__Group_3_1__0 )? ) ;
    public final void rule__GroupedFeature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2257:1: ( ( ( rule__GroupedFeature__Group_3_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: ( ( rule__GroupedFeature__Group_3_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: ( ( rule__GroupedFeature__Group_3_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( rule__GroupedFeature__Group_3_1__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( rule__GroupedFeature__Group_3_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:2: rule__GroupedFeature__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_1__0_in_rule__GroupedFeature__Group_3__1__Impl4605);
                    rule__GroupedFeature__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:1: rule__GroupedFeature__Group_3__2 : rule__GroupedFeature__Group_3__2__Impl rule__GroupedFeature__Group_3__3 ;
    public final void rule__GroupedFeature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: ( rule__GroupedFeature__Group_3__2__Impl rule__GroupedFeature__Group_3__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2275:2: rule__GroupedFeature__Group_3__2__Impl rule__GroupedFeature__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__2__Impl_in_rule__GroupedFeature__Group_3__24636);
            rule__GroupedFeature__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__3_in_rule__GroupedFeature__Group_3__24639);
            rule__GroupedFeature__Group_3__3();

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
    // $ANTLR end "rule__GroupedFeature__Group_3__2"


    // $ANTLR start "rule__GroupedFeature__Group_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: rule__GroupedFeature__Group_3__2__Impl : ( ( rule__GroupedFeature__Group_3_2__0 )? ) ;
    public final void rule__GroupedFeature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: ( ( ( rule__GroupedFeature__Group_3_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ( ( rule__GroupedFeature__Group_3_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ( ( rule__GroupedFeature__Group_3_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:1: ( rule__GroupedFeature__Group_3_2__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: ( rule__GroupedFeature__Group_3_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:2: rule__GroupedFeature__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_2__0_in_rule__GroupedFeature__Group_3__2__Impl4666);
                    rule__GroupedFeature__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3__3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:1: rule__GroupedFeature__Group_3__3 : rule__GroupedFeature__Group_3__3__Impl rule__GroupedFeature__Group_3__4 ;
    public final void rule__GroupedFeature__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( rule__GroupedFeature__Group_3__3__Impl rule__GroupedFeature__Group_3__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:2: rule__GroupedFeature__Group_3__3__Impl rule__GroupedFeature__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__3__Impl_in_rule__GroupedFeature__Group_3__34697);
            rule__GroupedFeature__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__4_in_rule__GroupedFeature__Group_3__34700);
            rule__GroupedFeature__Group_3__4();

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
    // $ANTLR end "rule__GroupedFeature__Group_3__3"


    // $ANTLR start "rule__GroupedFeature__Group_3__3__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:1: rule__GroupedFeature__Group_3__3__Impl : ( ( rule__GroupedFeature__Group_3_3__0 )? ) ;
    public final void rule__GroupedFeature__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( ( ( rule__GroupedFeature__Group_3_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( ( rule__GroupedFeature__Group_3_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: ( ( rule__GroupedFeature__Group_3_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: ( rule__GroupedFeature__Group_3_3__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_3_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( rule__GroupedFeature__Group_3_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:2: rule__GroupedFeature__Group_3_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3__0_in_rule__GroupedFeature__Group_3__3__Impl4727);
                    rule__GroupedFeature__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupedFeatureAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3__3__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3__4"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2328:1: rule__GroupedFeature__Group_3__4 : rule__GroupedFeature__Group_3__4__Impl ;
    public final void rule__GroupedFeature__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( rule__GroupedFeature__Group_3__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:2: rule__GroupedFeature__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3__4__Impl_in_rule__GroupedFeature__Group_3__44758);
            rule__GroupedFeature__Group_3__4__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group_3__4"


    // $ANTLR start "rule__GroupedFeature__Group_3__4__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: rule__GroupedFeature__Group_3__4__Impl : ( '}' ) ;
    public final void rule__GroupedFeature__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: '}'
            {
             before(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__GroupedFeature__Group_3__4__Impl4786); 
             after(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3__4__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__GroupedFeature__Group_3_1__0 : rule__GroupedFeature__Group_3_1__0__Impl rule__GroupedFeature__Group_3_1__1 ;
    public final void rule__GroupedFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( rule__GroupedFeature__Group_3_1__0__Impl rule__GroupedFeature__Group_3_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:2: rule__GroupedFeature__Group_3_1__0__Impl rule__GroupedFeature__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_1__0__Impl_in_rule__GroupedFeature__Group_3_1__04827);
            rule__GroupedFeature__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_1__1_in_rule__GroupedFeature__Group_3_1__04830);
            rule__GroupedFeature__Group_3_1__1();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_1__0"


    // $ANTLR start "rule__GroupedFeature__Group_3_1__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: rule__GroupedFeature__Group_3_1__0__Impl : ( ( rule__GroupedFeature__GroupsAssignment_3_1_0 ) ) ;
    public final void rule__GroupedFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( ( ( rule__GroupedFeature__GroupsAssignment_3_1_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ( rule__GroupedFeature__GroupsAssignment_3_1_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( ( rule__GroupedFeature__GroupsAssignment_3_1_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ( rule__GroupedFeature__GroupsAssignment_3_1_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_3_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: ( rule__GroupedFeature__GroupsAssignment_3_1_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:2: rule__GroupedFeature__GroupsAssignment_3_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_3_1_0_in_rule__GroupedFeature__Group_3_1__0__Impl4857);
            rule__GroupedFeature__GroupsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_1__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_1__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: rule__GroupedFeature__Group_3_1__1 : rule__GroupedFeature__Group_3_1__1__Impl ;
    public final void rule__GroupedFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: ( rule__GroupedFeature__Group_3_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:2: rule__GroupedFeature__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_1__1__Impl_in_rule__GroupedFeature__Group_3_1__14887);
            rule__GroupedFeature__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_1__1"


    // $ANTLR start "rule__GroupedFeature__Group_3_1__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: rule__GroupedFeature__Group_3_1__1__Impl : ( ( rule__GroupedFeature__GroupsAssignment_3_1_1 )* ) ;
    public final void rule__GroupedFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( ( ( rule__GroupedFeature__GroupsAssignment_3_1_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( ( rule__GroupedFeature__GroupsAssignment_3_1_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( ( rule__GroupedFeature__GroupsAssignment_3_1_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: ( rule__GroupedFeature__GroupsAssignment_3_1_1 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_3_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:1: ( rule__GroupedFeature__GroupsAssignment_3_1_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2415:2: rule__GroupedFeature__GroupsAssignment_3_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_3_1_1_in_rule__GroupedFeature__Group_3_1__1__Impl4914);
            	    rule__GroupedFeature__GroupsAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_1__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2429:1: rule__GroupedFeature__Group_3_2__0 : rule__GroupedFeature__Group_3_2__0__Impl rule__GroupedFeature__Group_3_2__1 ;
    public final void rule__GroupedFeature__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( rule__GroupedFeature__Group_3_2__0__Impl rule__GroupedFeature__Group_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:2: rule__GroupedFeature__Group_3_2__0__Impl rule__GroupedFeature__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_2__0__Impl_in_rule__GroupedFeature__Group_3_2__04949);
            rule__GroupedFeature__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_2__1_in_rule__GroupedFeature__Group_3_2__04952);
            rule__GroupedFeature__Group_3_2__1();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_2__0"


    // $ANTLR start "rule__GroupedFeature__Group_3_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2441:1: rule__GroupedFeature__Group_3_2__0__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_3_2_0 ) ) ;
    public final void rule__GroupedFeature__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_3_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__GroupedFeature__FeaturesAssignment_3_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: ( ( rule__GroupedFeature__FeaturesAssignment_3_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( rule__GroupedFeature__FeaturesAssignment_3_2_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_3_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( rule__GroupedFeature__FeaturesAssignment_3_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:2: rule__GroupedFeature__FeaturesAssignment_3_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_3_2_0_in_rule__GroupedFeature__Group_3_2__0__Impl4979);
            rule__GroupedFeature__FeaturesAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_2__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2458:1: rule__GroupedFeature__Group_3_2__1 : rule__GroupedFeature__Group_3_2__1__Impl ;
    public final void rule__GroupedFeature__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: ( rule__GroupedFeature__Group_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:2: rule__GroupedFeature__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_2__1__Impl_in_rule__GroupedFeature__Group_3_2__15009);
            rule__GroupedFeature__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_2__1"


    // $ANTLR start "rule__GroupedFeature__Group_3_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: rule__GroupedFeature__Group_3_2__1__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_3_2_1 )* ) ;
    public final void rule__GroupedFeature__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_3_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ( rule__GroupedFeature__FeaturesAssignment_3_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ( rule__GroupedFeature__FeaturesAssignment_3_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ( rule__GroupedFeature__FeaturesAssignment_3_2_1 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( rule__GroupedFeature__FeaturesAssignment_3_2_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:2: rule__GroupedFeature__FeaturesAssignment_3_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_3_2_1_in_rule__GroupedFeature__Group_3_2__1__Impl5036);
            	    rule__GroupedFeature__FeaturesAssignment_3_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_2__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_3__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__GroupedFeature__Group_3_3__0 : rule__GroupedFeature__Group_3_3__0__Impl rule__GroupedFeature__Group_3_3__1 ;
    public final void rule__GroupedFeature__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( rule__GroupedFeature__Group_3_3__0__Impl rule__GroupedFeature__Group_3_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:2: rule__GroupedFeature__Group_3_3__0__Impl rule__GroupedFeature__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3__0__Impl_in_rule__GroupedFeature__Group_3_3__05071);
            rule__GroupedFeature__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3__1_in_rule__GroupedFeature__Group_3_3__05074);
            rule__GroupedFeature__Group_3_3__1();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_3__0"


    // $ANTLR start "rule__GroupedFeature__Group_3_3__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: rule__GroupedFeature__Group_3_3__0__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_3_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GroupedFeature__Group_3_3__0__Impl5102); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_3__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_3__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: rule__GroupedFeature__Group_3_3__1 : rule__GroupedFeature__Group_3_3__1__Impl rule__GroupedFeature__Group_3_3__2 ;
    public final void rule__GroupedFeature__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( rule__GroupedFeature__Group_3_3__1__Impl rule__GroupedFeature__Group_3_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:2: rule__GroupedFeature__Group_3_3__1__Impl rule__GroupedFeature__Group_3_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3__1__Impl_in_rule__GroupedFeature__Group_3_3__15133);
            rule__GroupedFeature__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3__2_in_rule__GroupedFeature__Group_3_3__15136);
            rule__GroupedFeature__Group_3_3__2();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_3__1"


    // $ANTLR start "rule__GroupedFeature__Group_3_3__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: rule__GroupedFeature__Group_3_3__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_1 ) ) ;
    public final void rule__GroupedFeature__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( rule__GroupedFeature__ConstraintsAssignment_3_3_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_3_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__GroupedFeature__ConstraintsAssignment_3_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:2: rule__GroupedFeature__ConstraintsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_3_3_1_in_rule__GroupedFeature__Group_3_3__1__Impl5163);
            rule__GroupedFeature__ConstraintsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_3__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_3__2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__GroupedFeature__Group_3_3__2 : rule__GroupedFeature__Group_3_3__2__Impl ;
    public final void rule__GroupedFeature__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( rule__GroupedFeature__Group_3_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:2: rule__GroupedFeature__Group_3_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3__2__Impl_in_rule__GroupedFeature__Group_3_3__25193);
            rule__GroupedFeature__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_3__2"


    // $ANTLR start "rule__GroupedFeature__Group_3_3__2__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: rule__GroupedFeature__Group_3_3__2__Impl : ( ( rule__GroupedFeature__Group_3_3_2__0 )* ) ;
    public final void rule__GroupedFeature__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ( ( ( rule__GroupedFeature__Group_3_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( ( rule__GroupedFeature__Group_3_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( ( rule__GroupedFeature__Group_3_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( rule__GroupedFeature__Group_3_3_2__0 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_3_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( rule__GroupedFeature__Group_3_3_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:2: rule__GroupedFeature__Group_3_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3_2__0_in_rule__GroupedFeature__Group_3_3__2__Impl5220);
            	    rule__GroupedFeature__Group_3_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroup_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_3__2__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_3_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: rule__GroupedFeature__Group_3_3_2__0 : rule__GroupedFeature__Group_3_3_2__0__Impl rule__GroupedFeature__Group_3_3_2__1 ;
    public final void rule__GroupedFeature__Group_3_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:1: ( rule__GroupedFeature__Group_3_3_2__0__Impl rule__GroupedFeature__Group_3_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:2: rule__GroupedFeature__Group_3_3_2__0__Impl rule__GroupedFeature__Group_3_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3_2__0__Impl_in_rule__GroupedFeature__Group_3_3_2__05257);
            rule__GroupedFeature__Group_3_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3_2__1_in_rule__GroupedFeature__Group_3_3_2__05260);
            rule__GroupedFeature__Group_3_3_2__1();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_3_2__0"


    // $ANTLR start "rule__GroupedFeature__Group_3_3_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: rule__GroupedFeature__Group_3_3_2__0__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_3_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_3_3_2_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GroupedFeature__Group_3_3_2__0__Impl5288); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_3_2__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_3_3_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: rule__GroupedFeature__Group_3_3_2__1 : rule__GroupedFeature__Group_3_3_2__1__Impl ;
    public final void rule__GroupedFeature__Group_3_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( rule__GroupedFeature__Group_3_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:2: rule__GroupedFeature__Group_3_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_3_3_2__1__Impl_in_rule__GroupedFeature__Group_3_3_2__15319);
            rule__GroupedFeature__Group_3_3_2__1__Impl();

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
    // $ANTLR end "rule__GroupedFeature__Group_3_3_2__1"


    // $ANTLR start "rule__GroupedFeature__Group_3_3_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: rule__GroupedFeature__Group_3_3_2__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 ) ) ;
    public final void rule__GroupedFeature__Group_3_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: ( ( rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: ( rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_3_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:2: rule__GroupedFeature__ConstraintsAssignment_3_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_3_3_2_1_in_rule__GroupedFeature__Group_3_3_2__1__Impl5346);
            rule__GroupedFeature__ConstraintsAssignment_3_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_3_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_3_3_2__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05380);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05383);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:1: rule__Expression__Group__0__Impl : ( ruleLogical2Operation ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2663:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl5410);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2680:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15439);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2687:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( ( rule__Expression__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( rule__Expression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=13 && LA32_0<=14)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5466);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05501);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05504);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ()
            {
             before(grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2743:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15562);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15565);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2755:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( rule__Expression__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:2: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl5592);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__25622);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RexpAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: ( ( ( rule__Expression__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: ( rule__Expression__RexpAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: ( rule__Expression__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:2: rule__Expression__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl5649);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: rule__Logical2Operation__Group__0 : rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 ;
    public final void rule__Logical2Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:2: rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__05685);
            rule__Logical2Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__05688);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__Logical2Operation__Group__0__Impl : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl5715);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: rule__Logical2Operation__Group__1 : rule__Logical2Operation__Group__1__Impl ;
    public final void rule__Logical2Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( rule__Logical2Operation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:2: rule__Logical2Operation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__15744);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2842:1: rule__Logical2Operation__Group__1__Impl : ( ( rule__Logical2Operation__Group_1__0 )* ) ;
    public final void rule__Logical2Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:1: ( ( ( rule__Logical2Operation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( rule__Logical2Operation__Group_1__0 )*
            {
             before(grammarAccess.getLogical2OperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( rule__Logical2Operation__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=15 && LA33_0<=17)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:2: rule__Logical2Operation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl5771);
            	    rule__Logical2Operation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: rule__Logical2Operation__Group_1__0 : rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 ;
    public final void rule__Logical2Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: ( rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:2: rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__05806);
            rule__Logical2Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__05809);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: rule__Logical2Operation__Group_1__0__Impl : ( () ) ;
    public final void rule__Logical2Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ()
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: rule__Logical2Operation__Group_1__1 : rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 ;
    public final void rule__Logical2Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:2: rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__15867);
            rule__Logical2Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__15870);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: rule__Logical2Operation__Group_1__1__Impl : ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) ;
    public final void rule__Logical2Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:2: rule__Logical2Operation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl5897);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: rule__Logical2Operation__Group_1__2 : rule__Logical2Operation__Group_1__2__Impl ;
    public final void rule__Logical2Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( rule__Logical2Operation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:2: rule__Logical2Operation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__25927);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2934:1: rule__Logical2Operation__Group_1__2__Impl : ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) ;
    public final void rule__Logical2Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: ( ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:2: rule__Logical2Operation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl5954);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: rule__BinaryOperation__Group__0 : rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 ;
    public final void rule__BinaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: ( rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2962:2: rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__05990);
            rule__BinaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__05993);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: rule__BinaryOperation__Group__0__Impl : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl6020);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: rule__BinaryOperation__Group__1 : rule__BinaryOperation__Group__1__Impl ;
    public final void rule__BinaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: ( rule__BinaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2991:2: rule__BinaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16049);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: rule__BinaryOperation__Group__1__Impl : ( ( rule__BinaryOperation__Group_1__0 )* ) ;
    public final void rule__BinaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: ( ( ( rule__BinaryOperation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: ( rule__BinaryOperation__Group_1__0 )*
            {
             before(grammarAccess.getBinaryOperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( rule__BinaryOperation__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=18 && LA34_0<=21)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:2: rule__BinaryOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl6076);
            	    rule__BinaryOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: rule__BinaryOperation__Group_1__0 : rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 ;
    public final void rule__BinaryOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ( rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:2: rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__06111);
            rule__BinaryOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__06114);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: rule__BinaryOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: ()
            {
             before(grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3049:1: rule__BinaryOperation__Group_1__1 : rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 ;
    public final void rule__BinaryOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:2: rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__16172);
            rule__BinaryOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__16175);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: rule__BinaryOperation__Group_1__1__Impl : ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__BinaryOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: ( ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:2: rule__BinaryOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl6202);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3078:1: rule__BinaryOperation__Group_1__2 : rule__BinaryOperation__Group_1__2__Impl ;
    public final void rule__BinaryOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( rule__BinaryOperation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3083:2: rule__BinaryOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__26232);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: rule__BinaryOperation__Group_1__2__Impl : ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) ;
    public final void rule__BinaryOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: ( ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3094:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3095:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:2: rule__BinaryOperation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl6259);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3112:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06295);
            rule__UnaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06298);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl6325);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__16355);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__ExpAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: ( ( ( rule__UnaryOperation__ExpAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3157:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: ( rule__UnaryOperation__ExpAssignment_1 )
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( rule__UnaryOperation__ExpAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:2: rule__UnaryOperation__ExpAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl6382);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: rule__AtomicExp__Group_3__0 : rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 ;
    public final void rule__AtomicExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:2: rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__06416);
            rule__AtomicExp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__06419);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: rule__AtomicExp__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: '('
            {
             before(grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__AtomicExp__Group_3__0__Impl6447); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: rule__AtomicExp__Group_3__1 : rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 ;
    public final void rule__AtomicExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__16478);
            rule__AtomicExp__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__16481);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__AtomicExp__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ruleExpression
            {
             before(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl6508);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: rule__AtomicExp__Group_3__2 : rule__AtomicExp__Group_3__2__Impl ;
    public final void rule__AtomicExp__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__AtomicExp__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:2: rule__AtomicExp__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__26537);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: rule__AtomicExp__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExp__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ')'
            {
             before(grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__AtomicExp__Group_3__2__Impl6565); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3274:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__06602);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__06605);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__RefAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3285:1: ( ( ( rule__Identifier__RefAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( ( rule__Identifier__RefAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( ( rule__Identifier__RefAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: ( rule__Identifier__RefAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ( rule__Identifier__RefAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:2: rule__Identifier__RefAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_0_in_rule__Identifier__Group__0__Impl6632);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3302:1: ( rule__Identifier__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3303:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__16662);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Group_1__0 )* ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: ( ( ( rule__Identifier__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( ( rule__Identifier__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: ( ( rule__Identifier__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: ( rule__Identifier__Group_1__0 )*
            {
             before(grammarAccess.getIdentifierAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: ( rule__Identifier__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:2: rule__Identifier__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl6689);
            	    rule__Identifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: rule__Identifier__Group_1__0 : rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 ;
    public final void rule__Identifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:2: rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__06724);
            rule__Identifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__06727);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: rule__Identifier__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Identifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ( '.' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: ( '.' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3348:1: '.'
            {
             before(grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Identifier__Group_1__0__Impl6755); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:1: rule__Identifier__Group_1__1 : rule__Identifier__Group_1__1__Impl ;
    public final void rule__Identifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3365:1: ( rule__Identifier__Group_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:2: rule__Identifier__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__16786);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: rule__Identifier__Group_1__1__Impl : ( ( rule__Identifier__RefAssignment_1_1 ) ) ;
    public final void rule__Identifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( ( ( rule__Identifier__RefAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ( ( rule__Identifier__RefAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:1: ( ( rule__Identifier__RefAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: ( rule__Identifier__RefAssignment_1_1 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: ( rule__Identifier__RefAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:2: rule__Identifier__RefAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_1_1_in_rule__Identifier__Group_1__1__Impl6813);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: rule__NULL__Group__0 : rule__NULL__Group__0__Impl rule__NULL__Group__1 ;
    public final void rule__NULL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: ( rule__NULL__Group__0__Impl rule__NULL__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:2: rule__NULL__Group__0__Impl rule__NULL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__06847);
            rule__NULL__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__06850);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: rule__NULL__Group__0__Impl : ( () ) ;
    public final void rule__NULL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: ()
            {
             before(grammarAccess.getNULLAccess().getNULLAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: rule__NULL__Group__1 : rule__NULL__Group__1__Impl ;
    public final void rule__NULL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: ( rule__NULL__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:2: rule__NULL__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__16908);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: rule__NULL__Group__1__Impl : ( 'NULL' ) ;
    public final void rule__NULL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: ( ( 'NULL' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ( 'NULL' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ( 'NULL' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: 'NULL'
            {
             before(grammarAccess.getNULLAccess().getNULLKeyword_1()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__NULL__Group__1__Impl6936); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06971);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06974);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3474:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3476:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3478:2: '-'
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_rule__EInt__Group__0__Impl7003); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17036);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( RULE_INT )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7063); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: rule__Model__RootFeatureAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17101);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: rule__Model__RootFeatureAssignment_3_2_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17132);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:1: rule__SolitaryFeature__RequiredAssignment_1 : ( ruleSolitaryType ) ;
    public final void rule__SolitaryFeature__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( ( ruleSolitaryType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ( ruleSolitaryType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:1: ( ruleSolitaryType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ruleSolitaryType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17163);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: rule__SolitaryFeature__TypeAssignment_2 : ( ruleSimpleType ) ;
    public final void rule__SolitaryFeature__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ruleSimpleType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_27194);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: rule__SolitaryFeature__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SolitaryFeature__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ruleEString
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_37225);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: rule__SolitaryFeature__FeaturesAssignment_4_1_0 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3603:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_07256);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: rule__SolitaryFeature__FeaturesAssignment_4_1_1 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_17287);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: rule__SolitaryFeature__GroupsAssignment_4_2_0 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_07318);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:1: rule__SolitaryFeature__GroupsAssignment_4_2_1 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_17349);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: rule__SolitaryFeature__ConstraintsAssignment_4_3_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_17380);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_4_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_17411);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3687:1: rule__Group__InclusiveAssignment_1 : ( ( 'any' ) ) ;
    public final void rule__Group__InclusiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: ( ( ( 'any' ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( ( 'any' ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( ( 'any' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( 'any' )
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( 'any' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: 'any'
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Group__InclusiveAssignment_17447); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: rule__Group__GroupedFeaturesAssignment_3 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3714:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3715:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_37486);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:1: rule__Group__GroupedFeaturesAssignment_4_1 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_4_17517);
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


    // $ANTLR start "rule__GroupedFeature__TypeAssignment_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: rule__GroupedFeature__TypeAssignment_1 : ( ruleSimpleType ) ;
    public final void rule__GroupedFeature__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3744:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: ruleSimpleType
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_17548);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__TypeAssignment_1"


    // $ANTLR start "rule__GroupedFeature__NameAssignment_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: rule__GroupedFeature__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__GroupedFeature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3760:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3760:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:1: ruleEString
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_27579);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__NameAssignment_2"


    // $ANTLR start "rule__GroupedFeature__GroupsAssignment_3_1_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: rule__GroupedFeature__GroupsAssignment_3_1_0 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3775:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3776:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_3_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_3_1_07610);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__GroupsAssignment_3_1_0"


    // $ANTLR start "rule__GroupedFeature__GroupsAssignment_3_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: rule__GroupedFeature__GroupsAssignment_3_1_1 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_3_1_17641);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__GroupsAssignment_3_1_1"


    // $ANTLR start "rule__GroupedFeature__FeaturesAssignment_3_2_0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: rule__GroupedFeature__FeaturesAssignment_3_2_0 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3805:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_3_2_07672);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__FeaturesAssignment_3_2_0"


    // $ANTLR start "rule__GroupedFeature__FeaturesAssignment_3_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: rule__GroupedFeature__FeaturesAssignment_3_2_1 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_3_2_17703);
            ruleSolitaryFeature();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__FeaturesAssignment_3_2_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_3_3_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: rule__GroupedFeature__ConstraintsAssignment_3_3_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3836:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_3_3_17734);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_3_3_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_3_3_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: rule__GroupedFeature__ConstraintsAssignment_3_3_2_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_3_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_3_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_3_3_2_17765);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_3_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_3_3_2_1"


    // $ANTLR start "rule__Expression__OperatorAssignment_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: rule__Expression__OperatorAssignment_1_1 : ( ruleLogicalOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: ( ( ruleLogicalOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: ( ruleLogicalOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3865:1: ( ruleLogicalOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ruleLogicalOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_17796);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:1: rule__Expression__RexpAssignment_1_2 : ( ruleLogical2Operation ) ;
    public final void rule__Expression__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_27827);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: rule__Logical2Operation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__Logical2Operation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( ( ruleCompareOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( ruleCompareOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: ( ruleCompareOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3896:1: ruleCompareOperator
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_17858);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: rule__Logical2Operation__RexpAssignment_1_2 : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_27889);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: rule__BinaryOperation__OperatorAssignment_1_1 : ( ruleArithmicOperator ) ;
    public final void rule__BinaryOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: ( ( ruleArithmicOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: ( ruleArithmicOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3925:1: ( ruleArithmicOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3926:1: ruleArithmicOperator
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_17920);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: rule__BinaryOperation__RexpAssignment_1_2 : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_27951);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( ( ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( ruleUnaryOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_07982);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: rule__UnaryOperation__ExpAssignment_1 : ( ruleAtomicExp ) ;
    public final void rule__UnaryOperation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ruleAtomicExp
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_18013);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:1: rule__Identifier__RefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( RULE_ID )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_08048); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3999:1: rule__Identifier__RefAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Identifier__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( RULE_ID )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( RULE_ID )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_1_18087); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: rule__Number__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ruleEInt )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8122);
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
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ArithmicOperator__Alternatives_in_ruleArithmicOperator1103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperator__Alternatives_in_ruleUnaryOperator1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleType__Alternatives_in_ruleSimpleType1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryType__Alternatives_in_ruleSolitaryType1211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__Feature__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Feature__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__AtomicExp__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LogicalOperator__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LogicalOperator__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CompareOperator__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompareOperator__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CompareOperator__Alternatives1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ArithmicOperator__Alternatives1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ArithmicOperator__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ArithmicOperator__Alternatives1695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ArithmicOperator__Alternatives1716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__UnaryOperator__Alternatives1752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__UnaryOperator__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleType__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SimpleType__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SimpleType__Alternatives1851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SimpleType__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__SolitaryType__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SolitaryType__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01962 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12023 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Model__Group__1__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22085 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group__2__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32147 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Model__Group__4__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02277 = new BitSet(new long[]{0x000000040F000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Model__Group_3__0__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12339 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2426 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02463 = new BitSet(new long[]{0x000000040F000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Model__Group_3_2__0__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02586 = new BitSet(new long[]{0x000000043F000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SolitaryFeature__Group__0__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12648 = new BitSet(new long[]{0x000000043F000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22709 = new BitSet(new long[]{0x000000043F000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__TypeAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32770 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__4_in_rule__SolitaryFeature__Group__32773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__NameAssignment_3_in_rule__SolitaryFeature__Group__3__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__4__Impl_in_rule__SolitaryFeature__Group__42830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__0_in_rule__SolitaryFeature__Group__4__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__0__Impl_in_rule__SolitaryFeature__Group_4__02898 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__1_in_rule__SolitaryFeature__Group_4__02901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SolitaryFeature__Group_4__0__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__1__Impl_in_rule__SolitaryFeature__Group_4__12960 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__2_in_rule__SolitaryFeature__Group_4__12963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__0_in_rule__SolitaryFeature__Group_4__1__Impl2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__2__Impl_in_rule__SolitaryFeature__Group_4__23021 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__3_in_rule__SolitaryFeature__Group_4__23024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__0_in_rule__SolitaryFeature__Group_4__2__Impl3051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__3__Impl_in_rule__SolitaryFeature__Group_4__33082 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__4_in_rule__SolitaryFeature__Group_4__33085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__0_in_rule__SolitaryFeature__Group_4__3__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4__4__Impl_in_rule__SolitaryFeature__Group_4__43143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SolitaryFeature__Group_4__4__Impl3171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__0__Impl_in_rule__SolitaryFeature__Group_4_1__03212 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__1_in_rule__SolitaryFeature__Group_4_1__03215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_0_in_rule__SolitaryFeature__Group_4_1__0__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_1__1__Impl_in_rule__SolitaryFeature__Group_4_1__13272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_4_1_1_in_rule__SolitaryFeature__Group_4_1__1__Impl3299 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__0__Impl_in_rule__SolitaryFeature__Group_4_2__03334 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__1_in_rule__SolitaryFeature__Group_4_2__03337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_0_in_rule__SolitaryFeature__Group_4_2__0__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_2__1__Impl_in_rule__SolitaryFeature__Group_4_2__13394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_4_2_1_in_rule__SolitaryFeature__Group_4_2__1__Impl3421 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__0__Impl_in_rule__SolitaryFeature__Group_4_3__03456 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__1_in_rule__SolitaryFeature__Group_4_3__03459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__SolitaryFeature__Group_4_3__0__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__1__Impl_in_rule__SolitaryFeature__Group_4_3__13518 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__2_in_rule__SolitaryFeature__Group_4_3__13521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_1_in_rule__SolitaryFeature__Group_4_3__1__Impl3548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3__2__Impl_in_rule__SolitaryFeature__Group_4_3__23578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__0_in_rule__SolitaryFeature__Group_4_3__2__Impl3605 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__0__Impl_in_rule__SolitaryFeature__Group_4_3_2__03642 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__1_in_rule__SolitaryFeature__Group_4_3_2__03645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__SolitaryFeature__Group_4_3_2__0__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_4_3_2__1__Impl_in_rule__SolitaryFeature__Group_4_3_2__13704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_1_in_rule__SolitaryFeature__Group_4_3_2__1__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__03765 = new BitSet(new long[]{0x0000082000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__03768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Group__Group__0__Impl3796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__13827 = new BitSet(new long[]{0x0000082000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__13830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__23888 = new BitSet(new long[]{0x000000040F000030L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__23891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Group__Group__2__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__33950 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__33953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44010 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__44013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl4040 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__54071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Group__Group__5__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__04142 = new BitSet(new long[]{0x000000040F000030L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__04145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Group__Group_4__0__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__14204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04265 = new BitSet(new long[]{0x000000040F000030L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14326 = new BitSet(new long[]{0x000000040F000030L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__TypeAssignment_1_in_rule__GroupedFeature__Group__1__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24387 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__3_in_rule__GroupedFeature__Group__24390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__NameAssignment_2_in_rule__GroupedFeature__Group__2__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__3__Impl_in_rule__GroupedFeature__Group__34447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__0_in_rule__GroupedFeature__Group__3__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__0__Impl_in_rule__GroupedFeature__Group_3__04513 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__1_in_rule__GroupedFeature__Group_3__04516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__GroupedFeature__Group_3__0__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__1__Impl_in_rule__GroupedFeature__Group_3__14575 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__2_in_rule__GroupedFeature__Group_3__14578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_1__0_in_rule__GroupedFeature__Group_3__1__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__2__Impl_in_rule__GroupedFeature__Group_3__24636 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__3_in_rule__GroupedFeature__Group_3__24639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_2__0_in_rule__GroupedFeature__Group_3__2__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__3__Impl_in_rule__GroupedFeature__Group_3__34697 = new BitSet(new long[]{0x0000001D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__4_in_rule__GroupedFeature__Group_3__34700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3__0_in_rule__GroupedFeature__Group_3__3__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3__4__Impl_in_rule__GroupedFeature__Group_3__44758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__GroupedFeature__Group_3__4__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_1__0__Impl_in_rule__GroupedFeature__Group_3_1__04827 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_1__1_in_rule__GroupedFeature__Group_3_1__04830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_3_1_0_in_rule__GroupedFeature__Group_3_1__0__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_1__1__Impl_in_rule__GroupedFeature__Group_3_1__14887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_3_1_1_in_rule__GroupedFeature__Group_3_1__1__Impl4914 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_2__0__Impl_in_rule__GroupedFeature__Group_3_2__04949 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_2__1_in_rule__GroupedFeature__Group_3_2__04952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_3_2_0_in_rule__GroupedFeature__Group_3_2__0__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_2__1__Impl_in_rule__GroupedFeature__Group_3_2__15009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_3_2_1_in_rule__GroupedFeature__Group_3_2__1__Impl5036 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3__0__Impl_in_rule__GroupedFeature__Group_3_3__05071 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3__1_in_rule__GroupedFeature__Group_3_3__05074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GroupedFeature__Group_3_3__0__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3__1__Impl_in_rule__GroupedFeature__Group_3_3__15133 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3__2_in_rule__GroupedFeature__Group_3_3__15136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_3_3_1_in_rule__GroupedFeature__Group_3_3__1__Impl5163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3__2__Impl_in_rule__GroupedFeature__Group_3_3__25193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3_2__0_in_rule__GroupedFeature__Group_3_3__2__Impl5220 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3_2__0__Impl_in_rule__GroupedFeature__Group_3_3_2__05257 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3_2__1_in_rule__GroupedFeature__Group_3_3_2__05260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GroupedFeature__Group_3_3_2__0__Impl5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_3_3_2__1__Impl_in_rule__GroupedFeature__Group_3_3_2__15319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_3_3_2_1_in_rule__GroupedFeature__Group_3_3_2__1__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05380 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__15439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl5466 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__05501 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__05504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__15562 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__15565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__25622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__05685 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__05688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__15744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl5771 = new BitSet(new long[]{0x0000000000038002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__05806 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__05809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__15867 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__15870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__25927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl5954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__05990 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__05993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl6076 = new BitSet(new long[]{0x00000000003C0002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__06111 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__06114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__16172 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__16175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl6202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__26232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06295 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl6325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__16355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__06416 = new BitSet(new long[]{0x0000062000C01860L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__06419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__AtomicExp__Group_3__0__Impl6447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__16478 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__16481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__26537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__AtomicExp__Group_3__2__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__06602 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__06605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_0_in_rule__Identifier__Group__0__Impl6632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__16662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl6689 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__06724 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__06727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Identifier__Group_1__0__Impl6755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__16786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_1_1_in_rule__Identifier__Group_1__1__Impl6813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__06847 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__06850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__16908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__NULL__Group__1__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__06971 = new BitSet(new long[]{0x0000040000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__06974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__EInt__Group__0__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_27194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_37225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_07256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_4_1_17287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_07318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_4_2_17349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_17380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_4_3_2_17411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Group__InclusiveAssignment_17447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_37486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_4_17517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_17548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_27579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_3_1_07610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_3_1_17641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_3_2_07672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_3_2_17703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_3_3_17734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_3_3_2_17765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_17796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_27827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_17858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_27889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_17920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_27951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_07982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_18013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_08048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__RefAssignment_1_18087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8122 = new BitSet(new long[]{0x0000000000000002L});
    }


}