package com.kms.web.helper;

import com.kms.web.page.YouTubePage;

public class YouTubeHelper extends AbstractHelper {

    private final YouTubePage page = new YouTubePage();

    public String getVideTitleText() {
        String message = page.getVideTitleText();
        log.info("Check 'Video' title - " + message);
        return message;
    }

    public Boolean isPageLoaded() {
        Boolean message = page.isPageLoaded();
        log.info("Check 'Thank You' page is loaded - " + message);
        return message;
    }

}
