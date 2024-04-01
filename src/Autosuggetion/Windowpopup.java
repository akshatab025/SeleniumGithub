package Autosuggetion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("//span[@class='google-text']")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshatab025@gmail.com");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshatab025@gmail.com");
	//String title =	driver.getTitle();
	//System.out.println(title);
		System.out.println(driver.getTitle());
		driver.close();
		//driver.close();
		}

}
