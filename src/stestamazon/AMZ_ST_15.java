package stestamazon;

import org.testng.annotations.Test;

import sourceamazon.Account_Hover;
import sourceamazon.Login;

//validation of login in amazon application->switching the current account with other account->Logging out from application
public class AMZ_ST_15 extends LaunchQuit
{
@Test()
public void scenarios()
{
	Login l1 = new Login(driver);
    l1.un();
    l1.cont();
    l1.pwd();
    l1.sign();
  
    Account_Hover a1 = new Account_Hover(driver);
    a1.Account();
}
}
