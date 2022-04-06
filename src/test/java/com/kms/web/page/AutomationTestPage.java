package com.kms.web.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.kms.web.EnvironmentConfig;
import com.kms.web.WaitsUtils;

public class AutomationTestPage {

    private final SelenideElement firstName = Selenide.$x("//input[@name='firstname']");
    private final SelenideElement lastName = Selenide.$x("//input[@name='lastname']");
    private final SelenideElement email = Selenide.$x("//input[@name='email']");
    private final SelenideElement phone = Selenide.$x("//input[@name='phone']");
    private final SelenideElement company = Selenide.$x("//input[@name='company']");
    private final SelenideElement submitButton = Selenide.$x("//input[@type='submit']");

    private final SelenideElement watchTheVideoLink = Selenide.$x("//div[contains(@id,'leadinModal-content')]//a");

    private AutomationTestPage getPage() {
        return this;
    }

    public AutomationTestPage waitForPopUpLoaded() {
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public AutomationTestPage navigateToPage() {
        Selenide.open(EnvironmentConfig.url);
        WaitsUtils.waitForWebElementToBeVisible(firstName);
        return this;
    }

    public String getPopUpUrl() {
        return watchTheVideoLink.getAttribute("href");
    }

    public AutomationTestPage fillFirstName(String value) {
        firstName.sendKeys(value);
        return this;
    }

    public AutomationTestPage fillLastName(String value) {
        lastName.sendKeys(value);
        return getPage();
    }

    public AutomationTestPage fillEmail(String value) {
        email.sendKeys(value);
        return getPage();
    }

    public AutomationTestPage fillPhone(String value) {
        phone.sendKeys(value);
        return getPage();
    }

    public AutomationTestPage fillCompany(String value) {
        company.sendKeys(value);
        return getPage();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }


}
