package TestGrp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sourceamazon.Login;
import stestamazon.LaunchQuit;

public class CrossBrowser extends LaunchQuit
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void first(String nameofyourbrowser)
	{
		if(nameofyourbrowser.equals("Chrome"))
		{
			//driver = new ChromeDriver();	
		}
		else if(nameofyourbrowser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		

		
	}
}
