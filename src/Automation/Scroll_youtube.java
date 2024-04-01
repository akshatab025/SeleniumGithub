package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_youtube {

	public static void main(String[] args)
	{
		WebDriver driver;
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		 driver.navigate().to("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ytv = driver.findElement(By.xpath("(//a[@id=\"video-title-link\"])[1]"));
		 Point P1 = ytv.getLocation();
		int x =  P1.getX();
		int y = P1.getY();
		
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,y)");
		//ytv.click();
		
		
		 
		 
		
	}

}
