import ANTLR.gramaticaDBMSBaseVisitor;
import ANTLR.gramaticaDBMSParser.ActionContext;
import ANTLR.gramaticaDBMSParser.Add_opContext;
import ANTLR.gramaticaDBMSParser.AlterDatabaseContext;
import ANTLR.gramaticaDBMSParser.AlterTableContext;
import ANTLR.gramaticaDBMSParser.CreateDatabaseContext;
import ANTLR.gramaticaDBMSParser.CreateTableContext;
import ANTLR.gramaticaDBMSParser.DropDatabaseContext;
import ANTLR.gramaticaDBMSParser.Eq_opContext;
import ANTLR.gramaticaDBMSParser.InsertIntoContext;
import ANTLR.gramaticaDBMSParser.Mult_opContext;
import ANTLR.gramaticaDBMSParser.ProgramaContext;
import ANTLR.gramaticaDBMSParser.Rel_opContext;
import ANTLR.gramaticaDBMSParser.SelectFromContext;
import ANTLR.gramaticaDBMSParser.ShowDatabaseContext;
import ANTLR.gramaticaDBMSParser.ShowTablesContext;
import ANTLR.gramaticaDBMSParser.UpdateSetContext;
import ANTLR.gramaticaDBMSParser.UseDatabaseContext;

public class visitor extends gramaticaDBMSBaseVisitor<String> {
		@Override
		public String visitPrograma(ProgramaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrograma(ctx);
		}
	
		//*************Funcion de operadores*********************
	
		@Override
		public String visitRel_op(Rel_opContext ctx) {
		// TODO Auto-generated method stub
		return super.visitRel_op(ctx);
		}
		
		@Override
		public String visitEq_op(Eq_opContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEq_op(ctx);
		}
		
		@Override
		public String visitAdd_op(Add_opContext ctx) {
			visitChildren(ctx);
			if(ctx.getChildCount()==1){
				System.out.println(ctx.getChild(0));
			}
			else {
				System.out.println(ctx.getChild(0));
				System.out.println("ADD Operation");
			}
		return null;
		}
		
		@Override
		public String visitMult_op(Mult_opContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMult_op(ctx);
		}
		
		
		//**********************DATABASE****************************

		@Override
		public String visitCreateDatabase(CreateDatabaseContext ctx) {
			System.out.println("visitCreateDatabase");
			String id = ctx.getChild(2).getText();
			System.out.println(id);
			return "ERROR"; //errors
		}
		
		@Override
		public String visitAlterDatabase(AlterDatabaseContext ctx) {
			System.out.println("visitAlterDatabase");
			String id_number_1 = ctx.getChild(2).getText(); //argumento 1
			String id_number_2 = ctx.getChild(5).getText(); //argumento 2
			System.out.println("ID 1:"+id_number_1+"; ID 2:"+id_number_2);
			return "ERROR";
		}
		
		@Override
		public String visitDropDatabase(DropDatabaseContext ctx) {
			System.out.println("visitDropDatabase");
			String id = ctx.getChild(2).getText();
			System.out.println(id);
			return "ERROR";
		}
		
		@Override
		public String visitShowDatabase(ShowDatabaseContext ctx) {
			System.out.println("visitShowDatabase");
			String id = ctx.getChild(2).getText();
			System.out.println(id);
			return "ERROR";
		}
		
		@Override
		public String visitUseDatabase(UseDatabaseContext ctx) {
			System.out.println("visitUseDatabase");
			String id = ctx.getChild(2).getText();
			System.out.println(id);
			return "ERROR";
		}
		
		//TABLE
		@Override
		public String visitCreateTable(CreateTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCreateTable(ctx);
		}
		
		@Override
		public String visitAlterTable(AlterTableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAlterTable(ctx);
		}
		
		@Override
		public String visitShowTables(ShowTablesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitShowTables(ctx);
		}
		
		@Override
		public String visitAction(ActionContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAction(ctx);
		}
		
		//************************Segunda parte*************************
		
		@Override
		public String visitInsertInto(InsertIntoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitInsertInto(ctx);
		}
		
		@Override
		public String visitUpdateSet(UpdateSetContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUpdateSet(ctx);
		}
		
		@Override
		public String visitSelectFrom(SelectFromContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSelectFrom(ctx);
		}
}

