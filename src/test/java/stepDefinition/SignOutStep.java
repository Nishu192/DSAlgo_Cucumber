package stepDefinition;

import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import log4j.LoggerLoad;
import pagefactory.SignOut_PF;
import utilities.BaseClass;

public class SignOutStep extends BaseClass{
	SignOut_PF signout;
	
	@Given("The user is on DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Inside step-User is on DS Algo home page.");
		LoggerLoad.info("User is on the DS algo home page");
		signout=new SignOut_PF(BaseClass.getDriver());
		LoggerLoad.info("Verify title of the DS algo home page");
		Boolean verifyTitle = BaseClass.getTitle().equalsIgnoreCase("NumpyNinja");
		softAssert.assertTrue(verifyTitle);
	}

	@When("The user click the Sign out link")
	public void the_user_click_the_sign_out_link() {
		signout.clickSignOut();
		LoggerLoad.info("User clicks sign out link.");
		System.out.println("User clicks sign out link.");
	}

	@Then("The user able to see successful message {string}")
	public void the_user_able_to_see_successful_message(String string) {
		SoftAssert softAssert = new SoftAssert();
		String actualMessage=signout.getTextMessage();
		String expectedMessage="Logged out successfully";
		System.out.println("Verifying logged out message.");
		LoggerLoad.info("Verify logged out message.");
		softAssert.assertEquals(actualMessage, expectedMessage,"User logged out successfully.");
		LoggerLoad.info("User logged out successfully.");
		System.out.println("User logged out successfully.");
		
//		boolean check=signout.validateLoggedOutMessage();
//		if(check==true) {
//			System.out.println("User is able to see Logged out successfully message.");
//		}else
//			System.out.println(" Logged out successfully message is not displayed on the page.");
//			
	    
	}

	@Then("The user should able to see his Register and sign in  link on the right side of the DS Algo Introduction Page and After user logged out successfully close the browser")
	public void the_user_should_able_to_see_his_register_and_sign_in_link_on_the_right_side_of_the_ds_algo_introduction_page_and_after_user_logged_out_successfully_close_the_browser() {
	 
		SoftAssert softAssert = new SoftAssert();
		signout=new SignOut_PF(BaseClass.getDriver());
		
		System.out.println("Verifying Register link");
		LoggerLoad.info("Verify Register link.");
		boolean checkR= signout.validateRegister();
		softAssert.assertEquals(checkR, true,"User is able to see Register link.");
	   
		System.out.println("Verifying Sign in link");
		LoggerLoad.info("verify sign in link.");
		boolean checkS=signout.validateSignIn();
		softAssert.assertEquals(checkS, true,"User is able to see Sign in link.");
		System.out.println("closing the browser.");
		LoggerLoad.info("Closing the browser.");
		BaseClass.tearDown();
	}

}
