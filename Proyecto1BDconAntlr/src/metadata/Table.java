package metadata;

import java.util.ArrayList;

public class Table {
	//Variables
	ArrayList<Columna> columna = new ArrayList<Columna>();

	//0 String, 1 int, 2 char, 3 fecha
	int atributos;
	int contadorDeColumnas;
	String nombreDeLaTabla;
	String nomAtributo;

	
	//Constructor
	public Table(String nombre){
		contadorDeColumnas = 0;
		nombreDeLaTabla = nombre;
	}
	//Setter
	public void agregarColumna(String nombreDeColumna, int atributo, int[] givenConstr){
		if (checkSiColumnaExiste(nombreDeColumna))
			return;
		
		
	}

	
	private boolean checkSiColumnaExiste(String nombreDeColumna){
			for (int i = 0; i < columna.size();i++)
				if (nombreDeColumna.equals(columna.get(i).nombreDeColumna)){
					System.out.println("Esta columna ya existe");
					return true;
				}
		return false;
	}
	
	public String nombreDeTabla(){
		return nombreDeLaTabla;
	}
	public void setNombre(String name){
		nombreDeLaTabla = name;
	}
	
	
	
	private String atributoAInt(int atrib){
		switch (atrib) {
		case 0:
			return "string";
		case 1:
			return "int";
		case 2:
			return "char";
		default:
			return "fecha";
			
		}
	}
	
}
