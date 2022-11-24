package com.bridgelabz.AutomationWithFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Frame_Demo {
    @Test
    public void frameDemo() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("C:\\Users\\HP\\Desktop\\Page\\Page2.html");
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        driver.findElement(By.id("t1")).sendKeys("a");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("t2")).sendKeys("a");
        driver.switchTo().frame("f1");
        Thread.sleep(3000);
        driver.findElement(By.id("t1")).sendKeys("b");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("t2")).sendKeys("b");
        driver.switchTo().frame("n1");
        Thread.sleep(3000);
        driver.findElement(By.id("t1")).sendKeys("c");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("t2")).sendKeys("c");
        WebElement f = driver.findElement(By.className("c1"));
        driver.switchTo().frame(f);
        Thread.sleep(3000);
        driver.findElement(By.id("t1")).sendKeys("d");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("t2")).sendKeys("d");
        driver.close();
    }
}
