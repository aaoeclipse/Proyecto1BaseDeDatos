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
	// CREA una tabla EN LA base de datos especificada
	public void createFile(String database, String table);
	// REQ: Solo en nombre de la base de datos
	// Verifica si ya existe la base de datos
	public boolean checkFolder(String nameOfFolder);
	// REQ: El nombre de la base de datos y el nombre de la tabla
	// Verifica si existe ya la tabla en la base de datos
	public boolean checkFile(String nameOfFolder,String FileName);
	// REQ:
	// TODO escribe el contenido deseado en la tabla de una base de datos
	public void writeOnTable (String table, String content);
}
