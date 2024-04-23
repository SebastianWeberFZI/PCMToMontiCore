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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_SYNC", "RULE_DOTSTAR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'initial'", "'final'", "'>'", "'<'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'->'", "'port'", "'('", "')'", "'automaton'", "'state'", "'['", "']'", "'import'", "'package'", "'in'", "'out'"
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
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SYNC=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_DOTSTAR=7;
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


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcDSL.g:328:1: entryRuleNames : ruleNames EOF ;
    public final void entryRuleNames() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:329:1: ( ruleNames EOF )
            // InternalMontiArcDSL.g:330:1: ruleNames EOF
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
    // InternalMontiArcDSL.g:337:1: ruleNames : ( ( rule__Names__Group__0 ) ) ;
    public final void ruleNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:341:2: ( ( ( rule__Names__Group__0 ) ) )
            // InternalMontiArcDSL.g:342:2: ( ( rule__Names__Group__0 ) )
            {
            // InternalMontiArcDSL.g:342:2: ( ( rule__Names__Group__0 ) )
            // InternalMontiArcDSL.g:343:3: ( rule__Names__Group__0 )
            {
             before(grammarAccess.getNamesAccess().getGroup()); 
            // InternalMontiArcDSL.g:344:3: ( rule__Names__Group__0 )
            // InternalMontiArcDSL.g:344:4: rule__Names__Group__0
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
    // InternalMontiArcDSL.g:353:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:354:1: ( ruleVariable EOF )
            // InternalMontiArcDSL.g:355:1: ruleVariable EOF
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
    // InternalMontiArcDSL.g:362:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:366:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMontiArcDSL.g:367:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMontiArcDSL.g:367:2: ( ( rule__Variable__Group__0 ) )
            // InternalMontiArcDSL.g:368:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMontiArcDSL.g:369:3: ( rule__Variable__Group__0 )
            // InternalMontiArcDSL.g:369:4: rule__Variable__Group__0
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
    // InternalMontiArcDSL.g:378:1: entryRuleAutomaton : ruleAutomaton EOF ;
    public final void entryRuleAutomaton() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:379:1: ( ruleAutomaton EOF )
            // InternalMontiArcDSL.g:380:1: ruleAutomaton EOF
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
    // InternalMontiArcDSL.g:387:1: ruleAutomaton : ( ( rule__Automaton__Group__0 ) ) ;
    public final void ruleAutomaton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:391:2: ( ( ( rule__Automaton__Group__0 ) ) )
            // InternalMontiArcDSL.g:392:2: ( ( rule__Automaton__Group__0 ) )
            {
            // InternalMontiArcDSL.g:392:2: ( ( rule__Automaton__Group__0 ) )
            // InternalMontiArcDSL.g:393:3: ( rule__Automaton__Group__0 )
            {
             before(grammarAccess.getAutomatonAccess().getGroup()); 
            // InternalMontiArcDSL.g:394:3: ( rule__Automaton__Group__0 )
            // InternalMontiArcDSL.g:394:4: rule__Automaton__Group__0
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
    // InternalMontiArcDSL.g:403:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:404:1: ( ruleState EOF )
            // InternalMontiArcDSL.g:405:1: ruleState EOF
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
    // InternalMontiArcDSL.g:412:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:416:2: ( ( ( rule__State__Alternatives ) ) )
            // InternalMontiArcDSL.g:417:2: ( ( rule__State__Alternatives ) )
            {
            // InternalMontiArcDSL.g:417:2: ( ( rule__State__Alternatives ) )
            // InternalMontiArcDSL.g:418:3: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:419:3: ( rule__State__Alternatives )
            // InternalMontiArcDSL.g:419:4: rule__State__Alternatives
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
    // InternalMontiArcDSL.g:428:1: entryRuleSCState : ruleSCState EOF ;
    public final void entryRuleSCState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:429:1: ( ruleSCState EOF )
            // InternalMontiArcDSL.g:430:1: ruleSCState EOF
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
    // InternalMontiArcDSL.g:437:1: ruleSCState : ( ( rule__SCState__Group__0 ) ) ;
    public final void ruleSCState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:441:2: ( ( ( rule__SCState__Group__0 ) ) )
            // InternalMontiArcDSL.g:442:2: ( ( rule__SCState__Group__0 ) )
            {
            // InternalMontiArcDSL.g:442:2: ( ( rule__SCState__Group__0 ) )
            // InternalMontiArcDSL.g:443:3: ( rule__SCState__Group__0 )
            {
             before(grammarAccess.getSCStateAccess().getGroup()); 
            // InternalMontiArcDSL.g:444:3: ( rule__SCState__Group__0 )
            // InternalMontiArcDSL.g:444:4: rule__SCState__Group__0
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
    // InternalMontiArcDSL.g:453:1: entryRuleInvState : ruleInvState EOF ;
    public final void entryRuleInvState() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:454:1: ( ruleInvState EOF )
            // InternalMontiArcDSL.g:455:1: ruleInvState EOF
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
    // InternalMontiArcDSL.g:462:1: ruleInvState : ( ( rule__InvState__Group__0 ) ) ;
    public final void ruleInvState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:466:2: ( ( ( rule__InvState__Group__0 ) ) )
            // InternalMontiArcDSL.g:467:2: ( ( rule__InvState__Group__0 ) )
            {
            // InternalMontiArcDSL.g:467:2: ( ( rule__InvState__Group__0 ) )
            // InternalMontiArcDSL.g:468:3: ( rule__InvState__Group__0 )
            {
             before(grammarAccess.getInvStateAccess().getGroup()); 
            // InternalMontiArcDSL.g:469:3: ( rule__InvState__Group__0 )
            // InternalMontiArcDSL.g:469:4: rule__InvState__Group__0
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
    // InternalMontiArcDSL.g:478:1: entryRuleSCSAnte : ruleSCSAnte EOF ;
    public final void entryRuleSCSAnte() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:479:1: ( ruleSCSAnte EOF )
            // InternalMontiArcDSL.g:480:1: ruleSCSAnte EOF
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
    // InternalMontiArcDSL.g:487:1: ruleSCSAnte : ( ( rule__SCSAnte__Group__0 ) ) ;
    public final void ruleSCSAnte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:491:2: ( ( ( rule__SCSAnte__Group__0 ) ) )
            // InternalMontiArcDSL.g:492:2: ( ( rule__SCSAnte__Group__0 ) )
            {
            // InternalMontiArcDSL.g:492:2: ( ( rule__SCSAnte__Group__0 ) )
            // InternalMontiArcDSL.g:493:3: ( rule__SCSAnte__Group__0 )
            {
             before(grammarAccess.getSCSAnteAccess().getGroup()); 
            // InternalMontiArcDSL.g:494:3: ( rule__SCSAnte__Group__0 )
            // InternalMontiArcDSL.g:494:4: rule__SCSAnte__Group__0
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
    // InternalMontiArcDSL.g:503:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:504:1: ( ruleTransition EOF )
            // InternalMontiArcDSL.g:505:1: ruleTransition EOF
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
    // InternalMontiArcDSL.g:512:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:516:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMontiArcDSL.g:517:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMontiArcDSL.g:517:2: ( ( rule__Transition__Group__0 ) )
            // InternalMontiArcDSL.g:518:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMontiArcDSL.g:519:3: ( rule__Transition__Group__0 )
            // InternalMontiArcDSL.g:519:4: rule__Transition__Group__0
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
    // InternalMontiArcDSL.g:528:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:529:1: ( ruleBlock EOF )
            // InternalMontiArcDSL.g:530:1: ruleBlock EOF
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
    // InternalMontiArcDSL.g:537:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:541:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalMontiArcDSL.g:542:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalMontiArcDSL.g:542:2: ( ( rule__Block__Group__0 ) )
            // InternalMontiArcDSL.g:543:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalMontiArcDSL.g:544:3: ( rule__Block__Group__0 )
            // InternalMontiArcDSL.g:544:4: rule__Block__Group__0
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
    // InternalMontiArcDSL.g:553:1: entryRuleBlockStatement : ruleBlockStatement EOF ;
    public final void entryRuleBlockStatement() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:554:1: ( ruleBlockStatement EOF )
            // InternalMontiArcDSL.g:555:1: ruleBlockStatement EOF
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
    // InternalMontiArcDSL.g:562:1: ruleBlockStatement : ( ( rule__BlockStatement__Alternatives ) ) ;
    public final void ruleBlockStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:566:2: ( ( ( rule__BlockStatement__Alternatives ) ) )
            // InternalMontiArcDSL.g:567:2: ( ( rule__BlockStatement__Alternatives ) )
            {
            // InternalMontiArcDSL.g:567:2: ( ( rule__BlockStatement__Alternatives ) )
            // InternalMontiArcDSL.g:568:3: ( rule__BlockStatement__Alternatives )
            {
             before(grammarAccess.getBlockStatementAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:569:3: ( rule__BlockStatement__Alternatives )
            // InternalMontiArcDSL.g:569:4: rule__BlockStatement__Alternatives
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
    // InternalMontiArcDSL.g:578:1: entryRuleSimpleExpression : ruleSimpleExpression EOF ;
    public final void entryRuleSimpleExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:579:1: ( ruleSimpleExpression EOF )
            // InternalMontiArcDSL.g:580:1: ruleSimpleExpression EOF
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
    // InternalMontiArcDSL.g:587:1: ruleSimpleExpression : ( ( rule__SimpleExpression__Group__0 ) ) ;
    public final void ruleSimpleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:591:2: ( ( ( rule__SimpleExpression__Group__0 ) ) )
            // InternalMontiArcDSL.g:592:2: ( ( rule__SimpleExpression__Group__0 ) )
            {
            // InternalMontiArcDSL.g:592:2: ( ( rule__SimpleExpression__Group__0 ) )
            // InternalMontiArcDSL.g:593:3: ( rule__SimpleExpression__Group__0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getGroup()); 
            // InternalMontiArcDSL.g:594:3: ( rule__SimpleExpression__Group__0 )
            // InternalMontiArcDSL.g:594:4: rule__SimpleExpression__Group__0
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
    // InternalMontiArcDSL.g:603:1: entryRuleSimpleInit : ruleSimpleInit EOF ;
    public final void entryRuleSimpleInit() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:604:1: ( ruleSimpleInit EOF )
            // InternalMontiArcDSL.g:605:1: ruleSimpleInit EOF
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
    // InternalMontiArcDSL.g:612:1: ruleSimpleInit : ( ( rule__SimpleInit__Group__0 ) ) ;
    public final void ruleSimpleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:616:2: ( ( ( rule__SimpleInit__Group__0 ) ) )
            // InternalMontiArcDSL.g:617:2: ( ( rule__SimpleInit__Group__0 ) )
            {
            // InternalMontiArcDSL.g:617:2: ( ( rule__SimpleInit__Group__0 ) )
            // InternalMontiArcDSL.g:618:3: ( rule__SimpleInit__Group__0 )
            {
             before(grammarAccess.getSimpleInitAccess().getGroup()); 
            // InternalMontiArcDSL.g:619:3: ( rule__SimpleInit__Group__0 )
            // InternalMontiArcDSL.g:619:4: rule__SimpleInit__Group__0
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
    // InternalMontiArcDSL.g:628:1: entryRuleImportStatements : ruleImportStatements EOF ;
    public final void entryRuleImportStatements() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:629:1: ( ruleImportStatements EOF )
            // InternalMontiArcDSL.g:630:1: ruleImportStatements EOF
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
    // InternalMontiArcDSL.g:637:1: ruleImportStatements : ( ( rule__ImportStatements__Group__0 ) ) ;
    public final void ruleImportStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:641:2: ( ( ( rule__ImportStatements__Group__0 ) ) )
            // InternalMontiArcDSL.g:642:2: ( ( rule__ImportStatements__Group__0 ) )
            {
            // InternalMontiArcDSL.g:642:2: ( ( rule__ImportStatements__Group__0 ) )
            // InternalMontiArcDSL.g:643:3: ( rule__ImportStatements__Group__0 )
            {
             before(grammarAccess.getImportStatementsAccess().getGroup()); 
            // InternalMontiArcDSL.g:644:3: ( rule__ImportStatements__Group__0 )
            // InternalMontiArcDSL.g:644:4: rule__ImportStatements__Group__0
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
    // InternalMontiArcDSL.g:653:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:654:1: ( rulePackage EOF )
            // InternalMontiArcDSL.g:655:1: rulePackage EOF
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
    // InternalMontiArcDSL.g:662:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:666:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalMontiArcDSL.g:667:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalMontiArcDSL.g:667:2: ( ( rule__Package__Group__0 ) )
            // InternalMontiArcDSL.g:668:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalMontiArcDSL.g:669:3: ( rule__Package__Group__0 )
            // InternalMontiArcDSL.g:669:4: rule__Package__Group__0
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
    // InternalMontiArcDSL.g:678:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:679:1: ( ruleType EOF )
            // InternalMontiArcDSL.g:680:1: ruleType EOF
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
    // InternalMontiArcDSL.g:687:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:691:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMontiArcDSL.g:692:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMontiArcDSL.g:692:2: ( ( rule__Type__Alternatives ) )
            // InternalMontiArcDSL.g:693:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:694:3: ( rule__Type__Alternatives )
            // InternalMontiArcDSL.g:694:4: rule__Type__Alternatives
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
    // InternalMontiArcDSL.g:703:1: entryRuleMCPrimitiveType : ruleMCPrimitiveType EOF ;
    public final void entryRuleMCPrimitiveType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:704:1: ( ruleMCPrimitiveType EOF )
            // InternalMontiArcDSL.g:705:1: ruleMCPrimitiveType EOF
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
    // InternalMontiArcDSL.g:712:1: ruleMCPrimitiveType : ( ( rule__MCPrimitiveType__TypeAssignment ) ) ;
    public final void ruleMCPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:716:2: ( ( ( rule__MCPrimitiveType__TypeAssignment ) ) )
            // InternalMontiArcDSL.g:717:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            {
            // InternalMontiArcDSL.g:717:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            // InternalMontiArcDSL.g:718:3: ( rule__MCPrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalMontiArcDSL.g:719:3: ( rule__MCPrimitiveType__TypeAssignment )
            // InternalMontiArcDSL.g:719:4: rule__MCPrimitiveType__TypeAssignment
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
    // InternalMontiArcDSL.g:728:1: entryRuleMCObjectType : ruleMCObjectType EOF ;
    public final void entryRuleMCObjectType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:729:1: ( ruleMCObjectType EOF )
            // InternalMontiArcDSL.g:730:1: ruleMCObjectType EOF
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
    // InternalMontiArcDSL.g:737:1: ruleMCObjectType : ( ( rule__MCObjectType__TypeAssignment ) ) ;
    public final void ruleMCObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:741:2: ( ( ( rule__MCObjectType__TypeAssignment ) ) )
            // InternalMontiArcDSL.g:742:2: ( ( rule__MCObjectType__TypeAssignment ) )
            {
            // InternalMontiArcDSL.g:742:2: ( ( rule__MCObjectType__TypeAssignment ) )
            // InternalMontiArcDSL.g:743:3: ( rule__MCObjectType__TypeAssignment )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 
            // InternalMontiArcDSL.g:744:3: ( rule__MCObjectType__TypeAssignment )
            // InternalMontiArcDSL.g:744:4: rule__MCObjectType__TypeAssignment
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
    // InternalMontiArcDSL.g:753:1: entryRuleMCCollectionType : ruleMCCollectionType EOF ;
    public final void entryRuleMCCollectionType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:754:1: ( ruleMCCollectionType EOF )
            // InternalMontiArcDSL.g:755:1: ruleMCCollectionType EOF
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
    // InternalMontiArcDSL.g:762:1: ruleMCCollectionType : ( ( rule__MCCollectionType__Group__0 ) ) ;
    public final void ruleMCCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:766:2: ( ( ( rule__MCCollectionType__Group__0 ) ) )
            // InternalMontiArcDSL.g:767:2: ( ( rule__MCCollectionType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:767:2: ( ( rule__MCCollectionType__Group__0 ) )
            // InternalMontiArcDSL.g:768:3: ( rule__MCCollectionType__Group__0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:769:3: ( rule__MCCollectionType__Group__0 )
            // InternalMontiArcDSL.g:769:4: rule__MCCollectionType__Group__0
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
    // InternalMontiArcDSL.g:778:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:779:1: ( ruleMCArrayType EOF )
            // InternalMontiArcDSL.g:780:1: ruleMCArrayType EOF
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
    // InternalMontiArcDSL.g:787:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:791:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMontiArcDSL.g:792:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMontiArcDSL.g:792:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMontiArcDSL.g:793:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMontiArcDSL.g:794:3: ( rule__MCArrayType__Group__0 )
            // InternalMontiArcDSL.g:794:4: rule__MCArrayType__Group__0
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
    // InternalMontiArcDSL.g:803:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:804:1: ( ruleExpression EOF )
            // InternalMontiArcDSL.g:805:1: ruleExpression EOF
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
    // InternalMontiArcDSL.g:812:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:816:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMontiArcDSL.g:817:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:817:2: ( ( rule__Expression__Alternatives ) )
            // InternalMontiArcDSL.g:818:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:819:3: ( rule__Expression__Alternatives )
            // InternalMontiArcDSL.g:819:4: rule__Expression__Alternatives
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
    // InternalMontiArcDSL.g:828:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:829:1: ( ruleLiteralExpression EOF )
            // InternalMontiArcDSL.g:830:1: ruleLiteralExpression EOF
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
    // InternalMontiArcDSL.g:837:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:841:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMontiArcDSL.g:842:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:842:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMontiArcDSL.g:843:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:844:3: ( rule__LiteralExpression__Alternatives )
            // InternalMontiArcDSL.g:844:4: rule__LiteralExpression__Alternatives
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
    // InternalMontiArcDSL.g:853:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:854:1: ( ruleNumberLiteral EOF )
            // InternalMontiArcDSL.g:855:1: ruleNumberLiteral EOF
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
    // InternalMontiArcDSL.g:862:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:866:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:867:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:867:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:868:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:869:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:869:4: rule__NumberLiteral__LiteralAssignment
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
    // InternalMontiArcDSL.g:878:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:879:1: ( ruleStringLiteral EOF )
            // InternalMontiArcDSL.g:880:1: ruleStringLiteral EOF
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
    // InternalMontiArcDSL.g:887:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:891:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMontiArcDSL.g:892:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMontiArcDSL.g:892:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMontiArcDSL.g:893:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMontiArcDSL.g:894:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMontiArcDSL.g:894:4: rule__StringLiteral__LiteralAssignment
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
    // InternalMontiArcDSL.g:903:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:904:1: ( ruleNameExpression EOF )
            // InternalMontiArcDSL.g:905:1: ruleNameExpression EOF
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
    // InternalMontiArcDSL.g:912:1: ruleNameExpression : ( ( rule__NameExpression__Alternatives ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:916:2: ( ( ( rule__NameExpression__Alternatives ) ) )
            // InternalMontiArcDSL.g:917:2: ( ( rule__NameExpression__Alternatives ) )
            {
            // InternalMontiArcDSL.g:917:2: ( ( rule__NameExpression__Alternatives ) )
            // InternalMontiArcDSL.g:918:3: ( rule__NameExpression__Alternatives )
            {
             before(grammarAccess.getNameExpressionAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:919:3: ( rule__NameExpression__Alternatives )
            // InternalMontiArcDSL.g:919:4: rule__NameExpression__Alternatives
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
    // InternalMontiArcDSL.g:928:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:929:1: ( ruleBinaryExpression EOF )
            // InternalMontiArcDSL.g:930:1: ruleBinaryExpression EOF
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
    // InternalMontiArcDSL.g:937:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:941:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMontiArcDSL.g:942:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMontiArcDSL.g:942:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMontiArcDSL.g:943:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMontiArcDSL.g:944:3: ( rule__BinaryExpression__Group__0 )
            // InternalMontiArcDSL.g:944:4: rule__BinaryExpression__Group__0
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
    // InternalMontiArcDSL.g:953:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:954:1: ( ruleArguments EOF )
            // InternalMontiArcDSL.g:955:1: ruleArguments EOF
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
    // InternalMontiArcDSL.g:962:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:966:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // InternalMontiArcDSL.g:967:2: ( ( rule__Arguments__Group__0 ) )
            {
            // InternalMontiArcDSL.g:967:2: ( ( rule__Arguments__Group__0 ) )
            // InternalMontiArcDSL.g:968:3: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // InternalMontiArcDSL.g:969:3: ( rule__Arguments__Group__0 )
            // InternalMontiArcDSL.g:969:4: rule__Arguments__Group__0
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
    // InternalMontiArcDSL.g:978:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMontiArcDSL.g:979:1: ( ruleArgument EOF )
            // InternalMontiArcDSL.g:980:1: ruleArgument EOF
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
    // InternalMontiArcDSL.g:987:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:991:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMontiArcDSL.g:992:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMontiArcDSL.g:992:2: ( ( rule__Argument__Group__0 ) )
            // InternalMontiArcDSL.g:993:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMontiArcDSL.g:994:3: ( rule__Argument__Group__0 )
            // InternalMontiArcDSL.g:994:4: rule__Argument__Group__0
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
    // InternalMontiArcDSL.g:1003:1: ruleSCModifier : ( ( rule__SCModifier__Alternatives ) ) ;
    public final void ruleSCModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1007:1: ( ( ( rule__SCModifier__Alternatives ) ) )
            // InternalMontiArcDSL.g:1008:2: ( ( rule__SCModifier__Alternatives ) )
            {
            // InternalMontiArcDSL.g:1008:2: ( ( rule__SCModifier__Alternatives ) )
            // InternalMontiArcDSL.g:1009:3: ( rule__SCModifier__Alternatives )
            {
             before(grammarAccess.getSCModifierAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:1010:3: ( rule__SCModifier__Alternatives )
            // InternalMontiArcDSL.g:1010:4: rule__SCModifier__Alternatives
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
    // InternalMontiArcDSL.g:1019:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1023:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMontiArcDSL.g:1024:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMontiArcDSL.g:1024:2: ( ( rule__Operator__Alternatives ) )
            // InternalMontiArcDSL.g:1025:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMontiArcDSL.g:1026:3: ( rule__Operator__Alternatives )
            // InternalMontiArcDSL.g:1026:4: rule__Operator__Alternatives
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
    // InternalMontiArcDSL.g:1034:1: rule__ArcElement__Alternatives : ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) );
    public final void rule__ArcElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1038:1: ( ( ruleComponent ) | ( ruleSubComponent ) | ( ruleConnector ) | ( rulePorts ) | ( ruleVariable ) | ( ruleAutomaton ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=14 && LA1_1<=32)) ) {
                    alt1=2;
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

                if ( ((LA1_2>=RULE_ID && LA1_2<=RULE_MCQUALIFIEDNAME)||LA1_2==49||LA1_2==52) ) {
                    alt1=5;
                }
                else if ( (LA1_2==50) ) {
                    alt1=3;
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
            case 54:
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
                    // InternalMontiArcDSL.g:1039:2: ( ruleComponent )
                    {
                    // InternalMontiArcDSL.g:1039:2: ( ruleComponent )
                    // InternalMontiArcDSL.g:1040:3: ruleComponent
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
                    // InternalMontiArcDSL.g:1045:2: ( ruleSubComponent )
                    {
                    // InternalMontiArcDSL.g:1045:2: ( ruleSubComponent )
                    // InternalMontiArcDSL.g:1046:3: ruleSubComponent
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
                    // InternalMontiArcDSL.g:1051:2: ( ruleConnector )
                    {
                    // InternalMontiArcDSL.g:1051:2: ( ruleConnector )
                    // InternalMontiArcDSL.g:1052:3: ruleConnector
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
                    // InternalMontiArcDSL.g:1057:2: ( rulePorts )
                    {
                    // InternalMontiArcDSL.g:1057:2: ( rulePorts )
                    // InternalMontiArcDSL.g:1058:3: rulePorts
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
                    // InternalMontiArcDSL.g:1063:2: ( ruleVariable )
                    {
                    // InternalMontiArcDSL.g:1063:2: ( ruleVariable )
                    // InternalMontiArcDSL.g:1064:3: ruleVariable
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
                    // InternalMontiArcDSL.g:1069:2: ( ruleAutomaton )
                    {
                    // InternalMontiArcDSL.g:1069:2: ( ruleAutomaton )
                    // InternalMontiArcDSL.g:1070:3: ruleAutomaton
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
    // InternalMontiArcDSL.g:1079:1: rule__Connector__SourceAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Connector__SourceAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1083:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
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
                    // InternalMontiArcDSL.g:1084:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1084:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1085:3: RULE_ID
                    {
                     before(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1090:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1090:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1091:3: RULE_MCQUALIFIEDNAME
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


    // $ANTLR start "rule__Port__Alternatives_1"
    // InternalMontiArcDSL.g:1100:1: rule__Port__Alternatives_1 : ( ( ( rule__Port__InAssignment_1_0 ) ) | ( ( rule__Port__OutAssignment_1_1 ) ) );
    public final void rule__Port__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1104:1: ( ( ( rule__Port__InAssignment_1_0 ) ) | ( ( rule__Port__OutAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==60) ) {
                alt3=1;
            }
            else if ( (LA3_0==61) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMontiArcDSL.g:1105:2: ( ( rule__Port__InAssignment_1_0 ) )
                    {
                    // InternalMontiArcDSL.g:1105:2: ( ( rule__Port__InAssignment_1_0 ) )
                    // InternalMontiArcDSL.g:1106:3: ( rule__Port__InAssignment_1_0 )
                    {
                     before(grammarAccess.getPortAccess().getInAssignment_1_0()); 
                    // InternalMontiArcDSL.g:1107:3: ( rule__Port__InAssignment_1_0 )
                    // InternalMontiArcDSL.g:1107:4: rule__Port__InAssignment_1_0
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
                    // InternalMontiArcDSL.g:1111:2: ( ( rule__Port__OutAssignment_1_1 ) )
                    {
                    // InternalMontiArcDSL.g:1111:2: ( ( rule__Port__OutAssignment_1_1 ) )
                    // InternalMontiArcDSL.g:1112:3: ( rule__Port__OutAssignment_1_1 )
                    {
                     before(grammarAccess.getPortAccess().getOutAssignment_1_1()); 
                    // InternalMontiArcDSL.g:1113:3: ( rule__Port__OutAssignment_1_1 )
                    // InternalMontiArcDSL.g:1113:4: rule__Port__OutAssignment_1_1
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


    // $ANTLR start "rule__Port__Alternatives_2"
    // InternalMontiArcDSL.g:1121:1: rule__Port__Alternatives_2 : ( ( ( rule__Port__TypeAssignment_2_0 ) ) | ( ( rule__Port__DatatypeAssignment_2_1 ) ) );
    public final void rule__Port__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1125:1: ( ( ( rule__Port__TypeAssignment_2_0 ) ) | ( ( rule__Port__DatatypeAssignment_2_1 ) ) )
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
                    // InternalMontiArcDSL.g:1126:2: ( ( rule__Port__TypeAssignment_2_0 ) )
                    {
                    // InternalMontiArcDSL.g:1126:2: ( ( rule__Port__TypeAssignment_2_0 ) )
                    // InternalMontiArcDSL.g:1127:3: ( rule__Port__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getPortAccess().getTypeAssignment_2_0()); 
                    // InternalMontiArcDSL.g:1128:3: ( rule__Port__TypeAssignment_2_0 )
                    // InternalMontiArcDSL.g:1128:4: rule__Port__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__TypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1132:2: ( ( rule__Port__DatatypeAssignment_2_1 ) )
                    {
                    // InternalMontiArcDSL.g:1132:2: ( ( rule__Port__DatatypeAssignment_2_1 ) )
                    // InternalMontiArcDSL.g:1133:3: ( rule__Port__DatatypeAssignment_2_1 )
                    {
                     before(grammarAccess.getPortAccess().getDatatypeAssignment_2_1()); 
                    // InternalMontiArcDSL.g:1134:3: ( rule__Port__DatatypeAssignment_2_1 )
                    // InternalMontiArcDSL.g:1134:4: rule__Port__DatatypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__DatatypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPortAccess().getDatatypeAssignment_2_1()); 

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


    // $ANTLR start "rule__Names__NamesAlternatives_0_0"
    // InternalMontiArcDSL.g:1142:1: rule__Names__NamesAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Names__NamesAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1146:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
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
                    // InternalMontiArcDSL.g:1147:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1147:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1148:3: RULE_ID
                    {
                     before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1153:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1153:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1154:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:1163:1: rule__Names__NamesAlternatives_1_1_0 : ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) );
    public final void rule__Names__NamesAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1167:1: ( ( RULE_ID ) | ( RULE_MCQUALIFIEDNAME ) )
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
                    // InternalMontiArcDSL.g:1168:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1168:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1169:3: RULE_ID
                    {
                     before(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1174:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1174:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1175:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:1184:1: rule__Variable__TypeAlternatives_0_0 : ( ( ruleType ) | ( ruleComponentType ) );
    public final void rule__Variable__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1188:1: ( ( ruleType ) | ( ruleComponentType ) )
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
                    // InternalMontiArcDSL.g:1189:2: ( ruleType )
                    {
                    // InternalMontiArcDSL.g:1189:2: ( ruleType )
                    // InternalMontiArcDSL.g:1190:3: ruleType
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
                    // InternalMontiArcDSL.g:1195:2: ( ruleComponentType )
                    {
                    // InternalMontiArcDSL.g:1195:2: ( ruleComponentType )
                    // InternalMontiArcDSL.g:1196:3: ruleComponentType
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
    // InternalMontiArcDSL.g:1205:1: rule__Automaton__Alternatives_5 : ( ( ( rule__Automaton__StatesAssignment_5_0 ) ) | ( ( rule__Automaton__TransitionsAssignment_5_1 ) ) );
    public final void rule__Automaton__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1209:1: ( ( ( rule__Automaton__StatesAssignment_5_0 ) ) | ( ( rule__Automaton__TransitionsAssignment_5_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=33 && LA8_0<=34)||LA8_0==44||LA8_0==55) ) {
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
                    // InternalMontiArcDSL.g:1210:2: ( ( rule__Automaton__StatesAssignment_5_0 ) )
                    {
                    // InternalMontiArcDSL.g:1210:2: ( ( rule__Automaton__StatesAssignment_5_0 ) )
                    // InternalMontiArcDSL.g:1211:3: ( rule__Automaton__StatesAssignment_5_0 )
                    {
                     before(grammarAccess.getAutomatonAccess().getStatesAssignment_5_0()); 
                    // InternalMontiArcDSL.g:1212:3: ( rule__Automaton__StatesAssignment_5_0 )
                    // InternalMontiArcDSL.g:1212:4: rule__Automaton__StatesAssignment_5_0
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
                    // InternalMontiArcDSL.g:1216:2: ( ( rule__Automaton__TransitionsAssignment_5_1 ) )
                    {
                    // InternalMontiArcDSL.g:1216:2: ( ( rule__Automaton__TransitionsAssignment_5_1 ) )
                    // InternalMontiArcDSL.g:1217:3: ( rule__Automaton__TransitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getAutomatonAccess().getTransitionsAssignment_5_1()); 
                    // InternalMontiArcDSL.g:1218:3: ( rule__Automaton__TransitionsAssignment_5_1 )
                    // InternalMontiArcDSL.g:1218:4: rule__Automaton__TransitionsAssignment_5_1
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
    // InternalMontiArcDSL.g:1226:1: rule__State__Alternatives : ( ( ruleSCState ) | ( ruleInvState ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1230:1: ( ( ruleSCState ) | ( ruleInvState ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMontiArcDSL.g:1231:2: ( ruleSCState )
                    {
                    // InternalMontiArcDSL.g:1231:2: ( ruleSCState )
                    // InternalMontiArcDSL.g:1232:3: ruleSCState
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
                    // InternalMontiArcDSL.g:1237:2: ( ruleInvState )
                    {
                    // InternalMontiArcDSL.g:1237:2: ( ruleInvState )
                    // InternalMontiArcDSL.g:1238:3: ruleInvState
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
    // InternalMontiArcDSL.g:1247:1: rule__BlockStatement__Alternatives : ( ( ruleSimpleInit ) | ( ruleSimpleExpression ) );
    public final void rule__BlockStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1251:1: ( ( ruleSimpleInit ) | ( ruleSimpleExpression ) )
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
            else if ( (LA10_0==RULE_MCQUALIFIEDNAME||(LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiArcDSL.g:1252:2: ( ruleSimpleInit )
                    {
                    // InternalMontiArcDSL.g:1252:2: ( ruleSimpleInit )
                    // InternalMontiArcDSL.g:1253:3: ruleSimpleInit
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
                    // InternalMontiArcDSL.g:1258:2: ( ruleSimpleExpression )
                    {
                    // InternalMontiArcDSL.g:1258:2: ( ruleSimpleExpression )
                    // InternalMontiArcDSL.g:1259:3: ruleSimpleExpression
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
    // InternalMontiArcDSL.g:1268:1: rule__Package__NameAlternatives_1_0 : ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) );
    public final void rule__Package__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1272:1: ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) )
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
                    // InternalMontiArcDSL.g:1273:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:1273:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:1274:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1279:2: ( RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1279:2: ( RULE_ID )
                    // InternalMontiArcDSL.g:1280:3: RULE_ID
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
    // InternalMontiArcDSL.g:1289:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1293:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMontiArcDSL.g:1294:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiArcDSL.g:1294:2: ( ruleMCPrimitiveType )
                    // InternalMontiArcDSL.g:1295:3: ruleMCPrimitiveType
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
                    // InternalMontiArcDSL.g:1300:2: ( ruleMCArrayType )
                    {
                    // InternalMontiArcDSL.g:1300:2: ( ruleMCArrayType )
                    // InternalMontiArcDSL.g:1301:3: ruleMCArrayType
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
                    // InternalMontiArcDSL.g:1306:2: ( ruleMCObjectType )
                    {
                    // InternalMontiArcDSL.g:1306:2: ( ruleMCObjectType )
                    // InternalMontiArcDSL.g:1307:3: ruleMCObjectType
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
                    // InternalMontiArcDSL.g:1312:2: ( ruleMCCollectionType )
                    {
                    // InternalMontiArcDSL.g:1312:2: ( ruleMCCollectionType )
                    // InternalMontiArcDSL.g:1313:3: ruleMCCollectionType
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
    // InternalMontiArcDSL.g:1322:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1326:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
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
                    // InternalMontiArcDSL.g:1327:2: ( 'boolean' )
                    {
                    // InternalMontiArcDSL.g:1327:2: ( 'boolean' )
                    // InternalMontiArcDSL.g:1328:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1333:2: ( 'byte' )
                    {
                    // InternalMontiArcDSL.g:1333:2: ( 'byte' )
                    // InternalMontiArcDSL.g:1334:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1339:2: ( 'short' )
                    {
                    // InternalMontiArcDSL.g:1339:2: ( 'short' )
                    // InternalMontiArcDSL.g:1340:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1345:2: ( 'int' )
                    {
                    // InternalMontiArcDSL.g:1345:2: ( 'int' )
                    // InternalMontiArcDSL.g:1346:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1351:2: ( 'long' )
                    {
                    // InternalMontiArcDSL.g:1351:2: ( 'long' )
                    // InternalMontiArcDSL.g:1352:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1357:2: ( 'char' )
                    {
                    // InternalMontiArcDSL.g:1357:2: ( 'char' )
                    // InternalMontiArcDSL.g:1358:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1363:2: ( 'float' )
                    {
                    // InternalMontiArcDSL.g:1363:2: ( 'float' )
                    // InternalMontiArcDSL.g:1364:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:1369:2: ( 'double' )
                    {
                    // InternalMontiArcDSL.g:1369:2: ( 'double' )
                    // InternalMontiArcDSL.g:1370:3: 'double'
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
    // InternalMontiArcDSL.g:1379:1: rule__MCObjectType__TypeAlternatives_0 : ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) );
    public final void rule__MCObjectType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1383:1: ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) )
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
                    // InternalMontiArcDSL.g:1384:2: ( 'Boolean' )
                    {
                    // InternalMontiArcDSL.g:1384:2: ( 'Boolean' )
                    // InternalMontiArcDSL.g:1385:3: 'Boolean'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1390:2: ( 'Byte' )
                    {
                    // InternalMontiArcDSL.g:1390:2: ( 'Byte' )
                    // InternalMontiArcDSL.g:1391:3: 'Byte'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1396:2: ( 'Integer' )
                    {
                    // InternalMontiArcDSL.g:1396:2: ( 'Integer' )
                    // InternalMontiArcDSL.g:1397:3: 'Integer'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1402:2: ( 'Long' )
                    {
                    // InternalMontiArcDSL.g:1402:2: ( 'Long' )
                    // InternalMontiArcDSL.g:1403:3: 'Long'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1408:2: ( 'Char' )
                    {
                    // InternalMontiArcDSL.g:1408:2: ( 'Char' )
                    // InternalMontiArcDSL.g:1409:3: 'Char'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1414:2: ( 'Double' )
                    {
                    // InternalMontiArcDSL.g:1414:2: ( 'Double' )
                    // InternalMontiArcDSL.g:1415:3: 'Double'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1420:2: ( 'String' )
                    {
                    // InternalMontiArcDSL.g:1420:2: ( 'String' )
                    // InternalMontiArcDSL.g:1421:3: 'String'
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
    // InternalMontiArcDSL.g:1430:1: rule__MCCollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) );
    public final void rule__MCCollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1434:1: ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) )
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
                    // InternalMontiArcDSL.g:1435:2: ( 'Set' )
                    {
                    // InternalMontiArcDSL.g:1435:2: ( 'Set' )
                    // InternalMontiArcDSL.g:1436:3: 'Set'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1441:2: ( 'List' )
                    {
                    // InternalMontiArcDSL.g:1441:2: ( 'List' )
                    // InternalMontiArcDSL.g:1442:3: 'List'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1447:2: ( 'Map' )
                    {
                    // InternalMontiArcDSL.g:1447:2: ( 'Map' )
                    // InternalMontiArcDSL.g:1448:3: 'Map'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1453:2: ( 'Optional' )
                    {
                    // InternalMontiArcDSL.g:1453:2: ( 'Optional' )
                    // InternalMontiArcDSL.g:1454:3: 'Optional'
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
    // InternalMontiArcDSL.g:1463:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1467:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||LA16_1==44||(LA16_1>=46 && LA16_1<=47)||LA16_1==49||LA16_1==53||LA16_1==57) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=35 && LA16_1<=42)) ) {
                    alt16=3;
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

                if ( (LA16_2==EOF||LA16_2==44||(LA16_2>=46 && LA16_2<=47)||LA16_2==49||LA16_2==53||LA16_2==57) ) {
                    alt16=1;
                }
                else if ( ((LA16_2>=35 && LA16_2<=42)) ) {
                    alt16=3;
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

                if ( (LA16_3==EOF||LA16_3==44||(LA16_3>=46 && LA16_3<=47)||LA16_3==49||LA16_3==53||LA16_3==57) ) {
                    alt16=2;
                }
                else if ( ((LA16_3>=35 && LA16_3<=42)) ) {
                    alt16=3;
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

                if ( (LA16_4==EOF||LA16_4==44||(LA16_4>=46 && LA16_4<=47)||LA16_4==49||LA16_4==53||LA16_4==57) ) {
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
                    // InternalMontiArcDSL.g:1468:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1468:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1469:3: ruleNameExpression
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
                    // InternalMontiArcDSL.g:1474:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1474:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1475:3: ruleLiteralExpression
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
                    // InternalMontiArcDSL.g:1480:2: ( ruleBinaryExpression )
                    {
                    // InternalMontiArcDSL.g:1480:2: ( ruleBinaryExpression )
                    // InternalMontiArcDSL.g:1481:3: ruleBinaryExpression
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
    // InternalMontiArcDSL.g:1490:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1494:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
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
                    // InternalMontiArcDSL.g:1495:2: ( ruleNumberLiteral )
                    {
                    // InternalMontiArcDSL.g:1495:2: ( ruleNumberLiteral )
                    // InternalMontiArcDSL.g:1496:3: ruleNumberLiteral
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
                    // InternalMontiArcDSL.g:1501:2: ( ruleStringLiteral )
                    {
                    // InternalMontiArcDSL.g:1501:2: ( ruleStringLiteral )
                    // InternalMontiArcDSL.g:1502:3: ruleStringLiteral
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
    // InternalMontiArcDSL.g:1511:1: rule__NameExpression__Alternatives : ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) );
    public final void rule__NameExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1515:1: ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) )
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
                    // InternalMontiArcDSL.g:1516:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    {
                    // InternalMontiArcDSL.g:1516:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    // InternalMontiArcDSL.g:1517:3: ( rule__NameExpression__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 
                    // InternalMontiArcDSL.g:1518:3: ( rule__NameExpression__NameAssignment_0 )
                    // InternalMontiArcDSL.g:1518:4: rule__NameExpression__NameAssignment_0
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
                    // InternalMontiArcDSL.g:1522:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    {
                    // InternalMontiArcDSL.g:1522:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    // InternalMontiArcDSL.g:1523:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 
                    // InternalMontiArcDSL.g:1524:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    // InternalMontiArcDSL.g:1524:4: rule__NameExpression__QualifiednameAssignment_1
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
    // InternalMontiArcDSL.g:1532:1: rule__BinaryExpression__Literal1Alternatives_0_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1536:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_STRING)) ) {
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
                    // InternalMontiArcDSL.g:1537:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1537:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1538:3: ruleLiteralExpression
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
                    // InternalMontiArcDSL.g:1543:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1543:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1544:3: ruleNameExpression
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
    // InternalMontiArcDSL.g:1553:1: rule__BinaryExpression__Literal2Alternatives_2_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal2Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1557:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)) ) {
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
                    // InternalMontiArcDSL.g:1558:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiArcDSL.g:1558:2: ( ruleLiteralExpression )
                    // InternalMontiArcDSL.g:1559:3: ruleLiteralExpression
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
                    // InternalMontiArcDSL.g:1564:2: ( ruleNameExpression )
                    {
                    // InternalMontiArcDSL.g:1564:2: ( ruleNameExpression )
                    // InternalMontiArcDSL.g:1565:3: ruleNameExpression
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
    // InternalMontiArcDSL.g:1574:1: rule__SCModifier__Alternatives : ( ( ( 'initial' ) ) | ( ( 'final' ) ) );
    public final void rule__SCModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1578:1: ( ( ( 'initial' ) ) | ( ( 'final' ) ) )
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
                    // InternalMontiArcDSL.g:1579:2: ( ( 'initial' ) )
                    {
                    // InternalMontiArcDSL.g:1579:2: ( ( 'initial' ) )
                    // InternalMontiArcDSL.g:1580:3: ( 'initial' )
                    {
                     before(grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0()); 
                    // InternalMontiArcDSL.g:1581:3: ( 'initial' )
                    // InternalMontiArcDSL.g:1581:4: 'initial'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1585:2: ( ( 'final' ) )
                    {
                    // InternalMontiArcDSL.g:1585:2: ( ( 'final' ) )
                    // InternalMontiArcDSL.g:1586:3: ( 'final' )
                    {
                     before(grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1()); 
                    // InternalMontiArcDSL.g:1587:3: ( 'final' )
                    // InternalMontiArcDSL.g:1587:4: 'final'
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
    // InternalMontiArcDSL.g:1595:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1599:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) )
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
                    // InternalMontiArcDSL.g:1600:2: ( ( '>' ) )
                    {
                    // InternalMontiArcDSL.g:1600:2: ( ( '>' ) )
                    // InternalMontiArcDSL.g:1601:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalMontiArcDSL.g:1602:3: ( '>' )
                    // InternalMontiArcDSL.g:1602:4: '>'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1606:2: ( ( '<' ) )
                    {
                    // InternalMontiArcDSL.g:1606:2: ( ( '<' ) )
                    // InternalMontiArcDSL.g:1607:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    // InternalMontiArcDSL.g:1608:3: ( '<' )
                    // InternalMontiArcDSL.g:1608:4: '<'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1612:2: ( ( '==' ) )
                    {
                    // InternalMontiArcDSL.g:1612:2: ( ( '==' ) )
                    // InternalMontiArcDSL.g:1613:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalMontiArcDSL.g:1614:3: ( '==' )
                    // InternalMontiArcDSL.g:1614:4: '=='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1618:2: ( ( '&&' ) )
                    {
                    // InternalMontiArcDSL.g:1618:2: ( ( '&&' ) )
                    // InternalMontiArcDSL.g:1619:3: ( '&&' )
                    {
                     before(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 
                    // InternalMontiArcDSL.g:1620:3: ( '&&' )
                    // InternalMontiArcDSL.g:1620:4: '&&'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1624:2: ( ( '+' ) )
                    {
                    // InternalMontiArcDSL.g:1624:2: ( ( '+' ) )
                    // InternalMontiArcDSL.g:1625:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 
                    // InternalMontiArcDSL.g:1626:3: ( '+' )
                    // InternalMontiArcDSL.g:1626:4: '+'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1630:2: ( ( '-' ) )
                    {
                    // InternalMontiArcDSL.g:1630:2: ( ( '-' ) )
                    // InternalMontiArcDSL.g:1631:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 
                    // InternalMontiArcDSL.g:1632:3: ( '-' )
                    // InternalMontiArcDSL.g:1632:4: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1636:2: ( ( '/' ) )
                    {
                    // InternalMontiArcDSL.g:1636:2: ( ( '/' ) )
                    // InternalMontiArcDSL.g:1637:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 
                    // InternalMontiArcDSL.g:1638:3: ( '/' )
                    // InternalMontiArcDSL.g:1638:4: '/'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:1642:2: ( ( '*' ) )
                    {
                    // InternalMontiArcDSL.g:1642:2: ( ( '*' ) )
                    // InternalMontiArcDSL.g:1643:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 
                    // InternalMontiArcDSL.g:1644:3: ( '*' )
                    // InternalMontiArcDSL.g:1644:4: '*'
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
    // InternalMontiArcDSL.g:1652:1: rule__MACompilationUnit__Group__0 : rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 ;
    public final void rule__MACompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1656:1: ( rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1 )
            // InternalMontiArcDSL.g:1657:2: rule__MACompilationUnit__Group__0__Impl rule__MACompilationUnit__Group__1
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
    // InternalMontiArcDSL.g:1664:1: rule__MACompilationUnit__Group__0__Impl : ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__MACompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1668:1: ( ( ( rule__MACompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiArcDSL.g:1669:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:1669:1: ( ( rule__MACompilationUnit__PackageAssignment_0 ) )
            // InternalMontiArcDSL.g:1670:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiArcDSL.g:1671:2: ( rule__MACompilationUnit__PackageAssignment_0 )
            // InternalMontiArcDSL.g:1671:3: rule__MACompilationUnit__PackageAssignment_0
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
    // InternalMontiArcDSL.g:1679:1: rule__MACompilationUnit__Group__1 : rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 ;
    public final void rule__MACompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1683:1: ( rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2 )
            // InternalMontiArcDSL.g:1684:2: rule__MACompilationUnit__Group__1__Impl rule__MACompilationUnit__Group__2
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
    // InternalMontiArcDSL.g:1691:1: rule__MACompilationUnit__Group__1__Impl : ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__MACompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1695:1: ( ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiArcDSL.g:1696:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiArcDSL.g:1696:1: ( ( rule__MACompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiArcDSL.g:1697:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getMACompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiArcDSL.g:1698:2: ( rule__MACompilationUnit__ImportStatementsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==58) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1698:3: rule__MACompilationUnit__ImportStatementsAssignment_1
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
    // InternalMontiArcDSL.g:1706:1: rule__MACompilationUnit__Group__2 : rule__MACompilationUnit__Group__2__Impl ;
    public final void rule__MACompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1710:1: ( rule__MACompilationUnit__Group__2__Impl )
            // InternalMontiArcDSL.g:1711:2: rule__MACompilationUnit__Group__2__Impl
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
    // InternalMontiArcDSL.g:1717:1: rule__MACompilationUnit__Group__2__Impl : ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) ;
    public final void rule__MACompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1721:1: ( ( ( rule__MACompilationUnit__ComponentAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1722:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1722:1: ( ( rule__MACompilationUnit__ComponentAssignment_2 ) )
            // InternalMontiArcDSL.g:1723:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            {
             before(grammarAccess.getMACompilationUnitAccess().getComponentAssignment_2()); 
            // InternalMontiArcDSL.g:1724:2: ( rule__MACompilationUnit__ComponentAssignment_2 )
            // InternalMontiArcDSL.g:1724:3: rule__MACompilationUnit__ComponentAssignment_2
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
    // InternalMontiArcDSL.g:1733:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1737:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMontiArcDSL.g:1738:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalMontiArcDSL.g:1745:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1749:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:1750:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:1750:1: ( 'component' )
            // InternalMontiArcDSL.g:1751:2: 'component'
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
    // InternalMontiArcDSL.g:1760:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1764:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMontiArcDSL.g:1765:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalMontiArcDSL.g:1772:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1776:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:1777:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:1777:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:1778:2: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:1779:2: ( rule__Component__NameAssignment_1 )
            // InternalMontiArcDSL.g:1779:3: rule__Component__NameAssignment_1
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
    // InternalMontiArcDSL.g:1787:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1791:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMontiArcDSL.g:1792:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalMontiArcDSL.g:1799:1: rule__Component__Group__2__Impl : ( ( rule__Component__SignatureAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1803:1: ( ( ( rule__Component__SignatureAssignment_2 ) ) )
            // InternalMontiArcDSL.g:1804:1: ( ( rule__Component__SignatureAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:1804:1: ( ( rule__Component__SignatureAssignment_2 ) )
            // InternalMontiArcDSL.g:1805:2: ( rule__Component__SignatureAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getSignatureAssignment_2()); 
            // InternalMontiArcDSL.g:1806:2: ( rule__Component__SignatureAssignment_2 )
            // InternalMontiArcDSL.g:1806:3: rule__Component__SignatureAssignment_2
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
    // InternalMontiArcDSL.g:1814:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1818:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMontiArcDSL.g:1819:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalMontiArcDSL.g:1826:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1830:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:1831:1: ( '{' )
            {
            // InternalMontiArcDSL.g:1831:1: ( '{' )
            // InternalMontiArcDSL.g:1832:2: '{'
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
    // InternalMontiArcDSL.g:1841:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1845:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMontiArcDSL.g:1846:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMontiArcDSL.g:1853:1: rule__Component__Group__4__Impl : ( ( rule__Component__ArcElementsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1857:1: ( ( ( rule__Component__ArcElementsAssignment_4 )* ) )
            // InternalMontiArcDSL.g:1858:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            {
            // InternalMontiArcDSL.g:1858:1: ( ( rule__Component__ArcElementsAssignment_4 )* )
            // InternalMontiArcDSL.g:1859:2: ( rule__Component__ArcElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getArcElementsAssignment_4()); 
            // InternalMontiArcDSL.g:1860:2: ( rule__Component__ArcElementsAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_SYNC)||(LA24_0>=14 && LA24_0<=32)||LA24_0==43||LA24_0==51||LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1860:3: rule__Component__ArcElementsAssignment_4
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
    // InternalMontiArcDSL.g:1868:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1872:1: ( rule__Component__Group__5__Impl )
            // InternalMontiArcDSL.g:1873:2: rule__Component__Group__5__Impl
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
    // InternalMontiArcDSL.g:1879:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1883:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:1884:1: ( '}' )
            {
            // InternalMontiArcDSL.g:1884:1: ( '}' )
            // InternalMontiArcDSL.g:1885:2: '}'
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
    // InternalMontiArcDSL.g:1895:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1899:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // InternalMontiArcDSL.g:1900:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
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
    // InternalMontiArcDSL.g:1907:1: rule__Signature__Group__0__Impl : ( () ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1911:1: ( ( () ) )
            // InternalMontiArcDSL.g:1912:1: ( () )
            {
            // InternalMontiArcDSL.g:1912:1: ( () )
            // InternalMontiArcDSL.g:1913:2: ()
            {
             before(grammarAccess.getSignatureAccess().getSignatureAction_0()); 
            // InternalMontiArcDSL.g:1914:2: ()
            // InternalMontiArcDSL.g:1914:3: 
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
    // InternalMontiArcDSL.g:1922:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1926:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // InternalMontiArcDSL.g:1927:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
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
    // InternalMontiArcDSL.g:1934:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__ParametersAssignment_1 )? ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1938:1: ( ( ( rule__Signature__ParametersAssignment_1 )? ) )
            // InternalMontiArcDSL.g:1939:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:1939:1: ( ( rule__Signature__ParametersAssignment_1 )? )
            // InternalMontiArcDSL.g:1940:2: ( rule__Signature__ParametersAssignment_1 )?
            {
             before(grammarAccess.getSignatureAccess().getParametersAssignment_1()); 
            // InternalMontiArcDSL.g:1941:2: ( rule__Signature__ParametersAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=14 && LA25_0<=32)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMontiArcDSL.g:1941:3: rule__Signature__ParametersAssignment_1
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
    // InternalMontiArcDSL.g:1949:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1953:1: ( rule__Signature__Group__2__Impl )
            // InternalMontiArcDSL.g:1954:2: rule__Signature__Group__2__Impl
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
    // InternalMontiArcDSL.g:1960:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )? ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1964:1: ( ( ( rule__Signature__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:1965:1: ( ( rule__Signature__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:1965:1: ( ( rule__Signature__Group_2__0 )? )
            // InternalMontiArcDSL.g:1966:2: ( rule__Signature__Group_2__0 )?
            {
             before(grammarAccess.getSignatureAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:1967:2: ( rule__Signature__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMontiArcDSL.g:1967:3: rule__Signature__Group_2__0
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
    // InternalMontiArcDSL.g:1976:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1980:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // InternalMontiArcDSL.g:1981:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
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
    // InternalMontiArcDSL.g:1988:1: rule__Signature__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:1992:1: ( ( 'extends' ) )
            // InternalMontiArcDSL.g:1993:1: ( 'extends' )
            {
            // InternalMontiArcDSL.g:1993:1: ( 'extends' )
            // InternalMontiArcDSL.g:1994:2: 'extends'
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
    // InternalMontiArcDSL.g:2003:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2007:1: ( rule__Signature__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2008:2: rule__Signature__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2014:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__TypeAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2018:1: ( ( ( rule__Signature__TypeAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2019:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2019:1: ( ( rule__Signature__TypeAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2020:2: ( rule__Signature__TypeAssignment_2_1 )
            {
             before(grammarAccess.getSignatureAccess().getTypeAssignment_2_1()); 
            // InternalMontiArcDSL.g:2021:2: ( rule__Signature__TypeAssignment_2_1 )
            // InternalMontiArcDSL.g:2021:3: rule__Signature__TypeAssignment_2_1
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
    // InternalMontiArcDSL.g:2030:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2034:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalMontiArcDSL.g:2035:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
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
    // InternalMontiArcDSL.g:2042:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__ParametersAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2046:1: ( ( ( rule__Parameters__ParametersAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2047:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2047:1: ( ( rule__Parameters__ParametersAssignment_0 ) )
            // InternalMontiArcDSL.g:2048:2: ( rule__Parameters__ParametersAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_0()); 
            // InternalMontiArcDSL.g:2049:2: ( rule__Parameters__ParametersAssignment_0 )
            // InternalMontiArcDSL.g:2049:3: rule__Parameters__ParametersAssignment_0
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
    // InternalMontiArcDSL.g:2057:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2061:1: ( rule__Parameters__Group__1__Impl )
            // InternalMontiArcDSL.g:2062:2: rule__Parameters__Group__1__Impl
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
    // InternalMontiArcDSL.g:2068:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2072:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:2073:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:2073:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalMontiArcDSL.g:2074:2: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2075:2: ( rule__Parameters__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==47) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2075:3: rule__Parameters__Group_1__0
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
    // InternalMontiArcDSL.g:2084:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2088:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalMontiArcDSL.g:2089:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
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
    // InternalMontiArcDSL.g:2096:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2100:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2101:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2101:1: ( ',' )
            // InternalMontiArcDSL.g:2102:2: ','
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
    // InternalMontiArcDSL.g:2111:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2115:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2116:2: rule__Parameters__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2122:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__ParametersAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2126:1: ( ( ( rule__Parameters__ParametersAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2127:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2127:1: ( ( rule__Parameters__ParametersAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2128:2: ( rule__Parameters__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getParametersAssignment_1_1()); 
            // InternalMontiArcDSL.g:2129:2: ( rule__Parameters__ParametersAssignment_1_1 )
            // InternalMontiArcDSL.g:2129:3: rule__Parameters__ParametersAssignment_1_1
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
    // InternalMontiArcDSL.g:2138:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2142:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMontiArcDSL.g:2143:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalMontiArcDSL.g:2150:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2154:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2155:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2155:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:2156:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:2157:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMontiArcDSL.g:2157:3: rule__Parameter__TypeAssignment_0
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
    // InternalMontiArcDSL.g:2165:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2169:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMontiArcDSL.g:2170:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalMontiArcDSL.g:2177:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2181:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2182:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2182:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:2183:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:2184:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMontiArcDSL.g:2184:3: rule__Parameter__NameAssignment_1
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
    // InternalMontiArcDSL.g:2192:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2196:1: ( rule__Parameter__Group__2__Impl )
            // InternalMontiArcDSL.g:2197:2: rule__Parameter__Group__2__Impl
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
    // InternalMontiArcDSL.g:2203:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__Group_2__0 )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2207:1: ( ( ( rule__Parameter__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2208:1: ( ( rule__Parameter__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2208:1: ( ( rule__Parameter__Group_2__0 )? )
            // InternalMontiArcDSL.g:2209:2: ( rule__Parameter__Group_2__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2210:2: ( rule__Parameter__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMontiArcDSL.g:2210:3: rule__Parameter__Group_2__0
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
    // InternalMontiArcDSL.g:2219:1: rule__Parameter__Group_2__0 : rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 ;
    public final void rule__Parameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2223:1: ( rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1 )
            // InternalMontiArcDSL.g:2224:2: rule__Parameter__Group_2__0__Impl rule__Parameter__Group_2__1
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
    // InternalMontiArcDSL.g:2231:1: rule__Parameter__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Parameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2235:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:2236:1: ( '=' )
            {
            // InternalMontiArcDSL.g:2236:1: ( '=' )
            // InternalMontiArcDSL.g:2237:2: '='
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
    // InternalMontiArcDSL.g:2246:1: rule__Parameter__Group_2__1 : rule__Parameter__Group_2__1__Impl ;
    public final void rule__Parameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2250:1: ( rule__Parameter__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2251:2: rule__Parameter__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2257:1: rule__Parameter__Group_2__1__Impl : ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Parameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2261:1: ( ( ( rule__Parameter__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2262:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2262:1: ( ( rule__Parameter__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2263:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getParameterAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:2264:2: ( rule__Parameter__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:2264:3: rule__Parameter__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:2273:1: rule__SubComponent__Group__0 : rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 ;
    public final void rule__SubComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2277:1: ( rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1 )
            // InternalMontiArcDSL.g:2278:2: rule__SubComponent__Group__0__Impl rule__SubComponent__Group__1
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
    // InternalMontiArcDSL.g:2285:1: rule__SubComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__SubComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2289:1: ( ( 'component' ) )
            // InternalMontiArcDSL.g:2290:1: ( 'component' )
            {
            // InternalMontiArcDSL.g:2290:1: ( 'component' )
            // InternalMontiArcDSL.g:2291:2: 'component'
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
    // InternalMontiArcDSL.g:2300:1: rule__SubComponent__Group__1 : rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 ;
    public final void rule__SubComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2304:1: ( rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2 )
            // InternalMontiArcDSL.g:2305:2: rule__SubComponent__Group__1__Impl rule__SubComponent__Group__2
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
    // InternalMontiArcDSL.g:2312:1: rule__SubComponent__Group__1__Impl : ( ( rule__SubComponent__TypeAssignment_1 ) ) ;
    public final void rule__SubComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2316:1: ( ( ( rule__SubComponent__TypeAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2317:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2317:1: ( ( rule__SubComponent__TypeAssignment_1 ) )
            // InternalMontiArcDSL.g:2318:2: ( rule__SubComponent__TypeAssignment_1 )
            {
             before(grammarAccess.getSubComponentAccess().getTypeAssignment_1()); 
            // InternalMontiArcDSL.g:2319:2: ( rule__SubComponent__TypeAssignment_1 )
            // InternalMontiArcDSL.g:2319:3: rule__SubComponent__TypeAssignment_1
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
    // InternalMontiArcDSL.g:2327:1: rule__SubComponent__Group__2 : rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 ;
    public final void rule__SubComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2331:1: ( rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3 )
            // InternalMontiArcDSL.g:2332:2: rule__SubComponent__Group__2__Impl rule__SubComponent__Group__3
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
    // InternalMontiArcDSL.g:2339:1: rule__SubComponent__Group__2__Impl : ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) ;
    public final void rule__SubComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2343:1: ( ( ( rule__SubComponent__ArgumentsAssignment_2 )? ) )
            // InternalMontiArcDSL.g:2344:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:2344:1: ( ( rule__SubComponent__ArgumentsAssignment_2 )? )
            // InternalMontiArcDSL.g:2345:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            {
             before(grammarAccess.getSubComponentAccess().getArgumentsAssignment_2()); 
            // InternalMontiArcDSL.g:2346:2: ( rule__SubComponent__ArgumentsAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMontiArcDSL.g:2346:3: rule__SubComponent__ArgumentsAssignment_2
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
    // InternalMontiArcDSL.g:2354:1: rule__SubComponent__Group__3 : rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 ;
    public final void rule__SubComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2358:1: ( rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4 )
            // InternalMontiArcDSL.g:2359:2: rule__SubComponent__Group__3__Impl rule__SubComponent__Group__4
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
    // InternalMontiArcDSL.g:2366:1: rule__SubComponent__Group__3__Impl : ( ( rule__SubComponent__InstancesAssignment_3 ) ) ;
    public final void rule__SubComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2370:1: ( ( ( rule__SubComponent__InstancesAssignment_3 ) ) )
            // InternalMontiArcDSL.g:2371:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:2371:1: ( ( rule__SubComponent__InstancesAssignment_3 ) )
            // InternalMontiArcDSL.g:2372:2: ( rule__SubComponent__InstancesAssignment_3 )
            {
             before(grammarAccess.getSubComponentAccess().getInstancesAssignment_3()); 
            // InternalMontiArcDSL.g:2373:2: ( rule__SubComponent__InstancesAssignment_3 )
            // InternalMontiArcDSL.g:2373:3: rule__SubComponent__InstancesAssignment_3
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
    // InternalMontiArcDSL.g:2381:1: rule__SubComponent__Group__4 : rule__SubComponent__Group__4__Impl ;
    public final void rule__SubComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2385:1: ( rule__SubComponent__Group__4__Impl )
            // InternalMontiArcDSL.g:2386:2: rule__SubComponent__Group__4__Impl
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
    // InternalMontiArcDSL.g:2392:1: rule__SubComponent__Group__4__Impl : ( ';' ) ;
    public final void rule__SubComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2396:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2397:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2397:1: ( ';' )
            // InternalMontiArcDSL.g:2398:2: ';'
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
    // InternalMontiArcDSL.g:2408:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2412:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // InternalMontiArcDSL.g:2413:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
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
    // InternalMontiArcDSL.g:2420:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__SourceAssignment_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2424:1: ( ( ( rule__Connector__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2425:1: ( ( rule__Connector__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2425:1: ( ( rule__Connector__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:2426:2: ( rule__Connector__SourceAssignment_0 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:2427:2: ( rule__Connector__SourceAssignment_0 )
            // InternalMontiArcDSL.g:2427:3: rule__Connector__SourceAssignment_0
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
    // InternalMontiArcDSL.g:2435:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2439:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // InternalMontiArcDSL.g:2440:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
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
    // InternalMontiArcDSL.g:2447:1: rule__Connector__Group__1__Impl : ( '->' ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2451:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:2452:1: ( '->' )
            {
            // InternalMontiArcDSL.g:2452:1: ( '->' )
            // InternalMontiArcDSL.g:2453:2: '->'
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
    // InternalMontiArcDSL.g:2462:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2466:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // InternalMontiArcDSL.g:2467:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
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
    // InternalMontiArcDSL.g:2474:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__TargetsAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2478:1: ( ( ( rule__Connector__TargetsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:2479:1: ( ( rule__Connector__TargetsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:2479:1: ( ( rule__Connector__TargetsAssignment_2 ) )
            // InternalMontiArcDSL.g:2480:2: ( rule__Connector__TargetsAssignment_2 )
            {
             before(grammarAccess.getConnectorAccess().getTargetsAssignment_2()); 
            // InternalMontiArcDSL.g:2481:2: ( rule__Connector__TargetsAssignment_2 )
            // InternalMontiArcDSL.g:2481:3: rule__Connector__TargetsAssignment_2
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
    // InternalMontiArcDSL.g:2489:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2493:1: ( rule__Connector__Group__3__Impl )
            // InternalMontiArcDSL.g:2494:2: rule__Connector__Group__3__Impl
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
    // InternalMontiArcDSL.g:2500:1: rule__Connector__Group__3__Impl : ( ';' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2504:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2505:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2505:1: ( ';' )
            // InternalMontiArcDSL.g:2506:2: ';'
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
    // InternalMontiArcDSL.g:2516:1: rule__Ports__Group__0 : rule__Ports__Group__0__Impl rule__Ports__Group__1 ;
    public final void rule__Ports__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2520:1: ( rule__Ports__Group__0__Impl rule__Ports__Group__1 )
            // InternalMontiArcDSL.g:2521:2: rule__Ports__Group__0__Impl rule__Ports__Group__1
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
    // InternalMontiArcDSL.g:2528:1: rule__Ports__Group__0__Impl : ( 'port' ) ;
    public final void rule__Ports__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2532:1: ( ( 'port' ) )
            // InternalMontiArcDSL.g:2533:1: ( 'port' )
            {
            // InternalMontiArcDSL.g:2533:1: ( 'port' )
            // InternalMontiArcDSL.g:2534:2: 'port'
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
    // InternalMontiArcDSL.g:2543:1: rule__Ports__Group__1 : rule__Ports__Group__1__Impl rule__Ports__Group__2 ;
    public final void rule__Ports__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2547:1: ( rule__Ports__Group__1__Impl rule__Ports__Group__2 )
            // InternalMontiArcDSL.g:2548:2: rule__Ports__Group__1__Impl rule__Ports__Group__2
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
    // InternalMontiArcDSL.g:2555:1: rule__Ports__Group__1__Impl : ( ( rule__Ports__PortsAssignment_1 ) ) ;
    public final void rule__Ports__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2559:1: ( ( ( rule__Ports__PortsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:2560:1: ( ( rule__Ports__PortsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:2560:1: ( ( rule__Ports__PortsAssignment_1 ) )
            // InternalMontiArcDSL.g:2561:2: ( rule__Ports__PortsAssignment_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_1()); 
            // InternalMontiArcDSL.g:2562:2: ( rule__Ports__PortsAssignment_1 )
            // InternalMontiArcDSL.g:2562:3: rule__Ports__PortsAssignment_1
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
    // InternalMontiArcDSL.g:2570:1: rule__Ports__Group__2 : rule__Ports__Group__2__Impl rule__Ports__Group__3 ;
    public final void rule__Ports__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2574:1: ( rule__Ports__Group__2__Impl rule__Ports__Group__3 )
            // InternalMontiArcDSL.g:2575:2: rule__Ports__Group__2__Impl rule__Ports__Group__3
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
    // InternalMontiArcDSL.g:2582:1: rule__Ports__Group__2__Impl : ( ( rule__Ports__Group_2__0 )* ) ;
    public final void rule__Ports__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2586:1: ( ( ( rule__Ports__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:2587:1: ( ( rule__Ports__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:2587:1: ( ( rule__Ports__Group_2__0 )* )
            // InternalMontiArcDSL.g:2588:2: ( rule__Ports__Group_2__0 )*
            {
             before(grammarAccess.getPortsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2589:2: ( rule__Ports__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2589:3: rule__Ports__Group_2__0
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
    // InternalMontiArcDSL.g:2597:1: rule__Ports__Group__3 : rule__Ports__Group__3__Impl ;
    public final void rule__Ports__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2601:1: ( rule__Ports__Group__3__Impl )
            // InternalMontiArcDSL.g:2602:2: rule__Ports__Group__3__Impl
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
    // InternalMontiArcDSL.g:2608:1: rule__Ports__Group__3__Impl : ( ';' ) ;
    public final void rule__Ports__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2612:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2613:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2613:1: ( ';' )
            // InternalMontiArcDSL.g:2614:2: ';'
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
    // InternalMontiArcDSL.g:2624:1: rule__Ports__Group_2__0 : rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 ;
    public final void rule__Ports__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2628:1: ( rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1 )
            // InternalMontiArcDSL.g:2629:2: rule__Ports__Group_2__0__Impl rule__Ports__Group_2__1
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
    // InternalMontiArcDSL.g:2636:1: rule__Ports__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Ports__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2640:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2641:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2641:1: ( ',' )
            // InternalMontiArcDSL.g:2642:2: ','
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
    // InternalMontiArcDSL.g:2651:1: rule__Ports__Group_2__1 : rule__Ports__Group_2__1__Impl ;
    public final void rule__Ports__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2655:1: ( rule__Ports__Group_2__1__Impl )
            // InternalMontiArcDSL.g:2656:2: rule__Ports__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:2662:1: rule__Ports__Group_2__1__Impl : ( ( rule__Ports__PortsAssignment_2_1 ) ) ;
    public final void rule__Ports__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2666:1: ( ( ( rule__Ports__PortsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:2667:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:2667:1: ( ( rule__Ports__PortsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:2668:2: ( rule__Ports__PortsAssignment_2_1 )
            {
             before(grammarAccess.getPortsAccess().getPortsAssignment_2_1()); 
            // InternalMontiArcDSL.g:2669:2: ( rule__Ports__PortsAssignment_2_1 )
            // InternalMontiArcDSL.g:2669:3: rule__Ports__PortsAssignment_2_1
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
    // InternalMontiArcDSL.g:2678:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2682:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalMontiArcDSL.g:2683:2: rule__Port__Group__0__Impl rule__Port__Group__1
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
    // InternalMontiArcDSL.g:2690:1: rule__Port__Group__0__Impl : ( ( rule__Port__SyncAssignment_0 )? ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2694:1: ( ( ( rule__Port__SyncAssignment_0 )? ) )
            // InternalMontiArcDSL.g:2695:1: ( ( rule__Port__SyncAssignment_0 )? )
            {
            // InternalMontiArcDSL.g:2695:1: ( ( rule__Port__SyncAssignment_0 )? )
            // InternalMontiArcDSL.g:2696:2: ( rule__Port__SyncAssignment_0 )?
            {
             before(grammarAccess.getPortAccess().getSyncAssignment_0()); 
            // InternalMontiArcDSL.g:2697:2: ( rule__Port__SyncAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SYNC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMontiArcDSL.g:2697:3: rule__Port__SyncAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__SyncAssignment_0();

                    state._fsp--;


                    }
                    break;

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
    // InternalMontiArcDSL.g:2705:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2709:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalMontiArcDSL.g:2710:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMontiArcDSL.g:2717:1: rule__Port__Group__1__Impl : ( ( rule__Port__Alternatives_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2721:1: ( ( ( rule__Port__Alternatives_1 ) ) )
            // InternalMontiArcDSL.g:2722:1: ( ( rule__Port__Alternatives_1 ) )
            {
            // InternalMontiArcDSL.g:2722:1: ( ( rule__Port__Alternatives_1 ) )
            // InternalMontiArcDSL.g:2723:2: ( rule__Port__Alternatives_1 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_1()); 
            // InternalMontiArcDSL.g:2724:2: ( rule__Port__Alternatives_1 )
            // InternalMontiArcDSL.g:2724:3: rule__Port__Alternatives_1
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
    // InternalMontiArcDSL.g:2732:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2736:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalMontiArcDSL.g:2737:2: rule__Port__Group__2__Impl rule__Port__Group__3
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
    // InternalMontiArcDSL.g:2744:1: rule__Port__Group__2__Impl : ( ( rule__Port__Alternatives_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2748:1: ( ( ( rule__Port__Alternatives_2 ) ) )
            // InternalMontiArcDSL.g:2749:1: ( ( rule__Port__Alternatives_2 ) )
            {
            // InternalMontiArcDSL.g:2749:1: ( ( rule__Port__Alternatives_2 ) )
            // InternalMontiArcDSL.g:2750:2: ( rule__Port__Alternatives_2 )
            {
             before(grammarAccess.getPortAccess().getAlternatives_2()); 
            // InternalMontiArcDSL.g:2751:2: ( rule__Port__Alternatives_2 )
            // InternalMontiArcDSL.g:2751:3: rule__Port__Alternatives_2
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
    // InternalMontiArcDSL.g:2759:1: rule__Port__Group__3 : rule__Port__Group__3__Impl ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2763:1: ( rule__Port__Group__3__Impl )
            // InternalMontiArcDSL.g:2764:2: rule__Port__Group__3__Impl
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
    // InternalMontiArcDSL.g:2770:1: rule__Port__Group__3__Impl : ( ( rule__Port__NamesAssignment_3 )? ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2774:1: ( ( ( rule__Port__NamesAssignment_3 )? ) )
            // InternalMontiArcDSL.g:2775:1: ( ( rule__Port__NamesAssignment_3 )? )
            {
            // InternalMontiArcDSL.g:2775:1: ( ( rule__Port__NamesAssignment_3 )? )
            // InternalMontiArcDSL.g:2776:2: ( rule__Port__NamesAssignment_3 )?
            {
             before(grammarAccess.getPortAccess().getNamesAssignment_3()); 
            // InternalMontiArcDSL.g:2777:2: ( rule__Port__NamesAssignment_3 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMontiArcDSL.g:2777:3: rule__Port__NamesAssignment_3
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
    // InternalMontiArcDSL.g:2786:1: rule__Names__Group__0 : rule__Names__Group__0__Impl rule__Names__Group__1 ;
    public final void rule__Names__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2790:1: ( rule__Names__Group__0__Impl rule__Names__Group__1 )
            // InternalMontiArcDSL.g:2791:2: rule__Names__Group__0__Impl rule__Names__Group__1
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
    // InternalMontiArcDSL.g:2798:1: rule__Names__Group__0__Impl : ( ( rule__Names__NamesAssignment_0 ) ) ;
    public final void rule__Names__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2802:1: ( ( ( rule__Names__NamesAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2803:1: ( ( rule__Names__NamesAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2803:1: ( ( rule__Names__NamesAssignment_0 ) )
            // InternalMontiArcDSL.g:2804:2: ( rule__Names__NamesAssignment_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_0()); 
            // InternalMontiArcDSL.g:2805:2: ( rule__Names__NamesAssignment_0 )
            // InternalMontiArcDSL.g:2805:3: rule__Names__NamesAssignment_0
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
    // InternalMontiArcDSL.g:2813:1: rule__Names__Group__1 : rule__Names__Group__1__Impl ;
    public final void rule__Names__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2817:1: ( rule__Names__Group__1__Impl )
            // InternalMontiArcDSL.g:2818:2: rule__Names__Group__1__Impl
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
    // InternalMontiArcDSL.g:2824:1: rule__Names__Group__1__Impl : ( ( rule__Names__Group_1__0 )* ) ;
    public final void rule__Names__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2828:1: ( ( ( rule__Names__Group_1__0 )* ) )
            // InternalMontiArcDSL.g:2829:1: ( ( rule__Names__Group_1__0 )* )
            {
            // InternalMontiArcDSL.g:2829:1: ( ( rule__Names__Group_1__0 )* )
            // InternalMontiArcDSL.g:2830:2: ( rule__Names__Group_1__0 )*
            {
             before(grammarAccess.getNamesAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:2831:2: ( rule__Names__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    int LA33_2 = input.LA(2);

                    if ( ((LA33_2>=RULE_ID && LA33_2<=RULE_MCQUALIFIEDNAME)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2831:3: rule__Names__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Names__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMontiArcDSL.g:2840:1: rule__Names__Group_1__0 : rule__Names__Group_1__0__Impl rule__Names__Group_1__1 ;
    public final void rule__Names__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2844:1: ( rule__Names__Group_1__0__Impl rule__Names__Group_1__1 )
            // InternalMontiArcDSL.g:2845:2: rule__Names__Group_1__0__Impl rule__Names__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMontiArcDSL.g:2852:1: rule__Names__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Names__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2856:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:2857:1: ( ',' )
            {
            // InternalMontiArcDSL.g:2857:1: ( ',' )
            // InternalMontiArcDSL.g:2858:2: ','
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
    // InternalMontiArcDSL.g:2867:1: rule__Names__Group_1__1 : rule__Names__Group_1__1__Impl ;
    public final void rule__Names__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2871:1: ( rule__Names__Group_1__1__Impl )
            // InternalMontiArcDSL.g:2872:2: rule__Names__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:2878:1: rule__Names__Group_1__1__Impl : ( ( rule__Names__NamesAssignment_1_1 ) ) ;
    public final void rule__Names__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2882:1: ( ( ( rule__Names__NamesAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:2883:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:2883:1: ( ( rule__Names__NamesAssignment_1_1 ) )
            // InternalMontiArcDSL.g:2884:2: ( rule__Names__NamesAssignment_1_1 )
            {
             before(grammarAccess.getNamesAccess().getNamesAssignment_1_1()); 
            // InternalMontiArcDSL.g:2885:2: ( rule__Names__NamesAssignment_1_1 )
            // InternalMontiArcDSL.g:2885:3: rule__Names__NamesAssignment_1_1
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
    // InternalMontiArcDSL.g:2894:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2898:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMontiArcDSL.g:2899:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMontiArcDSL.g:2906:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__TypeAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2910:1: ( ( ( rule__Variable__TypeAssignment_0 ) ) )
            // InternalMontiArcDSL.g:2911:1: ( ( rule__Variable__TypeAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:2911:1: ( ( rule__Variable__TypeAssignment_0 ) )
            // InternalMontiArcDSL.g:2912:2: ( rule__Variable__TypeAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_0()); 
            // InternalMontiArcDSL.g:2913:2: ( rule__Variable__TypeAssignment_0 )
            // InternalMontiArcDSL.g:2913:3: rule__Variable__TypeAssignment_0
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
    // InternalMontiArcDSL.g:2921:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2925:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMontiArcDSL.g:2926:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalMontiArcDSL.g:2933:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NamesAssignment_1 )? ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2937:1: ( ( ( rule__Variable__NamesAssignment_1 )? ) )
            // InternalMontiArcDSL.g:2938:1: ( ( rule__Variable__NamesAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:2938:1: ( ( rule__Variable__NamesAssignment_1 )? )
            // InternalMontiArcDSL.g:2939:2: ( rule__Variable__NamesAssignment_1 )?
            {
             before(grammarAccess.getVariableAccess().getNamesAssignment_1()); 
            // InternalMontiArcDSL.g:2940:2: ( rule__Variable__NamesAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMontiArcDSL.g:2940:3: rule__Variable__NamesAssignment_1
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
    // InternalMontiArcDSL.g:2948:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2952:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMontiArcDSL.g:2953:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMontiArcDSL.g:2960:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__Group_2__0 )? ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2964:1: ( ( ( rule__Variable__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:2965:1: ( ( rule__Variable__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:2965:1: ( ( rule__Variable__Group_2__0 )? )
            // InternalMontiArcDSL.g:2966:2: ( rule__Variable__Group_2__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:2967:2: ( rule__Variable__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMontiArcDSL.g:2967:3: rule__Variable__Group_2__0
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
    // InternalMontiArcDSL.g:2975:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2979:1: ( rule__Variable__Group__3__Impl )
            // InternalMontiArcDSL.g:2980:2: rule__Variable__Group__3__Impl
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
    // InternalMontiArcDSL.g:2986:1: rule__Variable__Group__3__Impl : ( ';' ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:2990:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:2991:1: ( ';' )
            {
            // InternalMontiArcDSL.g:2991:1: ( ';' )
            // InternalMontiArcDSL.g:2992:2: ';'
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
    // InternalMontiArcDSL.g:3002:1: rule__Variable__Group_2__0 : rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 ;
    public final void rule__Variable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3006:1: ( rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1 )
            // InternalMontiArcDSL.g:3007:2: rule__Variable__Group_2__0__Impl rule__Variable__Group_2__1
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
    // InternalMontiArcDSL.g:3014:1: rule__Variable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Variable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3018:1: ( ( '(' ) )
            // InternalMontiArcDSL.g:3019:1: ( '(' )
            {
            // InternalMontiArcDSL.g:3019:1: ( '(' )
            // InternalMontiArcDSL.g:3020:2: '('
            {
             before(grammarAccess.getVariableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3029:1: rule__Variable__Group_2__1 : rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2 ;
    public final void rule__Variable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3033:1: ( rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2 )
            // InternalMontiArcDSL.g:3034:2: rule__Variable__Group_2__1__Impl rule__Variable__Group_2__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMontiArcDSL.g:3041:1: rule__Variable__Group_2__1__Impl : ( ( rule__Variable__ParametersAssignment_2_1 ) ) ;
    public final void rule__Variable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3045:1: ( ( ( rule__Variable__ParametersAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3046:1: ( ( rule__Variable__ParametersAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3046:1: ( ( rule__Variable__ParametersAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3047:2: ( rule__Variable__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getVariableAccess().getParametersAssignment_2_1()); 
            // InternalMontiArcDSL.g:3048:2: ( rule__Variable__ParametersAssignment_2_1 )
            // InternalMontiArcDSL.g:3048:3: rule__Variable__ParametersAssignment_2_1
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
    // InternalMontiArcDSL.g:3056:1: rule__Variable__Group_2__2 : rule__Variable__Group_2__2__Impl rule__Variable__Group_2__3 ;
    public final void rule__Variable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3060:1: ( rule__Variable__Group_2__2__Impl rule__Variable__Group_2__3 )
            // InternalMontiArcDSL.g:3061:2: rule__Variable__Group_2__2__Impl rule__Variable__Group_2__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMontiArcDSL.g:3068:1: rule__Variable__Group_2__2__Impl : ( ( rule__Variable__Group_2_2__0 )* ) ;
    public final void rule__Variable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3072:1: ( ( ( rule__Variable__Group_2_2__0 )* ) )
            // InternalMontiArcDSL.g:3073:1: ( ( rule__Variable__Group_2_2__0 )* )
            {
            // InternalMontiArcDSL.g:3073:1: ( ( rule__Variable__Group_2_2__0 )* )
            // InternalMontiArcDSL.g:3074:2: ( rule__Variable__Group_2_2__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_2_2()); 
            // InternalMontiArcDSL.g:3075:2: ( rule__Variable__Group_2_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==47) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3075:3: rule__Variable__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Variable__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalMontiArcDSL.g:3083:1: rule__Variable__Group_2__3 : rule__Variable__Group_2__3__Impl ;
    public final void rule__Variable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3087:1: ( rule__Variable__Group_2__3__Impl )
            // InternalMontiArcDSL.g:3088:2: rule__Variable__Group_2__3__Impl
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
    // InternalMontiArcDSL.g:3094:1: rule__Variable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Variable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3098:1: ( ( ')' ) )
            // InternalMontiArcDSL.g:3099:1: ( ')' )
            {
            // InternalMontiArcDSL.g:3099:1: ( ')' )
            // InternalMontiArcDSL.g:3100:2: ')'
            {
             before(grammarAccess.getVariableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3110:1: rule__Variable__Group_2_2__0 : rule__Variable__Group_2_2__0__Impl rule__Variable__Group_2_2__1 ;
    public final void rule__Variable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3114:1: ( rule__Variable__Group_2_2__0__Impl rule__Variable__Group_2_2__1 )
            // InternalMontiArcDSL.g:3115:2: rule__Variable__Group_2_2__0__Impl rule__Variable__Group_2_2__1
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
    // InternalMontiArcDSL.g:3122:1: rule__Variable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3126:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:3127:1: ( ',' )
            {
            // InternalMontiArcDSL.g:3127:1: ( ',' )
            // InternalMontiArcDSL.g:3128:2: ','
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
    // InternalMontiArcDSL.g:3137:1: rule__Variable__Group_2_2__1 : rule__Variable__Group_2_2__1__Impl ;
    public final void rule__Variable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3141:1: ( rule__Variable__Group_2_2__1__Impl )
            // InternalMontiArcDSL.g:3142:2: rule__Variable__Group_2_2__1__Impl
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
    // InternalMontiArcDSL.g:3148:1: rule__Variable__Group_2_2__1__Impl : ( ( rule__Variable__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Variable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3152:1: ( ( ( rule__Variable__ParametersAssignment_2_2_1 ) ) )
            // InternalMontiArcDSL.g:3153:1: ( ( rule__Variable__ParametersAssignment_2_2_1 ) )
            {
            // InternalMontiArcDSL.g:3153:1: ( ( rule__Variable__ParametersAssignment_2_2_1 ) )
            // InternalMontiArcDSL.g:3154:2: ( rule__Variable__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getVariableAccess().getParametersAssignment_2_2_1()); 
            // InternalMontiArcDSL.g:3155:2: ( rule__Variable__ParametersAssignment_2_2_1 )
            // InternalMontiArcDSL.g:3155:3: rule__Variable__ParametersAssignment_2_2_1
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
    // InternalMontiArcDSL.g:3164:1: rule__Automaton__Group__0 : rule__Automaton__Group__0__Impl rule__Automaton__Group__1 ;
    public final void rule__Automaton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3168:1: ( rule__Automaton__Group__0__Impl rule__Automaton__Group__1 )
            // InternalMontiArcDSL.g:3169:2: rule__Automaton__Group__0__Impl rule__Automaton__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiArcDSL.g:3176:1: rule__Automaton__Group__0__Impl : ( () ) ;
    public final void rule__Automaton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3180:1: ( ( () ) )
            // InternalMontiArcDSL.g:3181:1: ( () )
            {
            // InternalMontiArcDSL.g:3181:1: ( () )
            // InternalMontiArcDSL.g:3182:2: ()
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonAction_0()); 
            // InternalMontiArcDSL.g:3183:2: ()
            // InternalMontiArcDSL.g:3183:3: 
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
    // InternalMontiArcDSL.g:3191:1: rule__Automaton__Group__1 : rule__Automaton__Group__1__Impl rule__Automaton__Group__2 ;
    public final void rule__Automaton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3195:1: ( rule__Automaton__Group__1__Impl rule__Automaton__Group__2 )
            // InternalMontiArcDSL.g:3196:2: rule__Automaton__Group__1__Impl rule__Automaton__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiArcDSL.g:3203:1: rule__Automaton__Group__1__Impl : ( ( rule__Automaton__SyncAssignment_1 )? ) ;
    public final void rule__Automaton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3207:1: ( ( ( rule__Automaton__SyncAssignment_1 )? ) )
            // InternalMontiArcDSL.g:3208:1: ( ( rule__Automaton__SyncAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:3208:1: ( ( rule__Automaton__SyncAssignment_1 )? )
            // InternalMontiArcDSL.g:3209:2: ( rule__Automaton__SyncAssignment_1 )?
            {
             before(grammarAccess.getAutomatonAccess().getSyncAssignment_1()); 
            // InternalMontiArcDSL.g:3210:2: ( rule__Automaton__SyncAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_SYNC) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMontiArcDSL.g:3210:3: rule__Automaton__SyncAssignment_1
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
    // InternalMontiArcDSL.g:3218:1: rule__Automaton__Group__2 : rule__Automaton__Group__2__Impl rule__Automaton__Group__3 ;
    public final void rule__Automaton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3222:1: ( rule__Automaton__Group__2__Impl rule__Automaton__Group__3 )
            // InternalMontiArcDSL.g:3223:2: rule__Automaton__Group__2__Impl rule__Automaton__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:3230:1: rule__Automaton__Group__2__Impl : ( 'automaton' ) ;
    public final void rule__Automaton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3234:1: ( ( 'automaton' ) )
            // InternalMontiArcDSL.g:3235:1: ( 'automaton' )
            {
            // InternalMontiArcDSL.g:3235:1: ( 'automaton' )
            // InternalMontiArcDSL.g:3236:2: 'automaton'
            {
             before(grammarAccess.getAutomatonAccess().getAutomatonKeyword_2()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3245:1: rule__Automaton__Group__3 : rule__Automaton__Group__3__Impl rule__Automaton__Group__4 ;
    public final void rule__Automaton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3249:1: ( rule__Automaton__Group__3__Impl rule__Automaton__Group__4 )
            // InternalMontiArcDSL.g:3250:2: rule__Automaton__Group__3__Impl rule__Automaton__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiArcDSL.g:3257:1: rule__Automaton__Group__3__Impl : ( ( rule__Automaton__NameAssignment_3 )? ) ;
    public final void rule__Automaton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3261:1: ( ( ( rule__Automaton__NameAssignment_3 )? ) )
            // InternalMontiArcDSL.g:3262:1: ( ( rule__Automaton__NameAssignment_3 )? )
            {
            // InternalMontiArcDSL.g:3262:1: ( ( rule__Automaton__NameAssignment_3 )? )
            // InternalMontiArcDSL.g:3263:2: ( rule__Automaton__NameAssignment_3 )?
            {
             before(grammarAccess.getAutomatonAccess().getNameAssignment_3()); 
            // InternalMontiArcDSL.g:3264:2: ( rule__Automaton__NameAssignment_3 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMontiArcDSL.g:3264:3: rule__Automaton__NameAssignment_3
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
    // InternalMontiArcDSL.g:3272:1: rule__Automaton__Group__4 : rule__Automaton__Group__4__Impl rule__Automaton__Group__5 ;
    public final void rule__Automaton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3276:1: ( rule__Automaton__Group__4__Impl rule__Automaton__Group__5 )
            // InternalMontiArcDSL.g:3277:2: rule__Automaton__Group__4__Impl rule__Automaton__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiArcDSL.g:3284:1: rule__Automaton__Group__4__Impl : ( '{' ) ;
    public final void rule__Automaton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3288:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:3289:1: ( '{' )
            {
            // InternalMontiArcDSL.g:3289:1: ( '{' )
            // InternalMontiArcDSL.g:3290:2: '{'
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
    // InternalMontiArcDSL.g:3299:1: rule__Automaton__Group__5 : rule__Automaton__Group__5__Impl rule__Automaton__Group__6 ;
    public final void rule__Automaton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3303:1: ( rule__Automaton__Group__5__Impl rule__Automaton__Group__6 )
            // InternalMontiArcDSL.g:3304:2: rule__Automaton__Group__5__Impl rule__Automaton__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiArcDSL.g:3311:1: rule__Automaton__Group__5__Impl : ( ( rule__Automaton__Alternatives_5 )* ) ;
    public final void rule__Automaton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3315:1: ( ( ( rule__Automaton__Alternatives_5 )* ) )
            // InternalMontiArcDSL.g:3316:1: ( ( rule__Automaton__Alternatives_5 )* )
            {
            // InternalMontiArcDSL.g:3316:1: ( ( rule__Automaton__Alternatives_5 )* )
            // InternalMontiArcDSL.g:3317:2: ( rule__Automaton__Alternatives_5 )*
            {
             before(grammarAccess.getAutomatonAccess().getAlternatives_5()); 
            // InternalMontiArcDSL.g:3318:2: ( rule__Automaton__Alternatives_5 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||(LA39_0>=33 && LA39_0<=34)||LA39_0==44||LA39_0==55) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3318:3: rule__Automaton__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Automaton__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalMontiArcDSL.g:3326:1: rule__Automaton__Group__6 : rule__Automaton__Group__6__Impl ;
    public final void rule__Automaton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3330:1: ( rule__Automaton__Group__6__Impl )
            // InternalMontiArcDSL.g:3331:2: rule__Automaton__Group__6__Impl
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
    // InternalMontiArcDSL.g:3337:1: rule__Automaton__Group__6__Impl : ( '}' ) ;
    public final void rule__Automaton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3341:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:3342:1: ( '}' )
            {
            // InternalMontiArcDSL.g:3342:1: ( '}' )
            // InternalMontiArcDSL.g:3343:2: '}'
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
    // InternalMontiArcDSL.g:3353:1: rule__SCState__Group__0 : rule__SCState__Group__0__Impl rule__SCState__Group__1 ;
    public final void rule__SCState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3357:1: ( rule__SCState__Group__0__Impl rule__SCState__Group__1 )
            // InternalMontiArcDSL.g:3358:2: rule__SCState__Group__0__Impl rule__SCState__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3365:1: rule__SCState__Group__0__Impl : ( ( rule__SCState__ModifierAssignment_0 )* ) ;
    public final void rule__SCState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3369:1: ( ( ( rule__SCState__ModifierAssignment_0 )* ) )
            // InternalMontiArcDSL.g:3370:1: ( ( rule__SCState__ModifierAssignment_0 )* )
            {
            // InternalMontiArcDSL.g:3370:1: ( ( rule__SCState__ModifierAssignment_0 )* )
            // InternalMontiArcDSL.g:3371:2: ( rule__SCState__ModifierAssignment_0 )*
            {
             before(grammarAccess.getSCStateAccess().getModifierAssignment_0()); 
            // InternalMontiArcDSL.g:3372:2: ( rule__SCState__ModifierAssignment_0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=33 && LA40_0<=34)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3372:3: rule__SCState__ModifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__SCState__ModifierAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalMontiArcDSL.g:3380:1: rule__SCState__Group__1 : rule__SCState__Group__1__Impl rule__SCState__Group__2 ;
    public final void rule__SCState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3384:1: ( rule__SCState__Group__1__Impl rule__SCState__Group__2 )
            // InternalMontiArcDSL.g:3385:2: rule__SCState__Group__1__Impl rule__SCState__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3392:1: rule__SCState__Group__1__Impl : ( ( rule__SCState__AnteAssignment_1 )? ) ;
    public final void rule__SCState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3396:1: ( ( ( rule__SCState__AnteAssignment_1 )? ) )
            // InternalMontiArcDSL.g:3397:1: ( ( rule__SCState__AnteAssignment_1 )? )
            {
            // InternalMontiArcDSL.g:3397:1: ( ( rule__SCState__AnteAssignment_1 )? )
            // InternalMontiArcDSL.g:3398:2: ( rule__SCState__AnteAssignment_1 )?
            {
             before(grammarAccess.getSCStateAccess().getAnteAssignment_1()); 
            // InternalMontiArcDSL.g:3399:2: ( rule__SCState__AnteAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMontiArcDSL.g:3399:3: rule__SCState__AnteAssignment_1
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
    // InternalMontiArcDSL.g:3407:1: rule__SCState__Group__2 : rule__SCState__Group__2__Impl rule__SCState__Group__3 ;
    public final void rule__SCState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3411:1: ( rule__SCState__Group__2__Impl rule__SCState__Group__3 )
            // InternalMontiArcDSL.g:3412:2: rule__SCState__Group__2__Impl rule__SCState__Group__3
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
    // InternalMontiArcDSL.g:3419:1: rule__SCState__Group__2__Impl : ( 'state' ) ;
    public final void rule__SCState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3423:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:3424:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:3424:1: ( 'state' )
            // InternalMontiArcDSL.g:3425:2: 'state'
            {
             before(grammarAccess.getSCStateAccess().getStateKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3434:1: rule__SCState__Group__3 : rule__SCState__Group__3__Impl rule__SCState__Group__4 ;
    public final void rule__SCState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3438:1: ( rule__SCState__Group__3__Impl rule__SCState__Group__4 )
            // InternalMontiArcDSL.g:3439:2: rule__SCState__Group__3__Impl rule__SCState__Group__4
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
    // InternalMontiArcDSL.g:3446:1: rule__SCState__Group__3__Impl : ( ( rule__SCState__NameAssignment_3 ) ) ;
    public final void rule__SCState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3450:1: ( ( ( rule__SCState__NameAssignment_3 ) ) )
            // InternalMontiArcDSL.g:3451:1: ( ( rule__SCState__NameAssignment_3 ) )
            {
            // InternalMontiArcDSL.g:3451:1: ( ( rule__SCState__NameAssignment_3 ) )
            // InternalMontiArcDSL.g:3452:2: ( rule__SCState__NameAssignment_3 )
            {
             before(grammarAccess.getSCStateAccess().getNameAssignment_3()); 
            // InternalMontiArcDSL.g:3453:2: ( rule__SCState__NameAssignment_3 )
            // InternalMontiArcDSL.g:3453:3: rule__SCState__NameAssignment_3
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
    // InternalMontiArcDSL.g:3461:1: rule__SCState__Group__4 : rule__SCState__Group__4__Impl ;
    public final void rule__SCState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3465:1: ( rule__SCState__Group__4__Impl )
            // InternalMontiArcDSL.g:3466:2: rule__SCState__Group__4__Impl
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
    // InternalMontiArcDSL.g:3472:1: rule__SCState__Group__4__Impl : ( ';' ) ;
    public final void rule__SCState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3476:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3477:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3477:1: ( ';' )
            // InternalMontiArcDSL.g:3478:2: ';'
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
    // InternalMontiArcDSL.g:3488:1: rule__InvState__Group__0 : rule__InvState__Group__0__Impl rule__InvState__Group__1 ;
    public final void rule__InvState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3492:1: ( rule__InvState__Group__0__Impl rule__InvState__Group__1 )
            // InternalMontiArcDSL.g:3493:2: rule__InvState__Group__0__Impl rule__InvState__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalMontiArcDSL.g:3500:1: rule__InvState__Group__0__Impl : ( ( rule__InvState__ModifierAssignment_0 )* ) ;
    public final void rule__InvState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3504:1: ( ( ( rule__InvState__ModifierAssignment_0 )* ) )
            // InternalMontiArcDSL.g:3505:1: ( ( rule__InvState__ModifierAssignment_0 )* )
            {
            // InternalMontiArcDSL.g:3505:1: ( ( rule__InvState__ModifierAssignment_0 )* )
            // InternalMontiArcDSL.g:3506:2: ( rule__InvState__ModifierAssignment_0 )*
            {
             before(grammarAccess.getInvStateAccess().getModifierAssignment_0()); 
            // InternalMontiArcDSL.g:3507:2: ( rule__InvState__ModifierAssignment_0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=33 && LA42_0<=34)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMontiArcDSL.g:3507:3: rule__InvState__ModifierAssignment_0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__InvState__ModifierAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMontiArcDSL.g:3515:1: rule__InvState__Group__1 : rule__InvState__Group__1__Impl rule__InvState__Group__2 ;
    public final void rule__InvState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3519:1: ( rule__InvState__Group__1__Impl rule__InvState__Group__2 )
            // InternalMontiArcDSL.g:3520:2: rule__InvState__Group__1__Impl rule__InvState__Group__2
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
    // InternalMontiArcDSL.g:3527:1: rule__InvState__Group__1__Impl : ( 'state' ) ;
    public final void rule__InvState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3531:1: ( ( 'state' ) )
            // InternalMontiArcDSL.g:3532:1: ( 'state' )
            {
            // InternalMontiArcDSL.g:3532:1: ( 'state' )
            // InternalMontiArcDSL.g:3533:2: 'state'
            {
             before(grammarAccess.getInvStateAccess().getStateKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3542:1: rule__InvState__Group__2 : rule__InvState__Group__2__Impl rule__InvState__Group__3 ;
    public final void rule__InvState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3546:1: ( rule__InvState__Group__2__Impl rule__InvState__Group__3 )
            // InternalMontiArcDSL.g:3547:2: rule__InvState__Group__2__Impl rule__InvState__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMontiArcDSL.g:3554:1: rule__InvState__Group__2__Impl : ( ( rule__InvState__NameAssignment_2 ) ) ;
    public final void rule__InvState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3558:1: ( ( ( rule__InvState__NameAssignment_2 ) ) )
            // InternalMontiArcDSL.g:3559:1: ( ( rule__InvState__NameAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:3559:1: ( ( rule__InvState__NameAssignment_2 ) )
            // InternalMontiArcDSL.g:3560:2: ( rule__InvState__NameAssignment_2 )
            {
             before(grammarAccess.getInvStateAccess().getNameAssignment_2()); 
            // InternalMontiArcDSL.g:3561:2: ( rule__InvState__NameAssignment_2 )
            // InternalMontiArcDSL.g:3561:3: rule__InvState__NameAssignment_2
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
    // InternalMontiArcDSL.g:3569:1: rule__InvState__Group__3 : rule__InvState__Group__3__Impl rule__InvState__Group__4 ;
    public final void rule__InvState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3573:1: ( rule__InvState__Group__3__Impl rule__InvState__Group__4 )
            // InternalMontiArcDSL.g:3574:2: rule__InvState__Group__3__Impl rule__InvState__Group__4
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
    // InternalMontiArcDSL.g:3581:1: rule__InvState__Group__3__Impl : ( '[' ) ;
    public final void rule__InvState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3585:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3586:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3586:1: ( '[' )
            // InternalMontiArcDSL.g:3587:2: '['
            {
             before(grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3596:1: rule__InvState__Group__4 : rule__InvState__Group__4__Impl rule__InvState__Group__5 ;
    public final void rule__InvState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3600:1: ( rule__InvState__Group__4__Impl rule__InvState__Group__5 )
            // InternalMontiArcDSL.g:3601:2: rule__InvState__Group__4__Impl rule__InvState__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMontiArcDSL.g:3608:1: rule__InvState__Group__4__Impl : ( ( rule__InvState__ExpressionAssignment_4 ) ) ;
    public final void rule__InvState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3612:1: ( ( ( rule__InvState__ExpressionAssignment_4 ) ) )
            // InternalMontiArcDSL.g:3613:1: ( ( rule__InvState__ExpressionAssignment_4 ) )
            {
            // InternalMontiArcDSL.g:3613:1: ( ( rule__InvState__ExpressionAssignment_4 ) )
            // InternalMontiArcDSL.g:3614:2: ( rule__InvState__ExpressionAssignment_4 )
            {
             before(grammarAccess.getInvStateAccess().getExpressionAssignment_4()); 
            // InternalMontiArcDSL.g:3615:2: ( rule__InvState__ExpressionAssignment_4 )
            // InternalMontiArcDSL.g:3615:3: rule__InvState__ExpressionAssignment_4
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
    // InternalMontiArcDSL.g:3623:1: rule__InvState__Group__5 : rule__InvState__Group__5__Impl rule__InvState__Group__6 ;
    public final void rule__InvState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3627:1: ( rule__InvState__Group__5__Impl rule__InvState__Group__6 )
            // InternalMontiArcDSL.g:3628:2: rule__InvState__Group__5__Impl rule__InvState__Group__6
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
    // InternalMontiArcDSL.g:3635:1: rule__InvState__Group__5__Impl : ( ']' ) ;
    public final void rule__InvState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3639:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3640:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3640:1: ( ']' )
            // InternalMontiArcDSL.g:3641:2: ']'
            {
             before(grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3650:1: rule__InvState__Group__6 : rule__InvState__Group__6__Impl ;
    public final void rule__InvState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3654:1: ( rule__InvState__Group__6__Impl )
            // InternalMontiArcDSL.g:3655:2: rule__InvState__Group__6__Impl
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
    // InternalMontiArcDSL.g:3661:1: rule__InvState__Group__6__Impl : ( ';' ) ;
    public final void rule__InvState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3665:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3666:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3666:1: ( ';' )
            // InternalMontiArcDSL.g:3667:2: ';'
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
    // InternalMontiArcDSL.g:3677:1: rule__SCSAnte__Group__0 : rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1 ;
    public final void rule__SCSAnte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3681:1: ( rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1 )
            // InternalMontiArcDSL.g:3682:2: rule__SCSAnte__Group__0__Impl rule__SCSAnte__Group__1
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
    // InternalMontiArcDSL.g:3689:1: rule__SCSAnte__Group__0__Impl : ( () ) ;
    public final void rule__SCSAnte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3693:1: ( ( () ) )
            // InternalMontiArcDSL.g:3694:1: ( () )
            {
            // InternalMontiArcDSL.g:3694:1: ( () )
            // InternalMontiArcDSL.g:3695:2: ()
            {
             before(grammarAccess.getSCSAnteAccess().getSCSAnteAction_0()); 
            // InternalMontiArcDSL.g:3696:2: ()
            // InternalMontiArcDSL.g:3696:3: 
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
    // InternalMontiArcDSL.g:3704:1: rule__SCSAnte__Group__1 : rule__SCSAnte__Group__1__Impl ;
    public final void rule__SCSAnte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3708:1: ( rule__SCSAnte__Group__1__Impl )
            // InternalMontiArcDSL.g:3709:2: rule__SCSAnte__Group__1__Impl
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
    // InternalMontiArcDSL.g:3715:1: rule__SCSAnte__Group__1__Impl : ( ( rule__SCSAnte__BlockAssignment_1 ) ) ;
    public final void rule__SCSAnte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3719:1: ( ( ( rule__SCSAnte__BlockAssignment_1 ) ) )
            // InternalMontiArcDSL.g:3720:1: ( ( rule__SCSAnte__BlockAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:3720:1: ( ( rule__SCSAnte__BlockAssignment_1 ) )
            // InternalMontiArcDSL.g:3721:2: ( rule__SCSAnte__BlockAssignment_1 )
            {
             before(grammarAccess.getSCSAnteAccess().getBlockAssignment_1()); 
            // InternalMontiArcDSL.g:3722:2: ( rule__SCSAnte__BlockAssignment_1 )
            // InternalMontiArcDSL.g:3722:3: rule__SCSAnte__BlockAssignment_1
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
    // InternalMontiArcDSL.g:3731:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3735:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMontiArcDSL.g:3736:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3743:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3747:1: ( ( ( rule__Transition__SourceAssignment_0 ) ) )
            // InternalMontiArcDSL.g:3748:1: ( ( rule__Transition__SourceAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:3748:1: ( ( rule__Transition__SourceAssignment_0 ) )
            // InternalMontiArcDSL.g:3749:2: ( rule__Transition__SourceAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_0()); 
            // InternalMontiArcDSL.g:3750:2: ( rule__Transition__SourceAssignment_0 )
            // InternalMontiArcDSL.g:3750:3: rule__Transition__SourceAssignment_0
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
    // InternalMontiArcDSL.g:3758:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3762:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMontiArcDSL.g:3763:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3770:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3774:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // InternalMontiArcDSL.g:3775:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // InternalMontiArcDSL.g:3775:1: ( ( rule__Transition__Group_1__0 )? )
            // InternalMontiArcDSL.g:3776:2: ( rule__Transition__Group_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_1()); 
            // InternalMontiArcDSL.g:3777:2: ( rule__Transition__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMontiArcDSL.g:3777:3: rule__Transition__Group_1__0
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
    // InternalMontiArcDSL.g:3785:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3789:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalMontiArcDSL.g:3790:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3797:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3801:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalMontiArcDSL.g:3802:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalMontiArcDSL.g:3802:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalMontiArcDSL.g:3803:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:3804:2: ( rule__Transition__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==56) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMontiArcDSL.g:3804:3: rule__Transition__Group_2__0
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
    // InternalMontiArcDSL.g:3812:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3816:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalMontiArcDSL.g:3817:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalMontiArcDSL.g:3824:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3828:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // InternalMontiArcDSL.g:3829:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // InternalMontiArcDSL.g:3829:1: ( ( rule__Transition__Group_3__0 )? )
            // InternalMontiArcDSL.g:3830:2: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // InternalMontiArcDSL.g:3831:2: ( rule__Transition__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMontiArcDSL.g:3831:3: rule__Transition__Group_3__0
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
    // InternalMontiArcDSL.g:3839:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3843:1: ( rule__Transition__Group__4__Impl )
            // InternalMontiArcDSL.g:3844:2: rule__Transition__Group__4__Impl
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
    // InternalMontiArcDSL.g:3850:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3854:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:3855:1: ( ';' )
            {
            // InternalMontiArcDSL.g:3855:1: ( ';' )
            // InternalMontiArcDSL.g:3856:2: ';'
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
    // InternalMontiArcDSL.g:3866:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3870:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // InternalMontiArcDSL.g:3871:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
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
    // InternalMontiArcDSL.g:3878:1: rule__Transition__Group_1__0__Impl : ( '->' ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3882:1: ( ( '->' ) )
            // InternalMontiArcDSL.g:3883:1: ( '->' )
            {
            // InternalMontiArcDSL.g:3883:1: ( '->' )
            // InternalMontiArcDSL.g:3884:2: '->'
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
    // InternalMontiArcDSL.g:3893:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3897:1: ( rule__Transition__Group_1__1__Impl )
            // InternalMontiArcDSL.g:3898:2: rule__Transition__Group_1__1__Impl
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
    // InternalMontiArcDSL.g:3904:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__TargetAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3908:1: ( ( ( rule__Transition__TargetAssignment_1_1 ) ) )
            // InternalMontiArcDSL.g:3909:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            {
            // InternalMontiArcDSL.g:3909:1: ( ( rule__Transition__TargetAssignment_1_1 ) )
            // InternalMontiArcDSL.g:3910:2: ( rule__Transition__TargetAssignment_1_1 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_1_1()); 
            // InternalMontiArcDSL.g:3911:2: ( rule__Transition__TargetAssignment_1_1 )
            // InternalMontiArcDSL.g:3911:3: rule__Transition__TargetAssignment_1_1
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
    // InternalMontiArcDSL.g:3920:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3924:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalMontiArcDSL.g:3925:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalMontiArcDSL.g:3932:1: rule__Transition__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3936:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:3937:1: ( '[' )
            {
            // InternalMontiArcDSL.g:3937:1: ( '[' )
            // InternalMontiArcDSL.g:3938:2: '['
            {
             before(grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:3947:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3951:1: ( rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2 )
            // InternalMontiArcDSL.g:3952:2: rule__Transition__Group_2__1__Impl rule__Transition__Group_2__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMontiArcDSL.g:3959:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ExpressionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3963:1: ( ( ( rule__Transition__ExpressionAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:3964:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:3964:1: ( ( rule__Transition__ExpressionAssignment_2_1 ) )
            // InternalMontiArcDSL.g:3965:2: ( rule__Transition__ExpressionAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getExpressionAssignment_2_1()); 
            // InternalMontiArcDSL.g:3966:2: ( rule__Transition__ExpressionAssignment_2_1 )
            // InternalMontiArcDSL.g:3966:3: rule__Transition__ExpressionAssignment_2_1
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
    // InternalMontiArcDSL.g:3974:1: rule__Transition__Group_2__2 : rule__Transition__Group_2__2__Impl ;
    public final void rule__Transition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3978:1: ( rule__Transition__Group_2__2__Impl )
            // InternalMontiArcDSL.g:3979:2: rule__Transition__Group_2__2__Impl
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
    // InternalMontiArcDSL.g:3985:1: rule__Transition__Group_2__2__Impl : ( ']' ) ;
    public final void rule__Transition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:3989:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:3990:1: ( ']' )
            {
            // InternalMontiArcDSL.g:3990:1: ( ']' )
            // InternalMontiArcDSL.g:3991:2: ']'
            {
             before(grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4001:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4005:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // InternalMontiArcDSL.g:4006:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
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
    // InternalMontiArcDSL.g:4013:1: rule__Transition__Group_3__0__Impl : ( '/' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4017:1: ( ( '/' ) )
            // InternalMontiArcDSL.g:4018:1: ( '/' )
            {
            // InternalMontiArcDSL.g:4018:1: ( '/' )
            // InternalMontiArcDSL.g:4019:2: '/'
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
    // InternalMontiArcDSL.g:4028:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4032:1: ( rule__Transition__Group_3__1__Impl )
            // InternalMontiArcDSL.g:4033:2: rule__Transition__Group_3__1__Impl
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
    // InternalMontiArcDSL.g:4039:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__ReactionAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4043:1: ( ( ( rule__Transition__ReactionAssignment_3_1 ) ) )
            // InternalMontiArcDSL.g:4044:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            {
            // InternalMontiArcDSL.g:4044:1: ( ( rule__Transition__ReactionAssignment_3_1 ) )
            // InternalMontiArcDSL.g:4045:2: ( rule__Transition__ReactionAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getReactionAssignment_3_1()); 
            // InternalMontiArcDSL.g:4046:2: ( rule__Transition__ReactionAssignment_3_1 )
            // InternalMontiArcDSL.g:4046:3: rule__Transition__ReactionAssignment_3_1
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
    // InternalMontiArcDSL.g:4055:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4059:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalMontiArcDSL.g:4060:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalMontiArcDSL.g:4067:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4071:1: ( ( () ) )
            // InternalMontiArcDSL.g:4072:1: ( () )
            {
            // InternalMontiArcDSL.g:4072:1: ( () )
            // InternalMontiArcDSL.g:4073:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalMontiArcDSL.g:4074:2: ()
            // InternalMontiArcDSL.g:4074:3: 
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
    // InternalMontiArcDSL.g:4082:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4086:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalMontiArcDSL.g:4087:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMontiArcDSL.g:4094:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4098:1: ( ( '{' ) )
            // InternalMontiArcDSL.g:4099:1: ( '{' )
            {
            // InternalMontiArcDSL.g:4099:1: ( '{' )
            // InternalMontiArcDSL.g:4100:2: '{'
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
    // InternalMontiArcDSL.g:4109:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4113:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalMontiArcDSL.g:4114:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMontiArcDSL.g:4121:1: rule__Block__Group__2__Impl : ( ( rule__Block__BlocksAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4125:1: ( ( ( rule__Block__BlocksAssignment_2 )* ) )
            // InternalMontiArcDSL.g:4126:1: ( ( rule__Block__BlocksAssignment_2 )* )
            {
            // InternalMontiArcDSL.g:4126:1: ( ( rule__Block__BlocksAssignment_2 )* )
            // InternalMontiArcDSL.g:4127:2: ( rule__Block__BlocksAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getBlocksAssignment_2()); 
            // InternalMontiArcDSL.g:4128:2: ( rule__Block__BlocksAssignment_2 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_MCQUALIFIEDNAME)||(LA46_0>=RULE_INT && LA46_0<=RULE_STRING)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMontiArcDSL.g:4128:3: rule__Block__BlocksAssignment_2
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Block__BlocksAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalMontiArcDSL.g:4136:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4140:1: ( rule__Block__Group__3__Impl )
            // InternalMontiArcDSL.g:4141:2: rule__Block__Group__3__Impl
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
    // InternalMontiArcDSL.g:4147:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4151:1: ( ( '}' ) )
            // InternalMontiArcDSL.g:4152:1: ( '}' )
            {
            // InternalMontiArcDSL.g:4152:1: ( '}' )
            // InternalMontiArcDSL.g:4153:2: '}'
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
    // InternalMontiArcDSL.g:4163:1: rule__SimpleExpression__Group__0 : rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1 ;
    public final void rule__SimpleExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4167:1: ( rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1 )
            // InternalMontiArcDSL.g:4168:2: rule__SimpleExpression__Group__0__Impl rule__SimpleExpression__Group__1
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
    // InternalMontiArcDSL.g:4175:1: rule__SimpleExpression__Group__0__Impl : ( ( rule__SimpleExpression__ExpressionAssignment_0 ) ) ;
    public final void rule__SimpleExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4179:1: ( ( ( rule__SimpleExpression__ExpressionAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4180:1: ( ( rule__SimpleExpression__ExpressionAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4180:1: ( ( rule__SimpleExpression__ExpressionAssignment_0 ) )
            // InternalMontiArcDSL.g:4181:2: ( rule__SimpleExpression__ExpressionAssignment_0 )
            {
             before(grammarAccess.getSimpleExpressionAccess().getExpressionAssignment_0()); 
            // InternalMontiArcDSL.g:4182:2: ( rule__SimpleExpression__ExpressionAssignment_0 )
            // InternalMontiArcDSL.g:4182:3: rule__SimpleExpression__ExpressionAssignment_0
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
    // InternalMontiArcDSL.g:4190:1: rule__SimpleExpression__Group__1 : rule__SimpleExpression__Group__1__Impl ;
    public final void rule__SimpleExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4194:1: ( rule__SimpleExpression__Group__1__Impl )
            // InternalMontiArcDSL.g:4195:2: rule__SimpleExpression__Group__1__Impl
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
    // InternalMontiArcDSL.g:4201:1: rule__SimpleExpression__Group__1__Impl : ( ';' ) ;
    public final void rule__SimpleExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4205:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4206:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4206:1: ( ';' )
            // InternalMontiArcDSL.g:4207:2: ';'
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
    // InternalMontiArcDSL.g:4217:1: rule__SimpleInit__Group__0 : rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1 ;
    public final void rule__SimpleInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4221:1: ( rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1 )
            // InternalMontiArcDSL.g:4222:2: rule__SimpleInit__Group__0__Impl rule__SimpleInit__Group__1
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
    // InternalMontiArcDSL.g:4229:1: rule__SimpleInit__Group__0__Impl : ( ( rule__SimpleInit__NameAssignment_0 ) ) ;
    public final void rule__SimpleInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4233:1: ( ( ( rule__SimpleInit__NameAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4234:1: ( ( rule__SimpleInit__NameAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4234:1: ( ( rule__SimpleInit__NameAssignment_0 ) )
            // InternalMontiArcDSL.g:4235:2: ( rule__SimpleInit__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleInitAccess().getNameAssignment_0()); 
            // InternalMontiArcDSL.g:4236:2: ( rule__SimpleInit__NameAssignment_0 )
            // InternalMontiArcDSL.g:4236:3: rule__SimpleInit__NameAssignment_0
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
    // InternalMontiArcDSL.g:4244:1: rule__SimpleInit__Group__1 : rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2 ;
    public final void rule__SimpleInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4248:1: ( rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2 )
            // InternalMontiArcDSL.g:4249:2: rule__SimpleInit__Group__1__Impl rule__SimpleInit__Group__2
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
    // InternalMontiArcDSL.g:4256:1: rule__SimpleInit__Group__1__Impl : ( '=' ) ;
    public final void rule__SimpleInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4260:1: ( ( '=' ) )
            // InternalMontiArcDSL.g:4261:1: ( '=' )
            {
            // InternalMontiArcDSL.g:4261:1: ( '=' )
            // InternalMontiArcDSL.g:4262:2: '='
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
    // InternalMontiArcDSL.g:4271:1: rule__SimpleInit__Group__2 : rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3 ;
    public final void rule__SimpleInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4275:1: ( rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3 )
            // InternalMontiArcDSL.g:4276:2: rule__SimpleInit__Group__2__Impl rule__SimpleInit__Group__3
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
    // InternalMontiArcDSL.g:4283:1: rule__SimpleInit__Group__2__Impl : ( ( rule__SimpleInit__ExpressionsAssignment_2 ) ) ;
    public final void rule__SimpleInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4287:1: ( ( ( rule__SimpleInit__ExpressionsAssignment_2 ) ) )
            // InternalMontiArcDSL.g:4288:1: ( ( rule__SimpleInit__ExpressionsAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:4288:1: ( ( rule__SimpleInit__ExpressionsAssignment_2 ) )
            // InternalMontiArcDSL.g:4289:2: ( rule__SimpleInit__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getSimpleInitAccess().getExpressionsAssignment_2()); 
            // InternalMontiArcDSL.g:4290:2: ( rule__SimpleInit__ExpressionsAssignment_2 )
            // InternalMontiArcDSL.g:4290:3: rule__SimpleInit__ExpressionsAssignment_2
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
    // InternalMontiArcDSL.g:4298:1: rule__SimpleInit__Group__3 : rule__SimpleInit__Group__3__Impl ;
    public final void rule__SimpleInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4302:1: ( rule__SimpleInit__Group__3__Impl )
            // InternalMontiArcDSL.g:4303:2: rule__SimpleInit__Group__3__Impl
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
    // InternalMontiArcDSL.g:4309:1: rule__SimpleInit__Group__3__Impl : ( ';' ) ;
    public final void rule__SimpleInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4313:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4314:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4314:1: ( ';' )
            // InternalMontiArcDSL.g:4315:2: ';'
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
    // InternalMontiArcDSL.g:4325:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4329:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiArcDSL.g:4330:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMontiArcDSL.g:4337:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4341:1: ( ( 'import' ) )
            // InternalMontiArcDSL.g:4342:1: ( 'import' )
            {
            // InternalMontiArcDSL.g:4342:1: ( 'import' )
            // InternalMontiArcDSL.g:4343:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4352:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4356:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiArcDSL.g:4357:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMontiArcDSL.g:4364:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4368:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4369:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4369:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiArcDSL.g:4370:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiArcDSL.g:4371:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiArcDSL.g:4371:3: rule__ImportStatements__ImportUriAssignment_1
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
    // InternalMontiArcDSL.g:4379:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4383:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiArcDSL.g:4384:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalMontiArcDSL.g:4391:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__StarAssignment_2 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4395:1: ( ( ( rule__ImportStatements__StarAssignment_2 )? ) )
            // InternalMontiArcDSL.g:4396:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            {
            // InternalMontiArcDSL.g:4396:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            // InternalMontiArcDSL.g:4397:2: ( rule__ImportStatements__StarAssignment_2 )?
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 
            // InternalMontiArcDSL.g:4398:2: ( rule__ImportStatements__StarAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DOTSTAR) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMontiArcDSL.g:4398:3: rule__ImportStatements__StarAssignment_2
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
    // InternalMontiArcDSL.g:4406:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4410:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiArcDSL.g:4411:2: rule__ImportStatements__Group__3__Impl
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
    // InternalMontiArcDSL.g:4417:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4421:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4422:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4422:1: ( ';' )
            // InternalMontiArcDSL.g:4423:2: ';'
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
    // InternalMontiArcDSL.g:4433:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4437:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiArcDSL.g:4438:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMontiArcDSL.g:4445:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4449:1: ( ( 'package' ) )
            // InternalMontiArcDSL.g:4450:1: ( 'package' )
            {
            // InternalMontiArcDSL.g:4450:1: ( 'package' )
            // InternalMontiArcDSL.g:4451:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4460:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4464:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiArcDSL.g:4465:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalMontiArcDSL.g:4472:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4476:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4477:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4477:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiArcDSL.g:4478:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiArcDSL.g:4479:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiArcDSL.g:4479:3: rule__Package__NameAssignment_1
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
    // InternalMontiArcDSL.g:4487:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4491:1: ( rule__Package__Group__2__Impl )
            // InternalMontiArcDSL.g:4492:2: rule__Package__Group__2__Impl
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
    // InternalMontiArcDSL.g:4498:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4502:1: ( ( ';' ) )
            // InternalMontiArcDSL.g:4503:1: ( ';' )
            {
            // InternalMontiArcDSL.g:4503:1: ( ';' )
            // InternalMontiArcDSL.g:4504:2: ';'
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
    // InternalMontiArcDSL.g:4514:1: rule__MCCollectionType__Group__0 : rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 ;
    public final void rule__MCCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4518:1: ( rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 )
            // InternalMontiArcDSL.g:4519:2: rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMontiArcDSL.g:4526:1: rule__MCCollectionType__Group__0__Impl : ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__MCCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4530:1: ( ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4531:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4531:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            // InternalMontiArcDSL.g:4532:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalMontiArcDSL.g:4533:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            // InternalMontiArcDSL.g:4533:3: rule__MCCollectionType__CollectionAssignment_0
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
    // InternalMontiArcDSL.g:4541:1: rule__MCCollectionType__Group__1 : rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 ;
    public final void rule__MCCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4545:1: ( rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 )
            // InternalMontiArcDSL.g:4546:2: rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2
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
    // InternalMontiArcDSL.g:4553:1: rule__MCCollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__MCCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4557:1: ( ( '<' ) )
            // InternalMontiArcDSL.g:4558:1: ( '<' )
            {
            // InternalMontiArcDSL.g:4558:1: ( '<' )
            // InternalMontiArcDSL.g:4559:2: '<'
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
    // InternalMontiArcDSL.g:4568:1: rule__MCCollectionType__Group__2 : rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 ;
    public final void rule__MCCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4572:1: ( rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 )
            // InternalMontiArcDSL.g:4573:2: rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMontiArcDSL.g:4580:1: rule__MCCollectionType__Group__2__Impl : ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__MCCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4584:1: ( ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) )
            // InternalMontiArcDSL.g:4585:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalMontiArcDSL.g:4585:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            // InternalMontiArcDSL.g:4586:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalMontiArcDSL.g:4587:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            // InternalMontiArcDSL.g:4587:3: rule__MCCollectionType__InnerTypeAssignment_2
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
    // InternalMontiArcDSL.g:4595:1: rule__MCCollectionType__Group__3 : rule__MCCollectionType__Group__3__Impl ;
    public final void rule__MCCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4599:1: ( rule__MCCollectionType__Group__3__Impl )
            // InternalMontiArcDSL.g:4600:2: rule__MCCollectionType__Group__3__Impl
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
    // InternalMontiArcDSL.g:4606:1: rule__MCCollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__MCCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4610:1: ( ( '>' ) )
            // InternalMontiArcDSL.g:4611:1: ( '>' )
            {
            // InternalMontiArcDSL.g:4611:1: ( '>' )
            // InternalMontiArcDSL.g:4612:2: '>'
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
    // InternalMontiArcDSL.g:4622:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4626:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiArcDSL.g:4627:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalMontiArcDSL.g:4634:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4638:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiArcDSL.g:4639:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiArcDSL.g:4639:1: ( ruleMCPrimitiveType )
            // InternalMontiArcDSL.g:4640:2: ruleMCPrimitiveType
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
    // InternalMontiArcDSL.g:4649:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4653:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiArcDSL.g:4654:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMontiArcDSL.g:4661:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4665:1: ( ( '[' ) )
            // InternalMontiArcDSL.g:4666:1: ( '[' )
            {
            // InternalMontiArcDSL.g:4666:1: ( '[' )
            // InternalMontiArcDSL.g:4667:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4676:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4680:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiArcDSL.g:4681:2: rule__MCArrayType__Group__2__Impl
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
    // InternalMontiArcDSL.g:4687:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4691:1: ( ( ']' ) )
            // InternalMontiArcDSL.g:4692:1: ( ']' )
            {
            // InternalMontiArcDSL.g:4692:1: ( ']' )
            // InternalMontiArcDSL.g:4693:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4703:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4707:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMontiArcDSL.g:4708:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMontiArcDSL.g:4715:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4719:1: ( ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) )
            // InternalMontiArcDSL.g:4720:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            {
            // InternalMontiArcDSL.g:4720:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            // InternalMontiArcDSL.g:4721:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 
            // InternalMontiArcDSL.g:4722:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            // InternalMontiArcDSL.g:4722:3: rule__BinaryExpression__Literal1Assignment_0
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
    // InternalMontiArcDSL.g:4730:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4734:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMontiArcDSL.g:4735:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
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
    // InternalMontiArcDSL.g:4742:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__OpAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4746:1: ( ( ( rule__BinaryExpression__OpAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4747:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4747:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            // InternalMontiArcDSL.g:4748:2: ( rule__BinaryExpression__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 
            // InternalMontiArcDSL.g:4749:2: ( rule__BinaryExpression__OpAssignment_1 )
            // InternalMontiArcDSL.g:4749:3: rule__BinaryExpression__OpAssignment_1
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
    // InternalMontiArcDSL.g:4757:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4761:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalMontiArcDSL.g:4762:2: rule__BinaryExpression__Group__2__Impl
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
    // InternalMontiArcDSL.g:4768:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4772:1: ( ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) )
            // InternalMontiArcDSL.g:4773:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            {
            // InternalMontiArcDSL.g:4773:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            // InternalMontiArcDSL.g:4774:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 
            // InternalMontiArcDSL.g:4775:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            // InternalMontiArcDSL.g:4775:3: rule__BinaryExpression__Literal2Assignment_2
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
    // InternalMontiArcDSL.g:4784:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4788:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // InternalMontiArcDSL.g:4789:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
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
    // InternalMontiArcDSL.g:4796:1: rule__Arguments__Group__0__Impl : ( '(' ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4800:1: ( ( '(' ) )
            // InternalMontiArcDSL.g:4801:1: ( '(' )
            {
            // InternalMontiArcDSL.g:4801:1: ( '(' )
            // InternalMontiArcDSL.g:4802:2: '('
            {
             before(grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4811:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4815:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // InternalMontiArcDSL.g:4816:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMontiArcDSL.g:4823:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_1 ) ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4827:1: ( ( ( rule__Arguments__ArgumentsAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4828:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4828:1: ( ( rule__Arguments__ArgumentsAssignment_1 ) )
            // InternalMontiArcDSL.g:4829:2: ( rule__Arguments__ArgumentsAssignment_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_1()); 
            // InternalMontiArcDSL.g:4830:2: ( rule__Arguments__ArgumentsAssignment_1 )
            // InternalMontiArcDSL.g:4830:3: rule__Arguments__ArgumentsAssignment_1
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
    // InternalMontiArcDSL.g:4838:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl rule__Arguments__Group__3 ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4842:1: ( rule__Arguments__Group__2__Impl rule__Arguments__Group__3 )
            // InternalMontiArcDSL.g:4843:2: rule__Arguments__Group__2__Impl rule__Arguments__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMontiArcDSL.g:4850:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__Group_2__0 )* ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4854:1: ( ( ( rule__Arguments__Group_2__0 )* ) )
            // InternalMontiArcDSL.g:4855:1: ( ( rule__Arguments__Group_2__0 )* )
            {
            // InternalMontiArcDSL.g:4855:1: ( ( rule__Arguments__Group_2__0 )* )
            // InternalMontiArcDSL.g:4856:2: ( rule__Arguments__Group_2__0 )*
            {
             before(grammarAccess.getArgumentsAccess().getGroup_2()); 
            // InternalMontiArcDSL.g:4857:2: ( rule__Arguments__Group_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==47) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMontiArcDSL.g:4857:3: rule__Arguments__Group_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Arguments__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalMontiArcDSL.g:4865:1: rule__Arguments__Group__3 : rule__Arguments__Group__3__Impl ;
    public final void rule__Arguments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4869:1: ( rule__Arguments__Group__3__Impl )
            // InternalMontiArcDSL.g:4870:2: rule__Arguments__Group__3__Impl
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
    // InternalMontiArcDSL.g:4876:1: rule__Arguments__Group__3__Impl : ( ')' ) ;
    public final void rule__Arguments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4880:1: ( ( ')' ) )
            // InternalMontiArcDSL.g:4881:1: ( ')' )
            {
            // InternalMontiArcDSL.g:4881:1: ( ')' )
            // InternalMontiArcDSL.g:4882:2: ')'
            {
             before(grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:4892:1: rule__Arguments__Group_2__0 : rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 ;
    public final void rule__Arguments__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4896:1: ( rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1 )
            // InternalMontiArcDSL.g:4897:2: rule__Arguments__Group_2__0__Impl rule__Arguments__Group_2__1
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
    // InternalMontiArcDSL.g:4904:1: rule__Arguments__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Arguments__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4908:1: ( ( ',' ) )
            // InternalMontiArcDSL.g:4909:1: ( ',' )
            {
            // InternalMontiArcDSL.g:4909:1: ( ',' )
            // InternalMontiArcDSL.g:4910:2: ','
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
    // InternalMontiArcDSL.g:4919:1: rule__Arguments__Group_2__1 : rule__Arguments__Group_2__1__Impl ;
    public final void rule__Arguments__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4923:1: ( rule__Arguments__Group_2__1__Impl )
            // InternalMontiArcDSL.g:4924:2: rule__Arguments__Group_2__1__Impl
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
    // InternalMontiArcDSL.g:4930:1: rule__Arguments__Group_2__1__Impl : ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) ;
    public final void rule__Arguments__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4934:1: ( ( ( rule__Arguments__ArgumentsAssignment_2_1 ) ) )
            // InternalMontiArcDSL.g:4935:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            {
            // InternalMontiArcDSL.g:4935:1: ( ( rule__Arguments__ArgumentsAssignment_2_1 ) )
            // InternalMontiArcDSL.g:4936:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            {
             before(grammarAccess.getArgumentsAccess().getArgumentsAssignment_2_1()); 
            // InternalMontiArcDSL.g:4937:2: ( rule__Arguments__ArgumentsAssignment_2_1 )
            // InternalMontiArcDSL.g:4937:3: rule__Arguments__ArgumentsAssignment_2_1
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
    // InternalMontiArcDSL.g:4946:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4950:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMontiArcDSL.g:4951:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
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
    // InternalMontiArcDSL.g:4958:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4962:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMontiArcDSL.g:4963:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMontiArcDSL.g:4963:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMontiArcDSL.g:4964:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMontiArcDSL.g:4965:2: ( rule__Argument__NameAssignment_0 )
            // InternalMontiArcDSL.g:4965:3: rule__Argument__NameAssignment_0
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
    // InternalMontiArcDSL.g:4973:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4977:1: ( rule__Argument__Group__1__Impl )
            // InternalMontiArcDSL.g:4978:2: rule__Argument__Group__1__Impl
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
    // InternalMontiArcDSL.g:4984:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:4988:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMontiArcDSL.g:4989:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMontiArcDSL.g:4989:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMontiArcDSL.g:4990:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMontiArcDSL.g:4991:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMontiArcDSL.g:4991:3: rule__Argument__ExpressionAssignment_1
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
    // InternalMontiArcDSL.g:5000:1: rule__MACompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__MACompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5004:1: ( ( rulePackage ) )
            // InternalMontiArcDSL.g:5005:2: ( rulePackage )
            {
            // InternalMontiArcDSL.g:5005:2: ( rulePackage )
            // InternalMontiArcDSL.g:5006:3: rulePackage
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
    // InternalMontiArcDSL.g:5015:1: rule__MACompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__MACompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5019:1: ( ( ruleImportStatements ) )
            // InternalMontiArcDSL.g:5020:2: ( ruleImportStatements )
            {
            // InternalMontiArcDSL.g:5020:2: ( ruleImportStatements )
            // InternalMontiArcDSL.g:5021:3: ruleImportStatements
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
    // InternalMontiArcDSL.g:5030:1: rule__MACompilationUnit__ComponentAssignment_2 : ( ruleComponent ) ;
    public final void rule__MACompilationUnit__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5034:1: ( ( ruleComponent ) )
            // InternalMontiArcDSL.g:5035:2: ( ruleComponent )
            {
            // InternalMontiArcDSL.g:5035:2: ( ruleComponent )
            // InternalMontiArcDSL.g:5036:3: ruleComponent
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
    // InternalMontiArcDSL.g:5045:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5049:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5050:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5050:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5051:3: RULE_ID
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
    // InternalMontiArcDSL.g:5060:1: rule__Component__SignatureAssignment_2 : ( ruleSignature ) ;
    public final void rule__Component__SignatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5064:1: ( ( ruleSignature ) )
            // InternalMontiArcDSL.g:5065:2: ( ruleSignature )
            {
            // InternalMontiArcDSL.g:5065:2: ( ruleSignature )
            // InternalMontiArcDSL.g:5066:3: ruleSignature
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
    // InternalMontiArcDSL.g:5075:1: rule__Component__ArcElementsAssignment_4 : ( ruleArcElement ) ;
    public final void rule__Component__ArcElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5079:1: ( ( ruleArcElement ) )
            // InternalMontiArcDSL.g:5080:2: ( ruleArcElement )
            {
            // InternalMontiArcDSL.g:5080:2: ( ruleArcElement )
            // InternalMontiArcDSL.g:5081:3: ruleArcElement
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
    // InternalMontiArcDSL.g:5090:1: rule__Signature__ParametersAssignment_1 : ( ruleParameters ) ;
    public final void rule__Signature__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5094:1: ( ( ruleParameters ) )
            // InternalMontiArcDSL.g:5095:2: ( ruleParameters )
            {
            // InternalMontiArcDSL.g:5095:2: ( ruleParameters )
            // InternalMontiArcDSL.g:5096:3: ruleParameters
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
    // InternalMontiArcDSL.g:5105:1: rule__Signature__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__Signature__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5109:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5110:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5110:2: ( ruleType )
            // InternalMontiArcDSL.g:5111:3: ruleType
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
    // InternalMontiArcDSL.g:5120:1: rule__Parameters__ParametersAssignment_0 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5124:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:5125:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:5125:2: ( ruleParameter )
            // InternalMontiArcDSL.g:5126:3: ruleParameter
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
    // InternalMontiArcDSL.g:5135:1: rule__Parameters__ParametersAssignment_1_1 : ( ruleParameter ) ;
    public final void rule__Parameters__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5139:1: ( ( ruleParameter ) )
            // InternalMontiArcDSL.g:5140:2: ( ruleParameter )
            {
            // InternalMontiArcDSL.g:5140:2: ( ruleParameter )
            // InternalMontiArcDSL.g:5141:3: ruleParameter
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
    // InternalMontiArcDSL.g:5150:1: rule__ComponentType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ComponentType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5154:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5155:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5155:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5156:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentTypeAccess().getTypeComponentCrossReference_0()); 
            // InternalMontiArcDSL.g:5157:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5158:4: RULE_ID
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
    // InternalMontiArcDSL.g:5169:1: rule__Parameter__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5173:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5174:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5174:2: ( ruleType )
            // InternalMontiArcDSL.g:5175:3: ruleType
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
    // InternalMontiArcDSL.g:5184:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5188:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5189:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5189:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5190:3: RULE_ID
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
    // InternalMontiArcDSL.g:5199:1: rule__Parameter__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Parameter__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5203:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5204:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5204:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5205:3: ruleExpression
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
    // InternalMontiArcDSL.g:5214:1: rule__SubComponent__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__SubComponent__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5218:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5219:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5219:2: ( ruleType )
            // InternalMontiArcDSL.g:5220:3: ruleType
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
    // InternalMontiArcDSL.g:5229:1: rule__SubComponent__ArgumentsAssignment_2 : ( ruleArguments ) ;
    public final void rule__SubComponent__ArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5233:1: ( ( ruleArguments ) )
            // InternalMontiArcDSL.g:5234:2: ( ruleArguments )
            {
            // InternalMontiArcDSL.g:5234:2: ( ruleArguments )
            // InternalMontiArcDSL.g:5235:3: ruleArguments
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
    // InternalMontiArcDSL.g:5244:1: rule__SubComponent__InstancesAssignment_3 : ( ruleNames ) ;
    public final void rule__SubComponent__InstancesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5248:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5249:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5249:2: ( ruleNames )
            // InternalMontiArcDSL.g:5250:3: ruleNames
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
    // InternalMontiArcDSL.g:5259:1: rule__Connector__SourceAssignment_0 : ( ( rule__Connector__SourceAlternatives_0_0 ) ) ;
    public final void rule__Connector__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5263:1: ( ( ( rule__Connector__SourceAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5264:2: ( ( rule__Connector__SourceAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5264:2: ( ( rule__Connector__SourceAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5265:3: ( rule__Connector__SourceAlternatives_0_0 )
            {
             before(grammarAccess.getConnectorAccess().getSourceAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5266:3: ( rule__Connector__SourceAlternatives_0_0 )
            // InternalMontiArcDSL.g:5266:4: rule__Connector__SourceAlternatives_0_0
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
    // InternalMontiArcDSL.g:5274:1: rule__Connector__TargetsAssignment_2 : ( ruleNames ) ;
    public final void rule__Connector__TargetsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5278:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5279:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5279:2: ( ruleNames )
            // InternalMontiArcDSL.g:5280:3: ruleNames
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
    // InternalMontiArcDSL.g:5289:1: rule__Ports__PortsAssignment_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5293:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:5294:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:5294:2: ( rulePort )
            // InternalMontiArcDSL.g:5295:3: rulePort
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
    // InternalMontiArcDSL.g:5304:1: rule__Ports__PortsAssignment_2_1 : ( rulePort ) ;
    public final void rule__Ports__PortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5308:1: ( ( rulePort ) )
            // InternalMontiArcDSL.g:5309:2: ( rulePort )
            {
            // InternalMontiArcDSL.g:5309:2: ( rulePort )
            // InternalMontiArcDSL.g:5310:3: rulePort
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
    // InternalMontiArcDSL.g:5319:1: rule__Port__SyncAssignment_0 : ( RULE_SYNC ) ;
    public final void rule__Port__SyncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5323:1: ( ( RULE_SYNC ) )
            // InternalMontiArcDSL.g:5324:2: ( RULE_SYNC )
            {
            // InternalMontiArcDSL.g:5324:2: ( RULE_SYNC )
            // InternalMontiArcDSL.g:5325:3: RULE_SYNC
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
    // InternalMontiArcDSL.g:5334:1: rule__Port__InAssignment_1_0 : ( ( 'in' ) ) ;
    public final void rule__Port__InAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5338:1: ( ( ( 'in' ) ) )
            // InternalMontiArcDSL.g:5339:2: ( ( 'in' ) )
            {
            // InternalMontiArcDSL.g:5339:2: ( ( 'in' ) )
            // InternalMontiArcDSL.g:5340:3: ( 'in' )
            {
             before(grammarAccess.getPortAccess().getInInKeyword_1_0_0()); 
            // InternalMontiArcDSL.g:5341:3: ( 'in' )
            // InternalMontiArcDSL.g:5342:4: 'in'
            {
             before(grammarAccess.getPortAccess().getInInKeyword_1_0_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMontiArcDSL.g:5353:1: rule__Port__OutAssignment_1_1 : ( ( 'out' ) ) ;
    public final void rule__Port__OutAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5357:1: ( ( ( 'out' ) ) )
            // InternalMontiArcDSL.g:5358:2: ( ( 'out' ) )
            {
            // InternalMontiArcDSL.g:5358:2: ( ( 'out' ) )
            // InternalMontiArcDSL.g:5359:3: ( 'out' )
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_1_1_0()); 
            // InternalMontiArcDSL.g:5360:3: ( 'out' )
            // InternalMontiArcDSL.g:5361:4: 'out'
            {
             before(grammarAccess.getPortAccess().getOutOutKeyword_1_1_0()); 
            match(input,61,FOLLOW_2); 
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


    // $ANTLR start "rule__Port__TypeAssignment_2_0"
    // InternalMontiArcDSL.g:5372:1: rule__Port__TypeAssignment_2_0 : ( ruleType ) ;
    public final void rule__Port__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5376:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5377:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5377:2: ( ruleType )
            // InternalMontiArcDSL.g:5378:3: ruleType
            {
             before(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_2_0"


    // $ANTLR start "rule__Port__DatatypeAssignment_2_1"
    // InternalMontiArcDSL.g:5387:1: rule__Port__DatatypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Port__DatatypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5391:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5392:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5392:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5393:3: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getDatatypeCDDefinitionCrossReference_2_1_0()); 
            // InternalMontiArcDSL.g:5394:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5395:4: RULE_ID
            {
             before(grammarAccess.getPortAccess().getDatatypeCDDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getDatatypeCDDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPortAccess().getDatatypeCDDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__DatatypeAssignment_2_1"


    // $ANTLR start "rule__Port__NamesAssignment_3"
    // InternalMontiArcDSL.g:5406:1: rule__Port__NamesAssignment_3 : ( ruleNames ) ;
    public final void rule__Port__NamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5410:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5411:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5411:2: ( ruleNames )
            // InternalMontiArcDSL.g:5412:3: ruleNames
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
    // InternalMontiArcDSL.g:5421:1: rule__Names__NamesAssignment_0 : ( ( rule__Names__NamesAlternatives_0_0 ) ) ;
    public final void rule__Names__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5425:1: ( ( ( rule__Names__NamesAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5426:2: ( ( rule__Names__NamesAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5426:2: ( ( rule__Names__NamesAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5427:3: ( rule__Names__NamesAlternatives_0_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5428:3: ( rule__Names__NamesAlternatives_0_0 )
            // InternalMontiArcDSL.g:5428:4: rule__Names__NamesAlternatives_0_0
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
    // InternalMontiArcDSL.g:5436:1: rule__Names__NamesAssignment_1_1 : ( ( rule__Names__NamesAlternatives_1_1_0 ) ) ;
    public final void rule__Names__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5440:1: ( ( ( rule__Names__NamesAlternatives_1_1_0 ) ) )
            // InternalMontiArcDSL.g:5441:2: ( ( rule__Names__NamesAlternatives_1_1_0 ) )
            {
            // InternalMontiArcDSL.g:5441:2: ( ( rule__Names__NamesAlternatives_1_1_0 ) )
            // InternalMontiArcDSL.g:5442:3: ( rule__Names__NamesAlternatives_1_1_0 )
            {
             before(grammarAccess.getNamesAccess().getNamesAlternatives_1_1_0()); 
            // InternalMontiArcDSL.g:5443:3: ( rule__Names__NamesAlternatives_1_1_0 )
            // InternalMontiArcDSL.g:5443:4: rule__Names__NamesAlternatives_1_1_0
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
    // InternalMontiArcDSL.g:5451:1: rule__Variable__TypeAssignment_0 : ( ( rule__Variable__TypeAlternatives_0_0 ) ) ;
    public final void rule__Variable__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5455:1: ( ( ( rule__Variable__TypeAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5456:2: ( ( rule__Variable__TypeAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5456:2: ( ( rule__Variable__TypeAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5457:3: ( rule__Variable__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getVariableAccess().getTypeAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5458:3: ( rule__Variable__TypeAlternatives_0_0 )
            // InternalMontiArcDSL.g:5458:4: rule__Variable__TypeAlternatives_0_0
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
    // InternalMontiArcDSL.g:5466:1: rule__Variable__NamesAssignment_1 : ( ruleNames ) ;
    public final void rule__Variable__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5470:1: ( ( ruleNames ) )
            // InternalMontiArcDSL.g:5471:2: ( ruleNames )
            {
            // InternalMontiArcDSL.g:5471:2: ( ruleNames )
            // InternalMontiArcDSL.g:5472:3: ruleNames
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
    // InternalMontiArcDSL.g:5481:1: rule__Variable__ParametersAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Variable__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5485:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5486:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5486:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5487:3: ruleExpression
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
    // InternalMontiArcDSL.g:5496:1: rule__Variable__ParametersAssignment_2_2_1 : ( ruleExpression ) ;
    public final void rule__Variable__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5500:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5501:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5501:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5502:3: ruleExpression
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
    // InternalMontiArcDSL.g:5511:1: rule__Automaton__SyncAssignment_1 : ( RULE_SYNC ) ;
    public final void rule__Automaton__SyncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5515:1: ( ( RULE_SYNC ) )
            // InternalMontiArcDSL.g:5516:2: ( RULE_SYNC )
            {
            // InternalMontiArcDSL.g:5516:2: ( RULE_SYNC )
            // InternalMontiArcDSL.g:5517:3: RULE_SYNC
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
    // InternalMontiArcDSL.g:5526:1: rule__Automaton__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Automaton__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5530:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5531:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5531:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5532:3: RULE_ID
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
    // InternalMontiArcDSL.g:5541:1: rule__Automaton__StatesAssignment_5_0 : ( ruleState ) ;
    public final void rule__Automaton__StatesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5545:1: ( ( ruleState ) )
            // InternalMontiArcDSL.g:5546:2: ( ruleState )
            {
            // InternalMontiArcDSL.g:5546:2: ( ruleState )
            // InternalMontiArcDSL.g:5547:3: ruleState
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
    // InternalMontiArcDSL.g:5556:1: rule__Automaton__TransitionsAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__Automaton__TransitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5560:1: ( ( ruleTransition ) )
            // InternalMontiArcDSL.g:5561:2: ( ruleTransition )
            {
            // InternalMontiArcDSL.g:5561:2: ( ruleTransition )
            // InternalMontiArcDSL.g:5562:3: ruleTransition
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
    // InternalMontiArcDSL.g:5571:1: rule__SCState__ModifierAssignment_0 : ( ruleSCModifier ) ;
    public final void rule__SCState__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5575:1: ( ( ruleSCModifier ) )
            // InternalMontiArcDSL.g:5576:2: ( ruleSCModifier )
            {
            // InternalMontiArcDSL.g:5576:2: ( ruleSCModifier )
            // InternalMontiArcDSL.g:5577:3: ruleSCModifier
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
    // InternalMontiArcDSL.g:5586:1: rule__SCState__AnteAssignment_1 : ( ruleSCSAnte ) ;
    public final void rule__SCState__AnteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5590:1: ( ( ruleSCSAnte ) )
            // InternalMontiArcDSL.g:5591:2: ( ruleSCSAnte )
            {
            // InternalMontiArcDSL.g:5591:2: ( ruleSCSAnte )
            // InternalMontiArcDSL.g:5592:3: ruleSCSAnte
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
    // InternalMontiArcDSL.g:5601:1: rule__SCState__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SCState__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5605:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5606:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5606:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5607:3: RULE_ID
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
    // InternalMontiArcDSL.g:5616:1: rule__InvState__ModifierAssignment_0 : ( ruleSCModifier ) ;
    public final void rule__InvState__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5620:1: ( ( ruleSCModifier ) )
            // InternalMontiArcDSL.g:5621:2: ( ruleSCModifier )
            {
            // InternalMontiArcDSL.g:5621:2: ( ruleSCModifier )
            // InternalMontiArcDSL.g:5622:3: ruleSCModifier
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
    // InternalMontiArcDSL.g:5631:1: rule__InvState__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InvState__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5635:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5636:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5636:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5637:3: RULE_ID
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
    // InternalMontiArcDSL.g:5646:1: rule__InvState__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__InvState__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5650:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5651:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5651:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5652:3: ruleExpression
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
    // InternalMontiArcDSL.g:5661:1: rule__SCSAnte__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__SCSAnte__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5665:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:5666:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:5666:2: ( ruleBlock )
            // InternalMontiArcDSL.g:5667:3: ruleBlock
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
    // InternalMontiArcDSL.g:5676:1: rule__Transition__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5680:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5681:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5681:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5682:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0()); 
            // InternalMontiArcDSL.g:5683:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5684:4: RULE_ID
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
    // InternalMontiArcDSL.g:5695:1: rule__Transition__TargetAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5699:1: ( ( ( RULE_ID ) ) )
            // InternalMontiArcDSL.g:5700:2: ( ( RULE_ID ) )
            {
            // InternalMontiArcDSL.g:5700:2: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5701:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0()); 
            // InternalMontiArcDSL.g:5702:3: ( RULE_ID )
            // InternalMontiArcDSL.g:5703:4: RULE_ID
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
    // InternalMontiArcDSL.g:5714:1: rule__Transition__ExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Transition__ExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5718:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5719:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5719:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5720:3: ruleExpression
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
    // InternalMontiArcDSL.g:5729:1: rule__Transition__ReactionAssignment_3_1 : ( ruleBlock ) ;
    public final void rule__Transition__ReactionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5733:1: ( ( ruleBlock ) )
            // InternalMontiArcDSL.g:5734:2: ( ruleBlock )
            {
            // InternalMontiArcDSL.g:5734:2: ( ruleBlock )
            // InternalMontiArcDSL.g:5735:3: ruleBlock
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
    // InternalMontiArcDSL.g:5744:1: rule__Block__BlocksAssignment_2 : ( ruleBlockStatement ) ;
    public final void rule__Block__BlocksAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5748:1: ( ( ruleBlockStatement ) )
            // InternalMontiArcDSL.g:5749:2: ( ruleBlockStatement )
            {
            // InternalMontiArcDSL.g:5749:2: ( ruleBlockStatement )
            // InternalMontiArcDSL.g:5750:3: ruleBlockStatement
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
    // InternalMontiArcDSL.g:5759:1: rule__SimpleExpression__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__SimpleExpression__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5763:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5764:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5764:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5765:3: ruleExpression
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
    // InternalMontiArcDSL.g:5774:1: rule__SimpleInit__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleInit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5778:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5779:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5779:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5780:3: RULE_ID
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
    // InternalMontiArcDSL.g:5789:1: rule__SimpleInit__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleInit__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5793:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:5794:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:5794:2: ( ruleExpression )
            // InternalMontiArcDSL.g:5795:3: ruleExpression
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
    // InternalMontiArcDSL.g:5804:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5808:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:5809:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:5809:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:5810:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:5819:1: rule__ImportStatements__StarAssignment_2 : ( RULE_DOTSTAR ) ;
    public final void rule__ImportStatements__StarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5823:1: ( ( RULE_DOTSTAR ) )
            // InternalMontiArcDSL.g:5824:2: ( RULE_DOTSTAR )
            {
            // InternalMontiArcDSL.g:5824:2: ( RULE_DOTSTAR )
            // InternalMontiArcDSL.g:5825:3: RULE_DOTSTAR
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
    // InternalMontiArcDSL.g:5834:1: rule__Package__NameAssignment_1 : ( ( rule__Package__NameAlternatives_1_0 ) ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5838:1: ( ( ( rule__Package__NameAlternatives_1_0 ) ) )
            // InternalMontiArcDSL.g:5839:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            {
            // InternalMontiArcDSL.g:5839:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            // InternalMontiArcDSL.g:5840:3: ( rule__Package__NameAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 
            // InternalMontiArcDSL.g:5841:3: ( rule__Package__NameAlternatives_1_0 )
            // InternalMontiArcDSL.g:5841:4: rule__Package__NameAlternatives_1_0
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
    // InternalMontiArcDSL.g:5849:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5853:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:5854:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:5854:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:5855:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:5856:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:5856:4: rule__MCPrimitiveType__TypeAlternatives_0
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
    // InternalMontiArcDSL.g:5864:1: rule__MCObjectType__TypeAssignment : ( ( rule__MCObjectType__TypeAlternatives_0 ) ) ;
    public final void rule__MCObjectType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5868:1: ( ( ( rule__MCObjectType__TypeAlternatives_0 ) ) )
            // InternalMontiArcDSL.g:5869:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            {
            // InternalMontiArcDSL.g:5869:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            // InternalMontiArcDSL.g:5870:3: ( rule__MCObjectType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiArcDSL.g:5871:3: ( rule__MCObjectType__TypeAlternatives_0 )
            // InternalMontiArcDSL.g:5871:4: rule__MCObjectType__TypeAlternatives_0
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
    // InternalMontiArcDSL.g:5879:1: rule__MCCollectionType__CollectionAssignment_0 : ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__MCCollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5883:1: ( ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5884:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5884:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            // InternalMontiArcDSL.g:5885:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalMontiArcDSL.g:5886:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            // InternalMontiArcDSL.g:5886:4: rule__MCCollectionType__CollectionAlternatives_0_0
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
    // InternalMontiArcDSL.g:5894:1: rule__MCCollectionType__InnerTypeAssignment_2 : ( ruleType ) ;
    public final void rule__MCCollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5898:1: ( ( ruleType ) )
            // InternalMontiArcDSL.g:5899:2: ( ruleType )
            {
            // InternalMontiArcDSL.g:5899:2: ( ruleType )
            // InternalMontiArcDSL.g:5900:3: ruleType
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
    // InternalMontiArcDSL.g:5909:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5913:1: ( ( RULE_INT ) )
            // InternalMontiArcDSL.g:5914:2: ( RULE_INT )
            {
            // InternalMontiArcDSL.g:5914:2: ( RULE_INT )
            // InternalMontiArcDSL.g:5915:3: RULE_INT
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
    // InternalMontiArcDSL.g:5924:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5928:1: ( ( RULE_STRING ) )
            // InternalMontiArcDSL.g:5929:2: ( RULE_STRING )
            {
            // InternalMontiArcDSL.g:5929:2: ( RULE_STRING )
            // InternalMontiArcDSL.g:5930:3: RULE_STRING
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
    // InternalMontiArcDSL.g:5939:1: rule__NameExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5943:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:5944:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:5944:2: ( RULE_ID )
            // InternalMontiArcDSL.g:5945:3: RULE_ID
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
    // InternalMontiArcDSL.g:5954:1: rule__NameExpression__QualifiednameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__NameExpression__QualifiednameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5958:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:5959:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:5959:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:5960:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:5969:1: rule__BinaryExpression__Literal1Assignment_0 : ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) ;
    public final void rule__BinaryExpression__Literal1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5973:1: ( ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) )
            // InternalMontiArcDSL.g:5974:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            {
            // InternalMontiArcDSL.g:5974:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            // InternalMontiArcDSL.g:5975:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 
            // InternalMontiArcDSL.g:5976:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            // InternalMontiArcDSL.g:5976:4: rule__BinaryExpression__Literal1Alternatives_0_0
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
    // InternalMontiArcDSL.g:5984:1: rule__BinaryExpression__OpAssignment_1 : ( ruleOperator ) ;
    public final void rule__BinaryExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:5988:1: ( ( ruleOperator ) )
            // InternalMontiArcDSL.g:5989:2: ( ruleOperator )
            {
            // InternalMontiArcDSL.g:5989:2: ( ruleOperator )
            // InternalMontiArcDSL.g:5990:3: ruleOperator
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
    // InternalMontiArcDSL.g:5999:1: rule__BinaryExpression__Literal2Assignment_2 : ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) ;
    public final void rule__BinaryExpression__Literal2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6003:1: ( ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) )
            // InternalMontiArcDSL.g:6004:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            {
            // InternalMontiArcDSL.g:6004:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            // InternalMontiArcDSL.g:6005:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 
            // InternalMontiArcDSL.g:6006:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            // InternalMontiArcDSL.g:6006:4: rule__BinaryExpression__Literal2Alternatives_2_0
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
    // InternalMontiArcDSL.g:6014:1: rule__Arguments__ArgumentsAssignment_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6018:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:6019:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:6019:2: ( ruleArgument )
            // InternalMontiArcDSL.g:6020:3: ruleArgument
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
    // InternalMontiArcDSL.g:6029:1: rule__Arguments__ArgumentsAssignment_2_1 : ( ruleArgument ) ;
    public final void rule__Arguments__ArgumentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6033:1: ( ( ruleArgument ) )
            // InternalMontiArcDSL.g:6034:2: ( ruleArgument )
            {
            // InternalMontiArcDSL.g:6034:2: ( ruleArgument )
            // InternalMontiArcDSL.g:6035:3: ruleArgument
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
    // InternalMontiArcDSL.g:6044:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6048:1: ( ( RULE_ID ) )
            // InternalMontiArcDSL.g:6049:2: ( RULE_ID )
            {
            // InternalMontiArcDSL.g:6049:2: ( RULE_ID )
            // InternalMontiArcDSL.g:6050:3: RULE_ID
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
    // InternalMontiArcDSL.g:6059:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiArcDSL.g:6063:1: ( ( ruleExpression ) )
            // InternalMontiArcDSL.g:6064:2: ( ruleExpression )
            {
            // InternalMontiArcDSL.g:6064:2: ( ruleExpression )
            // InternalMontiArcDSL.g:6065:3: ruleExpression
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
    static final String dfa_3s = "\3\67\1\uffff\1\4\1\70\1\uffff";
    static final String dfa_4s = "\3\uffff\1\1\2\uffff\1\2";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\11\uffff\1\3\12\uffff\1\4",
            "\1\1\1\2\11\uffff\1\3\12\uffff\1\4",
            "\1\1\1\2\11\uffff\1\3\12\uffff\1\4",
            "",
            "\1\5",
            "\1\3\6\uffff\1\6",
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
            return "1226:1: rule__State__Alternatives : ( ( ruleSCState ) | ( ruleInvState ) );";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\uffff\10\13\4\uffff";
    static final String dfa_9s = "\1\16\10\4\4\uffff";
    static final String dfa_10s = "\1\40\10\70\4\uffff";
    static final String dfa_11s = "\11\uffff\1\3\1\4\1\1\1\2";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
            "\2\13\35\uffff\1\13\10\uffff\1\13\2\uffff\1\13\1\uffff\1\13\2\uffff\1\13\3\uffff\1\14",
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
            return "1289:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0400080000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00004001FFFFC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x04482801FFFFC070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x04480801FFFFC072L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001FFFFC000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000330L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x3000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001FFFFC010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0012000000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0020800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x04480801FFFFC070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0080300600000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0080100600000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0080100600000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0106020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000330L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000332L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000007F800000000L});

}