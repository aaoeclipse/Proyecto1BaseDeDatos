package metadata;

import java.io.File;

public class Metadata_impl implements InstMetadata{
	//variables
	boolean exists = false;
	File fileToCheck;
	String workingDir = System.getProperty("user.dir");
	
	@Override
	public void readFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createFile(String nameOfDB) {
		File dir = new File(nameOfDB);
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

}
