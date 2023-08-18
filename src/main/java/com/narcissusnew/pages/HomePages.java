package com.narcissusnew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.narciss21new.keyword.KeyWordDemo;

public class HomePages {
	@FindBy(css = "a[class='navbar-brand font-weight-bold d-block '] img[alt='ijmeetimage']")
	public WebElement ijMeetLogo;

	@FindBy(css = "a[href=\"https://ijmeet.com/app\"]")
	public WebElement joinMeetingLink;

	@FindBy(css = "a[href=\"https://ijmeet.com/host_meeting\"]")
	public WebElement hostMeetingLink;
	
	@FindBy(css = "a[href=\"https://ijmeet.com/register\"]")
	public WebElement signUpBtn;

	public HomePages() {
		PageFactory.initElements(KeyWordDemo.driver, this);

	}

	public void clickOnIJMeetLogo() {
		ijMeetLogo.click();
		System.out.println("clicked on logo");
	}

	public void clickOnJoinMeeting() {

		joinMeetingLink.click();
		System.out.println("successfully clicked");

	}

	public String getTextOfJoinMeetingLink() {
		return joinMeetingLink.getText();
	}

	public void clickOnHostJoinMeeting() {
		hostMeetingLink.click();
	}

	public String getTitle() {
		return KeyWordDemo.getTitle();
	}

	public void clickOnSingUpBtn() {
		signUpBtn.click();
	}
}
