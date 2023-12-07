package stepDefinition;


import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import log4j.LoggerLoad;
import pagefactory.Login_PF;
import utilities.BaseClass;

public class LoginStep extends BaseClass  {
		Login_PF login;

@Given("User is on login page")
public void user_is_on_login_page() {
	LoggerLoad.info("User is on login page");
	System.out.println("Inside step-User is on Login page.");
	this.login=new Login_PF(BaseClass.getDriver());
	
}

@When("User enters {string} and {string}")
public void user_enters_and(String username, String password) throws Exception {
	System.out.println("User enters Username and Password.");
	LoggerLoad.info("User enters the username and password on Login page.");
   login.enterUsername(username);
   login.enterPassword(password);
  // Thread.sleep(2000);
}

@And("Clicks login button")
public void clicks_login_button() {
	System.out.println("User clicks on the login button.");
	LoggerLoad.info("User clicks a Login button.");
   login.clickOnLogin();
}

@Then("User should be redirected to {string} home page with username")
public void user_should_be_redirected_to_home_page_with_username(String string) {
	BaseClass.openPage(string);
	String url=login.getUrlOfPage();
	SoftAssert softAssert = new SoftAssert();
	System.out.println("Verify login page url by assertion");
	LoggerLoad.info("Verify login page url.");
	softAssert.assertEquals(string,url,"User is redirected to home page successfully.");
	System.out.println("User is redirected to "+string+" page");
	LoggerLoad.info("User is redirected to "+string+" page.");
		
	System.out.println("User is on "+url+" page.");
	
	System.out.println("Verify username is displayed on home page.");
	LoggerLoad.info("Verify username on home page.");
	String uname=login.getUsernameLabelCheckUsernameIsDisplayed();
	softAssert.assertEquals(uname," Trioteamchallengers ","Username is displayed on home page successfully.");
	LoggerLoad.info("Username is displayed on home page successfully.");
 
}



}
