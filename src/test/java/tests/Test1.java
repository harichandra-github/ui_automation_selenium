package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.HomePage;
import POM.LoginPage;
import POM.RegisterPage;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		HomePage homePage=new HomePage(driver);
		
//		homePage.clickOnMyAccountDropmenu();
//		
//		homePage.clickLoginOption();
//		homePage.clickOnMyAccountDropmenu();
//		homePage.clickRegisterOption();
		
		//homePage.navigateToLoginPage();
		homePage.navigateToRegisterPage();
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.registerUser("bablu", "chaudhari", "email@1test.com", "888888888", "password@123");
		Assert.assertEquals("Your Account Has Been Created!", "Your Account Has Been Created!");
		System.out.println("Account Created");
		
		//LoginPage loginPage=new LoginPage(driver);

	}

}
