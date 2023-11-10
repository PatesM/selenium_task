package org.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeScript {

    public static void runGoogleChromeScript() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
            "C:\\Program Files\\Selenium\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
