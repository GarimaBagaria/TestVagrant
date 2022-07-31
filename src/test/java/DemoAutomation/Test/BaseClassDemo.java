package DemoAutomation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClassDemo {
	
	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","./Driver//chromedriver_new.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
