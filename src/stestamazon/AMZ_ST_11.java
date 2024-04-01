package stestamazon;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Validation of login in amazon application->Searching the product->Adding it to wishlist->Logging out from application
import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Logout;
import sourceamazon.Search_11cart;

public class AMZ_ST_11 extends LaunchQuit
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
		Iterator<String> pc = pcid.iterator();
		String pa = pc.next();
		String cd= pc.next();
		driver.switchTo().window(cd);
		
		Thread.sleep(4000);
		s1.add_wish();
		Thread.sleep(3000);
		s1.view_wish();
		
		WebDriverWait wdw1 = new WebDriverWait(driver,Duration.ofSeconds(100));
		wdw1.until(ExpectedConditions.titleIs("Amazon.in"));
		
		s1.cart();
		
		Logout l2 = new Logout(driver);
		l2.signout();
		
	}

}
