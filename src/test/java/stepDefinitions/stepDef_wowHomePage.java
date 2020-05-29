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
import pageObjects.wowRegistrationPage;
//import automationFramework.pageBase;
import automationFramework.stepBase;



public class stepDef_wowHomePage extends stepBase{
	/*
	public stepDef_wowHomePage() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	
	//public WebDriver driver;
	//public Properties prop;
	public wowHomePage pgHome;
	//public wowLoginPage pgLogin;
	//public wowRegistrationPage pgRegistration;	
	
	
	//String imgPath; 
	//boolean wantScreenShot;
	//Integer waitTimer;
	//screenshotManager wowSMgr;
	//String newScreenShotFileName;
	
	
	
	
	// *********************************** HOME PAGE ACTIONS **********************************************
	@Given("^User open desired browser$")
	public void user_open_desired_browser() throws Throwable {
		driver = stepBase.getDriver();
		prop = stepBase.getConfig();
		
		pgHome = new wowHomePage(driver);
		//wowSMgr = new screenshotManager();		
		
		waitTimer = Integer.valueOf(prop.getProperty("waitTimer"));
		imgPath = prop.getProperty("imgPath");
		wantScreenShot = Boolean.parseBoolean(prop.getProperty("wantScreenShot"));
	}
	
	

	@Given("^User open WOW home page \"([^\"]*)\"$")
	public void user_open_WOW_home_page(String pURL) throws Throwable {
		pgHome.driver.get(pURL);
	}
	
	
	@Then("^User presented with WOW home page having title \"([^\"]*)\"$")
	public void user_presented_with_WOW_home_page_having_title(String pTitle) throws Throwable {
		String t = driver.getTitle();
		Assert.assertTrue(t.contains(pTitle));		
		saveScreenShotInFolder();
	}
	
	
	@Given("^User click on Proceed To Lessons button$")
	public void user_click_on_Proceed_To_Lessons_button() throws Throwable {
	    pgHome.getGoToLessonsButton().click();
	    //pgLogin = new wowLoginPage(driver); // pass the driver
	    saveScreenShotInFolder();
	}
	
	@Then("^User click on Create an Account button$")
	public void user_click_on_Create_an_Account_button() throws Throwable {
		pgHome.getCreateNewAccountButton().click();
		//pgRegistration = new wowRegistrationPage(driver); // pass the driver
		saveScreenShotInFolder();
	}
	
	
	

	


}
