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



public class stepDef_wowRegistrationPage extends stepBase{
	
	public wowRegistrationPage pgRegistration;
	
	public stepDef_wowRegistrationPage() {
		pgRegistration = new wowRegistrationPage(driver);
	}
	
	
	//public WebDriver driver;
	//public Properties prop;
	//public wowHomePage pgHome;
	//public wowLoginPage pgLogin;
	//public wowRegistrationPage pgRegistration;	
	
	/*
	String imgPath; 
	boolean wantScreenShot;
	Integer waitTimer;
	screenshotManager wowSMgr;
	String newScreenShotFileName;
	*/
	
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
	


}
