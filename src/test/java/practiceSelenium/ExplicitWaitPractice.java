package practiceSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitPractice {
	WebDriver driver;
	String username="rahulshettyacademy";
	String password="learning";
	WebDriverWait wait;
	JavascriptExecutor js;


	@BeforeClass
	public void init()throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	wait=new WebDriverWait(driver,5);
	js=(JavascriptExecutor) driver;
	}
	
	@Test(priority=1)
	public void testSign()throws Exception {
	WebElement txtUserName=driver.findElement(By.xpath("//input[@id='username']"));
	txtUserName.sendKeys(username);
	WebElement txtPassword=driver.findElement(By.xpath("//input[@id='password']"));
	txtPassword.sendKeys(password);
	WebElement rdoUser=driver.findElement(By.xpath("//input[@value='user']"));
	rdoUser.click();
	WebElement btnOkay=driver.findElement(By.xpath("//button[@id='okayBtn']"));
	wait.until(ExpectedConditions.visibilityOfAllElements(btnOkay));
	btnOkay.click();
	WebElement chkTermsAndConditions=driver.findElement(By.xpath("//input[@id='terms']"));
	chkTermsAndConditions.click();
	WebElement btnSignIn=driver.findElement(By.xpath("//input[@class='btn btn-info btn-md']"));
	btnSignIn.click();
	js.executeScript("window.scrollBy(0,1000)");
	
		}
	@Test(priority=2)
	public void testAddToCart()
	{
		WebElement btnAdd=driver.findElement(By.xpath("class=\"btn btn-info\""));
		WebElement txtIphone=driver.findElement(By.xpath("//a[contains(text(),'iphone X')]"));
		String iphone=txtIphone.getText();
		if(iphone.equalsIgnoreCase("iphone X"))
		{
			btnAdd.click();
		}
		/*
		 * String[] items= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		 * List<String> itemsList=Arrays.asList(items);
		 */
		
	}

}
