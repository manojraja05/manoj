package co.properties;

import java.io.IOException;

public class FileReadManager {
	private void FileReadManager() {
		
		
	}
	
	public static FileReadManager getInstanceFR() {
		FileReadManager frm = new FileReadManager();
		return frm;
		
	}
	public  Config_Reader getInstanceCR() throws IOException {
		Config_Reader reader = new Config_Reader();
		return reader;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
