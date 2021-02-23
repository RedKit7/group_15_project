package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage extends BasePage{

    public MyProfilePage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//td[text()='Contact information']")
    public WebElement contactInfo;

}
