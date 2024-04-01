package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Netbanking 
{
	@FindBy(xpath="(//input[@type=\"radio\"])[2]")
	WebElement netradio;
	
	//@FindBy(xpath="//span[@class=\"a-dropdown-container\"]")
	//@FindBy(xpath="//select[@id=\"pp-8v8fsN-103\"]")
	//@FindBy(xpath="//span[@class=\"a-dropdown-container\"]/select/optgroup[1]")
	//@FindBy(xpath="(//span/select[@name=\"ppw-bankSelection_dropdown\"and@class=\"a-native-dropdown a-declarative\"])")
	WebElement chooseoption;
	
	//@FindBy(xpath="//select/optgroup[1]")
	@FindBy(xpath="(//optgroup[1])")
	WebElement nextchoose;
	
	@FindBy(xpath="(//span[@class=\"a-button-inner\"])[6]")
	WebElement selectaddress;
	
	@FindBy(xpath="(//span[@class=\"a-button-inner\"])[13]")
	WebElement placeorder;
	
	@FindBy(xpath="(//div[@class=\"inputfield ibvt loginData\"])[1]")
	WebElement netid;
	
	@FindBy(xpath="//a[@class=\"btn btn-primary login-btn\"]")
	WebElement cont;
	
	public Netbanking(ChromeDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}

	public void netbank()
	{
		netradio.click();
	}
	
	public void option() throws InterruptedException
	{
		 chooseoption.click();
		 Select s1 = new Select(chooseoption);
		 //Thread.sleep(2000);
		 //Select s2 = new Select(nextchoose);
		 //s1.selectByValue("HDF DIRECT");
		 s1.selectByVisibleText("HDFC Bank");
	}
	
	public void selectaddress()
	{
		selectaddress.click();
	}
	
	public void placeorder()
	{
		placeorder.click();
	}
	
	public void netid()
	{
		netid.sendKeys("138188876");
	}
	
	public void cont()
	{
		cont.click();
	}
}
