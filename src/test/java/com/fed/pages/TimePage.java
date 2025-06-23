package com.fed.pages;

import com.fed.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimePage {
    WebDriver driver;
    By timefield = By.xpath(ConfigReader.get("time_Xpath"));
    By timesheetfield = By.xpath(ConfigReader.get("timesheetfield_Xpath"));
    By mytimesheetfield = By.xpath(ConfigReader.get("mytimesheetfield_Xpath"));

    public TimePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickTime(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(timefield));
        driver.findElement(timefield).click();
    }
    public void clickTimeSheets(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(timesheetfield));
        driver.findElement(timesheetfield).click();
    }
    public void clickMyTimeSheet(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mytimesheetfield));
        driver.findElement(mytimesheetfield).click();
    }
}
