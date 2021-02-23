package com.azulcrm.step_definitions;


import com.azulcrm.pages.MyTasksPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

//Belongs to Said
public class TasksStepDefs {

    @When("the user navigates to {string} module")
    public void the_user_navigates_to_module(String string) {

        if (string.equalsIgnoreCase("Tasks")){
            new MyTasksPage().tasksModule.click();
        }

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

        if (tab.equalsIgnoreCase("Ongoing")){
            new MyTasksPage().onGoing.click();
        }
    }


}
