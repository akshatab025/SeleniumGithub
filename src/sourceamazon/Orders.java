package sourceamazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orders 
{
	WebDriver driver;
	
	@FindBy(xpath="(//a/span[@class=\"nav-line-1\"])")
	WebElement ur_order;
	
	public Orders(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void my_order()
	{
		ur_order.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs("Your Orders"));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")))
		//ur_order.click();
	}

}
