package org.softpost.launchbrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sagar on 14-01-2017.
 */
public class LaunchChrome {

    @Test
    public void testLaunch(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.softpost.org");
        driver.close();
        driver.quit();
    }
}
