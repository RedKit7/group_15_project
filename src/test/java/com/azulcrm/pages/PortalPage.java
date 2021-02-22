package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class PortalPage extends BasePage{
    public PortalPage(){PageFactory.initElements(Driver.get(), this);}
}
