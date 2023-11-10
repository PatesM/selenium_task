package org.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxScript {

    public static void runFirefoxScript() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",
            "C:\\Program Files\\Selenium\\geckodriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
