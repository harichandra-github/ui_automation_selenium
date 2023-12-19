package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccountDropdownMenu;
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	@FindBy(xpath="//a[contains(.,'Login')]")
	private WebElement loginOption;
	
	
	public void clickOnMyAccountDropmenu()
	{
		myAccountDropdownMenu.click();
	}
	
	public void clickLoginOption()
	{
		loginOption.click();
	}
	
	public void clickRegisterOption()
	{
		registerOption.click();
	}
	
	public void navigateToLoginPage()
	{
		myAccountDropdownMenu.click();
		loginOption.click();
	}
	
	
	
	public void navigateToRegisterPage()
	{
		myAccountDropdownMenu.click();
		registerOption.click();
	}

}
