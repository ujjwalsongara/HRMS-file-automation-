package com.example.pages.attendancePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class attendanceDailyLogPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[4]/a")
    private WebElement attendanceButton;

    @FindBy(xpath = "//*[@id=\"attendance\"]/ul/li[1]/a")
    private WebElement dailyLogButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;


    public attendanceDailyLogPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void dailyLogPage() throws InterruptedException {

        Thread.sleep(2000);
        attendanceButton.click();

        waitWebElement(dailyLogButton, driver);
        dailyLogButton.click();
        Assert.assertEquals(pageHeading.getText(), "Daily Log", "Page heading does not match!");

        Thread.sleep(3000);
    }
}
