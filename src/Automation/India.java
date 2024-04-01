package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class India {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("INDIA");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='No thanks']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
