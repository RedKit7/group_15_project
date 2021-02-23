package com.azulcrm.pages;

import com.azulcrm.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    //first code

    @FindBy(xpath="//input[@placeholder=\"Login\"]")
    public List<WebElement> userNameEntrance;

    @FindBy(xpath="//input[@placeholder=\"Password\"]")
    public List<WebElement> passwordEntrance;

    @FindBy(xpath="//div[@class=\"errortext\"]")
    public List<WebElement> loginError;

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement signInButton;

    public void login(){
        String userName = ConfigurationReader.get("human_resource_username");
        String passWord = ConfigurationReader.get("human_resource_password");
        username.sendKeys(userName);
        password.sendKeys(passWord);
        signInButton.click();
    }



}
