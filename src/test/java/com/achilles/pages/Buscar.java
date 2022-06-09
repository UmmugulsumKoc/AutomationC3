package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buscar {

    public Buscar(){PageFactory.initElements(Driver.get(), this);}


    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement Selectcliente;

    @FindBy(id = "OP-21")
    public WebElement Acerinox;

    @FindBy(id = "OP-25")
    public WebElement Berge;

    @FindBy(id = "OP-22")
    public WebElement Cemex;

    @FindBy(id = "OP-26")
    public WebElement CIMSA;

    @FindBy(id = "OP-8")
    public WebElement Cepsa;

    @FindBy(id ="OP-20")
    public WebElement FreseniusMC;







    @FindBy(xpath = "(//li[@class=\"item\"])[7]")
    public WebElement btnbuscar;


    @FindBy(xpath = "//select[@class=\"form-control\"]")
    public WebElement Queestasbuscando;

    @FindBy(xpath = "//option[@value=\"1\"]")
    public WebElement proveedor;


    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement bscrbtn;


    @FindBy(xpath = "(//option[@value=\"2\"])[1]")
    public WebElement contrato;

    @FindBy(xpath = "//option[@value=\"10\"]")
    public WebElement trabajador;


    @FindBy(xpath = "//option[@value=\"20\"]")
    public WebElement vehiculo;

    @FindBy(xpath = "//option[@value=\"30\"]")
    public WebElement maquinaria;

    @FindBy(xpath = "//input[@value=\"Cambiar filtros\"]")
    public WebElement cambiarfiltro;
}
