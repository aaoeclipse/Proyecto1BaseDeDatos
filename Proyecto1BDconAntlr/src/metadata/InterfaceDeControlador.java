package metadata;

import java.io.File;

public interface InterfaceDeControlador {
	public boolean readDatabase(String db); //ya
	public boolean createDatabase(String db); //ya
	public boolean createTable(String table, String db); //ya
	public boolean createColumna(String db, String table, String colName, int atributo, int[] constraint); //ya
	public boolean alterDatabase(String dbViejo, String dbNuevo); //ya
	public boolean dropDatabase(String db); //ya
	// ====== TODO ===== //
	public boolean dropTable(String table, String db); //ya
	public boolean showDatabase();
	public boolean showTable();
	public boolean showColum();
	public boolean useDatabase();
	public boolean select();
	public boolean update();
	public boolean insert();
	public boolean multiInsert();
	
}