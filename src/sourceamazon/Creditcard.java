package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creditcard 
{
	//@FindBy(xpath="(//input[@type=\"radio\"])[1]")
	@FindBy(xpath="//*[@type='radio'and@value='SelectableAddCreditCard']")
	WebElement creditclick;
	
	//@FindBy(xpath="//a[@id='pp-8v8fsN-97']")
	@FindBy(xpath="//img[@class='apx-add-pm-trigger-image'])[1]")
    WebElement enterdetails;
	
	 public Creditcard(ChromeDriver driver)
	 {
		 PageFactory.initElements( driver , this);
	 }
	
	 public void credit()
	 {
		 creditclick.click();
	 }
	 
	 public void CardDetails()
	 {
		 enterdetails.click();
	 }
}
