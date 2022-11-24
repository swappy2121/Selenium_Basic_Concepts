package com.bridgelabz.AutomationWithActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Facebook_contextClickDemo_mailArchive {
    @Test
    public void facebook_contextClickDemo_mailArchive() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        String xp = "//div[contains(@class,'f7rl1if4 adechonz f6oz4yja dahkl6ri axrg9lpx rufpak1n qtovjlwq qbmienfq rfyhaz4c rdmi1yqr ohrdq8us nswx41af fawcizw8 l1aqi3e3 om3e55n1 j0k7ypqs c7ysagaf hizwmanw')]";
        WebElement mail = driver.findElement(By.xpath(xp));
        System.out.println(mail.getText());
        Actions actions = new Actions(driver);
        actions.contextClick(mail).perform();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[contains(@class,'om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l k70v3m9n fdgfg23c n75z76so bxhmhvbv')]")).click();
        driver.close();
    }
}
