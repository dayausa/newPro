package NOUSE;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.util.List;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class MavenPro {
	
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdirver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://dollardays.com/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.id("sm_menu_ham")).click();
		

		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.linkText("Sign In")).click();
		
		 
		
		driver.findElement(By.id("inputLoginUsername")).sendKeys("abc@gmail.com");
	    driver.findElement(By.id("inputLoginPassword")).sendKeys("123456");
	      // submitting form with submit()
	      
	    driver.findElement(By.id("inputLoginPassword")).submit();
		
	
		
		
		//driver.manage().window().maximize();
		
		/*if(driver.getTitle().contains(".com")) {
			
			System.out.println("passed");
			
		}else {
			
			System.out.println(driver.getTitle());
		}
	*/	
		/* Scroll up-----------
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		int i =1;
		while(i<=10) {
			
			jse.executeScript("window.scrollBy(0,1000)");
			i++;
		}
		
		*/
		
		
		
		/*WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.dayasena.com/");
		driver2.manage().window().maximize();
		
		
		System.out.println("Page title is : " + driver.getTitle());
		driver.manage().window().maximize();
		driver.switchTo().window("Amazon.com. Spend less. Smile more.");
		
		*/
		
//WebElement drvr1 = driver.findElement(By.id("twotabsearchtextbox"));
	//rvr1.sendKeys("Selenium");
	//rvr1.submit();
	/*	
		List<WebElement> list  = driver.findElements(By.tagName("a"));
		int LintCount = 0;
		for(WebElement l:list) {
			
			System.out.println(l.getAttribute("href"));
			++LintCount;
			
		}
		
		driver.quit();*/
		
		//System.out.println(LintCount);
		
	//--------------Screen Shot----------------
		//Take the screenshot
     
		
	}


}
