package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {
	WebDriver driver=null;	
	String name="Azmal";

	@BeforeClass
	public void init()throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void testAlertPractice()throws Exception {
	WebElement txtName=driver.findElement(By.xpath("//input[@id='name']"));
	txtName.click();
	txtName.sendKeys(name);
	
	WebElement btnAlert=driver.findElement(By.xpath("//input[@id='alertbtn']"));
	btnAlert.click();
	Thread.sleep(2000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	WebElement btnConfirm=driver.findElement(By.xpath("//input[@id='confirmbtn']"));
	btnConfirm.click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().dismiss();
	
		}
	}


