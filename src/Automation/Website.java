package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Website {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();

	}

}
