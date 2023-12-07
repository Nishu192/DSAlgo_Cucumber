package stepDefinition;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import log4j.LoggerLoad;
import pagefactory.LinkedList_PF;
import utilities.BaseClass;

public class LinkedListStep {
	LinkedList_PF linkedlist;
	
	@Given("User is on the DS algo portal home page")
	public void user_is_on_the_ds_algo_portal_home_page() {
		System.out.println("Inside step-User is on DS Algo portal home page.");
		LoggerLoad.info("User is on DS Algo portal home page page");
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify Home page title by Assertions.");
	    LoggerLoad.info("Verify Home page title by assertion.");
	    softAssert.assertEquals(title, "NumpyNinja","Assertion : True");
	}

	@When("User clicks Get started button from Linked List pane")
	public void user_clicks_get_started_button_from_linked_list_pane() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Linked List Get Started button.");
		LoggerLoad.info("User clicks Linked List Get Started button.");
		linkedlist.clickHomeGetStartedLinkedList();
	}

	@Then("User should be redirected to {string} Linked List home page")
	public void user_should_be_redirected_to_linked_list_home_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=BaseClass.getTitle();
	    System.out.println("Verify Linked List page title by Assertions.");
	    LoggerLoad.info("Verify  Linked List page url by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion : True");
		LoggerLoad.info("User is on the Linked List home page");
		
	}

	@Given("User is on Linked List page in Linked List module")
	public void user_is_on_linked_list_page_in_linked_list_module() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Linked List page in Linked List module");
	}

	@When("User clicks Introduction link")
	public void user_clicks_introduction_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Introduction link in LL.");  
		  LoggerLoad.info("User clicks Introduction link in LL.");
		  linkedlist.clickIntroduction();
	}

	@Then("User should be redirected to {string} Introduction of Linked List page")
	public void user_should_be_redirected_to_introduction_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_Introductiontitle();
	    System.out.println("Verify Introduction in LL page title by Assertions.");
	    LoggerLoad.info("Verify Introduction in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Introduction page")
	public void user_is_on_introduction_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Introduction page in Linked List module");
	}

	@When("User clicks a Try Here link on Introduction of Linked List page")
	public void user_clicks_a_try_here_link_on_introduction_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Introduction page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Introduction page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}

	@When("User clicks Creating Linked LIst link")
	public void user_clicks_creating_linked_l_ist_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Creating Linked LIst link in LL.");  
		  LoggerLoad.info("User clicks Creating Linked LIst link in LL.");
		  linkedlist.clickCreatingLinkedLIst();
	}

	@Then("User should be redirected to {string} Creating Linked LIst of Linked List page")
	public void user_should_be_redirected_to_creating_linked_l_ist_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_CreatingLinkedLIsttitle();
	    System.out.println("Verify Creating Linked LIst in LL page title by Assertions.");
	    LoggerLoad.info("Verify Creating Linked LIst in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Creating Linked LIst page")
	public void user_is_on_creating_linked_l_ist_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Creating Linked List page in Linked List module");
	}

	@When("User clicks a Try Here link on Creating Linked LIst of Linked List page")
	public void user_clicks_a_try_here_link_on_creating_linked_l_ist_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Creating Linked LIst page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Creating Linked LIst page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}

	@When("User clicks Types of Linked List link")
	public void user_clicks_types_of_linked_list_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Types of Linked List link in LL.");  
		  LoggerLoad.info("User clicks Types of Linked List link in LL.");
		  linkedlist.clickTypesofLinkedList();
	}

	@Then("User should be redirected to {string} Types of Linked List of Linked List page")
	public void user_should_be_redirected_to_types_of_linked_list_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_TypesofLinkedListtitle();
	    System.out.println("Verify Types of Linked List in LL page title by Assertions.");
	    LoggerLoad.info("Verify Types of Linked List in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Types of Linked List page")
	public void user_is_on_types_of_linked_list_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Types of Linked List page in Linked List module");
	}

	@When("User clicks a Try Here link on Types of Linked List of Linked List page")
	public void user_clicks_a_try_here_link_on_types_of_linked_list_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Types of Linked LIst page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Types of Linked LIst page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}
	
	@When("User clicks Implement Linked List in Python link")
	public void user_clicks_implement_linked_list_in_python_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Implement Linked List in Python link in LL.");  
		  LoggerLoad.info("User clicks Implement Linked List in Python link in LL.");
		  linkedlist.clickImplementLinkedListinPython();
	}

	@Then("User should be redirected to {string} Implement Linked List in Python of Linked List page")
	public void user_should_be_redirected_to_implement_linked_list_in_python_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_ImplementLinkedListinPythontitle();
	    System.out.println("Verify Implement Linked List in Python in LL page title by Assertions.");
	    LoggerLoad.info("Verify Implement Linked List in Python in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Implement Linked List in Python page")
	public void user_is_on_implement_linked_list_in_python_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Implement Linked List page in Linked List module");
	}

	@When("User clicks a Try Here link on Implement Linked List in Python of Linked List page")
	public void user_clicks_a_try_here_link_on_implement_linked_list_in_python_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Implement Linked List in Python page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Implement Linked List in Python page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}
	
	@When("User clicks Traversal link")
	public void user_clicks_traversal_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Traversal link in LL.");  
		  LoggerLoad.info("User clicks Traversal link in LL.");
		  linkedlist.clickTraversal();
	}

	@Then("User should be redirected to {string} Traversal of Linked List page")
	public void user_should_be_redirected_to_traversal_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_Traversaltitle();
	    System.out.println("Verify Traversal in LL page title by Assertions.");
	    LoggerLoad.info("Verify Traversal in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Traversal page")
	public void user_is_on_traversal_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Traversal page in Linked List module");
	}

	@When("User clicks a Try Here link on Traversal of Linked List page")
	public void user_clicks_a_try_here_link_on_traversal_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Traversal page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Traversal page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}
	
	@When("User clicks Insertion link")
	public void user_clicks_insertion_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Insertion link in LL.");  
		  LoggerLoad.info("User clicks Insertion link in LL.");
		  linkedlist.clickInsertion();
	}

	@Then("User should be redirected to {string} Insertion of Linked List page")
	public void user_should_be_redirected_to_insertion_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_Insertiontitle();
	    System.out.println("Verify Insertion in LL page title by Assertions.");
	    LoggerLoad.info("Verify Insertion in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Insertion page")
	public void user_is_on_insertion_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Insertion page in Linked List module");
	}

	@When("User clicks a Try Here link on Insertion of Linked List page")
	public void user_clicks_a_try_here_link_on_insertion_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Insertion page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Insertion page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}
	
	@When("User clicks Deletion link")
	public void user_clicks_deletion_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		  System.out.println("User clicks Deletion link in LL.");  
		  LoggerLoad.info("User clicks Deletion link in LL.");
		  linkedlist.clickDeletion();
	}

	@Then("User should be redirected to {string} Deletion of Linked List page")
	public void user_should_be_redirected_to_deletion_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=linkedlist.gettxt_Deletiontitle();
	    System.out.println("Verify Deletion in LL page title by Assertions.");
	    LoggerLoad.info("Verify Deletion in LL page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on "+exptitle);
	}

	@Given("User is on Deletion page")
	public void user_is_on_deletion_page() {
		linkedlist = new LinkedList_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Deletion page in Linked List module");
	}

	@When("User clicks a Try Here link on Deletion of Linked List page")
	public void user_clicks_a_try_here_link_on_deletion_of_linked_list_page() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Deletion page in LL.");
		  LoggerLoad.info("User clicks Try Here link on Deletion page in LL.");
		  linkedlist.clickLinkedListTryHere();
	}
	
	@When("User clicks  Practice Questions  link")
	public void user_clicks_practice_questions_link() {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		System.out.println("User clicks  Practice Questions link of Linked List.");
		   LoggerLoad.info("User clicks  Practice Questions link of Linked List.");
		  linkedlist.clickPracticeQuestion();
	}

	@Then("User should be redirected to {string}  Practice Questions of Linked List page")
	public void user_should_be_redirected_to_practice_questions_of_linked_list_page(String exptitle) {
		linkedlist=new LinkedList_PF(BaseClass.getDriver());
		String actualtitle=BaseClass.getTitle();
		SoftAssert softAssert=new SoftAssert();
	    System.out.println("Verify Practice Question page title in Linked List.");
	    LoggerLoad.info("Verify Practice Question page title in Linked List.");
	    softAssert.assertEquals( actualtitle,exptitle,"Assertaion: True");
		LoggerLoad.info("User is on "+exptitle+" page");
		System.out.println("User is redirected to "+exptitle+" page");
		
	}


	
}
