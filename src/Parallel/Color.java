package Parallel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Color 
{
	static WebDriver driver;
	@Test
	public static void get_color() throws InterruptedException
	{
		driver = new ChromeDriver();
		//driver.get("https://www.youtube.com/");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	List<WebElement> links = driver.findElements(By.tagName("a"));
	//	int count =links.size();
	//	System.out.println(count);
		WebElement yt_icon = driver.findElement(By.id("yt-logo-updated-svg_yt11"));
		//String c = yt_icon.getCssValue("color");
		//System.out.println(c);
		yt_icon.click();
		//Thread.sleep(3000);
		driver.quit();
	
		
		
	}

}
