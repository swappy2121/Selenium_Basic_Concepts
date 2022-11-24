package com.bridgelabz.ParallelExecutionThroughBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
    @Test
    public void chromeBrowserExecution() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.facebook.com/");
        driver1.manage().window().maximize();
        driver1.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);
        driver1.findElement(By.name("pass")).sendKeys("Sopi@1234");
        Thread.sleep(2000);
        driver1.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver1.close();
    }
    @Test
    public void fireFoxBrowser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.facebook.com/");
        driver2.manage().window().maximize();
        driver2.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);
        driver2.findElement(By.name("pass")).sendKeys("Sopi@1234");
        Thread.sleep(2000);
        driver2.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver2.close();
    }
    @Test
    public void microsoftEdgeExecution() throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Selenium\\msedgedriver.exe");
        WebDriver driver3 = new EdgeDriver();
        driver3.get("https://www.facebook.com/");
        driver3.manage().window().maximize();
        driver3.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);
        driver3.findElement(By.name("pass")).sendKeys("Sopi@1234");
        Thread.sleep(2000);
        driver3.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver3.close();
    }
}
