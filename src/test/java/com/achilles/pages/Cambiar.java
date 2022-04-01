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

    @FindBy(css =".hvr-shrink")
    public WebElement cambiar;

    @FindBy(linkText ="Supplier (sim.)")
    public  WebElement rols;






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
