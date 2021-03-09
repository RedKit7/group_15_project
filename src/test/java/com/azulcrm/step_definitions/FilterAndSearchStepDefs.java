package com.azulcrm.step_definitions;

import com.azulcrm.pages.FilterAndSearchPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class FilterAndSearchStepDefs {

    @Then("user should be able to click Filter and Search box")
    public void user_should_be_able_to_click_Filter_and_Search_box() {
       new FilterAndSearchPage().filterAndSearchButton.click();
       BrowserUtils.waitFor(1);
    }


    @Given("the user should be able to select {string} from Date section")
    public void theUserShouldBeAbleToSelectFromDateSection(String dateType) {
/*
     new FilterAndSearchPage().dateButton.click();
        BrowserUtils.waitFor(1);

        List<WebElement> dateOptions = Driver.get().findElements(By.xpath("//body/div[@id='LIVEFEED_search_container']/div[@id='popup-window-content-LIVEFEED_search_container']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        for (WebElement dateOption : dateOptions) {
            System.out.println("dateOption.getText() = " + dateOption.getText());
        }
        */
    }
    @And("the user should be able to select a {string} from Last N days")
    public void theUserShouldBeAbleToSelectAFromLastNDays(String arg0) {
    }
    @Then("the user should be able to select a {string} and a {string} from Month")
    public void theUserShouldBeAbleToSelectAAndAFromMonth(String arg0, String arg1) {
    }
    @Then("the user should be able to select a {string} and a {string} from Quarter")
    public void theUserShouldBeAbleToSelectAAndAFromQuarter(String arg0, String arg1) {
    }
    @Then("the user should be able to select a {string} from year")
    public void theUserShouldBeAbleToSelectAFromYear(String arg0) {
    }
    @Then("the user should be able to select a valid {string} from exact date")
    public void theUserShouldBeAbleToSelectAValidFromExactDate(String arg0) {
    }
    @Then("the user should not be able to select an invalid {string} from exact date")
    public void theUserShouldNotBeAbleToSelectAnInvalidFromExactDate(String arg0) {
    }
    @Then("the user should be able to select a valid range between {string} and {string}")
    public void theUserShouldBeAbleToSelectAValidRangeBetweenAnd(String arg0, String arg1) {
    }
    @Then("the user should not be able to select an invalid range between {string} and {string}")
    public void theUserShouldNotBeAbleToSelectAnInvalidRangeBetweenAnd(String arg0, String arg1) {
    }


    @Given("the user should be able to select one or more {string} from Type section")
    public void theUserShouldBeAbleToSelectOneOrMoreFromTypeSection(String type) {
        new FilterAndSearchPage().typeAllButton.click();
        BrowserUtils.waitFor(1);
        new FilterAndSearchPage().typeMethod(type).click();
        new FilterAndSearchPage().searchButton.click();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(new FilterAndSearchPage().typeConfirm.getText().contains(type));
    }


    @Given("the user should be able to search by {string}")
    public void theUserShouldBeAbleToSearchBy(String author) {

        new FilterAndSearchPage().authorButton.sendKeys(author);
        BrowserUtils.waitFor(2);
        new FilterAndSearchPage().clickAuthor(author);
        BrowserUtils.waitFor(1);
        new FilterAndSearchPage().searchButton.click();
        BrowserUtils.waitFor(1);

        Assert.assertTrue(author,new FilterAndSearchPage().searchVerificationAuthor().contains(author));
    }

    @Given("the user should be able to search by {string} from To")
    public void theUserShouldBeAbleToSearchByFromTo(String To) {

        new FilterAndSearchPage().toButton.sendKeys(To);
        BrowserUtils.waitFor(2);
        new FilterAndSearchPage().clickTo(To);
        BrowserUtils.waitFor(1);
        new FilterAndSearchPage().searchButton.click();
        BrowserUtils.waitFor(1);
        Assert.assertTrue(To,new FilterAndSearchPage().searchVerificationTo().contains(To));
    }

    @Given("the user should be able to add {string}")
    public void theUserShouldBeAbleToAdd(String fieldName) {

        new FilterAndSearchPage().restoreFields.click();
        BrowserUtils.waitFor(1);
        new FilterAndSearchPage().addFieldButton.click();
        new FilterAndSearchPage().addFields(fieldName);
        BrowserUtils.waitFor(1);
        // Assert.assertTrue(new FilterAndSearchPage().confirmAddFields(fieldName).contains(fieldName));
    }

    @Given("the user should be able to search with one of {string}")
    public void theUserShouldBeAbleToSearchWithOneOf(String followings) {

        new FilterAndSearchPage().searchFollowings(followings);
        BrowserUtils.waitFor(1);
        Assert.assertEquals(followings,new FilterAndSearchPage().verifySearchFollowings(followings));
    }


    @Given("the user should be able to click Save Filter button")
    public void theUserShouldBeAbleToClickSaveFilterButton() {
        new FilterAndSearchPage().saveFilterButton.click();
    }

    @Then("the user should be able to give {string} and click save button")
    public void theUserShouldBeAbleToGive(String anyName) {
        new FilterAndSearchPage().filterNameBox.sendKeys(anyName);
        new FilterAndSearchPage().saveButton.click();
        Assert.assertEquals(anyName,new FilterAndSearchPage().filterName(anyName));
    }



}
