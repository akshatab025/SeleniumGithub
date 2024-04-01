package stestamazon;

import org.testng.annotations.Test;

import sourceamazon.Login;
import sourceamazon.Orders;

public class AMZ_ST_13 extends LaunchQuit 
{
	@Test
	public static void scenarios() throws InterruptedException
	{
		Login l1 = new Login(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.sign();
	Thread.sleep(4000);	
	
	Orders o1 = new Orders(driver);
	o1.my_order();
	
	}
}
