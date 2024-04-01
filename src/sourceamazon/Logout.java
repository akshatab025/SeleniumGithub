package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout
{
	ChromeDriver driver ;
	
	//@FindBy(xpath ="//span[@class='nav-line-2 ']")
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	WebElement Account_click ;
	
	@FindBy(xpath="(//span[@class='nav-text'])[20]")
	WebElement Sign_out;
	
	public Logout(ChromeDriver driver)
	{
		PageFactory.initElements(driver , this );
	}
	
	public void signout()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Account_click).perform();
		action.moveToElement(Sign_out).perform();
		action.click().perform();
		
	}
	
}
