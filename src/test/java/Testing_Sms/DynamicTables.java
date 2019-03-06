package Testing_Sms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTables {

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
			 driver.get("https://www.w3schools.com/sql/sql_in.asp");
			 
			 List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"main\"]/div[5]/table/tbody/tr"));
			 System.out.println(rows.size());
			 
	}

}
