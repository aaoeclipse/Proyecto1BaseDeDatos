package metadata;

import java.util.ArrayList;

public class Database {
	//variables
	ArrayList<Table> obj = new ArrayList<Table>();
	
	Table[] tables = new Table[10];
	int contadorDeTablas;
	String nombreDeBaseDatos;
	//constructor
	public Database(){
		contadorDeTablas = 0;
	}
	public Database(String nombre){
		contadorDeTablas = 0;
		nombreDeBaseDatos = nombre;
	}
	//setter
	public void createTable(String name){
		obj.add(new Table(name));
		contadorDeTablas++;
	}
	public void setName(String name){
		nombreDeBaseDatos = name;
	}
	public void printTables(){
		System.out.println(obj);
	}
	
}
