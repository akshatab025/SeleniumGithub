package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIjPbc0KnC_AIV-5VLBR14fwcHEAAYASAAEgKKuPD_BwE%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D9061993%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D16332466403203906714%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	     driver.findElement(By.name("email")).sendKeys("7483690818");
	     driver.findElement(By.id("continue")).click();
	     driver.findElement(By.name("password")).sendKeys("Life@143");
	     driver.findElement(By.id("signInSubmit")).click();
	     driver.findElement(By.linkText("Gift Cards")).click();
	     driver.close();
	
	
	}

}
