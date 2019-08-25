package com.ayt.webui.webuiimpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Description
 * Author ayt  on
 */
public class WebDriverInitialization {
    public static final String WEBDRIVER = "webdriver.chrome.driver";
    public static final String WEBDRIVERPATH = "./webdriver/chromedriver.exe";

    //初始化webDriver
    public static WebDriver setWebDriver() {
        System.setProperty(WEBDRIVER, WEBDRIVERPATH);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        return driver;
    }

}
