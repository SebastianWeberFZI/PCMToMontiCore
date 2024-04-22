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
import org.palladiosimulator.xtext.motiarc.services.MontiArcDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiArcDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_MCQUALIFIEDNAME", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'{'", "'}'", "'extends'", "','", "'='", "';'", "'connect'", "'->'", "'port'", "'in'", "'out'", "'automaton'", "'state'", "'initial'", "'/'", "'['", "']'", "'import'", "'.'", "'*'", "'package'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", "'float'", "'double'", "'('", "')'"
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
    // InternalMontiArcDSL.g:64:1: entryRuleMACompilationUnit returns [EObject current=null] : iv_ruleMACompilationUnit= ruleMACompilationUnit EOF ;
    public final EObject entryRuleMACompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMACompilationUnit = null;


        try {
            // InternalMontiArcDSL.g:64:58: (iv_ruleMACompilationUnit= ruleMACompilationUnit EOF )
            // InternalMontiArcDSL.g:65:2: iv_ruleMACompilationUnit= ruleMACompilationUnit EOF
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
    // InternalMontiArcDSL.g:71:1: ruleMACompilationUnit returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) ) ;
    public final EObject ruleMACompilationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_importStatements_1_0 = null;

        EObject lv_component_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:77:2: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) ) )
            // InternalMontiArcDSL.g:78:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) )
            {
            // InternalMontiArcDSL.g:78:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) ) )
            // InternalMontiArcDSL.g:79:3: ( (lv_package_0_0= rulePackage ) ) ( (lv_importStatements_1_0= ruleImportStatements ) )* ( (lv_component_2_0= ruleComponent ) )
            {
            // InternalMontiArcDSL.g:79:3: ( (lv_package_0_0= rulePackage ) )
            // InternalMontiArcDSL.g:80:4: (lv_package_0_0= rulePackage )
            {
            // InternalMontiArcDSL.g:80:4: (lv_package_0_0= rulePackage )
            // InternalMontiArcDSL.g:81:5: lv_package_0_0= rulePackage
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

            // InternalMontiArcDSL.g:98:3: ( (lv_importStatements_1_0= ruleImportStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMontiArcDSL.g:99:4: (lv_importStatements_1_0= ruleImportStatements )
            	    {
            	    // InternalMontiArcDSL.g:99:4: (lv_importStatements_1_0= ruleImportStatements )
            	    // InternalMontiArcDSL.g:100:5: lv_importStatements_1_0= ruleImportStatements
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

            // InternalMontiArcDSL.g:117:3: ( (lv_component_2_0= ruleComponent ) )
            // InternalMontiArcDSL.g:118:4: (lv_component_2_0= ruleComponent )
            {
            // InternalMontiArcDSL.g:118:4: (lv_component_2_0= ruleComponent )
            // InternalMontiArcDSL.g:119:5: lv_component_2_0= ruleComponent
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
    // InternalMontiArcDSL.g:140:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMontiArcDSL.g:140:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMontiArcDSL.g:141:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalMontiArcDSL.g:147:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' ) ;
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
            // InternalMontiArcDSL.g:153:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' ) )
            // InternalMontiArcDSL.g:154:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' )
            {
            // InternalMontiArcDSL.g:154:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}' )
            // InternalMontiArcDSL.g:155:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) ( (lv_signature_2_0= ruleSignature ) ) otherlv_3= '{' ( (lv_arcElements_4_0= ruleArcElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalMontiArcDSL.g:159:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:160:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:160:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcDSL.g:161:5: lv_name_1_0= RULE_ID
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

            // InternalMontiArcDSL.g:177:3: ( (lv_signature_2_0= ruleSignature ) )
            // InternalMontiArcDSL.g:178:4: (lv_signature_2_0= ruleSignature )
            {
            // InternalMontiArcDSL.g:178:4: (lv_signature_2_0= ruleSignature )
            // InternalMontiArcDSL.g:179:5: lv_signature_2_0= ruleSignature
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

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMontiArcDSL.g:200:3: ( (lv_arcElements_4_0= ruleArcElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==19||LA2_0==21||LA2_0==24||(LA2_0>=34 && LA2_0<=41)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMontiArcDSL.g:201:4: (lv_arcElements_4_0= ruleArcElement )
            	    {
            	    // InternalMontiArcDSL.g:201:4: (lv_arcElements_4_0= ruleArcElement )
            	    // InternalMontiArcDSL.g:202:5: lv_arcElements_4_0= ruleArcElement
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:227:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalMontiArcDSL.g:227:50: (iv_ruleSignature= ruleSignature EOF )
            // InternalMontiArcDSL.g:228:2: iv_ruleSignature= ruleSignature EOF
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
    // InternalMontiArcDSL.g:234:1: ruleSignature returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:240:2: ( ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? ) )
            // InternalMontiArcDSL.g:241:2: ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // InternalMontiArcDSL.g:241:2: ( () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )? )
            // InternalMontiArcDSL.g:242:3: () ( (lv_parameters_1_0= ruleParameters ) )? (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )?
            {
            // InternalMontiArcDSL.g:242:3: ()
            // InternalMontiArcDSL.g:243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSignatureAccess().getSignatureAction_0(),
            					current);
            			

            }

            // InternalMontiArcDSL.g:249:3: ( (lv_parameters_1_0= ruleParameters ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=34 && LA3_0<=41)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMontiArcDSL.g:250:4: (lv_parameters_1_0= ruleParameters )
                    {
                    // InternalMontiArcDSL.g:250:4: (lv_parameters_1_0= ruleParameters )
                    // InternalMontiArcDSL.g:251:5: lv_parameters_1_0= ruleParameters
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

            // InternalMontiArcDSL.g:268:3: (otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMontiArcDSL.g:269:4: otherlv_2= 'extends' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:273:4: ( (lv_type_3_0= ruleType ) )
                    // InternalMontiArcDSL.g:274:5: (lv_type_3_0= ruleType )
                    {
                    // InternalMontiArcDSL.g:274:5: (lv_type_3_0= ruleType )
                    // InternalMontiArcDSL.g:275:6: lv_type_3_0= ruleType
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
    // InternalMontiArcDSL.g:297:1: entryRuleParameters returns [EObject current=null] : iv_ruleParameters= ruleParameters EOF ;
    public final EObject entryRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameters = null;


        try {
            // InternalMontiArcDSL.g:297:51: (iv_ruleParameters= ruleParameters EOF )
            // InternalMontiArcDSL.g:298:2: iv_ruleParameters= ruleParameters EOF
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
    // InternalMontiArcDSL.g:304:1: ruleParameters returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:310:2: ( ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* ) )
            // InternalMontiArcDSL.g:311:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            {
            // InternalMontiArcDSL.g:311:2: ( ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )* )
            // InternalMontiArcDSL.g:312:3: ( (lv_parameters_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            {
            // InternalMontiArcDSL.g:312:3: ( (lv_parameters_0_0= ruleParameter ) )
            // InternalMontiArcDSL.g:313:4: (lv_parameters_0_0= ruleParameter )
            {
            // InternalMontiArcDSL.g:313:4: (lv_parameters_0_0= ruleParameter )
            // InternalMontiArcDSL.g:314:5: lv_parameters_0_0= ruleParameter
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

            // InternalMontiArcDSL.g:331:3: (otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMontiArcDSL.g:332:4: otherlv_1= ',' ( (lv_parameters_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParametersAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMontiArcDSL.g:336:4: ( (lv_parameters_2_0= ruleParameter ) )
            	    // InternalMontiArcDSL.g:337:5: (lv_parameters_2_0= ruleParameter )
            	    {
            	    // InternalMontiArcDSL.g:337:5: (lv_parameters_2_0= ruleParameter )
            	    // InternalMontiArcDSL.g:338:6: lv_parameters_2_0= ruleParameter
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


    // $ANTLR start "entryRuleParameter"
    // InternalMontiArcDSL.g:360:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMontiArcDSL.g:360:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMontiArcDSL.g:361:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMontiArcDSL.g:367:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:373:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? ) )
            // InternalMontiArcDSL.g:374:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            {
            // InternalMontiArcDSL.g:374:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )? )
            // InternalMontiArcDSL.g:375:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            {
            // InternalMontiArcDSL.g:375:3: ( (lv_type_0_0= ruleType ) )
            // InternalMontiArcDSL.g:376:4: (lv_type_0_0= ruleType )
            {
            // InternalMontiArcDSL.g:376:4: (lv_type_0_0= ruleType )
            // InternalMontiArcDSL.g:377:5: lv_type_0_0= ruleType
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

            // InternalMontiArcDSL.g:394:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:395:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:395:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcDSL.g:396:5: lv_name_1_0= RULE_ID
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

            // InternalMontiArcDSL.g:412:3: (otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMontiArcDSL.g:413:4: otherlv_2= '=' ( (lv_expression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:417:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMontiArcDSL.g:418:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMontiArcDSL.g:418:5: (lv_expression_3_0= ruleExpression )
                    // InternalMontiArcDSL.g:419:6: lv_expression_3_0= ruleExpression
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
    // InternalMontiArcDSL.g:441:1: entryRuleArcElement returns [EObject current=null] : iv_ruleArcElement= ruleArcElement EOF ;
    public final EObject entryRuleArcElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArcElement = null;


        try {
            // InternalMontiArcDSL.g:441:51: (iv_ruleArcElement= ruleArcElement EOF )
            // InternalMontiArcDSL.g:442:2: iv_ruleArcElement= ruleArcElement EOF
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
    // InternalMontiArcDSL.g:448:1: ruleArcElement returns [EObject current=null] : (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton ) ;
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
            // InternalMontiArcDSL.g:454:2: ( (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton ) )
            // InternalMontiArcDSL.g:455:2: (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton )
            {
            // InternalMontiArcDSL.g:455:2: (this_Component_0= ruleComponent | this_SubComponent_1= ruleSubComponent | this_Connector_2= ruleConnector | this_Ports_3= rulePorts | this_Variable_4= ruleVariable | this_Automaton_5= ruleAutomaton )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=34 && LA7_1<=41)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt7=5;
                }
                break;
            case 24:
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
                    // InternalMontiArcDSL.g:456:3: this_Component_0= ruleComponent
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
                    // InternalMontiArcDSL.g:465:3: this_SubComponent_1= ruleSubComponent
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
                    // InternalMontiArcDSL.g:474:3: this_Connector_2= ruleConnector
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
                    // InternalMontiArcDSL.g:483:3: this_Ports_3= rulePorts
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
                    // InternalMontiArcDSL.g:492:3: this_Variable_4= ruleVariable
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
                    // InternalMontiArcDSL.g:501:3: this_Automaton_5= ruleAutomaton
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
    // InternalMontiArcDSL.g:513:1: entryRuleSubComponent returns [EObject current=null] : iv_ruleSubComponent= ruleSubComponent EOF ;
    public final EObject entryRuleSubComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponent = null;


        try {
            // InternalMontiArcDSL.g:513:53: (iv_ruleSubComponent= ruleSubComponent EOF )
            // InternalMontiArcDSL.g:514:2: iv_ruleSubComponent= ruleSubComponent EOF
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
    // InternalMontiArcDSL.g:520:1: ruleSubComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' ) ;
    public final EObject ruleSubComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_instances_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:526:2: ( (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:527:2: (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:527:2: (otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';' )
            // InternalMontiArcDSL.g:528:3: otherlv_0= 'component' ( (lv_type_1_0= ruleType ) ) ( (lv_arguments_2_0= ruleArguments ) )? ( (lv_instances_3_0= ruleNames ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSubComponentAccess().getComponentKeyword_0());
            		
            // InternalMontiArcDSL.g:532:3: ( (lv_type_1_0= ruleType ) )
            // InternalMontiArcDSL.g:533:4: (lv_type_1_0= ruleType )
            {
            // InternalMontiArcDSL.g:533:4: (lv_type_1_0= ruleType )
            // InternalMontiArcDSL.g:534:5: lv_type_1_0= ruleType
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

            // InternalMontiArcDSL.g:551:3: ( (lv_arguments_2_0= ruleArguments ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMontiArcDSL.g:552:4: (lv_arguments_2_0= ruleArguments )
                    {
                    // InternalMontiArcDSL.g:552:4: (lv_arguments_2_0= ruleArguments )
                    // InternalMontiArcDSL.g:553:5: lv_arguments_2_0= ruleArguments
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

            // InternalMontiArcDSL.g:570:3: ( (lv_instances_3_0= ruleNames ) )
            // InternalMontiArcDSL.g:571:4: (lv_instances_3_0= ruleNames )
            {
            // InternalMontiArcDSL.g:571:4: (lv_instances_3_0= ruleNames )
            // InternalMontiArcDSL.g:572:5: lv_instances_3_0= ruleNames
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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:597:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // InternalMontiArcDSL.g:597:50: (iv_ruleConnector= ruleConnector EOF )
            // InternalMontiArcDSL.g:598:2: iv_ruleConnector= ruleConnector EOF
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
    // InternalMontiArcDSL.g:604:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connect' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_targets_3_0= ruleNames ) ) otherlv_4= ';' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_targets_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:610:2: ( (otherlv_0= 'connect' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_targets_3_0= ruleNames ) ) otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:611:2: (otherlv_0= 'connect' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_targets_3_0= ruleNames ) ) otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:611:2: (otherlv_0= 'connect' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_targets_3_0= ruleNames ) ) otherlv_4= ';' )
            // InternalMontiArcDSL.g:612:3: otherlv_0= 'connect' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_targets_3_0= ruleNames ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectKeyword_0());
            		
            // InternalMontiArcDSL.g:616:3: ( (lv_source_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:617:4: (lv_source_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:617:4: (lv_source_1_0= RULE_ID )
            // InternalMontiArcDSL.g:618:5: lv_source_1_0= RULE_ID
            {
            lv_source_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_source_1_0, grammarAccess.getConnectorAccess().getSourceIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalMontiArcDSL.g:638:3: ( (lv_targets_3_0= ruleNames ) )
            // InternalMontiArcDSL.g:639:4: (lv_targets_3_0= ruleNames )
            {
            // InternalMontiArcDSL.g:639:4: (lv_targets_3_0= ruleNames )
            // InternalMontiArcDSL.g:640:5: lv_targets_3_0= ruleNames
            {

            					newCompositeNode(grammarAccess.getConnectorAccess().getTargetsNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_targets_3_0=ruleNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectorRule());
            					}
            					set(
            						current,
            						"targets",
            						lv_targets_3_0,
            						"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Names");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getSemicolonKeyword_4());
            		

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
    // InternalMontiArcDSL.g:665:1: entryRulePorts returns [EObject current=null] : iv_rulePorts= rulePorts EOF ;
    public final EObject entryRulePorts() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePorts = null;


        try {
            // InternalMontiArcDSL.g:665:46: (iv_rulePorts= rulePorts EOF )
            // InternalMontiArcDSL.g:666:2: iv_rulePorts= rulePorts EOF
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
    // InternalMontiArcDSL.g:672:1: rulePorts returns [EObject current=null] : (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )+ otherlv_4= ';' ) ;
    public final EObject rulePorts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ports_1_0 = null;

        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:678:2: ( (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )+ otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:679:2: (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )+ otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:679:2: (otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )+ otherlv_4= ';' )
            // InternalMontiArcDSL.g:680:3: otherlv_0= 'port' ( (lv_ports_1_0= rulePort ) ) (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )+ otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPortsAccess().getPortKeyword_0());
            		
            // InternalMontiArcDSL.g:684:3: ( (lv_ports_1_0= rulePort ) )
            // InternalMontiArcDSL.g:685:4: (lv_ports_1_0= rulePort )
            {
            // InternalMontiArcDSL.g:685:4: (lv_ports_1_0= rulePort )
            // InternalMontiArcDSL.g:686:5: lv_ports_1_0= rulePort
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

            // InternalMontiArcDSL.g:703:3: (otherlv_2= ',' ( (lv_ports_3_0= rulePort ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMontiArcDSL.g:704:4: otherlv_2= ',' ( (lv_ports_3_0= rulePort ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPortsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMontiArcDSL.g:708:4: ( (lv_ports_3_0= rulePort ) )
            	    // InternalMontiArcDSL.g:709:5: (lv_ports_3_0= rulePort )
            	    {
            	    // InternalMontiArcDSL.g:709:5: (lv_ports_3_0= rulePort )
            	    // InternalMontiArcDSL.g:710:6: lv_ports_3_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getPortsAccess().getPortsPortParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:736:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalMontiArcDSL.g:736:45: (iv_rulePort= rulePort EOF )
            // InternalMontiArcDSL.g:737:2: iv_rulePort= rulePort EOF
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
    // InternalMontiArcDSL.g:743:1: rulePort returns [EObject current=null] : ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_names_3_0= ruleNames ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_in_0_0=null;
        Token lv_out_1_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_names_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:749:2: ( ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_names_3_0= ruleNames ) )? ) )
            // InternalMontiArcDSL.g:750:2: ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_names_3_0= ruleNames ) )? )
            {
            // InternalMontiArcDSL.g:750:2: ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_names_3_0= ruleNames ) )? )
            // InternalMontiArcDSL.g:751:3: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_names_3_0= ruleNames ) )?
            {
            // InternalMontiArcDSL.g:751:3: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMontiArcDSL.g:752:4: ( (lv_in_0_0= 'in' ) )
                    {
                    // InternalMontiArcDSL.g:752:4: ( (lv_in_0_0= 'in' ) )
                    // InternalMontiArcDSL.g:753:5: (lv_in_0_0= 'in' )
                    {
                    // InternalMontiArcDSL.g:753:5: (lv_in_0_0= 'in' )
                    // InternalMontiArcDSL.g:754:6: lv_in_0_0= 'in'
                    {
                    lv_in_0_0=(Token)match(input,22,FOLLOW_9); 

                    						newLeafNode(lv_in_0_0, grammarAccess.getPortAccess().getInInKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(current, "in", lv_in_0_0 != null, "in");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:767:4: ( (lv_out_1_0= 'out' ) )
                    {
                    // InternalMontiArcDSL.g:767:4: ( (lv_out_1_0= 'out' ) )
                    // InternalMontiArcDSL.g:768:5: (lv_out_1_0= 'out' )
                    {
                    // InternalMontiArcDSL.g:768:5: (lv_out_1_0= 'out' )
                    // InternalMontiArcDSL.g:769:6: lv_out_1_0= 'out'
                    {
                    lv_out_1_0=(Token)match(input,23,FOLLOW_9); 

                    						newLeafNode(lv_out_1_0, grammarAccess.getPortAccess().getOutOutKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPortRule());
                    						}
                    						setWithLastConsumed(current, "out", lv_out_1_0 != null, "out");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:782:3: ( (lv_type_2_0= ruleType ) )
            // InternalMontiArcDSL.g:783:4: (lv_type_2_0= ruleType )
            {
            // InternalMontiArcDSL.g:783:4: (lv_type_2_0= ruleType )
            // InternalMontiArcDSL.g:784:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:801:3: ( (lv_names_3_0= ruleNames ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiArcDSL.g:802:4: (lv_names_3_0= ruleNames )
                    {
                    // InternalMontiArcDSL.g:802:4: (lv_names_3_0= ruleNames )
                    // InternalMontiArcDSL.g:803:5: lv_names_3_0= ruleNames
                    {

                    					newCompositeNode(grammarAccess.getPortAccess().getNamesNamesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_names_3_0=ruleNames();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPortRule());
                    					}
                    					set(
                    						current,
                    						"names",
                    						lv_names_3_0 != null,
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


    // $ANTLR start "entryRuleNames"
    // InternalMontiArcDSL.g:824:1: entryRuleNames returns [EObject current=null] : iv_ruleNames= ruleNames EOF ;
    public final EObject entryRuleNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNames = null;


        try {
            // InternalMontiArcDSL.g:824:46: (iv_ruleNames= ruleNames EOF )
            // InternalMontiArcDSL.g:825:2: iv_ruleNames= ruleNames EOF
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
    // InternalMontiArcDSL.g:831:1: ruleNames returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleNames() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:837:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalMontiArcDSL.g:838:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalMontiArcDSL.g:838:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalMontiArcDSL.g:839:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalMontiArcDSL.g:839:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalMontiArcDSL.g:840:4: (lv_names_0_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:840:4: (lv_names_0_0= RULE_ID )
            // InternalMontiArcDSL.g:841:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_names_0_0, grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNamesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcDSL.g:857:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMontiArcDSL.g:858:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getNamesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMontiArcDSL.g:862:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalMontiArcDSL.g:863:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalMontiArcDSL.g:863:5: (lv_names_2_0= RULE_ID )
            	    // InternalMontiArcDSL.g:864:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getNamesAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNamesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMontiArcDSL.g:885:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMontiArcDSL.g:885:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMontiArcDSL.g:886:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMontiArcDSL.g:892:1: ruleVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_names_1_0= ruleNames ) )? otherlv_2= ';' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_names_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:898:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_names_1_0= ruleNames ) )? otherlv_2= ';' ) )
            // InternalMontiArcDSL.g:899:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_names_1_0= ruleNames ) )? otherlv_2= ';' )
            {
            // InternalMontiArcDSL.g:899:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_names_1_0= ruleNames ) )? otherlv_2= ';' )
            // InternalMontiArcDSL.g:900:3: ( (lv_type_0_0= ruleType ) ) ( (lv_names_1_0= ruleNames ) )? otherlv_2= ';'
            {
            // InternalMontiArcDSL.g:900:3: ( (lv_type_0_0= ruleType ) )
            // InternalMontiArcDSL.g:901:4: (lv_type_0_0= ruleType )
            {
            // InternalMontiArcDSL.g:901:4: (lv_type_0_0= ruleType )
            // InternalMontiArcDSL.g:902:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:919:3: ( (lv_names_1_0= ruleNames ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMontiArcDSL.g:920:4: (lv_names_1_0= ruleNames )
                    {
                    // InternalMontiArcDSL.g:920:4: (lv_names_1_0= ruleNames )
                    // InternalMontiArcDSL.g:921:5: lv_names_1_0= ruleNames
                    {

                    					newCompositeNode(grammarAccess.getVariableAccess().getNamesNamesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getSemicolonKeyword_2());
            		

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
    // InternalMontiArcDSL.g:946:1: entryRuleAutomaton returns [EObject current=null] : iv_ruleAutomaton= ruleAutomaton EOF ;
    public final EObject entryRuleAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomaton = null;


        try {
            // InternalMontiArcDSL.g:946:50: (iv_ruleAutomaton= ruleAutomaton EOF )
            // InternalMontiArcDSL.g:947:2: iv_ruleAutomaton= ruleAutomaton EOF
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
    // InternalMontiArcDSL.g:953:1: ruleAutomaton returns [EObject current=null] : ( () otherlv_1= 'automaton' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_initialStates_5_0= ruleInitialState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleAutomaton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_states_4_0 = null;

        EObject lv_initialStates_5_0 = null;

        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:959:2: ( ( () otherlv_1= 'automaton' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_initialStates_5_0= ruleInitialState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' ) )
            // InternalMontiArcDSL.g:960:2: ( () otherlv_1= 'automaton' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_initialStates_5_0= ruleInitialState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            {
            // InternalMontiArcDSL.g:960:2: ( () otherlv_1= 'automaton' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_initialStates_5_0= ruleInitialState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}' )
            // InternalMontiArcDSL.g:961:3: () otherlv_1= 'automaton' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( ( (lv_states_4_0= ruleState ) ) | ( (lv_initialStates_5_0= ruleInitialState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )* otherlv_7= '}'
            {
            // InternalMontiArcDSL.g:961:3: ()
            // InternalMontiArcDSL.g:962:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutomatonAccess().getAutomatonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAutomatonAccess().getAutomatonKeyword_1());
            		
            // InternalMontiArcDSL.g:972:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMontiArcDSL.g:973:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:973:4: (lv_name_2_0= RULE_ID )
                    // InternalMontiArcDSL.g:974:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getAutomatonAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAutomatonRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0 != null,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getAutomatonAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMontiArcDSL.g:994:3: ( ( (lv_states_4_0= ruleState ) ) | ( (lv_initialStates_5_0= ruleInitialState ) ) | ( (lv_transitions_6_0= ruleTransition ) ) )*
            loop15:
            do {
                int alt15=4;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt15=1;
                    }
                    break;
                case 26:
                    {
                    alt15=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt15=3;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalMontiArcDSL.g:995:4: ( (lv_states_4_0= ruleState ) )
            	    {
            	    // InternalMontiArcDSL.g:995:4: ( (lv_states_4_0= ruleState ) )
            	    // InternalMontiArcDSL.g:996:5: (lv_states_4_0= ruleState )
            	    {
            	    // InternalMontiArcDSL.g:996:5: (lv_states_4_0= ruleState )
            	    // InternalMontiArcDSL.g:997:6: lv_states_4_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getStatesStateParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_4_0,
            	    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMontiArcDSL.g:1015:4: ( (lv_initialStates_5_0= ruleInitialState ) )
            	    {
            	    // InternalMontiArcDSL.g:1015:4: ( (lv_initialStates_5_0= ruleInitialState ) )
            	    // InternalMontiArcDSL.g:1016:5: (lv_initialStates_5_0= ruleInitialState )
            	    {
            	    // InternalMontiArcDSL.g:1016:5: (lv_initialStates_5_0= ruleInitialState )
            	    // InternalMontiArcDSL.g:1017:6: lv_initialStates_5_0= ruleInitialState
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getInitialStatesInitialStateParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_initialStates_5_0=ruleInitialState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAutomatonRule());
            	    						}
            	    						add(
            	    							current,
            	    							"initialStates",
            	    							lv_initialStates_5_0,
            	    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.InitialState");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMontiArcDSL.g:1035:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    {
            	    // InternalMontiArcDSL.g:1035:4: ( (lv_transitions_6_0= ruleTransition ) )
            	    // InternalMontiArcDSL.g:1036:5: (lv_transitions_6_0= ruleTransition )
            	    {
            	    // InternalMontiArcDSL.g:1036:5: (lv_transitions_6_0= ruleTransition )
            	    // InternalMontiArcDSL.g:1037:6: lv_transitions_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getAutomatonAccess().getTransitionsTransitionParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomatonAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMontiArcDSL.g:1063:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMontiArcDSL.g:1063:46: (iv_ruleState= ruleState EOF )
            // InternalMontiArcDSL.g:1064:2: iv_ruleState= ruleState EOF
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
    // InternalMontiArcDSL.g:1070:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1076:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalMontiArcDSL.g:1077:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalMontiArcDSL.g:1077:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalMontiArcDSL.g:1078:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMontiArcDSL.g:1082:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1083:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1083:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcDSL.g:1084:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
            		

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


    // $ANTLR start "entryRuleInitialState"
    // InternalMontiArcDSL.g:1108:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalMontiArcDSL.g:1108:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalMontiArcDSL.g:1109:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
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
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMontiArcDSL.g:1115:1: ruleInitialState returns [EObject current=null] : (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_block_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1121:2: ( (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) ) )? otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:1122:2: (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) ) )? otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:1122:2: (otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) ) )? otherlv_4= ';' )
            // InternalMontiArcDSL.g:1123:3: otherlv_0= 'initial' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialStateAccess().getInitialKeyword_0());
            		
            // InternalMontiArcDSL.g:1127:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1128:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1128:4: (lv_name_1_0= RULE_ID )
            // InternalMontiArcDSL.g:1129:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInitialStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMontiArcDSL.g:1145:3: (otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMontiArcDSL.g:1146:4: otherlv_2= '/' ( (lv_block_3_0= ruleBlock ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitialStateAccess().getSolidusKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:1150:4: ( (lv_block_3_0= ruleBlock ) )
                    // InternalMontiArcDSL.g:1151:5: (lv_block_3_0= ruleBlock )
                    {
                    // InternalMontiArcDSL.g:1151:5: (lv_block_3_0= ruleBlock )
                    // InternalMontiArcDSL.g:1152:6: lv_block_3_0= ruleBlock
                    {

                    						newCompositeNode(grammarAccess.getInitialStateAccess().getBlockBlockParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_block_3_0=ruleBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInitialStateRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_3_0 != null,
                    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInitialStateAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleTransition"
    // InternalMontiArcDSL.g:1178:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMontiArcDSL.g:1178:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMontiArcDSL.g:1179:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalMontiArcDSL.g:1185:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' ) ;
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
            // InternalMontiArcDSL.g:1191:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' ) )
            // InternalMontiArcDSL.g:1192:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' )
            {
            // InternalMontiArcDSL.g:1192:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';' )
            // InternalMontiArcDSL.g:1193:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )? (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )? otherlv_8= ';'
            {
            // InternalMontiArcDSL.g:1193:3: ( (otherlv_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1194:4: (otherlv_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1194:4: (otherlv_0= RULE_ID )
            // InternalMontiArcDSL.g:1195:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getSourceStateCrossReference_0_0());
            				

            }


            }

            // InternalMontiArcDSL.g:1206:3: (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMontiArcDSL.g:1207:4: otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                    			
                    // InternalMontiArcDSL.g:1211:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMontiArcDSL.g:1212:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1212:5: (otherlv_2= RULE_ID )
                    // InternalMontiArcDSL.g:1213:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_25); 

                    						newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getTargetCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMontiArcDSL.g:1225:3: (otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMontiArcDSL.g:1226:4: otherlv_3= '[' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:1230:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalMontiArcDSL.g:1231:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalMontiArcDSL.g:1231:5: (lv_expression_4_0= ruleExpression )
                    // InternalMontiArcDSL.g:1232:6: lv_expression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getExpressionExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0 != null,
                    							"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalMontiArcDSL.g:1254:3: (otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMontiArcDSL.g:1255:4: otherlv_6= '/' ( (lv_reaction_7_0= ruleBlock ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSolidusKeyword_3_0());
                    			
                    // InternalMontiArcDSL.g:1259:4: ( (lv_reaction_7_0= ruleBlock ) )
                    // InternalMontiArcDSL.g:1260:5: (lv_reaction_7_0= ruleBlock )
                    {
                    // InternalMontiArcDSL.g:1260:5: (lv_reaction_7_0= ruleBlock )
                    // InternalMontiArcDSL.g:1261:6: lv_reaction_7_0= ruleBlock
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
                    							lv_reaction_7_0 != null,
                    							"org.palladiosimulator.xtext.motiarc.MontiArcDSL.Block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:1287:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMontiArcDSL.g:1287:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMontiArcDSL.g:1288:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalMontiArcDSL.g:1294:1: ruleBlock returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_expressions_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expressions_3_0 = null;

        EObject lv_expressions_5_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1300:2: ( (otherlv_0= '{' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_expressions_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) ) )* otherlv_6= '}' ) )
            // InternalMontiArcDSL.g:1301:2: (otherlv_0= '{' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_expressions_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) ) )* otherlv_6= '}' )
            {
            // InternalMontiArcDSL.g:1301:2: (otherlv_0= '{' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_expressions_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) ) )* otherlv_6= '}' )
            // InternalMontiArcDSL.g:1302:3: otherlv_0= '{' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_expressions_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMontiArcDSL.g:1306:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==17) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMontiArcDSL.g:1307:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // InternalMontiArcDSL.g:1307:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMontiArcDSL.g:1308:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMontiArcDSL.g:1308:5: (lv_name_1_0= RULE_ID )
                    // InternalMontiArcDSL.g:1309:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0 != null,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getEqualsSignKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMontiArcDSL.g:1330:3: ( (lv_expressions_3_0= ruleExpression ) )
            // InternalMontiArcDSL.g:1331:4: (lv_expressions_3_0= ruleExpression )
            {
            // InternalMontiArcDSL.g:1331:4: (lv_expressions_3_0= ruleExpression )
            // InternalMontiArcDSL.g:1332:5: lv_expressions_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_expressions_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_3_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMontiArcDSL.g:1349:3: (otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1350:4: otherlv_4= ',' ( (lv_expressions_5_0= ruleExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalMontiArcDSL.g:1354:4: ( (lv_expressions_5_0= ruleExpression ) )
            	    // InternalMontiArcDSL.g:1355:5: (lv_expressions_5_0= ruleExpression )
            	    {
            	    // InternalMontiArcDSL.g:1355:5: (lv_expressions_5_0= ruleExpression )
            	    // InternalMontiArcDSL.g:1356:6: lv_expressions_5_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBlockAccess().getExpressionsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_expressions_5_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_5_0,
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleImportStatements"
    // InternalMontiArcDSL.g:1382:1: entryRuleImportStatements returns [EObject current=null] : iv_ruleImportStatements= ruleImportStatements EOF ;
    public final EObject entryRuleImportStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatements = null;


        try {
            // InternalMontiArcDSL.g:1382:57: (iv_ruleImportStatements= ruleImportStatements EOF )
            // InternalMontiArcDSL.g:1383:2: iv_ruleImportStatements= ruleImportStatements EOF
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
    // InternalMontiArcDSL.g:1389:1: ruleImportStatements returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleImportStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importUri_1_0=null;
        Token otherlv_2=null;
        Token lv_star_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1395:2: ( (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' ) )
            // InternalMontiArcDSL.g:1396:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' )
            {
            // InternalMontiArcDSL.g:1396:2: (otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';' )
            // InternalMontiArcDSL.g:1397:3: otherlv_0= 'import' ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) ) (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getImportStatementsAccess().getImportKeyword_0());
            		
            // InternalMontiArcDSL.g:1401:3: ( (lv_importUri_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:1402:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:1402:4: (lv_importUri_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:1403:5: lv_importUri_1_0= RULE_MCQUALIFIEDNAME
            {
            lv_importUri_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_30); 

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

            // InternalMontiArcDSL.g:1419:3: (otherlv_2= '.' ( (lv_star_3_0= '*' ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMontiArcDSL.g:1420:4: otherlv_2= '.' ( (lv_star_3_0= '*' ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getImportStatementsAccess().getFullStopKeyword_2_0());
                    			
                    // InternalMontiArcDSL.g:1424:4: ( (lv_star_3_0= '*' ) )
                    // InternalMontiArcDSL.g:1425:5: (lv_star_3_0= '*' )
                    {
                    // InternalMontiArcDSL.g:1425:5: (lv_star_3_0= '*' )
                    // InternalMontiArcDSL.g:1426:6: lv_star_3_0= '*'
                    {
                    lv_star_3_0=(Token)match(input,32,FOLLOW_14); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRulePackage"
    // InternalMontiArcDSL.g:1447:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalMontiArcDSL.g:1447:48: (iv_rulePackage= rulePackage EOF )
            // InternalMontiArcDSL.g:1448:2: iv_rulePackage= rulePackage EOF
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
    // InternalMontiArcDSL.g:1454:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_MCQUALIFIEDNAME ) ) otherlv_2= ';' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1460:2: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_MCQUALIFIEDNAME ) ) otherlv_2= ';' ) )
            // InternalMontiArcDSL.g:1461:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_MCQUALIFIEDNAME ) ) otherlv_2= ';' )
            {
            // InternalMontiArcDSL.g:1461:2: (otherlv_0= 'package' ( (lv_name_1_0= RULE_MCQUALIFIEDNAME ) ) otherlv_2= ';' )
            // InternalMontiArcDSL.g:1462:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_MCQUALIFIEDNAME ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalMontiArcDSL.g:1466:3: ( (lv_name_1_0= RULE_MCQUALIFIEDNAME ) )
            // InternalMontiArcDSL.g:1467:4: (lv_name_1_0= RULE_MCQUALIFIEDNAME )
            {
            // InternalMontiArcDSL.g:1467:4: (lv_name_1_0= RULE_MCQUALIFIEDNAME )
            // InternalMontiArcDSL.g:1468:5: lv_name_1_0= RULE_MCQUALIFIEDNAME
            {
            lv_name_1_0=(Token)match(input,RULE_MCQUALIFIEDNAME,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameMCQUALIFIEDNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.palladiosimulator.xtext.motiarc.MCBasics.MCQUALIFIEDNAME");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:1492:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMontiArcDSL.g:1492:45: (iv_ruleType= ruleType EOF )
            // InternalMontiArcDSL.g:1493:2: iv_ruleType= ruleType EOF
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
    // InternalMontiArcDSL.g:1499:1: ruleType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MCPrimitiveType_0 = null;

        EObject this_MCArrayType_1 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1505:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType ) )
            // InternalMontiArcDSL.g:1506:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType )
            {
            // InternalMontiArcDSL.g:1506:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalMontiArcDSL.g:1507:3: this_MCPrimitiveType_0= ruleMCPrimitiveType
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
                    // InternalMontiArcDSL.g:1516:3: this_MCArrayType_1= ruleMCArrayType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMCArrayTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MCArrayType_1=ruleMCArrayType();

                    state._fsp--;


                    			current = this_MCArrayType_1;
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
    // InternalMontiArcDSL.g:1528:1: entryRuleMCPrimitiveType returns [EObject current=null] : iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF ;
    public final EObject entryRuleMCPrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCPrimitiveType = null;


        try {
            // InternalMontiArcDSL.g:1528:56: (iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF )
            // InternalMontiArcDSL.g:1529:2: iv_ruleMCPrimitiveType= ruleMCPrimitiveType EOF
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
    // InternalMontiArcDSL.g:1535:1: ruleMCPrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) ;
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
            // InternalMontiArcDSL.g:1541:2: ( ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) ) )
            // InternalMontiArcDSL.g:1542:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            {
            // InternalMontiArcDSL.g:1542:2: ( ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) ) )
            // InternalMontiArcDSL.g:1543:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            {
            // InternalMontiArcDSL.g:1543:3: ( (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' ) )
            // InternalMontiArcDSL.g:1544:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            {
            // InternalMontiArcDSL.g:1544:4: (lv_type_0_1= 'boolean' | lv_type_0_2= 'byte' | lv_type_0_3= 'short' | lv_type_0_4= 'int' | lv_type_0_5= 'long' | lv_type_0_6= 'char' | lv_type_0_7= 'float' | lv_type_0_8= 'double' )
            int alt24=8;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            case 37:
                {
                alt24=4;
                }
                break;
            case 38:
                {
                alt24=5;
                }
                break;
            case 39:
                {
                alt24=6;
                }
                break;
            case 40:
                {
                alt24=7;
                }
                break;
            case 41:
                {
                alt24=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMontiArcDSL.g:1545:5: lv_type_0_1= 'boolean'
                    {
                    lv_type_0_1=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getMCPrimitiveTypeAccess().getTypeBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMontiArcDSL.g:1556:5: lv_type_0_2= 'byte'
                    {
                    lv_type_0_2=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getMCPrimitiveTypeAccess().getTypeByteKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMontiArcDSL.g:1567:5: lv_type_0_3= 'short'
                    {
                    lv_type_0_3=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getMCPrimitiveTypeAccess().getTypeShortKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMontiArcDSL.g:1578:5: lv_type_0_4= 'int'
                    {
                    lv_type_0_4=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getMCPrimitiveTypeAccess().getTypeIntKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMontiArcDSL.g:1589:5: lv_type_0_5= 'long'
                    {
                    lv_type_0_5=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_type_0_5, grammarAccess.getMCPrimitiveTypeAccess().getTypeLongKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMontiArcDSL.g:1600:5: lv_type_0_6= 'char'
                    {
                    lv_type_0_6=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_type_0_6, grammarAccess.getMCPrimitiveTypeAccess().getTypeCharKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMontiArcDSL.g:1611:5: lv_type_0_7= 'float'
                    {
                    lv_type_0_7=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_type_0_7, grammarAccess.getMCPrimitiveTypeAccess().getTypeFloatKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMCPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMontiArcDSL.g:1622:5: lv_type_0_8= 'double'
                    {
                    lv_type_0_8=(Token)match(input,41,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:1638:1: entryRuleMCArrayType returns [EObject current=null] : iv_ruleMCArrayType= ruleMCArrayType EOF ;
    public final EObject entryRuleMCArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCArrayType = null;


        try {
            // InternalMontiArcDSL.g:1638:52: (iv_ruleMCArrayType= ruleMCArrayType EOF )
            // InternalMontiArcDSL.g:1639:2: iv_ruleMCArrayType= ruleMCArrayType EOF
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
    // InternalMontiArcDSL.g:1645:1: ruleMCArrayType returns [EObject current=null] : (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) ;
    public final EObject ruleMCArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_MCPrimitiveType_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1651:2: ( (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' ) )
            // InternalMontiArcDSL.g:1652:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            {
            // InternalMontiArcDSL.g:1652:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']' )
            // InternalMontiArcDSL.g:1653:3: this_MCPrimitiveType_0= ruleMCPrimitiveType otherlv_1= '[' otherlv_2= ']'
            {

            			newCompositeNode(grammarAccess.getMCArrayTypeAccess().getMCPrimitiveTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_MCPrimitiveType_0=ruleMCPrimitiveType();

            state._fsp--;


            			current = this_MCPrimitiveType_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getMCArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:1673:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMontiArcDSL.g:1673:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMontiArcDSL.g:1674:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMontiArcDSL.g:1680:1: ruleExpression returns [EObject current=null] : (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NameExpression_0 = null;

        EObject this_LiteralExpression_1 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1686:2: ( (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression ) )
            // InternalMontiArcDSL.g:1687:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression )
            {
            // InternalMontiArcDSL.g:1687:2: (this_NameExpression_0= ruleNameExpression | this_LiteralExpression_1= ruleLiteralExpression )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_STRING)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMontiArcDSL.g:1688:3: this_NameExpression_0= ruleNameExpression
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
                    // InternalMontiArcDSL.g:1697:3: this_LiteralExpression_1= ruleLiteralExpression
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
    // InternalMontiArcDSL.g:1709:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // InternalMontiArcDSL.g:1709:58: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // InternalMontiArcDSL.g:1710:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
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
    // InternalMontiArcDSL.g:1716:1: ruleLiteralExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1722:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral ) )
            // InternalMontiArcDSL.g:1723:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            {
            // InternalMontiArcDSL.g:1723:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMontiArcDSL.g:1724:3: this_NumberLiteral_0= ruleNumberLiteral
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
                    // InternalMontiArcDSL.g:1733:3: this_StringLiteral_1= ruleStringLiteral
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
    // InternalMontiArcDSL.g:1745:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMontiArcDSL.g:1745:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMontiArcDSL.g:1746:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
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
    // InternalMontiArcDSL.g:1752:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1758:2: ( ( (lv_literal_0_0= RULE_INT ) ) )
            // InternalMontiArcDSL.g:1759:2: ( (lv_literal_0_0= RULE_INT ) )
            {
            // InternalMontiArcDSL.g:1759:2: ( (lv_literal_0_0= RULE_INT ) )
            // InternalMontiArcDSL.g:1760:3: (lv_literal_0_0= RULE_INT )
            {
            // InternalMontiArcDSL.g:1760:3: (lv_literal_0_0= RULE_INT )
            // InternalMontiArcDSL.g:1761:4: lv_literal_0_0= RULE_INT
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
    // InternalMontiArcDSL.g:1780:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMontiArcDSL.g:1780:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMontiArcDSL.g:1781:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalMontiArcDSL.g:1787:1: ruleStringLiteral returns [EObject current=null] : ( (lv_literal_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_literal_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1793:2: ( ( (lv_literal_0_0= RULE_STRING ) ) )
            // InternalMontiArcDSL.g:1794:2: ( (lv_literal_0_0= RULE_STRING ) )
            {
            // InternalMontiArcDSL.g:1794:2: ( (lv_literal_0_0= RULE_STRING ) )
            // InternalMontiArcDSL.g:1795:3: (lv_literal_0_0= RULE_STRING )
            {
            // InternalMontiArcDSL.g:1795:3: (lv_literal_0_0= RULE_STRING )
            // InternalMontiArcDSL.g:1796:4: lv_literal_0_0= RULE_STRING
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
    // InternalMontiArcDSL.g:1815:1: entryRuleNameExpression returns [EObject current=null] : iv_ruleNameExpression= ruleNameExpression EOF ;
    public final EObject entryRuleNameExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpression = null;


        try {
            // InternalMontiArcDSL.g:1815:55: (iv_ruleNameExpression= ruleNameExpression EOF )
            // InternalMontiArcDSL.g:1816:2: iv_ruleNameExpression= ruleNameExpression EOF
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
    // InternalMontiArcDSL.g:1822:1: ruleNameExpression returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNameExpression() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMontiArcDSL.g:1828:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMontiArcDSL.g:1829:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMontiArcDSL.g:1829:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1830:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1830:3: (lv_name_0_0= RULE_ID )
            // InternalMontiArcDSL.g:1831:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleArguments"
    // InternalMontiArcDSL.g:1850:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // InternalMontiArcDSL.g:1850:50: (iv_ruleArguments= ruleArguments EOF )
            // InternalMontiArcDSL.g:1851:2: iv_ruleArguments= ruleArguments EOF
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
    // InternalMontiArcDSL.g:1857:1: ruleArguments returns [EObject current=null] : (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arguments_1_0 = null;

        EObject lv_arguments_3_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1863:2: ( (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' ) )
            // InternalMontiArcDSL.g:1864:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            {
            // InternalMontiArcDSL.g:1864:2: (otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')' )
            // InternalMontiArcDSL.g:1865:3: otherlv_0= '(' ( (lv_arguments_1_0= ruleArgument ) ) (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArgumentsAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMontiArcDSL.g:1869:3: ( (lv_arguments_1_0= ruleArgument ) )
            // InternalMontiArcDSL.g:1870:4: (lv_arguments_1_0= ruleArgument )
            {
            // InternalMontiArcDSL.g:1870:4: (lv_arguments_1_0= ruleArgument )
            // InternalMontiArcDSL.g:1871:5: lv_arguments_1_0= ruleArgument
            {

            					newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalMontiArcDSL.g:1888:3: (otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMontiArcDSL.g:1889:4: otherlv_2= ',' ( (lv_arguments_3_0= ruleArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getArgumentsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMontiArcDSL.g:1893:4: ( (lv_arguments_3_0= ruleArgument ) )
            	    // InternalMontiArcDSL.g:1894:5: (lv_arguments_3_0= ruleArgument )
            	    {
            	    // InternalMontiArcDSL.g:1894:5: (lv_arguments_3_0= ruleArgument )
            	    // InternalMontiArcDSL.g:1895:6: lv_arguments_3_0= ruleArgument
            	    {

            	    						newCompositeNode(grammarAccess.getArgumentsAccess().getArgumentsArgumentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
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
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_2); 

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
    // InternalMontiArcDSL.g:1921:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // InternalMontiArcDSL.g:1921:49: (iv_ruleArgument= ruleArgument EOF )
            // InternalMontiArcDSL.g:1922:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalMontiArcDSL.g:1928:1: ruleArgument returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMontiArcDSL.g:1934:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMontiArcDSL.g:1935:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMontiArcDSL.g:1935:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMontiArcDSL.g:1936:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalMontiArcDSL.g:1936:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMontiArcDSL.g:1937:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMontiArcDSL.g:1937:4: (lv_name_0_0= RULE_ID )
            // InternalMontiArcDSL.g:1938:5: lv_name_0_0= RULE_ID
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

            // InternalMontiArcDSL.g:1954:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMontiArcDSL.g:1955:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMontiArcDSL.g:1955:4: (lv_expression_1_0= ruleExpression )
            // InternalMontiArcDSL.g:1956:5: lv_expression_1_0= ruleExpression
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


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\10\12\2\uffff";
    static final String dfa_3s = "\1\42\10\4\2\uffff";
    static final String dfa_4s = "\1\51\10\52\2\uffff";
    static final String dfa_5s = "\11\uffff\1\2\1\1";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
            "\1\12\10\uffff\1\12\2\uffff\1\12\1\uffff\1\12\11\uffff\1\11\15\uffff\1\12",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1506:2: (this_MCPrimitiveType_0= ruleMCPrimitiveType | this_MCArrayType_1= ruleMCArrayType )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000003FC0000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000003FC41285000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000003FC00000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000040010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006004010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018140000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000010000L});

}