package excelprg;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Amazonlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\Excel\\Akshata.xlsx");
		Workbook w1 =WorkbookFactory.create(fis);
		
		Sheet s1 =  w1.getSheet("login");
		
		String pwd = s1.getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
		String username = s1.getRow(0).getCell(1).getStringCellValue();
		//String username = NumberToTextConverter.toText(s1.getRow(0).getCell(1).getNumericCellValue());
		System.out.println(username);
		
		Sheet s2 =w1.getSheet("logout");
		String user = s2.getRow(0).getCell(1).getStringCellValue();
	    String usn = s2.getRow(1).getCell(1).getStringCellValue();
	    System.out.println(user);
	    System.out.println(usn);
	    
		
		
	}

}
