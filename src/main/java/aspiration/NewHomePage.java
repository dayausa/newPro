package aspiration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


	public class NewHomePage {

	WebDriver ldriver;

	
	

	//Locator------------------------------------
	
	
	@FindBy(xpath = "//a[@class='Element-sc-1dc3ws0-0 Link__StyledLink-sc-17puyxl-0 eklGNJ giYPMc atom-link'][normalize-space()='Spend & Save']")
	@CacheLookup
	public WebElement SpendSave;
	
	
	
	
	
	
	
	
	
			
	
	
	//------------------------------------------- 			





	//Constructor--------------------------
	public NewHomePage(WebDriver rdriver){
	this.ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	//-------------------------------------





	
	
	//----------AS------------
	public void clickOnSpend(){	
		SpendSave.click();
	}
	
	
	//-----------------------------



}
