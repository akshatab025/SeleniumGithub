package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpag1 
{
	@FindBy(id="twotabsearchtextbox")
	WebElement search ;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	@FindBy(xpath="(//img[@class=\"s-image\"])[1]")
	WebElement productclick;
	
	public Searchpag1(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchbar()
	{
		search.sendKeys("kurti");
	}
	public void searchbutton()
	{
		searchbutton.click();
	}
	public void productclick()
	{
		productclick.click();
	}

}
