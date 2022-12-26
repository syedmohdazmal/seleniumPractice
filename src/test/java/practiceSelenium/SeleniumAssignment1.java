package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment1 {
	WebDriver driver=null;	
	JavascriptExecutor js=null;

	@BeforeClass
	public void init()throws Exception
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	js = (JavascriptExecutor) driver;
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void testForm()throws Exception {
		
		
		WebElement txtName=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		txtName.click();
		Thread.sleep(2000);
		txtName.sendKeys("Azmal");
		WebElement txtEmail=driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		txtEmail.click();
		Thread.sleep(2000);
		txtEmail.sendKeys("smazmal@yeahoo.co.in");
		WebElement txtPassword=driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
		txtPassword.click();
		Thread.sleep(2000);
		txtPassword.sendKeys("hello1245@");
		js.executeScript("window.scrollBy(0,1000)");
		WebElement chkLoveIceCream=driver.findElement(By.xpath("//input[@id='exampleCheck1']"));
		chkLoveIceCream.click();
		
		WebElement selGender=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		//selGender.click();
		
		Select sel=new Select(selGender);
		sel.selectByIndex(1);
		
		WebElement rdoEmpStatus=driver.findElement(By.xpath("//input[@value='option2']"));
		rdoEmpStatus.click();
		
		WebElement rdoEmpStatusDisable=driver.findElement(By.xpath("//input[@value='option3']"));
		Assert.assertFalse(rdoEmpStatusDisable.isEnabled());
		
		
		WebElement btnDate=driver.findElement(By.xpath("//input[@name='bday']"));
		btnDate.click();
		btnDate.sendKeys("12-02-1998");
		
		WebElement btnSubmit=driver.findElement(By.xpath("//input[@class='btn btn-success']"));
		btnSubmit.click();
		
		WebElement lblSuccessMsg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		String expectedMessage=lblSuccessMsg.getText();
		Assert.assertEquals(expectedMessage,"×Success! The Form has been submitted successfully!.");
		System.out.println("Statement after assertion");
	
		}
}


