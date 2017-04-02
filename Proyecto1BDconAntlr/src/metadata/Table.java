package metadata;

import java.util.ArrayList;

public class Table {
	//Variables
	ArrayList<Contenido> contenido = new ArrayList<Contenido>();
	String[] nombreDeColumnas;
	int[] atributos;
	int contadorDeColumnas;
	String nombreDeLaTabla;
	String nomAtributo;
	
	//Constructor
	public Table(String nombre){
		contadorDeColumnas = 0;
		nombreDeLaTabla = nombre;
	}
	//Setter
	public void agregarColumna(String nombreDeColumna, int atributo){
		if (checkSiColumnaExiste(nombreDeColumna))
			return;
		nombreDeColumnas[contadorDeColumnas] = nombreDeColumna;
		atributos[contadorDeColumnas] = atributo;
		contadorDeColumnas++;
	}
	
	
	private boolean checkSiColumnaExiste(String nombreDeColumna){
		for (int i = 0; i < contadorDeColumnas;i++)
			if (nombreDeColumna.equals(nombreDeColumnas[i]))
				return true;
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
