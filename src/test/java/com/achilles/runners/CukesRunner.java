package com.achilles.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features/Login.feature",
        glue = "com/achilles/step_definitions",
        dryRun = false,
        tags = "@Login"
)
public class CukesRunner {
}
