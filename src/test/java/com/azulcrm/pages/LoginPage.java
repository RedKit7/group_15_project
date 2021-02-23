package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    //first code

    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement passwordInput;





}
