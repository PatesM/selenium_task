package org.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeScript {

    public static void runEdgeScript() throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
            "C:\\Program Files\\Selenium\\edgedriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        driver.quit();
    }
}
