
package NOUSE;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends BaseClass {
	
	
	
		WebDriver driver;

		//By bannerName =By.class("mid-school-banner");
		
		By heading  = By.className("dropdown");

		public homePage(WebDriver driver){		
			this.driver = driver;		
		}
		
		

		//@FindBy(id = "dropdown")
		//public void clickSign() {		
			//driver.findElement(signInbutton).click();
		//}




	
	
	
}


