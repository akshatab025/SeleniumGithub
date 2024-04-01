package stestamazon;

import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.SearchCategory;

//validation of login in amazon application->searching product category wise->selecting product->adding it into cart->logging out
public class AMZ_ST_17 extends LaunchQuit
{
	@Test
	public static void scenarios() throws InterruptedException
	{
	 Login l1 = new Login(driver);
	 l1.un();
	 l1.cont();
	 l1.pwd();
	 l1.sign();
	
	 SearchCategory s1 = new SearchCategory(driver);
	 s1.Select();
	// Thread.sleep(2000);
	 	}
	

}
