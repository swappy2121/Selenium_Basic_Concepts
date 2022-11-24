package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyErrorMessageOnFacebooklogInPage {
    @Test
    public void verifyErrorMessageOnFacebookLoginPage() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).click();
        WebElement errMsg = driver.findElement(By.xpath("//div[contains(@class,'_9ay7')]"));
        String errtext = errMsg.getText();
        System.out.println("error message is :" + errtext);
        driver.close();
    }
}
