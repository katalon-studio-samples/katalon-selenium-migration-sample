/*
 * This is the page class for New user registration.
 * All the methods defined here can be re-used to find the web element in new user registration form and perform actions.
 * To verify new user registration is success or not
 */


package src.test.java.pageObjectsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewUserRegistrationPageTest {
	public static WebElement element = null;
	


	public static void fillFirstname(WebDriver driver, String firstname) {
		element = driver.findElement(By.id("first_name"));
		element.sendKeys(firstname);
	}
	
	public static void fillLastname(WebDriver driver, String lastname) {
		element = driver.findElement(By.id("last_name"));
		element.sendKeys(lastname);
	}
	
	public static void fillEmailaddress(WebDriver driver, String emailaddress) {
		element = driver.findElement(By.id("email"));
		element.sendKeys(emailaddress);
	}
	
	public static void fillCompanyname(WebDriver driver, String companyname) {
		element = driver.findElement(By.id("company"));
		element.sendKeys(companyname);
	}

	/*This is the method that can be re used to create new user account and verify whether new
	user registration success or not.*/
	public static void newUserRegistration(WebDriver driver,
			String firstname, String lastname, String email, String company) {
		fillFirstname(driver, firstname);
		fillLastname(driver, lastname);
		fillEmailaddress(driver, email);
		fillCompanyname(driver, company);

   }
}
