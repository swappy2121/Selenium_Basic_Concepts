package com.bridgelabz.AutomationWithActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropExample {

    @Test
    public void  dragAndDropExample() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/?stype=lo&jlou=AfcZ9Ci1s2iT3FcOJdEvhsYGuKSkhD7ojjO-Kp_t-I2gYh85zPFQYSzgCILP0E4Zo57xRlwAc19Ziy_v24RwoQymJUIU6xaQt_EbRhgM2HZPHQ&smuh=54178&lh=Ac9fjHV5HtSAXqn-RSI");
        String xp1 = "//input[contains(@id,'email')]";
        WebElement block1 = driver.findElement(By.xpath(xp1));
        String xp2 = "//input[contains(@name,'pass')]";
        WebElement block3 = driver.findElement(By.xpath(xp2));
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDrop(block1, block3).perform();
        driver.close();

    }
}
