package NOUSE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SignInAttempt extends BaseClass  {
	WebDriver driver;
	
	@Test
	public void loginApp() {
		driver = startApp(driver, "Chrome", "https://www.dollardays.com/");
		
		
	}
	

}
