// Generated from D:/workspace/com/miles-self/miles-common/miles-common-antlr4/src/main/resources/Mysql.g4 by ANTLR 4.13.1

    package self.miles.common.antlr4.mysql;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MysqlParser}.
 */
public interface MysqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MysqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MysqlParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MysqlParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#sql_stat}.
	 * @param ctx the parse tree
	 */
	void enterSql_stat(MysqlParser.Sql_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#sql_stat}.
	 * @param ctx the parse tree
	 */
	void exitSql_stat(MysqlParser.Sql_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#mysql_crt_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMysql_crt_stmt(MysqlParser.Mysql_crt_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#mysql_crt_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMysql_crt_stmt(MysqlParser.Mysql_crt_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#c_table}.
	 * @param ctx the parse tree
	 */
	void enterC_table(MysqlParser.C_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#c_table}.
	 * @param ctx the parse tree
	 */
	void exitC_table(MysqlParser.C_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#c_column}.
	 * @param ctx the parse tree
	 */
	void enterC_column(MysqlParser.C_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#c_column}.
	 * @param ctx the parse tree
	 */
	void exitC_column(MysqlParser.C_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(MysqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(MysqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(MysqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(MysqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(MysqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(MysqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MysqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MysqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(MysqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(MysqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(MysqlParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(MysqlParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(MysqlParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(MysqlParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#commonStr}.
	 * @param ctx the parse tree
	 */
	void enterCommonStr(MysqlParser.CommonStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#commonStr}.
	 * @param ctx the parse tree
	 */
	void exitCommonStr(MysqlParser.CommonStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(MysqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(MysqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MysqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MysqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(MysqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(MysqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(MysqlParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(MysqlParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MysqlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MysqlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterAsc_desc(MysqlParser.Asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitAsc_desc(MysqlParser.Asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(MysqlParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(MysqlParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_clause(MysqlParser.Update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_clause(MysqlParser.Update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MysqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MysqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MysqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MysqlParser.ExprContext ctx);
}