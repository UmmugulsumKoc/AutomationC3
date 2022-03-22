package com.achilles.step_definitions;

import com.achilles.pages.Cambiar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CambiarStepDefinitions {
Cambiar cambiar= new Cambiar();
    @Then("entro en la pagina Controlar")
    public void entro_en_la_pagina_Controlar() {
        cambiar.Cambiarrol();

    }

    @When("hago click en el boton de supplier")
    public void hago_click_en_el_boton_de_supplier() throws InterruptedException {

     cambiar.elegirol();
     Thread.sleep(7000);
        //cambiar.achilles.click();
        //Assert.assertEquals(string,new Cambiar().elegirol());
      //cambiar.rols.click();
    }

    @Then("yo veo los opciones y elegi uno}")
    public void yo_veo_los_opciones_y_elegi(List<String> menuOptions) {
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);


    }

}
