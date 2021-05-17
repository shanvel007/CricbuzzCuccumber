package stepDefinitions;

import java.util.concurrent.TimeUnit;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.NewZealandMatchPage;

public class NewZealandStepDefinition extends BaseClass {

		HomePage homepageobj;
		NewZealandMatchPage NewZealandMatchPageobj;
		
		
		@Given("^client step into the cricbuzz webpage$")
		public void client_step_into_the_cricbuzz_webpage() throws Throwable 
		{
			startup();
			
		}

		@When("^client hit the Newzealand team details$")
		public void client_hit_the_Newzealand_team_details() throws Throwable 
		{
			homepageobj = new HomePage();
			homepageobj.clickNewZealandResults();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		}


		@Then("^client fetch the Newzealand team match detail$")
		public void client_fetch_the_Newzealand_team_match_detail() throws Throwable 
		{
			NewZealandMatchPageobj = new NewZealandMatchPage();
			
			NewZealandMatchPageobj.writeNewZealandMatchDetail();
			
		}

		@Then("^client exit from cricbuzz$")
		public void client_exit_from_cricbuzz() throws Throwable 
		{
		
			driver.quit();
			
		}


		
		
	}

