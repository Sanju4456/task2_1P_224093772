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
	
	
	public static void officeworks_registration_page(String url) throws IOException {
	    // Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sanju/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

	    // Step 2: Use above chrome driver to open up a chromium browser.
	    System.out.println("Fire up chrome browser.");
	    WebDriver driver = new ChromeDriver();
       
	    System.out.println("Driver info: " + driver);

	    sleep(2);

	    // Load a webpage in chromium browser.
	    driver.get("https://www.officeworks.com.au/app/identity/create-account");
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));

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
	    
	   
	  
	    // Sleep a while
	    sleep(2);

	    // close chrome driver
	    driver.close();
	}
	


	public static void alternative_registration_page(String url) throws IOException {
        // Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sanju/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

	    // Step 2: Use above chrome driver to open up a chromium browser.
	    System.out.println("Fire up chrome browser.");
	    WebDriver driver = new ChromeDriver();

	    System.out.println("Driver info: " + driver);

	    sleep(2);

	    // Load a webpage in chromium browser.
	    driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?new=Y&catalogId=16601&myAcctMain=&langId=-1&storeId=900");
	    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshotFile, new File(".//screenshot/screenss.png"));


	    // Find first input field which is firstname
	    WebElement firstNameElement = driver.findElement(By.id("firstname"));
	    System.out.println("Found element: " + firstNameElement);
	    // Send first name
	    firstNameElement.sendKeys("sanju");

	    /*
	     * Find following input fields and populate with values
	     */
	    // Find last name input field by name attribute
	    WebElement lastNameElement = driver.findElement(By.name("lastname"));
	    // Send last name
	    lastNameElement.sendKeys("nimesha");

	    // Find email input field by XPath
	    WebElement emailElement = driver.findElement(By.xpath("//input[@id='email']"));
	    // Send email
	    emailElement.sendKeys("sanjunimesha@example.com");

	    // Find password input field by CSS selector
	    WebElement passwordElement = driver.findElement(By.cssSelector("input[name='password']"));
	    // Send password
	    passwordElement.sendKeys("sanjupassword123");

	    // Find confirm password input field by XPath
	    WebElement confirmPasswordElement = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
	    // Send confirm password
	    confirmPasswordElement.sendKeys("sanjupassword123");

	    /*
	     * Identify button 'Create account' and click to submit using Selenium API.
	     */
	    WebElement createAccountButton = driver.findElement(By.id("createAccountButton"));
	    createAccountButton.click();

	    /*
	     * Take screenshot using selenium API.
	     */
	    // Convert WebDriver object to TakesScreenshot
	    
	   
	  
	    // Sleep a while
	    sleep(2);

	    // close chrome driver
	    driver.close();
	}
}