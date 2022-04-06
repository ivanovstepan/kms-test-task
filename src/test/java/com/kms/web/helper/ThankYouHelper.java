package com.kms.web.helper;

import com.kms.web.page.AutomationTestPage;
import com.kms.web.page.ThankYouPage;

public class ThankYouHelper extends AbstractHelper {

    private final ThankYouPage page = new ThankYouPage();

    public String getThankYouMessageText() {
        String message = page.getThankYouMessageText();
        log.info("Check 'Thank You' message - " + message);
        return message;
    }

    public Boolean isPageLoaded() {
        Boolean message = page.isPageLoaded();
        log.info("Check 'Thank You' page is loaded - " + message);
        return message;
    }

}
