package stepDefinition;

import org.junit.Assert;


import pagefactory.Tryhere_pf;
import utilities.BaseClass;
import io.cucumber.java.en.*;
import log4j.LoggerLoad;

public class TryHereStep {

	Tryhere_pf tryhere;
	@Given("The user is in the Operations in Stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
		tryhere = new Tryhere_pf(BaseClass.getDriver());
		System.out.println("User is on Homepage");
		LoggerLoad.info("User is on the homepage.");
	}

	

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {
		tryhere = new Tryhere_pf(BaseClass.getDriver());
		tryhere.clickTryHere();
		LoggerLoad.info("User clicks on tryhere btn");
	}

	@Then("The user should be redirected to a page having an tryEditor with a {string} button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_button_to_test(String expbtn) {
		tryhere = new Tryhere_pf(BaseClass.getDriver());
		String actresult=BaseClass.getTitle();
		Assert.assertEquals(actresult,"Assessment");
		LoggerLoad.info("User is on the editor page");
	}
}
