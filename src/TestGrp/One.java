package TestGrp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class One 
{
	@BeforeSuite
	public void BS()
	{
		System.out.println("1");
	}
	@BeforeMethod
	public void BM()
	{
		System.out.println("4");
	}
	@BeforeTest
	 public void BT()
	 	{
			System.out.println("2");
		}
	@BeforeClass
		public  void BC()
		{
		System.out.println("3");	
		}
	@Test
	public void add()
	{
		System.out.println("test");
	}
	@AfterMethod
	public void AS()
	{
		System.out.println("5");
	}
	@AfterClass
	public void AC()
	{
		System.out.println("6");
	}
	@AfterTest
	public void AT()
	{
		System.out.println("7");
	}
	@AfterMethod
	public void AM()
	{
		System.out.println("8");
	}
   
}
