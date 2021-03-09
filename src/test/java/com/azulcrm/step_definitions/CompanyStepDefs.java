package com.azulcrm.step_definitions;

import com.azulcrm.pages.CompanyPage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CompanyStepDefs {


    CompanyPage pageObject = new CompanyPage();

    @When("the user clicks on {string} button in Company Page")
    public void the_user_clicks_on_button_in_Company_Page(String string) {

        pageObject.companyNews(string);

    }

    @Then("the user should be able to see Add News Pop-up Window")
    public void the_user_should_be_able_to_see_Add_News_Pop_up_Window() {
       Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(pageObject.previewText.isDisplayed());

    }

    @When("the user clicks on {string} tab in Company Page")
    public void the_user_clicks_on_tab_in_Company_Page(String string) {

        new CompanyPage().navigateToCompanyTabs(string);

    }

    @Then("the user should be able to see {string} tab in About Company Window")
    public void the_user_should_be_able_to_see_History_tab_in_About_Company_Window(String string) {

        String firstUrl = Driver.get().getCurrentUrl();
        pageObject.navigateToCompanyTabs(string);
        Assert.assertNotEquals(Driver.get().getCurrentUrl(),firstUrl);

    }

    @Then("the user should be able to click {string} button in the upper right corner in Company Tabs")
    public void the_user_should_be_able_to_click_button_in_the_upper_right_corner_in_Company_Tabs(String string) {

        pageObject.companyNews(string);

    }

    @Then("the user should be able to see RSS Feed as header title")
    public void the_user_should_be_able_to_see_RSS_Feed_as_header_title() {

        Assert.assertTrue(pageObject.RssFeedHeaderTitle.isDisplayed());

    }





}
