package Absolute;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver;
	// driver= new ChromeDriver();
	 ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver= new ChromeDriver(options);
	 driver.navigate().to("https://www.redbus.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	// driver.switchTo().alert().dismiss();
	 driver.findElement(By.id("onward_cal")).click();
	 Thread.sleep(4000);
	//driver.findElement(By.xpath("//button[text()='Okay']")).click();
	 String year="2023";
	 String month="October";
	 String date="8";
	 
	 while(true)
	 {
		String month_year = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-sc-1tlckkc-2 eTppvw'])[3]")).getText();
		String arr[]= month_year.split(" ");
		String mon=arr[0];
		String yr=arr[1];
		
		if(mon.equals(month) && yr.equals(year))
			break;
		else
		{
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-sc-1tlckkc-2 eTppvw'])[4]")).click();
		}
			
	}
	 //date selection
	 List<WebElement> all_dates =driver.findElements(By.xpath("(//span[@class='DayTilesWrapper__DayWrapper-moo2xh-1 loqlv'])[2]//span"));
	 
	 for(WebElement ele :all_dates)
	 {
		 String dt = ele.getText();
		 
		 if(dt.equals(date))
		 {
			 ele.click();
			 break;
		 } 
	 }
		
	}

}
