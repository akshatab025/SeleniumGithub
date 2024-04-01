package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage 
{
	ChromeDriver driver;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addwishlist;
	
	//@FindBy(xpath = "(//a[@class='a-button-text'])[2]")
	@FindBy(linkText ="View Your List")
	WebElement viewwishlist;
	
	@FindBy(xpath ="(//a[@class='a-button-text a-text-center'])[1]")
	WebElement addcart;
	
	//@FindBy(xpath="(//a[@class='a-button-text'])[6]")
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedcheckout;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement address;
	
	public Wishlistpage(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void addwish()
	{
		addwishlist.click();
	}

	public void viewwish()
	{
		viewwishlist.click();
	}
	
	public void cart()
	{
		addcart.click();
	}
	
	public void proceedcheckout()
	{
		proceedcheckout.click();
	}
	public void address()
	{
		address.click();
	}
}
