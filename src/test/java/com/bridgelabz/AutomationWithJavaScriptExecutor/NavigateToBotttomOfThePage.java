package com.bridgelabz.AutomationWithJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateToBotttomOfThePage {
    @Test
    public void navigateToBottomOfThePage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.id("email"));
        int x = element.getLocation().getX();
        int y = element.getLocation().getY();
        System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(3000);
        element.click();
        driver.close();
    }
}
