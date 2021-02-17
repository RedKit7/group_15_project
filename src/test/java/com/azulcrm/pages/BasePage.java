package com.azulcrm.pages;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){PageFactory.initElements(Driver.get(), this);}

    public void getPageTitle(){
        Driver.get().getTitle();
    }

    @FindBy (xpath = "//span[@id='logo_24_text']")
    public WebElement CRMLogo;

    @FindBy (xpath = "//div[@id='user-block']")
    public WebElement userBlock;

    @FindBy (xpath = "//span[contains(text(),'My Profile')]")
    public WebElement myProfile;

    @FindBy (xpath = "//span[contains(text(),'Edit Profile Settings')]")
    public WebElement editProfileSettings;

    @FindBy (xpath = "//span[contains(text(),'Log out')]")
    public WebElement logOut;


    @FindBy (xpath = "//input[@id='search-textbox-input']")
    public WebElement searchBox;

   public void goToMyProfile(){
        userBlock.click();
        BrowserUtils.waitForClickablility(By.xpath("//span[contains(text(),'My Profile')]"), 5);
        myProfile.click();
    }

    public void editProfileSettings(){
        userBlock.click();
        BrowserUtils.waitForClickablility(By.xpath("//span[contains(text(),'My Profile')]"), 5);
        myProfile.click();
    }

    public void LogOut(){
        userBlock.click();
        BrowserUtils.waitForClickablility(By.xpath("//span[contains(text(),'Log out')]"), 5);
        logOut.click();
    }



    public void goToPortalPage(){
        CRMLogo.click();
    }


    /**
     * This method will navigate user to the specific module in AzulCRM application.
     *
     * @param module
     * @return navigates to given module
     */
    public void navigateToModule(String module) {
        String moduleLocator = "//span[normalize-space()='"+module+"' and contains(@class,'menu-item-link')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 5);
            WebElement moduleElement = Driver.get().findElement(By.xpath(moduleLocator));
//            new Actions(Driver.get()).moveToElement(moduleElement).pause(200).doubleClick(moduleElement).build().perform();
            moduleElement.click();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(moduleLocator), 5);
        }

    }

    public void navigateToHiddenModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='More...' and contains(@class,'menu-item-link')]";
        String moduleLocator = "//span[normalize-space()='"+module+"' and contains(@class,'menu-item-link-text')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
//            new Actions(Driver.get()).moveToElement(moduleElement).pause(200).doubleClick(moduleElement).build().perform();
            tabElement.click();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            WebElement moduleElement = Driver.get().findElement(By.xpath(moduleLocator));
//            new Actions(Driver.get()).moveToElement(moduleElement).pause(200).doubleClick(moduleElement).build().perform();
            moduleElement.click();
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
        }
    }

}
