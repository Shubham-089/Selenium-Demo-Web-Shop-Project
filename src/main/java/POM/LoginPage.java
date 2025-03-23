package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	    WebDriver driver;

	    // Locators
	    By emailField = By.id("Email");
	    By passwordField = By.id("Password");
	    By loginButton = By.cssSelector("input[value='Log in']");
	    By errorMessage = By.className("message-error");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Methods
	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }

	    public String getErrorMessage() {
	        return driver.findElement(errorMessage).getText();
	    }
	}
