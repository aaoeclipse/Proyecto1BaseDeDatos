package ANTLR1;

import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR1.DATABASEBaseVisitor;
import ANTLR1.DATABASEParser.AlterDbStmtContext;
import ANTLR1.DATABASEParser.AlterNameContext;
import ANTLR1.DATABASEParser.ChNombreContext;
import ANTLR1.DATABASEParser.ColNameContext;
import ANTLR1.DATABASEParser.ColumnContext;
import ANTLR1.DATABASEParser.ColumnListContext;
import ANTLR1.DATABASEParser.ColumnNameContext;
import ANTLR1.DATABASEParser.ColumnsUpdateContext;
import ANTLR1.DATABASEParser.CreateDbStmtContext;
import ANTLR1.DATABASEParser.CreateTableStmtContext;
import ANTLR1.DATABASEParser.DbNameContext;
import ANTLR1.DATABASEParser.DdlQueryContext;
import ANTLR1.DATABASEParser.DmlQueryContext;
import ANTLR1.DATABASEParser.DropDbStmtContext;
import ANTLR1.DATABASEParser.ExpressionContext;
import ANTLR1.DATABASEParser.FactorContext;
import ANTLR1.DATABASEParser.FkNombreContext;
import ANTLR1.DATABASEParser.IdTablaContext;
import ANTLR1.DATABASEParser.NewDbNameContext;
import ANTLR1.DATABASEParser.NewNameContext;
import ANTLR1.DATABASEParser.OrderExprContext;
import ANTLR1.DATABASEParser.OrderTermContext;
import ANTLR1.DATABASEParser.PkNombreContext;
import ANTLR1.DATABASEParser.PrimaryContext;
import ANTLR1.DATABASEParser.RenameAlterContext;
import ANTLR1.DATABASEParser.SelectListContext;
import ANTLR1.DATABASEParser.TableContext;
import ANTLR1.DATABASEParser.TableNameContext;
import ANTLR1.DATABASEParser.TipoContext;
import ANTLR1.DATABASEParser.ValContext;
import ANTLR1.DATABASEParser.ValueListContext;


public class Visitor extends DATABASEBaseVisitor<Object> {
	
	
	
	
	
	/********************************************************************/
	@Override
	//Se debe cambiar db.renameDB a la funcion para cambiar el nombre dentro del manejo de bases de datos
	public Object visitAlterDbStmt(AlterDbStmtContext ctx) {
		boolean result = DB.renameDB(ctx.dbName().getText(), ctx.newDbName().getText());
		if (result){
			return ctx.newDbName().getText();
		}
		else{
			return "ERROR";
		}
	}
	
	@Override
	public Object visitDropDbStmt(DropDbStmtContext ctx) {
		String nombre = ctx.ID().getText();
		//Se debe cambiar DB.destroyDB por la funcion para eliminar database de nuestro controlador
		boolean estaDrop = DB.destroyDB(nombre);
		if(!estraDrop){
			Debug.add("ERROR: no se encuentra la base de datos: "+nombre);
			if(!Frame.activateVerbose){
				Frame.jTextArea2.setText("Error: no se encuentra la base de datos: "+nombre);
			}
			return "ERROR";	
		}
		else{
			//Se debe cambiar dbms por nuestra clase de funciones  y usar la funcion para ignorar
			if(dbms.currentDB.equalsIgnoreCase(nombre)){
				dbms.currentDB = "";
			}
			return nombre;
		}
	}
	
	@Override
	public Object visitCreateDbStmt(CreateDbStmtContext ctx) {
		String nombre = ctx.ID().getText();
		
		try{
			//Se debe remplazar DB por nuestra clase de manej de bases de datos
			DB database = new db(nombre);
			Debug.add("\n Base de datos "+ nombre + " creada exitosamente.");
			if(!frame.activateVerbose){
				Frame.jTextArea2.setText("\n Base de datos " + nombre + " creada exitosamente.");
			}
			return database;
		}
		catch(Exception e){
			e.printStackTrace();
			String s = e.getMessage();
			Frame.jTextArea2.setText(s);
		}
		return nombre;
	}
	
	@Override
	public Object visitCreateTableStmt(JDSQLParser.CreateTableStmtContext ctx) {
            this.availableCols = new ArrayList<Column>();
            this.availableCons = new ArrayList<Constraint>();
            Table t1= new Table(); //Utilizamos el constructor vacio para dejar inicializada la variable
            this.tableCreate = t1;
            String nombre = ctx.tableName().getText();
            t1.name=nombre;
            //Verificamos si hay una DB en uso
            if(DBMS.currentDB==null){
                Debug.add("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <nombre> para utilizar una base de datos existente.");
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <nombre> para utilizar una base de datos existente.");
                }
                return "ERROR";

            }
            else{
                //Buscamos si la table ya existe en la metaData
                DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);

                Debug.add("Revisando existencia de la table...");

