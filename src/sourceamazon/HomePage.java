package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	ChromeDriver driver ;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_box ;
	
	@FindBy(id="nav-search-submit-button")
	WebElement search_click ;
	
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	WebElement shoeclick ;
	
	
	@FindBy(id ="add-to-wishlist-button-submit")
	WebElement add_wishlist;
	
	@FindBy(xpath ="(//a[@class='a-button-text'])[4]")
	WebElement viewwishlist ;
	
	@FindBy(xpath="//a[@class='a-button-text a-text-center']")
	WebElement addcart ;
	
	@FindBy(xpath ="(//a[@class='a-button-text'])[5]")
	WebElement proceedcheckout ;
	
	public HomePage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchbox()
	{
		search_box.sendKeys("shoe");
	}
	
	public void searchenter()
	{
		search_click.click();
	}
   
	public void shoecli()
	{
		shoeclick.click();
	}
	
   public void addwishlist()
   {
	   add_wishlist.click();
   }
   
   public void viewlist()
   {
	   viewwishlist.click();
   }
  public void addcart()
  {
	  addcart.click();
  }
  public void checkout()
  {
	  proceedcheckout.click();
  }
}
