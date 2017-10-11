package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AssessmentPage {

    private WebDriver driver;
    private boolean mobileTest;
    public AssessmentPage(WebDriver driver, boolean mobileTest) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.mobileTest = mobileTest;
    }

    // Navigation Buttons
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]//button[@translate='back-btn-text']")
    public WebElement previousBtn;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]//button[@translate='next-btn-text']")
    public WebElement nextBtn;

    @FindBy(xpath = "//button[@translate='continue-btn-text']")
    public WebElement continueBtn;


    // Agreement
    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[3]/div/div/div[2]/p/label")
    public WebElement agreementBtn;

    @FindBy(xpath = "//*[@id=\"page-wrap-you\"]/div[3]/div/div/div[2]/button")
    public WebElement agreementContinueBtn;


    // Personal Info
    @FindBy(xpath = "//*[@id=\"name-text\"]")
    public WebElement nameTbx;

    @FindBy(xpath = "//*[@id=\"age-text\"]")
    public WebElement ageTbx;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/button[1]")
    public WebElement femaleBtn;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/button[2]")
    public WebElement maleBtn;


    // Ethnicity
    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[1]")
    public WebElement africanAmericanBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[2]")
    public WebElement caucasianBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[3]")
    public WebElement chineseBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[4]")
    public WebElement filipinoBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[5]")
    public WebElement hispanicBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[6]")
    public WebElement indianBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[7]")
    public WebElement japaneseBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[8]")
    public WebElement javenseBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[9]")
    public WebElement koreanBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[10]")
    public WebElement malaysianBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[11]")
    public WebElement mediterraneanBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[12]")
    public WebElement middleEasternBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[13]")
    public WebElement nativeAmericanBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[14]")
    public WebElement southPacificIslanderBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[15]")
    public WebElement thaiBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[16]")
    public WebElement vietnameseBtn;

    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[17]")
    public WebElement otherBtn;


    // Location
    @FindBy(xpath = "//*[@id=\"locationText\"]")
    public WebElement locationTxb;

    @FindBy(xpath = "//div/h2[contains(text(),'We have determined you live in')]")
    public WebElement autoFindTxt;

    @FindBy(xpath = "//*[@id=\"map\"]")
    public WebElement map;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]/div/div[3]/div/div[2]/div/div[1]/div/i")
    public WebElement clearLocationBtn;


    // Dial Pages
    @FindBy(xpath = "//canvas")
    public WebElement sliderCtrl;


    // Skin Type
    @FindBy(xpath = "//button[@translate='skin-type-dry']")
    public WebElement dryBtn;

    @FindBy(xpath = "//button[@translate='skin-type-normal']")
    public WebElement normalBtn;

    @FindBy(xpath = "//button[@translate='skin-type-combination']")
    public WebElement combinationBtn;

    @FindBy(xpath = "//button[@translate='skin-type-oily']")
    public WebElement oilyBtn;


    // Alpha Hydroxy Acids
    @FindBy(xpath = "//button[@translate='skin-aha-stopped']")
    public WebElement discontinuedBtn;

    @FindBy(xpath = "//button[@translate='skin-aha-continued']")
    public WebElement continuedBtn;

    @FindBy(xpath = "//button[@translate='skin-aha-noReaction']")
    public WebElement noReactionBtn;

    @FindBy(xpath = "//button[@translate='skin-aha-never']")
    public WebElement neverUsedBtn;


    // Firmness
    @FindBy(xpath = "//button[@translate='skin-firmness-veryFirm']")
    public WebElement firmBtn;

    @FindBy(xpath = "//button[@translate='skin-firmness-someFirm']")
    public WebElement somewhatFirmBtn;

    @FindBy(xpath = "//button[@translate='skin-firmness-someSag']")
    public WebElement saggingBtn;

    @FindBy(xpath = "//button[@translate='skin-firmness-verySag']")
    public WebElement significantSaggingBtn;


    // Radiance
    @FindBy(xpath = "//button[@translate='skin-radiance-veryRadiant']")
    public WebElement radiantBtn;

    @FindBy(xpath = "//button[@translate='skin-radiance-someRadiant']")
    public WebElement somewhatRadiantBtn;

    @FindBy(xpath = "//button[@translate='skin-radiance-someDull']")
    public WebElement dullBtn;

    @FindBy(xpath = "//button[@translate='skin-radiance-veryDull']")
    public WebElement veryDullBtn;


    // Texture
    @FindBy(xpath = "//button[@translate='skin-texture-smooth']")
    public WebElement smoothBtn;

    @FindBy(xpath = "//button[@translate='skin-texture-someSmooth']")
    public WebElement somewhatSmoothBtn;

    @FindBy(xpath = "//button[@translate='skin-texture-someRough']")
    public WebElement somewhatRoughBtn;

    @FindBy(xpath = "//button[@translate='skin-texture-rough']")
    public WebElement roughBtn;


    // Day Moisturizer
    @FindBy(xpath = "//button[@translate='yes-btn-text']")
    public WebElement yesMoisturizerBtn;

    @FindBy(xpath = "//button[@translate='no-btn-text']")
    public WebElement noMoisturizerBtn;


    // Sun Protection Modal
    @FindBy(xpath = "//button[text()='Continue']")
    public WebElement sunProtectionContinueBtn;

    @FindBy(xpath = "//button[text()='Change']")
    public WebElement sunProtectionChangeBtn;


    // Lighter Moisturizer Modal
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement lighterMoisturizerYesBtn;

    @FindBy(xpath = "//button[text()='No']")
    public WebElement lighterMoisturizerNoBtn;


    // Night Moisturizer Modal
    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]//button[text()='Yes']")
    public WebElement nightMoisturizerYesBtn;

    @FindBy(xpath = "//*[@id=\"nuskinBespokeApp\"]//button[text()='No']")
    public WebElement nightMoisturizerNoBtn;


    // Review
    @FindBy(xpath = "//button[@translate='review-find-my-regimen']")
    public WebElement findCustomizedRegimenBtn;


    public void acceptAgreement() {
        agreementBtn.click();
        agreementContinueBtn.click();
    }

    public void continueAssessment() throws Exception {
        Thread.sleep(1000);
        scrollToAndClickElement(continueBtn);
    }

    public void enterPersonalInfo(String name, String age, String sex) {
        nameTbx.sendKeys(name);
        ageTbx.sendKeys(age);
        switch (sex) {
            case "male":
                maleBtn.click();
                break;
            case "female":
                femaleBtn.click();
                break;
            default:
                maleBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void selectEthnicity(String ethnicity) throws Exception {
        waitForElementToBeReady(caucasianBtn);
        switch (ethnicity) {
            case "African American":
                africanAmericanBtn.click();
                break;
            case "Caucasian":
                caucasianBtn.click();
                break;
            case "Chinese":
                chineseBtn.click();
                break;
            case "Filipino":
                filipinoBtn.click();
                break;
            case "Hispanic":
                hispanicBtn.click();
                break;
            case "Indian":
                indianBtn.click();
                break;
            case "Japanese":
                japaneseBtn.click();
                break;
            case "Javenese":
                javenseBtn.click();
                break;
            case "Korean":
                koreanBtn.click();
                break;
            case "Malaysian":
                malaysianBtn.click();
                break;
            case "Mediterranean":
                mediterraneanBtn.click();
                break;
            case "Middle Eastern":
                middleEasternBtn.click();
                break;
            case "Native American":
                nativeAmericanBtn.click();
                break;
            case "South Pacific Islander":
                southPacificIslanderBtn.click();
                break;
            case "Thai":
                thaiBtn.click();
                break;
            case "Vietnamese":
                vietnameseBtn.click();
                break;
            case "Other":
                otherBtn.click();
                break;
            default:
                otherBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void enterLocation(String location) throws Exception {
        Actions actions = new Actions(driver);
        waitForElementToBeReady(map);

        if (autoFindTxt.isDisplayed()) {
            clearLocationBtn.click();
        }
        locationTxb.sendKeys(location);
        Thread.sleep(500);
        actions.sendKeys(Keys.DOWN, Keys.ENTER).perform();
        scrollToAndClickElement(nextBtn);
    }

    public void slideDial(int percent) throws Exception {
        Actions actions = new Actions(driver);
        waitForElementToBeReady(sliderCtrl);

        int width = sliderCtrl.getSize().getWidth();
        int height = sliderCtrl.getSize().getHeight();
        double xOffset = 0.20 * width;      // Set xOffset at 20% of the width of the canvas image
        double yOffset = 0.80 * (height);   // Set yOffset at 80% of the height of the canvas image
        double percentage = percent / 100.0;
        double distance = percentage * (width - (2 * xOffset));

//        System.out.println("Width: " + width + ", Height: " + height + ", xOff: " + xOffset + ", yOff: " + yOffset + ", Distance: " + distance);

        if (!mobileTest) {
            actions.moveToElement(sliderCtrl, (int) xOffset, (int) yOffset)
                    .clickAndHold()
                    .moveByOffset((int) distance, 0)
                    .release()
                    .perform();
        } else {
            xOffset = xOffset + distance;
            actions.moveToElement(sliderCtrl, (int) xOffset, (int) yOffset).click().perform();
        }
        scrollToAndClickElement(nextBtn);
    }

    public void slideDayMoisturizerDial(int percent) throws Exception {
        Actions actions = new Actions(driver);
        waitForElementToBeReady(sliderCtrl);

        int width = sliderCtrl.getSize().getWidth();
        int height = sliderCtrl.getSize().getHeight();
        double xOffset = 0.50 * width;      // Set xOffset at 50% of the width of the canvas image
        double yOffset = 0.80 * (height);   // Set yOffset at 80% of the height of the canvas image
        double percentage = percent / 100.0;
        double distance = percentage * ((width / 2) - (width * 0.2));

        if (!mobileTest) {
            actions.moveToElement(sliderCtrl, (int) xOffset, (int) yOffset)
                    .clickAndHold()
                    .moveByOffset((int) distance, 0)
                    .release()
                    .perform();
        } else {
            xOffset = xOffset + distance;
            actions.moveToElement(sliderCtrl, (int) xOffset, (int) yOffset).click().perform();
        }

        scrollToAndClickElement(nextBtn);

        try {
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            if (sunProtectionContinueBtn.isDisplayed()) {
                selectContinueModalOption("continue");
            } else if (lighterMoisturizerYesBtn.isDisplayed()) {
                selectMoisturizerModalOption("yes");
            }
        }catch (Exception e) {
            System.out.println("No modal alert, proceeding to next section.");
        }
    }

    public void slideNightMoisturizerDial(int percent) throws Exception {
        Actions actions = new Actions(driver);
        waitForElementToBeReady(sliderCtrl);

        int width = sliderCtrl.getSize().getWidth();
        int height = sliderCtrl.getSize().getHeight();
        double xOffset = 0.60 * width;      // Set xOffset at 50% of the width of the canvas image
        double yOffset = 0.80 * (height);   // Set yOffset at 80% of the height of the canvas image
        double percentage = percent / 100.0;
        double distance;

        // Knob starts at 60% of canvas, distance must be between that
        // and the end of the dial, which is 20% from the edge of the canvas,
        // which distance is canvas length minus 80% of the total length
        if (percent > 0) {
            distance = percentage * (width - (width * 0.80));
        } else {
            distance = percentage * ((width / 2)  - (width * 0.10));
        }

        if (!mobileTest) {
            actions.moveToElement(sliderCtrl, (int) xOffset, (int) yOffset)
                    .clickAndHold()
                    .moveByOffset((int) distance, 0)
                    .release()
                    .perform();
        } else {
            xOffset = xOffset + distance;
            actions.moveToElement(sliderCtrl, (int) xOffset, (int) yOffset).click().perform();
        }

        scrollToAndClickElement(nextBtn);

        try {
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            if (lighterMoisturizerYesBtn.isDisplayed()) {
                selectMoisturizerModalOption("yes");
            }
        }catch (Exception e) {
            System.out.println("No modal alert, proceeding to next section.");
        }
    }

    public void selectSkinType(String skinType) throws Exception {
        waitForElementToBeReady(dryBtn);
        switch (skinType) {
            case "dry":
                dryBtn.click();
                break;
            case "normal":
                normalBtn.click();
                break;
            case "combination":
                combinationBtn.click();
                break;
            case "oily":
                oilyBtn.click();
                break;
            default:
                dryBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void selectAHAExposure(String exposure) throws Exception {
        waitForElementToBeReady(discontinuedBtn);
        switch (exposure) {
            case "discontinued":
                discontinuedBtn.click();
                break;
            case "continued":
                continuedBtn.click();
                break;
            case "none":
                noReactionBtn.click();
                break;
            case "never":
                neverUsedBtn.click();
                break;
            default:
                discontinuedBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void selectSkinFirmness(String firmness) throws Exception {
        waitForElementToBeReady(firmBtn);
        switch (firmness) {
            case "firm":
                firmBtn.click();
                break;
            case "somewhat":
                somewhatFirmBtn.click();
                break;
            case "sagging":
                saggingBtn.click();
                break;
            case "significant":
                significantSaggingBtn.click();
                break;
            default:
                firmBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void selectSkinRadiance(String radiance) throws Exception {
        waitForElementToBeReady(radiantBtn);
        switch (radiance) {
            case "radiant":
                radiantBtn.click();
                break;
            case "somewhat":
                somewhatRadiantBtn.click();
                break;
            case "dull":
                dullBtn.click();
                break;
            case "very":
                veryDullBtn.click();
                break;
            default:
                radiantBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void selectSkinTexture(String texture) throws Exception {
        waitForElementToBeReady(smoothBtn);
        switch (texture) {
            case "smooth":
                smoothBtn.click();
                break;
            case "somewhatSmooth":
                somewhatSmoothBtn.click();
                break;
            case "somewhatRough":
                somewhatRoughBtn.click();
                break;
            case "rough":
                roughBtn.click();
                break;
            default:
                smoothBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    public void selectAddChoice(String choice) throws Exception {
        waitForElementToBeReady(yesMoisturizerBtn);
        switch (choice) {
            case "yes":
                yesMoisturizerBtn.click();
                break;
            case "no":
                noMoisturizerBtn.click();
                break;
            default:
                yesMoisturizerBtn.click();
                break;
        }
        scrollToAndClickElement(nextBtn);
    }

    private void selectContinueModalOption(String choice) {
        if (sunProtectionContinueBtn.isDisplayed()) {
            switch (choice) {
                case "continue":
                    sunProtectionContinueBtn.click();
                    break;
                case "change":
                    sunProtectionChangeBtn.click();
                    break;
                default:
                    sunProtectionContinueBtn.click();
                    break;
            }
        }
    }

    private void selectMoisturizerModalOption(String choice) {
        if (lighterMoisturizerYesBtn.isDisplayed()) {
            switch (choice) {
                case "yes":
                    lighterMoisturizerYesBtn.click();
                    break;
                case "no":
                    lighterMoisturizerNoBtn.click();
                    break;
                default:
                    lighterMoisturizerYesBtn.click();
                    break;
            }
        }
    }

    public void findCustomizedRegimen() throws Exception {
        waitForElementToBeReady(findCustomizedRegimenBtn);
        findCustomizedRegimenBtn.click();
    }


    // Utilities
    private void waitForElementToBeReady(WebElement element) throws Exception {
        do {
            Thread.sleep(1000);
        }while (!element.isDisplayed());
    }

    private void scrollToAndClickElement(WebElement element) {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollTo(0," + (element.getLocation().y - 50) + ")");
            element.click();
            if (mobileTest)
                jse.executeScript("window.scrollTo(0,0)");
        } catch (Exception e) {
            System.out.println("Unable to locate element.");
            e.printStackTrace();
        }
    }

}
