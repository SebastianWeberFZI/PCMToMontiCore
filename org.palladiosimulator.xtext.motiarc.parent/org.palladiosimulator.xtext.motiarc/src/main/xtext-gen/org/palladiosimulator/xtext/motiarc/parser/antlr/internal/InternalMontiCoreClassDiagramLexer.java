package org.palladiosimulator.xtext.motiarc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMontiCoreClassDiagramLexer extends Lexer {
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

    public InternalMontiCoreClassDiagramLexer() {;} 
    public InternalMontiCoreClassDiagramLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMontiCoreClassDiagramLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMontiCoreClassDiagram.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:11:7: ( 'classdiagram' )
            // InternalMontiCoreClassDiagram.g:11:9: 'classdiagram'
            {
            match("classdiagram"); 


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
            // InternalMontiCoreClassDiagram.g:12:7: ( '{' )
            // InternalMontiCoreClassDiagram.g:12:9: '{'
            {
            match('{'); 

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
            // InternalMontiCoreClassDiagram.g:13:7: ( '}' )
            // InternalMontiCoreClassDiagram.g:13:9: '}'
            {
            match('}'); 

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
            // InternalMontiCoreClassDiagram.g:14:7: ( 'public' )
            // InternalMontiCoreClassDiagram.g:14:9: 'public'
            {
            match("public"); 


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
            // InternalMontiCoreClassDiagram.g:15:7: ( 'class' )
            // InternalMontiCoreClassDiagram.g:15:9: 'class'
            {
            match("class"); 


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
            // InternalMontiCoreClassDiagram.g:16:7: ( 'extends' )
            // InternalMontiCoreClassDiagram.g:16:9: 'extends'
            {
            match("extends"); 


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
            // InternalMontiCoreClassDiagram.g:17:7: ( 'implements' )
            // InternalMontiCoreClassDiagram.g:17:9: 'implements'
            {
            match("implements"); 


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
            // InternalMontiCoreClassDiagram.g:18:7: ( ',' )
            // InternalMontiCoreClassDiagram.g:18:9: ','
            {
            match(','); 

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
            // InternalMontiCoreClassDiagram.g:19:7: ( 'enum' )
            // InternalMontiCoreClassDiagram.g:19:9: 'enum'
            {
            match("enum"); 


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
            // InternalMontiCoreClassDiagram.g:20:7: ( ';' )
            // InternalMontiCoreClassDiagram.g:20:9: ';'
            {
            match(';'); 

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
            // InternalMontiCoreClassDiagram.g:21:7: ( 'import' )
            // InternalMontiCoreClassDiagram.g:21:9: 'import'
            {
            match("import"); 


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
            // InternalMontiCoreClassDiagram.g:22:7: ( 'package' )
            // InternalMontiCoreClassDiagram.g:22:9: 'package'
            {
            match("package"); 


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
            // InternalMontiCoreClassDiagram.g:23:7: ( 'boolean' )
            // InternalMontiCoreClassDiagram.g:23:9: 'boolean'
            {
            match("boolean"); 


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
            // InternalMontiCoreClassDiagram.g:24:7: ( 'byte' )
            // InternalMontiCoreClassDiagram.g:24:9: 'byte'
            {
            match("byte"); 


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
            // InternalMontiCoreClassDiagram.g:25:7: ( 'short' )
            // InternalMontiCoreClassDiagram.g:25:9: 'short'
            {
            match("short"); 


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
            // InternalMontiCoreClassDiagram.g:26:7: ( 'int' )
            // InternalMontiCoreClassDiagram.g:26:9: 'int'
            {
            match("int"); 


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
            // InternalMontiCoreClassDiagram.g:27:7: ( 'long' )
            // InternalMontiCoreClassDiagram.g:27:9: 'long'
            {
            match("long"); 


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
            // InternalMontiCoreClassDiagram.g:28:7: ( 'char' )
            // InternalMontiCoreClassDiagram.g:28:9: 'char'
            {
            match("char"); 


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
            // InternalMontiCoreClassDiagram.g:29:7: ( 'float' )
            // InternalMontiCoreClassDiagram.g:29:9: 'float'
            {
            match("float"); 


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
            // InternalMontiCoreClassDiagram.g:30:7: ( 'double' )
            // InternalMontiCoreClassDiagram.g:30:9: 'double'
            {
            match("double"); 


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
            // InternalMontiCoreClassDiagram.g:31:7: ( 'Boolean' )
            // InternalMontiCoreClassDiagram.g:31:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalMontiCoreClassDiagram.g:32:7: ( 'Byte' )
            // InternalMontiCoreClassDiagram.g:32:9: 'Byte'
            {
            match("Byte"); 


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
            // InternalMontiCoreClassDiagram.g:33:7: ( 'Integer' )
            // InternalMontiCoreClassDiagram.g:33:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalMontiCoreClassDiagram.g:34:7: ( 'Long' )
            // InternalMontiCoreClassDiagram.g:34:9: 'Long'
            {
            match("Long"); 


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
            // InternalMontiCoreClassDiagram.g:35:7: ( 'Char' )
            // InternalMontiCoreClassDiagram.g:35:9: 'Char'
            {
            match("Char"); 


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
            // InternalMontiCoreClassDiagram.g:36:7: ( 'Double' )
            // InternalMontiCoreClassDiagram.g:36:9: 'Double'
            {
            match("Double"); 


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
            // InternalMontiCoreClassDiagram.g:37:7: ( 'String' )
            // InternalMontiCoreClassDiagram.g:37:9: 'String'
            {
            match("String"); 


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
            // InternalMontiCoreClassDiagram.g:38:7: ( 'Set' )
            // InternalMontiCoreClassDiagram.g:38:9: 'Set'
            {
            match("Set"); 


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
            // InternalMontiCoreClassDiagram.g:39:7: ( 'List' )
            // InternalMontiCoreClassDiagram.g:39:9: 'List'
            {
            match("List"); 


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
            // InternalMontiCoreClassDiagram.g:40:7: ( 'Map' )
            // InternalMontiCoreClassDiagram.g:40:9: 'Map'
            {
            match("Map"); 


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
            // InternalMontiCoreClassDiagram.g:41:7: ( 'Optional' )
            // InternalMontiCoreClassDiagram.g:41:9: 'Optional'
            {
            match("Optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:42:7: ( '<' )
            // InternalMontiCoreClassDiagram.g:42:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:43:7: ( '>' )
            // InternalMontiCoreClassDiagram.g:43:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:44:7: ( '[' )
            // InternalMontiCoreClassDiagram.g:44:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:45:7: ( ']' )
            // InternalMontiCoreClassDiagram.g:45:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:46:7: ( '==' )
            // InternalMontiCoreClassDiagram.g:46:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:47:7: ( '&&' )
            // InternalMontiCoreClassDiagram.g:47:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:48:7: ( '+' )
            // InternalMontiCoreClassDiagram.g:48:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:49:7: ( '-' )
            // InternalMontiCoreClassDiagram.g:49:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:50:7: ( '/' )
            // InternalMontiCoreClassDiagram.g:50:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:51:7: ( '*' )
            // InternalMontiCoreClassDiagram.g:51:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_MCQUALIFIEDNAME"
    public final void mRULE_MCQUALIFIEDNAME() throws RecognitionException {
        try {
            int _type = RULE_MCQUALIFIEDNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMontiCoreClassDiagram.g:1525:22: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalMontiCoreClassDiagram.g:1525:24: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalMontiCoreClassDiagram.g:1525:32: ( '.' RULE_ID )+
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
            	    // InternalMontiCoreClassDiagram.g:1525:33: '.' RULE_ID
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
            // InternalMontiCoreClassDiagram.g:1527:14: ( '.*' )
            // InternalMontiCoreClassDiagram.g:1527:16: '.*'
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
            // InternalMontiCoreClassDiagram.g:1529:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMontiCoreClassDiagram.g:1529:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMontiCoreClassDiagram.g:1529:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1529:11: '^'
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

            // InternalMontiCoreClassDiagram.g:1529:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:
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
            // InternalMontiCoreClassDiagram.g:1531:10: ( ( '0' .. '9' )+ )
            // InternalMontiCoreClassDiagram.g:1531:12: ( '0' .. '9' )+
            {
            // InternalMontiCoreClassDiagram.g:1531:12: ( '0' .. '9' )+
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
            	    // InternalMontiCoreClassDiagram.g:1531:13: '0' .. '9'
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
            // InternalMontiCoreClassDiagram.g:1533:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMontiCoreClassDiagram.g:1533:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMontiCoreClassDiagram.g:1533:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMontiCoreClassDiagram.g:1533:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMontiCoreClassDiagram.g:1533:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMontiCoreClassDiagram.g:1533:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMontiCoreClassDiagram.g:1533:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMontiCoreClassDiagram.g:1533:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMontiCoreClassDiagram.g:1533:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMontiCoreClassDiagram.g:1533:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMontiCoreClassDiagram.g:1533:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMontiCoreClassDiagram.g:1535:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMontiCoreClassDiagram.g:1535:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMontiCoreClassDiagram.g:1535:24: ( options {greedy=false; } : . )*
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
            	    // InternalMontiCoreClassDiagram.g:1535:52: .
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
            // InternalMontiCoreClassDiagram.g:1537:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMontiCoreClassDiagram.g:1537:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMontiCoreClassDiagram.g:1537:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:1537:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMontiCoreClassDiagram.g:1537:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:1537:41: ( '\\r' )? '\\n'
                    {
                    // InternalMontiCoreClassDiagram.g:1537:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMontiCoreClassDiagram.g:1537:41: '\\r'
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
            // InternalMontiCoreClassDiagram.g:1539:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMontiCoreClassDiagram.g:1539:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMontiCoreClassDiagram.g:1539:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalMontiCoreClassDiagram.g:
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
            // InternalMontiCoreClassDiagram.g:1541:16: ( . )
            // InternalMontiCoreClassDiagram.g:1541:18: .
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
        // InternalMontiCoreClassDiagram.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_MCQUALIFIEDNAME | RULE_DOTSTAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=50;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMontiCoreClassDiagram.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalMontiCoreClassDiagram.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalMontiCoreClassDiagram.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalMontiCoreClassDiagram.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalMontiCoreClassDiagram.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalMontiCoreClassDiagram.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalMontiCoreClassDiagram.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalMontiCoreClassDiagram.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalMontiCoreClassDiagram.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalMontiCoreClassDiagram.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalMontiCoreClassDiagram.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalMontiCoreClassDiagram.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalMontiCoreClassDiagram.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalMontiCoreClassDiagram.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalMontiCoreClassDiagram.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalMontiCoreClassDiagram.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalMontiCoreClassDiagram.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalMontiCoreClassDiagram.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalMontiCoreClassDiagram.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalMontiCoreClassDiagram.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalMontiCoreClassDiagram.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalMontiCoreClassDiagram.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalMontiCoreClassDiagram.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalMontiCoreClassDiagram.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalMontiCoreClassDiagram.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalMontiCoreClassDiagram.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalMontiCoreClassDiagram.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalMontiCoreClassDiagram.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalMontiCoreClassDiagram.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalMontiCoreClassDiagram.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalMontiCoreClassDiagram.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalMontiCoreClassDiagram.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalMontiCoreClassDiagram.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalMontiCoreClassDiagram.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalMontiCoreClassDiagram.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalMontiCoreClassDiagram.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalMontiCoreClassDiagram.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalMontiCoreClassDiagram.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalMontiCoreClassDiagram.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalMontiCoreClassDiagram.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalMontiCoreClassDiagram.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalMontiCoreClassDiagram.g:1:256: RULE_MCQUALIFIEDNAME
                {
                mRULE_MCQUALIFIEDNAME(); 

                }
                break;
            case 43 :
                // InternalMontiCoreClassDiagram.g:1:277: RULE_DOTSTAR
                {
                mRULE_DOTSTAR(); 

                }
                break;
            case 44 :
                // InternalMontiCoreClassDiagram.g:1:290: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // InternalMontiCoreClassDiagram.g:1:298: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalMontiCoreClassDiagram.g:1:307: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalMontiCoreClassDiagram.g:1:319: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalMontiCoreClassDiagram.g:1:335: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalMontiCoreClassDiagram.g:1:351: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalMontiCoreClassDiagram.g:1:359: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\53\2\uffff\3\53\2\uffff\15\53\4\uffff\2\47\2\uffff\1\122\1\uffff\1\47\1\53\1\47\1\uffff\2\47\2\uffff\3\53\4\uffff\6\53\2\uffff\21\53\14\uffff\1\53\4\uffff\7\53\1\172\16\53\1\u0089\1\u008a\2\53\1\u008d\3\53\1\u0091\2\53\1\uffff\1\53\1\u0095\1\53\1\u0097\3\53\1\u009b\1\53\1\u009d\1\u009e\1\u009f\2\53\2\uffff\1\53\1\u00a4\1\uffff\3\53\1\uffff\3\53\1\uffff\1\u00ab\1\uffff\1\u00ac\2\53\1\uffff\1\53\3\uffff\4\53\1\uffff\1\u00b4\3\53\1\u00b8\1\53\2\uffff\1\u00ba\2\53\1\u00bd\1\u00be\2\53\1\uffff\1\u00c1\1\u00c2\1\53\1\uffff\1\u00c4\1\uffff\1\u00c5\1\u00c6\2\uffff\2\53\2\uffff\1\53\3\uffff\1\u00ca\2\53\1\uffff\1\53\1\u00ce\1\53\1\uffff\1\u00d0\1\uffff";
    static final String DFA13_eofS =
        "\u00d1\uffff";
    static final String DFA13_minS =
        "\1\0\1\56\2\uffff\3\56\2\uffff\15\56\4\uffff\1\75\1\46\2\uffff\1\52\1\uffff\1\101\1\56\1\52\1\uffff\2\0\2\uffff\3\56\4\uffff\6\56\2\uffff\21\56\14\uffff\1\56\4\uffff\41\56\1\uffff\16\56\2\uffff\2\56\1\uffff\3\56\1\uffff\3\56\1\uffff\1\56\1\uffff\3\56\1\uffff\1\56\3\uffff\4\56\1\uffff\6\56\2\uffff\7\56\1\uffff\3\56\1\uffff\1\56\1\uffff\2\56\2\uffff\2\56\2\uffff\1\56\3\uffff\3\56\1\uffff\3\56\1\uffff\1\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\172\2\uffff\3\172\2\uffff\15\172\4\uffff\1\75\1\46\2\uffff\1\57\1\uffff\2\172\1\52\1\uffff\2\uffff\2\uffff\3\172\4\uffff\6\172\2\uffff\21\172\14\uffff\1\172\4\uffff\41\172\1\uffff\16\172\2\uffff\2\172\1\uffff\3\172\1\uffff\3\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\3\uffff\4\172\1\uffff\6\172\2\uffff\7\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\2\uffff\2\172\2\uffff\1\172\3\uffff\3\172\1\uffff\3\172\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\10\1\12\15\uffff\1\40\1\41\1\42\1\43\2\uffff\1\46\1\47\1\uffff\1\51\3\uffff\1\55\2\uffff\1\61\1\62\3\uffff\1\54\1\52\1\2\1\3\6\uffff\1\10\1\12\21\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\57\1\60\1\50\1\51\1\uffff\1\53\1\55\1\56\1\61\41\uffff\1\20\16\uffff\1\34\1\36\2\uffff\1\22\3\uffff\1\11\3\uffff\1\16\1\uffff\1\21\3\uffff\1\26\1\uffff\1\30\1\35\1\31\4\uffff\1\5\6\uffff\1\17\1\23\7\uffff\1\4\3\uffff\1\13\1\uffff\1\24\2\uffff\1\32\1\33\2\uffff\1\14\1\6\1\uffff\1\15\1\25\1\27\3\uffff\1\37\3\uffff\1\7\1\uffff\1\1";
    static final String DFA13_specialS =
        "\1\0\43\uffff\1\2\1\1\u00ab\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\44\3\47\1\33\1\45\2\47\1\37\1\34\1\7\1\35\1\42\1\36\12\43\1\47\1\10\1\26\1\32\1\27\2\47\1\41\1\16\1\21\1\22\4\41\1\17\2\41\1\20\1\24\1\41\1\25\3\41\1\23\7\41\1\30\1\47\1\31\1\40\1\41\1\47\1\41\1\11\1\1\1\15\1\5\1\14\2\41\1\6\2\41\1\13\3\41\1\4\2\41\1\12\7\41\1\2\1\47\1\3\uff82\47",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\51\3\52\1\50\16\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\60\23\52\1\57\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\62\11\52\1\61\2\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\63\1\64\14\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\67\11\52\1\70\1\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\71\22\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\72\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\73\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\74\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\75\11\52\1\76\1\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\77\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\101\5\52\1\100\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\102\22\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\103\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\105\16\52\1\104\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\106\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\107\12\52",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\120\4\uffff\1\121",
            "",
            "\32\124\4\uffff\1\124\1\uffff\32\124",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\125",
            "",
            "\0\127",
            "\0\127",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\131\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\132\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\133\30\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\134\27\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\135\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\136\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\137\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\140\6\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\141\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\142\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\143\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\144\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\145\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\146\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\147\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\150\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\151\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\152\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\153\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\154\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\155\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\156\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\157\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\160\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\161\6\52",
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
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\162\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\163\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\164\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\12\52\1\165\17\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\166\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\167\15\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\170\2\52\1\171\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\173\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\174\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\175\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\176\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\177\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\u0080\30\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u0081\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0082\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0083\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u0084\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0085\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0086\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\u0087\30\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0088\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u008b\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u008c\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u008e\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u008f\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0090\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0092\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0093\10\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0094\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0096\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0098\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u0099\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u009a\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u009c\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u00a0\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00a1\14\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u00a2\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a3\26\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u00a5\27\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00a6\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a7\26\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u00a8\15\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00a9\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00aa\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00ad\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00ae\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00af\25\52",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00b0\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00b1\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00b2\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00b3\21\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00b5\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00b6\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00b7\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00b9\14\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00bb\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00bc\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00bf\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00c0\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00c3\14\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u00c7\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00c8\23\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00c9\6\52",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00cb\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00cc\7\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00cd\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u00cf\15\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_MCQUALIFIEDNAME | RULE_DOTSTAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='c') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='p') ) {s = 4;}

                        else if ( (LA13_0=='e') ) {s = 5;}

                        else if ( (LA13_0=='i') ) {s = 6;}

                        else if ( (LA13_0==',') ) {s = 7;}

                        else if ( (LA13_0==';') ) {s = 8;}

                        else if ( (LA13_0=='b') ) {s = 9;}

                        else if ( (LA13_0=='s') ) {s = 10;}

                        else if ( (LA13_0=='l') ) {s = 11;}

                        else if ( (LA13_0=='f') ) {s = 12;}

                        else if ( (LA13_0=='d') ) {s = 13;}

                        else if ( (LA13_0=='B') ) {s = 14;}

                        else if ( (LA13_0=='I') ) {s = 15;}

                        else if ( (LA13_0=='L') ) {s = 16;}

                        else if ( (LA13_0=='C') ) {s = 17;}

                        else if ( (LA13_0=='D') ) {s = 18;}

                        else if ( (LA13_0=='S') ) {s = 19;}

                        else if ( (LA13_0=='M') ) {s = 20;}

                        else if ( (LA13_0=='O') ) {s = 21;}

                        else if ( (LA13_0=='<') ) {s = 22;}

                        else if ( (LA13_0=='>') ) {s = 23;}

                        else if ( (LA13_0=='[') ) {s = 24;}

                        else if ( (LA13_0==']') ) {s = 25;}

                        else if ( (LA13_0=='=') ) {s = 26;}

                        else if ( (LA13_0=='&') ) {s = 27;}

                        else if ( (LA13_0=='+') ) {s = 28;}

                        else if ( (LA13_0=='-') ) {s = 29;}

                        else if ( (LA13_0=='/') ) {s = 30;}

                        else if ( (LA13_0=='*') ) {s = 31;}

                        else if ( (LA13_0=='^') ) {s = 32;}

                        else if ( (LA13_0=='A'||(LA13_0>='E' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||LA13_0=='N'||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='a'||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 33;}

                        else if ( (LA13_0=='.') ) {s = 34;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 35;}

                        else if ( (LA13_0=='\"') ) {s = 36;}

                        else if ( (LA13_0=='\'') ) {s = 37;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 38;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='(' && LA13_0<=')')||LA13_0==':'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 87;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_36 = input.LA(1);

                        s = -1;
                        if ( ((LA13_36>='\u0000' && LA13_36<='\uFFFF')) ) {s = 87;}

                        else s = 39;

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