package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Tryhere_pf  extends BaseClass{
	
	//WebDriver driver;
	@FindBy(linkText = "Try here>>>")
	WebElement btn_tryhere;
	//@FindBy(linkText="Try here>>>") WebElement btn_Tryhere;
	
	
	@FindBy(xpath="//div[contains(text(),'1')]") WebElement tl_Assesment;
	
	public Tryhere_pf(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickTryHere() {
		btn_tryhere.click();
	}
//	public String AssesTitle() {
//
//		return ((WebDriver) tl_Assesment).getTitle();
//	}

	
}
