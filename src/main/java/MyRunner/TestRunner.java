package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/Users/NaveenKhunteta/Documents/workspace/FreeCrmBDDFramework/src/main/java/Features/login.feature",
			glue={"stepDefinitions"},
			format= {"pretty","html:test-outout"}
			)
	 
	public class TestRunner {
	 
	}
	
	
	
	

