package stestamazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import sourceamazon.Address_Payment;
import sourceamazon.Creditcard;
import sourceamazon.Login;
import sourceamazon.Searchpage;
import sourceamazon.Wishlistpage;

// Validation of login in amazon application->Searching the product->Adding it to wishlist->Adding it to cart->Making the payment using Credit card->Logging out from application
public class AMZ_ST_02 extends LaunchQuit
{
	@Test 
	public void scenarios() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		 Searchpage s1 = new  Searchpage(driver);
		 s1.searchdrop();
		 s1.search();
		 s1.sclick();
		 s1.productclick();
		 
	Set<String> pcid = driver.getWindowHandles();
	Iterator<String> pcid1 = pcid.iterator();
	String parent =  pcid1.next();
	String child = pcid1.next();
	driver.switchTo().window(child);
	
	Wishlistpage w1 = new Wishlistpage(driver);
	w1.addwish();
	Thread.sleep(3000);
	w1.viewwish();
	w1.cart();
	Thread.sleep(2000);
	w1.proceedcheckout();
	Thread.sleep(2000);
	w1.address();
	
	Thread.sleep(2000);
	Creditcard c1 = new Creditcard(driver);
	c1.credit();
	Thread.sleep(3000);
	c1.CardDetails();
	
	//driver.switchTo().frame(0);
	
	}

}
