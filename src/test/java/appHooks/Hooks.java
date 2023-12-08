package appHooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import log4j.LoggerLoad;
import utilities.BaseClass;
//import utilities.BaseClass;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;


public class Hooks {
	
	Scenario scn;
 @Before
    public void startScenario() {
     System.out.println("====================START SCENARIO=====================");
     LoggerLoad.info("========================START SCENARIO==============================");
    }
// 
//    @After
//    public static void tearDown(Scenario scenario) {
// 
//        if(scenario.isFailed()) {
//            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName()); 
//        }   
//         
//        Helper.tearDown();
   // }
 
 

 
 @After
 public void tearDown(Scenario scenario) {
     System.out.println("Scenario status ======>"+scenario.getStatus());
     if(scenario.isFailed()) {
     	
     	TakesScreenshot ts=(TakesScreenshot) BaseClass.getDriver();
     	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
     	scenario.attach(screenshot, "image/png",scenario.getName());
     	            
     }
   
 }



 public void afterScenario(Scenario scenario) {
     System.out.println("====================END SCENARIO=====================");
     LoggerLoad.info("========================END SCENARIO==============================");
//   String screenshotName=com.aventstack.extentreports.gherkin.model.Scenario.getGherkinName().replace(" ","_");
//	 
//	 try {
//		
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
 
 }
 
 

}