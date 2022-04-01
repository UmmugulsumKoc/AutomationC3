package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clientecontrat {


    public Clientecontrat(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement Selectcliente;

    @FindBy(id = "OP-21")
    public WebElement Acerinox;

    @FindBy(id = "ContractBasisTextId")
    public WebElement Acerinoxcontrato;

    @FindBy(xpath = "//span[@class='btn btn-block form-control']")
    public WebElement numero;

    @FindBy(id = "structure1")
    public WebElement perfil;

    @FindBy(xpath = "//option[@value=\"240\"]")
    public WebElement option;

    @FindBy(id = "structure2")
    public WebElement CentroTrabajo;

    @FindBy(xpath = "//option[@value=\"9\"]")
    public WebElement Centroopcion;

    @FindBy(xpath = "//input[@value=\"Seleccione Responsable\"]")
    public WebElement botonResponsable;

    @FindBy(xpath = "//option[@value=\"8782\"]")
    public WebElement PersonA;
}
