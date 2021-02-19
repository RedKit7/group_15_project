package com.azulcrm.step_definitions;

import com.azulcrm.pages.WorkGroupsPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WorkgroupsStepDefs {



    @When("the user clicks on join button under the groups")
    public void the_user_clicks_on_join_button_under_the_groups() {
        BrowserUtils.waitForClickablility(new WorkGroupsPage().joinButton,5);
       new WorkGroupsPage().joinButton.click();
    }

    @Then("A message as {string} should be displayed")
    public void a_message_as_should_be_displayed(String string) {
        String actual= new WorkGroupsPage().textAfterJoin.getText();
        Assert.assertTrue(string.equals(actual));
    }

    @When("the user clicks on the star next to the group name")
    public void the_user_clicks_on_the_star_next_to_the_group_name() {
        BrowserUtils.waitForClickablility(new WorkGroupsPage().star,5);
        new WorkGroupsPage().star.click();

    }

    @When("clicks on search box")
    public void clicks_on_search_box() {
        new WorkGroupsPage().searchBox.click();
    }

    @When("clicks on favorites")
    public void clicks_on_favorites() {
        BrowserUtils.waitForClickablility(new WorkGroupsPage().favorites,5);
        new WorkGroupsPage().favorites.click();
    }

    @Then("The groups which are added to favorites should be displayed")
    public void the_groups_which_are_added_to_favorites_should_be_displayed() {
       Assert.assertTrue(new WorkGroupsPage().newCorporateGroup.isDisplayed());
    }
}
