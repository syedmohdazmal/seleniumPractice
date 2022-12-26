package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDemoRedcliff {
	@Test
	public void assertDemo() throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("WebDriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://crmsalesdev.redcliffelabs.com/");
		driver.manage().window().maximize();
		//WebElement txtSearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//txtSearch.sendKeys("laptop");
		Thread.sleep(2000);
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("https://crmcsdev.redcliffelabs.com");
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.sendKeys("Test@123");
		WebElement btnLogin=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth jss8 css-1qelgoy']"));
		btnLogin.click();
		/*WebElement btnSearchIcon=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearchIcon.click();
		Thread.sleep(2000);
		
		WebElement amazonlogo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		Assert.assertTrue(amazonlogo.isDisplayed());
		
		WebElement lblDepartment=driver.findElement(By.xpath("(//span[contains(text(),'Department')])[1]"));
		String actualString=lblDepartment.getText();
		Assert.assertEquals(actualString, "Department");*/
		
	}

}
