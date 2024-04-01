package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upi 
{
	@FindBy(xpath="(//input[@type=\"radio\"])[3]")
	WebElement upiradio;
	
	@FindBy(xpath="(//input[@type=\"text\"and@placeholder=\"Ex: MobileNumber@upi\"])")
	WebElement upinum;
	
	@FindBy(xpath="(//input[@class=\"a-button-input a-button-text\"and@type=\"submit\"])[2]")
	WebElement upiverify;
	
	@FindBy(xpath="(//input[@class=\"a-button-input a-button-text\"and@type=\"submit\"])[3]")
	
	WebElement upiaddress;
	
	@FindBy(xpath="(//input[@name=\"placeYourOrder1\"and@type=\"submit\"])[1]")
	WebElement placeorder;
	
	public Upi(ChromeDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}

	public void upiradio()
	{
		 upiradio.click();
	}
	
	public void upinum()
	{
		upinum.sendKeys("7026966704@ybl");
	}
	
	public void upiverify()
	{
		upiverify.click();
	}
	
	public void upiaddress()
	{
		upiaddress.click();
	}
	
	public void placeorder()
	{
		placeorder.click();
	}
}
