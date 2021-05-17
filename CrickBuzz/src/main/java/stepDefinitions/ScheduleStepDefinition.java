package stepDefinitions;

import org.junit.Assert;
import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.SchedulePage;

public class ScheduleStepDefinition extends BaseClass {

		HomePage homepageobj;
		SchedulePage schedulepageobj;	
		
		@Given("^customer enter the cricbuzz url in browser$")
		public void customer_enter_the_cricbuzz_url_in_browser()
		{

			startup();
		    
		}

		@When("^customer clicks schedule$")
		public void customer_clicks_schedule()
		{
			homepageobj = new HomePage();

			homepageobj.clickSchedule();
			
		}

		@Then("^customer validate the schedule page$")
		public void customer_validate_the_schedule_page()
		{
			System.out.println("Schedule");
//			String scheduletitle = driver.getTitle();
//			Assert.assertEquals("Cricket Schedule - IPL 2020, International, domestic and T20 matches - Cricbuzz | Cricbuzz.com", scheduletitle);
		}

		@Then("^customer write schedule detail$")
		public void customer_write_schedule_detail() throws Exception
		{
			schedulepageobj = new SchedulePage();

			schedulepageobj.writedata();
				
		}
		
		@Then("^customer close the cricbuzz site$")
		public void customer_close_the_cricbuzz_site()
		{
			driver.quit();
		}
	}