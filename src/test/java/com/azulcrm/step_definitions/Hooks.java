package com.azulcrm.step_definitions;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().deleteAllCookies();
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(1);
    }

    @After
    public void tearDown(Scenario scenario){
//        if(scenario.isFailed()){
//            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "screenshot");
//        }
//        Driver.closeDriver();
    }
}
