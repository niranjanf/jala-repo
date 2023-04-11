package loginpageJALAACEAMY;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGE {

	
	WebDriver driver;
	LOGINPAGE(WebDriver d)
	{
		
		driver = d;
		PageFactory.initElements(driver, this);
	}
	//object repository for login
@FindBy(id = "UserName")
WebElement Email;

@FindBy(id="Password")
WebElement password;

@FindBy(id = "btnLogin")
WebElement signinbutton;


public void Enteremail(String mail) {
	
	Email.sendKeys(mail);
}
	
		public void Enterpass(String pwd)
		{
			password.sendKeys(pwd);
	}
		public void clickonsignin()
		{
			signinbutton.click();
		
		

}
	
}
