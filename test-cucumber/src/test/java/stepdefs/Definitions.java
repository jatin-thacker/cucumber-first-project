package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert; 
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleHomePage;


public class Definitions {
	
	WebDriver driver;
	
    @Given("^User is present on Google home page$")
    public void user_is_present_on_Google_home_page() {
    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	driver = new ChromeDriver();
    	driver.get("https://www.google.com");
    	driver.manage().window().maximize();
    }

    @When("^User clicks on Google Images button$")
    public void user_clicks_on_google_images() {
    	GoogleHomePage.getImageIcon(driver).click();
    }

    @Then("^Title should be changed$")
    public void verify_title_changed()  {
        String expectedTitle = "Google Images";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        driver.quit();
    }

}
