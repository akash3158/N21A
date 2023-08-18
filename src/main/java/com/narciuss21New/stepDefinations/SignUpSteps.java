package com.narciuss21New.stepDefinations;

import java.time.Duration;

import com.narcissusnew.pages.HomePages;
import com.narcissusnew.pages.SignUpPage;

import co.narciss21new.keyword.KeyWordDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
	SignUpPage signup = new SignUpPage();

	@Given("user is on signup page")
	public void user_is_on_signup_page() {

		HomePages home = new HomePages();
		home.clickOnSingUpBtn();
	}

	@When("user leaves full name empty and clicks on Signup button")
	public void user_leaves_full_name_empty_and_clicks_on_Signup_button() {
		signup.clickOnSignUpBtn();
	}

	@Then("user should see an error message")
	public void user_should_see_an_error_message() {
		KeyWordDemo.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		signup.getFullNameErrorText();

	}

	@When("user enter the full name {string}")
	public void user_enter_the_full_name(String fullName) {
		signup.enterFullname(fullName);
	}
	
}
