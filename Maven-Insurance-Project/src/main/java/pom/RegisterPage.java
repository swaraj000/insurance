package pom;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	@FindBy (xpath="//select[@id='user_title']")
	private WebElement title;
	
	@FindBy (xpath="//input[@id='user_firstname']")
	private WebElement firstName;
	
	@FindBy (xpath="//input[@id='user_surname']")
	private WebElement surName;
	
	@FindBy (xpath="//input[@id='user_phone']")
	private WebElement mobileNumber;
	
	@FindBy (xpath="//select[@id='user_dateofbirth_1i']")
	private WebElement dobYear;
	
	@FindBy (xpath="//select[@id='user_dateofbirth_2i']")
	private WebElement dobMonth;
	
	@FindBy (xpath="//select[@id='user_dateofbirth_3i']")
	private WebElement dobDate;
	
	@FindBy (xpath="//input[@id='licencetype_f']")
	private WebElement provisionRadioButton ;
	
	@FindBy (xpath="//select[@id='user_licenceperiod']")
	private WebElement licencePeriod ;
	
	@FindBy (xpath="//select[@id='user_occupation_id']")
	private WebElement occupation ;
	
	@FindBy (xpath="//input[@id='user_address_attributes_street']")
	private WebElement addressStreet ;
	
	@FindBy (xpath="//input[@id='user_address_attributes_city']")
	private WebElement city ;
	
	@FindBy (xpath="//input[@id='user_address_attributes_county']")
	private WebElement country;
	
	@FindBy (xpath="//input[@id='user_address_attributes_postcode']")
	private WebElement postCode ;
	
	@FindBy (xpath="//input[@id='user_user_detail_attributes_email']")
	private WebElement email ;
	
	@FindBy (xpath="//input[@id='user_user_detail_attributes_password']")
	private WebElement password ;
	
	@FindBy (xpath="//input[@id='user_user_detail_attributes_password_confirmation']")
	private WebElement confirmPassword ;
	
	@FindBy (xpath="//input[@value='Create']")
	private WebElement createButton ;
	
	
	public RegisterPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void titleList ()
	{
		Select s = new Select (title);
		s.selectByVisibleText("Professor");
	}
	
	public void sendFirstName ()
	{
		firstName.sendKeys("Yogesh");
	}
	
	public void sendSurName ()
	{
		surName.sendKeys("Borse");
	}
	
	public void sendMobileNumber ()
	{
		mobileNumber.sendKeys("9876543210");
	}
	
	public void dobYearList ()
	{
		Select y =  new Select (dobYear);
		y.selectByVisibleText("1995");
	}
	
	public void dobMonthList ()
	{
		Select m =  new Select (dobMonth);
		m.selectByVisibleText("April");
	}
	
	public void dobDateList ()
	{
		Select d =  new Select (dobDate);
		d.selectByVisibleText("22");
	}
	
	public void clickProvisionButton ()
	{
		provisionRadioButton.click();
	}
	
	public void licencePeriodList ()
	{
		Select l =  new Select (licencePeriod);
		l.selectByVisibleText("10");
	}
	
	public void occupationList ()
	{
		Select o =  new Select (occupation);
		o.selectByVisibleText("Engineer");
	}
	
	public void sendAddressStreet ()
	{
		addressStreet.sendKeys("Kankerbagh main road");
	}
	
	public void sendCity ()
	{
		city.sendKeys("Patna , BIHAR");
	}
	
	public void sendCountry ()
	{
		country.sendKeys("INDIA");
	}
	
	public void sendPostCode ()
	{
		postCode.sendKeys("800007");
	}
	
	public void sendEmail ()
	{
		email.sendKeys("yogesh123@gmail.com");
	}
	
	public void sendPassword ()
	{
		password.sendKeys("Yogesh123");
	}
	
	public void sendConfirmPassword ()
	{
		confirmPassword.sendKeys("Yogesh123");
	}
	
	public void screenShot (WebDriver driver) throws IOException
	{
		SimpleDateFormat formatter=new SimpleDateFormat ("dd-MM-yyyy HH-mm-ss");
		Date date = new Date ();
		String a = formatter.format(date);
		System.out.println(a);
		
		TakesScreenshot t =  (TakesScreenshot) driver ;
		File source = t.getScreenshotAs(OutputType.FILE);
		File destinstion = new File ("C:\\Users\\Swaraj\\Desktop\\SOFTWARE TESTING\\SELENIUM\\MAVEN PROJECT\\Screenshot\\HomePage"+a+".jpeg");
		FileHandler.copy(source, destinstion);
 	}
	
	public void clickCreate ()
	{
		createButton.click();
	}
	
	
	
	

}
