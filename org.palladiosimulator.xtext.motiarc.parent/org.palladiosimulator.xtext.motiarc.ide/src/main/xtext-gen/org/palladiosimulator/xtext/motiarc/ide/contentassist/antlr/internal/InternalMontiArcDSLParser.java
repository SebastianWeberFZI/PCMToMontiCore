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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'connect'", "'->'", "'port'", "'automaton'", "'state'", "'initial'", "'/'", "'['", "']'", "'import'", "'.'", "'package'", "'exp'", "'arg'", "'in'", "'out'", "'*'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=5;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


    // $ANTLR start "entryRuleMCArrayType"
    // InternalMontiArcDSL.g:578:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:579:1: ( ruleMCArrayType EOF )
            // InternalMontiArcDSL.g:580:1: ruleMCArrayType EOF
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
    // InternalMontiArcDSL.g:587:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:591:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMontiArcDSL.g:592:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:592:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMontiArcDSL.g:593:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:594:3: ( rule__MCArrayType__Group__0 )
            // InternalMontiArcDSL.g:594:4: rule__MCArrayType__Group__0
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
    // InternalMontiArcDSL.g:603:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:604:1: ( ruleExpression EOF )
            // InternalMontiArcDSL.g:605:1: ruleExpression EOF
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
    // InternalMontiArcDSL.g:612:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:616:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMontiArcDSL.g:617:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMontiArcDSL.g:617:2: ( ( rule__Expression__Group__0 ) )
            // InternalMontiArcDSL.g:618:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMontiArcDSL.g:619:3: ( rule__Expression__Group__0 )
            // InternalMontiArcDSL.g:619:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcDSL.g:628:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:629:1: ( ruleArguments EOF )
            // InternalMontiArcDSL.g:630:1: ruleArguments EOF
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
    // InternalMontiArcDSL.g:637:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:641:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalMontiArcDSL.g:642:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalMontiArcDSL.g:642:2: ( ( rule__Arguments__Group__0 ) )
            // InternalMontiArcDSL.g:643:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalMontiArcDSL.g:644:3: ( rule__Arguments__Group__0 )
            // InternalMontiArcDSL.g:644:4: rule__Arguments__Group__0
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


    // $ANTLR start "rule__ArcElement__Alternatives"
    // InternalMontiArcDSL.g:652:1: rule__ArcElement__Alternatives : ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) );
    public final void rule__ArcElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:656:1: ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=12 && LA1_1<=19)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                {
                alt1=5;
                }
                break;
            case 30:
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
                    // InternalMontiArcDSL.g:657:2: ( ruleComponent )
                    {
                    // InternalMontiArcDSL.g:657:2: ( ruleComponent )
                    // InternalMontiArcDSL.g:658:3: ruleComponent
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
                    // InternalMontiArcDSL.g:663:2: ( ruleSubComponent )
                    {
                    // InternalMontiArcDSL.g:663:2: ( ruleSubComponent )
                    // InternalMontiArcDSL.g:664:3: ruleSubComponent
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
                    // InternalMontiArcDSL.g:669:2: ( ruleConnector )
                    {
                    // InternalMontiArcDSL.g:669:2: ( ruleConnector )
                    // InternalMontiArcDSL.g:670:3: ruleConnector
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
                    // InternalMontiArcDSL.g:675:2: ( rulePorts )
                    {
                    // InternalMontiArcDSL.g:675:2: ( rulePorts )
                    // InternalMontiArcDSL.g:676:3: rulePorts
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
                    // InternalMontiArcDSL.g:681:2: ( ruleVariable )
                    {
                    // InternalMontiArcDSL.g:681:2: ( ruleVariable )
                    // InternalMontiArcDSL.g:682:3: ruleVariable
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
                    // InternalMontiArcDSL.g:687:2: ( ruleAutomaton )
                    {
                    // InternalMontiArcDSL.g:687:2: ( ruleAutomaton )
                    // InternalMontiArcDSL.g:688:3: ruleAutomaton
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


    // $ANTLR start "rule__Port__Alternatives_0"
    // InternalMontiArcDSL.g:697:1: rule__Port__Alternatives_0 : ( ( ( rule__Port__InAssignment_0_0 ) ) | ( ( rule__Port__OutAssignment_0_1 ) ) );
    public final void rule__Port__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:701:1: ( ( ( rule__Port__InAssignment_0_0 ) ) | ( ( rule__Port__OutAssignment_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==42) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiArcDSL.g:702:2: ( ( rule__Port__InAssignment_0_0 ) )
                    {
                    // InternalMontiArcDSL.g:702:2: ( ( rule__Port__InAssignment_0_0 ) )
                    // InternalMontiArcDSL.g:703:3: ( rule__Port__InAssignment_0_0 )
                    {
                     before(grammarAccess.getPortAccess().getInAssignment_0_0()); 
                    // InternalMontiArcDSL.g:704:3: ( rule__Port__InAssignment_0_0 )
                    // InternalMontiArcDSL.g:704:4: rule__Port__InAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__InAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getInAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:708:2: ( ( rule__Port__OutAssignment_0_1 ) )
                    {
                    // InternalMontiArcDSL.g:708:2: ( ( rule__Port__OutAssignment_0_1 ) )
                    // InternalMontiArcDSL.g:709:3: ( rule__Port__OutAssignment_0_1 )
                    {
                     before(grammarAccess.getPortAccess().getOutAssignment_0_1()); 
                    // InternalMontiArcDSL.g:710:3: ( rule__Port__OutAssignment_0_1 )
                    // InternalMontiArcDSL.g:710:4: rule__Port__OutAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__OutAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getOutAssignment_0_1()); 

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
    // $ANTLR end "rule__Port__Alternatives_0"


    // $ANTLR start "rule__Automaton__Alternatives_4"
    // InternalMontiArcDSL.g:718:1: rule__Automaton__Alternatives_4 : ( ( ( rule__Automaton__StatesAssignment_4_0 ) ) | ( ( rule__Automaton__InitialStatesAssignment_4_1 ) ) | ( ( rule__Automaton__TransitionsAssignment_4_2 ) ) );
    public final void rule__Automaton__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:722:1: ( ( ( rule__Automaton__StatesAssignment_4_0 ) ) | ( ( rule__Automaton__InitialStatesAssignment_4_1 ) ) | ( ( rule__Automaton__TransitionsAssignment_4_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
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
                    // InternalMontiArcDSL.g:723:2: ( ( rule__Automaton__StatesAssignment_4_0 ) )
                    {
                    // InternalMontiArcDSL.g:723:2: ( ( rule__Automaton__StatesAssignment_4_0 ) )
                    // InternalMontiArcDSL.g:724:3: ( rule__Automaton__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getAutomatonAccess().getStatesAssignment_4_0()); 
                    // InternalMontiArcDSL.g:725:3: ( rule__Automaton__StatesAssignment_4_0 )
                    // InternalMontiArcDSL.g:725:4: rule__Automaton__StatesAssignment_4_0
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
                    // InternalMontiArcDSL.g:729:2: ( ( rule__Automaton__InitialStatesAssignment_4_1 ) )
                    {
                    // InternalMontiArcDSL.g:729:2: ( ( rule__Automaton__InitialStatesAssignment_4_1 ) )
                    // InternalMontiArcDSL.g:730:3: ( rule__Automaton__InitialStatesAssignment_4_1 )
                    {
                     before(grammarAccess.getAutomatonAccess().getInitialStatesAssignment_4_1()); 
                    // InternalMontiArcDSL.g:731:3: ( rule__Automaton__InitialStatesAssignment_4_1 )
                    // InternalMontiArcDSL.g:731:4: rule__Automaton__InitialStatesAssignment_4_1
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
                    // InternalMontiArcDSL.g:735:2: ( ( rule__Automaton__TransitionsAssignment_4_2 ) )
                    {
                    // InternalMontiArcDSL.g:735:2: ( ( rule__Automaton__TransitionsAssignment_4_2 ) )
                    // InternalMontiArcDSL.g:736:3: ( rule__Automaton__TransitionsAssignment_4_2 )
                    {
                     before(grammarAccess.getAutomatonAccess().getTransitionsAssignment_4_2()); 
                    // InternalMontiArcDSL.g:737:3: ( rule__Automaton__TransitionsAssignment_4_2 )
                    // InternalMontiArcDSL.g:737:4: rule__Automaton__TransitionsAssignment_4_2
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMontiArcDSL.g:745:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:749:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMontiArcDSL.g:750:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiArcDSL.g:750:2: ( ruleMCPrimitiveType )
                    // InternalMontiArcDSL.g:751:3: ruleMCPrimitiveType
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
                    // InternalMontiArcDSL.g:756:2: ( ruleMCArrayType )
                    {
                    // InternalMontiArcDSL.g:756:2: ( ruleMCArrayType )
                    // InternalMontiArcDSL.g:757:3: ruleMCArrayType
                    {
                     before(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMCArrayType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1()); 

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
    // InternalMontiArcDSL.g:766:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:770:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            case 17:
                {
                alt5=6;
                }
                break;
            case 18:
                {
                alt5=7;
                }
                break;
            case 19:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMontiArcDSL.g:771:2: ( 'boolean' )
                    {
                    // InternalMontiArcDSL.g:771:2: ( 'boolean' )
                    // InternalMontiArcDSL.g:772:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:777:2: ( 'byte' )
                    {
                    // InternalMontiArcDSL.g:777:2: ( 'byte' )
                    // InternalMontiArcDSL.g:778:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:783:2: ( 'short' )
                    {
                    // InternalMontiArcDSL.g:783:2: ( 'short' )
                    // InternalMontiArcDSL.g:784:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:789:2: ( 'int' )
                    {
                    // InternalMontiArcDSL.g:789:2: ( 'int' )
                    // InternalMontiArcDSL.g:790:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:795:2: ( 'long' )
                    {
                    // InternalMontiArcDSL.g:795:2: ( 'long' )
                    // InternalMontiArcDSL.g:796:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:801:2: ( 'char' )
                    {
                    // InternalMontiArcDSL.g:801:2: ( 'char' )
                    // InternalMontiArcDSL.g:802:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:807:2: ( 'float' )
                    {
                    // InternalMontiArcDSL.g:807:2: ( 'float' )
                    // InternalMontiArcDSL.g:808:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:813:2: ( 'double' )
                    {
                    // InternalMontiArcDSL.g:813:2: ( 'double' )
                    // InternalMontiArcDSL.g:814:3: 'double'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 

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


    // $ANTLR start "rule__MACompilationUnit__Group__0"
    // InternalMontiArcDSL.g:823:1: rule__MACompilationUnit__Group__0 : rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 ;
    public final void rule__MACompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:827:1: ( rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 )
            // InternalMontiArcDSL.g:828:2: rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1
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
    // InternalMontiArcDSL.g:835:1: rule__MACompilationUnit__Group__0__Impl : ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__MACompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:839:1: ( ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcDSL.g:840:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:840:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcDSL.g:841:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcDSL.g:842:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            // InternalMontiArcDSL.g:842:3: rule__MACompilationUnit__PackageAssignment_0
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
    // InternalMontiArcDSL.g:850:1: rule__MACompilationUnit__Group__1 : rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 ;
    public final void rule__MACompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:854:1: ( rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 )
            // InternalMontiArcDSL.g:855:2: rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2
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
    // InternalMontiArcDSL.g:862:1: rule__MACompilationUnit__Group__1__Impl : ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__MACompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:866:1: ( ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcDSL.g:867:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcDSL.g:867:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcDSL.g:868:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcDSL.g:869:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMontiArcDSL.g:869:3: rule__MACompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MACompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMontiArcDSL.g:877:1: rule__MACompilationUnit__Group__2 : rule__MACompilationUnit__Group__2__Impl ;
    public final void rule__MACompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:881:1: ( rule__MACompilationUnit__Group__2__Impl )
            // InternalMontiArcDSL.g:882:2: rule__MACompilationUnit__Group__2__Impl
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
    // InternalMontiArcDSL.g:888:1: rule__MACompilationUnit__Group__2__Impl : ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) ;
    public final void rule__MACompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:892:1: ( ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) )
            // InternalMontiArcDSL.g:893:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:893:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            // InternalMontiArcDSL.g:894:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 
            // InternalMontiArcDSL.g:895:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            // InternalMontiArcDSL.g:895:3: rule__MACompilationUnit__ComponentAssignment_2
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
    // InternalMontiArcDSL.g:904:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:908:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMontiArcDSL.g:909:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMontiArcDSL.g:916:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:920:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:921:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:921:1: ( 'component' )
            // InternalMontiArcDSL.g:922:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:931:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:935:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMontiArcDSL.g:936:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMontiArcDSL.g:943:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:947:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:948:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:948:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:949:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:950:2: ( rule__Component__NameAssignment_1 )
            // InternalMontiArcDSL.g:950:3: rule__Component__NameAssignment_1
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
    // InternalMontiArcDSL.g:958:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:962:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMontiArcDSL.g:963:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMontiArcDSL.g:970:1: rule__Component__Group__2__Impl : ( ( rule__Component__SignatureAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:974:1: ( ( ( rule__Component__SignatureAssignment_2 ) ) )
            // InternalMontiArcDSL.g:975:1: ( ( rule__Component__SignatureAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:975:1: ( ( rule__Component__SignatureAssignment_2 ) )
            // InternalMontiArcDSL.g:976:2: ( rule__Component__SignatureAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getSignatureAssignment_2()); 
            // InternalMontiArcDSL.g:977:2: ( rule__Component__SignatureAssignment_2 )
            // InternalMontiArcDSL.g:977:3: rule__Component__SignatureAssignment_2
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
    // InternalMontiArcDSL.g:985:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:989:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMontiArcDSL.g:990:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMontiArcDSL.g:997:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1001:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:1002:1: ( '{' )
            {
            // InternalMontiArcDSL.g:1002:1: ( '{' )
            // InternalMontiArcDSL.g:1003:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1012:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1016:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMontiArcDSL.g:1017:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMontiArcDSL.g:1024:1: rule__Component__Group__4__Impl : ( ( rule__Component__ArcElementsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1028:1: ( ( ( rule__Component__ArcElementsAssignment_4 )* ) )
            // InternalMontiArcDSL.g:1029:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            {
            // InternalMontiArcDSL.g:1029:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            // InternalMontiArcDSL.g:1030:2: ( rule__Component__ArcElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getArcElementsAssignment_4()); 
            // InternalMontiArcDSL.g:1031:2: ( rule__Component__ArcElementsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=12 && LA7_0<=20)||LA7_0==27||(LA7_0>=29 && LA7_0<=30)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1031:3: rule__Component__ArcElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ArcElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalMontiArcDSL.g:1039:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1043:1: ( rule__Component__Group__5__Impl )
            // InternalMontiArcDSL.g:1044:2: rule__Component__Group__5__Impl
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
    // InternalMontiArcDSL.g:1050:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1054:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:1055:1: ( '}' )
            {
            // InternalMontiArcDSL.g:1055:1: ( '}' )
            // InternalMontiArcDSL.g:1056:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1066:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1070:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMontiArcDSL.g:1071:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalMontiArcDSL.g:1078:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1082:1: ( ( () ) )
            // InternalMontiArcDSL.g:1083:1: ( () )
            {
            // InternalMontiArcDSL.g:1083:1: ( () )
            // InternalMontiArcDSL.g:1084:2: ()
            {
             before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            // InternalMontiArcDSL.g:1085:2: ()
            // InternalMontiArcDSL.g:1085:3: 
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
    // InternalMontiArcDSL.g:1093:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1097:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMontiArcDSL.g:1098:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalMontiArcDSL.g:1105:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__ParametersAssignment_1 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1109:1: ( ( ( rule__Signature__ParametersAssignment_1 )? ) )
            // InternalMontiArcDSL.g:1110:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:1110:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            // InternalMontiArcDSL.g:1111:2: ( rule__Signature__ParametersAssignment_1 )?
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1()); 
            // InternalMontiArcDSL.g:1112:2: ( rule__Signature__ParametersAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=19)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcDSL.g:1112:3: rule__Signature__ParametersAssignment_1
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
    // InternalMontiArcDSL.g:1120:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1124:1: ( rule__Signature__Group__2__Impl )
            // InternalMontiArcDSL.g:1125:2: rule__Signature__Group__2__Impl
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
    // InternalMontiArcDSL.g:1131:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )? ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1135:1: ( ( ( rule__Signature__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1136:1: ( ( rule__Signature__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1136:1: ( ( rule__Signature__Group_2__0 )? )
            // InternalMontiArcDSL.g:1137:2: ( rule__Signature__Group_2__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1138:2: ( rule__Signature__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMontiArcDSL.g:1138:3: rule__Signature__Group_2__0
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
    // InternalMontiArcDSL.g:1147:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1151:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalMontiArcDSL.g:1152:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
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
    // InternalMontiArcDSL.g:1159:1: rule__Signature__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1163:1: ( ( 'extends' ) )
            // InternalMontiArcDSL.g:1164:1: ( 'extends' )
            {
            // InternalMontiArcDSL.g:1164:1: ( 'extends' )
            // InternalMontiArcDSL.g:1165:2: 'extends'
            {
             before(grammarAccess.getSignatureAccess().getExtendsKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1174:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1178:1: ( rule__Signature__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1179:2: rule__Signature__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:1185:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__TypeAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1189:1: ( ( ( rule__Signature__TypeAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1190:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1190:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1191:2: ( rule__Signature__TypeAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_2_1()); 
            // InternalMontiArcDSL.g:1192:2: ( rule__Signature__TypeAssignment_2_1 )
            // InternalMontiArcDSL.g:1192:3: rule__Signature__TypeAssignment_2_1
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
    // InternalMontiArcDSL.g:1201:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1205:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMontiArcDSL.g:1206:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalMontiArcDSL.g:1213:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParametersAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1217:1: ( ( ( rule__Parameters__ParametersAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1218:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1218:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            // InternalMontiArcDSL.g:1219:2: ( rule__Parameters__ParametersAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_0()); 
            // InternalMontiArcDSL.g:1220:2: ( rule__Parameters__ParametersAssignment_0 )
            // InternalMontiArcDSL.g:1220:3: rule__Parameters__ParametersAssignment_0
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
    // InternalMontiArcDSL.g:1228:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1232:1: ( rule__Parameters__Group__1__Impl )
            // InternalMontiArcDSL.g:1233:2: rule__Parameters__Group__1__Impl
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
    // InternalMontiArcDSL.g:1239:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1243:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:1244:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:1244:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalMontiArcDSL.g:1245:2: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:1246:2: ( rule__Parameters__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1246:3: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMontiArcDSL.g:1255:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1259:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalMontiArcDSL.g:1260:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
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
    // InternalMontiArcDSL.g:1267:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1271:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:1272:1: ( ',' )
            {
            // InternalMontiArcDSL.g:1272:1: ( ',' )
            // InternalMontiArcDSL.g:1273:2: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1282:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1286:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalMontiArcDSL.g:1287:2: rule__Parameters__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:1293:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1297:1: ( ( ( rule__Parameters__ParametersAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:1298:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:1298:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            // InternalMontiArcDSL.g:1299:2: ( rule__Parameters__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 
            // InternalMontiArcDSL.g:1300:2: ( rule__Parameters__ParametersAssignment_1_1 )
            // InternalMontiArcDSL.g:1300:3: rule__Parameters__ParametersAssignment_1_1
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
    // InternalMontiArcDSL.g:1309:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1313:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMontiArcDSL.g:1314:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalMontiArcDSL.g:1321:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1325:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1326:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1326:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:1327:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:1328:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMontiArcDSL.g:1328:3: rule__Parameter__TypeAssignment_0
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
    // InternalMontiArcDSL.g:1336:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1340:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMontiArcDSL.g:1341:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalMontiArcDSL.g:1348:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1352:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1353:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1353:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1354:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1355:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMontiArcDSL.g:1355:3: rule__Parameter__NameAssignment_1
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
    // InternalMontiArcDSL.g:1363:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1367:1: ( rule__Parameter__Group__2__Impl )
            // InternalMontiArcDSL.g:1368:2: rule__Parameter__Group__2__Impl
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
    // InternalMontiArcDSL.g:1374:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1378:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1379:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1379:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalMontiArcDSL.g:1380:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1381:2: ( rule__Parameter__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcDSL.g:1381:3: rule__Parameter__Group_2__0
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
    // InternalMontiArcDSL.g:1390:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1394:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalMontiArcDSL.g:1395:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
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
    // InternalMontiArcDSL.g:1402:1: rule__Parameter__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1406:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:1407:1: ( '=' )
            {
            // InternalMontiArcDSL.g:1407:1: ( '=' )
            // InternalMontiArcDSL.g:1408:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1417:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1421:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1422:2: rule__Parameter__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:1428:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1432:1: ( ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1433:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1433:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1434:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:1435:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:1435:3: rule__Parameter__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:1444:1: rule__SubComponent__Group__0 : rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 ;
    public final void rule__SubComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1448:1: ( rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 )
            // InternalMontiArcDSL.g:1449:2: rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1
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
    // InternalMontiArcDSL.g:1456:1: rule__SubComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__SubComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1460:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1461:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1461:1: ( 'component' )
            // InternalMontiArcDSL.g:1462:2: 'component'
            {
             before(grammarAccess.getSubComponentAccess().getComponentKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1471:1: rule__SubComponent__Group__1 : rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 ;
    public final void rule__SubComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1475:1: ( rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 )
            // InternalMontiArcDSL.g:1476:2: rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2
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
    // InternalMontiArcDSL.g:1483:1: rule__SubComponent__Group__1__Impl : ( ( rule__SubComponent__TypeAssignment_1 ) ) ;
    public final void rule__SubComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1487:1: ( ( ( rule__SubComponent__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1488:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1488:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:1489:2: ( rule__SubComponent__TypeAssignment_1 )
            {
             before(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:1490:2: ( rule__SubComponent__TypeAssignment_1 )
            // InternalMontiArcDSL.g:1490:3: rule__SubComponent__TypeAssignment_1
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
    // InternalMontiArcDSL.g:1498:1: rule__SubComponent__Group__2 : rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 ;
    public final void rule__SubComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1502:1: ( rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 )
            // InternalMontiArcDSL.g:1503:2: rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3
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
    // InternalMontiArcDSL.g:1510:1: rule__SubComponent__Group__2__Impl : ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) ;
    public final void rule__SubComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1514:1: ( ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) )
            // InternalMontiArcDSL.g:1515:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:1515:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            // InternalMontiArcDSL.g:1516:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 
            // InternalMontiArcDSL.g:1517:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMontiArcDSL.g:1517:3: rule__SubComponent__ArgumentsAssignment_2
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
    // InternalMontiArcDSL.g:1525:1: rule__SubComponent__Group__3 : rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 ;
    public final void rule__SubComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1529:1: ( rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 )
            // InternalMontiArcDSL.g:1530:2: rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4
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
    // InternalMontiArcDSL.g:1537:1: rule__SubComponent__Group__3__Impl : ( ( rule__SubComponent__InstancesAssignment_3 ) ) ;
    public final void rule__SubComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1541:1: ( ( ( rule__SubComponent__InstancesAssignment_3 ) ) )
            // InternalMontiArcDSL.g:1542:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:1542:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            // InternalMontiArcDSL.g:1543:2: ( rule__SubComponent__InstancesAssignment_3 )
            {
             before(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 
            // InternalMontiArcDSL.g:1544:2: ( rule__SubComponent__InstancesAssignment_3 )
            // InternalMontiArcDSL.g:1544:3: rule__SubComponent__InstancesAssignment_3
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
    // InternalMontiArcDSL.g:1552:1: rule__SubComponent__Group__4 : rule__SubComponent__Group__4__Impl ;
    public final void rule__SubComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1556:1: ( rule__SubComponent__Group__4__Impl )
            // InternalMontiArcDSL.g:1557:2: rule__SubComponent__Group__4__Impl
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
    // InternalMontiArcDSL.g:1563:1: rule__SubComponent__Group__4__Impl : ( ';' ) ;
    public final void rule__SubComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1567:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1568:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1568:1: ( ';' )
            // InternalMontiArcDSL.g:1569:2: ';'
            {
             before(grammarAccess.getSubComponentAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1579:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1583:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalMontiArcDSL.g:1584:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
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
    // InternalMontiArcDSL.g:1591:1: rule__Connector__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1595:1: ( ( 'connect' ) )
            // InternalMontiArcDSL.g:1596:1: ( 'connect' )
            {
            // InternalMontiArcDSL.g:1596:1: ( 'connect' )
            // InternalMontiArcDSL.g:1597:2: 'connect'
            {
             before(grammarAccess.getConnectorAccess().getConnectKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1606:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1610:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalMontiArcDSL.g:1611:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
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
    // InternalMontiArcDSL.g:1618:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__SourceAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1622:1: ( ( ( rule__Connector__SourceAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1623:1: ( ( rule__Connector__SourceAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1623:1: ( ( rule__Connector__SourceAssignment_1 ) )
            // InternalMontiArcDSL.g:1624:2: ( rule__Connector__SourceAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAssignment_1()); 
            // InternalMontiArcDSL.g:1625:2: ( rule__Connector__SourceAssignment_1 )
            // InternalMontiArcDSL.g:1625:3: rule__Connector__SourceAssignment_1
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
    // InternalMontiArcDSL.g:1633:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1637:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalMontiArcDSL.g:1638:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
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
    // InternalMontiArcDSL.g:1645:1: rule__Connector__Group__2__Impl : ( '->' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1649:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:1650:1: ( '->' )
            {
            // InternalMontiArcDSL.g:1650:1: ( '->' )
            // InternalMontiArcDSL.g:1651:2: '->'
            {
             before(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1660:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1664:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalMontiArcDSL.g:1665:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
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
    // InternalMontiArcDSL.g:1672:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__TargetsAssignment_3 ) ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1676:1: ( ( ( rule__Connector__TargetsAssignment_3 ) ) )
            // InternalMontiArcDSL.g:1677:1: ( ( rule__Connector__TargetsAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:1677:1: ( ( rule__Connector__TargetsAssignment_3 ) )
            // InternalMontiArcDSL.g:1678:2: ( rule__Connector__TargetsAssignment_3 )
            {
             before(grammarAccess.getConnectorAccess().getTargetsAssignment_3()); 
            // InternalMontiArcDSL.g:1679:2: ( rule__Connector__TargetsAssignment_3 )
            // InternalMontiArcDSL.g:1679:3: rule__Connector__TargetsAssignment_3
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
    // InternalMontiArcDSL.g:1687:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1691:1: ( rule__Connector__Group__4__Impl )
            // InternalMontiArcDSL.g:1692:2: rule__Connector__Group__4__Impl
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
    // InternalMontiArcDSL.g:1698:1: rule__Connector__Group__4__Impl : ( ';' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1702:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1703:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1703:1: ( ';' )
            // InternalMontiArcDSL.g:1704:2: ';'
            {
             before(grammarAccess.getConnectorAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1714:1: rule__Ports__Group__0 : rule__Ports__Group__0__Impl rule__Ports__Group__1 ;
    public final void rule__Ports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1718:1: ( rule__Ports__Group__0__Impl rule__Ports__Group__1 )
            // InternalMontiArcDSL.g:1719:2: rule__Ports__Group__0__Impl rule__Ports__Group__1
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
    // InternalMontiArcDSL.g:1726:1: rule__Ports__Group__0__Impl : ( 'port' ) ;
    public final void rule__Ports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1730:1: ( ( 'port' ) )
            // InternalMontiArcDSL.g:1731:1: ( 'port' )
            {
            // InternalMontiArcDSL.g:1731:1: ( 'port' )
            // InternalMontiArcDSL.g:1732:2: 'port'
            {
             before(grammarAccess.getPortsAccess().getPortKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1741:1: rule__Ports__Group__1 : rule__Ports__Group__1__Impl rule__Ports__Group__2 ;
    public final void rule__Ports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1745:1: ( rule__Ports__Group__1__Impl rule__Ports__Group__2 )
            // InternalMontiArcDSL.g:1746:2: rule__Ports__Group__1__Impl rule__Ports__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMontiArcDSL.g:1753:1: rule__Ports__Group__1__Impl : ( ( rule__Ports__PortsAssignment_1 ) ) ;
    public final void rule__Ports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1757:1: ( ( ( rule__Ports__PortsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1758:1: ( ( rule__Ports__PortsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1758:1: ( ( rule__Ports__PortsAssignment_1 ) )
            // InternalMontiArcDSL.g:1759:2: ( rule__Ports__PortsAssignment_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_1()); 
            // InternalMontiArcDSL.g:1760:2: ( rule__Ports__PortsAssignment_1 )
            // InternalMontiArcDSL.g:1760:3: rule__Ports__PortsAssignment_1
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
    // InternalMontiArcDSL.g:1768:1: rule__Ports__Group__2 : rule__Ports__Group__2__Impl rule__Ports__Group__3 ;
    public final void rule__Ports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1772:1: ( rule__Ports__Group__2__Impl rule__Ports__Group__3 )
            // InternalMontiArcDSL.g:1773:2: rule__Ports__Group__2__Impl rule__Ports__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMontiArcDSL.g:1780:1: rule__Ports__Group__2__Impl : ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) ) ;
    public final void rule__Ports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1784:1: ( ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) ) )
            // InternalMontiArcDSL.g:1785:1: ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) )
            {
            // InternalMontiArcDSL.g:1785:1: ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:1786:2: ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:1786:2: ( ( rule__Ports__Group_2__0 ) )
            // InternalMontiArcDSL.g:1787:3: ( rule__Ports__Group_2__0 )
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1788:3: ( rule__Ports__Group_2__0 )
            // InternalMontiArcDSL.g:1788:4: rule__Ports__Group_2__0
            {
            pushFollow(FOLLOW_12);
            rule__Ports__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getGroup_2()); 

            }

            // InternalMontiArcDSL.g:1791:2: ( ( rule__Ports__Group_2__0 )* )
            // InternalMontiArcDSL.g:1792:3: ( rule__Ports__Group_2__0 )*
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1793:3: ( rule__Ports__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1793:4: rule__Ports__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Ports__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPortsAccess().getGroup_2()); 

            }


            }


            }

        }
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
    // InternalMontiArcDSL.g:1802:1: rule__Ports__Group__3 : rule__Ports__Group__3__Impl ;
    public final void rule__Ports__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1806:1: ( rule__Ports__Group__3__Impl )
            // InternalMontiArcDSL.g:1807:2: rule__Ports__Group__3__Impl
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
    // InternalMontiArcDSL.g:1813:1: rule__Ports__Group__3__Impl : ( ';' ) ;
    public final void rule__Ports__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1817:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1818:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1818:1: ( ';' )
            // InternalMontiArcDSL.g:1819:2: ';'
            {
             before(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1829:1: rule__Ports__Group_2__0 : rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 ;
    public final void rule__Ports__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1833:1: ( rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 )
            // InternalMontiArcDSL.g:1834:2: rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1
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
    // InternalMontiArcDSL.g:1841:1: rule__Ports__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Ports__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1845:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:1846:1: ( ',' )
            {
            // InternalMontiArcDSL.g:1846:1: ( ',' )
            // InternalMontiArcDSL.g:1847:2: ','
            {
             before(grammarAccess.getPortsAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1856:1: rule__Ports__Group_2__1 : rule__Ports__Group_2__1__Impl ;
    public final void rule__Ports__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1860:1: ( rule__Ports__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1861:2: rule__Ports__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:1867:1: rule__Ports__Group_2__1__Impl : ( ( rule__Ports__PortsAssignment_2_1 ) ) ;
    public final void rule__Ports__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1871:1: ( ( ( rule__Ports__PortsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1872:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1872:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1873:2: ( rule__Ports__PortsAssignment_2_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_2_1()); 
            // InternalMontiArcDSL.g:1874:2: ( rule__Ports__PortsAssignment_2_1 )
            // InternalMontiArcDSL.g:1874:3: rule__Ports__PortsAssignment_2_1
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
    // InternalMontiArcDSL.g:1883:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1887:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMontiArcDSL.g:1888:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMontiArcDSL.g:1895:1: rule__Port__Group__0__Impl : ( ( rule__Port__Alternatives_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1899:1: ( ( ( rule__Port__Alternatives_0 ) ) )
            // InternalMontiArcDSL.g:1900:1: ( ( rule__Port__Alternatives_0 ) )
            {
            // InternalMontiArcDSL.g:1900:1: ( ( rule__Port__Alternatives_0 ) )
            // InternalMontiArcDSL.g:1901:2: ( rule__Port__Alternatives_0 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_0()); 
            // InternalMontiArcDSL.g:1902:2: ( rule__Port__Alternatives_0 )
            // InternalMontiArcDSL.g:1902:3: rule__Port__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:1910:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1914:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMontiArcDSL.g:1915:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMontiArcDSL.g:1922:1: rule__Port__Group__1__Impl : ( ( rule__Port__TypeAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1926:1: ( ( ( rule__Port__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1927:1: ( ( rule__Port__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1927:1: ( ( rule__Port__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:1928:2: ( rule__Port__TypeAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:1929:2: ( rule__Port__TypeAssignment_1 )
            // InternalMontiArcDSL.g:1929:3: rule__Port__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:1937:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1941:1: ( rule__Port__Group__2__Impl )
            // InternalMontiArcDSL.g:1942:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:1948:1: rule__Port__Group__2__Impl : ( ( rule__Port__NamesAssignment_2 )? ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1952:1: ( ( ( rule__Port__NamesAssignment_2 )? ) )
            // InternalMontiArcDSL.g:1953:1: ( ( rule__Port__NamesAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:1953:1: ( ( rule__Port__NamesAssignment_2 )? )
            // InternalMontiArcDSL.g:1954:2: ( rule__Port__NamesAssignment_2 )?
            {
             before(grammarAccess.getPortAccess().getNamesAssignment_2()); 
            // InternalMontiArcDSL.g:1955:2: ( rule__Port__NamesAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMontiArcDSL.g:1955:3: rule__Port__NamesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__NamesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getNamesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Names__Group__0"
    // InternalMontiArcDSL.g:1964:1: rule__Names__Group__0 : rule__Names__Group__0__Impl rule__Names__Group__1 ;
    public final void rule__Names__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1968:1: ( rule__Names__Group__0__Impl rule__Names__Group__1 )
            // InternalMontiArcDSL.g:1969:2: rule__Names__Group__0__Impl rule__Names__Group__1
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
    // InternalMontiArcDSL.g:1976:1: rule__Names__Group__0__Impl : ( ( rule__Names__NamesAssignment_0 ) ) ;
    public final void rule__Names__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1980:1: ( ( ( rule__Names__NamesAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1981:1: ( ( rule__Names__NamesAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1981:1: ( ( rule__Names__NamesAssignment_0 ) )
            // InternalMontiArcDSL.g:1982:2: ( rule__Names__NamesAssignment_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_0()); 
            // InternalMontiArcDSL.g:1983:2: ( rule__Names__NamesAssignment_0 )
            // InternalMontiArcDSL.g:1983:3: rule__Names__NamesAssignment_0
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
    // InternalMontiArcDSL.g:1991:1: rule__Names__Group__1 : rule__Names__Group__1__Impl ;
    public final void rule__Names__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1995:1: ( rule__Names__Group__1__Impl )
            // InternalMontiArcDSL.g:1996:2: rule__Names__Group__1__Impl
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
    // InternalMontiArcDSL.g:2002:1: rule__Names__Group__1__Impl : ( ( rule__Names__Group_1__0 )* ) ;
    public final void rule__Names__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2006:1: ( ( ( rule__Names__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:2007:1: ( ( rule__Names__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:2007:1: ( ( rule__Names__Group_1__0 )* )
            // InternalMontiArcDSL.g:2008:2: ( rule__Names__Group_1__0 )*
            {
             before(grammarAccess.getNamesAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2009:2: ( rule__Names__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==RULE_ID) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2009:3: rule__Names__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Names__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMontiArcDSL.g:2018:1: rule__Names__Group_1__0 : rule__Names__Group_1__0__Impl rule__Names__Group_1__1 ;
    public final void rule__Names__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2022:1: ( rule__Names__Group_1__0__Impl rule__Names__Group_1__1 )
            // InternalMontiArcDSL.g:2023:2: rule__Names__Group_1__0__Impl rule__Names__Group_1__1
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
    // InternalMontiArcDSL.g:2030:1: rule__Names__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Names__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2034:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2035:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2035:1: ( ',' )
            // InternalMontiArcDSL.g:2036:2: ','
            {
             before(grammarAccess.getNamesAccess().getCommaKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2045:1: rule__Names__Group_1__1 : rule__Names__Group_1__1__Impl ;
    public final void rule__Names__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2049:1: ( rule__Names__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2050:2: rule__Names__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2056:1: rule__Names__Group_1__1__Impl : ( ( rule__Names__NamesAssignment_1_1 ) ) ;
    public final void rule__Names__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2060:1: ( ( ( rule__Names__NamesAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2061:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2061:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2062:2: ( rule__Names__NamesAssignment_1_1 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 
            // InternalMontiArcDSL.g:2063:2: ( rule__Names__NamesAssignment_1_1 )
            // InternalMontiArcDSL.g:2063:3: rule__Names__NamesAssignment_1_1
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
    // InternalMontiArcDSL.g:2072:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2076:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMontiArcDSL.g:2077:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMontiArcDSL.g:2084:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2088:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2089:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2089:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:2090:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:2091:2: ( rule__Variable__TypeAssignment_0 )
            // InternalMontiArcDSL.g:2091:3: rule__Variable__TypeAssignment_0
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
    // InternalMontiArcDSL.g:2099:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2103:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMontiArcDSL.g:2104:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMontiArcDSL.g:2111:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NamesAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2115:1: ( ( ( rule__Variable__NamesAssignment_1 )? ) )
            // InternalMontiArcDSL.g:2116:1: ( ( rule__Variable__NamesAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:2116:1: ( ( rule__Variable__NamesAssignment_1 )? )
            // InternalMontiArcDSL.g:2117:2: ( rule__Variable__NamesAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1()); 
            // InternalMontiArcDSL.g:2118:2: ( rule__Variable__NamesAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcDSL.g:2118:3: rule__Variable__NamesAssignment_1
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
    // InternalMontiArcDSL.g:2126:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2130:1: ( rule__Variable__Group__2__Impl )
            // InternalMontiArcDSL.g:2131:2: rule__Variable__Group__2__Impl
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
    // InternalMontiArcDSL.g:2137:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2141:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2142:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2142:1: ( ';' )
            // InternalMontiArcDSL.g:2143:2: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2153:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2157:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalMontiArcDSL.g:2158:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMontiArcDSL.g:2165:1: rule__Automaton__Group__0__Impl : ( () ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2169:1: ( ( () ) )
            // InternalMontiArcDSL.g:2170:1: ( () )
            {
            // InternalMontiArcDSL.g:2170:1: ( () )
            // InternalMontiArcDSL.g:2171:2: ()
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 
            // InternalMontiArcDSL.g:2172:2: ()
            // InternalMontiArcDSL.g:2172:3: 
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
    // InternalMontiArcDSL.g:2180:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2184:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalMontiArcDSL.g:2185:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMontiArcDSL.g:2192:1: rule__Automaton__Group__1__Impl : ( 'automaton' ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2196:1: ( ( 'automaton' ) )
            // InternalMontiArcDSL.g:2197:1: ( 'automaton' )
            {
            // InternalMontiArcDSL.g:2197:1: ( 'automaton' )
            // InternalMontiArcDSL.g:2198:2: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2207:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2211:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalMontiArcDSL.g:2212:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalMontiArcDSL.g:2219:1: rule__Automaton__Group__2__Impl : ( ( rule__Automaton__NameAssignment_2 )? ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2223:1: ( ( ( rule__Automaton__NameAssignment_2 )? ) )
            // InternalMontiArcDSL.g:2224:1: ( ( rule__Automaton__NameAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:2224:1: ( ( rule__Automaton__NameAssignment_2 )? )
            // InternalMontiArcDSL.g:2225:2: ( rule__Automaton__NameAssignment_2 )?
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_2()); 
            // InternalMontiArcDSL.g:2226:2: ( rule__Automaton__NameAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMontiArcDSL.g:2226:3: rule__Automaton__NameAssignment_2
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
    // InternalMontiArcDSL.g:2234:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2238:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalMontiArcDSL.g:2239:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalMontiArcDSL.g:2246:1: rule__Automaton__Group__3__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2250:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:2251:1: ( '{' )
            {
            // InternalMontiArcDSL.g:2251:1: ( '{' )
            // InternalMontiArcDSL.g:2252:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2261:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2265:1: ( rule__Automaton__Group__4__Impl rule__Automaton__Group__5 )
            // InternalMontiArcDSL.g:2266:2: rule__Automaton__Group__4__Impl rule__Automaton__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalMontiArcDSL.g:2273:1: rule__Automaton__Group__4__Impl : ( ( rule__Automaton__Alternatives_4 )* ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2277:1: ( ( ( rule__Automaton__Alternatives_4 )* ) )
            // InternalMontiArcDSL.g:2278:1: ( ( rule__Automaton__Alternatives_4 )* )
            {
            // InternalMontiArcDSL.g:2278:1: ( ( rule__Automaton__Alternatives_4 )* )
            // InternalMontiArcDSL.g:2279:2: ( rule__Automaton__Alternatives_4 )*
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_4()); 
            // InternalMontiArcDSL.g:2280:2: ( rule__Automaton__Alternatives_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=31 && LA18_0<=32)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2280:3: rule__Automaton__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Automaton__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMontiArcDSL.g:2288:1: rule__Automaton__Group__5 : rule__Automaton__Group__5__Impl ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2292:1: ( rule__Automaton__Group__5__Impl )
            // InternalMontiArcDSL.g:2293:2: rule__Automaton__Group__5__Impl
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
    // InternalMontiArcDSL.g:2299:1: rule__Automaton__Group__5__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2303:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:2304:1: ( '}' )
            {
            // InternalMontiArcDSL.g:2304:1: ( '}' )
            // InternalMontiArcDSL.g:2305:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2315:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2319:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMontiArcDSL.g:2320:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalMontiArcDSL.g:2327:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2331:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:2332:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:2332:1: ( 'state' )
            // InternalMontiArcDSL.g:2333:2: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2342:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2346:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMontiArcDSL.g:2347:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalMontiArcDSL.g:2354:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2358:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2359:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2359:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2360:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2361:2: ( rule__State__NameAssignment_1 )
            // InternalMontiArcDSL.g:2361:3: rule__State__NameAssignment_1
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
    // InternalMontiArcDSL.g:2369:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2373:1: ( rule__State__Group__2__Impl )
            // InternalMontiArcDSL.g:2374:2: rule__State__Group__2__Impl
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
    // InternalMontiArcDSL.g:2380:1: rule__State__Group__2__Impl : ( ';' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2384:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2385:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2385:1: ( ';' )
            // InternalMontiArcDSL.g:2386:2: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2396:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2400:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalMontiArcDSL.g:2401:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
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
    // InternalMontiArcDSL.g:2408:1: rule__InitialState__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2412:1: ( ( 'initial' ) )
            // InternalMontiArcDSL.g:2413:1: ( 'initial' )
            {
            // InternalMontiArcDSL.g:2413:1: ( 'initial' )
            // InternalMontiArcDSL.g:2414:2: 'initial'
            {
             before(grammarAccess.getInitialStateAccess().getInitialKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2423:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2427:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalMontiArcDSL.g:2428:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiArcDSL.g:2435:1: rule__InitialState__Group__1__Impl : ( ( rule__InitialState__NameAssignment_1 ) ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2439:1: ( ( ( rule__InitialState__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2440:1: ( ( rule__InitialState__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2440:1: ( ( rule__InitialState__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2441:2: ( rule__InitialState__NameAssignment_1 )
            {
             before(grammarAccess.getInitialStateAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2442:2: ( rule__InitialState__NameAssignment_1 )
            // InternalMontiArcDSL.g:2442:3: rule__InitialState__NameAssignment_1
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
    // InternalMontiArcDSL.g:2450:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl rule__InitialState__Group__3 ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2454:1: ( rule__InitialState__Group__2__Impl rule__InitialState__Group__3 )
            // InternalMontiArcDSL.g:2455:2: rule__InitialState__Group__2__Impl rule__InitialState__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiArcDSL.g:2462:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Group_2__0 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2466:1: ( ( ( rule__InitialState__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2467:1: ( ( rule__InitialState__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2467:1: ( ( rule__InitialState__Group_2__0 )? )
            // InternalMontiArcDSL.g:2468:2: ( rule__InitialState__Group_2__0 )?
            {
             before(grammarAccess.getInitialStateAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2469:2: ( rule__InitialState__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcDSL.g:2469:3: rule__InitialState__Group_2__0
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
    // InternalMontiArcDSL.g:2477:1: rule__InitialState__Group__3 : rule__InitialState__Group__3__Impl ;
    public final void rule__InitialState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2481:1: ( rule__InitialState__Group__3__Impl )
            // InternalMontiArcDSL.g:2482:2: rule__InitialState__Group__3__Impl
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
    // InternalMontiArcDSL.g:2488:1: rule__InitialState__Group__3__Impl : ( ';' ) ;
    public final void rule__InitialState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2492:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2493:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2493:1: ( ';' )
            // InternalMontiArcDSL.g:2494:2: ';'
            {
             before(grammarAccess.getInitialStateAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2504:1: rule__InitialState__Group_2__0 : rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1 ;
    public final void rule__InitialState__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2508:1: ( rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1 )
            // InternalMontiArcDSL.g:2509:2: rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1
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
    // InternalMontiArcDSL.g:2516:1: rule__InitialState__Group_2__0__Impl : ( '/' ) ;
    public final void rule__InitialState__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2520:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:2521:1: ( '/' )
            {
            // InternalMontiArcDSL.g:2521:1: ( '/' )
            // InternalMontiArcDSL.g:2522:2: '/'
            {
             before(grammarAccess.getInitialStateAccess().getSolidusKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2531:1: rule__InitialState__Group_2__1 : rule__InitialState__Group_2__1__Impl ;
    public final void rule__InitialState__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2535:1: ( rule__InitialState__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2536:2: rule__InitialState__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2542:1: rule__InitialState__Group_2__1__Impl : ( ( rule__InitialState__BlockAssignment_2_1 ) ) ;
    public final void rule__InitialState__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2546:1: ( ( ( rule__InitialState__BlockAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2547:1: ( ( rule__InitialState__BlockAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2547:1: ( ( rule__InitialState__BlockAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2548:2: ( rule__InitialState__BlockAssignment_2_1 )
            {
             before(grammarAccess.getInitialStateAccess().getBlockAssignment_2_1()); 
            // InternalMontiArcDSL.g:2549:2: ( rule__InitialState__BlockAssignment_2_1 )
            // InternalMontiArcDSL.g:2549:3: rule__InitialState__BlockAssignment_2_1
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
    // InternalMontiArcDSL.g:2558:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2562:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMontiArcDSL.g:2563:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:2570:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2574:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2575:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2575:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:2576:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:2577:2: ( rule__Transition__SourceAssignment_0 )
            // InternalMontiArcDSL.g:2577:3: rule__Transition__SourceAssignment_0
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
    // InternalMontiArcDSL.g:2585:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2589:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMontiArcDSL.g:2590:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:2597:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2601:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:2602:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:2602:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalMontiArcDSL.g:2603:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2604:2: ( rule__Transition__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiArcDSL.g:2604:3: rule__Transition__Group_1__0
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
    // InternalMontiArcDSL.g:2612:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2616:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMontiArcDSL.g:2617:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:2624:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2628:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2629:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2629:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMontiArcDSL.g:2630:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2631:2: ( rule__Transition__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiArcDSL.g:2631:3: rule__Transition__Group_2__0
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
    // InternalMontiArcDSL.g:2639:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2643:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMontiArcDSL.g:2644:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:2651:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2655:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalMontiArcDSL.g:2656:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalMontiArcDSL.g:2656:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalMontiArcDSL.g:2657:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:2658:2: ( rule__Transition__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMontiArcDSL.g:2658:3: rule__Transition__Group_3__0
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
    // InternalMontiArcDSL.g:2666:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2670:1: ( rule__Transition__Group__4__Impl )
            // InternalMontiArcDSL.g:2671:2: rule__Transition__Group__4__Impl
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
    // InternalMontiArcDSL.g:2677:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2681:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2682:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2682:1: ( ';' )
            // InternalMontiArcDSL.g:2683:2: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2693:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2697:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalMontiArcDSL.g:2698:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalMontiArcDSL.g:2705:1: rule__Transition__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2709:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:2710:1: ( '->' )
            {
            // InternalMontiArcDSL.g:2710:1: ( '->' )
            // InternalMontiArcDSL.g:2711:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2720:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2724:1: ( rule__Transition__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2725:2: rule__Transition__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2731:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TargetAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2735:1: ( ( ( rule__Transition__TargetAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2736:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2736:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2737:2: ( rule__Transition__TargetAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 
            // InternalMontiArcDSL.g:2738:2: ( rule__Transition__TargetAssignment_1_1 )
            // InternalMontiArcDSL.g:2738:3: rule__Transition__TargetAssignment_1_1
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
    // InternalMontiArcDSL.g:2747:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2751:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMontiArcDSL.g:2752:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalMontiArcDSL.g:2759:1: rule__Transition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2763:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:2764:1: ( '[' )
            {
            // InternalMontiArcDSL.g:2764:1: ( '[' )
            // InternalMontiArcDSL.g:2765:2: '['
            {
             before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2774:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2778:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalMontiArcDSL.g:2779:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiArcDSL.g:2786:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2790:1: ( ( ( rule__Transition__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2791:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2791:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2792:2: ( rule__Transition__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:2793:2: ( rule__Transition__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:2793:3: rule__Transition__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:2801:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2805:1: ( rule__Transition__Group_2__2__Impl )
            // InternalMontiArcDSL.g:2806:2: rule__Transition__Group_2__2__Impl
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
    // InternalMontiArcDSL.g:2812:1: rule__Transition__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2816:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:2817:1: ( ']' )
            {
            // InternalMontiArcDSL.g:2817:1: ( ']' )
            // InternalMontiArcDSL.g:2818:2: ']'
            {
             before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2828:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2832:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalMontiArcDSL.g:2833:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
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
    // InternalMontiArcDSL.g:2840:1: rule__Transition__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2844:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:2845:1: ( '/' )
            {
            // InternalMontiArcDSL.g:2845:1: ( '/' )
            // InternalMontiArcDSL.g:2846:2: '/'
            {
             before(grammarAccess.getTransitionAccess().getSolidusKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2855:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2859:1: ( rule__Transition__Group_3__1__Impl )
            // InternalMontiArcDSL.g:2860:2: rule__Transition__Group_3__1__Impl
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
    // InternalMontiArcDSL.g:2866:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ReactionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2870:1: ( ( ( rule__Transition__ReactionAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:2871:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:2871:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            // InternalMontiArcDSL.g:2872:2: ( rule__Transition__ReactionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 
            // InternalMontiArcDSL.g:2873:2: ( rule__Transition__ReactionAssignment_3_1 )
            // InternalMontiArcDSL.g:2873:3: rule__Transition__ReactionAssignment_3_1
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
    // InternalMontiArcDSL.g:2882:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2886:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMontiArcDSL.g:2887:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMontiArcDSL.g:2894:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2898:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:2899:1: ( '{' )
            {
            // InternalMontiArcDSL.g:2899:1: ( '{' )
            // InternalMontiArcDSL.g:2900:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2909:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2913:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMontiArcDSL.g:2914:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMontiArcDSL.g:2921:1: rule__Block__Group__1__Impl : ( ( rule__Block__Group_1__0 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2925:1: ( ( ( rule__Block__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:2926:1: ( ( rule__Block__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:2926:1: ( ( rule__Block__Group_1__0 )? )
            // InternalMontiArcDSL.g:2927:2: ( rule__Block__Group_1__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2928:2: ( rule__Block__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMontiArcDSL.g:2928:3: rule__Block__Group_1__0
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
    // InternalMontiArcDSL.g:2936:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2940:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMontiArcDSL.g:2941:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:2948:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2952:1: ( ( ( rule__Block__ExpressionsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:2953:1: ( ( rule__Block__ExpressionsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:2953:1: ( ( rule__Block__ExpressionsAssignment_2 ) )
            // InternalMontiArcDSL.g:2954:2: ( rule__Block__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalMontiArcDSL.g:2955:2: ( rule__Block__ExpressionsAssignment_2 )
            // InternalMontiArcDSL.g:2955:3: rule__Block__ExpressionsAssignment_2
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
    // InternalMontiArcDSL.g:2963:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2967:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalMontiArcDSL.g:2968:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:2975:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )* ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2979:1: ( ( ( rule__Block__Group_3__0 )* ) )
            // InternalMontiArcDSL.g:2980:1: ( ( rule__Block__Group_3__0 )* )
            {
            // InternalMontiArcDSL.g:2980:1: ( ( rule__Block__Group_3__0 )* )
            // InternalMontiArcDSL.g:2981:2: ( rule__Block__Group_3__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:2982:2: ( rule__Block__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2982:3: rule__Block__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Block__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMontiArcDSL.g:2990:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2994:1: ( rule__Block__Group__4__Impl )
            // InternalMontiArcDSL.g:2995:2: rule__Block__Group__4__Impl
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
    // InternalMontiArcDSL.g:3001:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3005:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:3006:1: ( '}' )
            {
            // InternalMontiArcDSL.g:3006:1: ( '}' )
            // InternalMontiArcDSL.g:3007:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3017:1: rule__Block__Group_1__0 : rule__Block__Group_1__0__Impl rule__Block__Group_1__1 ;
    public final void rule__Block__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3021:1: ( rule__Block__Group_1__0__Impl rule__Block__Group_1__1 )
            // InternalMontiArcDSL.g:3022:2: rule__Block__Group_1__0__Impl rule__Block__Group_1__1
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
    // InternalMontiArcDSL.g:3029:1: rule__Block__Group_1__0__Impl : ( ( rule__Block__NameAssignment_1_0 ) ) ;
    public final void rule__Block__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3033:1: ( ( ( rule__Block__NameAssignment_1_0 ) ) )
            // InternalMontiArcDSL.g:3034:1: ( ( rule__Block__NameAssignment_1_0 ) )
            {
            // InternalMontiArcDSL.g:3034:1: ( ( rule__Block__NameAssignment_1_0 ) )
            // InternalMontiArcDSL.g:3035:2: ( rule__Block__NameAssignment_1_0 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1_0()); 
            // InternalMontiArcDSL.g:3036:2: ( rule__Block__NameAssignment_1_0 )
            // InternalMontiArcDSL.g:3036:3: rule__Block__NameAssignment_1_0
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
    // InternalMontiArcDSL.g:3044:1: rule__Block__Group_1__1 : rule__Block__Group_1__1__Impl ;
    public final void rule__Block__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3048:1: ( rule__Block__Group_1__1__Impl )
            // InternalMontiArcDSL.g:3049:2: rule__Block__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:3055:1: rule__Block__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Block__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3059:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:3060:1: ( '=' )
            {
            // InternalMontiArcDSL.g:3060:1: ( '=' )
            // InternalMontiArcDSL.g:3061:2: '='
            {
             before(grammarAccess.getBlockAccess().getEqualsSignKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3071:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3075:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalMontiArcDSL.g:3076:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
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
    // InternalMontiArcDSL.g:3083:1: rule__Block__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3087:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3088:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3088:1: ( ',' )
            // InternalMontiArcDSL.g:3089:2: ','
            {
             before(grammarAccess.getBlockAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3098:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3102:1: ( rule__Block__Group_3__1__Impl )
            // InternalMontiArcDSL.g:3103:2: rule__Block__Group_3__1__Impl
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
    // InternalMontiArcDSL.g:3109:1: rule__Block__Group_3__1__Impl : ( ( rule__Block__ExpressionsAssignment_3_1 ) ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3113:1: ( ( ( rule__Block__ExpressionsAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:3114:1: ( ( rule__Block__ExpressionsAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:3114:1: ( ( rule__Block__ExpressionsAssignment_3_1 ) )
            // InternalMontiArcDSL.g:3115:2: ( rule__Block__ExpressionsAssignment_3_1 )
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_3_1()); 
            // InternalMontiArcDSL.g:3116:2: ( rule__Block__ExpressionsAssignment_3_1 )
            // InternalMontiArcDSL.g:3116:3: rule__Block__ExpressionsAssignment_3_1
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
    // InternalMontiArcDSL.g:3125:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3129:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiArcDSL.g:3130:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMontiArcDSL.g:3137:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3141:1: ( ( 'import' ) )
            // InternalMontiArcDSL.g:3142:1: ( 'import' )
            {
            // InternalMontiArcDSL.g:3142:1: ( 'import' )
            // InternalMontiArcDSL.g:3143:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3152:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3156:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiArcDSL.g:3157:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalMontiArcDSL.g:3164:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3168:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3169:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3169:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiArcDSL.g:3170:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiArcDSL.g:3171:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiArcDSL.g:3171:3: rule__ImportStatements__ImportUriAssignment_1
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
    // InternalMontiArcDSL.g:3179:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3183:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiArcDSL.g:3184:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMontiArcDSL.g:3191:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__Group_2__0 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3195:1: ( ( ( rule__ImportStatements__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:3196:1: ( ( rule__ImportStatements__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:3196:1: ( ( rule__ImportStatements__Group_2__0 )? )
            // InternalMontiArcDSL.g:3197:2: ( rule__ImportStatements__Group_2__0 )?
            {
             before(grammarAccess.getImportStatementsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3198:2: ( rule__ImportStatements__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMontiArcDSL.g:3198:3: rule__ImportStatements__Group_2__0
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
    // InternalMontiArcDSL.g:3206:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3210:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiArcDSL.g:3211:2: rule__ImportStatements__Group__3__Impl
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
    // InternalMontiArcDSL.g:3217:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3221:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3222:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3222:1: ( ';' )
            // InternalMontiArcDSL.g:3223:2: ';'
            {
             before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3233:1: rule__ImportStatements__Group_2__0 : rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1 ;
    public final void rule__ImportStatements__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3237:1: ( rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1 )
            // InternalMontiArcDSL.g:3238:2: rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMontiArcDSL.g:3245:1: rule__ImportStatements__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ImportStatements__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3249:1: ( ( '.' ) )
            // InternalMontiArcDSL.g:3250:1: ( '.' )
            {
            // InternalMontiArcDSL.g:3250:1: ( '.' )
            // InternalMontiArcDSL.g:3251:2: '.'
            {
             before(grammarAccess.getImportStatementsAccess().getFullStopKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3260:1: rule__ImportStatements__Group_2__1 : rule__ImportStatements__Group_2__1__Impl ;
    public final void rule__ImportStatements__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3264:1: ( rule__ImportStatements__Group_2__1__Impl )
            // InternalMontiArcDSL.g:3265:2: rule__ImportStatements__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:3271:1: rule__ImportStatements__Group_2__1__Impl : ( ( rule__ImportStatements__StarAssignment_2_1 ) ) ;
    public final void rule__ImportStatements__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3275:1: ( ( ( rule__ImportStatements__StarAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3276:1: ( ( rule__ImportStatements__StarAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3276:1: ( ( rule__ImportStatements__StarAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3277:2: ( rule__ImportStatements__StarAssignment_2_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2_1()); 
            // InternalMontiArcDSL.g:3278:2: ( rule__ImportStatements__StarAssignment_2_1 )
            // InternalMontiArcDSL.g:3278:3: rule__ImportStatements__StarAssignment_2_1
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
    // InternalMontiArcDSL.g:3287:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3291:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiArcDSL.g:3292:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMontiArcDSL.g:3299:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3303:1: ( ( 'package' ) )
            // InternalMontiArcDSL.g:3304:1: ( 'package' )
            {
            // InternalMontiArcDSL.g:3304:1: ( 'package' )
            // InternalMontiArcDSL.g:3305:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3314:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3318:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiArcDSL.g:3319:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalMontiArcDSL.g:3326:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3330:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3331:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3331:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:3332:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:3333:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiArcDSL.g:3333:3: rule__Package__NameAssignment_1
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
    // InternalMontiArcDSL.g:3341:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3345:1: ( rule__Package__Group__2__Impl )
            // InternalMontiArcDSL.g:3346:2: rule__Package__Group__2__Impl
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
    // InternalMontiArcDSL.g:3352:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3356:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3357:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3357:1: ( ';' )
            // InternalMontiArcDSL.g:3358:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__MCArrayType__Group__0"
    // InternalMontiArcDSL.g:3368:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3372:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiArcDSL.g:3373:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3380:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3384:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiArcDSL.g:3385:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiArcDSL.g:3385:1: ( ruleMCPrimitiveType )
            // InternalMontiArcDSL.g:3386:2: ruleMCPrimitiveType
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
    // InternalMontiArcDSL.g:3395:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3399:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiArcDSL.g:3400:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiArcDSL.g:3407:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3411:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3412:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3412:1: ( '[' )
            // InternalMontiArcDSL.g:3413:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3422:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3426:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiArcDSL.g:3427:2: rule__MCArrayType__Group__2__Impl
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
    // InternalMontiArcDSL.g:3433:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3437:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3438:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3438:1: ( ']' )
            // InternalMontiArcDSL.g:3439:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMontiArcDSL.g:3449:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3453:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMontiArcDSL.g:3454:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalMontiArcDSL.g:3461:1: rule__Expression__Group__0__Impl : ( 'exp' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3465:1: ( ( 'exp' ) )
            // InternalMontiArcDSL.g:3466:1: ( 'exp' )
            {
            // InternalMontiArcDSL.g:3466:1: ( 'exp' )
            // InternalMontiArcDSL.g:3467:2: 'exp'
            {
             before(grammarAccess.getExpressionAccess().getExpKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getExpKeyword_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:3476:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3480:1: ( rule__Expression__Group__1__Impl )
            // InternalMontiArcDSL.g:3481:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalMontiArcDSL.g:3487:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__NameAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3491:1: ( ( ( rule__Expression__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3492:1: ( ( rule__Expression__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3492:1: ( ( rule__Expression__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:3493:2: ( rule__Expression__NameAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:3494:2: ( rule__Expression__NameAssignment_1 )
            // InternalMontiArcDSL.g:3494:3: rule__Expression__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalMontiArcDSL.g:3503:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3507:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalMontiArcDSL.g:3508:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
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
    // InternalMontiArcDSL.g:3515:1: rule__Arguments__Group__0__Impl : ( 'arg' ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3519:1: ( ( 'arg' ) )
            // InternalMontiArcDSL.g:3520:1: ( 'arg' )
            {
            // InternalMontiArcDSL.g:3520:1: ( 'arg' )
            // InternalMontiArcDSL.g:3521:2: 'arg'
            {
             before(grammarAccess.getArgumentsAccess().getArgKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getArgKeyword_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:3530:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3534:1: ( rule__Arguments__Group__1__Impl )
            // InternalMontiArcDSL.g:3535:2: rule__Arguments__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:3541:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__NameAssignment_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3545:1: ( ( ( rule__Arguments__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3546:1: ( ( rule__Arguments__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3546:1: ( ( rule__Arguments__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:3547:2: ( rule__Arguments__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentsAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:3548:2: ( rule__Arguments__NameAssignment_1 )
            // InternalMontiArcDSL.g:3548:3: rule__Arguments__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arguments__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MACompilationUnit__PackageAssignment_0"
    // InternalMontiArcDSL.g:3557:1: rule__MACompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__MACompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3561:1: ( ( rulePackage ) )
            // InternalMontiArcDSL.g:3562:2: ( rulePackage )
            {
            // InternalMontiArcDSL.g:3562:2: ( rulePackage )
            // InternalMontiArcDSL.g:3563:3: rulePackage
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
    // InternalMontiArcDSL.g:3572:1: rule__MACompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__MACompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3576:1: ( ( ruleImportStatements ) )
            // InternalMontiArcDSL.g:3577:2: ( ruleImportStatements )
            {
            // InternalMontiArcDSL.g:3577:2: ( ruleImportStatements )
            // InternalMontiArcDSL.g:3578:3: ruleImportStatements
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
    // InternalMontiArcDSL.g:3587:1: rule__MACompilationUnit__ComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__MACompilationUnit__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3591:1: ( ( ruleComponent ) )
            // InternalMontiArcDSL.g:3592:2: ( ruleComponent )
            {
            // InternalMontiArcDSL.g:3592:2: ( ruleComponent )
            // InternalMontiArcDSL.g:3593:3: ruleComponent
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
    // InternalMontiArcDSL.g:3602:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3606:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3607:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3607:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3608:3: RULE_ID
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
    // InternalMontiArcDSL.g:3617:1: rule__Component__SignatureAssignment_2 : ( ruleSignature ) ;
    public final void rule__Component__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3621:1: ( ( ruleSignature ) )
            // InternalMontiArcDSL.g:3622:2: ( ruleSignature )
            {
            // InternalMontiArcDSL.g:3622:2: ( ruleSignature )
            // InternalMontiArcDSL.g:3623:3: ruleSignature
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
    // InternalMontiArcDSL.g:3632:1: rule__Component__ArcElementsAssignment_4 : ( ruleArcElement ) ;
    public final void rule__Component__ArcElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3636:1: ( ( ruleArcElement ) )
            // InternalMontiArcDSL.g:3637:2: ( ruleArcElement )
            {
            // InternalMontiArcDSL.g:3637:2: ( ruleArcElement )
            // InternalMontiArcDSL.g:3638:3: ruleArcElement
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
    // InternalMontiArcDSL.g:3647:1: rule__Signature__ParametersAssignment_1 : ( ruleParameters ) ;
    public final void rule__Signature__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3651:1: ( ( ruleParameters ) )
            // InternalMontiArcDSL.g:3652:2: ( ruleParameters )
            {
            // InternalMontiArcDSL.g:3652:2: ( ruleParameters )
            // InternalMontiArcDSL.g:3653:3: ruleParameters
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
    // InternalMontiArcDSL.g:3662:1: rule__Signature__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Signature__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3666:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3667:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3667:2: ( ruleType )
            // InternalMontiArcDSL.g:3668:3: ruleType
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
    // InternalMontiArcDSL.g:3677:1: rule__Parameters__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3681:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:3682:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:3682:2: ( ruleParameter )
            // InternalMontiArcDSL.g:3683:3: ruleParameter
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
    // InternalMontiArcDSL.g:3692:1: rule__Parameters__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3696:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:3697:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:3697:2: ( ruleParameter )
            // InternalMontiArcDSL.g:3698:3: ruleParameter
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
    // InternalMontiArcDSL.g:3707:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3711:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3712:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3712:2: ( ruleType )
            // InternalMontiArcDSL.g:3713:3: ruleType
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
    // InternalMontiArcDSL.g:3722:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3726:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3727:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3727:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3728:3: RULE_ID
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
    // InternalMontiArcDSL.g:3737:1: rule__Parameter__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3741:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:3742:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:3742:2: ( ruleExpression )
            // InternalMontiArcDSL.g:3743:3: ruleExpression
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
    // InternalMontiArcDSL.g:3752:1: rule__SubComponent__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__SubComponent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3756:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3757:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3757:2: ( ruleType )
            // InternalMontiArcDSL.g:3758:3: ruleType
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
    // InternalMontiArcDSL.g:3767:1: rule__SubComponent__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__SubComponent__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3771:1: ( ( ruleArguments ) )
            // InternalMontiArcDSL.g:3772:2: ( ruleArguments )
            {
            // InternalMontiArcDSL.g:3772:2: ( ruleArguments )
            // InternalMontiArcDSL.g:3773:3: ruleArguments
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
    // InternalMontiArcDSL.g:3782:1: rule__SubComponent__InstancesAssignment_3 : ( ruleNames ) ;
    public final void rule__SubComponent__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3786:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:3787:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:3787:2: ( ruleNames )
            // InternalMontiArcDSL.g:3788:3: ruleNames
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
    // InternalMontiArcDSL.g:3797:1: rule__Connector__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3801:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3802:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3802:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3803:3: RULE_ID
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
    // InternalMontiArcDSL.g:3812:1: rule__Connector__TargetsAssignment_3 : ( ruleNames ) ;
    public final void rule__Connector__TargetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3816:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:3817:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:3817:2: ( ruleNames )
            // InternalMontiArcDSL.g:3818:3: ruleNames
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
    // InternalMontiArcDSL.g:3827:1: rule__Ports__PortsAssignment_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3831:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:3832:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:3832:2: ( rulePort )
            // InternalMontiArcDSL.g:3833:3: rulePort
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
    // InternalMontiArcDSL.g:3842:1: rule__Ports__PortsAssignment_2_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3846:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:3847:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:3847:2: ( rulePort )
            // InternalMontiArcDSL.g:3848:3: rulePort
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


    // $ANTLR start "rule__Port__InAssignment_0_0"
    // InternalMontiArcDSL.g:3857:1: rule__Port__InAssignment_0_0 : ( ( 'in' ) ) ;
    public final void rule__Port__InAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3861:1: ( ( ( 'in' ) ) )
            // InternalMontiArcDSL.g:3862:2: ( ( 'in' ) )
            {
            // InternalMontiArcDSL.g:3862:2: ( ( 'in' ) )
            // InternalMontiArcDSL.g:3863:3: ( 'in' )
            {
             before(grammarAccess.getPortAccess().getInInKeyword_0_0_0()); 
            // InternalMontiArcDSL.g:3864:3: ( 'in' )
            // InternalMontiArcDSL.g:3865:4: 'in'
            {
             before(grammarAccess.getPortAccess().getInInKeyword_0_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getInInKeyword_0_0_0()); 

            }

             after(grammarAccess.getPortAccess().getInInKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__InAssignment_0_0"


    // $ANTLR start "rule__Port__OutAssignment_0_1"
    // InternalMontiArcDSL.g:3876:1: rule__Port__OutAssignment_0_1 : ( ( 'out' ) ) ;
    public final void rule__Port__OutAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3880:1: ( ( ( 'out' ) ) )
            // InternalMontiArcDSL.g:3881:2: ( ( 'out' ) )
            {
            // InternalMontiArcDSL.g:3881:2: ( ( 'out' ) )
            // InternalMontiArcDSL.g:3882:3: ( 'out' )
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_0_1_0()); 
            // InternalMontiArcDSL.g:3883:3: ( 'out' )
            // InternalMontiArcDSL.g:3884:4: 'out'
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_0_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getOutOutKeyword_0_1_0()); 

            }

             after(grammarAccess.getPortAccess().getOutOutKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__OutAssignment_0_1"


    // $ANTLR start "rule__Port__TypeAssignment_1"
    // InternalMontiArcDSL.g:3895:1: rule__Port__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Port__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3899:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3900:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3900:2: ( ruleType )
            // InternalMontiArcDSL.g:3901:3: ruleType
            {
             before(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_1"


    // $ANTLR start "rule__Port__NamesAssignment_2"
    // InternalMontiArcDSL.g:3910:1: rule__Port__NamesAssignment_2 : ( ruleNames ) ;
    public final void rule__Port__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3914:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:3915:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:3915:2: ( ruleNames )
            // InternalMontiArcDSL.g:3916:3: ruleNames
            {
             before(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NamesAssignment_2"


    // $ANTLR start "rule__Names__NamesAssignment_0"
    // InternalMontiArcDSL.g:3925:1: rule__Names__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Names__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3929:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3930:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3930:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3931:3: RULE_ID
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
    // InternalMontiArcDSL.g:3940:1: rule__Names__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Names__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3944:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3945:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3945:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3946:3: RULE_ID
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
    // InternalMontiArcDSL.g:3955:1: rule__Variable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3959:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3960:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3960:2: ( ruleType )
            // InternalMontiArcDSL.g:3961:3: ruleType
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
    // InternalMontiArcDSL.g:3970:1: rule__Variable__NamesAssignment_1 : ( ruleNames ) ;
    public final void rule__Variable__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3974:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:3975:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:3975:2: ( ruleNames )
            // InternalMontiArcDSL.g:3976:3: ruleNames
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
    // InternalMontiArcDSL.g:3985:1: rule__Automaton__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3989:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3990:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3990:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3991:3: RULE_ID
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
    // InternalMontiArcDSL.g:4000:1: rule__Automaton__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4004:1: ( ( ruleState ) )
            // InternalMontiArcDSL.g:4005:2: ( ruleState )
            {
            // InternalMontiArcDSL.g:4005:2: ( ruleState )
            // InternalMontiArcDSL.g:4006:3: ruleState
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
    // InternalMontiArcDSL.g:4015:1: rule__Automaton__InitialStatesAssignment_4_1 : ( ruleInitialState ) ;
    public final void rule__Automaton__InitialStatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4019:1: ( ( ruleInitialState ) )
            // InternalMontiArcDSL.g:4020:2: ( ruleInitialState )
            {
            // InternalMontiArcDSL.g:4020:2: ( ruleInitialState )
            // InternalMontiArcDSL.g:4021:3: ruleInitialState
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
    // InternalMontiArcDSL.g:4030:1: rule__Automaton__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Automaton__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4034:1: ( ( ruleTransition ) )
            // InternalMontiArcDSL.g:4035:2: ( ruleTransition )
            {
            // InternalMontiArcDSL.g:4035:2: ( ruleTransition )
            // InternalMontiArcDSL.g:4036:3: ruleTransition
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
    // InternalMontiArcDSL.g:4045:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4049:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4050:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4050:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4051:3: RULE_ID
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
    // InternalMontiArcDSL.g:4060:1: rule__InitialState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4064:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4065:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4065:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4066:3: RULE_ID
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
    // InternalMontiArcDSL.g:4075:1: rule__InitialState__BlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__InitialState__BlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4079:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:4080:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:4080:2: ( ruleBlock )
            // InternalMontiArcDSL.g:4081:3: ruleBlock
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
    // InternalMontiArcDSL.g:4090:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4094:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:4095:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:4095:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4096:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 
            // InternalMontiArcDSL.g:4097:3: ( RULE_ID )
            // InternalMontiArcDSL.g:4098:4: RULE_ID
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
    // InternalMontiArcDSL.g:4109:1: rule__Transition__TargetAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4113:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:4114:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:4114:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4115:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetCrossReference_1_1_0()); 
            // InternalMontiArcDSL.g:4116:3: ( RULE_ID )
            // InternalMontiArcDSL.g:4117:4: RULE_ID
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
    // InternalMontiArcDSL.g:4128:1: rule__Transition__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Transition__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4132:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4133:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4133:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4134:3: ruleExpression
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
    // InternalMontiArcDSL.g:4143:1: rule__Transition__ReactionAssignment_3_1 : ( ruleBlock ) ;
    public final void rule__Transition__ReactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4147:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:4148:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:4148:2: ( ruleBlock )
            // InternalMontiArcDSL.g:4149:3: ruleBlock
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
    // InternalMontiArcDSL.g:4158:1: rule__Block__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4162:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4163:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4163:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4164:3: RULE_ID
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
    // InternalMontiArcDSL.g:4173:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4177:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4178:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4178:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4179:3: ruleExpression
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
    // InternalMontiArcDSL.g:4188:1: rule__Block__ExpressionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Block__ExpressionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4192:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4193:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4193:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4194:3: ruleExpression
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
    // InternalMontiArcDSL.g:4203:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4207:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:4208:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:4208:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:4209:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:4218:1: rule__ImportStatements__StarAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__ImportStatements__StarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4222:1: ( ( ( '*' ) ) )
            // InternalMontiArcDSL.g:4223:2: ( ( '*' ) )
            {
            // InternalMontiArcDSL.g:4223:2: ( ( '*' ) )
            // InternalMontiArcDSL.g:4224:3: ( '*' )
            {
             before(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 
            // InternalMontiArcDSL.g:4225:3: ( '*' )
            // InternalMontiArcDSL.g:4226:4: '*'
            {
             before(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4237:1: rule__Package__NameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4241:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:4242:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:4242:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:4243:3: RULE_MCQUALIFIEDNAME
            {
             before(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0()); 
            match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:4252:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4256:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:4257:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:4257:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:4258:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:4259:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:4259:4: rule__MCPrimitiveType__TypeAlternatives_0
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


    // $ANTLR start "rule__Expression__NameAssignment_1"
    // InternalMontiArcDSL.g:4267:1: rule__Expression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Expression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4271:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4272:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4272:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4273:3: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__NameAssignment_1"


    // $ANTLR start "rule__Arguments__NameAssignment_1"
    // InternalMontiArcDSL.g:4282:1: rule__Arguments__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Arguments__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4286:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4287:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4287:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4288:3: RULE_ID
            {
             before(grammarAccess.getArgumentsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArgumentsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__NameAssignment_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\10\12\2\uffff";
    static final String dfa_3s = "\1\14\10\4\2\uffff";
    static final String dfa_4s = "\1\23\10\50\2\uffff";
    static final String dfa_5s = "\11\uffff\1\2\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\5\uffff\1\12",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "745:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000008FF000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000010685FF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000010681FF002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010004000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000010681FF000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180400010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000614000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});

}