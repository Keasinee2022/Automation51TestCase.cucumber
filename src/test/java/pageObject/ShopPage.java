package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.BaseClass;

public class ShopPage {
	public ShopPage() {
		
	PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath = "//*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[2]")
	public WebElement maxPriceText;

	@FindBy(xpath = "//div[@class='price_slider_wrapper']/div[1]/span[2]")
	public WebElement rightPriceToggle;

	@FindBy(xpath = "//*[@id='woocommerce_price_filter-2']/form/div/div[2]/button")
	public WebElement filterButton;

	@FindBy(xpath = "//div[@class='price_label']")
	public WebElement priceRange;

	@FindBy(xpath = "//*[@id='content']/ul/li[5]/a[2]")
	public WebElement addBookToBasket;

	@FindBy(xpath = "//*[@id='wpmenucartli']/a/span[1]")
	public WebElement checkBasket;

	@FindBy(xpath = "//*[@id='content']/form/select")
	public WebElement sorting;

	@FindBy(xpath = "//*[@id='content']/ul/li[1]/a[2]")
	public WebElement readMoreButton;

	@FindBy(xpath = "//*[@id='product-169']/div[2]/p")
	public WebElement outOfStock;

	@FindBy(xpath = "//*[@id='content']/ul/li[8]/a[2]")
	public WebElement saleBookButton;

	@FindBy(xpath = "//*[@id='product-163']/div[2]/div[1]/p/del/span")
	public WebElement fullAndDiscountPrice;
	
	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/div/div/table/tbody/tr[1]/td/span")
	private WebElement subTotalPrice;
	
	@FindBy(xpath = "//*[@id='page-34']/div/div[1]/div/div/table/tbody/tr[3]/td/strong/span")
	private WebElement totalPrice;
	
	@FindBy(xpath = "//*[@id='order_review']/table/tfoot/tr[2]/td/span")
	private WebElement tax;
	
	@FindBy(xpath = "//*[@id='order_review']/table/tfoot/tr[1]/td/span")
	private WebElement subTotalInOrderPage;

	@FindBy(id = "content")
	public WebElement wholePage;

	private int stringToNumber(WebElement element) {
		String textCurrency = element.getText();
		String textPrice = textCurrency.substring(1);
		int price = Integer.parseInt(textPrice);
		return price;
	}

	private double verifySubTotal() {
		String subTotal = subTotalPrice.getText();
		subTotal = subTotal.replaceAll("[^0-9]", "");
		double subTotalVal = Double.parseDouble(subTotal)/100;
		return subTotalVal;
	}
	
	private double verifyTotal() {
		String total = totalPrice.getText();
		total = total.replaceAll("[^0-9]", "");
		double totalVal = Double.parseDouble(total)/100;
		return totalVal;
	}
	
	private double verifySubTotalInOrderPage() {
		String total = subTotalInOrderPage.getText();
		total = total.replaceAll("[^0-9]", "");
		double totalVal = Double.parseDouble(total)/100;
		return totalVal;
	}
	
	private double taxRatePercent() {
		String strTax = tax.getText().replaceAll("₹", "");
		double taxValue = Double.parseDouble(strTax);
		double taxRatePer = (taxValue*100)/verifySubTotalInOrderPage();
		return taxRatePer;
	}
	
//	public void taxRateCheck() {
//		Assert.assertTrue(tax.isDisplayed());
//		double taxRate = taxRatePercent();
//		if(taxRate == 2.0) {
//			System.out.println(taxRate + "%" + " this is for India shipping" );
//		}else {
//			System.out.println(taxRate + "%" + " this is for outside India shipping");
//		}
//	}
//	
//	public void verifyPriceWithTax() {
//		Assert.assertTrue(verifySubTotal() < verifyTotal());
//	}
//	
//	public void moveSlider(WebElement slider, WebElement filterText) {
//		while (stringToNumber(filterText) > 450) {
//			slider.sendKeys(Keys.ARROW_LEFT);
//			stringToNumber(filterText);
//		}
//	}
	
}
