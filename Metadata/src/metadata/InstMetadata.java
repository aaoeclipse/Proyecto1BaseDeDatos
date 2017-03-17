package metadata;
	/** 
	 * Santiago Paiz 15849
	 * Modificado: 17/03/2017 
	 * Las instrucciones para crear la metadata
	 * **/
public interface InstMetadata {
	// REQ:
	// read the folders as databases and the content inside
	public void readFiles();
	// REQ: Nombre de la base de datos
	// guarda las informacion en folderes
	public void createFolder(String nameOfDB);
	// REQ: El nombre de la base de datos y la tabla
	// Crea una tabla en la base de datos especificada
	public void createFile(String database, String table);
	// REQ: Solo en nombre de la base de datos
	// Mira si ya existe la base de datos
	public boolean checkFolder(String nameOfFolder);
	// REQ: El nombre de la base de datos y el nombre de la tabla
	// Mira si existe ya la tabla en la base de datos
	public boolean checkFile(String nameOfFolder,String FileName);
	// REQ:
	// 
	public void writeOnTable (String table, String content);
	
}
