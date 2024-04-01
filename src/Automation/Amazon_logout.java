package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_logout {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver;
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
	

	driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
	driver.findElement(By.id("ap_email")).sendKeys("7483690818");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Savi@1234");
	driver.findElement(By.id("signInSubmit")).click();
	
	Thread.sleep(3000);
	
	Actions action = new Actions(driver);
	WebElement  account =driver.findElement(By.xpath("(//span[@class=\"nav-line-2 \"])"));
	action.moveToElement(account);
	WebElement sub_account =driver.findElement(By.xpath("(//a/span[@class=\"nav-text\"])[20]"));
	action.moveToElement(sub_account);
	
	action.click().build().perform();
	
	Thread.sleep(3000);
	driver.close();
	
	
		
	}

}
