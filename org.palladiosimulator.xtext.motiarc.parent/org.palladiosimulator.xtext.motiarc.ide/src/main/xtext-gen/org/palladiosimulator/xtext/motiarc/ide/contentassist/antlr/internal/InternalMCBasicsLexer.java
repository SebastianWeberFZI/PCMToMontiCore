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

    public InternalMCBasicsLexer() {;} 
    public InternalMCBasicsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMCBasicsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMCBasics.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:19:7: ( 'import' )
            // InternalMCBasics.g:19:9: 'import'
            {
            match("import"); 


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
            // InternalMCBasics.g:20:7: ( ';' )
            // InternalMCBasics.g:20:9: ';'
            {
            match(';'); 

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
            // InternalMCBasics.g:21:7: ( '.' )
            // InternalMCBasics.g:21:9: '.'
            {
            match('.'); 

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
            // InternalMCBasics.g:22:7: ( '[' )
            // InternalMCBasics.g:22:9: '['
            {
            match('['); 

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
            // InternalMCBasics.g:23:7: ( ']' )
            // InternalMCBasics.g:23:9: ']'
            {
            match(']'); 

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
            // InternalMCBasics.g:24:7: ( '*' )
            // InternalMCBasics.g:24:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_MCQUALIFIEDNAME"
    public final void mRULE_MCQUALIFIEDNAME() throws RecognitionException {
        try {
            int _type = RULE_MCQUALIFIEDNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:797:22: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalMCBasics.g:797:24: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalMCBasics.g:797:32: ( '.' RULE_ID )+
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
            	    // InternalMCBasics.g:797:33: '.' RULE_ID
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMCBasics.g:799:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMCBasics.g:799:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMCBasics.g:799:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMCBasics.g:799:11: '^'
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

            // InternalMCBasics.g:799:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMCBasics.g:801:10: ( ( '0' .. '9' )+ )
            // InternalMCBasics.g:801:12: ( '0' .. '9' )+
            {
            // InternalMCBasics.g:801:12: ( '0' .. '9' )+
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
            	    // InternalMCBasics.g:801:13: '0' .. '9'
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
            // InternalMCBasics.g:803:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMCBasics.g:803:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMCBasics.g:803:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMCBasics.g:803:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMCBasics.g:803:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMCBasics.g:803:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCBasics.g:803:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMCBasics.g:803:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMCBasics.g:803:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMCBasics.g:803:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMCBasics.g:803:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMCBasics.g:805:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMCBasics.g:805:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMCBasics.g:805:24: ( options {greedy=false; } : . )*
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
            	    // InternalMCBasics.g:805:52: .
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
            // InternalMCBasics.g:807:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMCBasics.g:807:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMCBasics.g:807:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMCBasics.g:807:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMCBasics.g:807:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMCBasics.g:807:41: ( '\\r' )? '\\n'
                    {
                    // InternalMCBasics.g:807:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMCBasics.g:807:41: '\\r'
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
            // InternalMCBasics.g:809:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMCBasics.g:809:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMCBasics.g:809:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalMCBasics.g:811:16: ( . )
            // InternalMCBasics.g:811:18: .
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
        // InternalMCBasics.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_MCQUALIFIEDNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=22;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMCBasics.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMCBasics.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMCBasics.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMCBasics.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMCBasics.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMCBasics.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMCBasics.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMCBasics.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMCBasics.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMCBasics.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMCBasics.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMCBasics.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMCBasics.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMCBasics.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMCBasics.g:1:94: RULE_MCQUALIFIEDNAME
                {
                mRULE_MCQUALIFIEDNAME(); 

                }
                break;
            case 16 :
                // InternalMCBasics.g:1:115: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalMCBasics.g:1:123: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalMCBasics.g:1:132: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalMCBasics.g:1:144: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalMCBasics.g:1:160: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalMCBasics.g:1:176: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // InternalMCBasics.g:1:184: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\7\30\5\uffff\1\24\1\30\1\uffff\3\24\2\uffff\3\30\2\uffff\7\30\5\uffff\1\30\5\uffff\3\30\1\70\6\30\1\77\1\30\1\uffff\1\30\1\102\1\103\3\30\1\uffff\1\107\1\30\2\uffff\1\111\2\30\1\uffff\1\114\1\uffff\1\115\1\116\3\uffff";
    static final String DFA13_eofS =
        "\117\uffff";
    static final String DFA13_minS =
        "\1\0\7\56\5\uffff\1\101\1\56\1\uffff\2\0\1\52\2\uffff\3\56\2\uffff\7\56\5\uffff\1\56\5\uffff\14\56\1\uffff\6\56\1\uffff\2\56\2\uffff\3\56\1\uffff\1\56\1\uffff\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\7\172\5\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\3\172\2\uffff\7\172\5\uffff\1\172\5\uffff\14\172\1\uffff\6\172\1\uffff\2\172\2\uffff\3\172\1\uffff\1\172\1\uffff\2\172\3\uffff";
    static final String DFA13_acceptS =
        "\10\uffff\1\12\1\13\1\14\1\15\1\16\2\uffff\1\21\3\uffff\1\25\1\26\3\uffff\1\20\1\17\7\uffff\1\12\1\13\1\14\1\15\1\16\1\uffff\1\21\1\22\1\23\1\24\1\25\14\uffff\1\4\6\uffff\1\2\2\uffff\1\5\1\6\3\uffff\1\3\1\uffff\1\7\2\uffff\1\11\1\10\1\1";
    static final String DFA13_specialS =
        "\1\0\17\uffff\1\1\1\2\75\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\2\24\1\14\3\24\1\11\1\22\12\17\1\24\1\10\5\24\32\16\1\12\1\24\1\13\1\15\1\16\1\24\1\16\1\1\1\5\1\7\1\16\1\6\2\16\1\3\2\16\1\4\6\16\1\2\7\16\uff85\24",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\25\11\27\1\26\1\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\7\27\1\32\22\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\14\27\1\34\1\33\14\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\35\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\7\27\1\36\22\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\37\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\40\13\27",
            "",
            "",
            "",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\50",
            "\0\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\54\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\55\6\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\56\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\57\6\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\17\27\1\60\12\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\61\14\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\62\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\63\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\24\27\1\64\5\27",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\65\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\66\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\67\10\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\16\27\1\71\13\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\6\27\1\72\23\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\73\10\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\74\31\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\27\1\75\30\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\76\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\100\6\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\21\27\1\101\10\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\104\6\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\13\27\1\105\16\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\1\106\31\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\110\6\27",
            "",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\112\25\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\15\27\1\113\14\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\31\1\uffff\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_MCQUALIFIEDNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='b') ) {s = 1;}

                        else if ( (LA13_0=='s') ) {s = 2;}

                        else if ( (LA13_0=='i') ) {s = 3;}

                        else if ( (LA13_0=='l') ) {s = 4;}

                        else if ( (LA13_0=='c') ) {s = 5;}

                        else if ( (LA13_0=='f') ) {s = 6;}

                        else if ( (LA13_0=='d') ) {s = 7;}

                        else if ( (LA13_0==';') ) {s = 8;}

                        else if ( (LA13_0=='.') ) {s = 9;}

                        else if ( (LA13_0=='[') ) {s = 10;}

                        else if ( (LA13_0==']') ) {s = 11;}

                        else if ( (LA13_0=='*') ) {s = 12;}

                        else if ( (LA13_0=='^') ) {s = 13;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||LA13_0=='e'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 14;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 15;}

                        else if ( (LA13_0=='\"') ) {s = 16;}

                        else if ( (LA13_0=='\'') ) {s = 17;}

                        else if ( (LA13_0=='/') ) {s = 18;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 19;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='-')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_16 = input.LA(1);

                        s = -1;
                        if ( ((LA13_16>='\u0000' && LA13_16<='\uFFFF')) ) {s = 40;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_17 = input.LA(1);

                        s = -1;
                        if ( ((LA13_17>='\u0000' && LA13_17<='\uFFFF')) ) {s = 40;}

                        else s = 20;

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