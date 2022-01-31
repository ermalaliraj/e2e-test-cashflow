package com.ea.stepdef;

import com.ea.page.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeSteps {

    private static final Logger log = LoggerFactory.getLogger(HomeSteps.class);

    public HomePage homePage = new HomePage();

    @Then("Home page is shown")
    public void loginPageDisplayed() {
        homePage.homePageDisplayed();
    }

    @When("Click on new entry")
    public void clickOnNewEntry() {
        log.debug("Go on, open the popup");
    }

    @Then("New entry popup is shown")
    public void newEntryPopupIsShown() {
        log.debug("Check if popup did showed up");
    }

}