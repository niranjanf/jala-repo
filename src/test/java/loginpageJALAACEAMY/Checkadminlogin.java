package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.github.dockerjava.api.model.Driver;

public class Checkadminlogin {

	WebDriver driver;
	Checkadminlogin(WebDriver d){
		
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class=\"text-center\"]")
	WebElement adminlogin;
	

	public void clickonAdminlogin() {
		
		adminlogin.click();
	}
	
	}
		

	

	

