package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.id("pass")).sendKeys("Life@123");
       Thread.sleep(2000);
       driver.findElement(By.id("loginbutton")).click();
       Thread.sleep(2000);
       driver.close();
	}

}
