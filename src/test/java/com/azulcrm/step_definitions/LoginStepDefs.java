package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefs {
//Zeynep
    @When("the user logs in using following credentials {string} and {string}")
    public void the_user_logs_in_using_following_credentials_and(String username, String password) {
        //String userNameEnt = ConfigurationReader.get("helpdesk_username");
        //String passwordEnt = ConfigurationReader.get("helpdesk_password");
       // String userNameEnt = "<userName>";
       // String passwordEnt = "<password>";

        LoginPage loginPage =new LoginPage();
        switch (username){
            case "helpdesk_username":
                username = ConfigurationReader.get("helpdesk_username");
                password = ConfigurationReader.get("helpdesk_password");
                loginPage.userNameEntrance.sendKeys(username);
                loginPage.passwordEntrance.sendKeys(password, Keys.TAB,Keys.TAB,Keys.ENTER);
                break;
            case "human_resource_username":
                username = ConfigurationReader.get("human_resource_username");
                password = ConfigurationReader.get("human_resource_password");
                loginPage.userNameEntrance.sendKeys(username);
                loginPage.passwordEntrance.sendKeys(password, Keys.TAB,Keys.TAB,Keys.ENTER);
                break;
            case "marketing_username":
                username = ConfigurationReader.get("marketing_username");
                password = ConfigurationReader.get("marketing_password");
                loginPage.userNameEntrance.sendKeys(username);
                loginPage.passwordEntrance.sendKeys(password, Keys.TAB,Keys.TAB,Keys.ENTER);
                break;
        }
    }

    @Then("the user reached to portal page")
    public void the_user_reached_to_portal_page() {
        String userNameEnt = "<userName>";
        String passwordEnt = "<password>";

        LoginPage loginPage =new LoginPage();
        loginPage.login(userNameEnt, passwordEnt);
        Assert.assertEquals("Portal", Driver.get().getTitle());
    }

    @When("the user should not be able to login with {string} and {string}")
    public void the_user_should_not_be_able_to_login_with_and(String string, String string2) {
        String userNameEnt = "<wuser>";
        String passwordEnt = "<wpassword>";

        LoginPage loginPage =new LoginPage();
        loginPage.login(userNameEnt, passwordEnt);
        Assert.assertNotEquals("Portal", Driver.get().getTitle());
    }

    @Then("The user should receive a warning message")
    public void the_user_should_receive_a_warning_message() {
        Assert.assertTrue(new LoginPage().loginError.getText().equals("Incorrect login or password"));
    }


}
