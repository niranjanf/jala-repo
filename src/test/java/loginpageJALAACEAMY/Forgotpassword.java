package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {

	//object repository for forgrt pass.
	
	WebDriver driver;
	Forgotpassword(WebDriver d){
		
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(@class,\"btn btn-block btn-facebook btn-flat text-center\")]")
	WebElement forgetpass;
	
	public void clickOnForgetPass() {
		
		forgetpass.click();
	}
}
