package sourceamazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Amazon_DDT 
{
	public static  String username;
	public static  String pwd;
	public void beforeMethod() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\Excel\\Akshata.xlsx");
		Workbook w1 =  WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("login");
		 username=NumberToTextConverter.toText(s1.getRow(0).getCell(1).getNumericCellValue());
		//System.out.println(username);
	 pwd= s1.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(pwd);
	}

}
