package Absolute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class grt {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.grtjewels.com/all-jewellery.html?utm_source=google&utm_medium=cpc&utm_campaign=RO-April_GRT-Jewellers_Ecom_Google_Brand%20GRT_Search_Sales_01042023Phrase_BLR&gad_source=1&gclid=CjwKCAjwkuqvBhAQEiwA65XxQMmAwkpkYuYsSbSIHbad0OKll9pNyuIZ8yQkVKfkhW51-cpHMeGorRoCZNgQAvD_BwE");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//div/dt[@class='filter-options-title main-filter-price']")).click();
	
	//WebElement dd = driver.findElement(By.xpath("(//li/span[@class='layered-navigation-item checkbox-wrapper'])[2]"));
	//Actions action = new Actions(driver);
	//action.moveToElement(dd).perform();
	
      driver.findElement(By.xpath("(//span/input[@class='custom-detail '])[2]")).click();
      
     WebElement dd= driver.findElement(By.id("sorter"));
      
      Select sel = new Select(dd);
	sel.selectByValue("low-high");
	
	WebElement hover = driver.findElement(By.xpath("(//li/a[@class=' nav-anchor'])[5]"));
	Actions action = new Actions(driver);
	action.moveToElement(hover).perform();
	
	
		
		
	}

}
