package stestamazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Logout;
import sourceamazon.Searchpag1;
import sourceamazon.Upi;
import sourceamazon.Wishlistpage;

//Validation of login in amazon application->Searching the product->Adding it to wishlist->Adding it to cart->Making the payment using UPI payment option->Logging out from application
public class AMZ_ST_05 extends LaunchQuit
{
	@Test
	public void scenarios()
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		Searchpag1 s1 = new Searchpag1(driver);
		s1.searchbar();
		s1.searchbutton();
		s1.productclick();
		
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> pc = pcid.iterator();
	    String parent =	pc.next();
	    String child = pc.next();
	   driver.switchTo().window(child);
		
		Wishlistpage  w1 = new Wishlistpage(driver);
		w1.addwish();
		w1.viewwish();
		w1.cart();
		w1.proceedcheckout();
		w1.address();
		
		Upi u = new Upi(driver);
		u.upiradio();
		u.upinum();
		u.upiverify();
		u.upiaddress();
		u.placeorder();
		
		Logout l = new Logout(driver);
		l.signout();
		
		
		
	}

}
