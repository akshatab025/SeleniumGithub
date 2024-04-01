package Absolute;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pp 
{
	public static void main(String[] args) 
	{
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  WebElement  close_window= driver.findElement(By.xpath("(//span[text()='✕'])"));
  close_window.click();
  
  WebElement search_bar = driver.findElement(By.xpath("(//div/input[@name='q'])"));
  search_bar.sendKeys("iphone14");
 
  driver.findElement(By.xpath("(//button[@class='_2iLD__'])")).click();
  driver.findElement(By.xpath("(//div[@class='CXW8mj'])[2]")).click();
  
  Set<String> pcid = driver.getWindowHandles();
  Iterator<String>  pc = pcid.iterator();
  String parent = pc.next();
  String child =pc.next();
  driver.switchTo().window(child);
  
  WebElement  youtube = driver.findElement(By.xpath("(//a[@class='_1arVWX'])[23]"));
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  Point P =youtube.getLocation();
  int x=P.getX();
  int y= P.getY();
  
  System.out.println(x);
  System.out.println(y);
  
  jse.executeScript("window.scrollBy(0,6000)");
  
  youtube.click();
  
  
 
 
  
  
  
  //driver.findElement(By.xpath(null))
  
  
  
//driver.close();
	}

	private static JavascriptExecutor JavascriptExecutor(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

}
