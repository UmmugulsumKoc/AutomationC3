package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

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

    //@FindBy(xpath = "//span[@class='btn btn-block form-control']")
    //public WebElement numero;

    @FindBy(xpath = "(//input[@class=\"form-control\"])[2]")
    public WebElement descripcionA;

    @FindBy(id = "SupplierTextId")
    public WebElement contratistaA;

    @FindBy(xpath = "//*[@id=\"SupplierTextId\"]/option[7]")
    public WebElement acilles;

    @FindBy(id = "structure1")
    public WebElement perfil;

    @FindBy(xpath = "//*[@id=\"structure1\"]//option[3]")
    public WebElement option;

    @FindBy(id = "structure2")
    public WebElement CentroTrabajo;

    @FindBy(xpath = "//option[@value=\"9\"]")
    public WebElement Centroopcion;

    @FindBy(id = "responsibleId")
    public WebElement responsablem;

    @FindBy(id = "selectedUserId")
    public WebElement selectidee;

    @FindBy(xpath = "//input[@value=\"Seleccione Responsable\"]")
    public WebElement botonResponsablem;

    @FindBy(id="selectedUserId")
    public WebElement personA;

    @FindBy(xpath = "//*[@id=\"selectedUserId\"]//option[9]")
    public WebElement selecperson;


    @FindBy(xpath = "//input[@value=\"Seleccione Persona de contacto\"]")
    public WebElement selectPersonA;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement btnGuardarA;

    @FindBy(xpath = "//input[@value=\"Validar\"]")
    public WebElement validarA;

    //@FindBy(xpath = "//option[@value=\"8782\"]")
    //public WebElement PersonA;


    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement SelectclienteB;

    @FindBy(id = "OP-25")
    public WebElement Berge;

    @FindBy(id = "structure1")
    public WebElement negocio;

    @FindBy(xpath = "//*[@id=\"structure1\"]//option[4]")
    public WebElement negocioption;

    @FindBy(id = "structure2")
    public WebElement zona;

    @FindBy(xpath = "//*[@id=\"structure2\"]//option[4]")
    public WebElement zonaoption;

    @FindBy(id = "structure3")
    public WebElement sociedad;

    @FindBy(xpath = "//*[@id=\"structure3\"]//option[3]")
    public WebElement sociedadoption;



    @FindBy(id = "structure4")
    public WebElement sociedadivision;

    @FindBy(xpath = "//*[@id=\"structure4\"]//optgroup/option[1]")
    public WebElement sociedadivisionoption;

    @FindBy(id = "structure5")
    public WebElement riesgo;

    @FindBy(xpath = "//*[@id=\"structure5\"]//option[3]")
    public WebElement riesgoption;

    @FindBy(id = "responsibleId")
    public WebElement responsable;

    @FindBy(id = "selectedUserId")
    public WebElement selectid;

    @FindBy(xpath = "//input[@value=\"Seleccione Responsable\"]")
    public WebElement botonResponsable;

    @FindBy(id = "contactPersonId")
    public WebElement contactPersonId;

    @FindBy(id="selectedUserId")
    public WebElement person;

    @FindBy(xpath = "//*[@id=\"selectedUserId\"]//option[2]")
    public WebElement option1;

    @FindBy(xpath = "//input[@value=\"Seleccione Persona de contacto\"]")
    public WebElement selectPerson;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    public WebElement btnGuardar;



    //@FindBy(xpath = "//img[@class=\"selected-image\"]")
    //public WebElement Selectcliente;

    @FindBy(id = "OP-22")
    public WebElement Cemex;

    //@FindBy(id = "structure1")
    //public WebElement negocio;

    //@FindBy(xpath = "//*[@id=\"structure1\"]/optgroup/option[2]")
    //public WebElement cemento;

    //@FindBy(id = "structure1")
    //public WebElement negocio;

    @FindBy(xpath = "//*[@id=\"structure1\"]//option[6]")
    public WebElement negocioptionC;


    @FindBy(id = "structure2")
    public WebElement region;

    @FindBy(xpath = "//*[@id=\"structure2\"]//option[3]")
    public WebElement levante;

    @FindBy(id = "structure3")
    public WebElement centro;

    @FindBy(xpath = "//*[@id=\"structure3\"]//optgroup/option")
    public WebElement centroption;

    @FindBy(id = "structure4")
    public WebElement Actividad;

    @FindBy(xpath = "//*[@id=\"structure4\"]//option[5]")
    public WebElement Actividadoption;

    @FindBy(id = "specialRiskId")
    public WebElement riesgos;

    @FindBy(xpath = "//*[@id=\"specialRiskId\"]//option[4]")
    public WebElement riesgosption;


    @FindBy(id = "OP-26")
    public WebElement CIMSA;

    @FindBy(id = "structure1")
    public WebElement negociocimsa;

    @FindBy(xpath = "//*[@id=\"structure1\"]//optgroup//option")
    public WebElement negociacimssaoption;






    public Select selectResponsable() {
        return new Select(selectid);
    }

    public Select selectResponsablem() {
        return new Select(selectidee);
    }


}
