package metadata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

	@Override
	public boolean readDatabase(String db) {
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
		if (existeDatabase(db))
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
	public boolean useDatabase() {
		// TODO Auto-generated method stub
		//if (readDatabase(db))
		//	return true;
		return false;
	}

	@Override
	public boolean select(String db, String table, String Col) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean multiInsert() {
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

	private boolean existeDatabase(String db){
		
		return false;
	}

	
}
