package com.bridgelabz.AutomationWithAlertPopUp.AutomationWithSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintListValues_SortedOrder {
    @Test
    public void printListValues_SortedOrder() {
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("C:\\Users\\HP\\Desktop\\Page\\Listbox_Breakfast.html");
        WebElement listElement = driver.findElement(By.id("mtr"));
        Select s = new Select(listElement);
        List<WebElement> allOptions = s.getOptions();
        int count = allOptions.size();
        System.out.println(count);
        System.out.println("-----print the values in the list ----");
        ArrayList<String> list = new ArrayList<String>();
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(text);
            list.add(text);
        }
        Collections.sort(list);
        System.out.println("-----print the value in sorted order----");
        for (String value : list) {
            System.out.println(value);
        }
        driver.close();
    }
}
