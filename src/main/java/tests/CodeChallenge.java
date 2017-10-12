package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.AssessmentPage;

public class CodeChallenge extends TestBase {

    @Test
    public void test() throws Exception {
        AssessmentPage assessmentPage = new AssessmentPage(driver, mobileTest);

        assessmentPage.acceptAgreement();
        assessmentPage.continueAssessment();
        assessmentPage.enterPersonalInfo("Bill", "40", "male");
        assessmentPage.selectEthnicity("Other");
        assessmentPage.enterLocation("Orem, UT");
        assessmentPage.slideDial(10);
        assessmentPage.slideDial(25);
        assessmentPage.continueAssessment();
        assessmentPage.selectSkinType("oily");
        assessmentPage.slideDial(50);
        assessmentPage.selectAHAExposure("none");
        assessmentPage.slideDial(10);
        assessmentPage.slideDial(20);
        assessmentPage.slideDial(30);
        assessmentPage.slideDial(40);
        assessmentPage.slideDial(50);
        assessmentPage.selectSkinFirmness("firm");
        assessmentPage.selectSkinRadiance("dull");
        assessmentPage.selectSkinTexture("smooth");
        assessmentPage.continueAssessment();
        assessmentPage.selectAddChoice("no");
        assessmentPage.slideDayMoisturizerDial(60);
        assessmentPage.selectAddChoice("yes");
        assessmentPage.slideNightMoisturizerDial(-50);
        assessmentPage.findCustomizedRegimen();
    }
}
