package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class CloseAnySpecifiedBrowser {

    @Test
    public void closeAnySpecifiedBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.naukri.com/");
        String expected_title = "Tech Mahindra";
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : " + count);
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            String actual_title = driver.getTitle();
            if (actual_title.contains(expected_title)) {
                driver.close();
                System.out.println("Specified Browser window with title -->" + actual_title + " --> is closed");
            }
        }
    }
}
