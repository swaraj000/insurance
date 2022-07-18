package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	
	public static WebDriver openChromeBrowser ()
	{
		 System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION\\chrome version 103\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver ();
  	     return driver;
	}
	
	public static WebDriver openFirefoxBrowser ()
	{
		 System.setProperty("webdriver.gecko.driver","D:\\AUTOMATION\\firefox\\geckodriver.exe");
  	     WebDriver driver = new FirefoxDriver ();
  	     return driver;
	}
	
	public static WebDriver openOperaBrowser ()
	{
		 System.setProperty("webdriver.opera.driver","D:\\AUTOMATION\\opera\\operadriver_win64\\operadriver.exe");
  	     WebDriver driver = new OperaDriver ();
  	     return driver;
	}
	
	public static WebDriver openEdgeBrowser ()
	{
		 System.setProperty("webdriver.edge.driver","D:\\AUTOMATION\\edge\\msedgedriver.exe");
  	     WebDriver driver = new EdgeDriver ();
  	     return driver;
	}

}
