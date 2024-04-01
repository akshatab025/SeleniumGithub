package Parallel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon 
{
	static WebDriver driver;
	@Test
	public static void amz_login() throws EncryptedDocumentException, IOException
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sign =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);
		action.moveToElement(sign).perform();
		driver.findElement(By.xpath("(//a/span[@class='nav-action-inner'])[1]")).click();
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\Excel\\Akshata.xlsx");
		   Workbook w1=  WorkbookFactory.create(fis);
		   Sheet s1 = w1.getSheet("Login");
		  String user_name = NumberToTextConverter.toText(s1.getRow(0).getCell(1).getNumericCellValue());
	String pwd = s1.getRow(1).getCell(1).getStringCellValue();
		 
	
		 System.out.println(user_name);
		 System.out.println(pwd);
		driver.findElement(By.id("ap_email")).sendKeys(user_name);
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		
		driver.findElement(By.id("signInSubmit")).click();
		
	}
@Test(groups={"Smoke"})
public static void login()
{
	System.out.println("login success");
}
}
