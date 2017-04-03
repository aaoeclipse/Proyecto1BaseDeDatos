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
	// ====== TODO ===== //
	public boolean select(String db, String table, String Col); //TODO esta esta rara, creo que hace lo mismo de columna
	public boolean update();
	public boolean multiInsert();
}