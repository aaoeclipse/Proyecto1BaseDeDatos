// Generated from DATABASE.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DATABASEParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DATABASEVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DATABASEParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#ddlQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlQuery(DATABASEParser.DdlQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#createDbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDbStmt(DATABASEParser.CreateDbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#alterDbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDbStmt(DATABASEParser.AlterDbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#dbName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbName(DATABASEParser.DbNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#newDbName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDbName(DATABASEParser.NewDbNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#dropDbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDbStmt(DATABASEParser.DropDbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#showDbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDbStmt(DATABASEParser.ShowDbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#useDbStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDbStmt(DATABASEParser.UseDbStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#createTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStmt(DATABASEParser.CreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DATABASEParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#columnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDecl(DATABASEParser.ColumnDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(DATABASEParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#colName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColName(DATABASEParser.ColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#colConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColConstraint(DATABASEParser.ColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#localids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalids(DATABASEParser.LocalidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#refids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefids(DATABASEParser.RefidsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#chNombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChNombre(DATABASEParser.ChNombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#idTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTabla(DATABASEParser.IdTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#fkNombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFkNombre(DATABASEParser.FkNombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#pkNombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPkNombre(DATABASEParser.PkNombreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameAlter}
	 * labeled alternative in {@link DATABASEParser#alterTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameAlter(DATABASEParser.RenameAlterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accionAlter}
	 * labeled alternative in {@link DATABASEParser#alterTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionAlter(DATABASEParser.AccionAlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#alterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterName(DATABASEParser.AlterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#newName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewName(DATABASEParser.NewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(DATABASEParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DATABASEParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#singleColConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleColConstraint(DATABASEParser.SingleColConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#dropTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableStmt(DATABASEParser.DropTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#showTableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStmt(DATABASEParser.ShowTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#showColumnsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumnsStmt(DATABASEParser.ShowColumnsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DATABASEParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(DATABASEParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DATABASEParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DATABASEParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(DATABASEParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DATABASEParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DATABASEParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(DATABASEParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(DATABASEParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#dmlQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlQuery(DATABASEParser.DmlQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#multiInsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsert(DATABASEParser.MultiInsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(DATABASEParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(DATABASEParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(DATABASEParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(DATABASEParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#updateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmt(DATABASEParser.UpdateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#columnsUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsUpdate(DATABASEParser.ColumnsUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#deleteStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmt(DATABASEParser.DeleteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(DATABASEParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(DATABASEParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#orderExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpr(DATABASEParser.OrderExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DATABASEParser#orderTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderTerm(DATABASEParser.OrderTermContext ctx);
}