package com.bridgelabz.AutomationWithAlertPopUp.AutomationWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class PrintUniqueElementinthelistbox {
    @Test
    public void printUniqueElementinthelistbox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("C:\\Users\\HP\\Desktop\\Page\\Listbox_Breakfast.html");
        WebElement listElement = driver.findElement(By.id("mtr"));
        Select s = new Select(listElement);
        List<WebElement> allOptions = s.getOptions();
        int count = allOptions.size();
        System.out.println(count);
        System.out.println("-----print the values in the list ----");
        HashSet<String> allElements = new HashSet<String>();
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(text);
            allElements.add(text);
        }
        System.out.println(allElements);
        driver.close();
    }
}
