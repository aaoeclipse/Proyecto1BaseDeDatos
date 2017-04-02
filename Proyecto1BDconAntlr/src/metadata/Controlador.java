package metadata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
           //TODO leer file 
            leerFile(files[i].getName(), db);
            DataBase.table.get(i).agregarColumna("id", 1);
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
		//TODO write table on a file
		return true;
	}

	@Override
	public boolean createColumna(String db, String table, String colName) {
		// TODO Auto-generated method stub
		return true;
		
	}
	
	@Override
	public boolean alterColumna(String db, String table, String colName) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean alterDatabase(String dbViejo, String dbNuevo) {
		// TODO Auto-generated method stub
		return true;
		
	}
	
	//==============Clases Privadas===========/
	private void leerFile(String fileParaLeer, String db, int currTable){
		try {
			br = new BufferedReader(new FileReader(workingDir + "/" + archivoMaestro + "/" + db + "/" + fileParaLeer));
			String contenido = null;
			int atributo = -1;
			int[] constraint = new int [3];
			int countConstraint = 0;
			try {
				String currLine = br.readLine();
				//TODO todavia no esta terminado
				
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
				}
			DataBase.table.get(currTable).agregarColumna(contenido, atributo,constraint);
			//LEE CONTENIDO
			
			} catch (IOException e) {
				System.out.println("Error en leerFile");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: Controlador, no logro leer el folder");
			e.printStackTrace();
		}
	}
	
	private boolean checkFolder(String nameOfFolder) {
		// TODO Auto-generated method stub
		return false;
	}


	private void loadDatabase(String db) {
		File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            DataBase.createTable(files[i].getName());
            //TODO leer dentro de los files ()
            leerFile(files[i].getName(), db, i);
        }
        
		
	}

	private void printDatabase() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean checkFile(String nameOfFolder, String FileName) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
