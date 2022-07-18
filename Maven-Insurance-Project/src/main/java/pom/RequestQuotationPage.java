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

public class RequestQuotationPage {
	
	@FindBy (xpath="//select[@id='quotation_breakdowncover']")
	private WebElement breakDownCover ;
	
	@FindBy (xpath="//input[@id='quotation_windscreenrepair_t']")
	private WebElement windScreenRepair ;
	
	@FindBy (xpath="//input[@id='quotation_incidents']")
	private WebElement incidents ;
	
	@FindBy (xpath="//input[@id='quotation_vehicle_attributes_registration']")
	private WebElement registration ;
	
	@FindBy (xpath="//input[@id='quotation_vehicle_attributes_mileage']")
	private WebElement mileage ;
	
	@FindBy (xpath="//input[@id='quotation_vehicle_attributes_value']")
	private WebElement value ;
	
	@FindBy (xpath="//select[@id='quotation_vehicle_attributes_parkinglocation']")
	private WebElement parkingLocation ;
	
	
	@FindBy (xpath="//select[@id='quotation_vehicle_attributes_policystart_1i']")
	private WebElement startOfPolicyYear ;
	
	@FindBy (xpath="//select[@id='quotation_vehicle_attributes_policystart_2i']")
	private WebElement startOfPolicyMonth ;
	
	@FindBy (xpath="//select[@id='quotation_vehicle_attributes_policystart_3i']")
	private WebElement startOfPolicyDate ;
	
	@FindBy (xpath="//input[@value='Save Quotation']")
	private WebElement saveQuotation ;
	
	
	public RequestQuotationPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void breakDownList ()
	{
		Select b =  new Select (breakDownCover);
		b.selectByVisibleText("At home");
	}
	
	public void windScreenRepairButton ()
	{
		windScreenRepair.click();
	}
	
	public void sendValue ()
	{
		incidents.sendKeys("Accident");
		registration.sendKeys("BR-01-DU-1234");
		mileage.sendKeys("40");
		value.sendKeys("50000");
	}
	
	public void parkingLocationList ()
	{
		Select p = new Select (parkingLocation);
		p.selectByVisibleText("Street/Road");
	}
	
	public void startOfPolicyList ()
	{
		Select y1 = new Select (startOfPolicyYear);
		y1.selectByVisibleText("2020");
		
		Select m1 = new Select (startOfPolicyMonth);
		m1.selectByVisibleText("August");
		
		Select d1 = new Select (startOfPolicyDate);
		d1.selectByVisibleText("18");
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
	
	public void clickSaveQuotation ()
	{
		saveQuotation.click();
	}
	
	public void screenShotQuotation (WebDriver driver) throws IOException
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
	

}
