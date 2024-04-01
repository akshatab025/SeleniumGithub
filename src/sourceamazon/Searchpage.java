package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpage 
{	
	ChromeDriver driver ;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbar ;
	
	@FindBy(id="searchDropdownBox")
	WebElement selectdrop ;
	
	@FindBy(id="nav-search-submit-button")
	WebElement clicksearch ;
	
	@FindBy(xpath="(//img[@class='s-image'])[1]")
	WebElement prodclick ;
	
	
	
	public Searchpage(ChromeDriver driver )
	{
		PageFactory.initElements(driver , this );
	}
	
	public void search()
	{
		searchbar.sendKeys("mamaearth face cream");
	}
	public void searchdrop()
	{
		selectdrop.click();
		Select s1 = new Select(selectdrop);
		s1.selectByValue("search-alias=beauty");	
	}
	public void sclick()
	{
		clicksearch.click();
	}
	public void productclick()
	{
		prodclick.click();
	}
}
