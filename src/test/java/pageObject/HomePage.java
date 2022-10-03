package pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.BaseClass;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(id = "billing_first_name")
	private WebElement firstName;

	@FindBy(id = "billing_last_name")
	private WebElement lastName;

	@FindBy(id = "billing_company")
	private WebElement company;

	@FindBy(id = "billing_email")
	private WebElement email;

	@FindBy(id = "billing_phone")
	private WebElement phone;

	@FindBy(id = "billing_address_1")
	private WebElement address;

	@FindBy(id = "billing_city")
	private WebElement city;

	@FindBy(id = "billing_postcode")
	private WebElement postCode;

	@FindBy(xpath = "//*[@id='s2id_billing_country']/a/span[2]/b")
	private WebElement clickCountry;

	@FindBy(xpath = "//input[@id='s2id_autogen1_search']")
	private WebElement typeNameOfCountry;

	@FindBy(xpath = "//*[@id='s2id_billing_state']/a/span[2]/b")
	private WebElement clickState;

	@FindBy(xpath = "//div[@id='select2-drop']/div/input")
	private WebElement typeNameOfState;

//	=======================================================================

	@FindBy(xpath = "//*[@class='amount']")
	private WebElement viewMenuItemWithPrice;

	@FindBy(xpath = "//tr[@class='cart-subtotal']/td[1]/span")
	private WebElement subTotal;

	@FindBy(xpath = "//tr[@class='order-total']/td[1]/strong/span")
	private WebElement total;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/div[2]/div/table/tbody/tr[2]/td/span")
	public WebElement discountAfterCoupon;

	@FindBy(xpath = "//*[@id='content']/nav/a")
	public WebElement homeButton;

	@FindBy(xpath = "//*[@id='product-160']/div[1]/a/img")
	public WebElement productImage;

	@FindBy(xpath = "//*[@id='tab-description']/h2")
	public WebElement productDescription;

	@FindBy(xpath = "//*[@id='comments']/h2")
	public WebElement reviewText;

	@FindBy(xpath = "//*[@id='product-160']/div[2]/form/div/input")
	public WebElement addProductNumber;

	@FindBy(xpath = "//*[@id='product-160']/div[2]/form/button")
	public WebElement addRubyToCartButton;

	@FindBy(xpath = "//*[@id='product-165']/div[2]/form/button")
	public WebElement addMasteringToCartButton;

	@FindBy(xpath = "//*[@id='content']/ul/li")
	public WebElement errorAddItem;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/ul")
	public WebElement canNotApplyCode;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/div[1]")
	public WebElement addBasket;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[1]/a")
	public WebElement removeBook;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]")
	public WebElement removeBookText;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/form/table/tbody/tr[2]/td/div/input[2]")
	public WebElement applyCoupon;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/form/table/tbody/tr[1]/td[5]/div/input")
	public WebElement addQuanity;

	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/form/table/tbody/tr[2]/td/input[1]")
	public WebElement updateBasket;

	@FindBy(xpath = "//div[@class='wc-proceed-to-checkout']/a")
	public WebElement checkoutButton;

	@FindBy(xpath = "//*[@id='customer_details']/div[1]/div/h3")
	public WebElement billingDetail;

	@FindBy(xpath = "//*[@id='page-35']/div/div[1]/div[2]/a")
	public WebElement enterCodeButton;

	@FindBy(xpath = "//form[@class='checkout_coupon']/p[2]/input")
	public WebElement checkoutCouponButton;

	@FindBy(xpath = "//div[@class='woocommerce-message']")
	public WebElement checkoutCouponApply;

	@FindBy(xpath = "//div[@id='order_review']")
	public WebElement orderReview;

	@FindBy(xpath = "//div[@class='woocommerce']")
	public WebElement orderDetailPage;

	@FindBy(id = "content")
	public WebElement checkOutPage;

	@FindBy(id = "payment_method_cod")
	public WebElement clickPayment;

	@FindBy(id = "coupon_code")
	public WebElement couponCodeBox;

	@FindBy(id = "place_order")
	public WebElement placeOrder;

	@FindBy(xpath = "//*[@class='n2-ss-slider-3']/div")
	private List<WebElement> sliders;

	@FindBy(xpath = "//*[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']/div")
	private List<WebElement> arrivals;

	@FindBy(xpath = "//*[@id='themify_builder_content-22']/div[2]/div/div/div/div/div[2]/div")
	public List<WebElement> NewArrivalsBooksTap;

	@FindBy(xpath = "//*[@class='woocommerce-tabs wc-tabs-wrapper']/ul/li")
	public List<WebElement> description;
//	=====================================================================

//	@SuppressWarnings("static-access")
//	public void fillingInfo() {
//
//		firstName.sendKeys(cm.randomFirstName());
//		lastName.sendKeys(cm.randomLastName());
//		company.sendKeys("Minions Company");
//		email.sendKeys(cm.randomUsername());
//		phone.sendKeys(cm.randomPhoneNumber());
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

//	=====================================================================

//	@SuppressWarnings("static-access")
//	public void discountCode() {
//		Assert.assertEquals(cm.stringToNumber(discountAfterCoupon), 50);
//	}
//	
//	public void verifySubTotal() {
//		Assert.assertTrue(subTotal.isDisplayed());
//		System.out.println("SUBTOTAL : " + subTotal.getText());
//	}
//
//	public void verifyTotal() {
//		Assert.assertTrue(total.isDisplayed());
//		System.out.println("TOTAL : " + total.getText());
//	}
//
//	public int sizeOfSliders() {
//		int sliderSize = sliders.size();
//		return sliderSize;
//	}
//
//	public int sizeOfArrivals() {
//		int arrivalSize = arrivals.size();
//		return arrivalSize;
//	}
//
//	public void clickNewArrivalBooks(String newBookArrival) {
//		for (WebElement eachTab : NewArrivalsBooksTap) {
//			if (eachTab.getText().contains(newBookArrival)) {
//				eachTab.click();
//				break;
//			}
//		}
//	}
//
//	public void clickDescriptionOrReview(String tabMenu) {
//		for (WebElement eachTab : description) {
//			if (eachTab.getText().contains(tabMenu)) {
//				eachTab.click();
//				break;
//			}
//		}
//	}
//
//	public void viewMenuItemWithPriceElementDisplayed() {
//		element = viewMenuItemWithPrice;
//		Assert.assertTrue(element.isDisplayed());
//	}

}
