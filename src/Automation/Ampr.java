package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ampr {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement sign_over = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(sign_over).perform();
		//Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[text()='Sign in'])")).click();
		driver.findElement(By.id("ap_email")).sendKeys("91 7483690818");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Savi@1234");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(4000);
		
		WebElement pmlink = driver.findElement(By.xpath("(//a[@class='nav_a'])[46]"));
		Point  p = pmlink.getLocation();
		int x= p.getX();
		int y=p.getY();
		System.out.println(y);
		System.out.println(x);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,6104)");
		pmlink.click();
		Thread.sleep(4000);
		//List<WebElement> iframe_element = driver.findElements(By.tagName("iframe"));
		//System.out.println(iframe_element.size());
		//System.out.println(iframe_element);
		//JavascriptExecutor exe = (JavascriptExecutor)driver;
		//Integer noofframes = Integer.parseInt(exe.executeScript("returnwindow.length").toString());
	//	System.out.println(noofframes);
		//System.out.println(count);
		//System.out.println(iframe_element);
		
		//driver.switchTo().frame("ape_Gateway_desktop-ad-center-1_desktop_iframe");
		
		
		driver.close();
	}

}
