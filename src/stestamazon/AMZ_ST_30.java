package stestamazon;
//validation of login in amazon application->selecting Clothing and accessories at search category->adding into wishlist->adding into cart->logging out from application
import org.testng.annotations.Test;

import sourceamazon.Clothing;
import sourceamazon.Login;

public class AMZ_ST_30 extends LaunchQuit
{
	@Test
	public static void scenarios()
	{
   Login l1 = new Login(driver);
   l1.un();
   l1.cont();
   l1.pwd();
   l1.sign();
  
   Clothing c1 = new  Clothing (driver);
   c1.all();
   c1.clothing();
   c1.search();
   c1.search_click();
	}
	

}
