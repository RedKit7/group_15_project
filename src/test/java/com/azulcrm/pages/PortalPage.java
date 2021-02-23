package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PortalPage extends BasePage{

    public PortalPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy (css = "user-block")
    public WebElement userMenu;








}
