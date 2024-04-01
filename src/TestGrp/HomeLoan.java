package TestGrp;

import org.testng.annotations.Test;

public class HomeLoan
{
	@Test
	public static void WebLoginHomeLoan()
	{
		System.out.println("Web Login Home Loan");
	}
	@Test
	public static void MobileLoginHomeLoan()
	{
		System.out.println("Mobile Login Home Loan");
	}
	@Test(groups= {"SmokeTest"})
	public static void APILoginHomeLoan()
	{
		System.out.println("API Login Home Loan");
	}

}
