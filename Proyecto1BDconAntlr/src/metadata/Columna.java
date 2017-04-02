package metadata;

import java.util.ArrayList;

public class Columna {
		//0 String, 1 int, 2 char, 3 fecha
		int atributos;
		String nombreDeColumna;
		//contraints: 0 = nada ,1 = primary key, 2 = Foreign key, 3 = Check
		int[] constraint;
		ArrayList<Contenido> contenido = new ArrayList<Contenido>();
		
	public Columna(){
		
	}
	public Columna(String name, String[] givenContenido){
		nombreDeColumna = name;
		for(int i=0;i<givenContenido.length;i++){
			contenido.add(new Contenido(givenContenido[i]));
		}
	}
}
