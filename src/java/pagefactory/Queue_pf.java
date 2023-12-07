package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class Queue_pf extends BaseClass{

	//WebDriver driver;

	@FindBy(xpath="//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]/div/div/a[text()='Get Started']") WebElement lnk_GetStarted;
	//@FindBy(xpath="//h4[contains(text(),'Queue')]") WebElement tl_queue;

	@FindBy(linkText="Implementation of Queue in Python") WebElement lnk_Implementation_of_queue_in_Python;
	@FindBy(xpath="//p[text()='Implementation of Queue in Python']") WebElement tl_qinpython;

	@FindBy(linkText="Implementation using collections.deque") WebElement lnk_Implementation_using_collections_deque;
	@FindBy(xpath="//p[text()='Implementation using collections.deque']") WebElement tl_queueindeque;

	@FindBy(linkText="Implementation using array") WebElement lnk_Implementation_using_array;
	@FindBy(xpath="//p[text()='Implementation using array']") WebElement tl_qImplementationarray;


	@FindBy(linkText="Queue Operations") WebElement lnk_Queue_Operations;
	@FindBy(xpath="//p[text()='Queue Operations']") WebElement tl_qoperations;

	@FindBy(linkText="Practice Questions") WebElement lnk_Practice_Questions1;
	//@FindBy(xpath="//body/div[1]/nav[1]") WebElement tl_qpracQ;
	
	@FindBy(linkText=" //a[contains(text(),'NumpyNinja')]") WebElement tl_NumpyNinja;
	
	@FindBy(linkText="Try here>>>") WebElement btn_Try_here;
	//	
	//	@FindBy(xpath= "//div[@class='CodeMirror-scroll']") WebElement txt_OIS_Editor;
	//	
	//	@FindBy(xpath=" //button[contains(text(),'Run')]")  WebElement btn_Run;

	public Queue_pf(WebDriver driver) {
		//BaseClass.driver=driver;
		PageFactory.initElements(driver,this);
	}



	public void clickGetStarted() {
		lnk_GetStarted.click();

	}

	
	public void clickImplementationofQueueinPython() {
		lnk_Implementation_of_queue_in_Python.click();
	}
	public String queueinpyTitle() {

		return  tl_qinpython.getText();
	}


	public void clickImplementationusingcollectionsdeque() {
		lnk_Implementation_using_collections_deque.click();
	}
	public String queuedequeTitle() {

		return tl_queueindeque.getText();
	}


	public void clickImplementationusingarray() {
		lnk_Implementation_using_array.click();
	}
	public String QarrayTitle() {

		return tl_qImplementationarray.getText();
	}


	public void clickQueueOperations() {
		lnk_Queue_Operations.click();

	}	
	public String QoperTitle() {

		return tl_qoperations.getText();
	}

//	public String queuehomeTitle() {
//
//		return ((WebDriver) tl_queue).getTitle();
//	}

	public void clickpracticeQuestions1() {
		lnk_Practice_Questions1	.click();

	}
	
	
	
//	public String homepageTitle() {
//
//		return ((WebDriver) tl_NumpyNinja).getTitle();
//	}
	public void clickTryHere() {
		btn_Try_here.click();
	}
	//
	//
	//public void blankeditor() {
	//	txt_OIS_Editor.sendKeys("");
	//}
	//
	//public void EntervalidCode() {
	//	txt_OIS_Editor.sendKeys("from Excel");
	//}
	//
	//public void EnterInvalidCode() {
	//	txt_OIS_Editor.sendKeys("from Excel");
	//}
	// public void clickstackRun() {
	//	 btn_Run.click();
	//	 
	// }

}
