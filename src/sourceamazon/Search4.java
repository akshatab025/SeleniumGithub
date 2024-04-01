package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search4 
{
//	@FindBy(xpath="(//div[@class=\"nav-search-scope nav-sprite\"])")
	@FindBy(id="searchDropdownBox")
	WebElement searchdrop;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	WebElement enetersearch;
	
	@FindBy(xpath="(//img[@class=\"s-image\"])[1]")
	WebElement product;
	
	@FindBy(xpath="(//i[@class=\"a-icon a-accordion-radio a-icon-radio-inactive\"])")
	WebElement precription;
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"and@type=\"submit\"])[3]")
	WebElement submit;
	
	public Search4(ChromeDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	
	
	public void searchdrop()
	{
		searchdrop.click();
		Select s1 = new Select(searchdrop);
		s1.selectByValue("search-alias=amazon-pharmacy");
		
	}
	
	public void search()
	{
		search.sendKeys("cold tablets");
	}
	public void Entersearch()
	{
		enetersearch.click();
	}
	public void clickproduct()
	{
		product.click();
	}
	
	public void pricription()
	{
		precription.click();
	}
	
	public void submit()
	{
		 submit.click();
	}

}
