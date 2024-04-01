package stestamazon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit
{
public static ChromeDriver driver;
	
	@BeforeMethod
	
	public void launch() throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver (options);
		//driver = new  ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();	
	}
	
	@AfterMethod
	
		public void  quit() throws IOException, InterruptedException 
		{
			//driver = new  ChromeDriver();
		Thread.sleep(10000);	
		driver.quit();
		}

}
