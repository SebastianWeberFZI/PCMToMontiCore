package org.palladiosimulator.xtext.motiarc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.palladiosimulator.xtext.motiarc.services.MCBasicsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCBasicsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_DOTSTAR", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'<'", "'>'", "'['", "']'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'"
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

        public InternalMCBasicsParser(TokenStream input, MCBasicsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ImportStatements";
       	}

       	@Override
       	protected MCBasicsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleImportStatements"
    // InternalMCBasics.g:65:1: entryRuleImportStatements returns [EObject current=null] : iv_ruleImportStatements= ruleImportStatements EOF ;
    public final EObject entryRuleImportStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatements = null;


        try {
            // InternalMCBasics.g:65:57: (iv_ruleImportStatements= ruleImportStatements EOF )
            // InternalMCBasics.g:66:2: iv_ruleImportStatements= ruleImportStatements EOF
            {
             newCompositeNode(grammarAccess.getImportStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportStatements=ruleImportStatements();

            state._fsp--;

             current =iv_ruleImportStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatements"


    // $ANTLR start "ruleImportStatements"
    // InternalMCBasics.g:72:1: ruleImportStatements returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) ;
    public final EObject ruleImportStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_1_0=null;
        Token lv_star_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMCBasics.g:78:2: ( (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) )
            // InternalMCBasics.g:79:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            {
            // InternalMCBasics.g:79:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            // InternalMCBasics.g:80:3: otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementsAccess().getImportKeyword_0());
            		
            // InternalMCBasics.g:84:3: ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMCBasics.g:85:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMCBasics.g:85:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMCBasics.g:86:5: lv_importUri_1_0= RULE_MCQUALIFIEDNAME
            {
            lv_importUri_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_4); 

            					newLeafNode(lv_importUri_1_0, grammarAccess.getImportStatementsAccess().getImportUriMCQUALIFIEDNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportStatementsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importUri",
            						lv_importUri_1_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
            				

            }


            }

            // InternalMCBasics.g:102:3: ( (lv_star_2_0= RULE_DOTSTAR ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_DOTSTAR) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMCBasics.g:103:4: (lv_star_2_0= RULE_DOTSTAR )
                    {
                    // InternalMCBasics.g:103:4: (lv_star_2_0= RULE_DOTSTAR )
                    // InternalMCBasics.g:104:5: lv_star_2_0= RULE_DOTSTAR
                    {
                    lv_star_2_0=(Token)match(input,RULE_DOTSTAR,FOLLOW_5); 

                    					newLeafNode(lv_star_2_0, grammarAccess.getImportStatementsAccess().getStarDOTSTARTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImportStatementsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"star",
                    						lv_star_2_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MCBasics.DOTSTAR");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatements"


    // $ANTLR start "entryRuleType"
    // InternalMCBasics.g:128:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMCBasics.g:128:45: (iv_ruleType= ruleType EOF )
            // InternalMCBasics.g:129:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMCBasics.g:135:1: ruleType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MCPrimitiveType_0 = null;

        EObject this_MCArrayType_1 = null;

        EObject this_MCObjectType_2 = null;

        EObject this_MCCollectionType_3 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:141:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) )
            // InternalMCBasics.g:142:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            {
            // InternalMCBasics.g:142:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMCBasics.g:143:3: this_MCPrimitiveType_0= ruleMCPrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCPrimitiveType_0=ruleMCPrimitiveType();

                    state._fsp--;


                    			current = this_MCPrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:152:3: this_MCArrayType_1= ruleMCArrayType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCArrayType_1=ruleMCArrayType();

                    state._fsp--;


                    			current = this_MCArrayType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:161:3: this_MCObjectType_2= ruleMCObjectType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCObjectTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCObjectType_2=ruleMCObjectType();

                    state._fsp--;


                    			current = this_MCObjectType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:170:3: this_MCCollectionType_3= ruleMCCollectionType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCCollectionTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCCollectionType_3=ruleMCCollectionType();

                    state._fsp--;


                    			current = this_MCCollectionType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMCPrimitiveType"
    // InternalMCBasics.g:182:1: entryRuleMCPrimitiveType returns [EObject current=null] : iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF ;
    public final EObject entryRuleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCPrimitiveType = null;


        try {
            // InternalMCBasics.g:182:56: (iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF )
            // InternalMCBasics.g:183:2: iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getMCPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCPrimitiveType=ruleMCPrimitiveType();

            state._fsp--;

             current =iv_ruleMCPrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCPrimitiveType"


    // $ANTLR start "ruleMCPrimitiveType"
    // InternalMCBasics.g:189:1: ruleMCPrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) ;
    public final EObject ruleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;
        Token lv_type_0_8=null;


        	enterRule();

        try {
            // InternalMCBasics.g:195:2: ( ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) )
            // InternalMCBasics.g:196:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            {
            // InternalMCBasics.g:196:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            // InternalMCBasics.g:197:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            {
            // InternalMCBasics.g:197:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            // InternalMCBasics.g:198:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            {
            // InternalMCBasics.g:198:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            case 22:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMCBasics.g:199:5: lv_type_0_1= 'boolean'
                    {
                    lv_type_0_1=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:210:5: lv_type_0_2= 'byte'
                    {
                    lv_type_0_2=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:221:5: lv_type_0_3= 'short'
                    {
                    lv_type_0_3=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:232:5: lv_type_0_4= 'int'
                    {
                    lv_type_0_4=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:243:5: lv_type_0_5= 'long'
                    {
                    lv_type_0_5=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:254:5: lv_type_0_6= 'char'
                    {
                    lv_type_0_6=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:265:5: lv_type_0_7= 'float'
                    {
                    lv_type_0_7=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMCBasics.g:276:5: lv_type_0_8= 'double'
                    {
                    lv_type_0_8=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_0_8, grammarAccess.getMCPrimitiveTypeAccess().getTypeDoubleKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_8, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCPrimitiveType"


    // $ANTLR start "entryRuleMCObjectType"
    // InternalMCBasics.g:292:1: entryRuleMCObjectType returns [EObject current=null] : iv_ruleMCObjectType= ruleMCObjectType EOF ;
    public final EObject entryRuleMCObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCObjectType = null;


        try {
            // InternalMCBasics.g:292:53: (iv_ruleMCObjectType= ruleMCObjectType EOF )
            // InternalMCBasics.g:293:2: iv_ruleMCObjectType= ruleMCObjectType EOF
            {
             newCompositeNode(grammarAccess.getMCObjectTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCObjectType=ruleMCObjectType();

            state._fsp--;

             current =iv_ruleMCObjectType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCObjectType"


    // $ANTLR start "ruleMCObjectType"
    // InternalMCBasics.g:299:1: ruleMCObjectType returns [EObject current=null] : ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) ;
    public final EObject ruleMCObjectType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;
        Token lv_type_0_7=null;


        	enterRule();

        try {
            // InternalMCBasics.g:305:2: ( ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) )
            // InternalMCBasics.g:306:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            {
            // InternalMCBasics.g:306:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            // InternalMCBasics.g:307:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            {
            // InternalMCBasics.g:307:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            // InternalMCBasics.g:308:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            {
            // InternalMCBasics.g:308:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            case 29:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMCBasics.g:309:5: lv_type_0_1= 'Boolean'
                    {
                    lv_type_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:320:5: lv_type_0_2= 'Byte'
                    {
                    lv_type_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:331:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:342:5: lv_type_0_4= 'Long'
                    {
                    lv_type_0_4=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:353:5: lv_type_0_5= 'Char'
                    {
                    lv_type_0_5=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:364:5: lv_type_0_6= 'Double'
                    {
                    lv_type_0_6=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:375:5: lv_type_0_7= 'String'
                    {
                    lv_type_0_7=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCObjectTypeAccess().getTypeStringKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCObjectType"


    // $ANTLR start "entryRuleMCCollectionType"
    // InternalMCBasics.g:391:1: entryRuleMCCollectionType returns [EObject current=null] : iv_ruleMCCollectionType= ruleMCCollectionType EOF ;
    public final EObject entryRuleMCCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCCollectionType = null;


        try {
            // InternalMCBasics.g:391:57: (iv_ruleMCCollectionType= ruleMCCollectionType EOF )
            // InternalMCBasics.g:392:2: iv_ruleMCCollectionType= ruleMCCollectionType EOF
            {
             newCompositeNode(grammarAccess.getMCCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCCollectionType=ruleMCCollectionType();

            state._fsp--;

             current =iv_ruleMCCollectionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCCollectionType"


    // $ANTLR start "ruleMCCollectionType"
    // InternalMCBasics.g:398:1: ruleMCCollectionType returns [EObject current=null] : ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) ;
    public final EObject ruleMCCollectionType() throws RecognitionException {
        EObject current = null;

        Token lv_collection_0_1=null;
        Token lv_collection_0_2=null;
        Token lv_collection_0_3=null;
        Token lv_collection_0_4=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_innerType_2_0 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:404:2: ( ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalMCBasics.g:405:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalMCBasics.g:405:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalMCBasics.g:406:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalMCBasics.g:406:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) )
            // InternalMCBasics.g:407:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            {
            // InternalMCBasics.g:407:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            // InternalMCBasics.g:408:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            {
            // InternalMCBasics.g:408:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case 31:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 33:
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
                    // InternalMCBasics.g:409:6: lv_collection_0_1= 'Set'
                    {
                    lv_collection_0_1=(Token)match(input,30,FOLLOW_6); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:420:6: lv_collection_0_2= 'List'
                    {
                    lv_collection_0_2=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:431:6: lv_collection_0_3= 'Map'
                    {
                    lv_collection_0_3=(Token)match(input,32,FOLLOW_6); 

                    						newLeafNode(lv_collection_0_3, grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:442:6: lv_collection_0_4= 'Optional'
                    {
                    lv_collection_0_4=(Token)match(input,33,FOLLOW_6); 

                    						newLeafNode(lv_collection_0_4, grammarAccess.getMCCollectionTypeAccess().getCollectionOptionalKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalMCBasics.g:459:3: ( (lv_innerType_2_0= ruleType ) )
            // InternalMCBasics.g:460:4: (lv_innerType_2_0= ruleType )
            {
            // InternalMCBasics.g:460:4: (lv_innerType_2_0= ruleType )
            // InternalMCBasics.g:461:5: lv_innerType_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_innerType_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMCCollectionTypeRule());
            					}
            					set(
            						current,
            						"innerType",
            						lv_innerType_2_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMCCollectionTypeAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCCollectionType"


    // $ANTLR start "entryRuleMCArrayType"
    // InternalMCBasics.g:486:1: entryRuleMCArrayType returns [EObject current=null] : iv_ruleMCArrayType= ruleMCArrayType EOF ;
    public final EObject entryRuleMCArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCArrayType = null;


        try {
            // InternalMCBasics.g:486:52: (iv_ruleMCArrayType= ruleMCArrayType EOF )
            // InternalMCBasics.g:487:2: iv_ruleMCArrayType= ruleMCArrayType EOF
            {
             newCompositeNode(grammarAccess.getMCArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCArrayType=ruleMCArrayType();

            state._fsp--;

             current =iv_ruleMCArrayType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCArrayType"


    // $ANTLR start "ruleMCArrayType"
    // InternalMCBasics.g:493:1: ruleMCArrayType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleMCArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_MCPrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:499:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) )
            // InternalMCBasics.g:500:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalMCBasics.g:500:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            // InternalMCBasics.g:501:3: this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']'
            {

            			newCompositeNode(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_MCPrimitiveType_0=ruleMCPrimitiveType();

            state._fsp--;


            			current = this_MCPrimitiveType_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMCArrayTypeAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCArrayType"


    // $ANTLR start "entryRuleExpression"
    // InternalMCBasics.g:521:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMCBasics.g:521:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMCBasics.g:522:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMCBasics.g:528:1: ruleExpression returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_BinaryExpression_2 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:534:2: ( (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) )
            // InternalMCBasics.g:535:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            {
            // InternalMCBasics.g:535:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=34 && LA6_1<=35)||(LA6_1>=38 && LA6_1<=43)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=34 && LA6_2<=35)||(LA6_2>=38 && LA6_2<=43)) ) {
                    alt6=3;
                }
                else if ( (LA6_2==EOF) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_3 = input.LA(2);

                if ( ((LA6_3>=34 && LA6_3<=35)||(LA6_3>=38 && LA6_3<=43)) ) {
                    alt6=3;
                }
                else if ( (LA6_3==EOF) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=34 && LA6_4<=35)||(LA6_4>=38 && LA6_4<=43)) ) {
                    alt6=3;
                }
                else if ( (LA6_4==EOF) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMCBasics.g:536:3: this_NameExpression_0= ruleNameExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNameExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameExpression_0=ruleNameExpression();

                    state._fsp--;


                    			current = this_NameExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:545:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:554:3: this_BinaryExpression_2= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_2=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalMCBasics.g:566:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMCBasics.g:566:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMCBasics.g:567:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalMCBasics.g:573:1: ruleLiteralExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:579:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalMCBasics.g:580:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalMCBasics.g:580:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
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
                    // InternalMCBasics.g:581:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:590:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralExpressionAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMCBasics.g:602:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMCBasics.g:602:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMCBasics.g:603:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMCBasics.g:609:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMCBasics.g:615:2: ( ( (lv_literal_0_0= RULE_INT ) ) )
            // InternalMCBasics.g:616:2: ( (lv_literal_0_0= RULE_INT ) )
            {
            // InternalMCBasics.g:616:2: ( (lv_literal_0_0= RULE_INT ) )
            // InternalMCBasics.g:617:3: (lv_literal_0_0= RULE_INT )
            {
            // InternalMCBasics.g:617:3: (lv_literal_0_0= RULE_INT )
            // InternalMCBasics.g:618:4: lv_literal_0_0= RULE_INT
            {
            lv_literal_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_literal_0_0, grammarAccess.getNumberLiteralAccess().getLiteralINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMCBasics.g:637:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMCBasics.g:637:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMCBasics.g:638:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMCBasics.g:644:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMCBasics.g:650:2: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // InternalMCBasics.g:651:2: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // InternalMCBasics.g:651:2: ( (lv_literal_0_0= RULE_STRING ) )
            // InternalMCBasics.g:652:3: (lv_literal_0_0= RULE_STRING )
            {
            // InternalMCBasics.g:652:3: (lv_literal_0_0= RULE_STRING )
            // InternalMCBasics.g:653:4: lv_literal_0_0= RULE_STRING
            {
            lv_literal_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_literal_0_0, grammarAccess.getStringLiteralAccess().getLiteralSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"literal",
            					lv_literal_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNameExpression"
    // InternalMCBasics.g:672:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalMCBasics.g:672:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalMCBasics.g:673:2: iv_ruleNameExpression= ruleNameExpression EOF
            {
             newCompositeNode(grammarAccess.getNameExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameExpression=ruleNameExpression();

            state._fsp--;

             current =iv_ruleNameExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExpression"


    // $ANTLR start "ruleNameExpression"
    // InternalMCBasics.g:679:1: ruleNameExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_qualifiedname_1_0=null;


        	enterRule();

        try {
            // InternalMCBasics.g:685:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) )
            // InternalMCBasics.g:686:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            {
            // InternalMCBasics.g:686:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_MCQUALIFIEDNAME) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMCBasics.g:687:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalMCBasics.g:687:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalMCBasics.g:688:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalMCBasics.g:688:4: (lv_name_0_0= RULE_ID )
                    // InternalMCBasics.g:689:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:706:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    {
                    // InternalMCBasics.g:706:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    // InternalMCBasics.g:707:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMCBasics.g:707:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    // InternalMCBasics.g:708:5: lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME
                    {
                    lv_qualifiedname_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_2); 

                    					newLeafNode(lv_qualifiedname_1_0, grammarAccess.getNameExpressionAccess().getQualifiednameMCQUALIFIEDNAMETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNameExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"qualifiedname",
                    						lv_qualifiedname_1_0,
                    						"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExpression"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalMCBasics.g:728:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMCBasics.g:728:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMCBasics.g:729:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalMCBasics.g:735:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal1_0_1 = null;

        EObject lv_literal1_0_2 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_literal2_2_1 = null;

        EObject lv_literal2_2_2 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:741:2: ( ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) )
            // InternalMCBasics.g:742:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            {
            // InternalMCBasics.g:742:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            // InternalMCBasics.g:743:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            {
            // InternalMCBasics.g:743:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) )
            // InternalMCBasics.g:744:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            {
            // InternalMCBasics.g:744:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            // InternalMCBasics.g:745:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
            {
            // InternalMCBasics.g:745:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
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
                    // InternalMCBasics.g:746:6: lv_literal1_0_1= ruleLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_literal1_0_1=ruleLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal1",
                    							lv_literal1_0_1,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.LiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:762:6: lv_literal1_0_2= ruleNameExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_11);
                    lv_literal1_0_2=ruleNameExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal1",
                    							lv_literal1_0_2,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.NameExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMCBasics.g:780:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalMCBasics.g:781:4: (lv_op_1_0= ruleOperator )
            {
            // InternalMCBasics.g:781:4: (lv_op_1_0= ruleOperator )
            // InternalMCBasics.g:782:5: lv_op_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_op_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMCBasics.g:799:3: ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            // InternalMCBasics.g:800:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            {
            // InternalMCBasics.g:800:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            // InternalMCBasics.g:801:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            {
            // InternalMCBasics.g:801:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_MCQUALIFIEDNAME||LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMCBasics.g:802:6: lv_literal2_2_1= ruleLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral2LiteralExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literal2_2_1=ruleLiteralExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal2",
                    							lv_literal2_2_1,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.LiteralExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:818:6: lv_literal2_2_2= ruleNameExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral2NameExpressionParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_literal2_2_2=ruleNameExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"literal2",
                    							lv_literal2_2_2,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.NameExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleArgument"
    // InternalMCBasics.g:840:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMCBasics.g:840:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMCBasics.g:841:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalMCBasics.g:847:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:853:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMCBasics.g:854:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMCBasics.g:854:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMCBasics.g:855:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMCBasics.g:855:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMCBasics.g:856:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMCBasics.g:856:4: (lv_name_0_0= RULE_ID )
            // InternalMCBasics.g:857:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgumentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0 != null,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMCBasics.g:873:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMCBasics.g:874:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMCBasics.g:874:4: (lv_expression_1_0= ruleExpression )
            // InternalMCBasics.g:875:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getArgumentAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "ruleOperator"
    // InternalMCBasics.g:896:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMCBasics.g:902:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) )
            // InternalMCBasics.g:903:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            {
            // InternalMCBasics.g:903:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            int alt11=8;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 38:
                {
                alt11=3;
                }
                break;
            case 39:
                {
                alt11=4;
                }
                break;
            case 40:
                {
                alt11=5;
                }
                break;
            case 41:
                {
                alt11=6;
                }
                break;
            case 42:
                {
                alt11=7;
                }
                break;
            case 43:
                {
                alt11=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMCBasics.g:904:3: (enumLiteral_0= '>' )
                    {
                    // InternalMCBasics.g:904:3: (enumLiteral_0= '>' )
                    // InternalMCBasics.g:905:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:912:3: (enumLiteral_1= '<' )
                    {
                    // InternalMCBasics.g:912:3: (enumLiteral_1= '<' )
                    // InternalMCBasics.g:913:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:920:3: (enumLiteral_2= '==' )
                    {
                    // InternalMCBasics.g:920:3: (enumLiteral_2= '==' )
                    // InternalMCBasics.g:921:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:928:3: (enumLiteral_3= '&&' )
                    {
                    // InternalMCBasics.g:928:3: (enumLiteral_3= '&&' )
                    // InternalMCBasics.g:929:4: enumLiteral_3= '&&'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:936:3: (enumLiteral_4= '+' )
                    {
                    // InternalMCBasics.g:936:3: (enumLiteral_4= '+' )
                    // InternalMCBasics.g:937:4: enumLiteral_4= '+'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:944:3: (enumLiteral_5= '-' )
                    {
                    // InternalMCBasics.g:944:3: (enumLiteral_5= '-' )
                    // InternalMCBasics.g:945:4: enumLiteral_5= '-'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:952:3: (enumLiteral_6= '/' )
                    {
                    // InternalMCBasics.g:952:3: (enumLiteral_6= '/' )
                    // InternalMCBasics.g:953:4: enumLiteral_6= '/'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMCBasics.g:960:3: (enumLiteral_7= '*' )
                    {
                    // InternalMCBasics.g:960:3: (enumLiteral_7= '*' )
                    // InternalMCBasics.g:961:4: enumLiteral_7= '*'
                    {
                    enumLiteral_7=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getOperatorAccess().getMULTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\10\13\4\uffff";
    static final String dfa_3s = "\1\17\10\43\4\uffff";
    static final String dfa_4s = "\1\41\10\44\4\uffff";
    static final String dfa_5s = "\11\uffff\1\3\1\4\1\1\1\2";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
            "\1\13\1\14",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "142:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000003FFFF8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000FCC00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000001D0L});

}