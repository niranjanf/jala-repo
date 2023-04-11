package loginpageJALAACEAMY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {

	
	WebDriver driver;
	Checkbox(WebDriver d){
		
		driver = d;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[@class=\"checkmark\"]")
	WebElement CHECKBOX;
	
	
	
	public void clickOncheckbox() {
		CHECKBOX.click();
	}
}
