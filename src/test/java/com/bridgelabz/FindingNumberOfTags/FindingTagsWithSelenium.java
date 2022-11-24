package com.bridgelabz.FindingNumberOfTags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindingTagsWithSelenium {
    @Test
    public void findTagByName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

        List<WebElement> tag1 = driver.findElements(By.tagName("a"));
        System.out.println("Size of 'a' tag : "+tag1.size());
        List<WebElement> tag2 = driver.findElements(By.tagName("span"));
        System.out.println("Size of 'span' tag : "+tag2.size());
        List<WebElement> tag3 = driver.findElements(By.tagName("div"));
        System.out.println("Size of 'div' tag : "+tag3.size());
        List<WebElement> tag4 = driver.findElements(By.tagName("input"));
        System.out.println("Size of 'input' tag : "+tag4.size());
        List<WebElement> tag5 = driver.findElements(By.tagName("script"));
        System.out.println("Size of 'script' tag : "+tag5.size());
        List<WebElement> tag6 = driver.findElements(By.tagName("link"));
        System.out.println("Size of 'link' tag : "+tag6.size());
        List<WebElement> tag7 = driver.findElements(By.tagName("body"));
        System.out.println("Size of 'body' tag : "+tag7.size());
        List<WebElement> tag8 = driver.findElements(By.tagName("head"));
        System.out.println("Size of 'head' tag : "+tag8.size());
        int totalNoTags = tag1.size()+tag2.size()+tag3.size()+tag4.size()+tag5.size()+tag6.size()+tag7.size();
        System.out.println("Total number of tags : "+totalNoTags);
        driver.close();
    }
}
