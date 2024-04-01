package Autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		 
		 driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 	 driver.findElement(By.id("APjFqb")).sendKeys("IPL");
		 	List<WebElement> auto =	driver.findElements(By.xpath("(//div/ul/li)"));
		int auto_size = auto.size();
		System.out.println(auto_size);
		auto.get(4).click();
		Thread.sleep(5000);
		driver.close();
	}

}
