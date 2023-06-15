package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Kaushik Patel
 */
public class VirginGames {
    @Given("^User should on homepage$")
    public void userShouldOnHomepage() {
    }

    @When("^User click on accept cookies$")
    public void userClickOnAcceptCookies() {
       new HomePage().clickOnAcceptCookies();

    }

    @And("^User click on OnlineSlots at top menu$")
    public void userClickOnOnlineSlotsAtTopMenu() {
        new HomePage().clickOnlineSlotsMenu();

    }

    @Then("^User should navigate to OnlineSlots page successfully$")
    public void userShouldNavigateToOnlineSlotsPageSuccessfully() {
        String actualtext = "Play Online Slots at Virgin Games";
        Assert.assertEquals(new OnlineSlotsPage().gettextconfirmation(),actualtext);
    }
}
