package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class HandleTabs_using_getWindowHandles {
    @Test
    public void  handleTabs_using_getWindowHandles() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
        String parentwindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//i[contains(@class,'fa fa-align-justify')]")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[3]/p-sidebar/div/nav/ul/li[4]/a/label")).click();
        Set<String> allwhs = driver.getWindowHandles();
        for (String wh : allwhs) {
            driver.switchTo().window(wh);
        }
        String childtitle = driver.getTitle();
        System.out.println("Title of the child tab is :"+ childtitle);
        Thread.sleep(2000);
        driver.switchTo().window(parentwindowHandle);
        driver.close();
    }
}
