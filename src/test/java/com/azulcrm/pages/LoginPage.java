package com.azulcrm.pages;

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





}
