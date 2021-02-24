package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyCalendarPage extends BasePage{
    public CompanyCalendarPage(){PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageSubTitle;

    @FindBy (xpath = "//span[contains(text(),'Day')]")
    public WebElement dailyCalendar;

    @FindBy (xpath = "//span[contains(text(),'Week')]")
    public WebElement weeklyCalendar;

    @FindBy (xpath = "//span[contains(text(),'Month')]")
    public WebElement monthlyCalendar;

    @FindBy (xpath = "//span[contains(text(),'Schedule')]")
    public WebElement schedule;

    @FindBy (xpath = "//h2[@class='calendar-top-title']")
    public WebElement calendarTitle;

    @FindBy (xpath = "//span[@class='calendar-day-of-week-day']")
    public WebElement dailyCalendarWeekDay;

    @FindBy (xpath = "//div[@class='calendar-day-view']")
    public WebElement companyCalDayView;

    @FindBy (xpath = "//div[contains(@class,'calendar-week-view')]")
    public WebElement companyCalWeekView;

    @FindBy (xpath = "//div[@class='calendar-month-view']")
    public WebElement companyCalMonthView;

    @FindBy (xpath = "//div[@class='calendar-list-view']")
    public WebElement companyCalScheduleView;













}
