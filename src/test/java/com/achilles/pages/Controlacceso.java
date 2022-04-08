package com.achilles.pages;

import com.achilles.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Controlacceso {

    public Controlacceso(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement Selectcliente;

    @FindBy(id = "OP-22")
    public WebElement Cemex;

    @FindBy(id = "OP-26")
    public WebElement CIMSA;

    @FindBy(xpath = "(//label[@class='btnlabel'])[7]")
    public WebElement Control;

    @FindBy(xpath = "//*[@id='smenu_authorize']/a")
    public WebElement controlbtn;

    @FindBy(id = "10")
    public WebElement recurso;

    @FindBy(xpath = "//option[@value=\"20\"]")
    public WebElement vehiculo;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement buscar;

    @FindBy(id = "row24362")
    public WebElement vehiculocarnet;

    @FindBy(id = "btnView")
    public WebElement btnbuscar;

    @FindBy(xpath ="//a[@onclick='window.print();']")
    public WebElement imprimir;







}
