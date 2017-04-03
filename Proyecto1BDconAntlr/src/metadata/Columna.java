package metadata;

import java.util.ArrayList;

public class Columna {
		//0 String, 1 int, 2 char, 3 fecha
		int atributos;
		String nombreDeColumna;
		//contraints: 0 = nada ,1 = primary key, 2 = Foreign key, 3 = Check
		int[] constraint;
		ArrayList<Contenido> contenido = new ArrayList<Contenido>();
		
	public Columna(String name, int atributos, int[] givenConstraint){
		
	}
	public Columna(String name, String[] givenContenido){
		nombreDeColumna = name;
		for(int i=0;i<givenContenido.length;i++){
			contenido.add(new Contenido(givenContenido[i]));
		}
	}
	
	//========== Funciones ========//
	public void agregaContenido(String cont)
	{
		if(!repetidoCheck(cont)){
			contenido.add(new Contenido(cont));
		}
	}
	
	private boolean repetidoCheck(String cont){
		for(int i = 0; i < contenido.size();i++)
		{
			if(contenido.get(i).strCont.equalsIgnoreCase(cont))
				return true;
		}
		return false;
	}
}
