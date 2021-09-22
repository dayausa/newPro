package TestCases;




import java.io.IOException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import aspiration.NewHomePage;
import aspiration.OurProductsPage;


//DollerDayPages


	public class NewTestRun extends NewBaseClass {

			
		
			
		
		@Test
		public void fullPageLoad() throws IOException, InterruptedException {
			
			driver.get(baseURL);
			//ScreenShot full page load
			takeScreen("Home_Page");	
			Thread.sleep(1500);
		
		}

		


	 @Test
		public void goSpendSave() throws InterruptedException, IOException  {		
			
			NewHomePage home = new NewHomePage(driver);
			home.clickOnSpend();
			
			OurProductsPage ourProducts = new OurProductsPage(driver);
			ourProducts.clickOnAspiration();
			ourProducts.fillEmail();
			Thread.sleep(2500);
			ourProducts.clickOnClose();
			Thread.sleep(1500);
			ourProducts.clickOnAspirationPlus();
			Thread.sleep(1500);
			Assert.assertTrue(ourProducts.YearlyOption().isDisplayed());
			Assert.assertTrue(ourProducts.MonthlyOption().isDisplayed());
			
			
			
			Assert.assertTrue(ourProducts.MonthlyAmount().isDisplayed());
			Assert.assertTrue(ourProducts.MonthlyAmount().isDisplayed());
			
		
		}
	
		
	 
	 
	 
	 

	
	
	

	

	
}
	
	
	
	
	
