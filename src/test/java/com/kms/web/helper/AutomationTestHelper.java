package com.kms.web.helper;

import com.kms.web.page.AutomationTestPage;

public class AutomationTestHelper extends AbstractHelper {

    private final AutomationTestPage page = new AutomationTestPage();

    public AutomationTestHelper navigateToPage() {
        log.info("Navigate to 'Automation test' page");
        page.navigateToPage();
        return this;
    }

    public AutomationTestHelper waitForPopUpLoaded() {
        log.info("Wait for 'popup' loaded");
        page.waitForPopUpLoaded();
        return this;
    }

    public String getPopUpUrl() {
        String ulr = page.getPopUpUrl();
        log.info("Get 'popup' url - " + ulr);
        return ulr;
    }

    public AutomationTestHelper fillFirstName(String value) {
        log.info("Fill 'First name' field with value :" + value);
        page.fillFirstName(value);
        return this;
    }

    public AutomationTestHelper fillLastName(String value) {
        log.info("Fill 'Last name' field with value :" + value);
        page.fillLastName(value);
        return this;
    }

    public AutomationTestHelper fillEmail(String value) {
        log.info("Fill 'Email' field with value :" + value);
        page.fillEmail(value);
        return this;
    }

    public AutomationTestHelper fillPhone(String value) {
        log.info("Fill 'Phone' field with value :" + value);
        page.fillPhone(value);
        return this;
    }

    public AutomationTestHelper fillCompany(String value) {
        log.info("Fill 'Company' field with value :" + value);
        page.fillCompany(value);
        return this;
    }

    public void clickSubmitButton() {
        log.info("Click 'Submit' button");
        page.clickSubmitButton();
    }
}
