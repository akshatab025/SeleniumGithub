package Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> Auto=	driver.findElements(By.xpath("//div/div[@class='s-suggestion-container']/div"));
		int count= Auto.size();
		System.out.println(count);
		Auto.get(count -2).click();
		

	}

}
