package runnerClass;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


	@CucumberOptions(
			features = "C:\\Users\\Sadik\\Desktop\\Projects\\CrickBuzz\\src\\main\\java\\features\\Scenario4.feature",
			glue={"stepDefinitions"},
			format= {"pretty","html:test-outout"}, 
//			tags = {"@LiveScoreTest"},
//			plugin = {"pretty","html:test-outout"},
			monochrome = true,
			dryRun = false //to check the mapping is proper between feature file and step def file
			)
public class TestRunner4 {

}
