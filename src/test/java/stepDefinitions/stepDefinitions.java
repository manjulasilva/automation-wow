package stepDefinitions;

/*
 This class has ALL the steps to run ALL actions in WOW website
 */


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
import automationFramework.pageBase;


public class stepDefinitions {
	/*
	
	public WebDriver driver;
	public Properties prop;
	public wowHomePage pgHome;
	public wowLoginPage pgLogin;
	public wowRegistrationPage pgRegistration;	
	
	
	String imgPath; 
	boolean wantScreenShot;
	Integer waitTimer;
	screenshotManager wowSMgr;
	String newScreenShotFileName;
	

	
	
	public stepDefinitions() {
		// TODO Auto-generated constructor stub
	}
	
	
	// *********************************** COMMON METHODS **********************************************
	private void saveScreenShotInFolder() throws Exception {
		Thread.sleep(waitTimer);
		if (wantScreenShot) {
			newScreenShotFileName = wowSMgr.getNewImgeFileName(imgPath);
			wowSMgr.takeSnapShot(driver, newScreenShotFileName);
		}
	}// end method saveScreenShotInFolder
	
	
	// *********************************** HOME PAGE ACTIONS **********************************************
	@Given("^User open desired browser$")
	public void user_open_desired_browser() throws Throwable {
		driver = pageBase.getDriver();
		prop = pageBase.getConfig();
		
		pgHome = new wowHomePage(driver);
		wowSMgr = new screenshotManager();		
		
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
	    pgLogin = new wowLoginPage(driver); // pass the driver
	    saveScreenShotInFolder();
	}
	
	@Then("^User click on Create an Account button$")
	public void user_click_on_Create_an_Account_button() throws Throwable {
		pgHome.getCreateNewAccountButton().click();
		pgRegistration = new wowRegistrationPage(driver); // pass the driver
		saveScreenShotInFolder();
	}
	
	
	
	// *********************************** LOGIN PAGE  ACTIONS **********************************************
	
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
			//take screenshot before submit
			saveScreenShotInFolder();			
			pgLogin.getLoginButton().click();
		}
		
		
		
		// *********************************** REGISTRATION PAGE  ACTIONS **********************************************
		@Then("^User type user name \"([^\"]*)\"$")
		public void user_type_user_name(String pUserName) throws Throwable {
			pgRegistration.getUserName().clear();
			pgRegistration.getUserName().sendKeys(pUserName);
		}

		@Then("^User type email \"([^\"]*)\"$")
		public void user_type_email(String pEmail) throws Throwable {
			pgRegistration.getEmail().clear();
			pgRegistration.getEmail().sendKeys(pEmail);
		}

		@Then("^User click on accept terms and condtion checkbox$")
		public void user_click_on_accept_terms_and_condtion_checkbox() throws Throwable {
			pgRegistration.getTermsAndConditionCheckBox().click();
		}

		@Then("^User press Send Activation Code button$")
		public void user_press_Send_Activation_Code_button() throws Throwable {
			//taking screenshot before submit
			saveScreenShotInFolder();
			pgRegistration.getSendActivationCodeButton().click();
		}

		@Then("^User presented with a response \"([^\"]*)\"$")
		public void user_presented_with_a_response(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String bodyText = pgRegistration.getBodyText().getText();
			String txt1 = "Great. Just one more step to go";
			String txt2 = "Your account has been created and activation code has been emailed to you.";
			Assert.assertTrue(bodyText.contains(txt1));
			Assert.assertTrue(bodyText.contains(txt2));
			saveScreenShotInFolder();
		}
		
*/
} // end class stepDefinitions
