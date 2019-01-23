package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import POM.Page_Factory;

public class TestCase_01 {

	public static WebDriver driver;
	

	
	public static void main(String[]args)
	{
		  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			ChromeDriverService service = ChromeDriverService.createDefaultService();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-extensions");
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(service, options);
			 driver.get("http://www.way2sms.com/");
        
        PageFactory.initElements(driver, TestCase_01.class);
        PageFactory.initElements(driver, Page_Factory.class);
        Page_Factory.username.sendKeys("7893417170");
        Page_Factory.password.sendKeys("suryam0078");
        Page_Factory.login.click();
        Page_Factory.logout.click();
	}
}
