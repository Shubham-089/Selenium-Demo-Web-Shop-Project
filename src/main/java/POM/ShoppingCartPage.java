package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	 private WebDriver driver;

	    // Constructor to initialize the WebDriver and WebElements
	    public ShoppingCartPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Locators for the shopping cart elements
	    @FindBy(css = ".product-box-add-to-cart-button")
	    private WebElement addToCartButton;

	    @FindBy(css = ".cart-label")
	    private WebElement shoppingCartLink;

	    @FindBy(css = "input.qty-input")
	    private WebElement quantityInput;

	    @FindBy(css = "input[name='updatecart']")
	    private WebElement updateCartButton;

	    @FindBy(css = ".order-summary-content")
	    private WebElement cartSummary;

	    @FindBy(css = ".no-data")
	    private WebElement emptyCartMessage;

	    @FindBy(css = ".ico-logout")
	    private WebElement logoutButton;

	    @FindBy(css = ".ico-login")
	    private WebElement loginButton;

	   
	    public void addItemToCart() {
	        addToCartButton.click();
	    }

	    
	    public void goToCart() {
	        shoppingCartLink.click();
	    }

	   
	    public void updateQuantity(String quantity) {
	        quantityInput.clear();
	        quantityInput.sendKeys(quantity);
	        updateCartButton.click();
	    }

	   
	    public String getCartSummary() {
	        return cartSummary.getText();
	    }

	    
	    public String getEmptyCartMessage() {
	        return emptyCartMessage.getText();
	    }

	   
	    public void logout() {
	        logoutButton.click();
	    }

	    
	    public boolean isLoginButtonDisplayed() {
	        return loginButton.isDisplayed();
	    }
	}
