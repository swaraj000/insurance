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
import pom.RequestQuotationPage;

public class TestNGClass {
	
	WebDriver driver ;
	@BeforeClass
	public void launchBrowserAndRegister () throws IOException
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chrome version 103\\chromedriver.exe");
//		driver = new ChromeDriver ();
		
		driver = Base.openOperaBrowser();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");	
	}
	
	@BeforeMethod
	public void loginToApplication ()
	{
		LoginPage loginPage = new LoginPage (driver);
			
			loginPage.sendEmailPassword();
			loginPage.clickLogin();
	}
	
	@Test (priority=1)
	public void testRequestQuotation () throws IOException
	{
		Headers headers = new Headers (driver);
		
	    String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://demo.guru99.com/insurance/v1/header.php") && title.equals("Insurance Broker System"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	
	headers.clickOnRequestQuotation();
	
	
	RequestQuotationPage reqQuotationPage = new RequestQuotationPage(driver);
	
	reqQuotationPage.breakDownList();
	reqQuotationPage.windScreenRepairButton();
	reqQuotationPage.sendValue();
	reqQuotationPage.parkingLocationList();
	reqQuotationPage.startOfPolicyList();
	reqQuotationPage.screenShot(driver);
	reqQuotationPage.clickSaveQuotation();
	reqQuotationPage.screenShotQuotation(driver);
	driver.navigate().back();
	}
	
	@Test (priority=3)
	public void testRetriveQuotation ()
	{
		Headers headers = new Headers (driver);
		headers.clickOnRetrieveQuotation();
	}
	@Test (priority=2)
	public void testProfile ()
	{
		Headers headers = new Headers (driver);
		headers.clickOnProfile();
	}
	
	@Test (priority=0)
	public void testEditProfile ()
	{
		Headers headers = new Headers (driver);
		headers.clickOnEditProfile();
	}
	
	@AfterMethod
	public void logOutToApplication ()
	{
		Headers headers = new Headers (driver);
		headers.clickOnLogOutButton();
	}
	
	@AfterClass
	public void CloseBrowser ()
	{
		driver.quit();
	}
	

}
