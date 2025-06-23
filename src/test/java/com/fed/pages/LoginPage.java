package com.fed.pages;

import com.fed.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;

    By usernameField = By.xpath(ConfigReader.get("username_xpath"));
    By passwordField = By.xpath(ConfigReader.get("password_xpath"));
    By loginButton   = By.xpath(ConfigReader.get("login_button_xpath"));
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterUserName(String user){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        driver.findElement(usernameField).sendKeys(user);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
