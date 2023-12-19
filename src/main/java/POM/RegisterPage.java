package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(id="input-firstname")
	private WebElement firstNameInputField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameInputField;
	
	@FindBy(id="input-email")
	private WebElement emailInputField;
	
	@FindBy(id="input-telephone")
	private WebElement phoneInputField;
	
	@FindBy(id="input-password")
	private WebElement passwordInputField;
	
	@FindBy(id="input-confirm")
	private WebElement passwordInputConfirmField;
	
	@FindBy(xpath="//input[@name=\"newsletter\"and @value='1']")
	private WebElement yesNewsletter;
	
	@FindBy(xpath="//input[@name=\"newsletter\"and @value='0']")
	private WebElement noNewsletter;
	
	
	@FindBy(name="agree")
	private WebElement agreePrivacyCheckbox;
	
	@FindBy(xpath="//input[@value=\"Continue\"]")
	private WebElement submitFormbutton;


	public RegisterPage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void registerUser(String firstName, String lastName, String email,String phone,String pass)
	{
		firstNameInputField.sendKeys(firstName);
		lastNameInputField.sendKeys(lastName);
		emailInputField.sendKeys(email);
		phoneInputField.sendKeys(phone);
		passwordInputField.sendKeys(pass);
		passwordInputConfirmField.sendKeys(pass);
		agreePrivacyCheckbox.click();
		submitFormbutton.click();
	}
	
	
	

}
