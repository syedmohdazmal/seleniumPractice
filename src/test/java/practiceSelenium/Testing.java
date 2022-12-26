package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	
	@Test
	public void assertDemo() throws InterruptedException {
		WebDriver driver=null;
		System.setProperty("WebDriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement txtSearch=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("laptop");
		Thread.sleep(2000);
		
		WebElement btnSearchIcon=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearchIcon.click();
		Thread.sleep(2000);
		
		WebElement amazonlogo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		Assert.assertTrue(amazonlogo.isDisplayed());
		
		WebElement lblDepartment=driver.findElement(By.xpath("(//span[contains(text(),'Department')])[1]"));
		String actualString=lblDepartment.getText();
		Assert.assertEquals(actualString, "Department");
		
		
	}

}
