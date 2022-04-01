package com.achilles.step_definitions;

import com.achilles.pages.LoginPage;
import com.achilles.utilities.BrowserUtils;
import com.achilles.utilities.ConfigurationReader;
import com.achilles.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinitions {


    @Given("usuario esta en la pagina")
    public void usuario_esta_en_la_pagina()
    {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);


    }

    @When("usuario entrar en el entorno staging")
    public void usuario_entrar_en_el_entorno_staging() {
        System.out.println("escribo mi usuarname y contraseña");
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();

        loginPage.login(username, password);

    }

    @Then("usuario deberia ver la pagina")
    public void usuario_deberia_ver_la_pagina() {
        //System.out.println("yo entro en el entorno");
        BrowserUtils.waitFor(7);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Achilles SSO | Home", actualTitle);


    }
}
