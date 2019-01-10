package Testing_Sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Way2Sms {

	public static WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   driver_intitialization().get("http://www.way2sms.com/");
   Login();
   Send_Sms();
   
	}
	
	public static WebDriver driver_intitialization() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriverService service = ChromeDriverService.createDefaultService();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.setExperimentalOption("useAutomationExtension", false);
		return driver = new ChromeDriver(service, options);	
	}

	public static void Login() {
		try {
			driver.manage().deleteAllCookies();
			driver.findElement(By.id("mobileNo")).sendKeys("7893417170");
			driver.findElement(By.id("password")).sendKeys("suryam0078");
			driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Send_Sms() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("7893417170");
		driver.findElement(By.xpath("//*[@id='message']")).sendKeys("Hi Bro, How are You ?");
		driver.findElement(By.id("sendButton")).click();
	}
}
