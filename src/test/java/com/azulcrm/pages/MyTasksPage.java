package com.azulcrm.pages;

import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTasksPage extends BasePage{

    //Belongs to Said

    @FindBy(xpath = "//input[@type=\"text\"]")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type=\"password\"]")
    public WebElement passwordInput;

    @FindBy(id = "menu-counter-tasks_total")
    public WebElement tasksModule;

    @FindBy(id = "tasks_panel_menu_view_all")
    public WebElement allTasksTab;

    @FindBy(xpath = "//div[text()=\"In progress\"]")
    public WebElement inProgress;

    @FindBy(xpath = "//span[text()=\"Ongoing\"]")
    public WebElement onGoing;

    @FindBy(xpath = "//div[text()=\"Role: Ongoing\"]")
    public WebElement onGoingmessage;

    public static void main(String[] args) {

        Driver.get().get(ConfigurationReader.get("url"));

        MyTasksPage myTasksPage = new MyTasksPage();

        String username = ConfigurationReader.get("marketing_username");
        String password = ConfigurationReader.get("marketing_password");

        new MyTasksPage().usernameInput.sendKeys(username, Keys.TAB, password, Keys.TAB, Keys.TAB ,Keys.ENTER);


        myTasksPage.tasksModule.click();

        myTasksPage.allTasksTab.click();

        System.out.println("myTasksPage.inProgress.getText() = " + myTasksPage.inProgress.getText());

        myTasksPage.onGoing.click();

        System.out.println("myTasksPage.onGoingmessage.getText() = " + myTasksPage.onGoingmessage.getText());


    }

}
