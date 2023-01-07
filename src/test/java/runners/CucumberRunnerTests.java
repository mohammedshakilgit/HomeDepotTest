package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "stepdefination" })

// /DIYPageClick.feature

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}
