package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage extends BasePage{

    public EditProfilePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    // for now, no locator or method is needed here!!!

}
