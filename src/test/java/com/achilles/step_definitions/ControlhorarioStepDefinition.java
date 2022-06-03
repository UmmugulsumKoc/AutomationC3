package com.achilles.step_definitions;

import com.achilles.pages.Controlhorario;
import com.achilles.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ControlhorarioStepDefinition {

    Controlhorario manual= new Controlhorario();

    @Given("entra en la ciente y elegi el cliente Cemex")
    public void entra_en_la_ciente_y_elegi_el_cliente_Cemex() throws InterruptedException {

        manual.Selectcliente.click();
        Thread.sleep(2000);
        manual.Cemex.click();


    }

    @When("hacer clic en control de horarios en la barra izquierda")
    public void hacer_clic_en_control_de_horarios_en_la_barra_izquierda() throws InterruptedException {
        Thread.sleep(2000);

        BrowserUtils.scrollToElement(manual.horariomanual);
        manual.horariomanual.click();
        Thread.sleep(2000);

    }

    @When("hacer clic en control manual")
    public void hacer_clic_en_control_manual() {
        manual.controlmanual.click();

    }

    @When("hacer clic en el desplegable centro de trabajo")
    public void hacer_clic_en_el_desplegable_centro_de_trabajo() {
        manual.trabajador.click();


    }

    @When("y selecciona uno")
    public void y_selecciona_uno() throws InterruptedException {
        Thread.sleep(2000);
        manual.resorce.click();

    }

    @Then("hace clic en el boton buscar")
    public void hace_clic_en_el_boton_buscar() throws InterruptedException {
        manual.buscar.click();
        Thread.sleep(2000);

    }






}
