package com.bridgelabz.FindElementsByXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsByXpath {
    @Test
    public void findElementsByXpath() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swapnil");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sopi@1234");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("25");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Sep");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1996");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void logInCreditionalsByXpath() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[name='email']")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[name='pass']")).sendKeys("Sopi@1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[name='login']")).click();
        Thread.sleep(2000);
        driver.close();
    }

}