                for(TableMetaData t:d.tables){
                    if(t.name.equalsIgnoreCase(nombre)){
                       Frame.jTextArea2.setText("ERROR: Ya existe la table: "+nombre);
                       return "ERROR";

                    }
                }
                //Guardamos las columns
                Debug.add("Verificando Columns Declaradas...");
                ArrayList<Column> cols = new ArrayList<Column>();
                for(ParseTree n: ctx.columnDecl()){
                    Column c = (Column) visit(n);
                    Column yaExiste = getColumn(c.nombre,cols);
                    if(yaExiste == null){
                        cols.add(c);
                        availableCols.add(c);
                    }
                    else{
                        Debug.add("ERROR: La column: <<"+c.nombre+">> Fue especificada mas de una vez");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: La column: <<"+c.nombre+">> Fue especificada mas de una vez");
                        }


                       return "ERROR";
                    }

                }
                //Guardamos las columns para constraints
                this.colsCreate=cols;
                // Si hay constraints las agregamos
                int test = ctx.colConstraint().size();
                ArrayList<Constraint> cons = new ArrayList<Constraint>();
                availableCons = cons;
                if(test!=0){

                  Debug.add("Agregando Restricciones...");

                   for(ParseTree n: ctx.colConstraint()){
                       Object c = visit(n);
                       if(!(c instanceof Constraint)){
                           return "ERROR";
                       }
                       else{
                           Constraint con =(Constraint)c;
                           //Revisamos que las no existan dos primary keys en la creacion


                           cons.add(con);
                       }
                   }
                    //Creamos la table y la serializamos
                    t1 = new Table(nombre,cols,cons);
                    Debug.add("Table '"+nombre+ "' Creada existosamente.");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Table '"+nombre+ "' Creada existosamente.");
                    }


                    return t1;
                }
                else{
                    //Creamos la table y la serializamos
                    t1 = new Table(nombre,cols);
                    Debug.add("Table '"+nombre+ "' Creada existosamente.");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Table '"+nombre+ "' Creada existosamente.");
                    }
                    return t1;
                }
            }
	}
	
	@Override
	public Object visitVal(ValContext ctx) {
		//Se debe agregar Column de la metadata para ver el tipo de valor
		if(ctx.CHAR_VAL()!=null){
            return Column.CHAR_TYPE;

        }
        else if(ctx.NUM()!= null){
            return Column.INT_TYPE;

        }
        else if (ctx.DATE_VAL()!=null){
            return Column.DATE_TYPE;

        }
        else if (ctx.FLOAT_VAL()!=null){
            return Column.FLOAT_TYPE;
        }
        else if(ctx.NULL()!=null){
            return -1;
        }
        else{return "ERROR";}
	}
	
	@Override
	public Object visitTipo(TipoContext ctx) {
				if(ctx.CHAR()!= null){
		                    return Column.CHAR_TYPE;
		                }
		                else if (ctx.DATE()!= null){
		                    return Column.DATE_TYPE;
		                }
		                else if (ctx.INT()!= null){
		                    return Column.INT_TYPE;

		                }
		                else if (ctx.FLOAT()!= null){
		                    return Column.FLOAT_TYPE;
		                }
		                else{
		                    return "ERROR";
		                }
	}

	
	@Override
	public Object visitFactor(FactorContext ctx) {
		if(ctx.children.size()== 1){
            return visit(ctx.primary());

        }
        else{
            Object l =  visit(ctx.primary());
            if((l instanceof Expression)){
                Expression l1 = (Expression)l;
                NotExpression e = new NotExpression(l1);
                return e;
            }
            else{
                return "ERROR";
            }
        }
	}
	
	@Override
	public Object visitPrimary(PrimaryContext ctx) {
		if(ctx.children.size()==1){
			return visit(ctx.compareExpr());
		}
		else{
			return visit(ctx.expression());
		}
	}
	
	
	//TODOS LOS OVERRIDES AUTOGENERADOS
	@Override
	public Object visitValueList(ValueListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitValueList(ctx);
	}
	
	@Override
	public Object visitNewName(NewNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNewName(ctx);
	}
	public Visitor() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object visitTable(TableContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTable(ctx);
	}
	
	@Override
	public Object visitAlterName(AlterNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAlterName(ctx);
	}
	
	@Override
	public Object visitColumnList(ColumnListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitColumnList(ctx);
	}
	
	@Override
	public Object visitColumn(ColumnContext ctx) {
		// TODO Auto-generated method stub
		return super.visitColumn(ctx);
	}
	
	@Override
	public Object visitDdlQuery(DdlQueryContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDdlQuery(ctx);
	}
	
	@Override
	public Object visitOrderTerm(OrderTermContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOrderTerm(ctx);
	}
	
	@Override
	public Object visitSelectList(SelectListContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSelectList(ctx);
	}
	@Override
	public Object visitChNombre(ChNombreContext ctx) {
		// TODO Auto-generated method stub
		return super.visitChNombre(ctx);
	}
	
	@Override
	public Object visitOrderExpr(OrderExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOrderExpr(ctx);
	}
	
	@Override
	public Object visitTableName(TableNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTableName(ctx);
	}
	
	@Override
	public Object visitColumnName(ColumnNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitColumnName(ctx);
	}
	
	@Override
	public Object visitIdTabla(IdTablaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIdTabla(ctx);
	}
	
	@Override
	public Object visitPkNombre(PkNombreContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPkNombre(ctx);
	}
	
	@Override
	public Object visitColumnsUpdate(ColumnsUpdateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitColumnsUpdate(ctx);
	}
	
	@Override
	public Object visitNewDbName(NewDbNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNewDbName(ctx);
	}
	@Override
	public Object visit(ParseTree tree) {
		// TODO Auto-generated method stub
		return super.visit(tree);
	}
	
	@Override
	public Object visitColName(ColNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitColName(ctx);
	}
	
	@Override
	public Object visitDmlQuery(DmlQueryContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDmlQuery(ctx);
	}
	
	@Override
	public Object visitFkNombre(FkNombreContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFkNombre(ctx);
	}
	
	@Override
	public Object visitDbName(DbNameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDbName(ctx);
	}
}
