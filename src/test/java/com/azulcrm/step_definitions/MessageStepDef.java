package com.azulcrm.step_definitions;

import com.azulcrm.pages.MessagePage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MessageStepDef {

    @When("the user clicks the like button under the message")
    public void the_user_clicks_the_like_button_under_the_message() {
        BrowserUtils.waitForClickablility(new MessagePage().likeButton,5);
        new MessagePage().likeButton.click();
        //new MessagePage().likeButton.submit();
//        BrowserUtils.waitFor(1);
//
//        BrowserUtils.hover(new MessagePage().likeButton);
//        BrowserUtils.waitFor(1);
//        new MessagePage().likeEmoji.submit();
    }

    @Then("a like symbol should be displayed at the bottom of the message")
    public void aLikeSymbolShouldBeDisplayedAtTheBottomOfTheMessage() {
        BrowserUtils.waitForVisibility(new MessagePage().likeSymbol,5);
        Assert.assertTrue(new MessagePage().likeSymbol.isDisplayed());
    }

    @When("the user clicks on the star in the upper right corner of the message at the top of the page")
    public void the_user_clicks_on_the_star_in_the_upper_right_corner_of_the_message_at_the_top_of_the_page() {
        BrowserUtils.waitForClickablility(new MessagePage().favButton,5);
        new MessagePage().favButton.click();
    }

    @When("the user clicks on filter and search box")
    public void the_user_clicks_on_filter_and_search_box() {
        BrowserUtils.waitForClickablility(new MessagePage().filterAndSearch,5);
        new MessagePage().filterAndSearch.click();
    }

    @Then("the favorite message should be displayed in the opened page")
    public void the_favorite_message_should_be_displayed_in_the_opened_page() {
        BrowserUtils.waitForVisibility(new MessagePage().favMessage,5);
      Assert.assertTrue(new MessagePage().favMessage.isDisplayed());
    }

    @When("the user clicks on the more button at the bottom of the message")
    public void the_user_clicks_on_the_more_button_at_the_bottom_of_the_message() {
        BrowserUtils.waitForClickablility(new MessagePage().moreButton,5);
        new MessagePage().moreButton.click();
    }

    @When("clicks on copy Link button in the opened window")
    public void clicks_on_copy_Link_button_in_the_opened_window() {
        BrowserUtils.waitForClickablility(new MessagePage().copyLinkButton,5);
        new MessagePage().copyLinkButton.click();
    }

    @Then("the link of the message should be copied in the clipboard")
    public void theLinkOfTheMessageShouldBeCopiedInTheClipboard() {
        BrowserUtils.waitFor(1);
        try {
            Assert.assertTrue(MessagePage.readClipboard().equals("https://nextbasecrm.com/company/personal/user/694/blog/108/"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }

    @When("clicks on Add recipients button in the opened window")
    public void clicks_on_Add_recipients_button_in_the_opened_window() {
        BrowserUtils.waitForClickablility(new MessagePage().addRecButton,5);
        new MessagePage().addRecButton.click();


    }


    @Then("clicks on Employees and departments button")
    public void clicksOnEmployeesAndDepartmentsButton() {
        BrowserUtils.waitForClickablility(new MessagePage().EmployessandDepartmentsButton,5);
        new MessagePage().EmployessandDepartmentsButton.click();
    }

    @And("clicks on Mike Smith on the opened window")
    public void clicksOnMikeSmithOnTheOpenedWindow() {
        BrowserUtils.waitForClickablility(new MessagePage().MikeSmith,5);
        new MessagePage().MikeSmith.click();
    }

    @Then("Mike Smith should be displayed in To-box")
    public void mikeSmithShouldBeDisplayedInToBox() {
        BrowserUtils.waitForVisibility(new MessagePage().MikeSmithInToBox, 5);
        Assert.assertTrue(new MessagePage().MikeSmithInToBox.isDisplayed());
    }
}
