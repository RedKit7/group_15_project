package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage{

    //Zeynep
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//input[@placeholder=\"Login\"]")
    public WebElement userNameEntrance;


    @FindBy(xpath="//input[@placeholder=\"Password\"]")
    public WebElement passwordEntrance;

    @FindBy(xpath="//input[@class=\"login-btn\"]")
    public WebElement submit;

    @FindBy(xpath="//div[@class='errortext']")
    public WebElement loginError;
    /*
ublic void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
 */

    public void login(String userNameEnt, String passwordEnt) {
        userNameEntrance.sendKeys(userNameEnt);
        passwordEntrance.sendKeys(passwordEnt);
        submit.click();

    }
}
