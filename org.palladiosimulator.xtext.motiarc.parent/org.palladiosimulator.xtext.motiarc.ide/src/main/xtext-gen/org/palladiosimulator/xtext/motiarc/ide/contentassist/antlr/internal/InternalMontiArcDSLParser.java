package org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.palladiosimulator.xtext.motiarc.services.MontiArcDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiArcDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_ID", "RULE_SYNC", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'connect'", "'->'", "'port'", "'automaton'", "'state'", "'initial'", "'/'", "'['", "']'", "'import'", "'.'", "'package'", "'<'", "'>'", "'('", "')'", "'in'", "'out'", "'*'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SYNC=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalMontiArcDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMontiArcDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMontiArcDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMontiArcDSL.g"; }


    	private MontiArcDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MontiArcDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMACompilationUnit"
    // InternalMontiArcDSL.g:53:1: entryRuleMACompilationUnit : ruleMACompilationUnit EOF ;
    public final void entryRuleMACompilationUnit() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:54:1: ( ruleMACompilationUnit EOF )
            // InternalMontiArcDSL.g:55:1: ruleMACompilationUnit EOF
            {
             before(grammarAccess.getMACompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleMACompilationUnit();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMACompilationUnit"


    // $ANTLR start "ruleMACompilationUnit"
    // InternalMontiArcDSL.g:62:1: ruleMACompilationUnit : ( ( rule__MACompilationUnit__Group__0 ) ) ;
    public final void ruleMACompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:66:2: ( ( ( rule__MACompilationUnit__Group__0 ) ) )
            // InternalMontiArcDSL.g:67:2: ( ( rule__MACompilationUnit__Group__0 ) )
            {
            // InternalMontiArcDSL.g:67:2: ( ( rule__MACompilationUnit__Group__0 ) )
            // InternalMontiArcDSL.g:68:3: ( rule__MACompilationUnit__Group__0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getGroup()); 
            // InternalMontiArcDSL.g:69:3: ( rule__MACompilationUnit__Group__0 )
            // InternalMontiArcDSL.g:69:4: rule__MACompilationUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMACompilationUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMACompilationUnit"


    // $ANTLR start "entryRuleComponent"
    // InternalMontiArcDSL.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:79:1: ( ruleComponent EOF )
            // InternalMontiArcDSL.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMontiArcDSL.g:87:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:91:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMontiArcDSL.g:92:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalMontiArcDSL.g:92:2: ( ( rule__Component__Group__0 ) )
            // InternalMontiArcDSL.g:93:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMontiArcDSL.g:94:3: ( rule__Component__Group__0 )
            // InternalMontiArcDSL.g:94:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalMontiArcDSL.g:103:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:104:1: ( ruleSignature EOF )
            // InternalMontiArcDSL.g:105:1: ruleSignature EOF
            {
             before(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getSignatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalMontiArcDSL.g:112:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:116:2: ( ( ( rule__Signature__Group__0 ) ) )
            // InternalMontiArcDSL.g:117:2: ( ( rule__Signature__Group__0 ) )
            {
            // InternalMontiArcDSL.g:117:2: ( ( rule__Signature__Group__0 ) )
            // InternalMontiArcDSL.g:118:3: ( rule__Signature__Group__0 )
            {
             before(grammarAccess.getSignatureAccess().getGroup()); 
            // InternalMontiArcDSL.g:119:3: ( rule__Signature__Group__0 )
            // InternalMontiArcDSL.g:119:4: rule__Signature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameters"
    // InternalMontiArcDSL.g:128:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:129:1: ( ruleParameters EOF )
            // InternalMontiArcDSL.g:130:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMontiArcDSL.g:137:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:141:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalMontiArcDSL.g:142:2: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalMontiArcDSL.g:142:2: ( ( rule__Parameters__Group__0 ) )
            // InternalMontiArcDSL.g:143:3: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // InternalMontiArcDSL.g:144:3: ( rule__Parameters__Group__0 )
            // InternalMontiArcDSL.g:144:4: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleParameter"
    // InternalMontiArcDSL.g:153:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:154:1: ( ruleParameter EOF )
            // InternalMontiArcDSL.g:155:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMontiArcDSL.g:162:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:166:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMontiArcDSL.g:167:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMontiArcDSL.g:167:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMontiArcDSL.g:168:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMontiArcDSL.g:169:3: ( rule__Parameter__Group__0 )
            // InternalMontiArcDSL.g:169:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleArcElement"
    // InternalMontiArcDSL.g:178:1: entryRuleArcElement : ruleArcElement EOF ;
    public final void entryRuleArcElement() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:179:1: ( ruleArcElement EOF )
            // InternalMontiArcDSL.g:180:1: ruleArcElement EOF
            {
             before(grammarAccess.getArcElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArcElement();

            state._fsp--;

             after(grammarAccess.getArcElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArcElement"


    // $ANTLR start "ruleArcElement"
    // InternalMontiArcDSL.g:187:1: ruleArcElement : ( ( rule__ArcElement__Alternatives ) ) ;
    public final void ruleArcElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:191:2: ( ( ( rule__ArcElement__Alternatives ) ) )
            // InternalMontiArcDSL.g:192:2: ( ( rule__ArcElement__Alternatives ) )
            {
            // InternalMontiArcDSL.g:192:2: ( ( rule__ArcElement__Alternatives ) )
            // InternalMontiArcDSL.g:193:3: ( rule__ArcElement__Alternatives )
            {
             before(grammarAccess.getArcElementAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:194:3: ( rule__ArcElement__Alternatives )
            // InternalMontiArcDSL.g:194:4: rule__ArcElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArcElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArcElement"


    // $ANTLR start "entryRuleSubComponent"
    // InternalMontiArcDSL.g:203:1: entryRuleSubComponent : ruleSubComponent EOF ;
    public final void entryRuleSubComponent() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:204:1: ( ruleSubComponent EOF )
            // InternalMontiArcDSL.g:205:1: ruleSubComponent EOF
            {
             before(grammarAccess.getSubComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleSubComponent();

            state._fsp--;

             after(grammarAccess.getSubComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubComponent"


    // $ANTLR start "ruleSubComponent"
    // InternalMontiArcDSL.g:212:1: ruleSubComponent : ( ( rule__SubComponent__Group__0 ) ) ;
    public final void ruleSubComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:216:2: ( ( ( rule__SubComponent__Group__0 ) ) )
            // InternalMontiArcDSL.g:217:2: ( ( rule__SubComponent__Group__0 ) )
            {
            // InternalMontiArcDSL.g:217:2: ( ( rule__SubComponent__Group__0 ) )
            // InternalMontiArcDSL.g:218:3: ( rule__SubComponent__Group__0 )
            {
             before(grammarAccess.getSubComponentAccess().getGroup()); 
            // InternalMontiArcDSL.g:219:3: ( rule__SubComponent__Group__0 )
            // InternalMontiArcDSL.g:219:4: rule__SubComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalMontiArcDSL.g:228:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:229:1: ( ruleConnector EOF )
            // InternalMontiArcDSL.g:230:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalMontiArcDSL.g:237:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:241:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalMontiArcDSL.g:242:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalMontiArcDSL.g:242:2: ( ( rule__Connector__Group__0 ) )
            // InternalMontiArcDSL.g:243:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalMontiArcDSL.g:244:3: ( rule__Connector__Group__0 )
            // InternalMontiArcDSL.g:244:4: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePorts"
    // InternalMontiArcDSL.g:253:1: entryRulePorts : rulePorts EOF ;
    public final void entryRulePorts() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:254:1: ( rulePorts EOF )
            // InternalMontiArcDSL.g:255:1: rulePorts EOF
            {
             before(grammarAccess.getPortsRule()); 
            pushFollow(FOLLOW_1);
            rulePorts();

            state._fsp--;

             after(grammarAccess.getPortsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePorts"


    // $ANTLR start "rulePorts"
    // InternalMontiArcDSL.g:262:1: rulePorts : ( ( rule__Ports__Group__0 ) ) ;
    public final void rulePorts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:266:2: ( ( ( rule__Ports__Group__0 ) ) )
            // InternalMontiArcDSL.g:267:2: ( ( rule__Ports__Group__0 ) )
            {
            // InternalMontiArcDSL.g:267:2: ( ( rule__Ports__Group__0 ) )
            // InternalMontiArcDSL.g:268:3: ( rule__Ports__Group__0 )
            {
             before(grammarAccess.getPortsAccess().getGroup()); 
            // InternalMontiArcDSL.g:269:3: ( rule__Ports__Group__0 )
            // InternalMontiArcDSL.g:269:4: rule__Ports__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ports__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePorts"


    // $ANTLR start "entryRulePort"
    // InternalMontiArcDSL.g:278:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:279:1: ( rulePort EOF )
            // InternalMontiArcDSL.g:280:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMontiArcDSL.g:287:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:291:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalMontiArcDSL.g:292:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalMontiArcDSL.g:292:2: ( ( rule__Port__Group__0 ) )
            // InternalMontiArcDSL.g:293:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalMontiArcDSL.g:294:3: ( rule__Port__Group__0 )
            // InternalMontiArcDSL.g:294:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcDSL.g:303:1: entryRuleNames : ruleNames EOF ;
    public final void entryRuleNames() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:304:1: ( ruleNames EOF )
            // InternalMontiArcDSL.g:305:1: ruleNames EOF
            {
             before(grammarAccess.getNamesRule()); 
            pushFollow(FOLLOW_1);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getNamesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNames"


    // $ANTLR start "ruleNames"
    // InternalMontiArcDSL.g:312:1: ruleNames : ( ( rule__Names__Group__0 ) ) ;
    public final void ruleNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:316:2: ( ( ( rule__Names__Group__0 ) ) )
            // InternalMontiArcDSL.g:317:2: ( ( rule__Names__Group__0 ) )
            {
            // InternalMontiArcDSL.g:317:2: ( ( rule__Names__Group__0 ) )
            // InternalMontiArcDSL.g:318:3: ( rule__Names__Group__0 )
            {
             before(grammarAccess.getNamesAccess().getGroup()); 
            // InternalMontiArcDSL.g:319:3: ( rule__Names__Group__0 )
            // InternalMontiArcDSL.g:319:4: rule__Names__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Names__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNames"


    // $ANTLR start "entryRuleVariable"
    // InternalMontiArcDSL.g:328:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:329:1: ( ruleVariable EOF )
            // InternalMontiArcDSL.g:330:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMontiArcDSL.g:337:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:341:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMontiArcDSL.g:342:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMontiArcDSL.g:342:2: ( ( rule__Variable__Group__0 ) )
            // InternalMontiArcDSL.g:343:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMontiArcDSL.g:344:3: ( rule__Variable__Group__0 )
            // InternalMontiArcDSL.g:344:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAutomaton"
    // InternalMontiArcDSL.g:353:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:354:1: ( ruleAutomaton EOF )
            // InternalMontiArcDSL.g:355:1: ruleAutomaton EOF
            {
             before(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_1);
            ruleAutomaton();

            state._fsp--;

             after(grammarAccess.getAutomatonRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalMontiArcDSL.g:362:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:366:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // InternalMontiArcDSL.g:367:2: ( ( rule__Automaton__Group__0 ) )
            {
            // InternalMontiArcDSL.g:367:2: ( ( rule__Automaton__Group__0 ) )
            // InternalMontiArcDSL.g:368:3: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // InternalMontiArcDSL.g:369:3: ( rule__Automaton__Group__0 )
            // InternalMontiArcDSL.g:369:4: rule__Automaton__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomatonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleState"
    // InternalMontiArcDSL.g:378:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:379:1: ( ruleState EOF )
            // InternalMontiArcDSL.g:380:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMontiArcDSL.g:387:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:391:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalMontiArcDSL.g:392:2: ( ( rule__State__Group__0 ) )
            {
            // InternalMontiArcDSL.g:392:2: ( ( rule__State__Group__0 ) )
            // InternalMontiArcDSL.g:393:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalMontiArcDSL.g:394:3: ( rule__State__Group__0 )
            // InternalMontiArcDSL.g:394:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleInitialState"
    // InternalMontiArcDSL.g:403:1: entryRuleInitialState : ruleInitialState EOF ;
    public final void entryRuleInitialState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:404:1: ( ruleInitialState EOF )
            // InternalMontiArcDSL.g:405:1: ruleInitialState EOF
            {
             before(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getInitialStateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMontiArcDSL.g:412:1: ruleInitialState : ( ( rule__InitialState__Group__0 ) ) ;
    public final void ruleInitialState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:416:2: ( ( ( rule__InitialState__Group__0 ) ) )
            // InternalMontiArcDSL.g:417:2: ( ( rule__InitialState__Group__0 ) )
            {
            // InternalMontiArcDSL.g:417:2: ( ( rule__InitialState__Group__0 ) )
            // InternalMontiArcDSL.g:418:3: ( rule__InitialState__Group__0 )
            {
             before(grammarAccess.getInitialStateAccess().getGroup()); 
            // InternalMontiArcDSL.g:419:3: ( rule__InitialState__Group__0 )
            // InternalMontiArcDSL.g:419:4: rule__InitialState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleTransition"
    // InternalMontiArcDSL.g:428:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:429:1: ( ruleTransition EOF )
            // InternalMontiArcDSL.g:430:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMontiArcDSL.g:437:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:441:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMontiArcDSL.g:442:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMontiArcDSL.g:442:2: ( ( rule__Transition__Group__0 ) )
            // InternalMontiArcDSL.g:443:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMontiArcDSL.g:444:3: ( rule__Transition__Group__0 )
            // InternalMontiArcDSL.g:444:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleBlock"
    // InternalMontiArcDSL.g:453:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:454:1: ( ruleBlock EOF )
            // InternalMontiArcDSL.g:455:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMontiArcDSL.g:462:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:466:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMontiArcDSL.g:467:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMontiArcDSL.g:467:2: ( ( rule__Block__Group__0 ) )
            // InternalMontiArcDSL.g:468:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalMontiArcDSL.g:469:3: ( rule__Block__Group__0 )
            // InternalMontiArcDSL.g:469:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiArcDSL.g:478:1: entryRuleImportStatements : ruleImportStatements EOF ;
    public final void entryRuleImportStatements() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:479:1: ( ruleImportStatements EOF )
            // InternalMontiArcDSL.g:480:1: ruleImportStatements EOF
            {
             before(grammarAccess.getImportStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleImportStatements();

            state._fsp--;

             after(grammarAccess.getImportStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImportStatements"


    // $ANTLR start "ruleImportStatements"
    // InternalMontiArcDSL.g:487:1: ruleImportStatements : ( ( rule__ImportStatements__Group__0 ) ) ;
    public final void ruleImportStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:491:2: ( ( ( rule__ImportStatements__Group__0 ) ) )
            // InternalMontiArcDSL.g:492:2: ( ( rule__ImportStatements__Group__0 ) )
            {
            // InternalMontiArcDSL.g:492:2: ( ( rule__ImportStatements__Group__0 ) )
            // InternalMontiArcDSL.g:493:3: ( rule__ImportStatements__Group__0 )
            {
             before(grammarAccess.getImportStatementsAccess().getGroup()); 
            // InternalMontiArcDSL.g:494:3: ( rule__ImportStatements__Group__0 )
            // InternalMontiArcDSL.g:494:4: rule__ImportStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportStatements"


    // $ANTLR start "entryRulePackage"
    // InternalMontiArcDSL.g:503:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:504:1: ( rulePackage EOF )
            // InternalMontiArcDSL.g:505:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMontiArcDSL.g:512:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:516:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalMontiArcDSL.g:517:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalMontiArcDSL.g:517:2: ( ( rule__Package__Group__0 ) )
            // InternalMontiArcDSL.g:518:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalMontiArcDSL.g:519:3: ( rule__Package__Group__0 )
            // InternalMontiArcDSL.g:519:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalMontiArcDSL.g:528:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:529:1: ( ruleType EOF )
            // InternalMontiArcDSL.g:530:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMontiArcDSL.g:537:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:541:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMontiArcDSL.g:542:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMontiArcDSL.g:542:2: ( ( rule__Type__Alternatives ) )
            // InternalMontiArcDSL.g:543:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:544:3: ( rule__Type__Alternatives )
            // InternalMontiArcDSL.g:544:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMCPrimitiveType"
    // InternalMontiArcDSL.g:553:1: entryRuleMCPrimitiveType : ruleMCPrimitiveType EOF ;
    public final void entryRuleMCPrimitiveType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:554:1: ( ruleMCPrimitiveType EOF )
            // InternalMontiArcDSL.g:555:1: ruleMCPrimitiveType EOF
            {
             before(grammarAccess.getMCPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCPrimitiveType();

            state._fsp--;

             after(grammarAccess.getMCPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCPrimitiveType"


    // $ANTLR start "ruleMCPrimitiveType"
    // InternalMontiArcDSL.g:562:1: ruleMCPrimitiveType : ( ( rule__MCPrimitiveType__TypeAssignment ) ) ;
    public final void ruleMCPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:566:2: ( ( ( rule__MCPrimitiveType__TypeAssignment ) ) )
            // InternalMontiArcDSL.g:567:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            {
            // InternalMontiArcDSL.g:567:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            // InternalMontiArcDSL.g:568:3: ( rule__MCPrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalMontiArcDSL.g:569:3: ( rule__MCPrimitiveType__TypeAssignment )
            // InternalMontiArcDSL.g:569:4: rule__MCPrimitiveType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCPrimitiveType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMCPrimitiveType"


    // $ANTLR start "entryRuleMCCollectionType"
    // InternalMontiArcDSL.g:578:1: entryRuleMCCollectionType : ruleMCCollectionType EOF ;
    public final void entryRuleMCCollectionType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:579:1: ( ruleMCCollectionType EOF )
            // InternalMontiArcDSL.g:580:1: ruleMCCollectionType EOF
            {
             before(grammarAccess.getMCCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCCollectionType();

            state._fsp--;

             after(grammarAccess.getMCCollectionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCCollectionType"


    // $ANTLR start "ruleMCCollectionType"
    // InternalMontiArcDSL.g:587:1: ruleMCCollectionType : ( ( rule__MCCollectionType__Group__0 ) ) ;
    public final void ruleMCCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:591:2: ( ( ( rule__MCCollectionType__Group__0 ) ) )
            // InternalMontiArcDSL.g:592:2: ( ( rule__MCCollectionType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:592:2: ( ( rule__MCCollectionType__Group__0 ) )
            // InternalMontiArcDSL.g:593:3: ( rule__MCCollectionType__Group__0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:594:3: ( rule__MCCollectionType__Group__0 )
            // InternalMontiArcDSL.g:594:4: rule__MCCollectionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMCCollectionType"


    // $ANTLR start "entryRuleMCArrayType"
    // InternalMontiArcDSL.g:603:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:604:1: ( ruleMCArrayType EOF )
            // InternalMontiArcDSL.g:605:1: ruleMCArrayType EOF
            {
             before(grammarAccess.getMCArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCArrayType();

            state._fsp--;

             after(grammarAccess.getMCArrayTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMCArrayType"


    // $ANTLR start "ruleMCArrayType"
    // InternalMontiArcDSL.g:612:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:616:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMontiArcDSL.g:617:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:617:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMontiArcDSL.g:618:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:619:3: ( rule__MCArrayType__Group__0 )
            // InternalMontiArcDSL.g:619:4: rule__MCArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMCArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMCArrayType"


    // $ANTLR start "entryRuleExpression"
    // InternalMontiArcDSL.g:628:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:629:1: ( ruleExpression EOF )
            // InternalMontiArcDSL.g:630:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:637:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:641:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMontiArcDSL.g:642:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:642:2: ( ( rule__Expression__Alternatives ) )
            // InternalMontiArcDSL.g:643:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:644:3: ( rule__Expression__Alternatives )
            // InternalMontiArcDSL.g:644:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMontiArcDSL.g:653:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:654:1: ( ruleLiteralExpression EOF )
            // InternalMontiArcDSL.g:655:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMontiArcDSL.g:662:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:666:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMontiArcDSL.g:667:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:667:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMontiArcDSL.g:668:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:669:3: ( rule__LiteralExpression__Alternatives )
            // InternalMontiArcDSL.g:669:4: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMontiArcDSL.g:678:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:679:1: ( ruleNumberLiteral EOF )
            // InternalMontiArcDSL.g:680:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMontiArcDSL.g:687:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:691:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:692:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:692:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:693:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:694:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:694:4: rule__NumberLiteral__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMontiArcDSL.g:703:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:704:1: ( ruleStringLiteral EOF )
            // InternalMontiArcDSL.g:705:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMontiArcDSL.g:712:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:716:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:717:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:717:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:718:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:719:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:719:4: rule__StringLiteral__LiteralAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__LiteralAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNameExpression"
    // InternalMontiArcDSL.g:728:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:729:1: ( ruleNameExpression EOF )
            // InternalMontiArcDSL.g:730:1: ruleNameExpression EOF
            {
             before(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNameExpression();

            state._fsp--;

             after(grammarAccess.getNameExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalMontiArcDSL.g:737:1: ruleNameExpression : ( ( rule__NameExpression__NameAssignment ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:741:2: ( ( ( rule__NameExpression__NameAssignment ) ) )
            // InternalMontiArcDSL.g:742:2: ( ( rule__NameExpression__NameAssignment ) )
            {
            // InternalMontiArcDSL.g:742:2: ( ( rule__NameExpression__NameAssignment ) )
            // InternalMontiArcDSL.g:743:3: ( rule__NameExpression__NameAssignment )
            {
             before(grammarAccess.getNameExpressionAccess().getNameAssignment()); 
            // InternalMontiArcDSL.g:744:3: ( rule__NameExpression__NameAssignment )
            // InternalMontiArcDSL.g:744:4: rule__NameExpression__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NameExpression__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameExpressionAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcDSL.g:753:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:754:1: ( ruleArguments EOF )
            // InternalMontiArcDSL.g:755:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalMontiArcDSL.g:762:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:766:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalMontiArcDSL.g:767:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalMontiArcDSL.g:767:2: ( ( rule__Arguments__Group__0 ) )
            // InternalMontiArcDSL.g:768:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalMontiArcDSL.g:769:3: ( rule__Arguments__Group__0 )
            // InternalMontiArcDSL.g:769:4: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalMontiArcDSL.g:778:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:779:1: ( ruleArgument EOF )
            // InternalMontiArcDSL.g:780:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMontiArcDSL.g:787:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:791:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMontiArcDSL.g:792:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMontiArcDSL.g:792:2: ( ( rule__Argument__Group__0 ) )
            // InternalMontiArcDSL.g:793:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMontiArcDSL.g:794:3: ( rule__Argument__Group__0 )
            // InternalMontiArcDSL.g:794:4: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "rule__ArcElement__Alternatives"
    // InternalMontiArcDSL.g:802:1: rule__ArcElement__Alternatives : ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) );
    public final void rule__ArcElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:806:1: ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=13 && LA1_1<=25)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_ID) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 35:
                {
                alt1=4;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt1=5;
                }
                break;
            case 36:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMontiArcDSL.g:807:2: ( ruleComponent )
                    {
                    // InternalMontiArcDSL.g:807:2: ( ruleComponent )
                    // InternalMontiArcDSL.g:808:3: ruleComponent
                    {
                     before(grammarAccess.getArcElementAccess().getComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:813:2: ( ruleSubComponent )
                    {
                    // InternalMontiArcDSL.g:813:2: ( ruleSubComponent )
                    // InternalMontiArcDSL.g:814:3: ruleSubComponent
                    {
                     before(grammarAccess.getArcElementAccess().getSubComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubComponent();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getSubComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:819:2: ( ruleConnector )
                    {
                    // InternalMontiArcDSL.g:819:2: ( ruleConnector )
                    // InternalMontiArcDSL.g:820:3: ruleConnector
                    {
                     before(grammarAccess.getArcElementAccess().getConnectorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConnector();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getConnectorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:825:2: ( rulePorts )
                    {
                    // InternalMontiArcDSL.g:825:2: ( rulePorts )
                    // InternalMontiArcDSL.g:826:3: rulePorts
                    {
                     before(grammarAccess.getArcElementAccess().getPortsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePorts();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getPortsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:831:2: ( ruleVariable )
                    {
                    // InternalMontiArcDSL.g:831:2: ( ruleVariable )
                    // InternalMontiArcDSL.g:832:3: ruleVariable
                    {
                     before(grammarAccess.getArcElementAccess().getVariableParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getVariableParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:837:2: ( ruleAutomaton )
                    {
                    // InternalMontiArcDSL.g:837:2: ( ruleAutomaton )
                    // InternalMontiArcDSL.g:838:3: ruleAutomaton
                    {
                     before(grammarAccess.getArcElementAccess().getAutomatonParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAutomaton();

                    state._fsp--;

                     after(grammarAccess.getArcElementAccess().getAutomatonParserRuleCall_5()); 

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
    // $ANTLR end "rule__ArcElement__Alternatives"


    // $ANTLR start "rule__Port__Alternatives_1"
    // InternalMontiArcDSL.g:847:1: rule__Port__Alternatives_1 : ( ( ( rule__Port__InAssignment_1_0 ) ) | ( ( rule__Port__OutAssignment_1_1 ) ) );
    public final void rule__Port__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:851:1: ( ( ( rule__Port__InAssignment_1_0 ) ) | ( ( rule__Port__OutAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            else if ( (LA2_0==50) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiArcDSL.g:852:2: ( ( rule__Port__InAssignment_1_0 ) )
                    {
                    // InternalMontiArcDSL.g:852:2: ( ( rule__Port__InAssignment_1_0 ) )
                    // InternalMontiArcDSL.g:853:3: ( rule__Port__InAssignment_1_0 )
                    {
                     before(grammarAccess.getPortAccess().getInAssignment_1_0()); 
                    // InternalMontiArcDSL.g:854:3: ( rule__Port__InAssignment_1_0 )
                    // InternalMontiArcDSL.g:854:4: rule__Port__InAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__InAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getInAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:858:2: ( ( rule__Port__OutAssignment_1_1 ) )
                    {
                    // InternalMontiArcDSL.g:858:2: ( ( rule__Port__OutAssignment_1_1 ) )
                    // InternalMontiArcDSL.g:859:3: ( rule__Port__OutAssignment_1_1 )
                    {
                     before(grammarAccess.getPortAccess().getOutAssignment_1_1()); 
                    // InternalMontiArcDSL.g:860:3: ( rule__Port__OutAssignment_1_1 )
                    // InternalMontiArcDSL.g:860:4: rule__Port__OutAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__OutAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getOutAssignment_1_1()); 

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
    // $ANTLR end "rule__Port__Alternatives_1"


    // $ANTLR start "rule__Automaton__Alternatives_4"
    // InternalMontiArcDSL.g:868:1: rule__Automaton__Alternatives_4 : ( ( ( rule__Automaton__StatesAssignment_4_0 ) ) | ( ( rule__Automaton__InitialStatesAssignment_4_1 ) ) | ( ( rule__Automaton__TransitionsAssignment_4_2 ) ) );
    public final void rule__Automaton__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:872:1: ( ( ( rule__Automaton__StatesAssignment_4_0 ) ) | ( ( rule__Automaton__InitialStatesAssignment_4_1 ) ) | ( ( rule__Automaton__TransitionsAssignment_4_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMontiArcDSL.g:873:2: ( ( rule__Automaton__StatesAssignment_4_0 ) )
                    {
                    // InternalMontiArcDSL.g:873:2: ( ( rule__Automaton__StatesAssignment_4_0 ) )
                    // InternalMontiArcDSL.g:874:3: ( rule__Automaton__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getAutomatonAccess().getStatesAssignment_4_0()); 
                    // InternalMontiArcDSL.g:875:3: ( rule__Automaton__StatesAssignment_4_0 )
                    // InternalMontiArcDSL.g:875:4: rule__Automaton__StatesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__StatesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getStatesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:879:2: ( ( rule__Automaton__InitialStatesAssignment_4_1 ) )
                    {
                    // InternalMontiArcDSL.g:879:2: ( ( rule__Automaton__InitialStatesAssignment_4_1 ) )
                    // InternalMontiArcDSL.g:880:3: ( rule__Automaton__InitialStatesAssignment_4_1 )
                    {
                     before(grammarAccess.getAutomatonAccess().getInitialStatesAssignment_4_1()); 
                    // InternalMontiArcDSL.g:881:3: ( rule__Automaton__InitialStatesAssignment_4_1 )
                    // InternalMontiArcDSL.g:881:4: rule__Automaton__InitialStatesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__InitialStatesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getInitialStatesAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:885:2: ( ( rule__Automaton__TransitionsAssignment_4_2 ) )
                    {
                    // InternalMontiArcDSL.g:885:2: ( ( rule__Automaton__TransitionsAssignment_4_2 ) )
                    // InternalMontiArcDSL.g:886:3: ( rule__Automaton__TransitionsAssignment_4_2 )
                    {
                     before(grammarAccess.getAutomatonAccess().getTransitionsAssignment_4_2()); 
                    // InternalMontiArcDSL.g:887:3: ( rule__Automaton__TransitionsAssignment_4_2 )
                    // InternalMontiArcDSL.g:887:4: rule__Automaton__TransitionsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__TransitionsAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getTransitionsAssignment_4_2()); 

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
    // $ANTLR end "rule__Automaton__Alternatives_4"


    // $ANTLR start "rule__Package__NameAlternatives_1_0"
    // InternalMontiArcDSL.g:895:1: rule__Package__NameAlternatives_1_0 : ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) );
    public final void rule__Package__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:899:1: ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_MCQUALIFIEDNAME) ) {
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
                    // InternalMontiArcDSL.g:900:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:900:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:901:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:906:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:906:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:907:3: RULE_ID
                    {
                     before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Package__NameAlternatives_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMontiArcDSL.g:916:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCCollectionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:920:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCCollectionType ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMontiArcDSL.g:921:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiArcDSL.g:921:2: ( ruleMCPrimitiveType )
                    // InternalMontiArcDSL.g:922:3: ruleMCPrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMCPrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:927:2: ( ruleMCArrayType )
                    {
                    // InternalMontiArcDSL.g:927:2: ( ruleMCArrayType )
                    // InternalMontiArcDSL.g:928:3: ruleMCArrayType
                    {
                     before(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMCArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:933:2: ( ruleMCCollectionType )
                    {
                    // InternalMontiArcDSL.g:933:2: ( ruleMCCollectionType )
                    // InternalMontiArcDSL.g:934:3: ruleMCCollectionType
                    {
                     before(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMCCollectionType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__MCPrimitiveType__TypeAlternatives_0"
    // InternalMontiArcDSL.g:943:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) | ( 'String' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:947:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) | ( 'String' ) )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            case 19:
                {
                alt6=7;
                }
                break;
            case 20:
                {
                alt6=8;
                }
                break;
            case 21:
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
                    // InternalMontiArcDSL.g:948:2: ( 'boolean' )
                    {
                    // InternalMontiArcDSL.g:948:2: ( 'boolean' )
                    // InternalMontiArcDSL.g:949:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:954:2: ( 'byte' )
                    {
                    // InternalMontiArcDSL.g:954:2: ( 'byte' )
                    // InternalMontiArcDSL.g:955:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:960:2: ( 'short' )
                    {
                    // InternalMontiArcDSL.g:960:2: ( 'short' )
                    // InternalMontiArcDSL.g:961:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:966:2: ( 'int' )
                    {
                    // InternalMontiArcDSL.g:966:2: ( 'int' )
                    // InternalMontiArcDSL.g:967:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:972:2: ( 'long' )
                    {
                    // InternalMontiArcDSL.g:972:2: ( 'long' )
                    // InternalMontiArcDSL.g:973:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:978:2: ( 'char' )
                    {
                    // InternalMontiArcDSL.g:978:2: ( 'char' )
                    // InternalMontiArcDSL.g:979:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:984:2: ( 'float' )
                    {
                    // InternalMontiArcDSL.g:984:2: ( 'float' )
                    // InternalMontiArcDSL.g:985:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:990:2: ( 'double' )
                    {
                    // InternalMontiArcDSL.g:990:2: ( 'double' )
                    // InternalMontiArcDSL.g:991:3: 'double'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMontiArcDSL.g:996:2: ( 'String' )
                    {
                    // InternalMontiArcDSL.g:996:2: ( 'String' )
                    // InternalMontiArcDSL.g:997:3: 'String'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeStringKeyword_0_8()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeStringKeyword_0_8()); 

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
    // $ANTLR end "rule__MCPrimitiveType__TypeAlternatives_0"


    // $ANTLR start "rule__MCCollectionType__CollectionAlternatives_0_0"
    // InternalMontiArcDSL.g:1006:1: rule__MCCollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) );
    public final void rule__MCCollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1010:1: ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) )
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
                    // InternalMontiArcDSL.g:1011:2: ( 'Set' )
                    {
                    // InternalMontiArcDSL.g:1011:2: ( 'Set' )
                    // InternalMontiArcDSL.g:1012:3: 'Set'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1017:2: ( 'List' )
                    {
                    // InternalMontiArcDSL.g:1017:2: ( 'List' )
                    // InternalMontiArcDSL.g:1018:3: 'List'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1023:2: ( 'Map' )
                    {
                    // InternalMontiArcDSL.g:1023:2: ( 'Map' )
                    // InternalMontiArcDSL.g:1024:3: 'Map'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1029:2: ( 'Optional' )
                    {
                    // InternalMontiArcDSL.g:1029:2: ( 'Optional' )
                    // InternalMontiArcDSL.g:1030:3: 'Optional'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); 

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
    // $ANTLR end "rule__MCCollectionType__CollectionAlternatives_0_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMontiArcDSL.g:1039:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1043:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcDSL.g:1044:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1044:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1045:3: ruleNameExpression
                    {
                     before(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1050:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1050:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1051:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); 

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


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // InternalMontiArcDSL.g:1060:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1064:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMontiArcDSL.g:1065:2: ( ruleNumberLiteral )
                    {
                    // InternalMontiArcDSL.g:1065:2: ( ruleNumberLiteral )
                    // InternalMontiArcDSL.g:1066:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1071:2: ( ruleStringLiteral )
                    {
                    // InternalMontiArcDSL.g:1071:2: ( ruleStringLiteral )
                    // InternalMontiArcDSL.g:1072:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__MACompilationUnit__Group__0"
    // InternalMontiArcDSL.g:1081:1: rule__MACompilationUnit__Group__0 : rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 ;
    public final void rule__MACompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1085:1: ( rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 )
            // InternalMontiArcDSL.g:1086:2: rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MACompilationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__Group__0"


    // $ANTLR start "rule__MACompilationUnit__Group__0__Impl"
    // InternalMontiArcDSL.g:1093:1: rule__MACompilationUnit__Group__0__Impl : ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__MACompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1097:1: ( ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1098:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1098:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcDSL.g:1099:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcDSL.g:1100:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            // InternalMontiArcDSL.g:1100:3: rule__MACompilationUnit__PackageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__PackageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__Group__0__Impl"


    // $ANTLR start "rule__MACompilationUnit__Group__1"
    // InternalMontiArcDSL.g:1108:1: rule__MACompilationUnit__Group__1 : rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 ;
    public final void rule__MACompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1112:1: ( rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 )
            // InternalMontiArcDSL.g:1113:2: rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MACompilationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__Group__1"


    // $ANTLR start "rule__MACompilationUnit__Group__1__Impl"
    // InternalMontiArcDSL.g:1120:1: rule__MACompilationUnit__Group__1__Impl : ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__MACompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1124:1: ( ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcDSL.g:1125:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcDSL.g:1125:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcDSL.g:1126:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcDSL.g:1127:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==42) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1127:3: rule__MACompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MACompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__Group__1__Impl"


    // $ANTLR start "rule__MACompilationUnit__Group__2"
    // InternalMontiArcDSL.g:1135:1: rule__MACompilationUnit__Group__2 : rule__MACompilationUnit__Group__2__Impl ;
    public final void rule__MACompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1139:1: ( rule__MACompilationUnit__Group__2__Impl )
            // InternalMontiArcDSL.g:1140:2: rule__MACompilationUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__Group__2"


    // $ANTLR start "rule__MACompilationUnit__Group__2__Impl"
    // InternalMontiArcDSL.g:1146:1: rule__MACompilationUnit__Group__2__Impl : ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) ;
    public final void rule__MACompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1150:1: ( ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1151:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1151:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            // InternalMontiArcDSL.g:1152:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 
            // InternalMontiArcDSL.g:1153:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            // InternalMontiArcDSL.g:1153:3: rule__MACompilationUnit__ComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MACompilationUnit__ComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalMontiArcDSL.g:1162:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1166:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMontiArcDSL.g:1167:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalMontiArcDSL.g:1174:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1178:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1179:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1179:1: ( 'component' )
            // InternalMontiArcDSL.g:1180:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalMontiArcDSL.g:1189:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1193:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMontiArcDSL.g:1194:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalMontiArcDSL.g:1201:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1205:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1206:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1206:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1207:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1208:2: ( rule__Component__NameAssignment_1 )
            // InternalMontiArcDSL.g:1208:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalMontiArcDSL.g:1216:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1220:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMontiArcDSL.g:1221:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalMontiArcDSL.g:1228:1: rule__Component__Group__2__Impl : ( ( rule__Component__SignatureAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1232:1: ( ( ( rule__Component__SignatureAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1233:1: ( ( rule__Component__SignatureAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1233:1: ( ( rule__Component__SignatureAssignment_2 ) )
            // InternalMontiArcDSL.g:1234:2: ( rule__Component__SignatureAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getSignatureAssignment_2()); 
            // InternalMontiArcDSL.g:1235:2: ( rule__Component__SignatureAssignment_2 )
            // InternalMontiArcDSL.g:1235:3: rule__Component__SignatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__SignatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getSignatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalMontiArcDSL.g:1243:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1247:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMontiArcDSL.g:1248:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalMontiArcDSL.g:1255:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1259:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:1260:1: ( '{' )
            {
            // InternalMontiArcDSL.g:1260:1: ( '{' )
            // InternalMontiArcDSL.g:1261:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalMontiArcDSL.g:1270:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1274:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMontiArcDSL.g:1275:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalMontiArcDSL.g:1282:1: rule__Component__Group__4__Impl : ( ( rule__Component__ArcElementsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1286:1: ( ( ( rule__Component__ArcElementsAssignment_4 )* ) )
            // InternalMontiArcDSL.g:1287:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            {
            // InternalMontiArcDSL.g:1287:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            // InternalMontiArcDSL.g:1288:2: ( rule__Component__ArcElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getArcElementsAssignment_4()); 
            // InternalMontiArcDSL.g:1289:2: ( rule__Component__ArcElementsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=13 && LA11_0<=26)||LA11_0==33||(LA11_0>=35 && LA11_0<=36)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1289:3: rule__Component__ArcElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ArcElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getArcElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalMontiArcDSL.g:1297:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1301:1: ( rule__Component__Group__5__Impl )
            // InternalMontiArcDSL.g:1302:2: rule__Component__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalMontiArcDSL.g:1308:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1312:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:1313:1: ( '}' )
            {
            // InternalMontiArcDSL.g:1313:1: ( '}' )
            // InternalMontiArcDSL.g:1314:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // InternalMontiArcDSL.g:1324:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1328:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMontiArcDSL.g:1329:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // InternalMontiArcDSL.g:1336:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1340:1: ( ( () ) )
            // InternalMontiArcDSL.g:1341:1: ( () )
            {
            // InternalMontiArcDSL.g:1341:1: ( () )
            // InternalMontiArcDSL.g:1342:2: ()
            {
             before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            // InternalMontiArcDSL.g:1343:2: ()
            // InternalMontiArcDSL.g:1343:3: 
            {
            }

             after(grammarAccess.getSignatureAccess().getSignatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // InternalMontiArcDSL.g:1351:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1355:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMontiArcDSL.g:1356:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Signature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // InternalMontiArcDSL.g:1363:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__ParametersAssignment_1 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1367:1: ( ( ( rule__Signature__ParametersAssignment_1 )? ) )
            // InternalMontiArcDSL.g:1368:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:1368:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            // InternalMontiArcDSL.g:1369:2: ( rule__Signature__ParametersAssignment_1 )?
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1()); 
            // InternalMontiArcDSL.g:1370:2: ( rule__Signature__ParametersAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=13 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMontiArcDSL.g:1370:3: rule__Signature__ParametersAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__ParametersAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // InternalMontiArcDSL.g:1378:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1382:1: ( rule__Signature__Group__2__Impl )
            // InternalMontiArcDSL.g:1383:2: rule__Signature__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // InternalMontiArcDSL.g:1389:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )? ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1393:1: ( ( ( rule__Signature__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1394:1: ( ( rule__Signature__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1394:1: ( ( rule__Signature__Group_2__0 )? )
            // InternalMontiArcDSL.g:1395:2: ( rule__Signature__Group_2__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1396:2: ( rule__Signature__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMontiArcDSL.g:1396:3: rule__Signature__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Signature__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignatureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group_2__0"
    // InternalMontiArcDSL.g:1405:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1409:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalMontiArcDSL.g:1410:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Signature__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0"


    // $ANTLR start "rule__Signature__Group_2__0__Impl"
    // InternalMontiArcDSL.g:1417:1: rule__Signature__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1421:1: ( ( 'extends' ) )
            // InternalMontiArcDSL.g:1422:1: ( 'extends' )
            {
            // InternalMontiArcDSL.g:1422:1: ( 'extends' )
            // InternalMontiArcDSL.g:1423:2: 'extends'
            {
             before(grammarAccess.getSignatureAccess().getExtendsKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSignatureAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0__Impl"


    // $ANTLR start "rule__Signature__Group_2__1"
    // InternalMontiArcDSL.g:1432:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1436:1: ( rule__Signature__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1437:2: rule__Signature__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signature__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1"


    // $ANTLR start "rule__Signature__Group_2__1__Impl"
    // InternalMontiArcDSL.g:1443:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__TypeAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1447:1: ( ( ( rule__Signature__TypeAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1448:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1448:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1449:2: ( rule__Signature__TypeAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_2_1()); 
            // InternalMontiArcDSL.g:1450:2: ( rule__Signature__TypeAssignment_2_1 )
            // InternalMontiArcDSL.g:1450:3: rule__Signature__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Signature__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSignatureAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalMontiArcDSL.g:1459:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1463:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMontiArcDSL.g:1464:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalMontiArcDSL.g:1471:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParametersAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1475:1: ( ( ( rule__Parameters__ParametersAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1476:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1476:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            // InternalMontiArcDSL.g:1477:2: ( rule__Parameters__ParametersAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_0()); 
            // InternalMontiArcDSL.g:1478:2: ( rule__Parameters__ParametersAssignment_0 )
            // InternalMontiArcDSL.g:1478:3: rule__Parameters__ParametersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalMontiArcDSL.g:1486:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1490:1: ( rule__Parameters__Group__1__Impl )
            // InternalMontiArcDSL.g:1491:2: rule__Parameters__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalMontiArcDSL.g:1497:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1501:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:1502:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:1502:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalMontiArcDSL.g:1503:2: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:1504:2: ( rule__Parameters__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1504:3: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group_1__0"
    // InternalMontiArcDSL.g:1513:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1517:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalMontiArcDSL.g:1518:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Parameters__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group_1__0"


    // $ANTLR start "rule__Parameters__Group_1__0__Impl"
    // InternalMontiArcDSL.g:1525:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1529:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:1530:1: ( ',' )
            {
            // InternalMontiArcDSL.g:1530:1: ( ',' )
            // InternalMontiArcDSL.g:1531:2: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group_1__0__Impl"


    // $ANTLR start "rule__Parameters__Group_1__1"
    // InternalMontiArcDSL.g:1540:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1544:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalMontiArcDSL.g:1545:2: rule__Parameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group_1__1"


    // $ANTLR start "rule__Parameters__Group_1__1__Impl"
    // InternalMontiArcDSL.g:1551:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1555:1: ( ( ( rule__Parameters__ParametersAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:1556:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:1556:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            // InternalMontiArcDSL.g:1557:2: ( rule__Parameters__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 
            // InternalMontiArcDSL.g:1558:2: ( rule__Parameters__ParametersAssignment_1_1 )
            // InternalMontiArcDSL.g:1558:3: rule__Parameters__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMontiArcDSL.g:1567:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1571:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMontiArcDSL.g:1572:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMontiArcDSL.g:1579:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1583:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1584:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1584:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:1585:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:1586:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMontiArcDSL.g:1586:3: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMontiArcDSL.g:1594:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1598:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMontiArcDSL.g:1599:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMontiArcDSL.g:1606:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1610:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1611:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1611:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1612:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1613:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMontiArcDSL.g:1613:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalMontiArcDSL.g:1621:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1625:1: ( rule__Parameter__Group__2__Impl )
            // InternalMontiArcDSL.g:1626:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalMontiArcDSL.g:1632:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1636:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1637:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1637:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalMontiArcDSL.g:1638:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1639:2: ( rule__Parameter__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMontiArcDSL.g:1639:3: rule__Parameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group_2__0"
    // InternalMontiArcDSL.g:1648:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1652:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalMontiArcDSL.g:1653:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0"


    // $ANTLR start "rule__Parameter__Group_2__0__Impl"
    // InternalMontiArcDSL.g:1660:1: rule__Parameter__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1664:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:1665:1: ( '=' )
            {
            // InternalMontiArcDSL.g:1665:1: ( '=' )
            // InternalMontiArcDSL.g:1666:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__0__Impl"


    // $ANTLR start "rule__Parameter__Group_2__1"
    // InternalMontiArcDSL.g:1675:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1679:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1680:2: rule__Parameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1"


    // $ANTLR start "rule__Parameter__Group_2__1__Impl"
    // InternalMontiArcDSL.g:1686:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1690:1: ( ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1691:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1691:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1692:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:1693:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:1693:3: rule__Parameter__ExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_2__1__Impl"


    // $ANTLR start "rule__SubComponent__Group__0"
    // InternalMontiArcDSL.g:1702:1: rule__SubComponent__Group__0 : rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 ;
    public final void rule__SubComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1706:1: ( rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 )
            // InternalMontiArcDSL.g:1707:2: rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SubComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__0"


    // $ANTLR start "rule__SubComponent__Group__0__Impl"
    // InternalMontiArcDSL.g:1714:1: rule__SubComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__SubComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1718:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1719:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1719:1: ( 'component' )
            // InternalMontiArcDSL.g:1720:2: 'component'
            {
             before(grammarAccess.getSubComponentAccess().getComponentKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__0__Impl"


    // $ANTLR start "rule__SubComponent__Group__1"
    // InternalMontiArcDSL.g:1729:1: rule__SubComponent__Group__1 : rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 ;
    public final void rule__SubComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1733:1: ( rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 )
            // InternalMontiArcDSL.g:1734:2: rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SubComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__1"


    // $ANTLR start "rule__SubComponent__Group__1__Impl"
    // InternalMontiArcDSL.g:1741:1: rule__SubComponent__Group__1__Impl : ( ( rule__SubComponent__TypeAssignment_1 ) ) ;
    public final void rule__SubComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1745:1: ( ( ( rule__SubComponent__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1746:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1746:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:1747:2: ( rule__SubComponent__TypeAssignment_1 )
            {
             before(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:1748:2: ( rule__SubComponent__TypeAssignment_1 )
            // InternalMontiArcDSL.g:1748:3: rule__SubComponent__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__1__Impl"


    // $ANTLR start "rule__SubComponent__Group__2"
    // InternalMontiArcDSL.g:1756:1: rule__SubComponent__Group__2 : rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 ;
    public final void rule__SubComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1760:1: ( rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 )
            // InternalMontiArcDSL.g:1761:2: rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SubComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__2"


    // $ANTLR start "rule__SubComponent__Group__2__Impl"
    // InternalMontiArcDSL.g:1768:1: rule__SubComponent__Group__2__Impl : ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) ;
    public final void rule__SubComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1772:1: ( ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) )
            // InternalMontiArcDSL.g:1773:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:1773:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            // InternalMontiArcDSL.g:1774:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 
            // InternalMontiArcDSL.g:1775:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcDSL.g:1775:3: rule__SubComponent__ArgumentsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubComponent__ArgumentsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__2__Impl"


    // $ANTLR start "rule__SubComponent__Group__3"
    // InternalMontiArcDSL.g:1783:1: rule__SubComponent__Group__3 : rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 ;
    public final void rule__SubComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1787:1: ( rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 )
            // InternalMontiArcDSL.g:1788:2: rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SubComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__3"


    // $ANTLR start "rule__SubComponent__Group__3__Impl"
    // InternalMontiArcDSL.g:1795:1: rule__SubComponent__Group__3__Impl : ( ( rule__SubComponent__InstancesAssignment_3 ) ) ;
    public final void rule__SubComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1799:1: ( ( ( rule__SubComponent__InstancesAssignment_3 ) ) )
            // InternalMontiArcDSL.g:1800:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:1800:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            // InternalMontiArcDSL.g:1801:2: ( rule__SubComponent__InstancesAssignment_3 )
            {
             before(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 
            // InternalMontiArcDSL.g:1802:2: ( rule__SubComponent__InstancesAssignment_3 )
            // InternalMontiArcDSL.g:1802:3: rule__SubComponent__InstancesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__InstancesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__3__Impl"


    // $ANTLR start "rule__SubComponent__Group__4"
    // InternalMontiArcDSL.g:1810:1: rule__SubComponent__Group__4 : rule__SubComponent__Group__4__Impl ;
    public final void rule__SubComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1814:1: ( rule__SubComponent__Group__4__Impl )
            // InternalMontiArcDSL.g:1815:2: rule__SubComponent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubComponent__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__4"


    // $ANTLR start "rule__SubComponent__Group__4__Impl"
    // InternalMontiArcDSL.g:1821:1: rule__SubComponent__Group__4__Impl : ( ';' ) ;
    public final void rule__SubComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1825:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1826:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1826:1: ( ';' )
            // InternalMontiArcDSL.g:1827:2: ';'
            {
             before(grammarAccess.getSubComponentAccess().getSemicolonKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSubComponentAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__Group__4__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // InternalMontiArcDSL.g:1837:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1841:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalMontiArcDSL.g:1842:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // InternalMontiArcDSL.g:1849:1: rule__Connector__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1853:1: ( ( 'connect' ) )
            // InternalMontiArcDSL.g:1854:1: ( 'connect' )
            {
            // InternalMontiArcDSL.g:1854:1: ( 'connect' )
            // InternalMontiArcDSL.g:1855:2: 'connect'
            {
             before(grammarAccess.getConnectorAccess().getConnectKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getConnectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // InternalMontiArcDSL.g:1864:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1868:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalMontiArcDSL.g:1869:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // InternalMontiArcDSL.g:1876:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__SourceAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1880:1: ( ( ( rule__Connector__SourceAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1881:1: ( ( rule__Connector__SourceAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1881:1: ( ( rule__Connector__SourceAssignment_1 ) )
            // InternalMontiArcDSL.g:1882:2: ( rule__Connector__SourceAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAssignment_1()); 
            // InternalMontiArcDSL.g:1883:2: ( rule__Connector__SourceAssignment_1 )
            // InternalMontiArcDSL.g:1883:3: rule__Connector__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connector__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // InternalMontiArcDSL.g:1891:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1895:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalMontiArcDSL.g:1896:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // InternalMontiArcDSL.g:1903:1: rule__Connector__Group__2__Impl : ( '->' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1907:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:1908:1: ( '->' )
            {
            // InternalMontiArcDSL.g:1908:1: ( '->' )
            // InternalMontiArcDSL.g:1909:2: '->'
            {
             before(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // InternalMontiArcDSL.g:1918:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1922:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalMontiArcDSL.g:1923:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // InternalMontiArcDSL.g:1930:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__TargetsAssignment_3 ) ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1934:1: ( ( ( rule__Connector__TargetsAssignment_3 ) ) )
            // InternalMontiArcDSL.g:1935:1: ( ( rule__Connector__TargetsAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:1935:1: ( ( rule__Connector__TargetsAssignment_3 ) )
            // InternalMontiArcDSL.g:1936:2: ( rule__Connector__TargetsAssignment_3 )
            {
             before(grammarAccess.getConnectorAccess().getTargetsAssignment_3()); 
            // InternalMontiArcDSL.g:1937:2: ( rule__Connector__TargetsAssignment_3 )
            // InternalMontiArcDSL.g:1937:3: rule__Connector__TargetsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TargetsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTargetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // InternalMontiArcDSL.g:1945:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1949:1: ( rule__Connector__Group__4__Impl )
            // InternalMontiArcDSL.g:1950:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // InternalMontiArcDSL.g:1956:1: rule__Connector__Group__4__Impl : ( ';' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1960:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1961:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1961:1: ( ';' )
            // InternalMontiArcDSL.g:1962:2: ';'
            {
             before(grammarAccess.getConnectorAccess().getSemicolonKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__Ports__Group__0"
    // InternalMontiArcDSL.g:1972:1: rule__Ports__Group__0 : rule__Ports__Group__0__Impl rule__Ports__Group__1 ;
    public final void rule__Ports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1976:1: ( rule__Ports__Group__0__Impl rule__Ports__Group__1 )
            // InternalMontiArcDSL.g:1977:2: rule__Ports__Group__0__Impl rule__Ports__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Ports__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__0"


    // $ANTLR start "rule__Ports__Group__0__Impl"
    // InternalMontiArcDSL.g:1984:1: rule__Ports__Group__0__Impl : ( 'port' ) ;
    public final void rule__Ports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1988:1: ( ( 'port' ) )
            // InternalMontiArcDSL.g:1989:1: ( 'port' )
            {
            // InternalMontiArcDSL.g:1989:1: ( 'port' )
            // InternalMontiArcDSL.g:1990:2: 'port'
            {
             before(grammarAccess.getPortsAccess().getPortKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPortsAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__0__Impl"


    // $ANTLR start "rule__Ports__Group__1"
    // InternalMontiArcDSL.g:1999:1: rule__Ports__Group__1 : rule__Ports__Group__1__Impl rule__Ports__Group__2 ;
    public final void rule__Ports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2003:1: ( rule__Ports__Group__1__Impl rule__Ports__Group__2 )
            // InternalMontiArcDSL.g:2004:2: rule__Ports__Group__1__Impl rule__Ports__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Ports__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__1"


    // $ANTLR start "rule__Ports__Group__1__Impl"
    // InternalMontiArcDSL.g:2011:1: rule__Ports__Group__1__Impl : ( ( rule__Ports__PortsAssignment_1 ) ) ;
    public final void rule__Ports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2015:1: ( ( ( rule__Ports__PortsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2016:1: ( ( rule__Ports__PortsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2016:1: ( ( rule__Ports__PortsAssignment_1 ) )
            // InternalMontiArcDSL.g:2017:2: ( rule__Ports__PortsAssignment_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_1()); 
            // InternalMontiArcDSL.g:2018:2: ( rule__Ports__PortsAssignment_1 )
            // InternalMontiArcDSL.g:2018:3: rule__Ports__PortsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ports__PortsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getPortsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__1__Impl"


    // $ANTLR start "rule__Ports__Group__2"
    // InternalMontiArcDSL.g:2026:1: rule__Ports__Group__2 : rule__Ports__Group__2__Impl rule__Ports__Group__3 ;
    public final void rule__Ports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2030:1: ( rule__Ports__Group__2__Impl rule__Ports__Group__3 )
            // InternalMontiArcDSL.g:2031:2: rule__Ports__Group__2__Impl rule__Ports__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Ports__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__2"


    // $ANTLR start "rule__Ports__Group__2__Impl"
    // InternalMontiArcDSL.g:2038:1: rule__Ports__Group__2__Impl : ( ( rule__Ports__Group_2__0 )* ) ;
    public final void rule__Ports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2042:1: ( ( ( rule__Ports__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:2043:1: ( ( rule__Ports__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:2043:1: ( ( rule__Ports__Group_2__0 )* )
            // InternalMontiArcDSL.g:2044:2: ( rule__Ports__Group_2__0 )*
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2045:2: ( rule__Ports__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2045:3: rule__Ports__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Ports__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPortsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__2__Impl"


    // $ANTLR start "rule__Ports__Group__3"
    // InternalMontiArcDSL.g:2053:1: rule__Ports__Group__3 : rule__Ports__Group__3__Impl ;
    public final void rule__Ports__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2057:1: ( rule__Ports__Group__3__Impl )
            // InternalMontiArcDSL.g:2058:2: rule__Ports__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ports__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__3"


    // $ANTLR start "rule__Ports__Group__3__Impl"
    // InternalMontiArcDSL.g:2064:1: rule__Ports__Group__3__Impl : ( ';' ) ;
    public final void rule__Ports__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2068:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2069:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2069:1: ( ';' )
            // InternalMontiArcDSL.g:2070:2: ';'
            {
             before(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group__3__Impl"


    // $ANTLR start "rule__Ports__Group_2__0"
    // InternalMontiArcDSL.g:2080:1: rule__Ports__Group_2__0 : rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 ;
    public final void rule__Ports__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2084:1: ( rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 )
            // InternalMontiArcDSL.g:2085:2: rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Ports__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ports__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group_2__0"


    // $ANTLR start "rule__Ports__Group_2__0__Impl"
    // InternalMontiArcDSL.g:2092:1: rule__Ports__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Ports__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2096:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2097:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2097:1: ( ',' )
            // InternalMontiArcDSL.g:2098:2: ','
            {
             before(grammarAccess.getPortsAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPortsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group_2__0__Impl"


    // $ANTLR start "rule__Ports__Group_2__1"
    // InternalMontiArcDSL.g:2107:1: rule__Ports__Group_2__1 : rule__Ports__Group_2__1__Impl ;
    public final void rule__Ports__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2111:1: ( rule__Ports__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2112:2: rule__Ports__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ports__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group_2__1"


    // $ANTLR start "rule__Ports__Group_2__1__Impl"
    // InternalMontiArcDSL.g:2118:1: rule__Ports__Group_2__1__Impl : ( ( rule__Ports__PortsAssignment_2_1 ) ) ;
    public final void rule__Ports__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2122:1: ( ( ( rule__Ports__PortsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2123:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2123:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2124:2: ( rule__Ports__PortsAssignment_2_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_2_1()); 
            // InternalMontiArcDSL.g:2125:2: ( rule__Ports__PortsAssignment_2_1 )
            // InternalMontiArcDSL.g:2125:3: rule__Ports__PortsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Ports__PortsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getPortsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__Group_2__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalMontiArcDSL.g:2134:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2138:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMontiArcDSL.g:2139:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalMontiArcDSL.g:2146:1: rule__Port__Group__0__Impl : ( ( rule__Port__SyncAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2150:1: ( ( ( rule__Port__SyncAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2151:1: ( ( rule__Port__SyncAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2151:1: ( ( rule__Port__SyncAssignment_0 ) )
            // InternalMontiArcDSL.g:2152:2: ( rule__Port__SyncAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getSyncAssignment_0()); 
            // InternalMontiArcDSL.g:2153:2: ( rule__Port__SyncAssignment_0 )
            // InternalMontiArcDSL.g:2153:3: rule__Port__SyncAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Port__SyncAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getSyncAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalMontiArcDSL.g:2161:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2165:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMontiArcDSL.g:2166:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalMontiArcDSL.g:2173:1: rule__Port__Group__1__Impl : ( ( rule__Port__Alternatives_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2177:1: ( ( ( rule__Port__Alternatives_1 ) ) )
            // InternalMontiArcDSL.g:2178:1: ( ( rule__Port__Alternatives_1 ) )
            {
            // InternalMontiArcDSL.g:2178:1: ( ( rule__Port__Alternatives_1 ) )
            // InternalMontiArcDSL.g:2179:2: ( rule__Port__Alternatives_1 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_1()); 
            // InternalMontiArcDSL.g:2180:2: ( rule__Port__Alternatives_1 )
            // InternalMontiArcDSL.g:2180:3: rule__Port__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalMontiArcDSL.g:2188:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2192:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalMontiArcDSL.g:2193:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalMontiArcDSL.g:2200:1: rule__Port__Group__2__Impl : ( ( rule__Port__TypeAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2204:1: ( ( ( rule__Port__TypeAssignment_2 ) ) )
            // InternalMontiArcDSL.g:2205:1: ( ( rule__Port__TypeAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:2205:1: ( ( rule__Port__TypeAssignment_2 ) )
            // InternalMontiArcDSL.g:2206:2: ( rule__Port__TypeAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_2()); 
            // InternalMontiArcDSL.g:2207:2: ( rule__Port__TypeAssignment_2 )
            // InternalMontiArcDSL.g:2207:3: rule__Port__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalMontiArcDSL.g:2215:1: rule__Port__Group__3 : rule__Port__Group__3__Impl ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2219:1: ( rule__Port__Group__3__Impl )
            // InternalMontiArcDSL.g:2220:2: rule__Port__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalMontiArcDSL.g:2226:1: rule__Port__Group__3__Impl : ( ( rule__Port__NamesAssignment_3 )? ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2230:1: ( ( ( rule__Port__NamesAssignment_3 )? ) )
            // InternalMontiArcDSL.g:2231:1: ( ( rule__Port__NamesAssignment_3 )? )
            {
            // InternalMontiArcDSL.g:2231:1: ( ( rule__Port__NamesAssignment_3 )? )
            // InternalMontiArcDSL.g:2232:2: ( rule__Port__NamesAssignment_3 )?
            {
             before(grammarAccess.getPortAccess().getNamesAssignment_3()); 
            // InternalMontiArcDSL.g:2233:2: ( rule__Port__NamesAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMontiArcDSL.g:2233:3: rule__Port__NamesAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__NamesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getNamesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Names__Group__0"
    // InternalMontiArcDSL.g:2242:1: rule__Names__Group__0 : rule__Names__Group__0__Impl rule__Names__Group__1 ;
    public final void rule__Names__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2246:1: ( rule__Names__Group__0__Impl rule__Names__Group__1 )
            // InternalMontiArcDSL.g:2247:2: rule__Names__Group__0__Impl rule__Names__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Names__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Names__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group__0"


    // $ANTLR start "rule__Names__Group__0__Impl"
    // InternalMontiArcDSL.g:2254:1: rule__Names__Group__0__Impl : ( ( rule__Names__NamesAssignment_0 ) ) ;
    public final void rule__Names__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2258:1: ( ( ( rule__Names__NamesAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2259:1: ( ( rule__Names__NamesAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2259:1: ( ( rule__Names__NamesAssignment_0 ) )
            // InternalMontiArcDSL.g:2260:2: ( rule__Names__NamesAssignment_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_0()); 
            // InternalMontiArcDSL.g:2261:2: ( rule__Names__NamesAssignment_0 )
            // InternalMontiArcDSL.g:2261:3: rule__Names__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group__0__Impl"


    // $ANTLR start "rule__Names__Group__1"
    // InternalMontiArcDSL.g:2269:1: rule__Names__Group__1 : rule__Names__Group__1__Impl ;
    public final void rule__Names__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2273:1: ( rule__Names__Group__1__Impl )
            // InternalMontiArcDSL.g:2274:2: rule__Names__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Names__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group__1"


    // $ANTLR start "rule__Names__Group__1__Impl"
    // InternalMontiArcDSL.g:2280:1: rule__Names__Group__1__Impl : ( ( rule__Names__Group_1__0 )* ) ;
    public final void rule__Names__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2284:1: ( ( ( rule__Names__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:2285:1: ( ( rule__Names__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:2285:1: ( ( rule__Names__Group_1__0 )* )
            // InternalMontiArcDSL.g:2286:2: ( rule__Names__Group_1__0 )*
            {
             before(grammarAccess.getNamesAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2287:2: ( rule__Names__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2287:3: rule__Names__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Names__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNamesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group__1__Impl"


    // $ANTLR start "rule__Names__Group_1__0"
    // InternalMontiArcDSL.g:2296:1: rule__Names__Group_1__0 : rule__Names__Group_1__0__Impl rule__Names__Group_1__1 ;
    public final void rule__Names__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2300:1: ( rule__Names__Group_1__0__Impl rule__Names__Group_1__1 )
            // InternalMontiArcDSL.g:2301:2: rule__Names__Group_1__0__Impl rule__Names__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Names__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Names__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group_1__0"


    // $ANTLR start "rule__Names__Group_1__0__Impl"
    // InternalMontiArcDSL.g:2308:1: rule__Names__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Names__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2312:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2313:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2313:1: ( ',' )
            // InternalMontiArcDSL.g:2314:2: ','
            {
             before(grammarAccess.getNamesAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getNamesAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group_1__0__Impl"


    // $ANTLR start "rule__Names__Group_1__1"
    // InternalMontiArcDSL.g:2323:1: rule__Names__Group_1__1 : rule__Names__Group_1__1__Impl ;
    public final void rule__Names__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2327:1: ( rule__Names__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2328:2: rule__Names__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Names__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group_1__1"


    // $ANTLR start "rule__Names__Group_1__1__Impl"
    // InternalMontiArcDSL.g:2334:1: rule__Names__Group_1__1__Impl : ( ( rule__Names__NamesAssignment_1_1 ) ) ;
    public final void rule__Names__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2338:1: ( ( ( rule__Names__NamesAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2339:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2339:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2340:2: ( rule__Names__NamesAssignment_1_1 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 
            // InternalMontiArcDSL.g:2341:2: ( rule__Names__NamesAssignment_1_1 )
            // InternalMontiArcDSL.g:2341:3: rule__Names__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__Group_1__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMontiArcDSL.g:2350:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2354:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMontiArcDSL.g:2355:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMontiArcDSL.g:2362:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2366:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2367:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2367:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:2368:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:2369:2: ( rule__Variable__TypeAssignment_0 )
            // InternalMontiArcDSL.g:2369:3: rule__Variable__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMontiArcDSL.g:2377:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2381:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMontiArcDSL.g:2382:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMontiArcDSL.g:2389:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NamesAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2393:1: ( ( ( rule__Variable__NamesAssignment_1 )? ) )
            // InternalMontiArcDSL.g:2394:1: ( ( rule__Variable__NamesAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:2394:1: ( ( rule__Variable__NamesAssignment_1 )? )
            // InternalMontiArcDSL.g:2395:2: ( rule__Variable__NamesAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1()); 
            // InternalMontiArcDSL.g:2396:2: ( rule__Variable__NamesAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiArcDSL.g:2396:3: rule__Variable__NamesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__NamesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMontiArcDSL.g:2404:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2408:1: ( rule__Variable__Group__2__Impl )
            // InternalMontiArcDSL.g:2409:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMontiArcDSL.g:2415:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2419:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2420:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2420:1: ( ';' )
            // InternalMontiArcDSL.g:2421:2: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Automaton__Group__0"
    // InternalMontiArcDSL.g:2431:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2435:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalMontiArcDSL.g:2436:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Automaton__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__0"


    // $ANTLR start "rule__Automaton__Group__0__Impl"
    // InternalMontiArcDSL.g:2443:1: rule__Automaton__Group__0__Impl : ( () ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2447:1: ( ( () ) )
            // InternalMontiArcDSL.g:2448:1: ( () )
            {
            // InternalMontiArcDSL.g:2448:1: ( () )
            // InternalMontiArcDSL.g:2449:2: ()
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 
            // InternalMontiArcDSL.g:2450:2: ()
            // InternalMontiArcDSL.g:2450:3: 
            {
            }

             after(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__0__Impl"


    // $ANTLR start "rule__Automaton__Group__1"
    // InternalMontiArcDSL.g:2458:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2462:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalMontiArcDSL.g:2463:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Automaton__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__1"


    // $ANTLR start "rule__Automaton__Group__1__Impl"
    // InternalMontiArcDSL.g:2470:1: rule__Automaton__Group__1__Impl : ( 'automaton' ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2474:1: ( ( 'automaton' ) )
            // InternalMontiArcDSL.g:2475:1: ( 'automaton' )
            {
            // InternalMontiArcDSL.g:2475:1: ( 'automaton' )
            // InternalMontiArcDSL.g:2476:2: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__1__Impl"


    // $ANTLR start "rule__Automaton__Group__2"
    // InternalMontiArcDSL.g:2485:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2489:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalMontiArcDSL.g:2490:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Automaton__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__2"


    // $ANTLR start "rule__Automaton__Group__2__Impl"
    // InternalMontiArcDSL.g:2497:1: rule__Automaton__Group__2__Impl : ( ( rule__Automaton__NameAssignment_2 )? ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2501:1: ( ( ( rule__Automaton__NameAssignment_2 )? ) )
            // InternalMontiArcDSL.g:2502:1: ( ( rule__Automaton__NameAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:2502:1: ( ( rule__Automaton__NameAssignment_2 )? )
            // InternalMontiArcDSL.g:2503:2: ( rule__Automaton__NameAssignment_2 )?
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_2()); 
            // InternalMontiArcDSL.g:2504:2: ( rule__Automaton__NameAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiArcDSL.g:2504:3: rule__Automaton__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__2__Impl"


    // $ANTLR start "rule__Automaton__Group__3"
    // InternalMontiArcDSL.g:2512:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2516:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalMontiArcDSL.g:2517:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Automaton__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__3"


    // $ANTLR start "rule__Automaton__Group__3__Impl"
    // InternalMontiArcDSL.g:2524:1: rule__Automaton__Group__3__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2528:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:2529:1: ( '{' )
            {
            // InternalMontiArcDSL.g:2529:1: ( '{' )
            // InternalMontiArcDSL.g:2530:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__3__Impl"


    // $ANTLR start "rule__Automaton__Group__4"
    // InternalMontiArcDSL.g:2539:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2543:1: ( rule__Automaton__Group__4__Impl rule__Automaton__Group__5 )
            // InternalMontiArcDSL.g:2544:2: rule__Automaton__Group__4__Impl rule__Automaton__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Automaton__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__4"


    // $ANTLR start "rule__Automaton__Group__4__Impl"
    // InternalMontiArcDSL.g:2551:1: rule__Automaton__Group__4__Impl : ( ( rule__Automaton__Alternatives_4 )* ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2555:1: ( ( ( rule__Automaton__Alternatives_4 )* ) )
            // InternalMontiArcDSL.g:2556:1: ( ( rule__Automaton__Alternatives_4 )* )
            {
            // InternalMontiArcDSL.g:2556:1: ( ( rule__Automaton__Alternatives_4 )* )
            // InternalMontiArcDSL.g:2557:2: ( rule__Automaton__Alternatives_4 )*
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_4()); 
            // InternalMontiArcDSL.g:2558:2: ( rule__Automaton__Alternatives_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=37 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2558:3: rule__Automaton__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Automaton__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__4__Impl"


    // $ANTLR start "rule__Automaton__Group__5"
    // InternalMontiArcDSL.g:2566:1: rule__Automaton__Group__5 : rule__Automaton__Group__5__Impl ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2570:1: ( rule__Automaton__Group__5__Impl )
            // InternalMontiArcDSL.g:2571:2: rule__Automaton__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__5"


    // $ANTLR start "rule__Automaton__Group__5__Impl"
    // InternalMontiArcDSL.g:2577:1: rule__Automaton__Group__5__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2581:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:2582:1: ( '}' )
            {
            // InternalMontiArcDSL.g:2582:1: ( '}' )
            // InternalMontiArcDSL.g:2583:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__5__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalMontiArcDSL.g:2593:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2597:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMontiArcDSL.g:2598:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalMontiArcDSL.g:2605:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2609:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:2610:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:2610:1: ( 'state' )
            // InternalMontiArcDSL.g:2611:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalMontiArcDSL.g:2620:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2624:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMontiArcDSL.g:2625:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalMontiArcDSL.g:2632:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2636:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2637:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2637:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2638:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2639:2: ( rule__State__NameAssignment_1 )
            // InternalMontiArcDSL.g:2639:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalMontiArcDSL.g:2647:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2651:1: ( rule__State__Group__2__Impl )
            // InternalMontiArcDSL.g:2652:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalMontiArcDSL.g:2658:1: rule__State__Group__2__Impl : ( ';' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2662:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2663:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2663:1: ( ';' )
            // InternalMontiArcDSL.g:2664:2: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__InitialState__Group__0"
    // InternalMontiArcDSL.g:2674:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2678:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalMontiArcDSL.g:2679:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InitialState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0"


    // $ANTLR start "rule__InitialState__Group__0__Impl"
    // InternalMontiArcDSL.g:2686:1: rule__InitialState__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2690:1: ( ( 'initial' ) )
            // InternalMontiArcDSL.g:2691:1: ( 'initial' )
            {
            // InternalMontiArcDSL.g:2691:1: ( 'initial' )
            // InternalMontiArcDSL.g:2692:2: 'initial'
            {
             before(grammarAccess.getInitialStateAccess().getInitialKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getInitialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__0__Impl"


    // $ANTLR start "rule__InitialState__Group__1"
    // InternalMontiArcDSL.g:2701:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2705:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalMontiArcDSL.g:2706:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__InitialState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1"


    // $ANTLR start "rule__InitialState__Group__1__Impl"
    // InternalMontiArcDSL.g:2713:1: rule__InitialState__Group__1__Impl : ( ( rule__InitialState__NameAssignment_1 ) ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2717:1: ( ( ( rule__InitialState__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2718:1: ( ( rule__InitialState__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2718:1: ( ( rule__InitialState__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2719:2: ( rule__InitialState__NameAssignment_1 )
            {
             before(grammarAccess.getInitialStateAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2720:2: ( rule__InitialState__NameAssignment_1 )
            // InternalMontiArcDSL.g:2720:3: rule__InitialState__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__1__Impl"


    // $ANTLR start "rule__InitialState__Group__2"
    // InternalMontiArcDSL.g:2728:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl rule__InitialState__Group__3 ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2732:1: ( rule__InitialState__Group__2__Impl rule__InitialState__Group__3 )
            // InternalMontiArcDSL.g:2733:2: rule__InitialState__Group__2__Impl rule__InitialState__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__InitialState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2"


    // $ANTLR start "rule__InitialState__Group__2__Impl"
    // InternalMontiArcDSL.g:2740:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Group_2__0 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2744:1: ( ( ( rule__InitialState__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2745:1: ( ( rule__InitialState__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2745:1: ( ( rule__InitialState__Group_2__0 )? )
            // InternalMontiArcDSL.g:2746:2: ( rule__InitialState__Group_2__0 )?
            {
             before(grammarAccess.getInitialStateAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2747:2: ( rule__InitialState__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMontiArcDSL.g:2747:3: rule__InitialState__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InitialState__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialStateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__2__Impl"


    // $ANTLR start "rule__InitialState__Group__3"
    // InternalMontiArcDSL.g:2755:1: rule__InitialState__Group__3 : rule__InitialState__Group__3__Impl ;
    public final void rule__InitialState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2759:1: ( rule__InitialState__Group__3__Impl )
            // InternalMontiArcDSL.g:2760:2: rule__InitialState__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__3"


    // $ANTLR start "rule__InitialState__Group__3__Impl"
    // InternalMontiArcDSL.g:2766:1: rule__InitialState__Group__3__Impl : ( ';' ) ;
    public final void rule__InitialState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2770:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2771:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2771:1: ( ';' )
            // InternalMontiArcDSL.g:2772:2: ';'
            {
             before(grammarAccess.getInitialStateAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group__3__Impl"


    // $ANTLR start "rule__InitialState__Group_2__0"
    // InternalMontiArcDSL.g:2782:1: rule__InitialState__Group_2__0 : rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1 ;
    public final void rule__InitialState__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2786:1: ( rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1 )
            // InternalMontiArcDSL.g:2787:2: rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__InitialState__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InitialState__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2__0"


    // $ANTLR start "rule__InitialState__Group_2__0__Impl"
    // InternalMontiArcDSL.g:2794:1: rule__InitialState__Group_2__0__Impl : ( '/' ) ;
    public final void rule__InitialState__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2798:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:2799:1: ( '/' )
            {
            // InternalMontiArcDSL.g:2799:1: ( '/' )
            // InternalMontiArcDSL.g:2800:2: '/'
            {
             before(grammarAccess.getInitialStateAccess().getSolidusKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2__0__Impl"


    // $ANTLR start "rule__InitialState__Group_2__1"
    // InternalMontiArcDSL.g:2809:1: rule__InitialState__Group_2__1 : rule__InitialState__Group_2__1__Impl ;
    public final void rule__InitialState__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2813:1: ( rule__InitialState__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2814:2: rule__InitialState__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2__1"


    // $ANTLR start "rule__InitialState__Group_2__1__Impl"
    // InternalMontiArcDSL.g:2820:1: rule__InitialState__Group_2__1__Impl : ( ( rule__InitialState__BlockAssignment_2_1 ) ) ;
    public final void rule__InitialState__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2824:1: ( ( ( rule__InitialState__BlockAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2825:1: ( ( rule__InitialState__BlockAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2825:1: ( ( rule__InitialState__BlockAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2826:2: ( rule__InitialState__BlockAssignment_2_1 )
            {
             before(grammarAccess.getInitialStateAccess().getBlockAssignment_2_1()); 
            // InternalMontiArcDSL.g:2827:2: ( rule__InitialState__BlockAssignment_2_1 )
            // InternalMontiArcDSL.g:2827:3: rule__InitialState__BlockAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__InitialState__BlockAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialStateAccess().getBlockAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMontiArcDSL.g:2836:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2840:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMontiArcDSL.g:2841:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMontiArcDSL.g:2848:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2852:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2853:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2853:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:2854:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:2855:2: ( rule__Transition__SourceAssignment_0 )
            // InternalMontiArcDSL.g:2855:3: rule__Transition__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMontiArcDSL.g:2863:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2867:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMontiArcDSL.g:2868:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMontiArcDSL.g:2875:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2879:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:2880:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:2880:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalMontiArcDSL.g:2881:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2882:2: ( rule__Transition__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMontiArcDSL.g:2882:3: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMontiArcDSL.g:2890:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2894:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMontiArcDSL.g:2895:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMontiArcDSL.g:2902:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2906:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2907:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2907:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMontiArcDSL.g:2908:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2909:2: ( rule__Transition__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMontiArcDSL.g:2909:3: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalMontiArcDSL.g:2917:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2921:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMontiArcDSL.g:2922:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalMontiArcDSL.g:2929:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2933:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalMontiArcDSL.g:2934:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalMontiArcDSL.g:2934:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalMontiArcDSL.g:2935:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:2936:2: ( rule__Transition__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMontiArcDSL.g:2936:3: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalMontiArcDSL.g:2944:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2948:1: ( rule__Transition__Group__4__Impl )
            // InternalMontiArcDSL.g:2949:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalMontiArcDSL.g:2955:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2959:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2960:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2960:1: ( ';' )
            // InternalMontiArcDSL.g:2961:2: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group_1__0"
    // InternalMontiArcDSL.g:2971:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2975:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalMontiArcDSL.g:2976:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // InternalMontiArcDSL.g:2983:1: rule__Transition__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2987:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:2988:1: ( '->' )
            {
            // InternalMontiArcDSL.g:2988:1: ( '->' )
            // InternalMontiArcDSL.g:2989:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // InternalMontiArcDSL.g:2998:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3002:1: ( rule__Transition__Group_1__1__Impl )
            // InternalMontiArcDSL.g:3003:2: rule__Transition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // InternalMontiArcDSL.g:3009:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TargetAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3013:1: ( ( ( rule__Transition__TargetAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:3014:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:3014:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            // InternalMontiArcDSL.g:3015:2: ( rule__Transition__TargetAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 
            // InternalMontiArcDSL.g:3016:2: ( rule__Transition__TargetAssignment_1_1 )
            // InternalMontiArcDSL.g:3016:3: rule__Transition__TargetAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalMontiArcDSL.g:3025:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3029:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMontiArcDSL.g:3030:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalMontiArcDSL.g:3037:1: rule__Transition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3041:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3042:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3042:1: ( '[' )
            // InternalMontiArcDSL.g:3043:2: '['
            {
             before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalMontiArcDSL.g:3052:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3056:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalMontiArcDSL.g:3057:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalMontiArcDSL.g:3064:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3068:1: ( ( ( rule__Transition__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3069:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3069:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3070:2: ( rule__Transition__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:3071:2: ( rule__Transition__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:3071:3: rule__Transition__ExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_2__2"
    // InternalMontiArcDSL.g:3079:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3083:1: ( rule__Transition__Group_2__2__Impl )
            // InternalMontiArcDSL.g:3084:2: rule__Transition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__2"


    // $ANTLR start "rule__Transition__Group_2__2__Impl"
    // InternalMontiArcDSL.g:3090:1: rule__Transition__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3094:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3095:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3095:1: ( ']' )
            // InternalMontiArcDSL.g:3096:2: ']'
            {
             before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__2__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // InternalMontiArcDSL.g:3106:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3110:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalMontiArcDSL.g:3111:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // InternalMontiArcDSL.g:3118:1: rule__Transition__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3122:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:3123:1: ( '/' )
            {
            // InternalMontiArcDSL.g:3123:1: ( '/' )
            // InternalMontiArcDSL.g:3124:2: '/'
            {
             before(grammarAccess.getTransitionAccess().getSolidusKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSolidusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // InternalMontiArcDSL.g:3133:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3137:1: ( rule__Transition__Group_3__1__Impl )
            // InternalMontiArcDSL.g:3138:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // InternalMontiArcDSL.g:3144:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ReactionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3148:1: ( ( ( rule__Transition__ReactionAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:3149:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:3149:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            // InternalMontiArcDSL.g:3150:2: ( rule__Transition__ReactionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 
            // InternalMontiArcDSL.g:3151:2: ( rule__Transition__ReactionAssignment_3_1 )
            // InternalMontiArcDSL.g:3151:3: rule__Transition__ReactionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ReactionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalMontiArcDSL.g:3160:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3164:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMontiArcDSL.g:3165:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalMontiArcDSL.g:3172:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3176:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:3177:1: ( '{' )
            {
            // InternalMontiArcDSL.g:3177:1: ( '{' )
            // InternalMontiArcDSL.g:3178:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMontiArcDSL.g:3187:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3191:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMontiArcDSL.g:3192:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalMontiArcDSL.g:3199:1: rule__Block__Group__1__Impl : ( ( rule__Block__Group_1__0 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3203:1: ( ( ( rule__Block__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:3204:1: ( ( rule__Block__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:3204:1: ( ( rule__Block__Group_1__0 )? )
            // InternalMontiArcDSL.g:3205:2: ( rule__Block__Group_1__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:3206:2: ( rule__Block__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==31) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalMontiArcDSL.g:3206:3: rule__Block__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalMontiArcDSL.g:3214:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3218:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMontiArcDSL.g:3219:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalMontiArcDSL.g:3226:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3230:1: ( ( ( rule__Block__ExpressionsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:3231:1: ( ( rule__Block__ExpressionsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:3231:1: ( ( rule__Block__ExpressionsAssignment_2 ) )
            // InternalMontiArcDSL.g:3232:2: ( rule__Block__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalMontiArcDSL.g:3233:2: ( rule__Block__ExpressionsAssignment_2 )
            // InternalMontiArcDSL.g:3233:3: rule__Block__ExpressionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Block__ExpressionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalMontiArcDSL.g:3241:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3245:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalMontiArcDSL.g:3246:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalMontiArcDSL.g:3253:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )* ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3257:1: ( ( ( rule__Block__Group_3__0 )* ) )
            // InternalMontiArcDSL.g:3258:1: ( ( rule__Block__Group_3__0 )* )
            {
            // InternalMontiArcDSL.g:3258:1: ( ( rule__Block__Group_3__0 )* )
            // InternalMontiArcDSL.g:3259:2: ( rule__Block__Group_3__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:3260:2: ( rule__Block__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3260:3: rule__Block__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Block__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalMontiArcDSL.g:3268:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3272:1: ( rule__Block__Group__4__Impl )
            // InternalMontiArcDSL.g:3273:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalMontiArcDSL.g:3279:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3283:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:3284:1: ( '}' )
            {
            // InternalMontiArcDSL.g:3284:1: ( '}' )
            // InternalMontiArcDSL.g:3285:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group_1__0"
    // InternalMontiArcDSL.g:3295:1: rule__Block__Group_1__0 : rule__Block__Group_1__0__Impl rule__Block__Group_1__1 ;
    public final void rule__Block__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3299:1: ( rule__Block__Group_1__0__Impl rule__Block__Group_1__1 )
            // InternalMontiArcDSL.g:3300:2: rule__Block__Group_1__0__Impl rule__Block__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Block__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_1__0"


    // $ANTLR start "rule__Block__Group_1__0__Impl"
    // InternalMontiArcDSL.g:3307:1: rule__Block__Group_1__0__Impl : ( ( rule__Block__NameAssignment_1_0 ) ) ;
    public final void rule__Block__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3311:1: ( ( ( rule__Block__NameAssignment_1_0 ) ) )
            // InternalMontiArcDSL.g:3312:1: ( ( rule__Block__NameAssignment_1_0 ) )
            {
            // InternalMontiArcDSL.g:3312:1: ( ( rule__Block__NameAssignment_1_0 ) )
            // InternalMontiArcDSL.g:3313:2: ( rule__Block__NameAssignment_1_0 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1_0()); 
            // InternalMontiArcDSL.g:3314:2: ( rule__Block__NameAssignment_1_0 )
            // InternalMontiArcDSL.g:3314:3: rule__Block__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Block__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_1__0__Impl"


    // $ANTLR start "rule__Block__Group_1__1"
    // InternalMontiArcDSL.g:3322:1: rule__Block__Group_1__1 : rule__Block__Group_1__1__Impl ;
    public final void rule__Block__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3326:1: ( rule__Block__Group_1__1__Impl )
            // InternalMontiArcDSL.g:3327:2: rule__Block__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_1__1"


    // $ANTLR start "rule__Block__Group_1__1__Impl"
    // InternalMontiArcDSL.g:3333:1: rule__Block__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Block__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3337:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:3338:1: ( '=' )
            {
            // InternalMontiArcDSL.g:3338:1: ( '=' )
            // InternalMontiArcDSL.g:3339:2: '='
            {
             before(grammarAccess.getBlockAccess().getEqualsSignKeyword_1_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group_3__0"
    // InternalMontiArcDSL.g:3349:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3353:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalMontiArcDSL.g:3354:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Block__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0"


    // $ANTLR start "rule__Block__Group_3__0__Impl"
    // InternalMontiArcDSL.g:3361:1: rule__Block__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3365:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3366:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3366:1: ( ',' )
            // InternalMontiArcDSL.g:3367:2: ','
            {
             before(grammarAccess.getBlockAccess().getCommaKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__0__Impl"


    // $ANTLR start "rule__Block__Group_3__1"
    // InternalMontiArcDSL.g:3376:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3380:1: ( rule__Block__Group_3__1__Impl )
            // InternalMontiArcDSL.g:3381:2: rule__Block__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1"


    // $ANTLR start "rule__Block__Group_3__1__Impl"
    // InternalMontiArcDSL.g:3387:1: rule__Block__Group_3__1__Impl : ( ( rule__Block__ExpressionsAssignment_3_1 ) ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3391:1: ( ( ( rule__Block__ExpressionsAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:3392:1: ( ( rule__Block__ExpressionsAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:3392:1: ( ( rule__Block__ExpressionsAssignment_3_1 ) )
            // InternalMontiArcDSL.g:3393:2: ( rule__Block__ExpressionsAssignment_3_1 )
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_3_1()); 
            // InternalMontiArcDSL.g:3394:2: ( rule__Block__ExpressionsAssignment_3_1 )
            // InternalMontiArcDSL.g:3394:3: rule__Block__ExpressionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Block__ExpressionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getExpressionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group_3__1__Impl"


    // $ANTLR start "rule__ImportStatements__Group__0"
    // InternalMontiArcDSL.g:3403:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3407:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiArcDSL.g:3408:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ImportStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__0"


    // $ANTLR start "rule__ImportStatements__Group__0__Impl"
    // InternalMontiArcDSL.g:3415:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3419:1: ( ( 'import' ) )
            // InternalMontiArcDSL.g:3420:1: ( 'import' )
            {
            // InternalMontiArcDSL.g:3420:1: ( 'import' )
            // InternalMontiArcDSL.g:3421:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__0__Impl"


    // $ANTLR start "rule__ImportStatements__Group__1"
    // InternalMontiArcDSL.g:3430:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3434:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiArcDSL.g:3435:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ImportStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__1"


    // $ANTLR start "rule__ImportStatements__Group__1__Impl"
    // InternalMontiArcDSL.g:3442:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3446:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3447:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3447:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiArcDSL.g:3448:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiArcDSL.g:3449:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiArcDSL.g:3449:3: rule__ImportStatements__ImportUriAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__ImportUriAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__1__Impl"


    // $ANTLR start "rule__ImportStatements__Group__2"
    // InternalMontiArcDSL.g:3457:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3461:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiArcDSL.g:3462:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ImportStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__2"


    // $ANTLR start "rule__ImportStatements__Group__2__Impl"
    // InternalMontiArcDSL.g:3469:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__Group_2__0 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3473:1: ( ( ( rule__ImportStatements__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:3474:1: ( ( rule__ImportStatements__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:3474:1: ( ( rule__ImportStatements__Group_2__0 )? )
            // InternalMontiArcDSL.g:3475:2: ( rule__ImportStatements__Group_2__0 )?
            {
             before(grammarAccess.getImportStatementsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3476:2: ( rule__ImportStatements__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMontiArcDSL.g:3476:3: rule__ImportStatements__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportStatements__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportStatementsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__2__Impl"


    // $ANTLR start "rule__ImportStatements__Group__3"
    // InternalMontiArcDSL.g:3484:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3488:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiArcDSL.g:3489:2: rule__ImportStatements__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__3"


    // $ANTLR start "rule__ImportStatements__Group__3__Impl"
    // InternalMontiArcDSL.g:3495:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3499:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3500:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3500:1: ( ';' )
            // InternalMontiArcDSL.g:3501:2: ';'
            {
             before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group__3__Impl"


    // $ANTLR start "rule__ImportStatements__Group_2__0"
    // InternalMontiArcDSL.g:3511:1: rule__ImportStatements__Group_2__0 : rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1 ;
    public final void rule__ImportStatements__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3515:1: ( rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1 )
            // InternalMontiArcDSL.g:3516:2: rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__ImportStatements__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group_2__0"


    // $ANTLR start "rule__ImportStatements__Group_2__0__Impl"
    // InternalMontiArcDSL.g:3523:1: rule__ImportStatements__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ImportStatements__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3527:1: ( ( '.' ) )
            // InternalMontiArcDSL.g:3528:1: ( '.' )
            {
            // InternalMontiArcDSL.g:3528:1: ( '.' )
            // InternalMontiArcDSL.g:3529:2: '.'
            {
             before(grammarAccess.getImportStatementsAccess().getFullStopKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group_2__0__Impl"


    // $ANTLR start "rule__ImportStatements__Group_2__1"
    // InternalMontiArcDSL.g:3538:1: rule__ImportStatements__Group_2__1 : rule__ImportStatements__Group_2__1__Impl ;
    public final void rule__ImportStatements__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3542:1: ( rule__ImportStatements__Group_2__1__Impl )
            // InternalMontiArcDSL.g:3543:2: rule__ImportStatements__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group_2__1"


    // $ANTLR start "rule__ImportStatements__Group_2__1__Impl"
    // InternalMontiArcDSL.g:3549:1: rule__ImportStatements__Group_2__1__Impl : ( ( rule__ImportStatements__StarAssignment_2_1 ) ) ;
    public final void rule__ImportStatements__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3553:1: ( ( ( rule__ImportStatements__StarAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3554:1: ( ( rule__ImportStatements__StarAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3554:1: ( ( rule__ImportStatements__StarAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3555:2: ( rule__ImportStatements__StarAssignment_2_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2_1()); 
            // InternalMontiArcDSL.g:3556:2: ( rule__ImportStatements__StarAssignment_2_1 )
            // InternalMontiArcDSL.g:3556:3: rule__ImportStatements__StarAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportStatements__StarAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementsAccess().getStarAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__Group_2__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // InternalMontiArcDSL.g:3565:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3569:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiArcDSL.g:3570:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalMontiArcDSL.g:3577:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3581:1: ( ( 'package' ) )
            // InternalMontiArcDSL.g:3582:1: ( 'package' )
            {
            // InternalMontiArcDSL.g:3582:1: ( 'package' )
            // InternalMontiArcDSL.g:3583:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalMontiArcDSL.g:3592:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3596:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiArcDSL.g:3597:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalMontiArcDSL.g:3604:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3608:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3609:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3609:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:3610:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:3611:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiArcDSL.g:3611:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalMontiArcDSL.g:3619:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3623:1: ( rule__Package__Group__2__Impl )
            // InternalMontiArcDSL.g:3624:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalMontiArcDSL.g:3630:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3634:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3635:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3635:1: ( ';' )
            // InternalMontiArcDSL.g:3636:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__0"
    // InternalMontiArcDSL.g:3646:1: rule__MCCollectionType__Group__0 : rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 ;
    public final void rule__MCCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3650:1: ( rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 )
            // InternalMontiArcDSL.g:3651:2: rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__MCCollectionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__0"


    // $ANTLR start "rule__MCCollectionType__Group__0__Impl"
    // InternalMontiArcDSL.g:3658:1: rule__MCCollectionType__Group__0__Impl : ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__MCCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3662:1: ( ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) )
            // InternalMontiArcDSL.g:3663:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:3663:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            // InternalMontiArcDSL.g:3664:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalMontiArcDSL.g:3665:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            // InternalMontiArcDSL.g:3665:3: rule__MCCollectionType__CollectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__CollectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__0__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__1"
    // InternalMontiArcDSL.g:3673:1: rule__MCCollectionType__Group__1 : rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 ;
    public final void rule__MCCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3677:1: ( rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 )
            // InternalMontiArcDSL.g:3678:2: rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MCCollectionType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__1"


    // $ANTLR start "rule__MCCollectionType__Group__1__Impl"
    // InternalMontiArcDSL.g:3685:1: rule__MCCollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__MCCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3689:1: ( ( '<' ) )
            // InternalMontiArcDSL.g:3690:1: ( '<' )
            {
            // InternalMontiArcDSL.g:3690:1: ( '<' )
            // InternalMontiArcDSL.g:3691:2: '<'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__1__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__2"
    // InternalMontiArcDSL.g:3700:1: rule__MCCollectionType__Group__2 : rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 ;
    public final void rule__MCCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3704:1: ( rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 )
            // InternalMontiArcDSL.g:3705:2: rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__MCCollectionType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__2"


    // $ANTLR start "rule__MCCollectionType__Group__2__Impl"
    // InternalMontiArcDSL.g:3712:1: rule__MCCollectionType__Group__2__Impl : ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__MCCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3716:1: ( ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) )
            // InternalMontiArcDSL.g:3717:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:3717:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            // InternalMontiArcDSL.g:3718:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalMontiArcDSL.g:3719:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            // InternalMontiArcDSL.g:3719:3: rule__MCCollectionType__InnerTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__InnerTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__2__Impl"


    // $ANTLR start "rule__MCCollectionType__Group__3"
    // InternalMontiArcDSL.g:3727:1: rule__MCCollectionType__Group__3 : rule__MCCollectionType__Group__3__Impl ;
    public final void rule__MCCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3731:1: ( rule__MCCollectionType__Group__3__Impl )
            // InternalMontiArcDSL.g:3732:2: rule__MCCollectionType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__3"


    // $ANTLR start "rule__MCCollectionType__Group__3__Impl"
    // InternalMontiArcDSL.g:3738:1: rule__MCCollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__MCCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3742:1: ( ( '>' ) )
            // InternalMontiArcDSL.g:3743:1: ( '>' )
            {
            // InternalMontiArcDSL.g:3743:1: ( '>' )
            // InternalMontiArcDSL.g:3744:2: '>'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__Group__3__Impl"


    // $ANTLR start "rule__MCArrayType__Group__0"
    // InternalMontiArcDSL.g:3754:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3758:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiArcDSL.g:3759:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__MCArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCArrayType__Group__0"


    // $ANTLR start "rule__MCArrayType__Group__0__Impl"
    // InternalMontiArcDSL.g:3766:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3770:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiArcDSL.g:3771:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiArcDSL.g:3771:1: ( ruleMCPrimitiveType )
            // InternalMontiArcDSL.g:3772:2: ruleMCPrimitiveType
            {
             before(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMCPrimitiveType();

            state._fsp--;

             after(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCArrayType__Group__0__Impl"


    // $ANTLR start "rule__MCArrayType__Group__1"
    // InternalMontiArcDSL.g:3781:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3785:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiArcDSL.g:3786:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MCArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCArrayType__Group__1"


    // $ANTLR start "rule__MCArrayType__Group__1__Impl"
    // InternalMontiArcDSL.g:3793:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3797:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3798:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3798:1: ( '[' )
            // InternalMontiArcDSL.g:3799:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCArrayType__Group__1__Impl"


    // $ANTLR start "rule__MCArrayType__Group__2"
    // InternalMontiArcDSL.g:3808:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3812:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiArcDSL.g:3813:2: rule__MCArrayType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCArrayType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCArrayType__Group__2"


    // $ANTLR start "rule__MCArrayType__Group__2__Impl"
    // InternalMontiArcDSL.g:3819:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3823:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3824:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3824:1: ( ']' )
            // InternalMontiArcDSL.g:3825:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCArrayType__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalMontiArcDSL.g:3835:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3839:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalMontiArcDSL.g:3840:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // InternalMontiArcDSL.g:3847:1: rule__Arguments__Group__0__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3851:1: ( ( '(' ) )
            // InternalMontiArcDSL.g:3852:1: ( '(' )
            {
            // InternalMontiArcDSL.g:3852:1: ( '(' )
            // InternalMontiArcDSL.g:3853:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // InternalMontiArcDSL.g:3862:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3866:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalMontiArcDSL.g:3867:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Arguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // InternalMontiArcDSL.g:3874:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3878:1: ( ( ( rule__Arguments__ArgumentsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3879:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3879:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            // InternalMontiArcDSL.g:3880:2: ( rule__Arguments__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 
            // InternalMontiArcDSL.g:3881:2: ( rule__Arguments__ArgumentsAssignment_1 )
            // InternalMontiArcDSL.g:3881:3: rule__Arguments__ArgumentsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ArgumentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__2"
    // InternalMontiArcDSL.g:3889:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3893:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalMontiArcDSL.g:3894:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Arguments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2"


    // $ANTLR start "rule__Arguments__Group__2__Impl"
    // InternalMontiArcDSL.g:3901:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__Group_2__0 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3905:1: ( ( ( rule__Arguments__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:3906:1: ( ( rule__Arguments__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:3906:1: ( ( rule__Arguments__Group_2__0 )* )
            // InternalMontiArcDSL.g:3907:2: ( rule__Arguments__Group_2__0 )*
            {
             before(grammarAccess.getArgumentsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3908:2: ( rule__Arguments__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3908:3: rule__Arguments__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Arguments__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getArgumentsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__3"
    // InternalMontiArcDSL.g:3916:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3920:1: ( rule__Arguments__Group__3__Impl )
            // InternalMontiArcDSL.g:3921:2: rule__Arguments__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__3"


    // $ANTLR start "rule__Arguments__Group__3__Impl"
    // InternalMontiArcDSL.g:3927:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3931:1: ( ( ')' ) )
            // InternalMontiArcDSL.g:3932:1: ( ')' )
            {
            // InternalMontiArcDSL.g:3932:1: ( ')' )
            // InternalMontiArcDSL.g:3933:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__3__Impl"


    // $ANTLR start "rule__Arguments__Group_2__0"
    // InternalMontiArcDSL.g:3943:1: rule__Arguments__Group_2__0 : rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 ;
    public final void rule__Arguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3947:1: ( rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 )
            // InternalMontiArcDSL.g:3948:2: rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Arguments__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__0"


    // $ANTLR start "rule__Arguments__Group_2__0__Impl"
    // InternalMontiArcDSL.g:3955:1: rule__Arguments__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Arguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3959:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3960:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3960:1: ( ',' )
            // InternalMontiArcDSL.g:3961:2: ','
            {
             before(grammarAccess.getArgumentsAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__0__Impl"


    // $ANTLR start "rule__Arguments__Group_2__1"
    // InternalMontiArcDSL.g:3970:1: rule__Arguments__Group_2__1 : rule__Arguments__Group_2__1__Impl ;
    public final void rule__Arguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3974:1: ( rule__Arguments__Group_2__1__Impl )
            // InternalMontiArcDSL.g:3975:2: rule__Arguments__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__1"


    // $ANTLR start "rule__Arguments__Group_2__1__Impl"
    // InternalMontiArcDSL.g:3981:1: rule__Arguments__Group_2__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Arguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3985:1: ( ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3986:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3986:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3987:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 
            // InternalMontiArcDSL.g:3988:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            // InternalMontiArcDSL.g:3988:3: rule__Arguments__ArgumentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__ArgumentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group_2__1__Impl"


    // $ANTLR start "rule__Argument__Group__0"
    // InternalMontiArcDSL.g:3997:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4001:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMontiArcDSL.g:4002:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Argument__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0"


    // $ANTLR start "rule__Argument__Group__0__Impl"
    // InternalMontiArcDSL.g:4009:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4013:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4014:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4014:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMontiArcDSL.g:4015:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMontiArcDSL.g:4016:2: ( rule__Argument__NameAssignment_0 )
            // InternalMontiArcDSL.g:4016:3: rule__Argument__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Argument__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__0__Impl"


    // $ANTLR start "rule__Argument__Group__1"
    // InternalMontiArcDSL.g:4024:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4028:1: ( rule__Argument__Group__1__Impl )
            // InternalMontiArcDSL.g:4029:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Argument__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1"


    // $ANTLR start "rule__Argument__Group__1__Impl"
    // InternalMontiArcDSL.g:4035:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4039:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4040:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4040:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMontiArcDSL.g:4041:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMontiArcDSL.g:4042:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMontiArcDSL.g:4042:3: rule__Argument__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Argument__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group__1__Impl"


    // $ANTLR start "rule__MACompilationUnit__PackageAssignment_0"
    // InternalMontiArcDSL.g:4051:1: rule__MACompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__MACompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4055:1: ( ( rulePackage ) )
            // InternalMontiArcDSL.g:4056:2: ( rulePackage )
            {
            // InternalMontiArcDSL.g:4056:2: ( rulePackage )
            // InternalMontiArcDSL.g:4057:3: rulePackage
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__PackageAssignment_0"


    // $ANTLR start "rule__MACompilationUnit__ImportStatementsAssignment_1"
    // InternalMontiArcDSL.g:4066:1: rule__MACompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__MACompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4070:1: ( ( ruleImportStatements ) )
            // InternalMontiArcDSL.g:4071:2: ( ruleImportStatements )
            {
            // InternalMontiArcDSL.g:4071:2: ( ruleImportStatements )
            // InternalMontiArcDSL.g:4072:3: ruleImportStatements
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportStatements();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__ImportStatementsAssignment_1"


    // $ANTLR start "rule__MACompilationUnit__ComponentAssignment_2"
    // InternalMontiArcDSL.g:4081:1: rule__MACompilationUnit__ComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__MACompilationUnit__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4085:1: ( ( ruleComponent ) )
            // InternalMontiArcDSL.g:4086:2: ( ruleComponent )
            {
            // InternalMontiArcDSL.g:4086:2: ( ruleComponent )
            // InternalMontiArcDSL.g:4087:3: ruleComponent
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getMACompilationUnitAccess().getComponentComponentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MACompilationUnit__ComponentAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // InternalMontiArcDSL.g:4096:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4100:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4101:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4101:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4102:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__SignatureAssignment_2"
    // InternalMontiArcDSL.g:4111:1: rule__Component__SignatureAssignment_2 : ( ruleSignature ) ;
    public final void rule__Component__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4115:1: ( ( ruleSignature ) )
            // InternalMontiArcDSL.g:4116:2: ( ruleSignature )
            {
            // InternalMontiArcDSL.g:4116:2: ( ruleSignature )
            // InternalMontiArcDSL.g:4117:3: ruleSignature
            {
             before(grammarAccess.getComponentAccess().getSignatureSignatureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSignature();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getSignatureSignatureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__SignatureAssignment_2"


    // $ANTLR start "rule__Component__ArcElementsAssignment_4"
    // InternalMontiArcDSL.g:4126:1: rule__Component__ArcElementsAssignment_4 : ( ruleArcElement ) ;
    public final void rule__Component__ArcElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4130:1: ( ( ruleArcElement ) )
            // InternalMontiArcDSL.g:4131:2: ( ruleArcElement )
            {
            // InternalMontiArcDSL.g:4131:2: ( ruleArcElement )
            // InternalMontiArcDSL.g:4132:3: ruleArcElement
            {
             before(grammarAccess.getComponentAccess().getArcElementsArcElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArcElement();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArcElementsArcElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ArcElementsAssignment_4"


    // $ANTLR start "rule__Signature__ParametersAssignment_1"
    // InternalMontiArcDSL.g:4141:1: rule__Signature__ParametersAssignment_1 : ( ruleParameters ) ;
    public final void rule__Signature__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4145:1: ( ( ruleParameters ) )
            // InternalMontiArcDSL.g:4146:2: ( ruleParameters )
            {
            // InternalMontiArcDSL.g:4146:2: ( ruleParameters )
            // InternalMontiArcDSL.g:4147:3: ruleParameters
            {
             before(grammarAccess.getSignatureAccess().getParametersParametersParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getParametersParametersParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__ParametersAssignment_1"


    // $ANTLR start "rule__Signature__TypeAssignment_2_1"
    // InternalMontiArcDSL.g:4156:1: rule__Signature__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Signature__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4160:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4161:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4161:2: ( ruleType )
            // InternalMontiArcDSL.g:4162:3: ruleType
            {
             before(grammarAccess.getSignatureAccess().getTypeTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSignatureAccess().getTypeTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__TypeAssignment_2_1"


    // $ANTLR start "rule__Parameters__ParametersAssignment_0"
    // InternalMontiArcDSL.g:4171:1: rule__Parameters__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4175:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:4176:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:4176:2: ( ruleParameter )
            // InternalMontiArcDSL.g:4177:3: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__ParametersAssignment_0"


    // $ANTLR start "rule__Parameters__ParametersAssignment_1_1"
    // InternalMontiArcDSL.g:4186:1: rule__Parameters__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4190:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:4191:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:4191:2: ( ruleParameter )
            // InternalMontiArcDSL.g:4192:3: ruleParameter
            {
             before(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__ParametersAssignment_1_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalMontiArcDSL.g:4201:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4205:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4206:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4206:2: ( ruleType )
            // InternalMontiArcDSL.g:4207:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMontiArcDSL.g:4216:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4220:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4221:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4221:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4222:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__ExpressionAssignment_2_1"
    // InternalMontiArcDSL.g:4231:1: rule__Parameter__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4235:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4236:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4236:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4237:3: ruleExpression
            {
             before(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ExpressionAssignment_2_1"


    // $ANTLR start "rule__SubComponent__TypeAssignment_1"
    // InternalMontiArcDSL.g:4246:1: rule__SubComponent__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__SubComponent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4250:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4251:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4251:2: ( ruleType )
            // InternalMontiArcDSL.g:4252:3: ruleType
            {
             before(grammarAccess.getSubComponentAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getSubComponentAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__TypeAssignment_1"


    // $ANTLR start "rule__SubComponent__ArgumentsAssignment_2"
    // InternalMontiArcDSL.g:4261:1: rule__SubComponent__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__SubComponent__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4265:1: ( ( ruleArguments ) )
            // InternalMontiArcDSL.g:4266:2: ( ruleArguments )
            {
            // InternalMontiArcDSL.g:4266:2: ( ruleArguments )
            // InternalMontiArcDSL.g:4267:3: ruleArguments
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsArgumentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getSubComponentAccess().getArgumentsArgumentsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__ArgumentsAssignment_2"


    // $ANTLR start "rule__SubComponent__InstancesAssignment_3"
    // InternalMontiArcDSL.g:4276:1: rule__SubComponent__InstancesAssignment_3 : ( ruleNames ) ;
    public final void rule__SubComponent__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4280:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4281:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4281:2: ( ruleNames )
            // InternalMontiArcDSL.g:4282:3: ruleNames
            {
             before(grammarAccess.getSubComponentAccess().getInstancesNamesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getSubComponentAccess().getInstancesNamesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubComponent__InstancesAssignment_3"


    // $ANTLR start "rule__Connector__SourceAssignment_1"
    // InternalMontiArcDSL.g:4291:1: rule__Connector__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4295:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4296:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4296:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4297:3: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__SourceAssignment_1"


    // $ANTLR start "rule__Connector__TargetsAssignment_3"
    // InternalMontiArcDSL.g:4306:1: rule__Connector__TargetsAssignment_3 : ( ruleNames ) ;
    public final void rule__Connector__TargetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4310:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4311:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4311:2: ( ruleNames )
            // InternalMontiArcDSL.g:4312:3: ruleNames
            {
             before(grammarAccess.getConnectorAccess().getTargetsNamesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTargetsNamesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__TargetsAssignment_3"


    // $ANTLR start "rule__Ports__PortsAssignment_1"
    // InternalMontiArcDSL.g:4321:1: rule__Ports__PortsAssignment_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4325:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:4326:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:4326:2: ( rulePort )
            // InternalMontiArcDSL.g:4327:3: rulePort
            {
             before(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__PortsAssignment_1"


    // $ANTLR start "rule__Ports__PortsAssignment_2_1"
    // InternalMontiArcDSL.g:4336:1: rule__Ports__PortsAssignment_2_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4340:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:4341:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:4341:2: ( rulePort )
            // InternalMontiArcDSL.g:4342:3: rulePort
            {
             before(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ports__PortsAssignment_2_1"


    // $ANTLR start "rule__Port__SyncAssignment_0"
    // InternalMontiArcDSL.g:4351:1: rule__Port__SyncAssignment_0 : ( RULE_SYNC ) ;
    public final void rule__Port__SyncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4355:1: ( ( RULE_SYNC ) )
            // InternalMontiArcDSL.g:4356:2: ( RULE_SYNC )
            {
            // InternalMontiArcDSL.g:4356:2: ( RULE_SYNC )
            // InternalMontiArcDSL.g:4357:3: RULE_SYNC
            {
             before(grammarAccess.getPortAccess().getSyncSYNCTerminalRuleCall_0_0()); 
            match(input,RULE_SYNC,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getSyncSYNCTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__SyncAssignment_0"


    // $ANTLR start "rule__Port__InAssignment_1_0"
    // InternalMontiArcDSL.g:4366:1: rule__Port__InAssignment_1_0 : ( ( 'in' ) ) ;
    public final void rule__Port__InAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4370:1: ( ( ( 'in' ) ) )
            // InternalMontiArcDSL.g:4371:2: ( ( 'in' ) )
            {
            // InternalMontiArcDSL.g:4371:2: ( ( 'in' ) )
            // InternalMontiArcDSL.g:4372:3: ( 'in' )
            {
             before(grammarAccess.getPortAccess().getInInKeyword_1_0_0()); 
            // InternalMontiArcDSL.g:4373:3: ( 'in' )
            // InternalMontiArcDSL.g:4374:4: 'in'
            {
             before(grammarAccess.getPortAccess().getInInKeyword_1_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getInInKeyword_1_0_0()); 

            }

             after(grammarAccess.getPortAccess().getInInKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__InAssignment_1_0"


    // $ANTLR start "rule__Port__OutAssignment_1_1"
    // InternalMontiArcDSL.g:4385:1: rule__Port__OutAssignment_1_1 : ( ( 'out' ) ) ;
    public final void rule__Port__OutAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4389:1: ( ( ( 'out' ) ) )
            // InternalMontiArcDSL.g:4390:2: ( ( 'out' ) )
            {
            // InternalMontiArcDSL.g:4390:2: ( ( 'out' ) )
            // InternalMontiArcDSL.g:4391:3: ( 'out' )
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_1_1_0()); 
            // InternalMontiArcDSL.g:4392:3: ( 'out' )
            // InternalMontiArcDSL.g:4393:4: 'out'
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getOutOutKeyword_1_1_0()); 

            }

             after(grammarAccess.getPortAccess().getOutOutKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__OutAssignment_1_1"


    // $ANTLR start "rule__Port__TypeAssignment_2"
    // InternalMontiArcDSL.g:4404:1: rule__Port__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Port__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4408:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4409:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4409:2: ( ruleType )
            // InternalMontiArcDSL.g:4410:3: ruleType
            {
             before(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_2"


    // $ANTLR start "rule__Port__NamesAssignment_3"
    // InternalMontiArcDSL.g:4419:1: rule__Port__NamesAssignment_3 : ( ruleNames ) ;
    public final void rule__Port__NamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4423:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4424:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4424:2: ( ruleNames )
            // InternalMontiArcDSL.g:4425:3: ruleNames
            {
             before(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NamesAssignment_3"


    // $ANTLR start "rule__Names__NamesAssignment_0"
    // InternalMontiArcDSL.g:4434:1: rule__Names__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Names__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4438:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4439:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4439:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4440:3: RULE_ID
            {
             before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__NamesAssignment_0"


    // $ANTLR start "rule__Names__NamesAssignment_1_1"
    // InternalMontiArcDSL.g:4449:1: rule__Names__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Names__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4453:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4454:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4454:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4455:3: RULE_ID
            {
             before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Names__NamesAssignment_1_1"


    // $ANTLR start "rule__Variable__TypeAssignment_0"
    // InternalMontiArcDSL.g:4464:1: rule__Variable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4468:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4469:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4469:2: ( ruleType )
            // InternalMontiArcDSL.g:4470:3: ruleType
            {
             before(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_0"


    // $ANTLR start "rule__Variable__NamesAssignment_1"
    // InternalMontiArcDSL.g:4479:1: rule__Variable__NamesAssignment_1 : ( ruleNames ) ;
    public final void rule__Variable__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4483:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4484:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4484:2: ( ruleNames )
            // InternalMontiArcDSL.g:4485:3: ruleNames
            {
             before(grammarAccess.getVariableAccess().getNamesNamesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNamesNamesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NamesAssignment_1"


    // $ANTLR start "rule__Automaton__NameAssignment_2"
    // InternalMontiArcDSL.g:4494:1: rule__Automaton__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4498:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4499:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4499:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4500:3: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__NameAssignment_2"


    // $ANTLR start "rule__Automaton__StatesAssignment_4_0"
    // InternalMontiArcDSL.g:4509:1: rule__Automaton__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4513:1: ( ( ruleState ) )
            // InternalMontiArcDSL.g:4514:2: ( ruleState )
            {
            // InternalMontiArcDSL.g:4514:2: ( ruleState )
            // InternalMontiArcDSL.g:4515:3: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__StatesAssignment_4_0"


    // $ANTLR start "rule__Automaton__InitialStatesAssignment_4_1"
    // InternalMontiArcDSL.g:4524:1: rule__Automaton__InitialStatesAssignment_4_1 : ( ruleInitialState ) ;
    public final void rule__Automaton__InitialStatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4528:1: ( ( ruleInitialState ) )
            // InternalMontiArcDSL.g:4529:2: ( ruleInitialState )
            {
            // InternalMontiArcDSL.g:4529:2: ( ruleInitialState )
            // InternalMontiArcDSL.g:4530:3: ruleInitialState
            {
             before(grammarAccess.getAutomatonAccess().getInitialStatesInitialStateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialState();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getInitialStatesInitialStateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__InitialStatesAssignment_4_1"


    // $ANTLR start "rule__Automaton__TransitionsAssignment_4_2"
    // InternalMontiArcDSL.g:4539:1: rule__Automaton__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Automaton__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4543:1: ( ( ruleTransition ) )
            // InternalMontiArcDSL.g:4544:2: ( ruleTransition )
            {
            // InternalMontiArcDSL.g:4544:2: ( ruleTransition )
            // InternalMontiArcDSL.g:4545:3: ruleTransition
            {
             before(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__TransitionsAssignment_4_2"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalMontiArcDSL.g:4554:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4558:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4559:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4559:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4560:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__InitialState__NameAssignment_1"
    // InternalMontiArcDSL.g:4569:1: rule__InitialState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4573:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4574:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4574:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4575:3: RULE_ID
            {
             before(grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__NameAssignment_1"


    // $ANTLR start "rule__InitialState__BlockAssignment_2_1"
    // InternalMontiArcDSL.g:4584:1: rule__InitialState__BlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__InitialState__BlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4588:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:4589:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:4589:2: ( ruleBlock )
            // InternalMontiArcDSL.g:4590:3: ruleBlock
            {
             before(grammarAccess.getInitialStateAccess().getBlockBlockParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getInitialStateAccess().getBlockBlockParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitialState__BlockAssignment_2_1"


    // $ANTLR start "rule__Transition__SourceAssignment_0"
    // InternalMontiArcDSL.g:4599:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4603:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:4604:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:4604:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4605:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 
            // InternalMontiArcDSL.g:4606:3: ( RULE_ID )
            // InternalMontiArcDSL.g:4607:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getSourceStateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_0"


    // $ANTLR start "rule__Transition__TargetAssignment_1_1"
    // InternalMontiArcDSL.g:4618:1: rule__Transition__TargetAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4622:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:4623:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:4623:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4624:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetCrossReference_1_1_0()); 
            // InternalMontiArcDSL.g:4625:3: ( RULE_ID )
            // InternalMontiArcDSL.g:4626:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_1_1"


    // $ANTLR start "rule__Transition__ExpressionAssignment_2_1"
    // InternalMontiArcDSL.g:4637:1: rule__Transition__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Transition__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4641:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4642:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4642:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4643:3: ruleExpression
            {
             before(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ExpressionAssignment_2_1"


    // $ANTLR start "rule__Transition__ReactionAssignment_3_1"
    // InternalMontiArcDSL.g:4652:1: rule__Transition__ReactionAssignment_3_1 : ( ruleBlock ) ;
    public final void rule__Transition__ReactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4656:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:4657:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:4657:2: ( ruleBlock )
            // InternalMontiArcDSL.g:4658:3: ruleBlock
            {
             before(grammarAccess.getTransitionAccess().getReactionBlockParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getReactionBlockParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ReactionAssignment_3_1"


    // $ANTLR start "rule__Block__NameAssignment_1_0"
    // InternalMontiArcDSL.g:4667:1: rule__Block__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4671:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4672:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4672:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4673:3: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_1_0"


    // $ANTLR start "rule__Block__ExpressionsAssignment_2"
    // InternalMontiArcDSL.g:4682:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4686:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4687:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4687:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4688:3: ruleExpression
            {
             before(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ExpressionsAssignment_2"


    // $ANTLR start "rule__Block__ExpressionsAssignment_3_1"
    // InternalMontiArcDSL.g:4697:1: rule__Block__ExpressionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Block__ExpressionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4701:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4702:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4702:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4703:3: ruleExpression
            {
             before(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ExpressionsAssignment_3_1"


    // $ANTLR start "rule__ImportStatements__ImportUriAssignment_1"
    // InternalMontiArcDSL.g:4712:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4716:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:4717:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:4717:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:4718:3: RULE_MCQUALIFIEDNAME
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0()); 
            match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__ImportUriAssignment_1"


    // $ANTLR start "rule__ImportStatements__StarAssignment_2_1"
    // InternalMontiArcDSL.g:4727:1: rule__ImportStatements__StarAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__ImportStatements__StarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4731:1: ( ( ( '*' ) ) )
            // InternalMontiArcDSL.g:4732:2: ( ( '*' ) )
            {
            // InternalMontiArcDSL.g:4732:2: ( ( '*' ) )
            // InternalMontiArcDSL.g:4733:3: ( '*' )
            {
             before(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 
            // InternalMontiArcDSL.g:4734:3: ( '*' )
            // InternalMontiArcDSL.g:4735:4: '*'
            {
             before(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 

            }

             after(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__StarAssignment_2_1"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalMontiArcDSL.g:4746:1: rule__Package__NameAssignment_1 : ( ( rule__Package__NameAlternatives_1_0 ) ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4750:1: ( ( ( rule__Package__NameAlternatives_1_0 ) ) )
            // InternalMontiArcDSL.g:4751:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            {
            // InternalMontiArcDSL.g:4751:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            // InternalMontiArcDSL.g:4752:3: ( rule__Package__NameAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 
            // InternalMontiArcDSL.g:4753:3: ( rule__Package__NameAlternatives_1_0 )
            // InternalMontiArcDSL.g:4753:4: rule__Package__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__MCPrimitiveType__TypeAssignment"
    // InternalMontiArcDSL.g:4761:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4765:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:4766:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:4766:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:4767:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:4768:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:4768:4: rule__MCPrimitiveType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MCPrimitiveType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCPrimitiveType__TypeAssignment"


    // $ANTLR start "rule__MCCollectionType__CollectionAssignment_0"
    // InternalMontiArcDSL.g:4776:1: rule__MCCollectionType__CollectionAssignment_0 : ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__MCCollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4780:1: ( ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:4781:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:4781:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:4782:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalMontiArcDSL.g:4783:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            // InternalMontiArcDSL.g:4783:4: rule__MCCollectionType__CollectionAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MCCollectionType__CollectionAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__CollectionAssignment_0"


    // $ANTLR start "rule__MCCollectionType__InnerTypeAssignment_2"
    // InternalMontiArcDSL.g:4791:1: rule__MCCollectionType__InnerTypeAssignment_2 : ( ruleType ) ;
    public final void rule__MCCollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4795:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4796:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4796:2: ( ruleType )
            // InternalMontiArcDSL.g:4797:3: ruleType
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCCollectionType__InnerTypeAssignment_2"


    // $ANTLR start "rule__NumberLiteral__LiteralAssignment"
    // InternalMontiArcDSL.g:4806:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4810:1: ( ( RULE_INT ) )
            // InternalMontiArcDSL.g:4811:2: ( RULE_INT )
            {
            // InternalMontiArcDSL.g:4811:2: ( RULE_INT )
            // InternalMontiArcDSL.g:4812:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__LiteralAssignment"


    // $ANTLR start "rule__StringLiteral__LiteralAssignment"
    // InternalMontiArcDSL.g:4821:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4825:1: ( ( RULE_STRING ) )
            // InternalMontiArcDSL.g:4826:2: ( RULE_STRING )
            {
            // InternalMontiArcDSL.g:4826:2: ( RULE_STRING )
            // InternalMontiArcDSL.g:4827:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__LiteralAssignment"


    // $ANTLR start "rule__NameExpression__NameAssignment"
    // InternalMontiArcDSL.g:4836:1: rule__NameExpression__NameAssignment : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4840:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4841:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4841:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4842:3: RULE_ID
            {
             before(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameExpression__NameAssignment"


    // $ANTLR start "rule__Arguments__ArgumentsAssignment_1"
    // InternalMontiArcDSL.g:4851:1: rule__Arguments__ArgumentsAssignment_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4855:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:4856:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:4856:2: ( ruleArgument )
            // InternalMontiArcDSL.g:4857:3: ruleArgument
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__ArgumentsAssignment_1"


    // $ANTLR start "rule__Arguments__ArgumentsAssignment_2_1"
    // InternalMontiArcDSL.g:4866:1: rule__Arguments__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4870:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:4871:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:4871:2: ( ruleArgument )
            // InternalMontiArcDSL.g:4872:3: ruleArgument
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__ArgumentsAssignment_2_1"


    // $ANTLR start "rule__Argument__NameAssignment_0"
    // InternalMontiArcDSL.g:4881:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4885:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4886:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4886:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4887:3: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__NameAssignment_0"


    // $ANTLR start "rule__Argument__ExpressionAssignment_1"
    // InternalMontiArcDSL.g:4896:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4900:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4901:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4901:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4902:3: ruleExpression
            {
             before(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__ExpressionAssignment_1"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\11\14\3\uffff";
    static final String dfa_3s = "\1\15\11\5\3\uffff";
    static final String dfa_4s = "\1\31\11\57\3\uffff";
    static final String dfa_5s = "\12\uffff\1\3\1\2\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\4\12",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "\1\14\25\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\13\5\uffff\2\14",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "916:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCCollectionType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000023FFE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000041A17FFE000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000041A07FFE002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003FFE000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000001A0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000800100000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000041A07FFE000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006010000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000018500000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000040000000L});

}