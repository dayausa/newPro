package aspiration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCases.NewBaseClass;

public class OurProductsPage extends NewBaseClass {
	WebDriver ldriver;
	
	
	
	//Constructor--------------------------
		public OurProductsPage(WebDriver ldriver){
		this.ldriver=ldriver;
		PageFactory.initElements(ldriver, this);
		}
		//-------------------------------------
		
		
	
	@FindBy(xpath = "//button[normalize-space()='Get Aspiration']")
	@CacheLookup
	public WebElement AspirationBtu;
	
	
	@FindBy(xpath = "//input[@id='join-waitlist-input']")
	@CacheLookup
	public WebElement TxtEmail;
	
	@FindBy(xpath = "//button[normalize-space()='×']")
	@CacheLookup
	public WebElement BtuClose;
	
	
	
	@FindBy(xpath = "//button[normalize-space()='Get Aspiration Plus']")
	@CacheLookup
	public WebElement AspirationPlusBtu;
	
	
	
	@FindBy(xpath = "//div[@class='option selected']//h3[1]")
	@CacheLookup
	public WebElement YearlyOption;
	
	@FindBy(xpath = "//h3[normalize-space()='Monthly']")
	@CacheLookup
	public WebElement MonthlyOption;
	
	
	@FindBy(xpath = "//b[normalize-space()='$71.88']']")
	@CacheLookup
	public WebElement YearlyAmount;
	
	@FindBy(xpath = "//b[normalize-space()='$7.99']")
	@CacheLookup
	public WebElement MonthlyAmount;
	
	
	//-----------Actions------------------
	public void clickOnAspiration(){	
		AspirationBtu.click();
	}
	
	
	public void fillEmail(){	
		TxtEmail.sendKeys(myEmail);
	}
	
	
	public void clickOnClose(){	
		BtuClose.click();
	}
	
	public void clickOnAspirationPlus(){	
		AspirationPlusBtu.click();
	}
	
	//------------------------------------
	
	public WebElement YearlyOption(){	
		return YearlyOption;
	}
	
	public WebElement MonthlyOption(){	
		return MonthlyOption;
	}
	
	
	public WebElement YearlyAmount(){	
		return YearlyAmount;
	}
	
	public WebElement MonthlyAmount(){	
		return MonthlyAmount;
	}
	
}
