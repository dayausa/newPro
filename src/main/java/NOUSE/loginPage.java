
package NOUSE;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {

	WebDriver driver;
	private static String PAGE_URL="https://www.toptal.com";

	public loginPage(WebDriver driver) {
		this.driver = driver;
		driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath = "//a[normalize-space(.)='Sign in']")
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}
	
	
	@FindBy(xpath = "//a[normalize-space(.)='Sign In']")
	private WebElement dropdownsignIn;

	public WebElement getDropdownsignIn() {
		return dropdownsignIn;
	}
	
	

	   @FindBy(id="inputLoginUsername")
	    WebElement txtUser;
	   
	   public WebElement getUsername() {
			return txtUser;
		}
	    
	   @FindBy(id="inputLoginPassword")
	    WebElement txtPass;
	  
	   public WebElement getPassword() {
			return txtPass;
		}
	   
	   
		@FindBy(xpath = "//button[normalize-space(.)='Sign in']")
		private WebElement loginBtn;

		public WebElement getLoginBtn() {
			return loginBtn;
		}
		
		
		
		
		public void login(String username, String password) throws InterruptedException {
			Thread.sleep(1000);
			getSignIn().click();
			getDropdownsignIn().click();
			Thread.sleep(1000);
			getUsername().sendKeys(username);
			getPassword().sendKeys(password);
			Thread.sleep(500);
			getPassword().submit();
			//getLoginBtn().click();
			String expectedTitle = "DollarDays | Bulk Goods for Nonprofits, Businesses & Schools | Wholesale Products";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle, " Successfully Logged into the HomePage");
		}
		
	
		public void invokeLogin() throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException {
			Thread.sleep(1000);
			getSignIn().click();
			getDropdownsignIn().click();
			getUsername().sendKeys("srikanthtesting100@gmail.com");
			getPassword().sendKeys("cGFzc3dvcmQxMjM=");
			getPassword().submit();
			//getLoginBtn().click();
		}







}
