package com.achilles.step_definitions;

import com.achilles.pages.Añadir;
import com.achilles.pages.Controlacceso;
import com.achilles.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ControlaccesoStepDefinitions {

    Controlacceso carnet = new Controlacceso();

    @Given("entro en el cliente y cambiarlo a Cemsa")
    public void entro_en_el_cliente_y_cambiarlo_a_Cemsa() {
        carnet.Selectcliente.click();
        carnet.Cemex.click();




    }

    @When("en la izquierda hacer clic a Control de acceso")
    public void en_la_izquierda_hacer_clic_a_Control_de_acceso() throws InterruptedException {

        BrowserUtils.scrollToElement(carnet.Control);
        carnet.Control.click();
        Thread.sleep(2000);


    }

    @And("hacer clic en el boton de Control acceso")
    public void hacer_clic_en_el_boton_de_Control_acceso() throws InterruptedException {

        Thread.sleep(7000);

        BrowserUtils.scrollToElement(carnet.controlbtn);
        carnet.controlbtn.click();


        //Thread.sleep(2000);

    }

    @And("hacer clic por seleccionar un recurso")
    public void hacer_clic_por_seleccionar_un_recurso() throws InterruptedException {

        carnet.recurso.click();
        carnet.vehiculo.click();

        //Thread.sleep(2000);

    }

    @And("selecciona de recurso Vehiculo y hacer clic en el boton Buscar")
    public void selecciona_de_recurso_Vehiculo_y_hacer_clic_en_el_boton_Buscar() {
        carnet.buscar.click();

    }

    @And("selecciona un recurso y hacer click en el boton Carnet")
    public void selecciona_un_recurso_y_hacer_click_en_el_boton_Carnet() {

        carnet.vehiculocarnet.click();
        carnet.btnbuscar.click();
    }

    @And("hacer clic en el boton Imprimir")
    public void hacer_clic_en_el_boton_Imprimir() {

         carnet.imprimir.click();


    }

    @Then("se visualiza el carnet")
    public void se_visualiza_el_carnet() {

    }





}
