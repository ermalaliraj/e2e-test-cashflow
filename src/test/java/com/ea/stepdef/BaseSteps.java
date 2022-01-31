package com.ea.stepdef;

import com.ea.page.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseSteps {

    private static final Logger log = LoggerFactory.getLogger(BaseSteps.class);

    public BasePage basePage = new BasePage();

    @Given("Navigate to {string} application")
    public void invokeApp(String appName) {
        basePage.startApp();
        log.debug("Navigated to {} application", appName);
    }

    @Then("Accept cookie browser")
    public void acceptCookie() {
        basePage.acceptCookie();
    }

}