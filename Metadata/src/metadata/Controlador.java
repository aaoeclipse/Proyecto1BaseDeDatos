package metadata;

import java.io.File;

public class Controlador implements InterfaceDeControlador{
	Database DataBase = new Database();
	boolean exists = false;
	File fileToCheck;
	File fileToWrite;
	String workingDir = System.getProperty("user.dir");
	String archivoMaestro = "Archivo Maestro";

	

	@Override
	public void readDatabase(String db) {
		DataBase.setName(db);
		File dir = new File(workingDir + "/" + archivoMaestro + "/" + db);
		File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            DataBase.createTable(files[i].getName());
        }
		
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
	
	
}
