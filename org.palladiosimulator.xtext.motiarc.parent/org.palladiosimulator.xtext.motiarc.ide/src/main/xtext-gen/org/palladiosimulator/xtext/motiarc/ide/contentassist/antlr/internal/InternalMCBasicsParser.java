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
import org.palladiosimulator.xtext.motiarc.services.MCBasicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCBasicsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_DOTSTAR", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'>'", "'<'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'", "'import'", "';'", "'['", "']'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=4;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_DOTSTAR=5;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMCBasicsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMCBasicsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMCBasicsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMCBasics.g"; }


    	private MCBasicsGrammarAccess grammarAccess;

    	public void setGrammarAccess(MCBasicsGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleImportStatements"
    // InternalMCBasics.g:53:1: entryRuleImportStatements : ruleImportStatements EOF ;
    public final void entryRuleImportStatements() throws RecognitionException {
        try {
            // InternalMCBasics.g:54:1: ( ruleImportStatements EOF )
            // InternalMCBasics.g:55:1: ruleImportStatements EOF
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
    // InternalMCBasics.g:62:1: ruleImportStatements : ( ( rule__ImportStatements__Group__0 ) ) ;
    public final void ruleImportStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:66:2: ( ( ( rule__ImportStatements__Group__0 ) ) )
            // InternalMCBasics.g:67:2: ( ( rule__ImportStatements__Group__0 ) )
            {
            // InternalMCBasics.g:67:2: ( ( rule__ImportStatements__Group__0 ) )
            // InternalMCBasics.g:68:3: ( rule__ImportStatements__Group__0 )
            {
             before(grammarAccess.getImportStatementsAccess().getGroup()); 
            // InternalMCBasics.g:69:3: ( rule__ImportStatements__Group__0 )
            // InternalMCBasics.g:69:4: rule__ImportStatements__Group__0
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


    // $ANTLR start "entryRuleType"
    // InternalMCBasics.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMCBasics.g:79:1: ( ruleType EOF )
            // InternalMCBasics.g:80:1: ruleType EOF
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
    // InternalMCBasics.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMCBasics.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMCBasics.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalMCBasics.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMCBasics.g:94:3: ( rule__Type__Alternatives )
            // InternalMCBasics.g:94:4: rule__Type__Alternatives
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
    // InternalMCBasics.g:103:1: entryRuleMCPrimitiveType : ruleMCPrimitiveType EOF ;
    public final void entryRuleMCPrimitiveType() throws RecognitionException {
        try {
            // InternalMCBasics.g:104:1: ( ruleMCPrimitiveType EOF )
            // InternalMCBasics.g:105:1: ruleMCPrimitiveType EOF
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
    // InternalMCBasics.g:112:1: ruleMCPrimitiveType : ( ( rule__MCPrimitiveType__TypeAssignment ) ) ;
    public final void ruleMCPrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:116:2: ( ( ( rule__MCPrimitiveType__TypeAssignment ) ) )
            // InternalMCBasics.g:117:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            {
            // InternalMCBasics.g:117:2: ( ( rule__MCPrimitiveType__TypeAssignment ) )
            // InternalMCBasics.g:118:3: ( rule__MCPrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalMCBasics.g:119:3: ( rule__MCPrimitiveType__TypeAssignment )
            // InternalMCBasics.g:119:4: rule__MCPrimitiveType__TypeAssignment
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
    // InternalMCBasics.g:128:1: entryRuleMCObjectType : ruleMCObjectType EOF ;
    public final void entryRuleMCObjectType() throws RecognitionException {
        try {
            // InternalMCBasics.g:129:1: ( ruleMCObjectType EOF )
            // InternalMCBasics.g:130:1: ruleMCObjectType EOF
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
    // InternalMCBasics.g:137:1: ruleMCObjectType : ( ( rule__MCObjectType__TypeAssignment ) ) ;
    public final void ruleMCObjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:141:2: ( ( ( rule__MCObjectType__TypeAssignment ) ) )
            // InternalMCBasics.g:142:2: ( ( rule__MCObjectType__TypeAssignment ) )
            {
            // InternalMCBasics.g:142:2: ( ( rule__MCObjectType__TypeAssignment ) )
            // InternalMCBasics.g:143:3: ( rule__MCObjectType__TypeAssignment )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAssignment()); 
            // InternalMCBasics.g:144:3: ( rule__MCObjectType__TypeAssignment )
            // InternalMCBasics.g:144:4: rule__MCObjectType__TypeAssignment
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
    // InternalMCBasics.g:153:1: entryRuleMCCollectionType : ruleMCCollectionType EOF ;
    public final void entryRuleMCCollectionType() throws RecognitionException {
        try {
            // InternalMCBasics.g:154:1: ( ruleMCCollectionType EOF )
            // InternalMCBasics.g:155:1: ruleMCCollectionType EOF
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
    // InternalMCBasics.g:162:1: ruleMCCollectionType : ( ( rule__MCCollectionType__Group__0 ) ) ;
    public final void ruleMCCollectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:166:2: ( ( ( rule__MCCollectionType__Group__0 ) ) )
            // InternalMCBasics.g:167:2: ( ( rule__MCCollectionType__Group__0 ) )
            {
            // InternalMCBasics.g:167:2: ( ( rule__MCCollectionType__Group__0 ) )
            // InternalMCBasics.g:168:3: ( rule__MCCollectionType__Group__0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getGroup()); 
            // InternalMCBasics.g:169:3: ( rule__MCCollectionType__Group__0 )
            // InternalMCBasics.g:169:4: rule__MCCollectionType__Group__0
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
    // InternalMCBasics.g:178:1: entryRuleMCArrayType : ruleMCArrayType EOF ;
    public final void entryRuleMCArrayType() throws RecognitionException {
        try {
            // InternalMCBasics.g:179:1: ( ruleMCArrayType EOF )
            // InternalMCBasics.g:180:1: ruleMCArrayType EOF
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
    // InternalMCBasics.g:187:1: ruleMCArrayType : ( ( rule__MCArrayType__Group__0 ) ) ;
    public final void ruleMCArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:191:2: ( ( ( rule__MCArrayType__Group__0 ) ) )
            // InternalMCBasics.g:192:2: ( ( rule__MCArrayType__Group__0 ) )
            {
            // InternalMCBasics.g:192:2: ( ( rule__MCArrayType__Group__0 ) )
            // InternalMCBasics.g:193:3: ( rule__MCArrayType__Group__0 )
            {
             before(grammarAccess.getMCArrayTypeAccess().getGroup()); 
            // InternalMCBasics.g:194:3: ( rule__MCArrayType__Group__0 )
            // InternalMCBasics.g:194:4: rule__MCArrayType__Group__0
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
    // InternalMCBasics.g:203:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMCBasics.g:204:1: ( ruleExpression EOF )
            // InternalMCBasics.g:205:1: ruleExpression EOF
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
    // InternalMCBasics.g:212:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:216:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMCBasics.g:217:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMCBasics.g:217:2: ( ( rule__Expression__Alternatives ) )
            // InternalMCBasics.g:218:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMCBasics.g:219:3: ( rule__Expression__Alternatives )
            // InternalMCBasics.g:219:4: rule__Expression__Alternatives
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
    // InternalMCBasics.g:228:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalMCBasics.g:229:1: ( ruleLiteralExpression EOF )
            // InternalMCBasics.g:230:1: ruleLiteralExpression EOF
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
    // InternalMCBasics.g:237:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:241:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // InternalMCBasics.g:242:2: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // InternalMCBasics.g:242:2: ( ( rule__LiteralExpression__Alternatives ) )
            // InternalMCBasics.g:243:3: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // InternalMCBasics.g:244:3: ( rule__LiteralExpression__Alternatives )
            // InternalMCBasics.g:244:4: rule__LiteralExpression__Alternatives
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
    // InternalMCBasics.g:253:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMCBasics.g:254:1: ( ruleNumberLiteral EOF )
            // InternalMCBasics.g:255:1: ruleNumberLiteral EOF
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
    // InternalMCBasics.g:262:1: ruleNumberLiteral : ( ( rule__NumberLiteral__LiteralAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:266:2: ( ( ( rule__NumberLiteral__LiteralAssignment ) ) )
            // InternalMCBasics.g:267:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            {
            // InternalMCBasics.g:267:2: ( ( rule__NumberLiteral__LiteralAssignment ) )
            // InternalMCBasics.g:268:3: ( rule__NumberLiteral__LiteralAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getLiteralAssignment()); 
            // InternalMCBasics.g:269:3: ( rule__NumberLiteral__LiteralAssignment )
            // InternalMCBasics.g:269:4: rule__NumberLiteral__LiteralAssignment
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
    // InternalMCBasics.g:278:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMCBasics.g:279:1: ( ruleStringLiteral EOF )
            // InternalMCBasics.g:280:1: ruleStringLiteral EOF
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
    // InternalMCBasics.g:287:1: ruleStringLiteral : ( ( rule__StringLiteral__LiteralAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:291:2: ( ( ( rule__StringLiteral__LiteralAssignment ) ) )
            // InternalMCBasics.g:292:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            {
            // InternalMCBasics.g:292:2: ( ( rule__StringLiteral__LiteralAssignment ) )
            // InternalMCBasics.g:293:3: ( rule__StringLiteral__LiteralAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getLiteralAssignment()); 
            // InternalMCBasics.g:294:3: ( rule__StringLiteral__LiteralAssignment )
            // InternalMCBasics.g:294:4: rule__StringLiteral__LiteralAssignment
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
    // InternalMCBasics.g:303:1: entryRuleNameExpression : ruleNameExpression EOF ;
    public final void entryRuleNameExpression() throws RecognitionException {
        try {
            // InternalMCBasics.g:304:1: ( ruleNameExpression EOF )
            // InternalMCBasics.g:305:1: ruleNameExpression EOF
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
    // InternalMCBasics.g:312:1: ruleNameExpression : ( ( rule__NameExpression__Alternatives ) ) ;
    public final void ruleNameExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:316:2: ( ( ( rule__NameExpression__Alternatives ) ) )
            // InternalMCBasics.g:317:2: ( ( rule__NameExpression__Alternatives ) )
            {
            // InternalMCBasics.g:317:2: ( ( rule__NameExpression__Alternatives ) )
            // InternalMCBasics.g:318:3: ( rule__NameExpression__Alternatives )
            {
             before(grammarAccess.getNameExpressionAccess().getAlternatives()); 
            // InternalMCBasics.g:319:3: ( rule__NameExpression__Alternatives )
            // InternalMCBasics.g:319:4: rule__NameExpression__Alternatives
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
    // InternalMCBasics.g:328:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalMCBasics.g:329:1: ( ruleBinaryExpression EOF )
            // InternalMCBasics.g:330:1: ruleBinaryExpression EOF
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
    // InternalMCBasics.g:337:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:341:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalMCBasics.g:342:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalMCBasics.g:342:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalMCBasics.g:343:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalMCBasics.g:344:3: ( rule__BinaryExpression__Group__0 )
            // InternalMCBasics.g:344:4: rule__BinaryExpression__Group__0
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
    // InternalMCBasics.g:353:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // InternalMCBasics.g:354:1: ( ruleArgument EOF )
            // InternalMCBasics.g:355:1: ruleArgument EOF
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
    // InternalMCBasics.g:362:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:366:2: ( ( ( rule__Argument__Group__0 ) ) )
            // InternalMCBasics.g:367:2: ( ( rule__Argument__Group__0 ) )
            {
            // InternalMCBasics.g:367:2: ( ( rule__Argument__Group__0 ) )
            // InternalMCBasics.g:368:3: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // InternalMCBasics.g:369:3: ( rule__Argument__Group__0 )
            // InternalMCBasics.g:369:4: rule__Argument__Group__0
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
    // InternalMCBasics.g:378:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:382:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMCBasics.g:383:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMCBasics.g:383:2: ( ( rule__Operator__Alternatives ) )
            // InternalMCBasics.g:384:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMCBasics.g:385:3: ( rule__Operator__Alternatives )
            // InternalMCBasics.g:385:4: rule__Operator__Alternatives
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMCBasics.g:393:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:397:1: ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMCBasics.g:398:2: ( ruleMCPrimitiveType )
                    {
                    // InternalMCBasics.g:398:2: ( ruleMCPrimitiveType )
                    // InternalMCBasics.g:399:3: ruleMCPrimitiveType
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
                    // InternalMCBasics.g:404:2: ( ruleMCArrayType )
                    {
                    // InternalMCBasics.g:404:2: ( ruleMCArrayType )
                    // InternalMCBasics.g:405:3: ruleMCArrayType
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
                    // InternalMCBasics.g:410:2: ( ruleMCObjectType )
                    {
                    // InternalMCBasics.g:410:2: ( ruleMCObjectType )
                    // InternalMCBasics.g:411:3: ruleMCObjectType
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
                    // InternalMCBasics.g:416:2: ( ruleMCCollectionType )
                    {
                    // InternalMCBasics.g:416:2: ( ruleMCCollectionType )
                    // InternalMCBasics.g:417:3: ruleMCCollectionType
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
    // InternalMCBasics.g:426:1: rule__MCPrimitiveType__TypeAlternatives_0 : ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__MCPrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:430:1: ( ( 'boolean' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'char' ) | ( 'float' ) | ( 'double' ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            case 20:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMCBasics.g:431:2: ( 'boolean' )
                    {
                    // InternalMCBasics.g:431:2: ( 'boolean' )
                    // InternalMCBasics.g:432:3: 'boolean'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:437:2: ( 'byte' )
                    {
                    // InternalMCBasics.g:437:2: ( 'byte' )
                    // InternalMCBasics.g:438:3: 'byte'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:443:2: ( 'short' )
                    {
                    // InternalMCBasics.g:443:2: ( 'short' )
                    // InternalMCBasics.g:444:3: 'short'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:449:2: ( 'int' )
                    {
                    // InternalMCBasics.g:449:2: ( 'int' )
                    // InternalMCBasics.g:450:3: 'int'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:455:2: ( 'long' )
                    {
                    // InternalMCBasics.g:455:2: ( 'long' )
                    // InternalMCBasics.g:456:3: 'long'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:461:2: ( 'char' )
                    {
                    // InternalMCBasics.g:461:2: ( 'char' )
                    // InternalMCBasics.g:462:3: 'char'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:467:2: ( 'float' )
                    {
                    // InternalMCBasics.g:467:2: ( 'float' )
                    // InternalMCBasics.g:468:3: 'float'
                    {
                     before(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMCBasics.g:473:2: ( 'double' )
                    {
                    // InternalMCBasics.g:473:2: ( 'double' )
                    // InternalMCBasics.g:474:3: 'double'
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
    // InternalMCBasics.g:483:1: rule__MCObjectType__TypeAlternatives_0 : ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) );
    public final void rule__MCObjectType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:487:1: ( ( 'Boolean' ) | ( 'Byte' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Char' ) | ( 'Double' ) | ( 'String' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 26:
                {
                alt3=6;
                }
                break;
            case 27:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMCBasics.g:488:2: ( 'Boolean' )
                    {
                    // InternalMCBasics.g:488:2: ( 'Boolean' )
                    // InternalMCBasics.g:489:3: 'Boolean'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:494:2: ( 'Byte' )
                    {
                    // InternalMCBasics.g:494:2: ( 'Byte' )
                    // InternalMCBasics.g:495:3: 'Byte'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:500:2: ( 'Integer' )
                    {
                    // InternalMCBasics.g:500:2: ( 'Integer' )
                    // InternalMCBasics.g:501:3: 'Integer'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:506:2: ( 'Long' )
                    {
                    // InternalMCBasics.g:506:2: ( 'Long' )
                    // InternalMCBasics.g:507:3: 'Long'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:512:2: ( 'Char' )
                    {
                    // InternalMCBasics.g:512:2: ( 'Char' )
                    // InternalMCBasics.g:513:3: 'Char'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:518:2: ( 'Double' )
                    {
                    // InternalMCBasics.g:518:2: ( 'Double' )
                    // InternalMCBasics.g:519:3: 'Double'
                    {
                     before(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:524:2: ( 'String' )
                    {
                    // InternalMCBasics.g:524:2: ( 'String' )
                    // InternalMCBasics.g:525:3: 'String'
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
    // InternalMCBasics.g:534:1: rule__MCCollectionType__CollectionAlternatives_0_0 : ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) );
    public final void rule__MCCollectionType__CollectionAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:538:1: ( ( 'Set' ) | ( 'List' ) | ( 'Map' ) | ( 'Optional' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMCBasics.g:539:2: ( 'Set' )
                    {
                    // InternalMCBasics.g:539:2: ( 'Set' )
                    // InternalMCBasics.g:540:3: 'Set'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:545:2: ( 'List' )
                    {
                    // InternalMCBasics.g:545:2: ( 'List' )
                    // InternalMCBasics.g:546:3: 'List'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:551:2: ( 'Map' )
                    {
                    // InternalMCBasics.g:551:2: ( 'Map' )
                    // InternalMCBasics.g:552:3: 'Map'
                    {
                     before(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:557:2: ( 'Optional' )
                    {
                    // InternalMCBasics.g:557:2: ( 'Optional' )
                    // InternalMCBasics.g:558:3: 'Optional'
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
    // InternalMCBasics.g:567:1: rule__Expression__Alternatives : ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:571:1: ( ( ruleNameExpression ) | ( ruleLiteralExpression ) | ( ruleBinaryExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=32 && LA5_1<=39)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF) ) {
                    alt5=1;
                }
                else if ( ((LA5_2>=32 && LA5_2<=39)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==EOF) ) {
                    alt5=2;
                }
                else if ( ((LA5_3>=32 && LA5_3<=39)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==EOF) ) {
                    alt5=2;
                }
                else if ( ((LA5_4>=32 && LA5_4<=39)) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMCBasics.g:572:2: ( ruleNameExpression )
                    {
                    // InternalMCBasics.g:572:2: ( ruleNameExpression )
                    // InternalMCBasics.g:573:3: ruleNameExpression
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
                    // InternalMCBasics.g:578:2: ( ruleLiteralExpression )
                    {
                    // InternalMCBasics.g:578:2: ( ruleLiteralExpression )
                    // InternalMCBasics.g:579:3: ruleLiteralExpression
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
                    // InternalMCBasics.g:584:2: ( ruleBinaryExpression )
                    {
                    // InternalMCBasics.g:584:2: ( ruleBinaryExpression )
                    // InternalMCBasics.g:585:3: ruleBinaryExpression
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
    // InternalMCBasics.g:594:1: rule__LiteralExpression__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:598:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMCBasics.g:599:2: ( ruleNumberLiteral )
                    {
                    // InternalMCBasics.g:599:2: ( ruleNumberLiteral )
                    // InternalMCBasics.g:600:3: ruleNumberLiteral
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
                    // InternalMCBasics.g:605:2: ( ruleStringLiteral )
                    {
                    // InternalMCBasics.g:605:2: ( ruleStringLiteral )
                    // InternalMCBasics.g:606:3: ruleStringLiteral
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
    // InternalMCBasics.g:615:1: rule__NameExpression__Alternatives : ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) );
    public final void rule__NameExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:619:1: ( ( ( rule__NameExpression__NameAssignment_0 ) ) | ( ( rule__NameExpression__QualifiednameAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_MCQUALIFIEDNAME) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMCBasics.g:620:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    {
                    // InternalMCBasics.g:620:2: ( ( rule__NameExpression__NameAssignment_0 ) )
                    // InternalMCBasics.g:621:3: ( rule__NameExpression__NameAssignment_0 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getNameAssignment_0()); 
                    // InternalMCBasics.g:622:3: ( rule__NameExpression__NameAssignment_0 )
                    // InternalMCBasics.g:622:4: rule__NameExpression__NameAssignment_0
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
                    // InternalMCBasics.g:626:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    {
                    // InternalMCBasics.g:626:2: ( ( rule__NameExpression__QualifiednameAssignment_1 ) )
                    // InternalMCBasics.g:627:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    {
                     before(grammarAccess.getNameExpressionAccess().getQualifiednameAssignment_1()); 
                    // InternalMCBasics.g:628:3: ( rule__NameExpression__QualifiednameAssignment_1 )
                    // InternalMCBasics.g:628:4: rule__NameExpression__QualifiednameAssignment_1
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
    // InternalMCBasics.g:636:1: rule__BinaryExpression__Literal1Alternatives_0_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:640:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_STRING)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_MCQUALIFIEDNAME||LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMCBasics.g:641:2: ( ruleLiteralExpression )
                    {
                    // InternalMCBasics.g:641:2: ( ruleLiteralExpression )
                    // InternalMCBasics.g:642:3: ruleLiteralExpression
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
                    // InternalMCBasics.g:647:2: ( ruleNameExpression )
                    {
                    // InternalMCBasics.g:647:2: ( ruleNameExpression )
                    // InternalMCBasics.g:648:3: ruleNameExpression
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
    // InternalMCBasics.g:657:1: rule__BinaryExpression__Literal2Alternatives_2_0 : ( ( ruleLiteralExpression ) | ( ruleNameExpression ) );
    public final void rule__BinaryExpression__Literal2Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:661:1: ( ( ruleLiteralExpression ) | ( ruleNameExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_MCQUALIFIEDNAME||LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMCBasics.g:662:2: ( ruleLiteralExpression )
                    {
                    // InternalMCBasics.g:662:2: ( ruleLiteralExpression )
                    // InternalMCBasics.g:663:3: ruleLiteralExpression
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
                    // InternalMCBasics.g:668:2: ( ruleNameExpression )
                    {
                    // InternalMCBasics.g:668:2: ( ruleNameExpression )
                    // InternalMCBasics.g:669:3: ruleNameExpression
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
    // InternalMCBasics.g:678:1: rule__Operator__Alternatives : ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:682:1: ( ( ( '>' ) ) | ( ( '<' ) ) | ( ( '==' ) ) | ( ( '&&' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '/' ) ) | ( ( '*' ) ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            case 36:
                {
                alt10=5;
                }
                break;
            case 37:
                {
                alt10=6;
                }
                break;
            case 38:
                {
                alt10=7;
                }
                break;
            case 39:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMCBasics.g:683:2: ( ( '>' ) )
                    {
                    // InternalMCBasics.g:683:2: ( ( '>' ) )
                    // InternalMCBasics.g:684:3: ( '>' )
                    {
                     before(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 
                    // InternalMCBasics.g:685:3: ( '>' )
                    // InternalMCBasics.g:685:4: '>'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:689:2: ( ( '<' ) )
                    {
                    // InternalMCBasics.g:689:2: ( ( '<' ) )
                    // InternalMCBasics.g:690:3: ( '<' )
                    {
                     before(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                    // InternalMCBasics.g:691:3: ( '<' )
                    // InternalMCBasics.g:691:4: '<'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:695:2: ( ( '==' ) )
                    {
                    // InternalMCBasics.g:695:2: ( ( '==' ) )
                    // InternalMCBasics.g:696:3: ( '==' )
                    {
                     before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 
                    // InternalMCBasics.g:697:3: ( '==' )
                    // InternalMCBasics.g:697:4: '=='
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:701:2: ( ( '&&' ) )
                    {
                    // InternalMCBasics.g:701:2: ( ( '&&' ) )
                    // InternalMCBasics.g:702:3: ( '&&' )
                    {
                     before(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 
                    // InternalMCBasics.g:703:3: ( '&&' )
                    // InternalMCBasics.g:703:4: '&&'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:707:2: ( ( '+' ) )
                    {
                    // InternalMCBasics.g:707:2: ( ( '+' ) )
                    // InternalMCBasics.g:708:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 
                    // InternalMCBasics.g:709:3: ( '+' )
                    // InternalMCBasics.g:709:4: '+'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:713:2: ( ( '-' ) )
                    {
                    // InternalMCBasics.g:713:2: ( ( '-' ) )
                    // InternalMCBasics.g:714:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 
                    // InternalMCBasics.g:715:3: ( '-' )
                    // InternalMCBasics.g:715:4: '-'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:719:2: ( ( '/' ) )
                    {
                    // InternalMCBasics.g:719:2: ( ( '/' ) )
                    // InternalMCBasics.g:720:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 
                    // InternalMCBasics.g:721:3: ( '/' )
                    // InternalMCBasics.g:721:4: '/'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMCBasics.g:725:2: ( ( '*' ) )
                    {
                    // InternalMCBasics.g:725:2: ( ( '*' ) )
                    // InternalMCBasics.g:726:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7()); 
                    // InternalMCBasics.g:727:3: ( '*' )
                    // InternalMCBasics.g:727:4: '*'
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


    // $ANTLR start "rule__ImportStatements__Group__0"
    // InternalMCBasics.g:735:1: rule__ImportStatements__Group__0 : rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 ;
    public final void rule__ImportStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:739:1: ( rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1 )
            // InternalMCBasics.g:740:2: rule__ImportStatements__Group__0__Impl rule__ImportStatements__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMCBasics.g:747:1: rule__ImportStatements__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:751:1: ( ( 'import' ) )
            // InternalMCBasics.g:752:1: ( 'import' )
            {
            // InternalMCBasics.g:752:1: ( 'import' )
            // InternalMCBasics.g:753:2: 'import'
            {
             before(grammarAccess.getImportStatementsAccess().getImportKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMCBasics.g:762:1: rule__ImportStatements__Group__1 : rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 ;
    public final void rule__ImportStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:766:1: ( rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2 )
            // InternalMCBasics.g:767:2: rule__ImportStatements__Group__1__Impl rule__ImportStatements__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMCBasics.g:774:1: rule__ImportStatements__Group__1__Impl : ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) ;
    public final void rule__ImportStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:778:1: ( ( ( rule__ImportStatements__ImportUriAssignment_1 ) ) )
            // InternalMCBasics.g:779:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            {
            // InternalMCBasics.g:779:1: ( ( rule__ImportStatements__ImportUriAssignment_1 ) )
            // InternalMCBasics.g:780:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            {
             before(grammarAccess.getImportStatementsAccess().getImportUriAssignment_1()); 
            // InternalMCBasics.g:781:2: ( rule__ImportStatements__ImportUriAssignment_1 )
            // InternalMCBasics.g:781:3: rule__ImportStatements__ImportUriAssignment_1
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
    // InternalMCBasics.g:789:1: rule__ImportStatements__Group__2 : rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 ;
    public final void rule__ImportStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:793:1: ( rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3 )
            // InternalMCBasics.g:794:2: rule__ImportStatements__Group__2__Impl rule__ImportStatements__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMCBasics.g:801:1: rule__ImportStatements__Group__2__Impl : ( ( rule__ImportStatements__StarAssignment_2 )? ) ;
    public final void rule__ImportStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:805:1: ( ( ( rule__ImportStatements__StarAssignment_2 )? ) )
            // InternalMCBasics.g:806:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            {
            // InternalMCBasics.g:806:1: ( ( rule__ImportStatements__StarAssignment_2 )? )
            // InternalMCBasics.g:807:2: ( rule__ImportStatements__StarAssignment_2 )?
            {
             before(grammarAccess.getImportStatementsAccess().getStarAssignment_2()); 
            // InternalMCBasics.g:808:2: ( rule__ImportStatements__StarAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOTSTAR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMCBasics.g:808:3: rule__ImportStatements__StarAssignment_2
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
    // InternalMCBasics.g:816:1: rule__ImportStatements__Group__3 : rule__ImportStatements__Group__3__Impl ;
    public final void rule__ImportStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:820:1: ( rule__ImportStatements__Group__3__Impl )
            // InternalMCBasics.g:821:2: rule__ImportStatements__Group__3__Impl
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
    // InternalMCBasics.g:827:1: rule__ImportStatements__Group__3__Impl : ( ';' ) ;
    public final void rule__ImportStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:831:1: ( ( ';' ) )
            // InternalMCBasics.g:832:1: ( ';' )
            {
            // InternalMCBasics.g:832:1: ( ';' )
            // InternalMCBasics.g:833:2: ';'
            {
             before(grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3()); 
            match(input,41,FOLLOW_2); 
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


    // $ANTLR start "rule__MCCollectionType__Group__0"
    // InternalMCBasics.g:843:1: rule__MCCollectionType__Group__0 : rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 ;
    public final void rule__MCCollectionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:847:1: ( rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1 )
            // InternalMCBasics.g:848:2: rule__MCCollectionType__Group__0__Impl rule__MCCollectionType__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalMCBasics.g:855:1: rule__MCCollectionType__Group__0__Impl : ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) ;
    public final void rule__MCCollectionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:859:1: ( ( ( rule__MCCollectionType__CollectionAssignment_0 ) ) )
            // InternalMCBasics.g:860:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            {
            // InternalMCBasics.g:860:1: ( ( rule__MCCollectionType__CollectionAssignment_0 ) )
            // InternalMCBasics.g:861:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAssignment_0()); 
            // InternalMCBasics.g:862:2: ( rule__MCCollectionType__CollectionAssignment_0 )
            // InternalMCBasics.g:862:3: rule__MCCollectionType__CollectionAssignment_0
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
    // InternalMCBasics.g:870:1: rule__MCCollectionType__Group__1 : rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 ;
    public final void rule__MCCollectionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:874:1: ( rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2 )
            // InternalMCBasics.g:875:2: rule__MCCollectionType__Group__1__Impl rule__MCCollectionType__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMCBasics.g:882:1: rule__MCCollectionType__Group__1__Impl : ( '<' ) ;
    public final void rule__MCCollectionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:886:1: ( ( '<' ) )
            // InternalMCBasics.g:887:1: ( '<' )
            {
            // InternalMCBasics.g:887:1: ( '<' )
            // InternalMCBasics.g:888:2: '<'
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
    // InternalMCBasics.g:897:1: rule__MCCollectionType__Group__2 : rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 ;
    public final void rule__MCCollectionType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:901:1: ( rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3 )
            // InternalMCBasics.g:902:2: rule__MCCollectionType__Group__2__Impl rule__MCCollectionType__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMCBasics.g:909:1: rule__MCCollectionType__Group__2__Impl : ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) ;
    public final void rule__MCCollectionType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:913:1: ( ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) ) )
            // InternalMCBasics.g:914:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            {
            // InternalMCBasics.g:914:1: ( ( rule__MCCollectionType__InnerTypeAssignment_2 ) )
            // InternalMCBasics.g:915:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getInnerTypeAssignment_2()); 
            // InternalMCBasics.g:916:2: ( rule__MCCollectionType__InnerTypeAssignment_2 )
            // InternalMCBasics.g:916:3: rule__MCCollectionType__InnerTypeAssignment_2
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
    // InternalMCBasics.g:924:1: rule__MCCollectionType__Group__3 : rule__MCCollectionType__Group__3__Impl ;
    public final void rule__MCCollectionType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:928:1: ( rule__MCCollectionType__Group__3__Impl )
            // InternalMCBasics.g:929:2: rule__MCCollectionType__Group__3__Impl
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
    // InternalMCBasics.g:935:1: rule__MCCollectionType__Group__3__Impl : ( '>' ) ;
    public final void rule__MCCollectionType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:939:1: ( ( '>' ) )
            // InternalMCBasics.g:940:1: ( '>' )
            {
            // InternalMCBasics.g:940:1: ( '>' )
            // InternalMCBasics.g:941:2: '>'
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
    // InternalMCBasics.g:951:1: rule__MCArrayType__Group__0 : rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 ;
    public final void rule__MCArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:955:1: ( rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1 )
            // InternalMCBasics.g:956:2: rule__MCArrayType__Group__0__Impl rule__MCArrayType__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMCBasics.g:963:1: rule__MCArrayType__Group__0__Impl : ( ruleMCPrimitiveType ) ;
    public final void rule__MCArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:967:1: ( ( ruleMCPrimitiveType ) )
            // InternalMCBasics.g:968:1: ( ruleMCPrimitiveType )
            {
            // InternalMCBasics.g:968:1: ( ruleMCPrimitiveType )
            // InternalMCBasics.g:969:2: ruleMCPrimitiveType
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
    // InternalMCBasics.g:978:1: rule__MCArrayType__Group__1 : rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 ;
    public final void rule__MCArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:982:1: ( rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2 )
            // InternalMCBasics.g:983:2: rule__MCArrayType__Group__1__Impl rule__MCArrayType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMCBasics.g:990:1: rule__MCArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__MCArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:994:1: ( ( '[' ) )
            // InternalMCBasics.g:995:1: ( '[' )
            {
            // InternalMCBasics.g:995:1: ( '[' )
            // InternalMCBasics.g:996:2: '['
            {
             before(grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMCBasics.g:1005:1: rule__MCArrayType__Group__2 : rule__MCArrayType__Group__2__Impl ;
    public final void rule__MCArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1009:1: ( rule__MCArrayType__Group__2__Impl )
            // InternalMCBasics.g:1010:2: rule__MCArrayType__Group__2__Impl
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
    // InternalMCBasics.g:1016:1: rule__MCArrayType__Group__2__Impl : ( ']' ) ;
    public final void rule__MCArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1020:1: ( ( ']' ) )
            // InternalMCBasics.g:1021:1: ( ']' )
            {
            // InternalMCBasics.g:1021:1: ( ']' )
            // InternalMCBasics.g:1022:2: ']'
            {
             before(grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMCBasics.g:1032:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1036:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalMCBasics.g:1037:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMCBasics.g:1044:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1048:1: ( ( ( rule__BinaryExpression__Literal1Assignment_0 ) ) )
            // InternalMCBasics.g:1049:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            {
            // InternalMCBasics.g:1049:1: ( ( rule__BinaryExpression__Literal1Assignment_0 ) )
            // InternalMCBasics.g:1050:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Assignment_0()); 
            // InternalMCBasics.g:1051:2: ( rule__BinaryExpression__Literal1Assignment_0 )
            // InternalMCBasics.g:1051:3: rule__BinaryExpression__Literal1Assignment_0
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
    // InternalMCBasics.g:1059:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1063:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalMCBasics.g:1064:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMCBasics.g:1071:1: rule__BinaryExpression__Group__1__Impl : ( ( rule__BinaryExpression__OpAssignment_1 ) ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1075:1: ( ( ( rule__BinaryExpression__OpAssignment_1 ) ) )
            // InternalMCBasics.g:1076:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            {
            // InternalMCBasics.g:1076:1: ( ( rule__BinaryExpression__OpAssignment_1 ) )
            // InternalMCBasics.g:1077:2: ( rule__BinaryExpression__OpAssignment_1 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getOpAssignment_1()); 
            // InternalMCBasics.g:1078:2: ( rule__BinaryExpression__OpAssignment_1 )
            // InternalMCBasics.g:1078:3: rule__BinaryExpression__OpAssignment_1
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
    // InternalMCBasics.g:1086:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1090:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalMCBasics.g:1091:2: rule__BinaryExpression__Group__2__Impl
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
    // InternalMCBasics.g:1097:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1101:1: ( ( ( rule__BinaryExpression__Literal2Assignment_2 ) ) )
            // InternalMCBasics.g:1102:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            {
            // InternalMCBasics.g:1102:1: ( ( rule__BinaryExpression__Literal2Assignment_2 ) )
            // InternalMCBasics.g:1103:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Assignment_2()); 
            // InternalMCBasics.g:1104:2: ( rule__BinaryExpression__Literal2Assignment_2 )
            // InternalMCBasics.g:1104:3: rule__BinaryExpression__Literal2Assignment_2
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
    // InternalMCBasics.g:1113:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1117:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // InternalMCBasics.g:1118:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMCBasics.g:1125:1: rule__Argument__Group__0__Impl : ( ( rule__Argument__NameAssignment_0 ) ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1129:1: ( ( ( rule__Argument__NameAssignment_0 ) ) )
            // InternalMCBasics.g:1130:1: ( ( rule__Argument__NameAssignment_0 ) )
            {
            // InternalMCBasics.g:1130:1: ( ( rule__Argument__NameAssignment_0 ) )
            // InternalMCBasics.g:1131:2: ( rule__Argument__NameAssignment_0 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_0()); 
            // InternalMCBasics.g:1132:2: ( rule__Argument__NameAssignment_0 )
            // InternalMCBasics.g:1132:3: rule__Argument__NameAssignment_0
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
    // InternalMCBasics.g:1140:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1144:1: ( rule__Argument__Group__1__Impl )
            // InternalMCBasics.g:1145:2: rule__Argument__Group__1__Impl
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
    // InternalMCBasics.g:1151:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__ExpressionAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1155:1: ( ( ( rule__Argument__ExpressionAssignment_1 ) ) )
            // InternalMCBasics.g:1156:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            {
            // InternalMCBasics.g:1156:1: ( ( rule__Argument__ExpressionAssignment_1 ) )
            // InternalMCBasics.g:1157:2: ( rule__Argument__ExpressionAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getExpressionAssignment_1()); 
            // InternalMCBasics.g:1158:2: ( rule__Argument__ExpressionAssignment_1 )
            // InternalMCBasics.g:1158:3: rule__Argument__ExpressionAssignment_1
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


    // $ANTLR start "rule__ImportStatements__ImportUriAssignment_1"
    // InternalMCBasics.g:1167:1: rule__ImportStatements__ImportUriAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__ImportStatements__ImportUriAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1171:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMCBasics.g:1172:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMCBasics.g:1172:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMCBasics.g:1173:3: RULE_MCQUALIFIEDNAME
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
    // InternalMCBasics.g:1182:1: rule__ImportStatements__StarAssignment_2 : ( RULE_DOTSTAR ) ;
    public final void rule__ImportStatements__StarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1186:1: ( ( RULE_DOTSTAR ) )
            // InternalMCBasics.g:1187:2: ( RULE_DOTSTAR )
            {
            // InternalMCBasics.g:1187:2: ( RULE_DOTSTAR )
            // InternalMCBasics.g:1188:3: RULE_DOTSTAR
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


    // $ANTLR start "rule__MCPrimitiveType__TypeAssignment"
    // InternalMCBasics.g:1197:1: rule__MCPrimitiveType__TypeAssignment : ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__MCPrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1201:1: ( ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) ) )
            // InternalMCBasics.g:1202:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalMCBasics.g:1202:2: ( ( rule__MCPrimitiveType__TypeAlternatives_0 ) )
            // InternalMCBasics.g:1203:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalMCBasics.g:1204:3: ( rule__MCPrimitiveType__TypeAlternatives_0 )
            // InternalMCBasics.g:1204:4: rule__MCPrimitiveType__TypeAlternatives_0
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
    // InternalMCBasics.g:1212:1: rule__MCObjectType__TypeAssignment : ( ( rule__MCObjectType__TypeAlternatives_0 ) ) ;
    public final void rule__MCObjectType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1216:1: ( ( ( rule__MCObjectType__TypeAlternatives_0 ) ) )
            // InternalMCBasics.g:1217:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            {
            // InternalMCBasics.g:1217:2: ( ( rule__MCObjectType__TypeAlternatives_0 ) )
            // InternalMCBasics.g:1218:3: ( rule__MCObjectType__TypeAlternatives_0 )
            {
             before(grammarAccess.getMCObjectTypeAccess().getTypeAlternatives_0()); 
            // InternalMCBasics.g:1219:3: ( rule__MCObjectType__TypeAlternatives_0 )
            // InternalMCBasics.g:1219:4: rule__MCObjectType__TypeAlternatives_0
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
    // InternalMCBasics.g:1227:1: rule__MCCollectionType__CollectionAssignment_0 : ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) ;
    public final void rule__MCCollectionType__CollectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1231:1: ( ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) ) )
            // InternalMCBasics.g:1232:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            {
            // InternalMCBasics.g:1232:2: ( ( rule__MCCollectionType__CollectionAlternatives_0_0 ) )
            // InternalMCBasics.g:1233:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            {
             before(grammarAccess.getMCCollectionTypeAccess().getCollectionAlternatives_0_0()); 
            // InternalMCBasics.g:1234:3: ( rule__MCCollectionType__CollectionAlternatives_0_0 )
            // InternalMCBasics.g:1234:4: rule__MCCollectionType__CollectionAlternatives_0_0
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
    // InternalMCBasics.g:1242:1: rule__MCCollectionType__InnerTypeAssignment_2 : ( ruleType ) ;
    public final void rule__MCCollectionType__InnerTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1246:1: ( ( ruleType ) )
            // InternalMCBasics.g:1247:2: ( ruleType )
            {
            // InternalMCBasics.g:1247:2: ( ruleType )
            // InternalMCBasics.g:1248:3: ruleType
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
    // InternalMCBasics.g:1257:1: rule__NumberLiteral__LiteralAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1261:1: ( ( RULE_INT ) )
            // InternalMCBasics.g:1262:2: ( RULE_INT )
            {
            // InternalMCBasics.g:1262:2: ( RULE_INT )
            // InternalMCBasics.g:1263:3: RULE_INT
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
    // InternalMCBasics.g:1272:1: rule__StringLiteral__LiteralAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__LiteralAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1276:1: ( ( RULE_STRING ) )
            // InternalMCBasics.g:1277:2: ( RULE_STRING )
            {
            // InternalMCBasics.g:1277:2: ( RULE_STRING )
            // InternalMCBasics.g:1278:3: RULE_STRING
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
    // InternalMCBasics.g:1287:1: rule__NameExpression__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NameExpression__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1291:1: ( ( RULE_ID ) )
            // InternalMCBasics.g:1292:2: ( RULE_ID )
            {
            // InternalMCBasics.g:1292:2: ( RULE_ID )
            // InternalMCBasics.g:1293:3: RULE_ID
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
    // InternalMCBasics.g:1302:1: rule__NameExpression__QualifiednameAssignment_1 : ( RULE_MCQUALIFIEDNAME ) ;
    public final void rule__NameExpression__QualifiednameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1306:1: ( ( RULE_MCQUALIFIEDNAME ) )
            // InternalMCBasics.g:1307:2: ( RULE_MCQUALIFIEDNAME )
            {
            // InternalMCBasics.g:1307:2: ( RULE_MCQUALIFIEDNAME )
            // InternalMCBasics.g:1308:3: RULE_MCQUALIFIEDNAME
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
    // InternalMCBasics.g:1317:1: rule__BinaryExpression__Literal1Assignment_0 : ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) ;
    public final void rule__BinaryExpression__Literal1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1321:1: ( ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) ) )
            // InternalMCBasics.g:1322:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            {
            // InternalMCBasics.g:1322:2: ( ( rule__BinaryExpression__Literal1Alternatives_0_0 ) )
            // InternalMCBasics.g:1323:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral1Alternatives_0_0()); 
            // InternalMCBasics.g:1324:3: ( rule__BinaryExpression__Literal1Alternatives_0_0 )
            // InternalMCBasics.g:1324:4: rule__BinaryExpression__Literal1Alternatives_0_0
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
    // InternalMCBasics.g:1332:1: rule__BinaryExpression__OpAssignment_1 : ( ruleOperator ) ;
    public final void rule__BinaryExpression__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1336:1: ( ( ruleOperator ) )
            // InternalMCBasics.g:1337:2: ( ruleOperator )
            {
            // InternalMCBasics.g:1337:2: ( ruleOperator )
            // InternalMCBasics.g:1338:3: ruleOperator
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
    // InternalMCBasics.g:1347:1: rule__BinaryExpression__Literal2Assignment_2 : ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) ;
    public final void rule__BinaryExpression__Literal2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1351:1: ( ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) ) )
            // InternalMCBasics.g:1352:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            {
            // InternalMCBasics.g:1352:2: ( ( rule__BinaryExpression__Literal2Alternatives_2_0 ) )
            // InternalMCBasics.g:1353:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLiteral2Alternatives_2_0()); 
            // InternalMCBasics.g:1354:3: ( rule__BinaryExpression__Literal2Alternatives_2_0 )
            // InternalMCBasics.g:1354:4: rule__BinaryExpression__Literal2Alternatives_2_0
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
    // InternalMCBasics.g:1362:1: rule__Argument__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1366:1: ( ( RULE_ID ) )
            // InternalMCBasics.g:1367:2: ( RULE_ID )
            {
            // InternalMCBasics.g:1367:2: ( RULE_ID )
            // InternalMCBasics.g:1368:3: RULE_ID
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
    // InternalMCBasics.g:1377:1: rule__Argument__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Argument__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMCBasics.g:1381:1: ( ( ruleExpression ) )
            // InternalMCBasics.g:1382:2: ( ruleExpression )
            {
            // InternalMCBasics.g:1382:2: ( ruleExpression )
            // InternalMCBasics.g:1383:3: ruleExpression
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


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\10\13\4\uffff";
    static final String dfa_3s = "\1\15\10\40\4\uffff";
    static final String dfa_4s = "\1\37\10\52\4\uffff";
    static final String dfa_5s = "\11\uffff\1\3\1\4\1\1\1\2";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
            "\1\13\11\uffff\1\14",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "393:1: rule__Type__Alternatives : ( ( ruleMCPrimitiveType ) | ( ruleMCArrayType ) | ( ruleMCObjectType ) | ( ruleMCCollectionType ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000FFFFE000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FF00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000001D0L});

}