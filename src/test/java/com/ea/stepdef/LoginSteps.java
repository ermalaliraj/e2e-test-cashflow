package com.ea.stepdef;

import com.ea.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);

    public LoginPage loginPage = new LoginPage();

    @Then("Login page is shown")
    public void displayLoginPage() {
        loginPage.pageDisplayed();
    }

    @When("Inserting username {string}")
    public void insertUsername(String email) {
        loginPage.insertUsername(email);
    }

    @And("Password {string}")
    public void insertPassword(String pwd) {
        loginPage.insertPassword(pwd);
    }

    @When("Click on Login button to do the login")
    public void doLogin() {
        loginPage.doLogin();
    }

}