package stestamazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Logout;
import sourceamazon.Search_11cart;

//Validation of login in amazon application->Searching the product->Adding it to cart->Logging out from application
public class AMZ_ST_10 extends LaunchQuit
{
	@Test
	public void scenarios() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		Search_11cart s1 = new Search_11cart(driver);
		s1.search();
		s1.searchbutton();
		s1.jewellary();
		
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> pc=	 pcid.iterator();
		String pa =   pc.next();
		String cd = pc.next();
		
		driver.switchTo().window(cd);
		
		s1.add_cart();
		
		Thread.sleep(4000);
		
		Logout l2 = new Logout(driver);
		l2.signout();
	}

}
