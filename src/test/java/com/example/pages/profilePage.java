package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profilePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[3]/ul/li[5]")
    private WebElement profileDropdown;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[1]/nav/div/div/div[3]/ul/li[5]/div/a[1]")
    private WebElement profileScreen;

    @FindBy(xpath = "//*[@id=\"Personal Details-0\"]/div[1]/div")
    private WebElement editButton;

    @FindBy(id = "input-text-first-name")
    private WebElement nameInput;

    @FindBy(id = "input-text-last-name")
    private WebElement lastName;

    @FindBy(id = "input-text-email")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"Personal Details-0\"]/div[2]/form/div[4]/div/div[2]/div/div/label[1]")
    private WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"input-text-contact\"]/input")
    private WebElement contactButton;

    @FindBy(id = "input-text-address")
    private WebElement addressInput;

    @FindBy(xpath = "//*[@id=\"Personal Details-0\"]/div[2]/form/div[7]/div/div[2]/div/span/div[1]/div/input")
    private WebElement dateOfBirthInput;

    @FindBy(id = "userProfileInfo.profile.about_me")
    private WebElement aboutInput;

    @FindBy(xpath = "//*[@id=\"Personal Details-0\"]/div[2]/form/div[9]/button[1]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"Personal Details-0\"]/div[2]/form/div[9]/button[2]")
    private WebElement cancelButton;


    @FindBy(id="v-pills-Change Password-tab")
    private WebElement changePasswordTab;

    @FindBy(id = "v-pills-Activity Log-tab")
    private WebElement activityLogButton;

    public profilePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getWebDriver(), this);
    }
    public void profileScreenPage() throws InterruptedException {

        waitWebElement(profileDropdown, driver);
        profileDropdown.click();

        waitWebElement(profileScreen, driver);
        profileScreen.click();

        editButton.click();
        Thread.sleep(3000);

        nameInput.click();
        nameInput.clear();
        nameInput.sendKeys("ujjwal");

        lastName.click();
        lastName.clear();
        lastName.sendKeys("songara");

        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("ujjwal.infowind@gmail.com");

        radioButton.click();

        contactButton.click();
        contactButton.sendKeys("1234567890");

        addressInput.click();
        addressInput.sendKeys("abc hello world");

        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys("01/01/1887");

        aboutInput.click();
        aboutInput.sendKeys("Automation testing tools are essential in modern software development as they help streamline testing processes, reduce manual effort, and improve efficiency. Tools like Selenium, JUnit, and TestNG provide powerful frameworks for automating web and unit tests, ensuring faster and more reliable releases. Selenium is a widely used open-source tool for automating browsers, capable of simulating user interactions across different browsers and platforms. JUnit and TestNG are testing frameworks that integrate well with Selenium, allowing for structured test execution, parallel test runs, and robust reporting. For continuous integration, tools like Jenkins automate the entire build and test cycle, ensuring that code changes are continuously validated. Appium is another excellent tool for automating mobile applications, supporting both Android and iOS platforms. Together, these tools form a comprehensive ecosystem that enhances test coverage, accelerates development cycles, and ensures software quality through automated testing.");

        cancelButton.click();

//        Actions actions = new Actions(driver);
//        actions.moveToElement(radioButton).click().perform();


//        changePasswordTab.click();
//
//        activityLogButton.click();


        Thread.sleep(9000);
    }
}
