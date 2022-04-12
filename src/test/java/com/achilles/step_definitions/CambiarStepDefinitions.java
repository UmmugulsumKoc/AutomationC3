package com.achilles.step_definitions;

import com.achilles.pages.Cambiar;
import com.achilles.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.stream.Collectors;

public class CambiarStepDefinitions {
    Cambiar cambiar = new Cambiar();


    @Given("entro en la pagina Controlar")
    public void entro_en_la_pagina_Controlar() {
        cambiar.Cambiarrol();


    }

    @Given("hago click en el boton de roles")
    public void hago_click_en_el_boton_de_supplier() throws InterruptedException {

        cambiar.achilles.click();
        Thread.sleep(7000);


    }


    @When("se abre el menu de roles y elegi el rol supplier")
    public void se_abre_el_menu_de_roles_y_elegi_el_rol_supplier() throws InterruptedException {

        cambiar.Supplier.click();
        Thread.sleep(2000);

    }

    @When("con el mover el raton ir al menu y elegi operator")
    public void con_el_mover_el_raton_ir_al_menu_y_elegi_operator() {
        cambiar.achilles.click();
        cambiar.Operator.click();

    }

    @Then("yo veo que puedo cambiar los roles")
    public void yo_veo_que_puedo_cambiar_los_roles() throws InterruptedException {
        Thread.sleep(2000);
        cambiar.achilles.click();
        cambiar.Achilles.click();

    }




    @When("hago clic en el boton de buyers")
    public void hago_clic_en_el_boton_de_buyers() {
        cambiar.Selectcliente.click();


    }

    @Then("se abre la opcion de buyers y elegi {string}")
    public void se_abre_la_opcion_de_buyers_y_elegi(String string) throws InterruptedException {
        cambiar.Acerinox.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.Berge.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.Cemex.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.CIMSA.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.FreseniusMC.click();
        Thread.sleep(2000);
        cambiar.Selectcliente.click();

        cambiar.MetroMalaga.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.Naturgy.click();
        Thread.sleep(2000);
        cambiar.Selectcliente.click();

        cambiar.Brazil.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.Chile.click();
        Thread.sleep(2000);
        cambiar.Selectcliente.click();

        cambiar.Mexico.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.Panama.click();
        Thread.sleep(2000);
        cambiar.Selectcliente.click();

        cambiar.Dominica.click();
        Thread.sleep(7000);
        cambiar.Selectcliente.click();

        cambiar.TMB.click();


    }







    @Given("estoy en el dropdown menu")
    public void estoy_en_el_dropdown_menu() {
        //Driver.getDriver().findElements(By.xpath("//img[@class='selected-image']"));
        cambiar.Selectcliente.click();
    }

    @Then("se visualiza todos clientes en el dropdown")
    public void se_visualiza_todos_clientes_en_el_dropdown(List<String>clientes) {
        Select select=new Select(cambiar.Selectcliente);
        List<WebElement> listOfWebElement= select.getOptions();
        List<String>actualclientes=listOfWebElement.stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertEquals("size did not match.",clientes.size(),actualclientes.size());
         for (int i = 0; i <= clientes.size()-1; i++) {
             Assert.assertEquals("los clientes", clientes.get(i),actualclientes);
         }
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }



}