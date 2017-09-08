// Generated from VamdcSqlRequest.g4 by ANTLR 4.5.3

package vamdcsqlcomparator;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VamdcSqlRequestParser}.
 */
public interface VamdcSqlRequestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(VamdcSqlRequestParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(VamdcSqlRequestParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(VamdcSqlRequestParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(VamdcSqlRequestParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VamdcSqlRequestParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VamdcSqlRequestParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VamdcSqlRequestParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VamdcSqlRequestParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#compexp}.
	 * @param ctx the parse tree
	 */
	void enterCompexp(VamdcSqlRequestParser.CompexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#compexp}.
	 * @param ctx the parse tree
	 */
	void exitCompexp(VamdcSqlRequestParser.CompexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(VamdcSqlRequestParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(VamdcSqlRequestParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VamdcSqlRequestParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(VamdcSqlRequestParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VamdcSqlRequestParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(VamdcSqlRequestParser.NameContext ctx);
}