package TestGrp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement myframe = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(myframe);
		Thread.sleep(2000);
		WebElement d1 =	driver.findElement(By.xpath("//span[.='Grabbable 10 of 32.']"));
		Thread.sleep(2000);
		WebElement d2 = driver.findElement(By.xpath("//div[@class='h5p-inner ui-droppable']"));
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(d1, d2).perform();
		

	}

}
