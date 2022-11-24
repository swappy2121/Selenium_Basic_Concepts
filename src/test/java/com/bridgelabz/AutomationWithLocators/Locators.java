package com.bridgelabz.AutomationWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Locators {
    @Test
    public void testingSignUpCreditionals() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement linkText = driver.findElement(By.linkText("Create New Account"));
        System.out.println(linkText);
        linkText.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        Thread.sleep(2000);
        System.out.println(firstName);
        firstName.sendKeys("Swapnil");
        WebElement input = driver.findElement(By.tagName("input"));
        Thread.sleep(2000);
        System.out.println(input);
        WebElement className = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
        Thread.sleep(2000);
        System.out.println(className);
        driver.navigate().back();
        WebElement partialLinkText = driver.findElement(By.partialLinkText("Create New"));
        System.out.println(partialLinkText);
        partialLinkText.click();
        Thread.sleep(2000);
        WebElement xpath = driver.findElement(By.xpath("//input[@name='email']"));
        System.out.println(xpath);
        Thread.sleep(2000);
        driver.close();
    }
}
