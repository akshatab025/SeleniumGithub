package excelprg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Excelamz {
	public static int number ;
	public static void main(String[] args) throws IOException {
		ChromeDriver driver;
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\Excel\\Akshata.xlsx");
		Workbook w1 =  WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("login");

		String username=	NumberToTextConverter.toText(s1.getRow(0).getCell(1).getNumericCellValue());
	//	String username = c1.getStringCellValue();
		System.out.println(username);
		
		String pwd =s1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver (options);
		 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		driver.findElement(By.id("signInSubmit")).click();
		
		
	}

}
