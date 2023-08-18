package com.narcissus21new.util;
import java.io.IOException;

public class Environment {
	public static String getUrls(String environment) throws IOException {
		if (environment.equalsIgnoreCase("dev")) {
			return PropUtil.getenvironment("dev.url");
		} else if (environment.equalsIgnoreCase("qa")) {
			return PropUtil.getenvironment("qa.url");
		} else if (environment.equalsIgnoreCase("prePod")) {
			return PropUtil.getenvironment("prePod.url");
		}
		return "";
	}

	public static String getUserName(String environment) throws IOException {
		String username = "";
		return username;
	}

	public static String getPassword(String environment) {
		String password = "";
		return password;

	}

	public static String getBrowserName() throws IOException {

		return PropUtil.getenvironment("browserName");
	}
}
