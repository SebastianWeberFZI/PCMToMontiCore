package org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMCBasicsLexer extends Lexer {
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

    public InternalMCBasicsLexer() {;} 
    public InternalMCBasicsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMCBasicsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMCBasics.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:11:7: ( 'boolean' )
            // InternalMCBasics.g:11:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:12:7: ( 'byte' )
            // InternalMCBasics.g:12:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:13:7: ( 'short' )
            // InternalMCBasics.g:13:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:14:7: ( 'int' )
            // InternalMCBasics.g:14:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:15:7: ( 'long' )
            // InternalMCBasics.g:15:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:16:7: ( 'char' )
            // InternalMCBasics.g:16:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:17:7: ( 'float' )
            // InternalMCBasics.g:17:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:18:7: ( 'double' )
            // InternalMCBasics.g:18:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:19:7: ( 'Boolean' )
            // InternalMCBasics.g:19:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:20:7: ( 'Byte' )
            // InternalMCBasics.g:20:9: 'Byte'
            {
            match("Byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:21:7: ( 'Integer' )
            // InternalMCBasics.g:21:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:22:7: ( 'Long' )
            // InternalMCBasics.g:22:9: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:23:7: ( 'Char' )
            // InternalMCBasics.g:23:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:24:7: ( 'Double' )
            // InternalMCBasics.g:24:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:25:7: ( 'String' )
            // InternalMCBasics.g:25:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:26:7: ( 'Set' )
            // InternalMCBasics.g:26:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:27:7: ( 'List' )
            // InternalMCBasics.g:27:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:28:7: ( 'Map' )
            // InternalMCBasics.g:28:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:29:7: ( 'Optional' )
            // InternalMCBasics.g:29:9: 'Optional'
            {
            match("Optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:30:7: ( '>' )
            // InternalMCBasics.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:31:7: ( '<' )
            // InternalMCBasics.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:32:7: ( '==' )
            // InternalMCBasics.g:32:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:33:7: ( '&&' )
            // InternalMCBasics.g:33:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:34:7: ( '+' )
            // InternalMCBasics.g:34:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:35:7: ( '-' )
            // InternalMCBasics.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:36:7: ( '/' )
            // InternalMCBasics.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:37:7: ( '*' )
            // InternalMCBasics.g:37:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:38:7: ( 'import' )
            // InternalMCBasics.g:38:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:39:7: ( ';' )
            // InternalMCBasics.g:39:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:40:7: ( '[' )
            // InternalMCBasics.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:41:7: ( ']' )
            // InternalMCBasics.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_MCQUALIFIEDNAME"
    public final void mRULE_MCQUALIFIEDNAME() throws RecognitionException {
        try {
            int _type = RULE_MCQUALIFIEDNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1392:22: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalMCBasics.g:1392:24: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalMCBasics.g:1392:32: ( '.' RULE_ID )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMCBasics.g:1392:33: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MCQUALIFIEDNAME"

    // $ANTLR start "RULE_DOTSTAR"
    public final void mRULE_DOTSTAR() throws RecognitionException {
        try {
            int _type = RULE_DOTSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1394:14: ( '.*' )
            // InternalMCBasics.g:1394:16: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTSTAR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1396:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMCBasics.g:1396:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMCBasics.g:1396:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMCBasics.g:1396:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMCBasics.g:1396:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMCBasics.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1398:10: ( ( '0' .. '9' )+ )
            // InternalMCBasics.g:1398:12: ( '0' .. '9' )+
            {
            // InternalMCBasics.g:1398:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMCBasics.g:1398:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1400:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMCBasics.g:1400:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMCBasics.g:1400:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMCBasics.g:1400:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMCBasics.g:1400:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMCBasics.g:1400:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCBasics.g:1400:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMCBasics.g:1400:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMCBasics.g:1400:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMCBasics.g:1400:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCBasics.g:1400:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1402:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMCBasics.g:1402:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMCBasics.g:1402:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMCBasics.g:1402:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1404:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMCBasics.g:1404:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMCBasics.g:1404:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMCBasics.g:1404:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalMCBasics.g:1404:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMCBasics.g:1404:41: ( '\\r' )? '\\n'
                    {
                    // InternalMCBasics.g:1404:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMCBasics.g:1404:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1406:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMCBasics.g:1406:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMCBasics.g:1406:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMCBasics.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:1408:16: ( . )
            // InternalMCBasics.g:1408:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMCBasics.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_MCQUALIFIEDNAME | RULE_DOTSTAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=40;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMCBasics.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalMCBasics.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalMCBasics.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalMCBasics.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalMCBasics.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalMCBasics.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalMCBasics.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalMCBasics.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalMCBasics.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalMCBasics.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalMCBasics.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalMCBasics.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalMCBasics.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalMCBasics.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalMCBasics.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalMCBasics.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalMCBasics.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalMCBasics.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalMCBasics.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalMCBasics.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalMCBasics.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalMCBasics.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalMCBasics.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalMCBasics.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalMCBasics.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalMCBasics.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalMCBasics.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalMCBasics.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalMCBasics.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalMCBasics.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalMCBasics.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalMCBasics.g:1:196: RULE_MCQUALIFIEDNAME
                {
                mRULE_MCQUALIFIEDNAME(); 

                }
                break;
            case 33 :
                // InternalMCBasics.g:1:217: RULE_DOTSTAR
                {
                mRULE_DOTSTAR(); 

                }
                break;
            case 34 :
                // InternalMCBasics.g:1:230: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalMCBasics.g:1:238: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalMCBasics.g:1:247: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalMCBasics.g:1:259: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalMCBasics.g:1:275: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMCBasics.g:1:291: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalMCBasics.g:1:299: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\17\46\2\uffff\2\42\2\uffff\1\102\4\uffff\1\42\1\46\1\42\1\uffff\2\42\2\uffff\3\46\2\uffff\22\46\15\uffff\1\46\4\uffff\3\46\1\143\15\46\1\161\1\162\2\46\1\165\1\46\1\uffff\1\46\1\170\1\171\3\46\1\175\1\46\1\177\1\u0080\1\u0081\2\46\2\uffff\2\46\1\uffff\1\u0086\1\46\2\uffff\1\u0088\2\46\1\uffff\1\46\3\uffff\4\46\1\uffff\1\u0090\1\uffff\1\u0091\2\46\1\u0094\1\u0095\1\46\1\u0097\2\uffff\1\u0098\1\u0099\2\uffff\1\46\3\uffff\1\u009b\1\uffff";
    static final String DFA13_eofS =
        "\u009c\uffff";
    static final String DFA13_minS =
        "\1\0\17\56\2\uffff\1\75\1\46\2\uffff\1\52\4\uffff\1\101\1\56\1\52\1\uffff\2\0\2\uffff\3\56\2\uffff\22\56\15\uffff\1\56\4\uffff\27\56\1\uffff\15\56\2\uffff\2\56\1\uffff\2\56\2\uffff\3\56\1\uffff\1\56\3\uffff\4\56\1\uffff\1\56\1\uffff\7\56\2\uffff\2\56\2\uffff\1\56\3\uffff\1\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\17\172\2\uffff\1\75\1\46\2\uffff\1\57\4\uffff\2\172\1\52\1\uffff\2\uffff\2\uffff\3\172\2\uffff\22\172\15\uffff\1\172\4\uffff\27\172\1\uffff\15\172\2\uffff\2\172\1\uffff\2\172\2\uffff\3\172\1\uffff\1\172\3\uffff\4\172\1\uffff\1\172\1\uffff\7\172\2\uffff\2\172\2\uffff\1\172\3\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\20\uffff\1\24\1\25\2\uffff\1\30\1\31\1\uffff\1\33\1\35\1\36\1\37\3\uffff\1\43\2\uffff\1\47\1\50\3\uffff\1\42\1\40\22\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\45\1\46\1\32\1\33\1\35\1\36\1\37\1\uffff\1\41\1\43\1\44\1\47\27\uffff\1\4\15\uffff\1\20\1\22\2\uffff\1\2\2\uffff\1\5\1\6\3\uffff\1\12\1\uffff\1\14\1\21\1\15\4\uffff\1\3\1\uffff\1\7\7\uffff\1\34\1\10\2\uffff\1\16\1\17\1\uffff\1\1\1\11\1\13\1\uffff\1\23";
    static final String DFA13_specialS =
        "\1\2\36\uffff\1\0\1\1\173\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\42\1\37\3\42\1\23\1\40\2\42\1\27\1\24\1\42\1\25\1\35\1\26\12\36\1\42\1\30\1\21\1\22\1\20\2\42\1\34\1\10\1\13\1\14\4\34\1\11\2\34\1\12\1\16\1\34\1\17\3\34\1\15\7\34\1\31\1\42\1\32\1\33\1\34\1\42\1\34\1\1\1\5\1\7\1\34\1\6\2\34\1\3\2\34\1\4\6\34\1\2\7\34\uff85\42",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\43\11\45\1\44\1\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\50\22\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\14\45\1\52\1\51\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\53\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\54\22\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\55\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\56\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\57\11\45\1\60\1\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\61\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\63\5\45\1\62\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\7\45\1\64\22\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\65\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\67\16\45\1\66\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\70\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\71\12\45",
            "",
            "",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "",
            "",
            "\32\107\4\uffff\1\107\1\uffff\32\107",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\110",
            "",
            "\0\112",
            "\0\112",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\114\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\115\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\116\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\117\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\120\12\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\121\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\122\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\123\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\124\5\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\125\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\126\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\127\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\130\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45\1\131\7\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\132\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\24\45\1\133\5\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\134\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\135\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\17\45\1\136\12\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\137\6\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\140\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\141\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\142\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\144\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\145\23\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\146\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\147\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\45\1\150\30\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\151\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\152\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\153\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\154\23\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\155\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\156\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\45\1\157\30\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\160\21\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\10\45\1\163\21\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\164\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\166\6\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\167\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\172\6\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\173\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\174\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\176\23\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\u0082\16\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u0083\14\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\16\45\1\u0084\13\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\u0085\31\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\23\45\1\u0087\6\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u0089\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\u008a\31\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u008b\25\45",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45\1\u008c\25\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\6\45\1\u008d\23\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u008e\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u008f\14\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\15\45\1\u0092\14\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\21\45\1\u0093\10\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\1\u0096\31\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\13\45\1\u009a\16\45",
            "",
            "",
            "",
            "\1\47\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_MCQUALIFIEDNAME | RULE_DOTSTAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_31 = input.LA(1);

                        s = -1;
                        if ( ((LA13_31>='\u0000' && LA13_31<='\uFFFF')) ) {s = 74;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_32 = input.LA(1);

                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\uFFFF')) ) {s = 74;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='b') ) {s = 1;}

                        else if ( (LA13_0=='s') ) {s = 2;}

                        else if ( (LA13_0=='i') ) {s = 3;}

                        else if ( (LA13_0=='l') ) {s = 4;}

                        else if ( (LA13_0=='c') ) {s = 5;}

                        else if ( (LA13_0=='f') ) {s = 6;}

                        else if ( (LA13_0=='d') ) {s = 7;}

                        else if ( (LA13_0=='B') ) {s = 8;}

                        else if ( (LA13_0=='I') ) {s = 9;}

                        else if ( (LA13_0=='L') ) {s = 10;}

                        else if ( (LA13_0=='C') ) {s = 11;}

                        else if ( (LA13_0=='D') ) {s = 12;}

                        else if ( (LA13_0=='S') ) {s = 13;}

                        else if ( (LA13_0=='M') ) {s = 14;}

                        else if ( (LA13_0=='O') ) {s = 15;}

                        else if ( (LA13_0=='>') ) {s = 16;}

                        else if ( (LA13_0=='<') ) {s = 17;}

                        else if ( (LA13_0=='=') ) {s = 18;}

                        else if ( (LA13_0=='&') ) {s = 19;}

                        else if ( (LA13_0=='+') ) {s = 20;}

                        else if ( (LA13_0=='-') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( (LA13_0=='*') ) {s = 23;}

                        else if ( (LA13_0==';') ) {s = 24;}

                        else if ( (LA13_0=='[') ) {s = 25;}

                        else if ( (LA13_0==']') ) {s = 26;}

                        else if ( (LA13_0=='^') ) {s = 27;}

                        else if ( (LA13_0=='A'||(LA13_0>='E' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||LA13_0=='N'||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='e'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 28;}

                        else if ( (LA13_0=='.') ) {s = 29;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 30;}

                        else if ( (LA13_0=='\"') ) {s = 31;}

                        else if ( (LA13_0=='\'') ) {s = 32;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 33;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='(' && LA13_0<=')')||LA13_0==','||LA13_0==':'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}