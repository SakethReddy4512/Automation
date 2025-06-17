package com.fed.stepDefinitions;

import com.fed.pages.LoginPage;
import com.fed.utils.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.fed.utils.BaseTest.driver;


public class LoginSteps {
    LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        BaseTest.initialize();
        driver.get("https://opensource-demo.orangehrmlive.com");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String user, String pass) {
        loginPage.enterUserName(user);
        loginPage.enterPassword(pass);
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
}
