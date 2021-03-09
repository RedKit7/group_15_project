package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends BasePage{




    public void clickModule(String str1){
        WebElement btnModule = Driver.get().findElement(By.xpath("//span[contains(text(),'"+str1+"')]"));

        btnModule.click();
    }


    @FindBy(name = "q")
    public WebElement findInput;



}
