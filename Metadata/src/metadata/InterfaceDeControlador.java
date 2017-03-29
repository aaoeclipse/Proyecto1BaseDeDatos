package metadata;

import java.io.File;

public interface InterfaceDeControlador {
	public void readDatabase(String db);
	public boolean checkFolder(String nameOfFolder);
	public void readDirectory();
	public void printDatabase();
	boolean checkFile(String nameOfFolder, String FileName);
	/*
	public void createDataBase();
	public void createTable();
	public void saveData();
	
	*/
}
