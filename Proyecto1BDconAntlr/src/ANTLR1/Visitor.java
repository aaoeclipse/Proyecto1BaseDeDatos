package ANTLR1;
/** 
 * Proyecto de Base De Datos 1
 * Visitor, ANTLR4
 * Modificación: 4 de Abril, 2017 
 * **/
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import ANTLR1.DATABASEBaseVisitor;
import ANTLR1.DATABASEParser.*;
import metadata.Columna;
import metadata.Controlador;
import metadata.Database;
import metadata.InterfaceDeControlador;
import metadata.Table;


public class Visitor extends DATABASEBaseVisitor<Object> {
	//OJO, hay que revisar la primera parte ya que no tenemos las mismas clases ademas, estas funciones
	//nos sirven para la logica de las funciones del extend
	
	
	DBMS  dbms;
	
	Controlador contr = new Controlador();
    ArrayList<Columna> colsCreate; // Almacena las columns que se crean en CREATE TABLE para poder verificarlas en los metodos de constraints
    Table tableCreate;
    Columna addedCol; //Column que se acaba de add en add column
    TableMetaData tableCreateMetaData;
    String createTableName;
    ArrayList<Columna> availableCols;
    ArrayList<Constraint> availableCons;
    static TableIterator iterator;
    Table temp2 = null;

    ArrayList<Table> tablesInsert;
    ArrayList<Integer> regsInsert;
    public Loader(DBMS dbms){
        ArrayList<Table> tablesInsert = new ArrayList<Table>();
        this.dbms = dbms;

    }

    public void error(String s){
        Frame.jTextArea2.setText(s);
    }

    public Table cartesianProduct(ArrayList<Table> tables){
        Table result = new Table();
        result.name = "temp";
        // If there is only one table we return a new temporal table with
        // the same tuple
        if(tables.size()==1){
            result.tuples.addAll(tables.get(0).tuples);
            result.columns.addAll(tables.get(0).columns);
            return result;
        }
        else if(tables.size()==2){
            // ADD all the columns of the first and second table
            result.columns.addAll(tables.get(0).columns);
            result.columns.addAll(tables.get(1).columns);
            // Combine all Tuples
            for(Tuple t1 :tables.get(0).tuples){
                for(Tuple t2: tables.get(1).tuples){
                    Tuple newTuple = new Tuple(result);
                    newTuple.values.addAll(t1.values);
                    newTuple.values.addAll(t2.values);
                    result.tuples.add(newTuple);
                }
            }
            return result;
        }
        else if(tables.size()>2){
            // Add all columns
            for(Table t:tables){
                result.columns.addAll(t.columns);
            }
            ArrayList<Tuple> resultingTuples = new ArrayList<Tuple>();
            // Combine all tuples
            for(Tuple t1 :tables.get(0).tuples){
                for(Tuple t2: tables.get(1).tuples){
                    Tuple newTuple = new Tuple(result);
                    newTuple.values.addAll(t1.values);
                    newTuple.values.addAll(t2.values);
                    resultingTuples.add(newTuple);
                }
            }
            // Combine more tuples if there is more than 2 tables
            ArrayList<Tuple> currentTuples = new ArrayList<Tuple>();
            ArrayList<Tuple> priorTuples = new ArrayList<Tuple>();

            for(int i =2; i<tables.size();i++){
                currentTuples.clear();
                currentTuples.addAll(tables.get(i).tuples);
                priorTuples.clear();
                priorTuples.addAll(resultingTuples);
                resultingTuples.clear();
                for(Tuple t1: priorTuples){
                    for(Tuple t2: currentTuples){
                        Tuple newTuple = new Tuple(result);
                        newTuple.values.addAll(t1.values);
                        newTuple.values.addAll(t2.values);
                        resultingTuples.add(newTuple);
                    }
                }
            }
            result.tuples.addAll(resultingTuples);
            return result;




        }
        else{return null;}

    }

    public ArrayList<Constraint> getReferences(String tableName){
        ArrayList<Constraint> result = new ArrayList<Constraint>();
        ArrayList<Constraint> cons = getAllForeignConstraints();
        for(Constraint c: cons){
            if(c.foreignTable.equalsIgnoreCase(tableName)){
                result.add(c);
            }
        }
        return result;


    }

