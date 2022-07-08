package co.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
    public static Properties p;
    public Config_Reader () throws IOException {
    	File f = new File("C:\\Users\\DELL\\eclipse-workspace\\Selinum\\Adactine_Project\\src\\main\\java\\co\\properties\\config.prop");
    	FileInputStream fis = new FileInputStream (f);
    	p=new Properties();
    	p.load(fis);
    	
    	
    }
    
    public String get_url() {
		String url =p.getProperty("url");
		return url;

	}
public String getemail() {
	String email = p.getProperty("email");
	return email;
	
}

public String getpassword() {
	String password =p.getProperty("password");
	return password;
}























}
