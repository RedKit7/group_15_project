package com.azulcrm.step_definitions;

import com.azulcrm.pages.CompanyDrivePage;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class DriveFunctionsStepDefs {

@Given("{string} window should be displayed")
    public void windowShouldBeDisplayed(String str) {

            try{
                switch (str) {
                    case "My Drive":
                       new CompanyDrivePage().myDriveButton.click();
                        break;

                    case "Company Drive":
                        new CompanyDrivePage().companyDriveButton.click();
                        break;
                }
            }catch (Exception e){

            }
    }

@Then("as the title {string} should be displayed")
    public void asTheTitleShouldBeDisplayed(String str) {

            Assert.assertEquals(str,Driver.get().getTitle());
    }

}


