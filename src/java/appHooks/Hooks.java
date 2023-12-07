package appHooks;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import log4j.LoggerLoad;
//import utilities.BaseClass;
import io.cucumber.java.Scenario;


public class Hooks {
 @Before
    public void startScenario() {
     System.out.println("====================START SCENARIO=====================");
     LoggerLoad.info("========================START SCENARIO==============================");
    }
 
  /*  @After
    public static void tearDown(Scenario scenario) {
 
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
         
        Helper.tearDown();
    }*/
 @After
 public void afterScenario(Scenario scenario) {
     System.out.println("====================END SCENARIO=====================");
     LoggerLoad.info("========================END SCENARIO==============================");
   //validate if scenario has failed
//     if(scenario.isFailed()) {
//         final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//         scenario.attach(screenshot, "image/png", scenario.getName()); 
//     }   

 }
 
 

}