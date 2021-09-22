package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import utility.ReadConfig;

public class NewBaseClass {
	

	
	//Login Information-----------
	//public String baseURL = "https://www.dollardays.com/";
	//public String uName = "Test@yahoo.com";
	//public String pass = "122345";
	public static WebDriver driver = null;
	///-------------------------------------

	
	ReadConfig readConfig = new ReadConfig();	
	public String baseURL = readConfig.getApplicationUrl();
	public String myEmail = readConfig.getUserEmail();
	public String pass = readConfig.getUPassword();
	
	

	
	
	//--Making Screen Shots------------------
	public static void takeScreen(String screenName) throws IOException {
		Date currentDate = new Date();
		String ScreenShotFilename = currentDate.toString().replace("", "-").replace(":", "-");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/"+ ScreenShotFilename+"_"+screenName + ".png"));
	}
	//--------------------------------
	
	
	
	
	
	//All common to all for test pages*****************
	
	//@Parameters("browser")
	
	//--------Launching the Browser----------
	@BeforeTest
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//-------------------------------------
	
	
	
	
	@AfterClass
	public void close(){
		driver.close();
		driver.quit();
	}

	//--------------------------------------
	
	
	
}
