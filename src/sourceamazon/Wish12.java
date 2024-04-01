package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wish12
{
	ChromeDriver driver;
	@FindBy(xpath="(//span[@class=\"nav-icon nav-arrow\"])[2]")
	WebElement account_order;
	
	@FindBy(xpath="(//span[@class=\"nav-text\"])[10]")
	WebElement your_wish;
	public Wish12(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void wish_select() throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(account_order).perform();
		Thread.sleep(2000);
		action.moveToElement(your_wish).perform();
		action.click().perform();
		
	}
	

}
