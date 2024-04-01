package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Payment 
{
	ChromeDriver driver ;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement address;
	
	@FindBy(id="pp-0YWifA-128")
	WebElement codoption;
	
	@FindBy(id="pp-4dRNzd-94")
	WebElement debitcard;
	
 public Address_Payment(ChromeDriver driver)
 {
	PageFactory.initElements(driver,this );
 }
	
public void address()
{
	address.click();
}
public void cod()
{
	codoption.click();
}
public void debit()
{
	debitcard.click();
}

}
