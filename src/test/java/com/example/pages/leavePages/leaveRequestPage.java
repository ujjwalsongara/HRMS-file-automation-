package com.example.pages.leavePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class leaveRequestPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement leaveButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[2]/a")
    private WebElement leaveRequestButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(id = "dropdownMenuButton")
    private WebElement dropDownButton;

    @FindBy(id = "leave_duration-leave-request-table")
    private WebElement leaveDurationButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/span/div/div[1]/div")
    private WebElement applyBetweenButton;

    @FindBy(id = "rejected-leave-request-table")
    private WebElement seeRejectButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/div/button")
    private WebElement requestLeaveButton;


    public leaveRequestPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void LeaveRequest() throws InterruptedException {
        Thread.sleep(2000);
        leaveButton.click();

        waitWebElement(leaveRequestButton, driver);
        leaveRequestButton.click();
        Assert.assertEquals(pageHeading.getText(), "Leave Request", "Page heading does not match!");

        waitWebElement(dropDownButton, driver);
        dropDownButton.click();

        waitWebElement(leaveDurationButton, driver);
        leaveDurationButton.click();

        waitWebElement(applyBetweenButton, driver);
        applyBetweenButton.click();

        waitWebElement(seeRejectButton, driver);
        seeRejectButton.click();

        waitWebElement(requestLeaveButton, driver);
        requestLeaveButton.click();

        Thread.sleep(3000);

    }
}
