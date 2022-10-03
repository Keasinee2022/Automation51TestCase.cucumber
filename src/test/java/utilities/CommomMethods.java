package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class CommomMethods extends PageInitializer {

	static FakeValuesService fakeValuesService;
	static Faker faker;
	public static Select select;

	public String getConfig(String key) {
		return BaseClass.getConfigProperty(key);
	}

	public String getUser(String key) {
		return BaseClass.getUserProperty(key);
	}

	public static String randomUsername() {
		fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		String email = fakeValuesService.bothify("????@gmail.com");
		return email;
	}

	public static String randomPassword() {
		fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		String password = fakeValuesService.regexify("[a-z1-9]{10}");
		return password;

	}

	public static String randomFirstName() {
		faker = new Faker();
		String firstName = faker.name().firstName();
		return firstName;
	}

	public static String randomLastName() {
		faker = new Faker();
		String lastName = faker.name().lastName();
		return lastName;
	}

	public static CharSequence[] randomAddress() {
		faker = new Faker();
		String number = faker.address().buildingNumber();
		String streetName = faker.address().streetName();
		return new CharSequence[] { number, " ", streetName };
	}

	public static String randomCity() {
		faker = new Faker();
		String city = faker.address().city();
		return city;
	}

	public static String randomState() {
		faker = new Faker();
		String state = faker.address().state();
		return state;
	}

	public static String randomZipcode() {
		faker = new Faker();
		String zipcode = faker.address().zipCode();
		return zipcode;
	}

	public static String randomPhoneNumber() {
		fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		String phoneNumber = fakeValuesService.regexify("[1-9]{10}");
		return phoneNumber;
	}

	public static String randomSSN() {
		fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());
		String SSN = fakeValuesService.regexify("[1-9]{10}");
		return SSN;
	}

	public static void homePageMenu(String selection) {
		List<WebElement> button = new ArrayList<>();
		button = BaseClass.driver.findElements(By.xpath("//*[@id='main-nav']/li"));
		for (WebElement option : button) {
			if (option.getText().equalsIgnoreCase(selection)) {
				option.click();
				break;
			}
		}
	}

// Method that clears and sends key
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	// Method checks if radio button or checkbox is enabled and click on it
	public static void clickRadioOrCheckbox(List<WebElement> radioCheckbox, String value) {

		String actualValue;

		for (WebElement el : radioCheckbox) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				System.out.println("I CLICK");
				break;
			}
		}
	}

	// Select DropDown by Value
	public static void selectDropDownValue(WebElement element, String textTobeSelected) {

		try {

			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {

				if (el.getText().equals(textTobeSelected)) {
					select.selectByValue(textTobeSelected);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	// Select DropDown by Index
	public static void selectDropDownIndex(WebElement element, int indexValue) {

		try {
			Select select = new Select(element);
			int size = select.getOptions().size();
			if (size > indexValue) {
				select.selectByIndex(indexValue);
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	// Select DropDown by Visible Text
	public static void selectDropDownVisibleText(WebElement element, String textVisibleTobeSelected) {

		try {

			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {

				if (el.getText().equals(textVisibleTobeSelected)) {
					select.selectByVisibleText(textVisibleTobeSelected);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	// click DropDown
	public void clickDropDown(List<WebElement> element, String selection) {
		List<WebElement> button = new ArrayList<>();
		button = element;
		for (WebElement option : button) {
			if (option.getText().contains(selection)) {
				option.click();
				break;
			}
		}
	}

	// Methods that dismisses alerts and catch exception if alert is not present
	public static void dismissAlert() {

		try {

			Alert alert = BaseClass.getDriver().switchTo().alert();

			alert.dismiss();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// Methods that accepts alert
	public static void acceptAlert() {

		try {

			Alert alert = BaseClass.getDriver().switchTo().alert();

			alert.accept();
			;

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// Methods that gets text of alert and catch exception if alert is not present
	// Return type has to be String
	public static String getAlerttext() {
		String alertText = null;

		try {

			Alert alert = BaseClass.getDriver().switchTo().alert();

			alertText = alert.getText();

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertText;
	}

	// Sends text to be Alertbox
	public static void sendAlertText(String str) {

		try {

			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.sendKeys(str);
			alert.accept();
			;

		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	// iframes switch by String
	public static void switchToFrame(String nameOrId) {

		try {
			BaseClass.getDriver().switchTo().frame(nameOrId);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// iframes switch by INDEX
	public static void switchToFrame(int index) {
		try {
			BaseClass.getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// iframes switch by Element
	public static void switchToFrame(WebElement element) {

		try {
			BaseClass.getDriver().switchTo().frame(element);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// Handle windows by switching to child window
	public static void switchToChildWindow() {

		String mainWindow = BaseClass.getDriver().getWindowHandle();
		Set<String> windows = BaseClass.getDriver().getWindowHandles();

		for (String eachWindows : windows) {
			if (!eachWindows.equals(mainWindow)) {
				BaseClass.getDriver().switchTo().window(eachWindows);
			}
		}
	}

	// declaring explicit wait
	public static WebDriverWait getWaitObject() {

		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicitWaitSec);

		return wait;
	}

	// Waits for element to be clickable
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	// Waits for element to be visible
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	// Waits for element to be visible before clicks on it
	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}

	///////// Js executer
	// declaring and initializing Js object and returning it
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		return js;
	}

	// Java script click element
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("argument[0].click()", element);
	}

	// Javascript sends text
	public static void jsSentText(WebElement element, String text) {
		String valueText = element.getAttribute("value");
		getJSObject().executeScript("argument[0].value='" + valueText + "'", text);
	}

	// Scroll to element using Js
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("argument[0],scrollIntoView(true);", element);
	}

	// Scroll by pixel
	public static void scrollByPixel(int pixel) {

		// positive -- scroll down
		// negative -- scroll up
		getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
	}

	// Getting time stamp
	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ssss");
		return sdf.format(date.getTime());

	}

	// thread.sleep is simplified
	public static void wait(int second) {

		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Hover over = moving your curser on an element
	public static void hover(WebElement element) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.moveToElement(element).build().perform();
	}

	// Create a method that dragsAndDrops
	public static void dragsAndDrops(WebElement element, WebElement element2) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.dragAndDrop(element, element2).build().perform();
	}

	// Create a method that doubleClicks
	public static void doubleClicks(WebElement element) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.doubleClick(element).build().perform();
	}

	// TUESDAY CLASS OVERVIEW
	// take screen shot
	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Constants.screenShotPNGPath + filename + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}

		return picBytes;
	}

	//
	// calendar select date
	public static void selectCalendarDate(List<WebElement> element, String text) {
		for (WebElement pickDate : element) {
			if (pickDate.isEnabled()) {
				if (pickDate.getText().equals(text)) {
					pickDate.click();
					break;
				}
			}
		}
	}

	/**
	 * return a list of string from a list of elements ignores any element with no
	 * text
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> getElementsText(List<WebElement> list) {
		List<String> elemTexts = new ArrayList<String>();
		for (WebElement el : list) {
			if (!el.getText().isEmpty()) {
				elemTexts.add(el.getText());
			}
		}
		return elemTexts;
	}

	public static boolean isPalindrome(String str) {
		// Initializing an empty string to store the reverse
		// of the original str
		String rev = "";

		// Initializing a new boolean variable for the
		// answer
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Checking if both the strings are equal
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}

}
