package com.achilles.pages;

import com.achilles.utilities.BrowserUtils;
import com.achilles.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Cambiar {


    public Cambiar(){
        PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(tagName = "h4")
    public WebElement achilles;

    @FindBy(xpath = "//li[@onclick=\"AjaxServicePost(1,'Service/SetCurrentUserType')\"]")
    public WebElement Supplier;

    @FindBy(xpath = "//li[@onclick=\"AjaxServicePost(2,'Service/SetCurrentUserType')\"]")
    public WebElement Operator;

    @FindBy(xpath = "//li[@onclick=\"AjaxServicePost(3,'Service/SetCurrentUserType')\"]")
    public WebElement Achilles;



    @FindBy(css =".hvr-shrink")
    public WebElement cambiar;



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

    @FindBy(id ="OP-20")
    public WebElement FreseniusMC;

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











    public void Cambiarrol() {


        cambiar.click();

    }

    public void elegirol() throws InterruptedException {
        achilles.click();
        //Thread.sleep(7000);
        //Select dropdown = new Select(Driver.get().findElement(By.tagName("h4")));
        //dropdown.selectByVisibleText("Supplier");
        //supplier.click();
        //WebElement dropdowns=Driver.get().findElement(By.xpath("//li[@class='row-box-image'][1]"));
        //List<WebElement>Optins=Driver.get().findElements(By.xpath("//li[@class='row-box-image'][1]"));
        //BrowserUtils.getElementsText(rols).
        //List<String> actualOptions = BrowserUtils.getElementsText(rols);
        //return actualOptions;
        //Optins.get(1).click();
        //rols.click();
        //Actions actions = new Actions(driver);

        //Thread.sleep(2000);
        //actions.moveToElement(img1).perform();

    };



}
