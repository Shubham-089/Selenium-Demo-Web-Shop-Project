package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		  
		@Given("User Lanch Chrome browser")
		public void user_lanch_chrome_browser() {
	     ChromeDriver driver = new ChromeDriver();
	      RegisterPage Registerpage = new RegisterPage(driver);
		}

		@When("User open URL {string}")
		public void user_open_url(String string) {
		   WebDriver driver = null;
		driver.get("String");
		driver.manage().window().maximize();
		}

		@When("User enters First name as {string} and Last name as {string} and Email as {string} and password {string} and Confirm password as {string}")
		public void user_enters_first_name_as_and_last_name_as_and_email_as_and_password_and_confirm_password_as(String Firstname, String Lastname, String email, String Password, String Confirmpass) {
		   
			RegisterPage register5 = new RegisterPage(null);
			register5.setFirstName(Firstname);
			RegisterPage register4 = new RegisterPage(null);
			register4.setLastName(Lastname);
			RegisterPage.setemail(email);
			RegisterPage register2 = new RegisterPage(null);
			register2.setpass(Password);
			RegisterPage register = new RegisterPage(null);
			register.setConfirm(Confirmpass);
		}

		@When("Click on Register button")
		public void click_on_register_button() {
			RegisterPage Registerpage = null;
			Registerpage.clickRegister();
		}

		
		
		@Then("Page title Should be {string}")
		public void page_title_should_be(String string) {
		    WebDriver driver = null;
			Assert.assertTrue(driver.getTitle().equals(string));
		}

		@When("User click on Log out link")
		public void user_click_on_log_out_link() {
		    
		}

		@Then("Page title should be {string}")
		public void page_title_should_be1(String string) {
			RegisterPage.clickLogout();  
		}

		@Then("Page title after logout should be {string}")
		public void page_title_after_logout_should_be(String title) {
		   WebDriver driver = null;
		Assert.assertTrue(driver.getTitle().equals(title));
		}
		
		@Then("Close browser")
		public void close_browser() {
		    WebDriver driver = null;
			driver.quit();
		}
		
		
	}
