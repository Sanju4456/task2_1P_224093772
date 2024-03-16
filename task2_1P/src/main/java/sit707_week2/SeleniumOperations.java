package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;


/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author sanju nimesha
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
	    // Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sanju/chromedriver-win64/chromedriver-win64/chromedriver.exe");

	    // Step 2: Use above chrome driver to open up a chromium browser.
	    System.out.println("Fire up chrome browser.");
	    WebDriver driver = new ChromeDriver();

	    System.out.println("Driver info: " + driver);

	    sleep(2);

	    // Load a webpage in chromium browser.
	    driver.get(url);

	    /*
	     * How to identify a HTML input field - Step 1: Inspect the webpage, Step 2:
	     * locate the input field, Step 3: Find out how to identify it, by id/name/...
	     */

	    // Find first input field which is firstname
	    WebElement firstNameElement = driver.findElement(By.id("firstname"));
	    System.out.println("Found element: " + firstNameElement);
	    // Send first name
	    firstNameElement.sendKeys("Ahsan");

	    /*
	     * Find following input fields and populate with values
	     */
	    // Find last name input field by name attribute
	    WebElement lastNameElement = driver.findElement(By.name("lastname"));
	    // Send last name
	    lastNameElement.sendKeys("Habib");

	    // Find email input field by XPath
	    WebElement emailElement = driver.findElement(By.xpath("//input[@id='email']"));
	    // Send email
	    emailElement.sendKeys("ahsanhabib@example.com");

	    // Find password input field by CSS selector
	    WebElement passwordElement = driver.findElement(By.cssSelector("input[name='password']"));
	    // Send password
	    passwordElement.sendKeys("securepassword123");

	    // Find confirm password input field by XPath
	    WebElement confirmPasswordElement = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
	    // Send confirm password
	    confirmPasswordElement.sendKeys("securepassword123");

	    /*
	     * Identify button 'Create account' and click to submit using Selenium API.
	     */
	    WebElement createAccountButton = driver.findElement(By.id("createAccountButton"));
	    createAccountButton.click();

	    /*
	     * Take screenshot using selenium API.
	     */
	    // Convert WebDriver object to TakesScreenshot
	    TakesScreenshot screenshot = (TakesScreenshot) driver;
	    // Get screenshot as output type file
	    File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
	    // Specify destination where screenshot will be saved
	    File destinationFile = new File("C:/Users/sanju/registration_page.png");
	    // Copy file to destination
	    try {
	        FileUtils.copyFile(screenshotFile, destinationFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    // Sleep a while
	    sleep(2);

	    // close chrome driver
	    driver.close();
	}
	

	    public static void alternative_registration_page(String url) {
	        // Step 1: Locate chrome driver folder in the local drive.
	    	System.setProperty("webdriver.chrome.driver",
					"C:/Users/sanju/chromedriver-win64/chromedriver-win64/chromedriver.exe");

	        // Step 2: Use above chrome driver to open up a chromium browser.
	        System.out.println("Fire up chrome browser.");
	        WebDriver driver = new ChromeDriver();

	        System.out.println("Driver info: " + driver);

	        sleep(2);

	        // Load the alternative webpage in chromium browser.
	        driver.get(url);

	        // Locate input fields and populate with values
	        WebElement firstNameElement = driver.findElement(By.id("first_name"));
	        firstNameElement.sendKeys("John");

	        WebElement lastNameElement = driver.findElement(By.id("last_name"));
	        lastNameElement.sendKeys("Doe");

	        WebElement emailElement = driver.findElement(By.id("email"));
	        emailElement.sendKeys("johndoe@example.com");

	        WebElement passwordElement = driver.findElement(By.id("password"));
	        passwordElement.sendKeys("securepassword123");

	        // Example: Click on "Register" button
	        WebElement registerButton = driver.findElement(By.id("register_button"));
	        registerButton.click();

	        // Sleep for a while
	        sleep(2);

	        // Close the browser
	        driver.quit();
	    }
	
}

