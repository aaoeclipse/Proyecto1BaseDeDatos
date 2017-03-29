import ANTLR.gramaticaDBMSBaseVisitor;
import ANTLR.gramaticaDBMSParser;
import ANTLR.gramaticaDBMSParser.Add_opContext;
import ANTLR.gramaticaDBMSParser.ProgramaContext;

public class visitor extends gramaticaDBMSBaseVisitor<String> {
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
		public String visitPrograma(ProgramaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrograma(ctx);
		}
}
