package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/akshat2x/Downloads/frame.html");
		//driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("xyz");
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("abc");

	}

}
