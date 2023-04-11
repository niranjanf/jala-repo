package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Executelogout {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://magnus.jalatechnologies.com/");
		LOGINPAGE LOGIN = new LOGINPAGE(driver);
		LOGIN.Enteremail("training@jalaacademy.com");
		LOGIN.Enterpass("jobprogram");
		LOGIN.clickonsignin();
		
		Thread.sleep(50000);
		Logout logoUt = new Logout(driver);
		logoUt.LOGOUT();
	}
}