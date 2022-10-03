package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class RegistrationPage {
	public RegistrationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath = "//*[@id='main-nav']/li")
	public List<WebElement> menuTabs;
	
	@FindBy(id = "reg_email")
	public WebElement regisEmail;
	
	@FindBy(id = "reg_password")
	public WebElement regisPass;
	
	@FindBy(xpath = "//*[@id='customer_login']/div[2]/form/p[3]/input[3]")
	public WebElement regisButton;
	
	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/div")
	public WebElement regisHomePage;
	
	@FindBy(xpath = "//*[@id='customer_login']/div[2]/form/p[2]/label")
	public WebElement invisibleErrorText;
	
	@FindBy(xpath = "//*[@id='page-36']/div/div[1]/ul/li")
	public WebElement errorText;
}
