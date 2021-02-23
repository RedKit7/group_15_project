package com.azulcrm.pages;

import com.azulcrm.utilities.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    //first code

    @FindBy(xpath="//input[@placeholder='Login']")
    public WebElement userNameEntrance;

    @FindBy(xpath="//input[@placeholder='Password']")
    public WebElement passwordEntrance;

    @FindBy (xpath = "//*[@id='login-popup']/form/div[2]/input")
    public WebElement signInButton;

    @FindBy(xpath="//div[@class='errortext']")
    public List<WebElement> loginError;


    public void login(){
        String userName = ConfigurationReader.get("human_resource_username");
        String passWord = ConfigurationReader.get("human_resource_password");
        userNameEntrance.sendKeys(userName);
        passwordEntrance.sendKeys(passWord);
        signInButton.click();
    }



}
