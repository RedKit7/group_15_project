package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyDrivePage extends BasePage {

    // added comment into CompanyDrivePage

    public CompanyDrivePage(){   PageFactory.initElements(Driver.get(),this);  }

    @FindBy( xpath = "//*[@id='top_menu_id_docs_menu_my_disk']/a")
    public WebElement myDriveButton;

    @FindBy(xpath = "//*[@id='top_menu_id_docs_414529032']/a")
    public WebElement companyDriveButton;
}
