package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Añadirrecursos {


    public Añadirrecursos(){PageFactory.initElements(Driver.get(), this);}


    @FindBy(xpath = "//img[@class=\"selected-image\"]")
    public WebElement Selectcliente;

    @FindBy(id = "OP-21")
    public WebElement Acerinox;

    @FindBy(tagName = "h4")
    public WebElement achilles;

    @FindBy(xpath = "//li[@onclick=\"AjaxServicePost(1,'Service/SetCurrentUserType')\"]")
    public WebElement Supplier;


    @FindBy(xpath = "//li[@title=\"ACHILLES SOUTH EUROPE, S.L.\"]")
    public WebElement souteuropa;

    @FindBy(id = "row262")
    public WebElement Adiq;

    @FindBy(xpath = "(//img[@class=\"icon-shotcut\"])[3]")
    public WebElement trabajadores;

    @FindBy(xpath = "//a[@title=\"Añadir Trabajador\"]")
    public WebElement añadirtrabajadores;

    @FindBy(xpath = "(//input[@class=\" form-control valid\"])[1]")
    public WebElement NIF;

    @FindBy(xpath = "(//input[@class=\" form-control valid\"])[2]")
    public WebElement Apellido;

    @FindBy(xpath = "(//input[@class=\" form-control valid\"])[3]")
    public WebElement Nombre;

    @FindBy(xpath =  "(//input[@class=\" form-control valid\"])[4]")
    public WebElement Posicion;


    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement guardar;

}
