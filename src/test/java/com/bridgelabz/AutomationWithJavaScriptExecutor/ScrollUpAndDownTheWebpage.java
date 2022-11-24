package com.bridgelabz.AutomationWithJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpAndDownTheWebpage {
    @Test
    public static void scrollUpAndDown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
        driver.close();
    }

    @Test
    public static void scrollUpOperations() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }
        driver.close();
    }

    @Test
    public static void scrollDownOperation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumhq.org/download");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
        driver.close();
    }
    @Test
    public static void scrollDownOperationWithFacebook() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }
        driver.findElement(By.xpath("//a[contains(@title,'Browse our Watch videos.')]")).click();
        driver.close();
    }
}
