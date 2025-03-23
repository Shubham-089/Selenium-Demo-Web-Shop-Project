package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public static void main(String[] args) {
		WebDriver driver;
	
	}

	public WebDriver driver;	    
	public RegisterPage(WebDriver driver) {   
		driver = this.driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "FirstName")
	WebElement FirstnameField;
		
	@FindBy(id = "LastName")
	WebElement LastnameField;
	
	@FindBy(id = "Email")
	WebElement EmailField;
	
	@FindBy(id = "Password")
	WebElement PasswordField;
	
	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmpasswordField;
	
	@FindBy(id = "register-button")
	WebElement RegisterBtn;
	
	@FindBy(css = ".ico-logout")
	static
	WebElement LogoutBtn;
	
	
	public void setFirstName(Object firstname) {	
		WebElement FirstnameFeild = null;
		FirstnameFeild.sendKeys("Shubham");
	}	
	
     public void setLastName(String LastName) {	
		WebElement LastnameFeild = null;
		LastnameFeild.sendKeys("Yetonde");
     }
			
	public static void setemail(String email) {	
	    WebElement emailFeild = null;
	    emailFeild.sendKeys("shubhamyetonde865@gmail.com");	
	}
		
	public void setpass(String pass) {	
		WebElement passFeild = null;
	    passFeild.sendKeys("Password@12345")	;
	}
			
	public void setConfirm(String confirm) {	
	    WebElement confirmpassFeild = null;
		confirmpassFeild.sendKeys("Password@12345"); 
	}
	    
	public void clickRegister() {	
		RegisterBtn.click();
	}
	public static void clickLogout() {	
		LogoutBtn.click();
	}
				
}
