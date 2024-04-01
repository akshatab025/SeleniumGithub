package Absolute;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver;
	driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/?ref_=nav_signin");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Select sel = new Select(driver.findElement(By.xpath("(//select[@id='searchDropdownBox'])")));
	//sel.selectByValue("search-alias=fashion");
	sel.selectByVisibleText("Apps & Games");
	
	Thread.sleep(5000);
	
	
	
	
	
	driver.close();
	}

}
