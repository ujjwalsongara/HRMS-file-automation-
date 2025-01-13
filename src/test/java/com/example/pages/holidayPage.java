package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class holidayPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[6]/a")
    private WebElement holidayButton;

    @FindBy(tagName = "h4")
    WebElement pageHeading;

    public holidayPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void holiday() throws InterruptedException {
        Thread.sleep(2000);
        holidayButton.click();
        Assert.assertEquals(pageHeading.getText(), "Holiday", "Page heading does not match!");

        Thread.sleep(3000);
    }

}
