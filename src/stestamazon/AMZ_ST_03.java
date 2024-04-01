package stestamazon;

import org.testng.annotations.Test;

import sourceamazon.Login;

//Validation of login in amazon application->Searching the product->Adding it to wishlist->Adding it to cart->Logging out from application
public class AMZ_ST_03 extends LaunchQuit
{
	@Test
	public static void scenarios()
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
	}
	

}
