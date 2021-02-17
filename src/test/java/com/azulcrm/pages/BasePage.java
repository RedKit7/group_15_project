package com.azulcrm.pages;

import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){PageFactory.initElements(Driver.get(), this);}

    public void getPageTitle(){
        Driver.get().getTitle();
    }



    /**
     * This method will navigate user to the specific module in AzulCRM application.
     *
     * @param module
     */
    public void navigateToModule(String module) {
        String moduleLocator = "//span[normalize-space()='"+module+"' and contains(@class,'menu-item-link')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(moduleLocator), 5);
            WebElement moduleElement = Driver.get().findElement(By.xpath(moduleLocator));
//            new Actions(Driver.get()).moveToElement(moduleElement).pause(200).doubleClick(moduleElement).build().perform();
            moduleElement.click();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(moduleLocator), 5);
        }
    }

}
