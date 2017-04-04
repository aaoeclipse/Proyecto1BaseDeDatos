package metadata;

import java.util.ArrayList;

public class Table {
	//Variables
	ArrayList<Columna> columna = new ArrayList<Columna>();

	//0 String, 1 int, 2 char, 3 fecha
	int atributos;
	int contadorDeColumnas;
	int lineasDeTabla;
	String nombreDeLaTabla;

	//Constructor
	public Table(String nombre){
		contadorDeColumnas = 0;
		nombreDeLaTabla = nombre;
		lineasDeTabla=0;
	}

	//======== funciones ========//
	public void agregarColumna(String nombreDeColumna, int atributo, int[] givenConstr){
		if (checkSiColumnaExiste(nombreDeColumna))
			return;
		columna.add(new Columna(nombreDeColumna, atributo, givenConstr));
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


	//para escribir despues
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
	//TODO
	private int atributoAInt(String atrib){
		int devolver = -1;
		if(atrib.equalsIgnoreCase("int"))
			devolver=0;
		if(atrib.equalsIgnoreCase("int"))
			devolver=1;
		if(atrib.equalsIgnoreCase("int"))
			devolver=2;
		return devolver;
	}
	public String[] readTable(){
		String[] returnArray = new String[columna.size()];
		for(int i=0;i<columna.size();i++){
			returnArray[i] = columna.get(i).nombreDeColumna + "," + columna.get(i).readCol();
		}
		return returnArray;
	}
	
	//regresa la columna en un string separado por comas, si el string es null no encontro la columna en la tabla.
	public String readColumna(String columnaDada){
		String colEnString = null;
		int colBuscada = buscarColumnaConNombre(columnaDada);
		if (colBuscada == -1)
			return colEnString;
		colEnString = columna.get(colBuscada).nombreDeColumna + "," + columna.get(colBuscada).readCol();
		return colEnString;
	}
	public int buscarColumnaConNombre(String nombreParaBuscar){
		for(int i = 0; i < columna.size();i++){
			if (columna.get(i).nombreDeColumna.equalsIgnoreCase(nombreParaBuscar))
				return i;
		}
		return -1;
	}
	public void agregarLineaALasColumnas(String cont){
		String[] contSplit = cont.split(",");
		for(int i = 0; i < contSplit.length;i++){
			columna.get(i % columna.size()).agregaContenido(contSplit[i]);
			if(i % columna.size() == 0)
				lineasDeTabla++;
		}
	}

}
