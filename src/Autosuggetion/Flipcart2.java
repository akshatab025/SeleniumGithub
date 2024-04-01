package Autosuggetion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipcart2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button[.='✕'])")).click();
		driver.findElement(By.xpath("(//button[.='✕'])")).click();
		Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		
	}

}
