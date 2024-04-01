package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Hover
{
	ChromeDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement account;
	
	public Account_Hover(ChromeDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	public void Account()
	{
		Actions action = new Actions(driver);
		action.moveToElement(account).perform();
		
	}

}
