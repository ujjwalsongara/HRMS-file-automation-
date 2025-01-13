package com.example.tests;

import com.example.BaseTest;
import com.example.pages.loginPage;
import com.example.pages.homePage;
import com.example.pages.sidePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class homeTest extends BaseTest {

    private homePage homePage;
    private com.example.pages.loginPage loginPage;
    private sidePage sidePage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    @Parameters("url")
    public void homePageTest(@Optional String url) throws InterruptedException {
        log.info("test started");

        WebDriver driver = getWebDriver();

        loginPage = new loginPage(driver, url);
        loginPage.login(username, password);

        homePage = new homePage(driver);
        homePage.homeScreen();

        sidePage = new sidePage(driver);
        sidePage.sideBarPage();

    }

    @AfterTest
    public void afterTest() {
        log.info("test completed");
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
