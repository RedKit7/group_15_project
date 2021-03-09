package com.azulcrm.pages;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends BasePage {
    @FindBy(xpath = "(//*[.=\"Like\"]) [1]")
    public WebElement likeButton;

    @FindBy(xpath = "/html/body/div[6]/div/div[1]")
    public WebElement likeEmoji;

    @FindBy(xpath = "//span[@data-reaction=\"like\"]")
    public WebElement likeSymbol;

    @FindBy(xpath = "//*[@id=\"log_entry_favorites_784\"]")
    public WebElement favButton;

    @FindBy(xpath = "//*[@id=\"LIVEFEED_search\"]")
    public WebElement filterAndSearch;

    @FindBy(xpath = "(//*[.=\"Favorites\"])[1]")
    public WebElement favButtonInNewWindow;

    @FindBy(xpath = "(//*[.=\"ddfsdf\"])[1]")
    public WebElement favMessage;

    @FindBy(css = "#feed-post-more-108")
    public WebElement moreButton;

    @FindBy(css = "#post-menu-784-link-text")
    public WebElement copyLinkButton;

    public static String readClipboard() throws IOException, UnsupportedFlavorException {
        return (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
    }

    @FindBy(xpath = "(//*[.=\"Add recipients\"])[2]")
    public WebElement addRecButton;

    @FindBy(xpath = "//*[@id=\"bbMrGB_last_U479\"]/div[3]/div")
    public WebElement arbenIstenefi;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item-post\"]/span[2]/span")
    public WebElement arbenInToBox;

    @FindBy(xpath = "//a[@class=\"bx-finder-box-tab bx-lm-tab-department\"]")
    public WebElement EmployessandDepartmentsButton;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[1]/div[1]/div[1]")
    public WebElement MikeSmith;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item-post\"]/span[3]/span[1]")
    public WebElement MikeSmithInToBox;

}
