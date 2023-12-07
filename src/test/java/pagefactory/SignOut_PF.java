package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut_PF {
 
	
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement lnk_SignOut;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement alert_LoggedOutSuccessfully;
	
	@FindBy(xpath="//a[text()=' Register ']")
	WebElement lnk_Register;
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement lnk_SignIn;


	public SignOut_PF(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void clickSignOut() {
		lnk_SignOut.click();
	}

	public String getTextMessage() {
		String msg=alert_LoggedOutSuccessfully.getText();
			return msg;
	}

	public boolean validateRegister() {
		if(lnk_Register.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean validateSignIn() {
		if(lnk_SignIn.isDisplayed())
			return true;
		else
			return false;
	}






}
