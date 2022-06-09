package com.achilles.step_definitions;

import com.achilles.pages.Añadir;
import com.achilles.pages.Buscar;
import com.achilles.pages.Cambiar;
import com.achilles.pages.Clientecontrat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscarStepDefinition {

    Buscar buscar = new Buscar();

    Cambiar cambiar = new Cambiar();

    Clientecontrat client = new Clientecontrat();


    @Given("entre en una cliente {string}")
    public void entre_en_una_cliente(String string) throws InterruptedException {

        client.ClientId= string;

        client.Selectcliente.click();
        Thread.sleep(2000);
        client.selectcliente(string).click();
        Thread.sleep(2000);
        //cambiar.Selectcliente.click();
        //cambiar.Acerinox.click();
        //Thread.sleep(7000);

    }

    @When("hace clic a Buscar en la barra izquierda")
    public void hace_clic_a_Buscar_en_la_barra_izquierda() throws InterruptedException {

        buscar.btnbuscar.click();


    }

    @And("hace clic Que esta buscando")
    public void hace_clic_Que_esta_buscando() throws InterruptedException {
        buscar.Queestasbuscando.click();
        Thread.sleep(2000);

    }

    @And("elegi proveedor")
    public void elegi_proveedor() throws InterruptedException {
        buscar.proveedor.click();
        Thread.sleep(2000);

    }

    @And("ir al boton buscar")
    public void ir_al_boton_buscar() throws InterruptedException {
        buscar.bscrbtn.click();
        Thread.sleep(2000);

    }


    @And("ir al boton cambiar filtro")
    public void ir_al_boton_cambiar_filtro() throws InterruptedException {
        buscar.cambiarfiltro.click();
        Thread.sleep(2000);

    }

    @And("ir a Que esta buscando y cambia a Contrato")
    public void ir_a_Que_esta_buscando_y_cambia_a_Contrato() throws InterruptedException {
        buscar.Queestasbuscando.click();
        buscar.contrato.click();
        Thread.sleep(2000);
        buscar.bscrbtn.click();

        buscar.cambiarfiltro.click();


    }

    @And("ir a Que esta buscando y cambia a Trabajador")
    public void ir_a_Que_esta_buscando_y_cambia_a_Trabajador() throws InterruptedException {
        buscar.Queestasbuscando.click();
        buscar.trabajador.click();
        Thread.sleep(2000);
        buscar.bscrbtn.click();

        buscar.cambiarfiltro.click();

    }

    @And("ir a Que esta buscando y cambia a Vehiculo")
    public void ir_a_Que_esta_buscando_y_cambia_a_Vehiculo() throws InterruptedException {
        buscar.Queestasbuscando.click();
        buscar.vehiculo.click();
        Thread.sleep(2000);
        buscar.bscrbtn.click();

        buscar.cambiarfiltro.click();

    }

    @Then("ir a Que esta buscando y cambia a Maquinaria")
    public void ir_a_Que_esta_buscando_y_cambia_a_Maquinaria() throws InterruptedException {
        buscar.Queestasbuscando.click();
        buscar.maquinaria.click();
        buscar.bscrbtn.click();
        Thread.sleep(2000);
        buscar.cambiarfiltro.click();

    }







}
