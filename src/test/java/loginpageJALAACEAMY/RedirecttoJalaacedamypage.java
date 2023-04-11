package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class RedirecttoJalaacedamypage {

	WebDriver driver;
	RedirecttoJalaacedamypage(WebDriver d){
		
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "https://jalaacademy.com/")
	WebElement link;
	
	
	public void jalalink() {
		link.click();
	}
}
