package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtech1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/akshat2x/Downloads/grotechminds.html");
		driver.findElement(By.xpath("(/html/body/form/input)")).sendKeys("Akshata Patil");
		driver.findElement(By.xpath("(/html/body/form)[2]")).click();
	}

}
