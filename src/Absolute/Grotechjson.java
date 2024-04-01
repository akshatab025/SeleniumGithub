package Absolute;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Grotechjson {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/akshat2x/Downloads/grotechminds.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Akshata");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("123");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Savi@12");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Patil");
		//driver.findElement(By.xpath("(/html/body/form/input)[3]")).click();
		driver.findElement(By.xpath("(/html/body/form[2]/input)[2]")).click();
		//driver.findElement(By.xpath("(/html/body/form[2]/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		driver.findElement(By.xpath("(/html/body/a)")).click();
		driver.findElement(By.xpath("(/html/body/select)[1]")).click();
		driver.findElement(By.xpath("(/html/body/input)[7]")).click();
		
	}

}
