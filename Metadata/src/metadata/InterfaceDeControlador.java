package metadata;

import java.io.File;

public interface InterfaceDeControlador {
	public void createDatabase(String name);
	public void deleteDatabase(String name);
	public void createTable(String dbName, String tableName);
	public void deleteTable(String dbName, String tableName);
	public void readDatabase(File db);
	
}
