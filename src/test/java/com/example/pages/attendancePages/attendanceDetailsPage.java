package com.example.pages.attendancePages;

import com.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class attendanceDetailsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[4]/a")
    private WebElement attendanceButton;

    @FindBy(xpath = "//*[@id=\"attendance\"]/ul/li[3]/a")
    private WebElement attendanceDetailsButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div/div[3]/div/div/div[2]/div[1]/div[2]/h6")
    WebElement userNameHeading;

    public attendanceDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void DetailsPage() throws InterruptedException {
        Thread.sleep(2000);
        attendanceButton.click();

        waitWebElement(attendanceDetailsButton, driver);
        attendanceDetailsButton.click();
        Assert.assertEquals(pageHeading.getText(), "Attendance Details", "Page heading does not match!");
        Assert.assertEquals(userNameHeading.getText(), "Shalini Choudhary", "Page heading does not match!");

        Thread.sleep(3000);
    }
}
