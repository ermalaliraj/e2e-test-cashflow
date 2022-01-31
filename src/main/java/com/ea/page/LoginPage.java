package com.ea.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.ea.util.ElementUtil.elementChangeValue;
import static com.ea.util.ElementUtil.elementClick;
import static com.ea.util.ElementUtil.waitForElementTobePresent;

public class LoginPage extends BasePage {

    public static final By XPATH_USERNAME_LABLE = By.xpath("//label[@for='username']");
    public static final By XPATH_USERNAME_INPUT = By.xpath("//input[@id='username']");
    public static final By XPATH_PASSWORD_LABLE = By.xpath("//label[@for='password']");
    public static final By XPATH_PASSWORD_INPUT = By.xpath("//input[@id='password']");
    public static final By XPATH_BUTTON_LOGIN = By.xpath("//button[@jhitranslate='login.form.button']");

    public void pageDisplayed() {
        WebElement usernameLabel = waitForElementTobePresent(driver, XPATH_USERNAME_LABLE);
        WebElement passwordLabel = waitForElementTobePresent(driver, XPATH_PASSWORD_LABLE);
    }

    public void insertUsername(String email) {
        WebElement usernameInput = waitForElementTobePresent(driver, XPATH_USERNAME_INPUT);
        elementChangeValue(usernameInput, email);
    }

    public void insertPassword(String pwd) {
        WebElement passwordInput = waitForElementTobePresent(driver, XPATH_PASSWORD_INPUT);
        elementChangeValue(passwordInput, pwd);
    }

    public void doLogin() {
        WebElement submit = waitForElementTobePresent(driver, XPATH_BUTTON_LOGIN);
        elementClick(driver, submit);
    }

}