package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {
	 private static WebDriver driver;

	    @Before
	    public void setUp() {
	        if (driver == null) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            System.out.println("Browser launched successfully.");
	        }
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;  
	            System.out.println("Browser closed successfully.");
	        }
	    }
 }
