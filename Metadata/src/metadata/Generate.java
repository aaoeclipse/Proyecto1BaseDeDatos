package metadata;

public class Generate {

	public static void main(String[] args) {
		InstMetadata meta = new Metadata_impl();
		meta.createFolder("database1");
		meta.createFile("database1", "table1");
	}
}
