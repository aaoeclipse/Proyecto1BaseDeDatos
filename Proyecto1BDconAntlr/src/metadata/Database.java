package metadata;

import java.util.ArrayList;

public class Database {
	//variables
	ArrayList<Table> table = new ArrayList<Table>();
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
		if (!checkTableName(name)){
			System.out.println("nombre de tabla ya existe!");
			return;
		}
		table.add(new Table(name));
		contadorDeTablas++;
		
	}
	public void setName(String name){
		nombreDeBaseDatos = name;
	}
	
	private boolean checkTableName(String name){
		for(int i = 0; i < table.size();i++){
			if (table.get(i).nombreDeLaTabla.equalsIgnoreCase(name))
				return false;
		}
		return true;
	}
	
}
