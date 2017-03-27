package ANTLR;

public class implementacion extends gramaticaDBMSBaseVisitor <String>{
	
	public String visitLiteral(gramaticaDBMSParser.LiteralContext ctx){
		if (ctx.getChildCount() == 0)
			return "empty";
		String idx = ctx.IDX().getText();
		System.out.println(idx);
		return idx;
		}
	
}
