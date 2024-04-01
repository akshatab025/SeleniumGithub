package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("7026966704");
	    driver.findElement(By.name("pass")).sendKeys("Akshata@1234");
	    driver.findElement(By.name("login")).click();
	    driver.wait(10);
	    driver.close();	   
	}

}
