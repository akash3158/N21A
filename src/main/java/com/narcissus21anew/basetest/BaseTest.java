package com.narcissus21anew.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.narcissus21new.util.Environment;

import co.narciss21new.keyword.KeyWordDemo;

public class BaseTest {

	protected KeyWordDemo keyword = new KeyWordDemo();

	@BeforeMethod
	public void setUp() throws Exception {
		KeyWordDemo.openBrowser(Environment.getBrowserName());
		// command line argument
		String env = System.getProperty("env").toLowerCase();
		KeyWordDemo.launchUrl(Environment.getUrls(env));

	}

	@AfterMethod
	public void tearDown() throws Exception {
		KeyWordDemo.closeBrowser();
	}

}
