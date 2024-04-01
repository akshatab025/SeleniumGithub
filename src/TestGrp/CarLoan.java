package TestGrp;

import org.testng.annotations.Test;

public class CarLoan
{
	@Test
	public static void WebLoginCarLoan()
	{
		System.out.println("WebLogin CarLoan");
	}
	@Test(groups= {"SmokeTest"})
	public static void MobileLoginCarLoan()
	{
		System.out.println("Mobile Login Car Loan");
	}
	@Test
	public static void APILoginCarLoan()
	{
		System.out.println("API Login Car Loan");
	}

}
