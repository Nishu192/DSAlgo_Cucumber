package pagefactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;
//import org.openqa.selenium.support.ui.Select;




public class Stack_pf extends BaseClass {

	//WebDriver driver;
	//@FindBy(xpath="//h4[normalize-space()='Stack']") WebElement txt_stackTitle;
	
	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[4]/div/div/a[text()='Get Started']")
	WebElement lnk_HomeGetStartedStack;

	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]") WebElement lnk_Stack;
	
	@FindBy(xpath="//p[text()='Operations in Stack']") WebElement txt_operatonsStack;
	@FindBy(linkText = "Operations in Stack") WebElement lnk_Operations_in_Stack;
	
	@FindBy(xpath="//p[text()='Implementation']") WebElement txt_ImplementationStack;
	@FindBy(linkText = "Implementation") WebElement lnk_Implementations;
	
	@FindBy(xpath="//p[text()='Applications']") WebElement txt_ApplicationsStack;
	@FindBy(linkText="Applications") WebElement lnk_Applications;
	
	@FindBy(xpath="(//a[text()='NumpyNinja'])[1]") WebElement txt_Practice_Q;
	@FindBy(linkText = "Practice Questions")
	WebElement lnk_Practice_Questions;
	//@FindBy(linkText = "Practice Questions") WebElement lnk_Practice_Questions;

	

	//@FindBy(xpath= "//div[@class='CodeMirror-scroll']") WebElement txt_OIS_Editor;

	//@FindBy(xpath="//form[@id=\"answer_form\"]/button") WebElement btn_Run;

	//public Stack_pf sp;
	
	public Stack_pf(WebDriver driver) {
		//BaseClass.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

//	public static String getTitle() {
//		return driver.getTitle();
//	}

//	public void clickdropdown() {
//		lnk_dropdown.click();	
//	}
//
	public void clickStack() {
		
		lnk_Stack.click();
	
	}
//	public String stackpageTitle() {
//		
//		 return  txt_stackTitle.getText();
//	}
	
	public void clickGetStarted() {
		lnk_HomeGetStartedStack.click();
	}
	public String stackoperationsTitle() {
		
		 return txt_operatonsStack.getText();
	}
	
	
	public void clickoperationsinstack() {
		lnk_Operations_in_Stack.click();
	}

	public String stackImplementationTitle() {
		
		 return txt_ImplementationStack.getText() ;
	}
	
	public void clickImplementation() {
		lnk_Implementations.click();
	}
	public String stackApplicationTitle() {
		
		 return txt_ApplicationsStack.getText();
	}
	
	public void clickApplication() {
		lnk_Applications.click();
	}
	
	public String stackpracQTitle() {
		
		 return txt_Practice_Q.getText();
	}
	
	public void clickpracticeQuestions() {
		lnk_Practice_Questions.click();

	}
	
//	public String stackhomeTitle() {
//		
//		 return ((WebDriver) tl_stack).getTitle();
//	}

//	public void blankeditor() {
//		txt_OIS_Editor.sendKeys("");
//	}
//
//	public void EntervalidCode() {
//		txt_OIS_Editor.sendKeys("from Excel");
//	}
//
//	public void EnterInvalidCode() {
//		txt_OIS_Editor.sendKeys("from Excel");
//	}
//	public void clickstackRun() {
//		btn_Run.click();
//
//	}
//	public void clickPracticeQuestions() {
//		lnk_Practice_Questions .click();
//	}


}
