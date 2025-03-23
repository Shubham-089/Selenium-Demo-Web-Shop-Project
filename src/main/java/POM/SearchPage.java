package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	private WebDriver driver;

    // Constructor to initialize the WebDriver and WebElements
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators for the search page elements
    @FindBy(id = "small-searchterms")
    private WebElement searchField;

    @FindBy(css = "input[type='submit'][value='Search']")
    private static WebElement searchButton;

    @FindBy(css = ".search-results")
    private WebElement searchResults;

    @FindBy(css = ".no-result")
    private WebElement noResultsMessage;

    // Methods for interacting with the elements

    
    public void enterSearchKeyword(String keyword) {
        searchField.clear();
        searchField.sendKeys(keyword);
    }

   
    public static void clickSearchButton() {
        searchButton.click();
    }

    
    public String getSearchResultsText() {
        return searchResults.getText();
    }

	public Object getNoResultsMessage() {
		return null;
	}

}
