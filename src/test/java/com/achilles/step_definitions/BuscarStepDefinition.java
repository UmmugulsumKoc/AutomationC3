package com.achilles.step_definitions;

import com.achilles.pages.Añadir;
import com.achilles.pages.Buscar;
import com.achilles.pages.Cambiar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscarStepDefinition {

    Buscar buscar = new Buscar();

    Cambiar cambiar = new Cambiar();


    @Given("entre en una cliente")
    public void entre_en_una_cliente() throws InterruptedException {

        cambiar.Selectcliente.click();
        cambiar.Acerinox.click();
        Thread.sleep(7000);

    }

    @When("hace clic a Buscar en la barra izquierda")
    public void hace_clic_a_Buscar_en_la_barra_izquierda() throws InterruptedException {

        buscar.btnbuscar.click();


    }

    @When("hace clic Que esta buscando")
    public void hace_clic_Que_esta_buscando() {
        buscar.Queestasbuscando.click();

    }

    @When("elegi proveedor")
    public void elegi_proveedor() {

    }

    @Then("ir al boton buscar")
    public void ir_al_boton_buscar() {

    }






}
