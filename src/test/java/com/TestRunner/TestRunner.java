package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Cucufeaturefolder\\NorwegianAirShuttle.feature", glue = "com.StepDefinitionclass", dryRun = false, plugin = "html:target")
public class TestRunner {

}
