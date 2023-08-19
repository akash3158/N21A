package com.narciuss21New.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Parameterization {
	String fruite;

	@Given("I have two {string}")
	public void takeAFruite(String fruite) {
		this.fruite = fruite;
	}

	@Then("Print their color")

	public void printColor() {
		if (fruite.equalsIgnoreCase("Oranges")) {
			System.out.println("organes are red");
		}else if (fruite.equalsIgnoreCase("pineapple")) {
			System.out.println("Pineapple is Yellow");
		}
	}
}
