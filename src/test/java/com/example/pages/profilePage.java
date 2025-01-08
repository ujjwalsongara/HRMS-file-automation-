package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[3]/ul/li[5]")
    private WebElement profileDropdown;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[3]/ul/li[5]/div/a[1]")
    private WebElement profileScreen;

    @FindBy(id="v-pills-Change Password-tab")
    private WebElement changePasswordTab;

    public profilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }
    public void profileScreenPage() throws InterruptedException {

        waitWebElement(profileDropdown, driver);
        profileDropdown.click();

        waitWebElement(profileScreen, driver);
        profileScreen.click();

        changePasswordTab.click();

        Thread.sleep(3000);
    }
}
