package com.bridgelabz.ScreenshotCaptured;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CapturingScreenshot {
    @Test
    public  void capturedScreenshotForFacebook(){
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        Date date = new Date();
        String date1 = date.toString();
        System.out.println(date1);
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        driver.get("https://www.facebook.com/");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        //For converting screenshot in img format
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshot\\" + date2 + "__FacebookPage.png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public  void capturedScreenshotForInstagram(){
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Date date = new Date();
        String date1 = date.toString();
        System.out.println(date1);
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);
        driver.get("https://www.instagram.com/");
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshot\\" + date2 + "__instagramPage.png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
