package org.palladiosimulator.xtext.motiarc.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MCQUALIFIEDNAME", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.'", "'*'", "';'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'['", "']'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_MCQUALIFIEDNAME=4;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMCBasics.g:64:1: entryRuleImportStatements returns [EObject current=null] : iv_ruleImportStatements= ruleImportStatements EOF ;
    public final EObject entryRuleImportStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatements = null;


        try {
            // InternalMCBasics.g:64:57: (iv_ruleImportStatements= ruleImportStatements EOF )
            // InternalMCBasics.g:65:2: iv_ruleImportStatements= ruleImportStatements EOF
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
    // InternalMCBasics.g:71:1: ruleImportStatements returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleImportStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_1_0=null;
        Token otherlv_2=null;
        Token lv_star_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMCBasics.g:77:2: ( (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' ) )
            // InternalMCBasics.g:78:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' )
            {
            // InternalMCBasics.g:78:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' )
            // InternalMCBasics.g:79:3: otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementsAccess().getImportKeyword_0());
            		
            // InternalMCBasics.g:83:3: ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMCBasics.g:84:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMCBasics.g:84:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMCBasics.g:85:5: lv_importUri_1_0= RULE_MCQUALIFIEDNAME
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

            // InternalMCBasics.g:101:3: (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMCBasics.g:102:4: otherlv_2= '.' ( (lv_star_3_0= '*' ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportStatementsAccess().getFullStopKeyword_2_0());
                    			
                    // InternalMCBasics.g:106:4: ( (lv_star_3_0= '*' ) )
                    // InternalMCBasics.g:107:5: (lv_star_3_0= '*' )
                    {
                    // InternalMCBasics.g:107:5: (lv_star_3_0= '*' )
                    // InternalMCBasics.g:108:6: lv_star_3_0= '*'
                    {
                    lv_star_3_0=(Token)match(input,14,FOLLOW_6); 

                    						newLeafNode(lv_star_3_0, grammarAccess.getImportStatementsAccess().getStarAsteriskKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportStatementsRule());
                    						}
                    						setWithLastConsumed(current, "star", lv_star_3_0, "*");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImportStatementsAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleMCPrimitiveType"
    // InternalMCBasics.g:129:1: entryRuleMCPrimitiveType returns [EObject current=null] : iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF ;
    public final EObject entryRuleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCPrimitiveType = null;


        try {
            // InternalMCBasics.g:129:56: (iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF )
            // InternalMCBasics.g:130:2: iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF
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
    // InternalMCBasics.g:136:1: ruleMCPrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) ;
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
            // InternalMCBasics.g:142:2: ( ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) )
            // InternalMCBasics.g:143:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            {
            // InternalMCBasics.g:143:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            // InternalMCBasics.g:144:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            {
            // InternalMCBasics.g:144:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            // InternalMCBasics.g:145:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            {
            // InternalMCBasics.g:145:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 23:
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
                    // InternalMCBasics.g:146:5: lv_type_0_1= 'boolean'
                    {
                    lv_type_0_1=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:157:5: lv_type_0_2= 'byte'
                    {
                    lv_type_0_2=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMCBasics.g:168:5: lv_type_0_3= 'short'
                    {
                    lv_type_0_3=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMCBasics.g:179:5: lv_type_0_4= 'int'
                    {
                    lv_type_0_4=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMCBasics.g:190:5: lv_type_0_5= 'long'
                    {
                    lv_type_0_5=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMCBasics.g:201:5: lv_type_0_6= 'char'
                    {
                    lv_type_0_6=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMCBasics.g:212:5: lv_type_0_7= 'float'
                    {
                    lv_type_0_7=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMCBasics.g:223:5: lv_type_0_8= 'double'
                    {
                    lv_type_0_8=(Token)match(input,23,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMCArrayType"
    // InternalMCBasics.g:239:1: entryRuleMCArrayType returns [EObject current=null] : iv_ruleMCArrayType= ruleMCArrayType EOF ;
    public final EObject entryRuleMCArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCArrayType = null;


        try {
            // InternalMCBasics.g:239:52: (iv_ruleMCArrayType= ruleMCArrayType EOF )
            // InternalMCBasics.g:240:2: iv_ruleMCArrayType= ruleMCArrayType EOF
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
    // InternalMCBasics.g:246:1: ruleMCArrayType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleMCArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_MCPrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:252:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) )
            // InternalMCBasics.g:253:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalMCBasics.g:253:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            // InternalMCBasics.g:254:3: this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']'
            {

            			newCompositeNode(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_MCPrimitiveType_0=ruleMCPrimitiveType();

            state._fsp--;


            			current = this_MCPrimitiveType_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMCBasics.g:274:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMCBasics.g:274:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMCBasics.g:275:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMCBasics.g:281:1: ruleExpression returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LiteralExpression_1 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:287:2: ( (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression ) )
            // InternalMCBasics.g:288:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression )
            {
            // InternalMCBasics.g:288:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_STRING)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMCBasics.g:289:3: this_NameExpression_0= ruleNameExpression
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
                    // InternalMCBasics.g:298:3: this_LiteralExpression_1= ruleLiteralExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralExpression_1=ruleLiteralExpression();

                    state._fsp--;


                    			current = this_LiteralExpression_1;
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
    // InternalMCBasics.g:310:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMCBasics.g:310:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMCBasics.g:311:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalMCBasics.g:317:1: ruleLiteralExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:323:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalMCBasics.g:324:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalMCBasics.g:324:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMCBasics.g:325:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalMCBasics.g:334:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalMCBasics.g:346:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMCBasics.g:346:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMCBasics.g:347:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalMCBasics.g:353:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMCBasics.g:359:2: ( ( (lv_literal_0_0= RULE_INT ) ) )
            // InternalMCBasics.g:360:2: ( (lv_literal_0_0= RULE_INT ) )
            {
            // InternalMCBasics.g:360:2: ( (lv_literal_0_0= RULE_INT ) )
            // InternalMCBasics.g:361:3: (lv_literal_0_0= RULE_INT )
            {
            // InternalMCBasics.g:361:3: (lv_literal_0_0= RULE_INT )
            // InternalMCBasics.g:362:4: lv_literal_0_0= RULE_INT
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
    // InternalMCBasics.g:381:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMCBasics.g:381:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMCBasics.g:382:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMCBasics.g:388:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMCBasics.g:394:2: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // InternalMCBasics.g:395:2: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // InternalMCBasics.g:395:2: ( (lv_literal_0_0= RULE_STRING ) )
            // InternalMCBasics.g:396:3: (lv_literal_0_0= RULE_STRING )
            {
            // InternalMCBasics.g:396:3: (lv_literal_0_0= RULE_STRING )
            // InternalMCBasics.g:397:4: lv_literal_0_0= RULE_STRING
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
    // InternalMCBasics.g:416:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalMCBasics.g:416:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalMCBasics.g:417:2: iv_ruleNameExpression= ruleNameExpression EOF
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
    // InternalMCBasics.g:423:1: ruleNameExpression returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMCBasics.g:429:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMCBasics.g:430:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMCBasics.g:430:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMCBasics.g:431:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMCBasics.g:431:3: (lv_name_0_0= RULE_ID )
            // InternalMCBasics.g:432:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getNameExpressionAccess().getNameIDTerminalRuleCall_0());
            			

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


    // $ANTLR start "entryRuleArgument"
    // InternalMCBasics.g:451:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMCBasics.g:451:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMCBasics.g:452:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMCBasics.g:458:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMCBasics.g:464:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMCBasics.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMCBasics.g:465:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMCBasics.g:466:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMCBasics.g:466:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMCBasics.g:467:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMCBasics.g:467:4: (lv_name_0_0= RULE_ID )
            // InternalMCBasics.g:468:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalMCBasics.g:484:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMCBasics.g:485:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMCBasics.g:485:4: (lv_expression_1_0= ruleExpression )
            // InternalMCBasics.g:486:5: lv_expression_1_0= ruleExpression
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000E0L});

}