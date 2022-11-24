package com.bridgelabz.AutomationWithAlertPopUp;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class FileDownloadPopUp {
    @Test
    public void downloadFileByPopUp(){

        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
        String key = "browser.helperApps.neverAsk.saveToDisk";
        String value = "application/zip";
        profile.setPreference(key, value);
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", "C:\\");
    }
}
