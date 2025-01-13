package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class jobDeskPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[2]/a")
    private WebElement jobDeskButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(id = "v-pills-Leave allowance-tab")
    private WebElement leaveAllowanceButton;

    @FindBy(id = "v-pills-documents-tab")
    private WebElement documentsTabButton;

    @FindBy(id = "v-pills-Assets-tab")
    private WebElement assetsTabButton;

    @FindBy(id = "v-pills-Job History-tab")
    private WebElement jobHistoryTabButton;

    @FindBy(id = "v-pills-Bank details-tab")
    private WebElement bankDetailsTabButton;

    @FindBy(id = "v-pills-Address Details-tab")
    private WebElement addressDetailsTabButton;

    @FindBy(id = "v-pills-Emergency Contacts-tab")
    private WebElement emergencyContactsTabButton;

    @FindBy(id = "v-pills-Social Links-tab")
    private WebElement socialLinksTabButton;

    public jobDeskPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void jobDesk() throws InterruptedException {

        Thread.sleep(2000);
        jobDeskButton.click();

        Assert.assertEquals(pageHeading.getText(), "Job Desk", "Page heading does not match!");

        leaveAllowanceButton.click();

        Thread.sleep(1000);
        documentsTabButton.click();

        Thread.sleep(1000);
        assetsTabButton.click();

        Thread.sleep(1000);
        jobHistoryTabButton.click();

        Thread.sleep(1000);
        bankDetailsTabButton.click();

        Thread.sleep(1000);
        addressDetailsTabButton.click();

        Thread.sleep(1000);
        emergencyContactsTabButton.click();

        Thread.sleep(1000);
        socialLinksTabButton.click();


        Thread.sleep(3000);
    }
}
