package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Login_PF extends BaseClass {
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement btn_login;
	
	@FindBy(xpath="//a[text()=' Trioteamchallengers ']")
	WebElement lbl_username;
	
	WebDriver driver;
	
	public Login_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickOnLogin() {
		btn_login.click();
	}
	
	public String getUrlOfPage() {
		return driver.getCurrentUrl();
	}
	
	public String getUsernameLabelCheckUsernameIsDisplayed() {
		String username=null;
		if(lbl_username.isDisplayed()) {
			username=lbl_username.getText();
		}
		return username;
		
	}
}
