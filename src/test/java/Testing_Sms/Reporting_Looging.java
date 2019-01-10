package Testing_Sms;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporting_Looging {
	
	private static WebDriver driver;

	private static Logger Log = Logger.getLogger(Reporting_Looging.class.getName());

    @Test

	public static void test() {

		
    	DOMConfigurator.configure("log4j.xml");

		 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			ChromeDriverService service = ChromeDriverService.createDefaultService();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-extensions");
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(service, options);

        Log.info("New driver instantiated");
       

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Log.info("Implicit wait applied on the driver for 10 seconds");

        driver.get("http://www.way2sms.com/");

        Log.info("Web application launched");

        // Our first step is complete, so we produce a main event log here for our reports.

/*        Reporter.log("Application Lauched successfully | ");

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
*/
        Log.info("Click action performed on My Account link");

        driver.findElement(By.id("mobileNo")).sendKeys("7893417170");

        Log.info("Username entered in the Username text box");

        driver.findElement(By.id("password")).sendKeys("suryam0078");

        Log.info("Password entered in the Password text box");

        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();

        Log.info("Click action performed on Submit button");

        // Here we are done with our Second main event

        Reporter.log("Sign In Successful | " );

        driver.findElement(By.xpath("//*[@class='logout']")).click();

        Log.info("Click action performed on Log out link");

        driver.quit();

        Log.info("Browser closed");

        // This is the third main event

        Reporter.log("User is Logged out and Application is closed | ");

	}

}