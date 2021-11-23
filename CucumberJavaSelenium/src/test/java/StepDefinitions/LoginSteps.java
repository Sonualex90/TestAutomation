package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step-user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside step-User entered username and password");
	}

	@And("click on submit button")
	public void click_on_submit_button() {
		System.out.println("Inside step-User clicked submit button");
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {
		System.out.println("Inside step-User navigated to home page");
	}

}
