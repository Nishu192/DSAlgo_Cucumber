package stepDefinition;

import io.cucumber.java.en.Given;
import log4j.LoggerLoad;

public class BackgroundCode {
	@Given("The Trio Team Challengers starts testing the Data Structure Algo portal.")
	public void the_trio_team_challengers_starts_testing_the_data_structure_algo_portal() {
		LoggerLoad.info("+++++++++++++++++++ Trio Challengers starts testing the Data Structure Algo portal ++++++++++++++++++++++++++++++++++++");
	   System.out.println("********************* Trio Challengers starts testing the Data Structure Algo portal ********************************");
	}

}

