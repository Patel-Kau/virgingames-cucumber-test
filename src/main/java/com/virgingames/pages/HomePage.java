package com.virgingames.pages;


import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kaushik Patel
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@for='privacy_pref_optin']")
    WebElement acceptcookies;

    @CacheLookup
    @FindBy(xpath = "//span[@data-tracking='{\"label\":\"Online Slots\",\"section\":\"Top Nav\",\"mvtVariant\":\"\",\"mvtCampaign\":\"\"}']")
    WebElement onlineslotsmenu;

    public void clickOnAcceptCookies() {
        clickOnElement(acceptcookies);
        log.info("Clicking on Cookies Accept button  : " + acceptcookies.toString());
    }

    public void clickOnlineSlotsMenu() {
        clickOnElement(onlineslotsmenu);
        log.info("Clicking on Online Slots Menu : " + onlineslotsmenu.toString());
    }


}
