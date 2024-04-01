package Absolute;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class India {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver (options);
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> noofautosuggetion =	driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li"));
		Thread.sleep(2000);
		int akshata = noofautosuggetion.size();
		System.out.println(akshata);
		//noofautosuggetion.get(2).click();
		noofautosuggetion.get(akshata -9).click();
		
	}

}
