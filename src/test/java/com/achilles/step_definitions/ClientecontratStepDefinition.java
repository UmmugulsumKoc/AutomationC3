package com.achilles.step_definitions;

import com.achilles.pages.Clientecontrat;
import com.achilles.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClientecontratStepDefinition {
      Clientecontrat client = new Clientecontrat();


    @Given("accedo a cliente y cambiarlo")
    public void accedo_a_cliente_y_cambiarlo()throws InterruptedException {

        client.Selectcliente.click();
        Thread.sleep(2000);
        client.Acerinox.click();


    }
    @When("relleno el numero de contrato para Acerinox {string}")
    public void relleno_el_numero_de_contrato_para_Acerinox(String string) throws InterruptedException {

        client.Acerinoxcontrato.sendKeys("000020223003K");
        Thread.sleep(2000);
        //client.numero.click();

    }

    @And("relleno por el Descripcion {string}")
    public void relleno_por_el_Descripcion(String string) throws InterruptedException {
        client.descripcionA.sendKeys("test1");
        Thread.sleep(2000);



    }
    @And("ir al contratista y selecciona una")
    public void ir_al_contratista_y_selecciona_una() {
        client.contratistaA.click();
        client.acilles.click();



    }

    @And("hago clic en el perfil y selleciona una")
    public void hago_clic_en_el_perfil_y_selleciona_una() throws InterruptedException {
        client.perfil.click();
        client.option.click();
        Thread.sleep(2000);


    }

    @And("hago clic en centros de trabajo y selleciona una")
    public void hago_clic_en_centros_de_trabajo_y_selleciona_una() throws InterruptedException {
        client.CentroTrabajo.click();
        client.Centroopcion.click();



    }

    @And("entro a Añadir Responsable")
    public void entro_a_Añadir_Responsable() throws InterruptedException {
        client.responsablem.click();
        Thread.sleep(2000);
    }

    @And("se abre la pantalla de responsable y ir al boton seleccione")
    public void se_abre_la_pantalla_de_responsable_y_ir_al_boton_seleccione() {
        client.selectidee.click();

    }
    @And("elegi una responsable y hago clic en el boton")
    public void elegi_una_responsable_y_hago_clic_en_el_boton() throws InterruptedException {
        Thread.sleep(2000);
        client.selectResponsablem().selectByVisibleText("Alberto Corral (albertocorralpulido@gmail.com)");
        client.botonResponsablem.click();


    }
    @And("hago clic en seleccione y e abre pantalla con personas. Elegi uno")
    public void hago_clic_en_seleccione_y_e_abre_pantalla_con_personas_Elegi_uno() throws InterruptedException {
        client.personA.click();
        client.selecperson.click();
        client.selectPersonA.click();





    }

    @And("hago clic en el boton guardar")
    public void hago_clic_en_el_boton_guardar() throws InterruptedException {
        client.btnGuardarA.submit();
        Thread.sleep(2000);


    }

    @Then("ir al validar")
    public void ir_al_validar() throws InterruptedException {
        client.validarA.click();
        Thread.sleep(2000);








        client.SelectclienteB.click();
        Thread.sleep(2000);
        client.Berge.click();


    }
    @When("hago clic a negocio y selecciona una")
    public void hago_clic_a_negocio_y_selecciona_una() throws InterruptedException {
        client.negocio.click();
        client.negocioption.click();
        Thread.sleep(2000);
    }

    @And("hago clic en la zona y selecciona una")
    public void hago_clic_en_la_zona_y_selecciona_una() throws InterruptedException {
        client.zona.click();
        client.zonaoption.click();
        Thread.sleep(2000);
    }

    @And("hago clic en la sociedad y seleciona una")
    public void hago_clic_en_la_sociedad_y_seleciona_una() throws InterruptedException {

        client.sociedad.click();
        client.sociedadoption.click();
        Thread.sleep(2000);

    }

    @And("hago clic sociedad-división y seleciona una")
    public void hago_clic_sociedad_división_y_seleciona_una() throws InterruptedException {
        BrowserUtils.scrollToElement(client.sociedadivision);
        client.sociedadivision.click();
        client.sociedadivisionoption.click();
        Thread.sleep(2000);
    }

    @And("hago clic a riesgo y selecciona una")
    public void hago_clic_a_riesgo_y_selecciona_una() throws InterruptedException {
        client.riesgo.click();
        client.riesgoption.click();
        Thread.sleep(2000);
    }

    @And("hago clic al boton Añadir Responsable")
    public void hago_clic_al_boton_Añadir_Responsable() throws InterruptedException {

        Thread.sleep(2000);
        client.responsable.click();

    }

    @And("en la pantalla de responsable hago clic a seleccione")
    public void en_la_pantalla_de_responsable_hago_clic_a_seleccione() throws InterruptedException {
        Thread.sleep(7000);
        client.selectid.click();
        client.selectResponsable().selectByVisibleText("Antonio Coloma Carratalá (Antonio.Coloma.C@bergelogistics.com)");


    }


    @And("elegio una y hago clic en el boton")
    public void elegio_una_y_hago_clic_en_el_boton() {
        client.botonResponsable.click();

    }

    @And("hago clic al boton Nueva Personas de contacto")
    public void hago_clic_al_boton_Nueva_Personas_de_contacto() throws InterruptedException {
        client.contactPersonId.click();
        Thread.sleep(2000);

    }

    @And("hago clic en seleccione y se abre pantalla con personas, elegi uno")
    public void hago_clic_en_selleccione_y_se_abre_pantalla_con_personas_elegi_uno() throws InterruptedException {

        client.person.click();
        client.option1.click();
        client.selectPerson.click();
        Thread.sleep(2000);


    }

    @And("hago clic en el boton de Guardar")
    public void hago_clic_en_el_boton_de_Guardar() throws InterruptedException {
        client.btnGuardar.submit();
        Thread.sleep(7000);

    }






    @Given("accedo a cliente  selleciona el Cemex")
    public void accedo_a_cliente_selleciona_el_Cemex() throws InterruptedException {
        client.SelectclienteB.click();
        Thread.sleep(2000);
        client.Cemex.click();

    }

    @When("hago clic en la región y selecciona una")
    public void hago_clic_en_la_región_y_selecciona_una() throws InterruptedException {
        client.region.click();
        client.levante.click();
        Thread.sleep(2000);

    }

    @When("hago clic en la centro y seleciona una")
    public void hago_clic_en_la_centro_y_seleciona_una() {
        client.centro.click();
        client.centroption.click();

    }

    @When("hago clic actividad y seleciona una")
    public void hago_clic_actividad_y_seleciona_una() {

    }

    @When("hago clic a riesgos especiales y selecciona una")
    public void hago_clic_a_riesgos_especiales_y_selecciona_una() {

    }
}





