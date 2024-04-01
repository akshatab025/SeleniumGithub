package stestamazon;

import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Wish12;

//Validation of login in amazon application->selecting product in wishlist->Adding it to cart->Logging out from Application
public class AMZ_ST_12 extends LaunchQuit
{
	@Test
	public void scenarios() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		Wish12 w1 = new Wish12(driver);
		w1.wish_select();
	}

}
