package com.ea.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.ea.util.ElementUtil.waitForElementTobePresent;

public class HomePage extends BasePage {

    public static final By XPATH_LOGO = By.xpath("//a[@class='navbar-brand logo']");
    public static final By MENU = By.id("navbarResponsive");
    public static final By MENU_ITEMS = By.xpath("//li[contains(@class, 'nav-item')]");

    public static final By XPATH_ACTIONS_SECTION_BUTTONS_SAVE = By.xpath("(//div[contains(@class, 'toolbar-container')]//button[not(@hidden)])[1]");
    public static final By XPATH_ACTIONS_SECTION_BUTTONS_NEW = By.xpath("(//div[contains(@class, 'toolbar-container')]//button[not(@hidden)])[2]");
    public static final By XPATH_ACTIONS_SECTION_BUTTONS_VIEW = By.xpath("(//div[contains(@class, 'toolbar-container')]//button[not(@hidden)])[3]");
    public static final By XPATH_ACTIONS_SECTION_BUTTONS_CONSOLIDATE = By.xpath("(//div[contains(@class, 'toolbar-container')]//button[not(@hidden)])[4]");

    public void homePageDisplayed() {
        WebElement logoElement = waitForElementTobePresent(driver, XPATH_LOGO);
        WebElement menuElement = waitForElementTobePresent(driver, MENU);
        WebElement menuItemsElement = waitForElementTobePresent(driver, MENU_ITEMS);
        WebElement saveButtonElement = waitForElementTobePresent(driver, XPATH_ACTIONS_SECTION_BUTTONS_SAVE);
        WebElement newButtonElement = waitForElementTobePresent(driver, XPATH_ACTIONS_SECTION_BUTTONS_NEW);
        WebElement viewButtonElement = waitForElementTobePresent(driver, XPATH_ACTIONS_SECTION_BUTTONS_VIEW);
        WebElement consolidateButtonElement = waitForElementTobePresent(driver, XPATH_ACTIONS_SECTION_BUTTONS_CONSOLIDATE);
    }

}