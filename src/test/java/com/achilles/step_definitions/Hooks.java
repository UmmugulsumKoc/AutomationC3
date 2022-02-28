package com.achilles.step_definitions;


import com.achilles.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

   @Before
    public void setUp(){
       System.out.println("");
   }
   @After
    public void tearDown() {
       Driver.closeDriver();
   }
    @Before("@db")
    public void setUpdb(){

       }
    @After("@db")
    public void closeDb(){
        System.out.println();
   }
}
