package com.bridgelabz.CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class RunSeleniumCodeInDiffBrowser {
    public void runSeleniumCodeInDiffBrowser() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For Chrome browser press 1");
        System.out.println("For firefox browser press 2");
        System.out.println("Enter your choice : ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
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
                break;
            case 2:
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
                break;
            default:
                System.out.println("Selected number is not valid");
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunSeleniumCodeInDiffBrowser run = new RunSeleniumCodeInDiffBrowser();
        run.runSeleniumCodeInDiffBrowser();
    }
}
