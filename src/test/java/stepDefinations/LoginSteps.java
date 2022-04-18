package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Given");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("When");
	}

	@And("click on login")
	public void click_on_login() {
		System.out.println("And");
	}

	@Then("user is naviagetd to home page")
	public void user_is_naviagetd_to_home_page() {
		System.out.println("Then");
	}

}
