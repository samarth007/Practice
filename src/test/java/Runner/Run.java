package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(features="src/test/java/feature/file1.feature", glue="StepDef")

public class Run {

	

}
