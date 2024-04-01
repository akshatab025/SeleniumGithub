package stestamazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;


import sourceamazon.Login;
import sourceamazon.Netbanking;
import sourceamazon.Search4;
import sourceamazon.Wishlistpage;

//Validation of login in amazon application->Searching the product->Adding it to wishlist->Adding it to cart->Making the payment using net banking payment option->Logging out from application
public class AMZ_ST_04 extends LaunchQuit
{
	@Test 
	public void scenarios() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		Search4 s = new Search4(driver);
		s.searchdrop();
		s.search();
		s.Entersearch();
		s.clickproduct();
		
		
		Set<String> pcw= driver.getWindowHandles();
		Iterator<String> pc=	pcw.iterator();
	    String parent =	pc.next();
	    String child =pc.next();
	    driver.switchTo().window(child);
	    
	    Wishlistpage w1 = new Wishlistpage(driver);
	    w1.addwish();
	    w1.viewwish();
	    w1.cart();
	    w1.proceedcheckout();
	    w1.address();
	    
	    Thread.sleep(2000);
	    s.pricription();
	    Thread.sleep(2000);
	    s.submit();
	    
	    Netbanking n1 = new Netbanking(driver);
	    n1.netbank();
	    n1.option();

	  
	  
	}

}
