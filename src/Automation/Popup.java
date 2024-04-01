package Automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("user_full_name")).sendKeys("Akshata B Patil");
	driver.findElement(By.id("user_email_login")).sendKeys("akshatabpatilece@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("Savi@4321");
	//driver.findElement(By.id("tnc_checkbox")).click();
	driver.findElement(By.id("user_submit")).click();
	
	Thread.sleep(5000);
	
	Alert alert = driver.switchTo().alert();
	String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	System.out.println(alertMessage); // Print Alert Message
	Thread.sleep(5000);
	alert.accept();
	
	
	}

}
