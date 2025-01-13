package com.example.pages.attendancePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class attendanceSummaryPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[4]/a")
    private WebElement attendanceButton;

    @FindBy(xpath = "//*[@id=\"attendance\"]/ul/li[4]/a")
    private WebElement summaryButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/div/div/button")
    private WebElement exportButton;

    public attendanceSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void summaryPage() throws InterruptedException {

        Thread.sleep(2000);
        attendanceButton.click();

        waitWebElement(summaryButton, driver);
        summaryButton.click();
        Assert.assertEquals(pageHeading.getText(), "Summary", "Page heading does not match!");

        waitWebElement(exportButton, driver);
        exportButton.click();

        Thread.sleep(3000);
    }
}
