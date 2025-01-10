package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class leaveCalendarPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement leaveButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[3]/a")
    private WebElement calendarButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    public leaveCalendarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(),this);
    }

    public void calendarPage () throws InterruptedException {
        Thread.sleep(2000);
        leaveButton.click();

        waitWebElement(calendarButton, driver);
        calendarButton.click();
        Assert.assertEquals(pageHeading.getText(), "Calendar", "Page heading does not match!");

        Thread.sleep(3000);
    }
}
