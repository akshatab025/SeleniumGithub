package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/akshat2x/Downloads/grotechminds.html");
		driver.findElement(By.xpath("(html/body/input)[1]")).sendKeys("stbymkt@gmail.com");
		driver.findElement(By.xpath("(html/body/input)[3]")).sendKeys("st@gmail.com");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("hello");
		driver.findElement(By.xpath("(/html/body/input[4])")).sendKeys("Akshata");
		
	}

}
