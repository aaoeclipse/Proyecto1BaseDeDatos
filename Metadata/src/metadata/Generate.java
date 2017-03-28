package metadata;

public class Generate {

	public static void main(String[] args) {
		InterfaceDeControlador meta = new Controlador();
		meta.readDatabase("Colegio");
		meta.printDatabase();
	}
}
