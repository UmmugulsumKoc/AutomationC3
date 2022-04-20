package com.achilles.pages;

import com.achilles.utilities.Driver;
import io.cucumber.java.bs.I;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.List;

public class Clientecontrat {


    public Clientecontrat(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement Selectcliente;



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


    //@FindBy(id = "structure1")
    //public WebElement negocio;

    //@FindBy(xpath = "//*[@id=\"structure1\"]/optgroup/option[2]")
    //public WebElement cemento;

    //@FindBy(id = "structure1")
    //public WebElement negocio;








    @FindBy(id = "OP-21")
    public WebElement Acerinox;

    @FindBy(id = "structure1")
    public WebElement perfil;

    @FindBy(xpath = "//*[@id=\"structure1\"]//option[2]")
    public WebElement option;

    @FindBy(id = "structure2")
    public WebElement CentroTrabajo;

    @FindBy(xpath = "//option[@value=\"9\"]")
    public WebElement Centroopcion;




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
    public WebElement sociedadDivision;

    @FindBy(xpath = "//*[@id=\"structure4\"]//optgroup/option[1]")
    public WebElement sociedadDivisionoption;

    @FindBy(id = "structure5")
    public WebElement riesgo;

    @FindBy(xpath = "//*[@id=\"structure5\"]//option[3]")
    public WebElement riesgoption;


    @FindBy(id = "OP-22")
    public WebElement Cemex;

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
    public WebElement riesgoEspecial;

    @FindBy(xpath = "//*[@id=\"specialRiskId\"]//option[4]")
    public WebElement riesgosption;





    @FindBy(id = "OP-26")
    public WebElement CIMSA;

    @FindBy(id = "structure1")
    public WebElement negocioCimsa;

    @FindBy(xpath = "//*[@id=\"structure1\"]//optgroup//option")
    public WebElement negociacimssaoption;


    @FindBy(id = "OP-8")
    public WebElement Cepsa;

    @FindBy(id = "structure2")
    public WebElement Departamento;

    @FindBy(id = "//*[@id='structure2']//option[4]")
    public WebElement Departamentooption;




    @FindBy(id ="OP-20")
    public WebElement FreseniusMC;

    @FindBy(id ="structure1")
    public WebElement Sociedad;

    @FindBy(xpath = "//*[@id=\"structure1\"]//option[3]")
    public WebElement Sociedadoption;








    @FindBy(id ="OP-6")
    public WebElement MetroMalaga;

    @FindBy(id ="OP-11")
    public WebElement Naturgy;

    @FindBy(id ="OP-13")
    public WebElement Brazil;

    @FindBy(id ="OP-24")
    public WebElement Chile;

    @FindBy(id ="OP-15")
    public WebElement Mexico;

    @FindBy(id ="OP-16")
    public WebElement Panama;

    @FindBy(id ="OP-17")
    public WebElement Dominica;

    @FindBy(id ="OP-5")
    public WebElement TMB;



    public void selectSociedad(String CTR) {
        Select select = new Select(Sociedad);
        select.selectByIndex(Integer.parseInt(CTR));

    }


    public void selectnegocioCimsa(String CTR) {
        Select select = new Select(negocioCimsa);
        select.selectByIndex(Integer.parseInt(CTR));

    }



    public void selectDepartamento(String CTR) {
        Select select = new Select(Departamento);
        select.selectByIndex(Integer.parseInt(CTR));

    }

    public void selectriesgoEspecial(String CTR){
        Select select= new Select(riesgoEspecial);
        select.selectByIndex(Integer.parseInt(CTR));
    }

    public void selectActividad(String CTR){
        Select select= new Select(Actividad);
        select.selectByIndex(Integer.parseInt(CTR));
    }

    public void selectcentro(String CTR){
        Select select= new Select(centro);
        select.selectByValue(CTR);
    }

    public void selectregion(String CTR){
        Select select= new Select(region);
        select.selectByIndex(Integer.parseInt(CTR));

    }


    public void selectnegocio(String CTR){
        Select select= new Select(negocio);
        select.selectByIndex(Integer.parseInt(CTR));


    }

    public void selectnuevo(){
        Select select= new Select(personA);
        select.selectByIndex(1);
    }


    public void selectzona(String CTR){
        Select select= new Select(zona);
        select.selectByIndex(Integer.parseInt(CTR));
    }


    public void selectCentroTrabajo(String CTR){
        Select select= new Select(CentroTrabajo);
        select.selectByValue(CTR);
    }
    public void selectresponsableid(){
        Select select= new Select(selectid);
        select.selectByIndex(1);
    }

   public WebElement selectcliente(String Cliente) {
       return Driver.get().findElement(By.id("OP-"+Cliente+""));
   }

    public Select selectResponsable() {
        return new Select(selectid);
    }

    public Select selectResponsablem() {
        return new Select(selectidee);
    }


}
