package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCalendarPage extends BasePage{
    public MyCalendarPage(){PageFactory.initElements(Driver.get(), this);}

    @FindBy (xpath = "//span[@id='pagetitle']")
    public WebElement pageSubTitle;

    @FindBy (xpath = "//button[contains(text(),'Add')]")
    public WebElement addNewEventButton;

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

    @FindBy (xpath = "//div[@class='calendar-grid-week-row-days-week']")
    public WebElement weeklyCalendarDaysRow;

    @FindBy (xpath = "//input[@id='calendar_slider_696528_entry_name']")
    public WebElement newEventName;

    @FindBy (xpath = "//input[@id='calendar_slider_696528_important']")
    public WebElement importantEventCheckBox;

    @FindBy (xpath = "//input[@id='calendar_slider_696528_date_from']")
    public WebElement eventStartDate;

    @FindBy (xpath = "//input[@id='calendar_slider_108287_time_from']")
    public WebElement eventStartTime;

    @FindBy (xpath = "//input[@id='calendar_slider_108287_date_to']")
    public WebElement eventEndDate;

    @FindBy (xpath = "//input[@id='calendar_slider_108287_time_to']")
    public WebElement eventEndTime;

    @FindBy (xpath = "//input[@id='calendar_slider_108287_date_full_day']")
    public WebElement allDayCheckBox;

    @FindBy (xpath = "//span[@id='calendar_slider_108287_timezone_btn']")
    public WebElement timeZoneLink;

    @FindBy (xpath = "//select[@id='calendar_slider_108287_timezone_from']")
    public WebElement timeZoneDropDownLink;

    @FindBy (xpath = "//select[@id='calendar_slider_108287_rrule_type']")
    public WebElement repeatOptionsDropDownLink;

    @FindBy (xpath = "//div[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement locationDropDownLink;

    @FindBy (xpath = "//input[@id='EC1088728518-slider-destination-inp']")
    public WebElement attendeesBox;

    @FindBy (xpath = "//div[2]/div[1]/label[1]/input[1]")
    public WebElement notificationCheckBox;

    @FindBy (xpath = "//span[@id='calendar_slider_583012_save_cmd']")
    public WebElement saveNewEventButton;

    @FindBy (xpath = "//button[@id='calendar_slider_583012_close']")
    public WebElement cancelNewEventButton;

    @FindBy (xpath = "//div[@class='calendar-day-view']")
    public WebElement calendarDayView;

    @FindBy (xpath = "//div[@class='calendar-week-view calendar-change-animate-week-to-day']")
    public WebElement calendarWeekView;

    @FindBy (xpath = "//div[@class='calendar-month-view']")
    public WebElement calendarMonthView;

    @FindBy (xpath = "//div[@class='calendar-list-view']")
    public WebElement calendarScheduleView;

    @FindBy (xpath = "//span[contains(text(),'Company Calendar')]")
    public WebElement companyCalendarLink;






















}
