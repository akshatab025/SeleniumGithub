package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clothing 
{
	ChromeDriver driver;
	
	@FindBy(xpath = "(//select[@id=\"searchDropdownBox\"])")
	WebElement All_drop;
	
	@FindBy(xpath="(//select/option[text()='Clothing & Accessories'])")
	WebElement clothandAccessories;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement send;
	
	@FindBy(id="nav-search-submit-text")
	WebElement serachsub;
	
	public Clothing(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void all()
	{
		All_drop.click();
	}
	
	public void clothing()
	{
		clothandAccessories.click();
	}
	
	public void search ()
	{
		send.sendKeys("ladies kurtas");
	}
	public void search_click()

	{
		serachsub.click();
	}
	
	

}
