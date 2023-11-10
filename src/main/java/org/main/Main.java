package org.main;

import static org.scripts.EdgeScript.runEdgeScript;
import static org.scripts.FirefoxScript.runFirefoxScript;
import static org.scripts.GoogleChromeScript.runGoogleChromeScript;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        runGoogleChromeScript();
        runFirefoxScript();
        runEdgeScript();
    }
}
