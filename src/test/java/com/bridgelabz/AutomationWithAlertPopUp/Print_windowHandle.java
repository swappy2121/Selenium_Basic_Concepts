package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Print_windowHandle {
    @Test
    public void print_windowHandle() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.naukri.com/");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.close();
    }
}
