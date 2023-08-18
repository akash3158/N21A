package com.narcissusnew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narcissus21new.util.Waits;

import co.narciss21new.keyword.KeyWordDemo;

public class SignUpPage {
	@FindBy(css = "div[class='my-0']")
	@CacheLookup
	WebElement signUpBtn;
	@FindBy(css = "label#name-error-server")
	@CacheLookup
	WebElement fullNameErrorText;
	@FindBy(css = "input#name")
	@CacheLookup
	WebElement setFullName;

	public SignUpPage() {
		PageFactory.initElements(KeyWordDemo.driver, this);
	}

	public void clickOnSignUpBtn() {
		signUpBtn.click();
	}

	public String getFullNameErrorText() {
		return fullNameErrorText.getText();
	}

	public void enterFullname(String fullname) {
		Waits wait = new Waits();
		wait.forDuration(4);
		setFullName.sendKeys(fullname);
	}
}
