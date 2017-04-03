package ANTLR1;

import java.awt.Frame;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR1.DATABASEBaseVisitor;
import ANTLR1.DATABASEParser.AlterDbStmtContext;
import ANTLR1.DATABASEParser.AlterNameContext;
import ANTLR1.DATABASEParser.ChNombreContext;
import ANTLR1.DATABASEParser.ColConstraintContext;
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
			Database database = new Database(nombre);
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
	public Object visitColConstraint(ColConstraintContext ctx) {
		//Se debe revisar el type del constraint
		if(ctx.PRIMARY()!=null){ //Si es Primary key
            String nombre = ctx.pkNombre().getText();
            //Revisamos que no exista una primary key en las constraints declaradas antes
            boolean hay_pk = hasPK(availableCons);
            if(hay_pk){
                    Debug.add("Error: No es posible declarar dos primary keys. En la table: "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No es posible declarar dos primary keys. En la table: "+tableCreate.name);
                    }
                    return "Error";
            }
            
            //Revisando que existan los nombres de las columnas
            //Nota: se debe cambiar Column a nuestro metadata para columnas.
            ArrayList<Column> pkCols = new ArrayList<Column>();

            ArrayList<Integer> colIndices = new ArrayList<Integer>();
            for(ParseTree n:ctx.localids()){
                String text = n.getText();
                Column found = getColumn(text,colsCreate);

                if(found==null){
                    Debug.add("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.name);
                    }
                    return "Error";
                }
                else{
                	//ind = indice
                    int ind = tableCreate.getColumnIndex(found.name);
                    colIndices.add(ind);
                    pkCols.add(found);

                }
            }
            boolean hayNulos = tableCreate.hasNullValues(colIndices);
            if(hayNulos){
                Debug.add("Error: La constraint: <<"+nombre+">> no puede agregarse porque existen tuples nulas para la llave primaria.");
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: La constraint: <<"+nombre+">> no puede agregarse porque existen tuples nulas para la llave primaria.");
                }
                return "Error";
            }
            // Verificamos que no existan values duplicates o nulos para las tuples actuales
            boolean duplicates = tableCreate.revisarDuplicados(colIndices);
            if(duplicates){
                Debug.add("Error: La constraint: <<"+nombre+">> no puede agregarse porque existen tuples duplicadas para la llave primaria.");
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: La constraint: <<"+nombre+">> no puede agregarse porque existen tuples duplicadas para la llave primaria.");
                }
                return "Error";
            }
            //Creamos constraint
            Constraint c = new Constraint(nombre,Constraint.PK,pkCols,tableCreate.name);
            //Verificamos que no exista una constraint del mismo type con el mismo name
            boolean existeConstraint = getConstraint(c,this.availableCons);
            if(existeConstraint){
                Debug.add("Error: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                }
                    return "Error";
            }
            return c;
		}
        else if(ctx.FOREIGN()!=null){ // Si es foreign key
            String nombre = ctx.fkNombre().getText();
            //Revisando que existan los name de las columns en la table local
            ArrayList<Column> localCols = new ArrayList<Column>();
            ArrayList<Integer> localIndexes = new ArrayList<Integer>();
            for(ParseTree n:ctx.localids()){
                String text = n.getText();
                Column found = getColumn(text,colsCreate);

                if(found==null){
                    Debug.add("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.name);
                    }

                    return "Error";
                }
                else{
                    localCols.add(found);
                    int in = tableCreate.getColumnIndex(found.nombre);
                    localIndexes.add(in);
                }
            }
            //Obteniendo la table que referencia
            String refTable = ctx.idTabla().getText();

            DBMetaData bd = DBMS.metaData.getDB(DBMS.currentDB);
            TableMetaData t = bd.findTable(refTable);


            if(t==null){
                    Debug.add("Error: No se encuentra la table de referencia: "+refTable);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No se encuentra la table de referencia: "+refTable);
                    }
                    return "Error";
            }


            //Si encontramos la table procedemos a buscar las columns
            else{
                Table tablaRef = Table.loadTable(refTable);
                ArrayList<Constraint> foreignConstraints = Table.loadConstraints(refTable);
                ArrayList<Column> fkCols = new ArrayList<Column>();
                ArrayList<Integer> fkIndexes = new ArrayList<Integer>();
                ArrayList<Column> cols = Table.loadColums(refTable);
                //Buscamos las columns de la primary key de la table foranea
                ArrayList<Column> columnasPrimary = new ArrayList<Column>();
                for(Constraint c1: foreignConstraints){
                    if(c1.type == Constraint.PK){
                        columnasPrimary.addAll(c1.colsPkeys);
                    }

                }
                if(cols==null){
                    Debug.add("Error: No se encuentra la table de referencia: "+refTable);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No se encuentra la table de referencia: "+refTable);
                    }
                    return "Error";
                }

                for(ParseTree n:ctx.refids()){
                    String text = n.getText();
                    //Buscamos las columns de la table

                    if(cols==null){
                        Debug.add("Error: No se encuentra archivo de columns para la table: "+refTable);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: No se encuentra archivo de columns para la table: "+refTable);
                        }
                        return "Error";
                    }
                    Column found = getColumn(text,cols);

                    if(found==null){
                        Debug.add("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.nombre);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.nombre);
                        }
                        return "Error";
                    }
                    else{
                        //Si encontramos la column, verificamos que la column pertenezca al primary key de la table externa para garantizar que la llave sea unica

                        Column encontrada2 = getColumn(found.nombre,columnasPrimary);
                        if(encontrada2==null){
                            Debug.add("Error: No se puede crear la llave foranea. La column de referecia: "+found.nombre+" No es unica ");
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: No se puede crear la llave foranea. La column de referecia: "+found.nombre+" No es unica ");
                            }
                            return "Error";
                        }
                        //Agregamos la column
                        fkCols.add(found);
                        int in = tablaRef.getColumnIndex(found.nombre);
                        fkIndexes.add(in);

                    }
                }

                //Una vez obtenidos los dos arreglos de columns verificamos que tengan el mismo tamaño
                if(fkCols.size()!=localCols.size()){
                    Debug.add("Error: El numero de columns locales y remotas en la foregin key debe ser el mismo");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: El numero de columns locales y remotas en la foregin key debe ser el mismo");
                    }

                    return "Error";
                }
                //Si los arreglos son iguales verificamos que tengan los mismos type
                for(int i =0;i<localCols.size();i++){
                    Column local = localCols.get(i);
                    Column foreign = fkCols.get(i);
                    if(local.type!=foreign.type){
                        Debug.add("Error: las columns: '"+local.nombre+", "+foreign.nombre+"' Deben tener el mismo type");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: las columns: '"+local.nombre+", "+foreign.nombre+"' Deben tener el mismo type");
                        }
                        return "Error";

                    }
                }
                //Para cada tuple de la table local verificamos que los values existan en la table de referencia
                for(Tuple tuple: tableCreate.tuples){
                    //Obtenemos los values de la tuple actual
                    ArrayList<Object> currValues = new ArrayList<Object>();
                    for(int i : localIndexes){
                        Object value = tuple.values.get(i);
                        currValues.add(value);
                    }
                    //Revisamos si los values actuales existen en la table de referencia
                    boolean existenValores = tablaRef.containsValue(currValues, fkIndexes);
                    if(!existenValores){
                        Debug.add("ERROR: no se puede crear la restriccion <<"+nombre+">> porque los values de las tuples no existen en la table de referencia.");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: no se puede crear la restriccion <<"+nombre+">> porque los values de las tuples no existen en la table de referencia.");
                        }
                        return "ERROR";
                    }

                }
                //Si todas las columns tienen los mismo tipos, procedemos a crear la constraint
                Constraint c = new Constraint(nombre,Constraint.FK,localCols,fkCols,refTable,this.tableCreate.nombre);
                //Verificamos que no exista una constraint del mismo type con el mismo nombre
                boolean existeConstraint = getConstraint(c,this.availableCons);
                if(existeConstraint){
                        Debug.add("ERROR: La constraint  "+c.nombre+" Ya fue declarada "+tableCreate.nombre);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: La constraint  "+c.nombre+" Ya fue declarada "+tableCreate.nombre);
                        }

                        return "ERROR";
                }

                return c;

            }


        }

        else if(ctx.CHECK()!=null){
            String nombre= ctx.chNombre().getText();
            //Obtenemos la expresion del CHECK
            Object e = visit(ctx.expression());
            String expr = ctx.expression().getText();
            //Verificamos que no existan errores en la expresion para poder castear
            if(! (e instanceof Expression)){
                return "Error";

            }
            Expression e1 = (Expression)e;
            //Verificamos que las tuples actuales de la table cumplan con la restriccion
            Table temp = new Table();
            temp.nombre = tableCreate.nombre;
            temp.columns.addAll(tableCreate.columns);
            temp.tuples.addAll(tableCreate.tuples);
            Loader.iterator = new TableIterator(temp,0);
            for(int i =0; i<Loader.iterator.table.tuples.size();i++){
                try {
                if(!e1.isTrue()){
                    Debug.add("Error: no se puede insertar constraint <<"+nombre+">> porque algunas tuples no cumplen con la restriccion.");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: no se puede insertar constraint <<"+nombre+">> porque algunas tuples no cumplen con la restriccion.");
                    }
                    return "Error";
                }
                } catch (Exception ex) {
                    Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            Constraint c = new Constraint(nombre,Constraint.CHECK,e1,tableCreate.nombre,expr);
            //Verificamos que no exista una constraint del mismo type con el mismo name
            boolean existeConstraint = getConstraint(c,this.availableCons);
            if(existeConstraint){
                    Debug.add("Error: La constraint  "+c.nombre+" Ya fue declarada "+tableCreate.nombre);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: La constraint  "+c.nombre+" Ya fue declarada "+tableCreate.nombre);
                    }
                    return "Error";
            }
            return c;


        }
        return "Error";
	}
	
	@Override
	public Object visitVal(ValContext ctx) {
		//Se debe agregar Column de la metadata para ver el tipo de valor se debe 
		//reconocer que aqui pide la class columna.java, la cual debemos ingresar enuestra metadata
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
