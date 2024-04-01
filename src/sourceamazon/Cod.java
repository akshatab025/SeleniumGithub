package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cod 
{
	//@FindBy(xpath="//input[@id='pp-t4HEk8-130'and@name='ppw-instrumentRowSelection']")
	@FindBy(xpath="(//input[@type=\"radio\"])[5]")
	WebElement cod;
	
	@FindBy(xpath="(//input[@type=\"submit\"])[4]")
	WebElement usethismethod;
	
	//@FindBy(xpath="(//input[@type=\"submit\"])[6]")
	//@FindBy(xpath="(//input[@type=\"submit\"and@class='a-button-input'])[6]")
	@FindBy(xpath="(//input[@name=\"placeYourOrder1\"])[1]")
	WebElement placeorder;
	
	public Cod(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cod()
	{
		cod.click();
	}
public void usecod()
{
	usethismethod.click();
}

public void placeorder()
{
	placeorder.click();
}
}
