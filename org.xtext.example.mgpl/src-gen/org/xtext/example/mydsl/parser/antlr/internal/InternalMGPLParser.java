package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MGPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMGPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OBJTYPE", "RULE_KEYSTROKE", "RULE_OR", "RULE_AND", "RULE_REL_OP", "RULE_PLUS", "RULE_MINUS", "RULE_MULT", "RULE_DIV", "RULE_NOT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'('", "')'", "';'", "'int'", "'['", "']'", "'='", "','", "'{'", "'}'", "'if'", "'else'", "'for'", "'animation'", "'on'", "'.'", "'touches'"
    };
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


        public InternalMGPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMGPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMGPLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMGPL.g"; }



     	private MGPLGrammarAccess grammarAccess;

        public InternalMGPLParser(TokenStream input, MGPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected MGPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalMGPL.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalMGPL.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalMGPL.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalMGPL.g:71:1: ruleGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attrAssList_3_0 = null;

        EObject lv_decl_5_0 = null;

        EObject lv_initBlock_6_0 = null;

        EObject lv_functions_7_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* ) )
            // InternalMGPL.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* )
            {
            // InternalMGPL.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )* )
            // InternalMGPL.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ( (lv_decl_5_0= ruleDecl ) )* ( (lv_initBlock_6_0= ruleStmtBlock ) ) ( (lv_functions_7_0= ruleBlock ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalMGPL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGPL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGPL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMGPL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMGPL.g:105:3: ( (lv_attrAssList_3_0= ruleAttrAssList ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMGPL.g:106:4: (lv_attrAssList_3_0= ruleAttrAssList )
                    {
                    // InternalMGPL.g:106:4: (lv_attrAssList_3_0= ruleAttrAssList )
                    // InternalMGPL.g:107:5: lv_attrAssList_3_0= ruleAttrAssList
                    {

                    					newCompositeNode(grammarAccess.getGameAccess().getAttrAssListAttrAssListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_attrAssList_3_0=ruleAttrAssList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGameRule());
                    					}
                    					set(
                    						current,
                    						"attrAssList",
                    						lv_attrAssList_3_0,
                    						"org.xtext.example.mydsl.MGPL.AttrAssList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getRightParenthesisKeyword_4());
            		
            // InternalMGPL.g:128:3: ( (lv_decl_5_0= ruleDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_OBJTYPE||LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMGPL.g:129:4: (lv_decl_5_0= ruleDecl )
            	    {
            	    // InternalMGPL.g:129:4: (lv_decl_5_0= ruleDecl )
            	    // InternalMGPL.g:130:5: lv_decl_5_0= ruleDecl
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getDeclDeclParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_decl_5_0=ruleDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"decl",
            	    						lv_decl_5_0,
            	    						"org.xtext.example.mydsl.MGPL.Decl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMGPL.g:147:3: ( (lv_initBlock_6_0= ruleStmtBlock ) )
            // InternalMGPL.g:148:4: (lv_initBlock_6_0= ruleStmtBlock )
            {
            // InternalMGPL.g:148:4: (lv_initBlock_6_0= ruleStmtBlock )
            // InternalMGPL.g:149:5: lv_initBlock_6_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getGameAccess().getInitBlockStmtBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_initBlock_6_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"initBlock",
            						lv_initBlock_6_0,
            						"org.xtext.example.mydsl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:166:3: ( (lv_functions_7_0= ruleBlock ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=35 && LA3_0<=36)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMGPL.g:167:4: (lv_functions_7_0= ruleBlock )
            	    {
            	    // InternalMGPL.g:167:4: (lv_functions_7_0= ruleBlock )
            	    // InternalMGPL.g:168:5: lv_functions_7_0= ruleBlock
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getFunctionsBlockParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_functions_7_0=ruleBlock();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_7_0,
            	    						"org.xtext.example.mydsl.MGPL.Block");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleDecl"
    // InternalMGPL.g:189:1: entryRuleDecl returns [EObject current=null] : iv_ruleDecl= ruleDecl EOF ;
    public final EObject entryRuleDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecl = null;


        try {
            // InternalMGPL.g:189:45: (iv_ruleDecl= ruleDecl EOF )
            // InternalMGPL.g:190:2: iv_ruleDecl= ruleDecl EOF
            {
             newCompositeNode(grammarAccess.getDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecl=ruleDecl();

            state._fsp--;

             current =iv_ruleDecl; 
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
    // $ANTLR end "entryRuleDecl"


    // $ANTLR start "ruleDecl"
    // InternalMGPL.g:196:1: ruleDecl returns [EObject current=null] : ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) ) ;
    public final EObject ruleDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_VarDecl_0 = null;

        EObject this_ObjDecl_2 = null;



        	enterRule();

        try {
            // InternalMGPL.g:202:2: ( ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) ) )
            // InternalMGPL.g:203:2: ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) )
            {
            // InternalMGPL.g:203:2: ( (this_VarDecl_0= ruleVarDecl otherlv_1= ';' ) | (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_OBJTYPE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMGPL.g:204:3: (this_VarDecl_0= ruleVarDecl otherlv_1= ';' )
                    {
                    // InternalMGPL.g:204:3: (this_VarDecl_0= ruleVarDecl otherlv_1= ';' )
                    // InternalMGPL.g:205:4: this_VarDecl_0= ruleVarDecl otherlv_1= ';'
                    {

                    				newCompositeNode(grammarAccess.getDeclAccess().getVarDeclParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_VarDecl_0=ruleVarDecl();

                    state._fsp--;


                    				current = this_VarDecl_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeclAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:219:3: (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' )
                    {
                    // InternalMGPL.g:219:3: (this_ObjDecl_2= ruleObjDecl otherlv_3= ';' )
                    // InternalMGPL.g:220:4: this_ObjDecl_2= ruleObjDecl otherlv_3= ';'
                    {

                    				newCompositeNode(grammarAccess.getDeclAccess().getObjDeclParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_ObjDecl_2=ruleObjDecl();

                    state._fsp--;


                    				current = this_ObjDecl_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeclAccess().getSemicolonKeyword_1_1());
                    			

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
    // $ANTLR end "ruleDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalMGPL.g:237:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalMGPL.g:237:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalMGPL.g:238:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalMGPL.g:244:1: ruleVarDecl returns [EObject current=null] : ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )? ) | ( ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']' ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token lv_type_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_arrSize_6_0=null;
        Token otherlv_7=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:250:2: ( ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )? ) | ( ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']' ) ) )
            // InternalMGPL.g:251:2: ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )? ) | ( ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            {
            // InternalMGPL.g:251:2: ( ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )? ) | ( ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==26) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==EOF||LA6_2==24||LA6_2==28) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMGPL.g:252:3: ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )? )
                    {
                    // InternalMGPL.g:252:3: ( ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )? )
                    // InternalMGPL.g:253:4: ( (lv_type_0_0= 'int' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleInit ) )?
                    {
                    // InternalMGPL.g:253:4: ( (lv_type_0_0= 'int' ) )
                    // InternalMGPL.g:254:5: (lv_type_0_0= 'int' )
                    {
                    // InternalMGPL.g:254:5: (lv_type_0_0= 'int' )
                    // InternalMGPL.g:255:6: lv_type_0_0= 'int'
                    {
                    lv_type_0_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getVarDeclAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_0, "int");
                    					

                    }


                    }

                    // InternalMGPL.g:267:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMGPL.g:268:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMGPL.g:268:5: (lv_name_1_0= RULE_ID )
                    // InternalMGPL.g:269:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMGPL.g:285:4: ( (lv_value_2_0= ruleInit ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==28) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMGPL.g:286:5: (lv_value_2_0= ruleInit )
                            {
                            // InternalMGPL.g:286:5: (lv_value_2_0= ruleInit )
                            // InternalMGPL.g:287:6: lv_value_2_0= ruleInit
                            {

                            						newCompositeNode(grammarAccess.getVarDeclAccess().getValueInitParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleInit();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getVarDeclRule());
                            						}
                            						set(
                            							current,
                            							"value",
                            							lv_value_2_0,
                            							"org.xtext.example.mydsl.MGPL.Init");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:306:3: ( ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']' )
                    {
                    // InternalMGPL.g:306:3: ( ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']' )
                    // InternalMGPL.g:307:4: ( (lv_type_3_0= 'int' ) ) ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '[' ( (lv_arrSize_6_0= RULE_INT ) ) otherlv_7= ']'
                    {
                    // InternalMGPL.g:307:4: ( (lv_type_3_0= 'int' ) )
                    // InternalMGPL.g:308:5: (lv_type_3_0= 'int' )
                    {
                    // InternalMGPL.g:308:5: (lv_type_3_0= 'int' )
                    // InternalMGPL.g:309:6: lv_type_3_0= 'int'
                    {
                    lv_type_3_0=(Token)match(input,25,FOLLOW_3); 

                    						newLeafNode(lv_type_3_0, grammarAccess.getVarDeclAccess().getTypeIntKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_3_0, "int");
                    					

                    }


                    }

                    // InternalMGPL.g:321:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalMGPL.g:322:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalMGPL.g:322:5: (lv_name_4_0= RULE_ID )
                    // InternalMGPL.g:323:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalMGPL.g:343:4: ( (lv_arrSize_6_0= RULE_INT ) )
                    // InternalMGPL.g:344:5: (lv_arrSize_6_0= RULE_INT )
                    {
                    // InternalMGPL.g:344:5: (lv_arrSize_6_0= RULE_INT )
                    // InternalMGPL.g:345:6: lv_arrSize_6_0= RULE_INT
                    {
                    lv_arrSize_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_arrSize_6_0, grammarAccess.getVarDeclAccess().getArrSizeINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"arrSize",
                    							lv_arrSize_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_1_4());
                    			

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleInit"
    // InternalMGPL.g:370:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalMGPL.g:370:45: (iv_ruleInit= ruleInit EOF )
            // InternalMGPL.g:371:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit; 
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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalMGPL.g:377:1: ruleInit returns [EObject current=null] : (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:383:2: ( (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // InternalMGPL.g:384:2: (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:384:2: (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) )
            // InternalMGPL.g:385:3: otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getEqualsSignKeyword_0());
            		
            // InternalMGPL.g:389:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalMGPL.g:390:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalMGPL.g:390:4: (lv_expr_1_0= ruleExpr )
            // InternalMGPL.g:391:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getInitAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.mydsl.MGPL.Expr");
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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleObjDecl"
    // InternalMGPL.g:412:1: entryRuleObjDecl returns [EObject current=null] : iv_ruleObjDecl= ruleObjDecl EOF ;
    public final EObject entryRuleObjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjDecl = null;


        try {
            // InternalMGPL.g:412:48: (iv_ruleObjDecl= ruleObjDecl EOF )
            // InternalMGPL.g:413:2: iv_ruleObjDecl= ruleObjDecl EOF
            {
             newCompositeNode(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjDecl=ruleObjDecl();

            state._fsp--;

             current =iv_ruleObjDecl; 
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
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // InternalMGPL.g:419:1: ruleObjDecl returns [EObject current=null] : ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) ) ;
    public final EObject ruleObjDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_arrSize_8_0=null;
        Token otherlv_9=null;
        EObject lv_attrAssList_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:425:2: ( ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) ) )
            // InternalMGPL.g:426:2: ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            {
            // InternalMGPL.g:426:2: ( ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' ) | ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OBJTYPE) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==22) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==26) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMGPL.g:427:3: ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' )
                    {
                    // InternalMGPL.g:427:3: ( ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')' )
                    // InternalMGPL.g:428:4: ( (lv_type_0_0= RULE_OBJTYPE ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attrAssList_3_0= ruleAttrAssList ) )? otherlv_4= ')'
                    {
                    // InternalMGPL.g:428:4: ( (lv_type_0_0= RULE_OBJTYPE ) )
                    // InternalMGPL.g:429:5: (lv_type_0_0= RULE_OBJTYPE )
                    {
                    // InternalMGPL.g:429:5: (lv_type_0_0= RULE_OBJTYPE )
                    // InternalMGPL.g:430:6: lv_type_0_0= RULE_OBJTYPE
                    {
                    lv_type_0_0=(Token)match(input,RULE_OBJTYPE,FOLLOW_3); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getObjDeclAccess().getTypeOBJTYPETerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"org.xtext.example.mydsl.MGPL.OBJTYPE");
                    					

                    }


                    }

                    // InternalMGPL.g:446:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMGPL.g:447:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMGPL.g:447:5: (lv_name_1_0= RULE_ID )
                    // InternalMGPL.g:448:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMGPL.g:468:4: ( (lv_attrAssList_3_0= ruleAttrAssList ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMGPL.g:469:5: (lv_attrAssList_3_0= ruleAttrAssList )
                            {
                            // InternalMGPL.g:469:5: (lv_attrAssList_3_0= ruleAttrAssList )
                            // InternalMGPL.g:470:6: lv_attrAssList_3_0= ruleAttrAssList
                            {

                            						newCompositeNode(grammarAccess.getObjDeclAccess().getAttrAssListAttrAssListParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_6);
                            lv_attrAssList_3_0=ruleAttrAssList();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjDeclRule());
                            						}
                            						set(
                            							current,
                            							"attrAssList",
                            							lv_attrAssList_3_0,
                            							"org.xtext.example.mydsl.MGPL.AttrAssList");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:493:3: ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' )
                    {
                    // InternalMGPL.g:493:3: ( ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']' )
                    // InternalMGPL.g:494:4: ( (lv_type_5_0= RULE_OBJTYPE ) ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '[' ( (lv_arrSize_8_0= RULE_INT ) ) otherlv_9= ']'
                    {
                    // InternalMGPL.g:494:4: ( (lv_type_5_0= RULE_OBJTYPE ) )
                    // InternalMGPL.g:495:5: (lv_type_5_0= RULE_OBJTYPE )
                    {
                    // InternalMGPL.g:495:5: (lv_type_5_0= RULE_OBJTYPE )
                    // InternalMGPL.g:496:6: lv_type_5_0= RULE_OBJTYPE
                    {
                    lv_type_5_0=(Token)match(input,RULE_OBJTYPE,FOLLOW_3); 

                    						newLeafNode(lv_type_5_0, grammarAccess.getObjDeclAccess().getTypeOBJTYPETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.mydsl.MGPL.OBJTYPE");
                    					

                    }


                    }

                    // InternalMGPL.g:512:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalMGPL.g:513:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalMGPL.g:513:5: (lv_name_6_0= RULE_ID )
                    // InternalMGPL.g:514:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalMGPL.g:534:4: ( (lv_arrSize_8_0= RULE_INT ) )
                    // InternalMGPL.g:535:5: (lv_arrSize_8_0= RULE_INT )
                    {
                    // InternalMGPL.g:535:5: (lv_arrSize_8_0= RULE_INT )
                    // InternalMGPL.g:536:6: lv_arrSize_8_0= RULE_INT
                    {
                    lv_arrSize_8_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_arrSize_8_0, grammarAccess.getObjDeclAccess().getArrSizeINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObjDeclRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"arrSize",
                    							lv_arrSize_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_1_4());
                    			

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
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleAttrAssList"
    // InternalMGPL.g:561:1: entryRuleAttrAssList returns [EObject current=null] : iv_ruleAttrAssList= ruleAttrAssList EOF ;
    public final EObject entryRuleAttrAssList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAssList = null;


        try {
            // InternalMGPL.g:561:52: (iv_ruleAttrAssList= ruleAttrAssList EOF )
            // InternalMGPL.g:562:2: iv_ruleAttrAssList= ruleAttrAssList EOF
            {
             newCompositeNode(grammarAccess.getAttrAssListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttrAssList=ruleAttrAssList();

            state._fsp--;

             current =iv_ruleAttrAssList; 
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
    // $ANTLR end "entryRuleAttrAssList"


    // $ANTLR start "ruleAttrAssList"
    // InternalMGPL.g:568:1: ruleAttrAssList returns [EObject current=null] : ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* ) ;
    public final EObject ruleAttrAssList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attrAss_0_0 = null;

        EObject lv_attrAss_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:574:2: ( ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* ) )
            // InternalMGPL.g:575:2: ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* )
            {
            // InternalMGPL.g:575:2: ( ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )* )
            // InternalMGPL.g:576:3: ( (lv_attrAss_0_0= ruleAttrAss ) ) (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )*
            {
            // InternalMGPL.g:576:3: ( (lv_attrAss_0_0= ruleAttrAss ) )
            // InternalMGPL.g:577:4: (lv_attrAss_0_0= ruleAttrAss )
            {
            // InternalMGPL.g:577:4: (lv_attrAss_0_0= ruleAttrAss )
            // InternalMGPL.g:578:5: lv_attrAss_0_0= ruleAttrAss
            {

            					newCompositeNode(grammarAccess.getAttrAssListAccess().getAttrAssAttrAssParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_attrAss_0_0=ruleAttrAss();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttrAssListRule());
            					}
            					add(
            						current,
            						"attrAss",
            						lv_attrAss_0_0,
            						"org.xtext.example.mydsl.MGPL.AttrAss");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:595:3: (otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMGPL.g:596:4: otherlv_1= ',' ( (lv_attrAss_2_0= ruleAttrAss ) )
            	    {
            	    otherlv_1=(Token)match(input,29,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAttrAssListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMGPL.g:600:4: ( (lv_attrAss_2_0= ruleAttrAss ) )
            	    // InternalMGPL.g:601:5: (lv_attrAss_2_0= ruleAttrAss )
            	    {
            	    // InternalMGPL.g:601:5: (lv_attrAss_2_0= ruleAttrAss )
            	    // InternalMGPL.g:602:6: lv_attrAss_2_0= ruleAttrAss
            	    {

            	    						newCompositeNode(grammarAccess.getAttrAssListAccess().getAttrAssAttrAssParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_attrAss_2_0=ruleAttrAss();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAttrAssListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attrAss",
            	    							lv_attrAss_2_0,
            	    							"org.xtext.example.mydsl.MGPL.AttrAss");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleAttrAssList"


    // $ANTLR start "entryRuleAttrAss"
    // InternalMGPL.g:624:1: entryRuleAttrAss returns [EObject current=null] : iv_ruleAttrAss= ruleAttrAss EOF ;
    public final EObject entryRuleAttrAss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAss = null;


        try {
            // InternalMGPL.g:624:48: (iv_ruleAttrAss= ruleAttrAss EOF )
            // InternalMGPL.g:625:2: iv_ruleAttrAss= ruleAttrAss EOF
            {
             newCompositeNode(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttrAss=ruleAttrAss();

            state._fsp--;

             current =iv_ruleAttrAss; 
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
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // InternalMGPL.g:631:1: ruleAttrAss returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAttrAss() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:637:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // InternalMGPL.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:638:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // InternalMGPL.g:639:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // InternalMGPL.g:639:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMGPL.g:640:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMGPL.g:640:4: (lv_name_0_0= RULE_ID )
            // InternalMGPL.g:641:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttrAssRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1());
            		
            // InternalMGPL.g:661:3: ( (lv_expr_2_0= ruleExpr ) )
            // InternalMGPL.g:662:4: (lv_expr_2_0= ruleExpr )
            {
            // InternalMGPL.g:662:4: (lv_expr_2_0= ruleExpr )
            // InternalMGPL.g:663:5: lv_expr_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttrAssRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"org.xtext.example.mydsl.MGPL.Expr");
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
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleStmtBlock"
    // InternalMGPL.g:684:1: entryRuleStmtBlock returns [EObject current=null] : iv_ruleStmtBlock= ruleStmtBlock EOF ;
    public final EObject entryRuleStmtBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtBlock = null;


        try {
            // InternalMGPL.g:684:50: (iv_ruleStmtBlock= ruleStmtBlock EOF )
            // InternalMGPL.g:685:2: iv_ruleStmtBlock= ruleStmtBlock EOF
            {
             newCompositeNode(grammarAccess.getStmtBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmtBlock=ruleStmtBlock();

            state._fsp--;

             current =iv_ruleStmtBlock; 
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
    // $ANTLR end "entryRuleStmtBlock"


    // $ANTLR start "ruleStmtBlock"
    // InternalMGPL.g:691:1: ruleStmtBlock returns [EObject current=null] : (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' ) ;
    public final EObject ruleStmtBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:697:2: ( (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' ) )
            // InternalMGPL.g:698:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' )
            {
            // InternalMGPL.g:698:2: (otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}' )
            // InternalMGPL.g:699:3: otherlv_0= '{' ( (lv_statements_1_0= ruleStmt ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMGPL.g:703:3: ( (lv_statements_1_0= ruleStmt ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==32||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMGPL.g:704:4: (lv_statements_1_0= ruleStmt )
            	    {
            	    // InternalMGPL.g:704:4: (lv_statements_1_0= ruleStmt )
            	    // InternalMGPL.g:705:5: lv_statements_1_0= ruleStmt
            	    {

            	    					newCompositeNode(grammarAccess.getStmtBlockAccess().getStatementsStmtParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_1_0=ruleStmt();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStmtBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"org.xtext.example.mydsl.MGPL.Stmt");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleStmtBlock"


    // $ANTLR start "entryRuleStmt"
    // InternalMGPL.g:730:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalMGPL.g:730:45: (iv_ruleStmt= ruleStmt EOF )
            // InternalMGPL.g:731:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
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
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalMGPL.g:737:1: ruleStmt returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_IfStmt_0 = null;

        EObject this_ForStmt_1 = null;

        EObject this_AssStmt_2 = null;



        	enterRule();

        try {
            // InternalMGPL.g:743:2: ( (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) ) )
            // InternalMGPL.g:744:2: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) )
            {
            // InternalMGPL.g:744:2: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | (this_AssStmt_2= ruleAssStmt otherlv_3= ';' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMGPL.g:745:3: this_IfStmt_0= ruleIfStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;


                    			current = this_IfStmt_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:754:3: this_ForStmt_1= ruleForStmt
                    {

                    			newCompositeNode(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStmt_1=ruleForStmt();

                    state._fsp--;


                    			current = this_ForStmt_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMGPL.g:763:3: (this_AssStmt_2= ruleAssStmt otherlv_3= ';' )
                    {
                    // InternalMGPL.g:763:3: (this_AssStmt_2= ruleAssStmt otherlv_3= ';' )
                    // InternalMGPL.g:764:4: this_AssStmt_2= ruleAssStmt otherlv_3= ';'
                    {

                    				newCompositeNode(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_AssStmt_2=ruleAssStmt();

                    state._fsp--;


                    				current = this_AssStmt_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStmtAccess().getSemicolonKeyword_2_1());
                    			

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
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleIfStmt"
    // InternalMGPL.g:781:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // InternalMGPL.g:781:47: (iv_ruleIfStmt= ruleIfStmt EOF )
            // InternalMGPL.g:782:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // InternalMGPL.g:788:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_consequence_4_0 = null;

        EObject lv_alternative_6_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:794:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? ) )
            // InternalMGPL.g:795:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? )
            {
            // InternalMGPL.g:795:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )? )
            // InternalMGPL.g:796:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_consequence_4_0= ruleStmtBlock ) ) (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGPL.g:804:3: ( (lv_condition_2_0= ruleExpr ) )
            // InternalMGPL.g:805:4: (lv_condition_2_0= ruleExpr )
            {
            // InternalMGPL.g:805:4: (lv_condition_2_0= ruleExpr )
            // InternalMGPL.g:806:5: lv_condition_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getConditionExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_condition_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
            		
            // InternalMGPL.g:827:3: ( (lv_consequence_4_0= ruleStmtBlock ) )
            // InternalMGPL.g:828:4: (lv_consequence_4_0= ruleStmtBlock )
            {
            // InternalMGPL.g:828:4: (lv_consequence_4_0= ruleStmtBlock )
            // InternalMGPL.g:829:5: lv_consequence_4_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getIfStmtAccess().getConsequenceStmtBlockParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_consequence_4_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStmtRule());
            					}
            					set(
            						current,
            						"consequence",
            						lv_consequence_4_0,
            						"org.xtext.example.mydsl.MGPL.StmtBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMGPL.g:846:3: (otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMGPL.g:847:4: otherlv_5= 'else' ( (lv_alternative_6_0= ruleStmtBlock ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getIfStmtAccess().getElseKeyword_5_0());
                    			
                    // InternalMGPL.g:851:4: ( (lv_alternative_6_0= ruleStmtBlock ) )
                    // InternalMGPL.g:852:5: (lv_alternative_6_0= ruleStmtBlock )
                    {
                    // InternalMGPL.g:852:5: (lv_alternative_6_0= ruleStmtBlock )
                    // InternalMGPL.g:853:6: lv_alternative_6_0= ruleStmtBlock
                    {

                    						newCompositeNode(grammarAccess.getIfStmtAccess().getAlternativeStmtBlockParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alternative_6_0=ruleStmtBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    						}
                    						set(
                    							current,
                    							"alternative",
                    							lv_alternative_6_0,
                    							"org.xtext.example.mydsl.MGPL.StmtBlock");
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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleForStmt"
    // InternalMGPL.g:875:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // InternalMGPL.g:875:48: (iv_ruleForStmt= ruleForStmt EOF )
            // InternalMGPL.g:876:2: iv_ruleForStmt= ruleForStmt EOF
            {
             newCompositeNode(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;

             current =iv_ruleForStmt; 
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
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // InternalMGPL.g:882:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleForStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_initStmt_2_0 = null;

        EObject lv_endCondition_4_0 = null;

        EObject lv_loopStmt_6_0 = null;

        EObject lv_stmtBlock_8_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:888:2: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:889:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:889:2: (otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:890:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_initStmt_2_0= ruleAssStmt ) ) otherlv_3= ';' ( (lv_endCondition_4_0= ruleExpr ) ) otherlv_5= ';' ( (lv_loopStmt_6_0= ruleAssStmt ) ) otherlv_7= ')' ( (lv_stmtBlock_8_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMGPL.g:898:3: ( (lv_initStmt_2_0= ruleAssStmt ) )
            // InternalMGPL.g:899:4: (lv_initStmt_2_0= ruleAssStmt )
            {
            // InternalMGPL.g:899:4: (lv_initStmt_2_0= ruleAssStmt )
            // InternalMGPL.g:900:5: lv_initStmt_2_0= ruleAssStmt
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getInitStmtAssStmtParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_initStmt_2_0=ruleAssStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"initStmt",
            						lv_initStmt_2_0,
            						"org.xtext.example.mydsl.MGPL.AssStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getForStmtAccess().getSemicolonKeyword_3());
            		
            // InternalMGPL.g:921:3: ( (lv_endCondition_4_0= ruleExpr ) )
            // InternalMGPL.g:922:4: (lv_endCondition_4_0= ruleExpr )
            {
            // InternalMGPL.g:922:4: (lv_endCondition_4_0= ruleExpr )
            // InternalMGPL.g:923:5: lv_endCondition_4_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getEndConditionExprParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_endCondition_4_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"endCondition",
            						lv_endCondition_4_0,
            						"org.xtext.example.mydsl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getForStmtAccess().getSemicolonKeyword_5());
            		
            // InternalMGPL.g:944:3: ( (lv_loopStmt_6_0= ruleAssStmt ) )
            // InternalMGPL.g:945:4: (lv_loopStmt_6_0= ruleAssStmt )
            {
            // InternalMGPL.g:945:4: (lv_loopStmt_6_0= ruleAssStmt )
            // InternalMGPL.g:946:5: lv_loopStmt_6_0= ruleAssStmt
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getLoopStmtAssStmtParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_loopStmt_6_0=ruleAssStmt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"loopStmt",
            						lv_loopStmt_6_0,
            						"org.xtext.example.mydsl.MGPL.AssStmt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getForStmtAccess().getRightParenthesisKeyword_7());
            		
            // InternalMGPL.g:967:3: ( (lv_stmtBlock_8_0= ruleStmtBlock ) )
            // InternalMGPL.g:968:4: (lv_stmtBlock_8_0= ruleStmtBlock )
            {
            // InternalMGPL.g:968:4: (lv_stmtBlock_8_0= ruleStmtBlock )
            // InternalMGPL.g:969:5: lv_stmtBlock_8_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getForStmtAccess().getStmtBlockStmtBlockParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_8_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStmtRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_8_0,
            						"org.xtext.example.mydsl.MGPL.StmtBlock");
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
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleAssStmt"
    // InternalMGPL.g:990:1: entryRuleAssStmt returns [EObject current=null] : iv_ruleAssStmt= ruleAssStmt EOF ;
    public final EObject entryRuleAssStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt = null;


        try {
            // InternalMGPL.g:990:48: (iv_ruleAssStmt= ruleAssStmt EOF )
            // InternalMGPL.g:991:2: iv_ruleAssStmt= ruleAssStmt EOF
            {
             newCompositeNode(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssStmt=ruleAssStmt();

            state._fsp--;

             current =iv_ruleAssStmt; 
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
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // InternalMGPL.g:997:1: ruleAssStmt returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_assignment_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1003:2: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) ) )
            // InternalMGPL.g:1004:2: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) )
            {
            // InternalMGPL.g:1004:2: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) ) )
            // InternalMGPL.g:1005:3: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_assignment_2_0= ruleExpr ) )
            {
            // InternalMGPL.g:1005:3: ( (lv_var_0_0= ruleVar ) )
            // InternalMGPL.g:1006:4: (lv_var_0_0= ruleVar )
            {
            // InternalMGPL.g:1006:4: (lv_var_0_0= ruleVar )
            // InternalMGPL.g:1007:5: lv_var_0_0= ruleVar
            {

            					newCompositeNode(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_var_0_0=ruleVar();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssStmtRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.example.mydsl.MGPL.Var");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1());
            		
            // InternalMGPL.g:1028:3: ( (lv_assignment_2_0= ruleExpr ) )
            // InternalMGPL.g:1029:4: (lv_assignment_2_0= ruleExpr )
            {
            // InternalMGPL.g:1029:4: (lv_assignment_2_0= ruleExpr )
            // InternalMGPL.g:1030:5: lv_assignment_2_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getAssStmtAccess().getAssignmentExprParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_assignment_2_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssStmtRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_2_0,
            						"org.xtext.example.mydsl.MGPL.Expr");
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
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleBlock"
    // InternalMGPL.g:1051:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMGPL.g:1051:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMGPL.g:1052:2: iv_ruleBlock= ruleBlock EOF
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
    // InternalMGPL.g:1058:1: ruleBlock returns [EObject current=null] : (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_AnimBlock_0 = null;

        EObject this_EventBlock_1 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1064:2: ( (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) )
            // InternalMGPL.g:1065:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            {
            // InternalMGPL.g:1065:2: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMGPL.g:1066:3: this_AnimBlock_0= ruleAnimBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnimBlock_0=ruleAnimBlock();

                    state._fsp--;


                    			current = this_AnimBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1075:3: this_EventBlock_1= ruleEventBlock
                    {

                    			newCompositeNode(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventBlock_1=ruleEventBlock();

                    state._fsp--;


                    			current = this_EventBlock_1;
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // InternalMGPL.g:1087:1: entryRuleAnimBlock returns [EObject current=null] : iv_ruleAnimBlock= ruleAnimBlock EOF ;
    public final EObject entryRuleAnimBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimBlock = null;


        try {
            // InternalMGPL.g:1087:50: (iv_ruleAnimBlock= ruleAnimBlock EOF )
            // InternalMGPL.g:1088:2: iv_ruleAnimBlock= ruleAnimBlock EOF
            {
             newCompositeNode(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimBlock=ruleAnimBlock();

            state._fsp--;

             current =iv_ruleAnimBlock; 
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
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // InternalMGPL.g:1094:1: ruleAnimBlock returns [EObject current=null] : (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleAnimBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_objType_3_0=null;
        Token lv_objName_4_0=null;
        Token otherlv_5=null;
        EObject lv_stmtBlock_6_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1100:2: ( (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:1101:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:1101:2: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:1102:3: otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_objType_3_0= RULE_OBJTYPE ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmtBlock_6_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnimBlockAccess().getAnimationKeyword_0());
            		
            // InternalMGPL.g:1106:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMGPL.g:1107:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMGPL.g:1107:4: (lv_name_1_0= RULE_ID )
            // InternalMGPL.g:1108:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMGPL.g:1128:3: ( (lv_objType_3_0= RULE_OBJTYPE ) )
            // InternalMGPL.g:1129:4: (lv_objType_3_0= RULE_OBJTYPE )
            {
            // InternalMGPL.g:1129:4: (lv_objType_3_0= RULE_OBJTYPE )
            // InternalMGPL.g:1130:5: lv_objType_3_0= RULE_OBJTYPE
            {
            lv_objType_3_0=(Token)match(input,RULE_OBJTYPE,FOLLOW_3); 

            					newLeafNode(lv_objType_3_0, grammarAccess.getAnimBlockAccess().getObjTypeOBJTYPETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objType",
            						lv_objType_3_0,
            						"org.xtext.example.mydsl.MGPL.OBJTYPE");
            				

            }


            }

            // InternalMGPL.g:1146:3: ( (lv_objName_4_0= RULE_ID ) )
            // InternalMGPL.g:1147:4: (lv_objName_4_0= RULE_ID )
            {
            // InternalMGPL.g:1147:4: (lv_objName_4_0= RULE_ID )
            // InternalMGPL.g:1148:5: lv_objName_4_0= RULE_ID
            {
            lv_objName_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_objName_4_0, grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnimBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5());
            		
            // InternalMGPL.g:1168:3: ( (lv_stmtBlock_6_0= ruleStmtBlock ) )
            // InternalMGPL.g:1169:4: (lv_stmtBlock_6_0= ruleStmtBlock )
            {
            // InternalMGPL.g:1169:4: (lv_stmtBlock_6_0= ruleStmtBlock )
            // InternalMGPL.g:1170:5: lv_stmtBlock_6_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getAnimBlockAccess().getStmtBlockStmtBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_6_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnimBlockRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_6_0,
            						"org.xtext.example.mydsl.MGPL.StmtBlock");
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
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleEventBlock"
    // InternalMGPL.g:1191:1: entryRuleEventBlock returns [EObject current=null] : iv_ruleEventBlock= ruleEventBlock EOF ;
    public final EObject entryRuleEventBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBlock = null;


        try {
            // InternalMGPL.g:1191:51: (iv_ruleEventBlock= ruleEventBlock EOF )
            // InternalMGPL.g:1192:2: iv_ruleEventBlock= ruleEventBlock EOF
            {
             newCompositeNode(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventBlock=ruleEventBlock();

            state._fsp--;

             current =iv_ruleEventBlock; 
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
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // InternalMGPL.g:1198:1: ruleEventBlock returns [EObject current=null] : (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) ) ;
    public final EObject ruleEventBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        EObject lv_stmtBlock_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1204:2: ( (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) ) )
            // InternalMGPL.g:1205:2: (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) )
            {
            // InternalMGPL.g:1205:2: (otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) ) )
            // InternalMGPL.g:1206:3: otherlv_0= 'on' ( (lv_key_1_0= RULE_KEYSTROKE ) ) ( (lv_stmtBlock_2_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getEventBlockAccess().getOnKeyword_0());
            		
            // InternalMGPL.g:1210:3: ( (lv_key_1_0= RULE_KEYSTROKE ) )
            // InternalMGPL.g:1211:4: (lv_key_1_0= RULE_KEYSTROKE )
            {
            // InternalMGPL.g:1211:4: (lv_key_1_0= RULE_KEYSTROKE )
            // InternalMGPL.g:1212:5: lv_key_1_0= RULE_KEYSTROKE
            {
            lv_key_1_0=(Token)match(input,RULE_KEYSTROKE,FOLLOW_7); 

            					newLeafNode(lv_key_1_0, grammarAccess.getEventBlockAccess().getKeyKEYSTROKETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.xtext.example.mydsl.MGPL.KEYSTROKE");
            				

            }


            }

            // InternalMGPL.g:1228:3: ( (lv_stmtBlock_2_0= ruleStmtBlock ) )
            // InternalMGPL.g:1229:4: (lv_stmtBlock_2_0= ruleStmtBlock )
            {
            // InternalMGPL.g:1229:4: (lv_stmtBlock_2_0= ruleStmtBlock )
            // InternalMGPL.g:1230:5: lv_stmtBlock_2_0= ruleStmtBlock
            {

            					newCompositeNode(grammarAccess.getEventBlockAccess().getStmtBlockStmtBlockParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_stmtBlock_2_0=ruleStmtBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventBlockRule());
            					}
            					set(
            						current,
            						"stmtBlock",
            						lv_stmtBlock_2_0,
            						"org.xtext.example.mydsl.MGPL.StmtBlock");
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
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleVar"
    // InternalMGPL.g:1251:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMGPL.g:1251:44: (iv_ruleVar= ruleVar EOF )
            // InternalMGPL.g:1252:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMGPL.g:1258:1: ruleVar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_varArray_1_0 = null;

        EObject lv_varProp_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1264:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? ) )
            // InternalMGPL.g:1265:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? )
            {
            // InternalMGPL.g:1265:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )? )
            // InternalMGPL.g:1266:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_varArray_1_0= ruleVarArray ) )? ( (lv_varProp_2_0= ruleVarProp ) )?
            {
            // InternalMGPL.g:1266:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMGPL.g:1267:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMGPL.g:1267:4: (lv_name_0_0= RULE_ID )
            // InternalMGPL.g:1268:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMGPL.g:1284:3: ( (lv_varArray_1_0= ruleVarArray ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMGPL.g:1285:4: (lv_varArray_1_0= ruleVarArray )
                    {
                    // InternalMGPL.g:1285:4: (lv_varArray_1_0= ruleVarArray )
                    // InternalMGPL.g:1286:5: lv_varArray_1_0= ruleVarArray
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getVarArrayVarArrayParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_varArray_1_0=ruleVarArray();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"varArray",
                    						lv_varArray_1_0,
                    						"org.xtext.example.mydsl.MGPL.VarArray");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMGPL.g:1303:3: ( (lv_varProp_2_0= ruleVarProp ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMGPL.g:1304:4: (lv_varProp_2_0= ruleVarProp )
                    {
                    // InternalMGPL.g:1304:4: (lv_varProp_2_0= ruleVarProp )
                    // InternalMGPL.g:1305:5: lv_varProp_2_0= ruleVarProp
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getVarPropVarPropParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_varProp_2_0=ruleVarProp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"varProp",
                    						lv_varProp_2_0,
                    						"org.xtext.example.mydsl.MGPL.VarProp");
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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleVarArray"
    // InternalMGPL.g:1326:1: entryRuleVarArray returns [EObject current=null] : iv_ruleVarArray= ruleVarArray EOF ;
    public final EObject entryRuleVarArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarArray = null;


        try {
            // InternalMGPL.g:1326:49: (iv_ruleVarArray= ruleVarArray EOF )
            // InternalMGPL.g:1327:2: iv_ruleVarArray= ruleVarArray EOF
            {
             newCompositeNode(grammarAccess.getVarArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarArray=ruleVarArray();

            state._fsp--;

             current =iv_ruleVarArray; 
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
    // $ANTLR end "entryRuleVarArray"


    // $ANTLR start "ruleVarArray"
    // InternalMGPL.g:1333:1: ruleVarArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' ) ;
    public final EObject ruleVarArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_indexExpr_1_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1339:2: ( (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' ) )
            // InternalMGPL.g:1340:2: (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' )
            {
            // InternalMGPL.g:1340:2: (otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']' )
            // InternalMGPL.g:1341:3: otherlv_0= '[' ( (lv_indexExpr_1_0= ruleExpr ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getVarArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMGPL.g:1345:3: ( (lv_indexExpr_1_0= ruleExpr ) )
            // InternalMGPL.g:1346:4: (lv_indexExpr_1_0= ruleExpr )
            {
            // InternalMGPL.g:1346:4: (lv_indexExpr_1_0= ruleExpr )
            // InternalMGPL.g:1347:5: lv_indexExpr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getVarArrayAccess().getIndexExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_indexExpr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarArrayRule());
            					}
            					set(
            						current,
            						"indexExpr",
            						lv_indexExpr_1_0,
            						"org.xtext.example.mydsl.MGPL.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVarArrayAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleVarArray"


    // $ANTLR start "entryRuleVarProp"
    // InternalMGPL.g:1372:1: entryRuleVarProp returns [EObject current=null] : iv_ruleVarProp= ruleVarProp EOF ;
    public final EObject entryRuleVarProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarProp = null;


        try {
            // InternalMGPL.g:1372:48: (iv_ruleVarProp= ruleVarProp EOF )
            // InternalMGPL.g:1373:2: iv_ruleVarProp= ruleVarProp EOF
            {
             newCompositeNode(grammarAccess.getVarPropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarProp=ruleVarProp();

            state._fsp--;

             current =iv_ruleVarProp; 
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
    // $ANTLR end "entryRuleVarProp"


    // $ANTLR start "ruleVarProp"
    // InternalMGPL.g:1379:1: ruleVarProp returns [EObject current=null] : (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVarProp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_extId_1_0=null;


        	enterRule();

        try {
            // InternalMGPL.g:1385:2: ( (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) ) )
            // InternalMGPL.g:1386:2: (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) )
            {
            // InternalMGPL.g:1386:2: (otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) ) )
            // InternalMGPL.g:1387:3: otherlv_0= '.' ( (lv_extId_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarPropAccess().getFullStopKeyword_0());
            		
            // InternalMGPL.g:1391:3: ( (lv_extId_1_0= RULE_ID ) )
            // InternalMGPL.g:1392:4: (lv_extId_1_0= RULE_ID )
            {
            // InternalMGPL.g:1392:4: (lv_extId_1_0= RULE_ID )
            // InternalMGPL.g:1393:5: lv_extId_1_0= RULE_ID
            {
            lv_extId_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_extId_1_0, grammarAccess.getVarPropAccess().getExtIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarPropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"extId",
            						lv_extId_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVarProp"


    // $ANTLR start "entryRuleExpr"
    // InternalMGPL.g:1413:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMGPL.g:1413:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMGPL.g:1414:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalMGPL.g:1420:1: ruleExpr returns [EObject current=null] : this_OrExpr_0= ruleOrExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpr_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1426:2: (this_OrExpr_0= ruleOrExpr )
            // InternalMGPL.g:1427:2: this_OrExpr_0= ruleOrExpr
            {

            		newCompositeNode(grammarAccess.getExprAccess().getOrExprParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;


            		current = this_OrExpr_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalMGPL.g:1438:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalMGPL.g:1438:47: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalMGPL.g:1439:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalMGPL.g:1445:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1451:2: ( (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalMGPL.g:1452:2: (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalMGPL.g:1452:2: (this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalMGPL.g:1453:3: this_AndExpr_0= ruleAndExpr ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;


            			current = this_AndExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1461:3: ( () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMGPL.g:1462:4: () ( (lv_op_2_0= RULE_OR ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalMGPL.g:1462:4: ()
            	    // InternalMGPL.g:1463:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGPL.g:1469:4: ( (lv_op_2_0= RULE_OR ) )
            	    // InternalMGPL.g:1470:5: (lv_op_2_0= RULE_OR )
            	    {
            	    // InternalMGPL.g:1470:5: (lv_op_2_0= RULE_OR )
            	    // InternalMGPL.g:1471:6: lv_op_2_0= RULE_OR
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_OR,FOLLOW_14); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getOrExprAccess().getOpORTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrExprRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.xtext.example.mydsl.MGPL.OR");
            	    					

            	    }


            	    }

            	    // InternalMGPL.g:1487:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalMGPL.g:1488:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalMGPL.g:1488:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalMGPL.g:1489:6: lv_right_3_0= ruleAndExpr
            	    {

            	    						newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MGPL.AndExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalMGPL.g:1511:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalMGPL.g:1511:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalMGPL.g:1512:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalMGPL.g:1518:1: ruleAndExpr returns [EObject current=null] : (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1524:2: ( (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* ) )
            // InternalMGPL.g:1525:2: (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* )
            {
            // InternalMGPL.g:1525:2: (this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) ) )* )
            // InternalMGPL.g:1526:3: this_RelExpr_0= ruleRelExpr ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExprAccess().getRelExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_RelExpr_0=ruleRelExpr();

            state._fsp--;


            			current = this_RelExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1534:3: ( () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMGPL.g:1535:4: () ( (lv_op_2_0= RULE_AND ) ) ( (lv_right_3_0= ruleRelExpr ) )
            	    {
            	    // InternalMGPL.g:1535:4: ()
            	    // InternalMGPL.g:1536:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGPL.g:1542:4: ( (lv_op_2_0= RULE_AND ) )
            	    // InternalMGPL.g:1543:5: (lv_op_2_0= RULE_AND )
            	    {
            	    // InternalMGPL.g:1543:5: (lv_op_2_0= RULE_AND )
            	    // InternalMGPL.g:1544:6: lv_op_2_0= RULE_AND
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_AND,FOLLOW_14); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpANDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExprRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.xtext.example.mydsl.MGPL.AND");
            	    					

            	    }


            	    }

            	    // InternalMGPL.g:1560:4: ( (lv_right_3_0= ruleRelExpr ) )
            	    // InternalMGPL.g:1561:5: (lv_right_3_0= ruleRelExpr )
            	    {
            	    // InternalMGPL.g:1561:5: (lv_right_3_0= ruleRelExpr )
            	    // InternalMGPL.g:1562:6: lv_right_3_0= ruleRelExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAndExprAccess().getRightRelExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleRelExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MGPL.RelExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleRelExpr"
    // InternalMGPL.g:1584:1: entryRuleRelExpr returns [EObject current=null] : iv_ruleRelExpr= ruleRelExpr EOF ;
    public final EObject entryRuleRelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelExpr = null;


        try {
            // InternalMGPL.g:1584:48: (iv_ruleRelExpr= ruleRelExpr EOF )
            // InternalMGPL.g:1585:2: iv_ruleRelExpr= ruleRelExpr EOF
            {
             newCompositeNode(grammarAccess.getRelExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelExpr=ruleRelExpr();

            state._fsp--;

             current =iv_ruleRelExpr; 
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
    // $ANTLR end "entryRuleRelExpr"


    // $ANTLR start "ruleRelExpr"
    // InternalMGPL.g:1591:1: ruleRelExpr returns [EObject current=null] : (this_AddExpr_0= ruleAddExpr ( () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) ;
    public final EObject ruleRelExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AddExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1597:2: ( (this_AddExpr_0= ruleAddExpr ( () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* ) )
            // InternalMGPL.g:1598:2: (this_AddExpr_0= ruleAddExpr ( () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            {
            // InternalMGPL.g:1598:2: (this_AddExpr_0= ruleAddExpr ( () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) ) )* )
            // InternalMGPL.g:1599:3: this_AddExpr_0= ruleAddExpr ( () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_AddExpr_0=ruleAddExpr();

            state._fsp--;


            			current = this_AddExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1607:3: ( () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_REL_OP) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMGPL.g:1608:4: () ( (lv_op_2_0= RULE_REL_OP ) ) ( (lv_right_3_0= ruleAddExpr ) )
            	    {
            	    // InternalMGPL.g:1608:4: ()
            	    // InternalMGPL.g:1609:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getRelExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGPL.g:1615:4: ( (lv_op_2_0= RULE_REL_OP ) )
            	    // InternalMGPL.g:1616:5: (lv_op_2_0= RULE_REL_OP )
            	    {
            	    // InternalMGPL.g:1616:5: (lv_op_2_0= RULE_REL_OP )
            	    // InternalMGPL.g:1617:6: lv_op_2_0= RULE_REL_OP
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_REL_OP,FOLLOW_14); 

            	    						newLeafNode(lv_op_2_0, grammarAccess.getRelExprAccess().getOpREL_OPTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRelExprRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"org.xtext.example.mydsl.MGPL.REL_OP");
            	    					

            	    }


            	    }

            	    // InternalMGPL.g:1633:4: ( (lv_right_3_0= ruleAddExpr ) )
            	    // InternalMGPL.g:1634:5: (lv_right_3_0= ruleAddExpr )
            	    {
            	    // InternalMGPL.g:1634:5: (lv_right_3_0= ruleAddExpr )
            	    // InternalMGPL.g:1635:6: lv_right_3_0= ruleAddExpr
            	    {

            	    						newCompositeNode(grammarAccess.getRelExprAccess().getRightAddExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleAddExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MGPL.AddExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleRelExpr"


    // $ANTLR start "entryRuleAddExpr"
    // InternalMGPL.g:1657:1: entryRuleAddExpr returns [EObject current=null] : iv_ruleAddExpr= ruleAddExpr EOF ;
    public final EObject entryRuleAddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpr = null;


        try {
            // InternalMGPL.g:1657:48: (iv_ruleAddExpr= ruleAddExpr EOF )
            // InternalMGPL.g:1658:2: iv_ruleAddExpr= ruleAddExpr EOF
            {
             newCompositeNode(grammarAccess.getAddExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpr=ruleAddExpr();

            state._fsp--;

             current =iv_ruleAddExpr; 
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
    // $ANTLR end "entryRuleAddExpr"


    // $ANTLR start "ruleAddExpr"
    // InternalMGPL.g:1664:1: ruleAddExpr returns [EObject current=null] : (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* ) ;
    public final EObject ruleAddExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1670:2: ( (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* ) )
            // InternalMGPL.g:1671:2: (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* )
            {
            // InternalMGPL.g:1671:2: (this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )* )
            // InternalMGPL.g:1672:3: this_MultExpr_0= ruleMultExpr ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddExprAccess().getMultExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_MultExpr_0=ruleMultExpr();

            state._fsp--;


            			current = this_MultExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMGPL.g:1680:3: ( () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_PLUS && LA20_0<=RULE_MINUS)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMGPL.g:1681:4: () ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) ) ( (lv_right_3_0= ruleMultExpr ) )
            	    {
            	    // InternalMGPL.g:1681:4: ()
            	    // InternalMGPL.g:1682:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGPL.g:1688:4: ( ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) ) )
            	    // InternalMGPL.g:1689:5: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) )
            	    {
            	    // InternalMGPL.g:1689:5: ( (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS ) )
            	    // InternalMGPL.g:1690:6: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS )
            	    {
            	    // InternalMGPL.g:1690:6: (lv_op_2_1= RULE_PLUS | lv_op_2_2= RULE_MINUS )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_PLUS) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==RULE_MINUS) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalMGPL.g:1691:7: lv_op_2_1= RULE_PLUS
            	            {
            	            lv_op_2_1=(Token)match(input,RULE_PLUS,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getAddExprAccess().getOpPLUSTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAddExprRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_1,
            	            								"org.xtext.example.mydsl.MGPL.PLUS");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1706:7: lv_op_2_2= RULE_MINUS
            	            {
            	            lv_op_2_2=(Token)match(input,RULE_MINUS,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getAddExprAccess().getOpMINUSTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAddExprRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_2_2,
            	            								"org.xtext.example.mydsl.MGPL.MINUS");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMGPL.g:1723:4: ( (lv_right_3_0= ruleMultExpr ) )
            	    // InternalMGPL.g:1724:5: (lv_right_3_0= ruleMultExpr )
            	    {
            	    // InternalMGPL.g:1724:5: (lv_right_3_0= ruleMultExpr )
            	    // InternalMGPL.g:1725:6: lv_right_3_0= ruleMultExpr
            	    {

            	    						newCompositeNode(grammarAccess.getAddExprAccess().getRightMultExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleMultExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExprRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MGPL.MultExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleAddExpr"


    // $ANTLR start "entryRuleMultExpr"
    // InternalMGPL.g:1747:1: entryRuleMultExpr returns [EObject current=null] : iv_ruleMultExpr= ruleMultExpr EOF ;
    public final EObject entryRuleMultExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpr = null;


        try {
            // InternalMGPL.g:1747:49: (iv_ruleMultExpr= ruleMultExpr EOF )
            // InternalMGPL.g:1748:2: iv_ruleMultExpr= ruleMultExpr EOF
            {
             newCompositeNode(grammarAccess.getMultExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultExpr=ruleMultExpr();

            state._fsp--;

             current =iv_ruleMultExpr; 
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
    // $ANTLR end "entryRuleMultExpr"


    // $ANTLR start "ruleMultExpr"
    // InternalMGPL.g:1754:1: ruleMultExpr returns [EObject current=null] : ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* ) ;
    public final EObject ruleMultExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_1=null;
        Token lv_op_3_2=null;
        EObject this_UnaryExpr_0 = null;

        EObject this_Atom_1 = null;

        EObject lv_right_4_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1760:2: ( ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* ) )
            // InternalMGPL.g:1761:2: ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* )
            {
            // InternalMGPL.g:1761:2: ( (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )* )
            // InternalMGPL.g:1762:3: (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom ) ( () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )*
            {
            // InternalMGPL.g:1762:3: (this_UnaryExpr_0= ruleUnaryExpr | this_Atom_1= ruleAtom )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_MINUS||LA21_0==RULE_NOT) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==22) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMGPL.g:1763:4: this_UnaryExpr_0= ruleUnaryExpr
                    {

                    				newCompositeNode(grammarAccess.getMultExprAccess().getUnaryExprParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_28);
                    this_UnaryExpr_0=ruleUnaryExpr();

                    state._fsp--;


                    				current = this_UnaryExpr_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1772:4: this_Atom_1= ruleAtom
                    {

                    				newCompositeNode(grammarAccess.getMultExprAccess().getAtomParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_28);
                    this_Atom_1=ruleAtom();

                    state._fsp--;


                    				current = this_Atom_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalMGPL.g:1781:3: ( () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_MULT && LA24_0<=RULE_DIV)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMGPL.g:1782:4: () ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) ) ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) )
            	    {
            	    // InternalMGPL.g:1782:4: ()
            	    // InternalMGPL.g:1783:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultExprAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMGPL.g:1789:4: ( ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) ) )
            	    // InternalMGPL.g:1790:5: ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) )
            	    {
            	    // InternalMGPL.g:1790:5: ( (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV ) )
            	    // InternalMGPL.g:1791:6: (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV )
            	    {
            	    // InternalMGPL.g:1791:6: (lv_op_3_1= RULE_MULT | lv_op_3_2= RULE_DIV )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_MULT) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==RULE_DIV) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalMGPL.g:1792:7: lv_op_3_1= RULE_MULT
            	            {
            	            lv_op_3_1=(Token)match(input,RULE_MULT,FOLLOW_14); 

            	            							newLeafNode(lv_op_3_1, grammarAccess.getMultExprAccess().getOpMULTTerminalRuleCall_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultExprRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_3_1,
            	            								"org.xtext.example.mydsl.MGPL.MULT");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1807:7: lv_op_3_2= RULE_DIV
            	            {
            	            lv_op_3_2=(Token)match(input,RULE_DIV,FOLLOW_14); 

            	            							newLeafNode(lv_op_3_2, grammarAccess.getMultExprAccess().getOpDIVTerminalRuleCall_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultExprRule());
            	            							}
            	            							setWithLastConsumed(
            	            								current,
            	            								"op",
            	            								lv_op_3_2,
            	            								"org.xtext.example.mydsl.MGPL.DIV");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMGPL.g:1824:4: ( ( (lv_right_4_0= ruleUnaryExpr ) ) | ( (lv_right_5_0= ruleAtom ) ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==RULE_MINUS||LA23_0==RULE_NOT) ) {
            	        alt23=1;
            	    }
            	    else if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==22) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalMGPL.g:1825:5: ( (lv_right_4_0= ruleUnaryExpr ) )
            	            {
            	            // InternalMGPL.g:1825:5: ( (lv_right_4_0= ruleUnaryExpr ) )
            	            // InternalMGPL.g:1826:6: (lv_right_4_0= ruleUnaryExpr )
            	            {
            	            // InternalMGPL.g:1826:6: (lv_right_4_0= ruleUnaryExpr )
            	            // InternalMGPL.g:1827:7: lv_right_4_0= ruleUnaryExpr
            	            {

            	            							newCompositeNode(grammarAccess.getMultExprAccess().getRightUnaryExprParserRuleCall_1_2_0_0());
            	            						
            	            pushFollow(FOLLOW_28);
            	            lv_right_4_0=ruleUnaryExpr();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMultExprRule());
            	            							}
            	            							set(
            	            								current,
            	            								"right",
            	            								lv_right_4_0,
            	            								"org.xtext.example.mydsl.MGPL.UnaryExpr");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMGPL.g:1845:5: ( (lv_right_5_0= ruleAtom ) )
            	            {
            	            // InternalMGPL.g:1845:5: ( (lv_right_5_0= ruleAtom ) )
            	            // InternalMGPL.g:1846:6: (lv_right_5_0= ruleAtom )
            	            {
            	            // InternalMGPL.g:1846:6: (lv_right_5_0= ruleAtom )
            	            // InternalMGPL.g:1847:7: lv_right_5_0= ruleAtom
            	            {

            	            							newCompositeNode(grammarAccess.getMultExprAccess().getRightAtomParserRuleCall_1_2_1_0());
            	            						
            	            pushFollow(FOLLOW_28);
            	            lv_right_5_0=ruleAtom();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMultExprRule());
            	            							}
            	            							set(
            	            								current,
            	            								"right",
            	            								lv_right_5_0,
            	            								"org.xtext.example.mydsl.MGPL.Atom");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleMultExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMGPL.g:1870:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalMGPL.g:1870:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMGPL.g:1871:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalMGPL.g:1877:1: ruleUnaryExpr returns [EObject current=null] : ( () ( ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) ) ) ( (lv_right_2_0= ruleAtom ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1883:2: ( ( () ( ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) ) ) ( (lv_right_2_0= ruleAtom ) ) ) )
            // InternalMGPL.g:1884:2: ( () ( ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) ) ) ( (lv_right_2_0= ruleAtom ) ) )
            {
            // InternalMGPL.g:1884:2: ( () ( ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) ) ) ( (lv_right_2_0= ruleAtom ) ) )
            // InternalMGPL.g:1885:3: () ( ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) ) ) ( (lv_right_2_0= ruleAtom ) )
            {
            // InternalMGPL.g:1885:3: ()
            // InternalMGPL.g:1886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUnaryExprAccess().getUnaryOperationAction_0(),
            					current);
            			

            }

            // InternalMGPL.g:1892:3: ( ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) ) )
            // InternalMGPL.g:1893:4: ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) )
            {
            // InternalMGPL.g:1893:4: ( (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS ) )
            // InternalMGPL.g:1894:5: (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS )
            {
            // InternalMGPL.g:1894:5: (lv_op_1_1= RULE_NOT | lv_op_1_2= RULE_MINUS )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_NOT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_MINUS) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMGPL.g:1895:6: lv_op_1_1= RULE_NOT
                    {
                    lv_op_1_1=(Token)match(input,RULE_NOT,FOLLOW_14); 

                    						newLeafNode(lv_op_1_1, grammarAccess.getUnaryExprAccess().getOpNOTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"op",
                    							lv_op_1_1,
                    							"org.xtext.example.mydsl.MGPL.NOT");
                    					

                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1910:6: lv_op_1_2= RULE_MINUS
                    {
                    lv_op_1_2=(Token)match(input,RULE_MINUS,FOLLOW_14); 

                    						newLeafNode(lv_op_1_2, grammarAccess.getUnaryExprAccess().getOpMINUSTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUnaryExprRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"op",
                    							lv_op_1_2,
                    							"org.xtext.example.mydsl.MGPL.MINUS");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMGPL.g:1927:3: ( (lv_right_2_0= ruleAtom ) )
            // InternalMGPL.g:1928:4: (lv_right_2_0= ruleAtom )
            {
            // InternalMGPL.g:1928:4: (lv_right_2_0= ruleAtom )
            // InternalMGPL.g:1929:5: lv_right_2_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getUnaryExprAccess().getRightAtomParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnaryExprRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.mydsl.MGPL.Atom");
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
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleAtom"
    // InternalMGPL.g:1950:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalMGPL.g:1950:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalMGPL.g:1951:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalMGPL.g:1957:1: ruleAtom returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )? ) | ( () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_op_4_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_Var_2 = null;

        EObject lv_right_5_0 = null;

        EObject lv_expr_8_0 = null;



        	enterRule();

        try {
            // InternalMGPL.g:1963:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )? ) | ( () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')' ) ) )
            // InternalMGPL.g:1964:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )? ) | ( () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')' ) )
            {
            // InternalMGPL.g:1964:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )? ) | ( () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                alt27=2;
                }
                break;
            case 22:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMGPL.g:1965:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMGPL.g:1965:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMGPL.g:1966:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMGPL.g:1966:4: ()
                    // InternalMGPL.g:1967:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getIntLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMGPL.g:1973:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMGPL.g:1974:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMGPL.g:1974:5: (lv_value_1_0= RULE_INT )
                    // InternalMGPL.g:1975:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMGPL.g:1993:3: (this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )? )
                    {
                    // InternalMGPL.g:1993:3: (this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )? )
                    // InternalMGPL.g:1994:4: this_Var_2= ruleVar ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )?
                    {

                    				newCompositeNode(grammarAccess.getAtomAccess().getVarParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_29);
                    this_Var_2=ruleVar();

                    state._fsp--;


                    				current = this_Var_2;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMGPL.g:2002:4: ( () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==38) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMGPL.g:2003:5: () ( (lv_op_4_0= 'touches' ) ) ( (lv_right_5_0= ruleVar ) )
                            {
                            // InternalMGPL.g:2003:5: ()
                            // InternalMGPL.g:2004:6: 
                            {

                            						current = forceCreateModelElementAndSet(
                            							grammarAccess.getAtomAccess().getOperationLeftAction_1_1_0(),
                            							current);
                            					

                            }

                            // InternalMGPL.g:2010:5: ( (lv_op_4_0= 'touches' ) )
                            // InternalMGPL.g:2011:6: (lv_op_4_0= 'touches' )
                            {
                            // InternalMGPL.g:2011:6: (lv_op_4_0= 'touches' )
                            // InternalMGPL.g:2012:7: lv_op_4_0= 'touches'
                            {
                            lv_op_4_0=(Token)match(input,38,FOLLOW_3); 

                            							newLeafNode(lv_op_4_0, grammarAccess.getAtomAccess().getOpTouchesKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_4_0, "touches");
                            						

                            }


                            }

                            // InternalMGPL.g:2024:5: ( (lv_right_5_0= ruleVar ) )
                            // InternalMGPL.g:2025:6: (lv_right_5_0= ruleVar )
                            {
                            // InternalMGPL.g:2025:6: (lv_right_5_0= ruleVar )
                            // InternalMGPL.g:2026:7: lv_right_5_0= ruleVar
                            {

                            							newCompositeNode(grammarAccess.getAtomAccess().getRightVarParserRuleCall_1_1_2_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_right_5_0=ruleVar();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAtomRule());
                            							}
                            							set(
                            								current,
                            								"right",
                            								lv_right_5_0,
                            								"org.xtext.example.mydsl.MGPL.Var");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMGPL.g:2046:3: ( () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')' )
                    {
                    // InternalMGPL.g:2046:3: ( () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')' )
                    // InternalMGPL.g:2047:4: () otherlv_7= '(' ( (lv_expr_8_0= ruleExpr ) ) otherlv_9= ')'
                    {
                    // InternalMGPL.g:2047:4: ()
                    // InternalMGPL.g:2048:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getExprVarAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMGPL.g:2058:4: ( (lv_expr_8_0= ruleExpr ) )
                    // InternalMGPL.g:2059:5: (lv_expr_8_0= ruleExpr )
                    {
                    // InternalMGPL.g:2059:5: (lv_expr_8_0= ruleExpr )
                    // InternalMGPL.g:2060:6: lv_expr_8_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getExprExprParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expr_8_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_8_0,
                    							"org.xtext.example.mydsl.MGPL.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleAtom"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000042000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000409030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000580000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000500000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002004000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});

}