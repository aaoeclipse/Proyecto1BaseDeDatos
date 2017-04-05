package metadata;
/** 
 * Proyecto de Base De Datos 1
 * Controlador implementa la interface del controlador
 * Modificación: 4 de Abril, 2017 
 * **/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Controlador implements InterfaceDeControlador{
	//=========== Variables ====================//
	Database DataBase = new Database();
	boolean exists = false;
	File fileToCheck;
	File fileToWrite;
	String workingDir = System.getProperty("user.dir");
	String archivoMaestro = "Archivo Maestro";
	File directory;
	BufferedReader br;
	File dir;

	//======= Implmentencion de la interface ========//

	private boolean readDatabase(String db) {
		dir = new File(workingDir + "/" + archivoMaestro + "/" + db);
		if(!dir.exists())
			return false;
		DataBase.setName(db);
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			DataBase.createTable(files[i].getName());
			leerFile(files[i].getName(), db, i);
		}
		return true;
	}

	@Override
	public boolean createDatabase(String db) {
		directory = new File(workingDir + "/" + archivoMaestro + "/" + db);

		if (directory.exists()) {
			System.out.println("Folder already exists");
			return false;
		} else {
			directory.mkdirs();
		}
		return true;
	}

	@Override
	public boolean createTable(String table, String db) {
		dir = new File(workingDir + "/" + archivoMaestro + "/" + db);
		if(!dir.exists()) {
			System.out.println("La base de datos no existe");
			return false;
		}
		DataBase.setName(db);
		loadDatabase(db);
		DataBase.createTable(table);
		FileWriter output=null;
		try {
			output= new FileWriter(workingDir + "/" + archivoMaestro + "/" + db + "/"+ table);
			output.close();
		} catch (IOException e) {
			System.out.println("Error creando el file");
			return false;
		}
		return true;
	}

	@Override
	public boolean createColumna(String db, String table, String colName, int atributo, int[] constraint) {
		readDatabase(db);
		DataBase.createColum(table, colName, atributo, constraint);
		save();
		return true;
	}

	@Override
	public boolean alterDatabase(String dbViejo, String dbNuevo) {

		dir = new File(workingDir + "/" + archivoMaestro + "/" + dbViejo);
		if (!dir.exists())
			return false;
		dir.renameTo(new File(workingDir + "/" + archivoMaestro + "/" + dbNuevo));
		return true;

	}


	@Override
	public boolean dropDatabase(String db) {
		if (!readDatabase(db))
			return false;
		dir = new File(workingDir + "/" + archivoMaestro + "/" + db);
		dir.delete();
		return true;
	}

	@Override
	public boolean dropTable(String table, String db) {
		//checkIfTable
		dir = new File(workingDir + "/" + archivoMaestro + "/" + db + "/" + table);
		if (dir.exists()){
			dir.delete();
			return true;
		}
		return false;
	}

	@Override
	public String[][] showDatabase(String db) {
		String [][] dbEnMatriz = null;
		if (!readDatabase(db)){
			System.out.println("Error en showDatabase: base de datos no encontrada");
			return dbEnMatriz;
		}
		dbEnMatriz = DataBase.matrizDataBase();
		return dbEnMatriz;
	}

	//	Devuelve la tabla por columna en un array. Cada elemento en el array es un string con primero el nombre
	//	de la columna, seguido por todos sus valores.
	//	Si devuelve un array vacio es porque no existia la base de datos o la tabla
	@Override
	public String [] showTable(String db, String table) {
		String [] arrayConTabla = null;
		if (!readDatabase(db)){
			System.out.println("Error en showTable: base de datos no encontrada");
			return arrayConTabla;
		}
		if (!DataBase.checkTableName(table)){
			System.out.println("Error en showTable: tabla no encontrada");
			return arrayConTabla;
		}
		arrayConTabla = DataBase.table.get(DataBase.tablaBuscada).readTable();
		return arrayConTabla;
	}

	@Override
	public String showColum(String db, String table, String nombreDeCol) {
		String colParaDevolver = null;
		if (!readDatabase(db)){
			System.out.println("Error en showColum: base de datos no encontrada");
			return colParaDevolver;
		}
		if (!DataBase.checkTableName(table)){
			System.out.println("Error en showColum: tabla no encontrada");
			return colParaDevolver;
		}
		colParaDevolver = DataBase.table.get(DataBase.tablaBuscada).readColumna(nombreDeCol);
		if (colParaDevolver == null){
			System.out.println("Error en showColum: columna no encontrada");
			return colParaDevolver;
		}
		return colParaDevolver;
	}

	@Override
	public boolean useDatabase(String db) {
		if (readDatabase(db))
			return true;
		return false;
	}

	@Override
	public String select(String db, String table, String Col, String condition) {
		String selectedString;
		int atributoDeCol;
		String colParaDevolver = null;
		if (!readDatabase(db)){
			System.out.println("Error en select: db no encontrada");
			return null;
		}
		if (!DataBase.checkTableName(table)){
			System.out.println("Error en select: tabla no encontrada");
			return null;
		}
		atributoDeCol = DataBase.table.get(DataBase.tablaBuscada).columna.get(DataBase.table.get(DataBase.tablaBuscada).buscarColumnaConNombre(condition)).atributos;
		if (colParaDevolver == null){
			System.out.println("Error en select: columna no encontrada");
			return null;
		}
		selectedString = showColum(db, table, Col);
		if (selectedString == null){
			System.out.println("Error en Select: No se encuentra la tabla");
			return null;
		}
		if(condition == null){
			return selectedString;
		}
		//prueba que no intente de hacer operaciones con numeros cuando la columna es de string
		String [] condicionPorPartes = condition.split(",");
		if ((condicionPorPartes[0].equalsIgnoreCase("<") || 
				condicionPorPartes[0].equalsIgnoreCase(">") || 
				condicionPorPartes[0].equalsIgnoreCase("=>") || 
				condicionPorPartes[0].equalsIgnoreCase("=<")) && atributoDeCol != 1){
			System.out.println("Error en Select: No se puede utilizar operaciones de integrales con String");
			return null;
		}

		//ahora que sabemos que si es correcto vamos a separar el string recibido por showColum
		String [] columnaSeparada = selectedString.split(",");
		//Si es un int o un String correcto
		//Si es un INT
		if(isNumeric(condicionPorPartes[1])){
			if (condicionPorPartes[0].equalsIgnoreCase("<")){
				for(int i = 0; i < columnaSeparada.length; i++){
					if(Integer.valueOf(columnaSeparada[i]) >= Integer.valueOf(condicionPorPartes[1]))
						columnaSeparada[i]="";
				}
			}
			if (condicionPorPartes[0].equalsIgnoreCase(">")){
				for(int i = 0; i < columnaSeparada.length; i++){
					if(Integer.valueOf(columnaSeparada[i]) <= Integer.valueOf(condicionPorPartes[1]))
						columnaSeparada[i]="";
				}
			}
			if (condicionPorPartes[0].equalsIgnoreCase("=<")){
				for(int i = 0; i < columnaSeparada.length; i++){
					if(Integer.valueOf(columnaSeparada[i]) > Integer.valueOf(condicionPorPartes[1]))
						columnaSeparada[i]=null;
				}
			}
			if (condicionPorPartes[0].equalsIgnoreCase("=>")){
				for(int i = 0; i < columnaSeparada.length; i++){
					if(Integer.valueOf(columnaSeparada[i]) < Integer.valueOf(condicionPorPartes[1]))
						columnaSeparada[i]=null;
				}
			}
			if (condicionPorPartes[0].equalsIgnoreCase("=")){
				for(int i = 0; i < columnaSeparada.length; i++){
					if(Integer.valueOf(columnaSeparada[i]) != Integer.valueOf(condicionPorPartes[1]))
						columnaSeparada[i]=null;
				}
			}
			selectedString = "";
			for(int i = 0; i < columnaSeparada.length; i++){
				selectedString += columnaSeparada[i] + ",";
			}
			return selectedString;
		} //end if condition is int

		//IF STRING
		if(condicionPorPartes[0].equalsIgnoreCase("=")){
			for(int i = 0; i < columnaSeparada.length;i++)
			{
				if(!columnaSeparada[i].equalsIgnoreCase(condicionPorPartes[1]))
					columnaSeparada[i] = "";
			}
		}
		if(condicionPorPartes[0].equalsIgnoreCase("<>")){
			for(int i = 0; i < columnaSeparada.length;i++)
			{
				if(columnaSeparada[i].equalsIgnoreCase(condicionPorPartes[1]))
					columnaSeparada[i] = "";
			}
		}
		selectedString = "";
		for(int i = 0; i < columnaSeparada.length; i++){
			selectedString += columnaSeparada[i] + ",";
		}
		return selectedString;
	}

	@Override
	public boolean insert(String db, String table, String Col, String input) {
		if (!readDatabase(db)){
			System.out.println("Error en insert: base de datos no encontrada");
			return false;
		}
		if (!DataBase.checkTableName(table)){
			System.out.println("Error en insert: tabla no encontrada");
			return false;
		}
		DataBase.table.get(DataBase.tablaBuscada).agregarLineaALasColumnas(input);
		return true;
	}


	@Override
	public boolean orderBy(String db, String table, String col, boolean ascOdes) {
		// TODO Auto-generated method stub
		return false;
	}  

	//==============Clases Privadas===========/

	private void leerFile(String fileParaLeer, String db, int currTable){
		try {
			br = new BufferedReader(new FileReader(workingDir + "/" + archivoMaestro + "/" + db + "/" + fileParaLeer));
			String contenido = null;
			int atributo = -1;
			int[] constraint = new int [3];
			int countConstraint = 0;
			int columnas = 0;
			try {
				String currLine = br.readLine();
				//LEE COLUMNAS
				while(!currLine.equals("%%")) {

					String[] parts = currLine.split(",");
					for(int i=0;i<parts.length;i++){
						if(i == 0)
							contenido = parts[i];

						//Atributo: 0 String, 1 int, 2 char, 3 fecha
						if (parts[i].equalsIgnoreCase("String"))
							atributo = 0;
						if (parts[i].equals("int"))
							atributo = 1;
						if (parts[i].equals("char"))
							atributo = 2;
						if (parts[i].equals("fecha"))
							atributo = 3;

						//contraints: 0 = nada ,1 = primary key, 2 = Foreign key, 3 = Check
						if (parts[i].equals("PK"))
						{
							if(countConstraint <2){
								constraint[countConstraint] = 1;
								countConstraint++;
							}
						}
						if (parts[i].equals("FK"))
							if(countConstraint <2){
								constraint[countConstraint] = 2;
								countConstraint++;
							}
						if (parts[i].equals("CHECK"))
							if(countConstraint <2){
								constraint[countConstraint] = 3;
								countConstraint++;
							}
					}
					currLine = br.readLine();
				}

				DataBase.table.get(currTable).agregarColumna(contenido, atributo,constraint);
				currLine = br.readLine();
				//LEE CONTENIDO
				while(currLine != null){
					for (int i = 0; i < columnas; i++) {
						DataBase.table.get(currTable).columna.get(i % columnas).agregaContenido(currLine);
					}

				}
			} catch (IOException e) {
				System.out.println("Error en leerFile");
			}

		} catch (FileNotFoundException e) {
			System.out.println("Error: Controlador, no logro leer el folder");
			e.printStackTrace();
		}
	}

	private void loadDatabase(String db) {
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			DataBase.createTable(files[i].getName());
			leerFile(files[i].getName(), db, i);
		}
	}
	private boolean isNumeric(String s) {  
		return s.matches("[-+]?\\d*\\.?\\d+");  
	}
	private void save(){
		String newDir = workingDir + "/" + archivoMaestro + "/" + DataBase.nombreDeBaseDatos;
		directory = new File(newDir);
		directory.mkdirs();

		PrintWriter writer;

		for(int i =0; i<DataBase.table.size();i++){
			directory = new File(newDir+"/"+DataBase.table.get(i));
			try{
				writer = new PrintWriter(directory);
				//las columnas
				for(int s = 0; s < DataBase.table.get(i).columna.size(); s++){
					writer.println(DataBase.table.get(i).columna.get(s).nombreDeColumna+","+DataBase.table.get(i).columna.get(s).atributos);
				}
				writer.println("%%");
				//contenido
				for(int s = 0; s< DataBase.table.get(i).lineasDeTabla;s++){
					for(int r = 0; r< DataBase.table.size();r++){
						writer.println(DataBase.table.get(i).columna.get(r % DataBase.table.get(i).columna.size()).contenido.get(s).strCont);
					}
				}
				writer.close();
			} catch (IOException e) {
				System.out.println("Error: En la funcion save");
			}

		}
		System.out.println("Se logro save");
	}

	public String DBname(){
		return DataBase.nombreDeBaseDatos;
	}
}
