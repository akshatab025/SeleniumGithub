package Autosuggetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mamaearth {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://mamaearth.in/shop");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div/button[@id='wzrk-cancel-id']")).click();
	driver.findElement(By.xpath("(//a[@class='active'])")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//ul/li[4]/div/div[2]/a[@id='subText'][9]")).click();
	
	
	
	}

}
