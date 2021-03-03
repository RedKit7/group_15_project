package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;

public class DefaultLoginStefDefs {

    @Given("user logs in with valid user info")
    public void user_logs_in_with_valid_user_info() {
        BrowserUtils.waitFor(1);
        new LoginPage().login();
    }

}
