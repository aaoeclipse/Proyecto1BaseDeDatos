// Generated from gramaticaDBMS.g4 by ANTLR 4.6
package ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaDBMSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaDBMSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(gramaticaDBMSParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#fecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFecha(gramaticaDBMSParser.FechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaDBMSParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(gramaticaDBMSParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(gramaticaDBMSParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(gramaticaDBMSParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(gramaticaDBMSParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#showDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabase(gramaticaDBMSParser.ShowDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#useDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(gramaticaDBMSParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#opTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpTable(gramaticaDBMSParser.OpTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(gramaticaDBMSParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(gramaticaDBMSParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(gramaticaDBMSParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(gramaticaDBMSParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#foreignKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKey(gramaticaDBMSParser.ForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(gramaticaDBMSParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(gramaticaDBMSParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramaticaDBMSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(gramaticaDBMSParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(gramaticaDBMSParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#relationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(gramaticaDBMSParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(gramaticaDBMSParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(gramaticaDBMSParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(gramaticaDBMSParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(gramaticaDBMSParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(gramaticaDBMSParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(gramaticaDBMSParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(gramaticaDBMSParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#updateSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSet(gramaticaDBMSParser.UpdateSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#deleteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFrom(gramaticaDBMSParser.DeleteFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#selectFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFrom(gramaticaDBMSParser.SelectFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(gramaticaDBMSParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(gramaticaDBMSParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(gramaticaDBMSParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(gramaticaDBMSParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaDBMSParser#mult_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_op(gramaticaDBMSParser.Mult_opContext ctx);
}