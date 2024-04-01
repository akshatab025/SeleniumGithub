package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	     driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	     //Select s1=new Select(search);
	    
	    

	}

}
