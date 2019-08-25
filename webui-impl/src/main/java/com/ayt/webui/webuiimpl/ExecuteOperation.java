package com.ayt.webui.webuiimpl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Description
 * Author ayt  on
 */
public class ExecuteOperation {

    public static String objectOpration(WebElement webElement, String opration, String doResult) {
        if (opration.contains("click")) {
            webElement.click();
        } else if (opration.contains("get")) {
            doResult = webElement.getText();
        }
        return doResult;
    }

    public static void DriverOperation(WebDriver webDriver, String operation, String stepParams) {
        webDriver.get(stepParams);
    }

}
