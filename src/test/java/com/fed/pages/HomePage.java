package com.fed.pages;

import com.fed.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By adminField = By.xpath(ConfigReader.get("Admin_xpath"));

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickAdmin(){
        driver.findElement(adminField).click();
    }
}
