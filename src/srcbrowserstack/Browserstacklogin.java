package srcbrowserstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browserstacklogin
{
	public static WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		 driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
	}
	@Test
	public void test()
	{
	//WebElement sign = driver.findElement(By.xpath("(//a[text()=\"Sign in\"])"));
	//sign.click();
	WebElement email=driver.findElement(By.id("identifierId"));
	email.sendKeys("akshatab025");
	WebElement next =driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[2]"));
	next.submit();
WebElement pwd=driver.findElement(By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[1]"));
pwd.sendKeys("Savi@1234");
WebElement next1 = driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[2]"));
next1.click();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		driver.quit();
	}
}
