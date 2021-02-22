package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @When("the user logs in using following credentials {string} and {string}")
    public void the_user_logs_in_using_following_credentials_and(String string, String string2) {
        new LoginPage().loginAsResourceEmp();
    }

    @Then("the user reached to portal page")
    public void the_user_reached_to_portal_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user should not be able to login with {string} and {string}")
    public void the_user_should_not_be_able_to_login_with_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should receive a warning message")
    public void the_user_should_receive_a_warning_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
