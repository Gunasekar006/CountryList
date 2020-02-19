import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

	
	
	
	public Properties prop;
	public Config() throws IOException {
		FileInputStream fis=new FileInputStream(new File("src/main/source/Application.properties"));
		
		prop.load(fis);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String getURL() {
		String url=prop.getProperty("url");
		return url;
	}

	
	
	
	
}
