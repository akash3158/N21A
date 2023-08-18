package com.narcissus21a;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.narcissus21anew.basetest.BaseTest;
import com.narcissusnew.pages.HomePages;
import com.narcissusnew.pages.JoinMeetingPage;

  public class HomePagetTest extends BaseTest {
	public static WebDriver driver = null;

	/**
	 * @Test(description = "without Frame Work") public void
	 *                   verifyTitleOfTheHomePage() { String expectedTitle =
	 *                   "Testing Shastra - IT Training Institute in Pune | Software
	 *                   Training Institute in Pune"; String actualTitle =
	 *                   driver.getTitle(); System.out.println(actualTitle);
	 *                   Assert.assertEquals(actualTitle, expectedTitle);
	 *                   driver.close(); }
	 * 
	 * @Test(description = "with frame Work") public void verifyTitleOfThePage() {
	 *                   String actualTitle = KeyWordDemo.getTitle(); String
	 *                   expectedTitle = "Testing Shastra - IT Training Institute in
	 *                   Pune | Software Training Institute in Pune";
	 *                   Assert.assertEquals(actualTitle, expectedTitle);
	 * 
	 *                   }
	 * 
	 * @Test public void verifySearchResultForShoes() throws IOException,
	 *       InterruptedException {
	 * 
	 *       //WebElement el =
	 *       Keyword.driver.findElement(By.cssSelector(PropUtil.getLocator("searchForProducts")));
	 *       KeyWordDemo.enterText(Locator.searchForProducts, "shoes");
	 *       KeyWordDemo.clickOn(Locator.magnifier);
	 *       KeyWordDemo.wait.forDuration(4000); // Thread.sleep(4000); List<String>
	 *       titles = KeyWordDemo.getTextOfElements(Locator.productTitles);
	 *       System.out.println("There are " + titles.size() +" products");
	 *       SoftAssert softly = new SoftAssert(); for (String title : titles) {
	 *       softly.assertTrue(title.contains("shoes") ||
	 *       title.contains("sneakers"), "title does not contains men shoes or men
	 *       sneakers"); } softly.assertAll(); }
	 */
	// this for page objecting model
	@Test
	public void verifyOnCliclkOnJoinMeetingUserRedirectToMeetingPage() {
		HomePages home = new HomePages();
		// HomePages home=PageFactory.initElements(KeyWordDemo.driver, HomePages.class);
		home.clickOnJoinMeeting();
		JoinMeetingPage joinMeeting = new JoinMeetingPage();
		// JoinMeetingPage joinMeeting= PageFactory.initElements(KeyWordDemo.driver,
		// JoinMeetingPage.class);
		String actualText = joinMeeting.getQuickjoinMeetingtext();
		String expectedText = "Quick Join a Meeting";
		Assert.assertEquals(actualText, expectedText);
	}

}
