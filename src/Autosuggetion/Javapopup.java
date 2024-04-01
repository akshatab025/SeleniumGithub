package Autosuggetion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javapopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("file:///C:/Users/akshat2x/Downloads/grotech.html");
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    //driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='1']")).sendKeys("Akshata");

	}

}
