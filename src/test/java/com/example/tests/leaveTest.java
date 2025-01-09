package com.example.tests;

import com.example.BaseTest;
import com.example.pages.jobDeskPage;
import com.example.pages.leavePage;
import com.example.pages.loginPage;
import com.example.pages.logoutPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class leaveTest extends BaseTest {

    private com.example.pages.loginPage loginPage;
    private com.example.pages.leavePage leavePage;
    private com.example.pages.logoutPage logoutPage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    @Parameters("url")
    public void leaveTabTest(@Optional String url) throws InterruptedException {
        log.info("test started");
        WebDriver driver = getWebDriver();

        loginPage = new loginPage(driver, url);
        loginPage.login(username,password);

        leavePage = new leavePage(driver);
        leavePage.leaveTab();

        logoutPage = new logoutPage(driver);
        logoutPage.logoutScreen();
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
