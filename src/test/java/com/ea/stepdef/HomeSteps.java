package com.ea.stepdef;

import com.ea.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class HomeSteps {

    private static final Logger log = LoggerFactory.getLogger(HomeSteps.class);

    public HomePage homePage = new HomePage();

    @Then("Home page is shown")
    public void loginPageDisplayed() {
        homePage.homePageDisplayed();
    }

}