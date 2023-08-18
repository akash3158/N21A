package com.narcissus21new.util;

import org.openqa.selenium.support.ui.WebDriverWait;


public class Waits  {
	WebDriverWait wait = null;
	/**
		public Waits() {
			wait = new WebDriverWait(Keyword.driver, Duration.ofSeconds(30));
			wait.withMessage("TimeOut for while waitiing for the element");
			wait.pollingEvery(Duration.ofMillis(500));
		}*/

		public void forDuration(long milliseconds) {
			long startTime=System.currentTimeMillis();
			long endTime=startTime+milliseconds;
			while (startTime!=endTime) {
				startTime=System.currentTimeMillis();
			}
		}public static void main(String[] args) {
		new Waits().forDuration(4);
		}
	}



