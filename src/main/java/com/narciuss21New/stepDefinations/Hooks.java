package com.narciuss21New.stepDefinations;

import co.narciss21new.keyword.KeyWordDemo;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setUp() {
		KeyWordDemo.openBrowser("chrome");
		KeyWordDemo.launchUrl("https://www.ijmeet.com");
	}

	@After
	public void tearDown() {
		KeyWordDemo.closeBrowser();
	}
}
