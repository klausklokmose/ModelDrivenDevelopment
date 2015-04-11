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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'And'", "'Or'", "'Equals'", "'Higher'", "'Lower'", "'Add'", "'Subtract'", "'Divide'", "'Multiply'", "'Not'", "'Minus'", "'boolean'", "'int'", "'double'", "'String'", "'Optional'", "'Mandatory'", "'Model'", "'{'", "'}'", "'Root'", "'feature'", "'type'", "'#'", "'='", "'select'", "'('", "')'", "','", "'.'", "'NULL'", "'-'", "'any'"
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


    // $ANTLR start "rule__SolitaryFeature__Alternatives_3"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: rule__SolitaryFeature__Alternatives_3 : ( ( ( rule__SolitaryFeature__Group_3_0__0 ) ) | ( ( rule__SolitaryFeature__Group_3_1__0 ) ) );
    public final void rule__SolitaryFeature__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( ( ( rule__SolitaryFeature__Group_3_0__0 ) ) | ( ( rule__SolitaryFeature__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ( rule__SolitaryFeature__Group_3_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ( rule__SolitaryFeature__Group_3_0__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ( rule__SolitaryFeature__Group_3_0__0 )
                    {
                     before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( rule__SolitaryFeature__Group_3_0__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:651:2: rule__SolitaryFeature__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__0_in_rule__SolitaryFeature__Alternatives_31295);
                    rule__SolitaryFeature__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:6: ( ( rule__SolitaryFeature__Group_3_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:6: ( ( rule__SolitaryFeature__Group_3_1__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( rule__SolitaryFeature__Group_3_1__0 )
                    {
                     before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( rule__SolitaryFeature__Group_3_1__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:657:2: rule__SolitaryFeature__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__0_in_rule__SolitaryFeature__Alternatives_31313);
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


    // $ANTLR start "rule__GroupedFeature__Alternatives_2"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: rule__GroupedFeature__Alternatives_2 : ( ( ( rule__GroupedFeature__Group_2_0__0 ) ) | ( ( rule__GroupedFeature__Group_2_1__0 ) ) );
    public final void rule__GroupedFeature__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( ( ( rule__GroupedFeature__Group_2_0__0 ) ) | ( ( rule__GroupedFeature__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( ( rule__GroupedFeature__Group_2_0__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( ( rule__GroupedFeature__Group_2_0__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ( rule__GroupedFeature__Group_2_0__0 )
                    {
                     before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( rule__GroupedFeature__Group_2_0__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:673:2: rule__GroupedFeature__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__0_in_rule__GroupedFeature__Alternatives_21346);
                    rule__GroupedFeature__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:677:6: ( ( rule__GroupedFeature__Group_2_1__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:677:6: ( ( rule__GroupedFeature__Group_2_1__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ( rule__GroupedFeature__Group_2_1__0 )
                    {
                     before(grammarAccess.getGroupedFeatureAccess().getGroup_2_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:1: ( rule__GroupedFeature__Group_2_1__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:2: rule__GroupedFeature__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__0_in_rule__GroupedFeature__Alternatives_21364);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: rule__AtomicExp__Alternatives : ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) | ( ruleEBoolean ) );
    public final void rule__AtomicExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ( ruleNULL ) | ( ruleNumber ) | ( ruleIdentifier ) | ( ( rule__AtomicExp__Group_3__0 ) ) | ( ruleUnaryOperation ) | ( ruleEBoolean ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
            case 44:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            case 22:
            case 23:
                {
                alt4=5;
                }
                break;
            case 11:
            case 12:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( ruleNULL )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( ruleNULL )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ruleNULL
                    {
                     before(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1397);
                    ruleNULL();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNULLParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:699:6: ( ruleNumber )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:699:6: ( ruleNumber )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ruleNumber
                    {
                     before(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1414);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getNumberParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:705:6: ( ruleIdentifier )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:705:6: ( ruleIdentifier )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ruleIdentifier
                    {
                     before(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1431);
                    ruleIdentifier();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getIdentifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:711:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:711:6: ( ( rule__AtomicExp__Group_3__0 ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( rule__AtomicExp__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicExpAccess().getGroup_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( rule__AtomicExp__Group_3__0 )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:2: rule__AtomicExp__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1448);
                    rule__AtomicExp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:717:6: ( ruleUnaryOperation )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:717:6: ( ruleUnaryOperation )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ruleUnaryOperation
                    {
                     before(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1466);
                    ruleUnaryOperation();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpAccess().getUnaryOperationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( ruleEBoolean )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( ruleEBoolean )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: ruleEBoolean
                    {
                     before(grammarAccess.getAtomicExpAccess().getEBooleanParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__AtomicExp__Alternatives1483);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'true' )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'true' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives1516); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( 'false' )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( 'false' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives1536); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( RULE_STRING )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1570); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:6: ( RULE_ID )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1587); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: rule__LogicalOperator__Alternatives : ( ( ( 'And' ) ) | ( ( 'Or' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( ( ( 'And' ) ) | ( ( 'Or' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( ( 'And' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( ( 'And' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( 'And' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( 'And' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:789:3: 'And'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__LogicalOperator__Alternatives1620); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:794:6: ( ( 'Or' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:794:6: ( ( 'Or' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:795:1: ( 'Or' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( 'Or' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:796:3: 'Or'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__LogicalOperator__Alternatives1641); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: rule__CompareOperator__Alternatives : ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( ( ( 'Equals' ) ) | ( ( 'Higher' ) ) | ( ( 'Lower' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( ( 'Equals' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( ( 'Equals' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( 'Equals' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( 'Equals' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:3: 'Equals'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__CompareOperator__Alternatives1677); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:818:6: ( ( 'Higher' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:818:6: ( ( 'Higher' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:819:1: ( 'Higher' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( 'Higher' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:820:3: 'Higher'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__CompareOperator__Alternatives1698); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getHigherEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:825:6: ( ( 'Lower' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:825:6: ( ( 'Lower' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: ( 'Lower' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLowerEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:827:1: ( 'Lower' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:827:3: 'Lower'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__CompareOperator__Alternatives1719); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: rule__ArithmicOperator__Alternatives : ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) );
    public final void rule__ArithmicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: ( ( ( 'Add' ) ) | ( ( 'Subtract' ) ) | ( ( 'Divide' ) ) | ( ( 'Multiply' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
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
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( ( 'Add' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:842:1: ( ( 'Add' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: ( 'Add' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( 'Add' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:844:3: 'Add'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__ArithmicOperator__Alternatives1755); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:849:6: ( ( 'Subtract' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:849:6: ( ( 'Subtract' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( 'Subtract' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( 'Subtract' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:851:3: 'Subtract'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__ArithmicOperator__Alternatives1776); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:6: ( ( 'Divide' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:6: ( ( 'Divide' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( 'Divide' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( 'Divide' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:3: 'Divide'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__ArithmicOperator__Alternatives1797); 

                    }

                     after(grammarAccess.getArithmicOperatorAccess().getDivideEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:863:6: ( ( 'Multiply' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:863:6: ( ( 'Multiply' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( 'Multiply' )
                    {
                     before(grammarAccess.getArithmicOperatorAccess().getMultiplyEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( 'Multiply' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:865:3: 'Multiply'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__ArithmicOperator__Alternatives1818); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: rule__UnaryOperator__Alternatives : ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) );
    public final void rule__UnaryOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( ( ( 'Not' ) ) | ( ( 'Minus' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( 'Not' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( 'Not' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( 'Not' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( 'Not' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:882:3: 'Not'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__UnaryOperator__Alternatives1854); 

                    }

                     after(grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:6: ( ( 'Minus' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:6: ( ( 'Minus' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: ( 'Minus' )
                    {
                     before(grammarAccess.getUnaryOperatorAccess().getMinusEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( 'Minus' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:889:3: 'Minus'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__UnaryOperator__Alternatives1875); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: rule__SimpleType__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:903:1: ( ( ( 'boolean' ) ) | ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'String' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( ( 'boolean' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( ( 'boolean' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( 'boolean' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: ( 'boolean' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:906:3: 'boolean'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleType__Alternatives1911); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getBooleanEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:911:6: ( ( 'int' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:911:6: ( ( 'int' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( 'int' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( 'int' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:3: 'int'
                    {
                    match(input,25,FollowSets000.FOLLOW_25_in_rule__SimpleType__Alternatives1932); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:918:6: ( ( 'double' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:918:6: ( ( 'double' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:1: ( 'double' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( 'double' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:920:3: 'double'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__SimpleType__Alternatives1953); 

                    }

                     after(grammarAccess.getSimpleTypeAccess().getDoubleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:6: ( ( 'String' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:6: ( ( 'String' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ( 'String' )
                    {
                     before(grammarAccess.getSimpleTypeAccess().getStringEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( 'String' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:927:3: 'String'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__SimpleType__Alternatives1974); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: rule__SolitaryType__Alternatives : ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) );
    public final void rule__SolitaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( 'Optional' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( ( 'Optional' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( 'Optional' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( 'Optional' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:944:3: 'Optional'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_rule__SolitaryType__Alternatives2010); 

                    }

                     after(grammarAccess.getSolitaryTypeAccess().getOptionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:949:6: ( ( 'Mandatory' ) )
                    {
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:949:6: ( ( 'Mandatory' ) )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( 'Mandatory' )
                    {
                     before(grammarAccess.getSolitaryTypeAccess().getMandatoryEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( 'Mandatory' )
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:3: 'Mandatory'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_rule__SolitaryType__Alternatives2031); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:967:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:968:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02064);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02067);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:998:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:999:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12125);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12128);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( ( 'Model' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( 'Model' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( 'Model' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Model__Group__1__Impl2156); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1025:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22187);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22190);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Model__Group__2__Impl2218); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32249);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32252);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( rule__Model__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl2279);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42310);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Model__Group__4__Impl2338); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02379);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02382);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: rule__Model__Group_3__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Model__Group_3__0__Impl2410); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12441);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12444);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( ( ( rule__Model__RootFeatureAssignment_3_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: ( ( rule__Model__RootFeatureAssignment_3_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1174:1: ( rule__Model__RootFeatureAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( rule__Model__RootFeatureAssignment_3_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:2: rule__Model__RootFeatureAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2471);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( rule__Model__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:2: rule__Model__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22501);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__Group_3_2__0 )* ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( ( rule__Model__Group_3_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__Model__Group_3_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( ( rule__Model__Group_3_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__Model__Group_3_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:1: ( rule__Model__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1203:2: rule__Model__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2528);
            	    rule__Model__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: rule__Model__Group_3_2__0 : rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 ;
    public final void rule__Model__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ( rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1224:2: rule__Model__Group_3_2__0__Impl rule__Model__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02565);
            rule__Model__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02568);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: rule__Model__Group_3_2__0__Impl : ( 'Root' ) ;
    public final void rule__Model__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1235:1: ( ( 'Root' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( 'Root' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( 'Root' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: 'Root'
            {
             before(grammarAccess.getModelAccess().getRootKeyword_3_2_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Model__Group_3_2__0__Impl2596); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: rule__Model__Group_3_2__1 : rule__Model__Group_3_2__1__Impl ;
    public final void rule__Model__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: ( rule__Model__Group_3_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:2: rule__Model__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12627);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: rule__Model__Group_3_2__1__Impl : ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) ;
    public final void rule__Model__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: ( ( ( rule__Model__RootFeatureAssignment_3_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( ( rule__Model__RootFeatureAssignment_3_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getModelAccess().getRootFeatureAssignment_3_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ( rule__Model__RootFeatureAssignment_3_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:2: rule__Model__RootFeatureAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2654);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: rule__SolitaryFeature__Group__0 : rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 ;
    public final void rule__SolitaryFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:2: rule__SolitaryFeature__Group__0__Impl rule__SolitaryFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02688);
            rule__SolitaryFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02691);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: rule__SolitaryFeature__Group__0__Impl : ( 'feature' ) ;
    public final void rule__SolitaryFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( ( 'feature' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( 'feature' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:1: ( 'feature' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: 'feature'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeatureKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SolitaryFeature__Group__0__Impl2719); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: rule__SolitaryFeature__Group__1 : rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 ;
    public final void rule__SolitaryFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:2: rule__SolitaryFeature__Group__1__Impl rule__SolitaryFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12750);
            rule__SolitaryFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12753);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__SolitaryFeature__Group__1__Impl : ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) ;
    public final void rule__SolitaryFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ( ( rule__SolitaryFeature__RequiredAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( rule__SolitaryFeature__RequiredAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( rule__SolitaryFeature__RequiredAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=28 && LA15_0<=29)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:2: rule__SolitaryFeature__RequiredAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2780);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: rule__SolitaryFeature__Group__2 : rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 ;
    public final void rule__SolitaryFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1346:1: ( rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:2: rule__SolitaryFeature__Group__2__Impl rule__SolitaryFeature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22811);
            rule__SolitaryFeature__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22814);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: rule__SolitaryFeature__Group__2__Impl : ( ( rule__SolitaryFeature__NameAssignment_2 ) ) ;
    public final void rule__SolitaryFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( ( ( rule__SolitaryFeature__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( ( rule__SolitaryFeature__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:1: ( ( rule__SolitaryFeature__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: ( rule__SolitaryFeature__NameAssignment_2 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( rule__SolitaryFeature__NameAssignment_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:2: rule__SolitaryFeature__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__NameAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2841);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__SolitaryFeature__Group__3 : rule__SolitaryFeature__Group__3__Impl ;
    public final void rule__SolitaryFeature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( rule__SolitaryFeature__Group__3__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:2: rule__SolitaryFeature__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32871);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: rule__SolitaryFeature__Group__3__Impl : ( ( rule__SolitaryFeature__Alternatives_3 )? ) ;
    public final void rule__SolitaryFeature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: ( ( ( rule__SolitaryFeature__Alternatives_3 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( ( rule__SolitaryFeature__Alternatives_3 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( ( rule__SolitaryFeature__Alternatives_3 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ( rule__SolitaryFeature__Alternatives_3 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getAlternatives_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( rule__SolitaryFeature__Alternatives_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31||LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:2: rule__SolitaryFeature__Alternatives_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Alternatives_3_in_rule__SolitaryFeature__Group__3__Impl2898);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__SolitaryFeature__Group_3_0__0 : rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1 ;
    public final void rule__SolitaryFeature__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:2: rule__SolitaryFeature__Group_3_0__0__Impl rule__SolitaryFeature__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__0__Impl_in_rule__SolitaryFeature__Group_3_0__02937);
            rule__SolitaryFeature__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__1_in_rule__SolitaryFeature__Group_3_0__02940);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:1: rule__SolitaryFeature__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__SolitaryFeature__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1423:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: '{'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__SolitaryFeature__Group_3_0__0__Impl2968); 
             after(grammarAccess.getSolitaryFeatureAccess().getLeftCurlyBracketKeyword_3_0_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1438:1: rule__SolitaryFeature__Group_3_0__1 : rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2 ;
    public final void rule__SolitaryFeature__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:2: rule__SolitaryFeature__Group_3_0__1__Impl rule__SolitaryFeature__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__1__Impl_in_rule__SolitaryFeature__Group_3_0__12999);
            rule__SolitaryFeature__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__2_in_rule__SolitaryFeature__Group_3_0__13002);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: rule__SolitaryFeature__Group_3_0__1__Impl : ( ( rule__SolitaryFeature__Group_3_0_1__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( ( rule__SolitaryFeature__Group_3_0_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( rule__SolitaryFeature__Group_3_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( rule__SolitaryFeature__Group_3_0_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( rule__SolitaryFeature__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( rule__SolitaryFeature__Group_3_0_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:2: rule__SolitaryFeature__Group_3_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__0_in_rule__SolitaryFeature__Group_3_0__1__Impl3029);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__SolitaryFeature__Group_3_0__2 : rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3 ;
    public final void rule__SolitaryFeature__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:2: rule__SolitaryFeature__Group_3_0__2__Impl rule__SolitaryFeature__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__2__Impl_in_rule__SolitaryFeature__Group_3_0__23060);
            rule__SolitaryFeature__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__3_in_rule__SolitaryFeature__Group_3_0__23063);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: rule__SolitaryFeature__Group_3_0__2__Impl : ( ( rule__SolitaryFeature__Group_3_0_2__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ( ( rule__SolitaryFeature__Group_3_0_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( rule__SolitaryFeature__Group_3_0_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( rule__SolitaryFeature__Group_3_0_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( rule__SolitaryFeature__Group_3_0_2__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( rule__SolitaryFeature__Group_3_0_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:2: rule__SolitaryFeature__Group_3_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__0_in_rule__SolitaryFeature__Group_3_0__2__Impl3090);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: rule__SolitaryFeature__Group_3_0__3 : rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4 ;
    public final void rule__SolitaryFeature__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:2: rule__SolitaryFeature__Group_3_0__3__Impl rule__SolitaryFeature__Group_3_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__3__Impl_in_rule__SolitaryFeature__Group_3_0__33121);
            rule__SolitaryFeature__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__4_in_rule__SolitaryFeature__Group_3_0__33124);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: rule__SolitaryFeature__Group_3_0__3__Impl : ( ( rule__SolitaryFeature__Group_3_0_3__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( ( ( rule__SolitaryFeature__Group_3_0_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( ( rule__SolitaryFeature__Group_3_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( ( rule__SolitaryFeature__Group_3_0_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: ( rule__SolitaryFeature__Group_3_0_3__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: ( rule__SolitaryFeature__Group_3_0_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:2: rule__SolitaryFeature__Group_3_0_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__0_in_rule__SolitaryFeature__Group_3_0__3__Impl3151);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: rule__SolitaryFeature__Group_3_0__4 : rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5 ;
    public final void rule__SolitaryFeature__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1529:1: ( rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1530:2: rule__SolitaryFeature__Group_3_0__4__Impl rule__SolitaryFeature__Group_3_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__4__Impl_in_rule__SolitaryFeature__Group_3_0__43182);
            rule__SolitaryFeature__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__5_in_rule__SolitaryFeature__Group_3_0__43185);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: rule__SolitaryFeature__Group_3_0__4__Impl : ( ( rule__SolitaryFeature__Group_3_0_4__0 )? ) ;
    public final void rule__SolitaryFeature__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( ( ( rule__SolitaryFeature__Group_3_0_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( ( rule__SolitaryFeature__Group_3_0_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( ( rule__SolitaryFeature__Group_3_0_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( rule__SolitaryFeature__Group_3_0_4__0 )?
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( rule__SolitaryFeature__Group_3_0_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:2: rule__SolitaryFeature__Group_3_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__0_in_rule__SolitaryFeature__Group_3_0__4__Impl3212);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: rule__SolitaryFeature__Group_3_0__5 : rule__SolitaryFeature__Group_3_0__5__Impl ;
    public final void rule__SolitaryFeature__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1558:1: ( rule__SolitaryFeature__Group_3_0__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:2: rule__SolitaryFeature__Group_3_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0__5__Impl_in_rule__SolitaryFeature__Group_3_0__53243);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: rule__SolitaryFeature__Group_3_0__5__Impl : ( '}' ) ;
    public final void rule__SolitaryFeature__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: '}'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_3_0_5()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__SolitaryFeature__Group_3_0__5__Impl3271); 
             after(grammarAccess.getSolitaryFeatureAccess().getRightCurlyBracketKeyword_3_0_5()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: rule__SolitaryFeature__Group_3_0_1__0 : rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1 ;
    public final void rule__SolitaryFeature__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: ( rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:2: rule__SolitaryFeature__Group_3_0_1__0__Impl rule__SolitaryFeature__Group_3_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__0__Impl_in_rule__SolitaryFeature__Group_3_0_1__03314);
            rule__SolitaryFeature__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__1_in_rule__SolitaryFeature__Group_3_0_1__03317);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: rule__SolitaryFeature__Group_3_0_1__0__Impl : ( 'type' ) ;
    public final void rule__SolitaryFeature__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( 'type' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: 'type'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeKeyword_3_0_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__SolitaryFeature__Group_3_0_1__0__Impl3345); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1627:1: rule__SolitaryFeature__Group_3_0_1__1 : rule__SolitaryFeature__Group_3_0_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( rule__SolitaryFeature__Group_3_0_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:2: rule__SolitaryFeature__Group_3_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_1__1__Impl_in_rule__SolitaryFeature__Group_3_0_1__13376);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__SolitaryFeature__Group_3_0_1__1__Impl : ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeAssignment_3_0_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( rule__SolitaryFeature__TypeAssignment_3_0_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:2: rule__SolitaryFeature__TypeAssignment_3_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__TypeAssignment_3_0_1_1_in_rule__SolitaryFeature__Group_3_0_1__1__Impl3403);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__SolitaryFeature__Group_3_0_2__0 : rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1 ;
    public final void rule__SolitaryFeature__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:2: rule__SolitaryFeature__Group_3_0_2__0__Impl rule__SolitaryFeature__Group_3_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_2__03437);
            rule__SolitaryFeature__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__1_in_rule__SolitaryFeature__Group_3_0_2__03440);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: rule__SolitaryFeature__Group_3_0_2__0__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:2: rule__SolitaryFeature__FeaturesAssignment_3_0_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_0_in_rule__SolitaryFeature__Group_3_0_2__0__Impl3467);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: rule__SolitaryFeature__Group_3_0_2__1 : rule__SolitaryFeature__Group_3_0_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( rule__SolitaryFeature__Group_3_0_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:2: rule__SolitaryFeature__Group_3_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_2__13497);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: rule__SolitaryFeature__Group_3_0_2__1__Impl : ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesAssignment_3_0_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:2: rule__SolitaryFeature__FeaturesAssignment_3_0_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_1_in_rule__SolitaryFeature__Group_3_0_2__1__Impl3524);
            	    rule__SolitaryFeature__FeaturesAssignment_3_0_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__SolitaryFeature__Group_3_0_3__0 : rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1 ;
    public final void rule__SolitaryFeature__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:2: rule__SolitaryFeature__Group_3_0_3__0__Impl rule__SolitaryFeature__Group_3_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_3__03559);
            rule__SolitaryFeature__Group_3_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__1_in_rule__SolitaryFeature__Group_3_0_3__03562);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: rule__SolitaryFeature__Group_3_0_3__0__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_3_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:2: rule__SolitaryFeature__GroupsAssignment_3_0_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_0_in_rule__SolitaryFeature__Group_3_0_3__0__Impl3589);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__SolitaryFeature__Group_3_0_3__1 : rule__SolitaryFeature__Group_3_0_3__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( rule__SolitaryFeature__Group_3_0_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:2: rule__SolitaryFeature__Group_3_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_3__13619);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: rule__SolitaryFeature__Group_3_0_3__1__Impl : ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: ( ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsAssignment_3_0_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( rule__SolitaryFeature__GroupsAssignment_3_0_3_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:2: rule__SolitaryFeature__GroupsAssignment_3_0_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_1_in_rule__SolitaryFeature__Group_3_0_3__1__Impl3646);
            	    rule__SolitaryFeature__GroupsAssignment_3_0_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: rule__SolitaryFeature__Group_3_0_4__0 : rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1 ;
    public final void rule__SolitaryFeature__Group_3_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:2: rule__SolitaryFeature__Group_3_0_4__0__Impl rule__SolitaryFeature__Group_3_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__0__Impl_in_rule__SolitaryFeature__Group_3_0_4__03681);
            rule__SolitaryFeature__Group_3_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__1_in_rule__SolitaryFeature__Group_3_0_4__03684);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__SolitaryFeature__Group_3_0_4__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__0__Impl3712); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__SolitaryFeature__Group_3_0_4__1 : rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2 ;
    public final void rule__SolitaryFeature__Group_3_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:2: rule__SolitaryFeature__Group_3_0_4__1__Impl rule__SolitaryFeature__Group_3_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__1__Impl_in_rule__SolitaryFeature__Group_3_0_4__13743);
            rule__SolitaryFeature__Group_3_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__2_in_rule__SolitaryFeature__Group_3_0_4__13746);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__SolitaryFeature__Group_3_0_4__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:2: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1_in_rule__SolitaryFeature__Group_3_0_4__1__Impl3773);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: rule__SolitaryFeature__Group_3_0_4__2 : rule__SolitaryFeature__Group_3_0_4__2__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( rule__SolitaryFeature__Group_3_0_4__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:2: rule__SolitaryFeature__Group_3_0_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4__2__Impl_in_rule__SolitaryFeature__Group_3_0_4__23803);
            rule__SolitaryFeature__Group_3_0_4__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: rule__SolitaryFeature__Group_3_0_4__2__Impl : ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* ) ;
    public final void rule__SolitaryFeature__Group_3_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ( rule__SolitaryFeature__Group_3_0_4_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( rule__SolitaryFeature__Group_3_0_4_2__0 )*
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroup_3_0_4_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( rule__SolitaryFeature__Group_3_0_4_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:2: rule__SolitaryFeature__Group_3_0_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0_in_rule__SolitaryFeature__Group_3_0_4__2__Impl3830);
            	    rule__SolitaryFeature__Group_3_0_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "rule__SolitaryFeature__Group_3_0_4_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__SolitaryFeature__Group_3_0_4_2__0 : rule__SolitaryFeature__Group_3_0_4_2__0__Impl rule__SolitaryFeature__Group_3_0_4_2__1 ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__SolitaryFeature__Group_3_0_4_2__0__Impl rule__SolitaryFeature__Group_3_0_4_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:2: rule__SolitaryFeature__Group_3_0_4_2__0__Impl rule__SolitaryFeature__Group_3_0_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__03867);
            rule__SolitaryFeature__Group_3_0_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1_in_rule__SolitaryFeature__Group_3_0_4_2__03870);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: rule__SolitaryFeature__Group_3_0_4_2__0__Impl : ( '#' ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: '#'
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4_2__0__Impl3898); 
             after(grammarAccess.getSolitaryFeatureAccess().getNumberSignKeyword_3_0_4_2_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__SolitaryFeature__Group_3_0_4_2__1 : rule__SolitaryFeature__Group_3_0_4_2__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__SolitaryFeature__Group_3_0_4_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__SolitaryFeature__Group_3_0_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__13929);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__SolitaryFeature__Group_3_0_4_2__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_0_4_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:2: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1_in_rule__SolitaryFeature__Group_3_0_4_2__1__Impl3956);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: rule__SolitaryFeature__Group_3_1__0 : rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1 ;
    public final void rule__SolitaryFeature__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:2: rule__SolitaryFeature__Group_3_1__0__Impl rule__SolitaryFeature__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__0__Impl_in_rule__SolitaryFeature__Group_3_1__03990);
            rule__SolitaryFeature__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__1_in_rule__SolitaryFeature__Group_3_1__03993);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__SolitaryFeature__Group_3_1__0__Impl : ( '=' ) ;
    public final void rule__SolitaryFeature__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( '=' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( '=' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: '='
            {
             before(grammarAccess.getSolitaryFeatureAccess().getEqualsSignKeyword_3_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__SolitaryFeature__Group_3_1__0__Impl4021); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__SolitaryFeature__Group_3_1__1 : rule__SolitaryFeature__Group_3_1__1__Impl ;
    public final void rule__SolitaryFeature__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( rule__SolitaryFeature__Group_3_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:2: rule__SolitaryFeature__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__Group_3_1__1__Impl_in_rule__SolitaryFeature__Group_3_1__14052);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__SolitaryFeature__Group_3_1__1__Impl : ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) ) ;
    public final void rule__SolitaryFeature__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 )
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsAssignment_3_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( rule__SolitaryFeature__ConstraintsAssignment_3_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:2: rule__SolitaryFeature__ConstraintsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_1_1_in_rule__SolitaryFeature__Group_3_1__1__Impl4079);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__04113);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__04116);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: rule__Group__Group__0__Impl : ( 'select' ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( ( 'select' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( 'select' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( 'select' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: 'select'
            {
             before(grammarAccess.getGroupAccess().getSelectKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Group__Group__0__Impl4144); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__14175);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__14178);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: rule__Group__Group__1__Impl : ( ( rule__Group__InclusiveAssignment_1 )? ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( ( ( rule__Group__InclusiveAssignment_1 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: ( ( rule__Group__InclusiveAssignment_1 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: ( rule__Group__InclusiveAssignment_1 )?
            {
             before(grammarAccess.getGroupAccess().getInclusiveAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:1: ( rule__Group__InclusiveAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2051:2: rule__Group__InclusiveAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl4205);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__24236);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__24239);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: rule__Group__Group__2__Impl : ( '(' ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: '('
            {
             before(grammarAccess.getGroupAccess().getLeftParenthesisKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Group__Group__2__Impl4267); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2092:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__34298);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__34301);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: rule__Group__Group__3__Impl : ( ( rule__Group__GroupedFeaturesAssignment_3 ) ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ( ( rule__Group__GroupedFeaturesAssignment_3 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__Group__GroupedFeaturesAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ( rule__Group__GroupedFeaturesAssignment_3 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( rule__Group__GroupedFeaturesAssignment_3 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( rule__Group__GroupedFeaturesAssignment_3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:2: rule__Group__GroupedFeaturesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl4328);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44358);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5_in_rule__Group__Group__44361);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )* ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: ( ( ( rule__Group__Group_4__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( ( rule__Group__Group_4__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( ( rule__Group__Group_4__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( rule__Group__Group_4__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( rule__Group__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:2: rule__Group__Group_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl4388);
            	    rule__Group__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: rule__Group__Group__5 : rule__Group__Group__5__Impl ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: ( rule__Group__Group__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:2: rule__Group__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__54419);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: rule__Group__Group__5__Impl : ( ')' ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ')'
            {
             before(grammarAccess.getGroupAccess().getRightParenthesisKeyword_5()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Group__Group__5__Impl4447); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__04490);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__04493);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: rule__Group__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( ',' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( ',' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Group__Group_4__0__Impl4521); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: ( rule__Group__Group_4__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__14552);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2239:1: ( ( rule__Group__GroupedFeaturesAssignment_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( rule__Group__GroupedFeaturesAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesAssignment_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( rule__Group__GroupedFeaturesAssignment_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:2: rule__Group__GroupedFeaturesAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__GroupedFeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl4579);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:1: rule__GroupedFeature__Group__0 : rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 ;
    public final void rule__GroupedFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2259:1: ( rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:2: rule__GroupedFeature__Group__0__Impl rule__GroupedFeature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04613);
            rule__GroupedFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04616);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__GroupedFeature__Group__0__Impl : ( () ) ;
    public final void rule__GroupedFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: ()
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupedFeatureAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2274:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2276:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: rule__GroupedFeature__Group__1 : rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 ;
    public final void rule__GroupedFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:2: rule__GroupedFeature__Group__1__Impl rule__GroupedFeature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14674);
            rule__GroupedFeature__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14677);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: rule__GroupedFeature__Group__1__Impl : ( ( rule__GroupedFeature__NameAssignment_1 ) ) ;
    public final void rule__GroupedFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2302:1: ( ( ( rule__GroupedFeature__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2303:1: ( ( rule__GroupedFeature__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: ( rule__GroupedFeature__NameAssignment_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:1: ( rule__GroupedFeature__NameAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2305:2: rule__GroupedFeature__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4704);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: rule__GroupedFeature__Group__2 : rule__GroupedFeature__Group__2__Impl ;
    public final void rule__GroupedFeature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: ( rule__GroupedFeature__Group__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:2: rule__GroupedFeature__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24734);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: rule__GroupedFeature__Group__2__Impl : ( ( rule__GroupedFeature__Alternatives_2 )? ) ;
    public final void rule__GroupedFeature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ( ( rule__GroupedFeature__Alternatives_2 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( ( rule__GroupedFeature__Alternatives_2 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( ( rule__GroupedFeature__Alternatives_2 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: ( rule__GroupedFeature__Alternatives_2 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getAlternatives_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: ( rule__GroupedFeature__Alternatives_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31||LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:2: rule__GroupedFeature__Alternatives_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Alternatives_2_in_rule__GroupedFeature__Group__2__Impl4761);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: rule__GroupedFeature__Group_2_0__0 : rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1 ;
    public final void rule__GroupedFeature__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2353:1: ( rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2354:2: rule__GroupedFeature__Group_2_0__0__Impl rule__GroupedFeature__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__0__Impl_in_rule__GroupedFeature__Group_2_0__04798);
            rule__GroupedFeature__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__1_in_rule__GroupedFeature__Group_2_0__04801);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: rule__GroupedFeature__Group_2_0__0__Impl : ( '{' ) ;
    public final void rule__GroupedFeature__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: ( '{' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2366:1: ( '{' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: '{'
            {
             before(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__GroupedFeature__Group_2_0__0__Impl4829); 
             after(grammarAccess.getGroupedFeatureAccess().getLeftCurlyBracketKeyword_2_0_0()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: rule__GroupedFeature__Group_2_0__1 : rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2 ;
    public final void rule__GroupedFeature__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:2: rule__GroupedFeature__Group_2_0__1__Impl rule__GroupedFeature__Group_2_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__1__Impl_in_rule__GroupedFeature__Group_2_0__14860);
            rule__GroupedFeature__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__2_in_rule__GroupedFeature__Group_2_0__14863);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: rule__GroupedFeature__Group_2_0__1__Impl : ( ( rule__GroupedFeature__Group_2_0_1__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( ( ( rule__GroupedFeature__Group_2_0_1__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( ( rule__GroupedFeature__Group_2_0_1__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( ( rule__GroupedFeature__Group_2_0_1__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( rule__GroupedFeature__Group_2_0_1__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: ( rule__GroupedFeature__Group_2_0_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__GroupedFeature__Group_2_0_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__0_in_rule__GroupedFeature__Group_2_0__1__Impl4890);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: rule__GroupedFeature__Group_2_0__2 : rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3 ;
    public final void rule__GroupedFeature__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: ( rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:2: rule__GroupedFeature__Group_2_0__2__Impl rule__GroupedFeature__Group_2_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__2__Impl_in_rule__GroupedFeature__Group_2_0__24921);
            rule__GroupedFeature__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__3_in_rule__GroupedFeature__Group_2_0__24924);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: rule__GroupedFeature__Group_2_0__2__Impl : ( ( rule__GroupedFeature__Group_2_0_2__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( ( ( rule__GroupedFeature__Group_2_0_2__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( ( rule__GroupedFeature__Group_2_0_2__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: ( ( rule__GroupedFeature__Group_2_0_2__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2427:1: ( rule__GroupedFeature__Group_2_0_2__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: ( rule__GroupedFeature__Group_2_0_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:2: rule__GroupedFeature__Group_2_0_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__0_in_rule__GroupedFeature__Group_2_0__2__Impl4951);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: rule__GroupedFeature__Group_2_0__3 : rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4 ;
    public final void rule__GroupedFeature__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2442:1: ( rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:2: rule__GroupedFeature__Group_2_0__3__Impl rule__GroupedFeature__Group_2_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__3__Impl_in_rule__GroupedFeature__Group_2_0__34982);
            rule__GroupedFeature__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__4_in_rule__GroupedFeature__Group_2_0__34985);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: rule__GroupedFeature__Group_2_0__3__Impl : ( ( rule__GroupedFeature__Group_2_0_3__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ( ( ( rule__GroupedFeature__Group_2_0_3__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: ( ( rule__GroupedFeature__Group_2_0_3__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:1: ( ( rule__GroupedFeature__Group_2_0_3__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2456:1: ( rule__GroupedFeature__Group_2_0_3__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_3()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: ( rule__GroupedFeature__Group_2_0_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:2: rule__GroupedFeature__Group_2_0_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__0_in_rule__GroupedFeature__Group_2_0__3__Impl5012);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: rule__GroupedFeature__Group_2_0__4 : rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5 ;
    public final void rule__GroupedFeature__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2471:1: ( rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:2: rule__GroupedFeature__Group_2_0__4__Impl rule__GroupedFeature__Group_2_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__4__Impl_in_rule__GroupedFeature__Group_2_0__45043);
            rule__GroupedFeature__Group_2_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__5_in_rule__GroupedFeature__Group_2_0__45046);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: rule__GroupedFeature__Group_2_0__4__Impl : ( ( rule__GroupedFeature__Group_2_0_4__0 )? ) ;
    public final void rule__GroupedFeature__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( ( ( rule__GroupedFeature__Group_2_0_4__0 )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( rule__GroupedFeature__Group_2_0_4__0 )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2484:1: ( ( rule__GroupedFeature__Group_2_0_4__0 )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:1: ( rule__GroupedFeature__Group_2_0_4__0 )?
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( rule__GroupedFeature__Group_2_0_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:2: rule__GroupedFeature__Group_2_0_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__0_in_rule__GroupedFeature__Group_2_0__4__Impl5073);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: rule__GroupedFeature__Group_2_0__5 : rule__GroupedFeature__Group_2_0__5__Impl ;
    public final void rule__GroupedFeature__Group_2_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: ( rule__GroupedFeature__Group_2_0__5__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:2: rule__GroupedFeature__Group_2_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0__5__Impl_in_rule__GroupedFeature__Group_2_0__55104);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: rule__GroupedFeature__Group_2_0__5__Impl : ( '}' ) ;
    public final void rule__GroupedFeature__Group_2_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( '}' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: ( '}' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: '}'
            {
             before(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_5()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__GroupedFeature__Group_2_0__5__Impl5132); 
             after(grammarAccess.getGroupedFeatureAccess().getRightCurlyBracketKeyword_2_0_5()); 

            }


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: rule__GroupedFeature__Group_2_0_1__0 : rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1 ;
    public final void rule__GroupedFeature__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:2: rule__GroupedFeature__Group_2_0_1__0__Impl rule__GroupedFeature__Group_2_0_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__0__Impl_in_rule__GroupedFeature__Group_2_0_1__05175);
            rule__GroupedFeature__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__1_in_rule__GroupedFeature__Group_2_0_1__05178);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__GroupedFeature__Group_2_0_1__0__Impl : ( 'type' ) ;
    public final void rule__GroupedFeature__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( 'type' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( 'type' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( 'type' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: 'type'
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeKeyword_2_0_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__GroupedFeature__Group_2_0_1__0__Impl5206); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: rule__GroupedFeature__Group_2_0_1__1 : rule__GroupedFeature__Group_2_0_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: ( rule__GroupedFeature__Group_2_0_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:2: rule__GroupedFeature__Group_2_0_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_1__1__Impl_in_rule__GroupedFeature__Group_2_0_1__15237);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: rule__GroupedFeature__Group_2_0_1__1__Impl : ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( ( rule__GroupedFeature__TypeAssignment_2_0_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( rule__GroupedFeature__TypeAssignment_2_0_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeAssignment_2_0_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:1: ( rule__GroupedFeature__TypeAssignment_2_0_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:2: rule__GroupedFeature__TypeAssignment_2_0_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__TypeAssignment_2_0_1_1_in_rule__GroupedFeature__Group_2_0_1__1__Impl5264);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: rule__GroupedFeature__Group_2_0_2__0 : rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1 ;
    public final void rule__GroupedFeature__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2605:1: ( rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:2: rule__GroupedFeature__Group_2_0_2__0__Impl rule__GroupedFeature__Group_2_0_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__0__Impl_in_rule__GroupedFeature__Group_2_0_2__05298);
            rule__GroupedFeature__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__1_in_rule__GroupedFeature__Group_2_0_2__05301);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2613:1: rule__GroupedFeature__Group_2_0_2__0__Impl : ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: ( ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:2: rule__GroupedFeature__GroupsAssignment_2_0_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_0_in_rule__GroupedFeature__Group_2_0_2__0__Impl5328);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: rule__GroupedFeature__Group_2_0_2__1 : rule__GroupedFeature__Group_2_0_2__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( rule__GroupedFeature__Group_2_0_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:2: rule__GroupedFeature__Group_2_0_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_2__1__Impl_in_rule__GroupedFeature__Group_2_0_2__15358);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: rule__GroupedFeature__Group_2_0_2__1__Impl : ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsAssignment_2_0_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( rule__GroupedFeature__GroupsAssignment_2_0_2_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==38) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:2: rule__GroupedFeature__GroupsAssignment_2_0_2_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_1_in_rule__GroupedFeature__Group_2_0_2__1__Impl5385);
            	    rule__GroupedFeature__GroupsAssignment_2_0_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:1: rule__GroupedFeature__Group_2_0_3__0 : rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1 ;
    public final void rule__GroupedFeature__Group_2_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ( rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:2: rule__GroupedFeature__Group_2_0_3__0__Impl rule__GroupedFeature__Group_2_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__0__Impl_in_rule__GroupedFeature__Group_2_0_3__05420);
            rule__GroupedFeature__Group_2_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__1_in_rule__GroupedFeature__Group_2_0_3__05423);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: rule__GroupedFeature__Group_2_0_3__0__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2680:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:2: rule__GroupedFeature__FeaturesAssignment_2_0_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_0_in_rule__GroupedFeature__Group_2_0_3__0__Impl5450);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: rule__GroupedFeature__Group_2_0_3__1 : rule__GroupedFeature__Group_2_0_3__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ( rule__GroupedFeature__Group_2_0_3__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:2: rule__GroupedFeature__Group_2_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_3__1__Impl_in_rule__GroupedFeature__Group_2_0_3__15480);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: rule__GroupedFeature__Group_2_0_3__1__Impl : ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ( ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ( ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesAssignment_2_0_3_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:1: ( rule__GroupedFeature__FeaturesAssignment_2_0_3_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==34) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:2: rule__GroupedFeature__FeaturesAssignment_2_0_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_in_rule__GroupedFeature__Group_2_0_3__1__Impl5507);
            	    rule__GroupedFeature__FeaturesAssignment_2_0_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: rule__GroupedFeature__Group_2_0_4__0 : rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1 ;
    public final void rule__GroupedFeature__Group_2_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: ( rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:2: rule__GroupedFeature__Group_2_0_4__0__Impl rule__GroupedFeature__Group_2_0_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__0__Impl_in_rule__GroupedFeature__Group_2_0_4__05542);
            rule__GroupedFeature__Group_2_0_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__1_in_rule__GroupedFeature__Group_2_0_4__05545);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: rule__GroupedFeature__Group_2_0_4__0__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_2_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2740:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2741:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4__0__Impl5573); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: rule__GroupedFeature__Group_2_0_4__1 : rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2 ;
    public final void rule__GroupedFeature__Group_2_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:2: rule__GroupedFeature__Group_2_0_4__1__Impl rule__GroupedFeature__Group_2_0_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__1__Impl_in_rule__GroupedFeature__Group_2_0_4__15604);
            rule__GroupedFeature__Group_2_0_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__2_in_rule__GroupedFeature__Group_2_0_4__15607);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2766:1: rule__GroupedFeature__Group_2_0_4__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2772:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:2: rule__GroupedFeature__ConstraintsAssignment_2_0_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_1_in_rule__GroupedFeature__Group_2_0_4__1__Impl5634);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2783:1: rule__GroupedFeature__Group_2_0_4__2 : rule__GroupedFeature__Group_2_0_4__2__Impl ;
    public final void rule__GroupedFeature__Group_2_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: ( rule__GroupedFeature__Group_2_0_4__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2788:2: rule__GroupedFeature__Group_2_0_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4__2__Impl_in_rule__GroupedFeature__Group_2_0_4__25664);
            rule__GroupedFeature__Group_2_0_4__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2794:1: rule__GroupedFeature__Group_2_0_4__2__Impl : ( ( rule__GroupedFeature__Group_2_0_4_2__0 )* ) ;
    public final void rule__GroupedFeature__Group_2_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( ( ( rule__GroupedFeature__Group_2_0_4_2__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( rule__GroupedFeature__Group_2_0_4_2__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( ( rule__GroupedFeature__Group_2_0_4_2__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: ( rule__GroupedFeature__Group_2_0_4_2__0 )*
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:1: ( rule__GroupedFeature__Group_2_0_4_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2801:2: rule__GroupedFeature__Group_2_0_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_2__0_in_rule__GroupedFeature__Group_2_0_4__2__Impl5691);
            	    rule__GroupedFeature__Group_2_0_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getGroupedFeatureAccess().getGroup_2_0_4_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_2__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: rule__GroupedFeature__Group_2_0_4_2__0 : rule__GroupedFeature__Group_2_0_4_2__0__Impl rule__GroupedFeature__Group_2_0_4_2__1 ;
    public final void rule__GroupedFeature__Group_2_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( rule__GroupedFeature__Group_2_0_4_2__0__Impl rule__GroupedFeature__Group_2_0_4_2__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:2: rule__GroupedFeature__Group_2_0_4_2__0__Impl rule__GroupedFeature__Group_2_0_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_2__0__Impl_in_rule__GroupedFeature__Group_2_0_4_2__05728);
            rule__GroupedFeature__Group_2_0_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_2__1_in_rule__GroupedFeature__Group_2_0_4_2__05731);
            rule__GroupedFeature__Group_2_0_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_2__0"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_2__0__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: rule__GroupedFeature__Group_2_0_4_2__0__Impl : ( '#' ) ;
    public final void rule__GroupedFeature__Group_2_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: ( ( '#' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( '#' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2834:1: ( '#' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: '#'
            {
             before(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4_2__0__Impl5759); 
             after(grammarAccess.getGroupedFeatureAccess().getNumberSignKeyword_2_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_2__0__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_2__1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: rule__GroupedFeature__Group_2_0_4_2__1 : rule__GroupedFeature__Group_2_0_4_2__1__Impl ;
    public final void rule__GroupedFeature__Group_2_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: ( rule__GroupedFeature__Group_2_0_4_2__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:2: rule__GroupedFeature__Group_2_0_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_0_4_2__1__Impl_in_rule__GroupedFeature__Group_2_0_4_2__15790);
            rule__GroupedFeature__Group_2_0_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_2__1"


    // $ANTLR start "rule__GroupedFeature__Group_2_0_4_2__1__Impl"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: rule__GroupedFeature__Group_2_0_4_2__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_2_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ( rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:2: rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1_in_rule__GroupedFeature__Group_2_0_4_2__1__Impl5817);
            rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_0_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__Group_2_0_4_2__1__Impl"


    // $ANTLR start "rule__GroupedFeature__Group_2_1__0"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: rule__GroupedFeature__Group_2_1__0 : rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1 ;
    public final void rule__GroupedFeature__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2884:1: ( rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2885:2: rule__GroupedFeature__Group_2_1__0__Impl rule__GroupedFeature__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__0__Impl_in_rule__GroupedFeature__Group_2_1__05851);
            rule__GroupedFeature__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__1_in_rule__GroupedFeature__Group_2_1__05854);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2892:1: rule__GroupedFeature__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__GroupedFeature__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2896:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( '=' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( '=' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: '='
            {
             before(grammarAccess.getGroupedFeatureAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__GroupedFeature__Group_2_1__0__Impl5882); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: rule__GroupedFeature__Group_2_1__1 : rule__GroupedFeature__Group_2_1__1__Impl ;
    public final void rule__GroupedFeature__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( rule__GroupedFeature__Group_2_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:2: rule__GroupedFeature__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__Group_2_1__1__Impl_in_rule__GroupedFeature__Group_2_1__15913);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__GroupedFeature__Group_2_1__1__Impl : ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) ) ;
    public final void rule__GroupedFeature__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 )
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsAssignment_2_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( rule__GroupedFeature__ConstraintsAssignment_2_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:2: rule__GroupedFeature__ConstraintsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_1_1_in_rule__GroupedFeature__Group_2_1__1__Impl5940);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05974);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05977);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: rule__Expression__Group__0__Impl : ( ruleLogical2Operation ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2959:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2960:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2961:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getLogical2OperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl6004);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:1: ( rule__Expression__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2977:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16033);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( ( ( rule__Expression__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( ( rule__Expression__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( ( rule__Expression__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( rule__Expression__Group_1__0 )*
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:1: ( rule__Expression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=13 && LA34_0<=14)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2990:2: rule__Expression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl6060);
            	    rule__Expression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__06095);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__06098);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: rule__Expression__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3021:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: ()
            {
             before(grammarAccess.getExpressionAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3023:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3035:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__16156);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__16159);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OperatorAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( ( ( rule__Expression__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( ( rule__Expression__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( rule__Expression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( rule__Expression__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:2: rule__Expression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl6186);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3064:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:1: ( rule__Expression__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__26216);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: rule__Expression__Group_1__2__Impl : ( ( rule__Expression__RexpAssignment_1_2 ) ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( ( ( rule__Expression__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( ( rule__Expression__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ( rule__Expression__RexpAssignment_1_2 )
            {
             before(grammarAccess.getExpressionAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: ( rule__Expression__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:2: rule__Expression__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl6243);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: rule__Logical2Operation__Group__0 : rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 ;
    public final void rule__Logical2Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:2: rule__Logical2Operation__Group__0__Impl rule__Logical2Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__06279);
            rule__Logical2Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__06282);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: rule__Logical2Operation__Group__0__Impl : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl6309);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: rule__Logical2Operation__Group__1 : rule__Logical2Operation__Group__1__Impl ;
    public final void rule__Logical2Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( rule__Logical2Operation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:2: rule__Logical2Operation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__16338);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:1: rule__Logical2Operation__Group__1__Impl : ( ( rule__Logical2Operation__Group_1__0 )* ) ;
    public final void rule__Logical2Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: ( ( ( rule__Logical2Operation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3143:1: ( ( rule__Logical2Operation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: ( rule__Logical2Operation__Group_1__0 )*
            {
             before(grammarAccess.getLogical2OperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: ( rule__Logical2Operation__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=15 && LA35_0<=17)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:2: rule__Logical2Operation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl6365);
            	    rule__Logical2Operation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: rule__Logical2Operation__Group_1__0 : rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 ;
    public final void rule__Logical2Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:2: rule__Logical2Operation__Group_1__0__Impl rule__Logical2Operation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__06400);
            rule__Logical2Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__06403);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: rule__Logical2Operation__Group_1__0__Impl : ( () ) ;
    public final void rule__Logical2Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ()
            {
             before(grammarAccess.getLogical2OperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: rule__Logical2Operation__Group_1__1 : rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 ;
    public final void rule__Logical2Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: ( rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3195:2: rule__Logical2Operation__Group_1__1__Impl rule__Logical2Operation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__16461);
            rule__Logical2Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__16464);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: rule__Logical2Operation__Group_1__1__Impl : ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) ;
    public final void rule__Logical2Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:1: ( ( rule__Logical2Operation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( rule__Logical2Operation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__Logical2Operation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl6491);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: rule__Logical2Operation__Group_1__2 : rule__Logical2Operation__Group_1__2__Impl ;
    public final void rule__Logical2Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( rule__Logical2Operation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3224:2: rule__Logical2Operation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__26521);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3230:1: rule__Logical2Operation__Group_1__2__Impl : ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) ;
    public final void rule__Logical2Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3234:1: ( ( ( rule__Logical2Operation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( ( rule__Logical2Operation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__Logical2Operation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:2: rule__Logical2Operation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl6548);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: rule__BinaryOperation__Group__0 : rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 ;
    public final void rule__BinaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3257:1: ( rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3258:2: rule__BinaryOperation__Group__0__Impl rule__BinaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__06584);
            rule__BinaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__06587);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: rule__BinaryOperation__Group__0__Impl : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3270:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getAtomicExpParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl6614);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: rule__BinaryOperation__Group__1 : rule__BinaryOperation__Group__1__Impl ;
    public final void rule__BinaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3286:1: ( rule__BinaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:2: rule__BinaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16643);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: rule__BinaryOperation__Group__1__Impl : ( ( rule__BinaryOperation__Group_1__0 )* ) ;
    public final void rule__BinaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( ( ( rule__BinaryOperation__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:1: ( ( rule__BinaryOperation__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: ( rule__BinaryOperation__Group_1__0 )*
            {
             before(grammarAccess.getBinaryOperationAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:1: ( rule__BinaryOperation__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=18 && LA36_0<=21)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:2: rule__BinaryOperation__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl6670);
            	    rule__BinaryOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3314:1: rule__BinaryOperation__Group_1__0 : rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 ;
    public final void rule__BinaryOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: ( rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:2: rule__BinaryOperation__Group_1__0__Impl rule__BinaryOperation__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__06705);
            rule__BinaryOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__06708);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: rule__BinaryOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__BinaryOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:1: ()
            {
             before(grammarAccess.getBinaryOperationAccess().getBinaryOperationLexpAction_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: rule__BinaryOperation__Group_1__1 : rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 ;
    public final void rule__BinaryOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:1: ( rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:2: rule__BinaryOperation__Group_1__1__Impl rule__BinaryOperation__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__16766);
            rule__BinaryOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__16769);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: rule__BinaryOperation__Group_1__1__Impl : ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) ;
    public final void rule__BinaryOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:1: ( ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: ( ( rule__BinaryOperation__OperatorAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: ( rule__BinaryOperation__OperatorAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:2: rule__BinaryOperation__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl6796);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: rule__BinaryOperation__Group_1__2 : rule__BinaryOperation__Group_1__2__Impl ;
    public final void rule__BinaryOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: ( rule__BinaryOperation__Group_1__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:2: rule__BinaryOperation__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__26826);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: rule__BinaryOperation__Group_1__2__Impl : ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) ;
    public final void rule__BinaryOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( ( ( rule__BinaryOperation__RexpAssignment_1_2 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( ( rule__BinaryOperation__RexpAssignment_1_2 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAssignment_1_2()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ( rule__BinaryOperation__RexpAssignment_1_2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:2: rule__BinaryOperation__RexpAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl6853);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:1: rule__UnaryOperation__Group__0 : rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 ;
    public final void rule__UnaryOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: ( rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:2: rule__UnaryOperation__Group__0__Impl rule__UnaryOperation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06889);
            rule__UnaryOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06892);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: rule__UnaryOperation__Group__0__Impl : ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) ;
    public final void rule__UnaryOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: ( ( ( rule__UnaryOperation__OperatorAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:1: ( ( rule__UnaryOperation__OperatorAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:1: ( rule__UnaryOperation__OperatorAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:2: rule__UnaryOperation__OperatorAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl6919);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:1: rule__UnaryOperation__Group__1 : rule__UnaryOperation__Group__1__Impl ;
    public final void rule__UnaryOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:1: ( rule__UnaryOperation__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3442:2: rule__UnaryOperation__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__16949);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: rule__UnaryOperation__Group__1__Impl : ( ( rule__UnaryOperation__ExpAssignment_1 ) ) ;
    public final void rule__UnaryOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: ( ( ( rule__UnaryOperation__ExpAssignment_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: ( ( rule__UnaryOperation__ExpAssignment_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( rule__UnaryOperation__ExpAssignment_1 )
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAssignment_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( rule__UnaryOperation__ExpAssignment_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:2: rule__UnaryOperation__ExpAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl6976);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: rule__AtomicExp__Group_3__0 : rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 ;
    public final void rule__AtomicExp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: ( rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3474:2: rule__AtomicExp__Group_3__0__Impl rule__AtomicExp__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__07010);
            rule__AtomicExp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__07013);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: rule__AtomicExp__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AtomicExp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: ( '(' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: ( '(' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3487:1: '('
            {
             before(grammarAccess.getAtomicExpAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__AtomicExp__Group_3__0__Impl7041); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3500:1: rule__AtomicExp__Group_3__1 : rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 ;
    public final void rule__AtomicExp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: ( rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:2: rule__AtomicExp__Group_3__1__Impl rule__AtomicExp__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__17072);
            rule__AtomicExp__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__17075);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: rule__AtomicExp__Group_3__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: ruleExpression
            {
             before(grammarAccess.getAtomicExpAccess().getExpressionParserRuleCall_3_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl7102);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: rule__AtomicExp__Group_3__2 : rule__AtomicExp__Group_3__2__Impl ;
    public final void rule__AtomicExp__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( rule__AtomicExp__Group_3__2__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:2: rule__AtomicExp__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__27131);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: rule__AtomicExp__Group_3__2__Impl : ( ')' ) ;
    public final void rule__AtomicExp__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3544:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: ( ')' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3545:1: ( ')' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3546:1: ')'
            {
             before(grammarAccess.getAtomicExpAccess().getRightParenthesisKeyword_3_2()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__AtomicExp__Group_3__2__Impl7159); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3565:1: rule__Identifier__Group__0 : rule__Identifier__Group__0__Impl rule__Identifier__Group__1 ;
    public final void rule__Identifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( rule__Identifier__Group__0__Impl rule__Identifier__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:2: rule__Identifier__Group__0__Impl rule__Identifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__07196);
            rule__Identifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__07199);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3577:1: rule__Identifier__Group__0__Impl : ( ( rule__Identifier__RefAssignment_0 ) ) ;
    public final void rule__Identifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: ( ( ( rule__Identifier__RefAssignment_0 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: ( ( rule__Identifier__RefAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: ( ( rule__Identifier__RefAssignment_0 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( rule__Identifier__RefAssignment_0 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: ( rule__Identifier__RefAssignment_0 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:2: rule__Identifier__RefAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_0_in_rule__Identifier__Group__0__Impl7226);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: rule__Identifier__Group__1 : rule__Identifier__Group__1__Impl ;
    public final void rule__Identifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: ( rule__Identifier__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:2: rule__Identifier__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__17256);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3605:1: rule__Identifier__Group__1__Impl : ( ( rule__Identifier__Group_1__0 )* ) ;
    public final void rule__Identifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:1: ( ( ( rule__Identifier__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: ( ( rule__Identifier__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3610:1: ( ( rule__Identifier__Group_1__0 )* )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: ( rule__Identifier__Group_1__0 )*
            {
             before(grammarAccess.getIdentifierAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: ( rule__Identifier__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==42) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:2: rule__Identifier__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl7283);
            	    rule__Identifier__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3626:1: rule__Identifier__Group_1__0 : rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 ;
    public final void rule__Identifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:2: rule__Identifier__Group_1__0__Impl rule__Identifier__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__07318);
            rule__Identifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__07321);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3638:1: rule__Identifier__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Identifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3642:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: ( '.' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: ( '.' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: '.'
            {
             before(grammarAccess.getIdentifierAccess().getFullStopKeyword_1_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Identifier__Group_1__0__Impl7349); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: rule__Identifier__Group_1__1 : rule__Identifier__Group_1__1__Impl ;
    public final void rule__Identifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( rule__Identifier__Group_1__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:2: rule__Identifier__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__17380);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3668:1: rule__Identifier__Group_1__1__Impl : ( ( rule__Identifier__RefAssignment_1_1 ) ) ;
    public final void rule__Identifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: ( ( ( rule__Identifier__RefAssignment_1_1 ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: ( ( rule__Identifier__RefAssignment_1_1 ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3673:1: ( ( rule__Identifier__RefAssignment_1_1 ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: ( rule__Identifier__RefAssignment_1_1 )
            {
             before(grammarAccess.getIdentifierAccess().getRefAssignment_1_1()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( rule__Identifier__RefAssignment_1_1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:2: rule__Identifier__RefAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identifier__RefAssignment_1_1_in_rule__Identifier__Group_1__1__Impl7407);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: rule__NULL__Group__0 : rule__NULL__Group__0__Impl rule__NULL__Group__1 ;
    public final void rule__NULL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( rule__NULL__Group__0__Impl rule__NULL__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:2: rule__NULL__Group__0__Impl rule__NULL__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__07441);
            rule__NULL__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__07444);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: rule__NULL__Group__0__Impl : ( () ) ;
    public final void rule__NULL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( ( () ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( () )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( () )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ()
            {
             before(grammarAccess.getNULLAccess().getNULLAction_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ()
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: rule__NULL__Group__1 : rule__NULL__Group__1__Impl ;
    public final void rule__NULL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( rule__NULL__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:2: rule__NULL__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__17502);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: rule__NULL__Group__1__Impl : ( 'NULL' ) ;
    public final void rule__NULL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: ( ( 'NULL' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( 'NULL' )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( 'NULL' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: 'NULL'
            {
             before(grammarAccess.getNULLAccess().getNULLKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__NULL__Group__1__Impl7530); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3758:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07565);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07568);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ( ( '-' )? ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ( '-' )? )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ( '-' )? )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:2: '-'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_rule__EInt__Group__0__Impl7597); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( rule__EInt__Group__1__Impl )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17630);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( RULE_INT )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7657); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:1: rule__Model__RootFeatureAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3824:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17695);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: rule__Model__RootFeatureAssignment_3_2_1 : ( ruleFeature ) ;
    public final void rule__Model__RootFeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3837:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ruleFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ruleFeature
            {
             before(grammarAccess.getModelAccess().getRootFeatureFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17726);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: rule__SolitaryFeature__RequiredAssignment_1 : ( ruleSolitaryType ) ;
    public final void rule__SolitaryFeature__RequiredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3852:1: ( ( ruleSolitaryType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: ( ruleSolitaryType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3853:1: ( ruleSolitaryType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3854:1: ruleSolitaryType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getRequiredSolitaryTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17757);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: rule__SolitaryFeature__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SolitaryFeature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3869:1: ruleEString
            {
             before(grammarAccess.getSolitaryFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_27788);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: rule__SolitaryFeature__TypeAssignment_3_0_1_1 : ( ruleSimpleType ) ;
    public final void rule__SolitaryFeature__TypeAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3883:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3884:1: ruleSimpleType
            {
             before(grammarAccess.getSolitaryFeatureAccess().getTypeSimpleTypeEnumRuleCall_3_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_3_0_1_17819);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: rule__SolitaryFeature__FeaturesAssignment_3_0_2_0 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_3_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_07850);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:1: rule__SolitaryFeature__FeaturesAssignment_3_0_2_1 : ( ruleSolitaryFeature ) ;
    public final void rule__SolitaryFeature__FeaturesAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3912:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3913:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3914:1: ruleSolitaryFeature
            {
             before(grammarAccess.getSolitaryFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_3_0_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_17881);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: rule__SolitaryFeature__GroupsAssignment_3_0_3_0 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_3_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3928:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3929:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_07912);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3938:1: rule__SolitaryFeature__GroupsAssignment_3_0_3_1 : ( ruleGroup ) ;
    public final void rule__SolitaryFeature__GroupsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3943:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ruleGroup
            {
             before(grammarAccess.getSolitaryFeatureAccess().getGroupsGroupParserRuleCall_3_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_17943);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_17974);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_0_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_18005);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:1: rule__SolitaryFeature__ConstraintsAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__SolitaryFeature__ConstraintsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ruleExpression
            {
             before(grammarAccess.getSolitaryFeatureAccess().getConstraintsExpressionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_1_18036);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3998:1: rule__Group__InclusiveAssignment_1 : ( ( 'any' ) ) ;
    public final void rule__Group__InclusiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:1: ( ( ( 'any' ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( 'any' ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: ( ( 'any' ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: ( 'any' )
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( 'any' )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: 'any'
            {
             before(grammarAccess.getGroupAccess().getInclusiveAnyKeyword_1_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Group__InclusiveAssignment_18072); 
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: rule__Group__GroupedFeaturesAssignment_3 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4027:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_38111);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: rule__Group__GroupedFeaturesAssignment_4_1 : ( ruleGroupedFeature ) ;
    public final void rule__Group__GroupedFeaturesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: ( ( ruleGroupedFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( ruleGroupedFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( ruleGroupedFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: ruleGroupedFeature
            {
             before(grammarAccess.getGroupAccess().getGroupedFeaturesGroupedFeatureParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_4_18142);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4051:1: rule__GroupedFeature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__GroupedFeature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4055:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: ( ruleEString )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: ruleEString
            {
             before(grammarAccess.getGroupedFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_18173);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: rule__GroupedFeature__TypeAssignment_2_0_1_1 : ( ruleSimpleType ) ;
    public final void rule__GroupedFeature__TypeAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( ( ruleSimpleType ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( ruleSimpleType )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( ruleSimpleType )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: ruleSimpleType
            {
             before(grammarAccess.getGroupedFeatureAccess().getTypeSimpleTypeEnumRuleCall_2_0_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_2_0_1_18204);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:1: rule__GroupedFeature__GroupsAssignment_2_0_2_0 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_2_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4087:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_08235);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: rule__GroupedFeature__GroupsAssignment_2_0_2_1 : ( ruleGroup ) ;
    public final void rule__GroupedFeature__GroupsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4100:1: ( ( ruleGroup ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: ( ruleGroup )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: ( ruleGroup )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ruleGroup
            {
             before(grammarAccess.getGroupedFeatureAccess().getGroupsGroupParserRuleCall_2_0_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_18266);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4111:1: rule__GroupedFeature__FeaturesAssignment_2_0_3_0 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_2_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4115:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_08297);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: rule__GroupedFeature__FeaturesAssignment_2_0_3_1 : ( ruleSolitaryFeature ) ;
    public final void rule__GroupedFeature__FeaturesAssignment_2_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: ( ( ruleSolitaryFeature ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( ruleSolitaryFeature )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( ruleSolitaryFeature )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: ruleSolitaryFeature
            {
             before(grammarAccess.getGroupedFeatureAccess().getFeaturesSolitaryFeatureParserRuleCall_2_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_18328);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: rule__GroupedFeature__ConstraintsAssignment_2_0_4_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_18359);
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


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_18390);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_0_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1"


    // $ANTLR start "rule__GroupedFeature__ConstraintsAssignment_2_1_1"
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: rule__GroupedFeature__ConstraintsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__GroupedFeature__ConstraintsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4175:1: ( ( ruleExpression ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: ( ruleExpression )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: ( ruleExpression )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:1: ruleExpression
            {
             before(grammarAccess.getGroupedFeatureAccess().getConstraintsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_1_18421);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4186:1: rule__Expression__OperatorAssignment_1_1 : ( ruleLogicalOperator ) ;
    public final void rule__Expression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: ( ( ruleLogicalOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: ( ruleLogicalOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: ( ruleLogicalOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: ruleLogicalOperator
            {
             before(grammarAccess.getExpressionAccess().getOperatorLogicalOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_18452);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: rule__Expression__RexpAssignment_1_2 : ( ruleLogical2Operation ) ;
    public final void rule__Expression__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( ( ruleLogical2Operation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( ruleLogical2Operation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( ruleLogical2Operation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ruleLogical2Operation
            {
             before(grammarAccess.getExpressionAccess().getRexpLogical2OperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_28483);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: rule__Logical2Operation__OperatorAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__Logical2Operation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: ( ( ruleCompareOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( ruleCompareOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( ruleCompareOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: ruleCompareOperator
            {
             before(grammarAccess.getLogical2OperationAccess().getOperatorCompareOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_18514);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: rule__Logical2Operation__RexpAssignment_1_2 : ( ruleBinaryOperation ) ;
    public final void rule__Logical2Operation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: ( ( ruleBinaryOperation ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( ruleBinaryOperation )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( ruleBinaryOperation )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: ruleBinaryOperation
            {
             before(grammarAccess.getLogical2OperationAccess().getRexpBinaryOperationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_28545);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:1: rule__BinaryOperation__OperatorAssignment_1_1 : ( ruleArithmicOperator ) ;
    public final void rule__BinaryOperation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4250:1: ( ( ruleArithmicOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: ( ruleArithmicOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: ( ruleArithmicOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ruleArithmicOperator
            {
             before(grammarAccess.getBinaryOperationAccess().getOperatorArithmicOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_18576);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: rule__BinaryOperation__RexpAssignment_1_2 : ( ruleAtomicExp ) ;
    public final void rule__BinaryOperation__RexpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ruleAtomicExp
            {
             before(grammarAccess.getBinaryOperationAccess().getRexpAtomicExpParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_28607);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: rule__UnaryOperation__OperatorAssignment_0 : ( ruleUnaryOperator ) ;
    public final void rule__UnaryOperation__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: ( ( ruleUnaryOperator ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( ruleUnaryOperator )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( ruleUnaryOperator )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ruleUnaryOperator
            {
             before(grammarAccess.getUnaryOperationAccess().getOperatorUnaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_08638);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: rule__UnaryOperation__ExpAssignment_1 : ( ruleAtomicExp ) ;
    public final void rule__UnaryOperation__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: ( ( ruleAtomicExp ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ruleAtomicExp )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( ruleAtomicExp )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ruleAtomicExp
            {
             before(grammarAccess.getUnaryOperationAccess().getExpAtomicExpParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_18669);
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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: rule__Identifier__RefAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Identifier__RefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( ruleEString )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_0_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ruleEString
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Identifier__RefAssignment_08704);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_0_0_1()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4325:1: rule__Identifier__RefAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Identifier__RefAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( ( ruleEString ) )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( ( ruleEString ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( ruleEString )
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureCrossReference_1_1_0()); 
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( ruleEString )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:1: ruleEString
            {
             before(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Identifier__RefAssignment_1_18743);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIdentifierAccess().getRefFeatureEStringParserRuleCall_1_1_0_1()); 

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
    // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: rule__Number__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: ( ( ruleEInt ) )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( ruleEInt )
            {
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ( ruleEInt )
            // ../org.xtext.example.mydsl1.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4350:1: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8778);
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
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__0_in_rule__SolitaryFeature__Alternatives_31295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__0_in_rule__SolitaryFeature__Alternatives_31313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__0_in_rule__GroupedFeature__Alternatives_21346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__0_in_rule__GroupedFeature__Alternatives_21364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNULL_in_rule__AtomicExp__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__AtomicExp__Alternatives1414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentifier_in_rule__AtomicExp__Alternatives1431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0_in_rule__AtomicExp__Alternatives1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperation_in_rule__AtomicExp__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__AtomicExp__Alternatives1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__LogicalOperator__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LogicalOperator__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__CompareOperator__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__CompareOperator__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__CompareOperator__Alternatives1719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ArithmicOperator__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ArithmicOperator__Alternatives1776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ArithmicOperator__Alternatives1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ArithmicOperator__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__UnaryOperator__Alternatives1854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__UnaryOperator__Alternatives1875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleType__Alternatives1911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SimpleType__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__SimpleType__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__SimpleType__Alternatives1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__SolitaryType__Alternatives2010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__SolitaryType__Alternatives2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02064 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12125 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Model__Group__1__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22187 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Model__Group__2__Impl2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32249 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Model__Group__4__Impl2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__02379 = new BitSet(new long[]{0x0000000400000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__02382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Model__Group_3__0__Impl2410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__12441 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__12444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_1_in_rule__Model__Group_3__1__Impl2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__22501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0_in_rule__Model__Group_3__2__Impl2528 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__0__Impl_in_rule__Model__Group_3_2__02565 = new BitSet(new long[]{0x0000000400000030L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1_in_rule__Model__Group_3_2__02568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Model__Group_3_2__0__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_2__1__Impl_in_rule__Model__Group_3_2__12627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__RootFeatureAssignment_3_2_1_in_rule__Model__Group_3_2__1__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__0__Impl_in_rule__SolitaryFeature__Group__02688 = new BitSet(new long[]{0x0000000430000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1_in_rule__SolitaryFeature__Group__02691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SolitaryFeature__Group__0__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__1__Impl_in_rule__SolitaryFeature__Group__12750 = new BitSet(new long[]{0x0000000430000030L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2_in_rule__SolitaryFeature__Group__12753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__RequiredAssignment_1_in_rule__SolitaryFeature__Group__1__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__2__Impl_in_rule__SolitaryFeature__Group__22811 = new BitSet(new long[]{0x0000002080000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3_in_rule__SolitaryFeature__Group__22814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__NameAssignment_2_in_rule__SolitaryFeature__Group__2__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group__3__Impl_in_rule__SolitaryFeature__Group__32871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Alternatives_3_in_rule__SolitaryFeature__Group__3__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__0__Impl_in_rule__SolitaryFeature__Group_3_0__02937 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__1_in_rule__SolitaryFeature__Group_3_0__02940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__SolitaryFeature__Group_3_0__0__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__1__Impl_in_rule__SolitaryFeature__Group_3_0__12999 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__2_in_rule__SolitaryFeature__Group_3_0__13002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__0_in_rule__SolitaryFeature__Group_3_0__1__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__2__Impl_in_rule__SolitaryFeature__Group_3_0__23060 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__3_in_rule__SolitaryFeature__Group_3_0__23063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__0_in_rule__SolitaryFeature__Group_3_0__2__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__3__Impl_in_rule__SolitaryFeature__Group_3_0__33121 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__4_in_rule__SolitaryFeature__Group_3_0__33124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__0_in_rule__SolitaryFeature__Group_3_0__3__Impl3151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__4__Impl_in_rule__SolitaryFeature__Group_3_0__43182 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__5_in_rule__SolitaryFeature__Group_3_0__43185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__0_in_rule__SolitaryFeature__Group_3_0__4__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0__5__Impl_in_rule__SolitaryFeature__Group_3_0__53243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__SolitaryFeature__Group_3_0__5__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__0__Impl_in_rule__SolitaryFeature__Group_3_0_1__03314 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__1_in_rule__SolitaryFeature__Group_3_0_1__03317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__SolitaryFeature__Group_3_0_1__0__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_1__1__Impl_in_rule__SolitaryFeature__Group_3_0_1__13376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__TypeAssignment_3_0_1_1_in_rule__SolitaryFeature__Group_3_0_1__1__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_2__03437 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__1_in_rule__SolitaryFeature__Group_3_0_2__03440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_0_in_rule__SolitaryFeature__Group_3_0_2__0__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_2__13497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__FeaturesAssignment_3_0_2_1_in_rule__SolitaryFeature__Group_3_0_2__1__Impl3524 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__0__Impl_in_rule__SolitaryFeature__Group_3_0_3__03559 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__1_in_rule__SolitaryFeature__Group_3_0_3__03562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_0_in_rule__SolitaryFeature__Group_3_0_3__0__Impl3589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_3__1__Impl_in_rule__SolitaryFeature__Group_3_0_3__13619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__GroupsAssignment_3_0_3_1_in_rule__SolitaryFeature__Group_3_0_3__1__Impl3646 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__0__Impl_in_rule__SolitaryFeature__Group_3_0_4__03681 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__1_in_rule__SolitaryFeature__Group_3_0_4__03684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__1__Impl_in_rule__SolitaryFeature__Group_3_0_4__13743 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__2_in_rule__SolitaryFeature__Group_3_0_4__13746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_1_in_rule__SolitaryFeature__Group_3_0_4__1__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4__2__Impl_in_rule__SolitaryFeature__Group_3_0_4__23803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0_in_rule__SolitaryFeature__Group_3_0_4__2__Impl3830 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__0__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__03867 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1_in_rule__SolitaryFeature__Group_3_0_4_2__03870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SolitaryFeature__Group_3_0_4_2__0__Impl3898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_0_4_2__1__Impl_in_rule__SolitaryFeature__Group_3_0_4_2__13929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_1_in_rule__SolitaryFeature__Group_3_0_4_2__1__Impl3956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__0__Impl_in_rule__SolitaryFeature__Group_3_1__03990 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__1_in_rule__SolitaryFeature__Group_3_1__03993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__SolitaryFeature__Group_3_1__0__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__Group_3_1__1__Impl_in_rule__SolitaryFeature__Group_3_1__14052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SolitaryFeature__ConstraintsAssignment_3_1_1_in_rule__SolitaryFeature__Group_3_1__1__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__04113 = new BitSet(new long[]{0x0000208000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__04116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Group__Group__0__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__14175 = new BitSet(new long[]{0x0000208000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__14178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__InclusiveAssignment_1_in_rule__Group__Group__1__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__24236 = new BitSet(new long[]{0x0000000400000030L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__24239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Group__Group__2__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__34298 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__34301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_3_in_rule__Group__Group__3__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__44358 = new BitSet(new long[]{0x0000030000000000L});
        public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__44361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl4388 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__54419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Group__Group__5__Impl4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__04490 = new BitSet(new long[]{0x0000000400000030L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__04493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Group__Group_4__0__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__14552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__GroupedFeaturesAssignment_4_1_in_rule__Group__Group_4__1__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__0__Impl_in_rule__GroupedFeature__Group__04613 = new BitSet(new long[]{0x0000000400000030L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1_in_rule__GroupedFeature__Group__04616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__1__Impl_in_rule__GroupedFeature__Group__14674 = new BitSet(new long[]{0x0000002080000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2_in_rule__GroupedFeature__Group__14677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__NameAssignment_1_in_rule__GroupedFeature__Group__1__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group__2__Impl_in_rule__GroupedFeature__Group__24734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Alternatives_2_in_rule__GroupedFeature__Group__2__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__0__Impl_in_rule__GroupedFeature__Group_2_0__04798 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__1_in_rule__GroupedFeature__Group_2_0__04801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__GroupedFeature__Group_2_0__0__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__1__Impl_in_rule__GroupedFeature__Group_2_0__14860 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__2_in_rule__GroupedFeature__Group_2_0__14863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__0_in_rule__GroupedFeature__Group_2_0__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__2__Impl_in_rule__GroupedFeature__Group_2_0__24921 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__3_in_rule__GroupedFeature__Group_2_0__24924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__0_in_rule__GroupedFeature__Group_2_0__2__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__3__Impl_in_rule__GroupedFeature__Group_2_0__34982 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__4_in_rule__GroupedFeature__Group_2_0__34985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__0_in_rule__GroupedFeature__Group_2_0__3__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__4__Impl_in_rule__GroupedFeature__Group_2_0__45043 = new BitSet(new long[]{0x0000005D00000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__5_in_rule__GroupedFeature__Group_2_0__45046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__0_in_rule__GroupedFeature__Group_2_0__4__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0__5__Impl_in_rule__GroupedFeature__Group_2_0__55104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__GroupedFeature__Group_2_0__5__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__0__Impl_in_rule__GroupedFeature__Group_2_0_1__05175 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__1_in_rule__GroupedFeature__Group_2_0_1__05178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__GroupedFeature__Group_2_0_1__0__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_1__1__Impl_in_rule__GroupedFeature__Group_2_0_1__15237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__TypeAssignment_2_0_1_1_in_rule__GroupedFeature__Group_2_0_1__1__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__0__Impl_in_rule__GroupedFeature__Group_2_0_2__05298 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__1_in_rule__GroupedFeature__Group_2_0_2__05301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_0_in_rule__GroupedFeature__Group_2_0_2__0__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_2__1__Impl_in_rule__GroupedFeature__Group_2_0_2__15358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__GroupsAssignment_2_0_2_1_in_rule__GroupedFeature__Group_2_0_2__1__Impl5385 = new BitSet(new long[]{0x0000004000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__0__Impl_in_rule__GroupedFeature__Group_2_0_3__05420 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__1_in_rule__GroupedFeature__Group_2_0_3__05423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_0_in_rule__GroupedFeature__Group_2_0_3__0__Impl5450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_3__1__Impl_in_rule__GroupedFeature__Group_2_0_3__15480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__FeaturesAssignment_2_0_3_1_in_rule__GroupedFeature__Group_2_0_3__1__Impl5507 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__0__Impl_in_rule__GroupedFeature__Group_2_0_4__05542 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__1_in_rule__GroupedFeature__Group_2_0_4__05545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4__0__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__1__Impl_in_rule__GroupedFeature__Group_2_0_4__15604 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__2_in_rule__GroupedFeature__Group_2_0_4__15607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_1_in_rule__GroupedFeature__Group_2_0_4__1__Impl5634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4__2__Impl_in_rule__GroupedFeature__Group_2_0_4__25664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_2__0_in_rule__GroupedFeature__Group_2_0_4__2__Impl5691 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_2__0__Impl_in_rule__GroupedFeature__Group_2_0_4_2__05728 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_2__1_in_rule__GroupedFeature__Group_2_0_4_2__05731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__GroupedFeature__Group_2_0_4_2__0__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_0_4_2__1__Impl_in_rule__GroupedFeature__Group_2_0_4_2__15790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_1_in_rule__GroupedFeature__Group_2_0_4_2__1__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__0__Impl_in_rule__GroupedFeature__Group_2_1__05851 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__1_in_rule__GroupedFeature__Group_2_1__05854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__GroupedFeature__Group_2_1__0__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__Group_2_1__1__Impl_in_rule__GroupedFeature__Group_2_1__15913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GroupedFeature__ConstraintsAssignment_2_1_1_in_rule__GroupedFeature__Group_2_1__1__Impl5940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__05974 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__05977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__Group__0__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Group__1__Impl6060 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__06095 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__06098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__16156 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2_in_rule__Expression__Group_1__16159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__OperatorAssignment_1_1_in_rule__Expression__Group_1__1__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__Group_1__2__Impl_in_rule__Expression__Group_1__26216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Expression__RexpAssignment_1_2_in_rule__Expression__Group_1__2__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__0__Impl_in_rule__Logical2Operation__Group__06279 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1_in_rule__Logical2Operation__Group__06282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__Group__0__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group__1__Impl_in_rule__Logical2Operation__Group__16338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0_in_rule__Logical2Operation__Group__1__Impl6365 = new BitSet(new long[]{0x0000000000038002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__0__Impl_in_rule__Logical2Operation__Group_1__06400 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1_in_rule__Logical2Operation__Group_1__06403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__1__Impl_in_rule__Logical2Operation__Group_1__16461 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2_in_rule__Logical2Operation__Group_1__16464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__OperatorAssignment_1_1_in_rule__Logical2Operation__Group_1__1__Impl6491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__Group_1__2__Impl_in_rule__Logical2Operation__Group_1__26521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Logical2Operation__RexpAssignment_1_2_in_rule__Logical2Operation__Group_1__2__Impl6548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__0__Impl_in_rule__BinaryOperation__Group__06584 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1_in_rule__BinaryOperation__Group__06587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__Group__0__Impl6614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group__1__Impl_in_rule__BinaryOperation__Group__16643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0_in_rule__BinaryOperation__Group__1__Impl6670 = new BitSet(new long[]{0x00000000003C0002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__0__Impl_in_rule__BinaryOperation__Group_1__06705 = new BitSet(new long[]{0x00000000003C0000L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1_in_rule__BinaryOperation__Group_1__06708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__1__Impl_in_rule__BinaryOperation__Group_1__16766 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2_in_rule__BinaryOperation__Group_1__16769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__OperatorAssignment_1_1_in_rule__BinaryOperation__Group_1__1__Impl6796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__Group_1__2__Impl_in_rule__BinaryOperation__Group_1__26826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BinaryOperation__RexpAssignment_1_2_in_rule__BinaryOperation__Group_1__2__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__0__Impl_in_rule__UnaryOperation__Group__06889 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1_in_rule__UnaryOperation__Group__06892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__OperatorAssignment_0_in_rule__UnaryOperation__Group__0__Impl6919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__Group__1__Impl_in_rule__UnaryOperation__Group__16949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__UnaryOperation__ExpAssignment_1_in_rule__UnaryOperation__Group__1__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__0__Impl_in_rule__AtomicExp__Group_3__07010 = new BitSet(new long[]{0x0000188400C01870L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1_in_rule__AtomicExp__Group_3__07013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__AtomicExp__Group_3__0__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__1__Impl_in_rule__AtomicExp__Group_3__17072 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2_in_rule__AtomicExp__Group_3__17075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__AtomicExp__Group_3__1__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AtomicExp__Group_3__2__Impl_in_rule__AtomicExp__Group_3__27131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__AtomicExp__Group_3__2__Impl7159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__0__Impl_in_rule__Identifier__Group__07196 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1_in_rule__Identifier__Group__07199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_0_in_rule__Identifier__Group__0__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group__1__Impl_in_rule__Identifier__Group__17256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__0_in_rule__Identifier__Group__1__Impl7283 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__0__Impl_in_rule__Identifier__Group_1__07318 = new BitSet(new long[]{0x0000000400000030L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__1_in_rule__Identifier__Group_1__07321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Identifier__Group_1__0__Impl7349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__Group_1__1__Impl_in_rule__Identifier__Group_1__17380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identifier__RefAssignment_1_1_in_rule__Identifier__Group_1__1__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__0__Impl_in_rule__NULL__Group__07441 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__NULL__Group__1_in_rule__NULL__Group__07444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NULL__Group__1__Impl_in_rule__NULL__Group__17502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__NULL__Group__1__Impl7530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__07565 = new BitSet(new long[]{0x0000100000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__07568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__EInt__Group__0__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__17630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_17695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Model__RootFeatureAssignment_3_2_17726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryType_in_rule__SolitaryFeature__RequiredAssignment_17757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SolitaryFeature__NameAssignment_27788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__SolitaryFeature__TypeAssignment_3_0_1_17819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_07850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__SolitaryFeature__FeaturesAssignment_3_0_2_17881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_07912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__SolitaryFeature__GroupsAssignment_3_0_3_17943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_17974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_0_4_2_18005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__SolitaryFeature__ConstraintsAssignment_3_1_18036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Group__InclusiveAssignment_18072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_38111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroupedFeature_in_rule__Group__GroupedFeaturesAssignment_4_18142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GroupedFeature__NameAssignment_18173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleType_in_rule__GroupedFeature__TypeAssignment_2_0_1_18204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_08235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__GroupedFeature__GroupsAssignment_2_0_2_18266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_08297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSolitaryFeature_in_rule__GroupedFeature__FeaturesAssignment_2_0_3_18328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_18359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_0_4_2_18390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_rule__GroupedFeature__ConstraintsAssignment_2_1_18421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__Expression__OperatorAssignment_1_18452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogical2Operation_in_rule__Expression__RexpAssignment_1_28483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_rule__Logical2Operation__OperatorAssignment_1_18514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryOperation_in_rule__Logical2Operation__RexpAssignment_1_28545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArithmicOperator_in_rule__BinaryOperation__OperatorAssignment_1_18576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__BinaryOperation__RexpAssignment_1_28607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rule__UnaryOperation__OperatorAssignment_08638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExp_in_rule__UnaryOperation__ExpAssignment_18669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Identifier__RefAssignment_08704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Identifier__RefAssignment_1_18743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Number__ValueAssignment8778 = new BitSet(new long[]{0x0000000000000002L});
    }


}