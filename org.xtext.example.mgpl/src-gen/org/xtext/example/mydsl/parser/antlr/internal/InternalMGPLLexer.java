package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGPLLexer extends Lexer {
    public static final int RULE_OBJTYPE=6;
    public static final int RULE_STRING=16;
    public static final int RULE_NOT=15;
    public static final int RULE_AND=9;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int RULE_DIV=14;
    public static final int T__38=38;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_PLUS=11;
    public static final int T__36=36;
    public static final int RULE_OR=8;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=19;
    public static final int RULE_KEYSTROKE=7;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_MINUS=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_MULT=13;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int RULE_REL_OP=10;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMGPLLexer() {;} 
    public InternalMGPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMGPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMGPL.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:11:7: ( 'game' )
            // InternalMGPL.g:11:9: 'game'
            {
            match("game"); 


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
            // InternalMGPL.g:12:7: ( '(' )
            // InternalMGPL.g:12:9: '('
            {
            match('('); 

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
            // InternalMGPL.g:13:7: ( ')' )
            // InternalMGPL.g:13:9: ')'
            {
            match(')'); 

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
            // InternalMGPL.g:14:7: ( ';' )
            // InternalMGPL.g:14:9: ';'
            {
            match(';'); 

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
            // InternalMGPL.g:15:7: ( 'int' )
            // InternalMGPL.g:15:9: 'int'
            {
            match("int"); 


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
            // InternalMGPL.g:16:7: ( '[' )
            // InternalMGPL.g:16:9: '['
            {
            match('['); 

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
            // InternalMGPL.g:17:7: ( ']' )
            // InternalMGPL.g:17:9: ']'
            {
            match(']'); 

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
            // InternalMGPL.g:18:7: ( '=' )
            // InternalMGPL.g:18:9: '='
            {
            match('='); 

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
            // InternalMGPL.g:19:7: ( ',' )
            // InternalMGPL.g:19:9: ','
            {
            match(','); 

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
            // InternalMGPL.g:20:7: ( '{' )
            // InternalMGPL.g:20:9: '{'
            {
            match('{'); 

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
            // InternalMGPL.g:21:7: ( '}' )
            // InternalMGPL.g:21:9: '}'
            {
            match('}'); 

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
            // InternalMGPL.g:22:7: ( 'if' )
            // InternalMGPL.g:22:9: 'if'
            {
            match("if"); 


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
            // InternalMGPL.g:23:7: ( 'else' )
            // InternalMGPL.g:23:9: 'else'
            {
            match("else"); 


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
            // InternalMGPL.g:24:7: ( 'for' )
            // InternalMGPL.g:24:9: 'for'
            {
            match("for"); 


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
            // InternalMGPL.g:25:7: ( 'animation' )
            // InternalMGPL.g:25:9: 'animation'
            {
            match("animation"); 


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
            // InternalMGPL.g:26:7: ( 'on' )
            // InternalMGPL.g:26:9: 'on'
            {
            match("on"); 


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
            // InternalMGPL.g:27:7: ( '.' )
            // InternalMGPL.g:27:9: '.'
            {
            match('.'); 

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
            // InternalMGPL.g:28:7: ( 'touches' )
            // InternalMGPL.g:28:9: 'touches'
            {
            match("touches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_OBJTYPE"
    public final void mRULE_OBJTYPE() throws RecognitionException {
        try {
            int _type = RULE_OBJTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2085:14: ( ( 'rectangle' | 'triangle' | 'circle' ) )
            // InternalMGPL.g:2085:16: ( 'rectangle' | 'triangle' | 'circle' )
            {
            // InternalMGPL.g:2085:16: ( 'rectangle' | 'triangle' | 'circle' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt1=1;
                }
                break;
            case 't':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMGPL.g:2085:17: 'rectangle'
                    {
                    match("rectangle"); 


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2085:29: 'triangle'
                    {
                    match("triangle"); 


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:2085:40: 'circle'
                    {
                    match("circle"); 


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
    // $ANTLR end "RULE_OBJTYPE"

    // $ANTLR start "RULE_KEYSTROKE"
    public final void mRULE_KEYSTROKE() throws RecognitionException {
        try {
            int _type = RULE_KEYSTROKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2087:16: ( ( 'space' | 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' ) )
            // InternalMGPL.g:2087:18: ( 'space' | 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' )
            {
            // InternalMGPL.g:2087:18: ( 'space' | 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt2=1;
                }
                break;
            case 'l':
                {
                alt2=2;
                }
                break;
            case 'r':
                {
                alt2=3;
                }
                break;
            case 'u':
                {
                alt2=4;
                }
                break;
            case 'd':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMGPL.g:2087:19: 'space'
                    {
                    match("space"); 


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2087:27: 'leftarrow'
                    {
                    match("leftarrow"); 


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:2087:39: 'rightarrow'
                    {
                    match("rightarrow"); 


                    }
                    break;
                case 4 :
                    // InternalMGPL.g:2087:52: 'uparrow'
                    {
                    match("uparrow"); 


                    }
                    break;
                case 5 :
                    // InternalMGPL.g:2087:62: 'downarrow'
                    {
                    match("downarrow"); 


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
    // $ANTLR end "RULE_KEYSTROKE"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2089:9: ( '||' )
            // InternalMGPL.g:2089:11: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2091:10: ( '&&' )
            // InternalMGPL.g:2091:12: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_REL_OP"
    public final void mRULE_REL_OP() throws RecognitionException {
        try {
            int _type = RULE_REL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2093:13: ( ( '==' | '<' | '<=' ) )
            // InternalMGPL.g:2093:15: ( '==' | '<' | '<=' )
            {
            // InternalMGPL.g:2093:15: ( '==' | '<' | '<=' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='=') ) {
                alt3=1;
            }
            else if ( (LA3_0=='<') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMGPL.g:2093:16: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2093:21: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:2093:25: '<='
                    {
                    match("<="); 


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
    // $ANTLR end "RULE_REL_OP"

    // $ANTLR start "RULE_MULT"
    public final void mRULE_MULT() throws RecognitionException {
        try {
            int _type = RULE_MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2095:11: ( '*' )
            // InternalMGPL.g:2095:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULT"

    // $ANTLR start "RULE_DIV"
    public final void mRULE_DIV() throws RecognitionException {
        try {
            int _type = RULE_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2097:10: ( '/' )
            // InternalMGPL.g:2097:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2099:10: ( '!' )
            // InternalMGPL.g:2099:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2101:12: ( '-' )
            // InternalMGPL.g:2101:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2103:11: ( '+' )
            // InternalMGPL.g:2103:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMGPL.g:2105:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMGPL.g:2105:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMGPL.g:2105:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGPL.g:2105:11: '^'
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

            // InternalMGPL.g:2105:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMGPL.g:
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
            	    break loop5;
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
            // InternalMGPL.g:2107:10: ( ( '0' .. '9' )+ )
            // InternalMGPL.g:2107:12: ( '0' .. '9' )+
            {
            // InternalMGPL.g:2107:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMGPL.g:2107:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalMGPL.g:2109:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMGPL.g:2109:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMGPL.g:2109:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMGPL.g:2109:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMGPL.g:2109:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMGPL.g:2109:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMGPL.g:2109:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:2109:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMGPL.g:2109:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMGPL.g:2109:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMGPL.g:2109:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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
            // InternalMGPL.g:2111:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMGPL.g:2111:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMGPL.g:2111:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGPL.g:2111:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // InternalMGPL.g:2113:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMGPL.g:2113:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMGPL.g:2113:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMGPL.g:2113:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalMGPL.g:2113:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGPL.g:2113:41: ( '\\r' )? '\\n'
                    {
                    // InternalMGPL.g:2113:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMGPL.g:2113:41: '\\r'
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
            // InternalMGPL.g:2115:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMGPL.g:2115:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMGPL.g:2115:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMGPL.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // InternalMGPL.g:2117:16: ( . )
            // InternalMGPL.g:2117:18: .
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
        // InternalMGPL.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_OBJTYPE | RULE_KEYSTROKE | RULE_OR | RULE_AND | RULE_REL_OP | RULE_MULT | RULE_DIV | RULE_NOT | RULE_MINUS | RULE_PLUS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=35;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalMGPL.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalMGPL.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalMGPL.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalMGPL.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalMGPL.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalMGPL.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalMGPL.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalMGPL.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalMGPL.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalMGPL.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalMGPL.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalMGPL.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalMGPL.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalMGPL.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalMGPL.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalMGPL.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalMGPL.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalMGPL.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalMGPL.g:1:118: RULE_OBJTYPE
                {
                mRULE_OBJTYPE(); 

                }
                break;
            case 20 :
                // InternalMGPL.g:1:131: RULE_KEYSTROKE
                {
                mRULE_KEYSTROKE(); 

                }
                break;
            case 21 :
                // InternalMGPL.g:1:146: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 22 :
                // InternalMGPL.g:1:154: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 23 :
                // InternalMGPL.g:1:163: RULE_REL_OP
                {
                mRULE_REL_OP(); 

                }
                break;
            case 24 :
                // InternalMGPL.g:1:175: RULE_MULT
                {
                mRULE_MULT(); 

                }
                break;
            case 25 :
                // InternalMGPL.g:1:185: RULE_DIV
                {
                mRULE_DIV(); 

                }
                break;
            case 26 :
                // InternalMGPL.g:1:194: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 27 :
                // InternalMGPL.g:1:203: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 28 :
                // InternalMGPL.g:1:214: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 29 :
                // InternalMGPL.g:1:224: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalMGPL.g:1:232: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 31 :
                // InternalMGPL.g:1:241: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 32 :
                // InternalMGPL.g:1:253: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 33 :
                // InternalMGPL.g:1:269: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 34 :
                // InternalMGPL.g:1:285: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalMGPL.g:1:293: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\50\3\uffff\1\50\2\uffff\1\61\3\uffff\4\50\1\uffff\7\50\2\46\2\uffff\1\110\3\uffff\1\46\2\uffff\2\46\2\uffff\1\50\4\uffff\1\50\1\121\7\uffff\3\50\1\125\1\uffff\11\50\14\uffff\1\50\1\140\1\uffff\1\50\1\142\1\50\1\uffff\11\50\1\155\1\uffff\1\156\1\uffff\12\50\2\uffff\6\50\1\177\10\50\1\u0088\1\uffff\4\50\1\u008d\3\50\1\uffff\1\50\1\177\2\50\1\uffff\1\u0088\4\50\1\u0098\1\u0088\1\50\2\177\1\uffff\1\177";
    static final String DFA15_eofS =
        "\u009a\uffff";
    static final String DFA15_minS =
        "\1\0\1\141\3\uffff\1\146\2\uffff\1\75\3\uffff\1\154\1\157\2\156\1\uffff\1\157\1\145\1\151\1\160\1\145\1\160\1\157\1\174\1\46\2\uffff\1\52\3\uffff\1\101\2\uffff\2\0\2\uffff\1\155\4\uffff\1\164\1\60\7\uffff\1\163\1\162\1\151\1\60\1\uffff\1\165\1\151\1\143\1\147\1\162\1\141\1\146\1\141\1\167\14\uffff\1\145\1\60\1\uffff\1\145\1\60\1\155\1\uffff\1\143\1\141\1\164\1\150\2\143\1\164\1\162\1\156\1\60\1\uffff\1\60\1\uffff\1\141\1\150\1\156\1\141\1\164\1\154\1\145\1\141\1\162\1\141\2\uffff\1\164\1\145\1\147\1\156\1\141\1\145\1\60\1\162\1\157\1\162\1\151\1\163\1\154\1\147\1\162\1\60\1\uffff\1\162\1\167\1\162\1\157\1\60\1\145\1\154\1\162\1\uffff\1\157\1\60\1\157\1\156\1\uffff\1\60\1\145\1\157\2\167\2\60\1\167\2\60\1\uffff\1\60";
    static final String DFA15_maxS =
        "\1\uffff\1\141\3\uffff\1\156\2\uffff\1\75\3\uffff\1\154\1\157\2\156\1\uffff\1\162\2\151\1\160\1\145\1\160\1\157\1\174\1\46\2\uffff\1\57\3\uffff\1\172\2\uffff\2\uffff\2\uffff\1\155\4\uffff\1\164\1\172\7\uffff\1\163\1\162\1\151\1\172\1\uffff\1\165\1\151\1\143\1\147\1\162\1\141\1\146\1\141\1\167\14\uffff\1\145\1\172\1\uffff\1\145\1\172\1\155\1\uffff\1\143\1\141\1\164\1\150\2\143\1\164\1\162\1\156\1\172\1\uffff\1\172\1\uffff\1\141\1\150\1\156\1\141\1\164\1\154\1\145\1\141\1\162\1\141\2\uffff\1\164\1\145\1\147\1\156\1\141\1\145\1\172\1\162\1\157\1\162\1\151\1\163\1\154\1\147\1\162\1\172\1\uffff\1\162\1\167\1\162\1\157\1\172\1\145\1\154\1\162\1\uffff\1\157\1\172\1\157\1\156\1\uffff\1\172\1\145\1\157\2\167\2\172\1\167\2\172\1\uffff\1\172";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\13\4\uffff\1\21\11\uffff\1\27\1\30\1\uffff\1\32\1\33\1\34\1\uffff\1\35\1\36\2\uffff\1\42\1\43\1\uffff\1\35\1\2\1\3\1\4\2\uffff\1\6\1\7\1\27\1\10\1\11\1\12\1\13\4\uffff\1\21\11\uffff\1\25\1\26\1\30\1\40\1\41\1\31\1\32\1\33\1\34\1\36\1\37\1\42\2\uffff\1\14\3\uffff\1\20\12\uffff\1\5\1\uffff\1\16\12\uffff\1\1\1\15\20\uffff\1\24\10\uffff\1\23\4\uffff\1\22\12\uffff\1\17\1\uffff";
    static final String DFA15_specialS =
        "\1\0\42\uffff\1\2\1\1\165\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\35\1\43\3\46\1\31\1\44\1\2\1\3\1\33\1\37\1\11\1\36\1\20\1\34\12\42\1\46\1\4\1\32\1\10\3\46\32\41\1\6\1\46\1\7\1\40\1\41\1\46\1\16\1\41\1\23\1\27\1\14\1\15\1\1\1\41\1\5\2\41\1\25\2\41\1\17\2\41\1\22\1\24\1\21\1\26\5\41\1\12\1\30\1\13\uff82\46",
            "\1\47",
            "",
            "",
            "",
            "\1\55\7\uffff\1\54",
            "",
            "",
            "\1\60",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\72\2\uffff\1\73",
            "\1\74\3\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\0\115",
            "\0\115",
            "",
            "",
            "\1\117",
            "",
            "",
            "",
            "",
            "\1\120",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
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
            "\1\137",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\141",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\u0091",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0099",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_OBJTYPE | RULE_KEYSTROKE | RULE_OR | RULE_AND | RULE_REL_OP | RULE_MULT | RULE_DIV | RULE_NOT | RULE_MINUS | RULE_PLUS | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='g') ) {s = 1;}

                        else if ( (LA15_0=='(') ) {s = 2;}

                        else if ( (LA15_0==')') ) {s = 3;}

                        else if ( (LA15_0==';') ) {s = 4;}

                        else if ( (LA15_0=='i') ) {s = 5;}

                        else if ( (LA15_0=='[') ) {s = 6;}

                        else if ( (LA15_0==']') ) {s = 7;}

                        else if ( (LA15_0=='=') ) {s = 8;}

                        else if ( (LA15_0==',') ) {s = 9;}

                        else if ( (LA15_0=='{') ) {s = 10;}

                        else if ( (LA15_0=='}') ) {s = 11;}

                        else if ( (LA15_0=='e') ) {s = 12;}

                        else if ( (LA15_0=='f') ) {s = 13;}

                        else if ( (LA15_0=='a') ) {s = 14;}

                        else if ( (LA15_0=='o') ) {s = 15;}

                        else if ( (LA15_0=='.') ) {s = 16;}

                        else if ( (LA15_0=='t') ) {s = 17;}

                        else if ( (LA15_0=='r') ) {s = 18;}

                        else if ( (LA15_0=='c') ) {s = 19;}

                        else if ( (LA15_0=='s') ) {s = 20;}

                        else if ( (LA15_0=='l') ) {s = 21;}

                        else if ( (LA15_0=='u') ) {s = 22;}

                        else if ( (LA15_0=='d') ) {s = 23;}

                        else if ( (LA15_0=='|') ) {s = 24;}

                        else if ( (LA15_0=='&') ) {s = 25;}

                        else if ( (LA15_0=='<') ) {s = 26;}

                        else if ( (LA15_0=='*') ) {s = 27;}

                        else if ( (LA15_0=='/') ) {s = 28;}

                        else if ( (LA15_0=='!') ) {s = 29;}

                        else if ( (LA15_0=='-') ) {s = 30;}

                        else if ( (LA15_0=='+') ) {s = 31;}

                        else if ( (LA15_0=='^') ) {s = 32;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||LA15_0=='h'||(LA15_0>='j' && LA15_0<='k')||(LA15_0>='m' && LA15_0<='n')||(LA15_0>='p' && LA15_0<='q')||(LA15_0>='v' && LA15_0<='z')) ) {s = 33;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 34;}

                        else if ( (LA15_0=='\"') ) {s = 35;}

                        else if ( (LA15_0=='\'') ) {s = 36;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 37;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='%')||LA15_0==':'||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\uFFFF')) ) {s = 77;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_35 = input.LA(1);

                        s = -1;
                        if ( ((LA15_35>='\u0000' && LA15_35<='\uFFFF')) ) {s = 77;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}