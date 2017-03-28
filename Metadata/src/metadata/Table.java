package metadata;
	/** 
	 * Se va a utilizar 
	 * **/
 	
public class Table {
	//Variables
	Contenido[][] contenido;
	String[] nombreDeColumnas;
	String[] atributos;
	
	int contadorDeColumnas;
	String nombreDeLaTabla;
	
	//Constructor
	public Table(){
		contadorDeColumnas = 0;
	}
	public Table(String nombre){
		contadorDeColumnas = 0;
		nombreDeLaTabla = nombre;
	}
	//Setter
	public void agregarColumna(String nombreDeColumna, String atributo){
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
	
}
