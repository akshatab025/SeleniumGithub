package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cancel 
{
	@FindBy(xpath="(//span[@class='nav-line-1'])[2]")
	WebElement returnorder;
	
	@FindBy(xpath="(//a[@id='Cancel-items_2'])")
	WebElement cancel;
	
	@FindBy(xpath="(//select[@name='cancel.reason'])")
	WebElement cancelreason;
	
	@FindBy(xpath="(//input[@class='a-button-input'and@type='submit'])")
	WebElement cancelcoformation;
	
	public Cancel(ChromeDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void returnorder()
	{
		returnorder.click();
	}
public void cancel()
{
	cancel.click();
}
public void cancelreason()
{
	cancelreason.click();
	Select s1 =  new Select(cancelreason);
	s1.selectByValue("mistake");
	
}
public void cancelcoform()
{
	cancelcoformation.click();
}
}
