package metadata;

import java.io.File;

public interface InterfaceDeControlador {
	public boolean readDatabase(String db);
	public boolean createDatabase(String db);
	public boolean createTable(String table, String db);
	public boolean createColumna(String db, String table, String colName);
	public boolean alterColumna(String db, String table, String colName);
	public boolean alterDatabase(String dbViejo, String dbNuevo);
}
