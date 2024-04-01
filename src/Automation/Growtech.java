package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtech {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/akshat2x/Downloads/grotechminds.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("akshata");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("hi");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("hello");
		driver.findElement(By.xpath("(/html/body/input)[4]")).sendKeys("not applicable");
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		driver.findElement(By.xpath("(/html/body/input)[7]")).click();

	}

}