    // get Column reciving a string and an array of columns.
    public Columna getColumn(String name, ArrayList<Columna> cols){
        for(Columna c: cols){
            if(c.name.equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }

    public boolean foreignDeleted(Table t){
        boolean found = true;
        ArrayList<Constraint> refs = getReferences(t.name);
        for(Constraint refCons: refs){
            Table localTable = Table.loadTable(refCons.table);
            for(Tuple tuple:localTable.tuples){
                ArrayList<Integer> searchIndex = new ArrayList<Integer>();
                ArrayList<Integer> indexT = new ArrayList<Integer>();
                ArrayList<Object> currentValues = new ArrayList<Object>();
                for(Columna col: refCons.localFKs){
                    int index = localTable.getColumnIndex(localTable.name);
                    searchIndex.add(index);
                }
                for(int iv: searchIndex){
                    currentValues.add(tuple.values.get(iv));

                }
                for(Columna c2: refCons.refKeys){
                    int index2 = t.getColumnIndex(c2.name);
                    indexT.add(index2);

                }
                // Check if tuple values excist
                // the table reference falues (example UPDATE tableName)
                found = t.containsValue(currentValues, indexT);
                if(!found)
                    return found;
            }
        }
        return found;
    }

    // Returns all the Constrains in the current data base
    public ArrayList<Constraint> getAllForeignConstraints(){
         ArrayList<Constraint> result = new ArrayList<Constraint>();
         DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
         for(TableMetaData t: d.tables){
            ArrayList<Constraint> c = Table.loadConstraints(t.name);
            for(Constraint c1: c){
                if(c1.type==Constraint.FK){
                    result.add(c1);
                }
            }
         }
         return result;
    }
    public Constraint getReferences(String colName, String tableName, ArrayList<Constraint> cons){
        for(Constraint c: cons){
            if(c.foreignTable.equalsIgnoreCase(tableName)){
                for(Column col: c.refKeys){
                    if(col.name.equalsIgnoreCase(colName)){
                        return c;
                    }
                }

            }
        }
        return null;
    }
    // Returns true if it finds a PK in the constraints
    public boolean hasPK(ArrayList<Constraint> cons){
        for(Constraint c:cons){
            if(c.type==Constraint.PK){
                return true;
            }
        }
        return false;
    }

    public Constraint getConstraint(String c, ArrayList<Constraint> cons){
        for(Constraint c1: cons){
            if(c.equalsIgnoreCase(c1.name)){
                return c1;
            }
        }
        return null;
    }

    public boolean getConstraint(Constraint c, ArrayList<Constraint> cons){
        for(Constraint c1: cons){
            if(c.name.equalsIgnoreCase(c1.name)){
                return true;
            }
        }
        return false;
    }
	
	
	//Aqui termina la primera parte y empiezan las funciones del extend
	/********************************************************************/
	@Override
	//Se debe cambiar db.renameDB a la funcion para cambiar el nombre dentro del manejo de bases de datos
	public Object visitAlterDbStmt(AlterDbStmtContext ctx) {
		boolean result = Controlador.renameDB(ctx.dbName().getText(), ctx.newDbName().getText());
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
		boolean estaDrop = contr.dropDatabase(nombre);
		
			return nombre;
		}
	
	
	@Override
	public Object visitCreateDbStmt(CreateDbStmtContext ctx) {
		String nombre = ctx.ID().getText();
		
			//Se debe remplazar DB por nuestra clase de manej de bases de datos
			Database database = new Database(nombre);
			
		return nombre;
	}
	
	//Revisar 	
	@Override
	public Object visitCreateTableStmt(CreateTableStmtContext ctx) {
		 	String nombre = ctx.tableName().getText();
			contr.createTable(nombre, contr.DBname() );
            //Verificamos si hay una DB en uso
           /* if(DBMS.currentDB==null){
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
                ArrayList<Columna> cols = new ArrayList<Columna>();
                for(ParseTree n: ctx.columnDecl()){
                	Columna c = (Columna) visit(n);
                	Columna yaExiste = getColumn(c.nombre,cols);
                    if(yaExiste == null){
                        cols.add(c);
                        availableCols.add(c);
                    }
                    else{
                        Debug.add("ERROR: La Columna: <<"+c.nombre+">> Fue especificada mas de una vez");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: La Columna: <<"+c.nombre+">> Fue especificada mas de una vez");
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
            }*/
			
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
            ArrayList<Columna> pkCols = new ArrayList<Columna>();

            ArrayList<Integer> colIndices = new ArrayList<Integer>();
            for(ParseTree n:ctx.localids()){
                String text = n.getText();
                Columna found = getColumn(text,colsCreate);

                if(found==null){
                    Debug.add("Error: No se encuentra la Columna: "+text+" En la table: "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No se encuentra la Columna: "+text+" En la table: "+tableCreate.name);
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
            ArrayList<Columna> localCols = new ArrayList<Columna>();
            ArrayList<Integer> localIndexes = new ArrayList<Integer>();
            for(ParseTree n:ctx.localids()){
                String text = n.getText();
                Columna found = getColumn(text,colsCreate);

                if(found==null){
                    Debug.add("Error: No se encuentra la Columna: "+text+" En la table: "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: No se encuentra la Columna: "+text+" En la table: "+tableCreate.name);
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
                ArrayList<Columna> fkCols = new ArrayList<Columna>();
                ArrayList<Integer> fkIndexes = new ArrayList<Integer>();
                ArrayList<Columna> cols = Table.loadColums(refTable);
                //Buscamos las columns de la primary key de la table foranea
                ArrayList<Columna> columnasPrimary = new ArrayList<Columna>();
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
                        Debug.add("Error: No se encuentra archivo de Columnas para la table: "+refTable);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: No se encuentra archivo de Columnas para la table: "+refTable);
                        }
                        return "Error";
                    }
                    Columna found = getColumn(text,cols);

                    if(found==null){
                        Debug.add("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.nombre);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: No se encuentra la column: "+text+" En la table: "+tableCreate.nombre);
                        }
                        return "Error";
                    }
                    else{
                        //Si encontramos la column, verificamos que la column pertenezca al primary key de la table externa para garantizar que la llave sea unica

                    	Columna encontrada2 = getColumn(found.nombre,columnasPrimary);
                        if(encontrada2==null){
                            Debug.add("Error: No se puede crear la llave foranea. La Columna de referecia: "+found.nombre+" No es unica ");
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: No se puede crear la llave foranea. La Columna de referecia: "+found.nombre+" No es unica ");
                            }
                            return "Error";
                        }
                        //Agregamos la column
                        fkCols.add(found);
                        int in = tablaRef.getColumnIndex(found.nombre);
                        fkIndexes.add(in);

                    }
                }

                //Una vez obtenidos los dos arreglos de columns verificamos que tengan el mismo tama�o
                if(fkCols.size()!=localCols.size()){
                    Debug.add("Error: El numero de Columnas locales y remotas en la foregin key debe ser el mismo");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("Error: El numero de Columnas locales y remotas en la foregin key debe ser el mismo");
                    }

                    return "Error";
                }
                //Si los arreglos son iguales verificamos que tengan los mismos type
                for(int i =0;i<localCols.size();i++){
                	Columna local = localCols.get(i);
                	Columna foreign = fkCols.get(i);
                    if(local.type!=foreign.type){
                        Debug.add("Error: las Columnas: '"+local.nombre+", "+foreign.nombre+"' Deben tener el mismo type");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: las Columnas: '"+local.nombre+", "+foreign.nombre+"' Deben tener el mismo type");
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
            temp.Columna.addAll(tableCreate.Columna);
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
	public Object visitColumnDecl(ColumnDeclContext ctx) {
		//Creamos la columan dependiendo del type
        String nombre = ctx.colName().getText();
        int colType = 0;
        Columna c = new Columna(null,0,0,tableCreate.nombre);
        if(ctx.type().CHAR()!=null){
            colType = Columna.CHAR_TYPE;
            int size = Integer.parseInt(ctx.type().NUM().getText());
            c = new Columna(nombre,colType,size,this.tableCreate.nombre);
        }
        else if(ctx.type().INT()!=null){
            colType = Columna.INT_TYPE;
            c = new Columna(nombre,colType,this.tableCreate.nombre);

        }
        else if(ctx.type().FLOAT()!=null){
            colType =Columna.FLOAT_TYPE;
            c = new Columna(nombre,colType,this.tableCreate.nombre);
        }
        else if(ctx.type().DATE()!=null){
            colType = Columna.DATE_TYPE;
            c = new Columna(nombre,colType,this.tableCreate.nombre);

        }
        return c;
	}
	
	@Override
	public Object visitShowColumnsStmt(ShowColumnsStmtContext ctx) {
		String nameTable = ctx.ID().getText();
        //Se carga la metadata de la table que se desea mostrar
        DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
        TableMetaData tm=d.findTable(nameTable);
        if(tm == null){
            Frame.jTextArea2.setText("Error: La table  "+nameTable+" no existe dentro de "+DBMS.currentDB);
            return "Error";
        }
        ArrayList<String> titulos1 = new ArrayList<String>();
        ArrayList<String> titulos2 = new ArrayList<String>();
        ArrayList<ArrayList<String>> filas1 = new ArrayList();
        ArrayList<ArrayList<String>> filas2 = new ArrayList();
        //se carga los titulos para la primera table
        titulos1.add("Columna Nombre");
        titulos1.add("Columna Type");
        titulos2.add("Constraint Nombre");
        titulos2.add("Constraint Type");
        titulos2.add("Constraint Descripcion");
        //se cargan las filas para las columns que se desean mostrar
        for (ColumnMetaData Columna : tm.Columna) {
            ArrayList<String> temp = new ArrayList<String>();
            temp.add(Columna.name);
            temp.add(Columna.type);
            filas1.add(temp);
        }
        //Se cargan las filas para los contraints
        for(ConstraintMetaData constraint: tm.constraints){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add(constraint.name);
            temp.add(constraint.type);
            temp.add(constraint.decripcion);
            filas2.add(temp);
        }
        Resultados result = new Resultados(titulos1,filas1,titulos2,filas2);
        for(Component i: Frame.forResults.getComponents()){
            Frame.forResults.remove(i);
        }

        Frame.forResults.add(result);
        Frame.forResults.revalidate();
        Frame.forResults.repaint();

        if(Frame.activateVerbose){
            Frame.jTextArea2.append("Mostrando columnas de "+nameTable);
        }
        return super.visitShowColumnsStmt(ctx);
	}
	
	@Override
	public Object visitRenameAlter(RenameAlterContext ctx) {
		//Se verifica si hay una database en uso
		Debug.add("Buscando la base de datos en uso");

        if(DBMS.currentDB==null){
            Debug.add("Error: No existe ninguna base de datos en uso. Utilice USE DATABASE <nombre> para utilizar una base de datos existente.");
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("Error: No existe ninguna base de datos en uso. Utilice USE DATABASE <nombre> para utilizar una base de datos existente.");
            }
            return "Error";

        }
        String oldName = ctx.alterName().getText();
        String newName= ctx.newName().getText();

        Debug.add("Buscando la table");

        Table t = Table.loadTable(oldName);
        if(t==null){
            Debug.add("ERROR: No se encuentra la table: "+oldName);
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("ERROR: No se encuentra la table: "+oldName);
            }
            return "Error";

        }

        Debug.add("Alterando la metadata...");

        DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
        TableMetaData tm=d.findTable(oldName);
        tm.name=newName;
        t.renameTo(newName);
        DBMS.metaData.writeMetadata();
        DBMS.guardar();
            Debug.add("Table: "+oldName+" renombrada a : '"+newName);
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("Table: "+oldName+" renombrada a : '"+newName);
            }
        return t;
	}
	
	@Override
	public Object visitAccionAlter(AccionAlterContext ctx) {
		Debug.add("Buscando la base de datos en uso");

        if(DBMS.currentDB==null){
          Debug.add("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            }
            return "ERROR";

        }
        String tableName = ctx.alterName().getText();
        this.tableCreate = Table.loadTable(tableName);
        DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
        TableMetaData t = d.findTable(tableName);
        this.tableCreateMetaData =t;
        if(tableCreate == null){
            Debug.add("ERROR: No se encuentra la table: "+tableName);
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("ERROR: No se encuentra la table: "+tableName);
            }
            return "ERROR";
        }
        for(ParseTree n: ctx.accion()){
            Object accion = visit(n);
            if(accion instanceof String){
                return "ERROR";
            }
        }
        //Guardamos la table con los nuevos cambios

        Debug.add("Alterando la metadata...");

        tableCreate.guardarTabla();
        DBMS.metaData.writeMetadata();
        DBMS.guardar();
          Debug.add("Table alterada correctamente. Se realizaron: "+ctx.accion().size()+" alteraciones-");
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("Table alterada correctamente. Se realizaron: "+ctx.accion().size()+" alteraciones-");
            }
        return true;
	}
	
	@Override
	public Object visitAccion(AccionContext ctx) {
		//Si es add Column
        this.availableCons = tableCreate.constraints;
        this.availableCols = tableCreate.columns;
        this.colsCreate = tableCreate.columns;
        if(ctx.ADD()!=null && ctx.COLUMN()!=null){
            String colName = ctx.columnName().getText();
            Object type = visit(ctx.type());

            if(type instanceof String){
                Debug.add("Error: type invalido al add columna");
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: type invalido al add columna");
                }
                return "Error";
            }
            int tipo1 = (Integer) type;

            Debug.add("Verificando existencia de nueva columna");

            Columna yaExiste = getColumn(colName,this.tableCreate.columns);
            if(yaExiste!=null){
                Debug.add("Error: La columna: <<"+colName+">> Fue especificada mas de una vez");
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: La columna: <<"+colName+">> Fue especificada mas de una vez");
                }

                return "Error";
            }
            // Creando la column
            Columna c;

            Debug.add("Creando la columna...");

            if(tipo1==Columna.CHAR_TYPE){
                int size = Integer.parseInt(ctx.type().NUM().getText());
                 c = new Columna(colName,tipo1,size,tableCreate.name);
                 this.addedCol=c;
            }
            else{
                 c = new Columna (colName,tipo1,tableCreate.name);
                 this.addedCol=c;
            }

            //Verificando si existen contratins
            ArrayList<Constraint> nuevasConstraints = new ArrayList<Constraint>();
            if(ctx.singleColConstraint()!=null){
                // Asignando las constraints creadas a las disponibles para verificar cosntraints duplicadas

                Debug.add("Agregando restricciones de Columnaa...");

                this.colsCreate.add(c); //Agregamos la nueva Columna
                this.availableCols= this.colsCreate; // Agregamos a Columna disponibles para el caso en que haya un CHECK ( expression) con un term como column
                for(ParseTree n: ctx.singleColConstraint()){
                    Object cons = visit(n);
                    if(!(cons instanceof Constraint)){
                        return "Error";
                    }
                    Constraint cons1 = (Constraint)cons;
                    nuevasConstraints.add(cons1);


                }
                // Verificamos si alguna constraint es primary key y si hay alguna tuple, no permitimos add la column porque habran values nulos en una pk
                for(Constraint cs: nuevasConstraints){
                    if(cs.type==Constraint.PK && this.tableCreate.tuples.size()>0){
                        Debug.add("Error: no se puede insertar primary key : <<"+cs.name+">> porque se crearan values nulos en la table ");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: no se puede insertar primary key : <<"+cs.name+">> porque se crearan values nulos en la table ");
                        }
                    }
                    if(cs.type==Constraint.CHECK){
                        Table temp = new Table();
                        temp.name = tableCreate.name;
                        temp.Columna.addAll(tableCreate.Columna);
                        temp.tuples.addAll(tableCreate.tuples);
                        Loader.iterator = new TableIterator(temp,0);
                        for(int i =0; i<Loader.iterator.table.tuples.size();i++){
                            try {
                            if(cs.expr.isTrue() == null || !cs.expr.isTrue()){
                                Debug.add("Error: no se puede insertar constraint <<"+cs.name+">> porque algunas tuples no cumplen con la restriccion.");
                                if(!Frame.activateVerbose){
                                    Frame.jTextArea2.setText("Error: no se puede insertar constraint <<"+cs.name+">> porque algunas tuples no cumplen con la restriccion.");
                                }

                                return "Error";
                            }
                            } catch (Exception ex) {
                                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                    }

                }




                /*
                 si ya hay tuples en la table y no habia PK, se agrega a cada tuple el value nulo
                */
                ArrayList<Tuple> tuples = this.tableCreate.tuples;
                for(Tuple fila: tuples){
                    fila.values.add(null);
                }

                // Agregamos la nueva column a la metaData
                ColumnMetaData cm= new ColumnMetaData(c.name,c.getStringType(c.type));
                this.tableCreateMetaData.Columna.add(cm);
                //Agregamos las nuevas constraints a la table
                this.tableCreate.constraints.addAll(nuevasConstraints);
                //Agregamos las nuevas constraints a la metaData
                for(Constraint cons: nuevasConstraints){
                    ConstraintMetaData consm = new ConstraintMetaData(cons.name,cons.getStringType(cons.type),cons.toString());
                    tableCreateMetaData.constraints.add(consm);
                }
                return true;
            }
        }
        // Si es add constraint
        else if (ctx.ADD()!= null && ctx.CONSTRAINT()!= null){
            Object c = visit(ctx.colConstraint());
            if(!(c instanceof Constraint)){
                return "Error";

            }

            Debug.add("Agregando restricciones...");

            Constraint c1 = (Constraint)c;
            ConstraintMetaData cmt = new ConstraintMetaData(c1.name,c1.getStringType(c1.type),c1.toString());
            tableCreate.constraints.add(c1);
            this.tableCreateMetaData.constraints.add(cmt);
            return true;
        }
        // Si es drop column
        else if(ctx.DROP()!= null && ctx.COLUMN()!= null){
            String colName = ctx.columnName().getText();
            //Verificamos que la column exista

            Debug.add("Buscando restriccion para eliminar...");

            Columna yaExiste = getColumn(colName,this.tableCreate.Columna);
            if(yaExiste==null){
                Debug.add("Error: no se encuentra la columna <<"+colName+">> en la table: "+tableCreate.Columna);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: no se encuentra la columna <<"+colName+">> en la table: "+tableCreate.Columna);
                }
                return "Error";
            }

            //Revisar que no existan refs en llaves foraneas de otras tables

            Debug.add("Verificando refs en otras tables");

            ArrayList<Constraint> allForeignConstraints = getAllForeignConstraints();
            Constraint hasReferences = getReferences(colName,tableCreate.name,allForeignConstraints);
            if(hasReferences !=null){
                Debug.add("Error: No se puede eliminar <<"+colName+">> porque existe la referencia <<"+hasReferences.name+">> en la table: "+hasReferences.table);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: No se puede eliminar <<"+colName+">> porque existe la referencia <<"+hasReferences.name+">> en la table: "+hasReferences.table);
                }
                return "Error";
            }
            //Veriicamos si la table tiene un primary key con la column especificada y si existe eliminamos la llave
            Constraint consPK = tableCreate.containsPKWithColumn(yaExiste);
            if(consPK!=null){
                tableCreate.eliminarConstraint(consPK.name);

            }

