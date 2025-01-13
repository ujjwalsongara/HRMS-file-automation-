package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[3]/ul/li[5]")
    private WebElement profileDropdown;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[3]/ul/li[5]/div/a[3]")
    private WebElement logoutButton;

    public logoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void logoutScreen() {

        waitWebElement(profileDropdown, driver);
        profileDropdown.click();

        waitWebElement(logoutButton, driver);
        logoutButton.click();

    }
}
