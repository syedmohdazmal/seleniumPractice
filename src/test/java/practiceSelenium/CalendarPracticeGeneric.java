package practiceSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPracticeGeneric {
	
	@Test
	public void calendarTest() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		WebElement txtCalendar=driver.findElement(By.xpath("//input[@id='travel_date']"));
		txtCalendar.click();
		List<WebElement> txtDate=driver.findElements(By.xpath("//td[@class='day']"));
		
		for(int i=0;i<txtDate.size();i++)
		{
			String dateText=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
			if(dateText.equalsIgnoreCase("25"))
			{
				txtDate.get(i).click();
				break;
			}
			
		}

	}

}
