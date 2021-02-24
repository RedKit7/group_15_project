package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkGroupsPage extends BasePage{



    @FindBy (css = "#bx-sonet-groups-request-8")
    public WebElement joinButton;

    @FindBy (xpath = "//*[@id=\"bx-sonet-groups-request-sent-8\"]/text()")
    public WebElement textAfterJoin;
    @FindBy(css="#bx-sonet-groups-favorites-8")
    public WebElement star;

    @FindBy (css="#SONET_GROUP_LIST_search")
    public WebElement searchBox;

     @FindBy (xpath = "//*[.=\"Favorites\"]")
    public WebElement favorites;

     @FindBy (linkText = "\"New Corporate Identity\" project")
    public WebElement newCorporateGroup;


}
