package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/java/features/singleFeature.feature",		
				glue = "stepDefinitions"
				)
public class TestRunnerNG extends AbstractTestNGCucumberTests{

}
