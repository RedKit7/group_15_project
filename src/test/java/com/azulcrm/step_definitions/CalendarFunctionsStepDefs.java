package com.azulcrm.step_definitions;

import com.azulcrm.pages.CompanyCalendarPage;
import com.azulcrm.pages.MyCalendarPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalendarFunctionsStepDefs {
    @Then("user views daily, weekly and monthly and overall schedules")
    public void user_views_daily_weekly_and_monthly_and_overall_schedules() {
        if(!Driver.get().getTitle().contains("Event")){
           MyCalendarPage myCalendarPage = new MyCalendarPage();
           BrowserUtils.waitForClickablility(myCalendarPage.dailyCalendar, 5);
           myCalendarPage.dailyCalendar.click();
           BrowserUtils.waitForVisibility(myCalendarPage.calendarDayView, 5);
           Assert.assertTrue(new MyCalendarPage().calendarDayView.isDisplayed());
           BrowserUtils.waitForClickablility(myCalendarPage.weeklyCalendar, 5);
            myCalendarPage.weeklyCalendar.click();
            BrowserUtils.waitForVisibility(myCalendarPage.calendarWeekView, 10);
            Assert.assertTrue(new MyCalendarPage().calendarWeekView.isDisplayed());
            BrowserUtils.waitForClickablility(myCalendarPage.monthlyCalendar, 5);
            myCalendarPage.monthlyCalendar.click();
            BrowserUtils.waitForVisibility(myCalendarPage.calendarMonthView, 10);
            Assert.assertTrue(new MyCalendarPage().calendarMonthView.isDisplayed());
            BrowserUtils.waitForClickablility(myCalendarPage.schedule, 5);
            myCalendarPage.schedule.click();
            BrowserUtils.waitForVisibility(myCalendarPage.calendarScheduleView, 10);
            Assert.assertTrue(new MyCalendarPage().calendarScheduleView.isDisplayed());
        }else if(Driver.get().getTitle().contains("Event")){
            CompanyCalendarPage companyCalendarPage = new CompanyCalendarPage();
            Assert.assertTrue(companyCalendarPage.pageSubTitle.getText().contains("Event Calendar"));

            BrowserUtils.waitForClickablility(companyCalendarPage.dailyCalendar, 5);
            companyCalendarPage.dailyCalendar.click();
            BrowserUtils.waitForVisibility(companyCalendarPage.companyCalDayView, 10);
            Assert.assertTrue(companyCalendarPage.companyCalDayView.isDisplayed());
            BrowserUtils.waitForClickablility(companyCalendarPage.weeklyCalendar, 5);
            companyCalendarPage.weeklyCalendar.click();
            BrowserUtils.waitForVisibility(companyCalendarPage.companyCalWeekView, 10);
            Assert.assertTrue(companyCalendarPage.companyCalWeekView.isDisplayed());
            BrowserUtils.waitForClickablility(companyCalendarPage.monthlyCalendar, 5);
            companyCalendarPage.monthlyCalendar.click();
            BrowserUtils.waitForVisibility(companyCalendarPage.companyCalMonthView, 10);
            Assert.assertTrue(companyCalendarPage.companyCalMonthView.isDisplayed());
            BrowserUtils.waitForClickablility(companyCalendarPage.schedule, 5);
            companyCalendarPage.schedule.click();
            BrowserUtils.waitForVisibility(companyCalendarPage.companyCalScheduleView, 10);
            Assert.assertTrue(companyCalendarPage.companyCalScheduleView.isDisplayed());
        }
    }

    @When("user navigates to {string} tab in My Calendar page")
    public void user_navigates_to_tab_in_My_Calendar_page(String string) {
        BrowserUtils.waitForClickablility(new MyCalendarPage().companyCalendarLink, 5);
        new MyCalendarPage().companyCalendarLink.click();
    }

    @When("user search {string}")
    public void user_search(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user adds new event to My Calendar with following info:")
    public void user_adds_new_event_to_My_Calendar_with_following_info(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @When("{string} is displayed on My Calendar page")
    public void is_displayed_on_My_Calendar_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
