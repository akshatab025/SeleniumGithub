package stestamazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Search19;

//validation of login in amazon application->searching the product->Adding it into wishlist-> inviting people to wishlist with view only->logging out from application
public class AMZ_ST_19 extends LaunchQuit
{
	@Test()
	public static void scenarios()
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
		
		Search19 s1 = new Search19(driver);
		s1.sercah();
		s1.s_click();
		s1.p_click();
		
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> pc = pcid.iterator();
		 String parent = pc.next();
		 String child = pc.next();
		driver.switchTo().window(child);
		
		s1.w_list();
		s1.v_w_list();
		s1.view();
		
		s1.v_only();
		s1.c_link();
		s1.c_view();
		
		
	}
}
