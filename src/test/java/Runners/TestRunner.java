package Runners;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
	    features = "/src/test/resources/Features/Login.feature",
	    glue = "stepDefinitions",
	    dryRun = false,
	    plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
	    monochrome = true,
	    publish = true
	)
public class TestRunner {

}
