package stestamazon;
//validation of login in amazon application->creating the wishlist->logging out from application
import org.testng.annotations.Test;

import sourceamazon.Create_Wishlist;
import sourceamazon.Login;


public class AMZ_ST_16 extends LaunchQuit
{
	@Test()
	public void scenarios() throws InterruptedException 
	{
		Login login = new Login(driver);
		login.un();
		login.cont();
		login.pwd();
		login.sign();
		
		Create_Wishlist  c1 = new Create_Wishlist(driver);
		c1.creat_list();
		
		
	}
	
	
	
	
	
}
