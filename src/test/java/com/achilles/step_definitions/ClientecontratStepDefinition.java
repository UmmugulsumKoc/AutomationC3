package com.achilles.step_definitions;

import com.achilles.pages.Clientecontrat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ClientecontratStepDefinition {
      Clientecontrat client = new Clientecontrat();


    @Given("accedo a cliente  selleciona el Acerinox")
    public void accedo_a_cliente_selleciona_el_Acerinox() throws InterruptedException {

        client.Selectcliente.click();
        client.Acerinox.click();
        Thread.sleep(2000);



    }

    @When("hago clic en el perfil y selleciona una")
    public void hago_clic_en_el_perfil_y_selleciona_una() {

    }

    @And("hago clic en centros de trabajo y selleciona una")
    public void hago_clic_en_centros_de_trabajo_y_selleciona_una() {

    }

    @And("hago clic en seleccione y e abre pantalla con personas. Elegi uno")
    public void hago_clic_en_seleccione_y_e_abre_pantalla_con_personas_Elegi_uno() {

    }

    @And("hago clic en el boton guardar")
    public void hago_clic_en_el_boton_guardar() {

    }






}


