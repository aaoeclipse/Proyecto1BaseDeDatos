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
	
	
	//======= Implmentencion de la interface ========//
	@Override
	public boolean readDatabase(String db) {
		DataBase.setName(db);
		File dir = new File(workingDir + "/" + archivoMaestro + "/" + db);
		if(!dir.exists())
			return false;
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
	public boolean checkFolder(String nameOfFolder) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void readDirectory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printDatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkFile(String nameOfFolder, String FileName) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void createDatabase(String db) {
		    directory = new File(workingDir + "/" + archivoMaestro + "/" + db);

		    if (directory.exists()) {
		        System.out.println("Folder already exists");
		    } else {
		        directory.mkdirs();
		    }
	}


	@Override
	public void createTable(String table, String db) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void createColumna(String db, String table, String colName) {
		// TODO Auto-generated method stub
		
	}
	
	//==============Clases Privadas===========/
	private void leerFile(String fileParaLeer,String db){
		try {
			br = new BufferedReader(new FileReader(workingDir + "/" + archivoMaestro + "/" + db + "/" + fileParaLeer));
			
			try {
				br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: Controlador, no se logro leer el folder");
			e.printStackTrace();
		}
	}
	
	private void loadDatabase(String db){
		
	}

	@Override
	public void alterColumna(String db, String table, String colName) {
		// TODO Auto-generated method stub
		
	}
	
}
