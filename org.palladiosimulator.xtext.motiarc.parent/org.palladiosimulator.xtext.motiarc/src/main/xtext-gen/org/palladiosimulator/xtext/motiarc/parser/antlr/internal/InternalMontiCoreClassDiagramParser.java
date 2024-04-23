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
import org.palladiosimulator.xtext.motiarc.services.MontiCoreClassDiagramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiCoreClassDiagramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_DOTSTAR", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'classdiagram'", "'{'", "'}'", "'public'", "'class'", "'extends'", "'implements'", "','", "'enum'", "';'", "'import'", "'package'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'<'", "'>'", "'['", "']'", "'=='", "'&&'", "'+'", "'-'", "'/'", "'*'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int RULE_MCQUALIFIEDNAME=5;
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

        public InternalMontiCoreClassDiagramParser(TokenStream input, MontiCoreClassDiagramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ClassDiagramCompilationUnit";
       	}

       	@Override
       	protected MontiCoreClassDiagramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClassDiagramCompilationUnit"
    // InternalMontiCoreClassDiagram.g:65:1: entryRuleClassDiagramCompilationUnit returns [EObject current=null] : iv_ruleClassDiagramCompilationUnit= ruleClassDiagramCompilationUnit EOF ;
    public final EObject entryRuleClassDiagramCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagramCompilationUnit = null;


        try {
            // InternalMontiCoreClassDiagram.g:65:68: (iv_ruleClassDiagramCompilationUnit= ruleClassDiagramCompilationUnit EOF )
            // InternalMontiCoreClassDiagram.g:66:2: iv_ruleClassDiagramCompilationUnit= ruleClassDiagramCompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramCompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDiagramCompilationUnit=ruleClassDiagramCompilationUnit();

            state._fsp--;

             current =iv_ruleClassDiagramCompilationUnit; 
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
    // $ANTLR end "entryRuleClassDiagramCompilationUnit"


    // $ANTLR start "ruleClassDiagramCompilationUnit"
    // InternalMontiCoreClassDiagram.g:72:1: ruleClassDiagramCompilationUnit returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) ) ;
    public final EObject ruleClassDiagramCompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_importStatements_1_0 = null;

        EObject lv_diagram_2_0 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:78:2: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) ) )
            // InternalMontiCoreClassDiagram.g:79:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) )
            {
            // InternalMontiCoreClassDiagram.g:79:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) ) )
            // InternalMontiCoreClassDiagram.g:80:3: ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_diagram_2_0= ruleClassDiagram ) )
            {
            // InternalMontiCoreClassDiagram.g:80:3: ( (lv_package_0_0= rulePackage ) )
            // InternalMontiCoreClassDiagram.g:81:4: (lv_package_0_0= rulePackage )
            {
            // InternalMontiCoreClassDiagram.g:81:4: (lv_package_0_0= rulePackage )
            // InternalMontiCoreClassDiagram.g:82:5: lv_package_0_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getClassDiagramCompilationUnitAccess().getPackagePackageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_package_0_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDiagramCompilationUnitRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_0_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiCoreClassDiagram.g:99:3: ( (lv_importStatements_1_0= ruleImportStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:100:4: (lv_importStatements_1_0= ruleImportStatements )
            	    {
            	    // InternalMontiCoreClassDiagram.g:100:4: (lv_importStatements_1_0= ruleImportStatements )
            	    // InternalMontiCoreClassDiagram.g:101:5: lv_importStatements_1_0= ruleImportStatements
            	    {

            	    					newCompositeNode(grammarAccess.getClassDiagramCompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_importStatements_1_0=ruleImportStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDiagramCompilationUnitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"importStatements",
            	    						lv_importStatements_1_0,
            	    						"org.palladiosimulator.xtext.motiarc.MCBasics.ImportStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMontiCoreClassDiagram.g:118:3: ( (lv_diagram_2_0= ruleClassDiagram ) )
            // InternalMontiCoreClassDiagram.g:119:4: (lv_diagram_2_0= ruleClassDiagram )
            {
            // InternalMontiCoreClassDiagram.g:119:4: (lv_diagram_2_0= ruleClassDiagram )
            // InternalMontiCoreClassDiagram.g:120:5: lv_diagram_2_0= ruleClassDiagram
            {

            					newCompositeNode(grammarAccess.getClassDiagramCompilationUnitAccess().getDiagramClassDiagramParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_diagram_2_0=ruleClassDiagram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDiagramCompilationUnitRule());
            					}
            					set(
            						current,
            						"diagram",
            						lv_diagram_2_0,
            						"org.palladiosimulator.xtext.motiarc.MontiCoreClassDiagram.ClassDiagram");
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
    // $ANTLR end "ruleClassDiagramCompilationUnit"


    // $ANTLR start "entryRuleClassDiagram"
    // InternalMontiCoreClassDiagram.g:141:1: entryRuleClassDiagram returns [EObject current=null] : iv_ruleClassDiagram= ruleClassDiagram EOF ;
    public final EObject entryRuleClassDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDiagram = null;


        try {
            // InternalMontiCoreClassDiagram.g:141:53: (iv_ruleClassDiagram= ruleClassDiagram EOF )
            // InternalMontiCoreClassDiagram.g:142:2: iv_ruleClassDiagram= ruleClassDiagram EOF
            {
             newCompositeNode(grammarAccess.getClassDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDiagram=ruleClassDiagram();

            state._fsp--;

             current =iv_ruleClassDiagram; 
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
    // $ANTLR end "entryRuleClassDiagram"


    // $ANTLR start "ruleClassDiagram"
    // InternalMontiCoreClassDiagram.g:148:1: ruleClassDiagram returns [EObject current=null] : (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleClassDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cdElements_3_0 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:154:2: ( (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' ) )
            // InternalMontiCoreClassDiagram.g:155:2: (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' )
            {
            // InternalMontiCoreClassDiagram.g:155:2: (otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}' )
            // InternalMontiCoreClassDiagram.g:156:3: otherlv_0= 'classdiagram' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cdElements_3_0= ruleCDDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDiagramAccess().getClassdiagramKeyword_0());
            		
            // InternalMontiCoreClassDiagram.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalMontiCoreClassDiagram.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassDiagramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClassDiagramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMontiCoreClassDiagram.g:182:3: ( (lv_cdElements_3_0= ruleCDDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:183:4: (lv_cdElements_3_0= ruleCDDefinition )
            	    {
            	    // InternalMontiCoreClassDiagram.g:183:4: (lv_cdElements_3_0= ruleCDDefinition )
            	    // InternalMontiCoreClassDiagram.g:184:5: lv_cdElements_3_0= ruleCDDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getClassDiagramAccess().getCdElementsCDDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_cdElements_3_0=ruleCDDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cdElements",
            	    						lv_cdElements_3_0,
            	    						"org.palladiosimulator.xtext.motiarc.MontiCoreClassDiagram.CDDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDiagramAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleClassDiagram"


    // $ANTLR start "entryRuleCDDefinition"
    // InternalMontiCoreClassDiagram.g:209:1: entryRuleCDDefinition returns [EObject current=null] : iv_ruleCDDefinition= ruleCDDefinition EOF ;
    public final EObject entryRuleCDDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDDefinition = null;


        try {
            // InternalMontiCoreClassDiagram.g:209:53: (iv_ruleCDDefinition= ruleCDDefinition EOF )
            // InternalMontiCoreClassDiagram.g:210:2: iv_ruleCDDefinition= ruleCDDefinition EOF
            {
             newCompositeNode(grammarAccess.getCDDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDDefinition=ruleCDDefinition();

            state._fsp--;

             current =iv_ruleCDDefinition; 
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
    // $ANTLR end "entryRuleCDDefinition"


    // $ANTLR start "ruleCDDefinition"
    // InternalMontiCoreClassDiagram.g:216:1: ruleCDDefinition returns [EObject current=null] : (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum ) ;
    public final EObject ruleCDDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CDClass_0 = null;

        EObject this_CDEnum_1 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:222:2: ( (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum ) )
            // InternalMontiCoreClassDiagram.g:223:2: (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum )
            {
            // InternalMontiCoreClassDiagram.g:223:2: (this_CDClass_0= ruleCDClass | this_CDEnum_1= ruleCDEnum )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    alt3=1;
                }
                else if ( (LA3_1==21) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:224:3: this_CDClass_0= ruleCDClass
                    {

                    			newCompositeNode(grammarAccess.getCDDefinitionAccess().getCDClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDClass_0=ruleCDClass();

                    state._fsp--;


                    			current = this_CDClass_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:233:3: this_CDEnum_1= ruleCDEnum
                    {

                    			newCompositeNode(grammarAccess.getCDDefinitionAccess().getCDEnumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CDEnum_1=ruleCDEnum();

                    state._fsp--;


                    			current = this_CDEnum_1;
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
    // $ANTLR end "ruleCDDefinition"


    // $ANTLR start "entryRuleCDClass"
    // InternalMontiCoreClassDiagram.g:245:1: entryRuleCDClass returns [EObject current=null] : iv_ruleCDClass= ruleCDClass EOF ;
    public final EObject entryRuleCDClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDClass = null;


        try {
            // InternalMontiCoreClassDiagram.g:245:48: (iv_ruleCDClass= ruleCDClass EOF )
            // InternalMontiCoreClassDiagram.g:246:2: iv_ruleCDClass= ruleCDClass EOF
            {
             newCompositeNode(grammarAccess.getCDClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDClass=ruleCDClass();

            state._fsp--;

             current =iv_ruleCDClass; 
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
    // $ANTLR end "entryRuleCDClass"


    // $ANTLR start "ruleCDClass"
    // InternalMontiCoreClassDiagram.g:252:1: ruleCDClass returns [EObject current=null] : ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) ) otherlv_11= '}' ) ;
    public final EObject ruleCDClass() throws RecognitionException {
        EObject current = null;

        Token lv_public_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_extends_4_0=null;
        Token otherlv_5=null;
        Token lv_implements_6_0=null;
        Token otherlv_7=null;
        Token lv_implements_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_members_10_0 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:258:2: ( ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) ) otherlv_11= '}' ) )
            // InternalMontiCoreClassDiagram.g:259:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) ) otherlv_11= '}' )
            {
            // InternalMontiCoreClassDiagram.g:259:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) ) otherlv_11= '}' )
            // InternalMontiCoreClassDiagram.g:260:3: ( (lv_public_0_0= 'public' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )? (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )? otherlv_9= '{' ( (lv_members_10_0= ruleMember ) ) otherlv_11= '}'
            {
            // InternalMontiCoreClassDiagram.g:260:3: ( (lv_public_0_0= 'public' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:261:4: (lv_public_0_0= 'public' )
                    {
                    // InternalMontiCoreClassDiagram.g:261:4: (lv_public_0_0= 'public' )
                    // InternalMontiCoreClassDiagram.g:262:5: lv_public_0_0= 'public'
                    {
                    lv_public_0_0=(Token)match(input,16,FOLLOW_7); 

                    					newLeafNode(lv_public_0_0, grammarAccess.getCDClassAccess().getPublicPublicKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCDClassRule());
                    					}
                    					setWithLastConsumed(current, "public", lv_public_0_0 != null, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCDClassAccess().getClassKeyword_1());
            		
            // InternalMontiCoreClassDiagram.g:278:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:279:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:279:4: (lv_name_2_0= RULE_ID )
            // InternalMontiCoreClassDiagram.g:280:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCDClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCDClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiCoreClassDiagram.g:296:3: (otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:297:4: otherlv_3= 'extends' ( (lv_extends_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getCDClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalMontiCoreClassDiagram.g:301:4: ( (lv_extends_4_0= RULE_ID ) )
                    // InternalMontiCoreClassDiagram.g:302:5: (lv_extends_4_0= RULE_ID )
                    {
                    // InternalMontiCoreClassDiagram.g:302:5: (lv_extends_4_0= RULE_ID )
                    // InternalMontiCoreClassDiagram.g:303:6: lv_extends_4_0= RULE_ID
                    {
                    lv_extends_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_extends_4_0, grammarAccess.getCDClassAccess().getExtendsIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCDClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"extends",
                    							lv_extends_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiCoreClassDiagram.g:320:3: (otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:321:4: otherlv_5= 'implements' ( (lv_implements_6_0= RULE_ID ) ) (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCDClassAccess().getImplementsKeyword_4_0());
                    			
                    // InternalMontiCoreClassDiagram.g:325:4: ( (lv_implements_6_0= RULE_ID ) )
                    // InternalMontiCoreClassDiagram.g:326:5: (lv_implements_6_0= RULE_ID )
                    {
                    // InternalMontiCoreClassDiagram.g:326:5: (lv_implements_6_0= RULE_ID )
                    // InternalMontiCoreClassDiagram.g:327:6: lv_implements_6_0= RULE_ID
                    {
                    lv_implements_6_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_implements_6_0, grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCDClassRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"implements",
                    							lv_implements_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMontiCoreClassDiagram.g:343:4: (otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMontiCoreClassDiagram.g:344:5: otherlv_7= ',' ( (lv_implements_8_0= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCDClassAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMontiCoreClassDiagram.g:348:5: ( (lv_implements_8_0= RULE_ID ) )
                    	    // InternalMontiCoreClassDiagram.g:349:6: (lv_implements_8_0= RULE_ID )
                    	    {
                    	    // InternalMontiCoreClassDiagram.g:349:6: (lv_implements_8_0= RULE_ID )
                    	    // InternalMontiCoreClassDiagram.g:350:7: lv_implements_8_0= RULE_ID
                    	    {
                    	    lv_implements_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(lv_implements_8_0, grammarAccess.getCDClassAccess().getImplementsIDTerminalRuleCall_4_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCDClassRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"implements",
                    	    								lv_implements_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getCDClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMontiCoreClassDiagram.g:372:3: ( (lv_members_10_0= ruleMember ) )
            // InternalMontiCoreClassDiagram.g:373:4: (lv_members_10_0= ruleMember )
            {
            // InternalMontiCoreClassDiagram.g:373:4: (lv_members_10_0= ruleMember )
            // InternalMontiCoreClassDiagram.g:374:5: lv_members_10_0= ruleMember
            {

            					newCompositeNode(grammarAccess.getCDClassAccess().getMembersMemberParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_members_10_0=ruleMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCDClassRule());
            					}
            					add(
            						current,
            						"members",
            						lv_members_10_0,
            						"org.palladiosimulator.xtext.motiarc.MontiCoreClassDiagram.Member");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCDClassAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleCDClass"


    // $ANTLR start "entryRuleCDEnum"
    // InternalMontiCoreClassDiagram.g:399:1: entryRuleCDEnum returns [EObject current=null] : iv_ruleCDEnum= ruleCDEnum EOF ;
    public final EObject entryRuleCDEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCDEnum = null;


        try {
            // InternalMontiCoreClassDiagram.g:399:47: (iv_ruleCDEnum= ruleCDEnum EOF )
            // InternalMontiCoreClassDiagram.g:400:2: iv_ruleCDEnum= ruleCDEnum EOF
            {
             newCompositeNode(grammarAccess.getCDEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCDEnum=ruleCDEnum();

            state._fsp--;

             current =iv_ruleCDEnum; 
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
    // $ANTLR end "entryRuleCDEnum"


    // $ANTLR start "ruleCDEnum"
    // InternalMontiCoreClassDiagram.g:406:1: ruleCDEnum returns [EObject current=null] : ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' ) ;
    public final EObject ruleCDEnum() throws RecognitionException {
        EObject current = null;

        Token lv_public_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:412:2: ( ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' ) )
            // InternalMontiCoreClassDiagram.g:413:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' )
            {
            // InternalMontiCoreClassDiagram.g:413:2: ( ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}' )
            // InternalMontiCoreClassDiagram.g:414:3: ( (lv_public_0_0= 'public' ) )? otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_values_4_0= RULE_ID ) ) otherlv_5= '}'
            {
            // InternalMontiCoreClassDiagram.g:414:3: ( (lv_public_0_0= 'public' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:415:4: (lv_public_0_0= 'public' )
                    {
                    // InternalMontiCoreClassDiagram.g:415:4: (lv_public_0_0= 'public' )
                    // InternalMontiCoreClassDiagram.g:416:5: lv_public_0_0= 'public'
                    {
                    lv_public_0_0=(Token)match(input,16,FOLLOW_13); 

                    					newLeafNode(lv_public_0_0, grammarAccess.getCDEnumAccess().getPublicPublicKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCDEnumRule());
                    					}
                    					setWithLastConsumed(current, "public", lv_public_0_0 != null, "public");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCDEnumAccess().getEnumKeyword_1());
            		
            // InternalMontiCoreClassDiagram.g:432:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:433:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:433:4: (lv_name_2_0= RULE_ID )
            // InternalMontiCoreClassDiagram.g:434:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCDEnumAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCDEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCDEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMontiCoreClassDiagram.g:454:3: ( (lv_values_4_0= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:455:4: (lv_values_4_0= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:455:4: (lv_values_4_0= RULE_ID )
            // InternalMontiCoreClassDiagram.g:456:5: lv_values_4_0= RULE_ID
            {
            lv_values_4_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_values_4_0, grammarAccess.getCDEnumAccess().getValuesIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCDEnumRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCDEnumAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCDEnum"


    // $ANTLR start "entryRuleMember"
    // InternalMontiCoreClassDiagram.g:480:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMontiCoreClassDiagram.g:480:47: (iv_ruleMember= ruleMember EOF )
            // InternalMontiCoreClassDiagram.g:481:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMontiCoreClassDiagram.g:487:1: ruleMember returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:493:2: ( ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMontiCoreClassDiagram.g:494:2: ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMontiCoreClassDiagram.g:494:2: ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMontiCoreClassDiagram.g:495:3: ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalMontiCoreClassDiagram.g:495:3: ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) ) )
            // InternalMontiCoreClassDiagram.g:496:4: ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) )
            {
            // InternalMontiCoreClassDiagram.g:496:4: ( (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition ) )
            // InternalMontiCoreClassDiagram.g:497:5: (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition )
            {
            // InternalMontiCoreClassDiagram.g:497:5: (lv_type_0_1= ruleType | lv_type_0_2= ruleCDDefinition )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=25 && LA9_0<=43)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=16 && LA9_0<=17)||LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:498:6: lv_type_0_1= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMemberAccess().getTypeTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_0_1=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_1,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:514:6: lv_type_0_2= ruleCDDefinition
                    {

                    						newCompositeNode(grammarAccess.getMemberAccess().getTypeCDDefinitionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_0_2=ruleCDDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMemberRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_2,
                    							"org.palladiosimulator.xtext.motiarc.MontiCoreClassDiagram.CDDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMontiCoreClassDiagram.g:532:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:533:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:533:4: (lv_name_1_0= RULE_ID )
            // InternalMontiCoreClassDiagram.g:534:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMemberAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiCoreClassDiagram.g:558:1: entryRuleImportStatements returns [EObject current=null] : iv_ruleImportStatements= ruleImportStatements EOF ;
    public final EObject entryRuleImportStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatements = null;


        try {
            // InternalMontiCoreClassDiagram.g:558:57: (iv_ruleImportStatements= ruleImportStatements EOF )
            // InternalMontiCoreClassDiagram.g:559:2: iv_ruleImportStatements= ruleImportStatements EOF
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
    // InternalMontiCoreClassDiagram.g:565:1: ruleImportStatements returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) ;
    public final EObject ruleImportStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_1_0=null;
        Token lv_star_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:571:2: ( (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) )
            // InternalMontiCoreClassDiagram.g:572:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            {
            // InternalMontiCoreClassDiagram.g:572:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            // InternalMontiCoreClassDiagram.g:573:3: otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementsAccess().getImportKeyword_0());
            		
            // InternalMontiCoreClassDiagram.g:577:3: ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiCoreClassDiagram.g:578:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiCoreClassDiagram.g:578:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMontiCoreClassDiagram.g:579:5: lv_importUri_1_0= RULE_MCQUALIFIEDNAME
            {
            lv_importUri_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_16); 

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

            // InternalMontiCoreClassDiagram.g:595:3: ( (lv_star_2_0= RULE_DOTSTAR ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOTSTAR) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:596:4: (lv_star_2_0= RULE_DOTSTAR )
                    {
                    // InternalMontiCoreClassDiagram.g:596:4: (lv_star_2_0= RULE_DOTSTAR )
                    // InternalMontiCoreClassDiagram.g:597:5: lv_star_2_0= RULE_DOTSTAR
                    {
                    lv_star_2_0=(Token)match(input,RULE_DOTSTAR,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

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


    // $ANTLR start "entryRulePackage"
    // InternalMontiCoreClassDiagram.g:621:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalMontiCoreClassDiagram.g:621:48: (iv_rulePackage= rulePackage EOF )
            // InternalMontiCoreClassDiagram.g:622:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMontiCoreClassDiagram.g:628:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:634:2: ( (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' ) )
            // InternalMontiCoreClassDiagram.g:635:2: (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' )
            {
            // InternalMontiCoreClassDiagram.g:635:2: (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' )
            // InternalMontiCoreClassDiagram.g:636:3: otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalMontiCoreClassDiagram.g:640:3: ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) )
            // InternalMontiCoreClassDiagram.g:641:4: ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) )
            {
            // InternalMontiCoreClassDiagram.g:641:4: ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:642:5: (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:642:5: (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID )
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
                    // InternalMontiCoreClassDiagram.g:643:6: lv_name_1_1= RULE_MCQUALIFIEDNAME
                    {
                    lv_name_1_1=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_14); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:658:6: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleType"
    // InternalMontiCoreClassDiagram.g:683:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMontiCoreClassDiagram.g:683:45: (iv_ruleType= ruleType EOF )
            // InternalMontiCoreClassDiagram.g:684:2: iv_ruleType= ruleType EOF
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
    // InternalMontiCoreClassDiagram.g:690:1: ruleType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MCPrimitiveType_0 = null;

        EObject this_MCArrayType_1 = null;

        EObject this_MCObjectType_2 = null;

        EObject this_MCCollectionType_3 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:696:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) )
            // InternalMontiCoreClassDiagram.g:697:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            {
            // InternalMontiCoreClassDiagram.g:697:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            int alt12=4;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:698:3: this_MCPrimitiveType_0= ruleMCPrimitiveType
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
                    // InternalMontiCoreClassDiagram.g:707:3: this_MCArrayType_1= ruleMCArrayType
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
                    // InternalMontiCoreClassDiagram.g:716:3: this_MCObjectType_2= ruleMCObjectType
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
                    // InternalMontiCoreClassDiagram.g:725:3: this_MCCollectionType_3= ruleMCCollectionType
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
    // InternalMontiCoreClassDiagram.g:737:1: entryRuleMCPrimitiveType returns [EObject current=null] : iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF ;
    public final EObject entryRuleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCPrimitiveType = null;


        try {
            // InternalMontiCoreClassDiagram.g:737:56: (iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF )
            // InternalMontiCoreClassDiagram.g:738:2: iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF
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
    // InternalMontiCoreClassDiagram.g:744:1: ruleMCPrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) ;
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
            // InternalMontiCoreClassDiagram.g:750:2: ( ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) )
            // InternalMontiCoreClassDiagram.g:751:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            {
            // InternalMontiCoreClassDiagram.g:751:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            // InternalMontiCoreClassDiagram.g:752:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            {
            // InternalMontiCoreClassDiagram.g:752:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            // InternalMontiCoreClassDiagram.g:753:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            {
            // InternalMontiCoreClassDiagram.g:753:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            case 29:
                {
                alt13=5;
                }
                break;
            case 30:
                {
                alt13=6;
                }
                break;
            case 31:
                {
                alt13=7;
                }
                break;
            case 32:
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
                    // InternalMontiCoreClassDiagram.g:754:5: lv_type_0_1= 'boolean'
                    {
                    lv_type_0_1=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:765:5: lv_type_0_2= 'byte'
                    {
                    lv_type_0_2=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:776:5: lv_type_0_3= 'short'
                    {
                    lv_type_0_3=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:787:5: lv_type_0_4= 'int'
                    {
                    lv_type_0_4=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiCoreClassDiagram.g:798:5: lv_type_0_5= 'long'
                    {
                    lv_type_0_5=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiCoreClassDiagram.g:809:5: lv_type_0_6= 'char'
                    {
                    lv_type_0_6=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiCoreClassDiagram.g:820:5: lv_type_0_7= 'float'
                    {
                    lv_type_0_7=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMontiCoreClassDiagram.g:831:5: lv_type_0_8= 'double'
                    {
                    lv_type_0_8=(Token)match(input,32,FOLLOW_2); 

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
    // InternalMontiCoreClassDiagram.g:847:1: entryRuleMCObjectType returns [EObject current=null] : iv_ruleMCObjectType= ruleMCObjectType EOF ;
    public final EObject entryRuleMCObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCObjectType = null;


        try {
            // InternalMontiCoreClassDiagram.g:847:53: (iv_ruleMCObjectType= ruleMCObjectType EOF )
            // InternalMontiCoreClassDiagram.g:848:2: iv_ruleMCObjectType= ruleMCObjectType EOF
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
    // InternalMontiCoreClassDiagram.g:854:1: ruleMCObjectType returns [EObject current=null] : ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) ;
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
            // InternalMontiCoreClassDiagram.g:860:2: ( ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) )
            // InternalMontiCoreClassDiagram.g:861:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            {
            // InternalMontiCoreClassDiagram.g:861:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            // InternalMontiCoreClassDiagram.g:862:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            {
            // InternalMontiCoreClassDiagram.g:862:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            // InternalMontiCoreClassDiagram.g:863:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            {
            // InternalMontiCoreClassDiagram.g:863:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            case 37:
                {
                alt14=5;
                }
                break;
            case 38:
                {
                alt14=6;
                }
                break;
            case 39:
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
                    // InternalMontiCoreClassDiagram.g:864:5: lv_type_0_1= 'Boolean'
                    {
                    lv_type_0_1=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:875:5: lv_type_0_2= 'Byte'
                    {
                    lv_type_0_2=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:886:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:897:5: lv_type_0_4= 'Long'
                    {
                    lv_type_0_4=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiCoreClassDiagram.g:908:5: lv_type_0_5= 'Char'
                    {
                    lv_type_0_5=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiCoreClassDiagram.g:919:5: lv_type_0_6= 'Double'
                    {
                    lv_type_0_6=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiCoreClassDiagram.g:930:5: lv_type_0_7= 'String'
                    {
                    lv_type_0_7=(Token)match(input,39,FOLLOW_2); 

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
    // InternalMontiCoreClassDiagram.g:946:1: entryRuleMCCollectionType returns [EObject current=null] : iv_ruleMCCollectionType= ruleMCCollectionType EOF ;
    public final EObject entryRuleMCCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCCollectionType = null;


        try {
            // InternalMontiCoreClassDiagram.g:946:57: (iv_ruleMCCollectionType= ruleMCCollectionType EOF )
            // InternalMontiCoreClassDiagram.g:947:2: iv_ruleMCCollectionType= ruleMCCollectionType EOF
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
    // InternalMontiCoreClassDiagram.g:953:1: ruleMCCollectionType returns [EObject current=null] : ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) ;
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
            // InternalMontiCoreClassDiagram.g:959:2: ( ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalMontiCoreClassDiagram.g:960:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalMontiCoreClassDiagram.g:960:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalMontiCoreClassDiagram.g:961:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalMontiCoreClassDiagram.g:961:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) )
            // InternalMontiCoreClassDiagram.g:962:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            {
            // InternalMontiCoreClassDiagram.g:962:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            // InternalMontiCoreClassDiagram.g:963:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            {
            // InternalMontiCoreClassDiagram.g:963:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt15=1;
                }
                break;
            case 41:
                {
                alt15=2;
                }
                break;
            case 42:
                {
                alt15=3;
                }
                break;
            case 43:
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
                    // InternalMontiCoreClassDiagram.g:964:6: lv_collection_0_1= 'Set'
                    {
                    lv_collection_0_1=(Token)match(input,40,FOLLOW_18); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:975:6: lv_collection_0_2= 'List'
                    {
                    lv_collection_0_2=(Token)match(input,41,FOLLOW_18); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:986:6: lv_collection_0_3= 'Map'
                    {
                    lv_collection_0_3=(Token)match(input,42,FOLLOW_18); 

                    						newLeafNode(lv_collection_0_3, grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:997:6: lv_collection_0_4= 'Optional'
                    {
                    lv_collection_0_4=(Token)match(input,43,FOLLOW_18); 

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

            otherlv_1=(Token)match(input,44,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalMontiCoreClassDiagram.g:1014:3: ( (lv_innerType_2_0= ruleType ) )
            // InternalMontiCoreClassDiagram.g:1015:4: (lv_innerType_2_0= ruleType )
            {
            // InternalMontiCoreClassDiagram.g:1015:4: (lv_innerType_2_0= ruleType )
            // InternalMontiCoreClassDiagram.g:1016:5: lv_innerType_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,45,FOLLOW_2); 

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
    // InternalMontiCoreClassDiagram.g:1041:1: entryRuleMCArrayType returns [EObject current=null] : iv_ruleMCArrayType= ruleMCArrayType EOF ;
    public final EObject entryRuleMCArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCArrayType = null;


        try {
            // InternalMontiCoreClassDiagram.g:1041:52: (iv_ruleMCArrayType= ruleMCArrayType EOF )
            // InternalMontiCoreClassDiagram.g:1042:2: iv_ruleMCArrayType= ruleMCArrayType EOF
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
    // InternalMontiCoreClassDiagram.g:1048:1: ruleMCArrayType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleMCArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_MCPrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1054:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) )
            // InternalMontiCoreClassDiagram.g:1055:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalMontiCoreClassDiagram.g:1055:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            // InternalMontiCoreClassDiagram.g:1056:3: this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']'
            {

            			newCompositeNode(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_MCPrimitiveType_0=ruleMCPrimitiveType();

            state._fsp--;


            			current = this_MCPrimitiveType_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,46,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMontiCoreClassDiagram.g:1076:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMontiCoreClassDiagram.g:1076:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMontiCoreClassDiagram.g:1077:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMontiCoreClassDiagram.g:1083:1: ruleExpression returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_BinaryExpression_2 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1089:2: ( (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) )
            // InternalMontiCoreClassDiagram.g:1090:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            {
            // InternalMontiCoreClassDiagram.g:1090:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=44 && LA16_1<=45)||(LA16_1>=48 && LA16_1<=53)) ) {
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

                if ( ((LA16_2>=44 && LA16_2<=45)||(LA16_2>=48 && LA16_2<=53)) ) {
                    alt16=3;
                }
                else if ( (LA16_2==EOF) ) {
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

                if ( ((LA16_3>=44 && LA16_3<=45)||(LA16_3>=48 && LA16_3<=53)) ) {
                    alt16=3;
                }
                else if ( (LA16_3==EOF) ) {
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

                if ( (LA16_4==EOF) ) {
                    alt16=2;
                }
                else if ( ((LA16_4>=44 && LA16_4<=45)||(LA16_4>=48 && LA16_4<=53)) ) {
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
                    // InternalMontiCoreClassDiagram.g:1091:3: this_NameExpression_0= ruleNameExpression
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
                    // InternalMontiCoreClassDiagram.g:1100:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalMontiCoreClassDiagram.g:1109:3: this_BinaryExpression_2= ruleBinaryExpression
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
    // InternalMontiCoreClassDiagram.g:1121:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMontiCoreClassDiagram.g:1121:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMontiCoreClassDiagram.g:1122:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalMontiCoreClassDiagram.g:1128:1: ruleLiteralExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1134:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalMontiCoreClassDiagram.g:1135:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalMontiCoreClassDiagram.g:1135:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
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
                    // InternalMontiCoreClassDiagram.g:1136:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalMontiCoreClassDiagram.g:1145:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalMontiCoreClassDiagram.g:1157:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMontiCoreClassDiagram.g:1157:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMontiCoreClassDiagram.g:1158:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalMontiCoreClassDiagram.g:1164:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1170:2: ( ( (lv_literal_0_0= RULE_INT ) ) )
            // InternalMontiCoreClassDiagram.g:1171:2: ( (lv_literal_0_0= RULE_INT ) )
            {
            // InternalMontiCoreClassDiagram.g:1171:2: ( (lv_literal_0_0= RULE_INT ) )
            // InternalMontiCoreClassDiagram.g:1172:3: (lv_literal_0_0= RULE_INT )
            {
            // InternalMontiCoreClassDiagram.g:1172:3: (lv_literal_0_0= RULE_INT )
            // InternalMontiCoreClassDiagram.g:1173:4: lv_literal_0_0= RULE_INT
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
    // InternalMontiCoreClassDiagram.g:1192:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMontiCoreClassDiagram.g:1192:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMontiCoreClassDiagram.g:1193:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMontiCoreClassDiagram.g:1199:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1205:2: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // InternalMontiCoreClassDiagram.g:1206:2: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // InternalMontiCoreClassDiagram.g:1206:2: ( (lv_literal_0_0= RULE_STRING ) )
            // InternalMontiCoreClassDiagram.g:1207:3: (lv_literal_0_0= RULE_STRING )
            {
            // InternalMontiCoreClassDiagram.g:1207:3: (lv_literal_0_0= RULE_STRING )
            // InternalMontiCoreClassDiagram.g:1208:4: lv_literal_0_0= RULE_STRING
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
    // InternalMontiCoreClassDiagram.g:1227:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalMontiCoreClassDiagram.g:1227:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalMontiCoreClassDiagram.g:1228:2: iv_ruleNameExpression= ruleNameExpression EOF
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
    // InternalMontiCoreClassDiagram.g:1234:1: ruleNameExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_qualifiedname_1_0=null;


        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1240:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) )
            // InternalMontiCoreClassDiagram.g:1241:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            {
            // InternalMontiCoreClassDiagram.g:1241:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
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
                    // InternalMontiCoreClassDiagram.g:1242:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalMontiCoreClassDiagram.g:1242:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalMontiCoreClassDiagram.g:1243:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalMontiCoreClassDiagram.g:1243:4: (lv_name_0_0= RULE_ID )
                    // InternalMontiCoreClassDiagram.g:1244:5: lv_name_0_0= RULE_ID
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
                    // InternalMontiCoreClassDiagram.g:1261:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    {
                    // InternalMontiCoreClassDiagram.g:1261:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    // InternalMontiCoreClassDiagram.g:1262:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiCoreClassDiagram.g:1262:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    // InternalMontiCoreClassDiagram.g:1263:5: lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME
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
    // InternalMontiCoreClassDiagram.g:1283:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMontiCoreClassDiagram.g:1283:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMontiCoreClassDiagram.g:1284:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalMontiCoreClassDiagram.g:1290:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal1_0_1 = null;

        EObject lv_literal1_0_2 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_literal2_2_1 = null;

        EObject lv_literal2_2_2 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1296:2: ( ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) )
            // InternalMontiCoreClassDiagram.g:1297:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            {
            // InternalMontiCoreClassDiagram.g:1297:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            // InternalMontiCoreClassDiagram.g:1298:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            {
            // InternalMontiCoreClassDiagram.g:1298:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) )
            // InternalMontiCoreClassDiagram.g:1299:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            {
            // InternalMontiCoreClassDiagram.g:1299:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            // InternalMontiCoreClassDiagram.g:1300:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
            {
            // InternalMontiCoreClassDiagram.g:1300:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
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
                    // InternalMontiCoreClassDiagram.g:1301:6: lv_literal1_0_1= ruleLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_23);
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
                    // InternalMontiCoreClassDiagram.g:1317:6: lv_literal1_0_2= ruleNameExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalMontiCoreClassDiagram.g:1335:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalMontiCoreClassDiagram.g:1336:4: (lv_op_1_0= ruleOperator )
            {
            // InternalMontiCoreClassDiagram.g:1336:4: (lv_op_1_0= ruleOperator )
            // InternalMontiCoreClassDiagram.g:1337:5: lv_op_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getOpOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMontiCoreClassDiagram.g:1354:3: ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            // InternalMontiCoreClassDiagram.g:1355:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            {
            // InternalMontiCoreClassDiagram.g:1355:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            // InternalMontiCoreClassDiagram.g:1356:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            {
            // InternalMontiCoreClassDiagram.g:1356:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
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
                    // InternalMontiCoreClassDiagram.g:1357:6: lv_literal2_2_1= ruleLiteralExpression
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
                    // InternalMontiCoreClassDiagram.g:1373:6: lv_literal2_2_2= ruleNameExpression
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
    // InternalMontiCoreClassDiagram.g:1395:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMontiCoreClassDiagram.g:1395:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMontiCoreClassDiagram.g:1396:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMontiCoreClassDiagram.g:1402:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMontiCoreClassDiagram.g:1408:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMontiCoreClassDiagram.g:1409:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMontiCoreClassDiagram.g:1409:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMontiCoreClassDiagram.g:1410:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMontiCoreClassDiagram.g:1410:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiCoreClassDiagram.g:1411:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiCoreClassDiagram.g:1411:4: (lv_name_0_0= RULE_ID )
            // InternalMontiCoreClassDiagram.g:1412:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalMontiCoreClassDiagram.g:1428:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMontiCoreClassDiagram.g:1429:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMontiCoreClassDiagram.g:1429:4: (lv_expression_1_0= ruleExpression )
            // InternalMontiCoreClassDiagram.g:1430:5: lv_expression_1_0= ruleExpression
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
    // InternalMontiCoreClassDiagram.g:1451:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) ;
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
            // InternalMontiCoreClassDiagram.g:1457:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) )
            // InternalMontiCoreClassDiagram.g:1458:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            {
            // InternalMontiCoreClassDiagram.g:1458:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            int alt21=8;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt21=1;
                }
                break;
            case 44:
                {
                alt21=2;
                }
                break;
            case 48:
                {
                alt21=3;
                }
                break;
            case 49:
                {
                alt21=4;
                }
                break;
            case 50:
                {
                alt21=5;
                }
                break;
            case 51:
                {
                alt21=6;
                }
                break;
            case 52:
                {
                alt21=7;
                }
                break;
            case 53:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1459:3: (enumLiteral_0= '>' )
                    {
                    // InternalMontiCoreClassDiagram.g:1459:3: (enumLiteral_0= '>' )
                    // InternalMontiCoreClassDiagram.g:1460:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiCoreClassDiagram.g:1467:3: (enumLiteral_1= '<' )
                    {
                    // InternalMontiCoreClassDiagram.g:1467:3: (enumLiteral_1= '<' )
                    // InternalMontiCoreClassDiagram.g:1468:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiCoreClassDiagram.g:1475:3: (enumLiteral_2= '==' )
                    {
                    // InternalMontiCoreClassDiagram.g:1475:3: (enumLiteral_2= '==' )
                    // InternalMontiCoreClassDiagram.g:1476:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiCoreClassDiagram.g:1483:3: (enumLiteral_3= '&&' )
                    {
                    // InternalMontiCoreClassDiagram.g:1483:3: (enumLiteral_3= '&&' )
                    // InternalMontiCoreClassDiagram.g:1484:4: enumLiteral_3= '&&'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiCoreClassDiagram.g:1491:3: (enumLiteral_4= '+' )
                    {
                    // InternalMontiCoreClassDiagram.g:1491:3: (enumLiteral_4= '+' )
                    // InternalMontiCoreClassDiagram.g:1492:4: enumLiteral_4= '+'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiCoreClassDiagram.g:1499:3: (enumLiteral_5= '-' )
                    {
                    // InternalMontiCoreClassDiagram.g:1499:3: (enumLiteral_5= '-' )
                    // InternalMontiCoreClassDiagram.g:1500:4: enumLiteral_5= '-'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiCoreClassDiagram.g:1507:3: (enumLiteral_6= '/' )
                    {
                    // InternalMontiCoreClassDiagram.g:1507:3: (enumLiteral_6= '/' )
                    // InternalMontiCoreClassDiagram.g:1508:4: enumLiteral_6= '/'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiCoreClassDiagram.g:1515:3: (enumLiteral_7= '*' )
                    {
                    // InternalMontiCoreClassDiagram.g:1515:3: (enumLiteral_7= '*' )
                    // InternalMontiCoreClassDiagram.g:1516:4: enumLiteral_7= '*'
                    {
                    enumLiteral_7=(Token)match(input,53,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\uffff\10\14\4\uffff";
    static final String dfa_3s = "\1\31\10\4\4\uffff";
    static final String dfa_4s = "\1\53\10\56\4\uffff";
    static final String dfa_5s = "\11\uffff\1\3\1\4\1\2\1\1";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
            "\1\14\50\uffff\1\14\1\13",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "697:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000238000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000FFFFE230000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000FFFFE000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x003F300000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000001B0L});

}