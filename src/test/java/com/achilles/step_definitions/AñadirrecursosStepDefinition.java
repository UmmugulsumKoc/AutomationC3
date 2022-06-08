package com.achilles.step_definitions;

import com.achilles.pages.Añadir;
import com.achilles.pages.Añadirrecursos;
import com.achilles.pages.Cambiar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class AñadirrecursosStepDefinition {

    Añadirrecursos recursos = new Añadirrecursos();

    Cambiar cambiar = new Cambiar();



    @Given("cambia el rol a Supplier")
    public void cambia_el_rol_a_Supplier() throws InterruptedException {

        cambiar.Selectcliente.click();
        cambiar.Acerinox.click();

        Thread.sleep(2000);

        //cambiar.Cambiarrol();
        cambiar.achilles.click();
        //Thread.sleep(2000);
        cambiar.Supplier.click();


    }

    @When("elegir proveedor")
    public void elegir_proveedor() {
        recursos.souteuropa.click();
        recursos.Adiq.click();

    }

    @When("pinchar a trabajadores en la barra derecha")
    public void pinchar_a_trabajadores_en_la_barra_derecha() {
        recursos.trabajadores.click();
        recursos.trabajadores.click();

    }

    @When("pinchar el boton añadir trabajador")
    public void pinchar_el_boton_añadir_trabajador() {
        recursos.añadirtrabajadores.click();

    }

    @When("completar NIF, Apellidos, Nombre")
    public void completar_NIF_Apellidos_Nombre() throws InterruptedException {

        Random rn =new Random();
        LocalDateTime myDateObj= LocalDateTime.now();

        DateTimeFormatter myFormatObj= DateTimeFormatter.ofPattern("dd-MM-yy");

        String formattedDate=rn.nextInt(10000)+""+myDateObj.format(myFormatObj).replaceAll("-","");

        recursos.NIF.sendKeys(formattedDate);
        Thread.sleep(2000);

        recursos.Apellido.sendKeys("Test");
        recursos.Nombre.sendKeys("Test2");
        Thread.sleep(2000);



    }



    @When("completar tipo de posicion")
    public void completar_tipo_de_posicion() {
        recursos.Posicion.sendKeys("tecnico");

    }

    @Then("pinchar en guardar")
    public void pinchar_en_guardar() throws InterruptedException {
        recursos.guardar.click();
        Thread.sleep(2000);

    }



}
