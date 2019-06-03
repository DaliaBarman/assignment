package net.anz.ui.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/Dalia/SelJava/automationAssignment/src/test/resources/net/anz/ui/feature/anz.feature",
		glue= {"net/anz/ui/stepDefinitions"},
		format= {"pretty","html:test-output"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
		
public class TestRunner {

}
