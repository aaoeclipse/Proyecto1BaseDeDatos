package metadata;

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
