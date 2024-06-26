package org.palladiosimulator.xtext.motiarc.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


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
            // InternalMontiCoreClassDiagram.g:11:7: ( 'boolean' )
            // InternalMontiCoreClassDiagram.g:11:9: 'boolean'
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
            // InternalMontiCoreClassDiagram.g:12:7: ( 'byte' )
            // InternalMontiCoreClassDiagram.g:12:9: 'byte'
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
            // InternalMontiCoreClassDiagram.g:13:7: ( 'short' )
            // InternalMontiCoreClassDiagram.g:13:9: 'short'
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
            // InternalMontiCoreClassDiagram.g:14:7: ( 'int' )
            // InternalMontiCoreClassDiagram.g:14:9: 'int'
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
            // InternalMontiCoreClassDiagram.g:15:7: ( 'long' )
            // InternalMontiCoreClassDiagram.g:15:9: 'long'
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
            // InternalMontiCoreClassDiagram.g:16:7: ( 'char' )
            // InternalMontiCoreClassDiagram.g:16:9: 'char'
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
            // InternalMontiCoreClassDiagram.g:17:7: ( 'float' )
            // InternalMontiCoreClassDiagram.g:17:9: 'float'
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
            // InternalMontiCoreClassDiagram.g:18:7: ( 'double' )
            // InternalMontiCoreClassDiagram.g:18:9: 'double'
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
            // InternalMontiCoreClassDiagram.g:19:7: ( 'Boolean' )
            // InternalMontiCoreClassDiagram.g:19:9: 'Boolean'
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
            // InternalMontiCoreClassDiagram.g:20:7: ( 'Byte' )
            // InternalMontiCoreClassDiagram.g:20:9: 'Byte'
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
            // InternalMontiCoreClassDiagram.g:21:7: ( 'Integer' )
            // InternalMontiCoreClassDiagram.g:21:9: 'Integer'
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
            // InternalMontiCoreClassDiagram.g:22:7: ( 'Long' )
            // InternalMontiCoreClassDiagram.g:22:9: 'Long'
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
            // InternalMontiCoreClassDiagram.g:23:7: ( 'Char' )
            // InternalMontiCoreClassDiagram.g:23:9: 'Char'
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
            // InternalMontiCoreClassDiagram.g:24:7: ( 'Double' )
            // InternalMontiCoreClassDiagram.g:24:9: 'Double'
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
            // InternalMontiCoreClassDiagram.g:25:7: ( 'String' )
            // InternalMontiCoreClassDiagram.g:25:9: 'String'
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
            // InternalMontiCoreClassDiagram.g:26:7: ( 'Set' )
            // InternalMontiCoreClassDiagram.g:26:9: 'Set'
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
            // InternalMontiCoreClassDiagram.g:27:7: ( 'List' )
            // InternalMontiCoreClassDiagram.g:27:9: 'List'
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
            // InternalMontiCoreClassDiagram.g:28:7: ( 'Map' )
            // InternalMontiCoreClassDiagram.g:28:9: 'Map'
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
            // InternalMontiCoreClassDiagram.g:29:7: ( 'Optional' )
            // InternalMontiCoreClassDiagram.g:29:9: 'Optional'
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
            // InternalMontiCoreClassDiagram.g:30:7: ( '>' )
            // InternalMontiCoreClassDiagram.g:30:9: '>'
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
            // InternalMontiCoreClassDiagram.g:31:7: ( '<' )
            // InternalMontiCoreClassDiagram.g:31:9: '<'
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
            // InternalMontiCoreClassDiagram.g:32:7: ( '==' )
            // InternalMontiCoreClassDiagram.g:32:9: '=='
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
            // InternalMontiCoreClassDiagram.g:33:7: ( '&&' )
            // InternalMontiCoreClassDiagram.g:33:9: '&&'
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
            // InternalMontiCoreClassDiagram.g:34:7: ( '+' )
            // InternalMontiCoreClassDiagram.g:34:9: '+'
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
            // InternalMontiCoreClassDiagram.g:35:7: ( '-' )
            // InternalMontiCoreClassDiagram.g:35:9: '-'
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
            // InternalMontiCoreClassDiagram.g:36:7: ( '/' )
            // InternalMontiCoreClassDiagram.g:36:9: '/'
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
            // InternalMontiCoreClassDiagram.g:37:7: ( '*' )
            // InternalMontiCoreClassDiagram.g:37:9: '*'
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
            // InternalMontiCoreClassDiagram.g:38:7: ( 'classdiagram' )
            // InternalMontiCoreClassDiagram.g:38:9: 'classdiagram'
            {
            match("classdiagram"); 


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
            // InternalMontiCoreClassDiagram.g:39:7: ( '{' )
            // InternalMontiCoreClassDiagram.g:39:9: '{'
            {
            match('{'); 

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
            // InternalMontiCoreClassDiagram.g:40:7: ( '}' )
            // InternalMontiCoreClassDiagram.g:40:9: '}'
            {
            match('}'); 

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
            // InternalMontiCoreClassDiagram.g:41:7: ( 'class' )
            // InternalMontiCoreClassDiagram.g:41:9: 'class'
            {
            match("class"); 


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
            // InternalMontiCoreClassDiagram.g:42:7: ( 'extends' )
            // InternalMontiCoreClassDiagram.g:42:9: 'extends'
            {
            match("extends"); 


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
            // InternalMontiCoreClassDiagram.g:43:7: ( 'implements' )
            // InternalMontiCoreClassDiagram.g:43:9: 'implements'
            {
            match("implements"); 


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
            // InternalMontiCoreClassDiagram.g:44:7: ( ',' )
            // InternalMontiCoreClassDiagram.g:44:9: ','
            {
            match(','); 

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
            // InternalMontiCoreClassDiagram.g:45:7: ( 'enum' )
            // InternalMontiCoreClassDiagram.g:45:9: 'enum'
            {
            match("enum"); 


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
            // InternalMontiCoreClassDiagram.g:46:7: ( ';' )
            // InternalMontiCoreClassDiagram.g:46:9: ';'
            {
            match(';'); 

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
            // InternalMontiCoreClassDiagram.g:47:7: ( 'import' )
            // InternalMontiCoreClassDiagram.g:47:9: 'import'
            {
            match("import"); 


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
            // InternalMontiCoreClassDiagram.g:48:7: ( 'package' )
            // InternalMontiCoreClassDiagram.g:48:9: 'package'
            {
            match("package"); 


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
            // InternalMontiCoreClassDiagram.g:49:7: ( '[' )
            // InternalMontiCoreClassDiagram.g:49:9: '['
            {
            match('['); 

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
            // InternalMontiCoreClassDiagram.g:50:7: ( ']' )
            // InternalMontiCoreClassDiagram.g:50:9: ']'
            {
            match(']'); 

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
            // InternalMontiCoreClassDiagram.g:51:7: ( 'public' )
            // InternalMontiCoreClassDiagram.g:51:9: 'public'
            {
            match("public"); 


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
            // InternalMontiCoreClassDiagram.g:2838:22: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalMontiCoreClassDiagram.g:2838:24: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalMontiCoreClassDiagram.g:2838:32: ( '.' RULE_ID )+
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
            	    // InternalMontiCoreClassDiagram.g:2838:33: '.' RULE_ID
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
            // InternalMontiCoreClassDiagram.g:2840:14: ( '.*' )
            // InternalMontiCoreClassDiagram.g:2840:16: '.*'
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
            // InternalMontiCoreClassDiagram.g:2842:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMontiCoreClassDiagram.g:2842:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMontiCoreClassDiagram.g:2842:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:2842:11: '^'
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

            // InternalMontiCoreClassDiagram.g:2842:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMontiCoreClassDiagram.g:2844:10: ( ( '0' .. '9' )+ )
            // InternalMontiCoreClassDiagram.g:2844:12: ( '0' .. '9' )+
            {
            // InternalMontiCoreClassDiagram.g:2844:12: ( '0' .. '9' )+
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
            	    // InternalMontiCoreClassDiagram.g:2844:13: '0' .. '9'
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
            // InternalMontiCoreClassDiagram.g:2846:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMontiCoreClassDiagram.g:2846:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMontiCoreClassDiagram.g:2846:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMontiCoreClassDiagram.g:2846:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMontiCoreClassDiagram.g:2846:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMontiCoreClassDiagram.g:2846:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMontiCoreClassDiagram.g:2846:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMontiCoreClassDiagram.g:2846:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMontiCoreClassDiagram.g:2846:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMontiCoreClassDiagram.g:2846:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMontiCoreClassDiagram.g:2846:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMontiCoreClassDiagram.g:2848:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMontiCoreClassDiagram.g:2848:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMontiCoreClassDiagram.g:2848:24: ( options {greedy=false; } : . )*
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
            	    // InternalMontiCoreClassDiagram.g:2848:52: .
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
            // InternalMontiCoreClassDiagram.g:2850:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMontiCoreClassDiagram.g:2850:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMontiCoreClassDiagram.g:2850:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMontiCoreClassDiagram.g:2850:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMontiCoreClassDiagram.g:2850:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMontiCoreClassDiagram.g:2850:41: ( '\\r' )? '\\n'
                    {
                    // InternalMontiCoreClassDiagram.g:2850:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMontiCoreClassDiagram.g:2850:41: '\\r'
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
            // InternalMontiCoreClassDiagram.g:2852:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMontiCoreClassDiagram.g:2852:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMontiCoreClassDiagram.g:2852:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalMontiCoreClassDiagram.g:2854:16: ( . )
            // InternalMontiCoreClassDiagram.g:2854:18: .
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
        "\1\uffff\17\53\2\uffff\2\47\2\uffff\1\110\3\uffff\1\53\2\uffff\1\53\2\uffff\1\47\1\53\1\47\1\uffff\2\47\2\uffff\3\53\2\uffff\23\53\14\uffff\2\53\2\uffff\2\53\2\uffff\1\53\4\uffff\3\53\1\165\16\53\1\u0085\1\u0086\6\53\1\u008d\1\53\1\uffff\2\53\1\u0091\1\u0092\4\53\1\u0097\1\53\1\u0099\1\u009a\1\u009b\2\53\2\uffff\2\53\1\u00a0\3\53\1\uffff\1\u00a4\2\53\2\uffff\1\u00a8\1\u00a9\2\53\1\uffff\1\53\3\uffff\4\53\1\uffff\3\53\1\uffff\1\53\1\u00b5\1\53\2\uffff\1\u00b7\2\53\1\u00ba\1\u00bb\3\53\1\u00bf\1\u00c0\1\53\1\uffff\1\53\1\uffff\1\u00c3\1\u00c4\2\uffff\1\53\1\u00c6\1\u00c7\2\uffff\2\53\2\uffff\1\u00ca\2\uffff\2\53\1\uffff\1\u00cd\1\53\1\uffff\1\53\1\u00d0\1\uffff";
    static final String DFA13_eofS =
        "\u00d1\uffff";
    static final String DFA13_minS =
        "\1\0\17\56\2\uffff\1\75\1\46\2\uffff\1\52\3\uffff\1\56\2\uffff\1\56\2\uffff\1\101\1\56\1\52\1\uffff\2\0\2\uffff\3\56\2\uffff\23\56\14\uffff\2\56\2\uffff\2\56\2\uffff\1\56\4\uffff\34\56\1\uffff\17\56\2\uffff\6\56\1\uffff\3\56\2\uffff\4\56\1\uffff\1\56\3\uffff\4\56\1\uffff\3\56\1\uffff\3\56\2\uffff\13\56\1\uffff\1\56\1\uffff\2\56\2\uffff\3\56\2\uffff\2\56\2\uffff\1\56\2\uffff\2\56\1\uffff\2\56\1\uffff\2\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\17\172\2\uffff\1\75\1\46\2\uffff\1\57\3\uffff\1\172\2\uffff\1\172\2\uffff\2\172\1\52\1\uffff\2\uffff\2\uffff\3\172\2\uffff\23\172\14\uffff\2\172\2\uffff\2\172\2\uffff\1\172\4\uffff\34\172\1\uffff\17\172\2\uffff\6\172\1\uffff\3\172\2\uffff\4\172\1\uffff\1\172\3\uffff\4\172\1\uffff\3\172\1\uffff\3\172\2\uffff\13\172\1\uffff\1\172\1\uffff\2\172\2\uffff\3\172\2\uffff\2\172\2\uffff\1\172\2\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\20\uffff\1\24\1\25\2\uffff\1\30\1\31\1\uffff\1\33\1\35\1\36\1\uffff\1\42\1\44\1\uffff\1\47\1\50\3\uffff\1\55\2\uffff\1\61\1\62\3\uffff\1\54\1\52\23\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\57\1\60\1\32\1\33\1\35\1\36\2\uffff\1\42\1\44\2\uffff\1\47\1\50\1\uffff\1\53\1\55\1\56\1\61\34\uffff\1\4\17\uffff\1\20\1\22\6\uffff\1\2\3\uffff\1\5\1\6\4\uffff\1\12\1\uffff\1\14\1\21\1\15\4\uffff\1\43\3\uffff\1\3\3\uffff\1\37\1\7\13\uffff\1\45\1\uffff\1\10\2\uffff\1\16\1\17\3\uffff\1\51\1\1\2\uffff\1\11\1\13\1\uffff\1\40\1\46\2\uffff\1\23\2\uffff\1\41\2\uffff\1\34";
    static final String DFA13_specialS =
        "\1\1\43\uffff\1\2\1\0\u00ab\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\47\1\44\3\47\1\23\1\45\2\47\1\27\1\24\1\33\1\25\1\42\1\26\12\43\1\47\1\34\1\21\1\22\1\20\2\47\1\41\1\10\1\13\1\14\4\41\1\11\2\41\1\12\1\16\1\41\1\17\3\41\1\15\7\41\1\36\1\47\1\37\1\40\1\41\1\47\1\41\1\1\1\5\1\7\1\32\1\6\2\41\1\3\2\41\1\4\3\41\1\35\2\41\1\2\7\41\1\30\1\47\1\31\uff82\47",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\50\11\52\1\51\1\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\55\22\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\57\1\56\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\60\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\61\3\52\1\62\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\63\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\64\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\65\11\52\1\66\1\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\67\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\71\5\52\1\70\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\7\52\1\72\22\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\73\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\75\16\52\1\74\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\76\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\77\12\52",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\115\11\52\1\114\2\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\120\23\52\1\121\5\52",
            "",
            "",
            "\32\124\4\uffff\1\124\1\uffff\32\124",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\125",
            "",
            "\0\127",
            "\0\127",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\131\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\132\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\133\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\134\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\135\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\136\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\137\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\140\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\141\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\142\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\143\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\144\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\145\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\146\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\147\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\150\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\151\5\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\152\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\153\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\154\12\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\155\6\52",
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
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\156\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\157\5\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\160\27\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\161\30\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\162\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\163\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\164\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\166\2\52\1\167\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\170\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\171\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\172\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\173\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\174\30\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\175\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\176\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\177\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u0080\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0081\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0082\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\u0083\30\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0084\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0087\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0088\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u0089\15\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\12\52\1\u008a\17\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u008b\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u008c\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u008e\6\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u008f\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0090\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u0093\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0094\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u0095\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0096\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u0098\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u009c\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u009d\14\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u009e\13\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u009f\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00a1\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00a2\21\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00a3\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u00a5\15\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00a6\6\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00a7\26\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00aa\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00ab\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00ac\25\52",
            "",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00ad\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00ae\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00af\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u00b0\26\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00b1\23\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u00b2\27\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00b3\14\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00b4\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00b6\21\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00b8\14\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00b9\10\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00bc\31\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00bd\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00be\25\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00c1\14\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00c2\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\u00c5\16\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00c8\6\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u00c9\23\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00cb\7\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u00cc\10\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u00ce\31\52",
            "",
            "\1\54\1\uffff\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u00cf\15\52",
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
                        int LA13_37 = input.LA(1);

                        s = -1;
                        if ( ((LA13_37>='\u0000' && LA13_37<='\uFFFF')) ) {s = 87;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
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

                        else if ( (LA13_0=='{') ) {s = 24;}

                        else if ( (LA13_0=='}') ) {s = 25;}

                        else if ( (LA13_0=='e') ) {s = 26;}

                        else if ( (LA13_0==',') ) {s = 27;}

                        else if ( (LA13_0==';') ) {s = 28;}

                        else if ( (LA13_0=='p') ) {s = 29;}

                        else if ( (LA13_0=='[') ) {s = 30;}

                        else if ( (LA13_0==']') ) {s = 31;}

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