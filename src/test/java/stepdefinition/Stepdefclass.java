package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class Stepdefclass {

	WebDriver chromedriver;
	@Given("The user must be on Home page by clicking url {string}")
	public void the_user_must_be_on_home_page_by_clicking_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    chromedriver = new ChromeDriver();
	    chromedriver.get(string);
	}

	@When("Click on SignUp button located top right corner side on header section")
	public void click_on_sign_up_button_located_top_right_corner_side_on_header_section() {
	    // Write code here that turns the phrase above into concrete actions
	    chromedriver.findElement(By.id("signin2")).click();
	}

	@Then("SignUp dialog box should be displayed on the screen with username and password fields")
	public void sign_up_dialog_box_should_be_displayed_on_the_screen_with_username_and_password_fields() {
	    // Write code here that turns the phrase above into concrete actions
	  boolean actual = chromedriver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	  //Assert.assertEquals(true, actual);
	  
	  chromedriver.close();
	}
	
}
