package metadata;

public class Contenido {
	String strCont;
	float floatCont;
	int intCont;
	char charCont;

	public Contenido(){
		
	}
	public Contenido(String cont){
		strCont = cont;
	}

	//setter
	public void setDate(String givenDate){
		strCont = givenDate;
	}
	public void setFloat(float givenFloat){
		floatCont = givenFloat;
	}
	public void setInt(int givenInt){
		intCont = givenInt;
	}
	public void setChar(char givenChar){
		charCont = givenChar;
	}
	//getter
	public String getDate(){
		return strCont;
	}
	public float getFloat(){
		return floatCont;
	}
	public int getInt(){
		return intCont;
	}
	public char getChar(){
		return charCont;
	}
}
