package com.narcissusnew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.narciss21new.keyword.KeyWordDemo;

public class JoinMeetingPage {
	@FindBy(css = "h2[class='m-txt']")
	public WebElement quickJoinMeetingText;

	public JoinMeetingPage() {
		PageFactory.initElements(KeyWordDemo.driver, this);
	}

	public String getQuickjoinMeetingtext() {
		return quickJoinMeetingText.getText();
	}
}
