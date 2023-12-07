package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; 
import io.cucumber.testng.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefinition","appHooks"},
tags= "not @NotrunReg ",

plugin={"pretty","html:target/HtmlReport/report.html",
		"json:target/JSONReport/report.json",
		"junit:target/JUnitReport/report.xml",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
