package com.kms.web.test;


import com.codeborne.selenide.Selenide;
import com.kms.web.helper.AutomationTestHelper;
import com.kms.web.helper.ThankYouHelper;
import com.kms.web.helper.YouTubeHelper;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KmsTests extends BaseWebTest {

    private final AutomationTestHelper automationTestHelper = new AutomationTestHelper();
    private final ThankYouHelper thankYouHelper = new ThankYouHelper();
    private final YouTubeHelper youTubeHelper = new YouTubeHelper();

    @BeforeMethod
    public void navigateToAutomationTestPage() {
        automationTestHelper.navigateToPage();
    }

    @Test
    public void checkConfirmationPageIsLoadedTest() {
        automationTestHelper.fillFirstName(RandomStringUtils.randomAlphabetic(10))
                .fillLastName(RandomStringUtils.randomAlphabetic(10))
                .fillEmail(RandomStringUtils.randomAlphabetic(5) + "@balenh.com")
                .fillPhone("+" + RandomStringUtils.randomNumeric(10))
                .fillCompany(RandomStringUtils.randomAlphabetic(10))
                .clickSubmitButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(thankYouHelper.getThankYouMessageText(),
                "Thank you for singing up!\nWe will be in touch with you shortly.",
                "Thank You message is not correct");
        softAssert.assertTrue(thankYouHelper.isPageLoaded());
        softAssert.assertAll();
    }

    @Test
    public void checkPopUpIsLoadedTest() {
        String url = automationTestHelper.waitForPopUpLoaded().getPopUpUrl();
        Selenide.open(url);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(youTubeHelper.isPageLoaded());
        softAssert.assertEquals(youTubeHelper.getVideTitleText(),
                "GE Healthcare: A KMS Lighthouse Success Story",
                "YouTube video name is incorrect");
        softAssert.assertAll();
    }

}
