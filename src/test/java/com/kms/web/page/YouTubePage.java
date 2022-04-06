package com.kms.web.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

public class YouTubePage {

    private final SelenideElement videoTitle = Selenide.$x("//div[@id='container']//h1");

    public String getVideTitleText() {
        return videoTitle.getText();
    }

    public Boolean isPageLoaded() {
        return WebDriverRunner.getWebDriver().getCurrentUrl().contains("www.youtube.com/");
    }

}
