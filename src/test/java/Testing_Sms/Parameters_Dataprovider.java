package Testing_Sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameters_Dataprovider {
	public WebDriver driver;
	
	@DataProvider(name = "Authentication")

	  public static Object[][] credentials() {

	        return new Object[][] { { "7893417170", "suryam0078" }, { "7893417170", "suryam0078" }};

	  }
	
  @Test (dataProvider="Authentication")
 // @Parameters({"Username", "Password"})
  public void f(String Username, String Password) {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriverService service = ChromeDriverService.createDefaultService();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(service, options);
		
		 driver.get("http://www.way2sms.com/");
		 
		 driver.findElement(By.id("mobileNo")).sendKeys(Username);
		 
		  driver.findElement(By.id("password")).sendKeys(Password);
		  
		   driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();
		   
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   driver.findElement(By.xpath("//*[@class='logout']")).click();
		   
		   driver.quit();
  }
}
