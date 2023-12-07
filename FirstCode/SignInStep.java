package stepDefinition;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

//import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import log4j.LoggerLoad;
import pagefactory.SignIn_PF;
import utilities.BaseClass;

public class SignInStep extends BaseClass{
	SignIn_PF signin;
	
	
	@Given("User is on {string} home page")
	public void user_is_on_home_page(String expectedTitle) throws IOException{
		BaseClass.setUp();
		signin=new SignIn_PF(BaseClass.getDriver());
		BaseClass.openPage(expectedTitle);
		SoftAssert softAssert=new SoftAssert();
		String acualTitle=BaseClass.getTitle();
	    System.out.println("Verify Home page title by Assertions.");
	    LoggerLoad.info("Verify Home page title by assertion.");
	    softAssert.assertEquals(acualTitle, "NumpyNinja");
		LoggerLoad.info("User is on the"+expectedTitle+" Data Structure Home page");
		System.out.println("Inside step-User is on DS Algo Home page.");
	}

	@When("User clicks sign in button")
	public void user_clicks_sign_in_button() {
		LoggerLoad.info("User clicks on the Sign in button.");
		System.out.println("Inside step-User clicks on sign in button.");
		signin.Click_On_Sign_in();
	    
		
	}

	@Then("User should be redirected to {string} login page")
	public void user_should_be_redirected_to_login_page(String expectedUrl) {
	    System.out.println("Inside step-User is redirected to login page");
	    BaseClass.openPage(expectedUrl);
	    String actualurl=signin.pageUrl();
	    SoftAssert softAssert=new SoftAssert();
	    System.out.println("Verify login page url.");
	    LoggerLoad.info("Verify login page title by assertion.");
	    softAssert.assertEquals(actualurl, expectedUrl,"login url is verified.");
	       	
	    	LoggerLoad.info("User is redirected to "+expectedUrl+" page");
		
	}

}
