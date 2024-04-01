package Autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("India");
		List<WebElement> Auto =   driver.findElements(By.xpath("//div[@class='mkHrUc']/div/div/ul/li"));
		int a1 =Auto.size();
		System.out.println(a1);
		//System.out.println(a1-2);
		Auto.get(a1-2).click();

	}

}
