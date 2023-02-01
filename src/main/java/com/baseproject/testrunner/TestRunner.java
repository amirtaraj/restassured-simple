package com.baseproject.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"com/baseproject/stepdefinitons"},
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        },
        tags = "@smoke"
)

public class TestRunner {
}
