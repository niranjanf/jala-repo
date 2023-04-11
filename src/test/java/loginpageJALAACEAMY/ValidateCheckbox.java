package loginpageJALAACEAMY;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateCheckbox {

	
	//we have to check checkbox is clickable or not
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://magnus.jalatechnologies.com/");

Checkbox rememberME = new Checkbox(driver);
	
	rememberME.clickOncheckbox();
}
}

