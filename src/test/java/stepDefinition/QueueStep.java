package stepDefinition;

import org.junit.Assert;

//import org.openqa.selenium.WebDriver;
//import org.testng.asserts.SoftAssert;


import pagefactory.Queue_pf;
//import PageFactory.Stack_pf;
//import PageFactory.Stack_pf;
import utilities.BaseClass;
import io.cucumber.java.en.*;
import log4j.LoggerLoad;

public class QueueStep extends BaseClass {

	Queue_pf qp;
	
	

	
	
	@Given("The user is on the DS Home page after logged in")
	public void the_user_is_on_the_ds_home_page_after_logged_in() {
		qp = new Queue_pf (BaseClass.getDriver());
		  System.out.println("User is on Homepage");
		  LoggerLoad.info("User is on the homepage.");
	}
	@When("The user clicks the GetStarted in Queue Panel or select QueueDS item from the drop down menu")
	public void the_user_clicks_the_get_started_in_queue_panel_or_select_queue_ds_item_from_the_drop_down_menu() throws InterruptedException {
		qp = new Queue_pf(BaseClass.getDriver());
		
		System.out.println("User clicks queue GetStarted button.");
		LoggerLoad.info("User clicks queue GetStarted button.");
		qp.clickGetStarted(); 
	}


	@Then("The user should be directed to {string} queue Page")
	public void the_user_should_be_directed_to_queue_page(String expT) {
		qp = new Queue_pf(BaseClass.getDriver());
		String actT=BaseClass.getTitle();
	      Assert.assertEquals(actT,expT);
	        LoggerLoad.info("User sees Login link on the page ");
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------
	@Given("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
	    qp=new Queue_pf (BaseClass.getDriver());
		  System.out.println("User is on Homepage");
		  LoggerLoad.info("User is on the homepage.");  
	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {
		qp = new Queue_pf(BaseClass.getDriver());
		//Thread.sleep(2000); 
		qp.clickImplementationofQueueinPython();
		System.out.println("User clicks Implementation of Queue in python button.");
		LoggerLoad.info("User clicks Implementation of Queue in pthon button.");
	}

	@Then("The user should be directed to {string} Pageq1")
	public void the_user_should_be_directed_to_pageq1(String expT) {
		qp = new Queue_pf(BaseClass.getDriver());
		String actT=qp.queueinpyTitle();
	      Assert.assertEquals(actT,expT);
	        LoggerLoad.info("User sees Login link on the page ");
	}
//------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Given("The user is in the Implementation of Queue in Python in Queue page")
	public void the_user_is_in_the_implementation_of_queue_in_python_in_queue_page() {
		qp=new Queue_pf (BaseClass.getDriver());
		  System.out.println("User is on Implementation of Queue in Pythonpage");
		  LoggerLoad.info("User is on the Implementation of Queue in Pythonpage");  
	}


	@When("The user clicks Implementation using Collections.deque button")
	public void the_user_clicks_implementation_using_collections_deque_button() {
		qp = new Queue_pf(BaseClass.getDriver());
		//Thread.sleep(2000); 
		qp.clickImplementationusingcollectionsdeque();
		System.out.println("User clicks Implementation button.");
		LoggerLoad.info("User clicks Implementation button.");
	}

	@Then("The user should be directed to {string} collections deque Pageq2")
	public void the_user_should_be_directed_to_collections_deque_pageq2(String expT) 
		{
			qp = new Queue_pf(BaseClass.getDriver());
			String actT=qp.queuedequeTitle();
		      Assert.assertEquals(actT,expT);
		        LoggerLoad.info("Implementation using Collections.deque ");
	}
//----------------------------------------------------------------------------------------------------------------------------------------------	
	
		

	@When("The user clicks Implementation using Array button")
	public void the_user_clicks_implementation_using_array_button() {
		qp = new Queue_pf(BaseClass.getDriver());
		//Thread.sleep(2000); 
		qp.clickImplementationusingarray();
		System.out.println("User clicks Implementation using Array ");
		LoggerLoad.info("User clicks Implementation using Array ");
	}

	@Then("The user should be directed to {string} Queue Operations Pageq33")
	public void the_user_should_be_directed_to_queue_operations_pageq33(String expT) {
		qp = new Queue_pf(BaseClass.getDriver());
		String actT=qp.QoperTitle();
	      Assert.assertEquals(actT,expT);
	        LoggerLoad.info("User sees Implementation using Array on the page ");
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------
	
	@Given("The user is in  Implementation using Array Page")
	public void the_user_is_in_Implementation_using_array_page() {
		qp=new Queue_pf (BaseClass.getDriver());
		  System.out.println("User is on Implementation of using Array Page");
		  LoggerLoad.info("User is on the Implementation of using Array Page"); 
	}

	@When("The user clicks Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
		qp = new Queue_pf(BaseClass.getDriver());
		//Thread.sleep(2000); 
		qp.clickQueueOperations();
		System.out.println("User clicks Operations button.");
		LoggerLoad.info("User clicks Operations button.");
	}
	@Then("The user should be directed to {string} Implementation using Array Pageq3")
	public void the_user_should_be_directed_to_implementation_using_array_pageq3(String expT) {
		qp = new Queue_pf(BaseClass.getDriver());
		String actT=qp.QarrayTitle();
		
	      Assert.assertEquals(actT,expT);
	        LoggerLoad.info("User sees Queue Operations  on the page ");
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------
	@Given("The user is in the Queue page")
	public void the_user_is_in_the_queue_page() {
		qp = new Queue_pf(BaseClass.getDriver());
		System.out.println("User is on Queuepage");
		  LoggerLoad.info("User is on the Queuepage.");  

	}

	@When("The user clicks Practice Questions on queue")
	public void the_user_clicks_practice_questions_on_queue() {
		qp = new Queue_pf(BaseClass.getDriver());
		//Thread.sleep(2000); 
		qp.clickpracticeQuestions1();
		System.out.println("User clicks Practice Questions  on queue");
		LoggerLoad.info("User clicks Practice Questions  on queue");
	}

	@Then("The user should be redirected to {string} Practice Questions page of queue")
	public void the_user_should_be_redirected_to_practice_questions_page_of_queue(String expT) {
		qp = new Queue_pf(BaseClass.getDriver());
		String actT=BaseClass.getTitle();
	      Assert.assertEquals(actT,expT);
	        LoggerLoad.info("User sees Practice Questions  on queuelink on the page ");
	}



}
