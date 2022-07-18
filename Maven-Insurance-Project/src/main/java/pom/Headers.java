package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {
	
	@FindBy (xpath="//a[text()='Request Quotation']")
	private WebElement reqQuotation ;
	
	@FindBy (xpath="//a[text()='Retrieve Quotation']")
	private WebElement retrieveQuotation ;
	
	@FindBy (xpath="//a[text()='Profile']")
	private WebElement profile ;
	
	@FindBy (xpath="//a[text()='Edit Profile']")
	private WebElement editProfile ;
	
	@FindBy (xpath="//input[@value='Log out']")
	private WebElement logOut ;
	
	
	
	public Headers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRequestQuotation ()
	{
		reqQuotation.click();	
	}
	
	public void clickOnRetrieveQuotation ()
	{
		retrieveQuotation.click();
	}
	public void clickOnProfile ()
	{
		profile.click();
	} public void clickOnEditProfile ()
	{
		editProfile.click();
	}
	public void clickOnLogOutButton ()
	{
		logOut.click();
	}
		
	
	
	
	

}
