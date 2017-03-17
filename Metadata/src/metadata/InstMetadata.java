package metadata;

public interface InstMetadata {
	// read the folders as databases and the content inside
	public void readFiles();
	// 
	public void saveFiles();
	// 
	public void createFile(String nameOfDB);
	// 
	public boolean checkFolder(String nameOfFolder);
	// 
	public boolean checkFile(String nameOfFolder,String FileName);
}
