package Interview;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> all_link =	driver.findElements(By.xpath("//a"));
		int count = all_link.size();
		System.out.println(count);
		
		Thread.sleep(5000);
		
		List<WebElement> all_drop_down = driver.findElements(By.xpath("(//select/option)"));
		
		int count1 = all_drop_down.size();
		System.out.println(count1);
		System.out.println(all_drop_down.getClass());
		
		Thread.sleep(5000);
		
		driver.close();
	}
}

