package com.bridgelabz.AutomationWithJavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpandDown {
    @Test
    public void javaExecuterImplementation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\web drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\HP\\Desktop\\Html\\Disabled.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value=''");
        js.executeScript("document.getElementById('t2').value='manager'");
        js.executeScript("document.getElementById('t2').type='button'");
        driver.close();
    }
}
