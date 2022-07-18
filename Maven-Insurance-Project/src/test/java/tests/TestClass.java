package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Headers;
import pom.InsurancePage;
import pom.LoginPage;
import pom.RegisterPage;
import pom.RequestQuotationPage;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\chrome version 103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		
		
		InsurancePage insurancePage = new InsurancePage(driver);
		insurancePage.clickOntRegister();
		
		
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
		
	    url = driver.getCurrentUrl();
		System.out.println(url);
		
		title = driver.getTitle();
		System.out.println(title);
		
		if(url.equals("https://demo.guru99.com/insurance/v1/index.php") && title.equals("Insurance Broker System - Login"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		loginPage.sendEmailPassword();
		loginPage.clickLogin();
		
		
		Headers headers = new Headers (driver);
		
		    url = driver.getCurrentUrl();
			System.out.println(url);
			
			title = driver.getTitle();
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
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		headers.clickOnRetrieveQuotation();
		headers.clickOnProfile();
		headers.clickOnEditProfile();
		headers.clickOnLogOutButton();
		
		driver.quit();
		
		
		
		
		
	}

}
