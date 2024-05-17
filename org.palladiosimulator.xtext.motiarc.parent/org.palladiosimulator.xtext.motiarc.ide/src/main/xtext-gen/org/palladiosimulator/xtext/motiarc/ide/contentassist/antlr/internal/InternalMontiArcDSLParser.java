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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_SYNC", "RULE_STRING", "RULE_DOTSTAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'initial'", "'final'", "'>'", "'<'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'->'", "'port'", "'<<'", "'assume'", "'>>'", "'('", "')'", "'automaton'", "'state'", "'['", "']'", "'import'", "'package'", "'in'", "'out'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=5;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SYNC=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_DOTSTAR=8;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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


    // $ANTLR start "entryRuleComponentType"
    // InternalMontiArcDSL.g:153:1: entryRuleComponentType : ruleComponentType EOF ;
    public final void entryRuleComponentType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:154:1: ( ruleComponentType EOF )
            // InternalMontiArcDSL.g:155:1: ruleComponentType EOF
            {
             before(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentType();

            state._fsp--;

             after(grammarAccess.getComponentTypeRule()); 
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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalMontiArcDSL.g:162:1: ruleComponentType : ( ( rule__ComponentType__TypeAssignment ) ) ;
    public final void ruleComponentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:166:2: ( ( ( rule__ComponentType__TypeAssignment ) ) )
            // InternalMontiArcDSL.g:167:2: ( ( rule__ComponentType__TypeAssignment ) )
            {
            // InternalMontiArcDSL.g:167:2: ( ( rule__ComponentType__TypeAssignment ) )
            // InternalMontiArcDSL.g:168:3: ( rule__ComponentType__TypeAssignment )
            {
             before(grammarAccess.getComponentTypeAccess().getTypeAssignment()); 
            // InternalMontiArcDSL.g:169:3: ( rule__ComponentType__TypeAssignment )
            // InternalMontiArcDSL.g:169:4: rule__ComponentType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComponentType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComponentTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRuleParameter"
    // InternalMontiArcDSL.g:178:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:179:1: ( ruleParameter EOF )
            // InternalMontiArcDSL.g:180:1: ruleParameter EOF
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
    // InternalMontiArcDSL.g:187:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:191:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMontiArcDSL.g:192:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMontiArcDSL.g:192:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMontiArcDSL.g:193:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMontiArcDSL.g:194:3: ( rule__Parameter__Group__0 )
            // InternalMontiArcDSL.g:194:4: rule__Parameter__Group__0
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
    // InternalMontiArcDSL.g:203:1: entryRuleArcElement : ruleArcElement EOF ;
    public final void entryRuleArcElement() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:204:1: ( ruleArcElement EOF )
            // InternalMontiArcDSL.g:205:1: ruleArcElement EOF
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
    // InternalMontiArcDSL.g:212:1: ruleArcElement : ( ( rule__ArcElement__Alternatives ) ) ;
    public final void ruleArcElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:216:2: ( ( ( rule__ArcElement__Alternatives ) ) )
            // InternalMontiArcDSL.g:217:2: ( ( rule__ArcElement__Alternatives ) )
            {
            // InternalMontiArcDSL.g:217:2: ( ( rule__ArcElement__Alternatives ) )
            // InternalMontiArcDSL.g:218:3: ( rule__ArcElement__Alternatives )
            {
             before(grammarAccess.getArcElementAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:219:3: ( rule__ArcElement__Alternatives )
            // InternalMontiArcDSL.g:219:4: rule__ArcElement__Alternatives
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
    // InternalMontiArcDSL.g:228:1: entryRuleSubComponent : ruleSubComponent EOF ;
    public final void entryRuleSubComponent() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:229:1: ( ruleSubComponent EOF )
            // InternalMontiArcDSL.g:230:1: ruleSubComponent EOF
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
    // InternalMontiArcDSL.g:237:1: ruleSubComponent : ( ( rule__SubComponent__Group__0 ) ) ;
    public final void ruleSubComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:241:2: ( ( ( rule__SubComponent__Group__0 ) ) )
            // InternalMontiArcDSL.g:242:2: ( ( rule__SubComponent__Group__0 ) )
            {
            // InternalMontiArcDSL.g:242:2: ( ( rule__SubComponent__Group__0 ) )
            // InternalMontiArcDSL.g:243:3: ( rule__SubComponent__Group__0 )
            {
             before(grammarAccess.getSubComponentAccess().getGroup()); 
            // InternalMontiArcDSL.g:244:3: ( rule__SubComponent__Group__0 )
            // InternalMontiArcDSL.g:244:4: rule__SubComponent__Group__0
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
    // InternalMontiArcDSL.g:253:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:254:1: ( ruleConnector EOF )
            // InternalMontiArcDSL.g:255:1: ruleConnector EOF
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
    // InternalMontiArcDSL.g:262:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:266:2: ( ( ( rule__Connector__Group__0 ) ) )
            // InternalMontiArcDSL.g:267:2: ( ( rule__Connector__Group__0 ) )
            {
            // InternalMontiArcDSL.g:267:2: ( ( rule__Connector__Group__0 ) )
            // InternalMontiArcDSL.g:268:3: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // InternalMontiArcDSL.g:269:3: ( rule__Connector__Group__0 )
            // InternalMontiArcDSL.g:269:4: rule__Connector__Group__0
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
    // InternalMontiArcDSL.g:278:1: entryRulePorts : rulePorts EOF ;
    public final void entryRulePorts() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:279:1: ( rulePorts EOF )
            // InternalMontiArcDSL.g:280:1: rulePorts EOF
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
    // InternalMontiArcDSL.g:287:1: rulePorts : ( ( rule__Ports__Group__0 ) ) ;
    public final void rulePorts() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:291:2: ( ( ( rule__Ports__Group__0 ) ) )
            // InternalMontiArcDSL.g:292:2: ( ( rule__Ports__Group__0 ) )
            {
            // InternalMontiArcDSL.g:292:2: ( ( rule__Ports__Group__0 ) )
            // InternalMontiArcDSL.g:293:3: ( rule__Ports__Group__0 )
            {
             before(grammarAccess.getPortsAccess().getGroup()); 
            // InternalMontiArcDSL.g:294:3: ( rule__Ports__Group__0 )
            // InternalMontiArcDSL.g:294:4: rule__Ports__Group__0
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
    // InternalMontiArcDSL.g:303:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:304:1: ( rulePort EOF )
            // InternalMontiArcDSL.g:305:1: rulePort EOF
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
    // InternalMontiArcDSL.g:312:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:316:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalMontiArcDSL.g:317:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalMontiArcDSL.g:317:2: ( ( rule__Port__Group__0 ) )
            // InternalMontiArcDSL.g:318:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalMontiArcDSL.g:319:3: ( rule__Port__Group__0 )
            // InternalMontiArcDSL.g:319:4: rule__Port__Group__0
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


    // $ANTLR start "entryRuleAssume"
    // InternalMontiArcDSL.g:328:1: entryRuleAssume : ruleAssume EOF ;
    public final void entryRuleAssume() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:329:1: ( ruleAssume EOF )
            // InternalMontiArcDSL.g:330:1: ruleAssume EOF
            {
             before(grammarAccess.getAssumeRule()); 
            pushFollow(FOLLOW_1);
            ruleAssume();

            state._fsp--;

             after(grammarAccess.getAssumeRule()); 
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
    // $ANTLR end "entryRuleAssume"


    // $ANTLR start "ruleAssume"
    // InternalMontiArcDSL.g:337:1: ruleAssume : ( ( rule__Assume__Group__0 ) ) ;
    public final void ruleAssume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:341:2: ( ( ( rule__Assume__Group__0 ) ) )
            // InternalMontiArcDSL.g:342:2: ( ( rule__Assume__Group__0 ) )
            {
            // InternalMontiArcDSL.g:342:2: ( ( rule__Assume__Group__0 ) )
            // InternalMontiArcDSL.g:343:3: ( rule__Assume__Group__0 )
            {
             before(grammarAccess.getAssumeAccess().getGroup()); 
            // InternalMontiArcDSL.g:344:3: ( rule__Assume__Group__0 )
            // InternalMontiArcDSL.g:344:4: rule__Assume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssumeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssume"


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcDSL.g:353:1: entryRuleNames : ruleNames EOF ;
    public final void entryRuleNames() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:354:1: ( ruleNames EOF )
            // InternalMontiArcDSL.g:355:1: ruleNames EOF
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
    // InternalMontiArcDSL.g:362:1: ruleNames : ( ( rule__Names__Group__0 ) ) ;
    public final void ruleNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:366:2: ( ( ( rule__Names__Group__0 ) ) )
            // InternalMontiArcDSL.g:367:2: ( ( rule__Names__Group__0 ) )
            {
            // InternalMontiArcDSL.g:367:2: ( ( rule__Names__Group__0 ) )
            // InternalMontiArcDSL.g:368:3: ( rule__Names__Group__0 )
            {
             before(grammarAccess.getNamesAccess().getGroup()); 
            // InternalMontiArcDSL.g:369:3: ( rule__Names__Group__0 )
            // InternalMontiArcDSL.g:369:4: rule__Names__Group__0
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
    // InternalMontiArcDSL.g:378:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:379:1: ( ruleVariable EOF )
            // InternalMontiArcDSL.g:380:1: ruleVariable EOF
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
    // InternalMontiArcDSL.g:387:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:391:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMontiArcDSL.g:392:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMontiArcDSL.g:392:2: ( ( rule__Variable__Group__0 ) )
            // InternalMontiArcDSL.g:393:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMontiArcDSL.g:394:3: ( rule__Variable__Group__0 )
            // InternalMontiArcDSL.g:394:4: rule__Variable__Group__0
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
    // InternalMontiArcDSL.g:403:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:404:1: ( ruleAutomaton EOF )
            // InternalMontiArcDSL.g:405:1: ruleAutomaton EOF
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
    // InternalMontiArcDSL.g:412:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:416:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // InternalMontiArcDSL.g:417:2: ( ( rule__Automaton__Group__0 ) )
            {
            // InternalMontiArcDSL.g:417:2: ( ( rule__Automaton__Group__0 ) )
            // InternalMontiArcDSL.g:418:3: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // InternalMontiArcDSL.g:419:3: ( rule__Automaton__Group__0 )
            // InternalMontiArcDSL.g:419:4: rule__Automaton__Group__0
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
    // InternalMontiArcDSL.g:428:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:429:1: ( ruleState EOF )
            // InternalMontiArcDSL.g:430:1: ruleState EOF
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
    // InternalMontiArcDSL.g:437:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:441:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalMontiArcDSL.g:442:2: ( ( rule__State__Alternatives ) )
            {
            // InternalMontiArcDSL.g:442:2: ( ( rule__State__Alternatives ) )
            // InternalMontiArcDSL.g:443:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:444:3: ( rule__State__Alternatives )
            // InternalMontiArcDSL.g:444:4: rule__State__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSCState"
    // InternalMontiArcDSL.g:453:1: entryRuleSCState : ruleSCState EOF ;
    public final void entryRuleSCState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:454:1: ( ruleSCState EOF )
            // InternalMontiArcDSL.g:455:1: ruleSCState EOF
            {
             before(grammarAccess.getSCStateRule()); 
            pushFollow(FOLLOW_1);
            ruleSCState();

            state._fsp--;

             after(grammarAccess.getSCStateRule()); 
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
    // $ANTLR end "entryRuleSCState"


    // $ANTLR start "ruleSCState"
    // InternalMontiArcDSL.g:462:1: ruleSCState : ( ( rule__SCState__Group__0 ) ) ;
    public final void ruleSCState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:466:2: ( ( ( rule__SCState__Group__0 ) ) )
            // InternalMontiArcDSL.g:467:2: ( ( rule__SCState__Group__0 ) )
            {
            // InternalMontiArcDSL.g:467:2: ( ( rule__SCState__Group__0 ) )
            // InternalMontiArcDSL.g:468:3: ( rule__SCState__Group__0 )
            {
             before(grammarAccess.getSCStateAccess().getGroup()); 
            // InternalMontiArcDSL.g:469:3: ( rule__SCState__Group__0 )
            // InternalMontiArcDSL.g:469:4: rule__SCState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSCState"


    // $ANTLR start "entryRuleInvState"
    // InternalMontiArcDSL.g:478:1: entryRuleInvState : ruleInvState EOF ;
    public final void entryRuleInvState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:479:1: ( ruleInvState EOF )
            // InternalMontiArcDSL.g:480:1: ruleInvState EOF
            {
             before(grammarAccess.getInvStateRule()); 
            pushFollow(FOLLOW_1);
            ruleInvState();

            state._fsp--;

             after(grammarAccess.getInvStateRule()); 
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
    // $ANTLR end "entryRuleInvState"


    // $ANTLR start "ruleInvState"
    // InternalMontiArcDSL.g:487:1: ruleInvState : ( ( rule__InvState__Group__0 ) ) ;
    public final void ruleInvState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:491:2: ( ( ( rule__InvState__Group__0 ) ) )
            // InternalMontiArcDSL.g:492:2: ( ( rule__InvState__Group__0 ) )
            {
            // InternalMontiArcDSL.g:492:2: ( ( rule__InvState__Group__0 ) )
            // InternalMontiArcDSL.g:493:3: ( rule__InvState__Group__0 )
            {
             before(grammarAccess.getInvStateAccess().getGroup()); 
            // InternalMontiArcDSL.g:494:3: ( rule__InvState__Group__0 )
            // InternalMontiArcDSL.g:494:4: rule__InvState__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InvState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInvStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInvState"


    // $ANTLR start "entryRuleSCSAnte"
    // InternalMontiArcDSL.g:503:1: entryRuleSCSAnte : ruleSCSAnte EOF ;
    public final void entryRuleSCSAnte() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:504:1: ( ruleSCSAnte EOF )
            // InternalMontiArcDSL.g:505:1: ruleSCSAnte EOF
            {
             before(grammarAccess.getSCSAnteRule()); 
            pushFollow(FOLLOW_1);
            ruleSCSAnte();

            state._fsp--;

             after(grammarAccess.getSCSAnteRule()); 
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
    // $ANTLR end "entryRuleSCSAnte"


    // $ANTLR start "ruleSCSAnte"
    // InternalMontiArcDSL.g:512:1: ruleSCSAnte : ( ( rule__SCSAnte__Group__0 ) ) ;
    public final void ruleSCSAnte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:516:2: ( ( ( rule__SCSAnte__Group__0 ) ) )
            // InternalMontiArcDSL.g:517:2: ( ( rule__SCSAnte__Group__0 ) )
            {
            // InternalMontiArcDSL.g:517:2: ( ( rule__SCSAnte__Group__0 ) )
            // InternalMontiArcDSL.g:518:3: ( rule__SCSAnte__Group__0 )
            {
             before(grammarAccess.getSCSAnteAccess().getGroup()); 
            // InternalMontiArcDSL.g:519:3: ( rule__SCSAnte__Group__0 )
            // InternalMontiArcDSL.g:519:4: rule__SCSAnte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCSAnte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCSAnteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSCSAnte"


    // $ANTLR start "entryRuleTransition"
    // InternalMontiArcDSL.g:528:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:529:1: ( ruleTransition EOF )
            // InternalMontiArcDSL.g:530:1: ruleTransition EOF
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
    // InternalMontiArcDSL.g:537:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:541:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMontiArcDSL.g:542:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMontiArcDSL.g:542:2: ( ( rule__Transition__Group__0 ) )
            // InternalMontiArcDSL.g:543:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMontiArcDSL.g:544:3: ( rule__Transition__Group__0 )
            // InternalMontiArcDSL.g:544:4: rule__Transition__Group__0
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
    // InternalMontiArcDSL.g:553:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:554:1: ( ruleBlock EOF )
            // InternalMontiArcDSL.g:555:1: ruleBlock EOF
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
    // InternalMontiArcDSL.g:562:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:566:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMontiArcDSL.g:567:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMontiArcDSL.g:567:2: ( ( rule__Block__Group__0 ) )
            // InternalMontiArcDSL.g:568:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalMontiArcDSL.g:569:3: ( rule__Block__Group__0 )
            // InternalMontiArcDSL.g:569:4: rule__Block__Group__0
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


    // $ANTLR start "entryRuleBlockStatement"
    // InternalMontiArcDSL.g:578:1: entryRuleBlockStatement : ruleBlockStatement EOF ;
    public final void entryRuleBlockStatement() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:579:1: ( ruleBlockStatement EOF )
            // InternalMontiArcDSL.g:580:1: ruleBlockStatement EOF
            {
             before(grammarAccess.getBlockStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockStatement();

            state._fsp--;

             after(grammarAccess.getBlockStatementRule()); 
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
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // InternalMontiArcDSL.g:587:1: ruleBlockStatement : ( ( rule__BlockStatement__Alternatives ) ) ;
    public final void ruleBlockStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:591:2: ( ( ( rule__BlockStatement__Alternatives ) ) )
            // InternalMontiArcDSL.g:592:2: ( ( rule__BlockStatement__Alternatives ) )
            {
            // InternalMontiArcDSL.g:592:2: ( ( rule__BlockStatement__Alternatives ) )
            // InternalMontiArcDSL.g:593:3: ( rule__BlockStatement__Alternatives )
            {
             before(grammarAccess.getBlockStatementAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:594:3: ( rule__BlockStatement__Alternatives )
            // InternalMontiArcDSL.g:594:4: rule__BlockStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BlockStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalMontiArcDSL.g:603:1: entryRuleSimpleExpression : ruleSimpleExpression EOF ;
    public final void entryRuleSimpleExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:604:1: ( ruleSimpleExpression EOF )
            // InternalMontiArcDSL.g:605:1: ruleSimpleExpression EOF
            {
             before(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionRule()); 
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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalMontiArcDSL.g:612:1: ruleSimpleExpression : ( ( rule__SimpleExpression__Group__0 ) ) ;
    public final void ruleSimpleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:616:2: ( ( ( rule__SimpleExpression__Group__0 ) ) )
            // InternalMontiArcDSL.g:617:2: ( ( rule__SimpleExpression__Group__0 ) )
            {
            // InternalMontiArcDSL.g:617:2: ( ( rule__SimpleExpression__Group__0 ) )
            // InternalMontiArcDSL.g:618:3: ( rule__SimpleExpression__Group__0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getGroup()); 
            // InternalMontiArcDSL.g:619:3: ( rule__SimpleExpression__Group__0 )
            // InternalMontiArcDSL.g:619:4: rule__SimpleExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleSimpleInit"
    // InternalMontiArcDSL.g:628:1: entryRuleSimpleInit : ruleSimpleInit EOF ;
    public final void entryRuleSimpleInit() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:629:1: ( ruleSimpleInit EOF )
            // InternalMontiArcDSL.g:630:1: ruleSimpleInit EOF
            {
             before(grammarAccess.getSimpleInitRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleInit();

            state._fsp--;

             after(grammarAccess.getSimpleInitRule()); 
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
    // $ANTLR end "entryRuleSimpleInit"


    // $ANTLR start "ruleSimpleInit"
    // InternalMontiArcDSL.g:637:1: ruleSimpleInit : ( ( rule__SimpleInit__Group__0 ) ) ;
    public final void ruleSimpleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:641:2: ( ( ( rule__SimpleInit__Group__0 ) ) )
            // InternalMontiArcDSL.g:642:2: ( ( rule__SimpleInit__Group__0 ) )
            {
            // InternalMontiArcDSL.g:642:2: ( ( rule__SimpleInit__Group__0 ) )
            // InternalMontiArcDSL.g:643:3: ( rule__SimpleInit__Group__0 )
            {
             before(grammarAccess.getSimpleInitAccess().getGroup()); 
            // InternalMontiArcDSL.g:644:3: ( rule__SimpleInit__Group__0 )
            // InternalMontiArcDSL.g:644:4: rule__SimpleInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleInitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleInit"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiArcDSL.g:653:1: entryRuleImportStatements : ruleImportStatements EOF ;
    public final void entryRuleImportStatements() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:654:1: ( ruleImportStatements EOF )
            // InternalMontiArcDSL.g:655:1: ruleImportStatements EOF
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
    // InternalMontiArcDSL.g:662:1: ruleImportStatements : ( ( rule__ImportStatements__Group__0 ) ) ;
    public final void ruleImportStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:666:2: ( ( ( rule__ImportStatements__Group__0 ) ) )
            // InternalMontiArcDSL.g:667:2: ( ( rule__ImportStatements__Group__0 ) )
            {
            // InternalMontiArcDSL.g:667:2: ( ( rule__ImportStatements__Group__0 ) )
            // InternalMontiArcDSL.g:668:3: ( rule__ImportStatements__Group__0 )
            {
             before(grammarAccess.getImportStatementsAccess().getGroup()); 
            // InternalMontiArcDSL.g:669:3: ( rule__ImportStatements__Group__0 )
            // InternalMontiArcDSL.g:669:4: rule__ImportStatements__Group__0
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
    // InternalMontiArcDSL.g:678:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:679:1: ( rulePackage EOF )
            // InternalMontiArcDSL.g:680:1: rulePackage EOF
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
    // InternalMontiArcDSL.g:687:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:691:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalMontiArcDSL.g:692:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalMontiArcDSL.g:692:2: ( ( rule__Package__Group__0 ) )
            // InternalMontiArcDSL.g:693:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalMontiArcDSL.g:694:3: ( rule__Package__Group__0 )
            // InternalMontiArcDSL.g:694:4: rule__Package__Group__0
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
    // InternalMontiArcDSL.g:703:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:704:1: ( ruleType EOF )
            // InternalMontiArcDSL.g:705:1: ruleType EOF
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
    // InternalMontiArcDSL.g:712:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:716:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMontiArcDSL.g:717:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMontiArcDSL.g:717:2: ( ( rule__Type__Alternatives ) )
            // InternalMontiArcDSL.g:718:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:719:3: ( rule__Type__Alternatives )
            // InternalMontiArcDSL.g:719:4: rule__Type__Alternatives
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
    // InternalMontiArcDSL.g:728:1: entryRuleMCPrimitiveType : ruleMCPrimitiveType EOF ;
    public final void entryRuleMCPrimitiveType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:729:1: ( ruleMCPrimitiveType EOF )
            // InternalMontiArcDSL.g:730:1: ruleMCPrimitiveType EOF
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
    // InternalMontiArcDSL.g:737:1: ruleMCPrimitiveType : ( ( rule__MCPrimitiveType__TypeAssignment ) ) ;
    public final void ruleMCPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:741:2: ( ( ( rule__MCPrimitiveType__TypeAssignment ) ) )
            // InternalMontiArcDSL.g:742:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            {
            // InternalMontiArcDSL.g:742:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            // InternalMontiArcDSL.g:743:3: ( rule__MCPrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalMontiArcDSL.g:744:3: ( rule__MCPrimitiveType__TypeAssignment )
            // InternalMontiArcDSL.g:744:4: rule__MCPrimitiveType__TypeAssignment
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


    // $ANTLR start "entryRuleMCObjectType"
    // InternalMontiArcDSL.g:753:1: entryRuleMCObjectType : ruleMCObjectType EOF ;
    public final void entryRuleMCObjectType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:754:1: ( ruleMCObjectType EOF )
            // InternalMontiArcDSL.g:755:1: ruleMCObjectType EOF
            {
             before(grammarAccess.getMCObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMCObjectType();

            state._fsp--;

             after(grammarAccess.getMCObjectTypeRule()); 
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
    // $ANTLR end "entryRuleMCObjectType"


    // $ANTLR start "ruleMCObjectType"
    // InternalMontiArcDSL.g:762:1: ruleMCObjectType : ( ( rule__MCObjectType__TypeAssignment ) ) ;
    public final void ruleMCObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:766:2: ( ( ( rule__MCObjectType__TypeAssignment ) ) )
            // InternalMontiArcDSL.g:767:2: ( ( rule__MCObjectType__TypeAssignment ) )
            {
            // InternalMontiArcDSL.g:767:2: ( ( rule__MCObjectType__TypeAssignment ) )
            // InternalMontiArcDSL.g:768:3: ( rule__MCObjectType__TypeAssignment )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 
            // InternalMontiArcDSL.g:769:3: ( rule__MCObjectType__TypeAssignment )
            // InternalMontiArcDSL.g:769:4: rule__MCObjectType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MCObjectType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMCObjectType"


    // $ANTLR start "entryRuleMCCollectionType"
    // InternalMontiArcDSL.g:778:1: entryRuleMCCollectionType : ruleMCCollectionType EOF ;
    public final void entryRuleMCCollectionType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:779:1: ( ruleMCCollectionType EOF )
            // InternalMontiArcDSL.g:780:1: ruleMCCollectionType EOF
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
    // InternalMontiArcDSL.g:787:1: ruleMCCollectionType : ( ( rule__MCCollectionType__Group__0 ) ) ;
    public final void ruleMCCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:791:2: ( ( ( rule__MCCollectionType__Group__0 ) ) )
            // InternalMontiArcDSL.g:792:2: ( ( rule__MCCollectionType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:792:2: ( ( rule__MCCollectionType__Group__0 ) )
            // InternalMontiArcDSL.g:793:3: ( rule__MCCollectionType__Group__0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:794:3: ( rule__MCCollectionType__Group__0 )
            // InternalMontiArcDSL.g:794:4: rule__MCCollectionType__Group__0
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
    // InternalMontiArcDSL.g:803:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:804:1: ( ruleMCArrayType EOF )
            // InternalMontiArcDSL.g:805:1: ruleMCArrayType EOF
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
    // InternalMontiArcDSL.g:812:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:816:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMontiArcDSL.g:817:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:817:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMontiArcDSL.g:818:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:819:3: ( rule__MCArrayType__Group__0 )
            // InternalMontiArcDSL.g:819:4: rule__MCArrayType__Group__0
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
    // InternalMontiArcDSL.g:828:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:829:1: ( ruleExpression EOF )
            // InternalMontiArcDSL.g:830:1: ruleExpression EOF
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
    // InternalMontiArcDSL.g:837:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:841:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMontiArcDSL.g:842:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:842:2: ( ( rule__Expression__Alternatives ) )
            // InternalMontiArcDSL.g:843:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:844:3: ( rule__Expression__Alternatives )
            // InternalMontiArcDSL.g:844:4: rule__Expression__Alternatives
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
    // InternalMontiArcDSL.g:853:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:854:1: ( ruleLiteralExpression EOF )
            // InternalMontiArcDSL.g:855:1: ruleLiteralExpression EOF
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
    // InternalMontiArcDSL.g:862:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:866:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMontiArcDSL.g:867:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:867:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMontiArcDSL.g:868:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:869:3: ( rule__LiteralExpression__Alternatives )
            // InternalMontiArcDSL.g:869:4: rule__LiteralExpression__Alternatives
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
    // InternalMontiArcDSL.g:878:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:879:1: ( ruleNumberLiteral EOF )
            // InternalMontiArcDSL.g:880:1: ruleNumberLiteral EOF
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
    // InternalMontiArcDSL.g:887:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:891:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:892:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:892:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:893:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:894:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:894:4: rule__NumberLiteral__LiteralAssignment
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
    // InternalMontiArcDSL.g:903:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:904:1: ( ruleStringLiteral EOF )
            // InternalMontiArcDSL.g:905:1: ruleStringLiteral EOF
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
    // InternalMontiArcDSL.g:912:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:916:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:917:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:917:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:918:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:919:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:919:4: rule__StringLiteral__LiteralAssignment
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
    // InternalMontiArcDSL.g:928:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:929:1: ( ruleNameExpression EOF )
            // InternalMontiArcDSL.g:930:1: ruleNameExpression EOF
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
    // InternalMontiArcDSL.g:937:1: ruleNameExpression : ( ( rule__NameExpression__Alternatives ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:941:2: ( ( ( rule__NameExpression__Alternatives ) ) )
            // InternalMontiArcDSL.g:942:2: ( ( rule__NameExpression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:942:2: ( ( rule__NameExpression__Alternatives ) )
            // InternalMontiArcDSL.g:943:3: ( rule__NameExpression__Alternatives )
            {
             before(grammarAccess.getNameExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:944:3: ( rule__NameExpression__Alternatives )
            // InternalMontiArcDSL.g:944:4: rule__NameExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NameExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMontiArcDSL.g:953:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:954:1: ( ruleBinaryExpression EOF )
            // InternalMontiArcDSL.g:955:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMontiArcDSL.g:962:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:966:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMontiArcDSL.g:967:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMontiArcDSL.g:967:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMontiArcDSL.g:968:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMontiArcDSL.g:969:3: ( rule__BinaryExpression__Group__0 )
            // InternalMontiArcDSL.g:969:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcDSL.g:978:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:979:1: ( ruleArguments EOF )
            // InternalMontiArcDSL.g:980:1: ruleArguments EOF
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
    // InternalMontiArcDSL.g:987:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:991:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalMontiArcDSL.g:992:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalMontiArcDSL.g:992:2: ( ( rule__Arguments__Group__0 ) )
            // InternalMontiArcDSL.g:993:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalMontiArcDSL.g:994:3: ( rule__Arguments__Group__0 )
            // InternalMontiArcDSL.g:994:4: rule__Arguments__Group__0
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
    // InternalMontiArcDSL.g:1003:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:1004:1: ( ruleArgument EOF )
            // InternalMontiArcDSL.g:1005:1: ruleArgument EOF
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
    // InternalMontiArcDSL.g:1012:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1016:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMontiArcDSL.g:1017:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMontiArcDSL.g:1017:2: ( ( rule__Argument__Group__0 ) )
            // InternalMontiArcDSL.g:1018:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMontiArcDSL.g:1019:3: ( rule__Argument__Group__0 )
            // InternalMontiArcDSL.g:1019:4: rule__Argument__Group__0
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


    // $ANTLR start "ruleSCModifier"
    // InternalMontiArcDSL.g:1028:1: ruleSCModifier : ( ( rule__SCModifier__Alternatives ) ) ;
    public final void ruleSCModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1032:1: ( ( ( rule__SCModifier__Alternatives ) ) )
            // InternalMontiArcDSL.g:1033:2: ( ( rule__SCModifier__Alternatives ) )
            {
            // InternalMontiArcDSL.g:1033:2: ( ( rule__SCModifier__Alternatives ) )
            // InternalMontiArcDSL.g:1034:3: ( rule__SCModifier__Alternatives )
            {
             before(grammarAccess.getSCModifierAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:1035:3: ( rule__SCModifier__Alternatives )
            // InternalMontiArcDSL.g:1035:4: rule__SCModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SCModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSCModifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSCModifier"


    // $ANTLR start "ruleOperator"
    // InternalMontiArcDSL.g:1044:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1048:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMontiArcDSL.g:1049:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMontiArcDSL.g:1049:2: ( ( rule__Operator__Alternatives ) )
            // InternalMontiArcDSL.g:1050:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:1051:3: ( rule__Operator__Alternatives )
            // InternalMontiArcDSL.g:1051:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__ArcElement__Alternatives"
    // InternalMontiArcDSL.g:1059:1: rule__ArcElement__Alternatives : ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) );
    public final void rule__ArcElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1063:1: ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=14 && LA1_1<=32)) ) {
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
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==50) ) {
                    alt1=3;
                }
                else if ( ((LA1_2>=RULE_ID && LA1_2<=RULE_MCQUALIFIEDNAME)||LA1_2==49||LA1_2==55) ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                alt1=3;
                }
                break;
            case 51:
                {
                alt1=4;
                }
                break;
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
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt1=5;
                }
                break;
            case RULE_SYNC:
            case 57:
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
                    // InternalMontiArcDSL.g:1064:2: ( ruleComponent )
                    {
                    // InternalMontiArcDSL.g:1064:2: ( ruleComponent )
                    // InternalMontiArcDSL.g:1065:3: ruleComponent
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
                    // InternalMontiArcDSL.g:1070:2: ( ruleSubComponent )
                    {
                    // InternalMontiArcDSL.g:1070:2: ( ruleSubComponent )
                    // InternalMontiArcDSL.g:1071:3: ruleSubComponent
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
                    // InternalMontiArcDSL.g:1076:2: ( ruleConnector )
                    {
                    // InternalMontiArcDSL.g:1076:2: ( ruleConnector )
                    // InternalMontiArcDSL.g:1077:3: ruleConnector
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
                    // InternalMontiArcDSL.g:1082:2: ( rulePorts )
                    {
                    // InternalMontiArcDSL.g:1082:2: ( rulePorts )
                    // InternalMontiArcDSL.g:1083:3: rulePorts
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
                    // InternalMontiArcDSL.g:1088:2: ( ruleVariable )
                    {
                    // InternalMontiArcDSL.g:1088:2: ( ruleVariable )
                    // InternalMontiArcDSL.g:1089:3: ruleVariable
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
                    // InternalMontiArcDSL.g:1094:2: ( ruleAutomaton )
                    {
                    // InternalMontiArcDSL.g:1094:2: ( ruleAutomaton )
                    // InternalMontiArcDSL.g:1095:3: ruleAutomaton
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


    // $ANTLR start "rule__Connector__SourceAlternatives_0_0"
    // InternalMontiArcDSL.g:1104:1: rule__Connector__SourceAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Connector__SourceAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1108:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MCQUALIFIEDNAME) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiArcDSL.g:1109:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1109:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1110:3: RULE_ID
                    {
                     before(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1115:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1115:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1116:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getConnectorAccess().getSourceMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getSourceMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Connector__SourceAlternatives_0_0"


    // $ANTLR start "rule__Port__Alternatives_2"
    // InternalMontiArcDSL.g:1125:1: rule__Port__Alternatives_2 : ( ( ( rule__Port__InAssignment_2_0 ) ) | ( ( rule__Port__OutAssignment_2_1 ) ) );
    public final void rule__Port__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1129:1: ( ( ( rule__Port__InAssignment_2_0 ) ) | ( ( rule__Port__OutAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==63) ) {
                alt3=1;
            }
            else if ( (LA3_0==64) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMontiArcDSL.g:1130:2: ( ( rule__Port__InAssignment_2_0 ) )
                    {
                    // InternalMontiArcDSL.g:1130:2: ( ( rule__Port__InAssignment_2_0 ) )
                    // InternalMontiArcDSL.g:1131:3: ( rule__Port__InAssignment_2_0 )
                    {
                     before(grammarAccess.getPortAccess().getInAssignment_2_0()); 
                    // InternalMontiArcDSL.g:1132:3: ( rule__Port__InAssignment_2_0 )
                    // InternalMontiArcDSL.g:1132:4: rule__Port__InAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__InAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getInAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1136:2: ( ( rule__Port__OutAssignment_2_1 ) )
                    {
                    // InternalMontiArcDSL.g:1136:2: ( ( rule__Port__OutAssignment_2_1 ) )
                    // InternalMontiArcDSL.g:1137:3: ( rule__Port__OutAssignment_2_1 )
                    {
                     before(grammarAccess.getPortAccess().getOutAssignment_2_1()); 
                    // InternalMontiArcDSL.g:1138:3: ( rule__Port__OutAssignment_2_1 )
                    // InternalMontiArcDSL.g:1138:4: rule__Port__OutAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__OutAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getOutAssignment_2_1()); 

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
    // $ANTLR end "rule__Port__Alternatives_2"


    // $ANTLR start "rule__Port__Alternatives_3"
    // InternalMontiArcDSL.g:1146:1: rule__Port__Alternatives_3 : ( ( ( rule__Port__TypeAssignment_3_0 ) ) | ( ( rule__Port__DatatypeAssignment_3_1 ) ) );
    public final void rule__Port__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1150:1: ( ( ( rule__Port__TypeAssignment_3_0 ) ) | ( ( rule__Port__DatatypeAssignment_3_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=32)) ) {
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
                    // InternalMontiArcDSL.g:1151:2: ( ( rule__Port__TypeAssignment_3_0 ) )
                    {
                    // InternalMontiArcDSL.g:1151:2: ( ( rule__Port__TypeAssignment_3_0 ) )
                    // InternalMontiArcDSL.g:1152:3: ( rule__Port__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getPortAccess().getTypeAssignment_3_0()); 
                    // InternalMontiArcDSL.g:1153:3: ( rule__Port__TypeAssignment_3_0 )
                    // InternalMontiArcDSL.g:1153:4: rule__Port__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1157:2: ( ( rule__Port__DatatypeAssignment_3_1 ) )
                    {
                    // InternalMontiArcDSL.g:1157:2: ( ( rule__Port__DatatypeAssignment_3_1 ) )
                    // InternalMontiArcDSL.g:1158:3: ( rule__Port__DatatypeAssignment_3_1 )
                    {
                     before(grammarAccess.getPortAccess().getDatatypeAssignment_3_1()); 
                    // InternalMontiArcDSL.g:1159:3: ( rule__Port__DatatypeAssignment_3_1 )
                    // InternalMontiArcDSL.g:1159:4: rule__Port__DatatypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__DatatypeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getDatatypeAssignment_3_1()); 

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
    // $ANTLR end "rule__Port__Alternatives_3"


    // $ANTLR start "rule__Names__NamesAlternatives_0_0"
    // InternalMontiArcDSL.g:1167:1: rule__Names__NamesAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Names__NamesAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1171:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_MCQUALIFIEDNAME) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMontiArcDSL.g:1172:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1172:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1173:3: RULE_ID
                    {
                     before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1178:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1178:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1179:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Names__NamesAlternatives_0_0"


    // $ANTLR start "rule__Names__NamesAlternatives_1_1_0"
    // InternalMontiArcDSL.g:1188:1: rule__Names__NamesAlternatives_1_1_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Names__NamesAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1192:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_MCQUALIFIEDNAME) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMontiArcDSL.g:1193:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1193:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1194:3: RULE_ID
                    {
                     before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1199:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1199:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1200:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_1_1_0_1()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__Names__NamesAlternatives_1_1_0"


    // $ANTLR start "rule__Variable__TypeAlternatives_0_0"
    // InternalMontiArcDSL.g:1209:1: rule__Variable__TypeAlternatives_0_0 : ( ( ruleType ) | ( ruleComponentType ) );
    public final void rule__Variable__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1213:1: ( ( ruleType ) | ( ruleComponentType ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=14 && LA7_0<=32)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMontiArcDSL.g:1214:2: ( ruleType )
                    {
                    // InternalMontiArcDSL.g:1214:2: ( ruleType )
                    // InternalMontiArcDSL.g:1215:3: ruleType
                    {
                     before(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1220:2: ( ruleComponentType )
                    {
                    // InternalMontiArcDSL.g:1220:2: ( ruleComponentType )
                    // InternalMontiArcDSL.g:1221:3: ruleComponentType
                    {
                     before(grammarAccess.getVariableAccess().getTypeComponentTypeParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentType();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getTypeComponentTypeParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Variable__TypeAlternatives_0_0"


    // $ANTLR start "rule__Automaton__Alternatives_5"
    // InternalMontiArcDSL.g:1230:1: rule__Automaton__Alternatives_5 : ( ( ( rule__Automaton__StatesAssignment_5_0 ) ) | ( ( rule__Automaton__TransitionsAssignment_5_1 ) ) );
    public final void rule__Automaton__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1234:1: ( ( ( rule__Automaton__StatesAssignment_5_0 ) ) | ( ( rule__Automaton__TransitionsAssignment_5_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=33 && LA8_0<=34)||LA8_0==44||LA8_0==58) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcDSL.g:1235:2: ( ( rule__Automaton__StatesAssignment_5_0 ) )
                    {
                    // InternalMontiArcDSL.g:1235:2: ( ( rule__Automaton__StatesAssignment_5_0 ) )
                    // InternalMontiArcDSL.g:1236:3: ( rule__Automaton__StatesAssignment_5_0 )
                    {
                     before(grammarAccess.getAutomatonAccess().getStatesAssignment_5_0()); 
                    // InternalMontiArcDSL.g:1237:3: ( rule__Automaton__StatesAssignment_5_0 )
                    // InternalMontiArcDSL.g:1237:4: rule__Automaton__StatesAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__StatesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getStatesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1241:2: ( ( rule__Automaton__TransitionsAssignment_5_1 ) )
                    {
                    // InternalMontiArcDSL.g:1241:2: ( ( rule__Automaton__TransitionsAssignment_5_1 ) )
                    // InternalMontiArcDSL.g:1242:3: ( rule__Automaton__TransitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getAutomatonAccess().getTransitionsAssignment_5_1()); 
                    // InternalMontiArcDSL.g:1243:3: ( rule__Automaton__TransitionsAssignment_5_1 )
                    // InternalMontiArcDSL.g:1243:4: rule__Automaton__TransitionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__TransitionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAutomatonAccess().getTransitionsAssignment_5_1()); 

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
    // $ANTLR end "rule__Automaton__Alternatives_5"


    // $ANTLR start "rule__State__Alternatives"
    // InternalMontiArcDSL.g:1251:1: rule__State__Alternatives : ( ( ruleSCState ) | ( ruleInvState ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1255:1: ( ( ruleSCState ) | ( ruleInvState ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMontiArcDSL.g:1256:2: ( ruleSCState )
                    {
                    // InternalMontiArcDSL.g:1256:2: ( ruleSCState )
                    // InternalMontiArcDSL.g:1257:3: ruleSCState
                    {
                     before(grammarAccess.getStateAccess().getSCStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSCState();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getSCStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1262:2: ( ruleInvState )
                    {
                    // InternalMontiArcDSL.g:1262:2: ( ruleInvState )
                    // InternalMontiArcDSL.g:1263:3: ruleInvState
                    {
                     before(grammarAccess.getStateAccess().getInvStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInvState();

                    state._fsp--;

                     after(grammarAccess.getStateAccess().getInvStateParserRuleCall_1()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__BlockStatement__Alternatives"
    // InternalMontiArcDSL.g:1272:1: rule__BlockStatement__Alternatives : ( ( ruleSimpleInit ) | ( ruleSimpleExpression ) );
    public final void rule__BlockStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1276:1: ( ( ruleSimpleInit ) | ( ruleSimpleExpression ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=35 && LA10_1<=42)||LA10_1==49) ) {
                    alt10=2;
                }
                else if ( (LA10_1==48) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_MCQUALIFIEDNAME||LA10_0==RULE_STRING||LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiArcDSL.g:1277:2: ( ruleSimpleInit )
                    {
                    // InternalMontiArcDSL.g:1277:2: ( ruleSimpleInit )
                    // InternalMontiArcDSL.g:1278:3: ruleSimpleInit
                    {
                     before(grammarAccess.getBlockStatementAccess().getSimpleInitParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleInit();

                    state._fsp--;

                     after(grammarAccess.getBlockStatementAccess().getSimpleInitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1283:2: ( ruleSimpleExpression )
                    {
                    // InternalMontiArcDSL.g:1283:2: ( ruleSimpleExpression )
                    // InternalMontiArcDSL.g:1284:3: ruleSimpleExpression
                    {
                     before(grammarAccess.getBlockStatementAccess().getSimpleExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleExpression();

                    state._fsp--;

                     after(grammarAccess.getBlockStatementAccess().getSimpleExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__BlockStatement__Alternatives"


    // $ANTLR start "rule__Package__NameAlternatives_1_0"
    // InternalMontiArcDSL.g:1293:1: rule__Package__NameAlternatives_1_0 : ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) );
    public final void rule__Package__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1297:1: ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_MCQUALIFIEDNAME) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcDSL.g:1298:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1298:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1299:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1304:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1304:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1305:3: RULE_ID
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
    // InternalMontiArcDSL.g:1314:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1318:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMontiArcDSL.g:1319:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiArcDSL.g:1319:2: ( ruleMCPrimitiveType )
                    // InternalMontiArcDSL.g:1320:3: ruleMCPrimitiveType
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
                    // InternalMontiArcDSL.g:1325:2: ( ruleMCArrayType )
                    {
                    // InternalMontiArcDSL.g:1325:2: ( ruleMCArrayType )
                    // InternalMontiArcDSL.g:1326:3: ruleMCArrayType
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
                    // InternalMontiArcDSL.g:1331:2: ( ruleMCObjectType )
                    {
                    // InternalMontiArcDSL.g:1331:2: ( ruleMCObjectType )
                    // InternalMontiArcDSL.g:1332:3: ruleMCObjectType
                    {
                     before(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMCObjectType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1337:2: ( ruleMCCollectionType )
                    {
                    // InternalMontiArcDSL.g:1337:2: ( ruleMCCollectionType )
                    // InternalMontiArcDSL.g:1338:3: ruleMCCollectionType
                    {
                     before(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMCCollectionType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3()); 

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
    // InternalMontiArcDSL.g:1347:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1351:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt13=1;
                }
                break;
            case 15:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
                }
                break;
            case 17:
                {
                alt13=4;
                }
                break;
            case 18:
                {
                alt13=5;
                }
                break;
            case 19:
                {
                alt13=6;
                }
                break;
            case 20:
                {
                alt13=7;
                }
                break;
            case 21:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMontiArcDSL.g:1352:2: ( 'boolean' )
                    {
                    // InternalMontiArcDSL.g:1352:2: ( 'boolean' )
                    // InternalMontiArcDSL.g:1353:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1358:2: ( 'byte' )
                    {
                    // InternalMontiArcDSL.g:1358:2: ( 'byte' )
                    // InternalMontiArcDSL.g:1359:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1364:2: ( 'short' )
                    {
                    // InternalMontiArcDSL.g:1364:2: ( 'short' )
                    // InternalMontiArcDSL.g:1365:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1370:2: ( 'int' )
                    {
                    // InternalMontiArcDSL.g:1370:2: ( 'int' )
                    // InternalMontiArcDSL.g:1371:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1376:2: ( 'long' )
                    {
                    // InternalMontiArcDSL.g:1376:2: ( 'long' )
                    // InternalMontiArcDSL.g:1377:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1382:2: ( 'char' )
                    {
                    // InternalMontiArcDSL.g:1382:2: ( 'char' )
                    // InternalMontiArcDSL.g:1383:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1388:2: ( 'float' )
                    {
                    // InternalMontiArcDSL.g:1388:2: ( 'float' )
                    // InternalMontiArcDSL.g:1389:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:1394:2: ( 'double' )
                    {
                    // InternalMontiArcDSL.g:1394:2: ( 'double' )
                    // InternalMontiArcDSL.g:1395:3: 'double'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 
                    match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__MCObjectType__TypeAlternatives_0"
    // InternalMontiArcDSL.g:1404:1: rule__MCObjectType__TypeAlternatives_0 : ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) );
    public final void rule__MCObjectType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1408:1: ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            case 25:
                {
                alt14=4;
                }
                break;
            case 26:
                {
                alt14=5;
                }
                break;
            case 27:
                {
                alt14=6;
                }
                break;
            case 28:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMontiArcDSL.g:1409:2: ( 'Boolean' )
                    {
                    // InternalMontiArcDSL.g:1409:2: ( 'Boolean' )
                    // InternalMontiArcDSL.g:1410:3: 'Boolean'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1415:2: ( 'Byte' )
                    {
                    // InternalMontiArcDSL.g:1415:2: ( 'Byte' )
                    // InternalMontiArcDSL.g:1416:3: 'Byte'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1421:2: ( 'Integer' )
                    {
                    // InternalMontiArcDSL.g:1421:2: ( 'Integer' )
                    // InternalMontiArcDSL.g:1422:3: 'Integer'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1427:2: ( 'Long' )
                    {
                    // InternalMontiArcDSL.g:1427:2: ( 'Long' )
                    // InternalMontiArcDSL.g:1428:3: 'Long'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1433:2: ( 'Char' )
                    {
                    // InternalMontiArcDSL.g:1433:2: ( 'Char' )
                    // InternalMontiArcDSL.g:1434:3: 'Char'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1439:2: ( 'Double' )
                    {
                    // InternalMontiArcDSL.g:1439:2: ( 'Double' )
                    // InternalMontiArcDSL.g:1440:3: 'Double'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1445:2: ( 'String' )
                    {
                    // InternalMontiArcDSL.g:1445:2: ( 'String' )
                    // InternalMontiArcDSL.g:1446:3: 'String'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); 

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
    // $ANTLR end "rule__MCObjectType__TypeAlternatives_0"


    // $ANTLR start "rule__MCCollectionType__CollectionAlternatives_0_0"
    // InternalMontiArcDSL.g:1455:1: rule__MCCollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) );
    public final void rule__MCCollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1459:1: ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMontiArcDSL.g:1460:2: ( 'Set' )
                    {
                    // InternalMontiArcDSL.g:1460:2: ( 'Set' )
                    // InternalMontiArcDSL.g:1461:3: 'Set'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1466:2: ( 'List' )
                    {
                    // InternalMontiArcDSL.g:1466:2: ( 'List' )
                    // InternalMontiArcDSL.g:1467:3: 'List'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1472:2: ( 'Map' )
                    {
                    // InternalMontiArcDSL.g:1472:2: ( 'Map' )
                    // InternalMontiArcDSL.g:1473:3: 'Map'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1478:2: ( 'Optional' )
                    {
                    // InternalMontiArcDSL.g:1478:2: ( 'Optional' )
                    // InternalMontiArcDSL.g:1479:3: 'Optional'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); 
                    match(input,32,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1488:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1492:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=35 && LA16_1<=42)) ) {
                    alt16=3;
                }
                else if ( (LA16_1==EOF||LA16_1==44||(LA16_1>=46 && LA16_1<=47)||LA16_1==49||LA16_1==56||LA16_1==60) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA16_2 = input.LA(2);

                if ( ((LA16_2>=35 && LA16_2<=42)) ) {
                    alt16=3;
                }
                else if ( (LA16_2==EOF||LA16_2==44||(LA16_2>=46 && LA16_2<=47)||LA16_2==49||LA16_2==56||LA16_2==60) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA16_3 = input.LA(2);

                if ( ((LA16_3>=35 && LA16_3<=42)) ) {
                    alt16=3;
                }
                else if ( (LA16_3==EOF||LA16_3==44||(LA16_3>=46 && LA16_3<=47)||LA16_3==49||LA16_3==56||LA16_3==60) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA16_4 = input.LA(2);

                if ( (LA16_4==EOF||LA16_4==44||(LA16_4>=46 && LA16_4<=47)||LA16_4==49||LA16_4==56||LA16_4==60) ) {
                    alt16=2;
                }
                else if ( ((LA16_4>=35 && LA16_4<=42)) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMontiArcDSL.g:1493:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1493:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1494:3: ruleNameExpression
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
                    // InternalMontiArcDSL.g:1499:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1499:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1500:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1505:2: ( ruleBinaryExpression )
                    {
                    // InternalMontiArcDSL.g:1505:2: ( ruleBinaryExpression )
                    // InternalMontiArcDSL.g:1506:3: ruleBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2()); 

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
    // InternalMontiArcDSL.g:1515:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1519:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMontiArcDSL.g:1520:2: ( ruleNumberLiteral )
                    {
                    // InternalMontiArcDSL.g:1520:2: ( ruleNumberLiteral )
                    // InternalMontiArcDSL.g:1521:3: ruleNumberLiteral
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
                    // InternalMontiArcDSL.g:1526:2: ( ruleStringLiteral )
                    {
                    // InternalMontiArcDSL.g:1526:2: ( ruleStringLiteral )
                    // InternalMontiArcDSL.g:1527:3: ruleStringLiteral
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


    // $ANTLR start "rule__NameExpression__Alternatives"
    // InternalMontiArcDSL.g:1536:1: rule__NameExpression__Alternatives : ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) );
    public final void rule__NameExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1540:1: ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_MCQUALIFIEDNAME) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMontiArcDSL.g:1541:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    {
                    // InternalMontiArcDSL.g:1541:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    // InternalMontiArcDSL.g:1542:3: ( rule__NameExpression__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 
                    // InternalMontiArcDSL.g:1543:3: ( rule__NameExpression__NameAssignment_0 )
                    // InternalMontiArcDSL.g:1543:4: rule__NameExpression__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameExpression__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1547:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    {
                    // InternalMontiArcDSL.g:1547:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    // InternalMontiArcDSL.g:1548:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 
                    // InternalMontiArcDSL.g:1549:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    // InternalMontiArcDSL.g:1549:4: rule__NameExpression__QualifiednameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameExpression__QualifiednameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 

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
    // $ANTLR end "rule__NameExpression__Alternatives"


    // $ANTLR start "rule__BinaryExpression__Literal1Alternatives_0_0"
    // InternalMontiArcDSL.g:1557:1: rule__BinaryExpression__Literal1Alternatives_0_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1561:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING||LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcDSL.g:1562:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1562:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1563:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1568:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1568:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1569:3: ruleNameExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__BinaryExpression__Literal1Alternatives_0_0"


    // $ANTLR start "rule__BinaryExpression__Literal2Alternatives_2_0"
    // InternalMontiArcDSL.g:1578:1: rule__BinaryExpression__Literal2Alternatives_2_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal2Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1582:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiArcDSL.g:1583:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1583:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1584:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1589:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1589:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1590:3: ruleNameExpression
                    {
                     before(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameExpression();

                    state._fsp--;

                     after(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__BinaryExpression__Literal2Alternatives_2_0"


    // $ANTLR start "rule__SCModifier__Alternatives"
    // InternalMontiArcDSL.g:1599:1: rule__SCModifier__Alternatives : ( ( ( 'initial' ) ) | ( ( 'final' ) ) );
    public final void rule__SCModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1603:1: ( ( ( 'initial' ) ) | ( ( 'final' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiArcDSL.g:1604:2: ( ( 'initial' ) )
                    {
                    // InternalMontiArcDSL.g:1604:2: ( ( 'initial' ) )
                    // InternalMontiArcDSL.g:1605:3: ( 'initial' )
                    {
                     before(grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0()); 
                    // InternalMontiArcDSL.g:1606:3: ( 'initial' )
                    // InternalMontiArcDSL.g:1606:4: 'initial'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1610:2: ( ( 'final' ) )
                    {
                    // InternalMontiArcDSL.g:1610:2: ( ( 'final' ) )
                    // InternalMontiArcDSL.g:1611:3: ( 'final' )
                    {
                     before(grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1()); 
                    // InternalMontiArcDSL.g:1612:3: ( 'final' )
                    // InternalMontiArcDSL.g:1612:4: 'final'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SCModifier__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMontiArcDSL.g:1620:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1624:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt22=1;
                }
                break;
            case 36:
                {
                alt22=2;
                }
                break;
            case 37:
                {
                alt22=3;
                }
                break;
            case 38:
                {
                alt22=4;
                }
                break;
            case 39:
                {
                alt22=5;
                }
                break;
            case 40:
                {
                alt22=6;
                }
                break;
            case 41:
                {
                alt22=7;
                }
                break;
            case 42:
                {
                alt22=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMontiArcDSL.g:1625:2: ( ( '>' ) )
                    {
                    // InternalMontiArcDSL.g:1625:2: ( ( '>' ) )
                    // InternalMontiArcDSL.g:1626:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalMontiArcDSL.g:1627:3: ( '>' )
                    // InternalMontiArcDSL.g:1627:4: '>'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1631:2: ( ( '<' ) )
                    {
                    // InternalMontiArcDSL.g:1631:2: ( ( '<' ) )
                    // InternalMontiArcDSL.g:1632:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    // InternalMontiArcDSL.g:1633:3: ( '<' )
                    // InternalMontiArcDSL.g:1633:4: '<'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1637:2: ( ( '==' ) )
                    {
                    // InternalMontiArcDSL.g:1637:2: ( ( '==' ) )
                    // InternalMontiArcDSL.g:1638:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalMontiArcDSL.g:1639:3: ( '==' )
                    // InternalMontiArcDSL.g:1639:4: '=='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1643:2: ( ( '&&' ) )
                    {
                    // InternalMontiArcDSL.g:1643:2: ( ( '&&' ) )
                    // InternalMontiArcDSL.g:1644:3: ( '&&' )
                    {
                     before(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 
                    // InternalMontiArcDSL.g:1645:3: ( '&&' )
                    // InternalMontiArcDSL.g:1645:4: '&&'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1649:2: ( ( '+' ) )
                    {
                    // InternalMontiArcDSL.g:1649:2: ( ( '+' ) )
                    // InternalMontiArcDSL.g:1650:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 
                    // InternalMontiArcDSL.g:1651:3: ( '+' )
                    // InternalMontiArcDSL.g:1651:4: '+'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1655:2: ( ( '-' ) )
                    {
                    // InternalMontiArcDSL.g:1655:2: ( ( '-' ) )
                    // InternalMontiArcDSL.g:1656:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 
                    // InternalMontiArcDSL.g:1657:3: ( '-' )
                    // InternalMontiArcDSL.g:1657:4: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1661:2: ( ( '/' ) )
                    {
                    // InternalMontiArcDSL.g:1661:2: ( ( '/' ) )
                    // InternalMontiArcDSL.g:1662:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 
                    // InternalMontiArcDSL.g:1663:3: ( '/' )
                    // InternalMontiArcDSL.g:1663:4: '/'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:1667:2: ( ( '*' ) )
                    {
                    // InternalMontiArcDSL.g:1667:2: ( ( '*' ) )
                    // InternalMontiArcDSL.g:1668:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 
                    // InternalMontiArcDSL.g:1669:3: ( '*' )
                    // InternalMontiArcDSL.g:1669:4: '*'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__MACompilationUnit__Group__0"
    // InternalMontiArcDSL.g:1677:1: rule__MACompilationUnit__Group__0 : rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 ;
    public final void rule__MACompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1681:1: ( rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 )
            // InternalMontiArcDSL.g:1682:2: rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1
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
    // InternalMontiArcDSL.g:1689:1: rule__MACompilationUnit__Group__0__Impl : ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__MACompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1693:1: ( ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1694:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1694:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcDSL.g:1695:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcDSL.g:1696:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            // InternalMontiArcDSL.g:1696:3: rule__MACompilationUnit__PackageAssignment_0
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
    // InternalMontiArcDSL.g:1704:1: rule__MACompilationUnit__Group__1 : rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 ;
    public final void rule__MACompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1708:1: ( rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 )
            // InternalMontiArcDSL.g:1709:2: rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2
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
    // InternalMontiArcDSL.g:1716:1: rule__MACompilationUnit__Group__1__Impl : ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__MACompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1720:1: ( ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcDSL.g:1721:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcDSL.g:1721:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcDSL.g:1722:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcDSL.g:1723:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1723:3: rule__MACompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MACompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMontiArcDSL.g:1731:1: rule__MACompilationUnit__Group__2 : rule__MACompilationUnit__Group__2__Impl ;
    public final void rule__MACompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1735:1: ( rule__MACompilationUnit__Group__2__Impl )
            // InternalMontiArcDSL.g:1736:2: rule__MACompilationUnit__Group__2__Impl
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
    // InternalMontiArcDSL.g:1742:1: rule__MACompilationUnit__Group__2__Impl : ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) ;
    public final void rule__MACompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1746:1: ( ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1747:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1747:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            // InternalMontiArcDSL.g:1748:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 
            // InternalMontiArcDSL.g:1749:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            // InternalMontiArcDSL.g:1749:3: rule__MACompilationUnit__ComponentAssignment_2
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
    // InternalMontiArcDSL.g:1758:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1762:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMontiArcDSL.g:1763:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMontiArcDSL.g:1770:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1774:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1775:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1775:1: ( 'component' )
            // InternalMontiArcDSL.g:1776:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1785:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1789:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMontiArcDSL.g:1790:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMontiArcDSL.g:1797:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1801:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1802:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1802:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1803:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1804:2: ( rule__Component__NameAssignment_1 )
            // InternalMontiArcDSL.g:1804:3: rule__Component__NameAssignment_1
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
    // InternalMontiArcDSL.g:1812:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1816:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMontiArcDSL.g:1817:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMontiArcDSL.g:1824:1: rule__Component__Group__2__Impl : ( ( rule__Component__SignatureAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1828:1: ( ( ( rule__Component__SignatureAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1829:1: ( ( rule__Component__SignatureAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1829:1: ( ( rule__Component__SignatureAssignment_2 ) )
            // InternalMontiArcDSL.g:1830:2: ( rule__Component__SignatureAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getSignatureAssignment_2()); 
            // InternalMontiArcDSL.g:1831:2: ( rule__Component__SignatureAssignment_2 )
            // InternalMontiArcDSL.g:1831:3: rule__Component__SignatureAssignment_2
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
    // InternalMontiArcDSL.g:1839:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1843:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMontiArcDSL.g:1844:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMontiArcDSL.g:1851:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1855:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:1856:1: ( '{' )
            {
            // InternalMontiArcDSL.g:1856:1: ( '{' )
            // InternalMontiArcDSL.g:1857:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1866:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1870:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMontiArcDSL.g:1871:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMontiArcDSL.g:1878:1: rule__Component__Group__4__Impl : ( ( rule__Component__ArcElementsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1882:1: ( ( ( rule__Component__ArcElementsAssignment_4 )* ) )
            // InternalMontiArcDSL.g:1883:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            {
            // InternalMontiArcDSL.g:1883:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            // InternalMontiArcDSL.g:1884:2: ( rule__Component__ArcElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getArcElementsAssignment_4()); 
            // InternalMontiArcDSL.g:1885:2: ( rule__Component__ArcElementsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_SYNC)||(LA24_0>=14 && LA24_0<=32)||LA24_0==43||LA24_0==51||LA24_0==57) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1885:3: rule__Component__ArcElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Component__ArcElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMontiArcDSL.g:1893:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1897:1: ( rule__Component__Group__5__Impl )
            // InternalMontiArcDSL.g:1898:2: rule__Component__Group__5__Impl
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
    // InternalMontiArcDSL.g:1904:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1908:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:1909:1: ( '}' )
            {
            // InternalMontiArcDSL.g:1909:1: ( '}' )
            // InternalMontiArcDSL.g:1910:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:1920:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1924:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMontiArcDSL.g:1925:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalMontiArcDSL.g:1932:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1936:1: ( ( () ) )
            // InternalMontiArcDSL.g:1937:1: ( () )
            {
            // InternalMontiArcDSL.g:1937:1: ( () )
            // InternalMontiArcDSL.g:1938:2: ()
            {
             before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            // InternalMontiArcDSL.g:1939:2: ()
            // InternalMontiArcDSL.g:1939:3: 
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
    // InternalMontiArcDSL.g:1947:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1951:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMontiArcDSL.g:1952:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalMontiArcDSL.g:1959:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__ParametersAssignment_1 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1963:1: ( ( ( rule__Signature__ParametersAssignment_1 )? ) )
            // InternalMontiArcDSL.g:1964:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:1964:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            // InternalMontiArcDSL.g:1965:2: ( rule__Signature__ParametersAssignment_1 )?
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1()); 
            // InternalMontiArcDSL.g:1966:2: ( rule__Signature__ParametersAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=14 && LA25_0<=32)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMontiArcDSL.g:1966:3: rule__Signature__ParametersAssignment_1
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
    // InternalMontiArcDSL.g:1974:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1978:1: ( rule__Signature__Group__2__Impl )
            // InternalMontiArcDSL.g:1979:2: rule__Signature__Group__2__Impl
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
    // InternalMontiArcDSL.g:1985:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )? ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1989:1: ( ( ( rule__Signature__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1990:1: ( ( rule__Signature__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1990:1: ( ( rule__Signature__Group_2__0 )? )
            // InternalMontiArcDSL.g:1991:2: ( rule__Signature__Group_2__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1992:2: ( rule__Signature__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMontiArcDSL.g:1992:3: rule__Signature__Group_2__0
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
    // InternalMontiArcDSL.g:2001:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2005:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalMontiArcDSL.g:2006:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
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
    // InternalMontiArcDSL.g:2013:1: rule__Signature__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2017:1: ( ( 'extends' ) )
            // InternalMontiArcDSL.g:2018:1: ( 'extends' )
            {
            // InternalMontiArcDSL.g:2018:1: ( 'extends' )
            // InternalMontiArcDSL.g:2019:2: 'extends'
            {
             before(grammarAccess.getSignatureAccess().getExtendsKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2028:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2032:1: ( rule__Signature__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2033:2: rule__Signature__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2039:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__TypeAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2043:1: ( ( ( rule__Signature__TypeAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2044:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2044:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2045:2: ( rule__Signature__TypeAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_2_1()); 
            // InternalMontiArcDSL.g:2046:2: ( rule__Signature__TypeAssignment_2_1 )
            // InternalMontiArcDSL.g:2046:3: rule__Signature__TypeAssignment_2_1
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
    // InternalMontiArcDSL.g:2055:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2059:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMontiArcDSL.g:2060:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalMontiArcDSL.g:2067:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParametersAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2071:1: ( ( ( rule__Parameters__ParametersAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2072:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2072:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            // InternalMontiArcDSL.g:2073:2: ( rule__Parameters__ParametersAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_0()); 
            // InternalMontiArcDSL.g:2074:2: ( rule__Parameters__ParametersAssignment_0 )
            // InternalMontiArcDSL.g:2074:3: rule__Parameters__ParametersAssignment_0
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
    // InternalMontiArcDSL.g:2082:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2086:1: ( rule__Parameters__Group__1__Impl )
            // InternalMontiArcDSL.g:2087:2: rule__Parameters__Group__1__Impl
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
    // InternalMontiArcDSL.g:2093:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2097:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:2098:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:2098:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalMontiArcDSL.g:2099:2: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2100:2: ( rule__Parameters__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2100:3: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMontiArcDSL.g:2109:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2113:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalMontiArcDSL.g:2114:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
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
    // InternalMontiArcDSL.g:2121:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2125:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2126:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2126:1: ( ',' )
            // InternalMontiArcDSL.g:2127:2: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2136:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2140:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2141:2: rule__Parameters__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2147:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2151:1: ( ( ( rule__Parameters__ParametersAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2152:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2152:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2153:2: ( rule__Parameters__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 
            // InternalMontiArcDSL.g:2154:2: ( rule__Parameters__ParametersAssignment_1_1 )
            // InternalMontiArcDSL.g:2154:3: rule__Parameters__ParametersAssignment_1_1
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
    // InternalMontiArcDSL.g:2163:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2167:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMontiArcDSL.g:2168:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalMontiArcDSL.g:2175:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2179:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2180:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2180:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:2181:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:2182:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMontiArcDSL.g:2182:3: rule__Parameter__TypeAssignment_0
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
    // InternalMontiArcDSL.g:2190:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2194:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMontiArcDSL.g:2195:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalMontiArcDSL.g:2202:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2206:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2207:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2207:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2208:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2209:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMontiArcDSL.g:2209:3: rule__Parameter__NameAssignment_1
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
    // InternalMontiArcDSL.g:2217:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2221:1: ( rule__Parameter__Group__2__Impl )
            // InternalMontiArcDSL.g:2222:2: rule__Parameter__Group__2__Impl
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
    // InternalMontiArcDSL.g:2228:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2232:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2233:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2233:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalMontiArcDSL.g:2234:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2235:2: ( rule__Parameter__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMontiArcDSL.g:2235:3: rule__Parameter__Group_2__0
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
    // InternalMontiArcDSL.g:2244:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2248:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalMontiArcDSL.g:2249:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
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
    // InternalMontiArcDSL.g:2256:1: rule__Parameter__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2260:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:2261:1: ( '=' )
            {
            // InternalMontiArcDSL.g:2261:1: ( '=' )
            // InternalMontiArcDSL.g:2262:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2271:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2275:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2276:2: rule__Parameter__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2282:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2286:1: ( ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2287:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2287:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2288:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:2289:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:2289:3: rule__Parameter__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:2298:1: rule__SubComponent__Group__0 : rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 ;
    public final void rule__SubComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2302:1: ( rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 )
            // InternalMontiArcDSL.g:2303:2: rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1
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
    // InternalMontiArcDSL.g:2310:1: rule__SubComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__SubComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2314:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:2315:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:2315:1: ( 'component' )
            // InternalMontiArcDSL.g:2316:2: 'component'
            {
             before(grammarAccess.getSubComponentAccess().getComponentKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2325:1: rule__SubComponent__Group__1 : rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 ;
    public final void rule__SubComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2329:1: ( rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 )
            // InternalMontiArcDSL.g:2330:2: rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2
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
    // InternalMontiArcDSL.g:2337:1: rule__SubComponent__Group__1__Impl : ( ( rule__SubComponent__TypeAssignment_1 ) ) ;
    public final void rule__SubComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2341:1: ( ( ( rule__SubComponent__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2342:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2342:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:2343:2: ( rule__SubComponent__TypeAssignment_1 )
            {
             before(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:2344:2: ( rule__SubComponent__TypeAssignment_1 )
            // InternalMontiArcDSL.g:2344:3: rule__SubComponent__TypeAssignment_1
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
    // InternalMontiArcDSL.g:2352:1: rule__SubComponent__Group__2 : rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 ;
    public final void rule__SubComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2356:1: ( rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 )
            // InternalMontiArcDSL.g:2357:2: rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3
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
    // InternalMontiArcDSL.g:2364:1: rule__SubComponent__Group__2__Impl : ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) ;
    public final void rule__SubComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2368:1: ( ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) )
            // InternalMontiArcDSL.g:2369:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:2369:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            // InternalMontiArcDSL.g:2370:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 
            // InternalMontiArcDSL.g:2371:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==55) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMontiArcDSL.g:2371:3: rule__SubComponent__ArgumentsAssignment_2
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
    // InternalMontiArcDSL.g:2379:1: rule__SubComponent__Group__3 : rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 ;
    public final void rule__SubComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2383:1: ( rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 )
            // InternalMontiArcDSL.g:2384:2: rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4
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
    // InternalMontiArcDSL.g:2391:1: rule__SubComponent__Group__3__Impl : ( ( rule__SubComponent__InstancesAssignment_3 ) ) ;
    public final void rule__SubComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2395:1: ( ( ( rule__SubComponent__InstancesAssignment_3 ) ) )
            // InternalMontiArcDSL.g:2396:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:2396:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            // InternalMontiArcDSL.g:2397:2: ( rule__SubComponent__InstancesAssignment_3 )
            {
             before(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 
            // InternalMontiArcDSL.g:2398:2: ( rule__SubComponent__InstancesAssignment_3 )
            // InternalMontiArcDSL.g:2398:3: rule__SubComponent__InstancesAssignment_3
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
    // InternalMontiArcDSL.g:2406:1: rule__SubComponent__Group__4 : rule__SubComponent__Group__4__Impl ;
    public final void rule__SubComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2410:1: ( rule__SubComponent__Group__4__Impl )
            // InternalMontiArcDSL.g:2411:2: rule__SubComponent__Group__4__Impl
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
    // InternalMontiArcDSL.g:2417:1: rule__SubComponent__Group__4__Impl : ( ';' ) ;
    public final void rule__SubComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2421:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2422:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2422:1: ( ';' )
            // InternalMontiArcDSL.g:2423:2: ';'
            {
             before(grammarAccess.getSubComponentAccess().getSemicolonKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2433:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2437:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalMontiArcDSL.g:2438:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMontiArcDSL.g:2445:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__SourceAssignment_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2449:1: ( ( ( rule__Connector__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2450:1: ( ( rule__Connector__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2450:1: ( ( rule__Connector__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:2451:2: ( rule__Connector__SourceAssignment_0 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:2452:2: ( rule__Connector__SourceAssignment_0 )
            // InternalMontiArcDSL.g:2452:3: rule__Connector__SourceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getSourceAssignment_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:2460:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2464:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalMontiArcDSL.g:2465:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMontiArcDSL.g:2472:1: rule__Connector__Group__1__Impl : ( '->' ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2476:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:2477:1: ( '->' )
            {
            // InternalMontiArcDSL.g:2477:1: ( '->' )
            // InternalMontiArcDSL.g:2478:2: '->'
            {
             before(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:2487:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2491:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalMontiArcDSL.g:2492:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMontiArcDSL.g:2499:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__TargetsAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2503:1: ( ( ( rule__Connector__TargetsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:2504:1: ( ( rule__Connector__TargetsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:2504:1: ( ( rule__Connector__TargetsAssignment_2 ) )
            // InternalMontiArcDSL.g:2505:2: ( rule__Connector__TargetsAssignment_2 )
            {
             before(grammarAccess.getConnectorAccess().getTargetsAssignment_2()); 
            // InternalMontiArcDSL.g:2506:2: ( rule__Connector__TargetsAssignment_2 )
            // InternalMontiArcDSL.g:2506:3: rule__Connector__TargetsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Connector__TargetsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTargetsAssignment_2()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:2514:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2518:1: ( rule__Connector__Group__3__Impl )
            // InternalMontiArcDSL.g:2519:2: rule__Connector__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connector__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:2525:1: rule__Connector__Group__3__Impl : ( ';' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2529:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2530:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2530:1: ( ';' )
            // InternalMontiArcDSL.g:2531:2: ';'
            {
             before(grammarAccess.getConnectorAccess().getSemicolonKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getConnectorAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ports__Group__0"
    // InternalMontiArcDSL.g:2541:1: rule__Ports__Group__0 : rule__Ports__Group__0__Impl rule__Ports__Group__1 ;
    public final void rule__Ports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2545:1: ( rule__Ports__Group__0__Impl rule__Ports__Group__1 )
            // InternalMontiArcDSL.g:2546:2: rule__Ports__Group__0__Impl rule__Ports__Group__1
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
    // InternalMontiArcDSL.g:2553:1: rule__Ports__Group__0__Impl : ( 'port' ) ;
    public final void rule__Ports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2557:1: ( ( 'port' ) )
            // InternalMontiArcDSL.g:2558:1: ( 'port' )
            {
            // InternalMontiArcDSL.g:2558:1: ( 'port' )
            // InternalMontiArcDSL.g:2559:2: 'port'
            {
             before(grammarAccess.getPortsAccess().getPortKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2568:1: rule__Ports__Group__1 : rule__Ports__Group__1__Impl rule__Ports__Group__2 ;
    public final void rule__Ports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2572:1: ( rule__Ports__Group__1__Impl rule__Ports__Group__2 )
            // InternalMontiArcDSL.g:2573:2: rule__Ports__Group__1__Impl rule__Ports__Group__2
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
    // InternalMontiArcDSL.g:2580:1: rule__Ports__Group__1__Impl : ( ( rule__Ports__PortsAssignment_1 ) ) ;
    public final void rule__Ports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2584:1: ( ( ( rule__Ports__PortsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2585:1: ( ( rule__Ports__PortsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2585:1: ( ( rule__Ports__PortsAssignment_1 ) )
            // InternalMontiArcDSL.g:2586:2: ( rule__Ports__PortsAssignment_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_1()); 
            // InternalMontiArcDSL.g:2587:2: ( rule__Ports__PortsAssignment_1 )
            // InternalMontiArcDSL.g:2587:3: rule__Ports__PortsAssignment_1
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
    // InternalMontiArcDSL.g:2595:1: rule__Ports__Group__2 : rule__Ports__Group__2__Impl rule__Ports__Group__3 ;
    public final void rule__Ports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2599:1: ( rule__Ports__Group__2__Impl rule__Ports__Group__3 )
            // InternalMontiArcDSL.g:2600:2: rule__Ports__Group__2__Impl rule__Ports__Group__3
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
    // InternalMontiArcDSL.g:2607:1: rule__Ports__Group__2__Impl : ( ( rule__Ports__Group_2__0 )* ) ;
    public final void rule__Ports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2611:1: ( ( ( rule__Ports__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:2612:1: ( ( rule__Ports__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:2612:1: ( ( rule__Ports__Group_2__0 )* )
            // InternalMontiArcDSL.g:2613:2: ( rule__Ports__Group_2__0 )*
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2614:2: ( rule__Ports__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2614:3: rule__Ports__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Ports__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalMontiArcDSL.g:2622:1: rule__Ports__Group__3 : rule__Ports__Group__3__Impl ;
    public final void rule__Ports__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2626:1: ( rule__Ports__Group__3__Impl )
            // InternalMontiArcDSL.g:2627:2: rule__Ports__Group__3__Impl
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
    // InternalMontiArcDSL.g:2633:1: rule__Ports__Group__3__Impl : ( ';' ) ;
    public final void rule__Ports__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2637:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2638:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2638:1: ( ';' )
            // InternalMontiArcDSL.g:2639:2: ';'
            {
             before(grammarAccess.getPortsAccess().getSemicolonKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2649:1: rule__Ports__Group_2__0 : rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 ;
    public final void rule__Ports__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2653:1: ( rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 )
            // InternalMontiArcDSL.g:2654:2: rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1
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
    // InternalMontiArcDSL.g:2661:1: rule__Ports__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Ports__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2665:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2666:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2666:1: ( ',' )
            // InternalMontiArcDSL.g:2667:2: ','
            {
             before(grammarAccess.getPortsAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:2676:1: rule__Ports__Group_2__1 : rule__Ports__Group_2__1__Impl ;
    public final void rule__Ports__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2680:1: ( rule__Ports__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2681:2: rule__Ports__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2687:1: rule__Ports__Group_2__1__Impl : ( ( rule__Ports__PortsAssignment_2_1 ) ) ;
    public final void rule__Ports__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2691:1: ( ( ( rule__Ports__PortsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2692:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2692:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2693:2: ( rule__Ports__PortsAssignment_2_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_2_1()); 
            // InternalMontiArcDSL.g:2694:2: ( rule__Ports__PortsAssignment_2_1 )
            // InternalMontiArcDSL.g:2694:3: rule__Ports__PortsAssignment_2_1
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
    // InternalMontiArcDSL.g:2703:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2707:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMontiArcDSL.g:2708:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMontiArcDSL.g:2715:1: rule__Port__Group__0__Impl : ( ( rule__Port__AssumeAssignment_0 )? ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2719:1: ( ( ( rule__Port__AssumeAssignment_0 )? ) )
            // InternalMontiArcDSL.g:2720:1: ( ( rule__Port__AssumeAssignment_0 )? )
            {
            // InternalMontiArcDSL.g:2720:1: ( ( rule__Port__AssumeAssignment_0 )? )
            // InternalMontiArcDSL.g:2721:2: ( rule__Port__AssumeAssignment_0 )?
            {
             before(grammarAccess.getPortAccess().getAssumeAssignment_0()); 
            // InternalMontiArcDSL.g:2722:2: ( rule__Port__AssumeAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMontiArcDSL.g:2722:3: rule__Port__AssumeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__AssumeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getAssumeAssignment_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:2730:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2734:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMontiArcDSL.g:2735:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMontiArcDSL.g:2742:1: rule__Port__Group__1__Impl : ( ( rule__Port__SyncAssignment_1 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2746:1: ( ( ( rule__Port__SyncAssignment_1 )? ) )
            // InternalMontiArcDSL.g:2747:1: ( ( rule__Port__SyncAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:2747:1: ( ( rule__Port__SyncAssignment_1 )? )
            // InternalMontiArcDSL.g:2748:2: ( rule__Port__SyncAssignment_1 )?
            {
             before(grammarAccess.getPortAccess().getSyncAssignment_1()); 
            // InternalMontiArcDSL.g:2749:2: ( rule__Port__SyncAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_SYNC) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMontiArcDSL.g:2749:3: rule__Port__SyncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__SyncAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getSyncAssignment_1()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:2757:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2761:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalMontiArcDSL.g:2762:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalMontiArcDSL.g:2769:1: rule__Port__Group__2__Impl : ( ( rule__Port__Alternatives_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2773:1: ( ( ( rule__Port__Alternatives_2 ) ) )
            // InternalMontiArcDSL.g:2774:1: ( ( rule__Port__Alternatives_2 ) )
            {
            // InternalMontiArcDSL.g:2774:1: ( ( rule__Port__Alternatives_2 ) )
            // InternalMontiArcDSL.g:2775:2: ( rule__Port__Alternatives_2 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_2()); 
            // InternalMontiArcDSL.g:2776:2: ( rule__Port__Alternatives_2 )
            // InternalMontiArcDSL.g:2776:3: rule__Port__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:2784:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2788:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalMontiArcDSL.g:2789:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__4();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:2796:1: rule__Port__Group__3__Impl : ( ( rule__Port__Alternatives_3 ) ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2800:1: ( ( ( rule__Port__Alternatives_3 ) ) )
            // InternalMontiArcDSL.g:2801:1: ( ( rule__Port__Alternatives_3 ) )
            {
            // InternalMontiArcDSL.g:2801:1: ( ( rule__Port__Alternatives_3 ) )
            // InternalMontiArcDSL.g:2802:2: ( rule__Port__Alternatives_3 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_3()); 
            // InternalMontiArcDSL.g:2803:2: ( rule__Port__Alternatives_3 )
            // InternalMontiArcDSL.g:2803:3: rule__Port__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Port__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Port__Group__4"
    // InternalMontiArcDSL.g:2811:1: rule__Port__Group__4 : rule__Port__Group__4__Impl ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2815:1: ( rule__Port__Group__4__Impl )
            // InternalMontiArcDSL.g:2816:2: rule__Port__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalMontiArcDSL.g:2822:1: rule__Port__Group__4__Impl : ( ( rule__Port__NamesAssignment_4 )? ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2826:1: ( ( ( rule__Port__NamesAssignment_4 )? ) )
            // InternalMontiArcDSL.g:2827:1: ( ( rule__Port__NamesAssignment_4 )? )
            {
            // InternalMontiArcDSL.g:2827:1: ( ( rule__Port__NamesAssignment_4 )? )
            // InternalMontiArcDSL.g:2828:2: ( rule__Port__NamesAssignment_4 )?
            {
             before(grammarAccess.getPortAccess().getNamesAssignment_4()); 
            // InternalMontiArcDSL.g:2829:2: ( rule__Port__NamesAssignment_4 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMontiArcDSL.g:2829:3: rule__Port__NamesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__NamesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getNamesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Assume__Group__0"
    // InternalMontiArcDSL.g:2838:1: rule__Assume__Group__0 : rule__Assume__Group__0__Impl rule__Assume__Group__1 ;
    public final void rule__Assume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2842:1: ( rule__Assume__Group__0__Impl rule__Assume__Group__1 )
            // InternalMontiArcDSL.g:2843:2: rule__Assume__Group__0__Impl rule__Assume__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Assume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assume__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__0"


    // $ANTLR start "rule__Assume__Group__0__Impl"
    // InternalMontiArcDSL.g:2850:1: rule__Assume__Group__0__Impl : ( '<<' ) ;
    public final void rule__Assume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2854:1: ( ( '<<' ) )
            // InternalMontiArcDSL.g:2855:1: ( '<<' )
            {
            // InternalMontiArcDSL.g:2855:1: ( '<<' )
            // InternalMontiArcDSL.g:2856:2: '<<'
            {
             before(grammarAccess.getAssumeAccess().getLessThanSignLessThanSignKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAssumeAccess().getLessThanSignLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__0__Impl"


    // $ANTLR start "rule__Assume__Group__1"
    // InternalMontiArcDSL.g:2865:1: rule__Assume__Group__1 : rule__Assume__Group__1__Impl rule__Assume__Group__2 ;
    public final void rule__Assume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2869:1: ( rule__Assume__Group__1__Impl rule__Assume__Group__2 )
            // InternalMontiArcDSL.g:2870:2: rule__Assume__Group__1__Impl rule__Assume__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Assume__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assume__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__1"


    // $ANTLR start "rule__Assume__Group__1__Impl"
    // InternalMontiArcDSL.g:2877:1: rule__Assume__Group__1__Impl : ( 'assume' ) ;
    public final void rule__Assume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2881:1: ( ( 'assume' ) )
            // InternalMontiArcDSL.g:2882:1: ( 'assume' )
            {
            // InternalMontiArcDSL.g:2882:1: ( 'assume' )
            // InternalMontiArcDSL.g:2883:2: 'assume'
            {
             before(grammarAccess.getAssumeAccess().getAssumeKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAssumeAccess().getAssumeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__1__Impl"


    // $ANTLR start "rule__Assume__Group__2"
    // InternalMontiArcDSL.g:2892:1: rule__Assume__Group__2 : rule__Assume__Group__2__Impl rule__Assume__Group__3 ;
    public final void rule__Assume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2896:1: ( rule__Assume__Group__2__Impl rule__Assume__Group__3 )
            // InternalMontiArcDSL.g:2897:2: rule__Assume__Group__2__Impl rule__Assume__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Assume__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assume__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__2"


    // $ANTLR start "rule__Assume__Group__2__Impl"
    // InternalMontiArcDSL.g:2904:1: rule__Assume__Group__2__Impl : ( '=' ) ;
    public final void rule__Assume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2908:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:2909:1: ( '=' )
            {
            // InternalMontiArcDSL.g:2909:1: ( '=' )
            // InternalMontiArcDSL.g:2910:2: '='
            {
             before(grammarAccess.getAssumeAccess().getEqualsSignKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAssumeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__2__Impl"


    // $ANTLR start "rule__Assume__Group__3"
    // InternalMontiArcDSL.g:2919:1: rule__Assume__Group__3 : rule__Assume__Group__3__Impl rule__Assume__Group__4 ;
    public final void rule__Assume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2923:1: ( rule__Assume__Group__3__Impl rule__Assume__Group__4 )
            // InternalMontiArcDSL.g:2924:2: rule__Assume__Group__3__Impl rule__Assume__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Assume__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assume__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__3"


    // $ANTLR start "rule__Assume__Group__3__Impl"
    // InternalMontiArcDSL.g:2931:1: rule__Assume__Group__3__Impl : ( ( rule__Assume__ConditionAssignment_3 ) ) ;
    public final void rule__Assume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2935:1: ( ( ( rule__Assume__ConditionAssignment_3 ) ) )
            // InternalMontiArcDSL.g:2936:1: ( ( rule__Assume__ConditionAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:2936:1: ( ( rule__Assume__ConditionAssignment_3 ) )
            // InternalMontiArcDSL.g:2937:2: ( rule__Assume__ConditionAssignment_3 )
            {
             before(grammarAccess.getAssumeAccess().getConditionAssignment_3()); 
            // InternalMontiArcDSL.g:2938:2: ( rule__Assume__ConditionAssignment_3 )
            // InternalMontiArcDSL.g:2938:3: rule__Assume__ConditionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Assume__ConditionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssumeAccess().getConditionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__3__Impl"


    // $ANTLR start "rule__Assume__Group__4"
    // InternalMontiArcDSL.g:2946:1: rule__Assume__Group__4 : rule__Assume__Group__4__Impl ;
    public final void rule__Assume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2950:1: ( rule__Assume__Group__4__Impl )
            // InternalMontiArcDSL.g:2951:2: rule__Assume__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assume__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__4"


    // $ANTLR start "rule__Assume__Group__4__Impl"
    // InternalMontiArcDSL.g:2957:1: rule__Assume__Group__4__Impl : ( '>>' ) ;
    public final void rule__Assume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2961:1: ( ( '>>' ) )
            // InternalMontiArcDSL.g:2962:1: ( '>>' )
            {
            // InternalMontiArcDSL.g:2962:1: ( '>>' )
            // InternalMontiArcDSL.g:2963:2: '>>'
            {
             before(grammarAccess.getAssumeAccess().getGreaterThanSignGreaterThanSignKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAssumeAccess().getGreaterThanSignGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__Group__4__Impl"


    // $ANTLR start "rule__Names__Group__0"
    // InternalMontiArcDSL.g:2973:1: rule__Names__Group__0 : rule__Names__Group__0__Impl rule__Names__Group__1 ;
    public final void rule__Names__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2977:1: ( rule__Names__Group__0__Impl rule__Names__Group__1 )
            // InternalMontiArcDSL.g:2978:2: rule__Names__Group__0__Impl rule__Names__Group__1
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
    // InternalMontiArcDSL.g:2985:1: rule__Names__Group__0__Impl : ( ( rule__Names__NamesAssignment_0 ) ) ;
    public final void rule__Names__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2989:1: ( ( ( rule__Names__NamesAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2990:1: ( ( rule__Names__NamesAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2990:1: ( ( rule__Names__NamesAssignment_0 ) )
            // InternalMontiArcDSL.g:2991:2: ( rule__Names__NamesAssignment_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_0()); 
            // InternalMontiArcDSL.g:2992:2: ( rule__Names__NamesAssignment_0 )
            // InternalMontiArcDSL.g:2992:3: rule__Names__NamesAssignment_0
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
    // InternalMontiArcDSL.g:3000:1: rule__Names__Group__1 : rule__Names__Group__1__Impl ;
    public final void rule__Names__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3004:1: ( rule__Names__Group__1__Impl )
            // InternalMontiArcDSL.g:3005:2: rule__Names__Group__1__Impl
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
    // InternalMontiArcDSL.g:3011:1: rule__Names__Group__1__Impl : ( ( rule__Names__Group_1__0 )* ) ;
    public final void rule__Names__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3015:1: ( ( ( rule__Names__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:3016:1: ( ( rule__Names__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:3016:1: ( ( rule__Names__Group_1__0 )* )
            // InternalMontiArcDSL.g:3017:2: ( rule__Names__Group_1__0 )*
            {
             before(grammarAccess.getNamesAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:3018:2: ( rule__Names__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    int LA34_2 = input.LA(2);

                    if ( ((LA34_2>=RULE_ID && LA34_2<=RULE_MCQUALIFIEDNAME)) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3018:3: rule__Names__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Names__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalMontiArcDSL.g:3027:1: rule__Names__Group_1__0 : rule__Names__Group_1__0__Impl rule__Names__Group_1__1 ;
    public final void rule__Names__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3031:1: ( rule__Names__Group_1__0__Impl rule__Names__Group_1__1 )
            // InternalMontiArcDSL.g:3032:2: rule__Names__Group_1__0__Impl rule__Names__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiArcDSL.g:3039:1: rule__Names__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Names__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3043:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3044:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3044:1: ( ',' )
            // InternalMontiArcDSL.g:3045:2: ','
            {
             before(grammarAccess.getNamesAccess().getCommaKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3054:1: rule__Names__Group_1__1 : rule__Names__Group_1__1__Impl ;
    public final void rule__Names__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3058:1: ( rule__Names__Group_1__1__Impl )
            // InternalMontiArcDSL.g:3059:2: rule__Names__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:3065:1: rule__Names__Group_1__1__Impl : ( ( rule__Names__NamesAssignment_1_1 ) ) ;
    public final void rule__Names__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3069:1: ( ( ( rule__Names__NamesAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:3070:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:3070:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            // InternalMontiArcDSL.g:3071:2: ( rule__Names__NamesAssignment_1_1 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 
            // InternalMontiArcDSL.g:3072:2: ( rule__Names__NamesAssignment_1_1 )
            // InternalMontiArcDSL.g:3072:3: rule__Names__NamesAssignment_1_1
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
    // InternalMontiArcDSL.g:3081:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3085:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMontiArcDSL.g:3086:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:3093:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3097:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:3098:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:3098:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:3099:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:3100:2: ( rule__Variable__TypeAssignment_0 )
            // InternalMontiArcDSL.g:3100:3: rule__Variable__TypeAssignment_0
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
    // InternalMontiArcDSL.g:3108:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3112:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMontiArcDSL.g:3113:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:3120:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NamesAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3124:1: ( ( ( rule__Variable__NamesAssignment_1 )? ) )
            // InternalMontiArcDSL.g:3125:1: ( ( rule__Variable__NamesAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:3125:1: ( ( rule__Variable__NamesAssignment_1 )? )
            // InternalMontiArcDSL.g:3126:2: ( rule__Variable__NamesAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1()); 
            // InternalMontiArcDSL.g:3127:2: ( rule__Variable__NamesAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMontiArcDSL.g:3127:3: rule__Variable__NamesAssignment_1
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
    // InternalMontiArcDSL.g:3135:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3139:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMontiArcDSL.g:3140:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:3147:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3151:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:3152:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:3152:1: ( ( rule__Variable__Group_2__0 )? )
            // InternalMontiArcDSL.g:3153:2: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3154:2: ( rule__Variable__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMontiArcDSL.g:3154:3: rule__Variable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Variable__Group__3"
    // InternalMontiArcDSL.g:3162:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3166:1: ( rule__Variable__Group__3__Impl )
            // InternalMontiArcDSL.g:3167:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalMontiArcDSL.g:3173:1: rule__Variable__Group__3__Impl : ( ';' ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3177:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3178:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3178:1: ( ';' )
            // InternalMontiArcDSL.g:3179:2: ';'
            {
             before(grammarAccess.getVariableAccess().getSemicolonKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group_2__0"
    // InternalMontiArcDSL.g:3189:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3193:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // InternalMontiArcDSL.g:3194:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0"


    // $ANTLR start "rule__Variable__Group_2__0__Impl"
    // InternalMontiArcDSL.g:3201:1: rule__Variable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3205:1: ( ( '(' ) )
            // InternalMontiArcDSL.g:3206:1: ( '(' )
            {
            // InternalMontiArcDSL.g:3206:1: ( '(' )
            // InternalMontiArcDSL.g:3207:2: '('
            {
             before(grammarAccess.getVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2__1"
    // InternalMontiArcDSL.g:3216:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2 ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3220:1: ( rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2 )
            // InternalMontiArcDSL.g:3221:2: rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1"


    // $ANTLR start "rule__Variable__Group_2__1__Impl"
    // InternalMontiArcDSL.g:3228:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__ParametersAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3232:1: ( ( ( rule__Variable__ParametersAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3233:1: ( ( rule__Variable__ParametersAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3233:1: ( ( rule__Variable__ParametersAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3234:2: ( rule__Variable__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getParametersAssignment_2_1()); 
            // InternalMontiArcDSL.g:3235:2: ( rule__Variable__ParametersAssignment_2_1 )
            // InternalMontiArcDSL.g:3235:3: rule__Variable__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__1__Impl"


    // $ANTLR start "rule__Variable__Group_2__2"
    // InternalMontiArcDSL.g:3243:1: rule__Variable__Group_2__2 : rule__Variable__Group_2__2__Impl rule__Variable__Group_2__3 ;
    public final void rule__Variable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3247:1: ( rule__Variable__Group_2__2__Impl rule__Variable__Group_2__3 )
            // InternalMontiArcDSL.g:3248:2: rule__Variable__Group_2__2__Impl rule__Variable__Group_2__3
            {
            pushFollow(FOLLOW_26);
            rule__Variable__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__2"


    // $ANTLR start "rule__Variable__Group_2__2__Impl"
    // InternalMontiArcDSL.g:3255:1: rule__Variable__Group_2__2__Impl : ( ( rule__Variable__Group_2_2__0 )* ) ;
    public final void rule__Variable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3259:1: ( ( ( rule__Variable__Group_2_2__0 )* ) )
            // InternalMontiArcDSL.g:3260:1: ( ( rule__Variable__Group_2_2__0 )* )
            {
            // InternalMontiArcDSL.g:3260:1: ( ( rule__Variable__Group_2_2__0 )* )
            // InternalMontiArcDSL.g:3261:2: ( rule__Variable__Group_2_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_2_2()); 
            // InternalMontiArcDSL.g:3262:2: ( rule__Variable__Group_2_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==47) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3262:3: rule__Variable__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Variable__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__2__Impl"


    // $ANTLR start "rule__Variable__Group_2__3"
    // InternalMontiArcDSL.g:3270:1: rule__Variable__Group_2__3 : rule__Variable__Group_2__3__Impl ;
    public final void rule__Variable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3274:1: ( rule__Variable__Group_2__3__Impl )
            // InternalMontiArcDSL.g:3275:2: rule__Variable__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__3"


    // $ANTLR start "rule__Variable__Group_2__3__Impl"
    // InternalMontiArcDSL.g:3281:1: rule__Variable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Variable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3285:1: ( ( ')' ) )
            // InternalMontiArcDSL.g:3286:1: ( ')' )
            {
            // InternalMontiArcDSL.g:3286:1: ( ')' )
            // InternalMontiArcDSL.g:3287:2: ')'
            {
             before(grammarAccess.getVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2__3__Impl"


    // $ANTLR start "rule__Variable__Group_2_2__0"
    // InternalMontiArcDSL.g:3297:1: rule__Variable__Group_2_2__0 : rule__Variable__Group_2_2__0__Impl rule__Variable__Group_2_2__1 ;
    public final void rule__Variable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3301:1: ( rule__Variable__Group_2_2__0__Impl rule__Variable__Group_2_2__1 )
            // InternalMontiArcDSL.g:3302:2: rule__Variable__Group_2_2__0__Impl rule__Variable__Group_2_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Variable__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2_2__0"


    // $ANTLR start "rule__Variable__Group_2_2__0__Impl"
    // InternalMontiArcDSL.g:3309:1: rule__Variable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3313:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3314:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3314:1: ( ',' )
            // InternalMontiArcDSL.g:3315:2: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_2_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2_2__0__Impl"


    // $ANTLR start "rule__Variable__Group_2_2__1"
    // InternalMontiArcDSL.g:3324:1: rule__Variable__Group_2_2__1 : rule__Variable__Group_2_2__1__Impl ;
    public final void rule__Variable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3328:1: ( rule__Variable__Group_2_2__1__Impl )
            // InternalMontiArcDSL.g:3329:2: rule__Variable__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2_2__1"


    // $ANTLR start "rule__Variable__Group_2_2__1__Impl"
    // InternalMontiArcDSL.g:3335:1: rule__Variable__Group_2_2__1__Impl : ( ( rule__Variable__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Variable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3339:1: ( ( ( rule__Variable__ParametersAssignment_2_2_1 ) ) )
            // InternalMontiArcDSL.g:3340:1: ( ( rule__Variable__ParametersAssignment_2_2_1 ) )
            {
            // InternalMontiArcDSL.g:3340:1: ( ( rule__Variable__ParametersAssignment_2_2_1 ) )
            // InternalMontiArcDSL.g:3341:2: ( rule__Variable__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getVariableAccess().getParametersAssignment_2_2_1()); 
            // InternalMontiArcDSL.g:3342:2: ( rule__Variable__ParametersAssignment_2_2_1 )
            // InternalMontiArcDSL.g:3342:3: rule__Variable__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_2_2__1__Impl"


    // $ANTLR start "rule__Automaton__Group__0"
    // InternalMontiArcDSL.g:3351:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3355:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalMontiArcDSL.g:3356:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMontiArcDSL.g:3363:1: rule__Automaton__Group__0__Impl : ( () ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3367:1: ( ( () ) )
            // InternalMontiArcDSL.g:3368:1: ( () )
            {
            // InternalMontiArcDSL.g:3368:1: ( () )
            // InternalMontiArcDSL.g:3369:2: ()
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 
            // InternalMontiArcDSL.g:3370:2: ()
            // InternalMontiArcDSL.g:3370:3: 
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
    // InternalMontiArcDSL.g:3378:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3382:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalMontiArcDSL.g:3383:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMontiArcDSL.g:3390:1: rule__Automaton__Group__1__Impl : ( ( rule__Automaton__SyncAssignment_1 )? ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3394:1: ( ( ( rule__Automaton__SyncAssignment_1 )? ) )
            // InternalMontiArcDSL.g:3395:1: ( ( rule__Automaton__SyncAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:3395:1: ( ( rule__Automaton__SyncAssignment_1 )? )
            // InternalMontiArcDSL.g:3396:2: ( rule__Automaton__SyncAssignment_1 )?
            {
             before(grammarAccess.getAutomatonAccess().getSyncAssignment_1()); 
            // InternalMontiArcDSL.g:3397:2: ( rule__Automaton__SyncAssignment_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_SYNC) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMontiArcDSL.g:3397:3: rule__Automaton__SyncAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__SyncAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getSyncAssignment_1()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:3405:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3409:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalMontiArcDSL.g:3410:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3417:1: rule__Automaton__Group__2__Impl : ( 'automaton' ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3421:1: ( ( 'automaton' ) )
            // InternalMontiArcDSL.g:3422:1: ( 'automaton' )
            {
            // InternalMontiArcDSL.g:3422:1: ( 'automaton' )
            // InternalMontiArcDSL.g:3423:2: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getAutomatonKeyword_2()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:3432:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3436:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalMontiArcDSL.g:3437:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3444:1: rule__Automaton__Group__3__Impl : ( ( rule__Automaton__NameAssignment_3 )? ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3448:1: ( ( ( rule__Automaton__NameAssignment_3 )? ) )
            // InternalMontiArcDSL.g:3449:1: ( ( rule__Automaton__NameAssignment_3 )? )
            {
            // InternalMontiArcDSL.g:3449:1: ( ( rule__Automaton__NameAssignment_3 )? )
            // InternalMontiArcDSL.g:3450:2: ( rule__Automaton__NameAssignment_3 )?
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_3()); 
            // InternalMontiArcDSL.g:3451:2: ( rule__Automaton__NameAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMontiArcDSL.g:3451:3: rule__Automaton__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automaton__NameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomatonAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:3459:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3463:1: ( rule__Automaton__Group__4__Impl rule__Automaton__Group__5 )
            // InternalMontiArcDSL.g:3464:2: rule__Automaton__Group__4__Impl rule__Automaton__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMontiArcDSL.g:3471:1: rule__Automaton__Group__4__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3475:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:3476:1: ( '{' )
            {
            // InternalMontiArcDSL.g:3476:1: ( '{' )
            // InternalMontiArcDSL.g:3477:2: '{'
            {
             before(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:3486:1: rule__Automaton__Group__5 : rule__Automaton__Group__5__Impl rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3490:1: ( rule__Automaton__Group__5__Impl rule__Automaton__Group__6 )
            // InternalMontiArcDSL.g:3491:2: rule__Automaton__Group__5__Impl rule__Automaton__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Automaton__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automaton__Group__6();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:3498:1: rule__Automaton__Group__5__Impl : ( ( rule__Automaton__Alternatives_5 )* ) ;
    public final void rule__Automaton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3502:1: ( ( ( rule__Automaton__Alternatives_5 )* ) )
            // InternalMontiArcDSL.g:3503:1: ( ( rule__Automaton__Alternatives_5 )* )
            {
            // InternalMontiArcDSL.g:3503:1: ( ( rule__Automaton__Alternatives_5 )* )
            // InternalMontiArcDSL.g:3504:2: ( rule__Automaton__Alternatives_5 )*
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_5()); 
            // InternalMontiArcDSL.g:3505:2: ( rule__Automaton__Alternatives_5 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||(LA40_0>=33 && LA40_0<=34)||LA40_0==44||LA40_0==58) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3505:3: rule__Automaton__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Automaton__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getAutomatonAccess().getAlternatives_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Automaton__Group__6"
    // InternalMontiArcDSL.g:3513:1: rule__Automaton__Group__6 : rule__Automaton__Group__6__Impl ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3517:1: ( rule__Automaton__Group__6__Impl )
            // InternalMontiArcDSL.g:3518:2: rule__Automaton__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automaton__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__6"


    // $ANTLR start "rule__Automaton__Group__6__Impl"
    // InternalMontiArcDSL.g:3524:1: rule__Automaton__Group__6__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3528:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:3529:1: ( '}' )
            {
            // InternalMontiArcDSL.g:3529:1: ( '}' )
            // InternalMontiArcDSL.g:3530:2: '}'
            {
             before(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__Group__6__Impl"


    // $ANTLR start "rule__SCState__Group__0"
    // InternalMontiArcDSL.g:3540:1: rule__SCState__Group__0 : rule__SCState__Group__0__Impl rule__SCState__Group__1 ;
    public final void rule__SCState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3544:1: ( rule__SCState__Group__0__Impl rule__SCState__Group__1 )
            // InternalMontiArcDSL.g:3545:2: rule__SCState__Group__0__Impl rule__SCState__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SCState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__0"


    // $ANTLR start "rule__SCState__Group__0__Impl"
    // InternalMontiArcDSL.g:3552:1: rule__SCState__Group__0__Impl : ( ( rule__SCState__ModifierAssignment_0 )* ) ;
    public final void rule__SCState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3556:1: ( ( ( rule__SCState__ModifierAssignment_0 )* ) )
            // InternalMontiArcDSL.g:3557:1: ( ( rule__SCState__ModifierAssignment_0 )* )
            {
            // InternalMontiArcDSL.g:3557:1: ( ( rule__SCState__ModifierAssignment_0 )* )
            // InternalMontiArcDSL.g:3558:2: ( rule__SCState__ModifierAssignment_0 )*
            {
             before(grammarAccess.getSCStateAccess().getModifierAssignment_0()); 
            // InternalMontiArcDSL.g:3559:2: ( rule__SCState__ModifierAssignment_0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=33 && LA41_0<=34)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3559:3: rule__SCState__ModifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SCState__ModifierAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getSCStateAccess().getModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__0__Impl"


    // $ANTLR start "rule__SCState__Group__1"
    // InternalMontiArcDSL.g:3567:1: rule__SCState__Group__1 : rule__SCState__Group__1__Impl rule__SCState__Group__2 ;
    public final void rule__SCState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3571:1: ( rule__SCState__Group__1__Impl rule__SCState__Group__2 )
            // InternalMontiArcDSL.g:3572:2: rule__SCState__Group__1__Impl rule__SCState__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__SCState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__1"


    // $ANTLR start "rule__SCState__Group__1__Impl"
    // InternalMontiArcDSL.g:3579:1: rule__SCState__Group__1__Impl : ( ( rule__SCState__AnteAssignment_1 )? ) ;
    public final void rule__SCState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3583:1: ( ( ( rule__SCState__AnteAssignment_1 )? ) )
            // InternalMontiArcDSL.g:3584:1: ( ( rule__SCState__AnteAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:3584:1: ( ( rule__SCState__AnteAssignment_1 )? )
            // InternalMontiArcDSL.g:3585:2: ( rule__SCState__AnteAssignment_1 )?
            {
             before(grammarAccess.getSCStateAccess().getAnteAssignment_1()); 
            // InternalMontiArcDSL.g:3586:2: ( rule__SCState__AnteAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMontiArcDSL.g:3586:3: rule__SCState__AnteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SCState__AnteAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSCStateAccess().getAnteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__1__Impl"


    // $ANTLR start "rule__SCState__Group__2"
    // InternalMontiArcDSL.g:3594:1: rule__SCState__Group__2 : rule__SCState__Group__2__Impl rule__SCState__Group__3 ;
    public final void rule__SCState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3598:1: ( rule__SCState__Group__2__Impl rule__SCState__Group__3 )
            // InternalMontiArcDSL.g:3599:2: rule__SCState__Group__2__Impl rule__SCState__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SCState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__2"


    // $ANTLR start "rule__SCState__Group__2__Impl"
    // InternalMontiArcDSL.g:3606:1: rule__SCState__Group__2__Impl : ( 'state' ) ;
    public final void rule__SCState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3610:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:3611:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:3611:1: ( 'state' )
            // InternalMontiArcDSL.g:3612:2: 'state'
            {
             before(grammarAccess.getSCStateAccess().getStateKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSCStateAccess().getStateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__2__Impl"


    // $ANTLR start "rule__SCState__Group__3"
    // InternalMontiArcDSL.g:3621:1: rule__SCState__Group__3 : rule__SCState__Group__3__Impl rule__SCState__Group__4 ;
    public final void rule__SCState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3625:1: ( rule__SCState__Group__3__Impl rule__SCState__Group__4 )
            // InternalMontiArcDSL.g:3626:2: rule__SCState__Group__3__Impl rule__SCState__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SCState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__3"


    // $ANTLR start "rule__SCState__Group__3__Impl"
    // InternalMontiArcDSL.g:3633:1: rule__SCState__Group__3__Impl : ( ( rule__SCState__NameAssignment_3 ) ) ;
    public final void rule__SCState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3637:1: ( ( ( rule__SCState__NameAssignment_3 ) ) )
            // InternalMontiArcDSL.g:3638:1: ( ( rule__SCState__NameAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:3638:1: ( ( rule__SCState__NameAssignment_3 ) )
            // InternalMontiArcDSL.g:3639:2: ( rule__SCState__NameAssignment_3 )
            {
             before(grammarAccess.getSCStateAccess().getNameAssignment_3()); 
            // InternalMontiArcDSL.g:3640:2: ( rule__SCState__NameAssignment_3 )
            // InternalMontiArcDSL.g:3640:3: rule__SCState__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SCState__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSCStateAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__3__Impl"


    // $ANTLR start "rule__SCState__Group__4"
    // InternalMontiArcDSL.g:3648:1: rule__SCState__Group__4 : rule__SCState__Group__4__Impl ;
    public final void rule__SCState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3652:1: ( rule__SCState__Group__4__Impl )
            // InternalMontiArcDSL.g:3653:2: rule__SCState__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__4"


    // $ANTLR start "rule__SCState__Group__4__Impl"
    // InternalMontiArcDSL.g:3659:1: rule__SCState__Group__4__Impl : ( ';' ) ;
    public final void rule__SCState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3663:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3664:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3664:1: ( ';' )
            // InternalMontiArcDSL.g:3665:2: ';'
            {
             before(grammarAccess.getSCStateAccess().getSemicolonKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSCStateAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__Group__4__Impl"


    // $ANTLR start "rule__InvState__Group__0"
    // InternalMontiArcDSL.g:3675:1: rule__InvState__Group__0 : rule__InvState__Group__0__Impl rule__InvState__Group__1 ;
    public final void rule__InvState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3679:1: ( rule__InvState__Group__0__Impl rule__InvState__Group__1 )
            // InternalMontiArcDSL.g:3680:2: rule__InvState__Group__0__Impl rule__InvState__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__InvState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__0"


    // $ANTLR start "rule__InvState__Group__0__Impl"
    // InternalMontiArcDSL.g:3687:1: rule__InvState__Group__0__Impl : ( ( rule__InvState__ModifierAssignment_0 )* ) ;
    public final void rule__InvState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3691:1: ( ( ( rule__InvState__ModifierAssignment_0 )* ) )
            // InternalMontiArcDSL.g:3692:1: ( ( rule__InvState__ModifierAssignment_0 )* )
            {
            // InternalMontiArcDSL.g:3692:1: ( ( rule__InvState__ModifierAssignment_0 )* )
            // InternalMontiArcDSL.g:3693:2: ( rule__InvState__ModifierAssignment_0 )*
            {
             before(grammarAccess.getInvStateAccess().getModifierAssignment_0()); 
            // InternalMontiArcDSL.g:3694:2: ( rule__InvState__ModifierAssignment_0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=33 && LA43_0<=34)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3694:3: rule__InvState__ModifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__InvState__ModifierAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getInvStateAccess().getModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__0__Impl"


    // $ANTLR start "rule__InvState__Group__1"
    // InternalMontiArcDSL.g:3702:1: rule__InvState__Group__1 : rule__InvState__Group__1__Impl rule__InvState__Group__2 ;
    public final void rule__InvState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3706:1: ( rule__InvState__Group__1__Impl rule__InvState__Group__2 )
            // InternalMontiArcDSL.g:3707:2: rule__InvState__Group__1__Impl rule__InvState__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InvState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__1"


    // $ANTLR start "rule__InvState__Group__1__Impl"
    // InternalMontiArcDSL.g:3714:1: rule__InvState__Group__1__Impl : ( 'state' ) ;
    public final void rule__InvState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3718:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:3719:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:3719:1: ( 'state' )
            // InternalMontiArcDSL.g:3720:2: 'state'
            {
             before(grammarAccess.getInvStateAccess().getStateKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__1__Impl"


    // $ANTLR start "rule__InvState__Group__2"
    // InternalMontiArcDSL.g:3729:1: rule__InvState__Group__2 : rule__InvState__Group__2__Impl rule__InvState__Group__3 ;
    public final void rule__InvState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3733:1: ( rule__InvState__Group__2__Impl rule__InvState__Group__3 )
            // InternalMontiArcDSL.g:3734:2: rule__InvState__Group__2__Impl rule__InvState__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__InvState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__2"


    // $ANTLR start "rule__InvState__Group__2__Impl"
    // InternalMontiArcDSL.g:3741:1: rule__InvState__Group__2__Impl : ( ( rule__InvState__NameAssignment_2 ) ) ;
    public final void rule__InvState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3745:1: ( ( ( rule__InvState__NameAssignment_2 ) ) )
            // InternalMontiArcDSL.g:3746:1: ( ( rule__InvState__NameAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:3746:1: ( ( rule__InvState__NameAssignment_2 ) )
            // InternalMontiArcDSL.g:3747:2: ( rule__InvState__NameAssignment_2 )
            {
             before(grammarAccess.getInvStateAccess().getNameAssignment_2()); 
            // InternalMontiArcDSL.g:3748:2: ( rule__InvState__NameAssignment_2 )
            // InternalMontiArcDSL.g:3748:3: rule__InvState__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InvState__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInvStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__2__Impl"


    // $ANTLR start "rule__InvState__Group__3"
    // InternalMontiArcDSL.g:3756:1: rule__InvState__Group__3 : rule__InvState__Group__3__Impl rule__InvState__Group__4 ;
    public final void rule__InvState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3760:1: ( rule__InvState__Group__3__Impl rule__InvState__Group__4 )
            // InternalMontiArcDSL.g:3761:2: rule__InvState__Group__3__Impl rule__InvState__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__InvState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__3"


    // $ANTLR start "rule__InvState__Group__3__Impl"
    // InternalMontiArcDSL.g:3768:1: rule__InvState__Group__3__Impl : ( '[' ) ;
    public final void rule__InvState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3772:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3773:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3773:1: ( '[' )
            // InternalMontiArcDSL.g:3774:2: '['
            {
             before(grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__3__Impl"


    // $ANTLR start "rule__InvState__Group__4"
    // InternalMontiArcDSL.g:3783:1: rule__InvState__Group__4 : rule__InvState__Group__4__Impl rule__InvState__Group__5 ;
    public final void rule__InvState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3787:1: ( rule__InvState__Group__4__Impl rule__InvState__Group__5 )
            // InternalMontiArcDSL.g:3788:2: rule__InvState__Group__4__Impl rule__InvState__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__InvState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__4"


    // $ANTLR start "rule__InvState__Group__4__Impl"
    // InternalMontiArcDSL.g:3795:1: rule__InvState__Group__4__Impl : ( ( rule__InvState__ExpressionAssignment_4 ) ) ;
    public final void rule__InvState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3799:1: ( ( ( rule__InvState__ExpressionAssignment_4 ) ) )
            // InternalMontiArcDSL.g:3800:1: ( ( rule__InvState__ExpressionAssignment_4 ) )
            {
            // InternalMontiArcDSL.g:3800:1: ( ( rule__InvState__ExpressionAssignment_4 ) )
            // InternalMontiArcDSL.g:3801:2: ( rule__InvState__ExpressionAssignment_4 )
            {
             before(grammarAccess.getInvStateAccess().getExpressionAssignment_4()); 
            // InternalMontiArcDSL.g:3802:2: ( rule__InvState__ExpressionAssignment_4 )
            // InternalMontiArcDSL.g:3802:3: rule__InvState__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InvState__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInvStateAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__4__Impl"


    // $ANTLR start "rule__InvState__Group__5"
    // InternalMontiArcDSL.g:3810:1: rule__InvState__Group__5 : rule__InvState__Group__5__Impl rule__InvState__Group__6 ;
    public final void rule__InvState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3814:1: ( rule__InvState__Group__5__Impl rule__InvState__Group__6 )
            // InternalMontiArcDSL.g:3815:2: rule__InvState__Group__5__Impl rule__InvState__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__InvState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InvState__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__5"


    // $ANTLR start "rule__InvState__Group__5__Impl"
    // InternalMontiArcDSL.g:3822:1: rule__InvState__Group__5__Impl : ( ']' ) ;
    public final void rule__InvState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3826:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3827:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3827:1: ( ']' )
            // InternalMontiArcDSL.g:3828:2: ']'
            {
             before(grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__5__Impl"


    // $ANTLR start "rule__InvState__Group__6"
    // InternalMontiArcDSL.g:3837:1: rule__InvState__Group__6 : rule__InvState__Group__6__Impl ;
    public final void rule__InvState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3841:1: ( rule__InvState__Group__6__Impl )
            // InternalMontiArcDSL.g:3842:2: rule__InvState__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InvState__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__6"


    // $ANTLR start "rule__InvState__Group__6__Impl"
    // InternalMontiArcDSL.g:3848:1: rule__InvState__Group__6__Impl : ( ';' ) ;
    public final void rule__InvState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3852:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3853:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3853:1: ( ';' )
            // InternalMontiArcDSL.g:3854:2: ';'
            {
             before(grammarAccess.getInvStateAccess().getSemicolonKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__Group__6__Impl"


    // $ANTLR start "rule__SCSAnte__Group__0"
    // InternalMontiArcDSL.g:3864:1: rule__SCSAnte__Group__0 : rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1 ;
    public final void rule__SCSAnte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3868:1: ( rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1 )
            // InternalMontiArcDSL.g:3869:2: rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SCSAnte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCSAnte__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCSAnte__Group__0"


    // $ANTLR start "rule__SCSAnte__Group__0__Impl"
    // InternalMontiArcDSL.g:3876:1: rule__SCSAnte__Group__0__Impl : ( () ) ;
    public final void rule__SCSAnte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3880:1: ( ( () ) )
            // InternalMontiArcDSL.g:3881:1: ( () )
            {
            // InternalMontiArcDSL.g:3881:1: ( () )
            // InternalMontiArcDSL.g:3882:2: ()
            {
             before(grammarAccess.getSCSAnteAccess().getSCSAnteAction_0()); 
            // InternalMontiArcDSL.g:3883:2: ()
            // InternalMontiArcDSL.g:3883:3: 
            {
            }

             after(grammarAccess.getSCSAnteAccess().getSCSAnteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCSAnte__Group__0__Impl"


    // $ANTLR start "rule__SCSAnte__Group__1"
    // InternalMontiArcDSL.g:3891:1: rule__SCSAnte__Group__1 : rule__SCSAnte__Group__1__Impl ;
    public final void rule__SCSAnte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3895:1: ( rule__SCSAnte__Group__1__Impl )
            // InternalMontiArcDSL.g:3896:2: rule__SCSAnte__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCSAnte__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCSAnte__Group__1"


    // $ANTLR start "rule__SCSAnte__Group__1__Impl"
    // InternalMontiArcDSL.g:3902:1: rule__SCSAnte__Group__1__Impl : ( ( rule__SCSAnte__BlockAssignment_1 ) ) ;
    public final void rule__SCSAnte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3906:1: ( ( ( rule__SCSAnte__BlockAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3907:1: ( ( rule__SCSAnte__BlockAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3907:1: ( ( rule__SCSAnte__BlockAssignment_1 ) )
            // InternalMontiArcDSL.g:3908:2: ( rule__SCSAnte__BlockAssignment_1 )
            {
             before(grammarAccess.getSCSAnteAccess().getBlockAssignment_1()); 
            // InternalMontiArcDSL.g:3909:2: ( rule__SCSAnte__BlockAssignment_1 )
            // InternalMontiArcDSL.g:3909:3: rule__SCSAnte__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SCSAnte__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSCSAnteAccess().getBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCSAnte__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMontiArcDSL.g:3918:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3922:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMontiArcDSL.g:3923:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMontiArcDSL.g:3930:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3934:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:3935:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:3935:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:3936:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:3937:2: ( rule__Transition__SourceAssignment_0 )
            // InternalMontiArcDSL.g:3937:3: rule__Transition__SourceAssignment_0
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
    // InternalMontiArcDSL.g:3945:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3949:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMontiArcDSL.g:3950:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMontiArcDSL.g:3957:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3961:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:3962:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:3962:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalMontiArcDSL.g:3963:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:3964:2: ( rule__Transition__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMontiArcDSL.g:3964:3: rule__Transition__Group_1__0
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
    // InternalMontiArcDSL.g:3972:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3976:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMontiArcDSL.g:3977:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMontiArcDSL.g:3984:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3988:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:3989:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:3989:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMontiArcDSL.g:3990:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3991:2: ( rule__Transition__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==59) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMontiArcDSL.g:3991:3: rule__Transition__Group_2__0
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
    // InternalMontiArcDSL.g:3999:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4003:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMontiArcDSL.g:4004:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMontiArcDSL.g:4011:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4015:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalMontiArcDSL.g:4016:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalMontiArcDSL.g:4016:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalMontiArcDSL.g:4017:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:4018:2: ( rule__Transition__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMontiArcDSL.g:4018:3: rule__Transition__Group_3__0
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
    // InternalMontiArcDSL.g:4026:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4030:1: ( rule__Transition__Group__4__Impl )
            // InternalMontiArcDSL.g:4031:2: rule__Transition__Group__4__Impl
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
    // InternalMontiArcDSL.g:4037:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4041:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4042:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4042:1: ( ';' )
            // InternalMontiArcDSL.g:4043:2: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4053:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4057:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalMontiArcDSL.g:4058:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalMontiArcDSL.g:4065:1: rule__Transition__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4069:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:4070:1: ( '->' )
            {
            // InternalMontiArcDSL.g:4070:1: ( '->' )
            // InternalMontiArcDSL.g:4071:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4080:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4084:1: ( rule__Transition__Group_1__1__Impl )
            // InternalMontiArcDSL.g:4085:2: rule__Transition__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:4091:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TargetAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4095:1: ( ( ( rule__Transition__TargetAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:4096:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:4096:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            // InternalMontiArcDSL.g:4097:2: ( rule__Transition__TargetAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 
            // InternalMontiArcDSL.g:4098:2: ( rule__Transition__TargetAssignment_1_1 )
            // InternalMontiArcDSL.g:4098:3: rule__Transition__TargetAssignment_1_1
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
    // InternalMontiArcDSL.g:4107:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4111:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMontiArcDSL.g:4112:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalMontiArcDSL.g:4119:1: rule__Transition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4123:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:4124:1: ( '[' )
            {
            // InternalMontiArcDSL.g:4124:1: ( '[' )
            // InternalMontiArcDSL.g:4125:2: '['
            {
             before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4134:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4138:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalMontiArcDSL.g:4139:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMontiArcDSL.g:4146:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4150:1: ( ( ( rule__Transition__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:4151:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:4151:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:4152:2: ( rule__Transition__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:4153:2: ( rule__Transition__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:4153:3: rule__Transition__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:4161:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4165:1: ( rule__Transition__Group_2__2__Impl )
            // InternalMontiArcDSL.g:4166:2: rule__Transition__Group_2__2__Impl
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
    // InternalMontiArcDSL.g:4172:1: rule__Transition__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4176:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:4177:1: ( ']' )
            {
            // InternalMontiArcDSL.g:4177:1: ( ']' )
            // InternalMontiArcDSL.g:4178:2: ']'
            {
             before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4188:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4192:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalMontiArcDSL.g:4193:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
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
    // InternalMontiArcDSL.g:4200:1: rule__Transition__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4204:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:4205:1: ( '/' )
            {
            // InternalMontiArcDSL.g:4205:1: ( '/' )
            // InternalMontiArcDSL.g:4206:2: '/'
            {
             before(grammarAccess.getTransitionAccess().getSolidusKeyword_3_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4215:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4219:1: ( rule__Transition__Group_3__1__Impl )
            // InternalMontiArcDSL.g:4220:2: rule__Transition__Group_3__1__Impl
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
    // InternalMontiArcDSL.g:4226:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ReactionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4230:1: ( ( ( rule__Transition__ReactionAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:4231:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:4231:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            // InternalMontiArcDSL.g:4232:2: ( rule__Transition__ReactionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 
            // InternalMontiArcDSL.g:4233:2: ( rule__Transition__ReactionAssignment_3_1 )
            // InternalMontiArcDSL.g:4233:3: rule__Transition__ReactionAssignment_3_1
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
    // InternalMontiArcDSL.g:4242:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4246:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMontiArcDSL.g:4247:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMontiArcDSL.g:4254:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4258:1: ( ( () ) )
            // InternalMontiArcDSL.g:4259:1: ( () )
            {
            // InternalMontiArcDSL.g:4259:1: ( () )
            // InternalMontiArcDSL.g:4260:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalMontiArcDSL.g:4261:2: ()
            // InternalMontiArcDSL.g:4261:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalMontiArcDSL.g:4269:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4273:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMontiArcDSL.g:4274:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMontiArcDSL.g:4281:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4285:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:4286:1: ( '{' )
            {
            // InternalMontiArcDSL.g:4286:1: ( '{' )
            // InternalMontiArcDSL.g:4287:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:4296:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4300:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMontiArcDSL.g:4301:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalMontiArcDSL.g:4308:1: rule__Block__Group__2__Impl : ( ( rule__Block__BlocksAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4312:1: ( ( ( rule__Block__BlocksAssignment_2 )* ) )
            // InternalMontiArcDSL.g:4313:1: ( ( rule__Block__BlocksAssignment_2 )* )
            {
            // InternalMontiArcDSL.g:4313:1: ( ( rule__Block__BlocksAssignment_2 )* )
            // InternalMontiArcDSL.g:4314:2: ( rule__Block__BlocksAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getBlocksAssignment_2()); 
            // InternalMontiArcDSL.g:4315:2: ( rule__Block__BlocksAssignment_2 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_MCQUALIFIEDNAME)||LA47_0==RULE_STRING||LA47_0==RULE_INT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMontiArcDSL.g:4315:3: rule__Block__BlocksAssignment_2
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Block__BlocksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getBlocksAssignment_2()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:4323:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4327:1: ( rule__Block__Group__3__Impl )
            // InternalMontiArcDSL.g:4328:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMontiArcDSL.g:4334:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4338:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:4339:1: ( '}' )
            {
            // InternalMontiArcDSL.g:4339:1: ( '}' )
            // InternalMontiArcDSL.g:4340:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__SimpleExpression__Group__0"
    // InternalMontiArcDSL.g:4350:1: rule__SimpleExpression__Group__0 : rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1 ;
    public final void rule__SimpleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4354:1: ( rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1 )
            // InternalMontiArcDSL.g:4355:2: rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SimpleExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpression__Group__0"


    // $ANTLR start "rule__SimpleExpression__Group__0__Impl"
    // InternalMontiArcDSL.g:4362:1: rule__SimpleExpression__Group__0__Impl : ( ( rule__SimpleExpression__ExpressionAssignment_0 ) ) ;
    public final void rule__SimpleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4366:1: ( ( ( rule__SimpleExpression__ExpressionAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4367:1: ( ( rule__SimpleExpression__ExpressionAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4367:1: ( ( rule__SimpleExpression__ExpressionAssignment_0 ) )
            // InternalMontiArcDSL.g:4368:2: ( rule__SimpleExpression__ExpressionAssignment_0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getExpressionAssignment_0()); 
            // InternalMontiArcDSL.g:4369:2: ( rule__SimpleExpression__ExpressionAssignment_0 )
            // InternalMontiArcDSL.g:4369:3: rule__SimpleExpression__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpression__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpressionAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpression__Group__0__Impl"


    // $ANTLR start "rule__SimpleExpression__Group__1"
    // InternalMontiArcDSL.g:4377:1: rule__SimpleExpression__Group__1 : rule__SimpleExpression__Group__1__Impl ;
    public final void rule__SimpleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4381:1: ( rule__SimpleExpression__Group__1__Impl )
            // InternalMontiArcDSL.g:4382:2: rule__SimpleExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpression__Group__1"


    // $ANTLR start "rule__SimpleExpression__Group__1__Impl"
    // InternalMontiArcDSL.g:4388:1: rule__SimpleExpression__Group__1__Impl : ( ';' ) ;
    public final void rule__SimpleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4392:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4393:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4393:1: ( ';' )
            // InternalMontiArcDSL.g:4394:2: ';'
            {
             before(grammarAccess.getSimpleExpressionAccess().getSemicolonKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimpleExpressionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpression__Group__1__Impl"


    // $ANTLR start "rule__SimpleInit__Group__0"
    // InternalMontiArcDSL.g:4404:1: rule__SimpleInit__Group__0 : rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1 ;
    public final void rule__SimpleInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4408:1: ( rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1 )
            // InternalMontiArcDSL.g:4409:2: rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SimpleInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__0"


    // $ANTLR start "rule__SimpleInit__Group__0__Impl"
    // InternalMontiArcDSL.g:4416:1: rule__SimpleInit__Group__0__Impl : ( ( rule__SimpleInit__NameAssignment_0 ) ) ;
    public final void rule__SimpleInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4420:1: ( ( ( rule__SimpleInit__NameAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4421:1: ( ( rule__SimpleInit__NameAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4421:1: ( ( rule__SimpleInit__NameAssignment_0 ) )
            // InternalMontiArcDSL.g:4422:2: ( rule__SimpleInit__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleInitAccess().getNameAssignment_0()); 
            // InternalMontiArcDSL.g:4423:2: ( rule__SimpleInit__NameAssignment_0 )
            // InternalMontiArcDSL.g:4423:3: rule__SimpleInit__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleInitAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__0__Impl"


    // $ANTLR start "rule__SimpleInit__Group__1"
    // InternalMontiArcDSL.g:4431:1: rule__SimpleInit__Group__1 : rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2 ;
    public final void rule__SimpleInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4435:1: ( rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2 )
            // InternalMontiArcDSL.g:4436:2: rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SimpleInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__1"


    // $ANTLR start "rule__SimpleInit__Group__1__Impl"
    // InternalMontiArcDSL.g:4443:1: rule__SimpleInit__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4447:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:4448:1: ( '=' )
            {
            // InternalMontiArcDSL.g:4448:1: ( '=' )
            // InternalMontiArcDSL.g:4449:2: '='
            {
             before(grammarAccess.getSimpleInitAccess().getEqualsSignKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSimpleInitAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__1__Impl"


    // $ANTLR start "rule__SimpleInit__Group__2"
    // InternalMontiArcDSL.g:4458:1: rule__SimpleInit__Group__2 : rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3 ;
    public final void rule__SimpleInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4462:1: ( rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3 )
            // InternalMontiArcDSL.g:4463:2: rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SimpleInit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__2"


    // $ANTLR start "rule__SimpleInit__Group__2__Impl"
    // InternalMontiArcDSL.g:4470:1: rule__SimpleInit__Group__2__Impl : ( ( rule__SimpleInit__ExpressionsAssignment_2 ) ) ;
    public final void rule__SimpleInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4474:1: ( ( ( rule__SimpleInit__ExpressionsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:4475:1: ( ( rule__SimpleInit__ExpressionsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:4475:1: ( ( rule__SimpleInit__ExpressionsAssignment_2 ) )
            // InternalMontiArcDSL.g:4476:2: ( rule__SimpleInit__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getSimpleInitAccess().getExpressionsAssignment_2()); 
            // InternalMontiArcDSL.g:4477:2: ( rule__SimpleInit__ExpressionsAssignment_2 )
            // InternalMontiArcDSL.g:4477:3: rule__SimpleInit__ExpressionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__ExpressionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleInitAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__2__Impl"


    // $ANTLR start "rule__SimpleInit__Group__3"
    // InternalMontiArcDSL.g:4485:1: rule__SimpleInit__Group__3 : rule__SimpleInit__Group__3__Impl ;
    public final void rule__SimpleInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4489:1: ( rule__SimpleInit__Group__3__Impl )
            // InternalMontiArcDSL.g:4490:2: rule__SimpleInit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleInit__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__3"


    // $ANTLR start "rule__SimpleInit__Group__3__Impl"
    // InternalMontiArcDSL.g:4496:1: rule__SimpleInit__Group__3__Impl : ( ';' ) ;
    public final void rule__SimpleInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4500:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4501:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4501:1: ( ';' )
            // InternalMontiArcDSL.g:4502:2: ';'
            {
             before(grammarAccess.getSimpleInitAccess().getSemicolonKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimpleInitAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__Group__3__Impl"


    // $ANTLR start "rule__ImportStatements__Group__0"
    // InternalMontiArcDSL.g:4512:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4516:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiArcDSL.g:4517:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMontiArcDSL.g:4524:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4528:1: ( ( 'import' ) )
            // InternalMontiArcDSL.g:4529:1: ( 'import' )
            {
            // InternalMontiArcDSL.g:4529:1: ( 'import' )
            // InternalMontiArcDSL.g:4530:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4539:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4543:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiArcDSL.g:4544:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMontiArcDSL.g:4551:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4555:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4556:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4556:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiArcDSL.g:4557:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiArcDSL.g:4558:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiArcDSL.g:4558:3: rule__ImportStatements__ImportUriAssignment_1
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
    // InternalMontiArcDSL.g:4566:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4570:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiArcDSL.g:4571:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalMontiArcDSL.g:4578:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__StarAssignment_2 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4582:1: ( ( ( rule__ImportStatements__StarAssignment_2 )? ) )
            // InternalMontiArcDSL.g:4583:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:4583:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            // InternalMontiArcDSL.g:4584:2: ( rule__ImportStatements__StarAssignment_2 )?
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 
            // InternalMontiArcDSL.g:4585:2: ( rule__ImportStatements__StarAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DOTSTAR) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMontiArcDSL.g:4585:3: rule__ImportStatements__StarAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImportStatements__StarAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:4593:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4597:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiArcDSL.g:4598:2: rule__ImportStatements__Group__3__Impl
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
    // InternalMontiArcDSL.g:4604:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4608:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4609:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4609:1: ( ';' )
            // InternalMontiArcDSL.g:4610:2: ';'
            {
             before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__Package__Group__0"
    // InternalMontiArcDSL.g:4620:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4624:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiArcDSL.g:4625:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiArcDSL.g:4632:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4636:1: ( ( 'package' ) )
            // InternalMontiArcDSL.g:4637:1: ( 'package' )
            {
            // InternalMontiArcDSL.g:4637:1: ( 'package' )
            // InternalMontiArcDSL.g:4638:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4647:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4651:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiArcDSL.g:4652:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalMontiArcDSL.g:4659:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4663:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4664:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4664:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:4665:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:4666:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiArcDSL.g:4666:3: rule__Package__NameAssignment_1
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
    // InternalMontiArcDSL.g:4674:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4678:1: ( rule__Package__Group__2__Impl )
            // InternalMontiArcDSL.g:4679:2: rule__Package__Group__2__Impl
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
    // InternalMontiArcDSL.g:4685:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4689:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4690:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4690:1: ( ';' )
            // InternalMontiArcDSL.g:4691:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4701:1: rule__MCCollectionType__Group__0 : rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 ;
    public final void rule__MCCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4705:1: ( rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 )
            // InternalMontiArcDSL.g:4706:2: rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMontiArcDSL.g:4713:1: rule__MCCollectionType__Group__0__Impl : ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__MCCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4717:1: ( ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4718:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4718:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            // InternalMontiArcDSL.g:4719:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalMontiArcDSL.g:4720:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            // InternalMontiArcDSL.g:4720:3: rule__MCCollectionType__CollectionAssignment_0
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
    // InternalMontiArcDSL.g:4728:1: rule__MCCollectionType__Group__1 : rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 ;
    public final void rule__MCCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4732:1: ( rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 )
            // InternalMontiArcDSL.g:4733:2: rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2
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
    // InternalMontiArcDSL.g:4740:1: rule__MCCollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__MCCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4744:1: ( ( '<' ) )
            // InternalMontiArcDSL.g:4745:1: ( '<' )
            {
            // InternalMontiArcDSL.g:4745:1: ( '<' )
            // InternalMontiArcDSL.g:4746:2: '<'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4755:1: rule__MCCollectionType__Group__2 : rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 ;
    public final void rule__MCCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4759:1: ( rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 )
            // InternalMontiArcDSL.g:4760:2: rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMontiArcDSL.g:4767:1: rule__MCCollectionType__Group__2__Impl : ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__MCCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4771:1: ( ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) )
            // InternalMontiArcDSL.g:4772:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:4772:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            // InternalMontiArcDSL.g:4773:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalMontiArcDSL.g:4774:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            // InternalMontiArcDSL.g:4774:3: rule__MCCollectionType__InnerTypeAssignment_2
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
    // InternalMontiArcDSL.g:4782:1: rule__MCCollectionType__Group__3 : rule__MCCollectionType__Group__3__Impl ;
    public final void rule__MCCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4786:1: ( rule__MCCollectionType__Group__3__Impl )
            // InternalMontiArcDSL.g:4787:2: rule__MCCollectionType__Group__3__Impl
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
    // InternalMontiArcDSL.g:4793:1: rule__MCCollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__MCCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4797:1: ( ( '>' ) )
            // InternalMontiArcDSL.g:4798:1: ( '>' )
            {
            // InternalMontiArcDSL.g:4798:1: ( '>' )
            // InternalMontiArcDSL.g:4799:2: '>'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4809:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4813:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiArcDSL.g:4814:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMontiArcDSL.g:4821:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4825:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiArcDSL.g:4826:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiArcDSL.g:4826:1: ( ruleMCPrimitiveType )
            // InternalMontiArcDSL.g:4827:2: ruleMCPrimitiveType
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
    // InternalMontiArcDSL.g:4836:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4840:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiArcDSL.g:4841:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMontiArcDSL.g:4848:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4852:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:4853:1: ( '[' )
            {
            // InternalMontiArcDSL.g:4853:1: ( '[' )
            // InternalMontiArcDSL.g:4854:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4863:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4867:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiArcDSL.g:4868:2: rule__MCArrayType__Group__2__Impl
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
    // InternalMontiArcDSL.g:4874:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4878:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:4879:1: ( ']' )
            {
            // InternalMontiArcDSL.g:4879:1: ( ']' )
            // InternalMontiArcDSL.g:4880:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,60,FOLLOW_2); 
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


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalMontiArcDSL.g:4890:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4894:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMontiArcDSL.g:4895:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalMontiArcDSL.g:4902:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4906:1: ( ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) )
            // InternalMontiArcDSL.g:4907:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            {
            // InternalMontiArcDSL.g:4907:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            // InternalMontiArcDSL.g:4908:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 
            // InternalMontiArcDSL.g:4909:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            // InternalMontiArcDSL.g:4909:3: rule__BinaryExpression__Literal1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalMontiArcDSL.g:4917:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4921:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMontiArcDSL.g:4922:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalMontiArcDSL.g:4929:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__OpAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4933:1: ( ( ( rule__BinaryExpression__OpAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4934:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4934:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            // InternalMontiArcDSL.g:4935:2: ( rule__BinaryExpression__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 
            // InternalMontiArcDSL.g:4936:2: ( rule__BinaryExpression__OpAssignment_1 )
            // InternalMontiArcDSL.g:4936:3: rule__BinaryExpression__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // InternalMontiArcDSL.g:4944:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4948:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalMontiArcDSL.g:4949:2: rule__BinaryExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // InternalMontiArcDSL.g:4955:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4959:1: ( ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) )
            // InternalMontiArcDSL.g:4960:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            {
            // InternalMontiArcDSL.g:4960:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            // InternalMontiArcDSL.g:4961:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 
            // InternalMontiArcDSL.g:4962:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            // InternalMontiArcDSL.g:4962:3: rule__BinaryExpression__Literal2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // InternalMontiArcDSL.g:4971:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4975:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalMontiArcDSL.g:4976:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
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
    // InternalMontiArcDSL.g:4983:1: rule__Arguments__Group__0__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4987:1: ( ( '(' ) )
            // InternalMontiArcDSL.g:4988:1: ( '(' )
            {
            // InternalMontiArcDSL.g:4988:1: ( '(' )
            // InternalMontiArcDSL.g:4989:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4998:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5002:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalMontiArcDSL.g:5003:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiArcDSL.g:5010:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5014:1: ( ( ( rule__Arguments__ArgumentsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:5015:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:5015:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            // InternalMontiArcDSL.g:5016:2: ( rule__Arguments__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 
            // InternalMontiArcDSL.g:5017:2: ( rule__Arguments__ArgumentsAssignment_1 )
            // InternalMontiArcDSL.g:5017:3: rule__Arguments__ArgumentsAssignment_1
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
    // InternalMontiArcDSL.g:5025:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5029:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalMontiArcDSL.g:5030:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiArcDSL.g:5037:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__Group_2__0 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5041:1: ( ( ( rule__Arguments__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:5042:1: ( ( rule__Arguments__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:5042:1: ( ( rule__Arguments__Group_2__0 )* )
            // InternalMontiArcDSL.g:5043:2: ( rule__Arguments__Group_2__0 )*
            {
             before(grammarAccess.getArgumentsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:5044:2: ( rule__Arguments__Group_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==47) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMontiArcDSL.g:5044:3: rule__Arguments__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Arguments__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMontiArcDSL.g:5052:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5056:1: ( rule__Arguments__Group__3__Impl )
            // InternalMontiArcDSL.g:5057:2: rule__Arguments__Group__3__Impl
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
    // InternalMontiArcDSL.g:5063:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5067:1: ( ( ')' ) )
            // InternalMontiArcDSL.g:5068:1: ( ')' )
            {
            // InternalMontiArcDSL.g:5068:1: ( ')' )
            // InternalMontiArcDSL.g:5069:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:5079:1: rule__Arguments__Group_2__0 : rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 ;
    public final void rule__Arguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5083:1: ( rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 )
            // InternalMontiArcDSL.g:5084:2: rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1
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
    // InternalMontiArcDSL.g:5091:1: rule__Arguments__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Arguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5095:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:5096:1: ( ',' )
            {
            // InternalMontiArcDSL.g:5096:1: ( ',' )
            // InternalMontiArcDSL.g:5097:2: ','
            {
             before(grammarAccess.getArgumentsAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:5106:1: rule__Arguments__Group_2__1 : rule__Arguments__Group_2__1__Impl ;
    public final void rule__Arguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5110:1: ( rule__Arguments__Group_2__1__Impl )
            // InternalMontiArcDSL.g:5111:2: rule__Arguments__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:5117:1: rule__Arguments__Group_2__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Arguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5121:1: ( ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:5122:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:5122:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:5123:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 
            // InternalMontiArcDSL.g:5124:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            // InternalMontiArcDSL.g:5124:3: rule__Arguments__ArgumentsAssignment_2_1
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
    // InternalMontiArcDSL.g:5133:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5137:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMontiArcDSL.g:5138:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalMontiArcDSL.g:5145:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5149:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMontiArcDSL.g:5150:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:5150:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMontiArcDSL.g:5151:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMontiArcDSL.g:5152:2: ( rule__Argument__NameAssignment_0 )
            // InternalMontiArcDSL.g:5152:3: rule__Argument__NameAssignment_0
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
    // InternalMontiArcDSL.g:5160:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5164:1: ( rule__Argument__Group__1__Impl )
            // InternalMontiArcDSL.g:5165:2: rule__Argument__Group__1__Impl
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
    // InternalMontiArcDSL.g:5171:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5175:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMontiArcDSL.g:5176:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:5176:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMontiArcDSL.g:5177:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMontiArcDSL.g:5178:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMontiArcDSL.g:5178:3: rule__Argument__ExpressionAssignment_1
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
    // InternalMontiArcDSL.g:5187:1: rule__MACompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__MACompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5191:1: ( ( rulePackage ) )
            // InternalMontiArcDSL.g:5192:2: ( rulePackage )
            {
            // InternalMontiArcDSL.g:5192:2: ( rulePackage )
            // InternalMontiArcDSL.g:5193:3: rulePackage
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
    // InternalMontiArcDSL.g:5202:1: rule__MACompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__MACompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5206:1: ( ( ruleImportStatements ) )
            // InternalMontiArcDSL.g:5207:2: ( ruleImportStatements )
            {
            // InternalMontiArcDSL.g:5207:2: ( ruleImportStatements )
            // InternalMontiArcDSL.g:5208:3: ruleImportStatements
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
    // InternalMontiArcDSL.g:5217:1: rule__MACompilationUnit__ComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__MACompilationUnit__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5221:1: ( ( ruleComponent ) )
            // InternalMontiArcDSL.g:5222:2: ( ruleComponent )
            {
            // InternalMontiArcDSL.g:5222:2: ( ruleComponent )
            // InternalMontiArcDSL.g:5223:3: ruleComponent
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
    // InternalMontiArcDSL.g:5232:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5236:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5237:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5237:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5238:3: RULE_ID
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
    // InternalMontiArcDSL.g:5247:1: rule__Component__SignatureAssignment_2 : ( ruleSignature ) ;
    public final void rule__Component__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5251:1: ( ( ruleSignature ) )
            // InternalMontiArcDSL.g:5252:2: ( ruleSignature )
            {
            // InternalMontiArcDSL.g:5252:2: ( ruleSignature )
            // InternalMontiArcDSL.g:5253:3: ruleSignature
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
    // InternalMontiArcDSL.g:5262:1: rule__Component__ArcElementsAssignment_4 : ( ruleArcElement ) ;
    public final void rule__Component__ArcElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5266:1: ( ( ruleArcElement ) )
            // InternalMontiArcDSL.g:5267:2: ( ruleArcElement )
            {
            // InternalMontiArcDSL.g:5267:2: ( ruleArcElement )
            // InternalMontiArcDSL.g:5268:3: ruleArcElement
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
    // InternalMontiArcDSL.g:5277:1: rule__Signature__ParametersAssignment_1 : ( ruleParameters ) ;
    public final void rule__Signature__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5281:1: ( ( ruleParameters ) )
            // InternalMontiArcDSL.g:5282:2: ( ruleParameters )
            {
            // InternalMontiArcDSL.g:5282:2: ( ruleParameters )
            // InternalMontiArcDSL.g:5283:3: ruleParameters
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
    // InternalMontiArcDSL.g:5292:1: rule__Signature__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Signature__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5296:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5297:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5297:2: ( ruleType )
            // InternalMontiArcDSL.g:5298:3: ruleType
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
    // InternalMontiArcDSL.g:5307:1: rule__Parameters__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5311:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:5312:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:5312:2: ( ruleParameter )
            // InternalMontiArcDSL.g:5313:3: ruleParameter
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
    // InternalMontiArcDSL.g:5322:1: rule__Parameters__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5326:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:5327:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:5327:2: ( ruleParameter )
            // InternalMontiArcDSL.g:5328:3: ruleParameter
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


    // $ANTLR start "rule__ComponentType__TypeAssignment"
    // InternalMontiArcDSL.g:5337:1: rule__ComponentType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ComponentType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5341:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5342:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5342:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5343:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentTypeAccess().getTypeComponentCrossReference_0()); 
            // InternalMontiArcDSL.g:5344:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5345:4: RULE_ID
            {
             before(grammarAccess.getComponentTypeAccess().getTypeComponentIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentTypeAccess().getTypeComponentIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getComponentTypeAccess().getTypeComponentCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentType__TypeAssignment"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalMontiArcDSL.g:5356:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5360:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5361:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5361:2: ( ruleType )
            // InternalMontiArcDSL.g:5362:3: ruleType
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
    // InternalMontiArcDSL.g:5371:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5375:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5376:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5376:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5377:3: RULE_ID
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
    // InternalMontiArcDSL.g:5386:1: rule__Parameter__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5390:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5391:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5391:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5392:3: ruleExpression
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
    // InternalMontiArcDSL.g:5401:1: rule__SubComponent__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__SubComponent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5405:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5406:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5406:2: ( ruleType )
            // InternalMontiArcDSL.g:5407:3: ruleType
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
    // InternalMontiArcDSL.g:5416:1: rule__SubComponent__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__SubComponent__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5420:1: ( ( ruleArguments ) )
            // InternalMontiArcDSL.g:5421:2: ( ruleArguments )
            {
            // InternalMontiArcDSL.g:5421:2: ( ruleArguments )
            // InternalMontiArcDSL.g:5422:3: ruleArguments
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
    // InternalMontiArcDSL.g:5431:1: rule__SubComponent__InstancesAssignment_3 : ( ruleNames ) ;
    public final void rule__SubComponent__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5435:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5436:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5436:2: ( ruleNames )
            // InternalMontiArcDSL.g:5437:3: ruleNames
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


    // $ANTLR start "rule__Connector__SourceAssignment_0"
    // InternalMontiArcDSL.g:5446:1: rule__Connector__SourceAssignment_0 : ( ( rule__Connector__SourceAlternatives_0_0 ) ) ;
    public final void rule__Connector__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5450:1: ( ( ( rule__Connector__SourceAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5451:2: ( ( rule__Connector__SourceAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5451:2: ( ( rule__Connector__SourceAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5452:3: ( rule__Connector__SourceAlternatives_0_0 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5453:3: ( rule__Connector__SourceAlternatives_0_0 )
            // InternalMontiArcDSL.g:5453:4: rule__Connector__SourceAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Connector__SourceAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getSourceAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__SourceAssignment_0"


    // $ANTLR start "rule__Connector__TargetsAssignment_2"
    // InternalMontiArcDSL.g:5461:1: rule__Connector__TargetsAssignment_2 : ( ruleNames ) ;
    public final void rule__Connector__TargetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5465:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5466:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5466:2: ( ruleNames )
            // InternalMontiArcDSL.g:5467:3: ruleNames
            {
             before(grammarAccess.getConnectorAccess().getTargetsNamesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTargetsNamesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connector__TargetsAssignment_2"


    // $ANTLR start "rule__Ports__PortsAssignment_1"
    // InternalMontiArcDSL.g:5476:1: rule__Ports__PortsAssignment_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5480:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:5481:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:5481:2: ( rulePort )
            // InternalMontiArcDSL.g:5482:3: rulePort
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
    // InternalMontiArcDSL.g:5491:1: rule__Ports__PortsAssignment_2_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5495:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:5496:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:5496:2: ( rulePort )
            // InternalMontiArcDSL.g:5497:3: rulePort
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


    // $ANTLR start "rule__Port__AssumeAssignment_0"
    // InternalMontiArcDSL.g:5506:1: rule__Port__AssumeAssignment_0 : ( ruleAssume ) ;
    public final void rule__Port__AssumeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5510:1: ( ( ruleAssume ) )
            // InternalMontiArcDSL.g:5511:2: ( ruleAssume )
            {
            // InternalMontiArcDSL.g:5511:2: ( ruleAssume )
            // InternalMontiArcDSL.g:5512:3: ruleAssume
            {
             before(grammarAccess.getPortAccess().getAssumeAssumeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssume();

            state._fsp--;

             after(grammarAccess.getPortAccess().getAssumeAssumeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__AssumeAssignment_0"


    // $ANTLR start "rule__Port__SyncAssignment_1"
    // InternalMontiArcDSL.g:5521:1: rule__Port__SyncAssignment_1 : ( RULE_SYNC ) ;
    public final void rule__Port__SyncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5525:1: ( ( RULE_SYNC ) )
            // InternalMontiArcDSL.g:5526:2: ( RULE_SYNC )
            {
            // InternalMontiArcDSL.g:5526:2: ( RULE_SYNC )
            // InternalMontiArcDSL.g:5527:3: RULE_SYNC
            {
             before(grammarAccess.getPortAccess().getSyncSYNCTerminalRuleCall_1_0()); 
            match(input,RULE_SYNC,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getSyncSYNCTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__SyncAssignment_1"


    // $ANTLR start "rule__Port__InAssignment_2_0"
    // InternalMontiArcDSL.g:5536:1: rule__Port__InAssignment_2_0 : ( ( 'in' ) ) ;
    public final void rule__Port__InAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5540:1: ( ( ( 'in' ) ) )
            // InternalMontiArcDSL.g:5541:2: ( ( 'in' ) )
            {
            // InternalMontiArcDSL.g:5541:2: ( ( 'in' ) )
            // InternalMontiArcDSL.g:5542:3: ( 'in' )
            {
             before(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 
            // InternalMontiArcDSL.g:5543:3: ( 'in' )
            // InternalMontiArcDSL.g:5544:4: 'in'
            {
             before(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 

            }

             after(grammarAccess.getPortAccess().getInInKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__InAssignment_2_0"


    // $ANTLR start "rule__Port__OutAssignment_2_1"
    // InternalMontiArcDSL.g:5555:1: rule__Port__OutAssignment_2_1 : ( ( 'out' ) ) ;
    public final void rule__Port__OutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5559:1: ( ( ( 'out' ) ) )
            // InternalMontiArcDSL.g:5560:2: ( ( 'out' ) )
            {
            // InternalMontiArcDSL.g:5560:2: ( ( 'out' ) )
            // InternalMontiArcDSL.g:5561:3: ( 'out' )
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 
            // InternalMontiArcDSL.g:5562:3: ( 'out' )
            // InternalMontiArcDSL.g:5563:4: 'out'
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 

            }

             after(grammarAccess.getPortAccess().getOutOutKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__OutAssignment_2_1"


    // $ANTLR start "rule__Port__TypeAssignment_3_0"
    // InternalMontiArcDSL.g:5574:1: rule__Port__TypeAssignment_3_0 : ( ruleType ) ;
    public final void rule__Port__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5578:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5579:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5579:2: ( ruleType )
            // InternalMontiArcDSL.g:5580:3: ruleType
            {
             before(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_3_0"


    // $ANTLR start "rule__Port__DatatypeAssignment_3_1"
    // InternalMontiArcDSL.g:5589:1: rule__Port__DatatypeAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Port__DatatypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5593:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5594:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5594:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5595:3: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getDatatypeCDDefinitionCrossReference_3_1_0()); 
            // InternalMontiArcDSL.g:5596:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5597:4: RULE_ID
            {
             before(grammarAccess.getPortAccess().getDatatypeCDDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getDatatypeCDDefinitionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPortAccess().getDatatypeCDDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__DatatypeAssignment_3_1"


    // $ANTLR start "rule__Port__NamesAssignment_4"
    // InternalMontiArcDSL.g:5608:1: rule__Port__NamesAssignment_4 : ( ruleNames ) ;
    public final void rule__Port__NamesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5612:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5613:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5613:2: ( ruleNames )
            // InternalMontiArcDSL.g:5614:3: ruleNames
            {
             before(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNames();

            state._fsp--;

             after(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NamesAssignment_4"


    // $ANTLR start "rule__Assume__ConditionAssignment_3"
    // InternalMontiArcDSL.g:5623:1: rule__Assume__ConditionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Assume__ConditionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5627:1: ( ( RULE_STRING ) )
            // InternalMontiArcDSL.g:5628:2: ( RULE_STRING )
            {
            // InternalMontiArcDSL.g:5628:2: ( RULE_STRING )
            // InternalMontiArcDSL.g:5629:3: RULE_STRING
            {
             before(grammarAccess.getAssumeAccess().getConditionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAssumeAccess().getConditionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assume__ConditionAssignment_3"


    // $ANTLR start "rule__Names__NamesAssignment_0"
    // InternalMontiArcDSL.g:5638:1: rule__Names__NamesAssignment_0 : ( ( rule__Names__NamesAlternatives_0_0 ) ) ;
    public final void rule__Names__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5642:1: ( ( ( rule__Names__NamesAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5643:2: ( ( rule__Names__NamesAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5643:2: ( ( rule__Names__NamesAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5644:3: ( rule__Names__NamesAlternatives_0_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5645:3: ( rule__Names__NamesAlternatives_0_0 )
            // InternalMontiArcDSL.g:5645:4: rule__Names__NamesAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAlternatives_0_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:5653:1: rule__Names__NamesAssignment_1_1 : ( ( rule__Names__NamesAlternatives_1_1_0 ) ) ;
    public final void rule__Names__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5657:1: ( ( ( rule__Names__NamesAlternatives_1_1_0 ) ) )
            // InternalMontiArcDSL.g:5658:2: ( ( rule__Names__NamesAlternatives_1_1_0 ) )
            {
            // InternalMontiArcDSL.g:5658:2: ( ( rule__Names__NamesAlternatives_1_1_0 ) )
            // InternalMontiArcDSL.g:5659:3: ( rule__Names__NamesAlternatives_1_1_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAlternatives_1_1_0()); 
            // InternalMontiArcDSL.g:5660:3: ( rule__Names__NamesAlternatives_1_1_0 )
            // InternalMontiArcDSL.g:5660:4: rule__Names__NamesAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Names__NamesAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNamesAccess().getNamesAlternatives_1_1_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:5668:1: rule__Variable__TypeAssignment_0 : ( ( rule__Variable__TypeAlternatives_0_0 ) ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5672:1: ( ( ( rule__Variable__TypeAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5673:2: ( ( rule__Variable__TypeAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5673:2: ( ( rule__Variable__TypeAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5674:3: ( rule__Variable__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5675:3: ( rule__Variable__TypeAlternatives_0_0 )
            // InternalMontiArcDSL.g:5675:4: rule__Variable__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:5683:1: rule__Variable__NamesAssignment_1 : ( ruleNames ) ;
    public final void rule__Variable__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5687:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5688:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5688:2: ( ruleNames )
            // InternalMontiArcDSL.g:5689:3: ruleNames
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


    // $ANTLR start "rule__Variable__ParametersAssignment_2_1"
    // InternalMontiArcDSL.g:5698:1: rule__Variable__ParametersAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Variable__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5702:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5703:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5703:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5704:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getParametersExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getParametersExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ParametersAssignment_2_1"


    // $ANTLR start "rule__Variable__ParametersAssignment_2_2_1"
    // InternalMontiArcDSL.g:5713:1: rule__Variable__ParametersAssignment_2_2_1 : ( ruleExpression ) ;
    public final void rule__Variable__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5717:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5718:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5718:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5719:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getParametersExpressionParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getParametersExpressionParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Automaton__SyncAssignment_1"
    // InternalMontiArcDSL.g:5728:1: rule__Automaton__SyncAssignment_1 : ( RULE_SYNC ) ;
    public final void rule__Automaton__SyncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5732:1: ( ( RULE_SYNC ) )
            // InternalMontiArcDSL.g:5733:2: ( RULE_SYNC )
            {
            // InternalMontiArcDSL.g:5733:2: ( RULE_SYNC )
            // InternalMontiArcDSL.g:5734:3: RULE_SYNC
            {
             before(grammarAccess.getAutomatonAccess().getSyncSYNCTerminalRuleCall_1_0()); 
            match(input,RULE_SYNC,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getSyncSYNCTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__SyncAssignment_1"


    // $ANTLR start "rule__Automaton__NameAssignment_3"
    // InternalMontiArcDSL.g:5743:1: rule__Automaton__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5747:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5748:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5748:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5749:3: RULE_ID
            {
             before(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__NameAssignment_3"


    // $ANTLR start "rule__Automaton__StatesAssignment_5_0"
    // InternalMontiArcDSL.g:5758:1: rule__Automaton__StatesAssignment_5_0 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5762:1: ( ( ruleState ) )
            // InternalMontiArcDSL.g:5763:2: ( ruleState )
            {
            // InternalMontiArcDSL.g:5763:2: ( ruleState )
            // InternalMontiArcDSL.g:5764:3: ruleState
            {
             before(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__StatesAssignment_5_0"


    // $ANTLR start "rule__Automaton__TransitionsAssignment_5_1"
    // InternalMontiArcDSL.g:5773:1: rule__Automaton__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__Automaton__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5777:1: ( ( ruleTransition ) )
            // InternalMontiArcDSL.g:5778:2: ( ruleTransition )
            {
            // InternalMontiArcDSL.g:5778:2: ( ruleTransition )
            // InternalMontiArcDSL.g:5779:3: ruleTransition
            {
             before(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automaton__TransitionsAssignment_5_1"


    // $ANTLR start "rule__SCState__ModifierAssignment_0"
    // InternalMontiArcDSL.g:5788:1: rule__SCState__ModifierAssignment_0 : ( ruleSCModifier ) ;
    public final void rule__SCState__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5792:1: ( ( ruleSCModifier ) )
            // InternalMontiArcDSL.g:5793:2: ( ruleSCModifier )
            {
            // InternalMontiArcDSL.g:5793:2: ( ruleSCModifier )
            // InternalMontiArcDSL.g:5794:3: ruleSCModifier
            {
             before(grammarAccess.getSCStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSCModifier();

            state._fsp--;

             after(grammarAccess.getSCStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__ModifierAssignment_0"


    // $ANTLR start "rule__SCState__AnteAssignment_1"
    // InternalMontiArcDSL.g:5803:1: rule__SCState__AnteAssignment_1 : ( ruleSCSAnte ) ;
    public final void rule__SCState__AnteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5807:1: ( ( ruleSCSAnte ) )
            // InternalMontiArcDSL.g:5808:2: ( ruleSCSAnte )
            {
            // InternalMontiArcDSL.g:5808:2: ( ruleSCSAnte )
            // InternalMontiArcDSL.g:5809:3: ruleSCSAnte
            {
             before(grammarAccess.getSCStateAccess().getAnteSCSAnteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSCSAnte();

            state._fsp--;

             after(grammarAccess.getSCStateAccess().getAnteSCSAnteParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__AnteAssignment_1"


    // $ANTLR start "rule__SCState__NameAssignment_3"
    // InternalMontiArcDSL.g:5818:1: rule__SCState__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SCState__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5822:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5823:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5823:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5824:3: RULE_ID
            {
             before(grammarAccess.getSCStateAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSCStateAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCState__NameAssignment_3"


    // $ANTLR start "rule__InvState__ModifierAssignment_0"
    // InternalMontiArcDSL.g:5833:1: rule__InvState__ModifierAssignment_0 : ( ruleSCModifier ) ;
    public final void rule__InvState__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5837:1: ( ( ruleSCModifier ) )
            // InternalMontiArcDSL.g:5838:2: ( ruleSCModifier )
            {
            // InternalMontiArcDSL.g:5838:2: ( ruleSCModifier )
            // InternalMontiArcDSL.g:5839:3: ruleSCModifier
            {
             before(grammarAccess.getInvStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSCModifier();

            state._fsp--;

             after(grammarAccess.getInvStateAccess().getModifierSCModifierEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__ModifierAssignment_0"


    // $ANTLR start "rule__InvState__NameAssignment_2"
    // InternalMontiArcDSL.g:5848:1: rule__InvState__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InvState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5852:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5853:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5853:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5854:3: RULE_ID
            {
             before(grammarAccess.getInvStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInvStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__NameAssignment_2"


    // $ANTLR start "rule__InvState__ExpressionAssignment_4"
    // InternalMontiArcDSL.g:5863:1: rule__InvState__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__InvState__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5867:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5868:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5868:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5869:3: ruleExpression
            {
             before(grammarAccess.getInvStateAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getInvStateAccess().getExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InvState__ExpressionAssignment_4"


    // $ANTLR start "rule__SCSAnte__BlockAssignment_1"
    // InternalMontiArcDSL.g:5878:1: rule__SCSAnte__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__SCSAnte__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5882:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:5883:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:5883:2: ( ruleBlock )
            // InternalMontiArcDSL.g:5884:3: ruleBlock
            {
             before(grammarAccess.getSCSAnteAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getSCSAnteAccess().getBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCSAnte__BlockAssignment_1"


    // $ANTLR start "rule__Transition__SourceAssignment_0"
    // InternalMontiArcDSL.g:5893:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5897:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5898:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5898:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5899:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 
            // InternalMontiArcDSL.g:5900:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5901:4: RULE_ID
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
    // InternalMontiArcDSL.g:5912:1: rule__Transition__TargetAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5916:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5917:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5917:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5918:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0()); 
            // InternalMontiArcDSL.g:5919:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5920:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0()); 

            }


            }

        }
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
    // InternalMontiArcDSL.g:5931:1: rule__Transition__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Transition__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5935:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5936:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5936:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5937:3: ruleExpression
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
    // InternalMontiArcDSL.g:5946:1: rule__Transition__ReactionAssignment_3_1 : ( ruleBlock ) ;
    public final void rule__Transition__ReactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5950:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:5951:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:5951:2: ( ruleBlock )
            // InternalMontiArcDSL.g:5952:3: ruleBlock
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


    // $ANTLR start "rule__Block__BlocksAssignment_2"
    // InternalMontiArcDSL.g:5961:1: rule__Block__BlocksAssignment_2 : ( ruleBlockStatement ) ;
    public final void rule__Block__BlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5965:1: ( ( ruleBlockStatement ) )
            // InternalMontiArcDSL.g:5966:2: ( ruleBlockStatement )
            {
            // InternalMontiArcDSL.g:5966:2: ( ruleBlockStatement )
            // InternalMontiArcDSL.g:5967:3: ruleBlockStatement
            {
             before(grammarAccess.getBlockAccess().getBlocksBlockStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBlockStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getBlocksBlockStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__BlocksAssignment_2"


    // $ANTLR start "rule__SimpleExpression__ExpressionAssignment_0"
    // InternalMontiArcDSL.g:5976:1: rule__SimpleExpression__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SimpleExpression__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5980:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5981:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5981:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5982:3: ruleExpression
            {
             before(grammarAccess.getSimpleExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleExpressionAccess().getExpressionExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpression__ExpressionAssignment_0"


    // $ANTLR start "rule__SimpleInit__NameAssignment_0"
    // InternalMontiArcDSL.g:5991:1: rule__SimpleInit__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleInit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5995:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5996:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5996:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5997:3: RULE_ID
            {
             before(grammarAccess.getSimpleInitAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleInitAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__NameAssignment_0"


    // $ANTLR start "rule__SimpleInit__ExpressionsAssignment_2"
    // InternalMontiArcDSL.g:6006:1: rule__SimpleInit__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleInit__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6010:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:6011:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:6011:2: ( ruleExpression )
            // InternalMontiArcDSL.g:6012:3: ruleExpression
            {
             before(grammarAccess.getSimpleInitAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSimpleInitAccess().getExpressionsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleInit__ExpressionsAssignment_2"


    // $ANTLR start "rule__ImportStatements__ImportUriAssignment_1"
    // InternalMontiArcDSL.g:6021:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6025:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:6026:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:6026:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:6027:3: RULE_MCQUALIFIEDNAME
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


    // $ANTLR start "rule__ImportStatements__StarAssignment_2"
    // InternalMontiArcDSL.g:6036:1: rule__ImportStatements__StarAssignment_2 : ( RULE_DOTSTAR ) ;
    public final void rule__ImportStatements__StarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6040:1: ( ( RULE_DOTSTAR ) )
            // InternalMontiArcDSL.g:6041:2: ( RULE_DOTSTAR )
            {
            // InternalMontiArcDSL.g:6041:2: ( RULE_DOTSTAR )
            // InternalMontiArcDSL.g:6042:3: RULE_DOTSTAR
            {
             before(grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0()); 
            match(input,RULE_DOTSTAR,FOLLOW_2); 
             after(grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatements__StarAssignment_2"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalMontiArcDSL.g:6051:1: rule__Package__NameAssignment_1 : ( ( rule__Package__NameAlternatives_1_0 ) ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6055:1: ( ( ( rule__Package__NameAlternatives_1_0 ) ) )
            // InternalMontiArcDSL.g:6056:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            {
            // InternalMontiArcDSL.g:6056:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            // InternalMontiArcDSL.g:6057:3: ( rule__Package__NameAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 
            // InternalMontiArcDSL.g:6058:3: ( rule__Package__NameAlternatives_1_0 )
            // InternalMontiArcDSL.g:6058:4: rule__Package__NameAlternatives_1_0
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
    // InternalMontiArcDSL.g:6066:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6070:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:6071:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:6071:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:6072:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:6073:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:6073:4: rule__MCPrimitiveType__TypeAlternatives_0
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


    // $ANTLR start "rule__MCObjectType__TypeAssignment"
    // InternalMontiArcDSL.g:6081:1: rule__MCObjectType__TypeAssignment : ( ( rule__MCObjectType__TypeAlternatives_0 ) ) ;
    public final void rule__MCObjectType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6085:1: ( ( ( rule__MCObjectType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:6086:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:6086:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:6087:3: ( rule__MCObjectType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:6088:3: ( rule__MCObjectType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:6088:4: rule__MCObjectType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MCObjectType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCObjectType__TypeAssignment"


    // $ANTLR start "rule__MCCollectionType__CollectionAssignment_0"
    // InternalMontiArcDSL.g:6096:1: rule__MCCollectionType__CollectionAssignment_0 : ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__MCCollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6100:1: ( ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:6101:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:6101:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:6102:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalMontiArcDSL.g:6103:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            // InternalMontiArcDSL.g:6103:4: rule__MCCollectionType__CollectionAlternatives_0_0
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
    // InternalMontiArcDSL.g:6111:1: rule__MCCollectionType__InnerTypeAssignment_2 : ( ruleType ) ;
    public final void rule__MCCollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6115:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:6116:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:6116:2: ( ruleType )
            // InternalMontiArcDSL.g:6117:3: ruleType
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
    // InternalMontiArcDSL.g:6126:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6130:1: ( ( RULE_INT ) )
            // InternalMontiArcDSL.g:6131:2: ( RULE_INT )
            {
            // InternalMontiArcDSL.g:6131:2: ( RULE_INT )
            // InternalMontiArcDSL.g:6132:3: RULE_INT
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
    // InternalMontiArcDSL.g:6141:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6145:1: ( ( RULE_STRING ) )
            // InternalMontiArcDSL.g:6146:2: ( RULE_STRING )
            {
            // InternalMontiArcDSL.g:6146:2: ( RULE_STRING )
            // InternalMontiArcDSL.g:6147:3: RULE_STRING
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


    // $ANTLR start "rule__NameExpression__NameAssignment_0"
    // InternalMontiArcDSL.g:6156:1: rule__NameExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6160:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:6161:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:6161:2: ( RULE_ID )
            // InternalMontiArcDSL.g:6162:3: RULE_ID
            {
             before(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameExpression__NameAssignment_0"


    // $ANTLR start "rule__NameExpression__QualifiednameAssignment_1"
    // InternalMontiArcDSL.g:6171:1: rule__NameExpression__QualifiednameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__NameExpression__QualifiednameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6175:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:6176:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:6176:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:6177:3: RULE_MCQUALIFIEDNAME
            {
             before(grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0()); 
            match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
             after(grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameExpression__QualifiednameAssignment_1"


    // $ANTLR start "rule__BinaryExpression__Literal1Assignment_0"
    // InternalMontiArcDSL.g:6186:1: rule__BinaryExpression__Literal1Assignment_0 : ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) ;
    public final void rule__BinaryExpression__Literal1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6190:1: ( ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:6191:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:6191:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            // InternalMontiArcDSL.g:6192:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 
            // InternalMontiArcDSL.g:6193:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            // InternalMontiArcDSL.g:6193:4: rule__BinaryExpression__Literal1Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal1Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Literal1Assignment_0"


    // $ANTLR start "rule__BinaryExpression__OpAssignment_1"
    // InternalMontiArcDSL.g:6201:1: rule__BinaryExpression__OpAssignment_1 : ( ruleOperator ) ;
    public final void rule__BinaryExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6205:1: ( ( ruleOperator ) )
            // InternalMontiArcDSL.g:6206:2: ( ruleOperator )
            {
            // InternalMontiArcDSL.g:6206:2: ( ruleOperator )
            // InternalMontiArcDSL.g:6207:3: ruleOperator
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__OpAssignment_1"


    // $ANTLR start "rule__BinaryExpression__Literal2Assignment_2"
    // InternalMontiArcDSL.g:6216:1: rule__BinaryExpression__Literal2Assignment_2 : ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) ;
    public final void rule__BinaryExpression__Literal2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6220:1: ( ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) )
            // InternalMontiArcDSL.g:6221:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            {
            // InternalMontiArcDSL.g:6221:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            // InternalMontiArcDSL.g:6222:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 
            // InternalMontiArcDSL.g:6223:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            // InternalMontiArcDSL.g:6223:4: rule__BinaryExpression__Literal2Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Literal2Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Literal2Assignment_2"


    // $ANTLR start "rule__Arguments__ArgumentsAssignment_1"
    // InternalMontiArcDSL.g:6231:1: rule__Arguments__ArgumentsAssignment_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6235:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:6236:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:6236:2: ( ruleArgument )
            // InternalMontiArcDSL.g:6237:3: ruleArgument
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
    // InternalMontiArcDSL.g:6246:1: rule__Arguments__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6250:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:6251:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:6251:2: ( ruleArgument )
            // InternalMontiArcDSL.g:6252:3: ruleArgument
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
    // InternalMontiArcDSL.g:6261:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6265:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:6266:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:6266:2: ( RULE_ID )
            // InternalMontiArcDSL.g:6267:3: RULE_ID
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
    // InternalMontiArcDSL.g:6276:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6280:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:6281:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:6281:2: ( ruleExpression )
            // InternalMontiArcDSL.g:6282:3: ruleExpression
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\3\41\1\uffff\1\4\1\61\1\uffff";
    static final String dfa_3s = "\3\72\1\uffff\1\4\1\73\1\uffff";
    static final String dfa_4s = "\3\uffff\1\1\2\uffff\1\2";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\11\uffff\1\3\15\uffff\1\4",
            "\1\1\1\2\11\uffff\1\3\15\uffff\1\4",
            "\1\1\1\2\11\uffff\1\3\15\uffff\1\4",
            "",
            "\1\5",
            "\1\3\11\uffff\1\6",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1251:1: rule__State__Alternatives : ( ( ruleSCState ) | ( ruleInvState ) );";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\uffff\10\13\4\uffff";
    static final String dfa_9s = "\1\16\10\4\4\uffff";
    static final String dfa_10s = "\1\40\10\73\4\uffff";
    static final String dfa_11s = "\11\uffff\1\3\1\4\1\1\1\2";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\3\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1314:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x2000080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00004001FFFFC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x22082801FFFFC070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x22080801FFFFC072L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001FFFFC000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000002B0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0080000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x8010000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001FFFFC010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0082000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x22080801FFFFC070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400300600000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400100600000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0400100600000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0806020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00002000000002B0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000002B2L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000007F800000000L});

}