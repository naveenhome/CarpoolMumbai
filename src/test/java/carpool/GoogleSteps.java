package carpool;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class GoogleSteps {
	
	private WebDriver driver; 
	@Given("^user enter \"([^\"]*)\" in google search box$")
	public void user_enter_in_google_search_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.gecko.driver", "/Users/naveensingh/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys(arg1);
		
	}

	@When("^click on google \"([^\"]*)\"$")
	public void click_on_google(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver.findElement(By.name("btnG")).click();
	}

	@Test
	@Then("^google should display count below$")
	public void google_should_display_count_below() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//driver.quit();
		String result = driver.findElement(By.id("lst-ib")).getAttribute("value");
		Assert.assertEquals("Naveen Kumar Singh", result);
		driver.quit();
	}


}
