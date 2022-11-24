/*
 * TestClass for new user and login page validation with valid and invalid credentials.
 * Test cases are reading data from DataProviderClass and performing action.
 * please refer DataProviderClass for different sets of input data
 * Test cases will pass when valid credentials are provided
 * Test cases will fail when invalid credentials are given
 */

package src.test.java.testClassPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kms.katalon.core.webui.driver.DriverFactory;

import src.test.java.pageObjectsPackage.LoginPage;
import src.test.java.pageObjectsPackage.NewUserRegistrationPageTest;


public class TestClass {
	public static WebElement element = null;
	String baseUrl;
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() {
		baseUrl = "https://signup.heroku.com/";
		System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	
	@Test(dataProvider="newUserData", dataProviderClass=DataProviderClass.class)
	public void testcase1_create_new_user(String firstname, String lastname, String email, String company) {
		NewUserRegistrationPageTest.newUserRegistration(driver, firstname, lastname, email, company);	
	}

	
	//@Test(dataProvider="loginData", dataProviderClass=DataProviderClass.class)
	public void testcase2_login_to_tracker(String username, String password) {
		LoginPage.loginToExpenseTracker(driver, username, password);
	}

//*****************************************************************************************************	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

