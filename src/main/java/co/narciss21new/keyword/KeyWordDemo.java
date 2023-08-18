package co.narciss21new.keyword;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.narcissus21new.util.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyWordDemo {
	public static WebDriver driver;
	public static Waits wait;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("friefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser name:" + browserName);
		}
		wait = new Waits();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * 
	 * @param element
	 */

	public static void clickOn(WebElement element) {
		element.click();

	}

	/**
	 * 
	 * @param elementText
	 */
	public static void clickOn(String locator) {
		WebElement element = getWebElement(locator);
		element.click();
	}

	private static WebElement getWebElement(String locator) {
		String LocatorType = locator.split("##")[0];
		String Locatorvalue = locator.split("##")[1];
		WebElement element = null;
		if (LocatorType.equalsIgnoreCase("xpath"))
			element = driver.findElement(By.xpath(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("css"))
			element = driver.findElement(By.cssSelector(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("id"))
			element = driver.findElement(By.id(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("name"))
			element = driver.findElement(By.name(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("Tagname"))
			element = driver.findElement(By.tagName(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("linkText"))
			element = driver.findElement(By.linkText(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("className"))
			element = driver.findElement(By.className(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("partialLinkText"))
			element = driver.findElement(By.partialLinkText(Locatorvalue));
		return element;
	}

	private static List<WebElement> getWebElements(String locator) {
		String LocatorType = locator.split("##")[0];
		String Locatorvalue = locator.split("##")[1];
		List<WebElement> elements = new ArrayList<>();
		if (LocatorType.equalsIgnoreCase("xpath"))
			elements = driver.findElements(By.xpath(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("css"))
			elements = driver.findElements(By.cssSelector(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("id"))
			elements = driver.findElements(By.id(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("name"))
			elements = driver.findElements(By.name(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("Tagname"))
			elements = driver.findElements(By.tagName(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("linkText"))
			elements = driver.findElements(By.linkText(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("className"))
			elements = driver.findElements(By.className(Locatorvalue));
		else if (LocatorType.equalsIgnoreCase("partialLinkText"))
			elements = driver.findElements(By.partialLinkText(Locatorvalue));
		return elements;

	}

	/**
	 * 
	 * @param element
	 */
	public static void clikOn(By element) {
		driver.findElement(element).click();
	}

	/**
	 * this keyword can be used to return {@code String } representation of the
	 * title of current page
	 * 
	 * @return
	 */
	public static String getTitle() {
		return driver.getTitle();
	}

	/**
	 * 
	 * @param Title
	 */
	public static void closeWindow(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (@SuppressWarnings("unused")
		String window : allWindows) {
			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.close();
			}
		}

	}

	/**
	 * this keyword can be maximize the windows
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * this keyword can be quite all windows
	 */
	public static void quitAllWindows() {
		driver.quit();
	}

	/**
	 * 
	 * @param elementPlaceholder
	 * @param string2
	 */

	public static void enterText(String locator, String text) {

		WebElement element = getWebElement(locator);

		element.sendKeys(text);

	}

	public static void enterText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	/**
	 * 
	 * @param <WebElements>
	 * @param selector
	 * @return
	 */
	public static List<String> getTextOfElements(By selector) {

		List<String> productTexts = new ArrayList<>();
		List<WebElement> productTitles = driver.findElements(selector);
		for (WebElement productTitle : productTitles) {
			productTexts.add(productTitle.getText());
		}
		return productTexts;

	}

	/**
	 * 
	 * @param el
	 * @param text
	 */
	public static void enterText(WebElement el, String text) {
		el.sendKeys(text);
	}

	public static List<String> getTextOfElements(String locator) {
		List<WebElement> elements = getWebElements(locator);
		List<String> elementTexts = new ArrayList<>();
		for (WebElement element : elements) {
			elementTexts.add(element.getText());

		}
		return elementTexts;
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("browser close Successfully");
	}

}
