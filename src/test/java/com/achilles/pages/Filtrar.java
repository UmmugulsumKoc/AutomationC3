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

    @FindBy(partialLinkText = ("Search/Documents/ValidateDocuments"))
    public WebElement ValidarDocumentos;


public void Validacíonfiltrar(){

}

}
