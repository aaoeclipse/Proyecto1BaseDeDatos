package ANTLR1;
// Generated from DATABASE.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DATABASEParser}.
 */
public interface DATABASEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DATABASEParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DATABASEParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#ddlQuery}.
	 * @param ctx the parse tree
	 */
	void enterDdlQuery(DATABASEParser.DdlQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#ddlQuery}.
	 * @param ctx the parse tree
	 */
	void exitDdlQuery(DATABASEParser.DdlQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#createDbStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDbStmt(DATABASEParser.CreateDbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#createDbStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDbStmt(DATABASEParser.CreateDbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#alterDbStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterDbStmt(DATABASEParser.AlterDbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#alterDbStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterDbStmt(DATABASEParser.AlterDbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#dbName}.
	 * @param ctx the parse tree
	 */
	void enterDbName(DATABASEParser.DbNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#dbName}.
	 * @param ctx the parse tree
	 */
	void exitDbName(DATABASEParser.DbNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#newDbName}.
	 * @param ctx the parse tree
	 */
	void enterNewDbName(DATABASEParser.NewDbNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#newDbName}.
	 * @param ctx the parse tree
	 */
	void exitNewDbName(DATABASEParser.NewDbNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#dropDbStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropDbStmt(DATABASEParser.DropDbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#dropDbStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropDbStmt(DATABASEParser.DropDbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#showDbStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowDbStmt(DATABASEParser.ShowDbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#showDbStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowDbStmt(DATABASEParser.ShowDbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#useDbStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseDbStmt(DATABASEParser.UseDbStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#useDbStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseDbStmt(DATABASEParser.UseDbStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#createTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStmt(DATABASEParser.CreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#createTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStmt(DATABASEParser.CreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DATABASEParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DATABASEParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#columnDecl}.
	 * @param ctx the parse tree
	 */
	void enterColumnDecl(DATABASEParser.ColumnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#columnDecl}.
	 * @param ctx the parse tree
	 */
	void exitColumnDecl(DATABASEParser.ColumnDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(DATABASEParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(DATABASEParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#colName}.
	 * @param ctx the parse tree
	 */
	void enterColName(DATABASEParser.ColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#colName}.
	 * @param ctx the parse tree
	 */
	void exitColName(DATABASEParser.ColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColConstraint(DATABASEParser.ColConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#colConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColConstraint(DATABASEParser.ColConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#localids}.
	 * @param ctx the parse tree
	 */
	void enterLocalids(DATABASEParser.LocalidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#localids}.
	 * @param ctx the parse tree
	 */
	void exitLocalids(DATABASEParser.LocalidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#refids}.
	 * @param ctx the parse tree
	 */
	void enterRefids(DATABASEParser.RefidsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#refids}.
	 * @param ctx the parse tree
	 */
	void exitRefids(DATABASEParser.RefidsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#chNombre}.
	 * @param ctx the parse tree
	 */
	void enterChNombre(DATABASEParser.ChNombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#chNombre}.
	 * @param ctx the parse tree
	 */
	void exitChNombre(DATABASEParser.ChNombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#idTabla}.
	 * @param ctx the parse tree
	 */
	void enterIdTabla(DATABASEParser.IdTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#idTabla}.
	 * @param ctx the parse tree
	 */
	void exitIdTabla(DATABASEParser.IdTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#fkNombre}.
	 * @param ctx the parse tree
	 */
	void enterFkNombre(DATABASEParser.FkNombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#fkNombre}.
	 * @param ctx the parse tree
	 */
	void exitFkNombre(DATABASEParser.FkNombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#pkNombre}.
	 * @param ctx the parse tree
	 */
	void enterPkNombre(DATABASEParser.PkNombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#pkNombre}.
	 * @param ctx the parse tree
	 */
	void exitPkNombre(DATABASEParser.PkNombreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameAlter}
	 * labeled alternative in {@link DATABASEParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterRenameAlter(DATABASEParser.RenameAlterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameAlter}
	 * labeled alternative in {@link DATABASEParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitRenameAlter(DATABASEParser.RenameAlterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accionAlter}
	 * labeled alternative in {@link DATABASEParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterAccionAlter(DATABASEParser.AccionAlterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accionAlter}
	 * labeled alternative in {@link DATABASEParser#alterTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitAccionAlter(DATABASEParser.AccionAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#alterName}.
	 * @param ctx the parse tree
	 */
	void enterAlterName(DATABASEParser.AlterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#alterName}.
	 * @param ctx the parse tree
	 */
	void exitAlterName(DATABASEParser.AlterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#newName}.
	 * @param ctx the parse tree
	 */
	void enterNewName(DATABASEParser.NewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#newName}.
	 * @param ctx the parse tree
	 */
	void exitNewName(DATABASEParser.NewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(DATABASEParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(DATABASEParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DATABASEParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DATABASEParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#singleColConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSingleColConstraint(DATABASEParser.SingleColConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#singleColConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSingleColConstraint(DATABASEParser.SingleColConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#dropTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStmt(DATABASEParser.DropTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#dropTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStmt(DATABASEParser.DropTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#showTableStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowTableStmt(DATABASEParser.ShowTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#showTableStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowTableStmt(DATABASEParser.ShowTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#showColumnsStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowColumnsStmt(DATABASEParser.ShowColumnsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#showColumnsStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowColumnsStmt(DATABASEParser.ShowColumnsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DATABASEParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DATABASEParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(DATABASEParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(DATABASEParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DATABASEParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DATABASEParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DATABASEParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DATABASEParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(DATABASEParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(DATABASEParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DATABASEParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DATABASEParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DATABASEParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DATABASEParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DATABASEParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DATABASEParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(DATABASEParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(DATABASEParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#dmlQuery}.
	 * @param ctx the parse tree
	 */
	void enterDmlQuery(DATABASEParser.DmlQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#dmlQuery}.
	 * @param ctx the parse tree
	 */
	void exitDmlQuery(DATABASEParser.DmlQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#multiInsert}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsert(DATABASEParser.MultiInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#multiInsert}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsert(DATABASEParser.MultiInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(DATABASEParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(DATABASEParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(DATABASEParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(DATABASEParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(DATABASEParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(DATABASEParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(DATABASEParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(DATABASEParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(DATABASEParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(DATABASEParser.UpdateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#columnsUpdate}.
	 * @param ctx the parse tree
	 */
	void enterColumnsUpdate(DATABASEParser.ColumnsUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#columnsUpdate}.
	 * @param ctx the parse tree
	 */
	void exitColumnsUpdate(DATABASEParser.ColumnsUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(DATABASEParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(DATABASEParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(DATABASEParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(DATABASEParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(DATABASEParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(DATABASEParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpr(DATABASEParser.OrderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpr(DATABASEParser.OrderExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DATABASEParser#orderTerm}.
	 * @param ctx the parse tree
	 */
	void enterOrderTerm(DATABASEParser.OrderTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DATABASEParser#orderTerm}.
	 * @param ctx the parse tree
	 */
	void exitOrderTerm(DATABASEParser.OrderTermContext ctx);
}