            //Elimnamos la column correspondiente a la fila en cada tuple y la column como atributo de la table y del metadata
            tableCreate.eliminarColumna(yaExiste);
            return true;
        }
        // si es drop constraint
        else if(ctx.DROP()!= null && ctx.CONSTRAINT()!= null){
            String consName = ctx.ID().getText();
            Constraint yaExiste = this.getConstraint(consName, tableCreate.constraints);
            if(yaExiste==null){
                Debug.add("Error: no se encuentra la constraint <<"+consName+">> en la table: "+tableCreate.Columna);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("Error: no se encuentra la constraint <<"+consName+">> en la table: "+tableCreate.Columna);
                }

                return "Error";
            }

             Debug.add("Verificando refs en otras tables");

            //Si la constraint es primary key, revisamo refs a otras tables de las columns de la pk
            if(yaExiste.type == Constraint.PK){
                ArrayList<Columna> columns = yaExiste.colsPkeys;
                ArrayList<Constraint> allForeignConstraints = getAllForeignConstraints();
                for(Columna col1: columns){
                    Constraint hasReferences = getReferences(col1.name,tableCreate.name,allForeignConstraints);
                    if(hasReferences !=null){
                        Debug.add("Error: No se puede eliminar la constraint PK: <<"+col1.name+">> porque existe la referencia <<"+hasReferences.name+">> en la table: "+hasReferences.table);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("Error: No se puede eliminar la constraint PK: <<"+col1.name+">> porque existe la referencia <<"+hasReferences.name+">> en la table: "+hasReferences.table);
                        }
                        return "Error";
                    }
                }

            }
            tableCreate.eliminarConstraint(consName);
            return true;


        }
        else{
            return "Error";
        }
        return "Error";
	}
	
	//*******************************************************************************************************************************
	//Revisar bien esta parte
	@Override
	public Object visitSingleColConstraint(SingleColConstraintContext ctx) {
		Debug.add("Agregando restriccion de column...");

        if(ctx.PRIMARY()!=null){
            String name = ctx.pkNombre().getText();
            //Revisamos que no exista una primary key en las constraints declaradas antes
            boolean hay_pk = hasPK(availableCons);

             Debug.add("Verificando existencia de otros primary keys...");


            if(hay_pk){
                Debug.add("ERROR: No es posible declarar dos primary keys. En la table: "+tableCreate.name);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("ERROR: No es posible declarar dos primary keys. En la table: "+tableCreate.name);
                }

                return "ERROR";
            }
            //No hacemos ninguna revision si la column existe  pues esta siendo agregada en este momento.

            //Creamos constraint
            ArrayList<Columna> pkCols = new ArrayList<Columna>();
            pkCols.add(this.addedCol);
            // Verificamos que no existan values agregados, porque sino se agregaran values nulos a la primary key
            if(tableCreate.tuples.size()>0){
                Debug.add("ERROR: La constraint no puede ser agregada porque habran values nulos para la column: "+this.addedCol.name);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("ERROR: La constraint no puede ser agregada porque habran values nulos para la column: "+this.addedCol.name);
                }
                return "ERROR";
            }
            Debug.add("Creando constraint...");

            Constraint c = new Constraint(name,Constraint.PK,pkCols,tableCreate.name);
            //Verificamos que no exista una constraint del mismo type con el mismo name

            Debug.add("Verificando que el name de la constraint no exista...");

            boolean existeConstraint = getConstraint(c,this.availableCons);
            if(existeConstraint){
                    Debug.add("ERROR: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                    }
                    return "ERROR";
            }
            return c;
        }
        else if(ctx.REFERENCES()!=null){
            String name = ctx.fkNombre().getText();
            //Revisando que existan los name de las columns en la table local
            ArrayList<Columna> localCols = new ArrayList<Columna>();
            localCols.add(addedCol);
            //Obteniendo la table que referencia
            String refTable = ctx.idTabla().getText();

            Debug.add("Buscando table de referencia...");


            DBMetaData bd = DBMS.metaData.getDB(DBMS.currentDB);
            TableMetaData t = bd.findTable(refTable);
            if(t==null){
                    Debug.add("ERROR: No se encuentra la table de referencia: "+refTable);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: No se encuentra la table de referencia: "+refTable);
                    }
                    return "ERROR";
            }
            else{
                // Si encontramos la table Cargamos las constraint foraneas
                ArrayList<Constraint> foreignConstraints = Table.loadConstraints(refTable);
                ArrayList<Columna> fkCols = new ArrayList<Columna>();
                ArrayList<Columna> cols = Table.loadColums(refTable);
                //Buscamos las columns de la primary key de la table foranea
                ArrayList<Columna> columnasPrimary = new ArrayList<Columna>();
                for(Constraint c1: foreignConstraints){
                    if(c1.type == Constraint.PK){
                        columnasPrimary.addAll(c1.colsPkeys);
                    }
                }
                if(cols==null){
                    Debug.add("ERROR: No se encuentra el archivo de columns de la table de referencia: "+refTable);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: No se encuentra el archivo de columns de la table de referencia: "+refTable);
                    }
                    return "ERROR";
                }

                String text = ctx.refids().getText();
                //Buscamos las columns de la table foranea
                if(cols==null){
                    Debug.add("ERROR: No se encuentra el archivo de columns de la table de referencia: "+refTable);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: No se encuentra el archivo de columns de la table de referencia: "+refTable);
                    }
                    return "ERROR";
                }
                Columna found = getColumn(text,cols);
                if(found==null){
                    Debug.add("ERROR: No se encuentra la column: "+text+" En la table: "+refTable);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: No se encuentra la column: "+text+" En la table: "+refTable);
                    }

                    return "ERROR";
                }
                else{

                    Debug.add("Verificando que las columns pertenezcan a PK...");

                    //Si encontramos la column, verificamos que la column pertenezca al primary key de la table externa para garantizar que la llave sea unica
                    Columna encontrada2 = getColumn(found.name,columnasPrimary);
                    if(encontrada2==null){
                        Debug.add("ERROR: No se puede crear la llave foranea. La column de referecia: "+found.name+" No es unica ");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: No se puede crear la llave foranea. La column de referecia: "+found.name+" No es unica ");
                        }
                        return "ERROR";
                    }
                    //Agregamos la column
                    fkCols.add(found);

                }

                Debug.add("Verificando columns de la llave foranea...");

                //Una vez obtenidos los dos arreglos de columns verificamos que tengan el mismo tama�o
                if(fkCols.size()!=localCols.size()){
                    Debug.add("ERROR: El numero de columns locales y remotas en la foregin key debe ser el mismo");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: El numero de columns locales y remotas en la foregin key debe ser el mismo");
                    }
                    return "ERROR";
                }
                //Si los arreglos son iguales verificamos que tengan los mismos type
                for(int i =0;i<localCols.size();i++){
                	Columna local = localCols.get(i);
                	Columna foreign = fkCols.get(i);
                    if(local.type!=foreign.type){
                        Debug.add("ERROR: las columns: '"+local.name+", "+foreign.name+"' Deben tener el mismo type");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: las columns: '"+local.name+", "+foreign.name+"' Deben tener el mismo type");
                        }
                        return "ERROR";

                    }
                }

                Debug.add("Creando constraint...");

                //Si todas las columns tienen los mismo tipos, procedemos a crear la constraint
                Constraint c = new Constraint(name,Constraint.FK,localCols,fkCols,refTable,this.tableCreate.name);
                //Verificamos que no exista una constraint del mismo type con el mismo name
                boolean existeConstraint = getConstraint(c,this.availableCons);
                if(existeConstraint){
                        Debug.add("ERROR: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                        }
                        return "ERROR";
                }
                return c;
            }
        }
        else if(ctx.CHECK()!= null){
            String name= ctx.chNombre().getText();
            //Obtenemos la expresion del CHECK
            Object e = visit(ctx.expression());
            String expr = ctx.expression().getText();
            //Verificamos que no existan errores en la expresion para poder castear
            if(! (e instanceof Expression)){
                return "ERROR";

            }

            Debug.add("Creando constraint...");
            Expression e1 = (Expression)e;
            //Verificamos que las tuples actuales de la table cumplan con la restriccion
            Table temp = new Table();
            temp.name = tableCreate.name;
            temp.columns.addAll(tableCreate.columns);
            temp.tuples.addAll(tableCreate.tuples);
            Loader.iterator = new TableIterator(temp,0);
            for(int i =0; i<Loader.iterator.table.tuples.size();i++){
                try {
                if(!e1.isTrue()){
                    Debug.add("ERROR: no se puede insertar constraint <<"+name+">> porque algunas tuples no cumplen con la restriccion.");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: no se puede insertar constraint <<"+name+">> porque algunas tuples no cumplen con la restriccion.");
                    }
                    return "ERROR";
                }
                } catch (Exception ex) {
                    Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            Constraint c = new Constraint(name,Constraint.CHECK,e1,tableCreate.name,expr);
            //Verificamos que no exista una constraint del mismo type con el mismo name

             Debug.add("Buscando constraint repetida....");

            boolean existeConstraint = getConstraint(c,this.availableCons);

            if(existeConstraint){
                    Debug.add("ERROR: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: La constraint  "+c.name+" Ya fue declarada "+tableCreate.name);
                    }

                    return "ERROR";
            }
            return c;

        }

        return "ERROR";
	}
	
	//*******************************************************************************************************************************
	//revisar bien esta aprte
	@Override
	public Object visitMultiInsert(MultiInsertContext ctx) {
		this.tablesInsert = new ArrayList<Table>();
        this.regsInsert = new ArrayList<Integer>();
         if(DBMS.currentDB==null){
             Debug.add("Error: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
             if(!Frame.activateVerbose){
                 Frame.jTextArea2.setText("Error: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
             }

             return "Error";

         }
        int size = ctx.insertStmt().size();
        int i =0;
        for(ParseTree n: ctx.insertStmt()){
            Debug.add("Insertando registro #"+i);

            Object x = visit(n);
            if(x instanceof String){
                 Debug.add("\n Error en insert no."+getTotalregs());
                 if(!Frame.activateVerbose){
                     Frame.jTextArea2.setText("\n Error en insert no."+getTotalregs());
                 }

                 return "Error";
            }
            addRegInsert(this.tableCreate.name);
        }

         for(Table ti: this.tablesInsert){
             DBMetaData bd = DBMS.metaData.getDB(DBMS.currentDB);
             TableMetaData tm = bd.findTable(ti.name);
             tm.cantRegistros= tm.cantRegistros+getRegNumber(ti.name);
             ti.guardarTabla();
             DBMS.metaData.writeMetadata();
             DBMS.guardar();
         }
             Debug.add("Insert ("+size+") registros con exito.");
             if(!Frame.activateVerbose){
                 Frame.jTextArea2.setText("Insert ("+size+") registros con exito.");
             }

        return true;

    }
    public int getTotalregs(){
        int k =0;
        for(int a : this.regsInsert){
            k+=a;
        }
        return k;
    }
    public int getRegNumber(String s){
         int i =0;
          for(Table t: this.tablesInsert){
            if(t.name.equalsIgnoreCase(s)){
                return this.regsInsert.get(i);
            }
            i++;
        }
          return -1;
    }
    public void addRegInsert(String s){
        int i =0;
          for(Table t: this.tablesInsert){
            if(t.name.equalsIgnoreCase(s)){
                this.regsInsert.set(i, this.regsInsert.get(i)+1);
            }
            i++;
        }
    }
    public boolean containsTableInsert(String s){
        for(Table t: this.tablesInsert){
            if(t.name.equalsIgnoreCase(s)){
                return true;
            }
        }
        return false;
    }
    public Table getTableInsert(String s){
        for(Table t: this.tablesInsert){
            if(t.name.equalsIgnoreCase(s)){
                return t;
            }
        }
        return null;
    }

	//*******************************************************************************************************************************
	//revisar bien esta parte
    @Override
    public Object visitInsertStmt(InsertStmtContext ctx) {
    	ArrayList<Object> values = new ArrayList<Object>();
        ArrayList<Integer> tipos = new ArrayList<Integer>();
       //Cargamos la table donde se insertara la tuple
       String tableName = ctx.table().getText();
       if(this.tableCreate== null){
           this.tableCreate = Table.loadTable(tableName);
           this.tablesInsert.add(tableCreate);
           this.regsInsert.add(0);
       }
       else if (!tableName.equalsIgnoreCase(tableCreate.name) && ! containsTableInsert(tableName)){

           this.tableCreate = Table.loadTable(tableName);
           this.tablesInsert.add(tableCreate);
           this.regsInsert.add(0);
       }
       else if (tableName.equalsIgnoreCase(tableCreate.name)){

       }
       else if (!tableName.equalsIgnoreCase(tableCreate.name) &&  containsTableInsert(tableName)){

           this.tableCreate = getTableInsert(tableName);

       }
       else{
           this.tableCreate = null;
       }
       Table t = this.tableCreate;
           if(t==null){
           Debug.add("ERROR: No se encuentra la table: "+tableName);
           if(!Frame.activateVerbose){
               Frame.jTextArea2.setText("ERROR: No se encuentra la table: "+tableName);
           }

           return "ERROR";
       }
        //Verificamos si hay columns especificadas
       if(ctx.columnList()!=null){
           ArrayList<Columna> columnasEspecificadas= new ArrayList<Columna>();
           //Obtenemos las columns que se especificaron
           for(ParseTree n: ctx.columnList().colName()){
               String colName = n.getText();
               Columna existe = this.getColumn(colName, t.columns);
               if(existe == null){

                   Debug.add("ERROR: No se encuentra la Columna: <<"+colName+">> en la table: "+tableName);
                   if(!Frame.activateVerbose){
                       Frame.jTextArea2.setText("ERROR: No se encuentra la Columna: <<"+colName+">> en la table: "+tableName);
                   }

                   return "ERROR";
               }
               columnasEspecificadas.add(existe);

           }
           ArrayList<Integer> indicesColumnas = new ArrayList<Integer>();
           //Obtenemos los indices de las columns especificadas en la table
           for(int i =0;i<columnasEspecificadas.size();i++){
               int indice = t.getColumnIndex(columnasEspecificadas.get(i).name);
               indicesColumnas.add(indice);
           }
           //Llenamos los values con nulls inicialmente
           for(int i =0;i<t.columns.size();i++){
               values.add(null);
               tipos.add(t.columns.get(i).type);
           }
           // Verificamos que el numero de columns y el numero de values sean iguales
           if(ctx.valueList().val().size()!=columnasEspecificadas.size()){
                   Debug.add("ERROR: El numero de columns y de values especificados debe ser el mismo");
                   if(!Frame.activateVerbose){
                       Frame.jTextArea2.setText("ERROR: El numero de columns y de values especificados debe ser el mismo");
                   }

                   return "ERROR";
           }
           //Asignamos los values ingresado a los indices correctos en el arraylist values
           int i =0;
           for(ParseTree n: ctx.valueList().val()){
               Object valueType1 = visit(n);
               if(!(valueType1 instanceof Integer) ){
                   return "ERROR";
               }
               Object value=null;
               int valueType = (int) valueType1;
               if(valueType==Columna.CHAR_TYPE){
                   String v = n.getText();
                   v= v.substring(1);
                   v = v.substring(0,v.length()-1);
                   value = v;
               }
               else if (valueType == Columna.INT_TYPE){
                   value = Integer.parseInt(n.getText());
               }
               else if(valueType == Columna.FLOAT_TYPE){
                   value = Float.parseFloat(n.getText());
               }
               else if(valueType == Columna.DATE_TYPE){
                   String v = n.getText();
                   v= v.substring(1);
                   v = v.substring(0,v.length()-1);
                   value = LocalDate.parse(v);
               }

               values.set(indicesColumnas.get(i),value);
               tipos.set(indicesColumnas.get(i),valueType);
               i++;
           }
       }
       else{
           // Si no hay columns especificadas tomamos cada uno de los values y su type
           for(ParseTree n: ctx.valueList().val()){
               Object valueType1 = visit(n);

               if(!(valueType1 instanceof Integer) ){
                   return "ERROR";
               }
               Object value=null;
               int valueType = (int) valueType1;
               if(valueType==Columna.CHAR_TYPE){
                   String v = n.getText();
                   v= v.substring(1);
                   v = v.substring(0,v.length()-1);
                   value = v;
               }
               else if (valueType == Columna.INT_TYPE){
                   value = Integer.parseInt(n.getText());
               }
               else if(valueType == Columna.FLOAT_TYPE){
                   value = Float.parseFloat(n.getText());
               }
               else if(valueType == Columna.DATE_TYPE){
                   String v = n.getText();
                   v= v.substring(1);
                   v = v.substring(0,v.length()-1);
                   value = LocalDate.parse(v);
               }
               values.add(value);
               tipos.add(valueType);

           }
       }
           //Verificamos que el numero de values no sea mayor al numero de columns
           if(values.size()>t.Columna.size()){
               Debug.add("ERROR: El numero de values ingresados es mayor al numero de Columnas en la table: "+tableName);
               if(!Frame.activateVerbose){
                   Frame.jTextArea2.setText("ERROR: El numero de values ingresados es mayor al numero de Columnas en la table: "+tableName);
               }
               return "ERROR";
           }
           Tuple newTuple = new Tuple(new ArrayList<Object>(),t);
           //Llenamos los values con nulls
           for(Columna c: t.columns){
               newTuple.values.add(null);
           }

           // Comprobamos los tipos de los values con las columns
           for(int i =0;i<values.size();i++){
               int tipoValor = tipos.get(i);
               int tipoColumna =t.columns.get(i).type;
               // Si no son iguales... intentamos hacer conversion de tipos
               if(tipoValor != tipoColumna){
                   if(tipoValor == Columna.INT_TYPE){
                       if(tipoColumna== Column.CHAR_TYPE){
                           //Convertimos el entero a un char
                           String v = values.get(i).toString();
                           //Verificamos el tamanio del string
                           if(v.length()>t.columns.get(i).size){
                               Debug.add("ERROR: El tama�o del CHAR es mayor al definido en la Columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                               if(!Frame.activateVerbose){
                                   Frame.jTextArea2.setText("ERROR: El tama�o del CHAR es mayor al definido en la Columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                               }

                               return "ERRROR";
                           }

                           values.set(i, v);
                       }
                       else if (tipoColumna == Columna.FLOAT_TYPE){
                           float v = Float.valueOf(values.get(i).toString());
                           values.set(i, v);
                       }
                       else{
                           Debug.add("ERROR: Tipos invalidos en insercion de columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                           return "ERRROR";
                       }
                   }
                   else if (tipoValor == Columna.FLOAT_TYPE){
                       if(tipoColumna==Columna.INT_TYPE){

                           float v1 = Float.valueOf(values.get(i).toString());
                           int v = (int)v1;  //Convertimos el float al int trucando decimales
                           values.set(i, v);


                       }
                       else if (tipoColumna == Columna.CHAR_TYPE){
                           String v = values.get(i).toString();
                           //Verificamos el tamanio del string
                           if(v.length()>t.columns.get(i).size){
                               Debug.add("ERROR: El tama�o del CHAR es mayor al definido en la columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                               if(!Frame.activateVerbose){
                                   Frame.jTextArea2.setText("ERROR: El tama�o del CHAR es mayor al definido en la Columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                               }
                               return "ERRROR";
                           }

                           values.set(i, v);
                       }
                       else{
                           Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                           return "ERRROR";
                       }

                   }
                   else if (tipoValor == Columna.DATE_TYPE){
                       if(tipoColumna == Columna.CHAR_TYPE){
                           String v = values.get(i).toString();
                           //Verificamos el tamanio del string
                           if(v.length()>t.columns.get(i).size){
                               Debug.add("ERROR: El tama�o del CHAR es mayor al definido en la columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                               if(!Frame.activateVerbose){
                                   Frame.jTextArea2.setText("ERROR: El tama�o del CHAR es mayor al definido en la Columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                               }

                               return "ERRROR";
                           }
                           values.set(i, v);



                       }
                       else{
                           Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                           return "ERRROR";
                       }
                   }
                   else if (tipoValor == Columna.CHAR_TYPE){
                        if(tipoColumna == Columna.INT_TYPE){
                           String v = values.get(i).toString();
                           try{
                               int v1 = Integer.parseInt(v);

                               values.set(i, v1);
                           }

                           catch(Exception e){
                           Debug.add("ERROR: Tipos invalidos en insercion de columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                               return "ERRROR";
                           }

                        }
                        else if(tipoColumna == Columna.FLOAT_TYPE){
                           String v = values.get(i).toString();
                           try{
                               float v1 = Float.parseFloat(v);
                               values.set(i, v1);
                           }

                           catch(Exception e){
                           Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                               return "ERRROR";
                           }
                        }
                        else if (tipoColumna == Columna.DATE_TYPE){
                           try{
                               LocalDate d = LocalDate.parse(values.get(i).toString());
                               values.set(i, d);
                           }
                           catch(Exception e){
                           Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                               return "ERRROR";
                           }
                        }
                        else{
                           Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                           }
                           return "ERRROR";
                        }
                   }

               }
               else{
                   values.set(i, values.get(i));
               }


           }
           // Si no hubieron errores agregamos los values a la nueva tuple
           for(int i =0;i<values.size();i++){
               newTuple.values.set(i, values.get(i));

           }



           // Comprobamos las constraints de los values
           Table tempTabla = new Table();
           tempTabla.name = t.name;
           tempTabla.columns.addAll(t.columns);
           Loader.iterator = new TableIterator(tempTabla,0);

           Debug.add("Verificando restricciones en la insercion...");

           for(Constraint cons: t.constraints){
               if(cons.type==Constraint.PK){
                    ArrayList<Integer> indices = new ArrayList<Integer>();
                    ArrayList<Object> pkeyValues = new ArrayList<Object>();
                   //Revisamos que las columns de la constraint no sean nulas
                   for(Columna c:cons.colsPkeys){
                       int iValor = t.getColumnIndex(c.name);
                       indices.add(iValor);
                       Object v = newTuple.values.get(iValor);
                       pkeyValues.add(v);
                       if(v==null){
                           Debug.add("ERROR: la Columna <<"+c.name+">> no puede tener value nulo por la constraint <<"+cons.name+">>");
                           if(!Frame.activateVerbose){
                               Frame.jTextArea2.setText("ERROR: la Columna <<"+c.name+">> no puede tener value nulo por la constraint <<"+cons.name+">>");
                           }

                            return "ERRROR";
                       }

                   }


                   //Revisamos si ya existe el value en las tuples de la table
                   boolean yaExiste = t.containsValue(pkeyValues, indices);
                   if(yaExiste){
                       Debug.add("ERROR: la restriccion <<"+cons.name+">> esta siendo violada con la insercion. Debe existir value unico por la PK: <<"+cons.name+">>");
                       if(!Frame.activateVerbose){
                           Frame.jTextArea2.setText("ERROR: la restriccion <<"+cons.name+">> esta siendo violada con la insercion. Debe existir value unico por la PK: <<"+cons.name+">>");
                       }

                        return "ERRROR";
                   }

               }
               else if (cons.type==Constraint.FK){
                   //Cargamos la table foranea
                   Table foreignTable = Table.loadTable(cons.foreignTable);
                   // Obtenemos los values de las columns con la llave foranea en la tuple a insertar
                   ArrayList<Object> valoresInsert = new ArrayList<Object>();
                   for(Columna c: cons.localFKs){
                       int indice = t.getColumnIndex(c.name);
                       Object value = newTuple.values.get(indice);
                       valoresInsert.add(value);

                   }

                   //Recorremos cada Columna referenciada y verificamos que el value de la column exista o sea nulo
                   int i =0;
                   ArrayList<Integer> indices = new ArrayList<Integer>();
                   for(Columna c:cons.refKeys){
                       //Obtenemos el indice de la column de referencia
                       int indice = foreignTable.getColumnIndex(c.name);
                       indices.add(indice);
                       Object valorBusqueda = valoresInsert.get(i);
                       if(valorBusqueda == null){ //Si es nulo reportamos CONTINUAMOS
                           continue;}
                       i++;
                   }
                   boolean encontrado = foreignTable.containsValue(valoresInsert, indices);
                   if(!encontrado){
                       String s="";
                        for(Object t2: valoresInsert){
                            if(t2!=null){
                                s+=t2.toString()+", ";
                            }
                            else{s+="null, ";}

                        }
                       Debug.add("ERROR: La llave <<"+s+">> no existe en la table de referencia: "+foreignTable.name);
                       if(!Frame.activateVerbose){
                           Frame.jTextArea2.setText("ERROR: La llave <<"+s+">> no existe en la table de referencia: "+foreignTable.name);
                       }

                        return "ERRROR";
                   }
               }
               else if(cons.type==Constraint.CHECK){
                   //Creamos table temporal con contructor que no guarda archivo serializado
                   Table temp = new Table();
                   temp.name="temp";
                   temp.columns=t.columns;

                   temp.tuples.add(newTuple);
                   Loader.iterator = new TableIterator(temp,0);
                   //Obtenemos la expresion de la constraint
                   Expression e = cons.expr;
                   try {
                       //No hacemos ningun for porque solo queremos evaluar la tuple que vamos a insertar
                       if(!e.isTrue()){
                           return "ERRROR";

                       }
                   } catch (Exception ex) {
                       Debug.add("\n ERROR: El value de la tuple: "+newTuple.toString() +" no cumple con la restriccion ' "+cons.exprText+" ' .");
                       return "ERROR";
                   }


               }


           }
       //Guardamos la table y la metaData
       t.tuples.add(newTuple);
       return true;
    }
    
    //*******************************************************************************************************************************
	//revisar bien esta parte
    @Override
    public Object visitUpdateStmt(UpdateStmtContext ctx) {
    	if(DBMS.currentDB==null){
            Debug.add("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            }
            return "ERROR";

        }
        String tableName = ctx.table().getText();
        Table t = Table.loadTable(tableName);

        if(t==null){
            Debug.add("ERROR: No se encuentra la table: "+tableName);
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("ERROR: No se encuentra la table: "+tableName);
            }
            return "ERROR";
        }

        this.availableCols = new ArrayList<Columna>();
        this.availableCols.addAll(t.columns);
        ArrayList<Columna> columnasEspecificadas= new ArrayList<Columna>();
        ArrayList<Object> values = new ArrayList<Object>();
        //Obtenemos las columns que se especificaron
        int i =0;
            Debug.add("Obteniendo columns especificadas...");

        for(ParseTree n: ctx.columnsUpdate()){
            String colName = n.getText();
            Columna existe = this.getColumn(colName, t.columns);
            if(existe == null){
                Debug.add("ERROR: No se encuentra la Column: <<"+colName+">> en la table: "+tableName);
                if(!Frame.activateVerbose){
                    Frame.jTextArea2.setText("ERROR: No se encuentra la Column: <<"+colName+">> en la table: "+tableName);
                }
                return "ERROR";
            }
             //Verificamos los tipos del value y la column actual

            Object tipoValor1 = visit(ctx.val(i));
            if(tipoValor1 instanceof String){
                return "ERROR";
            }
            Integer tipoValor2 = (Integer) tipoValor1;
            if(tipoValor2 == -1){
                values.add(null);
            }
            else{
                values.add(ctx.val(i).getText());
            }

            int tipoValor = (Integer) tipoValor1;
            int tipoColumna= existe.type;
            Object value = null;
            if(tipoValor==Columna.CHAR_TYPE){
                String v = ctx.val(i).getText();
                v= v.substring(1);
                v = v.substring(0,v.length()-1);
                value = v;
            }
            else if (tipoValor == Columna.INT_TYPE){
                value = Integer.parseInt(ctx.val(i).getText());
            }
            else if(tipoValor == Columna.FLOAT_TYPE){
                value = Float.parseFloat(ctx.val(i).getText());
            }
            else if(tipoValor == Columna.DATE_TYPE){
                value = LocalDate.parse(ctx.val(i).getText());
            }
            values.set(i,value);
            // Si no son iguales... intentamos hacer conversion de tipos

            Debug.add("Verificando tipos...");

            if(tipoValor != tipoColumna){
                if(tipoValor == Columna.INT_TYPE){
                    if(tipoColumna== Columna.CHAR_TYPE){
                        //Convertimos el entero a un char
                        String v = values.get(i).toString();
                        //Verificamos el tamanio del string
                        if(v.length()>t.columns.get(i).size){
                            Debug.add("ERROR: El tama�o del CHAR es mayor al definido en la column <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: El tama�o del CHAR es mayor al definido en la column <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                            }

                            return "ERRROR";
                        }

                        values.set(i, v);
                    }
                    else if (tipoColumna == Columna.FLOAT_TYPE){
                        float v = Float.valueOf(values.get(i).toString());
                        values.set(i, v);
                    }
                    else{
                        Debug.add("ERROR: Tipos invalidos en insercion de column: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                        }
                        return "ERRROR";
                    }
                }
                else if (tipoValor == Columna.FLOAT_TYPE){
                    if(tipoColumna==Columna.INT_TYPE){
                        float v1 = Float.valueOf(values.get(i).toString());
                        int v = (int)v1;  //Convertimos el float al int trucando decimales
                        values.set(i, v);


                    }
                    else if (tipoColumna == Columna.CHAR_TYPE){
                        String v = values.get(i).toString();
                        //Verificamos el tamanio del string
                        if(v.length()>t.columns.get(i).size){
                            Debug.add("ERROR: El tama�o del CHAR es mayor al definido en la column <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: El tama�o del CHAR es mayor al definido en la Columna <<"+t.columns.get(i).name+">>. Se encontro: "+v.length()+", "+t.columns.get(i).size);
                            }

                            return "ERRROR";
                        }

                        values.set(i, v);
                    }
                    else{
                        Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                        }
                        return "ERRROR";
                    }

                }
                else if (tipoValor == Columna.DATE_TYPE){
                    if(tipoColumna == Columna.CHAR_TYPE){
                        String v = values.get(i).toString();
                        //Verificamos el tamanio del string
                        if(v.length()>t.columns.get(i).size){
                            Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            }
                            return "ERRROR";
                        }
                        values.set(i, v);



                    }
                    else{
                        Debug.add("ERROR: Tipos invalidos en insercion de column: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                        }
                        return "ERRROR";
                    }
                }
                else if (tipoValor == Columna.CHAR_TYPE){
                     if(tipoColumna == Columna.INT_TYPE){
                        String v = values.get(i).toString();
                        try{
                            int v1 = Integer.parseInt(v);

                            values.set(i, v1);
                        }

                        catch(Exception e){
                            Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            }
                            return "ERRROR";
                        }

                     }
                     else if(tipoColumna == Columna.FLOAT_TYPE){
                        String v = values.get(i).toString();
                        try{
                            float v1 = Float.parseFloat(v);
                            values.set(i, v1);
                        }

                        catch(Exception e){
                            Debug.add("ERROR: Tipos invalidos en insercion de column: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            }
                            return "ERRROR";
                        }
                     }
                     else if (tipoColumna == Columna.DATE_TYPE){
                        try{
                            LocalDate d = LocalDate.parse(values.get(i).toString());
                            values.set(i, d);
                        }
                        catch(Exception e){
                            Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            }
                            return "ERRROR";
                        }
                     }
                     else{
                            Debug.add("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: Tipos invalidos en insercion de Columna: <<"+t.columns.get(i).name+">>. Se encontro: "+t.columns.get(i).getStringType(tipoValor)+", "+t.columns.get(i).getStringType(tipoColumna));
                            }
                        return "ERRROR";
                     }
                }

            }
            else{
                values.set(i, values.get(i));
            }

            columnasEspecificadas.add(existe);
            i++;

        }
        ArrayList<Integer> indicesColumnas = new ArrayList<Integer>();
        //Obtenemos los indices de las columns especificadas en la table
        for(int j =0;j<columnasEspecificadas.size();j++){
            int indice = t.getColumnIndex(columnasEspecificadas.get(j).name);
            indicesColumnas.add(indice);
        }

        //Obtenemos la expresion WHERE
        Object where1 = visit(ctx.expression());
        if(where1 instanceof String){
            return "ERROR";
        }
        Expression where = (Expression) where1;

        //Creamos el iterator para la table que se creo
        Loader.iterator = new TableIterator(t,0);
        //Recorremos cada una de las tuples en el iterator y verificamos la condicion.
        int numModificadas =0;
        ArrayList<Tuple> tuplasWhere = new ArrayList<Tuple>();
        for(int j =0;j<Loader.iterator.table.tuples.size();j++){
            Tuple tuplaActual = Loader.iterator.table.tuples.get(j);
            try {
                if(where.isTrue()!= null && where.isTrue()){
                   numModificadas++;
                   t.actualizarTupla(values, indicesColumnas, j);
                   tuplasWhere.add(tuplaActual);
                }
            } catch (Exception ex) {
                Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
            }
            Loader.iterator.siguiente(); //Movemos el iterator a la siguiente tuple
        }

        Debug.add("Verificando restricciones en la actualizacion...");

        //Verificamos contraints en cada una de las tuples de la table
        for(Tuple currentTupla: tuplasWhere){

            for(Constraint cons: t.constraints){
                if(cons.type== Constraint.PK){
                    ArrayList<Object> checkValues = new ArrayList<Object>();
                    ArrayList<Integer> indexChecks = new ArrayList<Integer>();
                    for(Columna c: cons.colsPkeys){
                        int indice = t.getColumnIndex(c.name);
                        Object val=currentTupla.values.get(indice);
                        checkValues.add(val);
                        indexChecks.add(indice);
                    }
                    //Revisamo si hay values nulos
                    boolean contieneNulls = t.hasNullValues(indexChecks,currentTupla);
                    if(contieneNulls){
                        Debug.add("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque crea values nulos para llave primaria");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque crea values nulos para llave primaria");
                        }
                        return "ERROR";
                    }
                    boolean duplicada = t.estaDuplicado(checkValues, indexChecks);
                    if(duplicada){
                        Debug.add("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque crea values duplicates de una llave primaria");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque crea values duplicates de una llave primaria");
                        }
                        return "ERROR";
                    }

                }
                else if (cons.type == Constraint.FK){
                    Table foreign = Table.loadTable(cons.foreignTable);
                    //Obtenemos los values de la tuple actual
                    ArrayList<Object> checkValues = new ArrayList<Object>();
                    ArrayList<Integer> localIndexes = new ArrayList<Integer>();
                    for(Columna local: cons.localFKs){
                        int indice = t.getColumnIndex(local.name);
                        localIndexes.add(indice);
                        Object v = currentTupla.values.get(indice);
                        checkValues.add(v);
                    }
                    //Obtenemos los indices de la tuple foranea para buscar los values de la tuple local
                    ArrayList<Integer> indexValues = new ArrayList<Integer>();
                    for ( Columna foreignCol: cons.refKeys){
                        int index = foreign.getColumnIndex(foreignCol.name);
                        indexValues.add(index);

                    }

                    //Revisamos si hay values nulos
                   /* boolean contieneNulls = t.hasNullValues(localIndexes,currentTupla);
                    if(contieneNulls){
                        Frame.jTextArea2.setText("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque crea values nulos para llave foranea");
                        return "ERROR";
                    }  */
                    boolean contieneValores = foreign.containsValue(checkValues, indexValues);
                    if(!contieneValores){
                        Debug.add("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque no se encuentra el value de la llave foranea");
                        if(!Frame.activateVerbose){
                            Frame.jTextArea2.setText("ERROR: la actualizacion viola la restriccion <<"+cons.name+">> porque no se encuentra el value de la llave foranea");
                        }
                        return "ERROR";

                    }
                }
                else if(cons.type == Constraint.CHECK){
                    Table temp = new Table();
                    temp.name = t.name;
                    temp.columns.addAll(t.columns);
                    temp.tuples.add(currentTupla);
                    Loader.iterator = new TableIterator(temp,0);
                    try {
                        if( !cons.expr.isTrue()){
                            Debug.add("ERROR: la actualizacion viola la restriccion <<"+cons.name+">>.");
                            if(!Frame.activateVerbose){
                                Frame.jTextArea2.setText("ERROR: la actualizacion viola la restriccion <<"+cons.name+">>.");
                            }
                            return "ERROR";
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }

        Debug.add("Verificando integridad referencial de la table...");

        //Obtenemos refs a la table
        ArrayList<Constraint> refs = getReferences(t.name);

        for(Constraint refCons: refs){
            //Para cada refs primero cargamos la table local de la referencia
            Table localTable = Table.loadTable(refCons.table);
           //Luego, para cada tuple de la table obtenemos las columns locales y sus values con localfkey
            for(Tuple tuple:localTable.tuples){
                ArrayList<Integer> searchIndex = new ArrayList<Integer>();
                ArrayList<Integer> indexT = new ArrayList<Integer>();
                ArrayList<Object> currentValues = new ArrayList<Object>();
                for(Columna col: refCons.localFKs){
                    int index = localTable.getColumnIndex(col.name);
                    searchIndex.add(index);
                }
                for(int iv: searchIndex){
                    currentValues.add(tuple.values.get(iv));

                }
                for(Columna c2: refCons.refKeys){
                    int index2 = t.getColumnIndex(c2.name);
                    indexT.add(index2);

                }
                  // Revisamos si los values de la tuple actual existen en los values de la table de referencia (i.e la mencionada en UPDATE tableName)
                boolean found = t.containsValue(currentValues, indexT);
                if(found==false){
                    Debug.add("ERROR: La restriccion <<"+refCons.name+">> de la table <<"+localTable.name+">>esta siendo violdada con la actualizacion porque se cambio el value de una tuple referenciada.");
                    if(!Frame.activateVerbose){
                        Frame.jTextArea2.setText("ERROR: La restriccion <<"+refCons.name+">> de la table <<"+localTable.name+">>esta siendo violdada con la actualizacion porque se cambio el value de una tuple referenciada.");
                    }
                    return "ERROR";
                }

            }

        }
        //Guardamos la tables
        t.guardarTabla();
        Debug.add("Update Finalizado. Se modificaron: "+numModificadas+" registros");
        if(!Frame.activateVerbose){
            Frame.jTextArea2.setText("Update Finalizado. Se modificaron: "+numModificadas+" registros");
        }
        return true;
    }
    
    //*******************************************************************************************************************************
  	//revisar bien esta parte
    @Override
    public Object visitDeleteStmt(DeleteStmtContext ctx) {
    	if(DBMS.currentDB==null){
            Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            return "ERROR";

        }
        //Para cuando no tiene where
        String tablename = ctx.table().getText();
        Table t = Table.loadTable(tablename);
        Loader.iterator = new TableIterator(t,0);
        int numDeleted = 0;



        if(ctx.children.get(2).getChildCount() == 3){
            for(Loader.iterator.indiceActual = 0; Loader.iterator.indiceActual< Loader.iterator.table.tuples.size(); Loader.iterator.indiceActual++){
                //Se revisa que no haya referencia a esta column antes de eliminar
                Loader.iterator.deleteValue();
                numDeleted++;
            }
            boolean isOk = foreignDeleted(t);
            if(Frame.activateVerbose){
                Frame.jTextArea2.append("Verificandoo llaves foraneas para eliminacion...");
            }
            if(isOk){
                t.guardarTabla();
                DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
                TableMetaData t1 = d.findTable(tablename);
                t1.cantRegistros = 0;
                DBMS.metaData.writeMetadata();
                DBMS.guardar();
            }
            else{
                    Debug.add("\n ERROR: No se puede eliminar la fila debido a que existen refs a una de sus columns");
                    return "Error";
            }

        }
        //para cuando tiene where
        else if(ctx.children.get(2).getChildCount() == 5){
            for(Loader.iterator.indiceActual = 0; Loader.iterator.indiceActual< Loader.iterator.table.tuples.size(); Loader.iterator.indiceActual++){
                //booleana para determinar si se cumple la condicion para cada tuple
                Object isTrueHere = ctx.expression();
                //Si es un string es un error
                if(isTrueHere instanceof String){
                    return "ERROR";
                }
                //Si no es string se castea
                Expression pass = (Expression)isTrueHere;

                try {
                    //Se revisa que no haya referencia a esta column antes de eliminar
                    if(pass.isTrue() != null ||pass.isTrue()){
                        Loader.iterator.deleteValue();
                        numDeleted++;

                    }
                } catch (Exception ex) {
                    Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            boolean isOk = foreignDeleted(t);
            if(Frame.activateVerbose){
                Frame.jTextArea2.append("Verificando llaves foraneas para eliminacion...");
            }

            if(isOk){
                t.guardarTabla();
                DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
                TableMetaData t1 = d.findTable(tablename);
                t1.cantRegistros = 0;
                DBMS.metaData.writeMetadata();
                DBMS.guardar();
            }
            else{

                    Debug.add("\n ERROR: No se puede eliminar la fila debido a que existen refs a una de sus columns");
                    return "Error";
            }
        }


        return super. visitDeleteStmt(ctx);
    }

    //*******************************************************************************************************************************
  	//revisar bien esta parte
    @Override
    public Object visitShowDbStmt(ShowDbStmtContext ctx) {
    	//1. Especificar el directorio donde se debe ir a buscar el archivo de metadata
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        //2. Abrir el archivo de metadata
        File directorio  = new File(currentDir+"/DBMS/master.dat");
        BufferedReader reader = null;
        String [] nombres = null;
        int indiceDosPuntos = 0;
        ArrayList<String> nombresDB = new ArrayList<String>();

        //3. Leer el archivo de metadata
        try{
            reader = new BufferedReader(new FileReader(directorio));
            String text = null;
            while ((text = reader.readLine()) != null) {
                nombres = text.split(" ");
                indiceDosPuntos = java.util.Arrays.asList(nombres).indexOf("Datos:");
                if(indiceDosPuntos>0)
                {
                    //4. Pasar cada dato referente al name de las bases de datos creadas
                    nombresDB.add(nombres[indiceDosPuntos+1]);
                }
                indiceDosPuntos = 0;

            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        //5. Mostrar el string creado
        for(int i = 0; i< nombresDB.size(); i++)
        {
            System.out.println(nombresDB.get(i));
        }
        /*Prueba para mostrar las bases de datos*/
        ArrayList<String> tituloColumnas = new ArrayList<String>();
        tituloColumnas.add("Databases: ");
        ArrayList<ArrayList<String>> filas = new ArrayList<ArrayList<String>>();
        for(int i = 0; i< nombresDB.size(); i++)
        {
            ArrayList<String> tempFila = new ArrayList<String>();
            tempFila.add(nombresDB.get(i));
            filas.add(tempFila);
        }
        Resultados results = new Resultados(tituloColumnas, filas);
        for(Component i: Frame.forResults.getComponents()){
            Frame.forResults.remove(i);
        }
        Frame.forResults.add(results);
        Frame.forResults.revalidate();
        Frame.forResults.repaint();
        return super.visitShowDbStmt(ctx);
    }

    //*******************************************************************************************************************************
  	//revisar bien esta parte
    @Override
    public Object visitDropTableStmt(DropTableStmtContext ctx) {
    	if(DBMS.currentDB==null){
            Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            return "ERROR";

        }
        /*Borrar implica:
        1. Ver que base de datos estoy usando. HOLA PABLOOOOO
        2. Buscar la table si existe
        3. Borrar la table en la metadata
        4. Borrar en el archivo serealizable - deleteAllFilesWithName*/
        String dbActual = DBMS.currentDB;
        String tablename = ctx.ID().getText();
        //Se revisa si existe una dependecia con esta table antes de ser eliminada
        ArrayList<Constraint> constreintsHere = getAllForeignConstraints();
        for(Constraint c: constreintsHere){
            if(c.foreignTable.equals(tablename)){
                Frame.jTextArea2.setText("ERROR: Existe una referencia a la table "+tablename);
                return "ERROR";
            }
        }
        //Verificamos si hay una DB en uso
        if(DBMS.currentDB==null){
            Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            return "ERROR";
        }
        //se toma la base de datos
        DBMetaData d = DBMS.metaData.getDB(DBMS.currentDB);
        TableMetaData t = d.findTable(tablename);
        //Se ve que existan el objeto
        if(t == null){
            Frame.jTextArea2.setText("ERROR: No existe ninguna table con el name dado.");
            return "ERROR";
        }
        if(Frame.activateVerbose){
                Frame.jTextArea2.append("Borrando la table "+tablename);
        }
        //Se borra la table
        d.tables.remove(t);
        d.writeMetadata();
        DBMS.metaData.writeMetadata();
        DBMS.guardar();
        //se elimnan los serealizados
        String currentDir = System.getProperty("user.dir");
        File f1  = new File(currentDir+"/DBMS/"+dbActual+"/"+tablename+"_constraints.ser");
        File f2  = new File(currentDir+"/DBMS/"+dbActual+"/"+tablename+"_cols.ser");
        File f3  = new File(currentDir+"/DBMS/"+dbActual+"/"+tablename+".ser");
        if(f1.exists() && f2.exists() && f3.exists())
        {
            System.gc();
            f1.delete();
            f2.delete();
            f3.delete();
        }
        if(Frame.activateVerbose){
                Frame.jTextArea2.append("Table '"+tablename+ "' Borrada existosamente.");
        }
        else{
        Frame.jTextArea2.setText("Table '"+tablename+ "' Borrada existosamente.");
        }
        return super.visitDropTableStmt(ctx);
    }
    
    @Override
    public Object visitAndexpr(AndexprContext ctx) {
    	if(ctx.children.size()==1){
            return visit(ctx.factor());

        }
        else{
            Object l =  visit(ctx.andexpr());
            Object r=  visit(ctx.factor());
            if((l instanceof Expression)&&(r instanceof Expression)){
                Expression l1 = (Expression)l;
                Expression r1 = (Expression) r;
                AndExpression e = new AndExpression(l1,r1);
                return e;
            }
            else{
                return "ERROR";
            }
        }
    }

    //*******************************************************************************************************************************
  	//revisar bien esta parte
    @Override
    public Object visitUseDbStmt(UseDbStmtContext ctx) {
    	//1. Especificar el directorio donde se debe ir a buscar el archivo de metadata
        Debug.add("Bucando Directorio de Base de Datos...");
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        //2. Abrir el archivo de metadata
        File directorio  = new File(currentDir+"/DBMS/master.dat");
        BufferedReader reader = null;
        String [] nombres = null;
        int indiceDosPuntos = 0;
        ArrayList<String> nombresDB = new ArrayList<String>();
        //3. Leer el archivo de metadata
        Debug.add("Bucando Archivo de Metadata...");
        try{
            reader = new BufferedReader(new FileReader(directorio));
            String text = null;
            while ((text = reader.readLine()) != null) {
                nombres = text.split(" ");
                indiceDosPuntos = java.util.Arrays.asList(nombres).indexOf("Datos:");
                if(indiceDosPuntos>0)
                {
                    //4. Pasar cada dato referente al name de las bases de datos creadas
                    nombresDB.add(nombres[indiceDosPuntos+1]);
                }
                indiceDosPuntos = 0;

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //5. Mostrar el string creado
        String dbname = ctx.ID().getText();
        boolean existsDb = false;
        for(int i = 0; i< nombresDB.size(); i++)
        {
           if(dbname.equalsIgnoreCase(nombresDB.get(i)))
           {
               existsDb = true;
               break;
           }
        }
        if(existsDb)
        {
            DBMS.currentDB = dbname;
            Debug.add("AVISO: Se esta usando la base de datos llamada: "+dbname);
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("AVISO: Se esta usando la base de datos llamada: "+dbname);
            }

            System.out.println("Si existe la base de datos");
        }
        else
        {
            Debug.add("ERROR: No existe la base de datos: "+dbname);
            if(!Frame.activateVerbose){
                Frame.jTextArea2.setText("ERROR: No existe la base de datos: "+dbname);
            }
            return "ERROR";
        }
        return super.visitUseDbStmt(ctx);
    }

    //*******************************************************************************************************************************
  	//revisar bien esta parte
    @Override
    public Object visitCompareExpr(CompareExprContext ctx) {
    	String op = ctx.rel_op().getText();
        if(!op.equals("=")&&!op.equals("<>")&&!op.equals(">")&&!op.equals("<")&&!op.equals(">=")&&!op.equals("<=")){
            Frame.jTextArea2.setText("Error, operando invalido en expresion: "+op);
            return "ERROR";
        }
        else{
            Object l = visit(ctx.term(0));
            Object r = visit(ctx.term(1));
            if((l instanceof Term)&& (r instanceof Term)){
                Term l1 = (Term) l;
                Term r1 = (Term)r;



                //Verificamos los tipos
                if(l1.type == Term.INT_TYPE && r1.type== Term.CHAR_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'INT' , 'CHAR'");
                    return "ERROR";
                }
                if(l1.type == Term.INT_TYPE && r1.type == Term.DATE_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'INT' , 'Date'");
                    return "ERROR";
                }
                if(l1.type == Term.CHAR_TYPE && r1.type == Term.INT_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'CHAR' , 'INT'");
                    return "ERROR";
                }
                if(l1.type == Term.DATE_TYPE && r1.type == Term.INT_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'Date' , 'INT'");
                    return "ERROR";
                }
                if(l1.type == Term.FLOAT_TYPE && r1.type == Term.CHAR_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'INT' , 'CHAR'");
                    return "ERROR";
                }
                if(l1.type == Term.FLOAT_TYPE && r1.type== Term.DATE_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'INT' , 'Date'");
                    return "ERROR";
                }
                if(l1.type == Term.CHAR_TYPE && r1.type == Term.FLOAT_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'CHAR' , 'INT'");
                    return "ERROR";
                }
                if(l1.type == Term.DATE_TYPE && r1.type == Term.FLOAT_TYPE ){
                    Frame.jTextArea2.setText("Error, Tipos invalidos en comparacion: 'Date' , 'INT'");
                    return "ERROR";
                }

                CompareExpression e = new CompareExpression(l1,r1,op);
                return e;

            }
             else{
                return "ERROR";
            }
        }

    }

	//*******************************************************************************************************************************
	//revisar bien esta parte
    @Override
    public Object visitSelectStmt(SelectStmtContext ctx) {
    	if(DBMS.currentDB==null){
            Frame.jTextArea2.setText("ERROR: No existe ninguna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            return "ERROR";

        }
        //Primero revisamos las tables especificadas en el from
        ArrayList<Table> tablasFrom = new ArrayList<Table>();
        for(ParseTree n: ctx.table()){
            String tableName = n.getText();
            Table t = Table.loadTable(tableName);
            if(t==null){
                Frame.jTextArea2.setText("ERROR: No se encuentra la table: "+tableName);
                return "ERRROR";
            }
            else{
                tablasFrom.add(t);
            }
        }
        //Una vez tenemos todas las tables calculamos el producto cartesiano de ellas
        Table temp = cartesianProduct(tablasFrom);

        Loader.iterator = new TableIterator(temp,0);
        //Verificamos que existan las columns del where en la table temporal agregandolas a las columns disponibles
        this.availableCols = new ArrayList<Columna>();
        this.availableCols.addAll(temp.columns);
        ArrayList<Tuple> resultSelect = new ArrayList<Tuple>();
        //Inicialmente agregamos al resultado toda la table, si hay where la vaciamos
        boolean hayWhere = false;
        if(ctx.WHERE()!=null){
            hayWhere = true;
            Object where1 = visit(ctx.expression());
            if(where1 instanceof String){
                return "ERROR";
            }
            Expression where = (Expression) where1;

            for(int j =0;j<Loader.iterator.table.tuples.size();j++){
                Tuple tuplaActual = Loader.iterator.table.tuples.get(j);
                try {
                    if(where.isTrue()!=null && where.isTrue()){
                        resultSelect.add(tuplaActual);

                    }
                } catch (Exception ex) {
                    Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
                }
                Loader.iterator.siguiente(); //Movemos el iterator a la siguiente tuple
            }
        }
        if(!hayWhere){
            resultSelect = temp.tuples;
        }
        //Verificamos que existan las columns del select en la table temporal
        ArrayList<Columna> colsSelect = new ArrayList<Columna>();
        if(ctx.selectList()!=null){
            for(ParseTree n: ctx.selectList().ID()){
                String col = n.getText();
                Columna existe = getColumn(col,temp.columns);
                colsSelect.add(existe);
                if(existe == null){
                    Frame.jTextArea2.setText("ERROR: No se encuentra la Columna."+col);
                    return "ERROR";
                }

            }
        }
        else{
            colsSelect.addAll(temp.columns);
        }
        //Obtenemos los indices de las columns del select
        ArrayList<Integer> indexSelect = new ArrayList<Integer>();
        for(Columna c: colsSelect){
            int indice = temp.getColumnIndex(c.name);
            indexSelect.add(indice);

        }
        //Agregamos al resultado final solo las columns del select
        ArrayList<Tuple> resultadoFinal = new ArrayList<Tuple>();
        for(Tuple t : resultSelect){
            Tuple tfinal = new Tuple(temp);
            for(int i:indexSelect){
                Object value = t.values.get(i);
                tfinal.values.add(value);


            }
            resultadoFinal.add(tfinal);

        }
        ArrayList<Orders> orderBy = new ArrayList();
        temp2=new Table();
            temp2.name = temp.name;
            temp2.columns.addAll(colsSelect);
            temp2.tuples =resultadoFinal;
            //Se revisa si existen ORDER BY y de ser asi se toma cada uno sus datos  - resultadoFinal

        if(ctx.orderExpr()!=null){
            if(Frame.activateVerbose){
                Frame.jTextArea2.append("Ordenando las columns...");
            }

            for(OrderTermContext n: ctx.orderExpr().orderTerm()){
                String colName = n.colName().getText();
                Columna a = getColumn(colName, temp2.columns);
                if(a == null){
                    Frame.jTextArea2.setText("ERROR: No se encuentra la column."+colName);
                    return "ERROR";
                }
                String order = "";
                if(n.ASC()==null && n.DESC()==null){
                    order = "ASC";
                }
                else if(n.ASC()!=null){
                    order = "ASC";
                }
                else if(n.DESC()!=null){
                    order = "DESC";
                }
                Orders oN = new Orders(colName,order);
                orderBy.add(oN);
            }
            ComparatorColumn com = new ComparatorColumn(temp2, orderBy);
            com.order();
        }
        //Agregamos el resultado al JTable (pendiente)
        ArrayList<String> columnsName = new ArrayList();
        ArrayList<ArrayList<String>> dataToFill = new ArrayList();
        for(Columna c: temp2.columns){
            columnsName.add(c.name);
        }
        System.out.print("Size: "+temp2.tuples.size());

        for(Tuple tN : temp2.tuples){
               ArrayList<String> tempFill = new ArrayList();
            for(Object ob : tN.values){
                if(ob == null){
                    tempFill.add("");
                }
                else{
                    tempFill.add(((String)ob.toString()));
                }

            }
            dataToFill.add(tempFill);
        }
        Resultados newResult = new Resultados(columnsName,dataToFill);
        for(Component i: Frame.forResults.getComponents()){
            Frame.forResults.remove(i);
        }
        Frame.forResults.add(newResult);
        Frame.forResults.revalidate();
        Frame.forResults.repaint();
        return true;
    }
   
    //*******************************************************************************************************************************
  	//revisar bien esta parte
    @Override
    public Object visitTerm(TermContext ctx) {
    	//Si es un int
        if(ctx.NUM()!=null){
            int a = Integer.parseInt(ctx.NUM().getText());
            Term t = new Term(a);
            return t;
        }
        else if(ctx.CHAR_VAL()!=null){
            String s = ctx.CHAR_VAL().getText();
            s= s.substring(1);
            s = s.substring(0,s.length()-1);
            Term t = new Term(s);
            return t;
        }
        else if(ctx.FLOAT_VAL()!=null){
            float f = Float.parseFloat(ctx.FLOAT_VAL().getText());
            Term t = new Term(f);
            return t;
        }
        else if(ctx.DATE_VAL()!=null){
            String date = ctx.DATE_VAL().getText();
            date= date.substring(1);
            date = date.substring(0,date.length()-1);
            try{
                LocalDate d = LocalDate.parse(date);
                Term t = new Term(d);
                return t;
            }
            catch(Exception e){
                 Frame.jTextArea2.setText("Error: Tipo Invalido de Fecha: "+ctx.DATE_VAL().getText());
                return "ERROR";
            }
        }
        else if (ctx.NULL()!=null){
            return new Term();
        }
        //Si es column
        else{
            String colName = ctx.column()().getText();
            //Buscamos la column
            Columna c = this.getColumn(colName, this.availableCols);
            if(c==null){
                Frame.jTextArea2.setText("Error: No se encuentra la column: "+colName);
                return "ERROR";
            }
            Term t = new Term(c);
            return t;
        }
    }
    
	@Override
	public Object visitShowTableStmt(ShowTableStmtContext ctx) {
		if(DBMS.currentDB==null){
            Frame.jTextArea2.setText("Error: No existe nin`guna base de datos en uso. Utilice USE DATABASE <name> para utilizar una base de datos existente.");
            return "Error";

        }
        String dbActual = DBMS.currentDB;
        //ArraysList para crear el resultado a mostrar
        ArrayList<String> tablesHere = DBMS.metaData.allTable(dbActual);
        ArrayList<String> encabezado = new ArrayList<String>();
        ArrayList<ArrayList<String>> filas = new ArrayList<ArrayList<String>>();
        //Se recorre el arraylist obtenido del metodo para preparar las filas
        encabezado.add("Tables in "+dbActual);
        for(int i = 0; i<tablesHere.size(); i++){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add(tablesHere.get(i));
            filas.add(temp);
        }
        Resultados results = new Resultados(encabezado, filas);
        for(Component i: Frame.forResults.getComponents()){
            Frame.forResults.remove(i);
        }
        Frame.forResults.add(results);
        Frame.forResults.revalidate();
        Frame.forResults.repaint();
        if(Frame.activateVerbose){
            Frame.jTextArea2.append("Mostrando tables de "+dbActual);
        }
        return super.visitShowTableStmt(ctx);
	}
	
	@Override
	public Object visitVal(ValContext ctx) {
		//Se debe agregar Column de la metadata para ver el tipo de valor se debe 
		//reconocer que aqui pide la class columna.java, la cual debemos ingresar enuestra metadata
		if(ctx.CHAR_VAL()!=null){
            return Columna.CHAR_TYPE;

        }
        else if(ctx.NUM()!= null){
            return Columna.INT_TYPE;

        }
        else if (ctx.DATE_VAL()!=null){
            return Columna.DATE_TYPE;

        }
        else if (ctx.FLOAT_VAL()!=null){
            return Columna.FLOAT_TYPE;
        }
        else if(ctx.NULL()!=null){
            return -1;
        }
        else{return "Error";}
	}
	
	@Override
	public Object visitTipo(TipoContext ctx) {
				if(ctx.CHAR()!= null){
		                    return Columna.CHAR_TYPE;
		                }
		                else if (ctx.DATE()!= null){
		                    return Columna.DATE_TYPE;
		                }
		                else if (ctx.INT()!= null){
		                    return Columna.INT_TYPE;

		                }
		                else if (ctx.FLOAT()!= null){
		                    return Columna.FLOAT_TYPE;
		                }
		                else{
		                    return "Error";
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
    public Object visitQuery(QueryContext ctx) {
    	// TODO Auto-generated method stub
    	return super.visitQuery(ctx);
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
