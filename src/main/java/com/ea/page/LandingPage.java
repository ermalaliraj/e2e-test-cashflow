package com.ea.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.ea.util.ElementUtil.elementClick;
import static com.ea.util.ElementUtil.waitForElementTobePresent;

public class LandingPage extends BasePage {

    public static final By XPATH_LOGO = By.xpath("//img[@class='lnXdpd']");
    public static final By XPATH_BUTTON_LOGIN = By.xpath("//a[contains(text(),'accedi')]/ancestor::div[contains(@class, 'et_pb_module')]");

    public void landingPageDisplayed() {
    }

    public void goToLoginPage() {
        WebElement element = waitForElementTobePresent(driver, XPATH_BUTTON_LOGIN);
        elementClick(driver, element);
    }
}