package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filtrar {

    public Filtrar(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[11]/label" )
    public WebElement validar;


public void Validacíonfiltrar(){

}

}
