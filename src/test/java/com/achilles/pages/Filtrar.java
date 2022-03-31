package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filtrar {

    public Filtrar(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//label[@for=\"validation\"]" )
    public WebElement validar;

    @FindBy(xpath = "//a[@href=\"/Search/Documents/ValidateDocuments\"]")
    public WebElement ValidarDocumentos;

    @FindBy(xpath = "//div[@class=\"dropdown-container\"]")
    public WebElement Mostrar;

    @FindBy(xpath = "(//select[@class=\"form-control status-select\"])[1]")
    public WebElement TipoTrabajar;

    @FindBy(xpath = "//option[@value=\"10\"]")
    public WebElement trabajador;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement buttonfiltrar;





public void Validacíonfiltrar(){

}

}
