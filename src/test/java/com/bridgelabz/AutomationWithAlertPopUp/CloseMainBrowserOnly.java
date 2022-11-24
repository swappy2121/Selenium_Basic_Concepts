package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class CloseMainBrowserOnly {
    @Test
    public void closeMainBrowserOnly() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.naukri.com/");
        String parentWindowhandleID = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : " + count);
        String title = driver.getTitle();
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            if (windowHandle.equals(parentWindowhandleID)) {
                driver.close();
                System.out.println("Main Browser window with title -->" + title + " --> is closed");
            }
        }
    }
}
