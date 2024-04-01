package sourceamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	WebDriver driver ;
	
	@FindBy(id="ap_email")
	WebElement username ;
	
	@FindBy(id="continue")
	WebElement continue_button ;
	
	@FindBy(id="ap_password")
	WebElement pwd ;
	
	@FindBy(id="signInSubmit")
	WebElement sign_submit ;
	
	public Login(WebDriver driver )
	{
		PageFactory.initElements(driver , this );	
	}
	public void un()
	{
		username.sendKeys("7483690818");
	}
   public void cont()
   {
	   continue_button.click();
   }
   public void pwd()
   {
	   pwd.sendKeys("Savi@1234");
   }
   public void sign()
   {
	   sign_submit.click();
   }
}
