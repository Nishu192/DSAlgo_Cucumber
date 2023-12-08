package stepDefinition;


import java.io.IOException;

//import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import log4j.LoggerLoad;
import pagefactory.TryEditor_PF;
import utilities.BaseClass;
import utilities.ExcelReaderCode;

public class TryEditorPageStep {
	TryEditor_PF tryEditor;
	//For entering Valid data in editor on tryEditor page
	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() throws IOException {
		tryEditor= new TryEditor_PF(BaseClass.getDriver());
		BaseClass.openPage("https://dsportalapp.herokuapp.com/tryEditor");
		   SoftAssert softAssert=new SoftAssert();
			String title=BaseClass.getTitle();
		    //System.out.println("Verify tryEditor page title by Assertions.");
		    //LoggerLoad.info("Verify tryEditor page title by assertion.");
		    softAssert.assertEquals(title, "Assessment","Assertion: True");
			//System.out.println("Inside step-The user is on the editor page.");
			//LoggerLoad.info("Inside step-The user is on the editor page.");
			softAssert.assertAll();
	}

	@And("enters data in the Editor after reading data from excel sheet {string} with column_name {string} and row_number {int}")
	public void enters_data_in_the_editor_after_reading_data_from_excel_sheet_with_column_name_and_row_number(String sheetname, String colname, Integer rownum) {
		ExcelReaderCode reader=new ExcelReaderCode("C:/Users/enggn/eclipse-workspace/DSAlgo_Cucumber/ExcelFile/DS_AlgoPythonCode.xlsx");
		 Boolean sheetCheck= reader.isSheetExist(sheetname);
		 System.out.println("The sheet existance status is : "+sheetCheck);
			String testData=reader.getCellData(sheetname, colname, rownum);
			System.out.println(testData);
			tryEditor.enterValidCode(testData);
			//tryEditor.enterValidCode("print(10);");
		  LoggerLoad.info("enters the data into editor after reading data from excel sheet "+sheetname+" with column "+colname+" and row "+rownum);
			
		
	}

	@When("User clicks a run button")
	public void user_clicks_a_run_button() {
		//System.out.println("User clicks run button");
		//LoggerLoad.info("User clicks run button.");
	    tryEditor.clickRun();
	}

	@Then("output should be displayed on the console")
	public void output_should_be_displayed_on_the_console() {
		 System.out.println("Console screen containing output is displayed.");
		 LoggerLoad.info("Console screen containing output is displayed.");
		 tryEditor.getConsoleOutput();
		// tryEditor.clearEditor();
	}
//=======================================================================================================================================================	
	//For Blank editor on tryEditor page
	
	@Given("The user is on tryEditor page")
	public void the_user_is_on_try_editor_page() {
		tryEditor= new TryEditor_PF(BaseClass.getDriver());
		   BaseClass.openPage("https://dsportalapp.herokuapp.com/tryEditor");
		 //BaseClass.gotoTryEditorPage();
		   SoftAssert softAssert=new SoftAssert();
			String title=BaseClass.getTitle();
		    //System.out.println("Verify tryEditor page title by Assertions.");
		   // LoggerLoad.info("Verify tryEditor page title by assertion.");
		    softAssert.assertEquals(title, "Assessment","Assertion: True");
			//System.out.println("Inside step-The user is on the editor page.");
			//LoggerLoad.info("Inside step-The user is on the editor page.");
			softAssert.assertAll();
	}

	@When("The user clicks the run button without entring the code in the Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
		System.out.println("User did not enter any code and clicks run button.");
		LoggerLoad.info("User did not enter any code and clicks run button.");
		tryEditor.blankEditor();
		tryEditor.clickRun();
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
		System.out.println("No error message is displayed on the page.Raise as a BUG."); //BUG
		LoggerLoad.error("Page is blank and not showing any error message.");
	}
//======================================================================================================================================================
	//For entering Invalid data in editor on tryEditor page
	
	@Given("User is on the tryEditor page")
	public void user_is_on_the_try_editor_page() {
		LoggerLoad.info("The user is on the same tryEditor page.");
		System.out.println("Inside step-The user is on the same TryEditor page.");
		tryEditor= new TryEditor_PF(BaseClass.getDriver());
	}

	@And("enters the data in the Editor after reading data from excel sheet {string} with column_name {string} and row_number {int}")
	public void enters_the_data_in_the_editor_after_reading_data_from_excel_sheet_with_column_name_and_row_number(String sheetname, String colname, Integer rownum) {
		ExcelReaderCode reader=new ExcelReaderCode("C:/Users/enggn/eclipse-workspace/DSAlgo_Cucumber/ExcelFile/DS_AlgoPythonCode.xlsx");
		 Boolean sheetCheck= reader.isSheetExist(sheetname);
		 System.out.println("The sheet existance status is : "+sheetCheck);
			String testData=reader.getCellData(sheetname, colname, rownum);
			System.out.println(testData);
			tryEditor.enterInvalidCode(testData);
			//tryEditor.enterInvalidCode("print(10;");
			LoggerLoad.info("Entering input code in editor.");
	}

	@When("The User clicks a run button")
	public void the_user_clicks_a_run_button() {
		//System.out.println("User clicks run button");
		//LoggerLoad.info("Clicks run button.");
	    tryEditor.clickRun();
	}

	@Then("The user see error msg in alert window and press ok button")
	public void the_user_see_error_msg_in_alert_window() {
		LoggerLoad.error("invalid input Error.");
		SoftAssert softAssert=new SoftAssert();
		String actualmsg=tryEditor.getErrorMessage();
		softAssert.assertTrue(actualmsg.contains("NameError"));
		tryEditor.acceptAlertMsg();
	    tryEditor.blankEditor();
		
	}


	@Given("The user is already on tryEditor page")
	public void the_user_is_already_on_try_editor_page() {
		System.out.println("The user is already on tryEditor page"); 
		LoggerLoad.info("User is on tryEditor page.");
		tryEditor= new TryEditor_PF(BaseClass.getDriver());
		BaseClass.openPage("https://dsportalapp.herokuapp.com/tryEditor");
		// BaseClass.gotoTryEditorPage();
	}

	@When("User able to see output in console")
	public void user_able_to_see_output_in_console() {
		System.out.println("Console screen containing output is displayed.");  
		LoggerLoad.info("Console screen containing output is displayed.");  
	}

	@Then("User go back to the previous page")
	public void user_go_back_to_the_previous_page() {
		System.out.println("Console screen containing output is displayed and user go to the previous page."); 
LoggerLoad.info("Output is displayed on the console.");
		BaseClass.NavBack();
	}
	


}
