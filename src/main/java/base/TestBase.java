package base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    private static String chromeDriverPath = "src\\main\\resources\\drivers\\chromedriver.exe";
    public boolean mobileTest = false;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
//        options.addArguments("--start-maximized");
//        options.addArguments("--window-size=800,600");

        options.addArguments("chrome.switches","--disable-extensions"); //Removes popup reminder for disabling extensions
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        String deviceName = "Samsung Galaxy S4";
//        String deviceName = "Apple iPad";
        Map<String, String> mobileEmulation =  new HashMap<>();
        mobileEmulation.put("deviceName", deviceName);
        Map<String, Object> chromeOptions = new HashMap<>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        if (mobileTest)
            driver = new ChromeDriver(capabilities);
        else
            driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://www.nuskin.com/content/nuskin/en_US/ageloc-me-assessment.html#/you-start");
    }
}

