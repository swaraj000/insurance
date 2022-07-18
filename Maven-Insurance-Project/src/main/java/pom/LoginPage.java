package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement emailId;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password ;
	
	@FindBy (xpath="//input[@value='Log in']")
	private WebElement loginButton;
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendEmailPassword ()
	{
		emailId.sendKeys("yogesh123@gmail.com");
		password.sendKeys("Yogesh123");
	}
	
	public void clickLogin ()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
