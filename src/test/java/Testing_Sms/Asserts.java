package Testing_Sms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts {
	
	public WebDriver driver;
  @Test
  public void main() {
	  
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriverService service = ChromeDriverService.createDefaultService();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(service, options);
		 driver.get("http://www.way2sms.com/");
		 
		 WebElement Usernme = driver.findElement(By.id("mobileNo"));
		 
		Assert.assertTrue(Usernme.isEnabled());
		
		Usernme.sendKeys("7893417170");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
  }


  @Test
 
  public void test() {
 
   String sValue = "Kode Suryam";
 
   System.out.println(" What is your full name");
 
   Assert.assertEquals("Kode Suryam", sValue);
 
   System.out.println(sValue);
 
  
}}
