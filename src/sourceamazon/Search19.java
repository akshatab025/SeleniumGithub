package sourceamazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search19
{
	ChromeDriver driver;
	
	@FindBy (id="twotabsearchtextbox")
	WebElement search_bar;
	
	@FindBy(id="nav-search-submit-button")
	WebElement search_click;
	
	@FindBy(xpath="(//div/img[@class=\"s-image\"])[2]")
	WebElement product_click;
	
	@FindBy(xpath="//span/input[@id=\"add-to-wishlist-button-submit\"]")
	WebElement wish_list;
	
	@FindBy(xpath="(//span/a[@class=\"a-button-text\"])[4]")
	WebElement view_wish_list;
	
	@FindBy(xpath="(//span[@class=\"wl-invite-text\"])")
	WebElement view;
	
	@FindBy(xpath="(//input[@class=\"a-button-input\"])[33]")
	WebElement view_only;
	
	@FindBy(xpath="(//a[@class=\"a-link-normal\"])[103]")
	WebElement copy_link;
	
	@FindBy(xpath="(//button/i[@class=\"a-icon a-icon-close\"])")
	WebElement close_view;
	
	public Search19(ChromeDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sercah()
	{
		search_bar.sendKeys("kurtas");
	}
	
	public void s_click()
	{
		search_click.click();
	}
	
	public void p_click()
	{
		product_click.click();
	}
	
	public void w_list()
	{
		wish_list.click();
	}
	public void v_w_list()
	{
		view_wish_list.click();
	}
	
	public void view()
	{
		view.click();
	}
   public void v_only()
   {
	   view_only.click();
   }
   public void c_link()
   {
	   copy_link.click();
   }
   
   public void c_view()
   {
	   close_view.click();
   }
}
