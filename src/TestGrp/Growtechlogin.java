package TestGrp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Growtechlogin {

	public static void main(String[] args) 
			{
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://grotechminds.com/registration/");
				driver.manage().window().maximize();
				driver.findElement(By.id("1")).sendKeys("Akshata");
				driver.findElement(By.id("2")).sendKeys("Patil");
				driver.findElement(By.id("3")).sendKeys("Aks@1234");
				driver.findElement(By.id("4")).sendKeys("Patil	");
				driver.findElement(By.id("5")).sendKeys("ABCD");
				driver.findElement(By.xpath("//input[@value='FeMale']")).click();
				driver.findElement(By.xpath("//option[@value='Hindu']")).click();
				driver.findElement(By.name("checkbox-833[]")).click();
				WebElement resume=	driver.findElement(By.name("file-935"));
				resume.sendKeys("C:\\Users\\akshat2x\\Downloads\\Mukta_2.6YOE_Automation+Manual Resume.pdf");
				// C:\Users\akshat2x\Downloads\
				driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
