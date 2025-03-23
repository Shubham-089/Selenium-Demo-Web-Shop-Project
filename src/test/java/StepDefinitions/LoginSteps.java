package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	    WebDriver driver;
	    LoginPage loginPage;

	    @Given("User is on the Login Page")
	    public void user_is_on_the_login_page() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/login");
	        loginPage = new LoginPage(driver);
	    }

	    @When("User enters valid {string} and {string}")
	    public void user_enters_valid_credentials(String email, String password) {
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	    }

	    @When("User enters invalid {string} and {string}")
	    public void user_enters_invalid_credentials(String email, String password) {
	        loginPage.enterEmail(email);
	        loginPage.enterPassword(password);
	    }

	    @And("Clicks on the Login button")
	    public void clicks_on_the_login_button() {
	        loginPage.clickLogin();
	    }

	    @Then("User should be redirected to the homepage")
	    public void user_should_be_redirected_to_the_homepage() {
	        String expectedTitle = "Demo Web Shop";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
	        driver.quit();
	    }

	    @Then("An error message should be displayed")
	    public void an_error_message_should_be_displayed() {
	        String errorMessage = loginPage.getErrorMessage();
	        Assert.assertTrue(errorMessage.contains("Login was unsuccessful"), "Error message not displayed!");
	        driver.quit();
	    }
	}
