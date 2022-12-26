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

public class PracticeTest {
WebDriver driver=null;	

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
public void testPractice()throws Exception {
WebElement chkCheckbox1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
chkCheckbox1.click();
Assert.assertTrue(chkCheckbox1.isSelected());
WebElement chkCheckbox2=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
chkCheckbox2.click();
Assert.assertTrue(chkCheckbox2.isSelected());
WebElement chkCheckbox3=driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
chkCheckbox3.click();
Assert.assertTrue(chkCheckbox3.isSelected());
List<WebElement> chkSize=driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("total check boxes are:" + chkSize.size());

	}
}
