package automationFramework;

// PAGE BASE  THIS CLASS IS NO LONGER USED.   JEST KEPT FOR FUTHER WORK. 28/MAY/2020

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//import Automation.BDDFramework.Base;

public class pageBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public pageBase() {
		// TODO Auto-generated constructor stub
	}// end constructor pageBase
	
	public static Properties getConfig() throws IOException
	{
		prop=new Properties();
		FileInputStream fileGlobalProperties=new FileInputStream("configurations\\global.properties");		
	    prop.load(fileGlobalProperties);
		
		return prop;		
	}// end method getConfig
	
	
	public static WebDriver getDriver()  throws IOException {
		String url,browserType,locationOfGeckoDriver,locationOfChromeDriver;
		Integer implicitWaitTime; 
		Boolean maxWindow;
		
		Boolean flagMobileEmulation;
		String mobileEmuDeviceName;
		
		
		prop = pageBase.getConfig();
		
		//Reading pages from global.properties file
		url = prop.getProperty("url");
		browserType= prop.getProperty("browserType");
		implicitWaitTime = Integer.valueOf(prop.getProperty("implicitWaitTime"));
		locationOfChromeDriver = prop.getProperty("chromeDriver");
		locationOfGeckoDriver = prop.getProperty("geckoDriver");
		
		maxWindow = Boolean.parseBoolean( prop.getProperty("maxWindow"));
		
		flagMobileEmulation = Boolean.parseBoolean(prop.getProperty("flagMobileEmulation"));
		mobileEmuDeviceName = prop.getProperty("mobileEmuDeviceName");
		
		
		
		
		// Launch selected browser
		if (browserType.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", locationOfGeckoDriver);
	    	driver = new FirefoxDriver();
	    	if (maxWindow) {
	    		driver.manage().window().maximize();
	    	}
		} else if (browserType.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", locationOfChromeDriver);
			ChromeOptions options = new ChromeOptions();	    
		    
			// set Chrome mobileEmulation
			if (flagMobileEmulation) {
				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", mobileEmuDeviceName);
				options.setExperimentalOption("mobileEmulation", mobileEmulation);
			} else if (maxWindow) {
				options.addArguments("--start-maximized");
			}
		    driver=new ChromeDriver(options); 
		}
		
		driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		//driver.get(url);
		
		return driver;
	}//end method getDriver



}// end class pageBase

