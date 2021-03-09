package com.azulcrm.pages;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage extends BasePage{

    public CompanyPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "tab_cont_cedit1")
    public WebElement previewText;

    @FindBy(xpath = "//div[contains(text(),'RSS Feed')]")
    public WebElement RssFeedHeaderTitle;




    public void navigateToCompanyTabs(String tab){
        String tabLocator = "//span[normalize-space()='"+tab+"' and contains(@class,'main-buttons-item-text-title')]";

        BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
        WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
        tabElement.click();
    }


    public void companyNews(String Button){
        String buttonLocator = "//span[normalize-space()='"+Button+"' and contains(@class,'webform-small-button-text')]";

        BrowserUtils.waitForClickablility(By.xpath(buttonLocator), 5);
        WebElement tabElement = Driver.get().findElement(By.xpath(buttonLocator));
        Assert.assertTrue(tabElement.isEnabled());
        tabElement.click();

    }




}
