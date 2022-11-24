package com.bridgelabz.WebelementInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RemoveValueFromTextUsingClearMethod {
    @Test
    public void removingValueFromTextField() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        String value = driver.findElement(By.id("email")).getAttribute("value");
        System.out.println("Value present inside the text box is : "+value);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Swapnil");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        Thread.sleep(2000);
        driver.close();
    }
}
