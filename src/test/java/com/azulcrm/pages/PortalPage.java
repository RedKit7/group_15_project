package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PortalPage extends BasePage{

    public PortalPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "user-block")
    @CacheLookup
    public WebElement userMenu;


    public void userBlockClick(String userMenuItem){

        String locator = "//span[text()='"+userMenuItem+"']";
        Driver.get().findElement(By.xpath(locator)).click();

    }


}
