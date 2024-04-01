package stestamazon;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import sourceamazon.Cancel;
import sourceamazon.Cod;
import sourceamazon.Login;
import sourceamazon.Search7;
import sourceamazon.Wishlistpage;

//Validation of login in amazon application->Searching the product->Adding it to wishlist->Adding it to cart->Making the payment using COD->Returning the product ->Logging out from application
public class AMZ_ST_07 extends LaunchQuit
{
@Test
public void scenarios() throws InterruptedException, IOException
{
Login l1 = new Login(driver);
l1.un();
l1.cont();
l1.pwd();
l1.sign();

Search7 s1 = new Search7(driver);
s1.searchbox();
s1.searchbutton();
s1.productclick();

Set<String> parentchild  = driver.getWindowHandles();
Iterator<String> iterator   = parentchild.iterator();
 String parentid = iterator.next();
 String childid = iterator.next();
 driver.switchTo().window(childid);
 
 Wishlistpage  w1 = new Wishlistpage(driver);
 w1.addwish();
 w1.viewwish();
 w1.cart();
 w1.proceedcheckout();
 w1.address();
 
 Thread.sleep(4000);
 Cod c1 = new Cod(driver);
 c1.cod();
 //Thread.sleep(3000);
 c1.usecod();
 Thread.sleep(3000);
 c1.placeorder();
 
 Thread.sleep(3000);
 TakesScreenshot ts = driver ;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\screenshot\\aroha.png");
	FileUtils.copyFile(source, destination);

	Cancel c = new Cancel(driver);
	c.returnorder();
	c.cancel();
	c.cancelreason();
	c.cancelcoform();
	
	TakesScreenshot ts1 = driver ;
	File source1 = ts1.getScreenshotAs(OutputType.FILE);
	File destination1 = new File("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\screenshot\\arohl.png");
	FileUtils.copyFile(source1, destination1);
	
			
}
}
