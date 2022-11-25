package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SimpleALertPopup {
    @Test
    public void acceptingAlertPopup() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        driver.findElement(By.name("alertbox")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        driver.close();
    }
}
