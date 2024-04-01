package Autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("shoe");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		List<WebElement> auto1 =driver.findElements(By.xpath("(//div//ul/li[@class='Y5N33s'])"));
		Thread.sleep(3000);
        int a2 = auto1.size();
        System.out.println(a2);
        auto1.get(a2-4).click();
        

	}

}
