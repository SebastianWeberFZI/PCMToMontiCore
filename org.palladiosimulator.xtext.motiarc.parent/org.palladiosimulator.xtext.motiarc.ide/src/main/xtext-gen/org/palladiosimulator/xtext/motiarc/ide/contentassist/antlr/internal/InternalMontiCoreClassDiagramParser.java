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
import org.palladiosimulator.xtext.motiarc.services.MontiCoreClassDiagramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiCoreClassDiagramParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_ID", "RULE_DOTSTAR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'>'", "'<'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'", "'classdiagram'", "'{'", "'}'", "'class'", "'extends'", "'implements'", "','", "'enum'", "';'", "'import'", "'package'", "'['", "']'", "'public'"
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
    public static final int T__52=52;
    public static final int T__53=53;
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
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_DOTSTAR=6;
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


        public InternalMontiCoreClassDiagramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMontiCoreClassDiagramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMontiCoreClassDiagramParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMontiCoreClassDiagram.g"; }


    	private MontiCoreClassDiagramGrammarAccess grammarAccess;

    	public void setGrammarAccess(MontiCoreClassDiagramGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleClassDiagramCompilationUnit"
    // InternalMontiCoreClassDiagram.g:53:1: entryRuleClassDiagramCompilationUnit : ruleClassDiagramCompilationUnit EOF ;
    public final void entryRuleClassDiagramCompilationUnit() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:54:1: ( ruleClassDiagramCompilationUnit EOF )
            // InternalMontiCoreClassDiagram.g:55:1: ruleClassDiagramCompilationUnit EOF
            {
             before(grammarAccess.getClassDiagramCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDiagramCompilationUnit();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitRule()); 
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
    // $ANTLR end "entryRuleClassDiagramCompilationUnit"


    // $ANTLR start "ruleClassDiagramCompilationUnit"
    // InternalMontiCoreClassDiagram.g:62:1: ruleClassDiagramCompilationUnit : ( ( rule__ClassDiagramCompilationUnit__Group__0 ) ) ;
    public final void ruleClassDiagramCompilationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:66:2: ( ( ( rule__ClassDiagramCompilationUnit__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:67:2: ( ( rule__ClassDiagramCompilationUnit__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:67:2: ( ( rule__ClassDiagramCompilationUnit__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:68:3: ( rule__ClassDiagramCompilationUnit__Group__0 )
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:69:3: ( rule__ClassDiagramCompilationUnit__Group__0 )
            // InternalMontiCoreClassDiagram.g:69:4: rule__ClassDiagramCompilationUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDiagramCompilationUnit"


    // $ANTLR start "entryRuleClassDiagram"
    // InternalMontiCoreClassDiagram.g:78:1: entryRuleClassDiagram : ruleClassDiagram EOF ;
    public final void entryRuleClassDiagram() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:79:1: ( ruleClassDiagram EOF )
            // InternalMontiCoreClassDiagram.g:80:1: ruleClassDiagram EOF
            {
             before(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramRule()); 
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
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalMontiCoreClassDiagram.g:87:1: ruleClassDiagram : ( ( rule__ClassDiagram__Group__0 ) ) ;
    public final void ruleClassDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:91:2: ( ( ( rule__ClassDiagram__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:92:2: ( ( rule__ClassDiagram__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:92:2: ( ( rule__ClassDiagram__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:93:3: ( rule__ClassDiagram__Group__0 )
            {
             before(grammarAccess.getClassDiagramAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:94:3: ( rule__ClassDiagram__Group__0 )
            // InternalMontiCoreClassDiagram.g:94:4: rule__ClassDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleCDDefinition"
    // InternalMontiCoreClassDiagram.g:103:1: entryRuleCDDefinition : ruleCDDefinition EOF ;
    public final void entryRuleCDDefinition() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:104:1: ( ruleCDDefinition EOF )
            // InternalMontiCoreClassDiagram.g:105:1: ruleCDDefinition EOF
            {
             before(grammarAccess.getCDDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCDDefinition();

            state._fsp--;

             after(grammarAccess.getCDDefinitionRule()); 
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
    // $ANTLR end "entryRuleCDDefinition"


    // $ANTLR start "ruleCDDefinition"
    // InternalMontiCoreClassDiagram.g:112:1: ruleCDDefinition : ( ( rule__CDDefinition__Alternatives ) ) ;
    public final void ruleCDDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:116:2: ( ( ( rule__CDDefinition__Alternatives ) ) )
            // InternalMontiCoreClassDiagram.g:117:2: ( ( rule__CDDefinition__Alternatives ) )
            {
            // InternalMontiCoreClassDiagram.g:117:2: ( ( rule__CDDefinition__Alternatives ) )
            // InternalMontiCoreClassDiagram.g:118:3: ( rule__CDDefinition__Alternatives )
            {
             before(grammarAccess.getCDDefinitionAccess().getAlternatives()); 
            // InternalMontiCoreClassDiagram.g:119:3: ( rule__CDDefinition__Alternatives )
            // InternalMontiCoreClassDiagram.g:119:4: rule__CDDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CDDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCDDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCDDefinition"


    // $ANTLR start "entryRuleCDClass"
    // InternalMontiCoreClassDiagram.g:128:1: entryRuleCDClass : ruleCDClass EOF ;
    public final void entryRuleCDClass() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:129:1: ( ruleCDClass EOF )
            // InternalMontiCoreClassDiagram.g:130:1: ruleCDClass EOF
            {
             before(grammarAccess.getCDClassRule()); 
            pushFollow(FOLLOW_1);
            ruleCDClass();

            state._fsp--;

             after(grammarAccess.getCDClassRule()); 
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
    // $ANTLR end "entryRuleCDClass"


    // $ANTLR start "ruleCDClass"
    // InternalMontiCoreClassDiagram.g:137:1: ruleCDClass : ( ( rule__CDClass__Group__0 ) ) ;
    public final void ruleCDClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:141:2: ( ( ( rule__CDClass__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:142:2: ( ( rule__CDClass__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:142:2: ( ( rule__CDClass__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:143:3: ( rule__CDClass__Group__0 )
            {
             before(grammarAccess.getCDClassAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:144:3: ( rule__CDClass__Group__0 )
            // InternalMontiCoreClassDiagram.g:144:4: rule__CDClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCDClass"


    // $ANTLR start "entryRuleCDEnum"
    // InternalMontiCoreClassDiagram.g:153:1: entryRuleCDEnum : ruleCDEnum EOF ;
    public final void entryRuleCDEnum() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:154:1: ( ruleCDEnum EOF )
            // InternalMontiCoreClassDiagram.g:155:1: ruleCDEnum EOF
            {
             before(grammarAccess.getCDEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleCDEnum();

            state._fsp--;

             after(grammarAccess.getCDEnumRule()); 
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
    // $ANTLR end "entryRuleCDEnum"


    // $ANTLR start "ruleCDEnum"
    // InternalMontiCoreClassDiagram.g:162:1: ruleCDEnum : ( ( rule__CDEnum__Group__0 ) ) ;
    public final void ruleCDEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:166:2: ( ( ( rule__CDEnum__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:167:2: ( ( rule__CDEnum__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:167:2: ( ( rule__CDEnum__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:168:3: ( rule__CDEnum__Group__0 )
            {
             before(grammarAccess.getCDEnumAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:169:3: ( rule__CDEnum__Group__0 )
            // InternalMontiCoreClassDiagram.g:169:4: rule__CDEnum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCDEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCDEnum"


    // $ANTLR start "entryRuleMember"
    // InternalMontiCoreClassDiagram.g:178:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:179:1: ( ruleMember EOF )
            // InternalMontiCoreClassDiagram.g:180:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMontiCoreClassDiagram.g:187:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:191:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:192:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:192:2: ( ( rule__Member__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:193:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:194:3: ( rule__Member__Group__0 )
            // InternalMontiCoreClassDiagram.g:194:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiCoreClassDiagram.g:203:1: entryRuleImportStatements : ruleImportStatements EOF ;
    public final void entryRuleImportStatements() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:204:1: ( ruleImportStatements EOF )
            // InternalMontiCoreClassDiagram.g:205:1: ruleImportStatements EOF
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
    // InternalMontiCoreClassDiagram.g:212:1: ruleImportStatements : ( ( rule__ImportStatements__Group__0 ) ) ;
    public final void ruleImportStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:216:2: ( ( ( rule__ImportStatements__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:217:2: ( ( rule__ImportStatements__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:217:2: ( ( rule__ImportStatements__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:218:3: ( rule__ImportStatements__Group__0 )
            {
             before(grammarAccess.getImportStatementsAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:219:3: ( rule__ImportStatements__Group__0 )
            // InternalMontiCoreClassDiagram.g:219:4: rule__ImportStatements__Group__0
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
    // InternalMontiCoreClassDiagram.g:228:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:229:1: ( rulePackage EOF )
            // InternalMontiCoreClassDiagram.g:230:1: rulePackage EOF
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
    // InternalMontiCoreClassDiagram.g:237:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:241:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:242:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:242:2: ( ( rule__Package__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:243:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:244:3: ( rule__Package__Group__0 )
            // InternalMontiCoreClassDiagram.g:244:4: rule__Package__Group__0
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
    // InternalMontiCoreClassDiagram.g:253:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:254:1: ( ruleType EOF )
            // InternalMontiCoreClassDiagram.g:255:1: ruleType EOF
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
    // InternalMontiCoreClassDiagram.g:262:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:266:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMontiCoreClassDiagram.g:267:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMontiCoreClassDiagram.g:267:2: ( ( rule__Type__Alternatives ) )
            // InternalMontiCoreClassDiagram.g:268:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMontiCoreClassDiagram.g:269:3: ( rule__Type__Alternatives )
            // InternalMontiCoreClassDiagram.g:269:4: rule__Type__Alternatives
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
    // InternalMontiCoreClassDiagram.g:278:1: entryRuleMCPrimitiveType : ruleMCPrimitiveType EOF ;
    public final void entryRuleMCPrimitiveType() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:279:1: ( ruleMCPrimitiveType EOF )
            // InternalMontiCoreClassDiagram.g:280:1: ruleMCPrimitiveType EOF
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
    // InternalMontiCoreClassDiagram.g:287:1: ruleMCPrimitiveType : ( ( rule__MCPrimitiveType__TypeAssignment ) ) ;
    public final void ruleMCPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:291:2: ( ( ( rule__MCPrimitiveType__TypeAssignment ) ) )
            // InternalMontiCoreClassDiagram.g:292:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            {
            // InternalMontiCoreClassDiagram.g:292:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            // InternalMontiCoreClassDiagram.g:293:3: ( rule__MCPrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalMontiCoreClassDiagram.g:294:3: ( rule__MCPrimitiveType__TypeAssignment )
            // InternalMontiCoreClassDiagram.g:294:4: rule__MCPrimitiveType__TypeAssignment
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
    // InternalMontiCoreClassDiagram.g:303:1: entryRuleMCObjectType : ruleMCObjectType EOF ;
    public final void entryRuleMCObjectType() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:304:1: ( ruleMCObjectType EOF )
            // InternalMontiCoreClassDiagram.g:305:1: ruleMCObjectType EOF
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
    // InternalMontiCoreClassDiagram.g:312:1: ruleMCObjectType : ( ( rule__MCObjectType__TypeAssignment ) ) ;
    public final void ruleMCObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:316:2: ( ( ( rule__MCObjectType__TypeAssignment ) ) )
            // InternalMontiCoreClassDiagram.g:317:2: ( ( rule__MCObjectType__TypeAssignment ) )
            {
            // InternalMontiCoreClassDiagram.g:317:2: ( ( rule__MCObjectType__TypeAssignment ) )
            // InternalMontiCoreClassDiagram.g:318:3: ( rule__MCObjectType__TypeAssignment )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 
            // InternalMontiCoreClassDiagram.g:319:3: ( rule__MCObjectType__TypeAssignment )
            // InternalMontiCoreClassDiagram.g:319:4: rule__MCObjectType__TypeAssignment
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
    // InternalMontiCoreClassDiagram.g:328:1: entryRuleMCCollectionType : ruleMCCollectionType EOF ;
    public final void entryRuleMCCollectionType() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:329:1: ( ruleMCCollectionType EOF )
            // InternalMontiCoreClassDiagram.g:330:1: ruleMCCollectionType EOF
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
    // InternalMontiCoreClassDiagram.g:337:1: ruleMCCollectionType : ( ( rule__MCCollectionType__Group__0 ) ) ;
    public final void ruleMCCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:341:2: ( ( ( rule__MCCollectionType__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:342:2: ( ( rule__MCCollectionType__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:342:2: ( ( rule__MCCollectionType__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:343:3: ( rule__MCCollectionType__Group__0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:344:3: ( rule__MCCollectionType__Group__0 )
            // InternalMontiCoreClassDiagram.g:344:4: rule__MCCollectionType__Group__0
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
    // InternalMontiCoreClassDiagram.g:353:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:354:1: ( ruleMCArrayType EOF )
            // InternalMontiCoreClassDiagram.g:355:1: ruleMCArrayType EOF
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
    // InternalMontiCoreClassDiagram.g:362:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:366:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:367:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:367:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:368:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:369:3: ( rule__MCArrayType__Group__0 )
            // InternalMontiCoreClassDiagram.g:369:4: rule__MCArrayType__Group__0
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
    // InternalMontiCoreClassDiagram.g:378:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:379:1: ( ruleExpression EOF )
            // InternalMontiCoreClassDiagram.g:380:1: ruleExpression EOF
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
    // InternalMontiCoreClassDiagram.g:387:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:391:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMontiCoreClassDiagram.g:392:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMontiCoreClassDiagram.g:392:2: ( ( rule__Expression__Alternatives ) )
            // InternalMontiCoreClassDiagram.g:393:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMontiCoreClassDiagram.g:394:3: ( rule__Expression__Alternatives )
            // InternalMontiCoreClassDiagram.g:394:4: rule__Expression__Alternatives
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
    // InternalMontiCoreClassDiagram.g:403:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:404:1: ( ruleLiteralExpression EOF )
            // InternalMontiCoreClassDiagram.g:405:1: ruleLiteralExpression EOF
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
    // InternalMontiCoreClassDiagram.g:412:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:416:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMontiCoreClassDiagram.g:417:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMontiCoreClassDiagram.g:417:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMontiCoreClassDiagram.g:418:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMontiCoreClassDiagram.g:419:3: ( rule__LiteralExpression__Alternatives )
            // InternalMontiCoreClassDiagram.g:419:4: rule__LiteralExpression__Alternatives
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
    // InternalMontiCoreClassDiagram.g:428:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:429:1: ( ruleNumberLiteral EOF )
            // InternalMontiCoreClassDiagram.g:430:1: ruleNumberLiteral EOF
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
    // InternalMontiCoreClassDiagram.g:437:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:441:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMontiCoreClassDiagram.g:442:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMontiCoreClassDiagram.g:442:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMontiCoreClassDiagram.g:443:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMontiCoreClassDiagram.g:444:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMontiCoreClassDiagram.g:444:4: rule__NumberLiteral__LiteralAssignment
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
    // InternalMontiCoreClassDiagram.g:453:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:454:1: ( ruleStringLiteral EOF )
            // InternalMontiCoreClassDiagram.g:455:1: ruleStringLiteral EOF
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
    // InternalMontiCoreClassDiagram.g:462:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:466:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMontiCoreClassDiagram.g:467:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMontiCoreClassDiagram.g:467:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMontiCoreClassDiagram.g:468:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMontiCoreClassDiagram.g:469:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMontiCoreClassDiagram.g:469:4: rule__StringLiteral__LiteralAssignment
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
    // InternalMontiCoreClassDiagram.g:478:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:479:1: ( ruleNameExpression EOF )
            // InternalMontiCoreClassDiagram.g:480:1: ruleNameExpression EOF
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
    // InternalMontiCoreClassDiagram.g:487:1: ruleNameExpression : ( ( rule__NameExpression__Alternatives ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:491:2: ( ( ( rule__NameExpression__Alternatives ) ) )
            // InternalMontiCoreClassDiagram.g:492:2: ( ( rule__NameExpression__Alternatives ) )
            {
            // InternalMontiCoreClassDiagram.g:492:2: ( ( rule__NameExpression__Alternatives ) )
            // InternalMontiCoreClassDiagram.g:493:3: ( rule__NameExpression__Alternatives )
            {
             before(grammarAccess.getNameExpressionAccess().getAlternatives()); 
            // InternalMontiCoreClassDiagram.g:494:3: ( rule__NameExpression__Alternatives )
            // InternalMontiCoreClassDiagram.g:494:4: rule__NameExpression__Alternatives
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
    // InternalMontiCoreClassDiagram.g:503:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:504:1: ( ruleBinaryExpression EOF )
            // InternalMontiCoreClassDiagram.g:505:1: ruleBinaryExpression EOF
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
    // InternalMontiCoreClassDiagram.g:512:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:516:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:517:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:517:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:518:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:519:3: ( rule__BinaryExpression__Group__0 )
            // InternalMontiCoreClassDiagram.g:519:4: rule__BinaryExpression__Group__0
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


    // $ANTLR start "entryRuleArgument"
    // InternalMontiCoreClassDiagram.g:528:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMontiCoreClassDiagram.g:529:1: ( ruleArgument EOF )
            // InternalMontiCoreClassDiagram.g:530:1: ruleArgument EOF
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
    // InternalMontiCoreClassDiagram.g:537:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:541:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMontiCoreClassDiagram.g:542:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMontiCoreClassDiagram.g:542:2: ( ( rule__Argument__Group__0 ) )
            // InternalMontiCoreClassDiagram.g:543:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMontiCoreClassDiagram.g:544:3: ( rule__Argument__Group__0 )
            // InternalMontiCoreClassDiagram.g:544:4: rule__Argument__Group__0
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


    // $ANTLR start "ruleOperator"
    // InternalMontiCoreClassDiagram.g:553:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:557:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMontiCoreClassDiagram.g:558:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMontiCoreClassDiagram.g:558:2: ( ( rule__Operator__Alternatives ) )
            // InternalMontiCoreClassDiagram.g:559:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMontiCoreClassDiagram.g:560:3: ( rule__Operator__Alternatives )
            // InternalMontiCoreClassDiagram.g:560:4: rule__Operator__Alternatives
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


    // $ANTLR start "rule__CDDefinition__Alternatives"
    // InternalMontiCoreClassDiagram.g:568:1: rule__CDDefinition__Alternatives : ( ( ruleCDClass ) | ( ruleCDEnum ) );
    public final void rule__CDDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:572:1: ( ( ruleCDClass ) | ( ruleCDEnum ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==47) ) {
                    alt1=2;
                }
                else if ( (LA1_1==43) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt1=1;
                }
                break;
            case 47:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:573:2: ( ruleCDClass )
                    {
                    // InternalMontiCoreClassDiagram.g:573:2: ( ruleCDClass )
                    // InternalMontiCoreClassDiagram.g:574:3: ruleCDClass
                    {
                     before(grammarAccess.getCDDefinitionAccess().getCDClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCDClass();

                    state._fsp--;

                     after(grammarAccess.getCDDefinitionAccess().getCDClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:579:2: ( ruleCDEnum )
                    {
                    // InternalMontiCoreClassDiagram.g:579:2: ( ruleCDEnum )
                    // InternalMontiCoreClassDiagram.g:580:3: ruleCDEnum
                    {
                     before(grammarAccess.getCDDefinitionAccess().getCDEnumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCDEnum();

                    state._fsp--;

                     after(grammarAccess.getCDDefinitionAccess().getCDEnumParserRuleCall_1()); 

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
    // $ANTLR end "rule__CDDefinition__Alternatives"


    // $ANTLR start "rule__Member__TypeAlternatives_0_0"
    // InternalMontiCoreClassDiagram.g:589:1: rule__Member__TypeAlternatives_0_0 : ( ( ruleType ) | ( ruleCDDefinition ) );
    public final void rule__Member__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:593:1: ( ( ruleType ) | ( ruleCDDefinition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=31)) ) {
                alt2=1;
            }
            else if ( (LA2_0==43||LA2_0==47||LA2_0==53) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:594:2: ( ruleType )
                    {
                    // InternalMontiCoreClassDiagram.g:594:2: ( ruleType )
                    // InternalMontiCoreClassDiagram.g:595:3: ruleType
                    {
                     before(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:600:2: ( ruleCDDefinition )
                    {
                    // InternalMontiCoreClassDiagram.g:600:2: ( ruleCDDefinition )
                    // InternalMontiCoreClassDiagram.g:601:3: ruleCDDefinition
                    {
                     before(grammarAccess.getMemberAccess().getTypeCDDefinitionParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCDDefinition();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getTypeCDDefinitionParserRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Member__TypeAlternatives_0_0"


    // $ANTLR start "rule__Package__NameAlternatives_1_0"
    // InternalMontiCoreClassDiagram.g:610:1: rule__Package__NameAlternatives_1_0 : ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) );
    public final void rule__Package__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:614:1: ( ( RULE_MCQUALIFIEDNAME ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_MCQUALIFIEDNAME) ) {
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
                    // InternalMontiCoreClassDiagram.g:615:2: ( RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiCoreClassDiagram.g:615:2: ( RULE_MCQUALIFIEDNAME )
                    // InternalMontiCoreClassDiagram.g:616:3: RULE_MCQUALIFIEDNAME
                    {
                     before(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 
                    match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:621:2: ( RULE_ID )
                    {
                    // InternalMontiCoreClassDiagram.g:621:2: ( RULE_ID )
                    // InternalMontiCoreClassDiagram.g:622:3: RULE_ID
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
    // InternalMontiCoreClassDiagram.g:631:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:635:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:636:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMontiCoreClassDiagram.g:636:2: ( ruleMCPrimitiveType )
                    // InternalMontiCoreClassDiagram.g:637:3: ruleMCPrimitiveType
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
                    // InternalMontiCoreClassDiagram.g:642:2: ( ruleMCArrayType )
                    {
                    // InternalMontiCoreClassDiagram.g:642:2: ( ruleMCArrayType )
                    // InternalMontiCoreClassDiagram.g:643:3: ruleMCArrayType
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
                    // InternalMontiCoreClassDiagram.g:648:2: ( ruleMCObjectType )
                    {
                    // InternalMontiCoreClassDiagram.g:648:2: ( ruleMCObjectType )
                    // InternalMontiCoreClassDiagram.g:649:3: ruleMCObjectType
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
                    // InternalMontiCoreClassDiagram.g:654:2: ( ruleMCCollectionType )
                    {
                    // InternalMontiCoreClassDiagram.g:654:2: ( ruleMCCollectionType )
                    // InternalMontiCoreClassDiagram.g:655:3: ruleMCCollectionType
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
    // InternalMontiCoreClassDiagram.g:664:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:668:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            case 20:
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
                    // InternalMontiCoreClassDiagram.g:669:2: ( 'boolean' )
                    {
                    // InternalMontiCoreClassDiagram.g:669:2: ( 'boolean' )
                    // InternalMontiCoreClassDiagram.g:670:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:675:2: ( 'byte' )
                    {
                    // InternalMontiCoreClassDiagram.g:675:2: ( 'byte' )
                    // InternalMontiCoreClassDiagram.g:676:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:681:2: ( 'short' )
                    {
                    // InternalMontiCoreClassDiagram.g:681:2: ( 'short' )
                    // InternalMontiCoreClassDiagram.g:682:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:687:2: ( 'int' )
                    {
                    // InternalMontiCoreClassDiagram.g:687:2: ( 'int' )
                    // InternalMontiCoreClassDiagram.g:688:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiCoreClassDiagram.g:693:2: ( 'long' )
                    {
                    // InternalMontiCoreClassDiagram.g:693:2: ( 'long' )
                    // InternalMontiCoreClassDiagram.g:694:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiCoreClassDiagram.g:699:2: ( 'char' )
                    {
                    // InternalMontiCoreClassDiagram.g:699:2: ( 'char' )
                    // InternalMontiCoreClassDiagram.g:700:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiCoreClassDiagram.g:705:2: ( 'float' )
                    {
                    // InternalMontiCoreClassDiagram.g:705:2: ( 'float' )
                    // InternalMontiCoreClassDiagram.g:706:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiCoreClassDiagram.g:711:2: ( 'double' )
                    {
                    // InternalMontiCoreClassDiagram.g:711:2: ( 'double' )
                    // InternalMontiCoreClassDiagram.g:712:3: 'double'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:721:1: rule__MCObjectType__TypeAlternatives_0 : ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) );
    public final void rule__MCObjectType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:725:1: ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            case 27:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:726:2: ( 'Boolean' )
                    {
                    // InternalMontiCoreClassDiagram.g:726:2: ( 'Boolean' )
                    // InternalMontiCoreClassDiagram.g:727:3: 'Boolean'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:732:2: ( 'Byte' )
                    {
                    // InternalMontiCoreClassDiagram.g:732:2: ( 'Byte' )
                    // InternalMontiCoreClassDiagram.g:733:3: 'Byte'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:738:2: ( 'Integer' )
                    {
                    // InternalMontiCoreClassDiagram.g:738:2: ( 'Integer' )
                    // InternalMontiCoreClassDiagram.g:739:3: 'Integer'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:744:2: ( 'Long' )
                    {
                    // InternalMontiCoreClassDiagram.g:744:2: ( 'Long' )
                    // InternalMontiCoreClassDiagram.g:745:3: 'Long'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiCoreClassDiagram.g:750:2: ( 'Char' )
                    {
                    // InternalMontiCoreClassDiagram.g:750:2: ( 'Char' )
                    // InternalMontiCoreClassDiagram.g:751:3: 'Char'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiCoreClassDiagram.g:756:2: ( 'Double' )
                    {
                    // InternalMontiCoreClassDiagram.g:756:2: ( 'Double' )
                    // InternalMontiCoreClassDiagram.g:757:3: 'Double'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiCoreClassDiagram.g:762:2: ( 'String' )
                    {
                    // InternalMontiCoreClassDiagram.g:762:2: ( 'String' )
                    // InternalMontiCoreClassDiagram.g:763:3: 'String'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6()); 
                    match(input,27,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:772:1: rule__MCCollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) );
    public final void rule__MCCollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:776:1: ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
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
                    // InternalMontiCoreClassDiagram.g:777:2: ( 'Set' )
                    {
                    // InternalMontiCoreClassDiagram.g:777:2: ( 'Set' )
                    // InternalMontiCoreClassDiagram.g:778:3: 'Set'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:783:2: ( 'List' )
                    {
                    // InternalMontiCoreClassDiagram.g:783:2: ( 'List' )
                    // InternalMontiCoreClassDiagram.g:784:3: 'List'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:789:2: ( 'Map' )
                    {
                    // InternalMontiCoreClassDiagram.g:789:2: ( 'Map' )
                    // InternalMontiCoreClassDiagram.g:790:3: 'Map'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:795:2: ( 'Optional' )
                    {
                    // InternalMontiCoreClassDiagram.g:795:2: ( 'Optional' )
                    // InternalMontiCoreClassDiagram.g:796:3: 'Optional'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3()); 
                    match(input,31,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:805:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:809:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF) ) {
                    alt8=1;
                }
                else if ( ((LA8_1>=32 && LA8_1<=39)) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF) ) {
                    alt8=1;
                }
                else if ( ((LA8_2>=32 && LA8_2<=39)) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==EOF) ) {
                    alt8=2;
                }
                else if ( ((LA8_3>=32 && LA8_3<=39)) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA8_4 = input.LA(2);

                if ( (LA8_4==EOF) ) {
                    alt8=2;
                }
                else if ( ((LA8_4>=32 && LA8_4<=39)) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:810:2: ( ruleNameExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:810:2: ( ruleNameExpression )
                    // InternalMontiCoreClassDiagram.g:811:3: ruleNameExpression
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
                    // InternalMontiCoreClassDiagram.g:816:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:816:2: ( ruleLiteralExpression )
                    // InternalMontiCoreClassDiagram.g:817:3: ruleLiteralExpression
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
                    // InternalMontiCoreClassDiagram.g:822:2: ( ruleBinaryExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:822:2: ( ruleBinaryExpression )
                    // InternalMontiCoreClassDiagram.g:823:3: ruleBinaryExpression
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
    // InternalMontiCoreClassDiagram.g:832:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:836:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
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
                    // InternalMontiCoreClassDiagram.g:837:2: ( ruleNumberLiteral )
                    {
                    // InternalMontiCoreClassDiagram.g:837:2: ( ruleNumberLiteral )
                    // InternalMontiCoreClassDiagram.g:838:3: ruleNumberLiteral
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
                    // InternalMontiCoreClassDiagram.g:843:2: ( ruleStringLiteral )
                    {
                    // InternalMontiCoreClassDiagram.g:843:2: ( ruleStringLiteral )
                    // InternalMontiCoreClassDiagram.g:844:3: ruleStringLiteral
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
    // InternalMontiCoreClassDiagram.g:853:1: rule__NameExpression__Alternatives : ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) );
    public final void rule__NameExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:857:1: ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_MCQUALIFIEDNAME) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:858:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    {
                    // InternalMontiCoreClassDiagram.g:858:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    // InternalMontiCoreClassDiagram.g:859:3: ( rule__NameExpression__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 
                    // InternalMontiCoreClassDiagram.g:860:3: ( rule__NameExpression__NameAssignment_0 )
                    // InternalMontiCoreClassDiagram.g:860:4: rule__NameExpression__NameAssignment_0
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
                    // InternalMontiCoreClassDiagram.g:864:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    {
                    // InternalMontiCoreClassDiagram.g:864:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    // InternalMontiCoreClassDiagram.g:865:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 
                    // InternalMontiCoreClassDiagram.g:866:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    // InternalMontiCoreClassDiagram.g:866:4: rule__NameExpression__QualifiednameAssignment_1
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
    // InternalMontiCoreClassDiagram.g:874:1: rule__BinaryExpression__Literal1Alternatives_0_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:878:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_MCQUALIFIEDNAME && LA11_0<=RULE_ID)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:879:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:879:2: ( ruleLiteralExpression )
                    // InternalMontiCoreClassDiagram.g:880:3: ruleLiteralExpression
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
                    // InternalMontiCoreClassDiagram.g:885:2: ( ruleNameExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:885:2: ( ruleNameExpression )
                    // InternalMontiCoreClassDiagram.g:886:3: ruleNameExpression
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
    // InternalMontiCoreClassDiagram.g:895:1: rule__BinaryExpression__Literal2Alternatives_2_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal2Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:899:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_MCQUALIFIEDNAME && LA12_0<=RULE_ID)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:900:2: ( ruleLiteralExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:900:2: ( ruleLiteralExpression )
                    // InternalMontiCoreClassDiagram.g:901:3: ruleLiteralExpression
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
                    // InternalMontiCoreClassDiagram.g:906:2: ( ruleNameExpression )
                    {
                    // InternalMontiCoreClassDiagram.g:906:2: ( ruleNameExpression )
                    // InternalMontiCoreClassDiagram.g:907:3: ruleNameExpression
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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMontiCoreClassDiagram.g:916:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:920:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            case 35:
                {
                alt13=4;
                }
                break;
            case 36:
                {
                alt13=5;
                }
                break;
            case 37:
                {
                alt13=6;
                }
                break;
            case 38:
                {
                alt13=7;
                }
                break;
            case 39:
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
                    // InternalMontiCoreClassDiagram.g:921:2: ( ( '>' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:921:2: ( ( '>' ) )
                    // InternalMontiCoreClassDiagram.g:922:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalMontiCoreClassDiagram.g:923:3: ( '>' )
                    // InternalMontiCoreClassDiagram.g:923:4: '>'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:927:2: ( ( '<' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:927:2: ( ( '<' ) )
                    // InternalMontiCoreClassDiagram.g:928:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    // InternalMontiCoreClassDiagram.g:929:3: ( '<' )
                    // InternalMontiCoreClassDiagram.g:929:4: '<'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:933:2: ( ( '==' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:933:2: ( ( '==' ) )
                    // InternalMontiCoreClassDiagram.g:934:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalMontiCoreClassDiagram.g:935:3: ( '==' )
                    // InternalMontiCoreClassDiagram.g:935:4: '=='
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:939:2: ( ( '&&' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:939:2: ( ( '&&' ) )
                    // InternalMontiCoreClassDiagram.g:940:3: ( '&&' )
                    {
                     before(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 
                    // InternalMontiCoreClassDiagram.g:941:3: ( '&&' )
                    // InternalMontiCoreClassDiagram.g:941:4: '&&'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiCoreClassDiagram.g:945:2: ( ( '+' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:945:2: ( ( '+' ) )
                    // InternalMontiCoreClassDiagram.g:946:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 
                    // InternalMontiCoreClassDiagram.g:947:3: ( '+' )
                    // InternalMontiCoreClassDiagram.g:947:4: '+'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiCoreClassDiagram.g:951:2: ( ( '-' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:951:2: ( ( '-' ) )
                    // InternalMontiCoreClassDiagram.g:952:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 
                    // InternalMontiCoreClassDiagram.g:953:3: ( '-' )
                    // InternalMontiCoreClassDiagram.g:953:4: '-'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiCoreClassDiagram.g:957:2: ( ( '/' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:957:2: ( ( '/' ) )
                    // InternalMontiCoreClassDiagram.g:958:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 
                    // InternalMontiCoreClassDiagram.g:959:3: ( '/' )
                    // InternalMontiCoreClassDiagram.g:959:4: '/'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiCoreClassDiagram.g:963:2: ( ( '*' ) )
                    {
                    // InternalMontiCoreClassDiagram.g:963:2: ( ( '*' ) )
                    // InternalMontiCoreClassDiagram.g:964:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 
                    // InternalMontiCoreClassDiagram.g:965:3: ( '*' )
                    // InternalMontiCoreClassDiagram.g:965:4: '*'
                    {
                    match(input,39,FOLLOW_2); 

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


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__0"
    // InternalMontiCoreClassDiagram.g:973:1: rule__ClassDiagramCompilationUnit__Group__0 : rule__ClassDiagramCompilationUnit__Group__0__Impl rule__ClassDiagramCompilationUnit__Group__1 ;
    public final void rule__ClassDiagramCompilationUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:977:1: ( rule__ClassDiagramCompilationUnit__Group__0__Impl rule__ClassDiagramCompilationUnit__Group__1 )
            // InternalMontiCoreClassDiagram.g:978:2: rule__ClassDiagramCompilationUnit__Group__0__Impl rule__ClassDiagramCompilationUnit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDiagramCompilationUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__0"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__0__Impl"
    // InternalMontiCoreClassDiagram.g:985:1: rule__ClassDiagramCompilationUnit__Group__0__Impl : ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) ) ;
    public final void rule__ClassDiagramCompilationUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:989:1: ( ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) ) )
            // InternalMontiCoreClassDiagram.g:990:1: ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:990:1: ( ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 ) )
            // InternalMontiCoreClassDiagram.g:991:2: ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 )
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getPackageAssignment_0()); 
            // InternalMontiCoreClassDiagram.g:992:2: ( rule__ClassDiagramCompilationUnit__PackageAssignment_0 )
            // InternalMontiCoreClassDiagram.g:992:3: rule__ClassDiagramCompilationUnit__PackageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__PackageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__0__Impl"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__1"
    // InternalMontiCoreClassDiagram.g:1000:1: rule__ClassDiagramCompilationUnit__Group__1 : rule__ClassDiagramCompilationUnit__Group__1__Impl rule__ClassDiagramCompilationUnit__Group__2 ;
    public final void rule__ClassDiagramCompilationUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1004:1: ( rule__ClassDiagramCompilationUnit__Group__1__Impl rule__ClassDiagramCompilationUnit__Group__2 )
            // InternalMontiCoreClassDiagram.g:1005:2: rule__ClassDiagramCompilationUnit__Group__1__Impl rule__ClassDiagramCompilationUnit__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassDiagramCompilationUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__1"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__1__Impl"
    // InternalMontiCoreClassDiagram.g:1012:1: rule__ClassDiagramCompilationUnit__Group__1__Impl : ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* ) ;
    public final void rule__ClassDiagramCompilationUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1016:1: ( ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* ) )
            // InternalMontiCoreClassDiagram.g:1017:1: ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* )
            {
            // InternalMontiCoreClassDiagram.g:1017:1: ( ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )* )
            // InternalMontiCoreClassDiagram.g:1018:2: ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )*
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:1019:2: ( rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==49) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:1019:3: rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__2"
    // InternalMontiCoreClassDiagram.g:1027:1: rule__ClassDiagramCompilationUnit__Group__2 : rule__ClassDiagramCompilationUnit__Group__2__Impl ;
    public final void rule__ClassDiagramCompilationUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1031:1: ( rule__ClassDiagramCompilationUnit__Group__2__Impl )
            // InternalMontiCoreClassDiagram.g:1032:2: rule__ClassDiagramCompilationUnit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__2"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__Group__2__Impl"
    // InternalMontiCoreClassDiagram.g:1038:1: rule__ClassDiagramCompilationUnit__Group__2__Impl : ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) ) ;
    public final void rule__ClassDiagramCompilationUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1042:1: ( ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) ) )
            // InternalMontiCoreClassDiagram.g:1043:1: ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) )
            {
            // InternalMontiCoreClassDiagram.g:1043:1: ( ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 ) )
            // InternalMontiCoreClassDiagram.g:1044:2: ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 )
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramAssignment_2()); 
            // InternalMontiCoreClassDiagram.g:1045:2: ( rule__ClassDiagramCompilationUnit__DiagramAssignment_2 )
            // InternalMontiCoreClassDiagram.g:1045:3: rule__ClassDiagramCompilationUnit__DiagramAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagramCompilationUnit__DiagramAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__0"
    // InternalMontiCoreClassDiagram.g:1054:1: rule__ClassDiagram__Group__0 : rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 ;
    public final void rule__ClassDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1058:1: ( rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1 )
            // InternalMontiCoreClassDiagram.g:1059:2: rule__ClassDiagram__Group__0__Impl rule__ClassDiagram__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ClassDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__0"


    // $ANTLR start "rule__ClassDiagram__Group__0__Impl"
    // InternalMontiCoreClassDiagram.g:1066:1: rule__ClassDiagram__Group__0__Impl : ( 'classdiagram' ) ;
    public final void rule__ClassDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1070:1: ( ( 'classdiagram' ) )
            // InternalMontiCoreClassDiagram.g:1071:1: ( 'classdiagram' )
            {
            // InternalMontiCoreClassDiagram.g:1071:1: ( 'classdiagram' )
            // InternalMontiCoreClassDiagram.g:1072:2: 'classdiagram'
            {
             before(grammarAccess.getClassDiagramAccess().getClassdiagramKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getClassdiagramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__0__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__1"
    // InternalMontiCoreClassDiagram.g:1081:1: rule__ClassDiagram__Group__1 : rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 ;
    public final void rule__ClassDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1085:1: ( rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2 )
            // InternalMontiCoreClassDiagram.g:1086:2: rule__ClassDiagram__Group__1__Impl rule__ClassDiagram__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ClassDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__1"


    // $ANTLR start "rule__ClassDiagram__Group__1__Impl"
    // InternalMontiCoreClassDiagram.g:1093:1: rule__ClassDiagram__Group__1__Impl : ( ( rule__ClassDiagram__NameAssignment_1 ) ) ;
    public final void rule__ClassDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1097:1: ( ( ( rule__ClassDiagram__NameAssignment_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1098:1: ( ( rule__ClassDiagram__NameAssignment_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1098:1: ( ( rule__ClassDiagram__NameAssignment_1 ) )
            // InternalMontiCoreClassDiagram.g:1099:2: ( rule__ClassDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getClassDiagramAccess().getNameAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:1100:2: ( rule__ClassDiagram__NameAssignment_1 )
            // InternalMontiCoreClassDiagram.g:1100:3: rule__ClassDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDiagramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__1__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__2"
    // InternalMontiCoreClassDiagram.g:1108:1: rule__ClassDiagram__Group__2 : rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 ;
    public final void rule__ClassDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1112:1: ( rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3 )
            // InternalMontiCoreClassDiagram.g:1113:2: rule__ClassDiagram__Group__2__Impl rule__ClassDiagram__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ClassDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__2"


    // $ANTLR start "rule__ClassDiagram__Group__2__Impl"
    // InternalMontiCoreClassDiagram.g:1120:1: rule__ClassDiagram__Group__2__Impl : ( '{' ) ;
    public final void rule__ClassDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1124:1: ( ( '{' ) )
            // InternalMontiCoreClassDiagram.g:1125:1: ( '{' )
            {
            // InternalMontiCoreClassDiagram.g:1125:1: ( '{' )
            // InternalMontiCoreClassDiagram.g:1126:2: '{'
            {
             before(grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__2__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__3"
    // InternalMontiCoreClassDiagram.g:1135:1: rule__ClassDiagram__Group__3 : rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 ;
    public final void rule__ClassDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1139:1: ( rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4 )
            // InternalMontiCoreClassDiagram.g:1140:2: rule__ClassDiagram__Group__3__Impl rule__ClassDiagram__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ClassDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__3"


    // $ANTLR start "rule__ClassDiagram__Group__3__Impl"
    // InternalMontiCoreClassDiagram.g:1147:1: rule__ClassDiagram__Group__3__Impl : ( ( rule__ClassDiagram__CdElementsAssignment_3 )* ) ;
    public final void rule__ClassDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1151:1: ( ( ( rule__ClassDiagram__CdElementsAssignment_3 )* ) )
            // InternalMontiCoreClassDiagram.g:1152:1: ( ( rule__ClassDiagram__CdElementsAssignment_3 )* )
            {
            // InternalMontiCoreClassDiagram.g:1152:1: ( ( rule__ClassDiagram__CdElementsAssignment_3 )* )
            // InternalMontiCoreClassDiagram.g:1153:2: ( rule__ClassDiagram__CdElementsAssignment_3 )*
            {
             before(grammarAccess.getClassDiagramAccess().getCdElementsAssignment_3()); 
            // InternalMontiCoreClassDiagram.g:1154:2: ( rule__ClassDiagram__CdElementsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==43||LA15_0==47||LA15_0==53) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:1154:3: rule__ClassDiagram__CdElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ClassDiagram__CdElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClassDiagramAccess().getCdElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__3__Impl"


    // $ANTLR start "rule__ClassDiagram__Group__4"
    // InternalMontiCoreClassDiagram.g:1162:1: rule__ClassDiagram__Group__4 : rule__ClassDiagram__Group__4__Impl ;
    public final void rule__ClassDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1166:1: ( rule__ClassDiagram__Group__4__Impl )
            // InternalMontiCoreClassDiagram.g:1167:2: rule__ClassDiagram__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDiagram__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__4"


    // $ANTLR start "rule__ClassDiagram__Group__4__Impl"
    // InternalMontiCoreClassDiagram.g:1173:1: rule__ClassDiagram__Group__4__Impl : ( '}' ) ;
    public final void rule__ClassDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1177:1: ( ( '}' ) )
            // InternalMontiCoreClassDiagram.g:1178:1: ( '}' )
            {
            // InternalMontiCoreClassDiagram.g:1178:1: ( '}' )
            // InternalMontiCoreClassDiagram.g:1179:2: '}'
            {
             before(grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__Group__4__Impl"


    // $ANTLR start "rule__CDClass__Group__0"
    // InternalMontiCoreClassDiagram.g:1189:1: rule__CDClass__Group__0 : rule__CDClass__Group__0__Impl rule__CDClass__Group__1 ;
    public final void rule__CDClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1193:1: ( rule__CDClass__Group__0__Impl rule__CDClass__Group__1 )
            // InternalMontiCoreClassDiagram.g:1194:2: rule__CDClass__Group__0__Impl rule__CDClass__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CDClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__0"


    // $ANTLR start "rule__CDClass__Group__0__Impl"
    // InternalMontiCoreClassDiagram.g:1201:1: rule__CDClass__Group__0__Impl : ( ( rule__CDClass__PublicAssignment_0 )? ) ;
    public final void rule__CDClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1205:1: ( ( ( rule__CDClass__PublicAssignment_0 )? ) )
            // InternalMontiCoreClassDiagram.g:1206:1: ( ( rule__CDClass__PublicAssignment_0 )? )
            {
            // InternalMontiCoreClassDiagram.g:1206:1: ( ( rule__CDClass__PublicAssignment_0 )? )
            // InternalMontiCoreClassDiagram.g:1207:2: ( rule__CDClass__PublicAssignment_0 )?
            {
             before(grammarAccess.getCDClassAccess().getPublicAssignment_0()); 
            // InternalMontiCoreClassDiagram.g:1208:2: ( rule__CDClass__PublicAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==53) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1208:3: rule__CDClass__PublicAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDClass__PublicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDClassAccess().getPublicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__0__Impl"


    // $ANTLR start "rule__CDClass__Group__1"
    // InternalMontiCoreClassDiagram.g:1216:1: rule__CDClass__Group__1 : rule__CDClass__Group__1__Impl rule__CDClass__Group__2 ;
    public final void rule__CDClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1220:1: ( rule__CDClass__Group__1__Impl rule__CDClass__Group__2 )
            // InternalMontiCoreClassDiagram.g:1221:2: rule__CDClass__Group__1__Impl rule__CDClass__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CDClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__1"


    // $ANTLR start "rule__CDClass__Group__1__Impl"
    // InternalMontiCoreClassDiagram.g:1228:1: rule__CDClass__Group__1__Impl : ( 'class' ) ;
    public final void rule__CDClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1232:1: ( ( 'class' ) )
            // InternalMontiCoreClassDiagram.g:1233:1: ( 'class' )
            {
            // InternalMontiCoreClassDiagram.g:1233:1: ( 'class' )
            // InternalMontiCoreClassDiagram.g:1234:2: 'class'
            {
             before(grammarAccess.getCDClassAccess().getClassKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__1__Impl"


    // $ANTLR start "rule__CDClass__Group__2"
    // InternalMontiCoreClassDiagram.g:1243:1: rule__CDClass__Group__2 : rule__CDClass__Group__2__Impl rule__CDClass__Group__3 ;
    public final void rule__CDClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1247:1: ( rule__CDClass__Group__2__Impl rule__CDClass__Group__3 )
            // InternalMontiCoreClassDiagram.g:1248:2: rule__CDClass__Group__2__Impl rule__CDClass__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__CDClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__2"


    // $ANTLR start "rule__CDClass__Group__2__Impl"
    // InternalMontiCoreClassDiagram.g:1255:1: rule__CDClass__Group__2__Impl : ( ( rule__CDClass__NameAssignment_2 ) ) ;
    public final void rule__CDClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1259:1: ( ( ( rule__CDClass__NameAssignment_2 ) ) )
            // InternalMontiCoreClassDiagram.g:1260:1: ( ( rule__CDClass__NameAssignment_2 ) )
            {
            // InternalMontiCoreClassDiagram.g:1260:1: ( ( rule__CDClass__NameAssignment_2 ) )
            // InternalMontiCoreClassDiagram.g:1261:2: ( rule__CDClass__NameAssignment_2 )
            {
             before(grammarAccess.getCDClassAccess().getNameAssignment_2()); 
            // InternalMontiCoreClassDiagram.g:1262:2: ( rule__CDClass__NameAssignment_2 )
            // InternalMontiCoreClassDiagram.g:1262:3: rule__CDClass__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__2__Impl"


    // $ANTLR start "rule__CDClass__Group__3"
    // InternalMontiCoreClassDiagram.g:1270:1: rule__CDClass__Group__3 : rule__CDClass__Group__3__Impl rule__CDClass__Group__4 ;
    public final void rule__CDClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1274:1: ( rule__CDClass__Group__3__Impl rule__CDClass__Group__4 )
            // InternalMontiCoreClassDiagram.g:1275:2: rule__CDClass__Group__3__Impl rule__CDClass__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CDClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__3"


    // $ANTLR start "rule__CDClass__Group__3__Impl"
    // InternalMontiCoreClassDiagram.g:1282:1: rule__CDClass__Group__3__Impl : ( ( rule__CDClass__Group_3__0 )? ) ;
    public final void rule__CDClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1286:1: ( ( ( rule__CDClass__Group_3__0 )? ) )
            // InternalMontiCoreClassDiagram.g:1287:1: ( ( rule__CDClass__Group_3__0 )? )
            {
            // InternalMontiCoreClassDiagram.g:1287:1: ( ( rule__CDClass__Group_3__0 )? )
            // InternalMontiCoreClassDiagram.g:1288:2: ( rule__CDClass__Group_3__0 )?
            {
             before(grammarAccess.getCDClassAccess().getGroup_3()); 
            // InternalMontiCoreClassDiagram.g:1289:2: ( rule__CDClass__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1289:3: rule__CDClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__3__Impl"


    // $ANTLR start "rule__CDClass__Group__4"
    // InternalMontiCoreClassDiagram.g:1297:1: rule__CDClass__Group__4 : rule__CDClass__Group__4__Impl rule__CDClass__Group__5 ;
    public final void rule__CDClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1301:1: ( rule__CDClass__Group__4__Impl rule__CDClass__Group__5 )
            // InternalMontiCoreClassDiagram.g:1302:2: rule__CDClass__Group__4__Impl rule__CDClass__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__CDClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__4"


    // $ANTLR start "rule__CDClass__Group__4__Impl"
    // InternalMontiCoreClassDiagram.g:1309:1: rule__CDClass__Group__4__Impl : ( ( rule__CDClass__Group_4__0 )? ) ;
    public final void rule__CDClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1313:1: ( ( ( rule__CDClass__Group_4__0 )? ) )
            // InternalMontiCoreClassDiagram.g:1314:1: ( ( rule__CDClass__Group_4__0 )? )
            {
            // InternalMontiCoreClassDiagram.g:1314:1: ( ( rule__CDClass__Group_4__0 )? )
            // InternalMontiCoreClassDiagram.g:1315:2: ( rule__CDClass__Group_4__0 )?
            {
             before(grammarAccess.getCDClassAccess().getGroup_4()); 
            // InternalMontiCoreClassDiagram.g:1316:2: ( rule__CDClass__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1316:3: rule__CDClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__4__Impl"


    // $ANTLR start "rule__CDClass__Group__5"
    // InternalMontiCoreClassDiagram.g:1324:1: rule__CDClass__Group__5 : rule__CDClass__Group__5__Impl rule__CDClass__Group__6 ;
    public final void rule__CDClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1328:1: ( rule__CDClass__Group__5__Impl rule__CDClass__Group__6 )
            // InternalMontiCoreClassDiagram.g:1329:2: rule__CDClass__Group__5__Impl rule__CDClass__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__CDClass__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__5"


    // $ANTLR start "rule__CDClass__Group__5__Impl"
    // InternalMontiCoreClassDiagram.g:1336:1: rule__CDClass__Group__5__Impl : ( '{' ) ;
    public final void rule__CDClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1340:1: ( ( '{' ) )
            // InternalMontiCoreClassDiagram.g:1341:1: ( '{' )
            {
            // InternalMontiCoreClassDiagram.g:1341:1: ( '{' )
            // InternalMontiCoreClassDiagram.g:1342:2: '{'
            {
             before(grammarAccess.getCDClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__5__Impl"


    // $ANTLR start "rule__CDClass__Group__6"
    // InternalMontiCoreClassDiagram.g:1351:1: rule__CDClass__Group__6 : rule__CDClass__Group__6__Impl rule__CDClass__Group__7 ;
    public final void rule__CDClass__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1355:1: ( rule__CDClass__Group__6__Impl rule__CDClass__Group__7 )
            // InternalMontiCoreClassDiagram.g:1356:2: rule__CDClass__Group__6__Impl rule__CDClass__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__CDClass__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__6"


    // $ANTLR start "rule__CDClass__Group__6__Impl"
    // InternalMontiCoreClassDiagram.g:1363:1: rule__CDClass__Group__6__Impl : ( ( rule__CDClass__MembersAssignment_6 ) ) ;
    public final void rule__CDClass__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1367:1: ( ( ( rule__CDClass__MembersAssignment_6 ) ) )
            // InternalMontiCoreClassDiagram.g:1368:1: ( ( rule__CDClass__MembersAssignment_6 ) )
            {
            // InternalMontiCoreClassDiagram.g:1368:1: ( ( rule__CDClass__MembersAssignment_6 ) )
            // InternalMontiCoreClassDiagram.g:1369:2: ( rule__CDClass__MembersAssignment_6 )
            {
             before(grammarAccess.getCDClassAccess().getMembersAssignment_6()); 
            // InternalMontiCoreClassDiagram.g:1370:2: ( rule__CDClass__MembersAssignment_6 )
            // InternalMontiCoreClassDiagram.g:1370:3: rule__CDClass__MembersAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__MembersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getMembersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__6__Impl"


    // $ANTLR start "rule__CDClass__Group__7"
    // InternalMontiCoreClassDiagram.g:1378:1: rule__CDClass__Group__7 : rule__CDClass__Group__7__Impl ;
    public final void rule__CDClass__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1382:1: ( rule__CDClass__Group__7__Impl )
            // InternalMontiCoreClassDiagram.g:1383:2: rule__CDClass__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__7"


    // $ANTLR start "rule__CDClass__Group__7__Impl"
    // InternalMontiCoreClassDiagram.g:1389:1: rule__CDClass__Group__7__Impl : ( '}' ) ;
    public final void rule__CDClass__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1393:1: ( ( '}' ) )
            // InternalMontiCoreClassDiagram.g:1394:1: ( '}' )
            {
            // InternalMontiCoreClassDiagram.g:1394:1: ( '}' )
            // InternalMontiCoreClassDiagram.g:1395:2: '}'
            {
             before(grammarAccess.getCDClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group__7__Impl"


    // $ANTLR start "rule__CDClass__Group_3__0"
    // InternalMontiCoreClassDiagram.g:1405:1: rule__CDClass__Group_3__0 : rule__CDClass__Group_3__0__Impl rule__CDClass__Group_3__1 ;
    public final void rule__CDClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1409:1: ( rule__CDClass__Group_3__0__Impl rule__CDClass__Group_3__1 )
            // InternalMontiCoreClassDiagram.g:1410:2: rule__CDClass__Group_3__0__Impl rule__CDClass__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__CDClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_3__0"


    // $ANTLR start "rule__CDClass__Group_3__0__Impl"
    // InternalMontiCoreClassDiagram.g:1417:1: rule__CDClass__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__CDClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1421:1: ( ( 'extends' ) )
            // InternalMontiCoreClassDiagram.g:1422:1: ( 'extends' )
            {
            // InternalMontiCoreClassDiagram.g:1422:1: ( 'extends' )
            // InternalMontiCoreClassDiagram.g:1423:2: 'extends'
            {
             before(grammarAccess.getCDClassAccess().getExtendsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_3__0__Impl"


    // $ANTLR start "rule__CDClass__Group_3__1"
    // InternalMontiCoreClassDiagram.g:1432:1: rule__CDClass__Group_3__1 : rule__CDClass__Group_3__1__Impl ;
    public final void rule__CDClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1436:1: ( rule__CDClass__Group_3__1__Impl )
            // InternalMontiCoreClassDiagram.g:1437:2: rule__CDClass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_3__1"


    // $ANTLR start "rule__CDClass__Group_3__1__Impl"
    // InternalMontiCoreClassDiagram.g:1443:1: rule__CDClass__Group_3__1__Impl : ( ( rule__CDClass__ExtendsAssignment_3_1 ) ) ;
    public final void rule__CDClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1447:1: ( ( ( rule__CDClass__ExtendsAssignment_3_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1448:1: ( ( rule__CDClass__ExtendsAssignment_3_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1448:1: ( ( rule__CDClass__ExtendsAssignment_3_1 ) )
            // InternalMontiCoreClassDiagram.g:1449:2: ( rule__CDClass__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getCDClassAccess().getExtendsAssignment_3_1()); 
            // InternalMontiCoreClassDiagram.g:1450:2: ( rule__CDClass__ExtendsAssignment_3_1 )
            // InternalMontiCoreClassDiagram.g:1450:3: rule__CDClass__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getExtendsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_3__1__Impl"


    // $ANTLR start "rule__CDClass__Group_4__0"
    // InternalMontiCoreClassDiagram.g:1459:1: rule__CDClass__Group_4__0 : rule__CDClass__Group_4__0__Impl rule__CDClass__Group_4__1 ;
    public final void rule__CDClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1463:1: ( rule__CDClass__Group_4__0__Impl rule__CDClass__Group_4__1 )
            // InternalMontiCoreClassDiagram.g:1464:2: rule__CDClass__Group_4__0__Impl rule__CDClass__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__CDClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4__0"


    // $ANTLR start "rule__CDClass__Group_4__0__Impl"
    // InternalMontiCoreClassDiagram.g:1471:1: rule__CDClass__Group_4__0__Impl : ( 'implements' ) ;
    public final void rule__CDClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1475:1: ( ( 'implements' ) )
            // InternalMontiCoreClassDiagram.g:1476:1: ( 'implements' )
            {
            // InternalMontiCoreClassDiagram.g:1476:1: ( 'implements' )
            // InternalMontiCoreClassDiagram.g:1477:2: 'implements'
            {
             before(grammarAccess.getCDClassAccess().getImplementsKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getImplementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4__0__Impl"


    // $ANTLR start "rule__CDClass__Group_4__1"
    // InternalMontiCoreClassDiagram.g:1486:1: rule__CDClass__Group_4__1 : rule__CDClass__Group_4__1__Impl rule__CDClass__Group_4__2 ;
    public final void rule__CDClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1490:1: ( rule__CDClass__Group_4__1__Impl rule__CDClass__Group_4__2 )
            // InternalMontiCoreClassDiagram.g:1491:2: rule__CDClass__Group_4__1__Impl rule__CDClass__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__CDClass__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4__1"


    // $ANTLR start "rule__CDClass__Group_4__1__Impl"
    // InternalMontiCoreClassDiagram.g:1498:1: rule__CDClass__Group_4__1__Impl : ( ( rule__CDClass__ImplementsAssignment_4_1 ) ) ;
    public final void rule__CDClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1502:1: ( ( ( rule__CDClass__ImplementsAssignment_4_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1503:1: ( ( rule__CDClass__ImplementsAssignment_4_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1503:1: ( ( rule__CDClass__ImplementsAssignment_4_1 ) )
            // InternalMontiCoreClassDiagram.g:1504:2: ( rule__CDClass__ImplementsAssignment_4_1 )
            {
             before(grammarAccess.getCDClassAccess().getImplementsAssignment_4_1()); 
            // InternalMontiCoreClassDiagram.g:1505:2: ( rule__CDClass__ImplementsAssignment_4_1 )
            // InternalMontiCoreClassDiagram.g:1505:3: rule__CDClass__ImplementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__ImplementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getImplementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4__1__Impl"


    // $ANTLR start "rule__CDClass__Group_4__2"
    // InternalMontiCoreClassDiagram.g:1513:1: rule__CDClass__Group_4__2 : rule__CDClass__Group_4__2__Impl ;
    public final void rule__CDClass__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1517:1: ( rule__CDClass__Group_4__2__Impl )
            // InternalMontiCoreClassDiagram.g:1518:2: rule__CDClass__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4__2"


    // $ANTLR start "rule__CDClass__Group_4__2__Impl"
    // InternalMontiCoreClassDiagram.g:1524:1: rule__CDClass__Group_4__2__Impl : ( ( rule__CDClass__Group_4_2__0 )* ) ;
    public final void rule__CDClass__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1528:1: ( ( ( rule__CDClass__Group_4_2__0 )* ) )
            // InternalMontiCoreClassDiagram.g:1529:1: ( ( rule__CDClass__Group_4_2__0 )* )
            {
            // InternalMontiCoreClassDiagram.g:1529:1: ( ( rule__CDClass__Group_4_2__0 )* )
            // InternalMontiCoreClassDiagram.g:1530:2: ( rule__CDClass__Group_4_2__0 )*
            {
             before(grammarAccess.getCDClassAccess().getGroup_4_2()); 
            // InternalMontiCoreClassDiagram.g:1531:2: ( rule__CDClass__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:1531:3: rule__CDClass__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__CDClass__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCDClassAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4__2__Impl"


    // $ANTLR start "rule__CDClass__Group_4_2__0"
    // InternalMontiCoreClassDiagram.g:1540:1: rule__CDClass__Group_4_2__0 : rule__CDClass__Group_4_2__0__Impl rule__CDClass__Group_4_2__1 ;
    public final void rule__CDClass__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1544:1: ( rule__CDClass__Group_4_2__0__Impl rule__CDClass__Group_4_2__1 )
            // InternalMontiCoreClassDiagram.g:1545:2: rule__CDClass__Group_4_2__0__Impl rule__CDClass__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__CDClass__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4_2__0"


    // $ANTLR start "rule__CDClass__Group_4_2__0__Impl"
    // InternalMontiCoreClassDiagram.g:1552:1: rule__CDClass__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__CDClass__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1556:1: ( ( ',' ) )
            // InternalMontiCoreClassDiagram.g:1557:1: ( ',' )
            {
            // InternalMontiCoreClassDiagram.g:1557:1: ( ',' )
            // InternalMontiCoreClassDiagram.g:1558:2: ','
            {
             before(grammarAccess.getCDClassAccess().getCommaKeyword_4_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4_2__0__Impl"


    // $ANTLR start "rule__CDClass__Group_4_2__1"
    // InternalMontiCoreClassDiagram.g:1567:1: rule__CDClass__Group_4_2__1 : rule__CDClass__Group_4_2__1__Impl ;
    public final void rule__CDClass__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1571:1: ( rule__CDClass__Group_4_2__1__Impl )
            // InternalMontiCoreClassDiagram.g:1572:2: rule__CDClass__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4_2__1"


    // $ANTLR start "rule__CDClass__Group_4_2__1__Impl"
    // InternalMontiCoreClassDiagram.g:1578:1: rule__CDClass__Group_4_2__1__Impl : ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) ) ;
    public final void rule__CDClass__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1582:1: ( ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1583:1: ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1583:1: ( ( rule__CDClass__ImplementsAssignment_4_2_1 ) )
            // InternalMontiCoreClassDiagram.g:1584:2: ( rule__CDClass__ImplementsAssignment_4_2_1 )
            {
             before(grammarAccess.getCDClassAccess().getImplementsAssignment_4_2_1()); 
            // InternalMontiCoreClassDiagram.g:1585:2: ( rule__CDClass__ImplementsAssignment_4_2_1 )
            // InternalMontiCoreClassDiagram.g:1585:3: rule__CDClass__ImplementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CDClass__ImplementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCDClassAccess().getImplementsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__Group_4_2__1__Impl"


    // $ANTLR start "rule__CDEnum__Group__0"
    // InternalMontiCoreClassDiagram.g:1594:1: rule__CDEnum__Group__0 : rule__CDEnum__Group__0__Impl rule__CDEnum__Group__1 ;
    public final void rule__CDEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1598:1: ( rule__CDEnum__Group__0__Impl rule__CDEnum__Group__1 )
            // InternalMontiCoreClassDiagram.g:1599:2: rule__CDEnum__Group__0__Impl rule__CDEnum__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CDEnum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__0"


    // $ANTLR start "rule__CDEnum__Group__0__Impl"
    // InternalMontiCoreClassDiagram.g:1606:1: rule__CDEnum__Group__0__Impl : ( ( rule__CDEnum__PublicAssignment_0 )? ) ;
    public final void rule__CDEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1610:1: ( ( ( rule__CDEnum__PublicAssignment_0 )? ) )
            // InternalMontiCoreClassDiagram.g:1611:1: ( ( rule__CDEnum__PublicAssignment_0 )? )
            {
            // InternalMontiCoreClassDiagram.g:1611:1: ( ( rule__CDEnum__PublicAssignment_0 )? )
            // InternalMontiCoreClassDiagram.g:1612:2: ( rule__CDEnum__PublicAssignment_0 )?
            {
             before(grammarAccess.getCDEnumAccess().getPublicAssignment_0()); 
            // InternalMontiCoreClassDiagram.g:1613:2: ( rule__CDEnum__PublicAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1613:3: rule__CDEnum__PublicAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CDEnum__PublicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCDEnumAccess().getPublicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__0__Impl"


    // $ANTLR start "rule__CDEnum__Group__1"
    // InternalMontiCoreClassDiagram.g:1621:1: rule__CDEnum__Group__1 : rule__CDEnum__Group__1__Impl rule__CDEnum__Group__2 ;
    public final void rule__CDEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1625:1: ( rule__CDEnum__Group__1__Impl rule__CDEnum__Group__2 )
            // InternalMontiCoreClassDiagram.g:1626:2: rule__CDEnum__Group__1__Impl rule__CDEnum__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CDEnum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__1"


    // $ANTLR start "rule__CDEnum__Group__1__Impl"
    // InternalMontiCoreClassDiagram.g:1633:1: rule__CDEnum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__CDEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1637:1: ( ( 'enum' ) )
            // InternalMontiCoreClassDiagram.g:1638:1: ( 'enum' )
            {
            // InternalMontiCoreClassDiagram.g:1638:1: ( 'enum' )
            // InternalMontiCoreClassDiagram.g:1639:2: 'enum'
            {
             before(grammarAccess.getCDEnumAccess().getEnumKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__1__Impl"


    // $ANTLR start "rule__CDEnum__Group__2"
    // InternalMontiCoreClassDiagram.g:1648:1: rule__CDEnum__Group__2 : rule__CDEnum__Group__2__Impl rule__CDEnum__Group__3 ;
    public final void rule__CDEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1652:1: ( rule__CDEnum__Group__2__Impl rule__CDEnum__Group__3 )
            // InternalMontiCoreClassDiagram.g:1653:2: rule__CDEnum__Group__2__Impl rule__CDEnum__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CDEnum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__2"


    // $ANTLR start "rule__CDEnum__Group__2__Impl"
    // InternalMontiCoreClassDiagram.g:1660:1: rule__CDEnum__Group__2__Impl : ( ( rule__CDEnum__NameAssignment_2 ) ) ;
    public final void rule__CDEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1664:1: ( ( ( rule__CDEnum__NameAssignment_2 ) ) )
            // InternalMontiCoreClassDiagram.g:1665:1: ( ( rule__CDEnum__NameAssignment_2 ) )
            {
            // InternalMontiCoreClassDiagram.g:1665:1: ( ( rule__CDEnum__NameAssignment_2 ) )
            // InternalMontiCoreClassDiagram.g:1666:2: ( rule__CDEnum__NameAssignment_2 )
            {
             before(grammarAccess.getCDEnumAccess().getNameAssignment_2()); 
            // InternalMontiCoreClassDiagram.g:1667:2: ( rule__CDEnum__NameAssignment_2 )
            // InternalMontiCoreClassDiagram.g:1667:3: rule__CDEnum__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCDEnumAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__2__Impl"


    // $ANTLR start "rule__CDEnum__Group__3"
    // InternalMontiCoreClassDiagram.g:1675:1: rule__CDEnum__Group__3 : rule__CDEnum__Group__3__Impl rule__CDEnum__Group__4 ;
    public final void rule__CDEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1679:1: ( rule__CDEnum__Group__3__Impl rule__CDEnum__Group__4 )
            // InternalMontiCoreClassDiagram.g:1680:2: rule__CDEnum__Group__3__Impl rule__CDEnum__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CDEnum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__3"


    // $ANTLR start "rule__CDEnum__Group__3__Impl"
    // InternalMontiCoreClassDiagram.g:1687:1: rule__CDEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__CDEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1691:1: ( ( '{' ) )
            // InternalMontiCoreClassDiagram.g:1692:1: ( '{' )
            {
            // InternalMontiCoreClassDiagram.g:1692:1: ( '{' )
            // InternalMontiCoreClassDiagram.g:1693:2: '{'
            {
             before(grammarAccess.getCDEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__3__Impl"


    // $ANTLR start "rule__CDEnum__Group__4"
    // InternalMontiCoreClassDiagram.g:1702:1: rule__CDEnum__Group__4 : rule__CDEnum__Group__4__Impl rule__CDEnum__Group__5 ;
    public final void rule__CDEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1706:1: ( rule__CDEnum__Group__4__Impl rule__CDEnum__Group__5 )
            // InternalMontiCoreClassDiagram.g:1707:2: rule__CDEnum__Group__4__Impl rule__CDEnum__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CDEnum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__4"


    // $ANTLR start "rule__CDEnum__Group__4__Impl"
    // InternalMontiCoreClassDiagram.g:1714:1: rule__CDEnum__Group__4__Impl : ( ( rule__CDEnum__ValuesAssignment_4 ) ) ;
    public final void rule__CDEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1718:1: ( ( ( rule__CDEnum__ValuesAssignment_4 ) ) )
            // InternalMontiCoreClassDiagram.g:1719:1: ( ( rule__CDEnum__ValuesAssignment_4 ) )
            {
            // InternalMontiCoreClassDiagram.g:1719:1: ( ( rule__CDEnum__ValuesAssignment_4 ) )
            // InternalMontiCoreClassDiagram.g:1720:2: ( rule__CDEnum__ValuesAssignment_4 )
            {
             before(grammarAccess.getCDEnumAccess().getValuesAssignment_4()); 
            // InternalMontiCoreClassDiagram.g:1721:2: ( rule__CDEnum__ValuesAssignment_4 )
            // InternalMontiCoreClassDiagram.g:1721:3: rule__CDEnum__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCDEnumAccess().getValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__4__Impl"


    // $ANTLR start "rule__CDEnum__Group__5"
    // InternalMontiCoreClassDiagram.g:1729:1: rule__CDEnum__Group__5 : rule__CDEnum__Group__5__Impl ;
    public final void rule__CDEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1733:1: ( rule__CDEnum__Group__5__Impl )
            // InternalMontiCoreClassDiagram.g:1734:2: rule__CDEnum__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CDEnum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__5"


    // $ANTLR start "rule__CDEnum__Group__5__Impl"
    // InternalMontiCoreClassDiagram.g:1740:1: rule__CDEnum__Group__5__Impl : ( '}' ) ;
    public final void rule__CDEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1744:1: ( ( '}' ) )
            // InternalMontiCoreClassDiagram.g:1745:1: ( '}' )
            {
            // InternalMontiCoreClassDiagram.g:1745:1: ( '}' )
            // InternalMontiCoreClassDiagram.g:1746:2: '}'
            {
             before(grammarAccess.getCDEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__Group__5__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalMontiCoreClassDiagram.g:1756:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1760:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalMontiCoreClassDiagram.g:1761:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalMontiCoreClassDiagram.g:1768:1: rule__Member__Group__0__Impl : ( ( rule__Member__TypeAssignment_0 ) ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1772:1: ( ( ( rule__Member__TypeAssignment_0 ) ) )
            // InternalMontiCoreClassDiagram.g:1773:1: ( ( rule__Member__TypeAssignment_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:1773:1: ( ( rule__Member__TypeAssignment_0 ) )
            // InternalMontiCoreClassDiagram.g:1774:2: ( rule__Member__TypeAssignment_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAssignment_0()); 
            // InternalMontiCoreClassDiagram.g:1775:2: ( rule__Member__TypeAssignment_0 )
            // InternalMontiCoreClassDiagram.g:1775:3: rule__Member__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalMontiCoreClassDiagram.g:1783:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1787:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalMontiCoreClassDiagram.g:1788:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalMontiCoreClassDiagram.g:1795:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1799:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1800:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1800:1: ( ( rule__Member__NameAssignment_1 ) )
            // InternalMontiCoreClassDiagram.g:1801:2: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:1802:2: ( rule__Member__NameAssignment_1 )
            // InternalMontiCoreClassDiagram.g:1802:3: rule__Member__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalMontiCoreClassDiagram.g:1810:1: rule__Member__Group__2 : rule__Member__Group__2__Impl ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1814:1: ( rule__Member__Group__2__Impl )
            // InternalMontiCoreClassDiagram.g:1815:2: rule__Member__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalMontiCoreClassDiagram.g:1821:1: rule__Member__Group__2__Impl : ( ';' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1825:1: ( ( ';' ) )
            // InternalMontiCoreClassDiagram.g:1826:1: ( ';' )
            {
            // InternalMontiCoreClassDiagram.g:1826:1: ( ';' )
            // InternalMontiCoreClassDiagram.g:1827:2: ';'
            {
             before(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__ImportStatements__Group__0"
    // InternalMontiCoreClassDiagram.g:1837:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1841:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMontiCoreClassDiagram.g:1842:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMontiCoreClassDiagram.g:1849:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1853:1: ( ( 'import' ) )
            // InternalMontiCoreClassDiagram.g:1854:1: ( 'import' )
            {
            // InternalMontiCoreClassDiagram.g:1854:1: ( 'import' )
            // InternalMontiCoreClassDiagram.g:1855:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:1864:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1868:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMontiCoreClassDiagram.g:1869:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMontiCoreClassDiagram.g:1876:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1880:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1881:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1881:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMontiCoreClassDiagram.g:1882:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:1883:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMontiCoreClassDiagram.g:1883:3: rule__ImportStatements__ImportUriAssignment_1
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
    // InternalMontiCoreClassDiagram.g:1891:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1895:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMontiCoreClassDiagram.g:1896:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalMontiCoreClassDiagram.g:1903:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__StarAssignment_2 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1907:1: ( ( ( rule__ImportStatements__StarAssignment_2 )? ) )
            // InternalMontiCoreClassDiagram.g:1908:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            {
            // InternalMontiCoreClassDiagram.g:1908:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            // InternalMontiCoreClassDiagram.g:1909:2: ( rule__ImportStatements__StarAssignment_2 )?
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 
            // InternalMontiCoreClassDiagram.g:1910:2: ( rule__ImportStatements__StarAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOTSTAR) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1910:3: rule__ImportStatements__StarAssignment_2
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
    // InternalMontiCoreClassDiagram.g:1918:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1922:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMontiCoreClassDiagram.g:1923:2: rule__ImportStatements__Group__3__Impl
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
    // InternalMontiCoreClassDiagram.g:1929:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1933:1: ( ( ';' ) )
            // InternalMontiCoreClassDiagram.g:1934:1: ( ';' )
            {
            // InternalMontiCoreClassDiagram.g:1934:1: ( ';' )
            // InternalMontiCoreClassDiagram.g:1935:2: ';'
            {
             before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:1945:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1949:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMontiCoreClassDiagram.g:1950:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMontiCoreClassDiagram.g:1957:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1961:1: ( ( 'package' ) )
            // InternalMontiCoreClassDiagram.g:1962:1: ( 'package' )
            {
            // InternalMontiCoreClassDiagram.g:1962:1: ( 'package' )
            // InternalMontiCoreClassDiagram.g:1963:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:1972:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1976:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMontiCoreClassDiagram.g:1977:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalMontiCoreClassDiagram.g:1984:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:1988:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalMontiCoreClassDiagram.g:1989:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:1989:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalMontiCoreClassDiagram.g:1990:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:1991:2: ( rule__Package__NameAssignment_1 )
            // InternalMontiCoreClassDiagram.g:1991:3: rule__Package__NameAssignment_1
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
    // InternalMontiCoreClassDiagram.g:1999:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2003:1: ( rule__Package__Group__2__Impl )
            // InternalMontiCoreClassDiagram.g:2004:2: rule__Package__Group__2__Impl
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
    // InternalMontiCoreClassDiagram.g:2010:1: rule__Package__Group__2__Impl : ( ';' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2014:1: ( ( ';' ) )
            // InternalMontiCoreClassDiagram.g:2015:1: ( ';' )
            {
            // InternalMontiCoreClassDiagram.g:2015:1: ( ';' )
            // InternalMontiCoreClassDiagram.g:2016:2: ';'
            {
             before(grammarAccess.getPackageAccess().getSemicolonKeyword_2()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:2026:1: rule__MCCollectionType__Group__0 : rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 ;
    public final void rule__MCCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2030:1: ( rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 )
            // InternalMontiCoreClassDiagram.g:2031:2: rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMontiCoreClassDiagram.g:2038:1: rule__MCCollectionType__Group__0__Impl : ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__MCCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2042:1: ( ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2043:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2043:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            // InternalMontiCoreClassDiagram.g:2044:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalMontiCoreClassDiagram.g:2045:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            // InternalMontiCoreClassDiagram.g:2045:3: rule__MCCollectionType__CollectionAssignment_0
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
    // InternalMontiCoreClassDiagram.g:2053:1: rule__MCCollectionType__Group__1 : rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 ;
    public final void rule__MCCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2057:1: ( rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 )
            // InternalMontiCoreClassDiagram.g:2058:2: rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMontiCoreClassDiagram.g:2065:1: rule__MCCollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__MCCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2069:1: ( ( '<' ) )
            // InternalMontiCoreClassDiagram.g:2070:1: ( '<' )
            {
            // InternalMontiCoreClassDiagram.g:2070:1: ( '<' )
            // InternalMontiCoreClassDiagram.g:2071:2: '<'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:2080:1: rule__MCCollectionType__Group__2 : rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 ;
    public final void rule__MCCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2084:1: ( rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 )
            // InternalMontiCoreClassDiagram.g:2085:2: rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMontiCoreClassDiagram.g:2092:1: rule__MCCollectionType__Group__2__Impl : ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__MCCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2096:1: ( ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) )
            // InternalMontiCoreClassDiagram.g:2097:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalMontiCoreClassDiagram.g:2097:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            // InternalMontiCoreClassDiagram.g:2098:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalMontiCoreClassDiagram.g:2099:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            // InternalMontiCoreClassDiagram.g:2099:3: rule__MCCollectionType__InnerTypeAssignment_2
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
    // InternalMontiCoreClassDiagram.g:2107:1: rule__MCCollectionType__Group__3 : rule__MCCollectionType__Group__3__Impl ;
    public final void rule__MCCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2111:1: ( rule__MCCollectionType__Group__3__Impl )
            // InternalMontiCoreClassDiagram.g:2112:2: rule__MCCollectionType__Group__3__Impl
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
    // InternalMontiCoreClassDiagram.g:2118:1: rule__MCCollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__MCCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2122:1: ( ( '>' ) )
            // InternalMontiCoreClassDiagram.g:2123:1: ( '>' )
            {
            // InternalMontiCoreClassDiagram.g:2123:1: ( '>' )
            // InternalMontiCoreClassDiagram.g:2124:2: '>'
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:2134:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2138:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMontiCoreClassDiagram.g:2139:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMontiCoreClassDiagram.g:2146:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2150:1: ( ( ruleMCPrimitiveType ) )
            // InternalMontiCoreClassDiagram.g:2151:1: ( ruleMCPrimitiveType )
            {
            // InternalMontiCoreClassDiagram.g:2151:1: ( ruleMCPrimitiveType )
            // InternalMontiCoreClassDiagram.g:2152:2: ruleMCPrimitiveType
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
    // InternalMontiCoreClassDiagram.g:2161:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2165:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMontiCoreClassDiagram.g:2166:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMontiCoreClassDiagram.g:2173:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2177:1: ( ( '[' ) )
            // InternalMontiCoreClassDiagram.g:2178:1: ( '[' )
            {
            // InternalMontiCoreClassDiagram.g:2178:1: ( '[' )
            // InternalMontiCoreClassDiagram.g:2179:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:2188:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2192:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMontiCoreClassDiagram.g:2193:2: rule__MCArrayType__Group__2__Impl
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
    // InternalMontiCoreClassDiagram.g:2199:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2203:1: ( ( ']' ) )
            // InternalMontiCoreClassDiagram.g:2204:1: ( ']' )
            {
            // InternalMontiCoreClassDiagram.g:2204:1: ( ']' )
            // InternalMontiCoreClassDiagram.g:2205:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMontiCoreClassDiagram.g:2215:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2219:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMontiCoreClassDiagram.g:2220:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMontiCoreClassDiagram.g:2227:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2231:1: ( ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2232:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2232:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            // InternalMontiCoreClassDiagram.g:2233:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 
            // InternalMontiCoreClassDiagram.g:2234:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            // InternalMontiCoreClassDiagram.g:2234:3: rule__BinaryExpression__Literal1Assignment_0
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
    // InternalMontiCoreClassDiagram.g:2242:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2246:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMontiCoreClassDiagram.g:2247:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiCoreClassDiagram.g:2254:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__OpAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2258:1: ( ( ( rule__BinaryExpression__OpAssignment_1 ) ) )
            // InternalMontiCoreClassDiagram.g:2259:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:2259:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            // InternalMontiCoreClassDiagram.g:2260:2: ( rule__BinaryExpression__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:2261:2: ( rule__BinaryExpression__OpAssignment_1 )
            // InternalMontiCoreClassDiagram.g:2261:3: rule__BinaryExpression__OpAssignment_1
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
    // InternalMontiCoreClassDiagram.g:2269:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2273:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalMontiCoreClassDiagram.g:2274:2: rule__BinaryExpression__Group__2__Impl
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
    // InternalMontiCoreClassDiagram.g:2280:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2284:1: ( ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) )
            // InternalMontiCoreClassDiagram.g:2285:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            {
            // InternalMontiCoreClassDiagram.g:2285:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            // InternalMontiCoreClassDiagram.g:2286:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 
            // InternalMontiCoreClassDiagram.g:2287:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            // InternalMontiCoreClassDiagram.g:2287:3: rule__BinaryExpression__Literal2Assignment_2
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


    // $ANTLR start "rule__Argument__Group__0"
    // InternalMontiCoreClassDiagram.g:2296:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2300:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMontiCoreClassDiagram.g:2301:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMontiCoreClassDiagram.g:2308:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2312:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2313:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2313:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMontiCoreClassDiagram.g:2314:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMontiCoreClassDiagram.g:2315:2: ( rule__Argument__NameAssignment_0 )
            // InternalMontiCoreClassDiagram.g:2315:3: rule__Argument__NameAssignment_0
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
    // InternalMontiCoreClassDiagram.g:2323:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2327:1: ( rule__Argument__Group__1__Impl )
            // InternalMontiCoreClassDiagram.g:2328:2: rule__Argument__Group__1__Impl
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
    // InternalMontiCoreClassDiagram.g:2334:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2338:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMontiCoreClassDiagram.g:2339:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMontiCoreClassDiagram.g:2339:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMontiCoreClassDiagram.g:2340:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMontiCoreClassDiagram.g:2341:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMontiCoreClassDiagram.g:2341:3: rule__Argument__ExpressionAssignment_1
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


    // $ANTLR start "rule__ClassDiagramCompilationUnit__PackageAssignment_0"
    // InternalMontiCoreClassDiagram.g:2350:1: rule__ClassDiagramCompilationUnit__PackageAssignment_0 : ( rulePackage ) ;
    public final void rule__ClassDiagramCompilationUnit__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2354:1: ( ( rulePackage ) )
            // InternalMontiCoreClassDiagram.g:2355:2: ( rulePackage )
            {
            // InternalMontiCoreClassDiagram.g:2355:2: ( rulePackage )
            // InternalMontiCoreClassDiagram.g:2356:3: rulePackage
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getPackagePackageParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__PackageAssignment_0"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1"
    // InternalMontiCoreClassDiagram.g:2365:1: rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1 : ( ruleImportStatements ) ;
    public final void rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2369:1: ( ( ruleImportStatements ) )
            // InternalMontiCoreClassDiagram.g:2370:2: ( ruleImportStatements )
            {
            // InternalMontiCoreClassDiagram.g:2370:2: ( ruleImportStatements )
            // InternalMontiCoreClassDiagram.g:2371:3: ruleImportStatements
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportStatements();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__ImportStatementsAssignment_1"


    // $ANTLR start "rule__ClassDiagramCompilationUnit__DiagramAssignment_2"
    // InternalMontiCoreClassDiagram.g:2380:1: rule__ClassDiagramCompilationUnit__DiagramAssignment_2 : ( ruleClassDiagram ) ;
    public final void rule__ClassDiagramCompilationUnit__DiagramAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2384:1: ( ( ruleClassDiagram ) )
            // InternalMontiCoreClassDiagram.g:2385:2: ( ruleClassDiagram )
            {
            // InternalMontiCoreClassDiagram.g:2385:2: ( ruleClassDiagram )
            // InternalMontiCoreClassDiagram.g:2386:3: ruleClassDiagram
            {
             before(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramClassDiagramParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDiagram();

            state._fsp--;

             after(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramClassDiagramParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagramCompilationUnit__DiagramAssignment_2"


    // $ANTLR start "rule__ClassDiagram__NameAssignment_1"
    // InternalMontiCoreClassDiagram.g:2395:1: rule__ClassDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2399:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2400:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2400:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2401:3: RULE_ID
            {
             before(grammarAccess.getClassDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__NameAssignment_1"


    // $ANTLR start "rule__ClassDiagram__CdElementsAssignment_3"
    // InternalMontiCoreClassDiagram.g:2410:1: rule__ClassDiagram__CdElementsAssignment_3 : ( ruleCDDefinition ) ;
    public final void rule__ClassDiagram__CdElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2414:1: ( ( ruleCDDefinition ) )
            // InternalMontiCoreClassDiagram.g:2415:2: ( ruleCDDefinition )
            {
            // InternalMontiCoreClassDiagram.g:2415:2: ( ruleCDDefinition )
            // InternalMontiCoreClassDiagram.g:2416:3: ruleCDDefinition
            {
             before(grammarAccess.getClassDiagramAccess().getCdElementsCDDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCDDefinition();

            state._fsp--;

             after(grammarAccess.getClassDiagramAccess().getCdElementsCDDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDiagram__CdElementsAssignment_3"


    // $ANTLR start "rule__CDClass__PublicAssignment_0"
    // InternalMontiCoreClassDiagram.g:2425:1: rule__CDClass__PublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__CDClass__PublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2429:1: ( ( ( 'public' ) ) )
            // InternalMontiCoreClassDiagram.g:2430:2: ( ( 'public' ) )
            {
            // InternalMontiCoreClassDiagram.g:2430:2: ( ( 'public' ) )
            // InternalMontiCoreClassDiagram.g:2431:3: ( 'public' )
            {
             before(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 
            // InternalMontiCoreClassDiagram.g:2432:3: ( 'public' )
            // InternalMontiCoreClassDiagram.g:2433:4: 'public'
            {
             before(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 

            }

             after(grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__PublicAssignment_0"


    // $ANTLR start "rule__CDClass__NameAssignment_2"
    // InternalMontiCoreClassDiagram.g:2444:1: rule__CDClass__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CDClass__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2448:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2449:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2449:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2450:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__NameAssignment_2"


    // $ANTLR start "rule__CDClass__ExtendsAssignment_3_1"
    // InternalMontiCoreClassDiagram.g:2459:1: rule__CDClass__ExtendsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__CDClass__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2463:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2464:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2464:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2465:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getExtendsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getExtendsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__ExtendsAssignment_3_1"


    // $ANTLR start "rule__CDClass__ImplementsAssignment_4_1"
    // InternalMontiCoreClassDiagram.g:2474:1: rule__CDClass__ImplementsAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__CDClass__ImplementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2478:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2479:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2479:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2480:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__ImplementsAssignment_4_1"


    // $ANTLR start "rule__CDClass__ImplementsAssignment_4_2_1"
    // InternalMontiCoreClassDiagram.g:2489:1: rule__CDClass__ImplementsAssignment_4_2_1 : ( RULE_ID ) ;
    public final void rule__CDClass__ImplementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2493:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2494:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2494:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2495:3: RULE_ID
            {
             before(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__ImplementsAssignment_4_2_1"


    // $ANTLR start "rule__CDClass__MembersAssignment_6"
    // InternalMontiCoreClassDiagram.g:2504:1: rule__CDClass__MembersAssignment_6 : ( ruleMember ) ;
    public final void rule__CDClass__MembersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2508:1: ( ( ruleMember ) )
            // InternalMontiCoreClassDiagram.g:2509:2: ( ruleMember )
            {
            // InternalMontiCoreClassDiagram.g:2509:2: ( ruleMember )
            // InternalMontiCoreClassDiagram.g:2510:3: ruleMember
            {
             before(grammarAccess.getCDClassAccess().getMembersMemberParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getCDClassAccess().getMembersMemberParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDClass__MembersAssignment_6"


    // $ANTLR start "rule__CDEnum__PublicAssignment_0"
    // InternalMontiCoreClassDiagram.g:2519:1: rule__CDEnum__PublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__CDEnum__PublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2523:1: ( ( ( 'public' ) ) )
            // InternalMontiCoreClassDiagram.g:2524:2: ( ( 'public' ) )
            {
            // InternalMontiCoreClassDiagram.g:2524:2: ( ( 'public' ) )
            // InternalMontiCoreClassDiagram.g:2525:3: ( 'public' )
            {
             before(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 
            // InternalMontiCoreClassDiagram.g:2526:3: ( 'public' )
            // InternalMontiCoreClassDiagram.g:2527:4: 'public'
            {
             before(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 

            }

             after(grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__PublicAssignment_0"


    // $ANTLR start "rule__CDEnum__NameAssignment_2"
    // InternalMontiCoreClassDiagram.g:2538:1: rule__CDEnum__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CDEnum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2542:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2543:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2543:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2544:3: RULE_ID
            {
             before(grammarAccess.getCDEnumAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__NameAssignment_2"


    // $ANTLR start "rule__CDEnum__ValuesAssignment_4"
    // InternalMontiCoreClassDiagram.g:2553:1: rule__CDEnum__ValuesAssignment_4 : ( RULE_ID ) ;
    public final void rule__CDEnum__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2557:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2558:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2558:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2559:3: RULE_ID
            {
             before(grammarAccess.getCDEnumAccess().getValuesIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCDEnumAccess().getValuesIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CDEnum__ValuesAssignment_4"


    // $ANTLR start "rule__Member__TypeAssignment_0"
    // InternalMontiCoreClassDiagram.g:2568:1: rule__Member__TypeAssignment_0 : ( ( rule__Member__TypeAlternatives_0_0 ) ) ;
    public final void rule__Member__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2572:1: ( ( ( rule__Member__TypeAlternatives_0_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2573:2: ( ( rule__Member__TypeAlternatives_0_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2573:2: ( ( rule__Member__TypeAlternatives_0_0 ) )
            // InternalMontiCoreClassDiagram.g:2574:3: ( rule__Member__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getMemberAccess().getTypeAlternatives_0_0()); 
            // InternalMontiCoreClassDiagram.g:2575:3: ( rule__Member__TypeAlternatives_0_0 )
            // InternalMontiCoreClassDiagram.g:2575:4: rule__Member__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Member__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__TypeAssignment_0"


    // $ANTLR start "rule__Member__NameAssignment_1"
    // InternalMontiCoreClassDiagram.g:2583:1: rule__Member__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2587:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2588:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2588:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2589:3: RULE_ID
            {
             before(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__NameAssignment_1"


    // $ANTLR start "rule__ImportStatements__ImportUriAssignment_1"
    // InternalMontiCoreClassDiagram.g:2598:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2602:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiCoreClassDiagram.g:2603:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiCoreClassDiagram.g:2603:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiCoreClassDiagram.g:2604:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiCoreClassDiagram.g:2613:1: rule__ImportStatements__StarAssignment_2 : ( RULE_DOTSTAR ) ;
    public final void rule__ImportStatements__StarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2617:1: ( ( RULE_DOTSTAR ) )
            // InternalMontiCoreClassDiagram.g:2618:2: ( RULE_DOTSTAR )
            {
            // InternalMontiCoreClassDiagram.g:2618:2: ( RULE_DOTSTAR )
            // InternalMontiCoreClassDiagram.g:2619:3: RULE_DOTSTAR
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
    // InternalMontiCoreClassDiagram.g:2628:1: rule__Package__NameAssignment_1 : ( ( rule__Package__NameAlternatives_1_0 ) ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2632:1: ( ( ( rule__Package__NameAlternatives_1_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2633:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2633:2: ( ( rule__Package__NameAlternatives_1_0 ) )
            // InternalMontiCoreClassDiagram.g:2634:3: ( rule__Package__NameAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getNameAlternatives_1_0()); 
            // InternalMontiCoreClassDiagram.g:2635:3: ( rule__Package__NameAlternatives_1_0 )
            // InternalMontiCoreClassDiagram.g:2635:4: rule__Package__NameAlternatives_1_0
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
    // InternalMontiCoreClassDiagram.g:2643:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2647:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2648:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2648:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMontiCoreClassDiagram.g:2649:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiCoreClassDiagram.g:2650:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMontiCoreClassDiagram.g:2650:4: rule__MCPrimitiveType__TypeAlternatives_0
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
    // InternalMontiCoreClassDiagram.g:2658:1: rule__MCObjectType__TypeAssignment : ( ( rule__MCObjectType__TypeAlternatives_0 ) ) ;
    public final void rule__MCObjectType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2662:1: ( ( ( rule__MCObjectType__TypeAlternatives_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2663:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2663:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            // InternalMontiCoreClassDiagram.g:2664:3: ( rule__MCObjectType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 
            // InternalMontiCoreClassDiagram.g:2665:3: ( rule__MCObjectType__TypeAlternatives_0 )
            // InternalMontiCoreClassDiagram.g:2665:4: rule__MCObjectType__TypeAlternatives_0
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
    // InternalMontiCoreClassDiagram.g:2673:1: rule__MCCollectionType__CollectionAssignment_0 : ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__MCCollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2677:1: ( ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2678:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2678:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            // InternalMontiCoreClassDiagram.g:2679:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalMontiCoreClassDiagram.g:2680:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            // InternalMontiCoreClassDiagram.g:2680:4: rule__MCCollectionType__CollectionAlternatives_0_0
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
    // InternalMontiCoreClassDiagram.g:2688:1: rule__MCCollectionType__InnerTypeAssignment_2 : ( ruleType ) ;
    public final void rule__MCCollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2692:1: ( ( ruleType ) )
            // InternalMontiCoreClassDiagram.g:2693:2: ( ruleType )
            {
            // InternalMontiCoreClassDiagram.g:2693:2: ( ruleType )
            // InternalMontiCoreClassDiagram.g:2694:3: ruleType
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
    // InternalMontiCoreClassDiagram.g:2703:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2707:1: ( ( RULE_INT ) )
            // InternalMontiCoreClassDiagram.g:2708:2: ( RULE_INT )
            {
            // InternalMontiCoreClassDiagram.g:2708:2: ( RULE_INT )
            // InternalMontiCoreClassDiagram.g:2709:3: RULE_INT
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
    // InternalMontiCoreClassDiagram.g:2718:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2722:1: ( ( RULE_STRING ) )
            // InternalMontiCoreClassDiagram.g:2723:2: ( RULE_STRING )
            {
            // InternalMontiCoreClassDiagram.g:2723:2: ( RULE_STRING )
            // InternalMontiCoreClassDiagram.g:2724:3: RULE_STRING
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
    // InternalMontiCoreClassDiagram.g:2733:1: rule__NameExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2737:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2738:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2738:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2739:3: RULE_ID
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
    // InternalMontiCoreClassDiagram.g:2748:1: rule__NameExpression__QualifiednameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__NameExpression__QualifiednameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2752:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMontiCoreClassDiagram.g:2753:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiCoreClassDiagram.g:2753:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMontiCoreClassDiagram.g:2754:3: RULE_MCQUALIFIEDNAME
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
    // InternalMontiCoreClassDiagram.g:2763:1: rule__BinaryExpression__Literal1Assignment_0 : ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) ;
    public final void rule__BinaryExpression__Literal1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2767:1: ( ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2768:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2768:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            // InternalMontiCoreClassDiagram.g:2769:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 
            // InternalMontiCoreClassDiagram.g:2770:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            // InternalMontiCoreClassDiagram.g:2770:4: rule__BinaryExpression__Literal1Alternatives_0_0
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
    // InternalMontiCoreClassDiagram.g:2778:1: rule__BinaryExpression__OpAssignment_1 : ( ruleOperator ) ;
    public final void rule__BinaryExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2782:1: ( ( ruleOperator ) )
            // InternalMontiCoreClassDiagram.g:2783:2: ( ruleOperator )
            {
            // InternalMontiCoreClassDiagram.g:2783:2: ( ruleOperator )
            // InternalMontiCoreClassDiagram.g:2784:3: ruleOperator
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
    // InternalMontiCoreClassDiagram.g:2793:1: rule__BinaryExpression__Literal2Assignment_2 : ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) ;
    public final void rule__BinaryExpression__Literal2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2797:1: ( ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) )
            // InternalMontiCoreClassDiagram.g:2798:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            {
            // InternalMontiCoreClassDiagram.g:2798:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            // InternalMontiCoreClassDiagram.g:2799:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 
            // InternalMontiCoreClassDiagram.g:2800:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            // InternalMontiCoreClassDiagram.g:2800:4: rule__BinaryExpression__Literal2Alternatives_2_0
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


    // $ANTLR start "rule__Argument__NameAssignment_0"
    // InternalMontiCoreClassDiagram.g:2808:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2812:1: ( ( RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:2813:2: ( RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:2813:2: ( RULE_ID )
            // InternalMontiCoreClassDiagram.g:2814:3: RULE_ID
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
    // InternalMontiCoreClassDiagram.g:2823:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMontiCoreClassDiagram.g:2827:1: ( ( ruleExpression ) )
            // InternalMontiCoreClassDiagram.g:2828:2: ( ruleExpression )
            {
            // InternalMontiCoreClassDiagram.g:2828:2: ( ruleExpression )
            // InternalMontiCoreClassDiagram.g:2829:3: ruleExpression
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
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\10\13\4\uffff";
    static final String dfa_3s = "\1\15\10\5\4\uffff";
    static final String dfa_4s = "\1\37\10\63\4\uffff";
    static final String dfa_5s = "\11\uffff\1\3\1\4\1\1\1\2";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "\1\13\32\uffff\1\13\22\uffff\1\14",
            "",
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
            return "631:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00208C0000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0020880000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0020080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000320000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00208800FFFFE000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0020880000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000FFFFE000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000001B0L});

}