package metadata;

public class Contenido {
	String dateCont;
	float floatCont;
	int intCont;
	char charCont;

	public Contenido(){
		
	}
	
	//setter
	public void setDate(String givenDate){
		dateCont = givenDate;
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
		return dateCont;
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
