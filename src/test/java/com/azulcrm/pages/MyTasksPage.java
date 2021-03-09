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

    @FindBy(xpath = "//div[text()='In progress']")
    public WebElement inProgress;

    @FindBy(xpath = "//span[text()='Ongoing']")
    public WebElement onGoing;

    @FindBy(xpath = "//span[text()='Assisting']")
    public WebElement assistingTab;

    @FindBy(xpath = "//span[text()='Set by me']")
    public WebElement setByMeTab;

    @FindBy(xpath = "//span[text()='Projects']")
    public WebElement projectsTab;

    @FindBy(xpath = "//span[text()='Efficiency']")
    public WebElement efficiencyTab;

    @FindBy(xpath = "//span[text()='Recycle Bin']")
    public WebElement recycleBinTab;

    @FindBy(xpath = "//a[@id='tasks-buttonAdd']")
    public WebElement newTaskButton;

    @FindBy(xpath = "//iframe[contains(@id,'iframe_')]")
    public WebElement newTaskFrame;

    @FindBy(xpath = "//span[text()='New task' and @id='pagetitle']")
    public WebElement newTaskPageTitle;

    @FindBy(xpath = "//div[text()='Role: Ongoing']")
    public WebElement onGoingmessage;

    @FindBy(xpath = "//div[contains(text(),'Role: Assisting')]")
    public WebElement assistingDisplay;

    @FindBy(xpath = "//div[contains(text(),'Role: Set by me')]")
    public WebElement setByMeDisplay;

    }
