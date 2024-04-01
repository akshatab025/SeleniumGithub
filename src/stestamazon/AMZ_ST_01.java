package stestamazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import sourceamazon.Address_Payment;
import sourceamazon.HomePage;
import sourceamazon.Login;
import sourceamazon.Logout;

public class AMZ_ST_01 extends LaunchQuit
{
	@Test
	public static void scenarios() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		HomePage h1 = new HomePage(driver);
		h1.searchbox();
		h1.searchenter();
		h1.shoecli();
		Set<String> parentchild =  driver.getWindowHandles();
		Iterator<String> pcid =	parentchild.iterator();
		String parentid1 = pcid.next();
		String childid1 = pcid.next();
		driver.switchTo().window(childid1);
		
		h1.addwishlist();
		Thread.sleep(3000);
		h1.viewlist();
		Thread.sleep(2000);	
		h1.addcart();
		Thread.sleep(2000);
		h1.checkout();
		
		Address_Payment a1 = new Address_Payment(driver);
		a1.address();
		Thread.sleep(2000);
		a1.cod();
		
		
		
	}
	

}
