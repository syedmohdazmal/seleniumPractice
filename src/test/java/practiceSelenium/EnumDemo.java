package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
 
// Define all browser names you are supporting in framework
enum BrowserNames {
	CHROME,FIREFOX,EDGE
}
 
 
public class EnumDemo {
 
	// Comparing value using if else
	private WebDriver launchBrowser(BrowserNames browserName) {
		WebDriver driver = null;
		if (browserName == BrowserNames.CHROME) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName == BrowserNames.FIREFOX) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName == BrowserNames.EDGE) {
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	// Comparing value as switch
	private WebDriver launchBrowserSwitch(BrowserNames browserName) {
		WebDriver driver = null;
		switch (browserName) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		}
		return driver;
	}
		
		
	@Test
	public void googleTestChrome()
	{
		WebDriver driver = launchBrowser(BrowserNames.CHROME);
		driver.get("https://www.google.com");
		driver.close();
	}
	
	@Test
	public void googleTestFirefox()
	{
		WebDriver driver = launchBrowserSwitch(BrowserNames.FIREFOX);
		driver.get("https://www.google.com");
		driver.close();
	}
	
	@Test
	public void googleTestEdge()
	{
		WebDriver driver = launchBrowserSwitch(BrowserNames.EDGE);
		driver.get("https://www.google.com");
		driver.close();
	}
}

