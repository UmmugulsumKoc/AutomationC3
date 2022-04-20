package com.achilles.step_definitions;


import com.achilles.utilities.BrowserUtils;
import com.achilles.utilities.Driver;
import gherkin.ast.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        //Driver.closeDriver();
    }


    @Before
    public void setUpdb() {

    }

    public void setUpScenario() {
        System.out.println("----Setting up browser with further details..");
    }


    @After
    public void closeDb() {
        System.out.println();


        //public void tearDownScenario(Scenario scenario){
        //   if (scenario.isFailed()) {

        //     final byte[] screenShot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //     scenario.attach(screenShot, "image/png"), scenario.getName());
        //  }

        BrowserUtils.waitFor(1);
        Driver.closeDriver();
    }

}