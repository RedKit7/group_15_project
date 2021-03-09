package com.azulcrm.step_definitions;


import com.azulcrm.pages.MyTasksPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

//Belongs to Said
// Updated by Kerim 0n 03.08
public class TasksStepDefs {

    @When("the user navigates to {string} module")
    public void the_user_navigates_to_module(String module) {
        new MyTasksPage().navigateToModule(module);
    }

    @Then("the user should be able to display tasks {string} by clicking {string} tab")
    public void the_user_should_be_able_to_display_tasks_by_clicking_tab(String expectedMessage, String tab) {

        MyTasksPage myTasksPage = new MyTasksPage();

        if (expectedMessage.equalsIgnoreCase("In Progress") & tab.equalsIgnoreCase("All Tasks")){
            myTasksPage.allTasksTab.click();
            String actualMessage = myTasksPage.inProgress.getText();
            Assert.assertEquals(expectedMessage,actualMessage);
        }else if (expectedMessage.equalsIgnoreCase("Ongoing Tasks") & tab.equalsIgnoreCase("Ongoing Tasks")){
            myTasksPage.onGoing.click();
            String actualMessage = myTasksPage.onGoingmessage.getText();
            Assert.assertEquals(expectedMessage,actualMessage);
        }

    }

    @When("the user navigates to {string} tab in My Tasks page")
    public void the_user_navigates_to_tab_in_My_Tasks_page(String tab) {
        switch(tab) {
            case "Assisting":
                new MyTasksPage().assistingTab.click();
                break;
            case "Ongoing":
                new MyTasksPage().onGoing.click();
                break;
            case "Set by me":
                new MyTasksPage().setByMeTab.click();
                break;
            case "Projects":
                new MyTasksPage().projectsTab.click();
                break;
            case "Efficiency":
                new MyTasksPage().efficiencyTab.click();
                break;
            case "Recycle Bin":
                new MyTasksPage().recycleBinTab.click();
                break;
        }
    }


    @And("the user can display {string} page")
    public void theUserCanDisplayTab(String page) {
        switch(page){
            case "Assisted Tasks":
                System.out.println(new MyTasksPage().assistingDisplay.getText());
                Assert.assertTrue(new MyTasksPage().assistingDisplay.getText().contains("Role: Assisting"));
                break;
            case "Ongoing Tasks":
                System.out.println(new MyTasksPage().onGoingmessage.getText());
                Assert.assertTrue(new MyTasksPage().onGoingmessage.getText().contains("Role: Ongoing"));
                break;
            case "Set by me Tasks":
                System.out.println(new MyTasksPage().setByMeDisplay.getText());
                Assert.assertTrue(new MyTasksPage().setByMeDisplay.getText().contains("Role: Set by me"));
                break;
            case "Projects":
                System.out.println(Driver.get().getTitle());
                Assert.assertTrue(Driver.get().getTitle().contains("Projects"));
                break;
            case "Efficiency":
                System.out.println(Driver.get().getTitle());
                Assert.assertTrue(Driver.get().getTitle().contains("Efficiency"));
                break;
            case "Recycle Bin":
                System.out.println(Driver.get().getTitle());
                Assert.assertTrue(Driver.get().getTitle().contains("Recycle Bin"));
                break;
        }
        
    }

    @Then("the user navigates to New Task page")
    public void theUserNavigatesToPage() {
        new MyTasksPage().newTaskButton.click();
    }

    @And("the New Task window is displayed")
    public void theWindowIsDisplayed() {
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(new MyTasksPage().newTaskFrame);
        BrowserUtils.waitFor(1);
        System.out.println(new MyTasksPage().newTaskPageTitle.getText());
        Assert.assertTrue(new MyTasksPage().newTaskPageTitle.getText().contains("New task"));
    }



}
