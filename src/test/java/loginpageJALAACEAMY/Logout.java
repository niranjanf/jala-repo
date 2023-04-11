package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class Logout {

	
	WebDriver driver;
	Logout(WebDriver d){
		
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class=\"hidden_xs\"]")
	WebElement signout;
	
	public void LOGOUT() {
		signout.click();
	}
	
}
