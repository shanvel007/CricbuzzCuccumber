package stepDefinitions;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LiveScorePage;
import pages.NewZealandMatchPage;

public class LiveStepDifinition extends BaseClass{

		HomePage homepageobj;
		NewZealandMatchPage seriespageobj;
		LiveScorePage livescorepageobj;
		

		@Given("^stakeholder get into the cricbuzz page$")
		public void stakeholder_get_into_the_cricbuzz_page() 
		{
			startup();

		}

		@When("^stakeholder press the livescore module$")
		public void stakeholder_press_the_livescore_module()
		{
			homepageobj = new HomePage();

			homepageobj.clickLiveScore();
						
			
		 }

		@Then("^stakeholder validate the livescore page$")
		public void stakeholder_validate_the_livescore_page()
		{
		
		//	String livescorepagetitle = driver.getTitle();
		//	Assert.assertEquals("Cricket scorecard - PAK vs ZIM, 3rd T20I, Zimbabwe tour of Pakistan, 2020 | Cricbuzz.com", livescorepagetitle);
		}

		@Then("^stakeholder take the scorecard details$")
		public void stakeholder_take_the_scorecard_details() throws Exception
		{
		
			livescorepageobj = new LiveScorePage();
			
			livescorepageobj.writeScore();
			
		}
		
		@Then("^stakeholder leaves from cricbuzz$")
		public void stakeholder_leaves_from_cricbuzz()
		{
			driver.quit();
		}

	}

