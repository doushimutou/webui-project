package com.ayt.webui.webuiimpl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Description
 * Author ayt  on
 */
public class ExecuteStep {

    public static WebElement runStep(WebDriver webDriver, String path, String opration, String stepParams, String doResult) {
        if (path == null && opration != null) {
            ExecuteOperation.DriverOperation(webDriver, opration, stepParams);

        }
        if (path != null) {
            WebElement webElement = webDriver.findElement(By.xpath(path));
            ExecuteOperation.objectOpration(webElement, opration, doResult);
        }
        return null;
    }


}
