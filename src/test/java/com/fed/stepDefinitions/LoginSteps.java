package com.fed.stepDefinitions;

import com.fed.pages.HomePage;
import com.fed.pages.LoginPage;
import com.fed.utils.BaseTest;
import com.fed.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.fed.utils.ConfigReader.get;

import static com.fed.utils.BaseTest.driver;


public class LoginSteps {
    LoginPage loginPage;
    HomePage homePage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        BaseTest.initialize();
        driver.get(get("login_url"));
        loginPage = new LoginPage(driver);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        String username = ConfigReader.get("username");
        String password = ConfigReader.get("password");
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
    }

    @And("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to the dashboard")
    public void user_should_be_redirected_to_the_dashboard() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expected = "dashboard";
        assert driver.getCurrentUrl().contains(expected);
        BaseTest.quit();
    }

    @When("user clicks on admin button")
    public void user_clicks_on_admin_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage = new HomePage(driver);
        homePage.clickAdmin();
    }
    @Then("User should be redirected to the Admin dashboard")
    public void user_should_be_redirected_to_the_admin_dashboard() {
        By Adminxpath = By.xpath(ConfigReader.get("AdminpageAdmin_xpath"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Adminxpath));
        WebElement adminHeader = driver.findElement(By.xpath(ConfigReader.get("AdminpageAdmin_xpath")));
        assert adminHeader.getText().equals("Admin");
        BaseTest.quit();
    }
}
