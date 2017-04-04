package metadata;
public interface InterfaceDeControlador {
	public boolean createDatabase(String db); //ya
	public boolean createTable(String table, String db); //ya
	public boolean createColumna(String db, String table, String colName, int atributo, int[] constraint); //ya
	public boolean alterDatabase(String dbViejo, String dbNuevo); //ya
	public boolean dropDatabase(String db); //ya
	public boolean dropTable(String table, String db); //ya
	public String [] showTable(String db, String table); //ya
	public String showColum(String db, String table, String nombreDeCol); //ya
	public String[][] showDatabase(String db); //ya
	public boolean useDatabase(String db); //ya
	public boolean insert(String db, String table, String Col, String input); //ya
	public String select(String db, String table, String Col, String condition); //ya
	// ====== TODO ===== //
	public boolean update();
	public boolean multiInsert();
	public boolean orderBy(String db, String table, String col);
}