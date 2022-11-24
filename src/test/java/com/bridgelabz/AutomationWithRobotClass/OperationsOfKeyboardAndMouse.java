package com.bridgelabz.AutomationWithRobotClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class OperationsOfKeyboardAndMouse {
    @Test
    public void TestingWithSelenium () throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver webdriver = new FirefoxDriver();
        webdriver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        Robot robot = new Robot();
        robot.mouseMove(300, 500);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(3000);
        webdriver.close();
    }
}
