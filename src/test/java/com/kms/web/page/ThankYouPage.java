package com.kms.web.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

public class ThankYouPage {

    private final SelenideElement thankYouMessage = Selenide.$x("//div[@data-element_type='widget']//h1");

    public String getThankYouMessageText() {
        return thankYouMessage.getText();
    }

    public Boolean isPageLoaded() {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains("thank-you");
    }

}
