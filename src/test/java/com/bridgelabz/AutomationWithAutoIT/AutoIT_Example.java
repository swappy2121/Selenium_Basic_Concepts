package com.bridgelabz.AutomationWithAutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class AutoIT_Example {
    @Test
    public void autoIT_Example() throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.filemail.com/share/upload-file");
        Thread.sleep(3000);
        driver.findElement(By.id("addBtn")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\auto_IT\\autoIT_Example.exe");
        driver.close();
    }
}
