package com.bridgelabz.SeleniumFileDownloadbyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadSeleniumFileThroughLink {
    @Test
    public void downloadSeleniumFile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.4.0/selenium-server-4.4.0.jar']")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
