package metadata;
public interface InterfaceDeControlador {
	public boolean createDatabase(String db); 
	public boolean createTable(String table, String db); 
	public boolean createColumna(String db, String table, String colName, int atributo, int[] constraint); 
	public boolean alterDatabase(String dbViejo, String dbNuevo); 
	public boolean dropDatabase(String db); 
	public boolean dropTable(String table, String db); 
	public String [] showTable(String db, String table); 
	public String showColum(String db, String table, String nombreDeCol); 
	public String[][] showDatabase(String db); 
	public boolean useDatabase(String db); 
	public boolean insert(String db, String table, String Col, String input); 
	public String select(String db, String table, String Col, String condition); 
	// ====== TODO ===== //
	public boolean update();
	public boolean multiInsert();
	public boolean orderBy(String db, String table, String col, boolean ascOdes);
}