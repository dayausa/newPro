package NOUSE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	
	public static WebDriver startApp(WebDriver driver, String browserName, String appURL) {
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}else {
			
			System.out.println("NO Good Loading the Web Driver");
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		return driver;
	}
	
	
	
	
	public static void quitBrowser(WebDriver driver) {		
		//driver.quit();		
	}
	
	
	
	
	
	
	
	

	
	//public String baseURL = "heep://dollerday.com";
	//public String uName = "Test@yahoo.com";
	//public String Pass = "122345";
	//public static WebDriver driver;
	
	

	
	
	

	
	

}
