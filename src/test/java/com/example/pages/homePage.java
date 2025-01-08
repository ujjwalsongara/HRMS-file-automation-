package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class homePage extends BasePage {

    @FindBy(id = "notificationDropdown")
    private WebElement notificationButton;

    @FindBy(id = "languageDropdown")
    private WebElement langButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[1]/button[1]")
    private WebElement dropdownButton;


    public homePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);

    }

    public void homeScreen() throws InterruptedException {

        waitWebElement(notificationButton ,driver);
        notificationButton.click();
        Assert.assertTrue(notificationButton.isEnabled(), "notification button is not enabled");

        waitWebElement(langButton, driver);
        langButton.click();
        Assert.assertTrue(langButton.isEnabled() ,"language buttons not enabled");


        waitWebElement(dropdownButton, driver);
//        dropdownButton.click();

        Actions actions = new Actions(driver);
//        actions.doubleClick(dropdownButton).perform();
        actions.moveToElement(dropdownButton).click().pause(10).click().pause(10).click().perform();



        Thread.sleep(3000);
    }
}
