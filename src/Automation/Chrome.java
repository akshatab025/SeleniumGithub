package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.selenium.dev/downloads/");
		//c1.get("https://teams.microsoft.com/_?culture=en-us&country=us#/modern-calling/");
	}

}
