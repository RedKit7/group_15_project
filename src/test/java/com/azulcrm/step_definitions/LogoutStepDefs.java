package com.azulcrm.step_definitions;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LogoutStepDefs {

    @Then("user logs out from portal")
    public void user_logs_out_from_portal() {
        BrowserUtils.waitForVisibility(By.xpath("//div[@id='user-block']"), 5);
        Driver.get().findElement(By.xpath("//div[@id='user-block']")).click();
        BrowserUtils.waitForClickablility(By.xpath("//span[contains(text(),'Log out')]"), 5);
        Driver.get().findElement(By.xpath("//span[contains(text(),'Log out')]")).click();
        Assert.assertTrue(Driver.get().getTitle().equals("Authorization"));
    }
}
