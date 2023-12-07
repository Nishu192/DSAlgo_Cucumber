package stepDefinition;

import java.io.*;

//import org.junit.Assert;
//import org.openqa.selenium.*;
import org.testng.asserts.SoftAssert;

//import com.google.common.io.Files;

import io.cucumber.java.en.*;
//import io.qameta.allure.Allure;
import log4j.LoggerLoad;
import pagefactory.Tree_PF;
import utilities.BaseClass;

public class TreeStep extends BaseClass {
	Tree_PF tree;

	@Given("User is on the DS algo home page")
	public void user_is_on_the_ds_algo_home_page() {
		System.out.println("Inside step-User is on DS Algo home page.");
		LoggerLoad.info("User is on DS Algo home page page");
		tree = new Tree_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify Home page title by Assertions.");
	    LoggerLoad.info("Verify Home page title by assertion.");
	    softAssert.assertEquals(title, "NumpyNinja","Assertion: True");
		LoggerLoad.info("User is on the Data Structure Home page");
		//System.out.println("Inside step-User is on DS Algo Home page.");
	   
	}

	@When("User clicks Get started button from Tree pane")
	public void user_clicks_get_started_button_from_tree_pane() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Tree Get Started button.");
		LoggerLoad.info("User clicks Tree Get Started button.");
		tree.clickHomeGetStartedTree();
	}

	@Then("User should be redirected to {string} Tree home page")
	public void user_should_be_redirected_to_tree_home_page(String exptitle) {
	  
		
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getTreeTitle();
	    System.out.println("Verify Tree Home page title by Assertions.");
	    LoggerLoad.info("Verify Tree Home page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
		LoggerLoad.info("User is on the Tree Home page");
		
	}
	
	@Given("User is on Tree home page")
	public void user_is_on_tree_home_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Tree home page");
		   
	}

	@When("User clicks Overview of Trees link")
	public void user_clicks_overview_of_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		
	   System.out.println("User clicks Overview of Trees link.");
	   LoggerLoad.info("User clicks Overview of Trees link.");
	   tree.clickOverviewofTrees();
	}

	@Then("User should be redirected to {string} Tree OT page")
	public void user_should_be_redirected_to_tree_ot_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getOverviewOfTreetitle();
	    System.out.println("Verify Overview of Trees page title by Assertions.");
	    LoggerLoad.info("Verify Overview of Trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Overview of Tree page");
	}

	
	@Given("User is on Overview of Trees page")
	public void user_is_on_overview_of_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Overview of Tree page");
	}

	@When("User clicks a Try Here link on Overview of Trees page")
	public void user_clicks_a_try_here_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Overview of Trees page");
		  LoggerLoad.info("User clicks Try Here link on Overview of Trees page");
		  tree.clickTreeTryHere();
	}
	
	@When("User clicks Terminologies link")
	public void user_clicks_terminologies_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Terminologies link.");
		   LoggerLoad.info("User clicks Terminologies link.");
		   tree.clickTerminologies();
	}

	@Then("User should be redirected to {string} Tree Terminologies page")
	public void user_should_be_redirected_to_tree_terminologies_page(String exptitle) throws IOException {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getTerminologiesTreetitle();
	    System.out.println("Verify Terminologies page title by Assertions.");
	    LoggerLoad.info("Verify Terminologies page title by assertion.");
//	    WebDriver driver=BaseClass.getDriver();
//		   Assert.assertEquals(true,false);
//		  
//		   File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  Files.copy(f, new File("C:/Users/OVI/eclipse-workspace/DSAlgo_Cucumber/FirstCode/screenshot.jpg"));
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Terminologies of Tree page");
//	   catch(Exception e){
//		   tree.screenshot(BaseClass.getDriver());
//		   Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//		   }
	}


	@Given("User is on Terminologies page")
	public void user_is_on_terminologies_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Terminologies of Tree page");
	}
	
	@When("User clicks a Try Here link on Terminologies page")
	public void user_clicks_a_try_here_link_on_terminologies_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Terminologies page");
		  LoggerLoad.info("User clicks Try Here link on Terminologies page");
		  tree.clickTreeTryHere();
	}
	
	@When("User clicks Types of Trees link")
	public void user_clicks_types_of_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Types of Trees link.");
		   LoggerLoad.info("User clicks Types of Trees link.");
		   tree.clickTypesofTrees();
	}
	
	@Then("User should be redirected to {string} Types of Trees page")
	public void user_should_be_redirected_to_tree_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getTypesofTreetitle();
	    System.out.println("Verify Types of Trees page title by Assertions.");
	    LoggerLoad.info("Verify Types of Trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Types of Trees page");
	}

	@Given("User is on Types of Trees page")
	public void user_is_on_types_of_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Types of Tree page");
	}	

	@When("User clicks a Try Here link on Types of Trees page")
	public void user_clicks_a_try_here_link_on_types_of_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Types of Trees page");
		  LoggerLoad.info("User clicks Try Here link on Types of Trees page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Tree Traversals link")
	public void user_clicks_tree_traversals_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Tree Traversals link.");
		   LoggerLoad.info("User clicks Tree Traversals link.");
		   tree.clickTreeTraversals();
	}

	@Then("User should be redirected to {string} Tree Traversals of Tree page")
	public void user_should_be_redirected_to_tree_traversals_of_tree_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getTreeTraversalsTreetitle();
	    System.out.println("Verify Tree Traversals page title by Assertions.");
	    LoggerLoad.info("Verify Tree Traversals page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Tree Traversals page");
	}

	@Given("User is on Tree Traversals page")
	public void user_is_on_tree_traversals_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Tree Traversals page");
	}
	
	@When("User clicks a Try Here link on Tree Traversals page")
	public void user_clicks_a_try_here_link_on_tree_traversals_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Tree Traversals page");
		  LoggerLoad.info("User clicks Try Here link on Tree Traversals page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Traversals-Illustration link")
	public void user_clicks_traversals_illustration_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Traversals-Illustration link.");
		   LoggerLoad.info("User clicks Traversals-Illustration link.");
		   tree.clickTraversalsIllustration();
	}

	@Then("User should be redirected to {string} Traversals-Illustration Tree page")
	public void user_should_be_redirected_to_traversals_illustration_tree_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getTraversalsIllustrationTreetitle();
	    System.out.println("Verify Traversals-Illustration page title by Assertions.");
	    LoggerLoad.info("Verify Traversals-Illustration page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Traversals-Illustration of Tree page");
	}

	@Given("User is on Traversals-Illustration page")
	public void user_is_on_traversals_illustration_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Traversals-Illustration page");
	}

	@When("User clicks a Try Here link on Traversals-Illustration page")
	public void user_clicks_a_try_here_link_on_traversals_illustration_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Traversals-Illustration page");
		  LoggerLoad.info("User clicks Try Here link on Traversals-Illustration page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Binary Trees link")
	public void user_clicks_binary_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Binary Trees link.");
		   LoggerLoad.info("User clicks Binary Trees link.");
		   tree.clickBinaryTrees();
	}
	
	@Then("User should be redirected to {string} Binary Trees page")
	public void user_should_be_redirected_to_binary_trees_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getBinaryTreetitle();
	    System.out.println("Verify Binary Trees page title by Assertions.");
	    LoggerLoad.info("Verify Binary Trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Binary Trees page");
	}

	@Given("User is on Binary Trees page")
	public void user_is_on_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Binary Trees page");
	}

	@When("User clicks a Try Here link on Binary Trees page")
	public void user_clicks_a_try_here_link_on_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Binary Trees page");
		  LoggerLoad.info("User clicks Try Here link on Binary Trees page");
		  tree.clickTreeTryHere();
	}
	
	@When("User clicks Types of Binary Trees link")
	public void user_clicks_types_of_binary_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Types of Binary Trees link.");
		   LoggerLoad.info("User clicks Types of Binary Trees link.");
		   tree.clickTypesofBinaryTrees();
	}
	
	@Then("User should be redirected to {string} Types of Binary Trees page")
	public void user_should_be_redirected_to_types_of_binary_trees_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getTypesofBinaryTreetitle();
	    System.out.println("Verify Types of Binary Trees page title by Assertions.");
	    LoggerLoad.info("Verify Types of Binary Trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Types of Binary Trees page");
	}

	@Given("User is on Types of Binary Trees page")
	public void user_is_on_types_of_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Types of Binary Trees page");
	}


	@When("User clicks a Try Here link on Types of Binary Trees page")
	public void user_clicks_a_try_here_link_on_types_of_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Types of Binary Trees page");
		  LoggerLoad.info("User clicks Try Here link on Types of Binary Trees page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Implementation in Python link")
	public void user_clicks_implementation_in_python_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Implementation in Python link.");
		   LoggerLoad.info("User clicks Implementation in Python link.");
		   tree.clickImplementationInPython();
	}

	@Then("User should be redirected to {string} Implementation in Python Tree page")
	public void user_should_be_redirected_to_implementation_in_python_tree_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getImplementationinPythonTreetitle();
	    System.out.println("Verify Implementation in Python page title by Assertions.");
	    LoggerLoad.info("Verify Implementation in Python page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Implementation in Python page");
	}

	@Given("User is on Implementation in Python page")
	public void user_is_on_implementation_in_python_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on mplementation in Python page");
	}
	
	@When("User clicks a Try Here link on Implementation in Python page")
	public void user_clicks_a_try_here_link_on_implementation_in_python_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Implementation in Python page");
		  LoggerLoad.info("User clicks Try Here link on Implementation in Python page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Binary Tree Traversals link")
	public void user_clicks_binary_tree_traversals_link() {
		tree = new Tree_PF(BaseClass.getDriver());
	   System.out.println("User clicks Binary Tree Traversals link.");
		   LoggerLoad.info("User clicks Binary Tree Traversals link.");
		   tree.clickBinaryTreeTraversals();
	}

	@Then("User should be redirected to {string} Binary Tree Traversals page")
	public void user_should_be_redirected_to_binary_tree_traversals_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getBinaryTreeTraversalsTreetitle();
	    System.out.println("Verify Binary Tree Traversals page title by Assertions.");
	    LoggerLoad.info("Verify Binary Tree Traversals page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Binary Tree Traversals page");
	}

	@Given("User is on Binary Tree Traversals page")
	public void user_is_on_binary_tree_traversals_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Binary Tree Traversals page");
	}
	
	@When("User clicks a Try Here link on Binary Tree Traversals page")
	public void user_clicks_a_try_here_link_on_binary_tree_traversals_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Binary Tree Traversals page");
		  LoggerLoad.info("User clicks Try Here link on Binary Tree Traversals page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Implementation of Binary Trees link")
	public void user_clicks_implementation_of_binary_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Implementation of Binary Trees link.");
		   LoggerLoad.info("User clicks Implementation of Binary Trees link.");
		   tree.clickImplementationOfBinaryTrees();
	}

	@Then("User should be redirected to {string} Implementation of Binary Trees page")
	public void user_should_be_redirected_to_implementation_of_binary_trees_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getImplementationofBinaryTreetitle();
	    System.out.println("Verify Implementation of Binary Trees page title by Assertions.");
	    LoggerLoad.info("Verify Implementation of Binary Trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Implementation of Binary Trees page");
	}

	@Given("User is on Implementation of Binary Trees page")
	public void user_is_on_implementation_of_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on  Implementation of Binary Trees page");
	}

	
	@When("User clicks a Try Here link on Implementation of Binary Trees page")
	public void user_clicks_a_try_here_link_on_implementation_of_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Implementation of Binary Trees page");
		  LoggerLoad.info("User clicks Try Here link on Implementation of Binary Trees page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Applications of Binary trees link")
	public void user_clicks_applications_of_binary_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Applications of Binary trees link.");
		   LoggerLoad.info("User clicks Applications of Binary trees link.");
		   tree.clickApplicationsOfBinaryTrees();
	}

	@Then("User should be redirected to {string} Applications of Binary trees page")
	public void user_should_be_redirected_to_applications_of_binary_trees_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getApplicationsofBinaryTreetitle();
	    System.out.println("Verify Applications of Binary trees page title by Assertions.");
	    LoggerLoad.info("Verify Applications of Binary trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Applications of Binary trees page");
	}

	@Given("User is on Applications of Binary trees page")
	public void user_is_on_applications_of_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Applications of Binary trees page");
	}
	
	@When("User clicks a Try Here link on Applications of Binary trees page")
	public void user_clicks_a_try_here_link_on_applications_of_binary_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Applications of Binary trees page");
		  LoggerLoad.info("User clicks Try Here link on Applications of Binary trees page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Binary Search Trees link")
	public void user_clicks_binary_search_trees_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Binary Search Trees link.");
		   LoggerLoad.info("User clicks Binary Search Trees link.");
		   tree.clickBinarySearchTrees();
	}

	@Then("User should be redirected to {string} Binary Search Treese page")
	public void user_should_be_redirected_to_binary_search_treese_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getBinarySearchTreetitle();
	    System.out.println("Verify Binary Search Trees page title by Assertions.");
	    LoggerLoad.info("Verify Binary Search Trees page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Binary Search Trees page");
	}


	@Given("User is on Binary Search Trees page")
	public void user_is_on_binary_search_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Binary Search Trees page");
	}

	
	@When("User clicks a Try Here link on Binary Search Trees page")
	public void user_clicks_a_try_here_link_on_binary_search_trees_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Binary Search Trees page");
		  LoggerLoad.info("User clicks Try Here link on Binary Search Trees page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Implementation Of BST link")
	public void user_clicks_implementation_of_bst_link() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Implementation Of BST link.");
		   LoggerLoad.info("User clicks Implementation Of BST link.");
		   tree.clickImplementationOfBST();
	}
	
	@Then("User should be redirected to {string} Implementation Of BST Tree page")
	public void user_should_be_redirected_to_implementation_of_bst_tree_page(String exptitle) {
		SoftAssert softAssert=new SoftAssert();
		String actualtitle=tree.getImplementationOfBSTTreetitle();
	    System.out.println("Verify Implementation Of BST page title by Assertions.");
	    LoggerLoad.info("Verify Implementation Of BST page title by assertion.");
	    softAssert.assertEquals(actualtitle, exptitle,"Assertion: True");
	    System.out.println("User is on "+exptitle);
		LoggerLoad.info("User is on the Implementation Of BST page");
	}

	@Given("User is on Implementation Of BST page")
	public void user_is_on_implementation_of_bst_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		LoggerLoad.info("User is on Implementation Of BST page");
	}


	@When("User clicks a Try Here link on Implementation Of BST page")
	public void user_clicks_a_try_here_link_on_implementation_of_bst_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks Try Here link on Implementation Of BST page");
		  LoggerLoad.info("User clicks Try Here link on Implementation Of BST page");
		  tree.clickTreeTryHere();
	}

	@When("User clicks Practice Questions link of tree")
	public void user_clicks_practice_questions_link_of_tree() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User clicks  Practice Questions link of tree.");
		   LoggerLoad.info("User clicks  Practice Questions link of tree.");
		   tree.clickPracticeQuestion();
	}

	@Then("User should be redirected to {string} Practice Questions of Tree page")
	public void user_should_be_redirected_to_practice_questions_of_tree_page(String exptitle) {
	
		String actualtitle=BaseClass.getTitle();
		SoftAssert softAssert=new SoftAssert();
	    System.out.println("Verify Practice Question page title in Tree.");
	    LoggerLoad.info("Verify Practice Question page title in Tree.");
	    softAssert.assertEquals( actualtitle,exptitle,"Assertaion: True");
		LoggerLoad.info("User is on "+exptitle+" page");
		System.out.println("User is redirected to "+exptitle+" page");
		
	}
	
	@Given("The user is already on Practice Questions page")
	public void the_user_is_already_on_practice_questions_page() {
		tree = new Tree_PF(BaseClass.getDriver());
		System.out.println("User is on Practice Questions page.");
		LoggerLoad.info("User is on Practice Questions page");
		tree = new Tree_PF(BaseClass.getDriver());
	}

	@When("Nothing is displayed on the page")
	public void nothing_is_displayed_on_the_page() {
		System.out.println("The practice questions page is blank.");
	}

	@Then("User go back to the {string} DS Algo home page")
	public void user_go_back_to_the_ds_algo_home_page(String string) {
		BaseClass.navigateToPage(string);
		tree = new Tree_PF(BaseClass.getDriver());
		SoftAssert softAssert=new SoftAssert();
		String title=BaseClass.getTitle();
	    System.out.println("Verify Home page title by Assertions.");
	    LoggerLoad.info("Verify Home page title by assertion.");
	    softAssert.assertEquals(title, "NumpyNinja","Inside step-User is on DS Algo Home page.");
		LoggerLoad.info("User go back to the Data Structure Home page");
		System.out.println("User is redirected to "+string+" DS Algo home page");
		LoggerLoad.info("User is redirected to "+string+" DS Algo home page");
	}



}
