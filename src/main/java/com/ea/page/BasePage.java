package com.ea.page;

import com.ea.factory.DriverFactory;
import com.ea.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.ea.util.ElementUtil.elementClick;
import static com.ea.util.ElementUtil.waitForElementTobePresent;

public class BasePage {

    protected WebDriver driver = DriverFactory.getInstance().getWebDriver();

    public static final By XPATH_BUTTON_OK_COOKIE = By.xpath("//button[@class=\"iubenda-cs-accept-btn iubenda-cs-btn-primary\"]");

    public void startApp() {
        ElementUtil.startApp(driver);
    }

    public void acceptCookie() {
        WebElement element = waitForElementTobePresent(driver, XPATH_BUTTON_OK_COOKIE);
        elementClick(driver, element);
    }

    public void closeTheBrowser() {
        driver.quit();
    }
}
