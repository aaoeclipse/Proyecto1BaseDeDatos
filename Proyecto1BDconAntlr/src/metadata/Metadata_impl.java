package metadata;

import java.io.File;
import java.io.IOException;
/** 
 * Santiago Paiz 15849
 * Modificado: 17/03/2017 
 * Implementacion de la interface de la metadata
 * **/

public class Metadata_impl implements InstMetadata{
	//variables
	boolean exists = false;
	File fileToCheck;
	File fileToWrite;
	String workingDir = System.getProperty("user.dir");
	String archivoMaestro = "Archivo Maestro";
	
	//implementacion de las funciones
	@Override
	public void readFiles() {
	}

	@Override
	public void createFolder(String nameOfDB) {
		//System.out.println(workingDir + "/"+ archivoMaestro + "/" + nameOfDB);
		File dir = new File(workingDir + "/"+ archivoMaestro + "/" + nameOfDB);
		dir.mkdir();
	}

	@Override
	public boolean checkFolder(String nameOfFolder) {
		fileToCheck = new File(workingDir + "/" + nameOfFolder);
		 exists = fileToCheck.exists();
		return exists;
	}

	@Override
	public boolean checkFile(String nameOfFolder, String FileName) {
		fileToCheck = new File(workingDir + "/" + nameOfFolder + "/" + FileName);
		exists = fileToCheck.exists();
		return exists;
	}

	@Override
	public void createFile(String database, String table) {
		File dir = new File(workingDir + "/"+ archivoMaestro + "/" + database + "/" + table+".txt");
		try {
			dir.createNewFile();
		} catch (IOException e) {
			System.out.println("Error creating file");
		}
	}

	@Override
	public void writeOnTable(String table, String content) {
		// TODO Auto-generated method stub
		
	}
}
