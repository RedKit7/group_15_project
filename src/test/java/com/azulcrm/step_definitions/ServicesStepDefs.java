package com.azulcrm.step_definitions;

import com.azulcrm.pages.ServicesPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ServicesStepDefs {

    @Then("the user navigates to {string} tab in Meeting Rooms page")
    public void the_user_navigates_to_tab_in_Meeting_Rooms_page(String tab) {

        new ServicesPage().clickModule(tab);

    }



    @Then("the user should be able see Find input")
    public void the_user_should_be_able_see_Find_input() {

        Assert.assertTrue(new ServicesPage().findInput.isDisplayed());

    }


    @When("the user navigates to {string} tab in Course list page")
    public void the_user_navigates_to_tab_in_Course_list_page(String tab) {

        new ServicesPage().clickModule(tab);

    }
}
