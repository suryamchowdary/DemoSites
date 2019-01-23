package Testing_Sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import POM.Page_Objects;
import Testing_Sms.Excel_Data;

public class TestCase {
public static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			ChromeDriverService service = ChromeDriverService.createDefaultService();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("--start-maximized");
			options.addArguments("--disable-extensions");
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(service, options);
			 driver.get("http://www.way2sms.com/");
			
			 try {
				Page_Objects.Username(driver).sendKeys(Excel_Data.ReadExcel(1, 0).getRawValue());
				 
				 Page_Objects.Password(driver).sendKeys(Excel_Data.ReadExcel(1, 1).getStringCellValue());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 Page_Objects.Login(driver).click();
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 Page_Objects.Logout(driver).click();
			 
			 driver.quit();
			 
			 

	}

}
