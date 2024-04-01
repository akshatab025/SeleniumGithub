package sourceamazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Excel extends Amazon_DDT
{
WebDriver driver ;
	
	@FindBy(id="ap_email")
	WebElement username_amz ;
	
	@FindBy(id="continue")
	WebElement continue_button ;
	
	@FindBy(id="ap_password")
	WebElement pwd_amz ;
	
	@FindBy(id="signInSubmit")
	WebElement sign_submit ;
	
	public Login_Excel(WebDriver driver )
	{
		PageFactory.initElements(driver, this );
		//this.driver=driver;
	}
	
	
	public void un() 
	{
		username_amz.sendKeys(username);
	}
   public  void cont()
   {
	   continue_button.click();
   }
   public  void pwd()
   {
	   pwd_amz.sendKeys(pwd);
   }
   public void sign()
   {
	   sign_submit.click();
   }

}
