package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	
	}
	
	//----------load Base Url -------
	public String getApplicationUrl() {
		String url = pro.getProperty("baseURL");
		return url;
	}



	//----------load Base Email  -------
	public String getUserEmail() {
		String emailsAdd = pro.getProperty("email");
		return emailsAdd;
	}	


	//----------load Base PassWord  -------
	public String getUPassword() {
		String pas = pro.getProperty("Pass");
		return pas;
	}	
	
	
}
