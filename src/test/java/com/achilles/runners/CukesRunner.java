package com.achilles.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"
                },
        features = "src/test/resources/features",
        glue = "com/achilles/step_definitions",
        dryRun = false,
        tags = "@Añadircontrato"
)
public class CukesRunner {
}
