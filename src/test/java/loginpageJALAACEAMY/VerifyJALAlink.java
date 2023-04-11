package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyJALAlink {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magnus.jalatechnologies.com/");
		
		RedirecttoJalaacedamypage jalalink = new  RedirecttoJalaacedamypage(driver);
		
		jalalink.jalalink();
		//link is not verified. test case got failed
	}
}
