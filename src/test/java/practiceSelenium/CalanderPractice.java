package practiceSelenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderPractice {

	@Test
	public void init() throws IOException, InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("hyd");
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//input[@id='src']/following-sibling::ul/li"));

		for (int i = 0; i < list.size(); i++) {
			String cityName = driver.findElements(By.xpath("//input[@id='src']/following-sibling::ul/li")).get(6)
					.getText();
			if (cityName.contains("Lakdikapul")) {
				list.get(6).click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("vijaya");
		Thread.sleep(2000);

		List<WebElement> list2 = driver.findElements(By.xpath("//input[@id='dest']/following-sibling::ul/li"));

		for (int i = 0; i < list2.size(); i++) {
			String cityNameDest = driver.findElements(By.xpath("//input[@id='dest']/following-sibling::ul/li")).get(5)
					.getText();
			if (cityNameDest.contains("Varadhi")) {
				list2.get(5).click();
				break;
			}

		}

		String dateMonth = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		
		  String[] dateMonthStr = dateMonth.split(" "); System.out.println(dateMonth);
		  System.out.println(dateMonthStr[0]); System.out.println(dateMonthStr[1]);
		 		
		
		  int year=Integer.parseInt(dateMonthStr[1]);
		  
		  while(!(dateMonthStr[0].equalsIgnoreCase("Oct") && year==2024)) {
		  driver.findElement(By.xpath("//td[@class='next']")).click(); 
		  int day = 23;
			driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[text()=" + day + "]")).click();
		  break; 
		  }
		 
		
		/*
		 * while(!(dateMonth.equalsIgnoreCase("Sep 2024"))) {
		 * driver.findElement(By.xpath("//td[@class='next']")).click(); break;
		 * 
		 * }
		 */
		 Thread.sleep(2000);
		

	}
}
