package metadata;
/** 
 * Proyecto de Base De Datos 1
 * Base de datos que contiene Tablas
 * Modificación: 4 de Abril, 2017 
 * **/

import java.util.ArrayList;

public class Database {
	//variables
	ArrayList<Table> table = new ArrayList<Table>();
	int contadorDeTablas;
	String nombreDeBaseDatos;
	int tablaBuscada;

	//constructor
	public Database(String nombre){
		contadorDeTablas = 0;
		nombreDeBaseDatos = nombre;
	}
	public Database(){
		contadorDeTablas = 0;
	}
	//Funciones
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
	public void createColum(String tables, String col, int atributo, int[] constraint){
		if (checkTableName(tables)){
			table.get(tablaBuscada).agregarColumna(col, atributo, constraint);
		}
	}
	public boolean checkTableName(String name){
		for(int i = 0; i < table.size();i++){
			if (table.get(i).nombreDeLaTabla.equalsIgnoreCase(name)){
				tablaBuscada = i;
				return true;			
			}
		}
		return false;
	}
	public String[][] matrizDataBase(){
		String [][] matrizParaRegresar = new String [table.size()][];
		for (int i = 0; i < table.size();i++){
			matrizParaRegresar[i] = table.get(i).readTable();
		}
		return matrizParaRegresar;
	}
	

}
