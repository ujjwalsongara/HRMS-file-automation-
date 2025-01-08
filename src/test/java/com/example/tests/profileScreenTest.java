package com.example.tests;

import com.example.BaseTest;
import com.example.pages.loginPage;
import com.example.pages.logoutPage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;


public class profileScreenTest extends BaseTest{

    private com.example.pages.loginPage loginPage;
    private logoutPage LogoutPage;
    private Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test
    @Parameters("url")
    public void homePageTest (@Optional String url) throws InterruptedException {
        log.info("test started");

        WebDriver driver = getWebDriver();

        loginPage = new loginPage(driver, url);
        loginPage.login(username,password);

        LogoutPage = new logoutPage(driver);
        LogoutPage.employeeDropDownScreen();

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
