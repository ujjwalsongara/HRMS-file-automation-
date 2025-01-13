package com.example.tests;

import com.example.BaseTest;
import com.example.pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class loginTest extends BaseTest {

    private com.example.pages.loginPage loginPage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    @Parameters("url")
    public void FirstTest(@Optional String url) throws InterruptedException {
        log.info("test started");

        WebDriver driver = getWebDriver();

        loginPage = new loginPage(driver, url);
        loginPage.login(username, password);

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