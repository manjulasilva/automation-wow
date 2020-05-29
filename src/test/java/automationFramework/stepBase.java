package automationFramework;

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

import stepDefinitions.screenshotManager;




public class stepBase {
	/*
	public stepBase() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	public static WebDriver driver;
	public static Properties prop;
	
	//For screenshots
	public static screenshotManager wowSMgr;
	public static String imgPath; 
	public static boolean wantScreenShot;
	public static Integer waitTimer;
	public static String newScreenShotFileName;
	
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
		
		wowSMgr = new screenshotManager();
		
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
	
	
	// *********************************** COMMON METHODS **********************************************
		public void saveScreenShotInFolder() throws Exception {
			Thread.sleep(waitTimer);
			if (wantScreenShot) {
				newScreenShotFileName = wowSMgr.getNewImgeFileName(imgPath);
				wowSMgr.takeSnapShot(driver, newScreenShotFileName);
			}
		}// end method saveScreenShotInFolder


}// end class

