package Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_AMZ 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchdrop = driver.findElement(By.xpath("(//select[@id=\"searchDropdownBox\"])"));
		searchdrop.click();
		Select s1 = new Select(searchdrop);
		List<WebElement> list_web_element = s1.getOptions();
		int count = list_web_element.size();
		System.out.println(count);
		list_web_element.get(count-2).click();
		Thread.sleep(2000);
		s1.deselectAll();
		driver.close();
	
	}

}
