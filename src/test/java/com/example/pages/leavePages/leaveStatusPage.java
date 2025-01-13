package com.example.pages.leavePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class leaveStatusPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement leaveButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[1]/a")
    private WebElement leaveStatusButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[2]/a")
    private WebElement thisWeekTab;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[3]/a")
    private WebElement lastWeekTab;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[4]/a")
    private WebElement thisMonthTab;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[5]/a")
    private WebElement lastMonthTab;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[6]/a")
    private WebElement thisYearTab;

    @FindBy(id = "leave_duration-undefined")
    private WebElement leaveDuration;

    public leaveStatusPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void leaveStatus() throws InterruptedException {

        waitWebElement(leaveButton, driver);
        leaveButton.click();

        waitWebElement(leaveStatusButton, driver);
        leaveStatusButton.click();
        Assert.assertEquals(pageHeading.getText(), "Leave Status", "Page heading does not match!");

        waitWebElement(thisWeekTab, driver);
        thisWeekTab.click();

        waitWebElement(lastWeekTab, driver);
        lastWeekTab.click();

        waitWebElement(thisMonthTab, driver);
        thisMonthTab.click();

        waitWebElement(lastMonthTab, driver);
        lastMonthTab.click();

        waitWebElement(thisYearTab, driver);
        thisYearTab.click();

        waitWebElement(leaveDuration, driver);
        leaveDuration.click();

        Thread.sleep(3000);
    }
}
