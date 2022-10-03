package pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.BaseClass;

public class MyAccountPage {
	public MyAccountPage() {
		PageFactory.initElements(BaseClass.getDriver(),this);
	}
	@FindBy(id = "shipping_first_name")
	private WebElement firstName;

	@FindBy(id = "shipping_last_name")
	private WebElement lastName;

	@FindBy(id = "shipping_address_1")
	private WebElement address;

	@FindBy(id = "shipping_city")
	private WebElement city;

	@FindBy(id = "shipping_postcode")
	private WebElement postCode;

	@FindBy(xpath = "//*[@id='s2id_shipping_country']/a/span[2]/b")
	private WebElement clickCountry;

	@FindBy(xpath = "//input[@id='s2id_autogen1_search']")
	private WebElement typeNameOfCountry;

	@FindBy(xpath = "//*[@id='s2id_shipping_state']/a/span[2]/b")
	private WebElement clickState;

	@FindBy(xpath = "//div[@id='select2-drop']/div/input")
	private WebElement typeNameOfState;

//	================================================================================

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div[1]")
	private WebElement addressChangedText;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/nav/ul/li/a")
	public List<WebElement> dashboardTab;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/nav/ul/li/a")
	public WebElement viewOrderPage;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/table/tbody/tr/td[5]/a")
	public WebElement viewButton;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div")
	public WebElement orderDetail;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/div/div[1]/header/h3")
	public WebElement billing;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/div/div[2]/header/h3")
	public WebElement shipping;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/div/div[2]/header/a")
	public WebElement shippingEdit;

	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/form/p[10]/input[1]")
	public WebElement saveShippingAddress;
	
	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/form/p[4]/input[3]")
	public WebElement saveChangeButton;

	@FindBy(xpath = "//*[@id='customer_login']/div[1]/form")
	public WebElement afterLogOut;
	
//	@SuppressWarnings("static-access")
//	public void fillingInfoShipping() {
//
//		firstName.sendKeys(cm.randomFirstName());
//		lastName.sendKeys(cm.randomLastName());
//		cm.waitForClickability(clickCountry).click();
//		typeNameOfCountry.sendKeys("Thailand", Keys.ENTER);
//		cm.wait(2);
//		address.sendKeys(cm.randomAddress());
//		city.sendKeys(cm.randomCity());
//		clickState.click();
//		typeNameOfState.sendKeys("Bangkok", Keys.ENTER);
//		cm.wait(2);
//		postCode.sendKeys(cm.randomZipcode());
//	}
//
//	public void addressChangeText() {
//		Assert.assertEquals(addressChangedText.getText(), "Address changed successfully.");
//	}
}

