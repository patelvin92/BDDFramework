package stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver Chromedriver;
	
	
//	@Given("The user must be on Home page by clicking url {string}")
//	public void login_url(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//	    Chromedriver = new ChromeDriver();
//	    Chromedriver.get(string);
//	}
	
	
	@When("Click on Login option from Header section of Home page")
	public void click_on_login_option_from_header_section_of_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   Chromedriver.findElement(By.id("login2")).click();
	   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logInModalLabel")));
	   Chromedriver.findElement(By.id("logInModalLabel")).isDisplayed();
	}

	@When("^Enter valid details in (.*) and (.*) fields$")
	public void enter_valid_details_in_username_and_password_fields(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Chromedriver.findElement(By.id("loginusername")).sendKeys(username);
	    Thread.sleep(5000);
	    Chromedriver.findElement(By.id("loginpassword")).sendKeys(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    Chromedriver.findElement(By.className("btn btn-primary")).click();
	}

	@Then("The user should be navigated to his\\/her account")
	public void the_user_should_be_navigated_to_his_her_account() {
	    // Write code here that turns the phrase above into concrete actions
		String LoggedIn = Chromedriver.getCurrentUrl();
	}
	

}
