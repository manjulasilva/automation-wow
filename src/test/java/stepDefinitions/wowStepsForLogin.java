package stepDefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;


import pageObjects.wowHomePage;
import pageObjects.wowLoginPage;
import automationFramework.pageBase;

public class wowStepsForLogin {
	public WebDriver driver;
	public Properties prop;
	public wowHomePage pgHome;
	public wowLoginPage pgLogin;
	
	
	
	
	String imgPath; 
	boolean wantScreenShot;
	Integer waitTimer;
	screenshotManager wowSMgr;
	String newScreenShotFileName;
	
	

	public wowStepsForLogin() {
		// TODO Auto-generated constructor stub
	}
	
	// Step to scenario - Go to WOW home page ................................................
	
	@Given("^User launch browser$")
	public void user_launch_browser() throws Throwable {
		driver = pageBase.getDriver();
		prop = pageBase.getConfig();
		
		pgHome = new wowHomePage(driver);
		wowSMgr = new screenshotManager();
		
		
		waitTimer = Integer.valueOf(prop.getProperty("waitTimer"));
		imgPath = prop.getProperty("imgPath");
		wantScreenShot = Boolean.parseBoolean(prop.getProperty("wantScreenShot"));
	    
	}

	@Given("^User open url \"([^\"]*)\"$")
	public void user_open_url(String pURL) throws Throwable {
		pgHome.driver.get(pURL);
	    
	}

	@Then("^User presented with WOW home page having title \"([^\"]*)\"$")
	public void user_presented_with_WOW_home_page_having_title(String pTitle) throws Throwable {
		String t = driver.getTitle();
		Assert.assertTrue(t.contains(pTitle));
		
		Thread.sleep(waitTimer);
		if (wantScreenShot) {
			newScreenShotFileName = wowSMgr.getNewImgeFileName(imgPath);
			wowSMgr.takeSnapShot(driver, newScreenShotFileName);
		}
	}
	
	
	// Step to scenario - Go to WOW Lessons page ................................................
	
	//ALREADY IMPLEMENTED : Given User presented with WOW home page having title "Welcome"
	
	@Given("^User click on Proceed To Lessons button$")
	public void user_click_on_Proceed_To_Lessons_button() throws Throwable {
	    pgHome.getGoToLessonsButton().click();
	    pgLogin = new wowLoginPage(driver); // pass the driver
	}
	
	//ALREADY IMPLEMENTED : Then User presented with WOW home page having title "Login"
	
	@Then("^User Enter email \"([^\"]*)\"$")
	public void user_Enter_email(String pEmailID) throws Throwable {
		pgLogin.getEmail().clear();
		pgLogin.getEmail().sendKeys(pEmailID);
	}

	@Then("^User Enter password \"([^\"]*)\"$")
	public void user_Enter_password(String pPassword) throws Throwable {
		pgLogin.getPassword().clear();
		pgLogin.getPassword().sendKeys(pPassword);
	}

	@Then("^User press login button$")
	public void user_press_login_button() throws Throwable {
		pgLogin.getLoginButton().click();
	}



}// end class
