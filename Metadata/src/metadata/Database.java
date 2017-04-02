package metadata;

public class Database {
	//variables
	Table[] table;
	int contadorDeTablas;
	String nombreDeBaseDatos;
	//constructor
	public Database(String nombre){
		contadorDeTablas = 0;
		nombreDeBaseDatos = nombre;
	}
	public Database(){
		contadorDeTablas = 0;
	}
	//setter
	public void createTable(String name){
		table[contadorDeTablas] = new Table(name);
	}
	public void setName(String name){
		nombreDeBaseDatos = name;
	}
	
}
