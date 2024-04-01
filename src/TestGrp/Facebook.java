package TestGrp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args)
	{	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver (options);
		
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		//ChromeOptions options1 = new ChromeOptions();
          //driver= new ChromeDriver(options);
          driver.findElement(By.id("email")).sendKeys("+91 7026966704");
	 driver.findElement(By.id("pass")).sendKeys("Akshata@1234");
	 driver.findElement(By.id("loginbutton")).click();
	// options.addArguments("--disable-notifications");
	
	
	}

}
