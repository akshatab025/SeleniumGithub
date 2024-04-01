package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectwishlist 
{
	ChromeDriver driver ;
	
	@FindBy(xpath = "(//span[@class='nav-line-2 '])")
	WebElement Account_hover;
	
	@FindBy(xpath="(//span[@class='nav-text'])[10]")
	WebElement ur_wishlist;
	
	@FindBy(xpath="(//input[@class='a-button-input a-declarative'])[1]")
	WebElement delete_product;
	
	public Selectwishlist (ChromeDriver driver )
	{
		PageFactory.initElements(driver , this );
	}
	
	public void acclist()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Account_hover);
		action.moveToElement(ur_wishlist);
		action.click().perform();
	}
	
	public void deletewishlist()
	{
		delete_product.click();
	}
	
}
