package com.azulcrm.pages;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    //first code

    @FindBy(xpath="//input[@placeholder='Login']")
    public WebElement userNameEntrance;

    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement passwordEntrance;

    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginButton;


    @FindBy(xpath="//div[@class='errortext']")
    public WebElement loginError;

    public void loginAsHelpDeskEmp(){
        userNameEntrance.sendKeys(ConfigurationReader.get("helpdesk_username"));
        passwordEntrance.sendKeys(ConfigurationReader.get("helpdesk_password"));
        loginButton.click();
        BrowserUtils.waitFor(1);
    }

    public void loginAsResourceEmp(){
        userNameEntrance.sendKeys(ConfigurationReader.get("human_resource_username"));
        passwordEntrance.sendKeys(ConfigurationReader.get("human_resource_password"));
        loginButton.click();
        BrowserUtils.waitFor(1);
    }

    public void loginAsMarketingEmp(){
        userNameEntrance.sendKeys(ConfigurationReader.get("marketing_username"));
        passwordEntrance.sendKeys(ConfigurationReader.get("marketing_password"));
        loginButton.click();
        BrowserUtils.waitFor(1);
    }

    public void falseLogin(String username, String password){
        userNameEntrance.sendKeys(username);
        passwordEntrance.sendKeys(password);
        loginButton.click();
        BrowserUtils.waitFor(1);
    }



}
