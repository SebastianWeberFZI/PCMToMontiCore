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
import org.palladiosimulator.xtext.motiarc.services.MontiArcDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiArcDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_SYNC", "RULE_STRING", "RULE_DOTSTAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'->'", "'port'", "'in'", "'out'", "'<<'", "'assume'", "'>>'", "'('", "')'", "'automaton'", "'state'", "'['", "']'", "'/'", "'import'", "'package'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'Boolean'", "'Byte'", "'Integer'", "'Long'", "'Char'", "'Double'", "'String'", "'Set'", "'List'", "'Map'", "'Optional'", "'<'", "'>'", "'initial'", "'final'", "'=='", "'&&'", "'+'", "'-'", "'*'"
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

        public InternalMontiArcDSLParser(TokenStream input, MontiArcDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MACompilationUnit";
       	}

       	@Override
       	protected MontiArcDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMACompilationUnit"
    // InternalMontiArcDSL.g:65:1: entryRuleMACompilationUnit returns [EObject current=null] : iv_ruleMACompilationUnit= ruleMACompilationUnit EOF ;
    public final EObject entryRuleMACompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMACompilationUnit = null;


        try {
            // InternalMontiArcDSL.g:65:58: (iv_ruleMACompilationUnit= ruleMACompilationUnit EOF )
            // InternalMontiArcDSL.g:66:2: iv_ruleMACompilationUnit= ruleMACompilationUnit EOF
            {
             newCompositeNode(grammarAccess.getMACompilationUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMACompilationUnit=ruleMACompilationUnit();

            state._fsp--;

             current =iv_ruleMACompilationUnit; 
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
    // $ANTLR end "entryRuleMACompilationUnit"


    // $ANTLR start "ruleMACompilationUnit"
    // InternalMontiArcDSL.g:72:1: ruleMACompilationUnit returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) ) ;
    public final EObject ruleMACompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_importStatements_1_0 = null;

        EObject lv_component_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:78:2: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) ) )
            // InternalMontiArcDSL.g:79:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) )
            {
            // InternalMontiArcDSL.g:79:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) )
            // InternalMontiArcDSL.g:80:3: ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) )
            {
            // InternalMontiArcDSL.g:80:3: ( (lv_package_0_0= rulePackage ) )
            // InternalMontiArcDSL.g:81:4: (lv_package_0_0= rulePackage )
            {
            // InternalMontiArcDSL.g:81:4: (lv_package_0_0= rulePackage )
            // InternalMontiArcDSL.g:82:5: lv_package_0_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getMACompilationUnitAccess().getPackagePackageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_package_0_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMACompilationUnitRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_0_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:99:3: ( (lv_importStatements_1_0= ruleImportStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==35) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMontiArcDSL.g:100:4: (lv_importStatements_1_0= ruleImportStatements )
            	    {
            	    // InternalMontiArcDSL.g:100:4: (lv_importStatements_1_0= ruleImportStatements )
            	    // InternalMontiArcDSL.g:101:5: lv_importStatements_1_0= ruleImportStatements
            	    {

            	    					newCompositeNode(grammarAccess.getMACompilationUnitAccess().getImportStatementsImportStatementsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_importStatements_1_0=ruleImportStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMACompilationUnitRule());
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

            // InternalMontiArcDSL.g:118:3: ( (lv_component_2_0= ruleComponent ) )
            // InternalMontiArcDSL.g:119:4: (lv_component_2_0= ruleComponent )
            {
            // InternalMontiArcDSL.g:119:4: (lv_component_2_0= ruleComponent )
            // InternalMontiArcDSL.g:120:5: lv_component_2_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getMACompilationUnitAccess().getComponentComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_component_2_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMACompilationUnitRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_2_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Component");
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
    // $ANTLR end "ruleMACompilationUnit"


    // $ANTLR start "entryRuleComponent"
    // InternalMontiArcDSL.g:141:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMontiArcDSL.g:141:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMontiArcDSL.g:142:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMontiArcDSL.g:148:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_signature_2_0 = null;

        EObject lv_arcElements_4_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:154:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' ) )
            // InternalMontiArcDSL.g:155:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' )
            {
            // InternalMontiArcDSL.g:155:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' )
            // InternalMontiArcDSL.g:156:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalMontiArcDSL.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:161:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:161:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcDSL.g:162:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcDSL.g:178:3: ( (lv_signature_2_0= ruleSignature ) )
            // InternalMontiArcDSL.g:179:4: (lv_signature_2_0= ruleSignature )
            {
            // InternalMontiArcDSL.g:179:4: (lv_signature_2_0= ruleSignature )
            // InternalMontiArcDSL.g:180:5: lv_signature_2_0= ruleSignature
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getSignatureSignatureParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_signature_2_0=ruleSignature();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"signature",
            						lv_signature_2_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Signature");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMontiArcDSL.g:201:3: ( (lv_arcElements_4_0= ruleArcElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_SYNC)||LA2_0==14||LA2_0==22||LA2_0==30||(LA2_0>=37 && LA2_0<=55)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMontiArcDSL.g:202:4: (lv_arcElements_4_0= ruleArcElement )
            	    {
            	    // InternalMontiArcDSL.g:202:4: (lv_arcElements_4_0= ruleArcElement )
            	    // InternalMontiArcDSL.g:203:5: lv_arcElements_4_0= ruleArcElement
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getArcElementsArcElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_arcElements_4_0=ruleArcElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arcElements",
            	    						lv_arcElements_4_0,
            	    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.ArcElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSignature"
    // InternalMontiArcDSL.g:228:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalMontiArcDSL.g:228:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalMontiArcDSL.g:229:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
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
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalMontiArcDSL.g:235:1: ruleSignature returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:241:2: ( ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? ) )
            // InternalMontiArcDSL.g:242:2: ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // InternalMontiArcDSL.g:242:2: ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? )
            // InternalMontiArcDSL.g:243:3: () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )?
            {
            // InternalMontiArcDSL.g:243:3: ()
            // InternalMontiArcDSL.g:244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            // InternalMontiArcDSL.g:250:3: ( (lv_parameters_1_0= ruleParameters ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=37 && LA3_0<=55)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMontiArcDSL.g:251:4: (lv_parameters_1_0= ruleParameters )
                    {
                    // InternalMontiArcDSL.g:251:4: (lv_parameters_1_0= ruleParameters )
                    // InternalMontiArcDSL.g:252:5: lv_parameters_1_0= ruleParameters
                    {

                    					newCompositeNode(grammarAccess.getSignatureAccess().getParametersParametersParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_parameters_1_0=ruleParameters();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSignatureRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_1_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Parameters");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:269:3: (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMontiArcDSL.g:270:4: otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:274:4: ( (lv_type_3_0= ruleType ) )
                    // InternalMontiArcDSL.g:275:5: (lv_type_3_0= ruleType )
                    {
                    // InternalMontiArcDSL.g:275:5: (lv_type_3_0= ruleType )
                    // InternalMontiArcDSL.g:276:6: lv_type_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getSignatureAccess().getTypeTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSignatureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0 != null,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameters"
    // InternalMontiArcDSL.g:298:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalMontiArcDSL.g:298:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalMontiArcDSL.g:299:2: iv_ruleParameters= ruleParameters EOF
            {
             newCompositeNode(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameters=ruleParameters();

            state._fsp--;

             current =iv_ruleParameters; 
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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalMontiArcDSL.g:305:1: ruleParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:311:2: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // InternalMontiArcDSL.g:312:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // InternalMontiArcDSL.g:312:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // InternalMontiArcDSL.g:313:3: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // InternalMontiArcDSL.g:313:3: ( (lv_parameters_0_0= ruleParameter ) )
            // InternalMontiArcDSL.g:314:4: (lv_parameters_0_0= ruleParameter )
            {
            // InternalMontiArcDSL.g:314:4: (lv_parameters_0_0= ruleParameter )
            // InternalMontiArcDSL.g:315:5: lv_parameters_0_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_parameters_0_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametersRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_0_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:332:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMontiArcDSL.g:333:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMontiArcDSL.g:337:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalMontiArcDSL.g:338:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalMontiArcDSL.g:338:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalMontiArcDSL.g:339:6: lv_parameters_2_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getParametersAccess().getParametersParameterParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_2_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParametersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_2_0,
            	    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleComponentType"
    // InternalMontiArcDSL.g:361:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalMontiArcDSL.g:361:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalMontiArcDSL.g:362:2: iv_ruleComponentType= ruleComponentType EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentType=ruleComponentType();

            state._fsp--;

             current =iv_ruleComponentType; 
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
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalMontiArcDSL.g:368:1: ruleComponentType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:374:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMontiArcDSL.g:375:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMontiArcDSL.g:375:2: ( (otherlv_0= RULE_ID ) )
            // InternalMontiArcDSL.g:376:3: (otherlv_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:376:3: (otherlv_0= RULE_ID )
            // InternalMontiArcDSL.g:377:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComponentTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getTypeComponentCrossReference_0());
            			

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
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRuleParameter"
    // InternalMontiArcDSL.g:391:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMontiArcDSL.g:391:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMontiArcDSL.g:392:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMontiArcDSL.g:398:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:404:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalMontiArcDSL.g:405:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalMontiArcDSL.g:405:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalMontiArcDSL.g:406:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalMontiArcDSL.g:406:3: ( (lv_type_0_0= ruleType ) )
            // InternalMontiArcDSL.g:407:4: (lv_type_0_0= ruleType )
            {
            // InternalMontiArcDSL.g:407:4: (lv_type_0_0= ruleType )
            // InternalMontiArcDSL.g:408:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:426:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcDSL.g:427:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcDSL.g:443:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMontiArcDSL.g:444:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:448:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMontiArcDSL.g:449:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMontiArcDSL.g:449:5: (lv_expression_3_0= ruleExpression )
                    // InternalMontiArcDSL.g:450:6: lv_expression_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getExpressionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0 != null,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleArcElement"
    // InternalMontiArcDSL.g:472:1: entryRuleArcElement returns [EObject current=null] : iv_ruleArcElement= ruleArcElement EOF ;
    public final EObject entryRuleArcElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArcElement = null;


        try {
            // InternalMontiArcDSL.g:472:51: (iv_ruleArcElement= ruleArcElement EOF )
            // InternalMontiArcDSL.g:473:2: iv_ruleArcElement= ruleArcElement EOF
            {
             newCompositeNode(grammarAccess.getArcElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArcElement=ruleArcElement();

            state._fsp--;

             current =iv_ruleArcElement; 
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
    // $ANTLR end "entryRuleArcElement"


    // $ANTLR start "ruleArcElement"
    // InternalMontiArcDSL.g:479:1: ruleArcElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton ) ;
    public final EObject ruleArcElement() throws RecognitionException {
        EObject current = null;

        EObject this_Component_0 = null;

        EObject this_SubComponent_1 = null;

        EObject this_Connector_2 = null;

        EObject this_Ports_3 = null;

        EObject this_Variable_4 = null;

        EObject this_Automaton_5 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:485:2: ( (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton ) )
            // InternalMontiArcDSL.g:486:2: (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton )
            {
            // InternalMontiArcDSL.g:486:2: (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else if ( ((LA7_1>=37 && LA7_1<=55)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( ((LA7_2>=RULE_ID && LA7_2<=RULE_MCQUALIFIEDNAME)||LA7_2==20||LA7_2==28) ) {
                    alt7=5;
                }
                else if ( (LA7_2==21) ) {
                    alt7=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt7=5;
                }
                break;
            case RULE_SYNC:
            case 30:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMontiArcDSL.g:487:3: this_Component_0= ruleComponent
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Component_0=ruleComponent();

                    state._fsp--;


                    			current = this_Component_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:496:3: this_SubComponent_1= ruleSubComponent
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getSubComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubComponent_1=ruleSubComponent();

                    state._fsp--;


                    			current = this_SubComponent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:505:3: this_Connector_2= ruleConnector
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getConnectorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Connector_2=ruleConnector();

                    state._fsp--;


                    			current = this_Connector_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:514:3: this_Ports_3= rulePorts
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getPortsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ports_3=rulePorts();

                    state._fsp--;


                    			current = this_Ports_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:523:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:532:3: this_Automaton_5= ruleAutomaton
                    {

                    			newCompositeNode(grammarAccess.getArcElementAccess().getAutomatonParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Automaton_5=ruleAutomaton();

                    state._fsp--;


                    			current = this_Automaton_5;
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
    // $ANTLR end "ruleArcElement"


    // $ANTLR start "entryRuleSubComponent"
    // InternalMontiArcDSL.g:544:1: entryRuleSubComponent returns [EObject current=null] : iv_ruleSubComponent= ruleSubComponent EOF ;
    public final EObject entryRuleSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponent = null;


        try {
            // InternalMontiArcDSL.g:544:53: (iv_ruleSubComponent= ruleSubComponent EOF )
            // InternalMontiArcDSL.g:545:2: iv_ruleSubComponent= ruleSubComponent EOF
            {
             newCompositeNode(grammarAccess.getSubComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubComponent=ruleSubComponent();

            state._fsp--;

             current =iv_ruleSubComponent; 
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
    // $ANTLR end "entryRuleSubComponent"


    // $ANTLR start "ruleSubComponent"
    // InternalMontiArcDSL.g:551:1: ruleSubComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' ) ;
    public final EObject ruleSubComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_instances_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:557:2: ( (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:558:2: (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:558:2: (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' )
            // InternalMontiArcDSL.g:559:3: otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSubComponentAccess().getComponentKeyword_0());
            		
            // InternalMontiArcDSL.g:563:3: ( (lv_type_1_0= ruleType ) )
            // InternalMontiArcDSL.g:564:4: (lv_type_1_0= ruleType )
            {
            // InternalMontiArcDSL.g:564:4: (lv_type_1_0= ruleType )
            // InternalMontiArcDSL.g:565:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSubComponentAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubComponentRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:582:3: ( (lv_arguments_2_0= ruleArguments ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcDSL.g:583:4: (lv_arguments_2_0= ruleArguments )
                    {
                    // InternalMontiArcDSL.g:583:4: (lv_arguments_2_0= ruleArguments )
                    // InternalMontiArcDSL.g:584:5: lv_arguments_2_0= ruleArguments
                    {

                    					newCompositeNode(grammarAccess.getSubComponentAccess().getArgumentsArgumentsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_arguments_2_0=ruleArguments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubComponentRule());
                    					}
                    					set(
                    						current,
                    						"arguments",
                    						lv_arguments_2_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MCBasics.Arguments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:601:3: ( (lv_instances_3_0= ruleNames ) )
            // InternalMontiArcDSL.g:602:4: (lv_instances_3_0= ruleNames )
            {
            // InternalMontiArcDSL.g:602:4: (lv_instances_3_0= ruleNames )
            // InternalMontiArcDSL.g:603:5: lv_instances_3_0= ruleNames
            {

            					newCompositeNode(grammarAccess.getSubComponentAccess().getInstancesNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_instances_3_0=ruleNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubComponentRule());
            					}
            					set(
            						current,
            						"instances",
            						lv_instances_3_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Names");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSubComponentAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleSubComponent"


    // $ANTLR start "entryRuleConnector"
    // InternalMontiArcDSL.g:628:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalMontiArcDSL.g:628:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalMontiArcDSL.g:629:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // InternalMontiArcDSL.g:635:1: ruleConnector returns [EObject current=null] : ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( (lv_targets_2_0= ruleNames ) ) otherlv_3= ';' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_1=null;
        Token lv_source_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_targets_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:641:2: ( ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( (lv_targets_2_0= ruleNames ) ) otherlv_3= ';' ) )
            // InternalMontiArcDSL.g:642:2: ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( (lv_targets_2_0= ruleNames ) ) otherlv_3= ';' )
            {
            // InternalMontiArcDSL.g:642:2: ( ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( (lv_targets_2_0= ruleNames ) ) otherlv_3= ';' )
            // InternalMontiArcDSL.g:643:3: ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) ) otherlv_1= '->' ( (lv_targets_2_0= ruleNames ) ) otherlv_3= ';'
            {
            // InternalMontiArcDSL.g:643:3: ( ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcDSL.g:644:4: ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcDSL.g:644:4: ( (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:645:5: (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:645:5: (lv_source_0_1= RULE_ID | lv_source_0_2= RULE_MCQUALIFIEDNAME )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_MCQUALIFIEDNAME) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMontiArcDSL.g:646:6: lv_source_0_1= RULE_ID
                    {
                    lv_source_0_1=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(lv_source_0_1, grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:661:6: lv_source_0_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_source_0_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_15); 

                    						newLeafNode(lv_source_0_2, grammarAccess.getConnectorAccess().getSourceMCQUALIFIEDNAMETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"source",
                    							lv_source_0_2,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMontiArcDSL.g:682:3: ( (lv_targets_2_0= ruleNames ) )
            // InternalMontiArcDSL.g:683:4: (lv_targets_2_0= ruleNames )
            {
            // InternalMontiArcDSL.g:683:4: (lv_targets_2_0= ruleNames )
            // InternalMontiArcDSL.g:684:5: lv_targets_2_0= ruleNames
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getTargetsNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_targets_2_0=ruleNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"targets",
            						lv_targets_2_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Names");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRulePorts"
    // InternalMontiArcDSL.g:709:1: entryRulePorts returns [EObject current=null] : iv_rulePorts= rulePorts EOF ;
    public final EObject entryRulePorts() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePorts = null;


        try {
            // InternalMontiArcDSL.g:709:46: (iv_rulePorts= rulePorts EOF )
            // InternalMontiArcDSL.g:710:2: iv_rulePorts= rulePorts EOF
            {
             newCompositeNode(grammarAccess.getPortsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePorts=rulePorts();

            state._fsp--;

             current =iv_rulePorts; 
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
    // $ANTLR end "entryRulePorts"


    // $ANTLR start "rulePorts"
    // InternalMontiArcDSL.g:716:1: rulePorts returns [EObject current=null] : (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )* otherlv_4= ';' ) ;
    public final EObject rulePorts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ports_1_0 = null;

        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:722:2: ( (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )* otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:723:2: (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )* otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:723:2: (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )* otherlv_4= ';' )
            // InternalMontiArcDSL.g:724:3: otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPortsAccess().getPortKeyword_0());
            		
            // InternalMontiArcDSL.g:728:3: ( (lv_ports_1_0= rulePort ) )
            // InternalMontiArcDSL.g:729:4: (lv_ports_1_0= rulePort )
            {
            // InternalMontiArcDSL.g:729:4: (lv_ports_1_0= rulePort )
            // InternalMontiArcDSL.g:730:5: lv_ports_1_0= rulePort
            {

            					newCompositeNode(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_ports_1_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortsRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_1_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:747:3: (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMontiArcDSL.g:748:4: otherlv_2= ',' ( (lv_ports_3_0= rulePort ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPortsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMontiArcDSL.g:752:4: ( (lv_ports_3_0= rulePort ) )
            	    // InternalMontiArcDSL.g:753:5: (lv_ports_3_0= rulePort )
            	    {
            	    // InternalMontiArcDSL.g:753:5: (lv_ports_3_0= rulePort )
            	    // InternalMontiArcDSL.g:754:6: lv_ports_3_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPortsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_3_0,
            	    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortsAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "rulePorts"


    // $ANTLR start "entryRulePort"
    // InternalMontiArcDSL.g:780:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalMontiArcDSL.g:780:45: (iv_rulePort= rulePort EOF )
            // InternalMontiArcDSL.g:781:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalMontiArcDSL.g:787:1: rulePort returns [EObject current=null] : ( ( (lv_assume_0_0= ruleAssume ) )? ( (lv_sync_1_0= RULE_SYNC ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( (lv_names_6_0= ruleNames ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_sync_1_0=null;
        Token lv_in_2_0=null;
        Token lv_out_3_0=null;
        Token otherlv_5=null;
        EObject lv_assume_0_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_names_6_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:793:2: ( ( ( (lv_assume_0_0= ruleAssume ) )? ( (lv_sync_1_0= RULE_SYNC ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( (lv_names_6_0= ruleNames ) )? ) )
            // InternalMontiArcDSL.g:794:2: ( ( (lv_assume_0_0= ruleAssume ) )? ( (lv_sync_1_0= RULE_SYNC ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( (lv_names_6_0= ruleNames ) )? )
            {
            // InternalMontiArcDSL.g:794:2: ( ( (lv_assume_0_0= ruleAssume ) )? ( (lv_sync_1_0= RULE_SYNC ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( (lv_names_6_0= ruleNames ) )? )
            // InternalMontiArcDSL.g:795:3: ( (lv_assume_0_0= ruleAssume ) )? ( (lv_sync_1_0= RULE_SYNC ) )? ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) ) ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) ) ( (lv_names_6_0= ruleNames ) )?
            {
            // InternalMontiArcDSL.g:795:3: ( (lv_assume_0_0= ruleAssume ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcDSL.g:796:4: (lv_assume_0_0= ruleAssume )
                    {
                    // InternalMontiArcDSL.g:796:4: (lv_assume_0_0= ruleAssume )
                    // InternalMontiArcDSL.g:797:5: lv_assume_0_0= ruleAssume
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getAssumeAssumeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_assume_0_0=ruleAssume();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"assume",
                    						lv_assume_0_0,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Assume");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:814:3: ( (lv_sync_1_0= RULE_SYNC ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SYNC) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMontiArcDSL.g:815:4: (lv_sync_1_0= RULE_SYNC )
                    {
                    // InternalMontiArcDSL.g:815:4: (lv_sync_1_0= RULE_SYNC )
                    // InternalMontiArcDSL.g:816:5: lv_sync_1_0= RULE_SYNC
                    {
                    lv_sync_1_0=(Token)match(input,RULE_SYNC,FOLLOW_19); 

                    					newLeafNode(lv_sync_1_0, grammarAccess.getPortAccess().getSyncSYNCTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPortRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"sync",
                    						lv_sync_1_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.SYNC");
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:832:3: ( ( (lv_in_2_0= 'in' ) ) | ( (lv_out_3_0= 'out' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMontiArcDSL.g:833:4: ( (lv_in_2_0= 'in' ) )
                    {
                    // InternalMontiArcDSL.g:833:4: ( (lv_in_2_0= 'in' ) )
                    // InternalMontiArcDSL.g:834:5: (lv_in_2_0= 'in' )
                    {
                    // InternalMontiArcDSL.g:834:5: (lv_in_2_0= 'in' )
                    // InternalMontiArcDSL.g:835:6: lv_in_2_0= 'in'
                    {
                    lv_in_2_0=(Token)match(input,23,FOLLOW_20); 

                    						newLeafNode(lv_in_2_0, grammarAccess.getPortAccess().getInInKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(current, "in", lv_in_2_0 != null, "in");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:848:4: ( (lv_out_3_0= 'out' ) )
                    {
                    // InternalMontiArcDSL.g:848:4: ( (lv_out_3_0= 'out' ) )
                    // InternalMontiArcDSL.g:849:5: (lv_out_3_0= 'out' )
                    {
                    // InternalMontiArcDSL.g:849:5: (lv_out_3_0= 'out' )
                    // InternalMontiArcDSL.g:850:6: lv_out_3_0= 'out'
                    {
                    lv_out_3_0=(Token)match(input,24,FOLLOW_20); 

                    						newLeafNode(lv_out_3_0, grammarAccess.getPortAccess().getOutOutKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(current, "out", lv_out_3_0 != null, "out");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:863:3: ( ( (lv_type_4_0= ruleType ) ) | ( (otherlv_5= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=37 && LA14_0<=55)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMontiArcDSL.g:864:4: ( (lv_type_4_0= ruleType ) )
                    {
                    // InternalMontiArcDSL.g:864:4: ( (lv_type_4_0= ruleType ) )
                    // InternalMontiArcDSL.g:865:5: (lv_type_4_0= ruleType )
                    {
                    // InternalMontiArcDSL.g:865:5: (lv_type_4_0= ruleType )
                    // InternalMontiArcDSL.g:866:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:884:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalMontiArcDSL.g:884:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMontiArcDSL.g:885:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:885:5: (otherlv_5= RULE_ID )
                    // InternalMontiArcDSL.g:886:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_5, grammarAccess.getPortAccess().getDatatypeCDDefinitionCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:898:3: ( (lv_names_6_0= ruleNames ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMontiArcDSL.g:899:4: (lv_names_6_0= ruleNames )
                    {
                    // InternalMontiArcDSL.g:899:4: (lv_names_6_0= ruleNames )
                    // InternalMontiArcDSL.g:900:5: lv_names_6_0= ruleNames
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_names_6_0=ruleNames();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"names",
                    						lv_names_6_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Names");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleAssume"
    // InternalMontiArcDSL.g:921:1: entryRuleAssume returns [EObject current=null] : iv_ruleAssume= ruleAssume EOF ;
    public final EObject entryRuleAssume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssume = null;


        try {
            // InternalMontiArcDSL.g:921:47: (iv_ruleAssume= ruleAssume EOF )
            // InternalMontiArcDSL.g:922:2: iv_ruleAssume= ruleAssume EOF
            {
             newCompositeNode(grammarAccess.getAssumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssume=ruleAssume();

            state._fsp--;

             current =iv_ruleAssume; 
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
    // $ANTLR end "entryRuleAssume"


    // $ANTLR start "ruleAssume"
    // InternalMontiArcDSL.g:928:1: ruleAssume returns [EObject current=null] : (otherlv_0= '<<' otherlv_1= 'assume' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' ) ;
    public final EObject ruleAssume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_condition_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:934:2: ( (otherlv_0= '<<' otherlv_1= 'assume' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' ) )
            // InternalMontiArcDSL.g:935:2: (otherlv_0= '<<' otherlv_1= 'assume' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' )
            {
            // InternalMontiArcDSL.g:935:2: (otherlv_0= '<<' otherlv_1= 'assume' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>' )
            // InternalMontiArcDSL.g:936:3: otherlv_0= '<<' otherlv_1= 'assume' otherlv_2= '=' ( (lv_condition_3_0= RULE_STRING ) ) otherlv_4= '>>'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAssumeAccess().getLessThanSignLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getAssumeAccess().getAssumeKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAssumeAccess().getEqualsSignKeyword_2());
            		
            // InternalMontiArcDSL.g:948:3: ( (lv_condition_3_0= RULE_STRING ) )
            // InternalMontiArcDSL.g:949:4: (lv_condition_3_0= RULE_STRING )
            {
            // InternalMontiArcDSL.g:949:4: (lv_condition_3_0= RULE_STRING )
            // InternalMontiArcDSL.g:950:5: lv_condition_3_0= RULE_STRING
            {
            lv_condition_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_condition_3_0, grammarAccess.getAssumeAccess().getConditionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssumeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssumeAccess().getGreaterThanSignGreaterThanSignKeyword_4());
            		

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
    // $ANTLR end "ruleAssume"


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcDSL.g:974:1: entryRuleNames returns [EObject current=null] : iv_ruleNames= ruleNames EOF ;
    public final EObject entryRuleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNames = null;


        try {
            // InternalMontiArcDSL.g:974:46: (iv_ruleNames= ruleNames EOF )
            // InternalMontiArcDSL.g:975:2: iv_ruleNames= ruleNames EOF
            {
             newCompositeNode(grammarAccess.getNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNames=ruleNames();

            state._fsp--;

             current =iv_ruleNames; 
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
    // $ANTLR end "entryRuleNames"


    // $ANTLR start "ruleNames"
    // InternalMontiArcDSL.g:981:1: ruleNames returns [EObject current=null] : ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* ) ;
    public final EObject ruleNames() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_1=null;
        Token lv_names_0_2=null;
        Token otherlv_1=null;
        Token lv_names_2_1=null;
        Token lv_names_2_2=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:987:2: ( ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* ) )
            // InternalMontiArcDSL.g:988:2: ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* )
            {
            // InternalMontiArcDSL.g:988:2: ( ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )* )
            // InternalMontiArcDSL.g:989:3: ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) ) (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )*
            {
            // InternalMontiArcDSL.g:989:3: ( ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) ) )
            // InternalMontiArcDSL.g:990:4: ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) )
            {
            // InternalMontiArcDSL.g:990:4: ( (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:991:5: (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:991:5: (lv_names_0_1= RULE_ID | lv_names_0_2= RULE_MCQUALIFIEDNAME )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_MCQUALIFIEDNAME) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcDSL.g:992:6: lv_names_0_1= RULE_ID
                    {
                    lv_names_0_1=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_names_0_1, grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"names",
                    							lv_names_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1007:6: lv_names_0_2= RULE_MCQUALIFIEDNAME
                    {
                    lv_names_0_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_10); 

                    						newLeafNode(lv_names_0_2, grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNamesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"names",
                    							lv_names_0_2,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMontiArcDSL.g:1024:3: (otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    int LA18_2 = input.LA(2);

                    if ( ((LA18_2>=RULE_ID && LA18_2<=RULE_MCQUALIFIEDNAME)) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1025:4: otherlv_1= ',' ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_26); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMontiArcDSL.g:1029:4: ( ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) ) )
            	    // InternalMontiArcDSL.g:1030:5: ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) )
            	    {
            	    // InternalMontiArcDSL.g:1030:5: ( (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME ) )
            	    // InternalMontiArcDSL.g:1031:6: (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME )
            	    {
            	    // InternalMontiArcDSL.g:1031:6: (lv_names_2_1= RULE_ID | lv_names_2_2= RULE_MCQUALIFIEDNAME )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ID) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==RULE_MCQUALIFIEDNAME) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalMontiArcDSL.g:1032:7: lv_names_2_1= RULE_ID
            	            {
            	            lv_names_2_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            	            							newLeafNode(lv_names_2_1, grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getNamesRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"names",
            	            								lv_names_2_1,
            	            								"org.eclipse.xtext.common.Terminals.ID");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMontiArcDSL.g:1047:7: lv_names_2_2= RULE_MCQUALIFIEDNAME
            	            {
            	            lv_names_2_2=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_10); 

            	            							newLeafNode(lv_names_2_2, grammarAccess.getNamesAccess().getNamesMCQUALIFIEDNAMETerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getNamesRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"names",
            	            								lv_names_2_2,
            	            								"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleNames"


    // $ANTLR start "entryRuleVariable"
    // InternalMontiArcDSL.g:1069:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMontiArcDSL.g:1069:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMontiArcDSL.g:1070:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMontiArcDSL.g:1076:1: ruleVariable returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) ) ) ( (lv_names_1_0= ruleNames ) )? (otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_names_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1082:2: ( ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) ) ) ( (lv_names_1_0= ruleNames ) )? (otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) )
            // InternalMontiArcDSL.g:1083:2: ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) ) ) ( (lv_names_1_0= ruleNames ) )? (otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            {
            // InternalMontiArcDSL.g:1083:2: ( ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) ) ) ( (lv_names_1_0= ruleNames ) )? (otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            // InternalMontiArcDSL.g:1084:3: ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) ) ) ( (lv_names_1_0= ruleNames ) )? (otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')' )? otherlv_7= ';'
            {
            // InternalMontiArcDSL.g:1084:3: ( ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) ) )
            // InternalMontiArcDSL.g:1085:4: ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) )
            {
            // InternalMontiArcDSL.g:1085:4: ( (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType ) )
            // InternalMontiArcDSL.g:1086:5: (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType )
            {
            // InternalMontiArcDSL.g:1086:5: (lv_type_0_1= ruleType | lv_type_0_2= ruleComponentType )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=37 && LA19_0<=55)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcDSL.g:1087:6: lv_type_0_1= ruleType
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_type_0_1=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
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
                    // InternalMontiArcDSL.g:1103:6: lv_type_0_2= ruleComponentType
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getTypeComponentTypeParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_27);
                    lv_type_0_2=ruleComponentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_2,
                    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.ComponentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalMontiArcDSL.g:1121:3: ( (lv_names_1_0= ruleNames ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiArcDSL.g:1122:4: (lv_names_1_0= ruleNames )
                    {
                    // InternalMontiArcDSL.g:1122:4: (lv_names_1_0= ruleNames )
                    // InternalMontiArcDSL.g:1123:5: lv_names_1_0= ruleNames
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getNamesNamesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_names_1_0=ruleNames();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableRule());
                    					}
                    					set(
                    						current,
                    						"names",
                    						lv_names_1_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Names");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:1140:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMontiArcDSL.g:1141:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:1145:4: ( (lv_parameters_3_0= ruleExpression ) )
                    // InternalMontiArcDSL.g:1146:5: (lv_parameters_3_0= ruleExpression )
                    {
                    // InternalMontiArcDSL.g:1146:5: (lv_parameters_3_0= ruleExpression )
                    // InternalMontiArcDSL.g:1147:6: lv_parameters_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getParametersExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_parameters_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMontiArcDSL.g:1164:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMontiArcDSL.g:1165:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMontiArcDSL.g:1169:5: ( (lv_parameters_5_0= ruleExpression ) )
                    	    // InternalMontiArcDSL.g:1170:6: (lv_parameters_5_0= ruleExpression )
                    	    {
                    	    // InternalMontiArcDSL.g:1170:6: (lv_parameters_5_0= ruleExpression )
                    	    // InternalMontiArcDSL.g:1171:7: lv_parameters_5_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableAccess().getParametersExpressionParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_29);
                    	    lv_parameters_5_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAutomaton"
    // InternalMontiArcDSL.g:1202:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // InternalMontiArcDSL.g:1202:50: (iv_ruleAutomaton= ruleAutomaton EOF )
            // InternalMontiArcDSL.g:1203:2: iv_ruleAutomaton= ruleAutomaton EOF
            {
             newCompositeNode(grammarAccess.getAutomatonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomaton=ruleAutomaton();

            state._fsp--;

             current =iv_ruleAutomaton; 
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
    // $ANTLR end "entryRuleAutomaton"


    // $ANTLR start "ruleAutomaton"
    // InternalMontiArcDSL.g:1209:1: ruleAutomaton returns [EObject current=null] : ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleAutomaton() throws RecognitionException {
        EObject current = null;

        Token lv_sync_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_states_5_0 = null;

        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1215:2: ( ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) )
            // InternalMontiArcDSL.g:1216:2: ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            {
            // InternalMontiArcDSL.g:1216:2: ( () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            // InternalMontiArcDSL.g:1217:3: () ( (lv_sync_1_0= RULE_SYNC ) )? otherlv_2= 'automaton' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}'
            {
            // InternalMontiArcDSL.g:1217:3: ()
            // InternalMontiArcDSL.g:1218:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutomatonAccess().getAutomatonAction_0(),
            					current);
            			

            }

            // InternalMontiArcDSL.g:1224:3: ( (lv_sync_1_0= RULE_SYNC ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SYNC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMontiArcDSL.g:1225:4: (lv_sync_1_0= RULE_SYNC )
                    {
                    // InternalMontiArcDSL.g:1225:4: (lv_sync_1_0= RULE_SYNC )
                    // InternalMontiArcDSL.g:1226:5: lv_sync_1_0= RULE_SYNC
                    {
                    lv_sync_1_0=(Token)match(input,RULE_SYNC,FOLLOW_30); 

                    					newLeafNode(lv_sync_1_0, grammarAccess.getAutomatonAccess().getSyncSYNCTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAutomatonRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"sync",
                    						lv_sync_1_0 != null,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.SYNC");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomatonAccess().getAutomatonKeyword_2());
            		
            // InternalMontiArcDSL.g:1246:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMontiArcDSL.g:1247:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1247:4: (lv_name_3_0= RULE_ID )
                    // InternalMontiArcDSL.g:1248:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAutomatonRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0 != null,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMontiArcDSL.g:1268:3: ( ( (lv_states_5_0= ruleState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15||LA25_0==31||(LA25_0>=58 && LA25_0<=59)) ) {
                    alt25=1;
                }
                else if ( (LA25_0==RULE_ID) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1269:4: ( (lv_states_5_0= ruleState ) )
            	    {
            	    // InternalMontiArcDSL.g:1269:4: ( (lv_states_5_0= ruleState ) )
            	    // InternalMontiArcDSL.g:1270:5: (lv_states_5_0= ruleState )
            	    {
            	    // InternalMontiArcDSL.g:1270:5: (lv_states_5_0= ruleState )
            	    // InternalMontiArcDSL.g:1271:6: lv_states_5_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_5_0,
            	    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMontiArcDSL.g:1289:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    {
            	    // InternalMontiArcDSL.g:1289:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    // InternalMontiArcDSL.g:1290:5: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalMontiArcDSL.g:1290:5: (lv_transitions_6_0= ruleTransition )
            	    // InternalMontiArcDSL.g:1291:6: lv_transitions_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_transitions_6_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transitions",
            	    							lv_transitions_6_0,
            	    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAutomaton"


    // $ANTLR start "entryRuleState"
    // InternalMontiArcDSL.g:1317:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMontiArcDSL.g:1317:46: (iv_ruleState= ruleState EOF )
            // InternalMontiArcDSL.g:1318:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMontiArcDSL.g:1324:1: ruleState returns [EObject current=null] : (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_SCState_0 = null;

        EObject this_InvState_1 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1330:2: ( (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState ) )
            // InternalMontiArcDSL.g:1331:2: (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState )
            {
            // InternalMontiArcDSL.g:1331:2: (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalMontiArcDSL.g:1332:3: this_SCState_0= ruleSCState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getSCStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SCState_0=ruleSCState();

                    state._fsp--;


                    			current = this_SCState_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1341:3: this_InvState_1= ruleInvState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getInvStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InvState_1=ruleInvState();

                    state._fsp--;


                    			current = this_InvState_1;
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSCState"
    // InternalMontiArcDSL.g:1353:1: entryRuleSCState returns [EObject current=null] : iv_ruleSCState= ruleSCState EOF ;
    public final EObject entryRuleSCState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCState = null;


        try {
            // InternalMontiArcDSL.g:1353:48: (iv_ruleSCState= ruleSCState EOF )
            // InternalMontiArcDSL.g:1354:2: iv_ruleSCState= ruleSCState EOF
            {
             newCompositeNode(grammarAccess.getSCStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCState=ruleSCState();

            state._fsp--;

             current =iv_ruleSCState; 
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
    // $ANTLR end "entryRuleSCState"


    // $ANTLR start "ruleSCState"
    // InternalMontiArcDSL.g:1360:1: ruleSCState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleSCState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_ante_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1366:2: ( ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:1367:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:1367:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalMontiArcDSL.g:1368:3: ( (lv_modifier_0_0= ruleSCModifier ) )* ( (lv_ante_1_0= ruleSCSAnte ) )? otherlv_2= 'state' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            // InternalMontiArcDSL.g:1368:3: ( (lv_modifier_0_0= ruleSCModifier ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=58 && LA27_0<=59)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1369:4: (lv_modifier_0_0= ruleSCModifier )
            	    {
            	    // InternalMontiArcDSL.g:1369:4: (lv_modifier_0_0= ruleSCModifier )
            	    // InternalMontiArcDSL.g:1370:5: lv_modifier_0_0= ruleSCModifier
            	    {

            	    					newCompositeNode(grammarAccess.getSCStateAccess().getModifierSCModifierEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_modifier_0_0=ruleSCModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSCStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifier",
            	    						lv_modifier_0_0,
            	    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.SCModifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalMontiArcDSL.g:1387:3: ( (lv_ante_1_0= ruleSCSAnte ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==15) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMontiArcDSL.g:1388:4: (lv_ante_1_0= ruleSCSAnte )
                    {
                    // InternalMontiArcDSL.g:1388:4: (lv_ante_1_0= ruleSCSAnte )
                    // InternalMontiArcDSL.g:1389:5: lv_ante_1_0= ruleSCSAnte
                    {

                    					newCompositeNode(grammarAccess.getSCStateAccess().getAnteSCSAnteParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_ante_1_0=ruleSCSAnte();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSCStateRule());
                    					}
                    					set(
                    						current,
                    						"ante",
                    						lv_ante_1_0,
                    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.SCSAnte");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSCStateAccess().getStateKeyword_2());
            		
            // InternalMontiArcDSL.g:1410:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1411:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1411:4: (lv_name_3_0= RULE_ID )
            // InternalMontiArcDSL.g:1412:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSCStateAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSCStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSCStateAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleSCState"


    // $ANTLR start "entryRuleInvState"
    // InternalMontiArcDSL.g:1436:1: entryRuleInvState returns [EObject current=null] : iv_ruleInvState= ruleInvState EOF ;
    public final EObject entryRuleInvState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvState = null;


        try {
            // InternalMontiArcDSL.g:1436:49: (iv_ruleInvState= ruleInvState EOF )
            // InternalMontiArcDSL.g:1437:2: iv_ruleInvState= ruleInvState EOF
            {
             newCompositeNode(grammarAccess.getInvStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInvState=ruleInvState();

            state._fsp--;

             current =iv_ruleInvState; 
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
    // $ANTLR end "entryRuleInvState"


    // $ANTLR start "ruleInvState"
    // InternalMontiArcDSL.g:1443:1: ruleInvState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' ) ;
    public final EObject ruleInvState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1449:2: ( ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' ) )
            // InternalMontiArcDSL.g:1450:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' )
            {
            // InternalMontiArcDSL.g:1450:2: ( ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';' )
            // InternalMontiArcDSL.g:1451:3: ( (lv_modifier_0_0= ruleSCModifier ) )* otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' otherlv_6= ';'
            {
            // InternalMontiArcDSL.g:1451:3: ( (lv_modifier_0_0= ruleSCModifier ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=58 && LA29_0<=59)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1452:4: (lv_modifier_0_0= ruleSCModifier )
            	    {
            	    // InternalMontiArcDSL.g:1452:4: (lv_modifier_0_0= ruleSCModifier )
            	    // InternalMontiArcDSL.g:1453:5: lv_modifier_0_0= ruleSCModifier
            	    {

            	    					newCompositeNode(grammarAccess.getInvStateAccess().getModifierSCModifierEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_modifier_0_0=ruleSCModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInvStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"modifier",
            	    						lv_modifier_0_0,
            	    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.SCModifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getInvStateAccess().getStateKeyword_1());
            		
            // InternalMontiArcDSL.g:1474:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1475:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1475:4: (lv_name_2_0= RULE_ID )
            // InternalMontiArcDSL.g:1476:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInvStateAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInvStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getInvStateAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMontiArcDSL.g:1496:3: ( (lv_expression_4_0= ruleExpression ) )
            // InternalMontiArcDSL.g:1497:4: (lv_expression_4_0= ruleExpression )
            {
            // InternalMontiArcDSL.g:1497:4: (lv_expression_4_0= ruleExpression )
            // InternalMontiArcDSL.g:1498:5: lv_expression_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getInvStateAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_expression_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInvStateRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getInvStateAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getInvStateAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleInvState"


    // $ANTLR start "entryRuleSCSAnte"
    // InternalMontiArcDSL.g:1527:1: entryRuleSCSAnte returns [EObject current=null] : iv_ruleSCSAnte= ruleSCSAnte EOF ;
    public final EObject entryRuleSCSAnte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCSAnte = null;


        try {
            // InternalMontiArcDSL.g:1527:48: (iv_ruleSCSAnte= ruleSCSAnte EOF )
            // InternalMontiArcDSL.g:1528:2: iv_ruleSCSAnte= ruleSCSAnte EOF
            {
             newCompositeNode(grammarAccess.getSCSAnteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSCSAnte=ruleSCSAnte();

            state._fsp--;

             current =iv_ruleSCSAnte; 
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
    // $ANTLR end "entryRuleSCSAnte"


    // $ANTLR start "ruleSCSAnte"
    // InternalMontiArcDSL.g:1534:1: ruleSCSAnte returns [EObject current=null] : ( () ( (lv_block_1_0= ruleBlock ) ) ) ;
    public final EObject ruleSCSAnte() throws RecognitionException {
        EObject current = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1540:2: ( ( () ( (lv_block_1_0= ruleBlock ) ) ) )
            // InternalMontiArcDSL.g:1541:2: ( () ( (lv_block_1_0= ruleBlock ) ) )
            {
            // InternalMontiArcDSL.g:1541:2: ( () ( (lv_block_1_0= ruleBlock ) ) )
            // InternalMontiArcDSL.g:1542:3: () ( (lv_block_1_0= ruleBlock ) )
            {
            // InternalMontiArcDSL.g:1542:3: ()
            // InternalMontiArcDSL.g:1543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSCSAnteAccess().getSCSAnteAction_0(),
            					current);
            			

            }

            // InternalMontiArcDSL.g:1549:3: ( (lv_block_1_0= ruleBlock ) )
            // InternalMontiArcDSL.g:1550:4: (lv_block_1_0= ruleBlock )
            {
            // InternalMontiArcDSL.g:1550:4: (lv_block_1_0= ruleBlock )
            // InternalMontiArcDSL.g:1551:5: lv_block_1_0= ruleBlock
            {

            					newCompositeNode(grammarAccess.getSCSAnteAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_block_1_0=ruleBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSCSAnteRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Block");
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
    // $ANTLR end "ruleSCSAnte"


    // $ANTLR start "entryRuleTransition"
    // InternalMontiArcDSL.g:1572:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMontiArcDSL.g:1572:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMontiArcDSL.g:1573:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMontiArcDSL.g:1579:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expression_4_0 = null;

        EObject lv_reaction_7_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1585:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' ) )
            // InternalMontiArcDSL.g:1586:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' )
            {
            // InternalMontiArcDSL.g:1586:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' )
            // InternalMontiArcDSL.g:1587:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';'
            {
            // InternalMontiArcDSL.g:1587:3: ( (otherlv_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1588:4: (otherlv_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1588:4: (otherlv_0= RULE_ID )
            // InternalMontiArcDSL.g:1589:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0());
            				

            }


            }

            // InternalMontiArcDSL.g:1600:3: (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMontiArcDSL.g:1601:4: otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                    			
                    // InternalMontiArcDSL.g:1605:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMontiArcDSL.g:1606:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1606:5: (otherlv_2= RULE_ID )
                    // InternalMontiArcDSL.g:1607:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTargetStateCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:1619:3: (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==32) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMontiArcDSL.g:1620:4: otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:1624:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalMontiArcDSL.g:1625:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalMontiArcDSL.g:1625:5: (lv_expression_4_0= ruleExpression )
                    // InternalMontiArcDSL.g:1626:6: lv_expression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalMontiArcDSL.g:1648:3: (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMontiArcDSL.g:1649:4: otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSolidusKeyword_3_0());
                    			
                    // InternalMontiArcDSL.g:1653:4: ( (lv_reaction_7_0= ruleBlock ) )
                    // InternalMontiArcDSL.g:1654:5: (lv_reaction_7_0= ruleBlock )
                    {
                    // InternalMontiArcDSL.g:1654:5: (lv_reaction_7_0= ruleBlock )
                    // InternalMontiArcDSL.g:1655:6: lv_reaction_7_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getReactionBlockParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_reaction_7_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"reaction",
                    							lv_reaction_7_0,
                    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleBlock"
    // InternalMontiArcDSL.g:1681:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMontiArcDSL.g:1681:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMontiArcDSL.g:1682:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMontiArcDSL.g:1688:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_blocks_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1694:2: ( ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' ) )
            // InternalMontiArcDSL.g:1695:2: ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' )
            {
            // InternalMontiArcDSL.g:1695:2: ( () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}' )
            // InternalMontiArcDSL.g:1696:3: () otherlv_1= '{' ( (lv_blocks_2_0= ruleBlockStatement ) )* otherlv_3= '}'
            {
            // InternalMontiArcDSL.g:1696:3: ()
            // InternalMontiArcDSL.g:1697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMontiArcDSL.g:1707:3: ( (lv_blocks_2_0= ruleBlockStatement ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_MCQUALIFIEDNAME)||LA33_0==RULE_STRING||LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1708:4: (lv_blocks_2_0= ruleBlockStatement )
            	    {
            	    // InternalMontiArcDSL.g:1708:4: (lv_blocks_2_0= ruleBlockStatement )
            	    // InternalMontiArcDSL.g:1709:5: lv_blocks_2_0= ruleBlockStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getBlocksBlockStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_41);
            	    lv_blocks_2_0=ruleBlockStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"blocks",
            	    						lv_blocks_2_0,
            	    						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.BlockStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleBlockStatement"
    // InternalMontiArcDSL.g:1734:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // InternalMontiArcDSL.g:1734:55: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // InternalMontiArcDSL.g:1735:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
             newCompositeNode(grammarAccess.getBlockStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;

             current =iv_ruleBlockStatement; 
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
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // InternalMontiArcDSL.g:1741:1: ruleBlockStatement returns [EObject current=null] : (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleInit_0 = null;

        EObject this_SimpleExpression_1 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1747:2: ( (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression ) )
            // InternalMontiArcDSL.g:1748:2: (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression )
            {
            // InternalMontiArcDSL.g:1748:2: (this_SimpleInit_0= ruleSimpleInit | this_SimpleExpression_1= ruleSimpleExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==20||LA34_1==34||(LA34_1>=56 && LA34_1<=57)||(LA34_1>=60 && LA34_1<=64)) ) {
                    alt34=2;
                }
                else if ( (LA34_1==19) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA34_0==RULE_MCQUALIFIEDNAME||LA34_0==RULE_STRING||LA34_0==RULE_INT) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMontiArcDSL.g:1749:3: this_SimpleInit_0= ruleSimpleInit
                    {

                    			newCompositeNode(grammarAccess.getBlockStatementAccess().getSimpleInitParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleInit_0=ruleSimpleInit();

                    state._fsp--;


                    			current = this_SimpleInit_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1758:3: this_SimpleExpression_1= ruleSimpleExpression
                    {

                    			newCompositeNode(grammarAccess.getBlockStatementAccess().getSimpleExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleExpression_1=ruleSimpleExpression();

                    state._fsp--;


                    			current = this_SimpleExpression_1;
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
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalMontiArcDSL.g:1770:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalMontiArcDSL.g:1770:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalMontiArcDSL.g:1771:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;

             current =iv_ruleSimpleExpression; 
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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalMontiArcDSL.g:1777:1: ruleSimpleExpression returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1783:2: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // InternalMontiArcDSL.g:1784:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // InternalMontiArcDSL.g:1784:2: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // InternalMontiArcDSL.g:1785:3: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // InternalMontiArcDSL.g:1785:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalMontiArcDSL.g:1786:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalMontiArcDSL.g:1786:4: (lv_expression_0_0= ruleExpression )
            // InternalMontiArcDSL.g:1787:5: lv_expression_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSimpleExpressionAccess().getExpressionExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleExpressionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleExpressionAccess().getSemicolonKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleSimpleInit"
    // InternalMontiArcDSL.g:1812:1: entryRuleSimpleInit returns [EObject current=null] : iv_ruleSimpleInit= ruleSimpleInit EOF ;
    public final EObject entryRuleSimpleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleInit = null;


        try {
            // InternalMontiArcDSL.g:1812:51: (iv_ruleSimpleInit= ruleSimpleInit EOF )
            // InternalMontiArcDSL.g:1813:2: iv_ruleSimpleInit= ruleSimpleInit EOF
            {
             newCompositeNode(grammarAccess.getSimpleInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleInit=ruleSimpleInit();

            state._fsp--;

             current =iv_ruleSimpleInit; 
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
    // $ANTLR end "entryRuleSimpleInit"


    // $ANTLR start "ruleSimpleInit"
    // InternalMontiArcDSL.g:1819:1: ruleSimpleInit returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleSimpleInit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1825:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalMontiArcDSL.g:1826:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalMontiArcDSL.g:1826:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalMontiArcDSL.g:1827:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalMontiArcDSL.g:1827:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1828:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1828:4: (lv_name_0_0= RULE_ID )
            // InternalMontiArcDSL.g:1829:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSimpleInitAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleInitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleInitAccess().getEqualsSignKeyword_1());
            		
            // InternalMontiArcDSL.g:1849:3: ( (lv_expressions_2_0= ruleExpression ) )
            // InternalMontiArcDSL.g:1850:4: (lv_expressions_2_0= ruleExpression )
            {
            // InternalMontiArcDSL.g:1850:4: (lv_expressions_2_0= ruleExpression )
            // InternalMontiArcDSL.g:1851:5: lv_expressions_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSimpleInitAccess().getExpressionsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expressions_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleInitRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_2_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleInitAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleSimpleInit"


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiArcDSL.g:1876:1: entryRuleImportStatements returns [EObject current=null] : iv_ruleImportStatements= ruleImportStatements EOF ;
    public final EObject entryRuleImportStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatements = null;


        try {
            // InternalMontiArcDSL.g:1876:57: (iv_ruleImportStatements= ruleImportStatements EOF )
            // InternalMontiArcDSL.g:1877:2: iv_ruleImportStatements= ruleImportStatements EOF
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
    // InternalMontiArcDSL.g:1883:1: ruleImportStatements returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) ;
    public final EObject ruleImportStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_1_0=null;
        Token lv_star_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1889:2: ( (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' ) )
            // InternalMontiArcDSL.g:1890:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            {
            // InternalMontiArcDSL.g:1890:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';' )
            // InternalMontiArcDSL.g:1891:3: otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) ( (lv_star_2_0= RULE_DOTSTAR ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementsAccess().getImportKeyword_0());
            		
            // InternalMontiArcDSL.g:1895:3: ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:1896:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:1896:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:1897:5: lv_importUri_1_0= RULE_MCQUALIFIEDNAME
            {
            lv_importUri_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_43); 

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

            // InternalMontiArcDSL.g:1913:3: ( (lv_star_2_0= RULE_DOTSTAR ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_DOTSTAR) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMontiArcDSL.g:1914:4: (lv_star_2_0= RULE_DOTSTAR )
                    {
                    // InternalMontiArcDSL.g:1914:4: (lv_star_2_0= RULE_DOTSTAR )
                    // InternalMontiArcDSL.g:1915:5: lv_star_2_0= RULE_DOTSTAR
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:1939:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalMontiArcDSL.g:1939:48: (iv_rulePackage= rulePackage EOF )
            // InternalMontiArcDSL.g:1940:2: iv_rulePackage= rulePackage EOF
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
    // InternalMontiArcDSL.g:1946:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1952:2: ( (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' ) )
            // InternalMontiArcDSL.g:1953:2: (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' )
            {
            // InternalMontiArcDSL.g:1953:2: (otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';' )
            // InternalMontiArcDSL.g:1954:3: otherlv_0= 'package' ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalMontiArcDSL.g:1958:3: ( ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) ) )
            // InternalMontiArcDSL.g:1959:4: ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) )
            {
            // InternalMontiArcDSL.g:1959:4: ( (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID ) )
            // InternalMontiArcDSL.g:1960:5: (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID )
            {
            // InternalMontiArcDSL.g:1960:5: (lv_name_1_1= RULE_MCQUALIFIEDNAME | lv_name_1_2= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_MCQUALIFIEDNAME) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMontiArcDSL.g:1961:6: lv_name_1_1= RULE_MCQUALIFIEDNAME
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
                    // InternalMontiArcDSL.g:1976:6: lv_name_1_2= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:2001:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMontiArcDSL.g:2001:45: (iv_ruleType= ruleType EOF )
            // InternalMontiArcDSL.g:2002:2: iv_ruleType= ruleType EOF
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
    // InternalMontiArcDSL.g:2008:1: ruleType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MCPrimitiveType_0 = null;

        EObject this_MCArrayType_1 = null;

        EObject this_MCObjectType_2 = null;

        EObject this_MCCollectionType_3 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2014:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType ) )
            // InternalMontiArcDSL.g:2015:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            {
            // InternalMontiArcDSL.g:2015:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )
            int alt37=4;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalMontiArcDSL.g:2016:3: this_MCPrimitiveType_0= ruleMCPrimitiveType
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
                    // InternalMontiArcDSL.g:2025:3: this_MCArrayType_1= ruleMCArrayType
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
                    // InternalMontiArcDSL.g:2034:3: this_MCObjectType_2= ruleMCObjectType
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
                    // InternalMontiArcDSL.g:2043:3: this_MCCollectionType_3= ruleMCCollectionType
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
    // InternalMontiArcDSL.g:2055:1: entryRuleMCPrimitiveType returns [EObject current=null] : iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF ;
    public final EObject entryRuleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCPrimitiveType = null;


        try {
            // InternalMontiArcDSL.g:2055:56: (iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF )
            // InternalMontiArcDSL.g:2056:2: iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF
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
    // InternalMontiArcDSL.g:2062:1: ruleMCPrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) ;
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
            // InternalMontiArcDSL.g:2068:2: ( ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) )
            // InternalMontiArcDSL.g:2069:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            {
            // InternalMontiArcDSL.g:2069:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            // InternalMontiArcDSL.g:2070:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            {
            // InternalMontiArcDSL.g:2070:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            // InternalMontiArcDSL.g:2071:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            {
            // InternalMontiArcDSL.g:2071:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            int alt38=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt38=1;
                }
                break;
            case 38:
                {
                alt38=2;
                }
                break;
            case 39:
                {
                alt38=3;
                }
                break;
            case 40:
                {
                alt38=4;
                }
                break;
            case 41:
                {
                alt38=5;
                }
                break;
            case 42:
                {
                alt38=6;
                }
                break;
            case 43:
                {
                alt38=7;
                }
                break;
            case 44:
                {
                alt38=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMontiArcDSL.g:2072:5: lv_type_0_1= 'boolean'
                    {
                    lv_type_0_1=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:2083:5: lv_type_0_2= 'byte'
                    {
                    lv_type_0_2=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:2094:5: lv_type_0_3= 'short'
                    {
                    lv_type_0_3=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:2105:5: lv_type_0_4= 'int'
                    {
                    lv_type_0_4=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:2116:5: lv_type_0_5= 'long'
                    {
                    lv_type_0_5=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:2127:5: lv_type_0_6= 'char'
                    {
                    lv_type_0_6=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:2138:5: lv_type_0_7= 'float'
                    {
                    lv_type_0_7=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:2149:5: lv_type_0_8= 'double'
                    {
                    lv_type_0_8=(Token)match(input,44,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:2165:1: entryRuleMCObjectType returns [EObject current=null] : iv_ruleMCObjectType= ruleMCObjectType EOF ;
    public final EObject entryRuleMCObjectType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCObjectType = null;


        try {
            // InternalMontiArcDSL.g:2165:53: (iv_ruleMCObjectType= ruleMCObjectType EOF )
            // InternalMontiArcDSL.g:2166:2: iv_ruleMCObjectType= ruleMCObjectType EOF
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
    // InternalMontiArcDSL.g:2172:1: ruleMCObjectType returns [EObject current=null] : ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) ;
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
            // InternalMontiArcDSL.g:2178:2: ( ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) ) )
            // InternalMontiArcDSL.g:2179:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            {
            // InternalMontiArcDSL.g:2179:2: ( ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) ) )
            // InternalMontiArcDSL.g:2180:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            {
            // InternalMontiArcDSL.g:2180:3: ( (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' ) )
            // InternalMontiArcDSL.g:2181:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            {
            // InternalMontiArcDSL.g:2181:4: (lv_type_0_1= 'Boolean' | lv_type_0_2= 'Byte' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Long' | lv_type_0_5= 'Char' | lv_type_0_6= 'Double' | lv_type_0_7= 'String' )
            int alt39=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt39=1;
                }
                break;
            case 46:
                {
                alt39=2;
                }
                break;
            case 47:
                {
                alt39=3;
                }
                break;
            case 48:
                {
                alt39=4;
                }
                break;
            case 49:
                {
                alt39=5;
                }
                break;
            case 50:
                {
                alt39=6;
                }
                break;
            case 51:
                {
                alt39=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMontiArcDSL.g:2182:5: lv_type_0_1= 'Boolean'
                    {
                    lv_type_0_1=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCObjectTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:2193:5: lv_type_0_2= 'Byte'
                    {
                    lv_type_0_2=(Token)match(input,46,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCObjectTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:2204:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCObjectTypeAccess().getTypeIntegerKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:2215:5: lv_type_0_4= 'Long'
                    {
                    lv_type_0_4=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCObjectTypeAccess().getTypeLongKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:2226:5: lv_type_0_5= 'Char'
                    {
                    lv_type_0_5=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCObjectTypeAccess().getTypeCharKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:2237:5: lv_type_0_6= 'Double'
                    {
                    lv_type_0_6=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCObjectTypeAccess().getTypeDoubleKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCObjectTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:2248:5: lv_type_0_7= 'String'
                    {
                    lv_type_0_7=(Token)match(input,51,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:2264:1: entryRuleMCCollectionType returns [EObject current=null] : iv_ruleMCCollectionType= ruleMCCollectionType EOF ;
    public final EObject entryRuleMCCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCCollectionType = null;


        try {
            // InternalMontiArcDSL.g:2264:57: (iv_ruleMCCollectionType= ruleMCCollectionType EOF )
            // InternalMontiArcDSL.g:2265:2: iv_ruleMCCollectionType= ruleMCCollectionType EOF
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
    // InternalMontiArcDSL.g:2271:1: ruleMCCollectionType returns [EObject current=null] : ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) ;
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
            // InternalMontiArcDSL.g:2277:2: ( ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' ) )
            // InternalMontiArcDSL.g:2278:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            {
            // InternalMontiArcDSL.g:2278:2: ( ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>' )
            // InternalMontiArcDSL.g:2279:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) ) otherlv_1= '<' ( (lv_innerType_2_0= ruleType ) ) otherlv_3= '>'
            {
            // InternalMontiArcDSL.g:2279:3: ( ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) ) )
            // InternalMontiArcDSL.g:2280:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            {
            // InternalMontiArcDSL.g:2280:4: ( (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' ) )
            // InternalMontiArcDSL.g:2281:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            {
            // InternalMontiArcDSL.g:2281:5: (lv_collection_0_1= 'Set' | lv_collection_0_2= 'List' | lv_collection_0_3= 'Map' | lv_collection_0_4= 'Optional' )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt40=1;
                }
                break;
            case 53:
                {
                alt40=2;
                }
                break;
            case 54:
                {
                alt40=3;
                }
                break;
            case 55:
                {
                alt40=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMontiArcDSL.g:2282:6: lv_collection_0_1= 'Set'
                    {
                    lv_collection_0_1=(Token)match(input,52,FOLLOW_44); 

                    						newLeafNode(lv_collection_0_1, grammarAccess.getMCCollectionTypeAccess().getCollectionSetKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:2293:6: lv_collection_0_2= 'List'
                    {
                    lv_collection_0_2=(Token)match(input,53,FOLLOW_44); 

                    						newLeafNode(lv_collection_0_2, grammarAccess.getMCCollectionTypeAccess().getCollectionListKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:2304:6: lv_collection_0_3= 'Map'
                    {
                    lv_collection_0_3=(Token)match(input,54,FOLLOW_44); 

                    						newLeafNode(lv_collection_0_3, grammarAccess.getMCCollectionTypeAccess().getCollectionMapKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMCCollectionTypeRule());
                    						}
                    						setWithLastConsumed(current, "collection", lv_collection_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:2315:6: lv_collection_0_4= 'Optional'
                    {
                    lv_collection_0_4=(Token)match(input,55,FOLLOW_44); 

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

            otherlv_1=(Token)match(input,56,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMCCollectionTypeAccess().getLessThanSignKeyword_1());
            		
            // InternalMontiArcDSL.g:2332:3: ( (lv_innerType_2_0= ruleType ) )
            // InternalMontiArcDSL.g:2333:4: (lv_innerType_2_0= ruleType )
            {
            // InternalMontiArcDSL.g:2333:4: (lv_innerType_2_0= ruleType )
            // InternalMontiArcDSL.g:2334:5: lv_innerType_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMCCollectionTypeAccess().getInnerTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_3=(Token)match(input,57,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:2359:1: entryRuleMCArrayType returns [EObject current=null] : iv_ruleMCArrayType= ruleMCArrayType EOF ;
    public final EObject entryRuleMCArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCArrayType = null;


        try {
            // InternalMontiArcDSL.g:2359:52: (iv_ruleMCArrayType= ruleMCArrayType EOF )
            // InternalMontiArcDSL.g:2360:2: iv_ruleMCArrayType= ruleMCArrayType EOF
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
    // InternalMontiArcDSL.g:2366:1: ruleMCArrayType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleMCArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_MCPrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2372:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) )
            // InternalMontiArcDSL.g:2373:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalMontiArcDSL.g:2373:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            // InternalMontiArcDSL.g:2374:3: this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']'
            {

            			newCompositeNode(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_MCPrimitiveType_0=ruleMCPrimitiveType();

            state._fsp--;


            			current = this_MCPrimitiveType_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,32,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:2394:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMontiArcDSL.g:2394:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMontiArcDSL.g:2395:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMontiArcDSL.g:2401:1: ruleExpression returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LiteralExpression_1 = null;

        EObject this_BinaryExpression_2 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2407:2: ( (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression ) )
            // InternalMontiArcDSL.g:2408:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            {
            // InternalMontiArcDSL.g:2408:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression | this_BinaryExpression_2= ruleBinaryExpression )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||LA41_1==15||(LA41_1>=17 && LA41_1<=18)||LA41_1==20||LA41_1==29||LA41_1==33) ) {
                    alt41=1;
                }
                else if ( (LA41_1==34||(LA41_1>=56 && LA41_1<=57)||(LA41_1>=60 && LA41_1<=64)) ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MCQUALIFIEDNAME:
                {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==EOF||LA41_2==15||(LA41_2>=17 && LA41_2<=18)||LA41_2==20||LA41_2==29||LA41_2==33) ) {
                    alt41=1;
                }
                else if ( (LA41_2==34||(LA41_2>=56 && LA41_2<=57)||(LA41_2>=60 && LA41_2<=64)) ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA41_3 = input.LA(2);

                if ( (LA41_3==34||(LA41_3>=56 && LA41_3<=57)||(LA41_3>=60 && LA41_3<=64)) ) {
                    alt41=3;
                }
                else if ( (LA41_3==EOF||LA41_3==15||(LA41_3>=17 && LA41_3<=18)||LA41_3==20||LA41_3==29||LA41_3==33) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA41_4 = input.LA(2);

                if ( (LA41_4==EOF||LA41_4==15||(LA41_4>=17 && LA41_4<=18)||LA41_4==20||LA41_4==29||LA41_4==33) ) {
                    alt41=2;
                }
                else if ( (LA41_4==34||(LA41_4>=56 && LA41_4<=57)||(LA41_4>=60 && LA41_4<=64)) ) {
                    alt41=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMontiArcDSL.g:2409:3: this_NameExpression_0= ruleNameExpression
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
                    // InternalMontiArcDSL.g:2418:3: this_LiteralExpression_1= ruleLiteralExpression
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
                    // InternalMontiArcDSL.g:2427:3: this_BinaryExpression_2= ruleBinaryExpression
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
    // InternalMontiArcDSL.g:2439:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMontiArcDSL.g:2439:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMontiArcDSL.g:2440:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalMontiArcDSL.g:2446:1: ruleLiteralExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2452:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalMontiArcDSL.g:2453:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalMontiArcDSL.g:2453:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_STRING) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMontiArcDSL.g:2454:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalMontiArcDSL.g:2463:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalMontiArcDSL.g:2475:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMontiArcDSL.g:2475:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMontiArcDSL.g:2476:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalMontiArcDSL.g:2482:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:2488:2: ( ( (lv_literal_0_0= RULE_INT ) ) )
            // InternalMontiArcDSL.g:2489:2: ( (lv_literal_0_0= RULE_INT ) )
            {
            // InternalMontiArcDSL.g:2489:2: ( (lv_literal_0_0= RULE_INT ) )
            // InternalMontiArcDSL.g:2490:3: (lv_literal_0_0= RULE_INT )
            {
            // InternalMontiArcDSL.g:2490:3: (lv_literal_0_0= RULE_INT )
            // InternalMontiArcDSL.g:2491:4: lv_literal_0_0= RULE_INT
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
    // InternalMontiArcDSL.g:2510:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMontiArcDSL.g:2510:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMontiArcDSL.g:2511:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMontiArcDSL.g:2517:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:2523:2: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // InternalMontiArcDSL.g:2524:2: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // InternalMontiArcDSL.g:2524:2: ( (lv_literal_0_0= RULE_STRING ) )
            // InternalMontiArcDSL.g:2525:3: (lv_literal_0_0= RULE_STRING )
            {
            // InternalMontiArcDSL.g:2525:3: (lv_literal_0_0= RULE_STRING )
            // InternalMontiArcDSL.g:2526:4: lv_literal_0_0= RULE_STRING
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
    // InternalMontiArcDSL.g:2545:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalMontiArcDSL.g:2545:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalMontiArcDSL.g:2546:2: iv_ruleNameExpression= ruleNameExpression EOF
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
    // InternalMontiArcDSL.g:2552:1: ruleNameExpression returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_qualifiedname_1_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:2558:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) ) )
            // InternalMontiArcDSL.g:2559:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            {
            // InternalMontiArcDSL.g:2559:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_MCQUALIFIEDNAME) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMontiArcDSL.g:2560:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalMontiArcDSL.g:2560:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalMontiArcDSL.g:2561:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:2561:4: (lv_name_0_0= RULE_ID )
                    // InternalMontiArcDSL.g:2562:5: lv_name_0_0= RULE_ID
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
                    // InternalMontiArcDSL.g:2579:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    {
                    // InternalMontiArcDSL.g:2579:3: ( (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME ) )
                    // InternalMontiArcDSL.g:2580:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    {
                    // InternalMontiArcDSL.g:2580:4: (lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME )
                    // InternalMontiArcDSL.g:2581:5: lv_qualifiedname_1_0= RULE_MCQUALIFIEDNAME
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
    // InternalMontiArcDSL.g:2601:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalMontiArcDSL.g:2601:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalMontiArcDSL.g:2602:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalMontiArcDSL.g:2608:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_literal1_0_1 = null;

        EObject lv_literal1_0_2 = null;

        Enumerator lv_op_1_0 = null;

        EObject lv_literal2_2_1 = null;

        EObject lv_literal2_2_2 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2614:2: ( ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) ) )
            // InternalMontiArcDSL.g:2615:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            {
            // InternalMontiArcDSL.g:2615:2: ( ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) ) )
            // InternalMontiArcDSL.g:2616:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) ) ( (lv_op_1_0= ruleOperator ) ) ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            {
            // InternalMontiArcDSL.g:2616:3: ( ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) ) )
            // InternalMontiArcDSL.g:2617:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            {
            // InternalMontiArcDSL.g:2617:4: ( (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression ) )
            // InternalMontiArcDSL.g:2618:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
            {
            // InternalMontiArcDSL.g:2618:5: (lv_literal1_0_1= ruleLiteralExpression | lv_literal1_0_2= ruleNameExpression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_STRING||LA44_0==RULE_INT) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_ID && LA44_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMontiArcDSL.g:2619:6: lv_literal1_0_1= ruleLiteralExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1LiteralExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_46);
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
                    // InternalMontiArcDSL.g:2635:6: lv_literal1_0_2= ruleNameExpression
                    {

                    						newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLiteral1NameExpressionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_46);
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

            // InternalMontiArcDSL.g:2653:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalMontiArcDSL.g:2654:4: (lv_op_1_0= ruleOperator )
            {
            // InternalMontiArcDSL.g:2654:4: (lv_op_1_0= ruleOperator )
            // InternalMontiArcDSL.g:2655:5: lv_op_1_0= ruleOperator
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

            // InternalMontiArcDSL.g:2672:3: ( ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) ) )
            // InternalMontiArcDSL.g:2673:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            {
            // InternalMontiArcDSL.g:2673:4: ( (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression ) )
            // InternalMontiArcDSL.g:2674:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            {
            // InternalMontiArcDSL.g:2674:5: (lv_literal2_2_1= ruleLiteralExpression | lv_literal2_2_2= ruleNameExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING||LA45_0==RULE_INT) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_MCQUALIFIEDNAME)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMontiArcDSL.g:2675:6: lv_literal2_2_1= ruleLiteralExpression
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
                    // InternalMontiArcDSL.g:2691:6: lv_literal2_2_2= ruleNameExpression
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


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcDSL.g:2713:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalMontiArcDSL.g:2713:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalMontiArcDSL.g:2714:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
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
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // InternalMontiArcDSL.g:2720:1: ruleArguments returns [EObject current=null] : (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2726:2: ( (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) )
            // InternalMontiArcDSL.g:2727:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            {
            // InternalMontiArcDSL.g:2727:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            // InternalMontiArcDSL.g:2728:3: otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMontiArcDSL.g:2732:3: ( (lv_arguments_1_0= ruleArgument ) )
            // InternalMontiArcDSL.g:2733:4: (lv_arguments_1_0= ruleArgument )
            {
            // InternalMontiArcDSL.g:2733:4: (lv_arguments_1_0= ruleArgument )
            // InternalMontiArcDSL.g:2734:5: lv_arguments_1_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
            lv_arguments_1_0=ruleArgument();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgumentsRule());
            					}
            					add(
            						current,
            						"arguments",
            						lv_arguments_1_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Argument");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:2751:3: (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==18) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMontiArcDSL.g:2752:4: otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArgumentsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMontiArcDSL.g:2756:4: ( (lv_arguments_3_0= ruleArgument ) )
            	    // InternalMontiArcDSL.g:2757:5: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // InternalMontiArcDSL.g:2757:5: (lv_arguments_3_0= ruleArgument )
            	    // InternalMontiArcDSL.g:2758:6: lv_arguments_3_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_arguments_3_0=ruleArgument();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArgumentsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.palladiosimulator.xtext.motiarc.MCBasics.Argument");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArgumentsAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleArgument"
    // InternalMontiArcDSL.g:2784:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMontiArcDSL.g:2784:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMontiArcDSL.g:2785:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMontiArcDSL.g:2791:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:2797:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMontiArcDSL.g:2798:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMontiArcDSL.g:2798:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMontiArcDSL.g:2799:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMontiArcDSL.g:2799:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiArcDSL.g:2800:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:2800:4: (lv_name_0_0= RULE_ID )
            // InternalMontiArcDSL.g:2801:5: lv_name_0_0= RULE_ID
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

            // InternalMontiArcDSL.g:2817:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMontiArcDSL.g:2818:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMontiArcDSL.g:2818:4: (lv_expression_1_0= ruleExpression )
            // InternalMontiArcDSL.g:2819:5: lv_expression_1_0= ruleExpression
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


    // $ANTLR start "ruleSCModifier"
    // InternalMontiArcDSL.g:2840:1: ruleSCModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) ;
    public final Enumerator ruleSCModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:2846:2: ( ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) ) )
            // InternalMontiArcDSL.g:2847:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            {
            // InternalMontiArcDSL.g:2847:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'final' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==58) ) {
                alt47=1;
            }
            else if ( (LA47_0==59) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalMontiArcDSL.g:2848:3: (enumLiteral_0= 'initial' )
                    {
                    // InternalMontiArcDSL.g:2848:3: (enumLiteral_0= 'initial' )
                    // InternalMontiArcDSL.g:2849:4: enumLiteral_0= 'initial'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSCModifierAccess().getINITIALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:2856:3: (enumLiteral_1= 'final' )
                    {
                    // InternalMontiArcDSL.g:2856:3: (enumLiteral_1= 'final' )
                    // InternalMontiArcDSL.g:2857:4: enumLiteral_1= 'final'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSCModifierAccess().getFINALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSCModifier"


    // $ANTLR start "ruleOperator"
    // InternalMontiArcDSL.g:2867:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) ;
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
            // InternalMontiArcDSL.g:2873:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) ) )
            // InternalMontiArcDSL.g:2874:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            {
            // InternalMontiArcDSL.g:2874:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '==' ) | (enumLiteral_3= '&&' ) | (enumLiteral_4= '+' ) | (enumLiteral_5= '-' ) | (enumLiteral_6= '/' ) | (enumLiteral_7= '*' ) )
            int alt48=8;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt48=1;
                }
                break;
            case 56:
                {
                alt48=2;
                }
                break;
            case 60:
                {
                alt48=3;
                }
                break;
            case 61:
                {
                alt48=4;
                }
                break;
            case 62:
                {
                alt48=5;
                }
                break;
            case 63:
                {
                alt48=6;
                }
                break;
            case 34:
                {
                alt48=7;
                }
                break;
            case 64:
                {
                alt48=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalMontiArcDSL.g:2875:3: (enumLiteral_0= '>' )
                    {
                    // InternalMontiArcDSL.g:2875:3: (enumLiteral_0= '>' )
                    // InternalMontiArcDSL.g:2876:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:2883:3: (enumLiteral_1= '<' )
                    {
                    // InternalMontiArcDSL.g:2883:3: (enumLiteral_1= '<' )
                    // InternalMontiArcDSL.g:2884:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getLTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:2891:3: (enumLiteral_2= '==' )
                    {
                    // InternalMontiArcDSL.g:2891:3: (enumLiteral_2= '==' )
                    // InternalMontiArcDSL.g:2892:4: enumLiteral_2= '=='
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:2899:3: (enumLiteral_3= '&&' )
                    {
                    // InternalMontiArcDSL.g:2899:3: (enumLiteral_3= '&&' )
                    // InternalMontiArcDSL.g:2900:4: enumLiteral_3= '&&'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getBAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:2907:3: (enumLiteral_4= '+' )
                    {
                    // InternalMontiArcDSL.g:2907:3: (enumLiteral_4= '+' )
                    // InternalMontiArcDSL.g:2908:4: enumLiteral_4= '+'
                    {
                    enumLiteral_4=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getPLUSEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:2915:3: (enumLiteral_5= '-' )
                    {
                    // InternalMontiArcDSL.g:2915:3: (enumLiteral_5= '-' )
                    // InternalMontiArcDSL.g:2916:4: enumLiteral_5= '-'
                    {
                    enumLiteral_5=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getMINUSEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:2923:3: (enumLiteral_6= '/' )
                    {
                    // InternalMontiArcDSL.g:2923:3: (enumLiteral_6= '/' )
                    // InternalMontiArcDSL.g:2924:4: enumLiteral_6= '/'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:2931:3: (enumLiteral_7= '*' )
                    {
                    // InternalMontiArcDSL.g:2931:3: (enumLiteral_7= '*' )
                    // InternalMontiArcDSL.g:2932:4: enumLiteral_7= '*'
                    {
                    enumLiteral_7=(Token)match(input,64,FOLLOW_2); 

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


    protected DFA26 dfa26 = new DFA26(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\3\17\1\uffff\1\4\1\24\1\uffff";
    static final String dfa_3s = "\3\73\1\uffff\1\4\1\40\1\uffff";
    static final String dfa_4s = "\3\uffff\1\1\2\uffff\1\2";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\17\uffff\1\4\32\uffff\1\1\1\2",
            "\1\3\17\uffff\1\4\32\uffff\1\1\1\2",
            "\1\3\17\uffff\1\4\32\uffff\1\1\1\2",
            "",
            "\1\5",
            "\1\3\13\uffff\1\6",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1331:2: (this_SCState_0= ruleSCState | this_InvState_1= ruleInvState )";
        }
    }
    static final String dfa_7s = "\15\uffff";
    static final String dfa_8s = "\1\uffff\10\14\4\uffff";
    static final String dfa_9s = "\1\45\10\4\4\uffff";
    static final String dfa_10s = "\1\67\10\71\4\uffff";
    static final String dfa_11s = "\11\uffff\1\3\1\4\1\2\1\1";
    static final String dfa_12s = "\15\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\11\4\12",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
            "\2\14\11\uffff\1\14\2\uffff\1\14\1\uffff\1\14\7\uffff\1\14\3\uffff\1\13\30\uffff\1\14",
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

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2015:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType | this_MCObjectType_2= ruleMCObjectType | this_MCCollectionType_3= ruleMCCollectionType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00FFFFE000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00FFFFE840414070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00FFFFE000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000002B0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003800040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00FFFFE000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010100030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0C00000080018010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0C00000080008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0C00000080000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000500300000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000500100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000000102B0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xF300000400000000L,0x0000000000000001L});

}