package com.azulcrm.step_definitions;

import com.azulcrm.pages.WorkGroupsPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WorkgroupsStepDefs {



    @When("the user clicks on join button under the groups")
    public void the_user_clicks_on_join_button_under_the_groups() {
        BrowserUtils.waitForClickablility(new WorkGroupsPage().joinButton,5);
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(new WorkGroupsPage().joinButton);
       //new WorkGroupsPage().joinButton.submit();
       /*
       List<WebElement> myList=new ArrayList<>();
       String forWEJoinButton= "#bx-sonet-groups-request-";
       int i=1;
       while (true) {
           String forWEButtonFinal=forWEJoinButton+i;
           WebElement w=Driver.get().findElement(By.cssSelector("#"+forWEButtonFinal));
           if(w.isDisplayed()) {
               myList.add(w);
           }
       }

        */
    }

    @Then("A message as {string} should be displayed")
    public void a_message_as_should_be_displayed(String string) {
        BrowserUtils.waitFor(1);
        String actual= Driver.get().findElement(By.xpath("//*[@id=\"bx-sonet-groups-request-sent-8\"]")).getText();
        System.out.println(actual);
        System.out.println(string);;
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
