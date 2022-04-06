package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Añadir {

    public Añadir(){PageFactory.initElements(Driver.get(), this);
    }


    //@FindBy(xpath = "(//div[@class=\"notification-box\"])[2]")
    //public WebElement buyer;

    //@FindBy(xpath = "(//div[@class='notification-box'])[2]")
    //public WebElement buyer;

    //@FindBy(id = "OP-8")
    //public WebElement cepsa;



    @FindBy(xpath = "//label[@for=\"contracts\"]")
    public WebElement contratos;

    @FindBy(partialLinkText = "Gestión de contratos")
    public WebElement gestión;


    @FindBy(css = ".btn.btn-info.btn-toolbar")
    public WebElement añadircontrat;

    @FindBy(id = "ContractBasisTextId")
    public WebElement numerocontrato;

    @FindBy(xpath = "//*[@id=\"fixerWidth\"]/div/div/form/fieldset[1]/div/div[2]/div/input")
    public WebElement descripcion;

    @FindBy(id = "SupplierTextId")
    public WebElement contratista;

    @FindBy(xpath = "//*[@id=\"SupplierTextId\"]/option[3]")
    public WebElement suaz;

    @FindBy(id = "structure1")
    public WebElement negocio;

    @FindBy(xpath = "//*[@id=\"structure1\"]/optgroup/option[2]")
    public WebElement cemento;

    @FindBy(id = "structure2")
    public WebElement region;

    @FindBy(xpath = "//*[@id=\"structure2\"]/optgroup/option[1]")
    public WebElement aragon;

    @FindBy(id = "structure3")
    public WebElement centro;

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


    @FindBy(xpath = "//input[@value=\"Validar\"]")
    public WebElement validar;





    @FindBy(xpath = "//span[@class='btn btn-block form-control']")
    public WebElement numero;


    @FindBy(id = "SupplierTextId")
    public WebElement subcontratista;

    @FindBy(xpath = "//a[@title=\"Subir documento\"]")
    public WebElement subirDocumento;

    @FindBy(id = "contactPersonId")
    public WebElement contactPersonId2;

    @FindBy(xpath = "//input[@value=\"Seleccione Persona de contacto\"]")
    public WebElement selectNuevaPerson;



    public Select añadirPerfil() {
        return new Select(centro);


    }

    public Select selectResponsable() {
        return new Select(selectid);
    }


    }
