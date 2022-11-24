package test.java.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import main.java.helper.Browser;
import test.java.helper.TestHelper;

public class HomePageTests extends TestHelper {

    Browser browser;

    @Parameters({"browserName", "baseUrl"})
    @BeforeClass(groups = {"web"})
    public void setUp(String browserName, String baseUrl) {
        browser = new Browser(browserName, baseUrl);
        browser.navigateToBaseUrl();
    }

    @Test(groups = {"web"})
    public void searchTest() throws InterruptedException {
        browser.HomePage().HeaderSection().setSearchField("Cooking");
        browser.HomePage().HeaderSection().clickOnSearchButton();
        // todo: add assert
    }

    @AfterClass(groups = {"web"})
    public void tearDown() {
        browser._driver.quit();
    }
    
    

}
