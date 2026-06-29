package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	@Given("user is home page")
	public void user_is_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on home page");
	}
	@When("user clicks My Account")
	public void user_clicks_my_account() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks My Account");
	}
	@Then("user selects Login from given options")
	public void user_selects_login_from_given_options() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user selects Login from given options");
	}

	@When("user enters email {string} and password {string}")
	public void user_enters_email_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters email {string} and password {string}");
	}
	@Then("user is sucessfully logged in")
	public void user_is_sucessfully_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is sucessfully logged in");
	}

}
