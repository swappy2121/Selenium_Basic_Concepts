package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert_PromptPopUp {
    @Test
    public void alert_Promptpopup() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Swapnil");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.dismiss();
        driver.close();
    }
}
