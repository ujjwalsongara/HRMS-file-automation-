package com.example.pages.leavePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leavePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[3]/a")
    private WebElement leaveButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[1]/a")
    private WebElement leaveStatusButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[2]/a")
    private WebElement leaveRequestButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[3]/a")
    private WebElement calendarButton;

    @FindBy(xpath = "//*[@id=\"leave\"]/ul/li[4]/a")
    private WebElement summaryButton;

    public leavePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);

    }

    public void leaveTab() throws InterruptedException {

        Thread.sleep(2000);
        leaveButton.click();

        Thread.sleep(1000);
        leaveStatusButton.click();

        Thread.sleep(1000);
        leaveRequestButton.click();

        Thread.sleep(1000);
        calendarButton.click();

        Thread.sleep(1000);
        summaryButton.click();

        Thread.sleep(3000);
    }
}
