package metadata;

public interface InstMetadata {
	// REQ:
	// read the folders as databases and the content inside
	public void readFiles();
	// REQ:
	// guarda las informacion en folderes
	public void saveFiles();
	// REQ:
	// 
	public void createFile(String nameOfDB);
	// REQ:
	// 
	public boolean checkFolder(String nameOfFolder);
	// REQ:
	// 
	public boolean checkFile(String nameOfFolder,String FileName);
}
