package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Website1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		driver.quit();
		//driver.close();

		
	}

}
