package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browsers.Base;
import pom.Headers;
import pom.InsurancePage;
import pom.LoginPage;
import pom.RegisterPage;

public class RegisterClassNG {
	
	WebDriver driver ;
	
	@BeforeClass
	public void launchTheBrowser ()
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chrome version 103\\chromedriver.exe");
//		driver = new ChromeDriver ();
		driver = Base.openChromeBrowser();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
	}
	
	@BeforeMethod
	public void testRegisterButton ()
	{
		InsurancePage insurancePage = new InsurancePage(driver);
		insurancePage.clickOntRegister();
	}
	
	@Test
	public void fillTheRegisterField () throws IOException, InterruptedException
	{
        RegisterPage registerPage = new RegisterPage (driver);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://demo.guru99.com/insurance/v1/register.php") && title.equals("Insurance Broker System - Register"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		registerPage.titleList();
		registerPage.sendFirstName();
		registerPage.sendSurName();
		registerPage.sendMobileNumber();
		registerPage.dobYearList();
		registerPage.dobMonthList();
		registerPage.dobDateList();
		registerPage.clickProvisionButton();
		registerPage.licencePeriodList();
		registerPage.occupationList();
		registerPage.sendAddressStreet();
		registerPage.sendCity();
		registerPage.sendCountry();
		registerPage.sendPostCode();
		registerPage.sendEmail();
		registerPage.sendPassword();
		registerPage.sendConfirmPassword();
		registerPage.screenShot(driver);
		registerPage.clickCreate();
		
        LoginPage loginPage = new LoginPage (driver);
		
		loginPage.sendEmailPassword();
		loginPage.clickLogin();
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void signInAndSignOut () throws InterruptedException 
	{
		
		Headers headers = new Headers (driver);
		headers.clickOnLogOutButton();
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	public void closeTheBrowser ()
	{
		driver.quit();
	}

}
