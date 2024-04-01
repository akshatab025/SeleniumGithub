package excelprg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	//WebDriver driver= new ChromeDriver();
	//driver.get("https://www.amazon.com/");
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		FileInputStream fis = new FileInputStream("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\xl");
		 Workbook b1 = WorkbookFactory.create(fis);
		Sheet s1=  b1.getSheet("launch");
		String un = s1.getRow(0).getCell(1).getStringCellValue();
		String pwd=s1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(un);
		System.out.println(pwd);
		
	
	
	
		
	}

}
