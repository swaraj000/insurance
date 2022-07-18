package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurancePage {
	
	@FindBy (xpath= "//a[@class='btn btn-default']")
	private WebElement register ;
	
  
	public InsurancePage (WebDriver driver)  // driver = new chromeDriver()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOntRegister()
	{
		register.click();
	}
	

}
