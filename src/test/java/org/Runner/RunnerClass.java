package org.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\chand\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\RestAssured.feature", glue = "org.steps")
public class RunnerClass {

}
