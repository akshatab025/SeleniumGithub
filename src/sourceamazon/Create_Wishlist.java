package sourceamazon;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Wishlist 
{
	ChromeDriver driver;
	
	@FindBy(xpath="(//span[@class=\"nav-line-2 \"])")
	WebElement account;
	
	@FindBy(xpath="(//a/span[@class=\"nav-text\"])[3]")
	WebElement sub_account;
	
	public Create_Wishlist(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 
	public  void creat_list() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(account);
		actions.moveToElement(sub_account);
		Thread.sleep(2000);
		actions.click().build().perform();
		
	}
}
