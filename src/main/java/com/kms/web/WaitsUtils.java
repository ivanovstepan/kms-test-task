package com.kms.web;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitsUtils {

    private static final FluentWait wait = new FluentWait(WebDriverRunner.getWebDriver());

    public static WebElement waitForWebElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

}