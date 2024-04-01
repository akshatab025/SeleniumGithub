package stestamazon;



import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Logout;
import sourceamazon.Selectwishlist;

// Validation of login in amazon application->selecting product in wishlist->deleting it from wishlisr->Logging out from Application



public class AMZ_ST_14 extends LaunchQuit
{
	@Test
	public void scenarios() throws InterruptedException  
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		Selectwishlist s1 = new Selectwishlist(driver);
		Thread.sleep(3000);
		s1.acclist();
		s1.deletewishlist();
		
		Logout l2 = new Logout(driver);
		l2.signout();
		
}
}
