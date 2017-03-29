package metadata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Controlador implements InterfaceDeControlador{
	Database DataBase = new Database();
	boolean exists = false;
	File fileToCheck;
	File fileToWrite;
	String workingDir = System.getProperty("user.dir");
	String archivoMaestro = "Archivo Maestro";
	BufferedReader br;

	
	@Override
	public void readDatabase(String db) {
		DataBase.setName(db);
		File dir = new File(workingDir + "/" + archivoMaestro + "/" + db);
		File[] files = dir.listFiles();
		
        for (int i = 0; i < files.length; i++) {
            DataBase.createTable(files[i].getName());
            /** try {
				br = new BufferedReader(new FileReader(files[i].getName()));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} */
        }
		
	}

	@Override
	public boolean checkFolder(String nameOfFolder) {
		fileToCheck = new File(workingDir + "/" + nameOfFolder);
		 exists = fileToCheck.exists();
		return exists;
	}
	
	private void createFolder() {
		//System.out.println(workingDir + "/"+ archivoMaestro + "/" + nameOfDB);
		File dir = new File(workingDir + "/"+ archivoMaestro);
		dir.mkdir();
	}

	@Override
	public void readDirectory() {
		File file = new File(workingDir + "/"+ archivoMaestro);
		File[] files = file.listFiles();
		
		
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
        
		
	}

	@Override
	public void printDatabase() {
		System.out.println("Base De Dato: " + DataBase.nombreDeBaseDatos + "\nTablas:");
		for (int i=0; i < DataBase.contadorDeTablas; i++)
			System.out.println(DataBase.obj.get(i).nombreDeLaTabla);

		
	}

	@Override
	public boolean checkFile(String nameOfFolder, String FileName) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
