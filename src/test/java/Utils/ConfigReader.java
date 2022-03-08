package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties p;
	
	public  String init_prop() throws IOException {
		
		p=new Properties();
		
		FileInputStream fs=new FileInputStream("/home/shelke/Downloads/Mision/OpenCart_Project/config.properties");

		p.load(fs);
		
		String browserName=p.getProperty("browser");
		
		return browserName;
	}
	
	
	

}
