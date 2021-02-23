package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilePage extends BasePage{

    public EditProfilePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Contact information")
    public WebElement contactInfo;







}
