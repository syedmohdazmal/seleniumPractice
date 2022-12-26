package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPracticeRobotClass {
	WebDriver driver=null;	
	

	
	@BeforeClass
	public void init()throws Exception
	{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options  = new ChromeOptions();
    options.setExperimentalOption("excludeSwitches", "disable-popup-blocking");
   // DesiredCapabilities capabilities = new DesiredCapabilities();
   // capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    driver = new ChromeDriver();
	driver.get("http://ocr.space/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test
	public void testFileUpload()
	{
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\syedm\\OneDrive\\Desktop\\report.pdf");
	}

}
