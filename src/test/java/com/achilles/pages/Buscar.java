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

    @FindBy(xpath = "(//li[@class=\"item\"])[7]")
    public WebElement btnbuscar;


    @FindBy(xpath = "//select[@class=\"form-control\"]")
    public WebElement Queestasbuscando;






}
