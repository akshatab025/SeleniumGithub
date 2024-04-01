package frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/hz/wishlist/ls/2N1B8O6MXWOC7?ref_=wl_dp_view_your_list");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List<WebElement> fno= driver.findElements(By.tagName("iframe"));
	System.out.println(fno.size());
	driver.switchTo().frame(0);
		
	}

}
