package stepDefinition;

import java.io.ByteArrayInputStream;
//import java.io.ByteArrayInputStream;
import java.io.File;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
//import org.testng.reporters.Files;

import com.google.common.io.Files;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pagefactory.DSTryhere_PF;
import pagefactory.DataStructureIntro_PF;
import pagefactory.HomePage_PF;
import utilities.BaseClass;
import log4j.LoggerLoad;

public class ds_AlgoDataStructInt extends BaseClass{

	HomePage_PF hp;
	 DataStructureIntro_PF dp;
	 DSTryhere_PF thp;
	 Scenario scn;
	 
//	 @After
//	    public void tearDown(Scenario scenario) {
//	        System.out.println("Scenario status ======>"+scenario.getStatus());
//	        if(scenario.isFailed()) {
//	        	
//	        	TakesScreenshot ts=(TakesScreenshot) BaseClass.getDriver();
//	        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//	        	scenario.attach(screenshot, "image/png",scenario.getName());
//	        	            
//	        }
//	        getDriver().quit();
//	    }

	
	@When("The user clicks  Get Started button below the Data structures-Introduction")
	public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
		hp=new HomePage_PF(BaseClass.getDriver());
		dp=new  DataStructureIntro_PF(BaseClass.getDriver());
		dp.clickDataStructGetstarted();
		LoggerLoad.info("User clicks  Get Started button of DS");
	}

	@Then("The user should land in {string} DS page")
	public void the_user_should_land_in_ds_page(String ExpT) {
	   String tl= dp.getMsgDataStrctIntroTitle();
	   Assert.assertEquals(tl, ExpT);
	   LoggerLoad.info("User is on the DS page");
	}
	@Given("The user is on the Data Structure Introduction Page")
	public void the_user_is_on_the_data_structure_introduction_page() {
		dp=new  DataStructureIntro_PF(BaseClass.getDriver());
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
	    dp.ClickDStimeComplexity();
	    LoggerLoad.info("User clicks Time Complexity link");
	}

	@Then("The user should be redirected to {string} TC page")
	public void the_user_should_be_redirected_to_tc_page(String ExpT) {
		  String tl= dp.getMsgTimeComplexity();
	    Assert.assertEquals(tl, ExpT);
	    LoggerLoad.info("User is on  Time Complexity page");
	}

@Given("The user is on the Time Complexity Page")
public void the_user_is_on_the_time_complexity_page2() {
	thp=new DSTryhere_PF(BaseClass.getDriver());
}

@When("The user clicks Try Here  button of Time Complexity page")
public void the_user_clicks_try_here_button_of_time_complexity_page() {
	thp.clickTryhere();
	LoggerLoad.info("User clicks Try Here  button of Time Complexity page");
}
@When("The user clicks Practice Questions link of DS")
public void the_user_clicks_practice_questions_link_of_ds()  {
	  dp=new  DataStructureIntro_PF(BaseClass.getDriver());
   dp.clickPracticeQuestions();
   LoggerLoad.info("User clicks Practice Questions link of DS");
}

@Then("The user does not find any practice problems and the page is null")
public void the_user_does_not_find_any_practice_problems_and_the_page_is_null() {
  
   System.out.println("The user sees blank page without any Questions that is the BUG");

	 Assert.assertEquals(false, true);
//	 System.out.println("Scenario status ======>"+scn.getStatus());
//     if(scn.isFailed()) {
//     	
//     	TakesScreenshot ts=(TakesScreenshot) BaseClass.getDriver();
//     	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
//     	scn.attach(screenshot, "image/png",scn.getName());
//     	            
//     }
//     BaseClass.tearDown();
	BaseClass.navigateToPage("https://dsportalapp.herokuapp.com/home");


		 //String screenshotName=com.aventstack.extentreports.gherkin.model.Scenario.getGherkinName().replace(" ","_");
		 
//	 try {
//		 Assert.assertEquals(false, true);
//
//		if(scn.isFailed()) {
//			
//			byte[] screenshot=((TakesScreenshot)BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
//			scn.attach(screenshot,"img/png",screenshotName);
//	}
//	 } catch (Exception e) {
//	e.setStackTrace(null);
//		}
//   
	// BaseClass.navigateToPage("https://dsportalapp.herokuapp.com/home");
  	
   LoggerLoad.error("user does not find any practice problems");
}

	  @Then("The user should be redirected to a page having an Python Editor")
	  public void the_user_should_be_redirected_to_a_page_having_an_python_editor() {
	      String ul=BaseClass.getCurrentUrl();
	      System.out.println("current url : "+ul);
	      LoggerLoad.info("User is on the Python Editor");
	  }


}
