package com.achilles.step_definitions;

import com.achilles.pages.Añadir;
import com.achilles.utilities.BrowserUtils;
import com.achilles.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;


public class AñadirStepDefinitions {
    Añadir añadir = new Añadir();


    @Given("entro en la Contratos en la izquierda")
    public void ento_en_la_Contratos_en_la_izquierda() throws InterruptedException {


        añadir.contratos.click();
        Thread.sleep(3000);


    }

    @When("abre menu y elegi Gestión de contratos")
    public void abre_menu_y_elegi_Gestión_de_contratos() throws InterruptedException {
        añadir.gestión.click();
        Thread.sleep(2000);

    }

    @And("hago clic en el boton Añadir")
    public void hago_clic_en_el_boton_Añadir() throws InterruptedException {
        añadir.añadircontrat.click();
        Thread.sleep(2000);

    }

    @And("relleno el numero de contrato {string}")
    public void relleno_el_numero_de_contrato(String string) throws InterruptedException {
        añadir.numerocontrato.sendKeys("000020222203");
        Thread.sleep(2000);
    }

    @And("relleno Descripción {string}")
    public void relleno_Descripción(String string) throws InterruptedException {
        añadir.descripcion.sendKeys("test");
        Thread.sleep(2000);

    }

    @And("selecciona una contratista")
    public void selecciona_una_contratista() throws InterruptedException {
        añadir.contratista.click();
        añadir.suaz.click();
        Thread.sleep(7000);

    }

    @And("selecciona una centro de trabajo")
    public void selecciona_una_centro_de_trabajo() throws InterruptedException {
        añadir.negocio.click();
        añadir.cemento.click();
        Thread.sleep(2000);

    }

    @And("selecciona una departamento")
    public void selecciona_una_departamento() throws InterruptedException {
        añadir.region.click();
        añadir.aragon.click();
        Thread.sleep(7000);

    }

    @And("selecciona un perfil")
    public void selecciona_un_perfil() throws InterruptedException {
        añadir.centro.click();
        añadir.añadirPerfil().selectByVisibleText("Perfil B Bioenergía");
        Thread.sleep(2000);

    }

    @And("hago clic a Añadir Responsable")
    public void hago_clic_a_Añadir_Responsable() throws InterruptedException {
        BrowserUtils.scrollToElement(añadir.responsable);
        Thread.sleep(2000);
        añadir.responsable.click();

    }

    @And("se abre la pantalla de responsable y hago clic a seleccione")
    public void se_abre_la_pantalla_de_responsable_y_hago_clic_a_seleccione() throws InterruptedException {
        Thread.sleep(7000);
        añadir.selectid.click();
        añadir.selectResponsable().selectByVisibleText(". CARLOS GARCIA GARCIA (carlos.garcia@cepsa.com)");


    }


    @And("selecciona una responsable y hago clic en el boton")
    public void selecciona_una_responsable_y_hago_clic_en_el_boton() {
        añadir.botonResponsable.click();

    }

    @And("hago clic a Nueva Personas de contacto")
    public void hago_clic_a_Nueva_Personas_de_contacto() throws InterruptedException {
        añadir.contactPersonId.click();
        Thread.sleep(2000);

    }

    @And("creo una nueva Persona de contacto")
    public void creo_una_nueva_Persona_de_contacto() throws InterruptedException {
        //(Map<String, String> informations) {
        //añadir.inputCorreo.sendKeys(informations.get("Correo electronico"));
        añadir.person.click();
        añadir.option1.click();
        añadir.selectPerson.click();
        Thread.sleep(2000);


    }

    @And("hago clic a boton de Guardar")
    public void hago_clic_a_boton_de_Guardar() throws InterruptedException {
        añadir.btnGuardar.submit();
        Thread.sleep(7000);

    }

    @And("tengo la palabra {string}")
    public void tengo_la_palabra(String string) {

    }

    @And("valido el contrato con el boton validar")
    public void valido_el_contrato_con_el_boton_validar() {
        añadir.validar.click();

    }

    @Then("el estado de contrado esta validada")
    public void el_estado_de_contrado_esta_validada() {


    }
}