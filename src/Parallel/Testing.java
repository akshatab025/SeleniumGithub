package Parallel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Testing 
{
	static WebDriver driver;
	@Test()
	public static void browser()
	{
        driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	String str=	driver.getTitle();	
		Assert.assertEquals(str,"Google");

	}
@Test
public static void auto()
{
	 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search= driver.findElement(By.id("APjFqb"));
		search.sendKeys("IPL");
		List<WebElement> element = driver.findElements(By.xpath("(//div/ul[@class='G43f7e']/li)"));
		int noofauto = element.size();
		element.get(1).click();
}

@AfterMethod
public static void close() 
{
	driver.quit();
}

@Test(groups= {"Smoke"})
public static void salary()
{
	System.out.println("salary credited");
}
@Test(groups= {"Smoke"})
public static void emi()
{
	System.out.println("emi deducted");
}
}
