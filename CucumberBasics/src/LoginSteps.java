import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	@And("^user selects the age category$")
	public void user_selects_the_age_category(List<String> list) throws Throwable {
	   
		System.out.println("@And - user select the age category : " + list.get(1));
	}
	
	@Then("^user validates the captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
		
		System.out.println("User validates captcha image");

	}

	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {

		System.out.println("@Given -- user navigates to facebook.com");

	}

	@When("^user validates the home page title$")
	public void user_validates_the_home_page_title() throws Throwable {

		System.out.println("@When -- user validates the home page title");

	}

	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_valid_username(String userName) throws Throwable {

		System.out.println("@Then -- user entered " + userName + " user name");

	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void user_entered_valid_password(String password) throws Throwable {

		System.out.println("@And -- user entered " + password + " password");

	}

	@Then("^user \"([^\"]*)\" be successfully logged in$")
	public void user_should_be_successfully_logged_in(String validateLogin) throws Throwable {

		System.out.println("@Then -- user " + validateLogin + " successfully logged in");

	}

}
