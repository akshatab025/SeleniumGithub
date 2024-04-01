package stestamazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Logout;
import sourceamazon.Searchpag1;
import sourceamazon.Selectwishlist;
import sourceamazon.Wishlistpage;

//Validation of login in amazon application->Searching the product->Adding it to wishlist->Adding it to cart->Logging out from application
public class AMZ_ST_09 extends LaunchQuit
{
	@Test
	public static void scenarios() throws InterruptedException
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
		Iterator<String> iterator= pcid.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);
		
		Wishlistpage w1 = new Wishlistpage(driver);
		w1.addwish();
		w1.viewwish();
		w1.cart();
		
		Thread.sleep(4000);
		Logout l = new Logout(driver);
		l.signout();
		
	}

}
