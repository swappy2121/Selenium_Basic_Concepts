package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadPopup_Demo {
    @Test
    public void fileUploadPopup_Demo() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\File\\doc.xlsx");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
