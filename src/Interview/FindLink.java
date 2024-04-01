package Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLink 
{
	public static void main(String[] args) 
	{
       WebDriver driver;
       driver = new ChromeDriver();
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       List<WebElement>	list = driver.findElements(By.xpath("//a"));
       int x = list.size();
       System.out.println(x);
       driver.close();
	}

}
