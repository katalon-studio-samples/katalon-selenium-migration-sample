package main.java.helper;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import com.kms.katalon.core.webui.driver.DriverFactory;

import io.appium.java_client.remote.MobileCapabilityType;
import main.java.pages.HomePage;

public class Browser {


    public Browser(String browserName, String baseUrl) {
        setBrowser(browserName);
        setBaseUrl(baseUrl);
        Initialise(getBrowser());
    }

    private void Initialise(String browser) {
        capabilities = new DesiredCapabilities();

        switch (browser) {
            case "Chrome":
                ChromeOptions chrome_options = new ChromeOptions();
                chrome_options.addArguments("--disable-geolocation");
                //chrome_options.addArguments("--incognito");
                System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
                capabilities.setBrowserName("chrome");
                capabilities.setCapability(ChromeOptions.CAPABILITY, chrome_options);
               _driver = new ChromeDriver(capabilities);
                break;
            case "Safari":
                capabilities.setBrowserName("safari");

               _driver = new SafariDriver();
                break;
            case "Firefox":
                FirefoxProfile ff_profile = new FirefoxProfile();
                ff_profile.setPreference("geo.prompt.testing", true);
                ff_profile.setPreference("geo.prompt.testing.allow", true);
                System.setProperty("webdriver.gecko.driver", DriverFactory.getGeckoDriverPath());
                capabilities.setBrowserName("firefox");
                capabilities.setCapability(FirefoxDriver.PROFILE, ff_profile);

               _driver = new FirefoxDriver(capabilities);
                break;
            case "Edge":
                System.setProperty("webdriver.edge.driver", seleniumFolderPath + "MicrosoftWebDriver.exe");
                capabilities.setBrowserName("edge");
                break;
            case "Safari_iOS":
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5");
                capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.6.5");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                break;
            default:
                System.out.println("Invalid browser passed in: " + browser);
                break;
        }

        try {
//            _driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"), capabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
        _driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void navigateTo(String url) {
        _driver.get(url);
    }

    public void navigateToBaseUrl() {
        _driver.get(getBaseUrl());
    }

    public String getBrowser() {
        return this.browserName;
    }

    private void setBrowser(String browserName) {
        this.browserName = browserName;
    }

    private void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public HomePage HomePage() {
        if (homePage == null) {
            homePage = new HomePage(this);
        }
        return homePage;
    }

    // Public properties
    public WebDriver _driver;

    // Private properties
    private DesiredCapabilities capabilities;
    private String browserName;
    private String baseUrl;
    private String seleniumFolderPath;
    private HomePage homePage;
}
