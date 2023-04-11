package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateForgerPassword {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magnus.jalatechnologies.com/");
		Forgotpassword forgetpaas = new Forgotpassword(driver);
		forgetpaas.clickOnForgetPass();
	}
}
