package com.azulcrm.step_definitions;

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
            BrowserUtils.waitForVisibility(myCalendarPage.dailyCalendar, 5);
           Assert.assertTrue(new MyCalendarPage().dailyCalendarWeekDay.isDisplayed());
        }else{
            System.out.println("Work in progress!");
        }

    }

    @When("user navigates to {string} tab in My Calendar page")
    public void user_navigates_to_tab_in_My_Calendar_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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
