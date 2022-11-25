package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenDivisionPopup {
    @Test
    public void acceptingHiddenDivisionPopup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=GenericKW&utm_term=redbuss&utm_content=Generic&gclid=CjwKCAiAyfybBhBKEiwAgtB7fuc4B60LQFO0oE09HWmBAEc8NMC9JSRjoQhOa0jqjzF2EIfKM3dRMRoCZ-4QAvD_BwE");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[contains(@class,'form-control border-0 mb-0 hasDatepicker')])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@class,'ui-state-default')]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
