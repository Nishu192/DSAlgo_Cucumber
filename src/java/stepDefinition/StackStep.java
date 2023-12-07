package stepDefinition;
//import java.io.IOException;

import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.asserts.SoftAssert;

import pagefactory.Stack_pf;
//import PageFactory.login_pf;
import utilities.BaseClass;
import io.cucumber.java.en.*;
import log4j.LoggerLoad;

public class StackStep extends BaseClass {

	//WebDriverWait wait ;
	 Stack_pf sp;
	
	 @Given("The user is in the DS Home page after logged in")
	 public void the_user_is_in_the_ds_home_page_after_logged_in() {
		  sp=new Stack_pf(BaseClass.getDriver());
		  System.out.println("User is on Homepage");
		  LoggerLoad.info("User is on the homepage.");

	 }

	 @When("The user clicks the Get Started in Stack Panel or select Stack item from the drop down menu")
	 public void the_user_clicks_the_get_started_in_stack_panel_or_select_stack_item_from_the_drop_down_menu() throws InterruptedException {
		 sp = new Stack_pf(BaseClass.getDriver());
			//Thread.sleep(2000);
		  //sp.until(ExpectedConditions.visibilityOfElementLocated(By.linkText="Get Started"));
		  //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Get Started")));		

			System.out.println("User clicks stack GetStarted button.");
			LoggerLoad.info("User clicks stack GetStarted button.");
			sp.clickGetStarted(); 
	 }

	 @Then("The user should be directed to {string} Stack Page")
	 public void the_user_should_be_directed_to_stack_page(String expT) {
		 sp = new Stack_pf(BaseClass.getDriver());
			String actT=BaseClass.getTitle();
		      Assert.assertEquals(actT,expT);
		        LoggerLoad.info("User sees Stack page ");
	 }
	 @Given("The user is in the  after logged in")
	 public void the_user_is_in_the_after_logged_in() {
		 sp=new Stack_pf(BaseClass.getDriver());
		  System.out.println("User is on Homepage");
		  LoggerLoad.info("User is on the homepage.");  
	 }

	 @When("The user clicks Operations in Stack button")
	 public void the_user_clicks_operations_in_stack_button() throws InterruptedException {
		 sp = new Stack_pf(BaseClass.getDriver());
		 //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("lnk_Operations_in_Stack")));	
			sp.clickoperationsinstack();
			System.out.println("User clicks operationsinstack button.");
			LoggerLoad.info("User clicks stack operationsinstack button.");
	 }

	 @Then("The user should be directed to the {string} Operations in Stack Page")
	 public void the_user_should_be_directed_to_the_operations_in_stack_page(String expT) {
		 sp = new Stack_pf(BaseClass.getDriver());
			String actT=sp.stackoperationsTitle();
		      Assert.assertEquals(actT,expT);
		        LoggerLoad.info("User sees operationsinstack on the page ");
	 }

	 @Given("The user is in the Stack page after logged in")
	 public void the_user_is_in_the_stack_page_after_logged_in() {
		 sp=new Stack_pf(BaseClass.getDriver());
		  System.out.println("User is on Homepage");
		  LoggerLoad.info("User is on the homepage.");  
	 }

	 @When("The user clicks Implementation button")
	 public void the_user_clicks_implementation_button() throws InterruptedException {
		 sp = new Stack_pf(BaseClass.getDriver());
		 //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("lnk_Implementations")));	
			sp.clickImplementation();
			System.out.println("User clicks Implementation button.");
			LoggerLoad.info("User clicks Implementation button.");
	 }

	 @Then("The user should be directed to {string} Implementation Page2")
	 public void the_user_should_be_directed_to_implementation_page2(String expT) {
		 sp = new Stack_pf(BaseClass.getDriver());
			String actT=sp.stackImplementationTitle();
		      Assert.assertEquals(actT,expT);
		        LoggerLoad.info("User sees Implementation link on the page ");

	 }
	 
	 @Given("The user is in the Stack page1 after logged in")
	 public void the_user_is_in_the_stack_page1_after_logged_in() {
		 sp=new Stack_pf(BaseClass.getDriver());
		  System.out.println("User is on stackHomepage");
		  LoggerLoad.info("User is on the stackhomepage.");
	 }

	 @When("The user clicks Application button")
	 public void the_user_clicks_application_button() throws InterruptedException {
		 sp = new Stack_pf(BaseClass.getDriver());
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("lnk_Applications")));	
			sp.clickApplication();
			System.out.println("User clicks Application button.");
			LoggerLoad.info("User clicks Application button.");
	 }

	 @Then("The user should be directed to {string} Applications Page3")
	 public void the_user_should_be_directed_to_applications_page3(String expT) {
		 sp = new Stack_pf(BaseClass.getDriver());
			String actT=sp.stackApplicationTitle();
		      Assert.assertEquals(actT,expT);
		        LoggerLoad.info("User sees Applicationlink on the page ");
	 }
	 @Given("The user is in the Stack page2 after logged in")
	 public void the_user_is_in_the_stack_page2_after_logged_in() {
		 sp=new Stack_pf(BaseClass.getDriver());
		  System.out.println("User is on stackHomepage");
		  LoggerLoad.info("User is on the stackhomepage.");
	 }

	 @When("The user clicks Practice Questions button in Stack")
	 public void the_user_clicks_practice_questions_button_in_stack() throws InterruptedException {
		 sp = new Stack_pf(BaseClass.getDriver());
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("lnk_Practice_Questions")));	
			sp.clickpracticeQuestions();
			System.out.println("User clicks PracticeQuestions button.");
			LoggerLoad.info("User clicks PracticeQuestions button.");

	 }

	 @Then("The user should be redirected to {string} P Questions page")
	 public void the_user_should_be_redirected_to_p_questions_page(String expT) {
		 sp = new Stack_pf(BaseClass.getDriver());
			String actT=BaseClass.getTitle();
		      Assert.assertEquals(actT,expT);
		        LoggerLoad.info("User sees practiceQlink on the page ");
	 }

//	 @Given("User is on the Practice Questions page")
//	 public void user_is_on_the_practice_questions_page() {
//		 sp = new Stack_pf(BaseClass.getDriver());
//			System.out.println("User is on practiceQuestionspage");
//			  LoggerLoad.info("User is on the PracticeQuestionspage.");  
//	 }
//
//	 @When("nothing is displayed on the page")
//	 public void nothing_is_displayed_on_the_page() throws InterruptedException {
//		 sp = new Stack_pf(BaseClass.getDriver());
//		 //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Get Started")));	
//		 System.out.println("The practice questions page is blank.");
//			
//			 LoggerLoad.info("User is on the emptyscreen of PracticeQuestionspage.");  
//
//	 }
//
//	 @Then("user go back to the {string} DS page")
//	 public void user_go_back_to_the_ds_page(String expT) {
//		 
//		BaseClass.navigateToPage("https://dsportalapp.herokuapp.com/home");
////			
////			System.out.println("User is redirected to "+url+" DS Algo home page");
////		LoggerLoad.info("User is redirected to "+url+" DS Algo home page");
//		sp = new Stack_pf(BaseClass.getDriver());
//	
//		String actT=BaseClass.getTitle();
//	    Assert.assertEquals(actT,expT);
//	      LoggerLoad.info("User sees Numpyninja  on the page ");
//		}
	 }






		