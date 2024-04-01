package frame;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amzon {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("7483690818");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Savi@1234");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();
		
		Set<String> parentchild =  driver.getWindowHandles();
		System.out.println(parentchild);
		Iterator<String> pcid =	parentchild.iterator();
		String parentid1 = pcid.next();
		String childid1 = pcid.next();
		driver.switchTo().window(childid1);
		driver.findElement(By.id("wishListMainButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("View Your List")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add to Cart")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Proceed to checkout'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		Thread.sleep(5000);
		WebElement radio = driver.findElement(By.xpath("//*[@type='radio'and@value='SelectableAddCreditCard']"));
		radio.click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//img[@class='apx-add-pm-trigger-image'])[1]")).click();
	    Thread.sleep(3000);
	    driver.switchTo().frame(0);
	   WebElement addcreditcard = driver.findElement(By.name("addCreditCardNumber"));
	   addcreditcard.sendKeys("4160 2115 1192 0341");
	   WebElement addname = driver.findElement(By.name("ppw-accountHolderName"));
	   addname.sendKeys("AKSHATA PATIL");
	   WebElement cardvalidity = driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[3]"));
	   Actions action = new Actions(driver);
	   action.moveToElement(cardvalidity).perform();
	   driver.findElement(By.xpath("(//div/ul[@class='a-nostyle a-list-link']/li)[3]")).click();
	   WebElement cardyear = driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[4]"));
	   action.moveToElement(cardyear).perform();
	   driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]")).click();
	   driver.findElement(By.id("pp-hYFH9g-110")).sendKeys("333");
	   driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]")).click();
	}

}
