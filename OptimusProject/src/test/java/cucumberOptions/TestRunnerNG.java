package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/java/features/product.feature",		
				glue = "stepDefinitions"
				)
public class TestRunnerNG extends AbstractTestNGCucumberTests{

}
