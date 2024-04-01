package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");
         driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

	}

}
