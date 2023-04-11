package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executelogin {

	@BeforeTest()
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		LOGINPAGE LOGIN = new LOGINPAGE(driver);
		
		driver.get("https://magnus.jalatechnologies.com/");
		LOGIN.Enteremail("training@jalaacademy.com");
		LOGIN.Enterpass("jobprogram");
		LOGIN.clickonsignin();
		
		
		
	}
	@Test(priority = 2)
	public void admin() {
		//3rd script to check login by admin button
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
				Checkadminlogin Adminlogin = new Checkadminlogin(driver);
				Adminlogin.clickonAdminlogin();
		
	}
	
	
	
}
