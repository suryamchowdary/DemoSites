package Testing_Sms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

  public WebDriver driver;

  @Parameters("browser")

  @BeforeTest

  // Passing Browser parameter from TestNG xml

  public void beforeTest(String browser) {

  // If the browser is Firefox, then do this

  if(browser.equalsIgnoreCase("firefox")) {

	  driver = new FirefoxDriver();

  // If browser is IE, then do this	  

  }else if (browser.equalsIgnoreCase("chrome")) { 

	  // Here I am setting up the path for my IEDriver

	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriverService service = ChromeDriverService.createDefaultService();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(service, options);

  } 

  // Doesn't the browser type, lauch the Website

  driver.get("http://www.way2sms.com/"); 

  }

  // Once Before method is completed, Test method will start

  @Test 
  public void login() throws InterruptedException {

	  driver.manage().deleteAllCookies();
	    try {
			driver.findElement(By.id("mobileNo")).sendKeys("7893417170");
			driver.findElement(By.id("password")).sendKeys("suryam0078");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();

	}  

  @AfterTest 
  public void afterTest() {

		driver.quit();

	}

}
