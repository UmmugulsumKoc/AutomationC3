package com.achilles.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                //"html:target/default-cucumber-reports.html",
                "rerun:target/rerun.txt"
                },
        features = "src/test/resources/features",
        glue = "com/achilles/step_definitions",
        dryRun = false,
        tags = "@Login"
)
public class CukesRunner {
}
