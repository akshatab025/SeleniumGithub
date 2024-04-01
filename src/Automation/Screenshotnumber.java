package Automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshotnumber {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 TakesScreenshot ts = (TakesScreenshot) driver ;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\akshat2x\\eclipse-workspace\\Selenium\\screenshot\\anu.png");
		 FileUtils.copyFile(source, destination);
		 
	}

}
