package pages;

import javafx.beans.binding.StringBinding;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssessmentPage {

    private WebDriver driver;
    public AssessmentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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
    @FindBy(xpath = "//*[@id=\"ethnicity-window\"]/ul/li[2]")
    public WebElement caucasianBtn;


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

    // Review
    @FindBy(xpath = "//button[@translate='review-find-my-regimen']")
    public WebElement findCustomizedRegimenBtn;

    public void acceptAgreement() {
        agreementBtn.click();
        agreementContinueBtn.click();
    }

    public void continueAssessment() throws Exception {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.moveToElement(continueBtn).click().perform();
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
        nextBtn.click();
    }

    public void selectEthnicity() throws Exception {
        waitForElementToBeReady(caucasianBtn);
        caucasianBtn.click();
        nextBtn.click();
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
        nextBtn.click();
    }

    public void slideDial(int percent) throws Exception {
        Actions actions = new Actions(driver);
        waitForElementToBeReady(sliderCtrl);
        double distance = (percent / 100.0) * 300.0;
        actions.moveToElement(sliderCtrl,75,375).clickAndHold().moveByOffset((int)distance, 0).release().perform();
        nextBtn.click();
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
        nextBtn.click();
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
        nextBtn.click();
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
        nextBtn.click();
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
        nextBtn.click();
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
        nextBtn.click();
    }

    public void selectAddMoisturizer(String choice) throws Exception {
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
        nextBtn.click();
    }

    public void selectModalOption(String choice) throws Exception {
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

    public void selectAddNightMoisturizer(String choice) throws Exception {
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
        nextBtn.click();
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
}
