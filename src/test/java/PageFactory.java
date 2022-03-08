import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.ConfigReader;

public class PageFactory {
	
	ConfigReader s;
	WebDriver driver;
	

	public static ThreadLocal<WebDriver> tlDriver=new  ThreadLocal<>();
	
	public WebDriver init_Driver() throws IOException {
		
		
		s=new ConfigReader();
		String browser=s.init_prop();
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/geckodriver");
			tlDriver.set(new FirefoxDriver());			
		}else {
			System.out.println("Please provide correct browser");
		}
			
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}
	
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}
	

}
