package com.fed.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.fed.stepDefinitions",
        tags = "@TC_1",
        plugin = {"pretty", "html:target/cucumber.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
