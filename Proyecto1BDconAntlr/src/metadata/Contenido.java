package metadata;
/** 
 * Proyecto de Base De Datos 1
 * El contenido, es el raw data de la base de datos
 * Modificación: 4 de Abril, 2017 
 * **/
public class Contenido {
	String strCont;

	public Contenido(){
		
	}
	public Contenido(String cont){
		strCont = cont;
	}

	//setter
	public void setDate(String givenDate){
		strCont = givenDate;
	}
	//getter
	public String getDate(){
		return strCont;
	}
	public int getInt(){
		return Integer.valueOf(strCont);
	}
	public char getChar(){
		char c = strCont.charAt(0);
		return c;
	}

}
