package com.narcissus21a;

import org.testng.annotations.Test;

import com.narcissus21anew.basetest.BaseTest;
import com.narcissusnew.pages.HomePages;

public class SignUpTests extends BaseTest {
	@Test
	public void verifyPhomeNumberInPlaceOfFullname() {
		HomePages home = new HomePages();
		home.clickOnSingUpBtn();
		//SignUpPage signUp=new SignUpPage();
	//	signUp.enterFullName("5712457811");
	//	signUp.enterCompanyName("12314757");

	}
}
