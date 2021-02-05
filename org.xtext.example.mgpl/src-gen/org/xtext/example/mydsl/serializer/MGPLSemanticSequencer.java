/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.mGPL.AnimBlock;
import org.xtext.example.mydsl.mGPL.AssStmt;
import org.xtext.example.mydsl.mGPL.AttrAss;
import org.xtext.example.mydsl.mGPL.AttrAssList;
import org.xtext.example.mydsl.mGPL.EventBlock;
import org.xtext.example.mydsl.mGPL.ExprVar;
import org.xtext.example.mydsl.mGPL.ForStmt;
import org.xtext.example.mydsl.mGPL.Game;
import org.xtext.example.mydsl.mGPL.Init;
import org.xtext.example.mydsl.mGPL.IntLiteral;
import org.xtext.example.mydsl.mGPL.MGPLPackage;
import org.xtext.example.mydsl.mGPL.ObjDecl;
import org.xtext.example.mydsl.mGPL.Operation;
import org.xtext.example.mydsl.mGPL.StmtBlock;
import org.xtext.example.mydsl.mGPL.UnaryOperation;
import org.xtext.example.mydsl.mGPL.Var;
import org.xtext.example.mydsl.mGPL.VarArray;
import org.xtext.example.mydsl.mGPL.VarDecl;
import org.xtext.example.mydsl.mGPL.VarProp;
import org.xtext.example.mydsl.services.MGPLGrammarAccess;

