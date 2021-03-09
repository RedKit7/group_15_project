package com.azulcrm.pages;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSearchPage extends BasePage{

    public FilterAndSearchPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy (xpath = "//*[contains(@class,\"ui-btn ui-btn-primary ui-btn-icon-search\")]")
    public WebElement searchButton;

    @FindBy (id = "LIVEFEED_search")
    public WebElement filterAndSearchButton;

    @FindBy ( xpath = "//body/div[@id='LIVEFEED_search_container']/div[@id='popup-window-content-LIVEFEED_search_container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    public WebElement dateButton;

// Save
    @FindBy (xpath = "//span[@class=\"main-ui-filter-add-item\"] ")
    public WebElement saveFilterButton;
    @FindBy ( xpath = "//input[@class=\"main-ui-filter-sidebar-edit-control\"] ")
    public WebElement filterNameBox;
    @FindBy ( xpath = "//*[@class=\"ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save\"] ")
    public WebElement saveButton;
    public String filterName (String str){
        WebElement filtName = Driver.get().findElement(By.xpath("//span[text()='"+str+"'] "));
        return filtName.getText();
    }

// Type
    @FindBy (xpath = "(//div[@data-name=\"EVENT_ID\"])[2]")
    public WebElement typeAllButton;
    public WebElement typeMethod(String str) {
       WebElement typeButton = Driver.get().findElement(By.xpath("//div[contains(@data-item,'"+str+"')]"));
       return typeButton;
    }
    @FindBy(xpath = "//div[@class='main-ui-square-item']")
    public WebElement typeConfirm;

//Author
    @FindBy (xpath = "//*[@name=\"CREATED_BY_ID_label\"]")
    public WebElement authorButton;

    public void clickAuthor(String author){
        WebElement clickAut = Driver.get().findElement(By.xpath("//div[contains(text(),'"+author+"')]"));
        clickAut.click();
    }
    public String searchVerificationAuthor(){
        WebElement searchVerif = Driver.get().findElement(By.xpath("//div[contains(text(),'Author:')]"));
        return searchVerif.getText();
    }

// To
@FindBy (xpath = "//*[@name='TO_label']")
public WebElement toButton;

    public void clickTo(String To){
        WebElement clickTo = Driver.get().findElement(By.xpath("//div[contains(text(),'"+To+"')]"));
        clickTo.click();
    }
    public String searchVerificationTo(){
        WebElement searchVerif = Driver.get().findElement(By.xpath("//div[contains(text(),'To:')]"));
        return searchVerif.getText();
    }

//Add fields
    @FindBy (xpath = "//span[contains(text(),'Add field')]")
    public WebElement addFieldButton;
    public void addFields(String fieldName){
        WebElement fieldsBox = Driver.get().findElement(By.xpath("//div[contains(text(),'"+fieldName+"')]"));
        fieldsBox.click();
    }
    public String confirmAddFields(String fieldName){
        WebElement fieldsName = Driver.get().findElement(By.xpath("//span[@title='"+fieldName+"']"));
        return fieldsName.getText();
    }
    @FindBy (xpath = "//span[contains(text(),'Restore default fields')]")
    public WebElement restoreFields;

// Search with followings
    public void searchFollowings(String str){
        WebElement followings = Driver.get().findElement(By.xpath("//span[@class='main-ui-filter-sidebar-item-text-container']/span[text()='"+str+"']"));
        followings.click();
    }
    public String verifySearchFollowings(String str){
        WebElement verifyFollowings = Driver.get().findElement(By.xpath("//div[@class='main-ui-filter-search-square main-ui-filter-search-square-preset main-ui-square']/div[contains(text(),'"+str+"')]"));

        return verifyFollowings.getText();
    }
    public void resetDefaultSearch(){
        WebElement resetSettingsButton = Driver.get().findElement(By.xpath("//span[@title='Configure filter']"));
        resetSettingsButton.click();
        BrowserUtils.waitFor(1);
        WebElement resetDefaultButton = Driver.get().findElement(By.xpath("//span[contains(text(),'Reset to default')]"));
        resetDefaultButton.click();
        BrowserUtils.waitFor(1);
        WebElement continueButton = Driver.get().findElement(By.xpath("//span[contains(text(),'Continue')]"));
        continueButton.click();
        BrowserUtils.waitFor(1);
    }

//Reset search history
    @FindBy (xpath = "//body/div[@id='LIVEFEED_search_container']/div[@id='popup-window-content-LIVEFEED_search_container']/div[1]/div[1]/div[3]/div[2]/div[1]/span[1]")
    public WebElement resetSearchHistory;



}
