package com.fed.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public static WebDriver driver;

    public static void initialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void quit() {
        driver.quit();
    }
}
