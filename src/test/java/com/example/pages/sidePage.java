package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sidePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[2]/a")
    private WebElement jobDeskButton;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement leaveButton;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[4]/a")
    private WebElement attendanceButton;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[5]/a")
    private WebElement activityLogButton;

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[6]/a")
    private WebElement holidayButton;

    public sidePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void sideBarPage() throws InterruptedException {

        waitWebElement(jobDeskButton, driver);
        jobDeskButton.click();

        Thread.sleep(2000);
        waitWebElement(leaveButton, driver);
        leaveButton.click();

        Thread.sleep(2000);
        waitWebElement(attendanceButton, driver);
        attendanceButton.click();

        Thread.sleep(2000);
        waitWebElement(activityLogButton, driver);
        activityLogButton.click();

        Thread.sleep(2000);
        waitWebElement(holidayButton, driver);
        holidayButton.click();

        Thread.sleep(3000);
    }
}
