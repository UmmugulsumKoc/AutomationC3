package com.achilles.step_definitions;

import com.achilles.pages.Filtrar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FiltrarStepDefinitions {
Filtrar validation= new Filtrar();

    @Given("hago clic en Validación")
    public void hago_clic_en_Validación() throws InterruptedException {
        Thread.sleep(2000);
        validation.validar.click();
    }

    @When("elegi Validar documentos")
    public void elegi_Validar_documentos() {

    }

    @And("hago clic en Mostrar filtros")
    public void hago_clic_en_Mostrar_filtros() {

    }

    @And("cambio Tipo a Trabajador")
    public void cambio_Tipo_a_Trabajador() {

    }

    @And("hago clic en el boton Buscar")
    public void hago_clic_en_el_boton_Buscar() {


    }
    @Then("tengo la resultado")
    public void tengo_la_resultado() {

    }

}
