package metadata;

import java.io.File;

public interface InterfaceDeControlador {
	public boolean readDatabase(String db);
	public boolean checkFolder(String nameOfFolder);
	public void readDirectory();
	public void printDatabase();
	public boolean checkFile(String nameOfFolder, String FileName);
	public void createDatabase(String db);
	public void createTable(String table, String db);
	public void createColumna(String db, String table, String colName);
	public void alterColumna(String db, String table, String colName);
	
}
