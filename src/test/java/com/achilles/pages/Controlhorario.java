package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Controlhorario {


    public Controlhorario(){PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement Selectcliente;

    @FindBy(id = "OP-22")
    public WebElement Cemex;


    @FindBy(xpath = "(//label[@class='btnlabel'])[8]")
    public WebElement horariomanual;

    @FindBy(xpath = "//a[@href=\"/Controlar/EmpTrack/ManualEmptrack\"]")
    public WebElement controlmanual;

    @FindBy(id = "resourceSelectId")
    public WebElement trabajador;

    @FindBy(xpath = "//option[@value='10']")
    public WebElement resorce;

    @FindBy(xpath ="//input[@value='Buscar']")
    public WebElement buscar;


}
