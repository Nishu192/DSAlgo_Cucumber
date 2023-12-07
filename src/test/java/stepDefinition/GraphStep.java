package stepDefinition;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import log4j.LoggerLoad;
import pagefactory.Graph_PF;
import utilities.BaseClass;

public class GraphStep extends BaseClass{
	
	Graph_PF graph;
	//Graph_PF graph1;

	@Given("User is on DS algo home page")
	public void user_is_on_ds_algo_home_page() {
		graph=new Graph_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify Home page title by Assertions.");
	    LoggerLoad.info("Verify Home page title by assertion.");
	    softAssert.assertEquals(title, "NumpyNinja","Inside step-User is on DS Algo Home page.");
		LoggerLoad.info("User is on the Data Structure Home page");
		
		
	}

	@When("User clicks Get started button")
	public void user_clicks_get_started_button() {
		System.out.println("User clicks Graph Get Started button.");
		LoggerLoad.info("User clicks Graph Get Started button.");
		graph.clickHomeGetStartedGraph();
		
	    
	}

	@Then("User should be redirected to {string} graph home page")
	public void user_should_be_redirected_to_graph_home_page(String string) {
		//BaseClass.navigateToPage(string);
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify Graph Home page title by Assertions.");
	    LoggerLoad.info("Verify Graph Home page title by assertion.");
	    softAssert.assertEquals(title, "Graph","Inside step-User is on Graph Home page.");
		LoggerLoad.info("User is on the Graph Home page");
		System.out.println("User is redirected to "+string+" page");
		LoggerLoad.info("User is redirected to "+string+" page");
	}
	
	@Given("User is on Graph home page")
	public void user_is_on_graph_home_page() {
		graph=new Graph_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify Graph Home page title by Assertions.");
	    LoggerLoad.info("Verify Graph Home page title by assertion.");
	    softAssert.assertEquals(title, "Graph","Inside step-User is on Graph Home page.");
	   //System.out.println("User is on Graph home page");
	   LoggerLoad.info("User is on Graph home page");
	}

	@When("User clicks Graph link")
	public void user_clicks_graph_link() {
		System.out.println("User clicks Graph link on Graph home page.");
		LoggerLoad.info("User clicks Graph link on Graph home page.");
	    graph.clickGraph();
	}

	@Then("User should be redirected to {string} graph page")
	public void user_should_be_redirected_to_graph_page(String exptitle) {
		graph=new Graph_PF(BaseClass.getDriver());
		String acttitle=graph.getGraphGraphtitle();
		SoftAssert softAssert=new SoftAssert();
	    System.out.println("Verify title of Graph page.");
	    LoggerLoad.info("Verify title of Graph page.");
	    softAssert.assertEquals(acttitle,exptitle,"Assertion: True");
		//LoggerLoad.info("User is on "+string+" page");
		System.out.println("User is redirected to "+exptitle+" page");
		LoggerLoad.info("User is redirected to "+exptitle+" page");
	}
	
	@Given("User is on Graph page")
	public void user_is_on_graph_page() {
		graph=new Graph_PF(BaseClass.getDriver());
		   System.out.println("User is on Graph page");
		   LoggerLoad.info("User is on Graph page");
	}

	@When("User clicks Try Here link")
	public void user_clicks_try_here_link() {
		  System.out.println("User clicks Try Here link on Graph page");
		  LoggerLoad.info("User clicks Try Here link on Graph page");
		  graph.clickGraphTryHere();
	    
	}

	@Then("User should be redirected to {string} tryEditor page having Editor and run button")
	public void user_should_be_redirected_to_try_editor_page_having_editor_and_run_button(String string) {
		graph=new Graph_PF(BaseClass.getDriver());
		BaseClass.navigateToPage(string);
		SoftAssert softAssert=new SoftAssert();
		boolean check=graph.isPageHavingEditorAndRunButton();
		softAssert.assertTrue(check, "User is redirected to "+string+" page ");;
		LoggerLoad.info("User is redirected to "+string+" page");
		softAssert.assertAll();
		//System.out.println("Error while redirecting to TryEditor page");
		//LoggerLoad.warn("Error while redirecting to TryEditor page");
		
	}
	
	@When("User clicks Graph Representations link")
	public void user_clicks_graph_representations_link() {
		graph=new Graph_PF(BaseClass.getDriver());
	  System.out.println("User clicks the link for Graph Presentations.");  
	  LoggerLoad.info("User clicks the link for Graph Presentations");
	  graph.clickGraphRepresentations();
	}

	@Then("User should be redirected to {string} Graph Representations page")
	public void user_should_be_redirected_to_graph_representations_page(String exptitle) {
		graph=new Graph_PF(BaseClass.getDriver());
		String acttitle=graph.getGraphRepresentationtitle();
		SoftAssert softAssert=new SoftAssert();
	    System.out.println("Verify title of Graph representation page.");
	    LoggerLoad.info("Verify title of Graph Representation page.");
	    softAssert.assertEquals(acttitle,exptitle,"Assertion: True");
		//LoggerLoad.info("User is on "+string+" page");
		System.out.println("User is redirected to "+exptitle+" page");
		LoggerLoad.info("User is redirected to "+exptitle+" page");
	}

	@Given("User is on Graph Representations page")
	public void user_is_on_Graph_Representations_page() {
		graph=new Graph_PF(BaseClass.getDriver());
	   System.out.println("User is on Graph Representations page");
	   LoggerLoad.info("User is on Graph Representations page");
	}

	@When("User clicks Practice Questions link")
	public void user_clicks_practice_questions_link() {
		graph=new Graph_PF(BaseClass.getDriver());
		System.out.println("User clicks the link for Practice Questions.");  
		LoggerLoad.info("User clicks the link for Practice Questions.");
		  graph.clickPracticeQuestion();
	}
	@Then("User should be redirected to {string} Practice Questions page")
	public void user_should_be_redirected_to_practice_questions_page(String exptitle) {
		graph=new Graph_PF(BaseClass.getDriver());
		String acttitle=BaseClass.getTitle();
		SoftAssert softAssert=new SoftAssert();
	    System.out.println("Verify title of practice question in Graph.");
	    LoggerLoad.info("Verify title of practice question in Graph.");
	    softAssert.assertEquals(acttitle,exptitle,"Assertion: True.");
		LoggerLoad.info("User is redirected to "+exptitle+" page");
	}

	@Given("The user is already on Practice Questions page of Graph")
	public void the_user_is_already_on_practice_questions_page_of_graph() {
		System.out.println("User is on Practice Questions page.");
		LoggerLoad.info("User is on Practice Questions page");
		graph = new Graph_PF(BaseClass.getDriver());
	}

	@When("Nothing is displayed on the page of Practice Questions")
	public void nothing_is_displayed_on_the_page_of_practice_questions() {
		System.out.println("The practice questions page is blank.");
	}

	@Then("User go back to the {string} DS home page")
	public void user_go_back_to_the_ds_home_page(String string) {
		BaseClass.navigateToPage(string);
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify DS Home page title by Assertions.");
	    LoggerLoad.info("Verify DS Home page title by assertion.");
	    softAssert.assertEquals(title, "NumpyNinja","Inside step-User is on DS Algo Home page.");
		LoggerLoad.info("User go back to the Data Structure Home page");
		System.out.println("User is redirected to "+string+" DS Algo home page");
		LoggerLoad.info("User is redirected to "+string+" DS Algo home page");
	}

}
