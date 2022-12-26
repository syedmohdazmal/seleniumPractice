package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeTest
	public void init() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="setData")
	public void testSignIn(String user,String password) throws InterruptedException
	{
		WebElement txtUser=driver.findElement(By.xpath("//input[@id='login1']"));
		txtUser.sendKeys(user);
		WebElement txtPassword=driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(2000);
		txtPassword.sendKeys("password");
		WebElement btnClick=driver.findElement(By.xpath("//input[@class='signinbtn']"));
		btnClick.click();
	}
	
	@DataProvider
	public Object[][] setData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="azmal@rediffmail.com";
		data[0][1]="azmal1234";
		data[1][0]="syedmohd@rediffmail.com";
		data[1][1]="syedmohd908776";
		data[2][0]="zeenath@rediffmail.com";
		data[2][1]="zeenath908776";
	
		return data;
		
	}
	
	



}