@SuppressWarnings("all")
public class MGPLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MGPLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MGPLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MGPLPackage.ANIM_BLOCK:
				sequence_AnimBlock(context, (AnimBlock) semanticObject); 
				return; 
			case MGPLPackage.ASS_STMT:
				sequence_AssStmt(context, (AssStmt) semanticObject); 
				return; 
			case MGPLPackage.ATTR_ASS:
				sequence_AttrAss(context, (AttrAss) semanticObject); 
				return; 
			case MGPLPackage.ATTR_ASS_LIST:
				sequence_AttrAssList(context, (AttrAssList) semanticObject); 
				return; 
			case MGPLPackage.EVENT_BLOCK:
				sequence_EventBlock(context, (EventBlock) semanticObject); 
				return; 
			case MGPLPackage.EXPR_VAR:
				if (rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getRelExprRule()
						|| action == grammarAccess.getRelExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAddExprRule()
						|| action == grammarAccess.getAddExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getMultExprRule()
						|| action == grammarAccess.getMultExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAtomRule()) {
					sequence_Atom(context, (ExprVar) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getStmtRule()
						|| rule == grammarAccess.getIfStmtRule()) {
					sequence_Atom_IfStmt(context, (ExprVar) semanticObject); 
					return; 
				}
				else break;
			case MGPLPackage.FOR_STMT:
				sequence_ForStmt(context, (ForStmt) semanticObject); 
				return; 
			case MGPLPackage.GAME:
				sequence_Game(context, (Game) semanticObject); 
				return; 
			case MGPLPackage.INIT:
				sequence_Init(context, (Init) semanticObject); 
				return; 
			case MGPLPackage.INT_LITERAL:
				if (rule == grammarAccess.getStmtRule()
						|| rule == grammarAccess.getIfStmtRule()) {
					sequence_Atom_IfStmt(context, (IntLiteral) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getRelExprRule()
						|| action == grammarAccess.getRelExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAddExprRule()
						|| action == grammarAccess.getAddExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getMultExprRule()
						|| action == grammarAccess.getMultExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAtomRule()) {
					sequence_Atom(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case MGPLPackage.OBJ_DECL:
				sequence_ObjDecl(context, (ObjDecl) semanticObject); 
				return; 
			case MGPLPackage.OPERATION:
				if (rule == grammarAccess.getStmtRule()
						|| rule == grammarAccess.getIfStmtRule()) {
					sequence_AddExpr_AndExpr_Atom_IfStmt_MultExpr_OrExpr_RelExpr(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getOperationLeftAction_1_0()) {
					sequence_AddExpr_AndExpr_Atom_MultExpr_OrExpr_RelExpr(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getOperationLeftAction_1_0()) {
					sequence_AddExpr_AndExpr_Atom_MultExpr_RelExpr(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAddExprRule()
						|| action == grammarAccess.getAddExprAccess().getOperationLeftAction_1_0()) {
					sequence_AddExpr_Atom_MultExpr(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRelExprRule()
						|| action == grammarAccess.getRelExprAccess().getOperationLeftAction_1_0()) {
					sequence_AddExpr_Atom_MultExpr_RelExpr(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMultExprRule()
						|| action == grammarAccess.getMultExprAccess().getOperationLeftAction_1_0()) {
					sequence_Atom_MultExpr(context, (Operation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAtomRule()) {
					sequence_Atom(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case MGPLPackage.STMT_BLOCK:
				sequence_StmtBlock(context, (StmtBlock) semanticObject); 
				return; 
			case MGPLPackage.UNARY_OPERATION:
				if (rule == grammarAccess.getStmtRule()
						|| rule == grammarAccess.getIfStmtRule()) {
					sequence_IfStmt_UnaryExpr(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getRelExprRule()
						|| action == grammarAccess.getRelExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAddExprRule()
						|| action == grammarAccess.getAddExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getMultExprRule()
						|| action == grammarAccess.getMultExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getUnaryExprRule()) {
					sequence_UnaryExpr(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case MGPLPackage.VAR:
				if (rule == grammarAccess.getStmtRule()
						|| rule == grammarAccess.getIfStmtRule()) {
					sequence_IfStmt_Var(context, (Var) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVarRule()
						|| rule == grammarAccess.getExprRule()
						|| rule == grammarAccess.getOrExprRule()
						|| action == grammarAccess.getOrExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAndExprRule()
						|| action == grammarAccess.getAndExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getRelExprRule()
						|| action == grammarAccess.getRelExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAddExprRule()
						|| action == grammarAccess.getAddExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getMultExprRule()
						|| action == grammarAccess.getMultExprAccess().getOperationLeftAction_1_0()
						|| rule == grammarAccess.getAtomRule()
						|| action == grammarAccess.getAtomAccess().getOperationLeftAction_1_1_0()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case MGPLPackage.VAR_ARRAY:
				sequence_VarArray(context, (VarArray) semanticObject); 
				return; 
			case MGPLPackage.VAR_DECL:
				sequence_VarDecl(context, (VarDecl) semanticObject); 
				return; 
			case MGPLPackage.VAR_PROP:
				sequence_VarProp(context, (VarProp) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Stmt returns Operation
	 *     IfStmt returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             (left=OrExpr_Operation_1_0 op=OR right=AndExpr) | 
	 *             (left=AndExpr_Operation_1_0 op=AND right=RelExpr) | 
	 *             (left=RelExpr_Operation_1_0 op=REL_OP right=AddExpr) | 
	 *             (left=AddExpr_Operation_1_0 (op=PLUS | op=MINUS) right=MultExpr) | 
	 *             (left=MultExpr_Operation_1_0 (op=MULT | op=DIV) (right=UnaryExpr | right=Atom)) | 
	 *             (left=Atom_Operation_1_1_0 op='touches' right=Var)
	 *         ) 
	 *         consequence=StmtBlock 
	 *         alternative=StmtBlock?
	 *     )
	 */
	protected void sequence_AddExpr_AndExpr_Atom_IfStmt_MultExpr_OrExpr_RelExpr(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Operation
	 *     OrExpr returns Operation
	 *     OrExpr.Operation_1_0 returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (left=OrExpr_Operation_1_0 op=OR right=AndExpr) | 
	 *         (left=AndExpr_Operation_1_0 op=AND right=RelExpr) | 
	 *         (left=RelExpr_Operation_1_0 op=REL_OP right=AddExpr) | 
	 *         (left=AddExpr_Operation_1_0 (op=PLUS | op=MINUS) right=MultExpr) | 
	 *         (left=MultExpr_Operation_1_0 (op=MULT | op=DIV) (right=UnaryExpr | right=Atom)) | 
	 *         (left=Atom_Operation_1_1_0 op='touches' right=Var)
	 *     )
	 */
	protected void sequence_AddExpr_AndExpr_Atom_MultExpr_OrExpr_RelExpr(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns Operation
	 *     AndExpr.Operation_1_0 returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (left=AndExpr_Operation_1_0 op=AND right=RelExpr) | 
	 *         (left=RelExpr_Operation_1_0 op=REL_OP right=AddExpr) | 
	 *         (left=AddExpr_Operation_1_0 (op=PLUS | op=MINUS) right=MultExpr) | 
	 *         (left=MultExpr_Operation_1_0 (op=MULT | op=DIV) (right=UnaryExpr | right=Atom)) | 
	 *         (left=Atom_Operation_1_1_0 op='touches' right=Var)
	 *     )
	 */
	protected void sequence_AddExpr_AndExpr_Atom_MultExpr_RelExpr(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AddExpr returns Operation
	 *     AddExpr.Operation_1_0 returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (left=AddExpr_Operation_1_0 (op=PLUS | op=MINUS) right=MultExpr) | 
	 *         (left=MultExpr_Operation_1_0 (op=MULT | op=DIV) (right=UnaryExpr | right=Atom)) | 
	 *         (left=Atom_Operation_1_1_0 op='touches' right=Var)
	 *     )
	 */
	protected void sequence_AddExpr_Atom_MultExpr(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelExpr returns Operation
	 *     RelExpr.Operation_1_0 returns Operation
	 *
	 * Constraint:
	 *     (
	 *         (left=RelExpr_Operation_1_0 op=REL_OP right=AddExpr) | 
	 *         (left=AddExpr_Operation_1_0 (op=PLUS | op=MINUS) right=MultExpr) | 
	 *         (left=MultExpr_Operation_1_0 (op=MULT | op=DIV) (right=UnaryExpr | right=Atom)) | 
	 *         (left=Atom_Operation_1_1_0 op='touches' right=Var)
	 *     )
	 */
	protected void sequence_AddExpr_Atom_MultExpr_RelExpr(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Block returns AnimBlock
	 *     AnimBlock returns AnimBlock
	 *
	 * Constraint:
	 *     (name=ID objType=OBJTYPE objName=ID stmtBlock=StmtBlock)
	 */
	protected void sequence_AnimBlock(ISerializationContext context, AnimBlock semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ANIM_BLOCK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ANIM_BLOCK__NAME));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ANIM_BLOCK__OBJ_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ANIM_BLOCK__OBJ_TYPE));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ANIM_BLOCK__OBJ_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ANIM_BLOCK__OBJ_NAME));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.BLOCK__STMT_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.BLOCK__STMT_BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAnimBlockAccess().getObjTypeOBJTYPETerminalRuleCall_3_0(), semanticObject.getObjType());
		feeder.accept(grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0(), semanticObject.getObjName());
		feeder.accept(grammarAccess.getAnimBlockAccess().getStmtBlockStmtBlockParserRuleCall_6_0(), semanticObject.getStmtBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns AssStmt
	 *     AssStmt returns AssStmt
	 *
	 * Constraint:
	 *     (var=Var assignment=Expr)
	 */
	protected void sequence_AssStmt(ISerializationContext context, AssStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ASS_STMT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ASS_STMT__VAR));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ASS_STMT__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ASS_STMT__ASSIGNMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssStmtAccess().getAssignmentExprParserRuleCall_2_0(), semanticObject.getAssignment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns ExprVar
	 *     OrExpr returns ExprVar
	 *     OrExpr.Operation_1_0 returns ExprVar
	 *     AndExpr returns ExprVar
	 *     AndExpr.Operation_1_0 returns ExprVar
	 *     RelExpr returns ExprVar
	 *     RelExpr.Operation_1_0 returns ExprVar
	 *     AddExpr returns ExprVar
	 *     AddExpr.Operation_1_0 returns ExprVar
	 *     MultExpr returns ExprVar
	 *     MultExpr.Operation_1_0 returns ExprVar
	 *     Atom returns ExprVar
	 *
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Atom(ISerializationContext context, ExprVar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.EXPR_VAR__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.EXPR_VAR__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getExprExprParserRuleCall_2_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns ExprVar
	 *     IfStmt returns ExprVar
	 *
	 * Constraint:
	 *     (expr=Expr consequence=StmtBlock alternative=StmtBlock?)
	 */
	protected void sequence_Atom_IfStmt(ISerializationContext context, ExprVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns IntLiteral
	 *     IfStmt returns IntLiteral
	 *
	 * Constraint:
	 *     (value=INT consequence=StmtBlock alternative=StmtBlock?)
	 */
	protected void sequence_Atom_IfStmt(ISerializationContext context, IntLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns IntLiteral
	 *     OrExpr returns IntLiteral
	 *     OrExpr.Operation_1_0 returns IntLiteral
	 *     AndExpr returns IntLiteral
	 *     AndExpr.Operation_1_0 returns IntLiteral
	 *     RelExpr returns IntLiteral
	 *     RelExpr.Operation_1_0 returns IntLiteral
	 *     AddExpr returns IntLiteral
	 *     AddExpr.Operation_1_0 returns IntLiteral
	 *     MultExpr returns IntLiteral
	 *     MultExpr.Operation_1_0 returns IntLiteral
	 *     Atom returns IntLiteral
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atom(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.INT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MultExpr returns Operation
	 *     MultExpr.Operation_1_0 returns Operation
	 *
	 * Constraint:
	 *     ((left=MultExpr_Operation_1_0 (op=MULT | op=DIV) (right=UnaryExpr | right=Atom)) | (left=Atom_Operation_1_1_0 op='touches' right=Var))
	 */
	protected void sequence_Atom_MultExpr(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Atom returns Operation
	 *
	 * Constraint:
	 *     (left=Atom_Operation_1_1_0 op='touches' right=Var)
	 */
	protected void sequence_Atom(ISerializationContext context, Operation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.OPERATION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.OPERATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.OPERATION__OP));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.OPERATION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getOperationLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAtomAccess().getOpTouchesKeyword_1_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAtomAccess().getRightVarParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AttrAssList returns AttrAssList
	 *
	 * Constraint:
	 *     (attrAss+=AttrAss attrAss+=AttrAss*)
	 */
	protected void sequence_AttrAssList(ISerializationContext context, AttrAssList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AttrAss returns AttrAss
	 *
	 * Constraint:
	 *     (name=ID expr=Expr)
	 */
	protected void sequence_AttrAss(ISerializationContext context, AttrAss semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ATTR_ASS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ATTR_ASS__NAME));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.ATTR_ASS__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.ATTR_ASS__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Block returns EventBlock
	 *     EventBlock returns EventBlock
	 *
	 * Constraint:
	 *     (key=KEYSTROKE stmtBlock=StmtBlock)
	 */
	protected void sequence_EventBlock(ISerializationContext context, EventBlock semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.EVENT_BLOCK__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.EVENT_BLOCK__KEY));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.BLOCK__STMT_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.BLOCK__STMT_BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventBlockAccess().getKeyKEYSTROKETerminalRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEventBlockAccess().getStmtBlockStmtBlockParserRuleCall_2_0(), semanticObject.getStmtBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns ForStmt
	 *     ForStmt returns ForStmt
	 *
	 * Constraint:
	 *     (initStmt=AssStmt endCondition=Expr loopStmt=AssStmt stmtBlock=StmtBlock)
	 */
	protected void sequence_ForStmt(ISerializationContext context, ForStmt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.FOR_STMT__INIT_STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.FOR_STMT__INIT_STMT));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.FOR_STMT__END_CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.FOR_STMT__END_CONDITION));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.FOR_STMT__LOOP_STMT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.FOR_STMT__LOOP_STMT));
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.FOR_STMT__STMT_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.FOR_STMT__STMT_BLOCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForStmtAccess().getInitStmtAssStmtParserRuleCall_2_0(), semanticObject.getInitStmt());
		feeder.accept(grammarAccess.getForStmtAccess().getEndConditionExprParserRuleCall_4_0(), semanticObject.getEndCondition());
		feeder.accept(grammarAccess.getForStmtAccess().getLoopStmtAssStmtParserRuleCall_6_0(), semanticObject.getLoopStmt());
		feeder.accept(grammarAccess.getForStmtAccess().getStmtBlockStmtBlockParserRuleCall_8_0(), semanticObject.getStmtBlock());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Game returns Game
	 *
	 * Constraint:
	 *     (name=ID attrAssList=AttrAssList? decl+=Decl* initBlock=StmtBlock functions+=Block*)
	 */
	protected void sequence_Game(ISerializationContext context, Game semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns UnaryOperation
	 *     IfStmt returns UnaryOperation
	 *
	 * Constraint:
	 *     ((op=NOT | op=MINUS) right=Atom consequence=StmtBlock alternative=StmtBlock?)
	 */
	protected void sequence_IfStmt_UnaryExpr(ISerializationContext context, UnaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Stmt returns Var
	 *     IfStmt returns Var
	 *
	 * Constraint:
	 *     (name=ID varArray=VarArray? varProp=VarProp? consequence=StmtBlock alternative=StmtBlock?)
	 */
	protected void sequence_IfStmt_Var(ISerializationContext context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Init returns Init
	 *
	 * Constraint:
	 *     expr=Expr
	 */
	protected void sequence_Init(ISerializationContext context, Init semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.INIT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.INIT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns ObjDecl
	 *     ObjDecl returns ObjDecl
	 *
	 * Constraint:
	 *     ((type=OBJTYPE name=ID attrAssList=AttrAssList?) | (type=OBJTYPE name=ID arrSize=INT))
	 */
	protected void sequence_ObjDecl(ISerializationContext context, ObjDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StmtBlock returns StmtBlock
	 *
	 * Constraint:
	 *     statments+=Stmt+
	 */
	protected void sequence_StmtBlock(ISerializationContext context, StmtBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns UnaryOperation
	 *     OrExpr returns UnaryOperation
	 *     OrExpr.Operation_1_0 returns UnaryOperation
	 *     AndExpr returns UnaryOperation
	 *     AndExpr.Operation_1_0 returns UnaryOperation
	 *     RelExpr returns UnaryOperation
	 *     RelExpr.Operation_1_0 returns UnaryOperation
	 *     AddExpr returns UnaryOperation
	 *     AddExpr.Operation_1_0 returns UnaryOperation
	 *     MultExpr returns UnaryOperation
	 *     MultExpr.Operation_1_0 returns UnaryOperation
	 *     UnaryExpr returns UnaryOperation
	 *
	 * Constraint:
	 *     ((op=NOT | op=MINUS) right=Atom)
	 */
	protected void sequence_UnaryExpr(ISerializationContext context, UnaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarArray returns VarArray
	 *
	 * Constraint:
	 *     indexExpr=Expr
	 */
	protected void sequence_VarArray(ISerializationContext context, VarArray semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.VAR_ARRAY__INDEX_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.VAR_ARRAY__INDEX_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarArrayAccess().getIndexExprExprParserRuleCall_1_0(), semanticObject.getIndexExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Decl returns VarDecl
	 *     VarDecl returns VarDecl
	 *
	 * Constraint:
	 *     ((type='int' name=ID value=Init?) | (type='int' name=ID arrSize=INT))
	 */
	protected void sequence_VarDecl(ISerializationContext context, VarDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VarProp returns VarProp
	 *
	 * Constraint:
	 *     extId=ID
	 */
	protected void sequence_VarProp(ISerializationContext context, VarProp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MGPLPackage.Literals.VAR_PROP__EXT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MGPLPackage.Literals.VAR_PROP__EXT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarPropAccess().getExtIdIDTerminalRuleCall_1_0(), semanticObject.getExtId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *     Expr returns Var
	 *     OrExpr returns Var
	 *     OrExpr.Operation_1_0 returns Var
	 *     AndExpr returns Var
	 *     AndExpr.Operation_1_0 returns Var
	 *     RelExpr returns Var
	 *     RelExpr.Operation_1_0 returns Var
	 *     AddExpr returns Var
	 *     AddExpr.Operation_1_0 returns Var
	 *     MultExpr returns Var
	 *     MultExpr.Operation_1_0 returns Var
	 *     Atom returns Var
	 *     Atom.Operation_1_1_0 returns Var
	 *
	 * Constraint:
	 *     (name=ID varArray=VarArray? varProp=VarProp?)
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}