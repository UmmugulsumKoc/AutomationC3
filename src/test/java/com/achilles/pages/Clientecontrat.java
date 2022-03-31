package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clientecontrat {


    public Clientecontrat(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(/html/body/header/div[1]/ul/li[3]/div")
    public WebElement Selectcliente;

    @FindBy(id = "OP-21")
    public WebElement Acerinox;
}
