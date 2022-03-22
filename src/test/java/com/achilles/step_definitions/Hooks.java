package com.achilles.step_definitions;


import com.achilles.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

   @Before
    public void setUp(){
       Driver.get().manage().window().maximize();
       Driver.get().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
   }
   @After
    public void tearDown() {
       //Driver.closeDriver();
   }
    @Before()
    public void setUpdb(){

       }
    @After()
    public void closeDb(){
        System.out.println();
   }
}
