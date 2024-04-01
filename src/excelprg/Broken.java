package excelprg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {

	static WebDriver driver ;
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		//System.out.println(links);
		for(int i=0;i<count;i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
			
			Thread.sleep(3000);
			httpconn.connect();
			
		int rescode =httpconn.getResponseCode();
		
		if(rescode>=400)
		{
			System.out.println(url+ "is a broken link ");
		}
		else
		{
			System.out.println(url+ "is a valid link ");
		}
			
		}
		
		
	}

}
