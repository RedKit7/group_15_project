package com.azulcrm.step_definitions;

import com.azulcrm.pages.MyProfilePage;
import com.azulcrm.pages.PortalPage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyProfileStepDefs {


    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        Assert.assertTrue(Driver.get().getTitle().contains(string));
    }

    @Then("the user clicks on {string} in the Portal Page")
    public void the_user_clicks_on_in_the_Portal_Page(String string) {
        Driver.get().findElement(By.id(string)).click();
    }


    @When("the user clicks on {string} in the User Menu")
    public void theUserClicksOnInTheUserMenu(String userMenuItem) {

        new PortalPage().userBlockClick(userMenuItem);

    }


    @When("the Contact Information should be displayed")
    public void the_Contact_Information_should_be_displayed() {
       Assert.assertTrue(new MyProfilePage().contactInfo.getText().contains("Contact"));
    }



}
