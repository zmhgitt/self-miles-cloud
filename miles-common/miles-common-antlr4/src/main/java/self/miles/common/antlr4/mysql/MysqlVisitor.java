// Generated from D:/workspace/com/miles-self/miles-common/miles-common-antlr4/src/main/resources/Mysql.g4 by ANTLR 4.13.1

    package self.miles.common.antlr4.mysql;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MysqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MysqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MysqlParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MysqlParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#sql_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stat(MysqlParser.Sql_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#mysql_crt_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysql_crt_stmt(MysqlParser.Mysql_crt_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#c_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_table(MysqlParser.C_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#c_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_column(MysqlParser.C_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(MysqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(MysqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(MysqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MysqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(MysqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(MysqlParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(MysqlParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#commonStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonStr(MysqlParser.CommonStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(MysqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MysqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(MysqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(MysqlParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MysqlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc(MysqlParser.Asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(MysqlParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_clause(MysqlParser.Update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MysqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MysqlParser.ExprContext ctx);
}