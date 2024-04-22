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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'connect'", "'->'", "'port'", "'automaton'", "'state'", "'initial'", "'/'", "'['", "']'", "'import'", "'.'", "'package'", "'('", "')'", "'in'", "'out'", "'*'"
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
    // InternalMontiArcDSL.g:612:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:616:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMontiArcDSL.g:617:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:617:2: ( ( rule__Expression__Alternatives ) )
            // InternalMontiArcDSL.g:618:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:619:3: ( rule__Expression__Alternatives )
            // InternalMontiArcDSL.g:619:4: rule__Expression__Alternatives
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
    // InternalMontiArcDSL.g:628:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:629:1: ( ruleLiteralExpression EOF )
            // InternalMontiArcDSL.g:630:1: ruleLiteralExpression EOF
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
    // InternalMontiArcDSL.g:637:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:641:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMontiArcDSL.g:642:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:642:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMontiArcDSL.g:643:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:644:3: ( rule__LiteralExpression__Alternatives )
            // InternalMontiArcDSL.g:644:4: rule__LiteralExpression__Alternatives
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
    // InternalMontiArcDSL.g:653:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:654:1: ( ruleNumberLiteral EOF )
            // InternalMontiArcDSL.g:655:1: ruleNumberLiteral EOF
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
    // InternalMontiArcDSL.g:662:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:666:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:667:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:667:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:668:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:669:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:669:4: rule__NumberLiteral__LiteralAssignment
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
    // InternalMontiArcDSL.g:678:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:679:1: ( ruleStringLiteral EOF )
            // InternalMontiArcDSL.g:680:1: ruleStringLiteral EOF
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
    // InternalMontiArcDSL.g:687:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:691:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:692:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:692:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:693:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:694:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:694:4: rule__StringLiteral__LiteralAssignment
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
    // InternalMontiArcDSL.g:703:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:704:1: ( ruleNameExpression EOF )
            // InternalMontiArcDSL.g:705:1: ruleNameExpression EOF
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
    // InternalMontiArcDSL.g:712:1: ruleNameExpression : ( ( rule__NameExpression__NameAssignment ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:716:2: ( ( ( rule__NameExpression__NameAssignment ) ) )
            // InternalMontiArcDSL.g:717:2: ( ( rule__NameExpression__NameAssignment ) )
            {
            // InternalMontiArcDSL.g:717:2: ( ( rule__NameExpression__NameAssignment ) )
            // InternalMontiArcDSL.g:718:3: ( rule__NameExpression__NameAssignment )
            {
             before(grammarAccess.getNameExpressionAccess().getNameAssignment()); 
            // InternalMontiArcDSL.g:719:3: ( rule__NameExpression__NameAssignment )
            // InternalMontiArcDSL.g:719:4: rule__NameExpression__NameAssignment
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
    // InternalMontiArcDSL.g:728:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:729:1: ( ruleArguments EOF )
            // InternalMontiArcDSL.g:730:1: ruleArguments EOF
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
    // InternalMontiArcDSL.g:737:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:741:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalMontiArcDSL.g:742:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalMontiArcDSL.g:742:2: ( ( rule__Arguments__Group__0 ) )
            // InternalMontiArcDSL.g:743:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalMontiArcDSL.g:744:3: ( rule__Arguments__Group__0 )
            // InternalMontiArcDSL.g:744:4: rule__Arguments__Group__0
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
    // InternalMontiArcDSL.g:753:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:754:1: ( ruleArgument EOF )
            // InternalMontiArcDSL.g:755:1: ruleArgument EOF
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
    // InternalMontiArcDSL.g:762:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:766:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMontiArcDSL.g:767:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMontiArcDSL.g:767:2: ( ( rule__Argument__Group__0 ) )
            // InternalMontiArcDSL.g:768:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMontiArcDSL.g:769:3: ( rule__Argument__Group__0 )
            // InternalMontiArcDSL.g:769:4: rule__Argument__Group__0
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
    // InternalMontiArcDSL.g:777:1: rule__ArcElement__Alternatives : ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) );
    public final void rule__ArcElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:781:1: ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) )
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
                    // InternalMontiArcDSL.g:782:2: ( ruleComponent )
                    {
                    // InternalMontiArcDSL.g:782:2: ( ruleComponent )
                    // InternalMontiArcDSL.g:783:3: ruleComponent
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
                    // InternalMontiArcDSL.g:788:2: ( ruleSubComponent )
                    {
                    // InternalMontiArcDSL.g:788:2: ( ruleSubComponent )
                    // InternalMontiArcDSL.g:789:3: ruleSubComponent
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
                    // InternalMontiArcDSL.g:794:2: ( ruleConnector )
                    {
                    // InternalMontiArcDSL.g:794:2: ( ruleConnector )
                    // InternalMontiArcDSL.g:795:3: ruleConnector
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
                    // InternalMontiArcDSL.g:800:2: ( rulePorts )
                    {
                    // InternalMontiArcDSL.g:800:2: ( rulePorts )
                    // InternalMontiArcDSL.g:801:3: rulePorts
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
                    // InternalMontiArcDSL.g:806:2: ( ruleVariable )
                    {
                    // InternalMontiArcDSL.g:806:2: ( ruleVariable )
                    // InternalMontiArcDSL.g:807:3: ruleVariable
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
                    // InternalMontiArcDSL.g:812:2: ( ruleAutomaton )
                    {
                    // InternalMontiArcDSL.g:812:2: ( ruleAutomaton )
                    // InternalMontiArcDSL.g:813:3: ruleAutomaton
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
    // InternalMontiArcDSL.g:822:1: rule__Port__Alternatives_0 : ( ( ( rule__Port__InAssignment_0_0 ) ) | ( ( rule__Port__OutAssignment_0_1 ) ) );
    public final void rule__Port__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:826:1: ( ( ( rule__Port__InAssignment_0_0 ) ) | ( ( rule__Port__OutAssignment_0_1 ) ) )
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
                    // InternalMontiArcDSL.g:827:2: ( ( rule__Port__InAssignment_0_0 ) )
                    {
                    // InternalMontiArcDSL.g:827:2: ( ( rule__Port__InAssignment_0_0 ) )
                    // InternalMontiArcDSL.g:828:3: ( rule__Port__InAssignment_0_0 )
                    {
                     before(grammarAccess.getPortAccess().getInAssignment_0_0()); 
                    // InternalMontiArcDSL.g:829:3: ( rule__Port__InAssignment_0_0 )
                    // InternalMontiArcDSL.g:829:4: rule__Port__InAssignment_0_0
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
                    // InternalMontiArcDSL.g:833:2: ( ( rule__Port__OutAssignment_0_1 ) )
                    {
                    // InternalMontiArcDSL.g:833:2: ( ( rule__Port__OutAssignment_0_1 ) )
                    // InternalMontiArcDSL.g:834:3: ( rule__Port__OutAssignment_0_1 )
                    {
                     before(grammarAccess.getPortAccess().getOutAssignment_0_1()); 
                    // InternalMontiArcDSL.g:835:3: ( rule__Port__OutAssignment_0_1 )
                    // InternalMontiArcDSL.g:835:4: rule__Port__OutAssignment_0_1
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
    // InternalMontiArcDSL.g:843:1: rule__Automaton__Alternatives_4 : ( ( ( rule__Automaton__StatesAssignment_4_0 ) ) | ( ( rule__Automaton__InitialStatesAssignment_4_1 ) ) | ( ( rule__Automaton__TransitionsAssignment_4_2 ) ) );
    public final void rule__Automaton__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:847:1: ( ( ( rule__Automaton__StatesAssignment_4_0 ) ) | ( ( rule__Automaton__InitialStatesAssignment_4_1 ) ) | ( ( rule__Automaton__TransitionsAssignment_4_2 ) ) )
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
                    // InternalMontiArcDSL.g:848:2: ( ( rule__Automaton__StatesAssignment_4_0 ) )
                    {
                    // InternalMontiArcDSL.g:848:2: ( ( rule__Automaton__StatesAssignment_4_0 ) )
                    // InternalMontiArcDSL.g:849:3: ( rule__Automaton__StatesAssignment_4_0 )
                    {
                     before(grammarAccess.getAutomatonAccess().getStatesAssignment_4_0()); 
                    // InternalMontiArcDSL.g:850:3: ( rule__Automaton__StatesAssignment_4_0 )
                    // InternalMontiArcDSL.g:850:4: rule__Automaton__StatesAssignment_4_0
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
                    // InternalMontiArcDSL.g:854:2: ( ( rule__Automaton__InitialStatesAssignment_4_1 ) )
                    {
                    // InternalMontiArcDSL.g:854:2: ( ( rule__Automaton__InitialStatesAssignment_4_1 ) )
                    // InternalMontiArcDSL.g:855:3: ( rule__Automaton__InitialStatesAssignment_4_1 )
                    {
                     before(grammarAccess.getAutomatonAccess().getInitialStatesAssignment_4_1()); 
                    // InternalMontiArcDSL.g:856:3: ( rule__Automaton__InitialStatesAssignment_4_1 )
                    // InternalMontiArcDSL.g:856:4: rule__Automaton__InitialStatesAssignment_4_1
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
                    // InternalMontiArcDSL.g:860:2: ( ( rule__Automaton__TransitionsAssignment_4_2 ) )
                    {
                    // InternalMontiArcDSL.g:860:2: ( ( rule__Automaton__TransitionsAssignment_4_2 ) )
                    // InternalMontiArcDSL.g:861:3: ( rule__Automaton__TransitionsAssignment_4_2 )
                    {
                     before(grammarAccess.getAutomatonAccess().getTransitionsAssignment_4_2()); 
                    // InternalMontiArcDSL.g:862:3: ( rule__Automaton__TransitionsAssignment_4_2 )
                    // InternalMontiArcDSL.g:862:4: rule__Automaton__TransitionsAssignment_4_2
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
    // InternalMontiArcDSL.g:870:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:874:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMontiArcDSL.g:875:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiArcDSL.g:875:2: ( ruleMCPrimitiveType )
                    // InternalMontiArcDSL.g:876:3: ruleMCPrimitiveType
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
                    // InternalMontiArcDSL.g:881:2: ( ruleMCArrayType )
                    {
                    // InternalMontiArcDSL.g:881:2: ( ruleMCArrayType )
                    // InternalMontiArcDSL.g:882:3: ruleMCArrayType
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
    // InternalMontiArcDSL.g:891:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:895:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
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
                    // InternalMontiArcDSL.g:896:2: ( 'boolean' )
                    {
                    // InternalMontiArcDSL.g:896:2: ( 'boolean' )
                    // InternalMontiArcDSL.g:897:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:902:2: ( 'byte' )
                    {
                    // InternalMontiArcDSL.g:902:2: ( 'byte' )
                    // InternalMontiArcDSL.g:903:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:908:2: ( 'short' )
                    {
                    // InternalMontiArcDSL.g:908:2: ( 'short' )
                    // InternalMontiArcDSL.g:909:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:914:2: ( 'int' )
                    {
                    // InternalMontiArcDSL.g:914:2: ( 'int' )
                    // InternalMontiArcDSL.g:915:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:920:2: ( 'long' )
                    {
                    // InternalMontiArcDSL.g:920:2: ( 'long' )
                    // InternalMontiArcDSL.g:921:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:926:2: ( 'char' )
                    {
                    // InternalMontiArcDSL.g:926:2: ( 'char' )
                    // InternalMontiArcDSL.g:927:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:932:2: ( 'float' )
                    {
                    // InternalMontiArcDSL.g:932:2: ( 'float' )
                    // InternalMontiArcDSL.g:933:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:938:2: ( 'double' )
                    {
                    // InternalMontiArcDSL.g:938:2: ( 'double' )
                    // InternalMontiArcDSL.g:939:3: 'double'
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMontiArcDSL.g:948:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:952:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMontiArcDSL.g:953:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:953:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:954:3: ruleNameExpression
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
                    // InternalMontiArcDSL.g:959:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:959:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:960:3: ruleLiteralExpression
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
    // InternalMontiArcDSL.g:969:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:973:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMontiArcDSL.g:974:2: ( ruleNumberLiteral )
                    {
                    // InternalMontiArcDSL.g:974:2: ( ruleNumberLiteral )
                    // InternalMontiArcDSL.g:975:3: ruleNumberLiteral
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
                    // InternalMontiArcDSL.g:980:2: ( ruleStringLiteral )
                    {
                    // InternalMontiArcDSL.g:980:2: ( ruleStringLiteral )
                    // InternalMontiArcDSL.g:981:3: ruleStringLiteral
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
    // InternalMontiArcDSL.g:990:1: rule__MACompilationUnit__Group__0 : rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 ;
    public final void rule__MACompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:994:1: ( rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 )
            // InternalMontiArcDSL.g:995:2: rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1
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
    // InternalMontiArcDSL.g:1002:1: rule__MACompilationUnit__Group__0__Impl : ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__MACompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1006:1: ( ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1007:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1007:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcDSL.g:1008:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcDSL.g:1009:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            // InternalMontiArcDSL.g:1009:3: rule__MACompilationUnit__PackageAssignment_0
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
    // InternalMontiArcDSL.g:1017:1: rule__MACompilationUnit__Group__1 : rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 ;
    public final void rule__MACompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1021:1: ( rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 )
            // InternalMontiArcDSL.g:1022:2: rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2
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
    // InternalMontiArcDSL.g:1029:1: rule__MACompilationUnit__Group__1__Impl : ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__MACompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1033:1: ( ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcDSL.g:1034:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcDSL.g:1034:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcDSL.g:1035:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcDSL.g:1036:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==36) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1036:3: rule__MACompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MACompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMontiArcDSL.g:1044:1: rule__MACompilationUnit__Group__2 : rule__MACompilationUnit__Group__2__Impl ;
    public final void rule__MACompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1048:1: ( rule__MACompilationUnit__Group__2__Impl )
            // InternalMontiArcDSL.g:1049:2: rule__MACompilationUnit__Group__2__Impl
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
    // InternalMontiArcDSL.g:1055:1: rule__MACompilationUnit__Group__2__Impl : ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) ;
    public final void rule__MACompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1059:1: ( ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1060:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1060:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            // InternalMontiArcDSL.g:1061:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 
            // InternalMontiArcDSL.g:1062:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            // InternalMontiArcDSL.g:1062:3: rule__MACompilationUnit__ComponentAssignment_2
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
    // InternalMontiArcDSL.g:1071:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1075:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMontiArcDSL.g:1076:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMontiArcDSL.g:1083:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1087:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1088:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1088:1: ( 'component' )
            // InternalMontiArcDSL.g:1089:2: 'component'
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
    // InternalMontiArcDSL.g:1098:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1102:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMontiArcDSL.g:1103:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMontiArcDSL.g:1110:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1114:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1115:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1115:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1116:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1117:2: ( rule__Component__NameAssignment_1 )
            // InternalMontiArcDSL.g:1117:3: rule__Component__NameAssignment_1
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
    // InternalMontiArcDSL.g:1125:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1129:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMontiArcDSL.g:1130:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMontiArcDSL.g:1137:1: rule__Component__Group__2__Impl : ( ( rule__Component__SignatureAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1141:1: ( ( ( rule__Component__SignatureAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1142:1: ( ( rule__Component__SignatureAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1142:1: ( ( rule__Component__SignatureAssignment_2 ) )
            // InternalMontiArcDSL.g:1143:2: ( rule__Component__SignatureAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getSignatureAssignment_2()); 
            // InternalMontiArcDSL.g:1144:2: ( rule__Component__SignatureAssignment_2 )
            // InternalMontiArcDSL.g:1144:3: rule__Component__SignatureAssignment_2
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
    // InternalMontiArcDSL.g:1152:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1156:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMontiArcDSL.g:1157:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMontiArcDSL.g:1164:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1168:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:1169:1: ( '{' )
            {
            // InternalMontiArcDSL.g:1169:1: ( '{' )
            // InternalMontiArcDSL.g:1170:2: '{'
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
    // InternalMontiArcDSL.g:1179:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1183:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMontiArcDSL.g:1184:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMontiArcDSL.g:1191:1: rule__Component__Group__4__Impl : ( ( rule__Component__ArcElementsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1195:1: ( ( ( rule__Component__ArcElementsAssignment_4 )* ) )
            // InternalMontiArcDSL.g:1196:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            {
            // InternalMontiArcDSL.g:1196:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            // InternalMontiArcDSL.g:1197:2: ( rule__Component__ArcElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getArcElementsAssignment_4()); 
            // InternalMontiArcDSL.g:1198:2: ( rule__Component__ArcElementsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=12 && LA9_0<=20)||LA9_0==27||(LA9_0>=29 && LA9_0<=30)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1198:3: rule__Component__ArcElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ArcElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMontiArcDSL.g:1206:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1210:1: ( rule__Component__Group__5__Impl )
            // InternalMontiArcDSL.g:1211:2: rule__Component__Group__5__Impl
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
    // InternalMontiArcDSL.g:1217:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1221:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:1222:1: ( '}' )
            {
            // InternalMontiArcDSL.g:1222:1: ( '}' )
            // InternalMontiArcDSL.g:1223:2: '}'
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
    // InternalMontiArcDSL.g:1233:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1237:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMontiArcDSL.g:1238:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalMontiArcDSL.g:1245:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1249:1: ( ( () ) )
            // InternalMontiArcDSL.g:1250:1: ( () )
            {
            // InternalMontiArcDSL.g:1250:1: ( () )
            // InternalMontiArcDSL.g:1251:2: ()
            {
             before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            // InternalMontiArcDSL.g:1252:2: ()
            // InternalMontiArcDSL.g:1252:3: 
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
    // InternalMontiArcDSL.g:1260:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1264:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMontiArcDSL.g:1265:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalMontiArcDSL.g:1272:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__ParametersAssignment_1 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1276:1: ( ( ( rule__Signature__ParametersAssignment_1 )? ) )
            // InternalMontiArcDSL.g:1277:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:1277:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            // InternalMontiArcDSL.g:1278:2: ( rule__Signature__ParametersAssignment_1 )?
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1()); 
            // InternalMontiArcDSL.g:1279:2: ( rule__Signature__ParametersAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=12 && LA10_0<=19)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiArcDSL.g:1279:3: rule__Signature__ParametersAssignment_1
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
    // InternalMontiArcDSL.g:1287:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1291:1: ( rule__Signature__Group__2__Impl )
            // InternalMontiArcDSL.g:1292:2: rule__Signature__Group__2__Impl
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
    // InternalMontiArcDSL.g:1298:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )? ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1302:1: ( ( ( rule__Signature__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1303:1: ( ( rule__Signature__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1303:1: ( ( rule__Signature__Group_2__0 )? )
            // InternalMontiArcDSL.g:1304:2: ( rule__Signature__Group_2__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1305:2: ( rule__Signature__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcDSL.g:1305:3: rule__Signature__Group_2__0
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
    // InternalMontiArcDSL.g:1314:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1318:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalMontiArcDSL.g:1319:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
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
    // InternalMontiArcDSL.g:1326:1: rule__Signature__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1330:1: ( ( 'extends' ) )
            // InternalMontiArcDSL.g:1331:1: ( 'extends' )
            {
            // InternalMontiArcDSL.g:1331:1: ( 'extends' )
            // InternalMontiArcDSL.g:1332:2: 'extends'
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
    // InternalMontiArcDSL.g:1341:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1345:1: ( rule__Signature__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1346:2: rule__Signature__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:1352:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__TypeAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1356:1: ( ( ( rule__Signature__TypeAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1357:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1357:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1358:2: ( rule__Signature__TypeAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_2_1()); 
            // InternalMontiArcDSL.g:1359:2: ( rule__Signature__TypeAssignment_2_1 )
            // InternalMontiArcDSL.g:1359:3: rule__Signature__TypeAssignment_2_1
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
    // InternalMontiArcDSL.g:1368:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1372:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMontiArcDSL.g:1373:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalMontiArcDSL.g:1380:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParametersAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1384:1: ( ( ( rule__Parameters__ParametersAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1385:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1385:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            // InternalMontiArcDSL.g:1386:2: ( rule__Parameters__ParametersAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_0()); 
            // InternalMontiArcDSL.g:1387:2: ( rule__Parameters__ParametersAssignment_0 )
            // InternalMontiArcDSL.g:1387:3: rule__Parameters__ParametersAssignment_0
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
    // InternalMontiArcDSL.g:1395:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1399:1: ( rule__Parameters__Group__1__Impl )
            // InternalMontiArcDSL.g:1400:2: rule__Parameters__Group__1__Impl
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
    // InternalMontiArcDSL.g:1406:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1410:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:1411:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:1411:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalMontiArcDSL.g:1412:2: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:1413:2: ( rule__Parameters__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1413:3: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMontiArcDSL.g:1422:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1426:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalMontiArcDSL.g:1427:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
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
    // InternalMontiArcDSL.g:1434:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1438:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:1439:1: ( ',' )
            {
            // InternalMontiArcDSL.g:1439:1: ( ',' )
            // InternalMontiArcDSL.g:1440:2: ','
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
    // InternalMontiArcDSL.g:1449:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1453:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalMontiArcDSL.g:1454:2: rule__Parameters__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:1460:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1464:1: ( ( ( rule__Parameters__ParametersAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:1465:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:1465:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            // InternalMontiArcDSL.g:1466:2: ( rule__Parameters__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 
            // InternalMontiArcDSL.g:1467:2: ( rule__Parameters__ParametersAssignment_1_1 )
            // InternalMontiArcDSL.g:1467:3: rule__Parameters__ParametersAssignment_1_1
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
    // InternalMontiArcDSL.g:1476:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1480:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMontiArcDSL.g:1481:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalMontiArcDSL.g:1488:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1492:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1493:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1493:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:1494:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:1495:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMontiArcDSL.g:1495:3: rule__Parameter__TypeAssignment_0
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
    // InternalMontiArcDSL.g:1503:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1507:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMontiArcDSL.g:1508:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalMontiArcDSL.g:1515:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1519:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1520:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1520:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1521:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1522:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMontiArcDSL.g:1522:3: rule__Parameter__NameAssignment_1
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
    // InternalMontiArcDSL.g:1530:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1534:1: ( rule__Parameter__Group__2__Impl )
            // InternalMontiArcDSL.g:1535:2: rule__Parameter__Group__2__Impl
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
    // InternalMontiArcDSL.g:1541:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1545:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1546:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1546:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalMontiArcDSL.g:1547:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1548:2: ( rule__Parameter__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMontiArcDSL.g:1548:3: rule__Parameter__Group_2__0
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
    // InternalMontiArcDSL.g:1557:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1561:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalMontiArcDSL.g:1562:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
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
    // InternalMontiArcDSL.g:1569:1: rule__Parameter__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1573:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:1574:1: ( '=' )
            {
            // InternalMontiArcDSL.g:1574:1: ( '=' )
            // InternalMontiArcDSL.g:1575:2: '='
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
    // InternalMontiArcDSL.g:1584:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1588:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalMontiArcDSL.g:1589:2: rule__Parameter__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:1595:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1599:1: ( ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:1600:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:1600:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:1601:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:1602:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:1602:3: rule__Parameter__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:1611:1: rule__SubComponent__Group__0 : rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 ;
    public final void rule__SubComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1615:1: ( rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 )
            // InternalMontiArcDSL.g:1616:2: rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1
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
    // InternalMontiArcDSL.g:1623:1: rule__SubComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__SubComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1627:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1628:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1628:1: ( 'component' )
            // InternalMontiArcDSL.g:1629:2: 'component'
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
    // InternalMontiArcDSL.g:1638:1: rule__SubComponent__Group__1 : rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 ;
    public final void rule__SubComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1642:1: ( rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 )
            // InternalMontiArcDSL.g:1643:2: rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2
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
    // InternalMontiArcDSL.g:1650:1: rule__SubComponent__Group__1__Impl : ( ( rule__SubComponent__TypeAssignment_1 ) ) ;
    public final void rule__SubComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1654:1: ( ( ( rule__SubComponent__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1655:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1655:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:1656:2: ( rule__SubComponent__TypeAssignment_1 )
            {
             before(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:1657:2: ( rule__SubComponent__TypeAssignment_1 )
            // InternalMontiArcDSL.g:1657:3: rule__SubComponent__TypeAssignment_1
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
    // InternalMontiArcDSL.g:1665:1: rule__SubComponent__Group__2 : rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 ;
    public final void rule__SubComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1669:1: ( rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 )
            // InternalMontiArcDSL.g:1670:2: rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3
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
    // InternalMontiArcDSL.g:1677:1: rule__SubComponent__Group__2__Impl : ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) ;
    public final void rule__SubComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1681:1: ( ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) )
            // InternalMontiArcDSL.g:1682:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:1682:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            // InternalMontiArcDSL.g:1683:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 
            // InternalMontiArcDSL.g:1684:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMontiArcDSL.g:1684:3: rule__SubComponent__ArgumentsAssignment_2
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
    // InternalMontiArcDSL.g:1692:1: rule__SubComponent__Group__3 : rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 ;
    public final void rule__SubComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1696:1: ( rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 )
            // InternalMontiArcDSL.g:1697:2: rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4
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
    // InternalMontiArcDSL.g:1704:1: rule__SubComponent__Group__3__Impl : ( ( rule__SubComponent__InstancesAssignment_3 ) ) ;
    public final void rule__SubComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1708:1: ( ( ( rule__SubComponent__InstancesAssignment_3 ) ) )
            // InternalMontiArcDSL.g:1709:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:1709:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            // InternalMontiArcDSL.g:1710:2: ( rule__SubComponent__InstancesAssignment_3 )
            {
             before(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 
            // InternalMontiArcDSL.g:1711:2: ( rule__SubComponent__InstancesAssignment_3 )
            // InternalMontiArcDSL.g:1711:3: rule__SubComponent__InstancesAssignment_3
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
    // InternalMontiArcDSL.g:1719:1: rule__SubComponent__Group__4 : rule__SubComponent__Group__4__Impl ;
    public final void rule__SubComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1723:1: ( rule__SubComponent__Group__4__Impl )
            // InternalMontiArcDSL.g:1724:2: rule__SubComponent__Group__4__Impl
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
    // InternalMontiArcDSL.g:1730:1: rule__SubComponent__Group__4__Impl : ( ';' ) ;
    public final void rule__SubComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1734:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1735:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1735:1: ( ';' )
            // InternalMontiArcDSL.g:1736:2: ';'
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
    // InternalMontiArcDSL.g:1746:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1750:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalMontiArcDSL.g:1751:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
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
    // InternalMontiArcDSL.g:1758:1: rule__Connector__Group__0__Impl : ( 'connect' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1762:1: ( ( 'connect' ) )
            // InternalMontiArcDSL.g:1763:1: ( 'connect' )
            {
            // InternalMontiArcDSL.g:1763:1: ( 'connect' )
            // InternalMontiArcDSL.g:1764:2: 'connect'
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
    // InternalMontiArcDSL.g:1773:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1777:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalMontiArcDSL.g:1778:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
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
    // InternalMontiArcDSL.g:1785:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__SourceAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1789:1: ( ( ( rule__Connector__SourceAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1790:1: ( ( rule__Connector__SourceAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1790:1: ( ( rule__Connector__SourceAssignment_1 ) )
            // InternalMontiArcDSL.g:1791:2: ( rule__Connector__SourceAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAssignment_1()); 
            // InternalMontiArcDSL.g:1792:2: ( rule__Connector__SourceAssignment_1 )
            // InternalMontiArcDSL.g:1792:3: rule__Connector__SourceAssignment_1
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
    // InternalMontiArcDSL.g:1800:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1804:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalMontiArcDSL.g:1805:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
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
    // InternalMontiArcDSL.g:1812:1: rule__Connector__Group__2__Impl : ( '->' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1816:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:1817:1: ( '->' )
            {
            // InternalMontiArcDSL.g:1817:1: ( '->' )
            // InternalMontiArcDSL.g:1818:2: '->'
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
    // InternalMontiArcDSL.g:1827:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1831:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // InternalMontiArcDSL.g:1832:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
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
    // InternalMontiArcDSL.g:1839:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__TargetsAssignment_3 ) ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1843:1: ( ( ( rule__Connector__TargetsAssignment_3 ) ) )
            // InternalMontiArcDSL.g:1844:1: ( ( rule__Connector__TargetsAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:1844:1: ( ( rule__Connector__TargetsAssignment_3 ) )
            // InternalMontiArcDSL.g:1845:2: ( rule__Connector__TargetsAssignment_3 )
            {
             before(grammarAccess.getConnectorAccess().getTargetsAssignment_3()); 
            // InternalMontiArcDSL.g:1846:2: ( rule__Connector__TargetsAssignment_3 )
            // InternalMontiArcDSL.g:1846:3: rule__Connector__TargetsAssignment_3
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
    // InternalMontiArcDSL.g:1854:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1858:1: ( rule__Connector__Group__4__Impl )
            // InternalMontiArcDSL.g:1859:2: rule__Connector__Group__4__Impl
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
    // InternalMontiArcDSL.g:1865:1: rule__Connector__Group__4__Impl : ( ';' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1869:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1870:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1870:1: ( ';' )
            // InternalMontiArcDSL.g:1871:2: ';'
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
    // InternalMontiArcDSL.g:1881:1: rule__Ports__Group__0 : rule__Ports__Group__0__Impl rule__Ports__Group__1 ;
    public final void rule__Ports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1885:1: ( rule__Ports__Group__0__Impl rule__Ports__Group__1 )
            // InternalMontiArcDSL.g:1886:2: rule__Ports__Group__0__Impl rule__Ports__Group__1
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
    // InternalMontiArcDSL.g:1893:1: rule__Ports__Group__0__Impl : ( 'port' ) ;
    public final void rule__Ports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1897:1: ( ( 'port' ) )
            // InternalMontiArcDSL.g:1898:1: ( 'port' )
            {
            // InternalMontiArcDSL.g:1898:1: ( 'port' )
            // InternalMontiArcDSL.g:1899:2: 'port'
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
    // InternalMontiArcDSL.g:1908:1: rule__Ports__Group__1 : rule__Ports__Group__1__Impl rule__Ports__Group__2 ;
    public final void rule__Ports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1912:1: ( rule__Ports__Group__1__Impl rule__Ports__Group__2 )
            // InternalMontiArcDSL.g:1913:2: rule__Ports__Group__1__Impl rule__Ports__Group__2
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
    // InternalMontiArcDSL.g:1920:1: rule__Ports__Group__1__Impl : ( ( rule__Ports__PortsAssignment_1 ) ) ;
    public final void rule__Ports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1924:1: ( ( ( rule__Ports__PortsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1925:1: ( ( rule__Ports__PortsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1925:1: ( ( rule__Ports__PortsAssignment_1 ) )
            // InternalMontiArcDSL.g:1926:2: ( rule__Ports__PortsAssignment_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_1()); 
            // InternalMontiArcDSL.g:1927:2: ( rule__Ports__PortsAssignment_1 )
            // InternalMontiArcDSL.g:1927:3: rule__Ports__PortsAssignment_1
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
    // InternalMontiArcDSL.g:1935:1: rule__Ports__Group__2 : rule__Ports__Group__2__Impl rule__Ports__Group__3 ;
    public final void rule__Ports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1939:1: ( rule__Ports__Group__2__Impl rule__Ports__Group__3 )
            // InternalMontiArcDSL.g:1940:2: rule__Ports__Group__2__Impl rule__Ports__Group__3
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
    // InternalMontiArcDSL.g:1947:1: rule__Ports__Group__2__Impl : ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) ) ;
    public final void rule__Ports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1951:1: ( ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) ) )
            // InternalMontiArcDSL.g:1952:1: ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) )
            {
            // InternalMontiArcDSL.g:1952:1: ( ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:1953:2: ( ( rule__Ports__Group_2__0 ) ) ( ( rule__Ports__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:1953:2: ( ( rule__Ports__Group_2__0 ) )
            // InternalMontiArcDSL.g:1954:3: ( rule__Ports__Group_2__0 )
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1955:3: ( rule__Ports__Group_2__0 )
            // InternalMontiArcDSL.g:1955:4: rule__Ports__Group_2__0
            {
            pushFollow(FOLLOW_12);
            rule__Ports__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPortsAccess().getGroup_2()); 

            }

            // InternalMontiArcDSL.g:1958:2: ( ( rule__Ports__Group_2__0 )* )
            // InternalMontiArcDSL.g:1959:3: ( rule__Ports__Group_2__0 )*
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1960:3: ( rule__Ports__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1960:4: rule__Ports__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Ports__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMontiArcDSL.g:1969:1: rule__Ports__Group__3 : rule__Ports__Group__3__Impl ;
    public final void rule__Ports__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1973:1: ( rule__Ports__Group__3__Impl )
            // InternalMontiArcDSL.g:1974:2: rule__Ports__Group__3__Impl
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
    // InternalMontiArcDSL.g:1980:1: rule__Ports__Group__3__Impl : ( ';' ) ;
    public final void rule__Ports__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1984:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:1985:1: ( ';' )
            {
            // InternalMontiArcDSL.g:1985:1: ( ';' )
            // InternalMontiArcDSL.g:1986:2: ';'
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
    // InternalMontiArcDSL.g:1996:1: rule__Ports__Group_2__0 : rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 ;
    public final void rule__Ports__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2000:1: ( rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 )
            // InternalMontiArcDSL.g:2001:2: rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1
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
    // InternalMontiArcDSL.g:2008:1: rule__Ports__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Ports__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2012:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2013:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2013:1: ( ',' )
            // InternalMontiArcDSL.g:2014:2: ','
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
    // InternalMontiArcDSL.g:2023:1: rule__Ports__Group_2__1 : rule__Ports__Group_2__1__Impl ;
    public final void rule__Ports__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2027:1: ( rule__Ports__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2028:2: rule__Ports__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2034:1: rule__Ports__Group_2__1__Impl : ( ( rule__Ports__PortsAssignment_2_1 ) ) ;
    public final void rule__Ports__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2038:1: ( ( ( rule__Ports__PortsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2039:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2039:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2040:2: ( rule__Ports__PortsAssignment_2_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_2_1()); 
            // InternalMontiArcDSL.g:2041:2: ( rule__Ports__PortsAssignment_2_1 )
            // InternalMontiArcDSL.g:2041:3: rule__Ports__PortsAssignment_2_1
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
    // InternalMontiArcDSL.g:2050:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2054:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMontiArcDSL.g:2055:2: rule__Port__Group__0__Impl rule__Port__Group__1
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
    // InternalMontiArcDSL.g:2062:1: rule__Port__Group__0__Impl : ( ( rule__Port__Alternatives_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2066:1: ( ( ( rule__Port__Alternatives_0 ) ) )
            // InternalMontiArcDSL.g:2067:1: ( ( rule__Port__Alternatives_0 ) )
            {
            // InternalMontiArcDSL.g:2067:1: ( ( rule__Port__Alternatives_0 ) )
            // InternalMontiArcDSL.g:2068:2: ( rule__Port__Alternatives_0 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_0()); 
            // InternalMontiArcDSL.g:2069:2: ( rule__Port__Alternatives_0 )
            // InternalMontiArcDSL.g:2069:3: rule__Port__Alternatives_0
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
    // InternalMontiArcDSL.g:2077:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2081:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMontiArcDSL.g:2082:2: rule__Port__Group__1__Impl rule__Port__Group__2
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
    // InternalMontiArcDSL.g:2089:1: rule__Port__Group__1__Impl : ( ( rule__Port__TypeAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2093:1: ( ( ( rule__Port__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2094:1: ( ( rule__Port__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2094:1: ( ( rule__Port__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:2095:2: ( rule__Port__TypeAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:2096:2: ( rule__Port__TypeAssignment_1 )
            // InternalMontiArcDSL.g:2096:3: rule__Port__TypeAssignment_1
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
    // InternalMontiArcDSL.g:2104:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2108:1: ( rule__Port__Group__2__Impl )
            // InternalMontiArcDSL.g:2109:2: rule__Port__Group__2__Impl
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
    // InternalMontiArcDSL.g:2115:1: rule__Port__Group__2__Impl : ( ( rule__Port__NamesAssignment_2 )? ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2119:1: ( ( ( rule__Port__NamesAssignment_2 )? ) )
            // InternalMontiArcDSL.g:2120:1: ( ( rule__Port__NamesAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:2120:1: ( ( rule__Port__NamesAssignment_2 )? )
            // InternalMontiArcDSL.g:2121:2: ( rule__Port__NamesAssignment_2 )?
            {
             before(grammarAccess.getPortAccess().getNamesAssignment_2()); 
            // InternalMontiArcDSL.g:2122:2: ( rule__Port__NamesAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcDSL.g:2122:3: rule__Port__NamesAssignment_2
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
    // InternalMontiArcDSL.g:2131:1: rule__Names__Group__0 : rule__Names__Group__0__Impl rule__Names__Group__1 ;
    public final void rule__Names__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2135:1: ( rule__Names__Group__0__Impl rule__Names__Group__1 )
            // InternalMontiArcDSL.g:2136:2: rule__Names__Group__0__Impl rule__Names__Group__1
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
    // InternalMontiArcDSL.g:2143:1: rule__Names__Group__0__Impl : ( ( rule__Names__NamesAssignment_0 ) ) ;
    public final void rule__Names__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2147:1: ( ( ( rule__Names__NamesAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2148:1: ( ( rule__Names__NamesAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2148:1: ( ( rule__Names__NamesAssignment_0 ) )
            // InternalMontiArcDSL.g:2149:2: ( rule__Names__NamesAssignment_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_0()); 
            // InternalMontiArcDSL.g:2150:2: ( rule__Names__NamesAssignment_0 )
            // InternalMontiArcDSL.g:2150:3: rule__Names__NamesAssignment_0
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
    // InternalMontiArcDSL.g:2158:1: rule__Names__Group__1 : rule__Names__Group__1__Impl ;
    public final void rule__Names__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2162:1: ( rule__Names__Group__1__Impl )
            // InternalMontiArcDSL.g:2163:2: rule__Names__Group__1__Impl
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
    // InternalMontiArcDSL.g:2169:1: rule__Names__Group__1__Impl : ( ( rule__Names__Group_1__0 )* ) ;
    public final void rule__Names__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2173:1: ( ( ( rule__Names__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:2174:1: ( ( rule__Names__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:2174:1: ( ( rule__Names__Group_1__0 )* )
            // InternalMontiArcDSL.g:2175:2: ( rule__Names__Group_1__0 )*
            {
             before(grammarAccess.getNamesAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2176:2: ( rule__Names__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_ID) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2176:3: rule__Names__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Names__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMontiArcDSL.g:2185:1: rule__Names__Group_1__0 : rule__Names__Group_1__0__Impl rule__Names__Group_1__1 ;
    public final void rule__Names__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2189:1: ( rule__Names__Group_1__0__Impl rule__Names__Group_1__1 )
            // InternalMontiArcDSL.g:2190:2: rule__Names__Group_1__0__Impl rule__Names__Group_1__1
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
    // InternalMontiArcDSL.g:2197:1: rule__Names__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Names__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2201:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2202:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2202:1: ( ',' )
            // InternalMontiArcDSL.g:2203:2: ','
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
    // InternalMontiArcDSL.g:2212:1: rule__Names__Group_1__1 : rule__Names__Group_1__1__Impl ;
    public final void rule__Names__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2216:1: ( rule__Names__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2217:2: rule__Names__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2223:1: rule__Names__Group_1__1__Impl : ( ( rule__Names__NamesAssignment_1_1 ) ) ;
    public final void rule__Names__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2227:1: ( ( ( rule__Names__NamesAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2228:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2228:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2229:2: ( rule__Names__NamesAssignment_1_1 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 
            // InternalMontiArcDSL.g:2230:2: ( rule__Names__NamesAssignment_1_1 )
            // InternalMontiArcDSL.g:2230:3: rule__Names__NamesAssignment_1_1
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
    // InternalMontiArcDSL.g:2239:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2243:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMontiArcDSL.g:2244:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalMontiArcDSL.g:2251:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2255:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2256:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2256:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:2257:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:2258:2: ( rule__Variable__TypeAssignment_0 )
            // InternalMontiArcDSL.g:2258:3: rule__Variable__TypeAssignment_0
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
    // InternalMontiArcDSL.g:2266:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2270:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMontiArcDSL.g:2271:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalMontiArcDSL.g:2278:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NamesAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2282:1: ( ( ( rule__Variable__NamesAssignment_1 )? ) )
            // InternalMontiArcDSL.g:2283:1: ( ( rule__Variable__NamesAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:2283:1: ( ( rule__Variable__NamesAssignment_1 )? )
            // InternalMontiArcDSL.g:2284:2: ( rule__Variable__NamesAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1()); 
            // InternalMontiArcDSL.g:2285:2: ( rule__Variable__NamesAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMontiArcDSL.g:2285:3: rule__Variable__NamesAssignment_1
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
    // InternalMontiArcDSL.g:2293:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2297:1: ( rule__Variable__Group__2__Impl )
            // InternalMontiArcDSL.g:2298:2: rule__Variable__Group__2__Impl
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
    // InternalMontiArcDSL.g:2304:1: rule__Variable__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2308:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2309:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2309:1: ( ';' )
            // InternalMontiArcDSL.g:2310:2: ';'
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
    // InternalMontiArcDSL.g:2320:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2324:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalMontiArcDSL.g:2325:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
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
    // InternalMontiArcDSL.g:2332:1: rule__Automaton__Group__0__Impl : ( () ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2336:1: ( ( () ) )
            // InternalMontiArcDSL.g:2337:1: ( () )
            {
            // InternalMontiArcDSL.g:2337:1: ( () )
            // InternalMontiArcDSL.g:2338:2: ()
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 
            // InternalMontiArcDSL.g:2339:2: ()
            // InternalMontiArcDSL.g:2339:3: 
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
    // InternalMontiArcDSL.g:2347:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2351:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalMontiArcDSL.g:2352:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
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
    // InternalMontiArcDSL.g:2359:1: rule__Automaton__Group__1__Impl : ( 'automaton' ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2363:1: ( ( 'automaton' ) )
            // InternalMontiArcDSL.g:2364:1: ( 'automaton' )
            {
            // InternalMontiArcDSL.g:2364:1: ( 'automaton' )
            // InternalMontiArcDSL.g:2365:2: 'automaton'
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
    // InternalMontiArcDSL.g:2374:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2378:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalMontiArcDSL.g:2379:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
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
    // InternalMontiArcDSL.g:2386:1: rule__Automaton__Group__2__Impl : ( ( rule__Automaton__NameAssignment_2 )? ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2390:1: ( ( ( rule__Automaton__NameAssignment_2 )? ) )
            // InternalMontiArcDSL.g:2391:1: ( ( rule__Automaton__NameAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:2391:1: ( ( rule__Automaton__NameAssignment_2 )? )
            // InternalMontiArcDSL.g:2392:2: ( rule__Automaton__NameAssignment_2 )?
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_2()); 
            // InternalMontiArcDSL.g:2393:2: ( rule__Automaton__NameAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcDSL.g:2393:3: rule__Automaton__NameAssignment_2
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
    // InternalMontiArcDSL.g:2401:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2405:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalMontiArcDSL.g:2406:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
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
    // InternalMontiArcDSL.g:2413:1: rule__Automaton__Group__3__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2417:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:2418:1: ( '{' )
            {
            // InternalMontiArcDSL.g:2418:1: ( '{' )
            // InternalMontiArcDSL.g:2419:2: '{'
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
    // InternalMontiArcDSL.g:2428:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2432:1: ( rule__Automaton__Group__4__Impl rule__Automaton__Group__5 )
            // InternalMontiArcDSL.g:2433:2: rule__Automaton__Group__4__Impl rule__Automaton__Group__5
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
    // InternalMontiArcDSL.g:2440:1: rule__Automaton__Group__4__Impl : ( ( rule__Automaton__Alternatives_4 )* ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2444:1: ( ( ( rule__Automaton__Alternatives_4 )* ) )
            // InternalMontiArcDSL.g:2445:1: ( ( rule__Automaton__Alternatives_4 )* )
            {
            // InternalMontiArcDSL.g:2445:1: ( ( rule__Automaton__Alternatives_4 )* )
            // InternalMontiArcDSL.g:2446:2: ( rule__Automaton__Alternatives_4 )*
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_4()); 
            // InternalMontiArcDSL.g:2447:2: ( rule__Automaton__Alternatives_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=31 && LA20_0<=32)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2447:3: rule__Automaton__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Automaton__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMontiArcDSL.g:2455:1: rule__Automaton__Group__5 : rule__Automaton__Group__5__Impl ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2459:1: ( rule__Automaton__Group__5__Impl )
            // InternalMontiArcDSL.g:2460:2: rule__Automaton__Group__5__Impl
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
    // InternalMontiArcDSL.g:2466:1: rule__Automaton__Group__5__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2470:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:2471:1: ( '}' )
            {
            // InternalMontiArcDSL.g:2471:1: ( '}' )
            // InternalMontiArcDSL.g:2472:2: '}'
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
    // InternalMontiArcDSL.g:2482:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2486:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalMontiArcDSL.g:2487:2: rule__State__Group__0__Impl rule__State__Group__1
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
    // InternalMontiArcDSL.g:2494:1: rule__State__Group__0__Impl : ( 'state' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2498:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:2499:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:2499:1: ( 'state' )
            // InternalMontiArcDSL.g:2500:2: 'state'
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
    // InternalMontiArcDSL.g:2509:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2513:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalMontiArcDSL.g:2514:2: rule__State__Group__1__Impl rule__State__Group__2
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
    // InternalMontiArcDSL.g:2521:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2525:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2526:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2526:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2527:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2528:2: ( rule__State__NameAssignment_1 )
            // InternalMontiArcDSL.g:2528:3: rule__State__NameAssignment_1
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
    // InternalMontiArcDSL.g:2536:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2540:1: ( rule__State__Group__2__Impl )
            // InternalMontiArcDSL.g:2541:2: rule__State__Group__2__Impl
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
    // InternalMontiArcDSL.g:2547:1: rule__State__Group__2__Impl : ( ';' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2551:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2552:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2552:1: ( ';' )
            // InternalMontiArcDSL.g:2553:2: ';'
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
    // InternalMontiArcDSL.g:2563:1: rule__InitialState__Group__0 : rule__InitialState__Group__0__Impl rule__InitialState__Group__1 ;
    public final void rule__InitialState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2567:1: ( rule__InitialState__Group__0__Impl rule__InitialState__Group__1 )
            // InternalMontiArcDSL.g:2568:2: rule__InitialState__Group__0__Impl rule__InitialState__Group__1
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
    // InternalMontiArcDSL.g:2575:1: rule__InitialState__Group__0__Impl : ( 'initial' ) ;
    public final void rule__InitialState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2579:1: ( ( 'initial' ) )
            // InternalMontiArcDSL.g:2580:1: ( 'initial' )
            {
            // InternalMontiArcDSL.g:2580:1: ( 'initial' )
            // InternalMontiArcDSL.g:2581:2: 'initial'
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
    // InternalMontiArcDSL.g:2590:1: rule__InitialState__Group__1 : rule__InitialState__Group__1__Impl rule__InitialState__Group__2 ;
    public final void rule__InitialState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2594:1: ( rule__InitialState__Group__1__Impl rule__InitialState__Group__2 )
            // InternalMontiArcDSL.g:2595:2: rule__InitialState__Group__1__Impl rule__InitialState__Group__2
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
    // InternalMontiArcDSL.g:2602:1: rule__InitialState__Group__1__Impl : ( ( rule__InitialState__NameAssignment_1 ) ) ;
    public final void rule__InitialState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2606:1: ( ( ( rule__InitialState__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2607:1: ( ( rule__InitialState__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2607:1: ( ( rule__InitialState__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2608:2: ( rule__InitialState__NameAssignment_1 )
            {
             before(grammarAccess.getInitialStateAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2609:2: ( rule__InitialState__NameAssignment_1 )
            // InternalMontiArcDSL.g:2609:3: rule__InitialState__NameAssignment_1
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
    // InternalMontiArcDSL.g:2617:1: rule__InitialState__Group__2 : rule__InitialState__Group__2__Impl rule__InitialState__Group__3 ;
    public final void rule__InitialState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2621:1: ( rule__InitialState__Group__2__Impl rule__InitialState__Group__3 )
            // InternalMontiArcDSL.g:2622:2: rule__InitialState__Group__2__Impl rule__InitialState__Group__3
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
    // InternalMontiArcDSL.g:2629:1: rule__InitialState__Group__2__Impl : ( ( rule__InitialState__Group_2__0 )? ) ;
    public final void rule__InitialState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2633:1: ( ( ( rule__InitialState__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2634:1: ( ( rule__InitialState__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2634:1: ( ( rule__InitialState__Group_2__0 )? )
            // InternalMontiArcDSL.g:2635:2: ( rule__InitialState__Group_2__0 )?
            {
             before(grammarAccess.getInitialStateAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2636:2: ( rule__InitialState__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiArcDSL.g:2636:3: rule__InitialState__Group_2__0
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
    // InternalMontiArcDSL.g:2644:1: rule__InitialState__Group__3 : rule__InitialState__Group__3__Impl ;
    public final void rule__InitialState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2648:1: ( rule__InitialState__Group__3__Impl )
            // InternalMontiArcDSL.g:2649:2: rule__InitialState__Group__3__Impl
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
    // InternalMontiArcDSL.g:2655:1: rule__InitialState__Group__3__Impl : ( ';' ) ;
    public final void rule__InitialState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2659:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2660:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2660:1: ( ';' )
            // InternalMontiArcDSL.g:2661:2: ';'
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
    // InternalMontiArcDSL.g:2671:1: rule__InitialState__Group_2__0 : rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1 ;
    public final void rule__InitialState__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2675:1: ( rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1 )
            // InternalMontiArcDSL.g:2676:2: rule__InitialState__Group_2__0__Impl rule__InitialState__Group_2__1
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
    // InternalMontiArcDSL.g:2683:1: rule__InitialState__Group_2__0__Impl : ( '/' ) ;
    public final void rule__InitialState__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2687:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:2688:1: ( '/' )
            {
            // InternalMontiArcDSL.g:2688:1: ( '/' )
            // InternalMontiArcDSL.g:2689:2: '/'
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
    // InternalMontiArcDSL.g:2698:1: rule__InitialState__Group_2__1 : rule__InitialState__Group_2__1__Impl ;
    public final void rule__InitialState__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2702:1: ( rule__InitialState__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2703:2: rule__InitialState__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2709:1: rule__InitialState__Group_2__1__Impl : ( ( rule__InitialState__BlockAssignment_2_1 ) ) ;
    public final void rule__InitialState__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2713:1: ( ( ( rule__InitialState__BlockAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2714:1: ( ( rule__InitialState__BlockAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2714:1: ( ( rule__InitialState__BlockAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2715:2: ( rule__InitialState__BlockAssignment_2_1 )
            {
             before(grammarAccess.getInitialStateAccess().getBlockAssignment_2_1()); 
            // InternalMontiArcDSL.g:2716:2: ( rule__InitialState__BlockAssignment_2_1 )
            // InternalMontiArcDSL.g:2716:3: rule__InitialState__BlockAssignment_2_1
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
    // InternalMontiArcDSL.g:2725:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2729:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMontiArcDSL.g:2730:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalMontiArcDSL.g:2737:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2741:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2742:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2742:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:2743:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:2744:2: ( rule__Transition__SourceAssignment_0 )
            // InternalMontiArcDSL.g:2744:3: rule__Transition__SourceAssignment_0
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
    // InternalMontiArcDSL.g:2752:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2756:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMontiArcDSL.g:2757:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalMontiArcDSL.g:2764:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2768:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:2769:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:2769:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalMontiArcDSL.g:2770:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2771:2: ( rule__Transition__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMontiArcDSL.g:2771:3: rule__Transition__Group_1__0
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
    // InternalMontiArcDSL.g:2779:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2783:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMontiArcDSL.g:2784:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalMontiArcDSL.g:2791:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2795:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2796:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2796:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMontiArcDSL.g:2797:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2798:2: ( rule__Transition__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMontiArcDSL.g:2798:3: rule__Transition__Group_2__0
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
    // InternalMontiArcDSL.g:2806:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2810:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMontiArcDSL.g:2811:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // InternalMontiArcDSL.g:2818:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2822:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalMontiArcDSL.g:2823:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalMontiArcDSL.g:2823:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalMontiArcDSL.g:2824:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:2825:2: ( rule__Transition__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMontiArcDSL.g:2825:3: rule__Transition__Group_3__0
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
    // InternalMontiArcDSL.g:2833:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2837:1: ( rule__Transition__Group__4__Impl )
            // InternalMontiArcDSL.g:2838:2: rule__Transition__Group__4__Impl
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
    // InternalMontiArcDSL.g:2844:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2848:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2849:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2849:1: ( ';' )
            // InternalMontiArcDSL.g:2850:2: ';'
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
    // InternalMontiArcDSL.g:2860:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2864:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalMontiArcDSL.g:2865:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalMontiArcDSL.g:2872:1: rule__Transition__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2876:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:2877:1: ( '->' )
            {
            // InternalMontiArcDSL.g:2877:1: ( '->' )
            // InternalMontiArcDSL.g:2878:2: '->'
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
    // InternalMontiArcDSL.g:2887:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2891:1: ( rule__Transition__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2892:2: rule__Transition__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2898:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TargetAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2902:1: ( ( ( rule__Transition__TargetAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2903:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2903:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2904:2: ( rule__Transition__TargetAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 
            // InternalMontiArcDSL.g:2905:2: ( rule__Transition__TargetAssignment_1_1 )
            // InternalMontiArcDSL.g:2905:3: rule__Transition__TargetAssignment_1_1
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
    // InternalMontiArcDSL.g:2914:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2918:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMontiArcDSL.g:2919:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalMontiArcDSL.g:2926:1: rule__Transition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2930:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:2931:1: ( '[' )
            {
            // InternalMontiArcDSL.g:2931:1: ( '[' )
            // InternalMontiArcDSL.g:2932:2: '['
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
    // InternalMontiArcDSL.g:2941:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2945:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalMontiArcDSL.g:2946:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
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
    // InternalMontiArcDSL.g:2953:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2957:1: ( ( ( rule__Transition__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2958:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2958:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2959:2: ( rule__Transition__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:2960:2: ( rule__Transition__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:2960:3: rule__Transition__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:2968:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2972:1: ( rule__Transition__Group_2__2__Impl )
            // InternalMontiArcDSL.g:2973:2: rule__Transition__Group_2__2__Impl
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
    // InternalMontiArcDSL.g:2979:1: rule__Transition__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2983:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:2984:1: ( ']' )
            {
            // InternalMontiArcDSL.g:2984:1: ( ']' )
            // InternalMontiArcDSL.g:2985:2: ']'
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
    // InternalMontiArcDSL.g:2995:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2999:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalMontiArcDSL.g:3000:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
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
    // InternalMontiArcDSL.g:3007:1: rule__Transition__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3011:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:3012:1: ( '/' )
            {
            // InternalMontiArcDSL.g:3012:1: ( '/' )
            // InternalMontiArcDSL.g:3013:2: '/'
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
    // InternalMontiArcDSL.g:3022:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3026:1: ( rule__Transition__Group_3__1__Impl )
            // InternalMontiArcDSL.g:3027:2: rule__Transition__Group_3__1__Impl
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
    // InternalMontiArcDSL.g:3033:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ReactionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3037:1: ( ( ( rule__Transition__ReactionAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:3038:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:3038:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            // InternalMontiArcDSL.g:3039:2: ( rule__Transition__ReactionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 
            // InternalMontiArcDSL.g:3040:2: ( rule__Transition__ReactionAssignment_3_1 )
            // InternalMontiArcDSL.g:3040:3: rule__Transition__ReactionAssignment_3_1
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
    // InternalMontiArcDSL.g:3049:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3053:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMontiArcDSL.g:3054:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalMontiArcDSL.g:3061:1: rule__Block__Group__0__Impl : ( '{' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3065:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:3066:1: ( '{' )
            {
            // InternalMontiArcDSL.g:3066:1: ( '{' )
            // InternalMontiArcDSL.g:3067:2: '{'
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
    // InternalMontiArcDSL.g:3076:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3080:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMontiArcDSL.g:3081:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalMontiArcDSL.g:3088:1: rule__Block__Group__1__Impl : ( ( rule__Block__Group_1__0 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3092:1: ( ( ( rule__Block__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:3093:1: ( ( rule__Block__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:3093:1: ( ( rule__Block__Group_1__0 )? )
            // InternalMontiArcDSL.g:3094:2: ( rule__Block__Group_1__0 )?
            {
             before(grammarAccess.getBlockAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:3095:2: ( rule__Block__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==25) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalMontiArcDSL.g:3095:3: rule__Block__Group_1__0
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
    // InternalMontiArcDSL.g:3103:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3107:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMontiArcDSL.g:3108:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMontiArcDSL.g:3115:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3119:1: ( ( ( rule__Block__ExpressionsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:3120:1: ( ( rule__Block__ExpressionsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:3120:1: ( ( rule__Block__ExpressionsAssignment_2 ) )
            // InternalMontiArcDSL.g:3121:2: ( rule__Block__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalMontiArcDSL.g:3122:2: ( rule__Block__ExpressionsAssignment_2 )
            // InternalMontiArcDSL.g:3122:3: rule__Block__ExpressionsAssignment_2
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
    // InternalMontiArcDSL.g:3130:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3134:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalMontiArcDSL.g:3135:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalMontiArcDSL.g:3142:1: rule__Block__Group__3__Impl : ( ( rule__Block__Group_3__0 )* ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3146:1: ( ( ( rule__Block__Group_3__0 )* ) )
            // InternalMontiArcDSL.g:3147:1: ( ( rule__Block__Group_3__0 )* )
            {
            // InternalMontiArcDSL.g:3147:1: ( ( rule__Block__Group_3__0 )* )
            // InternalMontiArcDSL.g:3148:2: ( rule__Block__Group_3__0 )*
            {
             before(grammarAccess.getBlockAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:3149:2: ( rule__Block__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3149:3: rule__Block__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Block__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalMontiArcDSL.g:3157:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3161:1: ( rule__Block__Group__4__Impl )
            // InternalMontiArcDSL.g:3162:2: rule__Block__Group__4__Impl
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
    // InternalMontiArcDSL.g:3168:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3172:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:3173:1: ( '}' )
            {
            // InternalMontiArcDSL.g:3173:1: ( '}' )
            // InternalMontiArcDSL.g:3174:2: '}'
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
    // InternalMontiArcDSL.g:3184:1: rule__Block__Group_1__0 : rule__Block__Group_1__0__Impl rule__Block__Group_1__1 ;
    public final void rule__Block__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3188:1: ( rule__Block__Group_1__0__Impl rule__Block__Group_1__1 )
            // InternalMontiArcDSL.g:3189:2: rule__Block__Group_1__0__Impl rule__Block__Group_1__1
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
    // InternalMontiArcDSL.g:3196:1: rule__Block__Group_1__0__Impl : ( ( rule__Block__NameAssignment_1_0 ) ) ;
    public final void rule__Block__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3200:1: ( ( ( rule__Block__NameAssignment_1_0 ) ) )
            // InternalMontiArcDSL.g:3201:1: ( ( rule__Block__NameAssignment_1_0 ) )
            {
            // InternalMontiArcDSL.g:3201:1: ( ( rule__Block__NameAssignment_1_0 ) )
            // InternalMontiArcDSL.g:3202:2: ( rule__Block__NameAssignment_1_0 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1_0()); 
            // InternalMontiArcDSL.g:3203:2: ( rule__Block__NameAssignment_1_0 )
            // InternalMontiArcDSL.g:3203:3: rule__Block__NameAssignment_1_0
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
    // InternalMontiArcDSL.g:3211:1: rule__Block__Group_1__1 : rule__Block__Group_1__1__Impl ;
    public final void rule__Block__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3215:1: ( rule__Block__Group_1__1__Impl )
            // InternalMontiArcDSL.g:3216:2: rule__Block__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:3222:1: rule__Block__Group_1__1__Impl : ( '=' ) ;
    public final void rule__Block__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3226:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:3227:1: ( '=' )
            {
            // InternalMontiArcDSL.g:3227:1: ( '=' )
            // InternalMontiArcDSL.g:3228:2: '='
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
    // InternalMontiArcDSL.g:3238:1: rule__Block__Group_3__0 : rule__Block__Group_3__0__Impl rule__Block__Group_3__1 ;
    public final void rule__Block__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3242:1: ( rule__Block__Group_3__0__Impl rule__Block__Group_3__1 )
            // InternalMontiArcDSL.g:3243:2: rule__Block__Group_3__0__Impl rule__Block__Group_3__1
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
    // InternalMontiArcDSL.g:3250:1: rule__Block__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Block__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3254:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3255:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3255:1: ( ',' )
            // InternalMontiArcDSL.g:3256:2: ','
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
    // InternalMontiArcDSL.g:3265:1: rule__Block__Group_3__1 : rule__Block__Group_3__1__Impl ;
    public final void rule__Block__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3269:1: ( rule__Block__Group_3__1__Impl )
            // InternalMontiArcDSL.g:3270:2: rule__Block__Group_3__1__Impl
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
    // InternalMontiArcDSL.g:3276:1: rule__Block__Group_3__1__Impl : ( ( rule__Block__ExpressionsAssignment_3_1 ) ) ;
    public final void rule__Block__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3280:1: ( ( ( rule__Block__ExpressionsAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:3281:1: ( ( rule__Block__ExpressionsAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:3281:1: ( ( rule__Block__ExpressionsAssignment_3_1 ) )
            // InternalMontiArcDSL.g:3282:2: ( rule__Block__ExpressionsAssignment_3_1 )
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_3_1()); 
            // InternalMontiArcDSL.g:3283:2: ( rule__Block__ExpressionsAssignment_3_1 )
            // InternalMontiArcDSL.g:3283:3: rule__Block__ExpressionsAssignment_3_1
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
    // InternalMontiArcDSL.g:3292:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3296:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiArcDSL.g:3297:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3304:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3308:1: ( ( 'import' ) )
            // InternalMontiArcDSL.g:3309:1: ( 'import' )
            {
            // InternalMontiArcDSL.g:3309:1: ( 'import' )
            // InternalMontiArcDSL.g:3310:2: 'import'
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
    // InternalMontiArcDSL.g:3319:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3323:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiArcDSL.g:3324:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMontiArcDSL.g:3331:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3335:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3336:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3336:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiArcDSL.g:3337:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiArcDSL.g:3338:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiArcDSL.g:3338:3: rule__ImportStatements__ImportUriAssignment_1
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
    // InternalMontiArcDSL.g:3346:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3350:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiArcDSL.g:3351:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalMontiArcDSL.g:3358:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__Group_2__0 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3362:1: ( ( ( rule__ImportStatements__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:3363:1: ( ( rule__ImportStatements__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:3363:1: ( ( rule__ImportStatements__Group_2__0 )? )
            // InternalMontiArcDSL.g:3364:2: ( rule__ImportStatements__Group_2__0 )?
            {
             before(grammarAccess.getImportStatementsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3365:2: ( rule__ImportStatements__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMontiArcDSL.g:3365:3: rule__ImportStatements__Group_2__0
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
    // InternalMontiArcDSL.g:3373:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3377:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiArcDSL.g:3378:2: rule__ImportStatements__Group__3__Impl
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
    // InternalMontiArcDSL.g:3384:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3388:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3389:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3389:1: ( ';' )
            // InternalMontiArcDSL.g:3390:2: ';'
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
    // InternalMontiArcDSL.g:3400:1: rule__ImportStatements__Group_2__0 : rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1 ;
    public final void rule__ImportStatements__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3404:1: ( rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1 )
            // InternalMontiArcDSL.g:3405:2: rule__ImportStatements__Group_2__0__Impl rule__ImportStatements__Group_2__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMontiArcDSL.g:3412:1: rule__ImportStatements__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ImportStatements__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3416:1: ( ( '.' ) )
            // InternalMontiArcDSL.g:3417:1: ( '.' )
            {
            // InternalMontiArcDSL.g:3417:1: ( '.' )
            // InternalMontiArcDSL.g:3418:2: '.'
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
    // InternalMontiArcDSL.g:3427:1: rule__ImportStatements__Group_2__1 : rule__ImportStatements__Group_2__1__Impl ;
    public final void rule__ImportStatements__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3431:1: ( rule__ImportStatements__Group_2__1__Impl )
            // InternalMontiArcDSL.g:3432:2: rule__ImportStatements__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:3438:1: rule__ImportStatements__Group_2__1__Impl : ( ( rule__ImportStatements__StarAssignment_2_1 ) ) ;
    public final void rule__ImportStatements__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3442:1: ( ( ( rule__ImportStatements__StarAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3443:1: ( ( rule__ImportStatements__StarAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3443:1: ( ( rule__ImportStatements__StarAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3444:2: ( rule__ImportStatements__StarAssignment_2_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2_1()); 
            // InternalMontiArcDSL.g:3445:2: ( rule__ImportStatements__StarAssignment_2_1 )
            // InternalMontiArcDSL.g:3445:3: rule__ImportStatements__StarAssignment_2_1
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
    // InternalMontiArcDSL.g:3454:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3458:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiArcDSL.g:3459:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3466:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3470:1: ( ( 'package' ) )
            // InternalMontiArcDSL.g:3471:1: ( 'package' )
            {
            // InternalMontiArcDSL.g:3471:1: ( 'package' )
            // InternalMontiArcDSL.g:3472:2: 'package'
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
    // InternalMontiArcDSL.g:3481:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3485:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiArcDSL.g:3486:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalMontiArcDSL.g:3493:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3497:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3498:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3498:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:3499:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:3500:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiArcDSL.g:3500:3: rule__Package__NameAssignment_1
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
    // InternalMontiArcDSL.g:3508:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3512:1: ( rule__Package__Group__2__Impl )
            // InternalMontiArcDSL.g:3513:2: rule__Package__Group__2__Impl
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
    // InternalMontiArcDSL.g:3519:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3523:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3524:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3524:1: ( ';' )
            // InternalMontiArcDSL.g:3525:2: ';'
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
    // InternalMontiArcDSL.g:3535:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3539:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiArcDSL.g:3540:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMontiArcDSL.g:3547:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3551:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiArcDSL.g:3552:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiArcDSL.g:3552:1: ( ruleMCPrimitiveType )
            // InternalMontiArcDSL.g:3553:2: ruleMCPrimitiveType
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
    // InternalMontiArcDSL.g:3562:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3566:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiArcDSL.g:3567:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
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
    // InternalMontiArcDSL.g:3574:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3578:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3579:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3579:1: ( '[' )
            // InternalMontiArcDSL.g:3580:2: '['
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
    // InternalMontiArcDSL.g:3589:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3593:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiArcDSL.g:3594:2: rule__MCArrayType__Group__2__Impl
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
    // InternalMontiArcDSL.g:3600:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3604:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3605:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3605:1: ( ']' )
            // InternalMontiArcDSL.g:3606:2: ']'
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


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalMontiArcDSL.g:3616:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3620:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalMontiArcDSL.g:3621:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
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
    // InternalMontiArcDSL.g:3628:1: rule__Arguments__Group__0__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3632:1: ( ( '(' ) )
            // InternalMontiArcDSL.g:3633:1: ( '(' )
            {
            // InternalMontiArcDSL.g:3633:1: ( '(' )
            // InternalMontiArcDSL.g:3634:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3643:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3647:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalMontiArcDSL.g:3648:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3655:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3659:1: ( ( ( rule__Arguments__ArgumentsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3660:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3660:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            // InternalMontiArcDSL.g:3661:2: ( rule__Arguments__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 
            // InternalMontiArcDSL.g:3662:2: ( rule__Arguments__ArgumentsAssignment_1 )
            // InternalMontiArcDSL.g:3662:3: rule__Arguments__ArgumentsAssignment_1
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
    // InternalMontiArcDSL.g:3670:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3674:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalMontiArcDSL.g:3675:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3682:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__Group_2__0 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3686:1: ( ( ( rule__Arguments__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:3687:1: ( ( rule__Arguments__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:3687:1: ( ( rule__Arguments__Group_2__0 )* )
            // InternalMontiArcDSL.g:3688:2: ( rule__Arguments__Group_2__0 )*
            {
             before(grammarAccess.getArgumentsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3689:2: ( rule__Arguments__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==24) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3689:3: rule__Arguments__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Arguments__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMontiArcDSL.g:3697:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3701:1: ( rule__Arguments__Group__3__Impl )
            // InternalMontiArcDSL.g:3702:2: rule__Arguments__Group__3__Impl
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
    // InternalMontiArcDSL.g:3708:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3712:1: ( ( ')' ) )
            // InternalMontiArcDSL.g:3713:1: ( ')' )
            {
            // InternalMontiArcDSL.g:3713:1: ( ')' )
            // InternalMontiArcDSL.g:3714:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3724:1: rule__Arguments__Group_2__0 : rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 ;
    public final void rule__Arguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3728:1: ( rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 )
            // InternalMontiArcDSL.g:3729:2: rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1
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
    // InternalMontiArcDSL.g:3736:1: rule__Arguments__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Arguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3740:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3741:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3741:1: ( ',' )
            // InternalMontiArcDSL.g:3742:2: ','
            {
             before(grammarAccess.getArgumentsAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3751:1: rule__Arguments__Group_2__1 : rule__Arguments__Group_2__1__Impl ;
    public final void rule__Arguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3755:1: ( rule__Arguments__Group_2__1__Impl )
            // InternalMontiArcDSL.g:3756:2: rule__Arguments__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:3762:1: rule__Arguments__Group_2__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Arguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3766:1: ( ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3767:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3767:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3768:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 
            // InternalMontiArcDSL.g:3769:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            // InternalMontiArcDSL.g:3769:3: rule__Arguments__ArgumentsAssignment_2_1
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
    // InternalMontiArcDSL.g:3778:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3782:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMontiArcDSL.g:3783:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalMontiArcDSL.g:3790:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3794:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMontiArcDSL.g:3795:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:3795:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMontiArcDSL.g:3796:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMontiArcDSL.g:3797:2: ( rule__Argument__NameAssignment_0 )
            // InternalMontiArcDSL.g:3797:3: rule__Argument__NameAssignment_0
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
    // InternalMontiArcDSL.g:3805:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3809:1: ( rule__Argument__Group__1__Impl )
            // InternalMontiArcDSL.g:3810:2: rule__Argument__Group__1__Impl
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
    // InternalMontiArcDSL.g:3816:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3820:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3821:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3821:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMontiArcDSL.g:3822:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMontiArcDSL.g:3823:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMontiArcDSL.g:3823:3: rule__Argument__ExpressionAssignment_1
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
    // InternalMontiArcDSL.g:3832:1: rule__MACompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__MACompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3836:1: ( ( rulePackage ) )
            // InternalMontiArcDSL.g:3837:2: ( rulePackage )
            {
            // InternalMontiArcDSL.g:3837:2: ( rulePackage )
            // InternalMontiArcDSL.g:3838:3: rulePackage
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
    // InternalMontiArcDSL.g:3847:1: rule__MACompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__MACompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3851:1: ( ( ruleImportStatements ) )
            // InternalMontiArcDSL.g:3852:2: ( ruleImportStatements )
            {
            // InternalMontiArcDSL.g:3852:2: ( ruleImportStatements )
            // InternalMontiArcDSL.g:3853:3: ruleImportStatements
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
    // InternalMontiArcDSL.g:3862:1: rule__MACompilationUnit__ComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__MACompilationUnit__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3866:1: ( ( ruleComponent ) )
            // InternalMontiArcDSL.g:3867:2: ( ruleComponent )
            {
            // InternalMontiArcDSL.g:3867:2: ( ruleComponent )
            // InternalMontiArcDSL.g:3868:3: ruleComponent
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
    // InternalMontiArcDSL.g:3877:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3881:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:3882:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:3882:2: ( RULE_ID )
            // InternalMontiArcDSL.g:3883:3: RULE_ID
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
    // InternalMontiArcDSL.g:3892:1: rule__Component__SignatureAssignment_2 : ( ruleSignature ) ;
    public final void rule__Component__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3896:1: ( ( ruleSignature ) )
            // InternalMontiArcDSL.g:3897:2: ( ruleSignature )
            {
            // InternalMontiArcDSL.g:3897:2: ( ruleSignature )
            // InternalMontiArcDSL.g:3898:3: ruleSignature
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
    // InternalMontiArcDSL.g:3907:1: rule__Component__ArcElementsAssignment_4 : ( ruleArcElement ) ;
    public final void rule__Component__ArcElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3911:1: ( ( ruleArcElement ) )
            // InternalMontiArcDSL.g:3912:2: ( ruleArcElement )
            {
            // InternalMontiArcDSL.g:3912:2: ( ruleArcElement )
            // InternalMontiArcDSL.g:3913:3: ruleArcElement
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
    // InternalMontiArcDSL.g:3922:1: rule__Signature__ParametersAssignment_1 : ( ruleParameters ) ;
    public final void rule__Signature__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3926:1: ( ( ruleParameters ) )
            // InternalMontiArcDSL.g:3927:2: ( ruleParameters )
            {
            // InternalMontiArcDSL.g:3927:2: ( ruleParameters )
            // InternalMontiArcDSL.g:3928:3: ruleParameters
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
    // InternalMontiArcDSL.g:3937:1: rule__Signature__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Signature__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3941:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3942:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3942:2: ( ruleType )
            // InternalMontiArcDSL.g:3943:3: ruleType
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
    // InternalMontiArcDSL.g:3952:1: rule__Parameters__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3956:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:3957:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:3957:2: ( ruleParameter )
            // InternalMontiArcDSL.g:3958:3: ruleParameter
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
    // InternalMontiArcDSL.g:3967:1: rule__Parameters__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3971:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:3972:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:3972:2: ( ruleParameter )
            // InternalMontiArcDSL.g:3973:3: ruleParameter
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
    // InternalMontiArcDSL.g:3982:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3986:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:3987:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:3987:2: ( ruleType )
            // InternalMontiArcDSL.g:3988:3: ruleType
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
    // InternalMontiArcDSL.g:3997:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4001:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4002:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4002:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4003:3: RULE_ID
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
    // InternalMontiArcDSL.g:4012:1: rule__Parameter__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4016:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4017:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4017:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4018:3: ruleExpression
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
    // InternalMontiArcDSL.g:4027:1: rule__SubComponent__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__SubComponent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4031:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4032:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4032:2: ( ruleType )
            // InternalMontiArcDSL.g:4033:3: ruleType
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
    // InternalMontiArcDSL.g:4042:1: rule__SubComponent__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__SubComponent__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4046:1: ( ( ruleArguments ) )
            // InternalMontiArcDSL.g:4047:2: ( ruleArguments )
            {
            // InternalMontiArcDSL.g:4047:2: ( ruleArguments )
            // InternalMontiArcDSL.g:4048:3: ruleArguments
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
    // InternalMontiArcDSL.g:4057:1: rule__SubComponent__InstancesAssignment_3 : ( ruleNames ) ;
    public final void rule__SubComponent__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4061:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4062:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4062:2: ( ruleNames )
            // InternalMontiArcDSL.g:4063:3: ruleNames
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
    // InternalMontiArcDSL.g:4072:1: rule__Connector__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4076:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4077:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4077:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4078:3: RULE_ID
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
    // InternalMontiArcDSL.g:4087:1: rule__Connector__TargetsAssignment_3 : ( ruleNames ) ;
    public final void rule__Connector__TargetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4091:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4092:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4092:2: ( ruleNames )
            // InternalMontiArcDSL.g:4093:3: ruleNames
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
    // InternalMontiArcDSL.g:4102:1: rule__Ports__PortsAssignment_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4106:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:4107:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:4107:2: ( rulePort )
            // InternalMontiArcDSL.g:4108:3: rulePort
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
    // InternalMontiArcDSL.g:4117:1: rule__Ports__PortsAssignment_2_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4121:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:4122:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:4122:2: ( rulePort )
            // InternalMontiArcDSL.g:4123:3: rulePort
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
    // InternalMontiArcDSL.g:4132:1: rule__Port__InAssignment_0_0 : ( ( 'in' ) ) ;
    public final void rule__Port__InAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4136:1: ( ( ( 'in' ) ) )
            // InternalMontiArcDSL.g:4137:2: ( ( 'in' ) )
            {
            // InternalMontiArcDSL.g:4137:2: ( ( 'in' ) )
            // InternalMontiArcDSL.g:4138:3: ( 'in' )
            {
             before(grammarAccess.getPortAccess().getInInKeyword_0_0_0()); 
            // InternalMontiArcDSL.g:4139:3: ( 'in' )
            // InternalMontiArcDSL.g:4140:4: 'in'
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
    // InternalMontiArcDSL.g:4151:1: rule__Port__OutAssignment_0_1 : ( ( 'out' ) ) ;
    public final void rule__Port__OutAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4155:1: ( ( ( 'out' ) ) )
            // InternalMontiArcDSL.g:4156:2: ( ( 'out' ) )
            {
            // InternalMontiArcDSL.g:4156:2: ( ( 'out' ) )
            // InternalMontiArcDSL.g:4157:3: ( 'out' )
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_0_1_0()); 
            // InternalMontiArcDSL.g:4158:3: ( 'out' )
            // InternalMontiArcDSL.g:4159:4: 'out'
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
    // InternalMontiArcDSL.g:4170:1: rule__Port__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Port__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4174:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4175:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4175:2: ( ruleType )
            // InternalMontiArcDSL.g:4176:3: ruleType
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
    // InternalMontiArcDSL.g:4185:1: rule__Port__NamesAssignment_2 : ( ruleNames ) ;
    public final void rule__Port__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4189:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4190:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4190:2: ( ruleNames )
            // InternalMontiArcDSL.g:4191:3: ruleNames
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
    // InternalMontiArcDSL.g:4200:1: rule__Names__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Names__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4204:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4205:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4205:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4206:3: RULE_ID
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
    // InternalMontiArcDSL.g:4215:1: rule__Names__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Names__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4219:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4220:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4220:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4221:3: RULE_ID
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
    // InternalMontiArcDSL.g:4230:1: rule__Variable__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4234:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:4235:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:4235:2: ( ruleType )
            // InternalMontiArcDSL.g:4236:3: ruleType
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
    // InternalMontiArcDSL.g:4245:1: rule__Variable__NamesAssignment_1 : ( ruleNames ) ;
    public final void rule__Variable__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4249:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:4250:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:4250:2: ( ruleNames )
            // InternalMontiArcDSL.g:4251:3: ruleNames
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
    // InternalMontiArcDSL.g:4260:1: rule__Automaton__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4264:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4265:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4265:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4266:3: RULE_ID
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
    // InternalMontiArcDSL.g:4275:1: rule__Automaton__StatesAssignment_4_0 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4279:1: ( ( ruleState ) )
            // InternalMontiArcDSL.g:4280:2: ( ruleState )
            {
            // InternalMontiArcDSL.g:4280:2: ( ruleState )
            // InternalMontiArcDSL.g:4281:3: ruleState
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
    // InternalMontiArcDSL.g:4290:1: rule__Automaton__InitialStatesAssignment_4_1 : ( ruleInitialState ) ;
    public final void rule__Automaton__InitialStatesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4294:1: ( ( ruleInitialState ) )
            // InternalMontiArcDSL.g:4295:2: ( ruleInitialState )
            {
            // InternalMontiArcDSL.g:4295:2: ( ruleInitialState )
            // InternalMontiArcDSL.g:4296:3: ruleInitialState
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
    // InternalMontiArcDSL.g:4305:1: rule__Automaton__TransitionsAssignment_4_2 : ( ruleTransition ) ;
    public final void rule__Automaton__TransitionsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4309:1: ( ( ruleTransition ) )
            // InternalMontiArcDSL.g:4310:2: ( ruleTransition )
            {
            // InternalMontiArcDSL.g:4310:2: ( ruleTransition )
            // InternalMontiArcDSL.g:4311:3: ruleTransition
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
    // InternalMontiArcDSL.g:4320:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4324:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4325:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4325:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4326:3: RULE_ID
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
    // InternalMontiArcDSL.g:4335:1: rule__InitialState__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InitialState__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4339:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4340:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4340:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4341:3: RULE_ID
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
    // InternalMontiArcDSL.g:4350:1: rule__InitialState__BlockAssignment_2_1 : ( ruleBlock ) ;
    public final void rule__InitialState__BlockAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4354:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:4355:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:4355:2: ( ruleBlock )
            // InternalMontiArcDSL.g:4356:3: ruleBlock
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
    // InternalMontiArcDSL.g:4365:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4369:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:4370:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:4370:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4371:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 
            // InternalMontiArcDSL.g:4372:3: ( RULE_ID )
            // InternalMontiArcDSL.g:4373:4: RULE_ID
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
    // InternalMontiArcDSL.g:4384:1: rule__Transition__TargetAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4388:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:4389:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:4389:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4390:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetCrossReference_1_1_0()); 
            // InternalMontiArcDSL.g:4391:3: ( RULE_ID )
            // InternalMontiArcDSL.g:4392:4: RULE_ID
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
    // InternalMontiArcDSL.g:4403:1: rule__Transition__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Transition__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4407:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4408:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4408:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4409:3: ruleExpression
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
    // InternalMontiArcDSL.g:4418:1: rule__Transition__ReactionAssignment_3_1 : ( ruleBlock ) ;
    public final void rule__Transition__ReactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4422:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:4423:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:4423:2: ( ruleBlock )
            // InternalMontiArcDSL.g:4424:3: ruleBlock
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
    // InternalMontiArcDSL.g:4433:1: rule__Block__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4437:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4438:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4438:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4439:3: RULE_ID
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
    // InternalMontiArcDSL.g:4448:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4452:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4453:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4453:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4454:3: ruleExpression
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
    // InternalMontiArcDSL.g:4463:1: rule__Block__ExpressionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__Block__ExpressionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4467:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4468:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4468:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4469:3: ruleExpression
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
    // InternalMontiArcDSL.g:4478:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4482:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:4483:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:4483:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:4484:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:4493:1: rule__ImportStatements__StarAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__ImportStatements__StarAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4497:1: ( ( ( '*' ) ) )
            // InternalMontiArcDSL.g:4498:2: ( ( '*' ) )
            {
            // InternalMontiArcDSL.g:4498:2: ( ( '*' ) )
            // InternalMontiArcDSL.g:4499:3: ( '*' )
            {
             before(grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0()); 
            // InternalMontiArcDSL.g:4500:3: ( '*' )
            // InternalMontiArcDSL.g:4501:4: '*'
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
    // InternalMontiArcDSL.g:4512:1: rule__Package__NameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4516:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:4517:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:4517:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:4518:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:4527:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4531:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:4532:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:4532:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:4533:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:4534:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:4534:4: rule__MCPrimitiveType__TypeAlternatives_0
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


    // $ANTLR start "rule__NumberLiteral__LiteralAssignment"
    // InternalMontiArcDSL.g:4542:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4546:1: ( ( RULE_INT ) )
            // InternalMontiArcDSL.g:4547:2: ( RULE_INT )
            {
            // InternalMontiArcDSL.g:4547:2: ( RULE_INT )
            // InternalMontiArcDSL.g:4548:3: RULE_INT
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
    // InternalMontiArcDSL.g:4557:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4561:1: ( ( RULE_STRING ) )
            // InternalMontiArcDSL.g:4562:2: ( RULE_STRING )
            {
            // InternalMontiArcDSL.g:4562:2: ( RULE_STRING )
            // InternalMontiArcDSL.g:4563:3: RULE_STRING
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
    // InternalMontiArcDSL.g:4572:1: rule__NameExpression__NameAssignment : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4576:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4577:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4577:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4578:3: RULE_ID
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
    // InternalMontiArcDSL.g:4587:1: rule__Arguments__ArgumentsAssignment_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4591:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:4592:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:4592:2: ( ruleArgument )
            // InternalMontiArcDSL.g:4593:3: ruleArgument
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
    // InternalMontiArcDSL.g:4602:1: rule__Arguments__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4606:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:4607:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:4607:2: ( ruleArgument )
            // InternalMontiArcDSL.g:4608:3: ruleArgument
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
    // InternalMontiArcDSL.g:4617:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4621:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:4622:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:4622:2: ( RULE_ID )
            // InternalMontiArcDSL.g:4623:3: RULE_ID
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
    // InternalMontiArcDSL.g:4632:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4636:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:4637:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:4637:2: ( ruleExpression )
            // InternalMontiArcDSL.g:4638:3: ruleExpression
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\10\12\2\uffff";
    static final String dfa_3s = "\1\14\10\4\2\uffff";
    static final String dfa_4s = "\1\23\10\47\2\uffff";
    static final String dfa_5s = "\11\uffff\1\2\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
            "\1\12\20\uffff\1\12\2\uffff\1\12\1\uffff\1\12\7\uffff\1\11\4\uffff\1\12",
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
            return "870:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) );";
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008004000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000010681FF000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180400010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000614000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010001000000L});

}