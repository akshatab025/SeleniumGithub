package sourceamazon;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_11cart 
{
	ChromeDriver driver ;
	 
	@FindBy(id="twotabsearchtextbox")
	WebElement serachfield;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	@FindBy(xpath="(//img[@class=\"s-image\"])[6]")
	WebElement jewellary;
	
	@FindBy(xpath="(//input[@id=\"add-to-cart-button\"])")
	WebElement addcart;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addwish;
	
	@FindBy(linkText="View Your List")
	WebElement viewwish;
	
	@FindBy(xpath="(//span[@id=\"pab-I1ZQXLH9IJNFKW\"])")
	WebElement cart;
	
	public Search_11cart(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
	public void search()
	{
		serachfield.sendKeys("Jewellary");
	}
	
	public void searchbutton()
	{
		searchbutton.click();
	}
	public void jewellary()
	{
		 jewellary.click();
	}
  public void add_cart()
  {
	  addcart.click();
  }
  public void add_wish()
  {
	  addwish.click();
  }
  public void view_wish()
  {
	  viewwish.click(); 
  }
  public void cart()
  {
	  cart.click();
  }
}
