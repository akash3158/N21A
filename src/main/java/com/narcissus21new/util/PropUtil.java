package com.narcissus21new.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	/**
	 * this method return value of specified locator form OR.properties file
	 * 
	 * @throws IOException
	 */

	public static String getLocator(String locator) throws IOException {
		String fileName = "/src/test/resources/OR.properties";
		return getProperty(fileName,locator);
	}

	public static String  getProperty(String fileName, String key) throws IOException {
		String dir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(dir + fileName);
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}

	public static String getenvironment(String key) throws IOException {
		String fileName="/src/main/resources/Environment.properties";
		return getProperty(fileName,key);  
	}

	public static void main(String[] args) throws IOException {
		// getLocator(null)
		// String locator = prop.getProperty("searchForProducts");
		// System.out.println(locator);

	}
}
