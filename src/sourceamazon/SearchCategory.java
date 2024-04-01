package sourceamazon;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchCategory
{
   ChromeDriver driver;

	@FindBy(xpath="(//select[@id=\"searchDropdownBox\"])")
	WebElement all_select;
	
	
	public SearchCategory(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void Select()
	{
		all_select.click();
		Select s1 = new Select(all_select);
		s1.selectByValue("search-alias=amazon-pharmacy");	
		
	}
	
	public void last_prod()
	{
		//Point p1 = Productselect_dropdown.getLocation();
		//int x = p1.getX();
		//int y = p1.getY();
		
	 //System.out.println(x);
	// System.out.println(y);
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
	//	jse.executeScript("window.scrollBy(0,100)");
		//Productselect_dropdown.click();
		
		
		
	}
	

}
