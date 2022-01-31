package com.ea.stepdef;

import com.ea.page.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LandingSteps {

    private static final Logger log = LoggerFactory.getLogger(LandingSteps.class);

    public LandingPage landingPage = new LandingPage();

    @Then("Landing page is displayed")
    public void landingPageDisplayed() {
        landingPage.landingPageDisplayed();
    }

    @When("Click on Login button")
    public void clickLoginButton() {
        landingPage.goToLoginPage();
    }

}