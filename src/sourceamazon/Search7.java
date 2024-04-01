package sourceamazon;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search7 
{
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	WebElement product ;
	
	
	public Search7(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchbox()
	{
		searchbox.sendKeys("flowers");
	}
	public void searchbutton()
	{
		searchbutton.click();
	}
	public void productclick()
	{
		product.click();
	}

}
