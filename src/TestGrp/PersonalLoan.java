package TestGrp;

import org.testng.annotations.Test;

public class PersonalLoan 
{
	@Test(groups= {"SmokeTest"})
	
	public static void WebLoginPersonalLoan()
	{
		System.out.println("Web Login Personal Loan");
	}
	@Test
	public static void MobileLoginPersonalLoan()
	{
		System.out.println("Mobile Login Personal Loan");
	}
	@Test
	public static void APILoginPersonalLoan()
	{
		System.out.println("API Login Personal Loan");
	}	
}

