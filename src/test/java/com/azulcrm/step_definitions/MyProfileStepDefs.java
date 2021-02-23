package com.azulcrm.step_definitions;

import com.azulcrm.pages.MyProfilePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyProfileStepDefs {


    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitle) {

        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @Then("the user clicks on {string} in the Portal Page")
    public void the_user_clicks_on_in_the_Portal_Page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks on {string} in the User Menu")
    public void the_user_clicks_on_in_the_User_Menu(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
