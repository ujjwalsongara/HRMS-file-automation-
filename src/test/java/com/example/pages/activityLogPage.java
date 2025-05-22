package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class activityLogPage extends BasePage {

    private static final Logger log = LoggerFactory.getLogger(activityLogPage.class);
    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[5]/a")
    private WebElement activityLogButton;

    @FindBy(xpath = "//*[@id=\"activitylog\"]/ul/li/a")
    private WebElement logButton;


    public activityLogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void activityLog() throws InterruptedException {

        Thread.sleep(2000);
        activityLogButton.click();

        waitWebElement(logButton, driver);
        logButton.click();

        Thread.sleep(3000);

    }
}






