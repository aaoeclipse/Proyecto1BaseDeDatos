package metadata;

import java.io.File;

public interface InterfaceDeControlador {
	public boolean readDatabase(String db); //ya
	public boolean createDatabase(String db); //ya
	public boolean createTable(String table, String db); //ya
	public boolean createColumna(String db, String table, String colName, int atributo, int[] constraint); //ya
	public boolean alterDatabase(String dbViejo, String dbNuevo); //ya
	public boolean dropDatabase(String db); //ya
	public boolean dropTable(String table, String db); //ya
	public String [] showTable(String db, String table); //ya
	public String showColum(String db, String table, String nombreDeCol); //ya
	// ====== TODO ===== //
	public boolean showDatabase();
	public boolean useDatabase();
	public boolean select();
	public boolean update();
	public boolean insert();
	public boolean multiInsert();
	
}