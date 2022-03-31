package com.achilles.step_definitions;

import com.achilles.pages.Filtrar;
import com.achilles.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import jdk.jfr.Timespan;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiltrarStepDefinitions {
Filtrar validation= new Filtrar();

    @Given("hago clic en Validación")
    public void hago_clic_en_Validación() throws InterruptedException {
        Thread.sleep(2000);
        validation.validar.click();
        BrowserUtils.scrollToElement(validation.validar);
        Thread.sleep(2000);
    }

    @When("elegi Validar documentos")
    public void elegi_Validar_documentos() throws InterruptedException {

        Thread.sleep(2000);
        validation.ValidarDocumentos.findElement(By.xpath("//a[@href=\"/Search/Documents/ValidateDocuments\"]"));
        validation.ValidarDocumentos.click();
   }

    @And("hago clic en Mostrar filtros")
    public void hago_clic_en_Mostrar_filtros() {

        validation.Mostrar.click();

    }

    @And("cambio Tipo a Trabajador")
    public void cambio_Tipo_a_Trabajador() {

        validation.TipoTrabajar.click();
        validation.trabajador.click();

    }

    @And("hago clic en el boton Buscar")
    public void hago_clic_en_el_boton_Buscar() throws InterruptedException {

        Thread.sleep(2000);
        validation.buttonfiltrar.click();


    }
    @Then("tengo la resultado")
    public void tengo_la_resultado() {

    }

}
